// s23017
// 温度を設定し、ゲッターを使って出力するプログラム

class Temper {
    private double temperature;
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class d52Q2kadai {
    public static void main(String[] args) {
        Temper t = new Temper();
        t.setTemperature(17.2);
        System.out.println(t.getTemperature());
    }
}
