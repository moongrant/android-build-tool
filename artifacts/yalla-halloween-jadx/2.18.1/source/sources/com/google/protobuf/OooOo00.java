package com.google.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooOo00 f19377OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Map<Object, GeneratedMessageLite.OooOO0<?, ?>> f19378OooO00o;

    static {
        try {
            Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f19377OooO0O0 = new OooOo00(true);
    }

    public OooOo00() {
        new HashMap();
    }

    public static OooOo00 OooO00o() {
        Class<?> cls = OooOOOO.f19371OooO00o;
        if (cls != null) {
            try {
                return (OooOo00) cls.getMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return f19377OooO0O0;
    }

    public OooOo00(boolean z) {
        this.f19378OooO00o = Collections.emptyMap();
    }
}
