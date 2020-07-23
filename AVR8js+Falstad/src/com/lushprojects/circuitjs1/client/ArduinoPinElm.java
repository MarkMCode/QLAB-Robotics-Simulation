//Written by Mark Megarry in July 2020 to provide Arduino simulation with CircuitJS1 and AVR8js

package com.lushprojects.circuitjs1.client;
import com.google.gwt.core.client.GWT;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = false, namespace = JsPackage.GLOBAL)	//JsInterop setup
public class ArduinoPinElm {
   //Declare values
   public double voltage;
   public String port;
   public int pin;
   public int state;
   public ArduinoPinElm(String definedPort, int definedPin) {	//Constructor, object to a pin
       this.port = definedPort;
       this.pin = definedPin;
   }
   
   //get/set pin value
   public void doStep(boolean enable){
       if(enable) {
	//Get/set pin associated with this object
	}
   }
	
   //Get state of pin and save to state var
   public native int getState() /*-{
    	//this.state = $wnd.Runner.portB.pinState(5);
    	this.state = $wnd.eval("Runner.port"+this.port+".pinState("+this.pin+");");
    	return this.state;
    }-*/;
   
   //Set state of pin
   public native void setState(String definedState) /*-{
       $wnd.eval("Runner.port"+this.port+".setPin("+this.pin+","+definedState+");")
   }-*/;
   
	
}