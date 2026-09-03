package com.yalla.yalla.ui.view.tips;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O00;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jctools.util.Pow2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p423o0OoO0OO.o000O000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0014\u0015\u0016B\u0011\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\f\u0010\u0013J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/view/tips/GiftGuideView;", "Landroid/view/ViewGroup;", "Landroid/view/View$OnClickListener;", "Lcom/yalla/yalla/ui/view/tips/GiftGuideView$OooO0OO;", "adapter", "", "setHollowAdapter", "Lcom/yalla/yalla/ui/view/tips/GiftGuideView$OooO0O0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnDismissListener", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "OooO0OO", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class GiftGuideView extends ViewGroup implements View.OnClickListener {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO0O0 f30822OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final View f30823OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f30824OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final Paint f30825OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public OooO0OO f30826OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f30827OooO0oo;

    @StabilityInferred(parameters = 0)
    public static final class OooO00o extends OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final List<Rect> f30828OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f30829OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f30830OooO0OO;

        public OooO00o(@NotNull ArrayList hollowRect) {
            Intrinsics.checkNotNullParameter(hollowRect, "hollowRect");
            this.f30828OooO00o = hollowRect;
            this.f30829OooO0O0 = o0000O0.OooO00o(20);
            this.f30830OooO0OO = OooOo00.OooO0o0();
        }

        public static Pair OooO00o(Rect rect, Canvas canvas, int i) {
            Drawable drawableOooO0O0 = o0000.OooO0O0(i);
            int iOooO00o = o0000O0.OooO00o(6);
            int iWidth = rect.width() + iOooO00o;
            int iHeight = rect.height() + iOooO00o;
            int iWidth2 = rect.left - ((iWidth - rect.width()) / 2);
            int iHeight2 = rect.top - ((iHeight - rect.height()) / 2);
            drawableOooO0O0.setBounds(new Rect(iWidth2, iHeight2, iWidth + iWidth2, iHeight + iHeight2));
            drawableOooO0O0.draw(canvas);
            return new Pair(Integer.valueOf(iWidth2), Integer.valueOf(iHeight2));
        }

        public static void OooO0O0(Rect rect) {
            int iOooO0OO = o0000O00.OooO0OO();
            int iWidth = rect.width();
            int i = iOooO0OO - rect.left;
            rect.right = i;
            rect.left = i - iWidth;
        }
    }

    public interface OooO0O0 {
    }

    @StabilityInferred(parameters = 0)
    public static abstract class OooO0OO {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View view = new View(getContext());
        this.f30823OooO0Oo = view;
        addView(view);
        Paint paint = new Paint();
        this.f30825OooO0o0 = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o0000.OooO00o(o0OOO0o.color_alpha_70));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i = this.f30827OooO0oo;
        if (i == 0) {
            o0oo0000.OooO00o.OooO0O0("101063");
        } else if (i == 1 || i == 2) {
            o0oo0000.OooO00o.OooO0O0("101064");
        }
        int i2 = this.f30827OooO0oo;
        if (i2 == this.f30824OooO0o - 1) {
            OooO0O0 oooO0O0 = this.f30822OooO;
            if (oooO0O0 != null) {
                com.yalla.yalla.ui.view.tips.OooO00o.OooOO0o((com.yalla.yalla.ui.view.tips.OooO00o) ((o00000O.OooO0OO) oooO0O0).f33407OooO00o);
                return;
            }
            return;
        }
        this.f30827OooO0oo = i2 + 1;
        OooO0OO oooO0OO = this.f30826OooO0oO;
        Intrinsics.checkNotNull(oooO0OO);
        View next = this.f30823OooO0Oo;
        int i3 = this.f30827OooO0oo;
        ((OooO00o) oooO0OO).getClass();
        Intrinsics.checkNotNullParameter(next, "next");
        int i4 = (i3 == 0 || i3 == 1 || i3 != 2) ? o0Oo0oo.pic_gift_tips_next : o0Oo0oo.pic_gift_guide_get_it;
        next.setBackgroundResource(i4);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        OooO0OO oooO0OO = this.f30826OooO0oO;
        if (oooO0OO == null) {
            OooO0O0 oooO0O0 = this.f30822OooO;
            if (oooO0O0 != null) {
                com.yalla.yalla.ui.view.tips.OooO00o.OooOO0o((com.yalla.yalla.ui.view.tips.OooO00o) ((o00000O.OooO0OO) oooO0O0).f33407OooO00o);
                return;
            }
            return;
        }
        Intrinsics.checkNotNull(oooO0OO);
        Rect hollowRect = ((OooO00o) oooO0OO).f30828OooO00o.get(this.f30827OooO0oo);
        canvas.save();
        canvas.clipRect(hollowRect);
        canvas.drawRect(hollowRect, this.f30825OooO0o0);
        canvas.restore();
        OooO0OO oooO0OO2 = this.f30826OooO0oO;
        Intrinsics.checkNotNull(oooO0OO2);
        int i = this.f30827OooO0oo;
        OooO00o oooO00o = (OooO00o) oooO0OO2;
        oooO00o.getClass();
        Intrinsics.checkNotNullParameter(hollowRect, "hollowRect");
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        boolean z = oooO00o.f30830OooO0OO;
        int i2 = oooO00o.f30829OooO0O0;
        if (i == 0) {
            OooO00o.OooO00o(new Rect(hollowRect), canvas, o0Oo0oo.pic_dot_line_step_one);
            Drawable drawableOooO0O0 = o0000.OooO0O0(o0Oo0oo.pic_gift_guide_arrow_left);
            int intrinsicHeight = drawableOooO0O0.getIntrinsicHeight();
            int intrinsicWidth = drawableOooO0O0.getIntrinsicWidth();
            int i3 = z ? (hollowRect.left - i2) - intrinsicWidth : hollowRect.right + i2;
            int iOooO00o = o0000O0.OooO00o(8) + hollowRect.top;
            Rect rect = new Rect(i3, iOooO00o, intrinsicWidth + i3, intrinsicHeight + iOooO00o);
            drawableOooO0O0.setBounds(rect);
            drawableOooO0O0.draw(canvas);
            Drawable drawableOooO0O1 = o0000.OooO0O0(o0Oo0oo.pic_select_a_gift);
            int intrinsicWidth2 = drawableOooO0O1.getIntrinsicWidth();
            int intrinsicHeight2 = drawableOooO0O1.getIntrinsicHeight();
            if (z) {
                i3 = rect.right - intrinsicWidth2;
            }
            int iOooO00o2 = o0000O0.OooO00o(62) + hollowRect.top;
            drawableOooO0O1.setBounds(new Rect(i3, iOooO00o2, intrinsicWidth2 + i3, intrinsicHeight2 + iOooO00o2));
            drawableOooO0O1.draw(canvas);
            return;
        }
        if (i == 1) {
            Pair pairOooO00o = OooO00o.OooO00o(hollowRect, canvas, o0Oo0oo.pic_dot_line_step_two);
            Drawable drawableOooO0O2 = o0000.OooO0O0(o0Oo0oo.pic_gift_guide_arrow_down);
            int intrinsicWidth3 = drawableOooO0O2.getIntrinsicWidth();
            int intrinsicHeight3 = drawableOooO0O2.getIntrinsicHeight();
            int iWidth = ((hollowRect.width() / 2) + hollowRect.left) - (intrinsicWidth3 / 2);
            int iIntValue = (((Number) pairOooO00o.getSecond()).intValue() - i2) - intrinsicHeight3;
            drawableOooO0O2.setBounds(new Rect(iWidth, iIntValue, intrinsicWidth3 + iWidth, intrinsicHeight3 + iIntValue));
            drawableOooO0O2.draw(canvas);
            Drawable drawableOooO0O3 = o0000.OooO0O0(o0Oo0oo.pic_select_a_receiver);
            int intrinsicWidth4 = drawableOooO0O3.getIntrinsicWidth();
            int intrinsicHeight4 = drawableOooO0O3.getIntrinsicHeight();
            int iOooO00o3 = (iIntValue - o0000O0.OooO00o(28)) - intrinsicHeight4;
            Rect rect2 = new Rect(i2, iOooO00o3, intrinsicWidth4 + i2, intrinsicHeight4 + iOooO00o3);
            if (z) {
                OooO00o.OooO0O0(rect2);
            }
            drawableOooO0O3.setBounds(rect2);
            drawableOooO0O3.draw(canvas);
            return;
        }
        Pair pairOooO00o2 = OooO00o.OooO00o(hollowRect, canvas, o0Oo0oo.pic_dot_line_step_three);
        Drawable drawableOooO0O4 = o0000.OooO0O0(o0Oo0oo.pic_gift_guide_arrow_down);
        int intrinsicWidth5 = drawableOooO0O4.getIntrinsicWidth();
        int intrinsicHeight5 = drawableOooO0O4.getIntrinsicHeight();
        int iOooO00o4 = o0000O0.OooO00o(52) + ((Number) pairOooO00o2.getFirst()).intValue();
        int iIntValue2 = (((Number) pairOooO00o2.getSecond()).intValue() - i2) - intrinsicHeight5;
        drawableOooO0O4.setBounds(new Rect(iOooO00o4, iIntValue2, intrinsicWidth5 + iOooO00o4, intrinsicHeight5 + iIntValue2));
        drawableOooO0O4.draw(canvas);
        Drawable drawableOooO0O5 = o0000.OooO0O0(o0Oo0oo.pic_send_step_three);
        int intrinsicWidth6 = drawableOooO0O5.getIntrinsicWidth();
        int intrinsicHeight6 = drawableOooO0O5.getIntrinsicHeight();
        int width = (canvas.getWidth() - i2) - intrinsicWidth6;
        int iOooO00o5 = (iIntValue2 - o0000O0.OooO00o(26)) - intrinsicHeight6;
        Rect rect3 = new Rect(width, iOooO00o5, intrinsicWidth6 + width, intrinsicHeight6 + iOooO00o5);
        if (z) {
            OooO00o.OooO0O0(rect3);
        }
        drawableOooO0O5.setBounds(rect3);
        drawableOooO0O5.draw(canvas);
        Drawable drawableOooO0O6 = o0000.OooO0O0(o0Oo0oo.pic_hourse_step_three);
        int intrinsicWidth7 = drawableOooO0O6.getIntrinsicWidth();
        int intrinsicHeight7 = drawableOooO0O6.getIntrinsicHeight();
        int width2 = (canvas.getWidth() - o0000O0.OooO00o(65)) - intrinsicWidth7;
        int iOooO00o6 = (iOooO00o5 - intrinsicHeight7) - o0000O0.OooO00o(6);
        Rect rect4 = new Rect(width2, iOooO00o6, intrinsicWidth7 + width2, intrinsicHeight7 + iOooO00o6);
        if (z) {
            OooO00o.OooO0O0(rect4);
        }
        drawableOooO0O6.setBounds(rect4);
        drawableOooO0O6.draw(canvas);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f30823OooO0Oo.setOnClickListener(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth() / 2;
        View view = this.f30823OooO0Oo;
        int measuredWidth2 = measuredWidth - (view.getMeasuredWidth() / 2);
        int iOooO0O0 = o0000O00.OooO0O0() / 3;
        view.layout(measuredWidth2, iOooO0O0, view.getMeasuredWidth() + measuredWidth2, view.getMeasuredHeight() + iOooO0O0);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object objM4215constructorimpl;
        View view = this.f30823OooO0Oo;
        super.onMeasure(i, i2);
        try {
            Result.Companion companion = Result.INSTANCE;
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getBackground().getIntrinsicWidth(), Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec(view.getBackground().getIntrinsicHeight(), Pow2.MAX_POW2));
            objM4215constructorimpl = Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM4215constructorimpl = Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m4218exceptionOrNullimpl(objM4215constructorimpl) != null) {
            double d = ((double) o000O000.f46650OooO00o) / 2.5d;
            view.measure(View.MeasureSpec.makeMeasureSpec((int) d, Pow2.MAX_POW2), View.MeasureSpec.makeMeasureSpec((int) ((d * ((double) Constants.ERR_ENCRYPTED_STREAM_NOT_ALLOWED_PUBLISHED)) / ((double) 284)), Pow2.MAX_POW2));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public final void setHollowAdapter(@NotNull OooO0OO adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.f30826OooO0oO = adapter;
        adapter.getClass();
        this.f30824OooO0o = 3;
        this.f30827OooO0oo = 0;
        OooO0OO oooO0OO = this.f30826OooO0oO;
        Intrinsics.checkNotNull(oooO0OO);
        View next = this.f30823OooO0Oo;
        ((OooO00o) oooO0OO).getClass();
        Intrinsics.checkNotNullParameter(next, "next");
        next.setBackgroundResource(o0Oo0oo.pic_gift_tips_next);
        requestLayout();
        invalidate();
    }

    public final void setOnDismissListener(@NotNull OooO0O0 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f30822OooO = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View view = new View(getContext());
        this.f30823OooO0Oo = view;
        addView(view);
        Paint paint = new Paint();
        this.f30825OooO0o0 = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o0000.OooO00o(o0OOO0o.color_alpha_70));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftGuideView(@NotNull Context context, @NotNull AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        View view = new View(getContext());
        this.f30823OooO0Oo = view;
        addView(view);
        Paint paint = new Paint();
        this.f30825OooO0o0 = paint;
        paint.setAntiAlias(true);
        paint.setAlpha(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        setBackgroundColor(o0000.OooO00o(o0OOO0o.color_alpha_70));
    }
}
