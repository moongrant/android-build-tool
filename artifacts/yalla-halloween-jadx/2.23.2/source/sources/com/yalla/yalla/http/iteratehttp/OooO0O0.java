package com.yalla.yalla.http.iteratehttp;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 implements Comparator<Map.Entry<String, String>> {
    @Override // java.util.Comparator
    public final int compare(Map.Entry<String, String> entry, Map.Entry<String, String> entry2) {
        return entry.getKey().compareTo(entry2.getKey());
    }
}
