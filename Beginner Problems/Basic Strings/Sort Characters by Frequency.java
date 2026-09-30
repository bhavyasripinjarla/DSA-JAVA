import java.util.*;
// class Solution {   
//     public void sort(List<Character> list,int[] temp){
//         int m=list.size();
//         for(int i=0;i<m;i++){
//             int k=i;
//             for(int j=i+1;j<m;j++){
//                 if(temp[j]>temp[k]){
//                     k=j;
//                 }
//                 else if(temp[j]==temp[k]){
//                     int c1=list.get(k);
//                     int c2=list.get(j);
//                     if(c2<c1){
//                         k=j;
//                     }
//                 }
//             }
//             if(k!=i){
//                 Collections.swap(list, i, k);
//                 int t=temp[k];
//                 temp[k]=temp[i];
//                 temp[i]=t;
//             }
            
//         }
//     } 
//     public List<Character> frequencySort(String s) {
//         // Your code goes here

//         List<Character> list=new ArrayList<>();
//         int n=s.length();

//         HashMap<Character,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             char ch=s.charAt(i);
//             map.put(ch,map.getOrDefault(ch,0)+1);
//         }

//         int m=map.size();
//         int[] temp=new int[m];
//         int k=0;
//         for(Map.Entry<Character,Integer> entry:map.entrySet()){
//             temp[k]=entry.getValue();
//             k++;
//             list.add(entry.getKey());
//         }

//         sort(list,temp);
//         return list;

//     }
// }
class Solution {
    public String sort(char[] ch,int[] temp){
        int m=ch.length;
        for(int i=0;i<m;i++){
            int k=i;
            for(int j=i+1;j<m;j++){
                if(temp[j]>temp[k]){
                    k=j;
                }
                else if(temp[j]==temp[k]){
                    int c1=ch[k];
                    int c2=ch[j];
                    if(c2<c1){
                        k=j;
                    }
                }
            }
            if(k!=i){

                char c=ch[i];
                ch[i]=ch[k];
                ch[k]=c;

                int t=temp[k];
                temp[k]=temp[i];
                temp[i]=t;
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            int w=temp[i];
            while(w>0){
                sb.append(ch[i]);
                w--;
            }
        }
        return sb.toString();
    } 
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int m=map.size();
        int[] temp=new int[m];
        char[] ch=new char[m];
        int k=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            temp[k]=entry.getValue();
            ch[k]=entry.getKey();
            k++;
        }
        return sort(ch,temp);
    }
}