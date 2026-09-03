package io.opentelemetry.api.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class TemporaryBuffers {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<char[]> f33053OooO00o = new ThreadLocal<>();

    private TemporaryBuffers() {
    }

    public static char[] OooO00o(int i) {
        ThreadLocal<char[]> threadLocal = f33053OooO00o;
        char[] cArr = threadLocal.get();
        if (cArr != null && cArr.length >= i) {
            return cArr;
        }
        char[] cArr2 = new char[i];
        threadLocal.set(cArr2);
        return cArr2;
    }
}
