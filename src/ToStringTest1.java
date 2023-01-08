import java.util.Arrays;

public class ToStringTest1 {

    public static void main(String[] args) {
        ToStringTest1 test1 = new ToStringTest1();
        System.out.println(test1);
        System.out.println(test1.toString());
        int[] num = {1,2,3,4};
        System.out.println("第四个数据是" + num[num.length-1]);
        for(int val:num) {
            System.out.print("元素的值依次是："+val+"\t");
        }
        for(int i=0; i< num.length;i++){
            System.out.print("元素的值依次是："+ num[i] +"\t");
        }
        //int[] newnum = Arrays.copeOf(int[] num,8);
        int[] newnum = Arrays.copyOf(num,8);

        for(int i=0; i< newnum.length;i++){
            System.out.println("克隆元素的值依次是："+  newnum[i] );
        }
        int[] newScores = Arrays.copyOfRange(num,0,2);
        for(int i=0; i< newScores.length;i++){
            System.out.println("又克隆元素的值依次是："+  newScores[i] );
        }
    }

    public String toString() {
        return "Test:name" + "对象";
    }

}

