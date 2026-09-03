package com.opensource.svgaplayer;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.appevents.AppEventsConstants;
import com.umeng.analytics.pro.d;
import java.lang.reflect.Field;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OO0.OooO;
import p405o0Oo0OO0.OooO0OO;
import p405o0Oo0OO0.OooO0o;
import p405o0Oo0OO0.OooOO0;
import p405o0Oo0OO0.OooOO0O;
import p405o0Oo0OO0.OooOOO0;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u00013B\u0013\b\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+B\u001d\b\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010-\u001a\u0004\u0018\u00010,¢\u0006\u0004\b*\u0010.B%\b\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020\u0006¢\u0006\u0004\b*\u00100B-\b\u0016\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010-\u001a\u0004\u0018\u00010,\u0012\u0006\u0010/\u001a\u00020\u0006\u0012\u0006\u00101\u001a\u00020\u0006¢\u0006\u0004\b*\u00102J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012\"\u0004\b \u0010\u0014R$\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u00064"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Lo0Oo0OO0/OooOo;", "videoItem", "", "setVideoItem", "", "Oooo0o", "I", "getLoops", "()I", "setLoops", "(I)V", "loops", "", "Oooo0oO", "Z", "getClearsAfterStop", "()Z", "setClearsAfterStop", "(Z)V", "clearsAfterStop", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "Oooo0oo", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V", "fillMode", "<set-?>", "isAnimating", "setAnimating", "Lo0Oo0OO0/OooO0o;", "callback", "Lo0Oo0OO0/OooO0o;", "getCallback", "()Lo0Oo0OO0/OooO0o;", "setCallback", "(Lo0Oo0OO0/OooO0o;)V", "Landroid/content/Context;", d.R, "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "FillMode", "library_release"}, k = 1, mv = {1, 4, 0})
public class SVGAImageView extends ImageView {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final /* synthetic */ int f19424OoooO0 = 0;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public OooO0o f19425Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name and from kotlin metadata */
    public int loops;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name and from kotlin metadata */
    public boolean clearsAfterStop;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FillMode fillMode;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public ValueAnimator f19429OoooO00;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "", "Backward", "Forward", "library_release"}, k = 1, mv = {1, 4, 0})
    public enum FillMode {
        Backward,
        Forward
    }

    public static final class OooO00o implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f19430Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f19431Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f19432Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ SVGAImageView f19433Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f19434OoooO00;

        /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0169OooO00o implements OooOo00.OooO0O0 {

            /* JADX INFO: renamed from: com.opensource.svgaplayer.SVGAImageView$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class RunnableC0170OooO00o implements Runnable {

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public final /* synthetic */ OooOo f19437Oooo0oO;

                public RunnableC0170OooO00o(OooOo oooOo) {
                    this.f19437Oooo0oO = oooOo;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    OooOo oooOo = this.f19437Oooo0oO;
                    OooO00o oooO00o = OooO00o.this;
                    oooOo.f39066OooO00o = oooO00o.f19430Oooo;
                    oooO00o.f19433Oooo0oo.setVideoItem(oooOo);
                    Drawable drawable = OooO00o.this.f19433Oooo0oo.getDrawable();
                    if (!(drawable instanceof OooO)) {
                        drawable = null;
                    }
                    OooO oooO = (OooO) drawable;
                    if (oooO != null) {
                        ImageView.ScaleType scaleType = OooO00o.this.f19433Oooo0oo.getScaleType();
                        Intrinsics.checkExpressionValueIsNotNull(scaleType, "scaleType");
                        oooO.f39041OooO0OO = scaleType;
                    }
                    OooO00o oooO00o2 = OooO00o.this;
                    if (oooO00o2.f19434OoooO00) {
                        oooO00o2.f19433Oooo0oo.OooO0OO();
                    }
                }
            }

            public C0169OooO00o() {
            }

            @Override // o0Oo0OO0.OooOo00.OooO0O0
            public final void onComplete(@NotNull OooOo oooOo) {
                OooO00o.this.f19433Oooo0oo.post(new RunnableC0170OooO00o(oooOo));
            }

            @Override // o0Oo0OO0.OooOo00.OooO0O0
            public final void onError() {
            }
        }

        public OooO00o(String str, OooOo00 oooOo00, SVGAImageView sVGAImageView, boolean z, boolean z2) {
            this.f19431Oooo0o = str;
            this.f19432Oooo0oO = oooOo00;
            this.f19433Oooo0oo = sVGAImageView;
            this.f19430Oooo = z;
            this.f19434OoooO00 = z2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C0169OooO00o c0169OooO00o = new C0169OooO00o();
            if (StringsKt.OooOoOO(this.f19431Oooo0o, "http://") || StringsKt.OooOoOO(this.f19431Oooo0o, "https://")) {
                this.f19432Oooo0oO.OooO(new URL(this.f19431Oooo0o), c0169OooO00o);
            } else {
                this.f19432Oooo0oO.OooO0oO(this.f19431Oooo0o, c0169OooO00o);
            }
        }
    }

    public SVGAImageView(@Nullable Context context) {
        super(context);
        this.clearsAfterStop = true;
        this.fillMode = FillMode.Forward;
    }

    private final void setAnimating(boolean z) {
    }

    public final void OooO00o(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, OooO0OO.SVGAImageView, 0, 0);
        this.loops = typedArrayObtainStyledAttributes.getInt(OooO0OO.SVGAImageView_loopCount, 0);
        this.clearsAfterStop = typedArrayObtainStyledAttributes.getBoolean(OooO0OO.SVGAImageView_clearsAfterStop, true);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(OooO0OO.SVGAImageView_antiAlias, true);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(OooO0OO.SVGAImageView_autoPlay, true);
        String string = typedArrayObtainStyledAttributes.getString(OooO0OO.SVGAImageView_fillMode);
        if (string != null) {
            if (Intrinsics.areEqual(string, AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                this.fillMode = FillMode.Backward;
            } else if (Intrinsics.areEqual(string, "1")) {
                this.fillMode = FillMode.Forward;
            }
        }
        String string2 = typedArrayObtainStyledAttributes.getString(OooO0OO.SVGAImageView_source);
        if (string2 != null) {
            Context context2 = getContext();
            Intrinsics.checkExpressionValueIsNotNull(context2, "context");
            new Thread(new OooO00o(string2, new OooOo00(context2), this, z, z2)).start();
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OooO0O0() {
        OooO0o0(false);
        OooO0o oooO0o = this.f19425Oooo;
        if (oooO0o != null) {
            oooO0o.onPause();
        }
    }

    public final void OooO0OO() {
        OooO0o0(false);
        Drawable drawable = getDrawable();
        if (!(drawable instanceof OooO)) {
            drawable = null;
        }
        OooO oooO = (OooO) drawable;
        if (oooO != null) {
            oooO.OooO00o(false);
            ImageView.ScaleType scaleType = getScaleType();
            Intrinsics.checkExpressionValueIsNotNull(scaleType, "scaleType");
            oooO.f39041OooO0OO = scaleType;
            OooOo oooOo = oooO.f39043OooO0o0;
            int iMax = Math.max(0, 0);
            int iMin = Math.min(oooOo.f39069OooO0Oo - 1, 2147483646);
            ValueAnimator animator = ValueAnimator.ofInt(iMax, iMin);
            double d = 1.0d;
            try {
                Class<?> cls = Class.forName("android.animation.ValueAnimator");
                Field declaredField = cls.getDeclaredField("sDurationScale");
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                    double d2 = declaredField.getFloat(cls);
                    if (d2 == 0.0d) {
                        try {
                            declaredField.setFloat(cls, 1.0f);
                            Log.e("SVGAPlayer", "The animation duration scale has been reset to 1.0x, because you closed it on developer options.");
                        } catch (Exception unused) {
                            d = d2;
                        }
                    } else {
                        d = d2;
                    }
                }
            } catch (Exception unused2) {
            }
            Intrinsics.checkExpressionValueIsNotNull(animator, "animator");
            animator.setInterpolator(new LinearInterpolator());
            animator.setDuration((long) (((double) ((1000 / oooOo.f39068OooO0OO) * ((iMin - iMax) + 1))) / d));
            int i = this.loops;
            animator.setRepeatCount(i <= 0 ? 99999 : i - 1);
            animator.addUpdateListener(new OooOO0O(animator, this, oooO));
            animator.addListener(new OooOOO0(iMax, iMin, this, oooO));
            animator.start();
            this.f19429OoooO00 = animator;
        }
    }

    public final void OooO0Oo() {
        OooO0o0(this.clearsAfterStop);
    }

    public final void OooO0o0(boolean z) {
        ValueAnimator valueAnimator = this.f19429OoooO00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f19429OoooO00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f19429OoooO00;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        Drawable drawable = getDrawable();
        if (!(drawable instanceof OooO)) {
            drawable = null;
        }
        OooO oooO = (OooO) drawable;
        if (oooO != null) {
            oooO.OooO00o(z);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getCallback, reason: from getter */
    public final OooO0o getF19425Oooo() {
        return this.f19425Oooo;
    }

    public final boolean getClearsAfterStop() {
        return this.clearsAfterStop;
    }

    @NotNull
    public final FillMode getFillMode() {
        return this.fillMode;
    }

    public final int getLoops() {
        return this.loops;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f19429OoooO00;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f19429OoooO00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f19429OoooO00;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
    }

    public final void setCallback(@Nullable OooO0o oooO0o) {
        this.f19425Oooo = oooO0o;
    }

    public final void setClearsAfterStop(boolean z) {
        this.clearsAfterStop = z;
    }

    public final void setFillMode(@NotNull FillMode fillMode) {
        this.fillMode = fillMode;
    }

    public final void setLoops(int i) {
        this.loops = i;
    }

    public final void setVideoItem(@Nullable OooOo videoItem) {
        OooOO0 oooOO1 = new OooOO0();
        if (videoItem == null) {
            setImageDrawable(null);
            return;
        }
        OooO oooO = new OooO(videoItem, oooOO1);
        oooO.OooO00o(this.clearsAfterStop);
        setImageDrawable(oooO);
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.clearsAfterStop = true;
        this.fillMode = FillMode.Forward;
        if (attributeSet != null) {
            OooO00o(attributeSet);
        }
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.clearsAfterStop = true;
        this.fillMode = FillMode.Forward;
        if (attributeSet != null) {
            OooO00o(attributeSet);
        }
    }

    public SVGAImageView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.clearsAfterStop = true;
        this.fillMode = FillMode.Forward;
        if (attributeSet != null) {
            OooO00o(attributeSet);
        }
    }
}
