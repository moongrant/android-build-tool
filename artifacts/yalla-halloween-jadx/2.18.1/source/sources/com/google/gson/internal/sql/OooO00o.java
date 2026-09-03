package com.google.gson.internal.sql;

import java.sql.Timestamp;
import java.util.Date;
import p386o0OOoo0O.o00O0O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f19316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final com.google.gson.internal.bind.OooO00o.OooO0O0<? extends Date> f19317OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final com.google.gson.internal.bind.OooO00o.OooO0O0<? extends Date> f19318OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O0O00 f19319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o00O0O00 f19320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o00O0O00 f19321OooO0o0;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0156OooO00o extends com.google.gson.internal.bind.OooO00o.OooO0O0<java.sql.Date> {
        public C0156OooO00o(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
        public final Date OooO0O0(Date date) {
            return new java.sql.Date(date.getTime());
        }
    }

    public class OooO0O0 extends com.google.gson.internal.bind.OooO00o.OooO0O0<Timestamp> {
        public OooO0O0(Class cls) {
            super(cls);
        }

        @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
        public final Date OooO0O0(Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f19316OooO00o = z;
        if (z) {
            f19317OooO0O0 = new C0156OooO00o(java.sql.Date.class);
            f19318OooO0OO = new OooO0O0(Timestamp.class);
            f19319OooO0Oo = SqlDateTypeAdapter.FACTORY;
            f19321OooO0o0 = SqlTimeTypeAdapter.FACTORY;
            f19320OooO0o = SqlTimestampTypeAdapter.FACTORY;
            return;
        }
        f19317OooO0O0 = null;
        f19318OooO0OO = null;
        f19319OooO0Oo = null;
        f19321OooO0o0 = null;
        f19320OooO0o = null;
    }
}
