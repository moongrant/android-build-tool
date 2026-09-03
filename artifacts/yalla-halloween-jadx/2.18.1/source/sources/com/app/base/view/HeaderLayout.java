package com.app.base.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.application.App;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p168o00Ooo0.oo000o;
import p175o00OooOo.o0OO00o0;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\b\u001a\u00020\u0004J\u0010\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\u0015"}, d2 = {"Lcom/app/base/view/HeaderLayout;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/widget/TextView;", "getTextMenu", "Landroid/widget/ImageView;", "getIvMenu", "Lcom/yalla/yalla/common/ui/view/UserPremiumView;", "getCenterImage", "getKaVipIcon", "", "visible", "", "setYallaVisible", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class HeaderLayout extends Toolbar {

    /* JADX INFO: renamed from: o00000O, reason: collision with root package name */
    public static final /* synthetic */ int f12042o00000O = 0;

    /* JADX INFO: renamed from: o00000, reason: collision with root package name */
    @NotNull
    public final ImageView f12043o00000;

    /* JADX INFO: renamed from: o000000, reason: collision with root package name */
    @NotNull
    public final TextView f12044o000000;

    /* JADX INFO: renamed from: o000000O, reason: collision with root package name */
    @NotNull
    public final ImageView f12045o000000O;

    /* JADX INFO: renamed from: o000000o, reason: collision with root package name */
    @NotNull
    public final UserPremiumView f12046o000000o;

    /* JADX INFO: renamed from: o00000O0, reason: collision with root package name */
    @NotNull
    public final TextView f12047o00000O0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f12048Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f12048Oooo0o = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f12048Oooo0o.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void OooOoO() {
        setNavigationIcon(R.drawable.btn_return);
        OooOo0O(App.f11458Oooo0oO, R.style.ToolbarTitleTextAppearance);
        setBackgroundColor(OooOOO.OooO00o(R.color.color_00d8c9));
        this.f12044o000000.setTextColor(OooOOO.OooO00o(R.color.selector_toolbar_menu_text));
    }

    public final void OooOoO0(@NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        setNavigationOnClickListener(new o0OO00o0(clickListener, 0));
    }

    @NotNull
    public final ImageView OooOoOO(int i, @NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        this.f12045o000000O.setImageResource(i);
        o00O0O.OooO0Oo(this.f12045o000000O, new OooO00o(clickListener));
        o00O0O.OooO(this.f12045o000000O);
        return this.f12045o000000O;
    }

    @NotNull
    public final TextView OooOoo(@Nullable String str, @Nullable View.OnClickListener onClickListener) {
        this.f12044o000000.setText(str);
        this.f12044o000000.setOnClickListener(onClickListener);
        o00O0O.OooO(this.f12044o000000);
        return this.f12044o000000;
    }

    @NotNull
    public final TextView OooOoo0(int i, @Nullable View.OnClickListener onClickListener) {
        return OooOoo(OooOOO.OooO0OO(i), onClickListener);
    }

    @NotNull
    /* JADX INFO: renamed from: getCenterImage, reason: from getter */
    public final UserPremiumView getF12046o000000o() {
        return this.f12046o000000o;
    }

    @NotNull
    /* JADX INFO: renamed from: getIvMenu, reason: from getter */
    public final ImageView getF12045o000000O() {
        return this.f12045o000000O;
    }

    @NotNull
    /* JADX INFO: renamed from: getKaVipIcon, reason: from getter */
    public final ImageView getF12043o00000() {
        return this.f12043o00000;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextMenu, reason: from getter */
    public final TextView getF12044o000000() {
        return this.f12044o000000;
    }

    public final void setYallaVisible(boolean visible) {
        this.f12047o00000O0.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, R.layout.view_toolbar_header, null);
        if (oo000o.OooO0o0()) {
            viewInflate.setLayoutDirection(1);
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams();
        layoutParams.f4361OooO00o = 8388613;
        viewInflate.setLayoutParams(layoutParams);
        addView(viewInflate);
        View viewInflate2 = View.inflate(context, R.layout.view_toolbar_vip, null);
        Toolbar.LayoutParams layoutParams2 = new Toolbar.LayoutParams();
        layoutParams2.f4361OooO00o = 8388611;
        viewInflate2.setLayoutParams(layoutParams2);
        addView(viewInflate2);
        View viewFindViewById = findViewById(R.id.ivMenu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.ivMenu)");
        this.f12045o000000O = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tvMenu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tvMenu)");
        this.f12044o000000 = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.iv_header_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.iv_header_image)");
        this.f12046o000000o = (UserPremiumView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.iv_header_ka_vip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.iv_header_ka_vip)");
        this.f12043o00000 = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tvYalla);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tvYalla)");
        this.f12047o00000O0 = (TextView) viewFindViewById5;
        setTitle("");
        OooOoO();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(index)");
            if (childAt instanceof ImageView) {
                ((ImageView) childAt).setContentDescription(ZegoConstants.ZegoVideoDataAuxPublishingStream);
            }
        }
    }
}
