package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000o0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ int f15529OooO0OO = 0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo0ooO f15530OooO00o = new oo0ooO(16);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f15531OooO0O0;

    static {
        new o0O000o0(0);
    }

    public o0O000o0() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    public static final void OooO0OO(zzkr zzkrVar, Object obj) {
        boolean z;
        zzkrVar.zzb();
        Charset charset = zzlj.f15753OooO00o;
        obj.getClass();
        zzoa zzoaVar = zzoa.zza;
        zzob zzobVar = zzob.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof Integer;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof Long;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof Float;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof Double;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof Boolean;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof String;
                if (z) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof zzka) || (obj instanceof byte[])) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof Integer) || (obj instanceof zzld)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof zzmi) || (obj instanceof zzln)) {
                    return;
                }
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkrVar.zza()), zzkrVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final void OooO00o() {
        if (this.f15531OooO0O0) {
            return;
        }
        int i = 0;
        while (true) {
            oo0ooO oo0ooo = this.f15530OooO00o;
            if (i >= oo0ooo.OooO0O0()) {
                oo0ooo.OooO00o();
                this.f15531OooO0O0 = true;
                return;
            }
            Map.Entry entry = (Map.Entry) oo0ooo.f15573OooO0o0.get(i);
            if (entry.getValue() instanceof zzlb) {
                zzlb zzlbVar = (zzlb) entry.getValue();
                zzlbVar.getClass();
                o0O0oo00.f15553OooO0OO.OooO00o(zzlbVar.getClass()).OooO00o(zzlbVar);
                zzlbVar.OooO0oo();
            }
            i++;
        }
    }

    public final void OooO0O0(zzkr zzkrVar, Object obj) {
        if (!zzkrVar.zzc()) {
            OooO0OO(zzkrVar, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0OO(zzkrVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        boolean z = obj instanceof zzln;
        this.f15530OooO00o.put(zzkrVar, obj);
    }

    public final Object clone() throws CloneNotSupportedException {
        oo0ooO oo0ooo;
        o0O000o0 o0o000o1 = new o0O000o0();
        int i = 0;
        while (true) {
            oo0ooo = this.f15530OooO00o;
            if (i >= oo0ooo.OooO0O0()) {
                break;
            }
            Map.Entry entry = (Map.Entry) oo0ooo.f15573OooO0o0.get(i);
            o0o000o1.OooO0O0((zzkr) entry.getKey(), entry.getValue());
            i++;
        }
        for (Map.Entry entry2 : oo0ooo.f15572OooO0o.isEmpty() ? o0OO0.f15559OooO0O0 : oo0ooo.f15572OooO0o.entrySet()) {
            o0o000o1.OooO0O0((zzkr) entry2.getKey(), entry2.getValue());
        }
        return o0o000o1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O000o0) {
            return this.f15530OooO00o.equals(((o0O000o0) obj).f15530OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15530OooO00o.hashCode();
    }

    public o0O000o0(int i) {
        OooO00o();
        OooO00o();
    }
}
