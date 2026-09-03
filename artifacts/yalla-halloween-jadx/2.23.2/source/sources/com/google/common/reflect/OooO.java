package com.google.common.reflect;

import com.google.common.collect.o0O000;
import com.google.common.collect.o0oO0Ooo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO extends o0O000<Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Comparator f19279OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Map f19280OooO0o0;

    public OooO(HashMap map, o0oO0Ooo o0oo0ooo2) {
        this.f19279OooO0Oo = o0oo0ooo2;
        this.f19280OooO0o0 = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Map map = this.f19280OooO0o0;
        Object obj3 = map.get(obj);
        Objects.requireNonNull(obj3);
        Object obj4 = map.get(obj2);
        Objects.requireNonNull(obj4);
        return this.f19279OooO0Oo.compare(obj3, obj4);
    }
}
