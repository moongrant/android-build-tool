package com.google.gson.internal;

import com.google.gson.stream.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o00Ooo {
    public static o00Ooo INSTANCE;

    public abstract void promoteNameToValue(JsonReader jsonReader) throws IOException;
}
