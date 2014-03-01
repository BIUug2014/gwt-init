package com.example.gwtinit.server;

public interface ServiceStubInt {

	public double add(int l1, int l2);
	
	//wzorzec zdalnego wywołania asynchronicznego
	/*
	public void add(int l1, int l2, new AsyncService<Double>{
		
		void onSuccess(Double result){
			
		};
		
		void onFailure(Exception error){
			
		};
	}) 
	*/
	
}
