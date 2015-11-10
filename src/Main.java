import javax.swing.*;
import java.util.Scanner;

/**
 * Created by komp on 11/10/15.
 */
public class Main {
    public static void main(String[] args) {
        functions f = new functions();
        boolean running = true;
        functions.filter filt = functions.filter.none;
        Scanner in = new Scanner(System.in);
        while(running){
            String s = in.nextLine();
            if(s.startsWith("exit"))running = false;
            else if(s.startsWith("add")){
                //System.out.println(s);
                String params[] = s.substring(4).split(":");
                //System.out.println(params[0]+" - "+params[1]+" - "+params[2]);
                f.AddFunction(new sin_function(Double.parseDouble(params[0]),
                Double.parseDouble(params[1]),Double.parseDouble(params[2])));
            }else if(s.startsWith("makedft")){
                String params[] = s.substring(8).split(":");
                double[] tmp=f.doDFT(f.getSamples(Double.parseDouble(params[0]),
                Double.parseDouble(params[1]),Double.parseDouble(params[2])));
                f.doFilter(filt,tmp);
                new graphFrame(tmp);
            }else if(s.startsWith("function")){
                String func=s.substring(9);
                if(func.toLowerCase().equals("none")){
                    filt = functions.filter.none;
                }else if(func.toLowerCase().equals("hanning")){
                    filt = functions.filter.hanning;
                }else if(func.toLowerCase().equals("hamming")){
                    filt = functions.filter.hamming;
                }
            }else if(s.startsWith("reset")){
                f = new functions();
                filt = functions.filter.none;
            }
        }
    }
}
