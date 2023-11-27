package org.Testcases;

import org.BaseClass.BassClass;
import org.POM.PolicyCancel;

public class Policy_Cancel extends BassClass{
	PolicyCancel cancel;
	
	public void policy_Cancel() {
		
		HomePage(page);
		cancel = new PolicyCancel();
		page.click(cancel.getActions());		

	}
	
	

}
