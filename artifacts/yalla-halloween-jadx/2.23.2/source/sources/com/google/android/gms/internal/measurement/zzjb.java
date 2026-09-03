package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
import org.jctools.util.Pow2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjb extends zziw implements Set {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public transient zzja f15265OooO0o0;

    public static int OooO0o0(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return Pow2.MAX_POW2;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzjb OooO0oo(int i, Object... objArr) {
        if (i == 0) {
            return o00OOO0.f15021OooOO0o;
        }
        if (i == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return new o00OOO0O(obj);
        }
        int iOooO0o0 = OooO0o0(i);
        Object[] objArr2 = new Object[iOooO0o0];
        int i2 = iOooO0o0 - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(android.support.v4.media.OooO00o.OooO00o("at index ", i5));
            }
            int iHashCode = obj2.hashCode();
            int iRotateLeft = (int) (((long) Integer.rotateLeft((int) (((long) iHashCode) * (-862048943)), 15)) * 461845907);
            while (true) {
                int i6 = iRotateLeft & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iRotateLeft++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new o00OOO0O(obj4);
        }
        if (OooO0o0(i4) < iOooO0o0 / 2) {
            return OooO0oo(i4, objArr);
        }
        if (i4 < 10) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new o00OOO0(objArr, objArr2, i3, i2, i4);
    }

    @SafeVarargs
    public static zzjb zzi(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "_in";
        objArr2[1] = "_xa";
        objArr2[2] = "_xu";
        objArr2[3] = "_aq";
        objArr2[4] = "_aa";
        objArr2[5] = "_ai";
        System.arraycopy(objArr, 0, objArr2, 6, 9);
        return OooO0oo(15, objArr2);
    }

    public o00OOO00 OooO0o() {
        Object[] array = toArray();
        o00OO0OO o00oo0oo = zzja.f15264OooO0o0;
        return zzja.OooO0o0(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzjb) && (this instanceof o00OOO0)) {
            zzjb zzjbVar = (zzjb) obj;
            zzjbVar.getClass();
            if ((zzjbVar instanceof o00OOO0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zziw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zzd */
    public abstract zzjh iterator();

    public final zzja zzg() {
        zzja zzjaVar = this.f15265OooO0o0;
        if (zzjaVar != null) {
            return zzjaVar;
        }
        o00OOO00 o00ooo00OooO0o = OooO0o();
        this.f15265OooO0o0 = o00ooo00OooO0o;
        return o00ooo00OooO0o;
    }
}
