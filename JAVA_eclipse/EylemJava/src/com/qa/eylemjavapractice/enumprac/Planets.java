package com.qa.eylemjavapractice.enumprac;

public enum Planets {

	
	
	 Mercury(3.03e+23, 2.4397e6),
	    Venus(4.869e+24, 6.0518e6),
	    Earth(5.976e+24, 6.37814e6),
	    Mars(6.421e+23, 3.3972e6),
	    Jupiter(1.9e+27,   7.1492e7),
	    Saturn(5.688e+26, 6.0268e7),
	    Uranus(8.686e+25, 2.5559e7),
	    Neptune(1.024e+26, 2.4746e7);

		private final double mass;
		private final double distanceS;

		Planets (double mass, double distanceS) {
			this.mass = mass;
			this.distanceS = distanceS;
			
		}
		
		
		public static final double g_constant = 6.67e-11;
		
		
		
		public double someGrav() {
			return g_constant*mass / (distanceS);
		}
		
		
		public double someWeight (double otherMass) {
			return otherMass*someGrav();
		}
		
		
}
