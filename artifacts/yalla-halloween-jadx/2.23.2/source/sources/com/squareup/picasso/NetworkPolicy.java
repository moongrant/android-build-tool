package com.squareup.picasso;

/* JADX INFO: loaded from: classes3.dex */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);

    final int index;

    NetworkPolicy(int i) {
        this.index = i;
    }
}
