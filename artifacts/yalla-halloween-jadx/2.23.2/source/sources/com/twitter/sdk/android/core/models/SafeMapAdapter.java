package com.twitter.sdk.android.core.models;

import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SafeMapAdapter implements o0Oo0oo {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> extends o0OOO0o<T> {
        final /* synthetic */ o0OOO0o val$delegate;
        final /* synthetic */ TypeToken val$tokenType;

        public OooO00o(o0OOO0o o0ooo0o2, TypeToken typeToken) {
            this.val$delegate = o0ooo0o2;
            this.val$tokenType = typeToken;
        }

        @Override // com.google.gson.o0OOO0o
        public T read(JsonReader jsonReader) throws IOException {
            T t = (T) this.val$delegate.read(jsonReader);
            if (Map.class.isAssignableFrom(this.val$tokenType.getRawType())) {
                return t == null ? (T) Collections.EMPTY_MAP : (T) Collections.unmodifiableMap((Map) t);
            }
            return t;
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            this.val$delegate.write(jsonWriter, t);
        }
    }

    @Override // com.google.gson.o0Oo0oo
    public <T> o0OOO0o<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        return new OooO00o(oooOOO0.OooO0o(this, typeToken), typeToken);
    }
}
