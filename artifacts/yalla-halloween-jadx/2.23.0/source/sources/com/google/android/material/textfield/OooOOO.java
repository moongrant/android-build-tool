package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class OooOOO extends MaterialShapeDrawable {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ int f17970OooOoo0 = 0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    @NonNull
    public OooO00o f17971OooOoOO;

    @TargetApi(18)
    public static class OooO0O0 extends OooOOO {
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public final void OooO0oO(@NonNull Canvas canvas) {
            if (this.f17971OooOoOO.f17972OooOo0O.isEmpty()) {
                super.OooO0oO(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(this.f17971OooOoOO.f17972OooOo0O);
            } else {
                canvas.clipRect(this.f17971OooOoOO.f17972OooOo0O, Region.Op.DIFFERENCE);
            }
            super.OooO0oO(canvas);
            canvas.restore();
        }
    }

    public OooOOO(OooO00o oooO00o) {
        super(oooO00o);
        this.f17971OooOoOO = oooO00o;
    }

    public final void OooOo(float f, float f2, float f3, float f4) {
        RectF rectF = this.f17971OooOoOO.f17972OooOo0O;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public final Drawable mutate() {
        this.f17971OooOoOO = new OooO00o(this.f17971OooOoOO);
        return this;
    }

    public static final class OooO00o extends MaterialShapeDrawable.OooO0O0 {

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        @NonNull
        public final RectF f17972OooOo0O;

        public OooO00o(com.google.android.material.shape.OooO0O0 oooO0O0, RectF rectF) {
            super(oooO0O0);
            this.f17972OooOo0O = rectF;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.OooO0O0, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            OooO0O0 oooO0O0 = new OooO0O0(this);
            oooO0O0.invalidateSelf();
            return oooO0O0;
        }

        public OooO00o(OooO00o oooO00o) {
            super(oooO00o);
            this.f17972OooOo0O = oooO00o.f17972OooOo0O;
        }
    }
}
