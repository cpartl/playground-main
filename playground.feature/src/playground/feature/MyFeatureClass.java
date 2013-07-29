package playground.feature;

import playground.core.FeatureProvider;

public class MyFeatureClass {
	
	private String feature;
	
	public MyFeatureClass() {
		feature = FeatureProvider.getFeatureString();
	}

}
