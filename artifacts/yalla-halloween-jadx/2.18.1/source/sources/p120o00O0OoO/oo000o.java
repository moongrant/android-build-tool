package p120o00O0OoO;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Collections;
import p131o00O0oo0.o000000O;
import p131o00O0oo0.o000OOo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o extends OooOO0O<PointF, PointF> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final PointF f30816OooO;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final PointF f30817OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30818OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final OooOO0O<Float, Float> f30819OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public o000000O<Float> f30820OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @Nullable
    public o000000O<Float> f30821OooOOO0;

    public oo000o(OooOO0O<Float, Float> oooOO0O, OooOO0O<Float, Float> oooOO0O2) {
        super(Collections.emptyList());
        this.f30816OooO = new PointF();
        this.f30817OooOO0 = new PointF();
        this.f30818OooOO0O = oooOO0O;
        this.f30819OooOO0o = oooOO0O2;
        OooOO0(this.f30768OooO0Oo);
    }

    @Override // p120o00O0OoO.OooOO0O
    public final PointF OooO0o() {
        return OooO0oO(null, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList, java.util.List<o00O0OoO.OooOO0O$OooO00o>] */
    @Override // p120o00O0OoO.OooOO0O
    public final void OooOO0(float f) {
        this.f30818OooOO0O.OooOO0(f);
        this.f30819OooOO0o.OooOO0(f);
        this.f30816OooO.set(this.f30818OooOO0O.OooO0o().floatValue(), this.f30819OooOO0o.OooO0o().floatValue());
        for (int i = 0; i < this.f30765OooO00o.size(); i++) {
            ((OooOO0O.OooO00o) this.f30765OooO00o.get(i)).OooO0O0();
        }
    }

    @Override // p120o00O0OoO.OooOO0O
    /* JADX INFO: renamed from: OooOO0o, reason: merged with bridge method [inline-methods] */
    public final PointF OooO0oO(o000OOo<PointF> o000ooo2, float f) {
        Float f2;
        o000OOo<Float> o000oooOooO0O0;
        o000OOo<Float> o000oooOooO0O1;
        Float f3 = null;
        if (this.f30821OooOOO0 == null || (o000oooOooO0O1 = this.f30818OooOO0O.OooO0O0()) == null) {
            f2 = null;
        } else {
            this.f30818OooOO0O.OooO0Oo();
            Float f4 = o000oooOooO0O1.f31163OooO0oo;
            o000000O<Float> o000000o2 = this.f30821OooOOO0;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) o000000o2.OooO0O0(o000oooOooO0O1.f31157OooO0O0, o000oooOooO0O1.f31158OooO0OO);
        }
        if (this.f30820OooOOO != null && (o000oooOooO0O0 = this.f30819OooOO0o.OooO0O0()) != null) {
            this.f30819OooOO0o.OooO0Oo();
            Float f5 = o000oooOooO0O0.f31163OooO0oo;
            o000000O<Float> o000000o3 = this.f30820OooOOO;
            if (f5 != null) {
                f5.floatValue();
            }
            f3 = (Float) o000000o3.OooO0O0(o000oooOooO0O0.f31157OooO0O0, o000oooOooO0O0.f31158OooO0OO);
        }
        if (f2 == null) {
            this.f30817OooOO0.set(this.f30816OooO.x, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        } else {
            this.f30817OooOO0.set(f2.floatValue(), ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
        }
        if (f3 == null) {
            PointF pointF = this.f30817OooOO0;
            pointF.set(pointF.x, this.f30816OooO.y);
        } else {
            PointF pointF2 = this.f30817OooOO0;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f30817OooOO0;
    }
}
