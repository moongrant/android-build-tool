package androidx.work;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.TypeConverter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p102o000oo.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f9741OooO0O0 = o0OoOo0.OooO0o0("Data");

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f9742OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Map<String, Object> f9743OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Map<String, Object> f9744OooO00o = new HashMap();

        @NonNull
        public final OooO0O0 OooO00o() throws Throwable {
            OooO0O0 oooO0O0 = new OooO0O0((Map<String, ?>) this.f9744OooO00o);
            OooO0O0.OooO0O0(oooO0O0);
            return oooO0O0;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @NonNull
        public final OooO00o OooO0O0(@NonNull Map<String, Object> map) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    this.f9744OooO00o.put(key, null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.f9744OooO00o.put(key, value);
                    } else {
                        int i = 0;
                        if (cls == boolean[].class) {
                            Map<String, Object> map2 = this.f9744OooO00o;
                            boolean[] zArr = (boolean[]) value;
                            String str = OooO0O0.f9741OooO0O0;
                            Boolean[] boolArr = new Boolean[zArr.length];
                            while (i < zArr.length) {
                                boolArr[i] = Boolean.valueOf(zArr[i]);
                                i++;
                            }
                            map2.put(key, boolArr);
                        } else if (cls == byte[].class) {
                            Map<String, Object> map3 = this.f9744OooO00o;
                            byte[] bArr = (byte[]) value;
                            String str2 = OooO0O0.f9741OooO0O0;
                            Byte[] bArr2 = new Byte[bArr.length];
                            while (i < bArr.length) {
                                bArr2[i] = Byte.valueOf(bArr[i]);
                                i++;
                            }
                            map3.put(key, bArr2);
                        } else if (cls == int[].class) {
                            Map<String, Object> map4 = this.f9744OooO00o;
                            int[] iArr = (int[]) value;
                            String str3 = OooO0O0.f9741OooO0O0;
                            Integer[] numArr = new Integer[iArr.length];
                            while (i < iArr.length) {
                                numArr[i] = Integer.valueOf(iArr[i]);
                                i++;
                            }
                            map4.put(key, numArr);
                        } else if (cls == long[].class) {
                            Map<String, Object> map5 = this.f9744OooO00o;
                            long[] jArr = (long[]) value;
                            String str4 = OooO0O0.f9741OooO0O0;
                            Long[] lArr = new Long[jArr.length];
                            while (i < jArr.length) {
                                lArr[i] = Long.valueOf(jArr[i]);
                                i++;
                            }
                            map5.put(key, lArr);
                        } else if (cls == float[].class) {
                            Map<String, Object> map6 = this.f9744OooO00o;
                            float[] fArr = (float[]) value;
                            String str5 = OooO0O0.f9741OooO0O0;
                            Float[] fArr2 = new Float[fArr.length];
                            while (i < fArr.length) {
                                fArr2[i] = Float.valueOf(fArr[i]);
                                i++;
                            }
                            map6.put(key, fArr2);
                        } else {
                            if (cls != double[].class) {
                                throw new IllegalArgumentException(String.format("Key %s has invalid type %s", key, cls));
                            }
                            Map<String, Object> map7 = this.f9744OooO00o;
                            double[] dArr = (double[]) value;
                            String str6 = OooO0O0.f9741OooO0O0;
                            Double[] dArr2 = new Double[dArr.length];
                            while (i < dArr.length) {
                                dArr2[i] = Double.valueOf(dArr[i]);
                                i++;
                            }
                            map7.put(key, dArr2);
                        }
                    }
                }
            }
            return this;
        }
    }

    static {
        OooO0O0 oooO0O0 = new OooO0O0(new HashMap());
        OooO0O0(oooO0O0);
        f9742OooO0OO = oooO0O0;
    }

    public OooO0O0() {
    }

    /* JADX WARN: Code duplicated, block: B:54:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x006b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    @TypeConverter
    public static OooO0O0 OooO00o(@NonNull byte[] bArr) throws Throwable {
        Throwable th;
        ObjectInputStream objectInputStream;
        Throwable e;
        if (bArr.length > 10240) {
            throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
        }
        HashMap map = new HashMap();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ObjectInputStream objectInputStream2 = null;
        try {
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        for (int i = objectInputStream.readInt(); i > 0; i--) {
                            map.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e2) {
                            Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e2);
                        }
                        byteArrayInputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e4) {
                                Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e4);
                            }
                        }
                        byteArrayInputStream.close();
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e);
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        byteArrayInputStream.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (0 != 0) {
                        try {
                            objectInputStream2.close();
                        } catch (IOException e6) {
                            Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayInputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (IOException e8) {
                e = e8;
                Throwable th3 = e;
                objectInputStream = null;
                e = th3;
                Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new OooO0O0(map);
            } catch (ClassNotFoundException e9) {
                e = e9;
                Throwable th4 = e;
                objectInputStream = null;
                e = th4;
                Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e);
                if (objectInputStream != null) {
                    objectInputStream.close();
                }
                byteArrayInputStream.close();
                return new OooO0O0(map);
            } catch (Throwable th5) {
                th = th5;
                if (0 != 0) {
                    objectInputStream2.close();
                }
                byteArrayInputStream.close();
                throw th;
            }
        } catch (IOException e10) {
            Log.e(f9741OooO0O0, "Error in Data#fromByteArray: ", e10);
        }
        return new OooO0O0(map);
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @NonNull
    @TypeConverter
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static byte[] OooO0O0(@NonNull OooO0O0 oooO0O0) throws Throwable {
        ObjectOutputStream objectOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream2 = null;
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeInt(oooO0O0.f9743OooO00o.size());
                    for (Map.Entry entry : oooO0O0.f9743OooO00o.entrySet()) {
                        objectOutputStream.writeUTF((String) entry.getKey());
                        objectOutputStream.writeObject(entry.getValue());
                    }
                    try {
                        objectOutputStream.close();
                    } catch (IOException e) {
                        Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e);
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e2) {
                        Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e2);
                    }
                    if (byteArrayOutputStream.size() <= 10240) {
                        return byteArrayOutputStream.toByteArray();
                    }
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                } catch (IOException e3) {
                    e = e3;
                    objectOutputStream2 = objectOutputStream;
                    Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (objectOutputStream2 != null) {
                        try {
                            objectOutputStream2.close();
                        } catch (IOException e4) {
                            Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e4);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e5) {
                        Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e5);
                    }
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (IOException e6) {
                            Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e6);
                        }
                    }
                    try {
                        byteArrayOutputStream.close();
                        throw th;
                    } catch (IOException e7) {
                        Log.e(f9741OooO0O0, "Error in Data#toByteArray: ", e7);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
            }
        } catch (IOException e8) {
            e = e8;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO0O0.class != obj.getClass()) {
            return false;
        }
        OooO0O0 oooO0O0 = (OooO0O0) obj;
        Set<String> setKeySet = this.f9743OooO00o.keySet();
        if (!setKeySet.equals(oooO0O0.f9743OooO00o.keySet())) {
            return false;
        }
        for (String str : setKeySet) {
            Object obj2 = this.f9743OooO00o.get(str);
            Object obj3 = oooO0O0.f9743OooO00o.get(str);
            if (!((obj2 == null || obj3 == null) ? obj2 == obj3 : ((obj2 instanceof Object[]) && (obj3 instanceof Object[])) ? Arrays.deepEquals((Object[]) obj2, (Object[]) obj3) : obj2.equals(obj3))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f9743OooO00o.hashCode() * 31;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Object>] */
    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f9743OooO00o.isEmpty()) {
            for (String str : this.f9743OooO00o.keySet()) {
                sb.append(str);
                sb.append(" : ");
                Object obj = this.f9743OooO00o.get(str);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public OooO0O0(@NonNull OooO0O0 oooO0O0) {
        this.f9743OooO00o = new HashMap(oooO0O0.f9743OooO00o);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooO0O0(@NonNull Map<String, ?> map) {
        this.f9743OooO00o = new HashMap(map);
    }
}
