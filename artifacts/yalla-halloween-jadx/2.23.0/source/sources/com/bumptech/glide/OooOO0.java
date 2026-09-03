package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, Object> f9874OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final HashMap f9875OooO00o = new HashMap();
    }

    public OooOO0(OooO00o oooO00o) {
        this.f9874OooO00o = Collections.unmodifiableMap(new HashMap(oooO00o.f9875OooO00o));
    }
}
