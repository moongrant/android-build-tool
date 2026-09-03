package p410o0Oo0OoO;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;

/* JADX INFO: loaded from: classes2.dex */
public final class oO000o00 extends oO0O0OoO {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f39161Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f39162Oooo0oo = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Path f39160Oooo = new Path();

    @Override // android.graphics.drawable.Drawable
    public final void draw(@NonNull Canvas canvas) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        if (this.f39161Oooo0oO != iWidth || this.f39162Oooo0oo != iHeight) {
            this.f39160Oooo.reset();
            float f = (iWidth * 30) / 225;
            float f2 = f * 0.70710677f;
            float f3 = f / 0.70710677f;
            float f4 = iWidth;
            float f5 = f4 / 2.0f;
            float f6 = iHeight;
            this.f39160Oooo.moveTo(f5, f6);
            float f7 = f6 / 2.0f;
            this.f39160Oooo.lineTo(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE, f7);
            float f8 = f7 - f2;
            this.f39160Oooo.lineTo(f2, f8);
            float f9 = f / 2.0f;
            float f10 = f5 - f9;
            float f11 = (f6 - f3) - f9;
            this.f39160Oooo.lineTo(f10, f11);
            this.f39160Oooo.lineTo(f10, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            float f12 = f5 + f9;
            this.f39160Oooo.lineTo(f12, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE);
            this.f39160Oooo.lineTo(f12, f11);
            this.f39160Oooo.lineTo(f4 - f2, f8);
            this.f39160Oooo.lineTo(f4, f7);
            this.f39160Oooo.close();
            this.f39161Oooo0oO = iWidth;
            this.f39162Oooo0oo = iHeight;
        }
        canvas.drawPath(this.f39160Oooo, this.f39168Oooo0o);
    }
}
