package com.airbnb.lottie.model.content;

import p134o00OO0o.o0ooOOo;
import p134o00OO0o.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class Mask {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final MaskMode f11862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0o0Oo f11863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0ooOOo f11864OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f11865OooO0Oo;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(MaskMode maskMode, oo0o0Oo oo0o0oo, o0ooOOo o0ooooo, boolean z) {
        this.f11862OooO00o = maskMode;
        this.f11863OooO0O0 = oo0o0oo;
        this.f11864OooO0OO = o0ooooo;
        this.f11865OooO0Oo = z;
    }
}
