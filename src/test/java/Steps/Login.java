package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
@Given("user open the application")
    public void open_application(){
    System.out.println("Given");

}
@When("user enters the username and password")
    public void enter_username_password(){
    System.out.println("when");
}

@Then("user should login successfully")
    public void login_success(){
        System.out.println("Then");
    }
}
