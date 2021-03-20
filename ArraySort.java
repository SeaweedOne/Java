//0~100까지 임의의 수를 30개 발생시켜서 배열에 넣은 후 정렬하시오.
//조건1) 정렬 전/후의 값을 화면에 출력조건
//2) 소트 알고리즘 중 사용한 알고리즘을 설명한 레포트 (형식 무관,내용만 제출)첨부비고. 
//정렬 알고리즘 및 이중 루프문에 대한 공부는 따로 하셔야 합니다.(서로간의 정보 교환 가능)

import java.util.Arrays;
import java.util.Random;
public class ArraySort {
   public static void main(String[] args) {

	 //1. 수업시간에 배운방식으로 arr이라는 배열에 랜덤 값을 집어 넣는 for문을 작성하고 생성 배열을 출력했습니다.
      int[] arr = new int[30];
      int arrlen = arr.length;

      for (int i = 0; i < arrlen; i++) {
         Random r = new Random();
         arr[i] = r.nextInt(101);
      }
      System.out.println("생성한 배열 \n" + Arrays.toString(arr));
      
    //2. 정렬을 위한 2중 for문과 if 문을 만들어 보았어요!
    //먼저 for 문으로 인덱스값 / (인덱스 +1값)을 만들고 그 결과값을 num1,num2에 각각 대입하였습니다.
    //if문을 이용해 num1 > num2 인 경우 두 수의 위치를 바꿔주었습니다.
      
      for (int j = 0; j < arrlen; j++) {
         for (int k = (j + 1); k < arrlen; k++) {
            int num1 = arr[j];
            int num2 = arr[k];
            if (num1 > num2) {
               arr[j] = num2;
               arr[k] = num1;
            }
         }
      }
      System.out.println("정렬한 배열 \n" + Arrays.toString(arr));
   }
}

//두 수를 비교해 정렬하는 버블정렬 방식을 만들어보았습니다!
//
//1. 수업시간에 배운방식으로 arr이라는 배열에 랜덤 값을 집어 넣는 for문을 작성하고 생성 배열을 출력했습니다.
//2. 정렬을 위한 2중 for문과 if 문을 만들어 보았어요!
//먼저 for 문으로 인덱스값 / (인덱스 +1값)을 만들고 그 결과값을 num1,num2에 각각 대입하였습니다.
//if문을 이용해 num1 > num2 인 경우 두 수의 위치를 바꿔주었습니다.

