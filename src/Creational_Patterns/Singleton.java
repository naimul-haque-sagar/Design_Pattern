package src.Creational_Patterns;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;


class Singleton{
    static Singleton singleton=new Singleton();
    private Singleton(){
        
    }
    public String str;
    static Singleton getSingleInstance(){
        
        return singleton;
    }
}
