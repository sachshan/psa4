package edu.neu.coe.info6205.union_find;
import java.util.*;
public class UF_Client {

    static int count(int n)
    {
        UF_HWQUPC uf = new UF_HWQUPC(n, true);

        Random random = new Random();
        int connections = 0;
        int pairs = 0;


        while(uf.components() != 1)
        {
            int node1 = random.nextInt(n);
            int node2 = random.nextInt(n);
            pairs++;
            System.out.println(uf.components());

            if(!uf.isConnected(node1, node2))
            {
                uf.union(node1, node2);
                connections++;
                System.out.println("Not connected");
            }
            else
            {
                System.out.println("Connected");

            }
        }


        return connections;
    }

    public static void main(String[] args) {

        System.out.println(count(Integer.parseInt(args[0])));
    }
}