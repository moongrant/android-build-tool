package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0O0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final o0O0O0O f15074OooO0O0 = new o0O0O0O();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0oO0O0o f15075OooO00o;

    public o0O0O0Oo() {
        o0O0OOOo o0o0oooo;
        o0O0OOOo[] o0o0ooooArr = new o0O0OOOo[2];
        o0o0ooooArr[0] = o0O00O.f15057OooO00o;
        try {
            o0o0oooo = (o0O0OOOo) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o0o0oooo = f15074OooO0O0;
        }
        o0o0ooooArr[1] = o0o0oooo;
        o0oO0O0o o0oo0o0o2 = new o0oO0O0o(o0o0ooooArr);
        Charset charset = zzlj.f15277OooO00o;
        this.f15075OooO00o = o0oo0o0o2;
    }
}
