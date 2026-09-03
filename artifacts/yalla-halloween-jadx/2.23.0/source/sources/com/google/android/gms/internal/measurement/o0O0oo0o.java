package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0oo0o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O00oO0 f15556OooO0O0 = new o0O00oO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O0O0O f15557OooO00o;

    public o0O0oo0o() {
        o0O0OOO0 o0o0ooo0;
        o0O0OOO0[] o0o0ooo0Arr = new o0O0OOO0[2];
        o0o0ooo0Arr[0] = o0O00O0o.f15535OooO00o;
        try {
            o0o0ooo0 = (o0O0OOO0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0o0ooo0 = f15556OooO0O0;
        }
        o0o0ooo0Arr[1] = o0o0ooo0;
        o0O0O0O o0o0o0o = new o0O0O0O(o0o0ooo0Arr);
        Charset charset = zzlj.f15753OooO00o;
        this.f15557OooO00o = o0o0o0o;
    }
}
