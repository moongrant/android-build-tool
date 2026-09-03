package com.code.android.uikit.svga;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import coil.size.Scale;
import coil.target.ImageViewTarget;
import com.code.android.util.OooOo00;
import com.code.android.util.o00oO0o;
import com.opensource.svgaplayer.SVGAImageView;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import o0OO0O0.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p097o000o0oO.o0000oo;
import p097o000o0oO.o000O000;
import p109o000ooo.o00O0O;
import p154o00OoO00.o000oOoO;
import p154o00OoO00.o00Oo0;
import p154o00OoO00.o00Ooo;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R(\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R,\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0018\u00010\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR?\u0010+\u001a\u001f\u0012\u0013\u0012\u00110!¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u0018\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00064"}, d2 = {"Lcom/code/android/uikit/svga/SVGAView;", "Lcom/opensource/svgaplayer/SVGAImageView;", "Lcom/code/android/uikit/svga/SVGAPlayState;", "<set-?>", "OooOOo", "Lcom/code/android/uikit/svga/SVGAPlayState;", "getPlayState", "()Lcom/code/android/uikit/svga/SVGAPlayState;", "playState", "", "OooOo", "Ljava/lang/String;", "getCurrentAnim", "()Ljava/lang/String;", "currentAnim", "Lo000ooo/o00O0O;", "OooOoO0", "Lo000ooo/o00O0O;", "getLoadImageJob", "()Lo000ooo/o00O0O;", "setLoadImageJob", "(Lo000ooo/o00O0O;)V", "loadImageJob", "Lkotlin/Function0;", "", "OooOoO", "Lkotlin/jvm/functions/Function0;", "getOnAttachedToWindowListener", "()Lkotlin/jvm/functions/Function0;", "setOnAttachedToWindowListener", "(Lkotlin/jvm/functions/Function0;)V", "onAttachedToWindowListener", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isSvga", "OooOoOO", "Lkotlin/jvm/functions/Function1;", "getNotSvgaImageListener", "()Lkotlin/jvm/functions/Function1;", "setNotSvgaImageListener", "(Lkotlin/jvm/functions/Function1;)V", "notSvgaImageListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "YLUIKit_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSVGAView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SVGAView.kt\ncom/code/android/uikit/svga/SVGAView\n+ 2 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,332:1\n54#2,3:333\n24#2:336\n59#2,6:337\n*S KotlinDebug\n*F\n+ 1 SVGAView.kt\ncom/code/android/uikit/svga/SVGAView\n*L\n161#1:333,3\n161#1:336\n161#1:337,6\n*E\n"})
public class SVGAView extends SVGAImageView {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final /* synthetic */ int f10159OooOooo = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SVGAPlayState playState;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public boolean f10161OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String currentAnim;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public String f10163OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public boolean f10164OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f10165OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public boolean f10166OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onAttachedToWindowListener;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o00O0O loadImageJob;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> notSvgaImageListener;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f10170OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f10171OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f10172OooOooO;

    public static final class OooO00o implements OooO0OO {
        public OooO00o() {
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO00o() {
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO0O0() {
            int i = SVGAView.f10159OooOooo;
            SVGAView.this.OooO();
        }

        @Override // o0OO0O0.OooO0OO
        public final void OooO0OO(int i) {
        }

        @Override // o0OO0O0.OooO0OO
        public final void onPause() {
            int i = SVGAView.f10159OooOooo;
            SVGAView sVGAView = SVGAView.this;
            SVGAPlayState sVGAPlayState = sVGAView.playState;
            SVGAPlayState sVGAPlayState2 = SVGAPlayState.Pause;
            if (sVGAPlayState != sVGAPlayState2) {
                sVGAView.playState = sVGAPlayState2;
            }
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f10174OooO0Oo;

        public OooO0O0(o000oOoO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f10174OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f10174OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f10174OooO0Oo;
        }

        public final int hashCode() {
            return this.f10174OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f10174OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static boolean OooOO0(String str) {
        try {
            if (OooOo00.OooO0O0(str)) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                String lowerCase2 = ".svga".toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (StringsKt.OooOO0O(lowerCase, lowerCase2)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public final void OooO() {
        if (this.f10164OooOo00) {
            return;
        }
        SVGAPlayState sVGAPlayState = this.playState;
        SVGAPlayState sVGAPlayState2 = SVGAPlayState.Stop;
        if (sVGAPlayState != sVGAPlayState2) {
            this.playState = sVGAPlayState2;
            Function0<Unit> function0 = this.f10171OooOoo0;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void OooO0oo() {
        SVGAPlayState sVGAPlayState = this.playState;
        SVGAPlayState sVGAPlayState2 = SVGAPlayState.Playing;
        if (sVGAPlayState != sVGAPlayState2) {
            this.playState = sVGAPlayState2;
            Function0<Unit> function0 = this.f10170OooOoo;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @NotNull
    public final void OooOO0O(@NotNull String path, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(path, "url");
        if (!Intrinsics.areEqual(this.currentAnim, path)) {
            this.f10161OooOOoo = false;
            o00O0O o00o0o2 = this.loadImageJob;
            if (o00o0o2 != null) {
                o00o0o2.dispose();
            }
        }
        this.currentAnim = path;
        if (OooOO0(path) && lifecycleOwner != null) {
            this.f10166OooOo0o = true;
            if (!this.f10161OooOOoo) {
                OooO0o();
            }
            o00Oo0.f38187OooO00o.getClass();
            Intrinsics.checkNotNullParameter(path, "path");
            o00oO0o.OooO00o(new o00Ooo(path, null)).observe(lifecycleOwner, new OooO0O0(new o000oOoO(this)));
            Function1<? super Boolean, Unit> function1 = this.notSvgaImageListener;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(this.f10166OooOo0o));
                return;
            }
            return;
        }
        this.f10166OooOo0o = false;
        if (this.playState != SVGAPlayState.Stop) {
            OooOOO0(this.f10165OooOo0O);
            OooO();
        }
        Function1<? super Boolean, Unit> function2 = this.notSvgaImageListener;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(this.f10166OooOo0o));
            return;
        }
        o000O000 o000o000OooO00o = o0000oo.OooO00o(getContext());
        coil.request.OooO00o.C0170OooO00o c0170OooO00o = new coil.request.OooO00o.C0170OooO00o(getContext());
        c0170OooO00o.f8590OooO0OO = path;
        c0170OooO00o.f8591OooO0Oo = new ImageViewTarget(this);
        c0170OooO00o.OooO0o0();
        c0170OooO00o.OooO0Oo(this.f10172OooOooO);
        c0170OooO00o.OooO0OO(this.f10172OooOooO);
        c0170OooO00o.f8621Oooo00o = Integer.valueOf(this.f10172OooOooO);
        c0170OooO00o.f8618Oooo0 = null;
        c0170OooO00o.f8625Oooo0o0 = Scale.FIT;
        this.loadImageJob = o000o000OooO00o.OooO0O0(c0170OooO00o.OooO00o());
    }

    public final void OooOO0o() {
        String str = this.currentAnim;
        if (str == null) {
            str = "";
        }
        if (OooOO0(str)) {
            OooO0Oo();
            if (this.playState != SVGAPlayState.Playing) {
                OooO0oo();
            }
        }
    }

    public final void OooOOO0(boolean z) {
        String str = this.currentAnim;
        if (str == null) {
            str = "";
        }
        if (OooOO0(str)) {
            this.f10165OooOo0O = z;
            OooO0oO(z);
            OooO();
        }
    }

    @Nullable
    public final String getCurrentAnim() {
        return this.currentAnim;
    }

    @Nullable
    public final o00O0O getLoadImageJob() {
        return this.loadImageJob;
    }

    @Nullable
    public final Function1<Boolean, Unit> getNotSvgaImageListener() {
        return this.notSvgaImageListener;
    }

    @Nullable
    public Function0<Unit> getOnAttachedToWindowListener() {
        return this.onAttachedToWindowListener;
    }

    @NotNull
    public final SVGAPlayState getPlayState() {
        return this.playState;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10164OooOo00 && this.playState == SVGAPlayState.Playing && Intrinsics.areEqual(this.currentAnim, this.f10163OooOo0)) {
            OooOO0o();
        } else {
            Function0<Unit> onAttachedToWindowListener = getOnAttachedToWindowListener();
            if (onAttachedToWindowListener != null) {
                onAttachedToWindowListener.invoke();
            }
        }
        this.f10164OooOo00 = false;
    }

    @Override // com.opensource.svgaplayer.SVGAImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f10163OooOo0 = this.currentAnim;
        this.f10164OooOo00 = this.playState == SVGAPlayState.Playing && (getLoops() == 0 || getLoops() == Integer.MAX_VALUE);
        super.onDetachedFromWindow();
    }

    public final void setLoadImageJob(@Nullable o00O0O o00o0o2) {
        this.loadImageJob = o00o0o2;
    }

    public final void setNotSvgaImageListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.notSvgaImageListener = function1;
    }

    public void setOnAttachedToWindowListener(@Nullable Function0<Unit> function0) {
        this.onAttachedToWindowListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SVGAView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playState = SVGAPlayState.Stop;
        this.f10163OooOo0 = "";
        setCallback(new OooO00o());
        setClearsAfterStop(false);
    }
}
