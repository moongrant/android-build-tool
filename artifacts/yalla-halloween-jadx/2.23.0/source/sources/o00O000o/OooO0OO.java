package o00O000o;

import android.graphics.Color;
import androidx.annotation.Nullable;
import p115o00O00oO.o0000Ooo;
import p233o00oOoo.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements o00O000o.OooO00o.InterfaceC0420OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00O000o.OooO00o.InterfaceC0420OooO00o f36287OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f36288OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0o f36289OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0o f36290OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO0o f36291OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO0o f36292OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f36293OooO0oO = true;

    public class OooO00o extends o00O0O00.OooO0OO<Float> {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ o00O0O00.OooO0OO f36294OooO0OO;

        public OooO00o(o00O0O00.OooO0OO oooO0OO) {
            this.f36294OooO0OO = oooO0OO;
        }

        @Override // o00O0O00.OooO0OO
        @Nullable
        public final Float OooO00o(o00O0O00.OooO0O0<Float> oooO0O0) {
            Float f = (Float) this.f36294OooO0OO.OooO00o(oooO0O0);
            if (f == null) {
                return null;
            }
            return Float.valueOf(f.floatValue() * 2.55f);
        }
    }

    public OooO0OO(o00O000o.OooO00o.InterfaceC0420OooO00o interfaceC0420OooO00o, com.airbnb.lottie.model.layer.OooO00o oooO00o, o0000Ooo o0000ooo) {
        this.f36287OooO00o = interfaceC0420OooO00o;
        o00O000o.OooO00o<Integer, Integer> OooO00o2 = o0000ooo.f36460OooO00o.OooO00o();
        this.f36288OooO0O0 = (OooO0O0) OooO00o2;
        OooO00o2.OooO00o(this);
        oooO00o.OooO0oO(OooO00o2);
        o00O000o.OooO00o<Float, Float> OooO00o3 = o0000ooo.f36461OooO0O0.OooO00o();
        this.f36289OooO0OO = (OooO0o) OooO00o3;
        OooO00o3.OooO00o(this);
        oooO00o.OooO0oO(OooO00o3);
        o00O000o.OooO00o<Float, Float> OooO00o4 = o0000ooo.f36462OooO0OO.OooO00o();
        this.f36290OooO0Oo = (OooO0o) OooO00o4;
        OooO00o4.OooO00o(this);
        oooO00o.OooO0oO(OooO00o4);
        o00O000o.OooO00o<Float, Float> OooO00o5 = o0000ooo.f36463OooO0Oo.OooO00o();
        this.f36292OooO0o0 = (OooO0o) OooO00o5;
        OooO00o5.OooO00o(this);
        oooO00o.OooO0oO(OooO00o5);
        o00O000o.OooO00o<Float, Float> OooO00o6 = o0000ooo.f36464OooO0o0.OooO00o();
        this.f36291OooO0o = (OooO0o) OooO00o6;
        OooO00o6.OooO00o(this);
        oooO00o.OooO0oO(OooO00o6);
    }

    public final void OooO00o(o0ooOOo o0ooooo) {
        if (this.f36293OooO0oO) {
            this.f36293OooO0oO = false;
            double dFloatValue = ((double) this.f36290OooO0Oo.OooO0o().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.f36292OooO0o0.OooO0o().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f36288OooO0O0.OooO0o().intValue();
            o0ooooo.setShadowLayer(this.f36291OooO0o.OooO0o().floatValue(), fSin, fCos, Color.argb(Math.round(this.f36289OooO0OO.OooO0o().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    @Override // o00O000o.OooO00o.InterfaceC0420OooO00o
    public final void OooO0O0() {
        this.f36293OooO0oO = true;
        this.f36287OooO00o.OooO0O0();
    }

    public final void OooO0OO(@Nullable o00O0O00.OooO0OO<Float> oooO0OO) {
        OooO0o oooO0o = this.f36289OooO0OO;
        if (oooO0OO == null) {
            oooO0o.OooOO0O(null);
        } else {
            oooO0o.OooOO0O(new OooO00o(oooO0OO));
        }
    }
}
