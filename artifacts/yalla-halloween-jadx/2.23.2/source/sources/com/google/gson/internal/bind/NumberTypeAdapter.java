package com.google.gson.internal.bind;

import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.ToNumberPolicy;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberTypeAdapter extends o0OOO0o<Number> {
    private static final o0Oo0oo LAZILY_PARSED_NUMBER_FACTORY = newFactory(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    private final o0ooOOo toNumberStrategy;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20172OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20172OooO00o = iArr;
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20172OooO00o[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20172OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private NumberTypeAdapter(o0ooOOo o0ooooo) {
        this.toNumberStrategy = o0ooooo;
    }

    public static o0Oo0oo getFactory(o0ooOOo o0ooooo) {
        return o0ooooo == ToNumberPolicy.LAZILY_PARSED_NUMBER ? LAZILY_PARSED_NUMBER_FACTORY : newFactory(o0ooooo);
    }

    private static o0Oo0oo newFactory(o0ooOOo o0ooooo) {
        return new o0Oo0oo() { // from class: com.google.gson.internal.bind.NumberTypeAdapter.1
            @Override // com.google.gson.o0Oo0oo
            public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Number.class) {
                    return NumberTypeAdapter.this;
                }
                return null;
            }
        };
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.o0OOO0o
    public Number read(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int i = OooO00o.f20172OooO00o[jsonTokenPeek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return null;
        }
        if (i == 2 || i == 3) {
            return this.toNumberStrategy.OooO00o(jsonReader);
        }
        throw new JsonSyntaxException("Expecting number, got: " + jsonTokenPeek + "; at path " + jsonReader.getPath());
    }

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, Number number) throws IOException {
        jsonWriter.value(number);
    }
}
