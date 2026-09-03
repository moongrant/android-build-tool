package com.airbnb.lottie;

import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 implements Callable<o00Ooo<OooOO0>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ZipInputStream f11849OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ String f11850OooO0O0 = null;

    public Oooo000(ZipInputStream zipInputStream) {
        this.f11849OooO00o = zipInputStream;
    }

    @Override // java.util.concurrent.Callable
    public final o00Ooo<OooOO0> call() throws Exception {
        return OooOO0O.OooO0oO(this.f11849OooO00o, this.f11850OooO0O0);
    }
}
