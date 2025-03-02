package oops.classes.sealedclass;

/*
 * Sealed classes are a part of the Java language that allow for more controlled inheritance
 *
 * Using sealed classes, you can define which classes are allowed to extend a particular class or implement an interface
 *
 * Sealed classed are introduced in Java 15 as a preview feature and finalized in Java 17
 *
 * subclasses that are allowed to extend or implement must be specified using "permits" keyword
 *
 * All defined subclasses of a sealed class must extend the sealed class and must be either sealed or final or non-sealed
 * "non-sealed" modifier for subclass is allowed only if it is extending another sealed class
 */

/*
 * Apart from specifying which classes can extend or implement them using permits clause,
 * sealed, non-sealed classes behave as normal standard classes and the final class behaves as a normal final class
 */

/*
 * sealed class ShapeSealedClass is allowing classes Circle, Triangle, Square
 *
 * Hence, the allowed classed must extend the sealed class ShapeSealedClass
 *
 * The subclasses can be either final or non-sealed or sealed
 */
public sealed class ShapeSealedClass permits Circle, Triangle, Square {

}

/*
 * This is a final subclass extending a sealed class
 */
final class Circle extends ShapeSealedClass {

}

/*
 * This is a non-sealed subclass extending a sealed class
 *
 * "non-sealed" modifier is only allowed if its parent class is a sealed class and the parent class is
 * not extending another sealed class
 */
non-sealed class Square extends ShapeSealedClass {

}

/*
 * This is a sealed subclass extending a parent sealed class
 *
 * Since the subclass is also sealed, it must define allowed subclasses
 */
sealed class Triangle extends ShapeSealedClass permits Rectangle {

}

/*
 * This is a final subclass that is extending another sealed subclass i.e.
 * only final and non-sealed modifiers are allowed
 */
final class Rectangle extends Triangle {

}