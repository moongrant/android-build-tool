package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzjd;
import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzkr;
import com.google.android.gms.internal.measurement.zzkt;
import com.google.android.gms.internal.measurement.zzll;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0OOoo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class f37460OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final oo0ooO f37461OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final oo0ooO f37462OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OO00OO f37463OooO0Oo;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f37460OooO00o = cls;
        f37461OooO0O0 = OooOo00(false);
        f37462OooO0OO = OooOo00(true);
        f37463OooO0Oo = new o0OO00OO();
    }

    public static void OooO(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += zzjl.zzv(((Integer) list.get(i3)).intValue());
        }
        o00ooooo2.f37338OooO00o.zzq(iZzv);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void OooO00o(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzd(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzb(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void OooO0O0(int i, List list, o0OOOO00 o0oooo01) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        for (int i2 = 0; i2 < list.size(); i2++) {
            o00ooooo2.f37338OooO00o.zze(i, (zzjd) list.get(i2));
        }
    }

    public static void OooO0OO(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzh(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzi(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void OooO0Oo(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzj(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzv = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzv += zzjl.zzv(((Integer) list.get(i3)).intValue());
        }
        o00ooooo2.f37338OooO00o.zzq(iZzv);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzk(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooO0o(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooO0o0(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooO0oO(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzf(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzg(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void OooO0oo(int i, List list, o0OOOO00 o0oooo01, o0O0OOOo o0o0oooo) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((o00OOOOo) o0oooo01).OooOO0o(i, list.get(i2), o0o0oooo);
        }
    }

    public static void OooOO0(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzB += zzjl.zzB(((Long) list.get(i3)).longValue());
        }
        o00ooooo2.f37338OooO00o.zzq(iZzB);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOO0O(int i, List list, o0OOOO00 o0oooo01, o0O0OOOo o0o0oooo) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            ((o00OOOOo) o0oooo01).OooOOOO(i, list.get(i2), o0o0oooo);
        }
    }

    public static void OooOO0o(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzf(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzg(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void OooOOO(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzjl zzjlVar = o00ooooo2.f37338OooO00o;
                int iIntValue = ((Integer) list.get(i2)).intValue();
                zzjlVar.zzp(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iZzA += zzjl.zzA((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        o00ooooo2.f37338OooO00o.zzq(iZzA);
        while (i2 < list.size()) {
            zzjl zzjlVar2 = o00ooooo2.f37338OooO00o;
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            zzjlVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public static void OooOOO0(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzh(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        o00ooooo2.f37338OooO00o.zzq(i3);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzi(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOOOO(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzjl zzjlVar = o00ooooo2.f37338OooO00o;
                long jLongValue = ((Long) list.get(i2)).longValue();
                zzjlVar.zzr(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iZzB += zzjl.zzB((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        o00ooooo2.f37338OooO00o.zzq(iZzB);
        while (i2 < list.size()) {
            zzjl zzjlVar2 = o00ooooo2.f37338OooO00o;
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            zzjlVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void OooOOOo(int i, List list, o0OOOO00 o0oooo01) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!(list instanceof zzkt)) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzm(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzkt zzktVar = (zzkt) list;
        while (i2 < list.size()) {
            Object objZzf = zzktVar.zzf(i2);
            if (objZzf instanceof String) {
                o00ooooo2.f37338OooO00o.zzm(i, (String) objZzf);
            } else {
                o00ooooo2.f37338OooO00o.zze(i, (zzjd) objZzf);
            }
            i2++;
        }
    }

    public static void OooOOo(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzr(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzB = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzB += zzjl.zzB(((Long) list.get(i3)).longValue());
        }
        o00ooooo2.f37338OooO00o.zzq(iZzB);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzs(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void OooOOo0(int i, List list, o0OOOO00 o0oooo01, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        o00OOOOo o00ooooo2 = (o00OOOOo) o0oooo01;
        Objects.requireNonNull(o00ooooo2);
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                o00ooooo2.f37338OooO00o.zzp(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        o00ooooo2.f37338OooO00o.zzo(i, 2);
        int iZzA = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iZzA += zzjl.zzA(((Integer) list.get(i3)).intValue());
        }
        o00ooooo2.f37338OooO00o.zzq(iZzA);
        while (i2 < list.size()) {
            o00ooooo2.f37338OooO00o.zzq(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static boolean OooOOoo(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int OooOo(List list) {
        return list.size() * 4;
    }

    public static int OooOo0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iZzz += zzjl.zzt((zzjd) list.get(i2));
        }
        return iZzz;
    }

    public static oo0ooO OooOo00(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (oo0ooO) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static int OooOo0O(List list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000) {
            o0O000 o0o001 = (o0O000) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(o0o001.OooO0O0(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzv;
    }

    public static int OooOo0o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i << 3) + 4) * size;
    }

    public static int OooOoO(List list) {
        return list.size() * 8;
    }

    public static int OooOoO0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (zzjl.zzA(i << 3) + 8) * size;
    }

    public static int OooOoOO(int i, List list, o0O0OOOo o0o0oooo) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iOooO00o = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iOooO00o += zzjl.OooO00o(i, (zzll) list.get(i2), o0o0oooo);
        }
        return iOooO00o;
    }

    public static int OooOoo(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (zzjl.zzz(i) * list.size()) + OooOooO(list);
    }

    public static int OooOoo0(List list) {
        int iZzv;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000) {
            o0O000 o0o001 = (o0O000) list;
            iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(o0o001.OooO0O0(i));
                i++;
            }
        } else {
            iZzv = 0;
            while (i < size) {
                iZzv += zzjl.zzv(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzv;
    }

    public static int OooOooO(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000o0) {
            o0O000o0 o0o000o1 = (o0O000o0) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(o0o000o1.zza(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }

    public static int OooOooo(int i, Object obj, o0O0OOOo o0o0oooo) {
        if (!(obj instanceof zzkr)) {
            return zzjl.OooO0O0((zzll) obj, o0o0oooo) + zzjl.zzA(i << 3);
        }
        int iZzA = zzjl.zzA(i << 3);
        int iZza = ((zzkr) obj).zza();
        return zzjl.zzA(iZza) + iZza + iZzA;
    }

    public static int Oooo0(int i, List list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            while (i2 < size) {
                Object objZzf = zzktVar.zzf(i2);
                iZzz = (objZzf instanceof zzjd ? zzjl.zzt((zzjd) objZzf) : zzjl.zzy((String) objZzf)) + iZzz;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iZzz = (obj instanceof zzjd ? zzjl.zzt((zzjd) obj) : zzjl.zzy((String) obj)) + iZzz;
                i2++;
            }
        }
        return iZzz;
    }

    public static int Oooo000(int i, List list, o0O0OOOo o0o0oooo) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iZzz = zzjl.zzz(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iZzz += obj instanceof zzkr ? zzjl.zzw((zzkr) obj) : zzjl.OooO0O0((zzll) obj, o0o0oooo);
        }
        return iZzz;
    }

    public static int Oooo00O(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000) {
            o0O000 o0o001 = (o0O000) list;
            iZzA = 0;
            while (i < size) {
                int iOooO0O0 = o0o001.OooO0O0(i);
                iZzA += zzjl.zzA((iOooO0O0 >> 31) ^ (iOooO0O0 + iOooO0O0));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iZzA += zzjl.zzA((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iZzA;
    }

    public static int Oooo00o(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000o0) {
            o0O000o0 o0o000o1 = (o0O000o0) list;
            iZzB = 0;
            while (i < size) {
                long jZza = o0o000o1.zza(i);
                iZzB += zzjl.zzB((jZza >> 63) ^ (jZza + jZza));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iZzB += zzjl.zzB((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iZzB;
    }

    public static int Oooo0O0(List list) {
        int iZzA;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000) {
            o0O000 o0o001 = (o0O000) list;
            iZzA = 0;
            while (i < size) {
                iZzA += zzjl.zzA(o0o001.OooO0O0(i));
                i++;
            }
        } else {
            iZzA = 0;
            while (i < size) {
                iZzA += zzjl.zzA(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iZzA;
    }

    public static int Oooo0OO(List list) {
        int iZzB;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0O000o0) {
            o0O000o0 o0o000o1 = (o0O000o0) list;
            iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(o0o000o1.zza(i));
                i++;
            }
        } else {
            iZzB = 0;
            while (i < size) {
                iZzB += zzjl.zzB(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iZzB;
    }
}
