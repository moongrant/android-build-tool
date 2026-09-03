package com.airbnb.lottie.model.content;

import o00O00OO.OooO0o;
import o00O00OO.OooOOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class Mask {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaskMode f8772OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f8773OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f8774OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f8775OooO0Oo;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, OooOOO0 oooOOO0, OooO0o oooO0o, boolean z) {
        this.f8772OooO00o = maskMode;
        this.f8773OooO0O0 = oooOOO0;
        this.f8774OooO0OO = oooO0o;
        this.f8775OooO0Oo = z;
    }
}
