package pages;


public class ANotepadPage {

    public String url = "https://anotepad.com/";
    public String noteNameField = "//input[@id = 'edit_title']";
    public String saveButton = "(//input[@id = 'btnSaveNote'])[1]";
    public String warning = "//p[@class= 'alert alert-danger displaynone']";
    public String deleteButton = "//a[@class='delete']";
    public String noAnyNote = "//div[text()='No note here.']";
}
