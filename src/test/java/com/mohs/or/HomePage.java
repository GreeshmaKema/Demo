package com.mohs.or;

import org.openqa.selenium.By;

import com.mohs.config.StartBrowser;

public class HomePage {
	
	public static By lnkComputer = By.xpath("//a[@href='/computers']");
	public static By lnkDesktop = By.xpath("//a[@href='/desktops']");
	public static By lnkElectronics = By.xpath("//a[@href=\"/electronics\"]");
	public static By lnkCellphones = By.xpath("//a[@href=\"/cell-phones\"]");
	public static By lnkJewelry = By.xpath("//a[@href=\"/jewelry\"]");
	public static By lnkBooks = By.xpath("//a[@href=\"/books\"]");
	public static By btnHome =By.xpath("//a[@href=\"/\"]");
	//To Register
	public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	public static By rbGender = By.id("gender-female");
	public static By txtFirstname = By.id("FirstName");
	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	public static By btnContinue = By.xpath("//input[@value='Continue']");
	//To login
	public static By lnkLogin = By.xpath("//a[@href=\"/login\"]");
	public static By txtemail = By.className("email");
	public static By txtpwd = By.className("password");
	public static By btnlogin = By.xpath("//input[@value='Log in']");
	public static By lnkLogout = By.xpath("//a[@class='ico-logout']");
	//To subscribe
	public static By lnkYoutube = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
	public static By btnSubscribe = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
<<<<<<< HEAD
    //To goto sitemap
=======
	//To goto sitemap
>>>>>>> 6df1a4ea30de7cc36bb085391a3cd15ad049e6be
	public static By lnkSitemap = By.xpath("//a[normalize-space()='Sitemap']");
	public static By lnkSearch = By.xpath("//div[@class='entity-body']//a[normalize-space()='Search']");
	public static By txtSearchKeyword = By.xpath("//input[@id='Q']");
	public static By btnsearch = By.xpath("//input[@class='button-1 search-button']");
<<<<<<< HEAD
	//to goto shipping&returns
	public static By lnkShippingandReturns = By.xpath("//a[normalize-space()='Shipping & Returns']");
	public static By lnkShpng = By.xpath("//h1[normalize-space()='Shipping & Returns']");
	//Goto Contactus
	public static By lnkContactUs = By.xpath("//a[normalize-space()='Contact us']");
	public static By txtName = By.xpath("//input[@id='FullName']");
	public static By txtEmaill = By.xpath("//input[@id='Email']");
	public static By txtEnquiry = By.xpath("//textarea[@id='Enquiry']");
	public static By btnSubmit = By.xpath("//input[@name='send-email']");
	public static By txtcontactus = By.xpath("//div[@class='result']");
	//goto new products
	public static By lnkNewProducts = By.xpath("//a[normalize-space()='New products']");
	public static By txtphCvr = By.xpath("//h1[@itemprop='name']");
	//go to shpng cart
	public static By lnkShoppingCart = By.xpath("//span[normalize-space()='Shopping cart']");
	public static By txtemptyshpngcart = By.xpath("//div[@class='order-summary-content']");
	//-------login and order--------
	public static By lnkApparelAndShoes = By.xpath("//a[@href=\"/apparel-shoes\"]");
	public static By imgBelt = By.xpath("//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000217_casual-golf-belt_125.jpeg\"]");
	public static By btnAddtoCart = By.xpath("//input[@id='add-to-cart-button-40']");
	public static By chkAgree = By.xpath("//input[@id='termsofservice']");
	public static By btnCheckout = By.xpath("//button[@id='checkout']");
	public static By btnCntnue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnBillingContinue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnShippingContinue = By.xpath("//input[@onclick='Shipping.save()']");
	public static By btnShpngMthdContinue = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
	public static By btnPaymentMthdContinue = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	public static By btnPaymentInfoContinue = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
	public static By btnConfirm = By.xpath("//input[@value='Confirm']");
	//public static By lnkOrderDetails = By.xpath("//a[normalize-space()='Click here for order details.']");
	public static By classOrderconfrmtn = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
=======
>>>>>>> 6df1a4ea30de7cc36bb085391a3cd15ad049e6be
}
