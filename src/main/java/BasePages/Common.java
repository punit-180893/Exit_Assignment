package BasePages;

import org.openqa.selenium.By;

public class Common {
    //cross the signUpSlide
    public static By SignUpSlide = By.xpath("//button[contains(text(),'✕')]");
    //SearchFeature
    public static By search_field = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/input[1]");
    public static By searchLens = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]");
    //CartFeature
    public static By cartBtn = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[6]/div[1]/div[1]/a[1]");
    //Mobile TaskBar Feature
    public static By Mobile = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[2]/a[1]");
    public static By OfferZone = By.xpath("//a[contains(text(),'Offer Zone')]");
    public static By ViewAll = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/a[1]");
   // ***Become a Seller***//
    public static By BecomeASeller = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]");
    public static By StartSelling = By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/button[1]");
    public static By RegisterBtn = By.xpath("//body/div[@id='app-container']/div[1]/div[1]/div[1]/form[1]/footer[1]/button[1]");
    //CustomerCare help feature
    public static By More = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/div[1]/div[1]");
    public static By Care = By.xpath("//div[contains(text(),'24x7 Customer Care')]");
    //carousel slides feature on first pAGE
    public static By carouselSlide = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[2]/div[1]/div[3]");
    //Grocery tab feature
    public static By grocery = By.xpath("//div[contains(text(),'Grocery')]");
    public static By pincode = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]");
    //Explore Plus feature
    public static By explorePlus = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[2]");
    public static By coin_balance = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/a[1]/div[1]/div[1]/img[2]");
    //Logout feature
    public static By hover = By.xpath("//body/div[@id='container']/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/*[1]");
    public static By logout = By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[1]/div");
    //Add Address feature
    public static By Hover = By.xpath("//div[contains(text(),'Punit')]");
    public static By myProfile = By.xpath("//div[contains(text(),'My Profile')]");
    //Top Offer Feature
    public static By topOffer = By.xpath("//div[contains(text(),'Top Offers')]");
    public static By flights = By.xpath("/a[contains(text(),'Flights')]");
    //Test Carrers & Jobs Feature
    public static By Careers = By.xpath("//a[contains(text(),'Careers')]");
    public static By exploreJobs = By.xpath("//body/div[1]/div[4]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/button[1]");
    //Test Buy Now Feature
    public static By Fashion = By.xpath("//body/div[@id='container']/div[1]/div[2]/div[1]/div[1]/div[4]/a[1]");
    public static  By Watch = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[5]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
    public static By Lacoste = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[2]");
    public static By Buy = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/form[1]/button[1]");
    //Test Gift Cards Feature
    public static By giftCards = By.xpath("//span[contains(text(),'Gift Cards')]");
    public static By addToWallet = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[4]/div[1]/div[1]/a[1]");
    public static By BuyGiftCard = By.xpath("//span[contains(text(),'Buy a Gift Card')]");
    //Test My Orders Feature
    public static By myOrders = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]");
    //Delete Address
    public static By MyAdress = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/a[2]");
    public static By Delete = By.xpath("//body/div[@id='container']/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]");
    //Advertise feature
    public static By ads = By.xpath("//body/div[@id='container']/div[1]/footer[1]/div[1]/div[3]/div[2]/div[1]/div[2]/a[1]");
    public static By videos = By.xpath("//a[@id='']");


}
