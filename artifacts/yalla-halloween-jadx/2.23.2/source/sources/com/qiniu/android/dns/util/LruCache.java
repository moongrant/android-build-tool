package com.qiniu.android.dns.util;

import java.util.LinkedHashMap;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class LruCache<K, V> extends LinkedHashMap<K, V> {
    private int size;

    public LruCache() {
        this(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.size;
    }

    public LruCache(int i) {
        super(i, 1.0f, true);
        this.size = i;
    }
}
