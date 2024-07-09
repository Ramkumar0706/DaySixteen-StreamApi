package interfaces;

import java.util.function.Supplier;

public class SupplierInterface {
	public static void main(String[] args) {
		Supplier<Double> getValue=()-> 2*Math.random();
		System.out.println(getValue.get());
	}
}