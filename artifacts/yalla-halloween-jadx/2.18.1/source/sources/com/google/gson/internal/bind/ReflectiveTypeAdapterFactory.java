package com.google.gson.internal.bind;

import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.Excluder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p386o0OOoo0O.o000O0;
import p386o0OOoo0O.o000OOo0;
import p386o0OOoo0O.o00O0;
import p386o0OOoo0O.o00O0O00;
import p387o0OOoo0o.o00O0O0O;
import p387o0OOoo0o.o00OO00O;
import p387o0OOoo0o.o0o0Oo;
import p388o0OOooO.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectiveTypeAdapterFactory implements o00O0O00 {
    private final o00OO00O constructorConstructor;
    private final Excluder excluder;
    private final o000O0 fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f19260OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Field f19261OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o00O0 f19262OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f19263OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ o000OOo0 f19264OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ o00000O0 f19265OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, boolean z, boolean z2, Field field, boolean z3, o00O0 o00o1, o000OOo0 o000ooo1, o00000O0 o00000o1, boolean z4) {
            super(str, z, z2);
            this.f19261OooO0Oo = field;
            this.f19263OooO0o0 = z3;
            this.f19262OooO0o = o00o1;
            this.f19264OooO0oO = o000ooo1;
            this.f19265OooO0oo = o00000o1;
            this.f19260OooO = z4;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final void OooO00o(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException {
            Object obj2 = this.f19262OooO0o.read(jsonReader);
            if (obj2 == null && this.f19260OooO) {
                return;
            }
            this.f19261OooO0Oo.set(obj, obj2);
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final void OooO0O0(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException {
            (this.f19263OooO0o0 ? this.f19262OooO0o : new OooO0o(this.f19264OooO0oO, this.f19262OooO0o, this.f19265OooO0oo.getType())).write(jsonWriter, this.f19261OooO0Oo.get(obj));
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO
        public final boolean OooO0OO(Object obj) throws IllegalAccessException, IOException {
            return this.f19267OooO0O0 && this.f19261OooO0Oo.get(obj) != obj;
        }
    }

    public static final class OooO0O0<T> extends o00O0<T> {
        private final Map<String, OooO0OO> boundFields;
        private final o0o0Oo<T> constructor;

        public OooO0O0(o0o0Oo<T> o0o0oo, Map<String, OooO0OO> map) {
            this.constructor = o0o0oo;
            this.boundFields = map;
        }

        @Override // p386o0OOoo0O.o00O0
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
                    if (oooO0OO == null || !oooO0OO.f19268OooO0OO) {
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

        @Override // p386o0OOoo0O.o00O0
        public void write(JsonWriter jsonWriter, T t) throws IOException {
            if (t == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginObject();
            try {
                for (OooO0OO oooO0OO : this.boundFields.values()) {
                    if (oooO0OO.OooO0OO(t)) {
                        jsonWriter.name(oooO0OO.f19266OooO00o);
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
        public final String f19266OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f19267OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f19268OooO0OO;

        public OooO0OO(String str, boolean z, boolean z2) {
            this.f19266OooO00o = str;
            this.f19267OooO0O0 = z;
            this.f19268OooO0OO = z2;
        }

        public abstract void OooO00o(JsonReader jsonReader, Object obj) throws IllegalAccessException, IOException;

        public abstract void OooO0O0(JsonWriter jsonWriter, Object obj) throws IllegalAccessException, IOException;

        public abstract boolean OooO0OO(Object obj) throws IllegalAccessException, IOException;
    }

    public ReflectiveTypeAdapterFactory(o00OO00O o00oo00o, o000O0 o000o0, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = o00oo00o;
        this.fieldNamingPolicy = o000o0;
        this.excluder = excluder;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private OooO0OO createBoundField(o000OOo0 o000ooo1, Field field, String str, o00000O0<?> o00000o1, boolean z, boolean z2) {
        Class<? super Object> rawType = o00000o1.getRawType();
        boolean z3 = (rawType instanceof Class) && rawType.isPrimitive();
        JsonAdapter jsonAdapter = (JsonAdapter) field.getAnnotation(JsonAdapter.class);
        o00O0<?> typeAdapter = jsonAdapter != null ? this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, o000ooo1, o00000o1, jsonAdapter) : null;
        return new OooO00o(str, z, z2, field, typeAdapter != null, typeAdapter == null ? o000ooo1.OooO0o0(o00000o1) : typeAdapter, o000ooo1, o00000o1, z3);
    }

    private Map<String, OooO0OO> getBoundFields(o000OOo0 o000ooo1, o00000O0<?> o00000o1, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = o00000o1.getType();
        o00000O0<?> o00000o2 = o00000o1;
        Class<?> rawType = cls;
        while (rawType != Object.class) {
            Field[] declaredFields = rawType.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean zExcludeField = this.excludeField(field, true);
                boolean zExcludeField2 = this.excludeField(field, z);
                if (zExcludeField || zExcludeField2) {
                    try {
                        field.setAccessible(true);
                        Type typeOooO0oo = o00O0O0O.OooO0oo(o00000o2.getType(), rawType, field.getGenericType());
                        List<String> fieldNames = this.getFieldNames(field);
                        int size = fieldNames.size();
                        OooO0OO oooO0OO = null;
                        int i2 = 0;
                        while (i2 < size) {
                            String str = fieldNames.get(i2);
                            boolean z2 = i2 != 0 ? false : zExcludeField;
                            int i3 = i2;
                            OooO0OO oooO0OO2 = oooO0OO;
                            int i4 = size;
                            List<String> list = fieldNames;
                            oooO0OO = oooO0OO2 == null ? (OooO0OO) linkedHashMap.put(str, createBoundField(o000ooo1, field, str, o00000O0.get(typeOooO0oo), z2, zExcludeField2)) : oooO0OO2;
                            i2 = i3 + 1;
                            zExcludeField = z2;
                            size = i4;
                            fieldNames = list;
                        }
                        OooO0OO oooO0OO3 = oooO0OO;
                        if (oooO0OO3 != null) {
                            throw new IllegalArgumentException(type + " declares multiple JSON fields named " + oooO0OO3.f19266OooO00o);
                        }
                    } catch (Exception e) {
                        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Failed making field '");
                        sbOooO0o0.append(field.getDeclaringClass().getName());
                        sbOooO0o0.append("#");
                        sbOooO0o0.append(field.getName());
                        sbOooO0o0.append("' accessible; either change its visibility or write a custom TypeAdapter for its declaring type");
                        throw new JsonIOException(sbOooO0o0.toString(), e);
                    }
                }
                i++;
                z = false;
                this = this;
            }
            o00000o2 = o00000O0.get(o00O0O0O.OooO0oo(o00000o2.getType(), rawType, rawType.getGenericSuperclass()));
            rawType = o00000o2.getRawType();
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

    @Override // p386o0OOoo0O.o00O0O00
    public <T> o00O0<T> create(o000OOo0 o000ooo1, o00000O0<T> o00000o1) {
        Class<? super T> rawType = o00000o1.getRawType();
        if (Object.class.isAssignableFrom(rawType)) {
            return new OooO0O0(this.constructorConstructor.OooO00o(o00000o1), getBoundFields(o000ooo1, o00000o1, rawType));
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
