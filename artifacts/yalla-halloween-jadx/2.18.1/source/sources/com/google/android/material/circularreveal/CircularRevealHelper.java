package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p031OoooO.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class CircularRevealHelper {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f16851OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final View f16852OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Paint f16853OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public OooO0O0.OooO0o f16854OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Drawable f16855OooO0o0;

    public interface OooO00o {
        void OooO0OO(Canvas canvas);

        boolean OooO0Oo();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CircularRevealHelper(OooO00o oooO00o) {
        this.f16851OooO00o = oooO00o;
        View view = (View) oooO00o;
        this.f16852OooO0O0 = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f16853OooO0OO = paint;
        paint.setColor(0);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final boolean OooO() {
        boolean z;
        OooO0O0.OooO0o oooO0o = this.f16854OooO0Oo;
        if (oooO0o != null) {
            z = (oooO0o.f16864OooO0OO > Float.MAX_VALUE ? 1 : (oooO0o.f16864OooO0OO == Float.MAX_VALUE ? 0 : -1)) == 0;
        }
        return !z;
    }

    public final void OooO00o(@NonNull Canvas canvas) {
        if (OooO()) {
            this.f16851OooO00o.OooO0OO(canvas);
            if (OooOO0()) {
                canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f16852OooO0O0.getWidth(), this.f16852OooO0O0.getHeight(), this.f16853OooO0OO);
            }
        } else {
            this.f16851OooO00o.OooO0OO(canvas);
            if (OooOO0()) {
                canvas.drawRect(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, this.f16852OooO0O0.getWidth(), this.f16852OooO0O0.getHeight(), this.f16853OooO0OO);
            }
        }
        Drawable drawable = this.f16855OooO0o0;
        if ((drawable == null || this.f16854OooO0Oo == null) ? false : true) {
            Rect bounds = drawable.getBounds();
            float fWidth = this.f16854OooO0Oo.f16862OooO00o - (bounds.width() / 2.0f);
            float fHeight = this.f16854OooO0Oo.f16863OooO0O0 - (bounds.height() / 2.0f);
            canvas.translate(fWidth, fHeight);
            this.f16855OooO0o0.draw(canvas);
            canvas.translate(-fWidth, -fHeight);
        }
    }

    @ColorInt
    public final int OooO0O0() {
        return this.f16853OooO0OO.getColor();
    }

    public final float OooO0OO(@NonNull OooO0O0.OooO0o oooO0o) {
        return o0000O.OooO0OO(oooO0o.f16862OooO00o, oooO0o.f16863OooO0O0, this.f16852OooO0O0.getWidth(), this.f16852OooO0O0.getHeight());
    }

    @Nullable
    public final OooO0O0.OooO0o OooO0Oo() {
        OooO0O0.OooO0o oooO0o = this.f16854OooO0Oo;
        if (oooO0o == null) {
            return null;
        }
        OooO0O0.OooO0o oooO0o2 = new OooO0O0.OooO0o(oooO0o.f16862OooO00o, oooO0o.f16863OooO0O0, oooO0o.f16864OooO0OO);
        if (oooO0o2.f16864OooO0OO == Float.MAX_VALUE) {
            oooO0o2.f16864OooO0OO = OooO0OO(oooO0o2);
        }
        return oooO0o2;
    }

    public final void OooO0o(@Nullable Drawable drawable) {
        this.f16855OooO0o0 = drawable;
        this.f16852OooO0O0.invalidate();
    }

    public final boolean OooO0o0() {
        return this.f16851OooO00o.OooO0Oo() && !OooO();
    }

    public final void OooO0oO(@ColorInt int i) {
        this.f16853OooO0OO.setColor(i);
        this.f16852OooO0O0.invalidate();
    }

    public final void OooO0oo(@Nullable OooO0O0.OooO0o oooO0o) {
        if (oooO0o == null) {
            this.f16854OooO0Oo = null;
        } else {
            OooO0O0.OooO0o oooO0o2 = this.f16854OooO0Oo;
            if (oooO0o2 == null) {
                this.f16854OooO0Oo = new OooO0O0.OooO0o(oooO0o.f16862OooO00o, oooO0o.f16863OooO0O0, oooO0o.f16864OooO0OO);
            } else {
                float f = oooO0o.f16862OooO00o;
                float f2 = oooO0o.f16863OooO0O0;
                float f3 = oooO0o.f16864OooO0OO;
                oooO0o2.f16862OooO00o = f;
                oooO0o2.f16863OooO0O0 = f2;
                oooO0o2.f16864OooO0OO = f3;
            }
            if (oooO0o.f16864OooO0OO + 1.0E-4f >= OooO0OO(oooO0o)) {
                this.f16854OooO0Oo.f16864OooO0OO = Float.MAX_VALUE;
            }
        }
        this.f16852OooO0O0.invalidate();
    }

    public final boolean OooOO0() {
        return Color.alpha(this.f16853OooO0OO.getColor()) != 0;
    }
}
