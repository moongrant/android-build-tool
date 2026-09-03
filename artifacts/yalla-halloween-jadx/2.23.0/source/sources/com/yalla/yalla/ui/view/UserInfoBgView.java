package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoBgView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "vipLevel", "", "setVipBackgroundResource", "kaVipLevel", "setKaVipBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserInfoBgView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoBgView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setKaVipBackgroundResource(int kaVipLevel) {
        if (kaVipLevel == VipLevel.Vip1.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_1);
            return;
        }
        if (kaVipLevel == VipLevel.Vip2.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_2);
            return;
        }
        if (kaVipLevel == VipLevel.Vip3.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_3);
            return;
        }
        if (kaVipLevel == VipLevel.Vip4.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_4);
            return;
        }
        if (kaVipLevel == VipLevel.Vip5.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_5);
        } else if (kaVipLevel == VipLevel.Vip6.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_ka_vip_6);
        } else {
            setVisibility(8);
        }
    }

    private final void setVipBackgroundResource(int vipLevel) {
        if (vipLevel == PremiumLevel.Premium3.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_aristocrat_3);
            return;
        }
        if (vipLevel == PremiumLevel.Premium4.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_aristocrat_4);
        } else if (vipLevel == PremiumLevel.Premium5.getValue()) {
            setBackgroundResource(oOo00OO0.room_user_info_dialog_identity_aristocrat_5);
        } else {
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoBgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ UserInfoBgView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoBgView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
