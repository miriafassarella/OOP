package exercicesPOO.interfaces.imprimer.printers;

import exercicesPOO.interfaces.imprimer.Printable;
import exercicesPOO.interfaces.imprimer.Printer;

public class PrinterHP implements Printer {

	@Override
	public void printOut(Printable printable) {
		System.out.println("=======================================");
		System.out.println(printable.getPageHeader());
		System.out.println("=======================================");
		System.out.println(printable.getBodyPage());
		System.out.println("........................................");
		System.out.println("==              HP                    ==");
		System.out.println("........................................");

	}

}
