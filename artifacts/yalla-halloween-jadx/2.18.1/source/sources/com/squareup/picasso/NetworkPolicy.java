package com.squareup.picasso;

/* JADX INFO: loaded from: classes2.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    public final int index;

    NetworkPolicy(int i) {
        this.index = i;
    }

    public static boolean OooO00o(int i) {
        return (i & OFFLINE.index) != 0;
    }
}
