package dev.xsenny.wbapi.api;

/**
 * Created by ysl3000
 */
@FunctionalInterface
public interface FunctionDoubleDoubleLong {
    void lerp(double oldSize, double newSize, long time);
}