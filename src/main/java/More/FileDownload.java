package More;










import java.io.File;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileDownload {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor
    public FileDownload(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    // Locators
    By clickMore = By.xpath("//a[contains(text(),'More')]");
    By clickFileDownload = By.xpath("//a[contains(text(),'File Download')]");
    By writeText = By.id("textbox");
    By createTxtBtn = By.id("createTxt");
    By clickDownload1 = By.id("link-to-download");

    By writeTextPdf = By.id("pdfbox");
    By createPdfBtn = By.id("createPdf");
    By clickDownload2 = By.id("pdf-link-to-download");

    // 🔥 Reusable Safe Click (handles ads/overlay)
    public void safeClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            element.click();
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

    // ✅ TEXT FILE DOWNLOAD
    public void TextFileDownload() {

        safeClick(clickMore);
        safeClick(clickFileDownload);

        WebElement textBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(writeText)
        );
        textBox.sendKeys("Hi sai prasad");

        safeClick(createTxtBtn);
        safeClick(clickDownload1);

        // 🔥 Verification
        String path = System.getProperty("user.home") + "/Downloads";
        boolean result = waitForFileDownload(path, "info.txt", 10);

        if (result) {
            System.out.println("✅ Text file downloaded");
        } else {
            System.out.println("❌ Download failed");
        }
    }

    // ✅ PDF DOWNLOAD
    public void PdfFileDownload() {

        safeClick(clickMore);
        safeClick(clickFileDownload);

        WebElement textBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(writeTextPdf)
        );
        textBox.sendKeys("PDF content testing");

        safeClick(createPdfBtn);
        safeClick(clickDownload2);

        // 🔥 Verification
        String path = System.getProperty("user.home") + "/Downloads";
        boolean result = waitForFileDownload(path, "info.pdf", 10);

        if (result) {
            System.out.println("✅ PDF downloaded");
        } else {
            System.out.println("❌ Download failed");
        }
    }

    // 🔥 Utility: Wait for file
    public boolean waitForFileDownload(String downloadPath, String fileName, int timeoutSeconds) {

        File dir = new File(downloadPath);

        for (int i = 0; i < timeoutSeconds; i++) {
            File[] files = dir.listFiles();

            if (files != null) {
                for (File file : files) {
                    if (file.getName().equalsIgnoreCase(fileName)) {
                        return true;
                    }
                }
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
