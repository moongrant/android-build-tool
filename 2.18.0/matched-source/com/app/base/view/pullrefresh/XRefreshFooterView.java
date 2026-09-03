package com.app.base.view.pullrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.Function.OooO0O0;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.SVGAView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.o000O0O0;
import p410o0Oo0OOo.oO000Oo0;
import p410o0Oo0OOo.oO0OOo0o;
import p410o0Oo0OOo.oO0Oo0oo;
import p412o0Oo0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0003H\u0016¨\u0006\u0018"}, d2 = {"Lcom/app/base/view/pullrefresh/XRefreshFooterView;", "Landroid/widget/FrameLayout;", "Lo0Oo0OOo/oO0Oo0oo;", "", "noMoreText", "", "setNoMoreText", "color", "setNoMoreTextColor", "setFooterDrawBackground", "Landroid/view/View;", "getView", "Lo0Oo0Oo0/o0OoOo0;", "getSpinnerStyle", "", "colors", "setPrimaryColors", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class XRefreshFooterView extends FrameLayout implements oO0Oo0oo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f12231Oooo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public OooO0O0 f12232OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f12233OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public int f12234OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public SVGAView f12235OoooO0O;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            iArr[RefreshState.PullUpToLoad.ordinal()] = 1;
            iArr[RefreshState.None.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final void OooO(@NotNull oO000Oo0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final void OooO00o(@NotNull oO000Oo0 refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final int OooO0O0(@NotNull oO000Oo0 refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // p410o0Oo0OOo.oO0Oo0oo
    public final boolean OooO0OO(boolean z) {
        this.f12233OoooO0 = z;
        return true;
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final void OooO0Oo(float f, int i, int i2) {
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final void OooO0o(@NotNull oO0OOo0o kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
        if (this.f12234OoooO00 != 0) {
            ((SmartRefreshLayout.OooOo00) kernel).OooO0OO(this, o000O0O0.OooO00o(R.color.colorPrimary));
        }
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final boolean OooO0o0() {
        return false;
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // p420o0Oo0oOo.oO00OOO
    public final void OooO0oo(@NotNull oO000Oo0 refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        OooO0O0 oooO0O0 = null;
        if (i == 1) {
            SVGAView sVGAView = this.f12235OoooO0O;
            if (sVGAView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView = null;
            }
            o00O0O.OooO0oO(sVGAView, true ^ this.f12233OoooO0);
            TextView textView = this.f12231Oooo;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
                textView = null;
            }
            o00O0O.OooO0oO(textView, this.f12233OoooO0);
            SVGAView sVGAView2 = this.f12235OoooO0O;
            if (sVGAView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView2 = null;
            }
            sVGAView2.OooO0OO();
            OooO0O0 oooO0O1 = this.f12232OoooO;
            if (oooO0O1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("loadingAnim");
            } else {
                oooO0O0 = oooO0O1;
            }
            oooO0O0.OooO0O0();
            return;
        }
        if (i != 2) {
            return;
        }
        SVGAView sVGAView3 = this.f12235OoooO0O;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView3 = null;
        }
        o00O0O.OooO0oO(sVGAView3, !this.f12233OoooO0);
        TextView textView2 = this.f12231Oooo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView2 = null;
        }
        o00O0O.OooO0oO(textView2, this.f12233OoooO0);
        SVGAView sVGAView4 = this.f12235OoooO0O;
        if (sVGAView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView4 = null;
        }
        sVGAView4.OooO0o0(false);
        OooO0O0 oooO0O2 = this.f12232OoooO;
        if (oooO0O2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingAnim");
        } else {
            oooO0O0 = oooO0O2;
        }
        oooO0O0.f11364OooO0oo = true;
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    @NotNull
    public o0OoOo0 getSpinnerStyle() {
        o0OoOo0 Translate = o0OoOo0.f39172OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    @NotNull
    public View getView() {
        return this;
    }

    public final void setFooterDrawBackground(int color) {
        this.f12234OoooO00 = color;
    }

    public final void setNoMoreText(int noMoreText) {
        TextView textView = this.f12231Oooo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setText(noMoreText);
    }

    public final void setNoMoreTextColor(int color) {
        TextView textView = this.f12231Oooo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setTextColor(color);
    }

    @Override // p410o0Oo0OOo.ooOOOOoo
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public XRefreshFooterView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        SVGAView sVGAView;
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), R.layout.layout_load_more_footer, this);
        View viewFindViewById = findViewById(R.id.tv_refresh_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.tv_refresh_footer)");
        this.f12231Oooo = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.svga_refersh_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.svga_refersh_footer)");
        SVGAView sVGAView2 = (SVGAView) viewFindViewById2;
        this.f12235OoooO0O = sVGAView2;
        TextView textView = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView2 = null;
        }
        o00O0O.OooO0oO(sVGAView2, true);
        SVGAView sVGAView3 = this.f12235OoooO0O;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView = null;
        } else {
            sVGAView = sVGAView3;
        }
        OooO0O0 oooO0O0 = new OooO0O0(sVGAView, getContext(), R.array.anim_loading_horse_green, 33, true);
        this.f12232OoooO = oooO0O0;
        oooO0O0.f11364OooO0oo = true;
        TextView textView2 = this.f12231Oooo;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
        } else {
            textView = textView2;
        }
        o00O0O.OooO0oO(textView, false);
    }
}
