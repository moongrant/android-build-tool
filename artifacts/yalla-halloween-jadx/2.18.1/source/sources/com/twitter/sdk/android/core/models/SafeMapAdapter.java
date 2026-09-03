package com.twitter.sdk.android.core.models;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public class SafeMapAdapter implements o00O0O00 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    public class OooO00o<T> extends o00O0<T> {
        public final /* synthetic */ o00O0 val$delegate;
        public final /* synthetic */ o00000O0 val$tokenType;

        public OooO00o(o00O0 o00o1, o00000O0 o00000o1) {
            this.val$delegate = o00o1;
            this.val$tokenType = o00000o1;
        }

        @Override // p386o0OOoo0O.o00O0
        public T read(JsonReader jsonReader) throws IOException {
            T t = (T) this.val$delegate.read(jsonReader);
            if (Map.class.isAssignableFrom(this.val$tokenType.getRawType())) {
                return t == null ? (T) Collections.EMPTY_MAP : (T) Collections.unmodifiableMap((Map) t);
            }
            return t;
        }

        @Override // p386o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            this.val$delegate.write(jsonWriter, t);
        }
    }

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        return new OooO00o(o000ooo1.OooO0o(this, o00000o1), o00000o1);
    }
}
