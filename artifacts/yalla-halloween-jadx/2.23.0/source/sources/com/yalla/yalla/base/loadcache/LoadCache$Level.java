package com.yalla.yalla.base.loadcache;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yalla/yalla/base/loadcache/LoadCache$Level", "", "Lcom/yalla/yalla/base/loadcache/LoadCache$Level;", "", "level", "I", "getLevel", "()I", "CACHE", "DISK", "NET", "YLBase_release"}, k = 1, mv = {1, 8, 0})
public enum LoadCache$Level {
    CACHE(1),
    DISK(2),
    NET(3);

    private final int level;

    LoadCache$Level(int i) {
        this.level = i;
    }
}
