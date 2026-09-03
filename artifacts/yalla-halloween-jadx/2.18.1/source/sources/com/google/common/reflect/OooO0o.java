package com.google.common.reflect;

import com.google.common.collect.o0O000Oo;
import com.google.common.collect.o0oOO;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0o extends o0oOO<Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Comparator f18753Oooo0o = o0O000Oo.f18601Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Map f18754Oooo0oO;

    public OooO0o(Map map) {
        this.f18754Oooo0oO = map;
    }

    @Override // com.google.common.collect.o0oOO, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f18753Oooo0o.compare(this.f18754Oooo0oO.get(obj), this.f18754Oooo0oO.get(obj2));
    }
}
