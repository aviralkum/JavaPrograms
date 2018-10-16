import java.util.*;

class Frequency {


public static void main(String args[])
{
  int[] ar = new int[]{2,33,4,5,6,1,4,5,5,7,8,9,9,9};

  // Creating an Empty HashMap

  HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();

  // Traverse through the dasharray

    for(int i=0;i<ar.length;i++) {


      if(!(hm.containsKey(ar[i])) ) {

        hm.put(ar[i],1);
      }

      else {

        int getCount = hm.get(ar[i]);
        hm.put(ar[i],++getCount);
      }

    }

    // iterating through the HashMap and getting the elements with frequency > 1

    for(Integer Key: hm.keySet()) {

      if(hm.get(Key)>1)
      {
        System.out.println(Key);
      }

    }

  }
}
