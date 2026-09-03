package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o00O000.OooO0OO;
import o00O000.o00Ooo;
import o00O00OO.OooO0O0;
import p113o00O00Oo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class ShapeTrimPath implements o00O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Type f8813OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f8814OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f8815OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0O0 f8816OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f8817OooO0o0;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, OooO0O0 oooO0O0, OooO0O0 oooO0O1, OooO0O0 oooO0O2, boolean z) {
        this.f8813OooO00o = type;
        this.f8814OooO0O0 = oooO0O0;
        this.f8815OooO0OO = oooO0O1;
        this.f8816OooO0Oo = oooO0O2;
        this.f8817OooO0o0 = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00Ooo(oooO00o, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f8814OooO0O0 + ", end: " + this.f8815OooO0OO + ", offset: " + this.f8816OooO0Oo + "}";
    }
}
