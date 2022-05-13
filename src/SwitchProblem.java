public class SwitchProblem {
    static int noOfMoves=0;

    public static void switchOff(int[]x,int i){
      if(i==x.length-1){
          turn(x, i);
          noOfMoves++;
      }
      else if (x[i]==0&&i<x.length-1){
          switchOff(x,i+1);
      }
      else if (isCapable(x,i)){
          turn(x,i);
          switchOff(x,i+1);
          noOfMoves++;
      }
      else if(x[i+1]==1){
          switchOff(x, i+2);
          switchOff(x,i);
          switchOff(x,i+1);
      }
      else if (x[i+1]==0&&isCapable(x,i+1)){
          turn(x,i+1);
          switchOff(x,i);
          noOfMoves++;
      }
      else{
          switchOff(x,i+2);
          turn(x,i+1);
          switchOff(x, i);
          noOfMoves++;
      }

      if(x[x.length-1]==1){
          turn(x,x.length-1);
          noOfMoves++;
      }
    }
    public static void turn(int[] x, int i){
        if (x[i]==1){
            x[i]=0;
        }
        else{
            x[i]=1;
        }
    }

    public static boolean isCapable(int[] x, int i){
        if(i==x.length-1){
            return true;
        }
        else if(x[i+1]==1){
            for (int j=i+2;j<x.length;j++){
                if (x[j]==1){
                    return false;
                }
            }
        }else{
            return false;
        }
       return true;
    }

}