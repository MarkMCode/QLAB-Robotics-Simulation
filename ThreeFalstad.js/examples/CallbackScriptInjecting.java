//An inelegant solution to injecting scripts in a desired order
//MotorSim is the simulation file

//ammo.js callback, loads sim
	    final com.google.gwt.core.client.Callback<Void, Exception> ammoCallback = new com.google.gwt.core.client.Callback<Void,Exception>() {
		public void onFailure(Exception reason) {
		    Window.alert("ammo.js SCRIPT LOAD FAILURE");
		}

		public void onSuccess(Void result) {
		    ScriptInjector.fromUrl("MotorSim.js").setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
		
	    };
	    
	    //three.js callback, loads ammo
	    final com.google.gwt.core.client.Callback<Void, Exception> threeCallback = new com.google.gwt.core.client.Callback<Void,Exception>() {
		public void onFailure(Exception reason) {
		    Window.alert("three.js SCRIPT LOAD FAILURE");
		}

		public void onSuccess(Void result) {
		    ScriptInjector.fromUrl("ammo.js").setCallback(ammoCallback).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
		
	    };
	  //ScriptInjector.fromUrl("Test.js").inject();
	  ScriptInjector.fromUrl("three.js").setCallback(threeCallback).setWindow(ScriptInjector.TOP_WINDOW).inject();
  	}
