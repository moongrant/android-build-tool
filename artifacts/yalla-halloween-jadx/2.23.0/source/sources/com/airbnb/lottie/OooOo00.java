package com.airbnb.lottie;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InputStream f8754OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f8755OooO0O0 = null;

    public OooOo00(InputStream inputStream) {
        this.f8754OooO00o = inputStream;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        return OooOO0O.OooO0OO(this.f8754OooO00o, this.f8755OooO0O0);
    }
}
