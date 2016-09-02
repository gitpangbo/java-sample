package org.kirito.javaImprove.innerClass.localInnerClass;


public class Parcel5 {
	public Destionation destionation(String str) {
		class PDestionation implements Destionation {
			private String label;

			private PDestionation(String whereTo) {
				label = whereTo;
			}

			@Override
			public String readLabel() {
				return label;
			}
		}
		return new PDestionation(str);
	}

	public static void main(String[] args) {
		Parcel5 parcel5 = new Parcel5();
		Destionation d = parcel5.destionation("chenssy");
		
		System.out.println(d.readLabel());
	}
}