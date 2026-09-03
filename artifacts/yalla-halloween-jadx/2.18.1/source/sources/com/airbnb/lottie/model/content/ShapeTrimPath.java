package com.airbnb.lottie.model.content;

import com.airbnb.lottie.LottieDrawable;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.o0ooOOo;
import p123o00O0o0.OooOO0O;
import p125o00O0o0O.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class ShapeTrimPath implements o000OOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10133OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f10134OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f10135OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O f10136OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f10137OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f10138OooO0o0;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY
    }

    public ShapeTrimPath(String str, Type type, OooOO0O oooOO0O, OooOO0O oooOO0O2, OooOO0O oooOO0O3, boolean z) {
        this.f10133OooO00o = str;
        this.f10134OooO0O0 = type;
        this.f10135OooO0OO = oooOO0O;
        this.f10136OooO0Oo = oooOO0O2;
        this.f10138OooO0o0 = oooOO0O3;
        this.f10137OooO0o = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o0ooOOo(oooO00o, this);
    }

    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Trim Path: {start: ");
        sbOooO0o0.append(this.f10135OooO0OO);
        sbOooO0o0.append(", end: ");
        sbOooO0o0.append(this.f10136OooO0Oo);
        sbOooO0o0.append(", offset: ");
        sbOooO0o0.append(this.f10138OooO0o0);
        sbOooO0o0.append("}");
        return sbOooO0o0.toString();
    }
}
