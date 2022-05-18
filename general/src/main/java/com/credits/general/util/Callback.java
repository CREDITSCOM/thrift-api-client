package com.credits.general.util;

import com.credits.general.exception.CreditsException;

import java.util.function.BiConsumer;

public interface Callback<T> {
    void onSuccess(T resultData) throws CreditsException;

    void onError(Throwable e);

    static <R> BiConsumer<R, Throwable> handleCallback(Callback<R> callback) {
        return (result, error) -> {
            if (error == null) {
                callback.onSuccess(result);
            } else {
                callback.onError(error);
            }
        };
    }
}
