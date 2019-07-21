package Package2;

import org.testng.Assert;
import org.testng.annotations.Test;

import Package1.BaseClass;
import Package1.DressObjects;

public class DressTestScripts extends BaseClass {
	DressObjects dresspage;
	BaseClass bc;
	public DressTestScripts() {
		dresspage=new DressObjects();
		bc=new BaseClass();
	}
	@Test
	public void validatetabs() {
		
		Assert.assertTrue(bc.elementfound(dresspage.womentab()), "failed");
		Assert.assertTrue(bc.elementfound(dresspage.dresstab()),"failed" );
		Assert.assertTrue(bc.elementfound(dresspage.tshirttab()), "failed");
	
	}
	@Test
	public void verifytabs() {
		dresspage.womentab();
		Assert.assertTrue(bc.getcurrenttitle().equals("Women - My Store"), "failed");
		dresspage.dresstab();
		Assert.assertTrue(bc.getcurrenttitle().equals("Dresses - My Store"), "failed");
		dresspage.tshirttab();
		Assert.assertTrue(bc.getcurrenttitle().equals("T-shirts - My Store"), "failed");
	}
	
}