# This is the binary search algorithm, which speed is 0(log(N))
# In this algorithm implementation we are not gonna searhc elemen itself. We are gonna find the borders of sublist which contains this element or elements

def left_boundary(sorted_list, element):    # first of all I want to find left boundary. If we are searching for 5 in list [1, 2, 3, 5, 5, 6, 7] - left boundary index would be 2 
   
    """
    >>> print(left_boundary([1, 2, 3, 5, 5, 6, 7], 5))
    2
    >>> print(left_boundary([1, 2, 3, 4], 5))
    3
    >>> print(left_boundary([7, 8, 9], 5))
    0
    >>> print(left_boundary([], 5))
    0
    >>> print(left_boundary([5, 5, 5, 5, 5, 5, 5], 5))
    0
    >>> print(left_boundary([1, 2, 3, 4, 6, 7, 8], 5))
    3
    """
    right = len(sorted_list)
    left = 0
    while right > left + 1:
        current = (left + right) // 2   # shooting to the middle of a list
        if sorted_list[current] >= element:
            right = current
        elif sorted_list[current] < element:
            left = current
    return left


def right_boundary(sorted_list, element):   #  second step is searching for right boundary, If we are searching for 5 in list [1, 2, 3, 5, 5, 6, 7] - right boundary index would be 5 
    """
    >>> print(right_boundary([1, 2, 3, 5, 5, 6, 7], 5))
    5
    >>> print(right_boundary([1, 2, 3, 4], 5))
    4
    >>> print(right_boundary([7, 8, 9], 5))
    1
    >>> print(right_boundary([], 5))
    0
    >>> print(right_boundary([5, 5, 5, 5, 5, 5, 5], 5))
    7
    >>> print(right_boundary([1, 2, 3, 4, 6, 7, 8], 5))
    4
    """
    right = len(sorted_list)
    left = 0
    while right > left + 1:
        current = (left + right) // 2   # shooting to the middle of a list
        if sorted_list[current] > element:
            right = current
        elif sorted_list[current] <= element:
            left = current
    return right



def binary_search(sorted_list, element):    #the third step is to return a tuple which contains left and right bordaries
    """
    >>> print(binary_search([1, 2, 3, 5, 5, 6, 7], 5))
    (2, 5)
    >>> print(binary_search([1, 2, 3, 4], 5))
    (3, 4)
    >>> print(binary_search([7, 8, 9], 5))
    (0, 1)
    >>> print(binary_search([], 5))
    (0, 0)
    >>> print(binary_search([5, 5, 5, 5, 5, 5, 5], 5))
    (0, 7)
    >>> print(binary_search([1, 2, 3, 4, 6, 7, 8], 5))
    (3, 4)
    """
    return (left_boundary(sorted_list, element), right_boundary(sorted_list, element))





DEBUG = True


if DEBUG:
    import doctest
    doctest.testmod()
