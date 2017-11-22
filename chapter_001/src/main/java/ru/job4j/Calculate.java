package ru.job4j;


	/**
	* Class Класс для печати "Hello world".
	* @author kalinouskij
	* @since 21.11.2017
	* @version 1
	*/


public class Calculate {
	
	/**
	* вывод в консоль "Hello world"
	* @param arg - arg.
	*/
	
	public static void main(String[] args) {
		System.out.println("Hello world.");
	}

	/**
	* Method echo.
	* @param name Your name.
	* @return Echo plus your name.
	*/
	public String echo(String name) {
    return "Echo, echo, echo : " + name;
	}	
}