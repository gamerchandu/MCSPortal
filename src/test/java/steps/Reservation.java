package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Reservation {

	pages.Reservation reservation= new pages.Reservation();

	@When("user navigates to mcsqaportal url")
	public void user_navigates_to_mcsqaportal_url() {
		reservation.get("https://mcsqaportal.spacewell.com/test_180/");
	}

	@Then("mcsqaportal website should be displayed")
	public void mcsqaportal_website_should_be_displayed() {
		Assert.assertEquals(reservation.isPageTitle(), "MCS Web Portal");
	}

	@Given("user enters username {string} in the ID")
	public void user_enters_username_in_the_id(String string) {
		reservation.setUserID(string);
	}

	@When("the user enters password {string} in the Password box")
	public void the_user_enters_password_in_the_password_box(String string) {
		reservation.setPassword(string);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		reservation.login();
	}

	@Then("user verifies the portal dashboard")
	public void user_verifies_the_portal_dashboard() {
		Assert.assertEquals(reservation.isPageLoaded(), Boolean.TRUE);
	}

	@When("the user clicks on Reservation from left panel")
	public void the_user_clicks_on_reservation_from_left_panel() {
		reservation.clickOnReservation();
	}

	@When("the user clicks on Calendar from Reservation")
	public void the_user_clicks_on_calendar_from_reservation() {
	 	reservation.clickOnCalendar();
	}

	@When("the user switches to {int} viewMode")
	public void the_user_switches_to_view_mode(Integer int1) {
		reservation.switch24By7Mode();
	}

	@When("the user selects All regions in region")
	public void the_user_selects_all_regions_in_region() {
		reservation.selectAllRegions();
	}

}
