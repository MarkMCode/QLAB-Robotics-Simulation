//Prints the voltageDiff value of the inductor in the default Falstad circuit to the console if JSCircuitElm.Java is included in compilation
//Can be injected into GWT app by placing it in the "war" folder and calling:
//ScriptInjector.fromUrl("LogInductor.js").inject(); from the Java source code

var inductor = new $wnd.JsCircuitElm(4);
console.log(inductor.getVoltageDiff());
