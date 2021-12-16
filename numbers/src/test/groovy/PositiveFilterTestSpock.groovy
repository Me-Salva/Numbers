import com.aor.numbers.ListSorter
import com.aor.numbers.PositiveFilter
import spock.lang.Specification

class PositiveFilterTestSpock extends Specification {
    private def list
    private def expected

    def setup() {
        list = Arrays.asList(3, 2, 6, 1, 4, 5, 7)
        expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7)
    }

    def 'Testing: accept'() {
        given:
        def positives = Arrays.asList(1, 2, 3, 4, 5, 10, 100, 1000, Integer.MAX_VALUE)
        def notPositives = Arrays.asList(0, -1, -2, -3, -4, -5, -10, -1000, -10000, Integer.MIN_VALUE)

        when:
        def filter = new PositiveFilter()

        then:
        positives.every {it ->  filter.accept(it) }

        notPositives.every {it -> !filter.accept(it) }
    }
}