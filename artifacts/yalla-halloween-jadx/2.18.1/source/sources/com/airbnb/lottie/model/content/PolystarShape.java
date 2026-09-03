package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import p118o00O0Oo.OooOO0;
import p118o00O0Oo.o00O0O;
import p123o00O0o0.OooOO0O;
import p123o00O0o0.o00Oo0;
import p125o00O0o0O.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class PolystarShape implements o000OOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooOO0O f10111OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f10112OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f10113OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O f10114OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00Oo0<PointF, PointF> f10115OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O f10116OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O f10117OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O f10118OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O f10119OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f10120OooOO0;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public static Type OooO00o(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(String str, Type type, OooOO0O oooOO0O, o00Oo0<PointF, PointF> o00oo1, OooOO0O oooOO0O2, OooOO0O oooOO0O3, OooOO0O oooOO0O4, OooOO0O oooOO0O5, OooOO0O oooOO0O6, boolean z) {
        this.f10112OooO00o = str;
        this.f10113OooO0O0 = type;
        this.f10114OooO0OO = oooOO0O;
        this.f10115OooO0Oo = o00oo1;
        this.f10117OooO0o0 = oooOO0O2;
        this.f10116OooO0o = oooOO0O3;
        this.f10118OooO0oO = oooOO0O4;
        this.f10119OooO0oo = oooOO0O5;
        this.f10111OooO = oooOO0O6;
        this.f10120OooOO0 = z;
    }

    @Override // p125o00O0o0O.o000OOo
    public final OooOO0 OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new o00O0O(lottieDrawable, oooO00o, this);
    }
}
