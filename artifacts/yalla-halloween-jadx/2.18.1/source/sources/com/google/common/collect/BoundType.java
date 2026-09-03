package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes2.dex */
@GwtCompatible
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    public final boolean inclusive;

    BoundType(boolean z) {
        this.inclusive = z;
    }

    public static BoundType OooO00o(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
