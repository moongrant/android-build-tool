package com.fasterxml.jackson.core.util;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f10742OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final char[] f10743OooO0Oo;

    static {
        try {
            System.getProperty("line.separator");
        } catch (Throwable unused) {
        }
        new DefaultIndenter(0);
    }

    public DefaultIndenter() {
        this(0);
    }

    public DefaultIndenter(int i) {
        this.f10743OooO0Oo = new char[32];
        int i2 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            "  ".getChars(0, 2, this.f10743OooO0Oo, i2);
            i2 += 2;
        }
    }
}
