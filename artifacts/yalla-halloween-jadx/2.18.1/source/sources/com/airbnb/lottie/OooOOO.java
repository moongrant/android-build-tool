package com.airbnb.lottie;

import java.io.InputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements Callable<o0OoOo0<OooOO0O>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ InputStream f10055OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f10056OooO0O0 = null;

    public OooOOO(InputStream inputStream) {
        this.f10055OooO00o = inputStream;
    }

    @Override // java.util.concurrent.Callable
    public final o0OoOo0<OooOO0O> call() throws Exception {
        return OooOOO0.OooO0o0(this.f10055OooO00o, this.f10056OooO0O0);
    }
}
