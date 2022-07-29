
package cn.zjl.leetcode;

import java.util.*;


public class leetcodeLib {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        boolean result=false;
        while(i<matrix.length && j>=0){
            if(matrix[i][j]==target){
                result=true;
                break;
            }
            else if(matrix[i][j]<target){
                i++;
            }else{
                j--;
            }
        }
        return result;
    }


    public String replaceSpace(String s) {
        char[] ch=s.toCharArray();
        int length=s.length();
        char[] result=new char[length*3];
        int i=0,j=0;
        for(;i<ch.length;i++,j++){
            if(ch[i]!=' '){
                result[j]=ch[i];
            }else{
                result[j]='%';
                result[j+1]='2';
                result[j+2]='0';
                j+=2;
            }
        }

        return new String(result,0,j);
    }


    public int[] reversePrint(ListNode head) {
        ListNode p=head;
        List<Integer> list=new ArrayList();
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        Collections.reverse(list);
        int[] in=new int[list.size()];
        for(int i=0;i<list.size();i++){
            in[i]=list.get(i);
        }
        return in;
    }
}
