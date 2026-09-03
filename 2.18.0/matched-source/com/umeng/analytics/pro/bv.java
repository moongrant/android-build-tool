package com.umeng.analytics.pro;

import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public class bv {
    private static int a = Integer.MAX_VALUE;

    public static void a(int i) {
        a = i;
    }

    public static void a(bs bsVar, byte b) throws az {
        a(bsVar, b, a);
    }

    public static void a(bs bsVar, byte b, int i) throws az {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    bsVar.t();
                    return;
                case 3:
                    bsVar.u();
                    return;
                case 4:
                    bsVar.y();
                    return;
                case 5:
                case 7:
                case 9:
                default:
                    return;
                case 6:
                    bsVar.v();
                    return;
                case 8:
                    bsVar.w();
                    return;
                case 10:
                    bsVar.x();
                    return;
                case 11:
                    bsVar.A();
                    return;
                case 12:
                    bsVar.j();
                    while (true) {
                        byte b2 = bsVar.l().b;
                        if (b2 == 0) {
                            bsVar.k();
                            return;
                        } else {
                            a(bsVar, b2, i - 1);
                            bsVar.m();
                        }
                    }
                    break;
                case 13:
                    bp bpVarN = bsVar.n();
                    while (i2 < bpVarN.c) {
                        int i3 = i - 1;
                        a(bsVar, bpVarN.a, i3);
                        a(bsVar, bpVarN.b, i3);
                        i2++;
                    }
                    bsVar.o();
                    return;
                case 14:
                    bw bwVarR = bsVar.r();
                    while (i2 < bwVarR.b) {
                        a(bsVar, bwVarR.a, i - 1);
                        i2++;
                    }
                    bsVar.s();
                    return;
                case 15:
                    bo boVarP = bsVar.p();
                    while (i2 < boVarP.b) {
                        a(bsVar, boVarP.a, i - 1);
                        i2++;
                    }
                    bsVar.q();
                    return;
            }
        } else {
            throw new az("Maximum skip depth exceeded");
        }
    }

    public static bu a(byte[] bArr, bu buVar) {
        if (bArr[0] > 16) {
            return new bm.a();
        }
        return (bArr.length <= 1 || (bArr[1] & ByteCompanionObject.MIN_VALUE) == 0) ? buVar : new bm.a();
    }
}
