package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import o00OO0.OooO0OO;
import o00OO0.o00Ooo;
import p134o00OO0o.oo000o;
import p136o00OO0oO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class ShapeTrimPath implements OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Type f11903OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo000o f11904OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o f11905OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final oo000o f11906OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f11907OooO0o0;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, oo000o oo000oVar, oo000o oo000oVar2, oo000o oo000oVar3, boolean z) {
        this.f11903OooO00o = type;
        this.f11904OooO0O0 = oo000oVar;
        this.f11905OooO0OO = oo000oVar2;
        this.f11906OooO0Oo = oo000oVar3;
        this.f11907OooO0o0 = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00Ooo(oooO00o, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f11904OooO0O0 + ", end: " + this.f11905OooO0OO + ", offset: " + this.f11906OooO0Oo + "}";
    }
}
