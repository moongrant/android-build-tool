package o0OOO0O0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0OOO0O0.OooO0O0;
import p394o0OOoooO.o0O0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0O<S extends OooO0O0> extends OooOOOO {

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final o000OOO.OooO0OO f38076Ooooo0o = new OooO00o();

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooOo00<S> f38077OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final o000OOO.OooO f38078OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final o000OOO.OooO0o f38079OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public float f38080OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public boolean f38081Ooooo00;

    public class OooO00o extends o000OOO.OooO0OO {
        @Override // o000OOO.OooO0OO
        public final float OooO0O0(Object obj) {
            return ((OooOO0O) obj).f38080OoooOoo * 10000.0f;
        }

        @Override // o000OOO.OooO0OO
        public final void OooO0o(Object obj, float f) {
            ((OooOO0O) obj).OooOO0(f / 10000.0f);
        }
    }

    public OooOO0O(@NonNull Context context, @NonNull OooO0O0 oooO0O0, @NonNull OooOo00<S> oooOo00) {
        super(context, oooO0O0);
        this.f38081Ooooo00 = false;
        this.f38077OoooOOo = oooOo00;
        oooOo00.f38099OooO0O0 = this;
        o000OOO.OooO oooO = new o000OOO.OooO();
        this.f38078OoooOo0 = oooO;
        oooO.f28241OooO0O0 = 1.0f;
        oooO.f28242OooO0OO = false;
        oooO.OooO00o(50.0f);
        o000OOO.OooO0o oooO0o = new o000OOO.OooO0o(this);
        this.f38079OoooOoO = oooO0o;
        oooO0o.f28280OooOOo = oooO;
        if (this.f38089OoooO != 1.0f) {
            this.f38089OoooO = 1.0f;
            invalidateSelf();
        }
    }

    @Override // o0OOO0O0.OooOOOO
    public final boolean OooO0oo(boolean z, boolean z2, boolean z3) {
        boolean zOooO0oo = super.OooO0oo(z, z2, z3);
        float fOooO00o = this.f38088Oooo0oo.OooO00o(this.f38086Oooo0o.getContentResolver());
        if (fOooO00o == ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) {
            this.f38081Ooooo00 = true;
        } else {
            this.f38081Ooooo00 = false;
            this.f38078OoooOo0.OooO00o(50.0f / fOooO00o);
        }
        return zOooO0oo;
    }

    public final void OooOO0(float f) {
        this.f38080OoooOoo = f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            OooOo00<S> oooOo00 = this.f38077OoooOOo;
            float fOooO0O0 = OooO0O0();
            oooOo00.f38098OooO00o.OooO00o();
            oooOo00.OooO00o(canvas, fOooO0O0);
            this.f38077OoooOOo.OooO0OO(canvas, this.f38093OoooOO0);
            this.f38077OoooOOo.OooO0O0(canvas, this.f38093OoooOO0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f38080OoooOoo, o0O0000O.OooO00o(this.f38087Oooo0oO.f38054OooO0OO[0], this.f38094o000oOoO));
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38077OoooOOo.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38077OoooOOo.OooO0o0();
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        this.f38079OoooOoO.OooO0Oo();
        OooOO0(getLevel() / 10000.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.f38081Ooooo00) {
            this.f38079OoooOoO.OooO0Oo();
            OooOO0(i / 10000.0f);
        } else {
            o000OOO.OooO0o oooO0o = this.f38079OoooOoO;
            oooO0o.f28269OooO0O0 = this.f38080OoooOoo * 10000.0f;
            oooO0o.f28270OooO0OO = true;
            float f = i;
            if (oooO0o.f28272OooO0o) {
                oooO0o.f28281OooOOoo = f;
            } else {
                if (oooO0o.f28280OooOOo == null) {
                    oooO0o.f28280OooOOo = new o000OOO.OooO(f);
                }
                o000OOO.OooO oooO = oooO0o.f28280OooOOo;
                double d = f;
                oooO.f28239OooO = d;
                double d2 = (float) d;
                if (d2 > Float.MAX_VALUE) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
                }
                if (d2 < oooO0o.f28274OooO0oO) {
                    throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
                }
                double dAbs = Math.abs(oooO0o.f28267OooO * 0.75f);
                oooO.f28243OooO0Oo = dAbs;
                oooO.f28245OooO0o0 = dAbs * 62.5d;
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    throw new AndroidRuntimeException("Animations may only be started on the main thread");
                }
                boolean z = oooO0o.f28272OooO0o;
                if (!z && !z) {
                    oooO0o.f28272OooO0o = true;
                    if (!oooO0o.f28270OooO0OO) {
                        oooO0o.f28269OooO0O0 = oooO0o.f28273OooO0o0.OooO0O0(oooO0o.f28271OooO0Oo);
                    }
                    float f2 = oooO0o.f28269OooO0O0;
                    if (f2 > Float.MAX_VALUE || f2 < oooO0o.f28274OooO0oO) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    o000OOO.OooO00o OooO00o2 = o000OOO.OooO00o.OooO00o();
                    if (OooO00o2.f28251OooO0O0.size() == 0) {
                        if (OooO00o2.f28253OooO0Oo == null) {
                            OooO00o2.f28253OooO0Oo = new o000OOO.OooO00o.OooO0o(OooO00o2.f28252OooO0OO);
                        }
                        o000OOO.OooO00o.OooO0o oooO0o2 = OooO00o2.f28253OooO0Oo;
                        oooO0o2.f28258OooO0O0.postFrameCallback(oooO0o2.f28259OooO0OO);
                    }
                    if (!OooO00o2.f28251OooO0O0.contains(oooO0o)) {
                        OooO00o2.f28251OooO0O0.add(oooO0o);
                    }
                }
            }
        }
        return true;
    }
}
