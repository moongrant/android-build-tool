package com.yalla.yalla.ui.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooO0o;
import o0OO0oO0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.o0ooOOo;
import p565o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0003H\u0016¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/pullrefresh/XRefreshFooterView;", "Landroid/widget/FrameLayout;", "Lo0OO0oO0/OooO0o;", "", "noMoreText", "", "setNoMoreText", "color", "setNoMoreTextColor", "setFooterDrawBackground", "Landroid/view/View;", "getView", "Lo0OO0oO/OooO0O0;", "getSpinnerStyle", "", "colors", "setPrimaryColors", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class XRefreshFooterView extends FrameLayout implements OooO0o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public TextView f30718OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f30719OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f30720OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public SVGAView f30721OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public com.yalla.yalla.util.Function.OooO00o f30722OooO0oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.None.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO(int i, float f, int i2) {
    }

    @Override // p339o0OO0oOo.o000oOoO
    public final void OooO00o(@NotNull OooOOO0 refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        com.yalla.yalla.util.Function.OooO00o oooO00o = null;
        if (i == 1) {
            SVGAView sVGAView = this.f30721OooO0oO;
            if (sVGAView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView = null;
            }
            o000O.OooOOO0(sVGAView, true ^ this.f30719OooO0o);
            TextView textView = this.f30718OooO0Oo;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
                textView = null;
            }
            o000O.OooOOO0(textView, this.f30719OooO0o);
            SVGAView sVGAView2 = this.f30721OooO0oO;
            if (sVGAView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView2 = null;
            }
            sVGAView2.OooO0Oo();
            com.yalla.yalla.util.Function.OooO00o oooO00o2 = this.f30722OooO0oo;
            if (oooO00o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingAnim");
            } else {
                oooO00o = oooO00o2;
            }
            oooO00o.OooO0OO();
            return;
        }
        if (i != 2) {
            return;
        }
        SVGAView sVGAView3 = this.f30721OooO0oO;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView3 = null;
        }
        o000O.OooOOO0(sVGAView3, !this.f30719OooO0o);
        TextView textView2 = this.f30718OooO0Oo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView2 = null;
        }
        o000O.OooOOO0(textView2, this.f30719OooO0o);
        SVGAView sVGAView4 = this.f30721OooO0oO;
        if (sVGAView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView4 = null;
        }
        sVGAView4.OooO0oO(false);
        com.yalla.yalla.util.Function.OooO00o oooO00o3 = this.f30722OooO0oo;
        if (oooO00o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingAnim");
        } else {
            oooO00o = oooO00o3;
        }
        oooO00o.f32274OooO0oo = true;
    }

    @Override // o0OO0oO0.OooO0o
    public final boolean OooO0O0(boolean z) {
        this.f30719OooO0o = z;
        return true;
    }

    @Override // o0OO0oO0.OooOO0
    public final int OooO0OO(@NotNull SmartRefreshLayout refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0Oo(@NotNull OooOOO0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0o(float f, int i, int i2, int i3, boolean z) {
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0o0(@NotNull OooOOO0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // o0OO0oO0.OooOO0
    public final boolean OooO0oO() {
        return false;
    }

    @Override // o0OO0oO0.OooOO0
    public final void OooO0oo(@NotNull SmartRefreshLayout.OooOOO kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
        if (this.f30720OooO0o0 != 0) {
            kernel.OooO0OO(this, o0000.OooO00o(o0ooOOo.colorPrimary));
        }
    }

    @Override // o0OO0oO0.OooOO0
    @NotNull
    public OooO0O0 getSpinnerStyle() {
        OooO0O0 Translate = OooO0O0.f42500OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // o0OO0oO0.OooOO0
    @NotNull
    public View getView() {
        return this;
    }

    public final void setFooterDrawBackground(int color) {
        this.f30720OooO0o0 = color;
    }

    public final void setNoMoreText(int noMoreText) {
        TextView textView = this.f30718OooO0Oo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setText(noMoreText);
    }

    public final void setNoMoreTextColor(int color) {
        TextView textView = this.f30718OooO0Oo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setTextColor(color);
    }

    @Override // o0OO0oO0.OooOO0
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ XRefreshFooterView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        SVGAView sVGAView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), o0OO00O.layout_load_more_footer, this);
        View viewFindViewById = findViewById(o0Oo0oo.tv_refresh_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f30718OooO0Oo = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(o0Oo0oo.svga_refersh_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        SVGAView sVGAView2 = (SVGAView) viewFindViewById2;
        this.f30721OooO0oO = sVGAView2;
        TextView textView = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView2 = null;
        }
        o000O.OooOOO0(sVGAView2, true);
        SVGAView sVGAView3 = this.f30721OooO0oO;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView = null;
        } else {
            sVGAView = sVGAView3;
        }
        com.yalla.yalla.util.Function.OooO00o oooO00o = new com.yalla.yalla.util.Function.OooO00o(oo000o.anim_loading_horse_green, 33, getContext(), sVGAView, true);
        this.f30722OooO0oo = oooO00o;
        oooO00o.f32274OooO0oo = true;
        TextView textView2 = this.f30718OooO0Oo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
        } else {
            textView = textView2;
        }
        o000O.OooOOO0(textView, false);
    }
}
