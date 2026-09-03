package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/common/ui/view/LuckyNumberView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "enable", "", "setCountDownEnable", "", "range", "setRange", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LuckyNumberView extends AppCompatImageView {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @NotNull
    public final RectF f20948Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final float f20949OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @NotNull
    public final Paint f20950OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @NotNull
    public final RectF f20951OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final float f20952OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final float f20953OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public Bitmap f20954OoooOOO;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f20955o000oOoO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20948Oooo = new RectF();
        this.f20951OoooO00 = new RectF();
        this.f20950OoooO0 = new Paint();
        this.f20952OoooO0O = OooOo00.OooO00o(12.0f);
        this.f20949OoooO = OooOo00.OooO00o(2.5f);
        this.f20953OoooOO0 = OooOo00.OooO00o(3.0f);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f20955o000oOoO = Color.parseColor("#33000000");
        OooO0OO();
    }

    public final void OooO0OO() {
        setLayerType(1, null);
        this.f20950OoooO0.setAntiAlias(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = 2;
        float measuredWidth = ((getMeasuredWidth() - getPaddingStart()) - getPaddingEnd()) - (this.f20949OoooO * f);
        float measuredHeight = ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - (this.f20953OoooOO0 * f);
        float paddingStart = getPaddingStart() + this.f20949OoooO;
        float paddingTop = getPaddingTop() + this.f20953OoooOO0;
        this.f20948Oooo.set(paddingStart, paddingTop, measuredWidth + paddingStart, measuredHeight + paddingTop);
        this.f20951OoooO00.set(this.f20948Oooo);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getResources().getDisplayMetrics(), i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        this.f20954OoooOOO = bitmapCreateBitmap;
        Bitmap bitmap = this.f20954OoooOOO;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap = null;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(this.f20955o000oOoO);
        RectF rectF = this.f20948Oooo;
        float f2 = this.f20952OoooO0O;
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    public final void setCountDownEnable(boolean enable) {
    }

    public final void setRange(int range) {
        int i = R.drawable.ic_room_lucky_number;
        if (range != 1) {
            if (range == 2) {
                i = R.drawable.ic_room_lucky_number_2;
            } else if (range == 3) {
                i = R.drawable.ic_room_lucky_number_3;
            }
        }
        setImageResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20948Oooo = new RectF();
        this.f20951OoooO00 = new RectF();
        this.f20950OoooO0 = new Paint();
        this.f20952OoooO0O = OooOo00.OooO00o(12.0f);
        this.f20949OoooO = OooOo00.OooO00o(2.5f);
        this.f20953OoooOO0 = OooOo00.OooO00o(3.0f);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f20955o000oOoO = Color.parseColor("#33000000");
        OooO0OO();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20948Oooo = new RectF();
        this.f20951OoooO00 = new RectF();
        this.f20950OoooO0 = new Paint();
        this.f20952OoooO0O = OooOo00.OooO00o(12.0f);
        this.f20949OoooO = OooOo00.OooO00o(2.5f);
        this.f20953OoooOO0 = OooOo00.OooO00o(3.0f);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f20955o000oOoO = Color.parseColor("#33000000");
        OooO0OO();
    }
}
