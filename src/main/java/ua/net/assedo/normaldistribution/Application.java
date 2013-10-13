package ua.net.assedo.normaldistribution;

import ua.net.assedo.normaldistribution.tools.ArithmeticProgression;

import java.util.Random;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: assedoo@gmail.com
 * Project: second
 * Date: 10/12/13
 * Time: 5:52 PM
 */
public class Application {

    private static int ballsQuantity;
    private static int rowsQuantity;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balls quantity: ");
        ballsQuantity = scanner.nextInt();
        System.out.println("Enter rows quantity: ");
        rowsQuantity = scanner.nextInt();
        Ball balls[]=new Ball[ballsQuantity];
        int barsQuantity = ArithmeticProgression.sum(rowsQuantity);
        System.out.println("Bars quantity is: "+barsQuantity);
        Bar bars[]=new Bar[barsQuantity];

        for(int i=0;i<ballsQuantity;i++){
            balls[i]=new Ball(rowsQuantity,rowsQuantity);
        }

        {
            int x,y,rowNumber=1,offset=0;
            for(int i=0;i<barsQuantity;i++){
                y=rowsQuantity-rowNumber+1;
                x=y+offset;
                offset+=2;
                if(ArithmeticProgression.sum(rowNumber)==i+1) {
                    rowNumber++;
                    offset=0;
                }
                bars[i]=new Bar(x,y);
            }
        }

        Random randoms[]=new Random[barsQuantity];
//
        for(int i=0;i<barsQuantity;i++){
            randoms[i]=new Random();
        }

        for (int i=0;i<ballsQuantity;i++){
            for(int j=0;j<rowsQuantity;j++){
                for(int k=0;k<barsQuantity;k++){
                    if (balls[i].getCoordinates().equals(bars[k].getCoordinates())){
                        if (randoms[k].nextBoolean()){
                            balls[i].right();
                        } else {
                            balls[i].left();
                        }
                        balls[i].down();
                    }
                }
            }
        }

//        for (Bar bar:bars){
//            System.out.println(bar);
//        }

//        for(Ball ball:balls){
//            System.out.println(ball);
//        }

        int results[]=new int[rowsQuantity*2+1];

        for(int i=0;i<rowsQuantity*2+1;i++){
            for(Ball ball:balls){
                if(ball.getCoordinates().getX()==i){
                    results[i]++;
                }
            }
        }
        System.out.println();

        System.out.print("|");
        for(int result:results){
            if (result!=0) System.out.print(result+"|");
            else System.out.print(" |");
        }
        System.out.println();
    }
}