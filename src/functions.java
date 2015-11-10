import java.util.ArrayList;

/**
 * Created by komp on 11/10/15.
 */
public class functions {
    enum filter{
        none,
        hanning,
        hamming
    }
    ArrayList<sin_function> funcs;
    public functions(){
        funcs = new ArrayList<sin_function>();
    }
    void AddFunction(sin_function f){
        funcs.add(f);
    }
    public double[] getSamples(double start,double frame,double freq){
        double[] samps = new double[(int)Math.round(frame*freq/1000)+1];
        for(int i=0;i<samps.length;i++){
            samps[i]=getY((start+i*frame/samps.length)/1000);
        }
        return samps;
    }
    public double getY(double x){
        double summ = 0;
        for(sin_function f:funcs) {
            summ+=f.getFunction(x);
        }
        return summ;
    }
    public double[] doDFT(double[] input){
        int n = input.length;
        double[] output = new double[n];
        for (int k= 0; k < n; k++) {
            double sumreal = 0;
            double sumimg = 0;
            double angle = -2.0*Math.PI*(double)k /n;
            for (int t = 0; t < n; t++) {
                sumreal += input[t] * Math.cos(angle*t)/n*2;
                sumimg += input[t] * Math.sin(angle*t)/n*2;
            }
            output[k] = Math.sqrt(Math.pow(sumreal,2) + Math.pow(sumimg,2));
        }
        return output;
    }
    public void doFilter(filter f,double input[]){
        int n = input.length;
        for(int i=0;i<n;i++){
            switch(f){
                case none:
                    break;
                case hanning:
                    input[i]*=(0.5*(1-Math.cos(Math.PI*(i+1)/n)));
                    break;
                case hamming:
                    input[i]*=(0.54-0.46*Math.cos(Math.PI*(i+1)/n));
                    break;
            }
        }
    }
}

