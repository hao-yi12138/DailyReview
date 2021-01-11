package Nowcoder;

import java.util.Scanner;

/**
 * @program: IntelliJ IDEA
 * @description:
 * @author: HAOYI
 * @date:2021-01-11 20:39
 **/

/**
 * 链接：https://www.nowcoder.com/questionTerminal/a0c09a7e0da04e728810a8aca7226b7b
 * 来源：牛客网
 *
 * 北京大学对本科生的成绩施行平均学分绩点制（GPA）。既将学生的实际考分根据不同的学科的不同学分
 * 按一定的公式进行计算。 公式如下： 实际成绩 绩点 90——100 4.0 85——89 3.7 82——84 3.3 78——81 3.0
 * 75——77 2.7 72——74 2.3 68——71 2.0 64——67 1.5 60——63 1.0 60以下 0 1．
 * 一门课程的学分绩点=该课绩点*该课学分 2．总评绩点=所有学科绩点之和/所有课程学分之和
 * 现要求你编写程序求出某人A的总评绩点（GPA）。
 */
public class 学分绩点 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int gradePoint[]=new int[n];//每门课学分
        int coursePoint[]=new int[n];//每门课分数
        for(int i=0;i<n;i++){
            gradePoint[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            coursePoint[i]=in.nextInt();
        }
        in.close();
        System.out.printf("%.2f",gradePointAverage(gradePoint,coursePoint));//格式输出
    }
    public static double pointOfEachCourse(int grade){
        double point = 0.0;
        if(grade>=90&&grade<=100){
            point=4.0;
        }else if(grade>=85&&grade<=89){
            point=3.7;
        }else if(grade>=82&&grade<=84){
            point=3.3;
        }else if(grade>=78&&grade<=81){
            point=3.0;
        }else if(grade>=75&&grade<=77){
            point=2.7;
        }else if(grade>=72&&grade<=74){
            point=2.3;
        }else if(grade>=68&&grade<=71){
            point=2.0;
        }else if(grade>=64&&grade<=67){
            point=1.5;
        }else if(grade>=60&&grade<=63){
            point=1.0;
        }else if(grade<60){
            point=0.0;
        }
        return (double)point;
    }
    //计算平均绩点的方法
    public static double gradePointAverage(int[] gradePoint,int[] coursePoint){
        double gradePointTotal=0;
        double gradeOfEachCourseTotal=0;
        for(int i=0;i<gradePoint.length;i++){
            gradePointTotal+=pointOfEachCourse(coursePoint[i])*gradePoint[i];
            gradeOfEachCourseTotal+=gradePoint[i];
        }
        return (double)gradePointTotal/gradeOfEachCourseTotal;
    }
}

