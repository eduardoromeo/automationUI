package ui;

import org.openqa.selenium.By;

public class AddEmployeeUI {
    public static By Name = By.xpath("//input[@type='text']");
    public static By Email = By.xpath("//input[@type='email']");
    public static By Address = By.id("address");
    public static By Phone = By.id("phone");
    public static By cancelButton = By.id("cancelButton");
    public static By addButton = By.id("addButton");

}
