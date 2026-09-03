package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.ToNumberPolicy;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p386o0OOoo0O.oo00o;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberTypeAdapter extends o00O0<Number> {
    private static final o00O0O00 LAZILY_PARSED_NUMBER_FACTORY = newFactory(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final oo00o toNumberStrategy;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19245OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f19245OooO00o = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19245OooO00o[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19245OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(oo00o oo00oVar) {
        this.toNumberStrategy = oo00oVar;
    }

    public static o00O0O00 getFactory(oo00o oo00oVar) {
        return oo00oVar == ToNumberPolicy.LAZILY_PARSED_NUMBER ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(oo00oVar);
    }

    private static o00O0O00 newFactory(oo00o oo00oVar) {
        return new o00O0O00() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // p386o0OOoo0O.o00O0O00
            public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
                if (o00000o1.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // p386o0OOoo0O.o00O0
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = OooO00o.f19245OooO00o[jsonTokenPeek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.toNumberStrategy.OooO00o(jsonReader);
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
