public class frequency {
    public static void main(String args[]){
        int a[]={1,2,5,4,5,2,3,1,7,5};
        int freq[]=new int[a.length];
        for(int i=0;i<a.length;i++) {
            int number = a[i];
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (number == a[j]) {
                    count++;
                    freq[j] = -1;
                }
            }
            if (freq[i] != -1) {
                freq[i] = count;
            }
        }
            for(int i=0;i<a.length;i++){
                if(freq[i]>0)
                    System.out.println(a[i] + "occurs" + freq[i] + "times");
            }
        }
    }


