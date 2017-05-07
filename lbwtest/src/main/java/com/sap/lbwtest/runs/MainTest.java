package com.sap.lbwtest.runs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.sap.lbwtest.base.AnnotateMenthod;
import com.sap.lbwtest.base.ClassA;
import com.sap.lbwtest.base.ClassB;

public class MainTest {

	public static void main(String[] args) throws IOException, FileNotFoundException, NoSuchMethodException, SecurityException {
		ClassA aa = new ClassA();
		aa.setName("he");
		Method method = ClassA.class.getMethod("setName",String.class);
		AnnotateMenthod des  = method.getAnnotation(AnnotateMenthod.class);

		System.out.println(method.getName()+":"+des.appObject()+":"+des.operation());

	}

}
