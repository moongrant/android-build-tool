package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import p267o00oooOo.oO00000;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends oO00000 {
    public zzad() {
    }

    @CanIgnoreReturnValue
    public final zzad zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    @CanIgnoreReturnValue
    public final zzad zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    public zzad(int i) {
    }
}
