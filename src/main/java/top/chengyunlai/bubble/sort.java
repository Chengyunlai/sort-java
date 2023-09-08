package top.chengyunlai.bubble;

/**
 * @author Chengyunlai
 * @description: 🫧冒泡排序 - Java
 * @date 2023/9/8
 */
public class sort {
    public static void main(String[] args) {
        // 生成一个随机数组
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            // 生成一个[0,10)的随机数
            arr[i] = (int) (Math.random() * 10);
        }
        // 打印排序前的数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        // 冒泡排序
        // 1. 需要比较的轮数
        for(int i = 0;i < arr.length -1;i++){
            // 2. 每次比较的规则
            for(int j = arr.length -1;j > i;j--){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // 打印排序后的数组
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }


}
