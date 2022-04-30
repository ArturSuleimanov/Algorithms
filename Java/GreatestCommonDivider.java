/**First of all we need to prove:  a>=b>0 and r = a%b => gcd(a, b) = gcd(r, b) 
* proof: it'll be enough to prove that gcd(a, b) = gcd(a-b, b)
* 
* gcd(a, b) <= gcd(a-b, b): if d divides a and b than d divides a-b.
* 
* gcd(a, b) >= gcd(a-b, b): if d divides a-b and b than d divides a whic is (a-b) + b
* this algorithm has N(log(a) + log(b)) time
* if a>=b>0 => a % b < a/2
* proof: if b <= a/2 than a%b<b<=a/2
* if b>a/2 than a%b = a-b<a/2
*/

public class GreatestCommonDivider {
    public static void main(String[] args) {
        System.out.println(gcd(0, 7));
        System.out.println(gcd(7, 0));
        System.out.println(gcd(0, 0));
        System.out.println(gcd(7, 7));
        System.out.println(gcd(7, 35));
        System.out.println(gcd(7, 5));

        
    };


    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b, a%b);
    }
}
