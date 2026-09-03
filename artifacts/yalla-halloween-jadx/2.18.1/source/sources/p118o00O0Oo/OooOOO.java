package p118o00O0Oo;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.OooO00o;
import com.airbnb.lottie.o000oOoO;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.ArrayList;
import java.util.List;
import p120o00O0OoO.OooOO0O;
import p120o00O0OoO.o00O0O;
import p125o00O0o0O.o0O0O00;
import p129o00O0oOo.o000O0;
import p131o00O0oo0.o000000O;
import p225o00oOOo.o00O0OOO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO implements o0OoOo0, OooOO0O.OooO00o, Oooo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f30639OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final LottieDrawable f30640OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0O<?, PointF> f30641OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0O00 f30642OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooOO0O<?, PointF> f30643OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f30645OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f30638OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f30644OooO0oO = new OooO();

    public OooOOO(LottieDrawable lottieDrawable, OooO00o oooO00o, o0O0O00 o0o0o00) {
        this.f30639OooO0O0 = o0o0o00.f31022OooO00o;
        this.f30640OooO0OO = lottieDrawable;
        OooOO0O<?, ?> oooOO0OOooO00o = o0o0o00.f31024OooO0OO.OooO00o();
        this.f30641OooO0Oo = (o00O0O) oooOO0OOooO00o;
        OooOO0O<PointF, PointF> oooOO0OOooO00o2 = o0o0o00.f31023OooO0O0.OooO00o();
        this.f30643OooO0o0 = oooOO0OOooO00o2;
        this.f30642OooO0o = o0o0o00;
        oooO00o.OooO0oO(oooOO0OOooO00o);
        oooO00o.OooO0oO(oooOO0OOooO00o2);
        oooOO0OOooO00o.OooO00o(this);
        oooOO0OOooO00o2.OooO00o(this);
    }

    @Override // p118o00O0Oo.o0OoOo0
    public final Path OooO00o() {
        if (this.f30645OooO0oo) {
            return this.f30638OooO00o;
        }
        this.f30638OooO00o.reset();
        if (this.f30642OooO0o.f31026OooO0o0) {
            this.f30645OooO0oo = true;
            return this.f30638OooO00o;
        }
        PointF pointFOooO0o = this.f30641OooO0Oo.OooO0o();
        float f = pointFOooO0o.x / 2.0f;
        float f2 = pointFOooO0o.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f30638OooO00o.reset();
        if (this.f30642OooO0o.f31025OooO0Oo) {
            float f5 = -f2;
            this.f30638OooO00o.moveTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5);
            Path path = this.f30638OooO00o;
            float f6 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE - f3;
            float f7 = -f;
            float f8 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE - f4;
            path.cubicTo(f6, f5, f7, f8, f7, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Path path2 = this.f30638OooO00o;
            float f9 = f4 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            path2.cubicTo(f7, f9, f6, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2);
            Path path3 = this.f30638OooO00o;
            float f10 = f3 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            path3.cubicTo(f10, f2, f, f9, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f30638OooO00o.cubicTo(f, f8, f10, f5, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f5);
        } else {
            float f11 = -f2;
            this.f30638OooO00o.moveTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f11);
            Path path4 = this.f30638OooO00o;
            float f12 = f3 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            float f13 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE - f4;
            path4.cubicTo(f12, f11, f, f13, f, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            Path path5 = this.f30638OooO00o;
            float f14 = f4 + ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
            path5.cubicTo(f, f14, f12, f2, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f2);
            Path path6 = this.f30638OooO00o;
            float f15 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE - f3;
            float f16 = -f;
            path6.cubicTo(f15, f2, f16, f14, f16, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f30638OooO00o.cubicTo(f16, f13, f15, f11, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f11);
        }
        PointF pointFOooO0o2 = this.f30643OooO0o0.OooO0o();
        this.f30638OooO00o.offset(pointFOooO0o2.x, pointFOooO0o2.y);
        this.f30638OooO00o.close();
        this.f30644OooO0oO.OooO0O0(this.f30638OooO00o);
        this.f30645OooO0oo = true;
        return this.f30638OooO00o;
    }

    @Override // o00O0OoO.OooOO0O.OooO00o
    public final void OooO0O0() {
        this.f30645OooO0oo = false;
        this.f30640OooO0OO.invalidateSelf();
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
                    this.f30644OooO0oO.OooO00o(o0ooooo2);
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
        if (t == o000oOoO.f10208OooOO0O) {
            this.f30641OooO0Oo.OooOO0O(o000000o2);
        } else if (t == o000oOoO.f10210OooOOO) {
            this.f30643OooO0o0.OooOO0O(o000000o2);
        }
    }

    @Override // p118o00O0Oo.OooOO0
    public final String getName() {
        return this.f30639OooO0O0;
    }
}
