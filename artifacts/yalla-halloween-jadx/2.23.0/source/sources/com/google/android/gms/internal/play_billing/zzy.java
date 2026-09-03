package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Set;
import javax.annotation.CheckForNull;
import p267o00oooo0.o0O0O0O;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzy extends zzr implements Set {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @CheckForNull
    public transient zzu f15861OooO0o0;

    public zzu OooO0o() {
        Object[] array = toArray();
        o0O0O0O o0o0o0o = zzu.f15854OooO0o0;
        int length = array.length;
        return length == 0 ? OooO00o.f15840OooO0oo : new OooO00o(array, length);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this || obj == this) {
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
    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr
    public zzu zzd() {
        zzu zzuVar = this.f15861OooO0o0;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu zzuVarOooO0o = OooO0o();
        this.f15861OooO0o0 = zzuVarOooO0o;
        return zzuVarOooO0o;
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zze */
    public abstract zzah iterator();
}
