package com.zaferkirca.arac;

import com.zaferkirca.yakit.IYakit;

public class Araba implements IAraba {

	IYakit yakit;
	int yakitFiyati;

	public void Ilerle() {
		System.out.println("Araba ilerliyor.");
		yakit.YakitAdiVer();

		System.out.println("Yakit Fiyati : " + yakitFiyati + "TL");
	}
	
	public int getYakitFiyati() {
		return yakitFiyati;
	}

	public void setYakitFiyati(int yakitFiyati) {
		this.yakitFiyati = yakitFiyati;
	}

	public IYakit getYakit() {
		return yakit;
	}

	public void setYakit(IYakit yakit) {
		this.yakit = yakit;
	}
}