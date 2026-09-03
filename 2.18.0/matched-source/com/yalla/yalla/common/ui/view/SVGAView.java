package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.opensource.svgaplayer.SVGAImageView;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.manager.data.SharedSvgaManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0OO0.OooO0o;
import p408o0Oo0OO0.OooOo;
import p618o0oo0Ooo.oO0O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R?\u0010\u001e\u001a\u001f\u0012\u0013\u0012\u00110\u0014¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006&"}, d2 = {"Lcom/yalla/yalla/common/ui/view/SVGAView;", "Lcom/opensource/svgaplayer/SVGAImageView;", "", "imageResId", "", "setDefaultImage", "Lcom/yalla/yalla/common/ui/view/SVGAPlayState;", "<set-?>", "o000oOoO", "Lcom/yalla/yalla/common/ui/view/SVGAPlayState;", "getPlayState", "()Lcom/yalla/yalla/common/ui/view/SVGAPlayState;", "playState", "", "Ooooo00", "Ljava/lang/String;", "getCurrentAnim", "()Ljava/lang/String;", "currentAnim", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "isSvga", "Ooooo0o", "Lkotlin/jvm/functions/Function1;", "getNotSvgaImageListener", "()Lkotlin/jvm/functions/Function1;", "setNotSvgaImageListener", "(Lkotlin/jvm/functions/Function1;)V", "notSvgaImageListener", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public class SVGAView extends SVGAImageView {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f21019Oooooo0 = 0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f21020OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f21021OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @Nullable
    public String f21022OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f21023OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public boolean f21024OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String currentAnim;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function1<? super Boolean, Unit> notSvgaImageListener;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21027OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f21028OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f21029OooooOo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public SVGAPlayState playState;

    public static final class OooO00o implements OooO0o {
        public OooO00o() {
        }

        @Override // p408o0Oo0OO0.OooO0o
        public final void onFinished() {
            SVGAView sVGAView = SVGAView.this;
            int i = SVGAView.f21019Oooooo0;
            sVGAView.OooO0o();
        }

        @Override // p408o0Oo0OO0.OooO0o
        public final void onPause() {
            SVGAView sVGAView = SVGAView.this;
            SVGAPlayState sVGAPlayState = sVGAView.playState;
            SVGAPlayState sVGAPlayState2 = SVGAPlayState.Pause;
            if (sVGAPlayState != sVGAPlayState2) {
                sVGAView.playState = sVGAPlayState2;
            }
        }

        @Override // p408o0Oo0OO0.OooO0o
        public final void onRepeat() {
        }

        @Override // p408o0Oo0OO0.OooO0o
        public final void onStep(int i, double d) {
        }
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SVGAPlayState.values().length];
            iArr[SVGAPlayState.Playing.ordinal()] = 1;
            iArr[SVGAPlayState.Pause.ordinal()] = 2;
            iArr[SVGAPlayState.Stop.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0OO<T> implements Observer {
        public OooO0OO() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.Observer
        public final void onChanged(T t) {
            OooOo oooOo = (OooOo) t;
            if (!(oooOo != null)) {
                SVGAView sVGAView = SVGAView.this;
                sVGAView.f21020OoooOOO = false;
                sVGAView.OooOO0(sVGAView.f21023OoooOoO);
                SVGAView.this.OooO0o();
                return;
            }
            SVGAView sVGAView2 = SVGAView.this;
            sVGAView2.f21020OoooOOO = true;
            int i = OooO0O0.$EnumSwitchMapping$0[sVGAView2.getPlayState().ordinal()];
            if (i == 1) {
                SVGAView.this.setVideoItem(oooOo);
                SVGAView.this.OooO0OO();
                SVGAView sVGAView3 = SVGAView.this;
                SVGAPlayState sVGAPlayState = sVGAView3.playState;
                SVGAPlayState sVGAPlayState2 = SVGAPlayState.Playing;
                if (sVGAPlayState != sVGAPlayState2) {
                    sVGAView3.playState = sVGAPlayState2;
                    Function0<Unit> function0 = sVGAView3.f21028OooooOO;
                    if (function0 != null) {
                        function0.invoke();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                SVGAView sVGAView4 = SVGAView.this;
                if (!sVGAView4.f21023OoooOoO) {
                    sVGAView4.setVideoItem(oooOo);
                }
                SVGAView sVGAView5 = SVGAView.this;
                sVGAView5.OooO0o0(sVGAView5.f21023OoooOoO);
                SVGAView.this.OooO0o();
                return;
            }
            SVGAView.this.setVideoItem(oooOo);
            SVGAView.this.OooO0O0();
            SVGAView sVGAView6 = SVGAView.this;
            SVGAPlayState sVGAPlayState3 = sVGAView6.playState;
            SVGAPlayState sVGAPlayState4 = SVGAPlayState.Pause;
            if (sVGAPlayState3 != sVGAPlayState4) {
                sVGAView6.playState = sVGAPlayState4;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SVGAView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    public final void OooO() {
        String str = this.currentAnim;
        if (str == null) {
            str = "";
        }
        if (OooO0oO(str)) {
            OooO0OO();
            SVGAPlayState sVGAPlayState = this.playState;
            SVGAPlayState sVGAPlayState2 = SVGAPlayState.Playing;
            if (sVGAPlayState == sVGAPlayState2 || sVGAPlayState == sVGAPlayState2) {
                return;
            }
            this.playState = sVGAPlayState2;
            Function0<Unit> function0 = this.f21028OooooOO;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final void OooO0o() {
        if (this.f21021OoooOOo) {
            return;
        }
        SVGAPlayState sVGAPlayState = this.playState;
        SVGAPlayState sVGAPlayState2 = SVGAPlayState.Stop;
        if (sVGAPlayState != sVGAPlayState2) {
            this.playState = sVGAPlayState2;
            Function0<Unit> function0 = this.f21027OooooO0;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    public final boolean OooO0oO(String str) {
        try {
            if (com.yalla.support.common.util.OooO0OO.OooO0O0(str)) {
                String lowerCase = str.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                String lowerCase2 = ".svga".toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, lowerCase2, false, 2, null)) {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @NotNull
    public final SVGAView OooO0oo(@NotNull String url, @Nullable LifecycleOwner lifecycleOwner) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (!Intrinsics.areEqual(this.currentAnim, url)) {
            this.f21020OoooOOO = false;
        }
        this.currentAnim = url;
        if (!OooO0oO(url) || lifecycleOwner == null) {
            this.f21024OoooOoo = false;
            if (this.playState != SVGAPlayState.Stop) {
                OooOO0(this.f21023OoooOoO);
                OooO0o();
            }
            Function1<? super Boolean, Unit> function1 = this.notSvgaImageListener;
            if (function1 != null) {
                function1.invoke(Boolean.valueOf(this.f21024OoooOoo));
                return this;
            }
            oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(getContext());
            oooO00o.f48447OooO0OO = url;
            oooO00o.f48445OooO00o = 0;
            oooO00o.f48459OooOOOo = this.f21029OooooOo;
            oooO00o.f48472OooOoo0 = 1;
            if (StringsKt__StringsKt.contains(url, ".gif", true)) {
                oooO00o.f48448OooO0Oo = true;
            }
            oooO00o.OooO0o(this);
        } else {
            this.f21024OoooOoo = true;
            if (!this.f21020OoooOOO) {
                OooO0Oo();
            }
            SharedSvgaManager.INSTANCE.loadSvga(url).observe(lifecycleOwner, new OooO0OO());
        }
        return this;
    }

    public final void OooOO0(boolean z) {
        String str = this.currentAnim;
        if (str == null) {
            str = "";
        }
        if (OooO0oO(str)) {
            this.f21023OoooOoO = z;
            OooO0o0(z);
            OooO0o();
        }
    }

    @Nullable
    public final String getCurrentAnim() {
        return this.currentAnim;
    }

    @Nullable
    public final Function1<Boolean, Unit> getNotSvgaImageListener() {
        return this.notSvgaImageListener;
    }

    @NotNull
    public final SVGAPlayState getPlayState() {
        return this.playState;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f21021OoooOOo && this.playState == SVGAPlayState.Playing && Intrinsics.areEqual(this.currentAnim, this.f21022OoooOo0)) {
            OooO();
        }
        this.f21021OoooOOo = false;
    }

    @Override // com.opensource.svgaplayer.SVGAImageView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f21022OoooOo0 = this.currentAnim;
        this.f21021OoooOOo = this.playState == SVGAPlayState.Playing && (getLoops() == 0 || getLoops() == Integer.MAX_VALUE);
        super.onDetachedFromWindow();
    }

    public final void setDefaultImage(int imageResId) {
        this.f21029OooooOo = imageResId;
        setImageResource(imageResId);
    }

    public final void setNotSvgaImageListener(@Nullable Function1<? super Boolean, Unit> function1) {
        this.notSvgaImageListener = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SVGAView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playState = SVGAPlayState.Stop;
        this.f21022OoooOo0 = "";
        setCallback(new OooO00o());
        setClearsAfterStop(false);
    }
}
