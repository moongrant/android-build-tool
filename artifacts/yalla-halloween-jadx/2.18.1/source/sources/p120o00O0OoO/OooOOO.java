package p120o00O0OoO;

import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.Nullable;
import p127o00O0oO.o00000O0;
import p131o00O0oo0.o000000;
import p131o00O0oo0.o000000O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements OooOO0O.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O.OooO00o f30779OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0O<Integer, Integer> f30780OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30781OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30782OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30783OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30784OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f30785OooO0oO = true;

    public class OooO00o extends o000000O<Float> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o000000O f30786OooO0OO;

        public OooO00o(o000000O o000000o2) {
            this.f30786OooO0OO = o000000o2;
        }

        @Override // p131o00O0oo0.o000000O
        @Nullable
        public final Float OooO00o(o000000<Float> o000000Var) {
            Float f = (Float) this.f30786OooO0OO.OooO00o(o000000Var);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public OooOOO(OooOO0O.OooO00o oooO00o, com.airbnb.lottie.model.layer.OooO00o oooO00o2, o00000O0 o00000o1) {
        this.f30779OooO00o = oooO00o;
        OooOO0O<Integer, Integer> oooOO0OOooO00o = o00000o1.f31081OooO00o.OooO00o();
        this.f30780OooO0O0 = (OooOOO0) oooOO0OOooO00o;
        oooOO0OOooO00o.OooO00o(this);
        oooO00o2.OooO0oO(oooOO0OOooO00o);
        OooOO0O<Float, Float> oooOO0OOooO00o2 = o00000o1.f31082OooO0O0.OooO00o();
        this.f30781OooO0OO = (OooOOOO) oooOO0OOooO00o2;
        oooOO0OOooO00o2.OooO00o(this);
        oooO00o2.OooO0oO(oooOO0OOooO00o2);
        OooOO0O<Float, Float> oooOO0OOooO00o3 = o00000o1.f31083OooO0OO.OooO00o();
        this.f30782OooO0Oo = (OooOOOO) oooOO0OOooO00o3;
        oooOO0OOooO00o3.OooO00o(this);
        oooO00o2.OooO0oO(oooOO0OOooO00o3);
        OooOO0O<Float, Float> oooOO0OOooO00o4 = o00000o1.f31084OooO0Oo.OooO00o();
        this.f30784OooO0o0 = (OooOOOO) oooOO0OOooO00o4;
        oooOO0OOooO00o4.OooO00o(this);
        oooO00o2.OooO0oO(oooOO0OOooO00o4);
        OooOO0O<Float, Float> oooOO0OOooO00o5 = o00000o1.f31085OooO0o0.OooO00o();
        this.f30783OooO0o = (OooOOOO) oooOO0OOooO00o5;
        oooOO0OOooO00o5.OooO00o(this);
        oooO00o2.OooO0oO(oooOO0OOooO00o5);
    }

    public final void OooO00o(Paint paint) {
        if (this.f30785OooO0oO) {
            this.f30785OooO0oO = false;
            double dFloatValue = ((double) this.f30782OooO0Oo.OooO0o().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f30784OooO0o0.OooO0o().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f30780OooO0O0.OooO0o().intValue();
            paint.setShadowLayer(this.f30783OooO0o.OooO0o().floatValue(), fSin, fCos, Color.argb(Math.round(this.f30781OooO0OO.OooO0o().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30785OooO0oO = true;
        this.f30779OooO00o.OooO0O0();
    }

    public final void OooO0OO(@Nullable o000000O<Integer> o000000o2) {
        this.f30780OooO0O0.OooOO0O(o000000o2);
    }

    public final void OooO0Oo(@Nullable o000000O<Float> o000000o2) {
        this.f30782OooO0Oo.OooOO0O(o000000o2);
    }

    public final void OooO0o(@Nullable o000000O<Float> o000000o2) {
        if (o000000o2 == null) {
            this.f30781OooO0OO.OooOO0O(null);
        } else {
            this.f30781OooO0OO.OooOO0O(new OooO00o(o000000o2));
        }
    }

    public final void OooO0o0(@Nullable o000000O<Float> o000000o2) {
        this.f30784OooO0o0.OooOO0O(o000000o2);
    }

    public final void OooO0oO(@Nullable o000000O<Float> o000000o2) {
        this.f30783OooO0o.OooOO0O(o000000o2);
    }
}
