package com.garantibbva.page;

import com.garantibbva.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.garantibbva.constans.ConstansTrendyolPage.*;

public class SepetPage extends BasePage {

    public SepetPage(WebDriver driver) {
        super(driver);
    }

    public SepetPage search(String product){
        sendKeys(INPUT,product);
        return this;
    }

    public SepetPage searchClick() {
        click(SEARCH);
        return this;
    }

    public SepetPage closePop(){
        click(POP);
        return this;
    }

    public SepetPage clickProduct(){
        click(PRODUCT_PATH);
        return this;
    }
    public SepetPage addBasket(){
        click(ADDBASKET);
        return this;
    }
    public SepetPage goBasket(){
        click(BASKET);
        return this;
    }

    public String getText(){
       return  getText(PRODUCT_NAMEPAGE);

    }
    public String getTextBasket(){
        return  getText(PRODUCT_NAMEBASKET);

    }


}
