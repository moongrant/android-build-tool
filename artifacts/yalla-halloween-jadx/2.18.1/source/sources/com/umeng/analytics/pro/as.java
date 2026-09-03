package com.umeng.analytics.pro;

import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
public class as extends az {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    private static final bx j = new bx("TApplicationException");
    private static final bn k = new bn(ShareConstants.WEB_DIALOG_PARAM_MESSAGE, (byte) 11, 1);
    private static final bn l = new bn("type", (byte) 8, 2);
    private static final long m = 1;
    public int i;

    public as() {
        this.i = 0;
    }

    public int a() {
        return this.i;
    }

    public void b(bs bsVar) throws az {
        bsVar.a(j);
        if (getMessage() != null) {
            bsVar.a(k);
            bsVar.a(getMessage());
            bsVar.c();
        }
        bsVar.a(l);
        bsVar.a(this.i);
        bsVar.c();
        bsVar.d();
        bsVar.b();
    }

    public static as a(bs bsVar) throws az {
        bsVar.j();
        String strZ = null;
        int iW = 0;
        while (true) {
            bn bnVarL = bsVar.l();
            byte b2 = bnVarL.b;
            if (b2 == 0) {
                bsVar.k();
                return new as(iW, strZ);
            }
            short s = bnVarL.c;
            if (s != 1) {
                if (s != 2) {
                    bv.a(bsVar, b2);
                } else if (b2 == 8) {
                    iW = bsVar.w();
                } else {
                    bv.a(bsVar, b2);
                }
            } else if (b2 == 11) {
                strZ = bsVar.z();
            } else {
                bv.a(bsVar, b2);
            }
            bsVar.m();
        }
    }

    public as(int i) {
        this.i = i;
    }

    public as(int i, String str) {
        super(str);
        this.i = i;
    }

    public as(String str) {
        super(str);
        this.i = 0;
    }
}
