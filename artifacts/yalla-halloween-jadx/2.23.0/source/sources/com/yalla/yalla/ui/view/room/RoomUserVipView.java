package com.yalla.yalla.ui.view.room;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000OO00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.yb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomUserVipView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lo0ooOOOO/yb;", "OooO0Oo", "Lkotlin/Lazy;", "getBinding", "()Lo0ooOOOO/yb;", "binding", "", "OooO0o0", "Ljava/lang/String;", "getVipStr", "()Ljava/lang/String;", "vipStr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomUserVipView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String vipStr;

    public static final class OooO00o extends Lambda implements Function0<yb> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f31333OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserVipView f31334OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, RoomUserVipView roomUserVipView) {
            super(0);
            this.f31333OooO0Oo = context;
            this.f31334OooO0o0 = roomUserVipView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final yb invoke() {
            yb ybVarInflate = yb.inflate(LayoutInflater.from(this.f31333OooO0Oo), this.f31334OooO0o0, true);
            Intrinsics.checkNotNullExpressionValue(ybVarInflate, "inflate(LayoutInflater.from(context), this, true)");
            return ybVarInflate;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserVipView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final yb getBinding() {
        return (yb) this.binding.getValue();
    }

    public final void OooO0O0(int i, int i2, int i3, @Nullable MixedRoomActivity mixedRoomActivity) {
        getBinding().f59416OooO0O0.setImageDrawable(null);
        getBinding().f59417OooO0OO.setImageDrawable(null);
        SVGAView sVGAView = getBinding().f59417OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svga");
        o000OO00.OooO0O0(sVGAView);
        TextView textView = getBinding().f59418OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvVip");
        o000OO00.OooO0O0(textView);
        if (i != VipState.Vip.getValue() || i2 <= VipLevel.Vip0.getValue() || i3 != 1) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        getBinding().f59418OooO0Oo.setText(this.vipStr + VipLevel.INSTANCE.of(i2).level());
        TextView textView2 = getBinding().f59418OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvVip");
        o000OO00.OooOOOO(textView2);
        SVGAView sVGAView2 = getBinding().f59417OooO0OO;
        Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svga");
        o000OO00.OooOOOO(sVGAView2);
        if (i2 == VipLevel.Vip1.getValue()) {
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_1);
            getBinding().f59417OooO0OO.setImageResource(oO00OOO.main_ka_vip_level_1);
            return;
        }
        if (i2 == VipLevel.Vip2.getValue()) {
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_2);
            getBinding().f59417OooO0OO.setImageResource(oO00OOO.main_ka_vip_level_2);
            return;
        }
        if (i2 == VipLevel.Vip3.getValue()) {
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_3);
            getBinding().f59417OooO0OO.setImageResource(oO00OOO.main_ka_vip_level_3);
            return;
        }
        if (i2 == VipLevel.Vip4.getValue()) {
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_4);
            getBinding().f59417OooO0OO.setImageResource(oO00OOO.main_ka_vip_level_4);
            return;
        }
        if (i2 == VipLevel.Vip5.getValue()) {
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_5);
            getBinding().f59417OooO0OO.setImageResource(oO00OOO.main_ka_vip_level_5);
        } else {
            if (i2 != VipLevel.Vip6.getValue()) {
                setVisibility(8);
                return;
            }
            SVGAView it = getBinding().f59417OooO0OO;
            it.clearAnimation();
            Intrinsics.checkNotNullExpressionValue(it, "it");
            o000OO00.OooOOOO(it);
            it.OooOO0O("svga/ic_vip6_small.svga", mixedRoomActivity);
            it.OooOO0o();
            getBinding().f59416OooO0O0.setBackgroundResource(oOo00OO0.room_user_info_dialog_ka_vip_6_bg);
        }
    }

    @NotNull
    public final String getVipStr() {
        return this.vipStr;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomUserVipView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomUserVipView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt.lazy(new OooO00o(context, this));
        this.vipStr = "VIP";
    }
}
