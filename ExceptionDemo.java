public class ExceptionDemo {
    public static void main(String args[]) {

        int a = 10, b = 0;
        int arr[] = {1,2,3};

        try {
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Occurred");
        }
	try{
		 System.out.println(arr[5]);
	}
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds");
        }
    }
}
