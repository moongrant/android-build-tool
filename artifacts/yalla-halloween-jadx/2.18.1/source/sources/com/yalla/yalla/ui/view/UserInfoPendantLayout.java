package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.ui.view.UserInfoPendantLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OO0.OooOo;
import p405o0Oo0OO0.OooOo00;
import p649o0ooOOoo.wg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0002¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoPendantLayout;", "Landroid/widget/FrameLayout;", "", "vipLevel", "", "setVipBackgroundResource", "kaVipLevel", "setKaVipBackgroundResource", "resource", "setImageResource", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoPendantLayout extends FrameLayout {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ int f25232Oooo0oO = 0;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final wg f25233Oooo0o;

    public static final class OooO00o implements OooOo00.OooO0O0 {
        public OooO00o() {
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onComplete(@NotNull OooOo videoItem) {
            Intrinsics.checkNotNullParameter(videoItem, "videoItem");
            UserInfoPendantLayout.this.f25233Oooo0o.f50904OooO0OO.setImageDrawable(new p405o0Oo0OO0.OooO(videoItem));
            UserInfoPendantLayout.this.f25233Oooo0o.f50904OooO0OO.OooO0OO();
        }

        @Override // o0Oo0OO0.OooOo00.OooO0O0
        public final void onError() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setImageResource(int resource) {
        this.f25233Oooo0o.f50903OooO0O0.setVisibility(0);
        this.f25233Oooo0o.f50904OooO0OO.setVisibility(8);
        this.f25233Oooo0o.f50903OooO0O0.setImageResource(resource);
    }

    private final void setKaVipBackgroundResource(int kaVipLevel) {
        ViewGroup.LayoutParams layoutParams = this.f25233Oooo0o.f50904OooO0OO.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = com.yalla.support.common.util.OooOo00.OooO00o(0);
        this.f25233Oooo0o.f50904OooO0OO.setLayoutParams(layoutParams2);
        if (kaVipLevel == VipLevel.Vip1.getValue()) {
            setImageResource(R.drawable.room_user_info_dialog_pendant_ka_vip_1);
            return;
        }
        if (kaVipLevel == VipLevel.Vip2.getValue()) {
            setImageResource(R.drawable.room_user_info_dialog_pendant_ka_vip_2);
            return;
        }
        if (kaVipLevel == VipLevel.Vip3.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_3.svga");
            return;
        }
        if (kaVipLevel == VipLevel.Vip4.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_4.svga");
        } else if (kaVipLevel == VipLevel.Vip5.getValue()) {
            OooO00o("svga/anim_room_user_ka_vip_5.svga");
        } else {
            setVisibility(8);
        }
    }

    private final void setVipBackgroundResource(int vipLevel) {
        ViewGroup.LayoutParams layoutParams = this.f25233Oooo0o.f50904OooO0OO.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = com.yalla.support.common.util.OooOo00.OooO00o(15);
        this.f25233Oooo0o.f50904OooO0OO.setLayoutParams(layoutParams2);
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
        this.f25233Oooo0o.f50903OooO0O0.setVisibility(8);
        this.f25233Oooo0o.f50904OooO0OO.setVisibility(0);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        new OooOo00(context).OooO0oO(str, new OooO00o());
    }

    public final void OooO0O0(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        setVisibility(0);
        boolean z2 = i == VipState.Vip.getValue() && i2 > VipLevel.Vip0.getValue() && i3 == 1;
        if (i4 == 1 && i5 > PremiumLevel.Premium0.getValue()) {
            z = true;
        }
        if (z2 && z) {
            if (i6 == 1) {
                setVipBackgroundResource(i5);
                return;
            } else {
                setKaVipBackgroundResource(i2);
                return;
            }
        }
        if (z2 && !z) {
            setKaVipBackgroundResource(i2);
        } else if (!z || z2) {
            setVisibility(8);
        } else {
            setVipBackgroundResource(i5);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoPendantLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        wg wgVarInflate = wg.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(wgVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25233Oooo0o = wgVarInflate;
        wgVarInflate.f50904OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.oO0OoOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = UserInfoPendantLayout.f25232Oooo0oO;
            }
        });
        wgVarInflate.f50903OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0oo00Oo.oO0OoOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = UserInfoPendantLayout.f25232Oooo0oO;
            }
        });
    }
}
