package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
public class bm extends bs {
    private static final bx d = new bx("");
    private static final bn e = new bn("", (byte) 0, 0);
    private static final byte[] f = {0, 0, 1, 3, 7, 0, 4, 0, 5, 0, 6, 8, 12, 11, 10, 9};
    private static final byte h = -126;
    private static final byte i = 1;
    private static final byte j = 31;
    private static final byte k = -32;
    private static final int l = 5;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    private ar m;
    private short n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private bn f20242o;
    private Boolean p;
    private final long q;
    private byte[] r;

    public static class b {
        public static final byte a = 1;
        public static final byte b = 2;
        public static final byte c = 3;
        public static final byte d = 4;
        public static final byte e = 5;
        public static final byte f = 6;
        public static final byte g = 7;
        public static final byte h = 8;
        public static final byte i = 9;
        public static final byte j = 10;
        public static final byte k = 11;
        public static final byte l = 12;

        private b() {
        }
    }

    public bm(cg cgVar, long j2) {
        super(cgVar);
        this.m = new ar(15);
        this.n = (short) 0;
        this.f20242o = null;
        this.p = null;
        this.a = new byte[5];
        this.b = new byte[10];
        this.r = new byte[1];
        this.c = new byte[1];
        this.q = j2;
    }

    private int E() throws az {
        int i2 = 0;
        if (this.g.h() >= 5) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                i3 |= (b2 & ByteCompanionObject.MAX_VALUE) << i4;
                if ((b2 & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.g.a(i2 + 1);
                    return i3;
                }
                i4 += 7;
                i2++;
            }
        } else {
            int i5 = 0;
            while (true) {
                byte bU = u();
                i2 |= (bU & ByteCompanionObject.MAX_VALUE) << i5;
                if ((bU & ByteCompanionObject.MIN_VALUE) != 128) {
                    return i2;
                }
                i5 += 7;
            }
        }
    }

    private long F() throws az {
        int i2 = 0;
        long j2 = 0;
        if (this.g.h() >= 10) {
            byte[] bArrF = this.g.f();
            int iG = this.g.g();
            long j3 = 0;
            int i3 = 0;
            while (true) {
                byte b2 = bArrF[iG + i2];
                j3 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i3;
                if ((b2 & ByteCompanionObject.MIN_VALUE) != 128) {
                    this.g.a(i2 + 1);
                    return j3;
                }
                i3 += 7;
                i2++;
            }
        } else {
            while (true) {
                byte bU = u();
                j2 |= ((long) (bU & ByteCompanionObject.MAX_VALUE)) << i2;
                if ((bU & ByteCompanionObject.MIN_VALUE) != 128) {
                    return j2;
                }
                i2 += 7;
            }
        }
    }

    private int c(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    private long c(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    private boolean c(byte b2) {
        int i2 = b2 & bz.m;
        return i2 == 1 || i2 == 2;
    }

    private long d(long j2) {
        return (-(j2 & 1)) ^ (j2 >>> 1);
    }

    private byte[] e(int i2) throws az {
        if (i2 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i2];
        this.g.d(bArr, 0, i2);
        return bArr;
    }

    private void f(int i2) throws bt {
        if (i2 < 0) {
            throw new bt(android.support.v4.media.OooO00o.OooO00o("Negative length: ", i2));
        }
        long j2 = this.q;
        if (j2 != -1 && i2 > j2) {
            throw new bt(android.support.v4.media.OooO00o.OooO00o("Length exceeded max allowed: ", i2));
        }
    }

    private int g(int i2) {
        return (-(i2 & 1)) ^ (i2 >>> 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public ByteBuffer A() throws az {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return ByteBuffer.wrap(new byte[0]);
        }
        byte[] bArr = new byte[iE];
        this.g.d(bArr, 0, iE);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void B() {
        this.m.c();
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bs
    public void a() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bq bqVar) throws az {
        b(h);
        d(((bqVar.b << 5) & (-32)) | 1);
        b(bqVar.c);
        a(bqVar.a);
    }

    @Override // com.umeng.analytics.pro.bs
    public void b() throws az {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.bs
    public void c() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void d() throws az {
        b((byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void e() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void f() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public void g() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bq h() throws az {
        byte bU = u();
        if (bU != -126) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Expected protocol id ");
            sbOooO0o0.append(Integer.toHexString(-126));
            sbOooO0o0.append(" but got ");
            sbOooO0o0.append(Integer.toHexString(bU));
            throw new bt(sbOooO0o0.toString());
        }
        byte bU2 = u();
        byte b2 = (byte) (bU2 & j);
        if (b2 != 1) {
            throw new bt(android.support.v4.media.OooO00o.OooO00o("Expected version 1 but got ", b2));
        }
        int iE = E();
        return new bq(z(), (byte) ((bU2 >> 5) & 3), iE);
    }

    @Override // com.umeng.analytics.pro.bs
    public void i() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bx j() throws az {
        this.m.a(this.n);
        this.n = (short) 0;
        return d;
    }

    @Override // com.umeng.analytics.pro.bs
    public void k() throws az {
        this.n = this.m.a();
    }

    @Override // com.umeng.analytics.pro.bs
    public bn l() throws az {
        byte bU = u();
        if (bU == 0) {
            return e;
        }
        short s = (short) ((bU & 240) >> 4);
        short sV = s == 0 ? v() : (short) (this.n + s);
        byte b2 = (byte) (bU & bz.m);
        bn bnVar = new bn("", d(b2), sV);
        if (c(bU)) {
            this.p = b2 == 1 ? Boolean.TRUE : Boolean.FALSE;
        }
        this.n = bnVar.c;
        return bnVar;
    }

    @Override // com.umeng.analytics.pro.bs
    public void m() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bp n() throws az {
        int iE = E();
        byte bU = iE == 0 ? (byte) 0 : u();
        return new bp(d((byte) (bU >> 4)), d((byte) (bU & bz.m)), iE);
    }

    @Override // com.umeng.analytics.pro.bs
    public void o() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bo p() throws az {
        byte bU = u();
        int iE = (bU >> 4) & 15;
        if (iE == 15) {
            iE = E();
        }
        return new bo(d(bU), iE);
    }

    @Override // com.umeng.analytics.pro.bs
    public void q() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public bw r() throws az {
        return new bw(p());
    }

    @Override // com.umeng.analytics.pro.bs
    public void s() throws az {
    }

    @Override // com.umeng.analytics.pro.bs
    public boolean t() throws az {
        Boolean bool = this.p;
        if (bool == null) {
            return u() == 1;
        }
        boolean zBooleanValue = bool.booleanValue();
        this.p = null;
        return zBooleanValue;
    }

    @Override // com.umeng.analytics.pro.bs
    public byte u() throws az {
        if (this.g.h() <= 0) {
            this.g.d(this.c, 0, 1);
            return this.c[0];
        }
        byte b2 = this.g.f()[this.g.g()];
        this.g.a(1);
        return b2;
    }

    @Override // com.umeng.analytics.pro.bs
    public short v() throws az {
        return (short) g(E());
    }

    @Override // com.umeng.analytics.pro.bs
    public int w() throws az {
        return g(E());
    }

    @Override // com.umeng.analytics.pro.bs
    public long x() throws az {
        return d(F());
    }

    @Override // com.umeng.analytics.pro.bs
    public double y() throws az {
        byte[] bArr = new byte[8];
        this.g.d(bArr, 0, 8);
        return Double.longBitsToDouble(a(bArr));
    }

    @Override // com.umeng.analytics.pro.bs
    public String z() throws az {
        int iE = E();
        f(iE);
        if (iE == 0) {
            return "";
        }
        try {
            if (this.g.h() < iE) {
                return new String(e(iE), "UTF-8");
            }
            String str = new String(this.g.f(), this.g.g(), iE, "UTF-8");
            this.g.a(iE);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new az("UTF-8 not supported!");
        }
    }

    public static class a implements bu {
        private final long a;

        public a() {
            this.a = -1L;
        }

        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            return new bm(cgVar, this.a);
        }

        public a(int i) {
            this.a = i;
        }
    }

    private void b(int i2) throws az {
        int i3 = 0;
        while ((i2 & (-128)) != 0) {
            this.a[i3] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i3++;
        }
        byte[] bArr = this.a;
        bArr[i3] = (byte) i2;
        this.g.b(bArr, 0, i3 + 1);
    }

    private void d(int i2) throws az {
        b((byte) i2);
    }

    private byte d(byte b2) throws bt {
        byte b3 = (byte) (b2 & bz.m);
        switch (b3) {
            case 0:
                return (byte) 0;
            case 1:
            case 2:
                return (byte) 2;
            case 3:
                return (byte) 3;
            case 4:
                return (byte) 6;
            case 5:
                return (byte) 8;
            case 6:
                return (byte) 10;
            case 7:
                return (byte) 4;
            case 8:
                return (byte) 11;
            case 9:
                return bz.m;
            case 10:
                return bz.l;
            case 11:
                return bz.k;
            case 12:
                return (byte) 12;
            default:
                throw new bt(android.support.v4.media.OooO00o.OooO00o("don't know what type: ", b3));
        }
    }

    private byte e(byte b2) {
        return f[b2];
    }

    private void b(long j2) throws az {
        int i2 = 0;
        while (((-128) & j2) != 0) {
            this.b[i2] = (byte) ((127 & j2) | 128);
            j2 >>>= 7;
            i2++;
        }
        byte[] bArr = this.b;
        bArr[i2] = (byte) j2;
        this.g.b(bArr, 0, i2 + 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bx bxVar) throws az {
        this.m.a(this.n);
        this.n = (short) 0;
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bn bnVar) throws az {
        if (bnVar.b == 2) {
            this.f20242o = bnVar;
        } else {
            a(bnVar, (byte) -1);
        }
    }

    private void b(byte b2) throws az {
        byte[] bArr = this.r;
        bArr[0] = b2;
        this.g.b(bArr);
    }

    private void a(bn bnVar, byte b2) throws az {
        if (b2 == -1) {
            b2 = e(bnVar.b);
        }
        short s = bnVar.c;
        short s2 = this.n;
        if (s > s2 && s - s2 <= 15) {
            d(b2 | ((s - s2) << 4));
        } else {
            b(b2);
            a(bnVar.c);
        }
        this.n = bnVar.c;
    }

    public bm(cg cgVar) {
        this(cgVar, -1L);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bp bpVar) throws az {
        int i2 = bpVar.c;
        if (i2 == 0) {
            d(0);
            return;
        }
        b(i2);
        d(e(bpVar.b) | (e(bpVar.a) << 4));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bo boVar) throws az {
        a(boVar.a, boVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bw bwVar) throws az {
        a(bwVar.a, bwVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(boolean z) throws az {
        bn bnVar = this.f20242o;
        if (bnVar != null) {
            a(bnVar, z ? (byte) 1 : (byte) 2);
            this.f20242o = null;
        } else {
            b(z ? (byte) 1 : (byte) 2);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(byte b2) throws az {
        b(b2);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(short s) throws az {
        b(c((int) s));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(int i2) throws az {
        b(c(i2));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(long j2) throws az {
        b(c(j2));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(double d2) throws az {
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 0};
        a(Double.doubleToLongBits(d2), bArr, 0);
        this.g.b(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(String str) throws az {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new az("UTF-8 not supported!");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(ByteBuffer byteBuffer) throws az {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private void a(byte[] bArr, int i2, int i3) throws az {
        b(i3);
        this.g.b(bArr, i2, i3);
    }

    public void a(byte b2, int i2) throws az {
        if (i2 <= 14) {
            d(e(b2) | (i2 << 4));
        } else {
            d(e(b2) | 240);
            b(i2);
        }
    }

    private void a(long j2, byte[] bArr, int i2) {
        bArr[i2 + 0] = (byte) (j2 & 255);
        bArr[i2 + 1] = (byte) ((j2 >> 8) & 255);
        bArr[i2 + 2] = (byte) ((j2 >> 16) & 255);
        bArr[i2 + 3] = (byte) ((j2 >> 24) & 255);
        bArr[i2 + 4] = (byte) ((j2 >> 32) & 255);
        bArr[i2 + 5] = (byte) ((j2 >> 40) & 255);
        bArr[i2 + 6] = (byte) ((j2 >> 48) & 255);
        bArr[i2 + 7] = (byte) ((j2 >> 56) & 255);
    }

    private long a(byte[] bArr) {
        return ((((long) bArr[7]) & 255) << 56) | ((((long) bArr[6]) & 255) << 48) | ((((long) bArr[5]) & 255) << 40) | ((((long) bArr[4]) & 255) << 32) | ((((long) bArr[3]) & 255) << 24) | ((((long) bArr[2]) & 255) << 16) | ((((long) bArr[1]) & 255) << 8) | (255 & ((long) bArr[0]));
    }
}
