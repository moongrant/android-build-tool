package p118o00O0Oo;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.OooOOOO;
import p125o00O0o0O.o00000;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00Oo0 implements OooOO0O.OooO00o, Oooo0, o0OoOo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f30715OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f30716OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0O<?, PointF> f30717OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final LottieDrawable f30718OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOO0O<?, PointF> f30719OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOO0O<?, Float> f30720OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f30721OooOO0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30713OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f30714OooO0O0 = new RectF();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final OooO f30712OooO = new OooO();

    public o00Oo0(LottieDrawable lottieDrawable, OooO00o oooO00o, o00000 o00000Var) {
        this.f30715OooO0OO = o00000Var.f30990OooO00o;
        this.f30716OooO0Oo = o00000Var.f30994OooO0o0;
        this.f30718OooO0o0 = lottieDrawable;
        OooOO0O<PointF, PointF> oooOO0OOooO00o = o00000Var.f30991OooO0O0.OooO00o();
        this.f30717OooO0o = oooOO0OOooO00o;
        OooOO0O<PointF, PointF> oooOO0OOooO00o2 = o00000Var.f30992OooO0OO.OooO00o();
        this.f30719OooO0oO = oooOO0OOooO00o2;
        OooOO0O<?, ?> oooOO0OOooO00o3 = o00000Var.f30993OooO0Oo.OooO00o();
        this.f30720OooO0oo = (OooOOOO) oooOO0OOooO00o3;
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        oooO00o.OooO0oO(oooOO0OOooO00o3);
        oooOO0OOooO00o.OooO00o(this);
        oooOO0OOooO00o2.OooO00o(this);
        oooOO0OOooO00o3.OooO00o(this);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [o00O0OoO.OooOO0O<?, java.lang.Float>, o00O0OoO.OooOOOO] */
    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        if (this.f30721OooOO0) {
            return this.f30713OooO00o;
        }
        this.f30713OooO00o.reset();
        if (this.f30716OooO0Oo) {
            this.f30721OooOO0 = true;
            return this.f30713OooO00o;
        }
        PointF pointFOooO0o = this.f30719OooO0oO.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        ?? r4 = this.f30720OooO0oo;
        float fOooOO0o = r4 == 0 ? ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE : r4.OooOO0o();
        float fMin = Math.min(f, f2);
        if (fOooOO0o > fMin) {
            fOooOO0o = fMin;
        }
        PointF pointFOooO0o2 = this.f30717OooO0o.OooO0o();
        this.f30713OooO00o.moveTo(pointFOooO0o2.x + f, (pointFOooO0o2.y - f2) + fOooOO0o);
        this.f30713OooO00o.lineTo(pointFOooO0o2.x + f, (pointFOooO0o2.y + f2) - fOooOO0o);
        if (fOooOO0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            RectF rectF = this.f30714OooO0O0;
            float f3 = pointFOooO0o2.x + f;
            float f4 = fOooOO0o * 2.0f;
            float f5 = pointFOooO0o2.y + f2;
            rectF.set(f3 - f4, f5 - f4, f3, f5);
            this.f30713OooO00o.arcTo(this.f30714OooO0O0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, 90.0f, false);
        }
        this.f30713OooO00o.lineTo((pointFOooO0o2.x - f) + fOooOO0o, pointFOooO0o2.y + f2);
        if (fOooOO0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            RectF rectF2 = this.f30714OooO0O0;
            float f6 = pointFOooO0o2.x - f;
            float f7 = pointFOooO0o2.y + f2;
            float f8 = fOooOO0o * 2.0f;
            rectF2.set(f6, f7 - f8, f8 + f6, f7);
            this.f30713OooO00o.arcTo(this.f30714OooO0O0, 90.0f, 90.0f, false);
        }
        this.f30713OooO00o.lineTo(pointFOooO0o2.x - f, (pointFOooO0o2.y - f2) + fOooOO0o);
        if (fOooOO0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            RectF rectF3 = this.f30714OooO0O0;
            float f9 = pointFOooO0o2.x - f;
            float f10 = pointFOooO0o2.y - f2;
            float f11 = fOooOO0o * 2.0f;
            rectF3.set(f9, f10, f9 + f11, f11 + f10);
            this.f30713OooO00o.arcTo(this.f30714OooO0O0, 180.0f, 90.0f, false);
        }
        this.f30713OooO00o.lineTo((pointFOooO0o2.x + f) - fOooOO0o, pointFOooO0o2.y - f2);
        if (fOooOO0o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            RectF rectF4 = this.f30714OooO0O0;
            float f12 = pointFOooO0o2.x + f;
            float f13 = fOooOO0o * 2.0f;
            float f14 = pointFOooO0o2.y - f2;
            rectF4.set(f12 - f13, f14, f12, f13 + f14);
            this.f30713OooO00o.arcTo(this.f30714OooO0O0, 270.0f, 90.0f, false);
        }
        this.f30713OooO00o.close();
        this.f30712OooO.OooO0O0(this.f30713OooO00o);
        this.f30721OooOO0 = true;
        return this.f30713OooO00o;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30721OooOO0 = false;
        this.f30718OooO0o0.invalidateSelf();
    }

    @Override // p118o00O0Oo.OooOO0
    public final void OooO0OO(List<OooOO0> list, List<OooOO0> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            OooOO0 oooOO1 = (OooOO0) arrayList.get(i);
            if (oooOO1 instanceof o0ooOOo) {
                o0ooOOo o0ooooo2 = (o0ooOOo) oooOO1;
                if (o0ooooo2.f30739OooO0OO == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                    this.f30712OooO.OooO00o(o0ooooo2);
                    o0ooooo2.OooO0Oo(this);
                }
            }
            i++;
        }
    }

    @Override // p225o00oOOo.oo0oOO0
    public final void OooO0Oo(o00O0OOO o00o0ooo2, int i, List<o00O0OOO> list, o00O0OOO o00o0ooo3) {
        o000O0.OooO0o0(o00o0ooo2, i, list, o00o0ooo3, this);
    }

    @Override // p225o00oOOo.oo0oOO0
    public final <T> void OooO0o0(T t, @Nullable o000000O<T> o000000o2) {
        if (t == o000oOoO.f10209OooOO0o) {
            this.f30719OooO0oO.OooOO0O(o000000o2);
        } else if (t == o000oOoO.f10210OooOOO) {
            this.f30717OooO0o.OooOO0O(o000000o2);
        } else if (t == o000oOoO.f10211OooOOO0) {
            this.f30720OooO0oo.OooOO0O(o000000o2);
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30715OooO0OO;
    }
}
