package com.basic.practice;


interface InterfaceLanguages {

	public  void work() ;
		
}


class Display implements InterfaceLanguages{

	@Override
	public void work() {
		System.out.println("Print the Languages Barriers");
		
	}
	
	
	
}
public class InterfaceConcept {

	public static void main(String[] args) {
		
       InterfaceLanguages interfaceLanguages= new Display();
       
       interfaceLanguages.work();
       
	}

}
