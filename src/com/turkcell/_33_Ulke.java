package com.turkcell;

// static olan inner class
// ÖDEV OLARAK BUNA BİR TEK MAHALLE EKLE ILCE ALTINA
public class _33_Ulke {
	
	private String ulkeAdi;
	
	public String getUlkeAdi() {
		return ulkeAdi;
	}
	
	public void setUlkeAdi(String ulkeAdi) {
		this.ulkeAdi = ulkeAdi;
	}
	
	// İç static class (il)
	public static class _33_Il {
		
		private String ilAdi;
		
		public String getIlAdi() {
			return ilAdi;
		}
		
		public void setIlAdi(String ilAdi) {
			this.ilAdi = ilAdi;
		}
		
		// İç static class (ilçe)
		public static class _33_Ilce {
			
			private String ilceAdi;
			
			public String getIlceAdi() {
				return ilceAdi;
			}
			
			public void setIlceAdi(String ilceAdi) {
				this.ilceAdi = ilceAdi;
			}
			
		}
	}
	
	// main test
	public static void main(String[] args) {
		_33_Ulke ulke = new _33_Ulke();
		ulke.setUlkeAdi("Türkiye");
		
		_33_Il il = new _33_Il();
		il.setIlAdi("Ankara");
		
		com.turkcell._33_Ulke._33_Il._33_Ilce ilce = new com.turkcell._33_Ulke._33_Il._33_Ilce();
		ilce.setIlceAdi("Etimesgut");
		
		System.out.println(
				"Ulke Adi: " + ulke.getUlkeAdi() + " Il adi: " + il.getIlAdi() + " Ilce adi: " + ilce.getIlceAdi());
	}
}
