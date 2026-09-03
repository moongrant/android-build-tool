package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000;
import com.code.android.util.o000OO00;
import com.yalla.yalla.app.application.App;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p485o0o00O0.oOOOoo00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00Oo00;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\f¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/view/HeaderLayout;", "Landroidx/appcompat/widget/Toolbar;", "Landroid/widget/TextView;", "getTextMenu", "Landroid/widget/ImageView;", "getIvMenu", "Lcom/yalla/yalla/ui/view/UserPremiumView;", "getCenterImage", "Lcom/yalla/yalla/ui/view/UserVipView;", "getKaVipIcon", "Lcom/yalla/yalla/ui/view/UserWealthTagView;", "getUserWealthTagView", "", "visible", "", "setYallaVisible", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nHeaderLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeaderLayout.kt\ncom/yalla/yalla/ui/view/HeaderLayout\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,170:1\n55#2,4:171\n*S KotlinDebug\n*F\n+ 1 HeaderLayout.kt\ncom/yalla/yalla/ui/view/HeaderLayout\n*L\n58#1:171,4\n*E\n"})
public final class HeaderLayout extends Toolbar {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f30472OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @NotNull
    public final TextView f30473OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final ImageView f30474OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final UserPremiumView f30475OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final UserVipView f30476OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final TextView f30477Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final UserWealthTagView f30478Ooooo0o;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f30479OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Function0<Unit> function0) {
            super(1);
            this.f30479OooO0Oo = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View setNoDoubleClickListener = view;
            Intrinsics.checkNotNullParameter(setNoDoubleClickListener, "$this$setNoDoubleClickListener");
            this.f30479OooO0Oo.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @NotNull
    public final ImageView OooOo(int i, @NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        ImageView imageView = this.f30474OoooOo0;
        imageView.setImageResource(i);
        o000OO00.OooO0oo(imageView, new OooO00o(clickListener));
        o000OO00.OooOOOO(imageView);
        return imageView;
    }

    public final void OooOo0() {
        setNavigationIcon(oOo00OO0.btn_return);
        App app = App.f22702OooO0o;
        int i = oO00Oo00.ToolbarTitleTextAppearance;
        this.f3137OooOOOO = i;
        AppCompatTextView appCompatTextView = this.f3129OooO0o0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(app, i);
        }
        setBackgroundColor(o0000.OooO00o(oO00O0o.color_00d8c9));
        this.f30473OoooOOo.setTextColor(o0000.OooO00o(oO00O0o.selector_toolbar_menu_text));
    }

    public final void OooOo00(@NotNull Function0<Unit> clickListener) {
        Intrinsics.checkNotNullParameter(clickListener, "clickListener");
        setNavigationOnClickListener(new oOOOoo00(clickListener, 1));
    }

    public final void OooOo0O() {
        setNavigationIcon(oOo00OO0.btn_return_black);
        App app = App.f22702OooO0o;
        int i = oO00Oo00.ToolbarTitleTextAppearanceBlack;
        this.f3137OooOOOO = i;
        AppCompatTextView appCompatTextView = this.f3129OooO0o0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(app, i);
        }
        setBackgroundColor(o0000.OooO00o(oO00O0o.color_white));
        this.f30473OoooOOo.setTextColor(o0000.OooO00o(oO00O0o.color_alpha_87));
    }

    public final void OooOo0o() {
        setNavigationIcon(oOo00OO0.btn_return);
        App app = App.f22702OooO0o;
        int i = oO00Oo00.ToolbarTitleTextAppearance;
        this.f3137OooOOOO = i;
        AppCompatTextView appCompatTextView = this.f3129OooO0o0;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(app, i);
        }
        setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
        this.f30473OoooOOo.setTextColor(o0000.OooO00o(oO00O0o.selector_toolbar_menu_text));
    }

    @NotNull
    public final TextView OooOoO(@Nullable String str, @Nullable View.OnClickListener onClickListener) {
        TextView textView = this.f30473OoooOOo;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        o000OO00.OooOOOO(textView);
        return textView;
    }

    @NotNull
    public final TextView OooOoO0(int i, @Nullable View.OnClickListener onClickListener) {
        return OooOoO(o0000.OooO0OO(i), onClickListener);
    }

    @NotNull
    /* JADX INFO: renamed from: getCenterImage, reason: from getter */
    public final UserPremiumView getF30475OoooOoO() {
        return this.f30475OoooOoO;
    }

    @NotNull
    /* JADX INFO: renamed from: getIvMenu, reason: from getter */
    public final ImageView getF30474OoooOo0() {
        return this.f30474OoooOo0;
    }

    @NotNull
    /* JADX INFO: renamed from: getKaVipIcon, reason: from getter */
    public final UserVipView getF30476OoooOoo() {
        return this.f30476OoooOoo;
    }

    @NotNull
    /* JADX INFO: renamed from: getTextMenu, reason: from getter */
    public final TextView getF30473OoooOOo() {
        return this.f30473OoooOOo;
    }

    @NotNull
    /* JADX INFO: renamed from: getUserWealthTagView, reason: from getter */
    public final UserWealthTagView getF30478Ooooo0o() {
        return this.f30478Ooooo0o;
    }

    public final void setYallaVisible(boolean visible) {
        this.f30477Ooooo00.setVisibility(visible ? 0 : 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HeaderLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewInflate = View.inflate(context, oO00OO0O.view_toolbar_header, null);
        if (p591o0oo000O.OooO.OooO0o0()) {
            viewInflate.setLayoutDirection(1);
        }
        Toolbar.LayoutParams layoutParams = new Toolbar.LayoutParams();
        layoutParams.f2230OooO00o = 8388613;
        viewInflate.setLayoutParams(layoutParams);
        addView(viewInflate);
        View viewInflate2 = View.inflate(context, oO00OO0O.view_toolbar_vip, null);
        Toolbar.LayoutParams layoutParams2 = new Toolbar.LayoutParams();
        layoutParams2.f2230OooO00o = 8388611;
        viewInflate2.setLayoutParams(layoutParams2);
        addView(viewInflate2);
        View viewFindViewById = findViewById(oO00O0oO.ivMenu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.ivMenu)");
        this.f30474OoooOo0 = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.tvMenu);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.tvMenu)");
        this.f30473OoooOOo = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(oO00O0oO.iv_header_image);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(R.id.iv_header_image)");
        this.f30475OoooOoO = (UserPremiumView) viewFindViewById3;
        View viewFindViewById4 = findViewById(oO00O0oO.iv_header_ka_vip);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(R.id.iv_header_ka_vip)");
        this.f30476OoooOoo = (UserVipView) viewFindViewById4;
        View viewFindViewById5 = findViewById(oO00O0oO.tvYalla);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(R.id.tvYalla)");
        this.f30477Ooooo00 = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(oO00O0oO.wealthView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(R.id.wealthView)");
        this.f30478Ooooo0o = (UserWealthTagView) viewFindViewById6;
        setTitle("");
        OooOo0();
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
