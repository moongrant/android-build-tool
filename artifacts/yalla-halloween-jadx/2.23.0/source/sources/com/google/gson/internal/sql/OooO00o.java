package com.google.gson.internal.sql;

import com.google.gson.o0OOO0o;
import java.sql.Date;
import java.sql.Timestamp;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final boolean f20707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C0262OooO00o f20708OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO0O0 f20709OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o0OOO0o f20710OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o0OOO0o f20711OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final o0OOO0o f20712OooO0o0;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.OooO00o$OooO00o, reason: collision with other inner class name */
    public class C0262OooO00o extends com.google.gson.internal.bind.OooO00o.OooO0O0<Date> {
        public C0262OooO00o() {
            super(Date.class);
        }

        @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
        public final java.util.Date OooO0O0(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    public class OooO0O0 extends com.google.gson.internal.bind.OooO00o.OooO0O0<Timestamp> {
        public OooO0O0() {
            super(Timestamp.class);
        }

        @Override // com.google.gson.internal.bind.OooO00o.OooO0O0
        public final java.util.Date OooO0O0(java.util.Date date) {
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
        f20707OooO00o = z;
        if (z) {
            f20708OooO0O0 = new C0262OooO00o();
            f20709OooO0OO = new OooO0O0();
            f20710OooO0Oo = SqlDateTypeAdapter.FACTORY;
            f20712OooO0o0 = SqlTimeTypeAdapter.FACTORY;
            f20711OooO0o = SqlTimestampTypeAdapter.FACTORY;
            return;
        }
        f20708OooO0O0 = null;
        f20709OooO0OO = null;
        f20710OooO0Oo = null;
        f20712OooO0o0 = null;
        f20711OooO0o = null;
    }
}
