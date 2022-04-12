public class exam 
{
    public static void main(String[] args)
    {
    int i,j=0;
    int[] sum={0,0,0,0,0};
    int[][]grade={
             {80,75,78,93}
            ,{67,87,98,65}
            ,{86,72,60,76}
            ,{76,80,76,63}
            ,{82,70,90,67}};//声明数组并赋初值
    for(i=0;i<grade.length;i++)
        for(j=0;j<grade[i].length;j++)
        {sum[i]+=grade[i][j];}//元素相加

    //（1）输出总成绩
    for(i=0;i<grade.length;i++)
    {System.out.println("student["+i+"]="+sum[i]);}

    //(2)打印总成绩最高 以及行号
    int max=0;
    int trace=0;
    for(i=grade.length-1;i>0;i--)
    {
        if(max<sum[i])
        {max=sum[i];
        trace=i;}
    }
    System.out.println("总分最高分为"+sum[trace]+"分");
    System.out.println("行号为"+trace);

    //(3)打印单科最高 以及行号
    int project_max[]={0,0,0,0};
    int project_trace[]={0,0,0,0};
    for(i=0;i<grade.length-1;i++)
    {
        for(j=0;j<grade[i].length;j++)
    {
        if(project_max[i]<grade[i][j])
        {
        project_max[i]=grade[i][j];
        project_trace[i]=i+1;
        }
    }
    System.out.println("第"+project_trace[i]+"科单科最高分为"+project_max[i]+"分");
    System.out.println("行号为"+project_trace[i]);
    }
    }
}
