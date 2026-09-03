package com.squareup.wire;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Preconditions {
    private Preconditions() {
    }

    public static void checkNotNull(Object obj, String str) {
        Objects.requireNonNull(obj, str);
    }
}
