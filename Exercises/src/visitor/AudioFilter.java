package visitor;

public interface AudioFilter {
  void apply(FactSegment factSegment);
  void apply(FormatSegment formatSegment);
}
