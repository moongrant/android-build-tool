package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.ByteArrayInputStream;
import java.util.concurrent.Callable;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0oOOo;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements Callable<o0OoOo0<OooOO0O>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ String f10072OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f10073OooO0O0;

    public OooOOOO(String str) {
        this.f10073OooO0O0 = str;
    }

    @Override // java.util.concurrent.Callable
    public final o0OoOo0<OooOO0O> call() throws Exception {
        String str = this.f10072OooO00o;
        String str2 = this.f10073OooO0O0;
        o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(o0O000Oo.OooO(new ByteArrayInputStream(str.getBytes())));
        String[] strArr = JsonReader.f10250OoooO00;
        return OooOOO0.OooO0o(new com.airbnb.lottie.parser.moshi.OooO00o(o0ooooOooO0OO), str2, true);
    }
}
