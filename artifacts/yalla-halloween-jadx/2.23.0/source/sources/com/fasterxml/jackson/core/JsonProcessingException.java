package com.fasterxml.jackson.core;

/* JADX INFO: loaded from: classes3.dex */
public class JsonProcessingException extends JacksonException {
    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        return message == null ? "N/A" : message;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
