package com.twitter.sdk.android.core.models;

import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SafeListAdapter implements o0OOO0o {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> extends o0ooOOo<T> {
        final /* synthetic */ o0ooOOo val$delegate;
        final /* synthetic */ TypeToken val$tokenType;

        public OooO00o(o0ooOOo o0ooooo, TypeToken typeToken) {
            this.val$delegate = o0ooooo;
            this.val$tokenType = typeToken;
        }

        @Override // com.google.gson.o0ooOOo
        public T read(JsonReader jsonReader) throws IOException {
            T t = (T) this.val$delegate.read(jsonReader);
            if (List.class.isAssignableFrom(this.val$tokenType.getRawType())) {
                return t == null ? (T) Collections.EMPTY_LIST : (T) Collections.unmodifiableList((List) t);
            }
            return t;
        }

        @Override // com.google.gson.o0ooOOo
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            this.val$delegate.write(jsonWriter, t);
        }
    }

    @Override // com.google.gson.o0OOO0o
    public <T> o0ooOOo<T> create(com.google.gson.OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        return new OooO00o(oooOOO0.OooO0o(this, typeToken), typeToken);
    }
}
