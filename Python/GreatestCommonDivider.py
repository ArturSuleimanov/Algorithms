"""
First of all we need to prove:  a>=b>0 and r = a%b => gcd(a, b) = gcd(r, b) 
 proof: it'll be enough to prove that gcd(a, b) = gcd(a-b, b)
 
 gcd(a, b) <= gcd(a-b, b): if d divides a and b than d divides a-b.
 
 gcd(a, b) >= gcd(a-b, b): if d divides a-b and b than d divides a whic is (a-b) + b
 this algorithm has N(log(a) + log(b)) time
 if a>=b>0 => a % b < a/2
 proof: if b <= a/2 than a%b<b<=a/2
 if b>a/2 than a%b = a-b<a/2
"""

from distutils.debug import DEBUG


def gcd(a, b):
    """
    >>> print(gcd(0, 7))
    7
    >>> print(gcd(7, 0))
    7
    >>> print(gcd(0, 0))
    0
    >>> print(gcd(7, 7))
    7
    >>> print(gcd(7, 35))
    7
    >>> print(gcd(7, 5))
    1
    
    """
    if(b==0): return a
    return gcd(b, a%b)


DEBUG = True
if DEBUG:
    import doctest
    doctest.testmod()