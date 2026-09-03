package p371o0OOo0Oo;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p368o0OOo0O.Oooo0;
import p368o0OOo0O.o000oOoO;
import p368o0OOo0O.o00O0O;
import p368o0OOo0O.o00Oo0;
import p368o0OOo0O.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements o0OoOo0, o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f38674OooO00o = true;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final JsonWriter f38675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, o000oOoO<?>> f38676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Class<?>, o00O0O<?>> f38677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f38678OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000oOoO<Object> f38679OooO0o0;

    public oo000o(@NonNull Writer writer, @NonNull Map<Class<?>, o000oOoO<?>> map, @NonNull Map<Class<?>, o00O0O<?>> map2, o000oOoO<Object> o000oooo2, boolean z) {
        this.f38675OooO0O0 = new JsonWriter(writer);
        this.f38676OooO0OO = map;
        this.f38677OooO0Oo = map2;
        this.f38679OooO0o0 = o000oooo2;
        this.f38678OooO0o = z;
    }

    public final void OooO() throws IOException {
        if (!this.f38674OooO00o) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO00o(@NonNull Oooo0 oooo0, boolean z) throws IOException {
        String str = oooo0.f38661OooO00o;
        OooO();
        this.f38675OooO0O0.name(str);
        OooO();
        this.f38675OooO0O0.value(z);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0O0(@NonNull Oooo0 oooo0, long j) throws IOException {
        String str = oooo0.f38661OooO00o;
        OooO();
        this.f38675OooO0O0.name(str);
        OooO();
        this.f38675OooO0O0.value(j);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0OO(@NonNull Oooo0 oooo0, int i) throws IOException {
        String str = oooo0.f38661OooO00o;
        OooO();
        this.f38675OooO0O0.name(str);
        OooO();
        this.f38675OooO0O0.value(i);
        return this;
    }

    @Override // p368o0OOo0O.o0OoOo0
    @NonNull
    public final o0OoOo0 OooO0Oo(@NonNull Oooo0 oooo0, @Nullable Object obj) throws IOException {
        return OooO0oo(oooo0.f38661OooO00o, obj);
    }

    @Override // p368o0OOo0O.o00Oo0
    @NonNull
    public final o00Oo0 OooO0o(boolean z) throws IOException {
        OooO();
        this.f38675OooO0O0.value(z);
        return this;
    }

    @Override // p368o0OOo0O.o00Oo0
    @NonNull
    public final o00Oo0 OooO0o0(@Nullable String str) throws IOException {
        OooO();
        this.f38675OooO0O0.value(str);
        return this;
    }

    @NonNull
    public final oo000o OooO0oO(@Nullable Object obj) throws IOException {
        if (obj == null) {
            this.f38675OooO0O0.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f38675OooO0O0.value((Number) obj);
            return this;
        }
        int i = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f38675OooO0O0.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    OooO0oO(it.next());
                }
                this.f38675OooO0O0.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f38675OooO0O0.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        OooO0oo((String) key, entry.getValue());
                    } catch (ClassCastException e) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                    }
                }
                this.f38675OooO0O0.endObject();
                return this;
            }
            o000oOoO<?> o000oooo2 = this.f38676OooO0OO.get(obj.getClass());
            if (o000oooo2 != null) {
                this.f38675OooO0O0.beginObject();
                o000oooo2.OooO00o(obj, this);
                this.f38675OooO0O0.endObject();
                return this;
            }
            o00O0O<?> o00o0o2 = this.f38677OooO0Oo.get(obj.getClass());
            if (o00o0o2 != null) {
                o00o0o2.OooO00o(obj, this);
                return this;
            }
            if (obj instanceof Enum) {
                String strName = ((Enum) obj).name();
                OooO();
                this.f38675OooO0O0.value(strName);
                return this;
            }
            o000oOoO<Object> o000oooo3 = this.f38679OooO0o0;
            this.f38675OooO0O0.beginObject();
            o000oooo3.OooO00o(obj, this);
            this.f38675OooO0O0.endObject();
            return this;
        }
        if (obj instanceof byte[]) {
            OooO();
            this.f38675OooO0O0.value(Base64.encodeToString((byte[]) obj, 2));
            return this;
        }
        this.f38675OooO0O0.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i < length) {
                this.f38675OooO0O0.value(iArr[i]);
                i++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i < length2) {
                long j = jArr[i];
                OooO();
                this.f38675OooO0O0.value(j);
                i++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i < length3) {
                this.f38675OooO0O0.value(dArr[i]);
                i++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i < length4) {
                this.f38675OooO0O0.value(zArr[i]);
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
        this.f38675OooO0O0.endArray();
        return this;
    }

    @NonNull
    public final oo000o OooO0oo(@NonNull String str, @Nullable Object obj) throws IOException {
        if (this.f38678OooO0o) {
            if (obj == null) {
                return this;
            }
            OooO();
            this.f38675OooO0O0.name(str);
            return OooO0oO(obj);
        }
        OooO();
        this.f38675OooO0O0.name(str);
        if (obj != null) {
            return OooO0oO(obj);
        }
        this.f38675OooO0O0.nullValue();
        return this;
    }
}
