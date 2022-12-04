package org.arca.compactnumber;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class TestCompactNumberFormat {

	public static void main(String[] args) {
		NumberFormat nf = CompactNumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.LONG);
		System.out.println(nf.format(50000));
	}
}
