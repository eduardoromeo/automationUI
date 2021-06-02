package task;

import actions.Click;
import actions.Enter;
import org.openqa.selenium.WebDriver;
import ui.EmployeeUI;

public class Employee {
    public static void as(WebDriver driver, String name1, String email, String address, String phone){
        Enter.text(driver, EmployeeUI.name1, name1);
        Enter.text(driver, EmployeeUI.email, email);
        Enter.text(driver, EmployeeUI.address, address);
        Enter.text(driver, EmployeeUI.phone, phone);
        Click.on(driver, EmployeeUI.addButton);
    }
}
