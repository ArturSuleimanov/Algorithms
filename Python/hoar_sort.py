# average is O(nlogn), the worst time is O(n ** 2)
def hoar_sort(array):
    if len(array) <= 1:    # first of all we need to define extreme case, whick is when array length less than two
        return
    barrier = array[0]  # second step is to find a barrier element, since we don't know either this array sorted or not, we will take first element
    L, M, R = [], [], []   # also we need three list where we can append elements whick are less, equal or greater than barries element
    for x in array:   # in this cycle we can distribute elements into lists
    
        if x < barrier:
            L.append(x)
        elif x == barrier:
            M.append(x)
        else:
            R.append(x)
    hoar_sort(L)   # sort of lower elements
    hoar_sort(R)    # sort of greater elements
    count = 0   # since we don't want to return new list, we need to change old list, so that we need index
    for el in L + M + R:
        array[count] = el
        count += 1



def check_sorted(array, ascending=True):    # also we need to check if array is sorted
    flag = True     # first of all we need flag which shows either array sorted or not
    s = 2 * int(ascending) - 1  # second is indicator which helps us not to duplicate code, it will be 1 is ascending true otherwise -1
    for i in range(0, len(array)-1):    
        if s * array[i] > s * array[i+1]:   #checking if curret element is greater than next, so that we can return false right now
            flag = False
            return flag
    return flag 






if (__name__ == "__main__"):
    list1 = [2, 4, 5, 6, 78, 2, 1, 8]
    list2 = [1]
    list3 = []
    hoar_sort(list1)
    hoar_sort(list2)
    hoar_sort(list3)
    
    print(check_sorted(list1))
    print(check_sorted(list2))
    print(check_sorted(list3))
