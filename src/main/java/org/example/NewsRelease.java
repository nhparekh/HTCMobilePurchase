package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class NewsRelease extends Utils {


    public void addNewComment() {

        //Type Title
        typeText(By.id("AddNewComment_CommentTitle"), " NpHp ");
        // Type Comment
        typeText(By.id("AddNewComment_CommentText"), "Hey");
        //click on NEW COMMENT
        clickOnElement(By.name("add-comment"));
        //actual test msg after click on NEW COMMENT
        String actualMsg = getTextFromElement(By.className("result"));

        //comparing actual and expected
        Assert.assertEquals(actualMsg, loadProp.getProperty("ExpectedMsg"), "Your Comment Is Not Added.");
    }

    public void verifyNewAddedCommentDisplayAtLast() {
        // Locate the container or element that holds all the comments
        WebElement commentsContainer = driver.findElement(By.className("comment-list"));
        // Find the last comment element within the container
        WebElement lastComment = commentsContainer.findElement(By.xpath("//div[@class='comment-list']/div[2]/div[4]"));
        //Storing last Comment Text
        String lastCommentText = lastComment.getText();
        // Add a new comment (code to add a new comment goes here)

        //locate the last comment after adding the new comment
        WebElement newLastComment = commentsContainer.findElement(By.xpath("//div[@class='comment-list']/div[2]/div[4]"));
        //Storing new last comment
        String newLastCommentText = newLastComment.getText();
        // Compare the text or content of the last comment before and after adding the new comment
        if (lastCommentText.equals(newLastCommentText)) {
            System.out.println("New comment is shown at the last position.");
        } else {
            System.out.println("New comment is not shown at the last position.");
        }
    }
}

