package com.example.gwtinit.server;

public interface ServiceStubInt {

	public double add(int l1, int l2);
	
	//wzorzec zdalnego wywołania asynchronicznego - RPC - Remote Procedure Call
	/*
	public void add(int l1, int l2, new AsyncCallback<Double>(){
		
		void onSuccess(Double result){
			
		};
		
		void onFailure(Exception error){
			
		};
	}); 
	*/
	
}
