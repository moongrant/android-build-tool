package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o0000O0;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import o0OO0O0.oo000o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p539o0o0OoOO.l3;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.l9;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoPendantLayout;", "Landroid/widget/FrameLayout;", "", "vipLevel", "", "setVipBackgroundResource", "kaVipLevel", "setKaVipBackgroundResource", "resource", "setImageResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserInfoPendantLayout extends FrameLayout {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ int f30782OooO0o0 = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final l9 f30783OooO0Oo;

    public static final class OooO00o implements com.opensource.svgaplayer.OooO0OO.OooO0O0 {
        public OooO00o() {
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void OooO00o(@NotNull oo000o videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            o0OO0O0.OooO oooO = new o0OO0O0.OooO(videoItem);
            UserInfoPendantLayout userInfoPendantLayout = UserInfoPendantLayout.this;
            userInfoPendantLayout.f30783OooO0Oo.f58377OooO0OO.setImageDrawable(oooO);
            userInfoPendantLayout.f30783OooO0Oo.f58377OooO0OO.OooO0Oo();
        }

        @Override // com.opensource.svgaplayer.OooO0OO.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setImageResource(int resource) {
        l9 l9Var = this.f30783OooO0Oo;
        l9Var.f58376OooO0O0.setVisibility(0);
        l9Var.f58377OooO0OO.setVisibility(8);
        l9Var.f58376OooO0O0.setImageResource(resource);
    }

    private final void setKaVipBackgroundResource(int kaVipLevel) {
        l9 l9Var = this.f30783OooO0Oo;
        ViewGroup.LayoutParams layoutParams = l9Var.f58377OooO0OO.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = o0000O0.OooO00o(0);
        l9Var.f58377OooO0OO.setLayoutParams(layoutParams2);
        if (kaVipLevel == VipLevel.Vip1.getValue()) {
            setImageResource(oOo00OO0.room_user_info_dialog_pendant_ka_vip_1);
            return;
        }
        if (kaVipLevel == VipLevel.Vip2.getValue()) {
            setImageResource(oOo00OO0.room_user_info_dialog_pendant_ka_vip_2);
            return;
        }
        if (kaVipLevel == VipLevel.Vip3.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_3.svga");
            return;
        }
        if (kaVipLevel == VipLevel.Vip4.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_4.svga");
            return;
        }
        if (kaVipLevel == VipLevel.Vip5.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_5.svga");
        } else if (kaVipLevel == VipLevel.Vip6.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_6.svga");
        } else {
            setVisibility(8);
        }
    }

    private final void setVipBackgroundResource(int vipLevel) {
        l9 l9Var = this.f30783OooO0Oo;
        ViewGroup.LayoutParams layoutParams = l9Var.f58377OooO0OO.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = o0000O0.OooO00o(15);
        l9Var.f58377OooO0OO.setLayoutParams(layoutParams2);
        if (vipLevel == PremiumLevel.Premium3.getValue()) {
            OooO00o("svga/anim_room_user_effect_3.svga");
            return;
        }
        if (vipLevel == PremiumLevel.Premium4.getValue()) {
            OooO00o("svga/anim_room_user_effect_4.svga");
        } else if (vipLevel == PremiumLevel.Premium5.getValue()) {
            OooO00o("svga/anim_room_user_effect_5.svga");
        } else {
            setVisibility(8);
        }
    }

    public final void OooO00o(String str) {
        l9 l9Var = this.f30783OooO0Oo;
        l9Var.f58376OooO0O0.setVisibility(8);
        l9Var.f58377OooO0OO.setVisibility(0);
        new com.opensource.svgaplayer.OooO0OO(getContext()).OooO00o(str, new OooO00o());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserInfoPendantLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        l9 l9VarInflate = l9.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(l9VarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f30783OooO0Oo = l9VarInflate;
        l9VarInflate.f58377OooO0OO.setOnClickListener(new l3());
        l9VarInflate.f58376OooO0O0.setOnClickListener(new l3());
    }
}
