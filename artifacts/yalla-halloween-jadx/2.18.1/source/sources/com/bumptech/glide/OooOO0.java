package com.bumptech.glide;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Class<?>, Object> f12396OooO00o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Map<Class<?>, Object> f12397OooO00o = new HashMap();
    }

    public OooOO0(OooO00o oooO00o) {
        this.f12396OooO00o = Collections.unmodifiableMap(new HashMap(oooO00o.f12397OooO00o));
    }

    public final boolean OooO00o(Class<Object> cls) {
        return this.f12396OooO00o.containsKey(cls);
    }
}
