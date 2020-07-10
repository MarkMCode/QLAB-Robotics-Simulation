//Sets voltage value if the element in question is a voltage source if JSCircuitElm is included in compilation
//Can be injected into GWT app by placing it in the "war" folder and calling:
//ScriptInjector.fromUrl("SetVoltage.js").inject(); from the Java source code
var battery = new JSCircuitElm(5);
battery.setVoltage(10);
