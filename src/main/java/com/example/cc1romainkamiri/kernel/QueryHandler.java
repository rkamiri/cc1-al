package com.example.cc1romainkamiri.kernel;

@FunctionalInterface
public interface QueryHandler<Q extends Query, R> {
    R handle(Q query);
}
