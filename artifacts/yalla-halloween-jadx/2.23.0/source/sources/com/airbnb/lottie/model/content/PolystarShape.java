package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o00O000.OooO0OO;
import o00O000.Oooo0;
import o00O00OO.OooO0O0;
import o00O00OO.Oooo000;
import p113o00O00Oo.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class PolystarShape implements o00O0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO0O0 f8791OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f8792OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f8793OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0O0 f8794OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Oooo000<PointF, PointF> f8795OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0O0 f8796OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0O0 f8797OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO0O0 f8798OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0O0 f8799OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f8800OooOO0;

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

    public PolystarShape(String str, Type type, OooO0O0 oooO0O0, Oooo000<PointF, PointF> oooo000, OooO0O0 oooO0O1, OooO0O0 oooO0O2, OooO0O0 oooO0O3, OooO0O0 oooO0O4, OooO0O0 oooO0O5, boolean z) {
        this.f8792OooO00o = str;
        this.f8793OooO0O0 = type;
        this.f8794OooO0OO = oooO0O0;
        this.f8795OooO0Oo = oooo000;
        this.f8797OooO0o0 = oooO0O1;
        this.f8796OooO0o = oooO0O2;
        this.f8798OooO0oO = oooO0O3;
        this.f8799OooO0oo = oooO0O4;
        this.f8791OooO = oooO0O5;
        this.f8800OooOO0 = z;
    }

    @Override // p113o00O00Oo.o00O0O
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new Oooo0(lottieDrawable, oooO00o, this);
    }
}
