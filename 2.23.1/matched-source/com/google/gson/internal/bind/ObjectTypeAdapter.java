package com.google.gson.internal.bind;

import com.google.gson.OooOOO0;
import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0ooOOo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ObjectTypeAdapter extends o0OOO0o<Object> {
    private static final o0Oo0oo DOUBLE_FACTORY = newFactory(ToNumberPolicy.DOUBLE);
    private final OooOOO0 gson;
    private final o0ooOOo toNumberStrategy;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f20178OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20178OooO00o = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20178OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20178OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20178OooO00o[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20178OooO00o[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20178OooO00o[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static o0Oo0oo getFactory(o0ooOOo o0ooooo) {
        return o0ooooo == ToNumberPolicy.DOUBLE ? DOUBLE_FACTORY : newFactory(o0ooooo);
    }

    private static o0Oo0oo newFactory(final o0ooOOo o0ooooo) {
        return new o0Oo0oo() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // com.google.gson.o0Oo0oo
            public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
                if (typeToken.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(oooOOO0, o0ooooo);
                }
                return null;
            }
        };
    }

    @Override // com.google.gson.o0OOO0o
    public Object read(JsonReader jsonReader) throws IOException {
        switch (OooO00o.f20178OooO00o[jsonReader.peek().ordinal()]) {
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

    @Override // com.google.gson.o0OOO0o
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        OooOOO0 oooOOO0 = this.gson;
        Class<?> cls = obj.getClass();
        oooOOO0.getClass();
        o0OOO0o o0ooo0oOooO0o0 = oooOOO0.OooO0o0(TypeToken.get((Class) cls));
        if (!(o0ooo0oOooO0o0 instanceof ObjectTypeAdapter)) {
            o0ooo0oOooO0o0.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(OooOOO0 oooOOO0, o0ooOOo o0ooooo) {
        this.gson = oooOOO0;
        this.toNumberStrategy = o0ooooo;
    }
}
