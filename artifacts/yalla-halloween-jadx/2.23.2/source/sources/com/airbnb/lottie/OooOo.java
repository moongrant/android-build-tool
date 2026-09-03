package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f11842OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f11843OooO0O0;

    public OooOo(String str) {
        this.f11843OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0OO.OooO0oo(new ByteArrayInputStream(this.f11842OooO00o.getBytes())));
        String[] strArr = JsonReader.f12022OooO0oo;
        return OooOO0O.OooO0Oo(new com.airbnb.lottie.parser.moshi.OooO00o(o0o0000VarOooO0O0), this.f11843OooO0O0, true);
    }
}
