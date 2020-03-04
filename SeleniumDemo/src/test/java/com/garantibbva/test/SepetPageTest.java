package com.garantibbva.test;

import com.garantibbva.base.BaseTest;
import com.garantibbva.page.SepetPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static com.garantibbva.constans.ConstansTrendyolPage.*;

public class SepetPageTest extends BaseTest {

    SepetPage sepetPage;

    @Before
    public void before() {
        sepetPage = new SepetPage(getWebDriver());

    }

    @Test
    public void test() {

        sepetPage.closePop().search(PRODUCT).searchClick().clickProduct().addBasket();
        String productname = sepetPage.getText();
        sepetPage.goBasket();

        Assert.assertEquals(productname,sepetPage.getTextBasket());
    }

    @After
    public void after(){
        //tearDown();

    }

}
