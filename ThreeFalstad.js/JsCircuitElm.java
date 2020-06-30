package com.lushprojects.circuitjs1.client;
import jsinterop.annotations.JsType;	//Required for JsInterop
import jsinterop.annotations.JsPackage;	//Required for jsInterop

@JsType(isNative = false, namespace = JsPackage.GLOBAL)	//JsInterop setup
public class JsCircuitElm {
    CircuitElm elm;	//Element object
    public JsCircuitElm(int elm) {	//Constructor, assigns elm to element
        this.elm = circuitjs1.mysim.getElm(elm); 
    }
    //Get voltage difference
    public double getVoltageDiff() {
	return elm.getVoltageDiff();
    }
    //Get post voltage
    public double getPostVoltage(int n) {
	return elm.getPostVoltage(n);
    }
    //Get current
    public double getCurrent() {
	return elm.getCurrent();
    }
    
}

