package visitor;

public class ReverbFilter implements AudioFilter {
  @Override
  public void apply(FactSegment factSegment) {
    System.out.println("Reverb reduction on fact segment");
  }

  @Override
  public void apply(FormatSegment formatSegment) {
    System.out.println("Reverb reduction on format segment");
  }
}
