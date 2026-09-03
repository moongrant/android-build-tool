package com.google.gson;

import com.google.gson.stream.JsonReader;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 {
    public static o000oOoO OooO00o(JsonReader jsonReader) throws JsonSyntaxException, JsonIOException {
        boolean zIsLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                o000oOoO o000ooooOooO00o = com.google.gson.internal.o0Oo0oo.OooO00o(jsonReader);
                jsonReader.setLenient(zIsLenient);
                return o000ooooOooO00o;
            } catch (OutOfMemoryError e) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new JsonParseException("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(zIsLenient);
            throw th;
        }
    }
}
