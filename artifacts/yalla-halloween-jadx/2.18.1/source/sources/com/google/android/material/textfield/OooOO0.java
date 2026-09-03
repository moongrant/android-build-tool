package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 extends MaterialShapeDrawable {

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @NonNull
    public final RectF f17860ooOO;

    public OooOO0() {
        this(null);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable
    public final void OooO0oO(@NonNull Canvas canvas) {
        if (this.f17860ooOO.isEmpty()) {
            super.OooO0oO(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f17860ooOO);
        } else {
            canvas.clipRect(this.f17860ooOO, Region.Op.DIFFERENCE);
        }
        super.OooO0oO(canvas);
        canvas.restore();
    }

    public final void OooOoo0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f17860ooOO;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    public OooOO0(@Nullable com.google.android.material.shape.OooO00o oooO00o) {
        super(oooO00o == null ? new com.google.android.material.shape.OooO00o() : oooO00o);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.f17860ooOO = new RectF();
    }
}
