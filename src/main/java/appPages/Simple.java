package appPages;

/*public class Simple {


    public void sumOfTwoNums(int a , int b){
        System.out.println(a+b);
    }

    public void diffOfTwoNums(int a, int b){

        sumOfTwoNums(a,b);
        System.out.println(a-b);
    }


    public static void main(String[] args) {

        Simple s= new Simple();

        s.diffOfTwoNums(4,5);
    }*/



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.imageio.stream.ImageInputStream;
import javax.swing.text.Position;

import static drivers.DriverFactory.getDriver;
/*
 * Author: Kishor Athale
 * Modules: Simple
 * Changes: This class contains random scripts
 */

public class Simple {

    public static void main(String[] args)throws InterruptedException {

       WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.manage().deleteAllCookies(); // delete all cookies
    // to set size of window
        Dimension d = new Dimension(500,500);
        driver.manage().window().setSize(d);
        Thread.sleep(2000);
    // to set position of window
        Point p = new Point(250,250);
        driver.manage().window().setPosition(p);
        Thread.sleep(2000);
        getDriver().manage().window().maximize();
        driver.close();






    }





    }



