package com.yalla.yalla.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/view/UserInfoStrokeView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "vipLevel", "", "setVipStrokeResource", "kaVipLevel", "setKaVipStrokeResource", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoStrokeView extends AppCompatImageView {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoStrokeView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setKaVipStrokeResource(int kaVipLevel) {
        if (kaVipLevel == VipLevel.Vip1.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_ka_vip_1);
            return;
        }
        if (kaVipLevel == VipLevel.Vip2.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_ka_vip_2);
            return;
        }
        if (kaVipLevel == VipLevel.Vip3.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_ka_vip_3);
            return;
        }
        if (kaVipLevel == VipLevel.Vip4.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_ka_vip_4);
        } else if (kaVipLevel == VipLevel.Vip5.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_ka_vip_5);
        } else {
            setVisibility(8);
        }
    }

    private final void setVipStrokeResource(int vipLevel) {
        if (vipLevel == PremiumLevel.Premium3.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_aristocrat_3);
            return;
        }
        if (vipLevel == PremiumLevel.Premium4.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_aristocrat_4);
        } else if (vipLevel == PremiumLevel.Premium5.getValue()) {
            setBackgroundResource(R.drawable.room_user_info_dialog_stroke_aristocrat_5);
        } else {
            setVisibility(8);
        }
    }

    public final void OooO0OO(int i, int i2, int i3, int i4, int i5, int i6) {
        boolean z = false;
        setVisibility(0);
        boolean z2 = i == VipState.Vip.getValue() && i2 > VipLevel.Vip0.getValue() && i3 == 1;
        if (i4 == 1 && i5 > PremiumLevel.Premium0.getValue()) {
            z = true;
        }
        if (z2 && z) {
            if (i6 == 1) {
                setVipStrokeResource(i5);
                return;
            } else {
                setKaVipStrokeResource(i2);
                return;
            }
        }
        if (z2) {
            setKaVipStrokeResource(i2);
        } else if (z) {
            setVipStrokeResource(i5);
        } else {
            setVisibility(8);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoStrokeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserInfoStrokeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
