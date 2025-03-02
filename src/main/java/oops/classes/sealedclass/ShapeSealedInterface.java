package oops.classes.sealedclass;

public sealed interface ShapeSealedInterface permits Pentagon, Hexagon, Heptagon {
}

final class Pentagon implements ShapeSealedInterface {

}

non-sealed class Hexagon implements ShapeSealedInterface {

}

sealed class Heptagon implements ShapeSealedInterface permits Octagon {

}

final class Octagon extends Heptagon {

}