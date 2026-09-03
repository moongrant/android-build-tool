package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.OooOOO0;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.OooOo00;
import com.google.gson.internal.o00oO0o;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ReflectiveTypeAdapterFactory implements o0Oo0oo {
    private final OooOo00 constructorConstructor;
    private final Excluder excluder;
    private final com.google.gson.OooO0O0 fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f20187OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Field f20188OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o f20189OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f20190OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooOOO0 f20191OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ TypeToken f20192OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, boolean z, boolean z2, Field field, boolean z3, o0OOO0o o0ooo0o2, OooOOO0 oooOOO0, TypeToken typeToken, boolean z4) {
            super(str, z, z2);
            this.f20188OooO0Oo = field;
            this.f20190OooO0o0 = z3;
            this.f20189OooO0o = o0ooo0o2;
            this.f20191OooO0oO = oooOOO0;
            this.f20192OooO0oo = typeToken;
            this.f20187OooO = z4;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final void OooO00o(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f20189OooO0o.read(jsonReader);
            if (obj2 == null && this.f20187OooO) {
                return;
            }
            this.f20188OooO0Oo.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final void OooO0O0(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f20188OooO0Oo.get(obj);
            boolean z = this.f20190OooO0o0;
            o0OOO0o oooO0o = this.f20189OooO0o;
            if (!z) {
                oooO0o = new OooO0o(this.f20191OooO0oO, oooO0o, this.f20192OooO0oo.getType());
            }
            oooO0o.write(jsonWriter, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final boolean OooO0OO(Object obj) throws IllegalAccessException, IOException {
            return this.f20194OooO0O0 && this.f20188OooO0Oo.get(obj) != obj;
        }
    }

    public static final class OooO0O0<T> extends o0OOO0o<T> {
        private final Map<String, OooO0OO> boundFields;
        private final o00oO0o<T> constructor;

        public OooO0O0(o00oO0o<T> o00oo0o2, Map<String, OooO0OO> map) {
            this.constructor = o00oo0o2;
            this.boundFields = map;
        }

        @Override // com.google.gson.o0OOO0o
        public T read(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            T tOooO00o = this.constructor.OooO00o();
            try {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    OooO0OO oooO0OO = this.boundFields.get(jsonReader.nextName());
                    if (oooO0OO == null || !oooO0OO.f20195OooO0OO) {
                        jsonReader.skipValue();
                    } else {
                        oooO0OO.OooO00o(jsonReader, tOooO00o);
                    }
                }
                jsonReader.endObject();
                return tOooO00o;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new JsonSyntaxException(e2);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (OooO0OO oooO0OO : this.boundFields.values()) {
                    if (oooO0OO.OooO0OO(t)) {
                        jsonWriter.name(oooO0OO.f20193OooO00o);
                        oooO0OO.OooO0O0(jsonWriter, t);
                    }
                }
                jsonWriter.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static abstract class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f20193OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f20194OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f20195OooO0OO;

        public OooO0OO(String str, boolean z, boolean z2) {
            this.f20193OooO00o = str;
            this.f20194OooO0O0 = z;
            this.f20195OooO0OO = z2;
        }

        public abstract void OooO00o(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void OooO0O0(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean OooO0OO(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(OooOo00 oooOo00, com.google.gson.OooO0O0 oooO0O0, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = oooOo00;
        this.fieldNamingPolicy = oooO0O0;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private OooO0OO createBoundField(OooOOO0 oooOOO0, Field field, String str, TypeToken<?> typeToken, boolean z, boolean z2) {
        Class<? super Object> rawType = typeToken.getRawType();
        boolean z3 = (rawType instanceof Class) && rawType.isPrimitive();
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        o0OOO0o<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, oooOOO0, typeToken, jsonAdapter) : null;
        boolean z4 = typeAdapter != null;
        if (typeAdapter == null) {
            typeAdapter = oooOOO0.OooO0o0(typeToken);
        }
        return new OooO00o(str, z, z2, field, z4, typeAdapter, oooOOO0, typeToken, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    private Map<String, OooO0OO> getBoundFields(OooOOO0 oooOOO0, TypeToken<?> typeToken, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = typeToken.getType();
        TypeToken<?> typeToken2 = typeToken;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean zExcludeField = excludeField(field, true);
                boolean zExcludeField2 = excludeField(field, z);
                if (zExcludeField || zExcludeField2) {
                    try {
                        field.setAccessible(true);
                        Type typeOooO0oo = com.google.gson.internal.OooO0O0.OooO0oo(typeToken2.getType(), rawType, field.getGenericType(), new HashMap());
                        List<String> fieldNames = getFieldNames(field);
                        int size = fieldNames.size();
                        OooO0OO oooO0OO = null;
                        ?? r3 = z;
                        while (r3 < size) {
                            String str = fieldNames.get(r3);
                            boolean z2 = r3 != 0 ? z : zExcludeField;
                            ?? r20 = r3;
                            OooO0OO oooO0OO2 = oooO0OO;
                            int i2 = size;
                            List<String> list = fieldNames;
                            Field field2 = field;
                            oooO0OO = oooO0OO2 == null ? (OooO0OO) linkedHashMap.put(str, createBoundField(oooOOO0, field, str, TypeToken.get(typeOooO0oo), z2, zExcludeField2)) : oooO0OO2;
                            zExcludeField = z2;
                            fieldNames = list;
                            size = i2;
                            field = field2;
                            z = false;
                            r3 = (r20 == true ? 1 : 0) + 1;
                        }
                        OooO0OO oooO0OO3 = oooO0OO;
                        if (oooO0OO3 != null) {
                            throw new IllegalArgumentException(type + " declares multiple JSON fields named " + oooO0OO3.f20193OooO00o);
                        }
                    } catch (Exception e) {
                        throw new JsonIOException("Failed making field '" + field.getDeclaringClass().getName() + "#" + field.getName() + "' accessible; either change its visibility or write a custom TypeAdapter for its declaring type", e);
                    }
                }
                i++;
                z = false;
            }
            typeToken2 = TypeToken.get(com.google.gson.internal.OooO0O0.OooO0oo(typeToken2.getType(), rawType, rawType.getGenericSuperclass(), new HashMap()));
            rawType = typeToken2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        SerializedName serializedName = (SerializedName) field.getAnnotation(SerializedName.class);
        if (serializedName == null) {
            return Collections.singletonList(this.fieldNamingPolicy.OooO00o(field));
        }
        String strValue = serializedName.value();
        String[] strArrAlternate = serializedName.alternate();
        if (strArrAlternate.length == 0) {
            return Collections.singletonList(strValue);
        }
        ArrayList arrayList = new ArrayList(strArrAlternate.length + 1);
        arrayList.add(strValue);
        for (String str : strArrAlternate) {
            arrayList.add(str);
        }
        return arrayList;
    }

    @Override // com.google.gson.o0Oo0oo
    public <T> o0OOO0o<T> create(OooOOO0 oooOOO0, TypeToken<T> typeToken) {
        Class<? super T> rawType = typeToken.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new OooO0O0(this.constructorConstructor.OooO00o(typeToken), getBoundFields(oooOOO0, typeToken, rawType));
        }
        return null;
    }

    public boolean excludeField(Field field, boolean z) {
        return excludeField(field, z, this.excluder);
    }

    public static boolean excludeField(Field field, boolean z, Excluder excluder) {
        return (excluder.excludeClass(field.getType(), z) || excluder.excludeField(field, z)) ? false : true;
    }
}
