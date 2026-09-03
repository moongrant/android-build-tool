package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import p265o00oooOo.o0O000o0;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends o0O000o0 {
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
