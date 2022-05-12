package Task5;

public class SwitchProblemV4 {

        static int moves=0;
        //static int beginGlob=0;
        static int cursor=0;
        public static void turnOff(int[]x,int begin,int end) {





            // }
             if (end - begin == 0) {
                if (x[end] == x[x.length - 1] && x[end] == 0) {
                    turn(x, x.length - 1);
                }
                turn(x, end);
                turn(x, x.length - 1);


                // turn(x,end);
                //turn(x, x.length-1);
                //turn(x,end);


            }else{
              if (x[end] == 0) {
                  turn(x, end);
                  turn(x, x.length - 1);
                  if (end != x.length - 2) { //not the second to last bit
                      return;
                  }

              }
              if ( end == x.length - 2 && x[x.length - 1] == 1) {//is the second to last bit  && last bit =1
                  turn(x, x.length - 1);

              }

              turn(x, begin);
              turn(x, x.length - 1);

              if (end == x.length - 2) {
                  turn(x, end);
                  turn(x, x.length - 1);
              }
          }


        }

        public static void conquer(int[]x,int begin,int end){
           while(end-begin>2&&x[begin]==1){
               conquer(x,begin+2,end);
               turn(x,begin);
               conquer(x,begin+1,end);
           }
           turnOff(x,begin,end);
        }




        public static void turn(int[] x, int i){//toggles the switch

            x[i]=Math.abs(x[i]-1);
            for(int j=0;j<x.length;j++){
                System.out.print(x[j]);
            }
            System.out.println("");
            moves++;
        }
        public static boolean isNecessary(int[]x,int begin,int end){//checks if there are 1's remaining
            for(int i=begin;i<=end;i++){
                if (x[i]==1){
                    return true;
                }
            }
            return false;
        }
        public static int getI(int[]x,int begin,int end){ //gets the index of the 1st 1 in array
            for(int i=begin;i<=end;i++){
                if (x[i]==1){
                    return i;
                }
            }
            return 0;
        }
    }


