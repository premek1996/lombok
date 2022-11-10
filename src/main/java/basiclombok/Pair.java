package basiclombok;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor(staticName = "of")
@ToString
public class Pair<S, T> {

    private final S first;
    private final T second;

}
