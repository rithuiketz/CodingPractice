package javaprogs;

/**
 * https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
 * https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html
 * https://docs.oracle.com/javase/tutorial/java/javaOO/anonymousclasses.html
 * https://docs.oracle.com/javase/tutorial/reflect/member/methodparameterreflection.html#implcit_and_synthetic
 * 
 * @author Rithuik Yerrabrolu
 *
 */
public class OuterClass {

	private int num;

	public class NestedClass {

		private int i;

		public int getI() {
			return num;
		}
	}

	public static class StaticClass {

		private int i;

		public int getI() {
			return new OuterClass().num;
		}
	}

}
