package visitor;

public class Main {
  public static void main(String[] args) {
    var wavFile = WavFile.read("myfile.wav");
    wavFile.applyFilter(new NoiseReproductionFilter());
    wavFile.applyFilter(new ReverbFilter());
    wavFile.applyFilter(new NormalizeFilter());
  }
}
