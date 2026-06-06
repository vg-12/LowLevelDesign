package designPatterns.prototype;

public interface Prototype<T> {

//    return type can be student or it's children hence generic
    T clone();
}
