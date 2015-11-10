/**
 * Created by komp on 11/10/15.
 */
public class sin_function {
    double amplitude;
    double freq;
    double offset;
    public sin_function(double a,double f,double off){
        amplitude = a;
        freq = f;
        offset = off;
    }
    public double getFunction(double x) {
        return amplitude * Math.sin(Math.PI * x * freq * 2);
    }
}
