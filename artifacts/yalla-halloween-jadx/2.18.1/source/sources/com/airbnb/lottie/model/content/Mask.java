package com.airbnb.lottie.model.content;

import p123o00O0o0.OooOOO;
import p123o00O0o0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
public final class Mask {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaskMode f10091OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f10092OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO f10093OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f10094OooO0Oo;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, Oooo000 oooo000, OooOOO oooOOO, boolean z) {
        this.f10091OooO00o = maskMode;
        this.f10092OooO0O0 = oooo000;
        this.f10093OooO0OO = oooOOO;
        this.f10094OooO0Oo = z;
    }
}
