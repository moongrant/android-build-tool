package o00OO0O0;

import android.graphics.Color;
import androidx.annotation.Nullable;
import p133o00OO00o.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o00OO0O0.OooO00o.InterfaceC0423OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00OO0O0.OooO00o.InterfaceC0423OooO00o f37252OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f37253OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f37254OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f37255OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f37256OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f37257OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f37258OooO0oO = true;

    public class OooO00o extends o00OOO0O.OooO0OO<Float> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o00OOO0O.OooO0OO f37259OooO0OO;

        public OooO00o(o00OOO0O.OooO0OO oooO0OO) {
            this.f37259OooO0OO = oooO0OO;
        }

        @Override // o00OOO0O.OooO0OO
        @Nullable
        public final Float OooO00o(o00OOO0O.OooO0O0<Float> oooO0O0) {
            Float f = (Float) this.f37259OooO0OO.OooO00o(oooO0O0);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public OooO0OO(o00OO0O0.OooO00o.InterfaceC0423OooO00o interfaceC0423OooO00o, com.airbnb.lottie.model.layer.OooO00o oooO00o, o00OO.OooOOOO oooOOOO) {
        this.f37252OooO00o = interfaceC0423OooO00o;
        o00OO0O0.OooO00o<Integer, Integer> OooO00o2 = oooOOOO.f36868OooO00o.OooO00o();
        this.f37253OooO0O0 = (OooO0O0) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
        o00OO0O0.OooO00o<Float, Float> OooO00o3 = oooOOOO.f36869OooO0O0.OooO00o();
        this.f37254OooO0OO = (OooO0o) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00OO0O0.OooO00o<Float, Float> OooO00o4 = oooOOOO.f36870OooO0OO.OooO00o();
        this.f37255OooO0Oo = (OooO0o) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
        o00OO0O0.OooO00o<Float, Float> OooO00o5 = oooOOOO.f36871OooO0Oo.OooO00o();
        this.f37257OooO0o0 = (OooO0o) OooO00o5;
        OooO00o5.OooO00o(this);
        oooO00o.OooO0oO(OooO00o5);
        o00OO0O0.OooO00o<Float, Float> OooO00o6 = oooOOOO.f36872OooO0o0.OooO00o();
        this.f37256OooO0o = (OooO0o) OooO00o6;
        OooO00o6.OooO00o(this);
        oooO00o.OooO0oO(OooO00o6);
    }

    public final void OooO00o(o0ooOOo o0ooooo) {
        if (this.f37258OooO0oO) {
            this.f37258OooO0oO = false;
            double dFloatValue = ((double) this.f37255OooO0Oo.OooO0o().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f37257OooO0o0.OooO0o().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f37253OooO0O0.OooO0o().intValue();
            o0ooooo.setShadowLayer(this.f37256OooO0o.OooO0o().floatValue(), fSin, fCos, Color.argb(Math.round(this.f37254OooO0OO.OooO0o().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // o00OO0O0.OooO00o.InterfaceC0423OooO00o
    public final void OooO0O0() {
        this.f37258OooO0oO = true;
        this.f37252OooO00o.OooO0O0();
    }

    public final void OooO0OO(@Nullable o00OOO0O.OooO0OO<Float> oooO0OO) {
        OooO0o oooO0o = this.f37254OooO0OO;
        if (oooO0OO == null) {
            oooO0o.OooOO0O(null);
        } else {
            oooO0o.OooOO0O(new OooO00o(oooO0OO));
        }
    }
}
