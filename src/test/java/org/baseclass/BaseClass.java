package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static void launchBrowser() {
		driver = new ChromeDriver();
	}

	public static void enterApplnUrl(String url) {
		driver.get(url);
	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void elementSendkeys(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void elementSendkeysEnter(WebElement element, String text) {
		element.sendKeys(text, Keys.ENTER);
	}

	public static void elementClick(WebElement element) {
		element.click();

	}

	public void acceptAlert() {

		driver.switchTo().alert().accept();

	}

	public void dissmissAlert() {

		driver.switchTo().alert().dismiss();

	}

	public String getApplnTittle() {
		String title = driver.getTitle();
		return title;
	}

	public WebElement findLocatedById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;

	}

	public WebElement findLocatorByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}

	public WebElement findLocatorByXpath(String xpathExp) {

		WebElement element = driver.findElement(By.xpath(xpathExp));
		return element;

	}

	public WebElement findLocatorByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;

	}

	public static void closeBrowser() {

		driver.close();
	}

	public static void quitBrowser() {

		driver.quit();
	}

	public String getApplnUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public void elementClear(WebElement element) {
		element.clear();

	}

	public String elementGetText(WebElement element) {

		String text = element.getText();
		return text;

	}

	public String elementGetAttribute(WebElement element) {
		String attribute = element.getAttribute(("value"));
		return attribute;

	}

	public String elementGetAttribute(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;

	}

	public void selectOptionByText(WebElement element, String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);

	}

	public void selectOptionByValue(WebElement element, String value) {
		Select sel = new Select(element);
		sel.selectByValue(value);

	}

	public void selectOptionByIndex(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(0);
	}

	public static void implicitWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	}

	public void insertValueJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value','" + text + "')", element);

	}

	public void buttonClickJs(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);

	}

	public void switchToChildWindow() {
		String parentWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		for (String eachWindow : allWindows) {
			if (!parentWindow.equals(eachWindow)) {
				driver.switchTo().window(eachWindow);

			}

		}

	}

	public void switchToFrameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	public void switchToFrameByFrameId(String nameOrId) {

		driver.switchTo().frame(nameOrId);

	}

	public List<WebElement> getAllOptionsFromDropDownText(WebElement element) {

		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getText();
			System.out.println(text);

		}
		return options;

	}

	public List<WebElement> getAllOptionsFromDropDownAttributeValue(WebElement element, String value) {

		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		for (WebElement webElement : options) {
			String text = webElement.getAttribute(value);
			System.out.println(text);

		}
		return options;

	}

	public String getFirstSelectedOptiontextWeb(WebElement element) {
		Select select = new Select(element);
		String text = select.getFirstSelectedOption().getText();
		return text;

	}

	public boolean isMultiSelectoption(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void explicitWait(WebElement element, Duration timeout) {

		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
//	public void fluentWait() {
//		
//   Wait wait=new FluentWait(driver);
//   }

	public boolean isDisplayed(String attributeValue) {

		boolean displayed = driver.findElement(By.id(attributeValue)).isDisplayed();
		return displayed;

	}

	public boolean isEnabled(String attributeValue) {

		boolean enabled = driver.findElement(By.id(attributeValue)).isEnabled();
		return enabled;

	}

	public boolean isSelected(String attributeValue) {

		boolean selected = driver.findElement(By.id(attributeValue)).isSelected();
		return selected;

	}

	public void deselectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);

	}

	public void deselectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void deselectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);

	}

	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public String getCurrentWindow() {

		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	public Set<String> getAllWindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public void clearText(WebElement element) {
		element.clear();

	}

	public File takeScreenshot() throws IOException {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		File destination = new File("path");
		FileUtils.copyFile(source, destination);
		return source;

	}

	public File takeScreenshotForElement(WebElement element) {

		File screenshotAs = element.getScreenshotAs(OutputType.FILE);
		return screenshotAs;

	}
	
	public void moveToElement(WebElement element) {
		
		Actions actions =new Actions(driver);
		
		actions.moveToElement(element).perform();

	}
	
	public void dragAndDrop(WebElement element) {
		Actions actions =new Actions(driver);
		actions.dragAndDrop(element, element).perform();

		

	}
	public void rightClick() {
		Actions actions =new Actions(driver);
		actions.contextClick().perform();

	}
	
	public void refreshPage() {
		
		driver.navigate().refresh();
		
		

	}

	public void writeCellData(String sheetName, int rownum, int cellnum, String data) throws IOException {
		File file = new File(
				"C:\\Users\\PRAKASH\\eclipse-workspace\\FrameworkSample\\Excel\\OMR Grocery Testdata.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.createCell(cellnum);
		cell.setCellValue(data);
		FileOutputStream outputStream = new FileOutputStream(file);
		workbook.write(outputStream);
	}

	public String getcellData(String sheetName, int rownum, int cellnum) throws IOException {
		String res = "";
		File file = new File(
				"C:\\Users\\PRAKASH\\eclipse-workspace\\FrameworkSample\\Excel\\OMR Grocery Testdata.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();

		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yy");
				res = dateFormat.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long check = Math.round(numericCellValue);
				if (check == numericCellValue) {
					res = String.valueOf(check);

				} else {
					res = String.valueOf(numericCellValue);

				}

			}

			break;

		default:
			break;
		}
		return res;

	}

	public void updateCellData(String sheetName, int rownum, int cellnum, String oldData, String newData)
			throws IOException {
		File file = new File(
				"C:\\Users\\PRAKASH\\eclipse-workspace\\FrameworkSample\\Excel\\OMR Grocery Testdata.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream fileOutStream = new FileOutputStream(file);
		workbook.write(fileOutStream);

	}

	public void threadSleep(long millis) throws InterruptedException {
		Thread.sleep(millis);

	}

}
