package org.example.java8;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {

    public static void main(String[] args) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");

        String script = "var welcome = 'Hello';" +
                "welcome += ', Aman'; " +
                "welcome;";

        Object result  = null;
        try {
            result = (String) engine.eval(script);
            System.out.println(result);
        } catch (ScriptException e) {
            e.printStackTrace();
        }

    }
}
