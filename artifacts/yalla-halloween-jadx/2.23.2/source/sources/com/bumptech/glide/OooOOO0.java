package com.bumptech.glide;

import android.os.Trace;
import java.util.List;
import p167o00Ooo0.o00oO0o;
import p174o00OooOo.o00O0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o00O0OO<Registry> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f12967OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f12968OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ List f12969OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00oO0o f12970OooO0Oo;

    public OooOOO0(OooO0OO oooO0OO, List list, o00oO0o o00oo0o2) {
        this.f12968OooO0O0 = oooO0OO;
        this.f12969OooO0OO = list;
        this.f12970OooO0Oo = o00oo0o2;
    }

    @Override // p174o00OooOo.o00O0OO
    public final Registry get() {
        if (this.f12967OooO00o) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f12967OooO00o = true;
        try {
            return OooOOO.OooO00o(this.f12968OooO0O0, this.f12969OooO0OO, this.f12970OooO0Oo);
        } finally {
            this.f12967OooO00o = false;
            Trace.endSection();
        }
    }
}
