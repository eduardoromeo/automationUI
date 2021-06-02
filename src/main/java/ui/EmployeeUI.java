package ui;

import org.openqa.selenium.By;

public class EmployeeUI {
    public static By form = By.id("formEmployee");
    public static By name = By.cssSelector(".modal-body > div:nth-of-type(1) > .form-control");
    public static By name1 = By.cssSelector(".modal-body > div:nth-of-type(1) > .form-control");
    public static By email = By.xpath("//div[@class='modal-body']/div[2]/input[@class='form-control']");
    public static By address = By.xpath("//textarea[@id='address']");
    public static By phone = By.xpath("//input[@id='phone']");
    public static By addButton = By.xpath("//input[@id='addButton']");
}
