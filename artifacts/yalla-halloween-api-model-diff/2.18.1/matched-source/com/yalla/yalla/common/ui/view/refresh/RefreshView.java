package com.yalla.yalla.common.ui.view.refresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOo.oO000Oo;
import p407o0Oo0OOo.oO000Oo0;
import p407o0Oo0OOo.ooOOOOoo;
import p409o0Oo0Oo0.o0OoOo0;
import p516o0o0O000.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0014\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00020\u0007\"\u00020\bH\u0016¨\u0006\u0013"}, d2 = {"Lcom/yalla/yalla/common/ui/view/refresh/RefreshView;", "Landroid/widget/FrameLayout;", "Lo0Oo0OOo/ooOOOOoo;", "Landroid/view/View;", "getView", "Lo0Oo0Oo0/o0OoOo0;", "getSpinnerStyle", "", "", "colors", "", "setPrimaryColors", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "styleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RefreshView extends FrameLayout implements ooOOOOoo {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public o00Oo0 f21210Oooo0o;

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RefreshState.values().length];
            iArr[RefreshState.None.ordinal()] = 1;
            iArr[RefreshState.PullDownToRefresh.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RefreshView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
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
        return ShopVehicleListModel.VehicleTagType_Vip300;
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0Oo(float f, int i, int i2) {
    }

    @Override // p407o0Oo0OOo.oO0OOo0o
    public final void OooO0o(@NotNull oO000Oo0 kernel, int i, int i2) {
        Intrinsics.checkNotNullParameter(kernel, "kernel");
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
        o00Oo0 o00oo1;
        Intrinsics.checkNotNullParameter(refreshLayout, "refreshLayout");
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        Intrinsics.checkNotNullParameter(newState, "newState");
        int i = OooO00o.$EnumSwitchMapping$0[newState.ordinal()];
        if (i != 1) {
            if (i == 2 && (o00oo1 = this.f21210Oooo0o) != null) {
                o00oo1.OooO0O0();
                return;
            }
            return;
        }
        o00Oo0 o00oo2 = this.f21210Oooo0o;
        if (o00oo2 != null) {
            o00oo2.f42082OooO0o = o00oo2.f42081OooO0Oo;
        }
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

    @Override // p407o0Oo0OOo.oO0OOo0o
    public void setPrimaryColors(@NotNull int... colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RefreshView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(context, R.layout.view_refresh, this);
        ImageView imageView = (ImageView) findViewById(R.id.ivRefresh);
        Intrinsics.checkNotNull(imageView);
        this.f21210Oooo0o = new o00Oo0(imageView, R.array.anim_loading_horse_green, 1000L, true);
    }
}
