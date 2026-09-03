package com.yalla.yalla.ui.view;

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
import com.code.android.util.o0000O0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fB#\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0012"}, d2 = {"Lcom/yalla/yalla/ui/view/LuckyNumberView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "enable", "", "setCountDownEnable", "", "range", "setRange", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLuckyNumberView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LuckyNumberView.kt\ncom/yalla/yalla/ui/view/LuckyNumberView\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,140:1\n95#2,14:141\n*S KotlinDebug\n*F\n+ 1 LuckyNumberView.kt\ncom/yalla/yalla/ui/view/LuckyNumberView\n*L\n82#1:141,14\n*E\n"})
public final class LuckyNumberView extends AppCompatImageView {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f30489OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final RectF f30490OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final float f30491OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final RectF f30492OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final float f30493OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f30494OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public Bitmap f30495OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30490OooO0Oo = new RectF();
        this.f30492OooO0o0 = new RectF();
        Paint paint = new Paint();
        this.f30491OooO0o = o0000O0.OooO00o(12);
        this.f30493OooO0oO = o0000O0.OooO00o((float) 2.5d);
        this.f30494OooO0oo = o0000O0.OooO00o(3);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f30489OooO = Color.parseColor("#33000000");
        setLayerType(1, null);
        paint.setAntiAlias(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float measuredWidth = (getMeasuredWidth() - getPaddingStart()) - getPaddingEnd();
        float f = 2;
        float f2 = this.f30493OooO0oO;
        float f3 = measuredWidth - (f2 * f);
        float measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        float f4 = this.f30494OooO0oo;
        float f5 = measuredHeight - (f * f4);
        float paddingStart = getPaddingStart() + f2;
        float paddingTop = getPaddingTop() + f4;
        RectF rectF = this.f30490OooO0Oo;
        rectF.set(paddingStart, paddingTop, f3 + paddingStart, f5 + paddingTop);
        this.f30492OooO0o0.set(rectF);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(getResources().getDisplayMetrics(), i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(\n          …onfig.ARGB_8888\n        )");
        this.f30495OooOO0 = bitmapCreateBitmap;
        Bitmap bitmap = this.f30495OooOO0;
        if (bitmap == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            bitmap = null;
        }
        Canvas canvas = new Canvas(bitmap);
        Paint paint = new Paint(1);
        paint.setColor(this.f30489OooO);
        float f6 = this.f30491OooO0o;
        canvas.drawRoundRect(rectF, f6, f6, paint);
    }

    public final void setCountDownEnable(boolean enable) {
    }

    public final void setRange(int range) {
        int i;
        if (range == 1) {
            i = oOo00OO0.ic_room_lucky_number;
        } else if (range != 2) {
            i = range != 3 ? oOo00OO0.ic_room_lucky_number : oOo00OO0.ic_room_lucky_number_3;
        } else {
            i = oOo00OO0.ic_room_lucky_number_2;
        }
        setImageResource(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30490OooO0Oo = new RectF();
        this.f30492OooO0o0 = new RectF();
        Paint paint = new Paint();
        this.f30491OooO0o = o0000O0.OooO00o(12);
        this.f30493OooO0oO = o0000O0.OooO00o((float) 2.5d);
        this.f30494OooO0oo = o0000O0.OooO00o(3);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f30489OooO = Color.parseColor("#33000000");
        setLayerType(1, null);
        paint.setAntiAlias(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LuckyNumberView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30490OooO0Oo = new RectF();
        this.f30492OooO0o0 = new RectF();
        Paint paint = new Paint();
        this.f30491OooO0o = o0000O0.OooO00o(12);
        this.f30493OooO0oO = o0000O0.OooO00o((float) 2.5d);
        this.f30494OooO0oo = o0000O0.OooO00o(3);
        new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Color.parseColor("#000000");
        this.f30489OooO = Color.parseColor("#33000000");
        setLayerType(1, null);
        paint.setAntiAlias(true);
    }
}
