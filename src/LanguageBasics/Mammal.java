package LanguageBasics;

// Final Methods
public abstract class Mammal {
// Final Method Syntax:
// <access modifier> final <return type> <function name>(<args>)

    // Final methods, like, final classes cannot be overridden by a child
// class, and are therefore the final implementation of the method.
    public final boolean isWarmBlooded() {
        return true;
    }
}
