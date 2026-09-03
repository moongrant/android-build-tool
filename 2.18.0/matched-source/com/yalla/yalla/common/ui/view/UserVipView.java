package com.yalla.yalla.common.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p255o00ooO0O.oOO00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/yalla/yalla/common/ui/view/UserVipView;", "Landroidx/appcompat/widget/AppCompatImageView;", "", "kaVipLevel", "", "setKaVip", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserVipView extends AppCompatImageView {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VipLevel.values().length];
            iArr[VipLevel.Vip1.ordinal()] = 1;
            iArr[VipLevel.Vip2.ordinal()] = 2;
            iArr[VipLevel.Vip3.ordinal()] = 3;
            iArr[VipLevel.Vip4.ordinal()] = 4;
            iArr[VipLevel.Vip5.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final boolean OooO0OO(int i, boolean z) {
        if (!z) {
            oOO00O.OooO00o(this);
            return false;
        }
        int i2 = OooO00o.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(i).ordinal()];
        if (i2 == 1) {
            oOO00O.OooO(this);
            setImageResource(R.drawable.user_ka_vip_level_image_1);
        } else if (i2 == 2) {
            oOO00O.OooO(this);
            setImageResource(R.drawable.user_ka_vip_level_image_2);
        } else if (i2 == 3) {
            oOO00O.OooO(this);
            setImageResource(R.drawable.user_ka_vip_level_image_3);
        } else if (i2 == 4) {
            oOO00O.OooO(this);
            setImageResource(R.drawable.user_ka_vip_level_image_4);
        } else {
            if (i2 != 5) {
                oOO00O.OooO00o(this);
                return false;
            }
            oOO00O.OooO(this);
            setImageResource(R.drawable.user_ka_vip_level_image_5);
        }
        return true;
    }

    public final void setKaVip(int kaVipLevel) {
        OooO0OO(kaVipLevel, true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public UserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
