package com.example.bookReader.main;

import com.example.bookReader.bean.Txterror;



public interface Transformer {

	public void PostResult(Boolean t);

	public void PostError(Txterror txterror);	


}
