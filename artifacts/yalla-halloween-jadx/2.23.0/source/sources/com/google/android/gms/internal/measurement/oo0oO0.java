package com.google.android.gms.internal.measurement;

import com.google.protobuf.GeneratedMessage;
import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0oO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class f15639OooO00o = GeneratedMessage.class;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0OOO00 f15640OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final o0OOO0 f15641OooO0OO;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        Class<?> cls;
        o0OOO00 o0ooo00 = null;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                o0ooo00 = (o0OOO00) cls.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused2) {
            }
        }
        f15640OooO0O0 = o0ooo00;
        f15641OooO0OO = new o0OOO0();
    }

    public static void OooO(int i, List list, o0O00000 o0o00000, o0OO000o o0oo000o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0o00000.OooOO0o(i, o0oo000o, list.get(i2));
        }
    }

    public static Object OooO00o(Object obj, int i, int i2, Object obj2, o0OOO00 o0ooo00) {
        if (obj2 == null) {
            obj2 = o0ooo00.OooO0OO(obj);
        }
        o0ooo00.OooO0o(i, i2, obj2);
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void OooO0O0(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void OooO0OO(int i, List list, o0O00000 o0o00000) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o00000.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0o00000.f15524OooO00o.zze(i, (zzka) list.get(i2));
        }
    }

    public static void OooO0Oo(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooO0o(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooO0o0(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzu = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzu += zzki.zzu(((Integer) list.get(i3)).intValue());
        }
        zzkiVar.zzq(iZzu);
        while (i2 < list.size()) {
            zzkiVar.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooO0oO(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooO0oo(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void OooOO0(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzu = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzu += zzki.zzu(((Integer) list.get(i3)).intValue());
        }
        zzkiVar.zzq(iZzu);
        while (i2 < list.size()) {
            zzkiVar.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOO0O(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzy = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzy += zzki.zzy(((Long) list.get(i3)).longValue());
        }
        zzkiVar.zzq(iZzy);
        while (i2 < list.size()) {
            zzkiVar.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOO0o(int i, List list, o0O00000 o0o00000, o0OO000o o0oo000o) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            o0o00000.OooOOOO(i, o0oo000o, list.get(i2));
        }
    }

    public static void OooOOO(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOOO0(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        zzkiVar.zzq(i3);
        while (i2 < list.size()) {
            zzkiVar.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOOOO(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                zzkiVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzx = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iZzx += zzki.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        zzkiVar.zzq(iZzx);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            zzkiVar.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public static void OooOOOo(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                zzkiVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzy = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZzy += zzki.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        zzkiVar.zzq(iZzy);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            zzkiVar.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void OooOOo(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzp(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzx = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzx += zzki.zzx(((Integer) list.get(i3)).intValue());
        }
        zzkiVar.zzq(iZzx);
        while (i2 < list.size()) {
            zzkiVar.zzq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOOo0(int i, List list, o0O00000 o0o00000) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o0o00000.getClass();
        boolean z = list instanceof zzlq;
        int i2 = 0;
        zzki zzkiVar = o0o00000.f15524OooO00o;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i2 < list.size()) {
            Object objZzf = zzlqVar.zzf(i2);
            if (objZzf instanceof String) {
                zzkiVar.zzm(i, (String) objZzf);
            } else {
                zzkiVar.zze(i, (zzka) objZzf);
            }
            i2++;
        }
    }

    public static void OooOOoo(int i, List list, o0O00000 o0o00000, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zzki zzkiVar = o0o00000.f15524OooO00o;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzkiVar.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        zzkiVar.zzo(i, 2);
        int iZzy = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzy += zzki.zzy(((Long) list.get(i3)).longValue());
        }
        zzkiVar.zzq(iZzy);
        while (i2 < list.size()) {
            zzkiVar.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int OooOo(List list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00O) {
            o0O00O o0o00o2 = (o0O00O) list;
            iZzu = 0;
            while (i < size) {
                o0o00o2.OooO0OO(i);
                iZzu += zzki.zzu(o0o00o2.f15534OooO0o0[i]);
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static int OooOo0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 1) * size;
    }

    public static boolean OooOo00(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int OooOo0O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx = zzki.zzx(i << 3) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iZzd = ((zzka) list.get(i2)).zzd();
            iZzx += zzki.zzx(iZzd) + iZzd;
        }
        return iZzx;
    }

    public static int OooOo0o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + OooOo(list);
    }

    public static int OooOoO(List list) {
        return list.size() * 4;
    }

    public static int OooOoO0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 4) * size;
    }

    public static int OooOoOO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) + 8) * size;
    }

    public static int OooOoo(int i, List list, o0OO000o o0oo000o) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooO00o = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iOooO00o += zzki.OooO00o(i, (zzmi) list.get(i2), o0oo000o);
        }
        return iOooO00o;
    }

    public static int OooOoo0(List list) {
        return list.size() * 8;
    }

    public static int OooOooO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + OooOooo(list);
    }

    public static int OooOooo(List list) {
        int iZzu;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00O) {
            o0O00O o0o00o2 = (o0O00O) list;
            iZzu = 0;
            while (i < size) {
                o0o00o2.OooO0OO(i);
                iZzu += zzki.zzu(o0o00o2.f15534OooO0o0[i]);
                i++;
            }
        } else {
            iZzu = 0;
            while (i < size) {
                iZzu += zzki.zzu(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzu;
    }

    public static int Oooo(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00O) {
            o0O00O o0o00o2 = (o0O00O) list;
            iZzx = 0;
            while (i < size) {
                o0o00o2.OooO0OO(i);
                iZzx += zzki.zzx(o0o00o2.f15534OooO0o0[i]);
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                iZzx += zzki.zzx(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzx;
    }

    public static int Oooo0(int i, List list, o0OO000o o0oo000o) {
        int iOooO00o;
        int iZzx;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzx2 = zzki.zzx(i << 3) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof zzlo) {
                iOooO00o = ((zzlo) obj).zza();
                iZzx = zzki.zzx(iOooO00o);
            } else {
                iOooO00o = ((zzjk) ((zzmi) obj)).OooO00o(o0oo000o);
                iZzx = zzki.zzx(iOooO00o);
            }
            iZzx2 = iZzx + iOooO00o + iZzx2;
        }
        return iZzx2;
    }

    public static int Oooo000(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * list.size()) + Oooo00O(list);
    }

    public static int Oooo00O(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00o00) {
            o0O00o00 o0o00o01 = (o0O00o00) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(o0o00o01.zza(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzy;
    }

    public static int Oooo00o(int i, o0OO000o o0oo000o, Object obj) {
        int iZzx;
        int iZzx2;
        if (obj instanceof zzlo) {
            Logger logger = zzki.f15744OooO0O0;
            int iZza = ((zzlo) obj).zza();
            iZzx = zzki.zzx(iZza) + iZza;
            iZzx2 = zzki.zzx(i << 3);
        } else {
            Logger logger2 = zzki.f15744OooO0O0;
            int iOooO00o = ((zzjk) ((zzmi) obj)).OooO00o(o0oo000o);
            iZzx = zzki.zzx(iOooO00o) + iOooO00o;
            iZzx2 = zzki.zzx(i << 3);
        }
        return iZzx2 + iZzx;
    }

    public static int Oooo0O0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + Oooo0OO(list);
    }

    public static int Oooo0OO(List list) {
        int iZzx;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00O) {
            o0O00O o0o00o2 = (o0O00O) list;
            iZzx = 0;
            while (i < size) {
                o0o00o2.OooO0OO(i);
                int i2 = o0o00o2.f15534OooO0o0[i];
                iZzx += zzki.zzx((i2 >> 31) ^ (i2 + i2));
                i++;
            }
        } else {
            iZzx = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzx += zzki.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzx;
    }

    public static int Oooo0o(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00o00) {
            o0O00o00 o0o00o01 = (o0O00o00) list;
            iZzy = 0;
            while (i < size) {
                long jZza = o0o00o01.zza(i);
                iZzy += zzki.zzy((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzy += zzki.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzy;
    }

    public static int Oooo0o0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + Oooo0o(list);
    }

    public static int Oooo0oO(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        boolean z = list instanceof zzlq;
        int iZzx = zzki.zzx(i << 3) * size;
        if (z) {
            zzlq zzlqVar = (zzlq) list;
            while (i2 < size) {
                Object objZzf = zzlqVar.zzf(i2);
                if (objZzf instanceof zzka) {
                    int iZzd = ((zzka) objZzf).zzd();
                    iZzx = zzki.zzx(iZzd) + iZzd + iZzx;
                } else {
                    iZzx = zzki.zzw((String) objZzf) + iZzx;
                }
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof zzka) {
                    int iZzd2 = ((zzka) obj).zzd();
                    iZzx = zzki.zzx(iZzd2) + iZzd2 + iZzx;
                } else {
                    iZzx = zzki.zzw((String) obj) + iZzx;
                }
                i2++;
            }
        }
        return iZzx;
    }

    public static int Oooo0oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + Oooo(list);
    }

    public static int OoooO0(List list) {
        int iZzy;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O00o00) {
            o0O00o00 o0o00o01 = (o0O00o00) list;
            iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(o0o00o01.zza(i));
                i++;
            }
        } else {
            iZzy = 0;
            while (i < size) {
                iZzy += zzki.zzy(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzy;
    }

    public static int OoooO00(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzki.zzx(i << 3) * size) + OoooO0(list);
    }
}
