package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Charset f19395OooO00o = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f19396OooO0O0;

    public interface OooO extends OooOOO0<Float> {
    }

    public interface OooO00o extends OooOOO0<Boolean> {
    }

    public interface OooO0O0 extends OooOOO0<Double> {
    }

    public interface OooO0OO {
    }

    public interface OooO0o<T extends OooO0OO> {
    }

    public interface OooOO0 extends OooOOO0<Integer> {
    }

    public interface OooOO0O extends OooOOO0<Long> {
    }

    public interface OooOOO0<E> extends List<E>, RandomAccess {
        OooOOO0<E> OooOoO(int i);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f19396OooO0O0 = bArr;
        ByteBuffer.wrap(bArr);
        com.google.protobuf.OooOO0O.OooO0Oo(bArr, 0, bArr.length);
    }

    public static int OooO00o(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int OooO0O0(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
