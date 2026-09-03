package com.google.gson.internal.bind;

import com.google.gson.ToNumberPolicy;
import com.google.gson.internal.LinkedTreeMap;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p386o0OOoo0O.oo00o;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class ObjectTypeAdapter extends o00O0<Object> {
    private static final o00O0O00 DOUBLE_FACTORY = newFactory(ToNumberPolicy.DOUBLE);
    private final o000OOo0 gson;
    private final oo00o toNumberStrategy;

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f19246OooO00o;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f19246OooO00o = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19246OooO00o[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19246OooO00o[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19246OooO00o[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19246OooO00o[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19246OooO00o[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static o00O0O00 getFactory(oo00o oo00oVar) {
        return oo00oVar == ToNumberPolicy.DOUBLE ? DOUBLE_FACTORY : newFactory(oo00oVar);
    }

    private static o00O0O00 newFactory(final oo00o oo00oVar) {
        return new o00O0O00() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
            @Override // p386o0OOoo0O.o00O0O00
            public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
                if (o00000o1.getRawType() == Object.class) {
                    return new ObjectTypeAdapter(o000ooo1, oo00oVar);
                }
                return null;
            }
        };
    }

    @Override // p386o0OOoo0O.o00O0
    public Object read(JsonReader jsonReader) throws IOException {
        switch (OooO00o.f19246OooO00o[jsonReader.peek().ordinal()]) {
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

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        o000OOo0 o000ooo1 = this.gson;
        Class<?> cls = obj.getClass();
        Objects.requireNonNull(o000ooo1);
        o00O0 o00o0OooO0o0 = o000ooo1.OooO0o0(o00000O0.get((Class) cls));
        if (!(o00o0OooO0o0 instanceof ObjectTypeAdapter)) {
            o00o0OooO0o0.write(jsonWriter, obj);
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    private ObjectTypeAdapter(o000OOo0 o000ooo1, oo00o oo00oVar) {
        this.gson = o000ooo1;
        this.toNumberStrategy = oo00oVar;
    }
}
