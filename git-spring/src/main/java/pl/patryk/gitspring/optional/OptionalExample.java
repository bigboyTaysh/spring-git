package pl.patryk.gitspring.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> maybeNick = findNick();

        if (maybeNick.isPresent()) {
            System.out.println(maybeNick.get());
        }

        //nowy sposob lambda
        maybeNick.ifPresent(
                nick -> System.out.println("mam nick" + nick)
        );
    }

    private static Optional<String> findNick() {
        return Optional.empty();
    }


}