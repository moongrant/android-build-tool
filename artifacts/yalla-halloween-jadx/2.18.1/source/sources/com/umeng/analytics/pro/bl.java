package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public class bl extends bs {
    public static final int a = -65536;
    public static final int b = -2147418112;
    private static final bx h = new bx();
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private byte[] f20241o;
    private byte[] p;

    public static class a implements bu {
        public boolean a;
        public boolean b;
        public int c;

        public a() {
            this(false, true);
        }

        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            bl blVar = new bl(cgVar, this.a, this.b);
            int i = this.c;
            if (i != 0) {
                blVar.c(i);
            }
            return blVar;
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.a = z;
            this.b = z2;
            this.c = i;
        }
    }

    public bl(cg cgVar) {
        this(cgVar, false, true);
    }

    @Override // com.umeng.analytics.pro.bs
    public ByteBuffer A() throws az {
        int iW = w();
        d(iW);
        if (this.g.h() >= iW) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.g.f(), this.g.g(), iW);
            this.g.a(iW);
            return byteBufferWrap;
        }
        byte[] bArr = new byte[iW];
        this.g.d(bArr, 0, iW);
        return ByteBuffer.wrap(bArr);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bq bqVar) throws az {
        if (this.d) {
            a((-2147418112) | bqVar.b);
            a(bqVar.a);
            a(bqVar.c);
        } else {
            a(bqVar.a);
            a(bqVar.b);
            a(bqVar.c);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bx bxVar) {
    }

    public String b(int i) throws az {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void b() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void c() {
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    @Override // com.umeng.analytics.pro.bs
    public void d() throws az {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void e() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void f() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void g() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bq h() throws az {
        int iW = w();
        if (iW < 0) {
            if (((-65536) & iW) == -2147418112) {
                return new bq(z(), (byte) (iW & KotlinVersion.MAX_COMPONENT_VALUE), w());
            }
            throw new bt(4, "Bad version in readMessageBegin");
        }
        if (this.c) {
            throw new bt(4, "Missing version in readMessageBegin, old client?");
        }
        return new bq(b(iW), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void i() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bx j() {
        return h;
    }

    @Override // com.umeng.analytics.pro.bs
    public void k() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bn l() throws az {
        byte bU = u();
        return new bn("", bU, bU == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.bs
    public void m() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bp n() throws az {
        return new bp(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void o() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bo p() throws az {
        return new bo(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void q() {
    }

    @Override // com.umeng.analytics.pro.bs
    public bw r() throws az {
        return new bw(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public void s() {
    }

    @Override // com.umeng.analytics.pro.bs
    public boolean t() throws az {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.bs
    public byte u() throws az {
        if (this.g.h() < 1) {
            a(this.m, 0, 1);
            return this.m[0];
        }
        byte b2 = this.g.f()[this.g.g()];
        this.g.a(1);
        return b2;
    }

    @Override // com.umeng.analytics.pro.bs
    public short v() throws az {
        byte[] bArrF = this.n;
        int iG = 0;
        if (this.g.h() >= 2) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
        }
        return (short) ((bArrF[iG + 1] & UByte.MAX_VALUE) | ((bArrF[iG] & UByte.MAX_VALUE) << 8));
    }

    @Override // com.umeng.analytics.pro.bs
    public int w() throws az {
        byte[] bArrF = this.f20241o;
        int iG = 0;
        if (this.g.h() >= 4) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(4);
        } else {
            a(this.f20241o, 0, 4);
        }
        return (bArrF[iG + 3] & UByte.MAX_VALUE) | ((bArrF[iG] & UByte.MAX_VALUE) << 24) | ((bArrF[iG + 1] & UByte.MAX_VALUE) << 16) | ((bArrF[iG + 2] & UByte.MAX_VALUE) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public long x() throws az {
        byte[] bArrF = this.p;
        int iG = 0;
        if (this.g.h() >= 8) {
            bArrF = this.g.f();
            iG = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
        }
        return ((long) (bArrF[iG + 7] & UByte.MAX_VALUE)) | (((long) (bArrF[iG] & UByte.MAX_VALUE)) << 56) | (((long) (bArrF[iG + 1] & UByte.MAX_VALUE)) << 48) | (((long) (bArrF[iG + 2] & UByte.MAX_VALUE)) << 40) | (((long) (bArrF[iG + 3] & UByte.MAX_VALUE)) << 32) | (((long) (bArrF[iG + 4] & UByte.MAX_VALUE)) << 24) | (((long) (bArrF[iG + 5] & UByte.MAX_VALUE)) << 16) | (((long) (bArrF[iG + 6] & UByte.MAX_VALUE)) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public double y() throws az {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.bs
    public String z() throws az {
        int iW = w();
        if (this.g.h() < iW) {
            return b(iW);
        }
        try {
            String str = new String(this.g.f(), this.g.g(), iW, "UTF-8");
            this.g.a(iW);
            return str;
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    public bl(cg cgVar, boolean z, boolean z2) {
        super(cgVar);
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.f20241o = new byte[4];
        this.p = new byte[8];
        this.c = z;
        this.d = z2;
    }

    public void d(int i) throws az {
        if (i < 0) {
            throw new bt(android.support.v4.media.OooO00o.OooO00o("Negative length: ", i));
        }
        if (this.f) {
            int i2 = this.e - i;
            this.e = i2;
            if (i2 < 0) {
                throw new bt(android.support.v4.media.OooO00o.OooO00o("Message length exceeded: ", i));
            }
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bn bnVar) throws az {
        a(bnVar.b);
        a(bnVar.c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bp bpVar) throws az {
        a(bpVar.a);
        a(bpVar.b);
        a(bpVar.c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bo boVar) throws az {
        a(boVar.a);
        a(boVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bw bwVar) throws az {
        a(bwVar.a);
        a(bwVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(boolean z) throws az {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(byte b2) throws az {
        byte[] bArr = this.i;
        bArr[0] = b2;
        this.g.b(bArr, 0, 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(short s) throws az {
        byte[] bArr = this.j;
        bArr[0] = (byte) ((s >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[1] = (byte) (s & 255);
        this.g.b(bArr, 0, 2);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(int i) throws az {
        byte[] bArr = this.k;
        bArr[0] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[1] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[2] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArr[3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
        this.g.b(bArr, 0, 4);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(long j) throws az {
        byte[] bArr = this.l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.g.b(bArr, 0, 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(double d) throws az {
        a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(String str) throws az {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(ByteBuffer byteBuffer) throws az {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        a(iLimit);
        this.g.b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), iLimit);
    }

    private int a(byte[] bArr, int i, int i2) throws az {
        d(i2);
        return this.g.d(bArr, i, i2);
    }
}
