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
import p254o00ooO0O.o000O0O0;
import p407o0Oo0OOo.oO000OOo;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p409o0Oo0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0014\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u000e\"\u00020\u0003H\u0016¨\u0006\u0018"}, d2 = {"Lcom/app/base/view/pullrefresh/XRefreshFooterView;", "Landroid/widget/FrameLayout;", "Lo0Oo0OOo/oO000OOo;", "", "noMoreText", "", "setNoMoreText", "color", "setNoMoreTextColor", "setFooterDrawBackground", "Landroid/view/View;", "getView", "Lo0Oo0Oo0/o0OoOo0;", "getSpinnerStyle", "", "colors", "setPrimaryColors", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class XRefreshFooterView extends FrameLayout implements oO000OOo {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public SVGAView f12216Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public TextView f12217Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f12218Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f12219Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public OooO0O0 f12220OoooO00;

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

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO(@NotNull oO000Oo refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO00o(@NotNull oO000Oo refreshLayout, int i, int i2) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final int OooO0O0(@NotNull oO000Oo refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 0;
    }

    @Override // p407o0Oo0OOo.oO000OOo
    public final boolean OooO0OO(boolean z) {
        this.f12219Oooo0oo = z;
        return true;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0Oo(float f, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NotNull oO000Oo0 kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
        if (this.f12218Oooo0oO != 0) {
            ((SmartRefreshLayout.OooOo00) kernel).OooO0OO(this, o000O0O0.OooO00o(R.color.colorPrimary));
        }
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final boolean OooO0o0() {
        return false;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0oO(boolean z, float f, int i, int i2, int i3) {
    }

    @Override // p417o0Oo0oOo.oO00OOOo
    public final void OooO0oo(@NotNull oO000Oo refreshLayout, @NotNull RefreshState oldState, @NotNull RefreshState newState) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        OooO0O0 oooO0O0 = null;
        if (i == 1) {
            SVGAView sVGAView = this.f12216Oooo;
            if (sVGAView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView = null;
            }
            o00O0O.OooO0oO(sVGAView, true ^ this.f12219Oooo0oo);
            TextView textView = this.f12217Oooo0o;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
                textView = null;
            }
            o00O0O.OooO0oO(textView, this.f12219Oooo0oo);
            SVGAView sVGAView2 = this.f12216Oooo;
            if (sVGAView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
                sVGAView2 = null;
            }
            sVGAView2.OooO0OO();
            OooO0O0 oooO0O1 = this.f12220OoooO00;
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
        SVGAView sVGAView3 = this.f12216Oooo;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView3 = null;
        }
        o00O0O.OooO0oO(sVGAView3, !this.f12219Oooo0oo);
        TextView textView2 = this.f12217Oooo0o;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView2 = null;
        }
        o00O0O.OooO0oO(textView2, this.f12219Oooo0oo);
        SVGAView sVGAView4 = this.f12216Oooo;
        if (sVGAView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView4 = null;
        }
        sVGAView4.OooO0o0(false);
        OooO0O0 oooO0O2 = this.f12220OoooO00;
        if (oooO0O2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loadingAnim");
        } else {
            oooO0O0 = oooO0O2;
        }
        oooO0O0.f11348OooO0oo = true;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NotNull
    public o0OoOo0 getSpinnerStyle() {
        o0OoOo0 Translate = o0OoOo0.f39152OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(Translate, "Translate");
        return Translate;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    @NotNull
    public View getView() {
        return this;
    }

    public final void setFooterDrawBackground(int color) {
        this.f12218Oooo0oO = color;
    }

    public final void setNoMoreText(int noMoreText) {
        TextView textView = this.f12217Oooo0o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setText(noMoreText);
    }

    public final void setNoMoreTextColor(int color) {
        TextView textView = this.f12217Oooo0o;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
            textView = null;
        }
        textView.setTextColor(color);
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
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
        this.f12217Oooo0o = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.svga_refersh_footer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.svga_refersh_footer)");
        SVGAView sVGAView2 = (SVGAView) viewFindViewById2;
        this.f12216Oooo = sVGAView2;
        TextView textView = null;
        if (sVGAView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView2 = null;
        }
        o00O0O.OooO0oO(sVGAView2, true);
        SVGAView sVGAView3 = this.f12216Oooo;
        if (sVGAView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("svgaFooter");
            sVGAView = null;
        } else {
            sVGAView = sVGAView3;
        }
        OooO0O0 oooO0O0 = new OooO0O0(sVGAView, getContext(), R.array.anim_loading_horse_green, 33, true);
        this.f12220OoooO00 = oooO0O0;
        oooO0O0.f11348OooO0oo = true;
        TextView textView2 = this.f12217Oooo0o;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvFooter");
        } else {
            textView = textView2;
        }
        o00O0O.OooO0oO(textView, false);
    }
}
