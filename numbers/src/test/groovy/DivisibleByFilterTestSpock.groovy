import com.aor.numbers.DivisibleByFilter
import spock.lang.Specification

class DivisibleByFilterTestSpock extends Specification {

    def 'accept divide by 2'() {
        given:
        def filter = new DivisibleByFilter(2)
        when:
        def divisible = Arrays.asList(0, 2, 4, 8, 10, 250, 1000, 10000)
        def notDivisible = Arrays.asList(1, 3, 5, 7, 9, 25, 455, 1001, 10001)

        then:
        divisible.every {it -> filter.accept(it) }
        notDivisible.every {it -> !filter.accept(it) }
    }

    def 'accept divide by 3'() {
        given:
        def filter = new DivisibleByFilter(3)
        when:
        def divisible = Arrays.asList(0, 3, 6, 9, 12, 15, 66, 111, 999, 9999)
        def notDivisible = Arrays.asList(1, 2, 4, 5, 10, 100, 1000, 10000)

        then:
        divisible.every {it -> filter.accept(it) }
        notDivisible.every {it -> !filter.accept(it) }
    }

    def 'accept divide by 5'() {
        given:
        def filter = new DivisibleByFilter(5)
        when:
        def divisible = Arrays.asList(0, 5, 10, 15, 20, 25, 175, 600, 1000)
        def notDivisible = Arrays.asList(1, 2, 4, 7, 9, 33, 113, 551, 999)

        then:
        divisible.every {it -> filter.accept(it) }
        notDivisible.every {it -> !filter.accept(it) }
    }
}