package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import o00OO0.OooO0OO;
import o00OO0.Oooo0;
import p134o00OO0o.o00000;
import p134o00OO0o.oo000o;
import p136o00OO0oO.OooO;

/* JADX INFO: loaded from: classes2.dex */
public final class PolystarShape implements OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo000o f11881OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f11882OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Type f11883OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo000o f11884OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000<PointF, PointF> f11885OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final oo000o f11886OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final oo000o f11887OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final oo000o f11888OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final oo000o f11889OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f11890OooOO0;

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

    public PolystarShape(String str, Type type, oo000o oo000oVar, o00000<PointF, PointF> o00000Var, oo000o oo000oVar2, oo000o oo000oVar3, oo000o oo000oVar4, oo000o oo000oVar5, oo000o oo000oVar6, boolean z) {
        this.f11882OooO00o = str;
        this.f11883OooO0O0 = type;
        this.f11884OooO0OO = oo000oVar;
        this.f11885OooO0Oo = o00000Var;
        this.f11887OooO0o0 = oo000oVar2;
        this.f11886OooO0o = oo000oVar3;
        this.f11888OooO0oO = oo000oVar4;
        this.f11889OooO0oo = oo000oVar5;
        this.f11881OooO = oo000oVar6;
        this.f11890OooOO0 = z;
    }

    @Override // p136o00OO0oO.OooO
    public final OooO0OO OooO00o(LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.OooO00o oooO00o) {
        return new Oooo0(lottieDrawable, oooO00o, this);
    }
}
