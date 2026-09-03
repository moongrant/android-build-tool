package p335o0OO00o;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzju;
import com.google.android.gms.internal.measurement.zzkg;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.internal.measurement.zzkq;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zznd;
import com.google.android.gms.internal.measurement.zzne;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p245o00oo0O.o0O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f37251OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0o00O f37252OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f37253OooO0O0;

    static {
        new o0(true);
    }

    public o0() {
        this.f37252OooO00o = new o0O0o00O(16);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void OooO0O0(zzju zzjuVar, Object obj) {
        boolean z;
        zzjuVar.zzb();
        Charset charset = zzkm.f15998OooO00o;
        Objects.requireNonNull(obj);
        zznd zzndVar = zznd.zza;
        zzne zzneVar = zzne.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzjd) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzkg)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzll) || (obj instanceof zzkq)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzjuVar.zza()), zzjuVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void OooO00o(zzju zzjuVar, Object obj) {
        if (!zzjuVar.zzc()) {
            OooO0O0(zzjuVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0O0(zzjuVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        boolean z = obj instanceof zzkq;
        this.f37252OooO00o.put(zzjuVar, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        o0 o0Var = new o0();
        for (int i = 0; i < this.f37252OooO00o.OooO0O0(); i++) {
            Map.Entry entryOooO0Oo = this.f37252OooO00o.OooO0Oo(i);
            o0Var.OooO00o((zzju) entryOooO0Oo.getKey(), entryOooO0Oo.getValue());
        }
        o0O0o00O o0o0o00o = this.f37252OooO00o;
        for (Map.Entry entry : o0o0o00o.f37483OoooO0.isEmpty() ? o0O0O00.f34209OooO0O0 : o0o0o00o.f37483OoooO0.entrySet()) {
            o0Var.OooO00o((zzju) entry.getKey(), entry.getValue());
        }
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0) {
            return this.f37252OooO00o.equals(((o0) obj).f37252OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f37252OooO00o.hashCode();
    }

    public o0(boolean z) {
        o0O0o00O o0o0o00o = new o0O0o00O(0);
        this.f37252OooO00o = o0o0o00o;
        if (!this.f37253OooO0O0) {
            o0o0o00o.OooO00o();
            this.f37253OooO0O0 = true;
        }
        if (this.f37253OooO0O0) {
            return;
        }
        o0o0o00o.OooO00o();
        this.f37253OooO0O0 = true;
    }
}
