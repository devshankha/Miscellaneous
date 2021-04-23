#Longest consecutive sequence in Binary tree
#https://www.geeksforgeeks.org/longest-consecutive-sequence-binary-tree/


class Node:
    def __init__(self,d):
        self.data = d
        self.left = None
        self.right = None




def longestConsecutiveUtil(root,curLength,target,res) :
    if (root ==  None):
        return
    if (root.data == target):
        curLength = curLength+1
    else:
        curLength = 1

    res[0] = max(curLength,res[0])
    longestConsecutiveUtil(root.left,curLength,root.data+1,res )
    longestConsecutiveUtil(root.right, curLength, root.data+1,res)


def longestConsecutive(root):
    if Node == None:
        return 0
    res = [0]
    # call utility method with current length 0
    longestConsecutiveUtil(root, 0, root.data, res)

    return res[0]

if __name__ == '__main__':
    root = Node(6)
    root.right = Node(9)
    root.right.left = Node(7)
    root.right.right = Node(10)
    root.right.right.right = Node(11)

    print(longestConsecutive(root))

