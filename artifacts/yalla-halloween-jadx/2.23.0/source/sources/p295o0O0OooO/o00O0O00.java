package p295o0O0OooO;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p294o0O0Ooo0.o0000O;
import p294o0O0Ooo0.o0000O0;
import p294o0O0Ooo0.o0000O0O;
import p294o0O0Ooo0.o0000OO0;
import p294o0O0Ooo0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0O00 implements o000OO, o0000OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f42319OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JsonWriter f42320OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, o0000O0O<?>> f42321OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Class<?>, o0000O<?>> f42322OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f42323OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O0O<Object> f42324OooO0o0;

    public o00O0O00(@NonNull Writer writer, @NonNull HashMap map, @NonNull HashMap map2, oOO00O ooo00o, boolean z) {
        this.f42320OooO0O0 = new JsonWriter(writer);
        this.f42321OooO0OO = map;
        this.f42322OooO0Oo = map2;
        this.f42324OooO0o0 = ooo00o;
        this.f42323OooO0o = z;
    }

    public final void OooO() throws IOException {
        if (!this.f42319OooO00o) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // p294o0O0Ooo0.o000OO
    @NonNull
    public final o000OO OooO00o(@NonNull o0000O0 o0000o1, @Nullable Object obj) throws IOException {
        return OooO0oo(obj, o0000o1.f42308OooO00o);
    }

    @Override // p294o0O0Ooo0.o0000OO0
    @NonNull
    public final o0000OO0 OooO0O0(@Nullable String str) throws IOException {
        OooO();
        this.f42320OooO0O0.value(str);
        return this;
    }

    @Override // p294o0O0Ooo0.o000OO
    @NonNull
    public final o000OO OooO0OO(@NonNull o0000O0 o0000o1, boolean z) throws IOException {
        String str = o0000o1.f42308OooO00o;
        OooO();
        JsonWriter jsonWriter = this.f42320OooO0O0;
        jsonWriter.name(str);
        OooO();
        jsonWriter.value(z);
        return this;
    }

    @Override // p294o0O0Ooo0.o0000OO0
    @NonNull
    public final o0000OO0 OooO0Oo(boolean z) throws IOException {
        OooO();
        this.f42320OooO0O0.value(z);
        return this;
    }

    @Override // p294o0O0Ooo0.o000OO
    @NonNull
    public final o000OO OooO0o(@NonNull o0000O0 o0000o1, long j) throws IOException {
        String str = o0000o1.f42308OooO00o;
        OooO();
        JsonWriter jsonWriter = this.f42320OooO0O0;
        jsonWriter.name(str);
        OooO();
        jsonWriter.value(j);
        return this;
    }

    @Override // p294o0O0Ooo0.o000OO
    @NonNull
    public final o000OO OooO0o0(@NonNull o0000O0 o0000o1, int i) throws IOException {
        String str = o0000o1.f42308OooO00o;
        OooO();
        JsonWriter jsonWriter = this.f42320OooO0O0;
        jsonWriter.name(str);
        OooO();
        jsonWriter.value(i);
        return this;
    }

    @NonNull
    public final o00O0O00 OooO0oO(@Nullable Object obj) throws IOException {
        JsonWriter jsonWriter = this.f42320OooO0O0;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                jsonWriter.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    OooO0oO(it.next());
                }
                jsonWriter.endArray();
                return this;
            }
            if (obj instanceof Map) {
                jsonWriter.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        OooO0oo(entry.getValue(), (String) key);
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                jsonWriter.endObject();
                return this;
            }
            o0000O0O<?> o0000o0o2 = this.f42321OooO0OO.get(obj.getClass());
            if (o0000o0o2 != null) {
                jsonWriter.beginObject();
                o0000o0o2.OooO00o(obj, this);
                jsonWriter.endObject();
                return this;
            }
            o0000O<?> o0000o2 = this.f42322OooO0Oo.get(obj.getClass());
            if (o0000o2 != null) {
                o0000o2.OooO00o(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                OooO();
                jsonWriter.value(strName);
                return this;
            }
            jsonWriter.beginObject();
            this.f42324OooO0o0.OooO00o(obj, this);
            jsonWriter.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            OooO();
            jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        jsonWriter.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                jsonWriter.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                OooO();
                jsonWriter.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                jsonWriter.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                jsonWriter.value(zArr[i]);
                i++;
            }
        } else if (obj instanceof Number[]) {
            Number[] numberArr = (Number[]) obj;
            int length5 = numberArr.length;
            while (i < length5) {
                OooO0oO(numberArr[i]);
                i++;
            }
        } else {
            Object[] objArr = (Object[]) obj;
            int length6 = objArr.length;
            while (i < length6) {
                OooO0oO(objArr[i]);
                i++;
            }
        }
        jsonWriter.endArray();
        return this;
    }

    @NonNull
    public final o00O0O00 OooO0oo(@Nullable Object obj, @NonNull String str) throws IOException {
        boolean z = this.f42323OooO0o;
        JsonWriter jsonWriter = this.f42320OooO0O0;
        if (z) {
            if (obj == null) {
                return this;
            }
            OooO();
            jsonWriter.name(str);
            return OooO0oO(obj);
        }
        OooO();
        jsonWriter.name(str);
        if (obj != null) {
            return OooO0oO(obj);
        }
        jsonWriter.nullValue();
        return this;
    }
}
