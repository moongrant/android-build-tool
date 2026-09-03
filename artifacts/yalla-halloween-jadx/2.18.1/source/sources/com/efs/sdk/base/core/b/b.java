package com.efs.sdk.base.core.b;

import androidx.annotation.Nullable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private ConcurrentHashMap<Byte, e> a = new ConcurrentHashMap<>();

    @Nullable
    public final e a(byte b) {
        if (!this.a.containsKey(Byte.valueOf(b))) {
            if (b == 1) {
                this.a.putIfAbsent(Byte.valueOf(b), new g());
            } else if (b != 2) {
                com.efs.sdk.base.core.util.d.a("efs.cache", "Cache module not support protocol ".concat(String.valueOf((int) b)), null);
            } else {
                this.a.putIfAbsent(Byte.valueOf(b), new d());
            }
        }
        return this.a.get(Byte.valueOf(b));
    }
}
