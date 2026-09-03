package com.airbnb.lottie;

import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final class OooOo00 implements Callable<o0OoOo0<OooOO0O>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f10078OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f10079OooO0O0 = null;

    public OooOo00(ZipInputStream zipInputStream) {
        this.f10078OooO00o = zipInputStream;
    }

    @Override // java.util.concurrent.Callable
    public final o0OoOo0<OooOO0O> call() throws Exception {
        return OooOOO0.OooOO0O(this.f10078OooO00o, this.f10079OooO0O0);
    }
}
