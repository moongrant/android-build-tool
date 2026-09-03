package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes3.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public enum RemovalCause {
    EXPLICIT { // from class: com.google.common.cache.RemovalCause.OooO00o
    },
    REPLACED { // from class: com.google.common.cache.RemovalCause.OooO0O0
    },
    COLLECTED { // from class: com.google.common.cache.RemovalCause.OooO0OO
    },
    EXPIRED { // from class: com.google.common.cache.RemovalCause.OooO0o
    },
    SIZE { // from class: com.google.common.cache.RemovalCause.OooO
    };

    RemovalCause() {
        throw null;
    }
}
