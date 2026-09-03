package com.bumptech.glide;

import android.os.Trace;
import java.util.List;
import p134o00OO0oo.oo000o;
import p532o0o0Oo.o00000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO0 implements o00000O0<Registry> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f9876OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f9877OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ List f9878OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo000o f9879OooO0Oo;

    public OooOOO0(OooO0OO oooO0OO, List list, oo000o oo000oVar) {
        this.f9877OooO0O0 = oooO0OO;
        this.f9878OooO0OO = list;
        this.f9879OooO0Oo = oo000oVar;
    }

    @Override // p532o0o0Oo.o00000O0
    public final Registry get() {
        if (this.f9876OooO00o) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.f9876OooO00o = true;
        try {
            return OooOOO.OooO00o(this.f9877OooO0O0, this.f9878OooO0OO, this.f9879OooO0Oo);
        } finally {
            this.f9876OooO00o = false;
            Trace.endSection();
        }
    }
}
