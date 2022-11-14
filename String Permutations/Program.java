
public class Program {

    public static void StrintPermutation(String input ){
        System.out.println("All permutations of String: " + input);
        StrintPermutation("", input);
    }

    public static void StrintPermutation(String permutation, String input ){

        if (input.length() == 0){
            System.out.println(permutation);
        }

        for (int i =0; i<input.length(); i++){
            StrintPermutation(permutation+input.charAt(i),
                    input.substring(0,i)+input.substring(i+1,input.length()));

        }
    }

	public static void main(String[] args)
	{
        StrintPermutation("ABC" );
	}
}

