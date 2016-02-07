package com.lee_01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import org.junit.*;

public class junitTest2 {
	/* @Beforeÿ��ִ��@Test����ִ��һ��@Before @Afterͬ��
	@Before 
	public void init() throws Exception {
		System.out.println("Init...");
		Thread.sleep(1000);
		System.out.println("Init Finish");
	}
	*/
	
	@BeforeClass  //@BeforeClassֻ����һ�� ���Ƿ���������static���ε� @AfterClassͬ��
	
	public static void init() throws Exception {
		System.out.println("Init...");
		Thread.sleep(1000);
		System.out.println("Init Finish");
	}

	@Test
	public void readFile() throws Exception {
		FileInputStream fis = new FileInputStream("a.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));
		String content;
		while ((content = br.readLine()) != null) {
			Thread.sleep(1000);
			System.out.print(content);
		}
		System.out.println();
		fis.close();
	}
	@Test
	public void writeFile() {
		System.out.println("Write File to disk");
	}
	/*
	@After
	public void finish() throws Exception {
		System.out.println("Clear...");
		Thread.sleep(1000);
		System.out.println("Clear Finish");
	}
	*/
	@AfterClass
	public static void finish() throws Exception {
		System.out.println("Clear...");
		Thread.sleep(1000);
		System.out.println("Clear Finish");
	}
	
}
