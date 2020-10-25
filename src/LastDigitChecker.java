public class LastDigitChecker {
    public static boolean hasSameLastDigit (int a , int b , int c)
    {
        if ((a >=10 && a <= 1000) && (b >=10 && b <= 1000) && (c >=10 && c <= 1000))
        {
            int number1 = a % 10 ;
            int number2 = b % 10 ;
            int number3 = c % 10 ;

//            System.out.println(number1 ) ;
//            System.out.println(number2);
//            System.out.println(number3);

            return (((number1 == number2) || (number1 == number3) || (number2 == number3))) ;
        }
        return false ;
    }

    public static boolean isValid (int d)
    {
        return ((d >=10 && d <= 1000)) ;
    }


}

