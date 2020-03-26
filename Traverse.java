/**Traversing the binaryTree*/
        Node rootNode = binaryTree.get(0);
        try {
            if (Objects.nonNull(rootNode))
            {

            }
            else
                throw new Exception("Root Node not found");

        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }

        for (; ; ) {
            System.out.println("Traverse the binary tree as\n1. Pre-Order\n2. In-Order\n3. Post-Order\nPress Anu Digit For Exit");
            int input = scanner.nextInt();

            if (input>=4||input<=0)
                break;
            else if (input==1)
            {
                List<Integer> resultList = new ArrayList<>();
                resultList = preOrder(rootNode, resultList);
            }
            else if (input==2)
            {
                inOrder(rootNode);
            }
            else if (input==3)
            {
                postOrder(rootNode);
            }
            else
                break;
        }
        System.out.println(binaryTree);
    }


    public static List<Integer> preOrder( Node rootNode, List<Integer> resultList)
    {
        resultList.add(rootNode.nodeValue);
        if (rootNode.leftNode!=null)
        {
            rootNode = rootNode.leftNode;
            preOrder(rootNode, resultList);
        }
        else 
        {
            rootNode = rootNode.rightNode;
            preOrder(rootNode, resultList);
        }

    }


    public static List<Integer> inOrder( Node rootNode)
    {
        List<Integer> resultList = new ArrayList<>();
        return resultList;
    }
    public static List<Integer> postOrder( Node rootNode)
    {
        List<Integer> resultList = new ArrayList<>();
        return resultList;
    }
}
