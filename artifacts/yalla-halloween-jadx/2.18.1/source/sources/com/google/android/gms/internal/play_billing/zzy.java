package com.google.android.gms.internal.play_billing;

import java.util.Set;
import javax.annotation.CheckForNull;
import o0OO0.OooO;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzy extends zzr implements Set {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @CheckForNull
    public transient zzu f16063Oooo0oO;

    public zzu OooO0oO() {
        Object[] array = toArray();
        OooO oooO = zzu.f16056Oooo0oO;
        int length = array.length;
        return length == 0 ? OooO00o.f16043OoooO00 : new OooO00o(array, length);
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
        return zzag.OooO00o(this);
    }

    @Override // com.google.android.gms.internal.play_billing.zzr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zzd */
    public abstract zzah iterator();

    public final zzu zzf() {
        zzu zzuVar = this.f16063Oooo0oO;
        if (zzuVar != null) {
            return zzuVar;
        }
        zzu zzuVarOooO0oO = OooO0oO();
        this.f16063Oooo0oO = zzuVarOooO0oO;
        return zzuVarOooO0oO;
    }
}
