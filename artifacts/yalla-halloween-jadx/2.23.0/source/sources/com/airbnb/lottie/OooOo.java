package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f8752OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f8753OooO0O0;

    public OooOo(String str) {
        this.f8753OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(new ByteArrayInputStream(this.f8752OooO00o.getBytes())));
        String[] strArr = JsonReader.f8932OooO0oo;
        return OooOO0O.OooO0Oo(new com.airbnb.lottie.parser.moshi.OooO00o(o00o0000OooO0O0), this.f8753OooO0O0, true);
    }
}
