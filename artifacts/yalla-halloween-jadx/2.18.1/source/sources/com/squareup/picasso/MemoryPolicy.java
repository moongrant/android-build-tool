package com.squareup.picasso;

/* JADX INFO: loaded from: classes2.dex */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);

    public final int index;

    MemoryPolicy(int i) {
        this.index = i;
    }

    public static boolean OooO00o(int i) {
        return (i & NO_CACHE.index) == 0;
    }
}
