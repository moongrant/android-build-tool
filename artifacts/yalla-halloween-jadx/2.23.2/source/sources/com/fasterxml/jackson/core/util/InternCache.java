package com.fasterxml.jackson.core.util;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class InternCache extends ConcurrentHashMap<String, String> {
    static {
        new InternCache();
    }

    private InternCache() {
        super(180, 0.8f, 4);
    }
}
