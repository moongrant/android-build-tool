package o0OOO0O0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import o0OOO0O0.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000<S extends OooO0O0> extends OooOOOO {

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public OooOo00<S> f38103OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public OooOo<ObjectAnimator> f38104OoooOo0;

    public Oooo000(@NonNull Context context, @NonNull OooO0O0 oooO0O0, @NonNull OooOo00<S> oooOo00, @NonNull OooOo<ObjectAnimator> oooOo) {
        super(context, oooO0O0);
        this.f38103OoooOOo = oooOo00;
        oooOo00.f38099OooO0O0 = this;
        this.f38104OoooOo0 = oooOo;
        oooOo.f38095OooO00o = this;
    }

    @Override // o0OOO0O0.OooOOOO
    public final boolean OooO0oo(boolean z, boolean z2, boolean z3) {
        boolean zOooO0oo = super.OooO0oo(z, z2, z3);
        if (!isRunning()) {
            this.f38104OoooOo0.OooO00o();
        }
        float fOooO00o = this.f38088Oooo0oo.OooO00o(this.f38086Oooo0o.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && fOooO00o > ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE))) {
            this.f38104OoooOo0.OooO0o0();
        }
        return zOooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (getBounds().isEmpty() || !isVisible() || !canvas.getClipBounds(rect)) {
            return;
        }
        canvas.save();
        OooOo00<S> oooOo00 = this.f38103OoooOOo;
        float fOooO0O0 = OooO0O0();
        oooOo00.f38098OooO00o.OooO00o();
        oooOo00.OooO00o(canvas, fOooO0O0);
        this.f38103OoooOOo.OooO0OO(canvas, this.f38093OoooOO0);
        int i = 0;
        while (true) {
            OooOo<ObjectAnimator> oooOo = this.f38104OoooOo0;
            int[] iArr = oooOo.f38097OooO0OO;
            if (i >= iArr.length) {
                canvas.restore();
                return;
            }
            OooOo00<S> oooOo01 = this.f38103OoooOOo;
            Paint paint = this.f38093OoooOO0;
            float[] fArr = oooOo.f38096OooO0O0;
            int i2 = i * 2;
            oooOo01.OooO0O0(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f38103OoooOOo.OooO0Oo();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f38103OoooOOo.OooO0o0();
    }
}
