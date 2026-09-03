package p120o00O0OoO;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Collections;
import p123o00O0o0.OooOO0O;
import p123o00O0o0.OooOOO;
import p123o00O0o0.OooOOOO;
import p123o00O0o0.OooOo;
import p123o00O0o0.o00O0O;
import p123o00O0o0.o00Oo0;
import p131o00O0oo0.o00000;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @NonNull
    public OooOO0O<Float, Float> f30802OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f30803OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Matrix f30804OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Matrix f30805OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Matrix f30806OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NonNull
    public OooOO0O<PointF, PointF> f30807OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float[] f30808OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @NonNull
    public OooOO0O<?, PointF> f30809OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @NonNull
    public OooOO0O<o00000, o00000> f30810OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @NonNull
    public OooOO0O<Integer, Integer> f30811OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public OooOOOO f30812OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public OooOOOO f30813OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public OooOO0O<?, Float> f30814OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public OooOO0O<?, Float> f30815OooOOO0;

    public o0ooOOo(o00O0O o00o0o2) {
        OooOOOO oooOOOO = o00o0o2.f30963OooO00o;
        this.f30807OooO0o = oooOOOO == null ? null : oooOOOO.OooO00o();
        o00Oo0<PointF, PointF> o00oo1 = o00o0o2.f30964OooO0O0;
        this.f30809OooO0oO = o00oo1 == null ? null : o00oo1.OooO00o();
        OooOo oooOo = o00o0o2.f30965OooO0OO;
        this.f30810OooO0oo = oooOo == null ? null : oooOo.OooO00o();
        OooOO0O oooOO0O = o00o0o2.f30966OooO0Oo;
        this.f30802OooO = oooOO0O == null ? null : oooOO0O.OooO00o();
        OooOO0O oooOO0O2 = o00o0o2.f30967OooO0o;
        OooOOOO oooOOOO2 = oooOO0O2 == null ? null : (OooOOOO) oooOO0O2.OooO00o();
        this.f30812OooOO0O = oooOOOO2;
        if (oooOOOO2 != null) {
            this.f30804OooO0O0 = new Matrix();
            this.f30805OooO0OO = new Matrix();
            this.f30806OooO0Oo = new Matrix();
            this.f30808OooO0o0 = new float[9];
        } else {
            this.f30804OooO0O0 = null;
            this.f30805OooO0OO = null;
            this.f30806OooO0Oo = null;
            this.f30808OooO0o0 = null;
        }
        OooOO0O oooOO0O3 = o00o0o2.f30969OooO0oO;
        this.f30813OooOO0o = oooOO0O3 == null ? null : (OooOOOO) oooOO0O3.OooO00o();
        OooOOO oooOOO = o00o0o2.f30968OooO0o0;
        if (oooOOO != null) {
            this.f30811OooOO0 = oooOOO.OooO00o();
        }
        OooOO0O oooOO0O4 = o00o0o2.f30970OooO0oo;
        if (oooOO0O4 != null) {
            this.f30815OooOOO0 = oooOO0O4.OooO00o();
        } else {
            this.f30815OooOOO0 = null;
        }
        OooOO0O oooOO0O5 = o00o0o2.f30962OooO;
        if (oooOO0O5 != null) {
            this.f30814OooOOO = oooOO0O5.OooO00o();
        } else {
            this.f30814OooOOO = null;
        }
    }

    public final void OooO00o(OooO00o oooO00o) {
        oooO00o.OooO0oO(this.f30811OooOO0);
        oooO00o.OooO0oO(this.f30815OooOOO0);
        oooO00o.OooO0oO(this.f30814OooOOO);
        oooO00o.OooO0oO(this.f30807OooO0o);
        oooO00o.OooO0oO(this.f30809OooO0oO);
        oooO00o.OooO0oO(this.f30810OooO0oo);
        oooO00o.OooO0oO(this.f30802OooO);
        oooO00o.OooO0oO(this.f30812OooOO0O);
        oooO00o.OooO0oO(this.f30813OooOO0o);
    }

    public final void OooO0O0(OooOO0O.OooO00o oooO00o) {
        OooOO0O<Integer, Integer> oooOO0O = this.f30811OooOO0;
        if (oooOO0O != null) {
            oooOO0O.OooO00o(oooO00o);
        }
        OooOO0O<?, Float> oooOO0O2 = this.f30815OooOOO0;
        if (oooOO0O2 != null) {
            oooOO0O2.OooO00o(oooO00o);
        }
        OooOO0O<?, Float> oooOO0O3 = this.f30814OooOOO;
        if (oooOO0O3 != null) {
            oooOO0O3.OooO00o(oooO00o);
        }
        OooOO0O<PointF, PointF> oooOO0O4 = this.f30807OooO0o;
        if (oooOO0O4 != null) {
            oooOO0O4.OooO00o(oooO00o);
        }
        OooOO0O<?, PointF> oooOO0O5 = this.f30809OooO0oO;
        if (oooOO0O5 != null) {
            oooOO0O5.OooO00o(oooO00o);
        }
        OooOO0O<o00000, o00000> oooOO0O6 = this.f30810OooO0oo;
        if (oooOO0O6 != null) {
            oooOO0O6.OooO00o(oooO00o);
        }
        OooOO0O<Float, Float> oooOO0O7 = this.f30802OooO;
        if (oooOO0O7 != null) {
            oooOO0O7.OooO00o(oooO00o);
        }
        OooOOOO oooOOOO = this.f30812OooOO0O;
        if (oooOOOO != null) {
            oooOOOO.OooO00o(oooO00o);
        }
        OooOOOO oooOOOO2 = this.f30813OooOO0o;
        if (oooOOOO2 != null) {
            oooOOOO2.OooO00o(oooO00o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> boolean OooO0OO(T t, @Nullable o000000O<T> o000000o2) {
        OooOOOO oooOOOO;
        OooOOOO oooOOOO2;
        OooOO0O<?, Float> oooOO0O;
        OooOO0O<?, Float> oooOO0O2;
        if (t == o000oOoO.f10203OooO0o) {
            OooOO0O<PointF, PointF> oooOO0O3 = this.f30807OooO0o;
            if (oooOO0O3 == null) {
                this.f30807OooO0o = new o0OOO0o(o000000o2, new PointF());
                return true;
            }
            oooOO0O3.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10205OooO0oO) {
            OooOO0O<?, PointF> oooOO0O4 = this.f30809OooO0oO;
            if (oooOO0O4 == null) {
                this.f30809OooO0oO = new o0OOO0o(o000000o2, new PointF());
                return true;
            }
            oooOO0O4.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10206OooO0oo) {
            OooOO0O<?, PointF> oooOO0O5 = this.f30809OooO0oO;
            if (oooOO0O5 instanceof oo000o) {
                oo000o oo000oVar = (oo000o) oooOO0O5;
                o000000O<Float> o000000o3 = oo000oVar.f30821OooOOO0;
                oo000oVar.f30821OooOOO0 = o000000o2;
                return true;
            }
        }
        if (t == o000oOoO.f10198OooO) {
            OooOO0O<?, PointF> oooOO0O6 = this.f30809OooO0oO;
            if (oooOO0O6 instanceof oo000o) {
                oo000o oo000oVar2 = (oo000o) oooOO0O6;
                o000000O<Float> o000000o4 = oo000oVar2.f30820OooOOO;
                oo000oVar2.f30820OooOOO = o000000o2;
                return true;
            }
        }
        if (t == o000oOoO.f10212OooOOOO) {
            OooOO0O<o00000, o00000> oooOO0O7 = this.f30810OooO0oo;
            if (oooOO0O7 == null) {
                this.f30810OooO0oo = new o0OOO0o(o000000o2, new o00000());
                return true;
            }
            oooOO0O7.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10213OooOOOo) {
            OooOO0O<Float, Float> oooOO0O8 = this.f30802OooO;
            if (oooOO0O8 == null) {
                this.f30802OooO = new o0OOO0o(o000000o2, Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));
                return true;
            }
            oooOO0O8.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10201OooO0OO) {
            OooOO0O<Integer, Integer> oooOO0O9 = this.f30811OooOO0;
            if (oooOO0O9 == null) {
                this.f30811OooOO0 = new o0OOO0o(o000000o2, 100);
                return true;
            }
            oooOO0O9.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10225OooOoo && (oooOO0O2 = this.f30815OooOOO0) != null) {
            if (oooOO0O2 == null) {
                this.f30815OooOOO0 = new o0OOO0o(o000000o2, 100);
                return true;
            }
            oooOO0O2.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10227OooOooO && (oooOO0O = this.f30814OooOOO) != null) {
            if (oooOO0O == null) {
                this.f30814OooOOO = new o0OOO0o(o000000o2, 100);
                return true;
            }
            oooOO0O.OooOO0O(o000000o2);
            return true;
        }
        if (t == o000oOoO.f10215OooOOo0 && (oooOOOO2 = this.f30812OooOO0O) != null) {
            if (oooOOOO2 == null) {
                this.f30812OooOO0O = new OooOOOO(Collections.singletonList(new o000OOo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))));
            }
            this.f30812OooOO0O.OooOO0O(o000000o2);
            return true;
        }
        if (t != o000oOoO.f10214OooOOo || (oooOOOO = this.f30813OooOO0o) == null) {
            return false;
        }
        if (oooOOOO == null) {
            this.f30813OooOO0o = new OooOOOO(Collections.singletonList(new o000OOo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))));
        }
        this.f30813OooOO0o.OooOO0O(o000000o2);
        return true;
    }

    public final void OooO0Oo() {
        for (int i = 0; i < 9; i++) {
            this.f30808OooO0o0[i] = 0.0f;
        }
    }

    public final Matrix OooO0o(float f) {
        OooOO0O<?, PointF> oooOO0O = this.f30809OooO0oO;
        PointF pointFOooO0o = oooOO0O == null ? null : oooOO0O.OooO0o();
        OooOO0O<o00000, o00000> oooOO0O2 = this.f30810OooO0oo;
        o00000 o00000VarOooO0o = oooOO0O2 == null ? null : oooOO0O2.OooO0o();
        this.f30803OooO00o.reset();
        if (pointFOooO0o != null) {
            this.f30803OooO00o.preTranslate(pointFOooO0o.x * f, pointFOooO0o.y * f);
        }
        if (o00000VarOooO0o != null) {
            double d = f;
            this.f30803OooO00o.preScale((float) Math.pow(o00000VarOooO0o.f31149OooO00o, d), (float) Math.pow(o00000VarOooO0o.f31150OooO0O0, d));
        }
        OooOO0O<Float, Float> oooOO0O3 = this.f30802OooO;
        if (oooOO0O3 != null) {
            float fFloatValue = oooOO0O3.OooO0o().floatValue();
            OooOO0O<PointF, PointF> oooOO0O4 = this.f30807OooO0o;
            PointF pointFOooO0o2 = oooOO0O4 != null ? oooOO0O4.OooO0o() : null;
            Matrix matrix = this.f30803OooO00o;
            float f2 = fFloatValue * f;
            float f3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f4 = pointFOooO0o2 == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : pointFOooO0o2.x;
            if (pointFOooO0o2 != null) {
                f3 = pointFOooO0o2.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f30803OooO00o;
    }

    public final Matrix OooO0o0() {
        this.f30803OooO00o.reset();
        OooOO0O<?, PointF> oooOO0O = this.f30809OooO0oO;
        if (oooOO0O != null) {
            PointF pointFOooO0o = oooOO0O.OooO0o();
            float f = pointFOooO0o.x;
            if (f != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || pointFOooO0o.y != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f30803OooO00o.preTranslate(f, pointFOooO0o.y);
            }
        }
        OooOO0O<Float, Float> oooOO0O2 = this.f30802OooO;
        if (oooOO0O2 != null) {
            float fFloatValue = oooOO0O2 instanceof o0OOO0o ? oooOO0O2.OooO0o().floatValue() : ((OooOOOO) oooOO0O2).OooOO0o();
            if (fFloatValue != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f30803OooO00o.preRotate(fFloatValue);
            }
        }
        if (this.f30812OooOO0O != null) {
            OooOOOO oooOOOO = this.f30813OooOO0o;
            float fCos = oooOOOO == null ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : (float) Math.cos(Math.toRadians((-oooOOOO.OooOO0o()) + 90.0f));
            OooOOOO oooOOOO2 = this.f30813OooOO0o;
            float fSin = oooOOOO2 == null ? 1.0f : (float) Math.sin(Math.toRadians((-oooOOOO2.OooOO0o()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(this.f30812OooOO0O.OooOO0o()));
            OooO0Oo();
            float[] fArr = this.f30808OooO0o0;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f2 = -fSin;
            fArr[3] = f2;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.f30804OooO0O0.setValues(fArr);
            OooO0Oo();
            float[] fArr2 = this.f30808OooO0o0;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f30805OooO0OO.setValues(fArr2);
            OooO0Oo();
            float[] fArr3 = this.f30808OooO0o0;
            fArr3[0] = fCos;
            fArr3[1] = f2;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.f30806OooO0Oo.setValues(fArr3);
            this.f30805OooO0OO.preConcat(this.f30804OooO0O0);
            this.f30806OooO0Oo.preConcat(this.f30805OooO0OO);
            this.f30803OooO00o.preConcat(this.f30806OooO0Oo);
        }
        OooOO0O<o00000, o00000> oooOO0O3 = this.f30810OooO0oo;
        if (oooOO0O3 != null) {
            o00000 o00000VarOooO0o = oooOO0O3.OooO0o();
            float f3 = o00000VarOooO0o.f31149OooO00o;
            if (f3 != 1.0f || o00000VarOooO0o.f31150OooO0O0 != 1.0f) {
                this.f30803OooO00o.preScale(f3, o00000VarOooO0o.f31150OooO0O0);
            }
        }
        OooOO0O<PointF, PointF> oooOO0O4 = this.f30807OooO0o;
        if (oooOO0O4 != null) {
            PointF pointFOooO0o2 = oooOO0O4.OooO0o();
            float f4 = pointFOooO0o2.x;
            if (f4 != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE || pointFOooO0o2.y != ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
                this.f30803OooO00o.preTranslate(-f4, -pointFOooO0o2.y);
            }
        }
        return this.f30803OooO00o;
    }
}
