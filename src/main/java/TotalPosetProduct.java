import java.util.Collections;
import java.util.List;

/**
 * Created by mtumilowicz on 2018-12-20.
 */
class TotalPosetProduct<T extends Comparable<T>> {
    final T min;

    TotalPosetProduct(T left, T right) {
        this.min = Collections.min(List.of(left, right));
    }
}
