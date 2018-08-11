package com.zaferkirca.arac;

import com.zaferkirca.yakit.IYakit;

public class Araba implements IAraba {
	
	IYakit yakit;
	
	public Araba(IYakit yakit) {
		this.yakit = yakit;
	}

	public void Ilerle(){
		System.out.println("Araba ilerliyor.");
		yakit.YakitAdiVer();
	}
}