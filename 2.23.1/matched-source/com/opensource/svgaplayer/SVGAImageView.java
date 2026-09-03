package com.opensource.svgaplayer;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.net.http.HttpResponseCache;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.opensource.svgaplayer.SVGACache;
import com.opensource.svgaplayer.proto.MovieEntity;
import com.yalla.yalla.data.constant.FeedbackType;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o0OO0O0O.o00Ooo;
import o0OO0O0O.o0OoOo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001:\u000389:B'\b\u0007\u0012\u0006\u00102\u001a\u000201\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u000b¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u00100\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u0006;"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView;", "Landroid/widget/ImageView;", "Lo0OO0O0O/o00Ooo;", "videoItem", "", "setVideoItem", "Lo0OO0O0O/OooO0o;", "clickListener", "setOnAnimKeyClickListener", "Lo0OO0O0O/OooO;", "getSVGADrawable", "", "OooO0o0", "I", "getLoops", "()I", "setLoops", "(I)V", "loops", "", "OooO0o", "Z", "getClearsAfterStop", "()Z", "setClearsAfterStop", "(Z)V", "getClearsAfterStop$annotations", "()V", "clearsAfterStop", "OooO0oO", "getClearsAfterDetached", "setClearsAfterDetached", "clearsAfterDetached", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "OooO0oo", "Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "getFillMode", "()Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "setFillMode", "(Lcom/opensource/svgaplayer/SVGAImageView$FillMode;)V", "fillMode", "Lo0OO0O0O/OooO0OO;", "OooO", "Lo0OO0O0O/OooO0OO;", "getCallback", "()Lo0OO0O0O/OooO0OO;", "setCallback", "(Lo0OO0O0O/OooO0OO;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "OooO00o", "OooO0O0", "FillMode", "com.opensource.svgaplayer"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSVGAImageView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAImageView.kt\ncom/opensource/svgaplayer/SVGAImageView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,329:1\n1#2:330\n*E\n"})
public class SVGAImageView extends ImageView {

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final /* synthetic */ int f20791OooOOo0 = 0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0OO0O0O.OooO0OO callback;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final String f20793OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    public boolean clearsAfterStop;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    public int loops;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name and from kotlin metadata */
    public boolean clearsAfterDetached;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public FillMode fillMode;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ValueAnimator f20798OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public boolean f20799OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public boolean f20800OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f20801OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final OooO00o f20802OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f20803OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f20804OooOOOo;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/opensource/svgaplayer/SVGAImageView$FillMode;", "", "Backward", "Forward", "Clear", "com.opensource.svgaplayer"}, k = 1, mv = {1, 8, 0})
    public enum FillMode {
        Backward,
        Forward,
        Clear
    }

    public static final class OooO00o implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final WeakReference<SVGAImageView> f20805OooO0Oo;

        public OooO00o(@NotNull SVGAImageView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20805OooO0Oo = new WeakReference<>(view);
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.f20805OooO0Oo.get() == null) {
                return;
            }
            int i = SVGAImageView.f20791OooOOo0;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SVGAImageView sVGAImageView = this.f20805OooO0Oo.get();
            if (sVGAImageView != null) {
                SVGAImageView.OooO0O0(sVGAImageView);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(@NotNull Animator animation) {
            o0OO0O0O.OooO0OO callback;
            Intrinsics.checkNotNullParameter(animation, "animation");
            SVGAImageView sVGAImageView = this.f20805OooO0Oo.get();
            if (sVGAImageView == null || (callback = sVGAImageView.getCallback()) == null) {
                return;
            }
            callback.OooO00o();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(@NotNull Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            if (this.f20805OooO0Oo.get() == null) {
                return;
            }
            int i = SVGAImageView.f20791OooOOo0;
        }
    }

    public static final class OooO0O0 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @NotNull
        public final WeakReference<SVGAImageView> f20806OooO0Oo;

        public OooO0O0(@NotNull SVGAImageView view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.f20806OooO0Oo = new WeakReference<>(view);
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(@NotNull ValueAnimator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            SVGAImageView sVGAImageView = this.f20806OooO0Oo.get();
            if (sVGAImageView != null) {
                SVGAImageView.OooO0OO(sVGAImageView, animation);
            }
        }
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FillMode.values().length];
            try {
                iArr[FillMode.Backward.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FillMode.Forward.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FillMode.Clear.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAImageView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void OooO00o(SVGAImageView this$0, o00Ooo videoItem) {
        Intrinsics.checkNotNullParameter(videoItem, "$videoItem");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        videoItem.f42401OooO0O0 = this$0.f20799OooOO0O;
        this$0.setVideoItem(videoItem);
        o0OO0O0O.OooO sVGADrawable = this$0.getSVGADrawable();
        if (sVGADrawable != null) {
            ImageView.ScaleType scaleType = this$0.getScaleType();
            Intrinsics.checkNotNullExpressionValue(scaleType, "scaleType");
            Intrinsics.checkNotNullParameter(scaleType, "<set-?>");
            sVGADrawable.f42355OooO0o0 = scaleType;
        }
        if (this$0.f20800OooOO0o) {
            this$0.OooO0Oo();
        }
    }

    public static final void OooO0O0(SVGAImageView sVGAImageView) {
        sVGAImageView.OooO0o();
        o0OO0O0O.OooO sVGADrawable = sVGAImageView.getSVGADrawable();
        if (sVGADrawable != null) {
            int i = OooO0OO.$EnumSwitchMapping$0[sVGAImageView.fillMode.ordinal()];
            if (i == 1) {
                int i2 = sVGAImageView.f20803OooOOOO;
                if (sVGADrawable.f42353OooO0Oo != i2) {
                    sVGADrawable.f42353OooO0Oo = i2;
                    sVGADrawable.invalidateSelf();
                }
            } else if (i == 2) {
                int i3 = sVGAImageView.f20804OooOOOo;
                if (sVGADrawable.f42353OooO0Oo != i3) {
                    sVGADrawable.f42353OooO0Oo = i3;
                    sVGADrawable.invalidateSelf();
                }
            } else if (i == 3) {
                sVGADrawable.OooO00o(true);
            }
        }
        o0OO0O0O.OooO0OO oooO0OO = sVGAImageView.callback;
        if (oooO0OO != null) {
            oooO0OO.OooO0O0();
        }
    }

    public static final void OooO0OO(SVGAImageView sVGAImageView, ValueAnimator valueAnimator) {
        o0OO0O0O.OooO sVGADrawable = sVGAImageView.getSVGADrawable();
        if (sVGADrawable == null) {
            return;
        }
        Object animatedValue = valueAnimator != null ? valueAnimator.getAnimatedValue() : null;
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int iIntValue = ((Integer) animatedValue).intValue();
        if (sVGADrawable.f42353OooO0Oo != iIntValue) {
            sVGADrawable.f42353OooO0Oo = iIntValue;
            sVGADrawable.invalidateSelf();
        }
        int i = sVGADrawable.f42353OooO0Oo;
        int i2 = sVGADrawable.f42350OooO00o.f42404OooO0o;
        o0OO0O0O.OooO0OO oooO0OO = sVGAImageView.callback;
        if (oooO0OO != null) {
            oooO0OO.OooO0OO(i);
        }
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "It is recommended to use clearAfterDetached, or manually call to SVGAVideoEntity#clear.If you just consider cleaning up the canvas after playing, you can use FillMode#Clear.")
    public static /* synthetic */ void getClearsAfterStop$annotations() {
    }

    private final o0OO0O0O.OooO getSVGADrawable() {
        Drawable drawable = getDrawable();
        if (drawable instanceof o0OO0O0O.OooO) {
            return (o0OO0O0O.OooO) drawable;
        }
        return null;
    }

    public final void OooO0Oo() {
        OooO0oO(false);
        String tag = this.f20793OooO0Oo;
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter("================ start animation ================", "msg");
        o0OO0O0O.OooO sVGADrawable = getSVGADrawable();
        if (sVGADrawable == null) {
            return;
        }
        o0OO0O0O.OooO sVGADrawable2 = getSVGADrawable();
        if (sVGADrawable2 != null) {
            sVGADrawable2.OooO00o(false);
            ImageView.ScaleType scaleType = getScaleType();
            Intrinsics.checkNotNullExpressionValue(scaleType, "scaleType");
            Intrinsics.checkNotNullParameter(scaleType, "<set-?>");
            sVGADrawable2.f42355OooO0o0 = scaleType;
        }
        this.f20803OooOOOO = Math.max(0, 0);
        o00Ooo o00ooo2 = sVGADrawable.f42350OooO00o;
        int iMin = Math.min(o00ooo2.f42404OooO0o - 1, 2147483646);
        this.f20804OooOOOo = iMin;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f20803OooOOOO, iMin);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        double d = (1000 / o00ooo2.f42405OooO0o0) * ((this.f20804OooOOOo - this.f20803OooOOOO) + 1);
        double d2 = 1.0d;
        try {
            Class<?> cls = Class.forName("android.animation.ValueAnimator");
            Method declaredMethod = cls.getDeclaredMethod("getDurationScale", new Class[0]);
            if (declaredMethod != null) {
                Object objInvoke = declaredMethod.invoke(cls, new Object[0]);
                Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Float");
                double dFloatValue = ((Float) objInvoke).floatValue();
                if (dFloatValue == 0.0d) {
                    try {
                        Method declaredMethod2 = cls.getDeclaredMethod("setDurationScale", Float.TYPE);
                        if (declaredMethod2 == null) {
                            d2 = dFloatValue;
                        } else {
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(cls, Float.valueOf(1.0f));
                            Intrinsics.checkNotNullParameter(tag, "tag");
                            Intrinsics.checkNotNullParameter("The animation duration scale has been reset to 1.0x, because you closed it on developer options.", "msg");
                        }
                    } catch (Exception e) {
                        e = e;
                        d2 = dFloatValue;
                        e.printStackTrace();
                    }
                } else {
                    d2 = dFloatValue;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        valueAnimatorOfInt.setDuration((long) (d / d2));
        int i = this.loops;
        valueAnimatorOfInt.setRepeatCount(i <= 0 ? 99999 : i - 1);
        valueAnimatorOfInt.addUpdateListener(this.f20801OooOOO);
        valueAnimatorOfInt.addListener(this.f20802OooOOO0);
        valueAnimatorOfInt.start();
        this.f20798OooOO0 = valueAnimatorOfInt;
    }

    public final void OooO0o() {
        OooO0oO(this.clearsAfterStop);
    }

    public final void OooO0o0() {
        OooO0oO(false);
        o0OO0O0O.OooO0OO oooO0OO = this.callback;
        if (oooO0OO != null) {
            oooO0OO.onPause();
        }
        o0OO0O0O.OooO sVGADrawable = getSVGADrawable();
        if (sVGADrawable == null || sVGADrawable.f42353OooO0Oo == 0) {
            return;
        }
        sVGADrawable.f42353OooO0Oo = 0;
        sVGADrawable.invalidateSelf();
    }

    public final void OooO0oO(boolean z) {
        ValueAnimator valueAnimator = this.f20798OooOO0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.f20798OooOO0;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllListeners();
        }
        ValueAnimator valueAnimator3 = this.f20798OooOO0;
        if (valueAnimator3 != null) {
            valueAnimator3.removeAllUpdateListeners();
        }
        o0OO0O0O.OooO sVGADrawable = getSVGADrawable();
        if (sVGADrawable != null) {
            o00Ooo o00ooo2 = sVGADrawable.f42350OooO00o;
            Iterator<T> it = o00ooo2.f42407OooO0oo.iterator();
            while (it.hasNext()) {
                Integer num = ((p334o0OO0Ooo.OooO0o) it.next()).f42421OooO0Oo;
                if (num != null) {
                    int iIntValue = num.intValue();
                    o0OoOo0.f42413OooO00o.getClass();
                    SoundPool soundPool = o00ooo2.f42399OooO;
                    if (soundPool != null) {
                        soundPool.stop(iIntValue);
                    }
                }
            }
        }
        o0OO0O0O.OooO sVGADrawable2 = getSVGADrawable();
        if (sVGADrawable2 == null) {
            return;
        }
        sVGADrawable2.OooO00o(z);
    }

    @Nullable
    public final o0OO0O0O.OooO0OO getCallback() {
        return this.callback;
    }

    public final boolean getClearsAfterDetached() {
        return this.clearsAfterDetached;
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
        OooO0oO(this.clearsAfterDetached);
        if (this.clearsAfterDetached) {
            o0OO0O0O.OooO sVGADrawable = getSVGADrawable();
            if (sVGADrawable != null) {
                sVGADrawable.OooO00o(true);
            }
            o0OO0O0O.OooO sVGADrawable2 = getSVGADrawable();
            if (sVGADrawable2 != null) {
                o00Ooo o00ooo2 = sVGADrawable2.f42350OooO00o;
                for (p334o0OO0Ooo.OooO0o oooO0o : o00ooo2.f42407OooO0oo) {
                    Integer num = oooO0o.f42421OooO0Oo;
                    if (num != null) {
                        int iIntValue = num.intValue();
                        o0OoOo0.f42413OooO00o.getClass();
                        SoundPool soundPool = o00ooo2.f42399OooO;
                        if (soundPool != null) {
                            soundPool.stop(iIntValue);
                        }
                    }
                    oooO0o.f42421OooO0Oo = null;
                }
                o0OoOo0.f42413OooO00o.getClass();
                SoundPool soundPool2 = o00ooo2.f42399OooO;
                if (soundPool2 != null) {
                    soundPool2.release();
                }
                o00ooo2.f42399OooO = null;
                o00ooo2.f42407OooO0oo = CollectionsKt.emptyList();
                o00ooo2.f42406OooO0oO = CollectionsKt.emptyList();
                o00ooo2.f42408OooOO0.clear();
            }
            setImageDrawable(null);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (!(motionEvent != null && motionEvent.getAction() == 0)) {
            return super.onTouchEvent(motionEvent);
        }
        o0OO0O0O.OooO sVGADrawable = getSVGADrawable();
        if (sVGADrawable == null) {
            return super.onTouchEvent(motionEvent);
        }
        for (Map.Entry<String, int[]> entry : sVGADrawable.f42351OooO0O0.f42364OooO0oo.entrySet()) {
            entry.getKey();
            int[] value = entry.getValue();
            if (motionEvent.getX() >= value[0] && motionEvent.getX() <= value[2] && motionEvent.getY() >= value[1]) {
                int i = (motionEvent.getY() > value[3] ? 1 : (motionEvent.getY() == value[3] ? 0 : -1));
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setCallback(@Nullable o0OO0O0O.OooO0OO oooO0OO) {
        this.callback = oooO0OO;
    }

    public final void setClearsAfterDetached(boolean z) {
        this.clearsAfterDetached = z;
    }

    public final void setClearsAfterStop(boolean z) {
        this.clearsAfterStop = z;
    }

    public final void setFillMode(@NotNull FillMode fillMode) {
        Intrinsics.checkNotNullParameter(fillMode, "<set-?>");
        this.fillMode = fillMode;
    }

    public final void setLoops(int i) {
        this.loops = i;
    }

    public final void setOnAnimKeyClickListener(@NotNull o0OO0O0O.OooO0o clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
    }

    public final void setVideoItem(@Nullable o00Ooo videoItem) {
        o0OO0O0O.OooOO0 oooOO1 = new o0OO0O0O.OooOO0();
        if (videoItem == null) {
            setImageDrawable(null);
            return;
        }
        o0OO0O0O.OooO oooO = new o0OO0O0O.OooO(videoItem, oooOO1);
        oooO.OooO00o(true);
        setImageDrawable(oooO);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SVGAImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @JvmOverloads
    public SVGAImageView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        File fileOooO0OO;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20793OooO0Oo = "SVGAImageView";
        FillMode fillMode = FillMode.Forward;
        this.fillMode = fillMode;
        this.f20799OooOO0O = true;
        this.f20800OooOO0o = true;
        this.f20802OooOOO0 = new OooO00o(this);
        this.f20801OooOOO = new OooO0O0(this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, o0OO0O0O.OooO0O0.SVGAImageView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.theme.obtainStyl…able.SVGAImageView, 0, 0)");
            this.loops = typedArrayObtainStyledAttributes.getInt(o0OO0O0O.OooO0O0.SVGAImageView_loopCount, 0);
            this.clearsAfterStop = typedArrayObtainStyledAttributes.getBoolean(o0OO0O0O.OooO0O0.SVGAImageView_clearsAfterStop, false);
            this.clearsAfterDetached = typedArrayObtainStyledAttributes.getBoolean(o0OO0O0O.OooO0O0.SVGAImageView_clearsAfterDetached, false);
            this.f20799OooOO0O = typedArrayObtainStyledAttributes.getBoolean(o0OO0O0O.OooO0O0.SVGAImageView_antiAlias, true);
            this.f20800OooOO0o = typedArrayObtainStyledAttributes.getBoolean(o0OO0O0O.OooO0O0.SVGAImageView_autoPlay, true);
            String string = typedArrayObtainStyledAttributes.getString(o0OO0O0O.OooO0O0.SVGAImageView_fillMode);
            if (string != null) {
                switch (string.hashCode()) {
                    case 48:
                        if (string.equals(AppEventsConstants.EVENT_PARAM_VALUE_NO)) {
                            this.fillMode = FillMode.Backward;
                        }
                        break;
                    case 49:
                        if (string.equals("1")) {
                            this.fillMode = fillMode;
                        }
                        break;
                    case 50:
                        if (string.equals(FeedbackType.Suggestions)) {
                            this.fillMode = FillMode.Clear;
                        }
                        break;
                }
            }
            String string2 = typedArrayObtainStyledAttributes.getString(o0OO0O0O.OooO0O0.SVGAImageView_source);
            if (string2 != null) {
                WeakReference weakReference = new WeakReference(this);
                final com.opensource.svgaplayer.OooO0OO oooO0OO = new com.opensource.svgaplayer.OooO0OO(getContext());
                if (!StringsKt.Oooo00o(string2, "http://") && !StringsKt.Oooo00o(string2, "https://")) {
                    oooO0OO.OooO00o(string2, new com.opensource.svgaplayer.OooO00o(weakReference));
                } else {
                    final URL url = new URL(string2);
                    final com.opensource.svgaplayer.OooO00o oooO00o = new com.opensource.svgaplayer.OooO00o(weakReference);
                    Intrinsics.checkNotNullParameter(url, "url");
                    if (oooO0OO.f20775OooO00o == null) {
                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter("在配置 SVGAParser context 前, 无法解析 SVGA 文件。", "msg");
                    } else {
                        final String string3 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(string3, "url.toString()");
                        String msg = "================ decode from url: " + string3 + " ================";
                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                        Intrinsics.checkNotNullParameter(msg, "msg");
                        SVGACache.Type type = SVGACache.f20789OooO00o;
                        Intrinsics.checkNotNullParameter(url, "url");
                        String string4 = url.toString();
                        Intrinsics.checkNotNullExpressionValue(string4, "url.toString()");
                        final String cacheKey = SVGACache.OooO0O0(string4);
                        Intrinsics.checkNotNullParameter(cacheKey, "cacheKey");
                        if (SVGACache.f20789OooO00o == SVGACache.Type.DEFAULT) {
                            fileOooO0OO = SVGACache.OooO00o(cacheKey);
                        } else {
                            fileOooO0OO = SVGACache.OooO0OO(cacheKey);
                        }
                        boolean zExists = fileOooO0OO.exists();
                        ExecutorService executorService = com.opensource.svgaplayer.OooO0OO.f20774OooO0Oo;
                        if (zExists) {
                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter("this url cached", "msg");
                            executorService.execute(new Runnable() { // from class: o0OO0O0O.OooOOO0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final com.opensource.svgaplayer.OooO0OO this$0 = oooO0OO;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    final String cacheKey2 = cacheKey;
                                    Intrinsics.checkNotNullParameter(cacheKey2, "$cacheKey");
                                    final String urlPath = string3;
                                    Intrinsics.checkNotNullParameter(urlPath, "$urlPath");
                                    boolean z = SVGACache.f20789OooO00o == SVGACache.Type.DEFAULT;
                                    final com.opensource.svgaplayer.OooO0OO.OooO0O0 oooO0O0 = oooO00o;
                                    if (z) {
                                        this$0.OooO0O0(cacheKey2, oooO0O0, urlPath);
                                        return;
                                    }
                                    this$0.getClass();
                                    Intrinsics.checkNotNullParameter(cacheKey2, "cacheKey");
                                    com.opensource.svgaplayer.OooO0OO.f20774OooO0Oo.execute(new Runnable() { // from class: o0OO0O0O.OooOo
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            StringBuilder sb;
                                            Unit unit;
                                            Unit unit2;
                                            String str = urlPath;
                                            com.opensource.svgaplayer.OooO0OO.OooO0O0 oooO0O1 = oooO0O0;
                                            String cacheKey3 = cacheKey2;
                                            Intrinsics.checkNotNullParameter(cacheKey3, "$cacheKey");
                                            com.opensource.svgaplayer.OooO0OO this$1 = this$0;
                                            Intrinsics.checkNotNullParameter(this$1, "this$0");
                                            try {
                                                try {
                                                    String msg2 = "================ decode " + str + " from svga cachel file to entity ================";
                                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                    Intrinsics.checkNotNullParameter(msg2, "msg");
                                                    FileInputStream fileInputStream = new FileInputStream(SVGACache.OooO0OO(cacheKey3));
                                                    try {
                                                        this$1.getClass();
                                                        byte[] bArrOooOO0 = com.opensource.svgaplayer.OooO0OO.OooOO0(fileInputStream);
                                                        if (bArrOooOO0 != null) {
                                                            if (com.opensource.svgaplayer.OooO0OO.OooO(bArrOooOO0)) {
                                                                this$1.OooO0O0(cacheKey3, oooO0O1, str);
                                                            } else {
                                                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                                Intrinsics.checkNotNullParameter("inflate start", "msg");
                                                                byte[] bArrOooO0o = com.opensource.svgaplayer.OooO0OO.OooO0o(bArrOooOO0);
                                                                if (bArrOooO0o != null) {
                                                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                                    Intrinsics.checkNotNullParameter("inflate complete", "msg");
                                                                    MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrOooO0o);
                                                                    Intrinsics.checkNotNullExpressionValue(movieEntityDecode, "ADAPTER.decode(it)");
                                                                    o00Ooo o00ooo2 = new o00Ooo(movieEntityDecode, new File(cacheKey3));
                                                                    Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                                    Intrinsics.checkNotNullParameter("SVGAVideoEntity prepare start", "msg");
                                                                    o00ooo2.OooO0Oo(new com.opensource.svgaplayer.OooO(this$1, o00ooo2, oooO0O1, str));
                                                                    unit2 = Unit.INSTANCE;
                                                                } else {
                                                                    unit2 = null;
                                                                }
                                                                if (unit2 == null) {
                                                                    com.opensource.svgaplayer.OooO0OO.OooO0oo(new Exception("inflate(bytes) cause exception"), oooO0O1, str);
                                                                }
                                                            }
                                                            unit = Unit.INSTANCE;
                                                        } else {
                                                            unit = null;
                                                        }
                                                        if (unit == null) {
                                                            com.opensource.svgaplayer.OooO0OO.OooO0oo(new Exception("readAsBytes(inputStream) cause exception"), oooO0O1, str);
                                                        }
                                                        Unit unit3 = Unit.INSTANCE;
                                                        CloseableKt.closeFinally(fileInputStream, null);
                                                        sb = new StringBuilder("================ decode ");
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            CloseableKt.closeFinally(fileInputStream, th);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Exception e) {
                                                    this$1.getClass();
                                                    com.opensource.svgaplayer.OooO0OO.OooO0oo(e, oooO0O1, str);
                                                    sb = new StringBuilder("================ decode ");
                                                }
                                                sb.append(str);
                                                sb.append(" from svga cachel file to entity end ================");
                                                String msg3 = sb.toString();
                                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                Intrinsics.checkNotNullParameter(msg3, "msg");
                                            } catch (Throwable th3) {
                                                String msg4 = "================ decode " + str + " from svga cachel file to entity end ================";
                                                Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                Intrinsics.checkNotNullParameter(msg4, "msg");
                                                throw th3;
                                            }
                                        }
                                    });
                                }
                            });
                        } else {
                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                            Intrinsics.checkNotNullParameter("no cached, prepare to download", "msg");
                            final OooOO0 complete = new OooOO0(oooO00o, oooO0OO, cacheKey, string3);
                            final OooOO0O failure = new OooOO0O(url, oooO0OO, oooO00o, string3);
                            final com.opensource.svgaplayer.OooO0OO.OooO00o oooO00o2 = oooO0OO.f20776OooO0O0;
                            oooO00o2.getClass();
                            Intrinsics.checkNotNullParameter(url, "url");
                            Intrinsics.checkNotNullParameter(complete, "complete");
                            Intrinsics.checkNotNullParameter(failure, "failure");
                            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                            new com.opensource.svgaplayer.OooO0O0(booleanRef);
                            executorService.execute(new Runnable() { // from class: o0OO0O0O.Oooo0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.opensource.svgaplayer.OooO0OO.OooO00o this$0 = oooO00o2;
                                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                                    URL url2 = url;
                                    Intrinsics.checkNotNullParameter(url2, "$url");
                                    Function1 failure2 = failure;
                                    Intrinsics.checkNotNullParameter(failure2, "$failure");
                                    Ref.BooleanRef cancelled = booleanRef;
                                    Intrinsics.checkNotNullParameter(cancelled, "$cancelled");
                                    Function1 complete2 = complete;
                                    Intrinsics.checkNotNullParameter(complete2, "$complete");
                                    try {
                                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter("================ svga file download start ================", "msg");
                                        if (HttpResponseCache.getInstalled() == null) {
                                            this$0.getClass();
                                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter("SVGAParser can not handle cache before install HttpResponseCache. see https://github.com/yyued/SVGAPlayer-Android#cache", "msg");
                                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                            Intrinsics.checkNotNullParameter("在配置 HttpResponseCache 前 SVGAParser 无法缓存. 查看 https://github.com/yyued/SVGAPlayer-Android#cache ", "msg");
                                        }
                                        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(url2.openConnection());
                                        HttpURLConnection httpURLConnection = uRLConnection instanceof HttpURLConnection ? (HttpURLConnection) uRLConnection : null;
                                        if (httpURLConnection != null) {
                                            httpURLConnection.setConnectTimeout(20000);
                                            httpURLConnection.setRequestMethod("GET");
                                            httpURLConnection.setRequestProperty("Connection", "close");
                                            httpURLConnection.connect();
                                            InputStream inputStream = httpURLConnection.getInputStream();
                                            try {
                                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byte[] bArr = new byte[4096];
                                                    while (true) {
                                                        if (cancelled.element) {
                                                            Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                            Intrinsics.checkNotNullParameter("================ svga file download canceled ================", "msg");
                                                            break;
                                                        } else {
                                                            int i2 = inputStream.read(bArr, 0, 4096);
                                                            if (i2 == -1) {
                                                                break;
                                                            } else {
                                                                byteArrayOutputStream.write(bArr, 0, i2);
                                                            }
                                                        }
                                                    }
                                                    if (cancelled.element) {
                                                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                        Intrinsics.checkNotNullParameter("================ svga file download canceled ================", "msg");
                                                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                                                        CloseableKt.closeFinally(inputStream, null);
                                                        return;
                                                    }
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                                                    try {
                                                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                                        Intrinsics.checkNotNullParameter("================ svga file download complete ================", "msg");
                                                        complete2.invoke(byteArrayInputStream);
                                                        Unit unit = Unit.INSTANCE;
                                                        CloseableKt.closeFinally(byteArrayInputStream, null);
                                                        CloseableKt.closeFinally(byteArrayOutputStream, null);
                                                        CloseableKt.closeFinally(inputStream, null);
                                                        return;
                                                    } catch (Throwable th) {
                                                        try {
                                                            throw th;
                                                        } catch (Throwable th2) {
                                                            CloseableKt.closeFinally(byteArrayInputStream, th);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        CloseableKt.closeFinally(byteArrayOutputStream, th3);
                                                        throw th4;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                throw th5;
                                            }
                                            try {
                                                throw th5;
                                            } catch (Throwable th6) {
                                                CloseableKt.closeFinally(inputStream, th5);
                                                throw th6;
                                            }
                                        }
                                    } catch (Exception e) {
                                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter("================ svga file download fail ================", "msg");
                                        String msg2 = "error: " + e.getMessage();
                                        Intrinsics.checkNotNullParameter("SVGAParser", ViewHierarchyConstants.TAG_KEY);
                                        Intrinsics.checkNotNullParameter(msg2, "msg");
                                        e.printStackTrace();
                                        failure2.invoke(e);
                                    }
                                }
                            });
                        }
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
