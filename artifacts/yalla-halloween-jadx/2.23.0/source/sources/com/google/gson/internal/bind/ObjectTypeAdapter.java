package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectTypeAdapter extends o0ooOOo<Object> {
    private static final o0OOO0o DOUBLE_FACTORY = newFactory(ToNumberPolicy.DOUBLE);
    private final OooOOO0 gson;
    private final o00oO0o toNumberStrategy;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20646OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20646OooO00o = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20646OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20646OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20646OooO00o[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20646OooO00o[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20646OooO00o[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static o0OOO0o getFactory(o00oO0o o00oo0o2) {
        return o00oo0o2 == ToNumberPolicy.DOUBLE ? DOUBLE_FACTORY : newFactory(o00oo0o2);
    }

    private static o0OOO0o newFactory(final o00oO0o o00oo0o2) {
        return new o0OOO0o() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.o0OOO0o
            public <T> o0ooOOo<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(oooOOO0, o00oo0o2);
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.o0ooOOo
    public Object read(JsonReader jsonReader) throws IOException {
        switch (OooO00o.f20646OooO00o[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(read(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                LinkedTreeMap linkedTreeMap = new LinkedTreeMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    linkedTreeMap.put(jsonReader.nextName(), read(jsonReader));
                }
                jsonReader.endObject();
                return linkedTreeMap;
            case 3:
                return jsonReader.nextString();
            case 4:
                return this.toNumberStrategy.OooO00o(jsonReader);
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.o0ooOOo
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OooOOO0 oooOOO0 = this.gson;
        Class<?> cls = obj.getClass();
        oooOOO0.getClass();
        o0ooOOo o0oooooOooO0o0 = oooOOO0.OooO0o0(TypeToken.get((Class) cls));
        if (!(o0oooooOooO0o0 instanceof ObjectTypeAdapter)) {
            o0oooooOooO0o0.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(OooOOO0 oooOOO0, o00oO0o o00oo0o2) {
        this.gson = oooOOO0;
        this.toNumberStrategy = o00oo0o2;
    }
}
