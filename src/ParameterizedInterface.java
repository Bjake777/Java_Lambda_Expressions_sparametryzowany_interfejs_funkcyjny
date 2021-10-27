@FunctionalInterface
public interface ParameterizedInterface<T, V> {
    V checkIt(T value);
}
