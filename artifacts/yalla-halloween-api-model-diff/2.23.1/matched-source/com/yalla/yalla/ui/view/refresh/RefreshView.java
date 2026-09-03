package com.yalla.yalla.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0OO0oO.OooO0O0;
import o0OO0oO0.OooO;
import o0OO0oO0.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00;
import p194o00o0OO.o000OOo0;
import p565o0oOo000.o0OO00O;
import p565o0oOo000.o0Oo0oo;
import p565o0oOo000.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/ui/view/refresh/RefreshView;", "Landroid/widget/FrameLayout;", "Lo0OO0oO0/OooO;", "Landroid/view/View;", "getView", "Lo0OO0oO/OooO0O0;", "getSpinnerStyle", "", "", "colors", "", "setPrimaryColors", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "styleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RefreshView extends FrameLayout implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public final o00 f30738OooO0Oo;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            try {
                iArr[RefreshState.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RefreshState.PullDownToRefresh.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context) {
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
        o00 o00Var = this.f30738OooO0Oo;
        if (i == 1) {
            if (o00Var != null) {
                o00Var.f38643OooO0o = o00Var.f38642OooO0Oo;
            }
        } else {
            if (i != 2 || o00Var == null || o00Var.f38643OooO0o == 0) {
                return;
            }
            o00Var.f38643OooO0o = 0;
            o00Var.f38639OooO00o.postDelayed(new o000OOo0(0, o00Var, false), o00Var.f38645OooO0oO);
        }
    }

    @Override // o0OO0oO0.OooOO0
    public final int OooO0OO(@NotNull SmartRefreshLayout refreshLayout, boolean z) {
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        return 300;
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

    @Override // o0OO0oO0.OooOO0
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RefreshView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, o0OO00O.view_refresh, this);
        ImageView imageView = (ImageView) findViewById(o0Oo0oo.ivRefresh);
        Intrinsics.checkNotNull(imageView);
        this.f30738OooO0Oo = new o00(imageView, oo000o.anim_loading_horse_green, 1000L);
    }
}
