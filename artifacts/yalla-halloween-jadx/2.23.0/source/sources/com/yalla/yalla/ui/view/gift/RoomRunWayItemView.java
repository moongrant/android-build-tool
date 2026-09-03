package com.yalla.yalla.ui.view.gift;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000OO00;
import com.code.android.util.o0OoOo0;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.android.gms.common.ConnectionResult;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.model.LuckyInstancesModel;
import com.yalla.yalla.model.RoomRunWayModel;
import com.yalla.yalla.model.gift.GiftPropTypeTag;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.view.NumberSize;
import com.yalla.yalla.ui.view.NumberView;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p028Oooo0oO.o00O0000;
import p139o00OOooO.OooO0o;
import p140o00OOooo.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p417o0OoO0.o0000oo;
import p552o0oOOoOo.o0OO;
import p552o0oOOoOo.o0OOO00;
import p552o0oOOoOo.o0OOO0OO;
import p552o0oOOoOo.o0OOOO00;
import p552o0oOOoOo.o0OOooO0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p592o0oo00O.OooOOO0;
import p641o0ooOOOO.xb;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00064"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/RoomRunWayItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/RoomRunWayModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "setData", "Landroid/text/Spanned;", "htmlStr", "setText", "", "numberData", "setNumber", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "OooO0o0", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "getActivity", "()Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "setActivity", "(Lcom/yalla/yalla/mixedroom/MixedRoomActivity;)V", "activity", "Lo0oOOoOo/o0OOooO0;", "OooO0o", "Lo0oOOoOo/o0OOooO0;", "getRoomGiftRunWayAnima", "()Lo0oOOoOo/o0OOooO0;", "setRoomGiftRunWayAnima", "(Lo0oOOoOo/o0OOooO0;)V", "roomGiftRunWayAnima", "", "OooO0oo", "Z", "getBgAnimationUiIs", "()Z", "setBgAnimationUiIs", "(Z)V", "bgAnimationUiIs", "Lkotlin/Function0;", "OooO", "Lkotlin/jvm/functions/Function0;", "getBgAnimationUiInitListener", "()Lkotlin/jvm/functions/Function0;", "setBgAnimationUiInitListener", "(Lkotlin/jvm/functions/Function0;)V", "bgAnimationUiInitListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomRunWayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> bgAnimationUiInitListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final xb f31058OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public o0OOooO0 roomGiftRunWayAnima;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MixedRoomActivity activity;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public RoomRunWayModel f31061OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    public boolean bgAnimationUiIs;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f31063OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f31064OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f31065OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f31066OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f31067OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("102210");
            RoomRunWayModel roomRunWayModel = RoomRunWayItemView.this.f31061OooO0oO;
            long jOooO = o0OoOo0.OooO(0L, roomRunWayModel != null ? roomRunWayModel.getFromUserId() : null);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jOooO));
            if (roomUserInfoModelOooO0o0 != null) {
                com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue(roomUserInfoModelOooO0o0);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("102211");
            com.yalla.yalla.service.room.OooO00o.f24989OooOOo0.f47455OooO0oo.postValue(RoomRunWayItemView.this.f31061OooO0oO);
            return Unit.INSTANCE;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public static final class OooO0OO extends Handler {
        public OooO0OO() {
        }

        @Override // android.os.Handler
        public final void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            int i = msg.what;
            RoomRunWayItemView roomRunWayItemView = RoomRunWayItemView.this;
            if (i == roomRunWayItemView.f31063OooOO0) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj).longValue();
                StringBuilder sbOooO00o = o00O0000.OooO00o("幸运礼物 消失Tips: showContentTipsIndex = ", roomRunWayItemView.f31065OooOO0o, ", messageObj = ");
                sbOooO00o.append(jLongValue);
                OooOOO0.OooO0O0(sbOooO00o.toString());
                if (roomRunWayItemView.f31065OooOO0o == jLongValue) {
                    TextView textView = roomRunWayItemView.f31058OooO0Oo.f59356OooOO0;
                    Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContentTips");
                    o000OO00.OooO0O0(textView);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomRunWayItemView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Iterator, kotlin.collections.IntIterator] */
    private final void setNumber(String numberData) {
        LinearLayout linearLayout;
        char[] charArray = numberData.toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "this as java.lang.String).toCharArray()");
        if (OooO.OooO0o0()) {
            charArray = ArraysKt.reversedArray(charArray);
        }
        xb xbVar = this.f31058OooO0Oo;
        xbVar.f59355OooO0oo.removeAllViews();
        ?? it = ArraysKt.getIndices(charArray).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linearLayout = xbVar.f59355OooO0oo;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (Character.isDigit(charArray[iNextInt])) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                NumberView numberView = new NumberView(context, null, 6, 0);
                numberView.setSize(NumberSize.Size.RunWay);
                numberView.setData(charArray[iNextInt] - '0');
                numberView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(numberView);
            }
        }
        o0OOooO0 o0ooooo0 = this.roomGiftRunWayAnima;
        if (o0ooooo0 != null) {
            Object value = o0ooooo0.f55993OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-numberAnimationScale>(...)");
            linearLayout.startAnimation((Animation) value);
        }
    }

    public final void OooO0O0(int i) {
        xb xbVar = this.f31058OooO0Oo;
        ImageView imageView = xbVar.f59359OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.xTv");
        o000OO00.OooOOOO(imageView);
        LinearLayout linearLayout = xbVar.f59355OooO0oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutCount");
        o000OO00.OooOOOO(linearLayout);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        setText(sb.toString());
    }

    public final void OooO0OO() {
        xb xbVar = this.f31058OooO0Oo;
        xbVar.f59349OooO0O0.setImageDrawable(null);
        xbVar.f59349OooO0O0.setBackgroundDrawable(null);
        xbVar.f59347OooO.clearAnimation();
        xbVar.f59347OooO.setImageDrawable(null);
        SVGAView sVGAView = xbVar.f59347OooO;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaBg");
        o000OO00.OooO0O0(sVGAView);
        xbVar.f59351OooO0Oo.setImageDrawable(null);
        xbVar.f59357OooOO0O.setText("");
        xbVar.f59358OooOO0o.setText("");
        xbVar.f59358OooOO0o.setTextColor(o0000.OooO00o(oO00O0o.color_FAE976));
        xbVar.f59352OooO0o.setImageDrawable(null);
        TextView textView = xbVar.f59356OooOO0;
        Intrinsics.checkNotNullExpressionValue(textView, "binding.tvContentTips");
        o000OO00.OooO0O0(textView);
        Group group = xbVar.f59350OooO0OO;
        Intrinsics.checkNotNullExpressionValue(group, "binding.contentGroup");
        o000OO00.OooOOOO(group);
        ImageView imageView = xbVar.f59359OooOOO0;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.xTv");
        o000OO00.OooO0O0(imageView);
        LinearLayout linearLayout = xbVar.f59355OooO0oo;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.layoutCount");
        o000OO00.OooO0O0(linearLayout);
    }

    @Override // android.view.View
    public final void clearAnimation() {
        this.f31067OooOOO0.removeMessages(this.f31063OooOO0);
        o0OOooO0 o0ooooo0 = this.roomGiftRunWayAnima;
        xb xbVar = this.f31058OooO0Oo;
        if (o0ooooo0 != null) {
            xbVar.f59354OooO0oO.clearAnimation();
        }
        xbVar.f59355OooO0oo.clearAnimation();
    }

    @Nullable
    public final MixedRoomActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Function0<Unit> getBgAnimationUiInitListener() {
        return this.bgAnimationUiInitListener;
    }

    public final boolean getBgAnimationUiIs() {
        return this.bgAnimationUiIs;
    }

    @Nullable
    public final o0OOooO0 getRoomGiftRunWayAnima() {
        return this.roomGiftRunWayAnima;
    }

    public final void setActivity(@Nullable MixedRoomActivity mixedRoomActivity) {
        this.activity = mixedRoomActivity;
    }

    public final void setBgAnimationUiInitListener(@Nullable Function0<Unit> function0) {
        this.bgAnimationUiInitListener = function0;
    }

    public final void setBgAnimationUiIs(boolean z) {
        this.bgAnimationUiIs = z;
    }

    public final void setData(@Nullable RoomRunWayModel model) {
        this.f31061OooO0oO = model;
        OooOOO0.OooO0o("addGiftAnimation setData data = ".concat(OooOO0.OooO00o(model)));
        OooO0OO();
        xb xbVar = this.f31058OooO0Oo;
        ConstraintLayout constraintLayout = xbVar.f59354OooO0oO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutContent");
        o000OO00.OooO0O0(constraintLayout);
        RoomRunWayModel roomRunWayModel = this.f31061OooO0oO;
        if (roomRunWayModel != null) {
            ConstraintLayout constraintLayout2 = xbVar.f59348OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.root");
            o000OO00.OooOOOO(constraintLayout2);
            ConstraintLayout constraintLayout3 = xbVar.f59354OooO0oO;
            Intrinsics.checkNotNullExpressionValue(constraintLayout3, "binding.layoutContent");
            o000OO00.OooOOOO(constraintLayout3);
            o0OOooO0 o0ooooo0 = this.roomGiftRunWayAnima;
            if (o0ooooo0 != null) {
                Object value = o0ooooo0.f55991OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-layoutAnimationIn>(...)");
                constraintLayout3.startAnimation((Animation) value);
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
            oooO00o.f43911OooO0OO = OooOOO.OooO00o(roomRunWayModel.getFromUserHead());
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0Oo(xbVar.f59351OooO0Oo);
            xbVar.f59357OooOO0O.setText(oOO0O0O.OooO0O0(Long.parseLong(roomRunWayModel.getFromUserId()), roomRunWayModel.getFromUserName()));
            String strOooO0O0 = oOO0O0O.OooO0O0(roomRunWayModel.getToUserId(), roomRunWayModel.getToUserName());
            TextView textView = xbVar.f59358OooOO0o;
            textView.setText(strOooO0O0);
            textView.setTextColor(o0000.OooO00o(oO00O0o.color_FAE976));
            o0OOo0O.OooOO0.OooO00o oooO00o2 = new o0OOo0O.OooOO0.OooO00o(getContext());
            oooO00o2.OooO00o(p543o0oO0O00.OooO.OooO0O0());
            oooO00o2.f43911OooO0OO = OooO0o.OooO0Oo(roomRunWayModel.getGiftUrl());
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.OooO0Oo(xbVar.f59352OooO0o);
            this.bgAnimationUiIs = false;
            if (roomRunWayModel.isVip6()) {
                this.bgAnimationUiIs = true;
                o0OO o0oo = new o0OO(this);
                SVGAView svgaView = xbVar.f59347OooO;
                Intrinsics.checkNotNullExpressionValue(svgaView, "it");
                o000OO00.OooOOOO(svgaView);
                Group group = xbVar.f59350OooO0OO;
                Intrinsics.checkNotNullExpressionValue(group, "binding.contentGroup");
                o000OO00.OooO0OO(group);
                o0OOO0OO o0ooo0oo2 = new o0OOO0OO(o0oo, svgaView, this);
                o0OOOO00 o0oooo01 = new o0OOOO00(this);
                Intrinsics.checkNotNullParameter(svgaView, "svgaView");
                o0000oo.OooO00o(svgaView, "svga/gift_run_way_bg_vip6_start.svga", 1, o0ooo0oo2, o0oooo01);
                return;
            }
            int type = roomRunWayModel.getType();
            ImageView imageView = xbVar.f59349OooO0O0;
            if (type == 7) {
                imageView.setBackgroundResource(oOo00OO0.ic_room_run_way_bg_all_in_room);
                return;
            }
            if (roomRunWayModel.getType() == 8) {
                imageView.setBackgroundResource(oOo00OO0.ic_room_run_way_bg_all_in_mic);
            } else if (roomRunWayModel.getGiftType() == GiftPropTypeTag.Blind.getValue()) {
                imageView.setBackgroundResource(oOo00OO0.ic_room_run_way_bg_blind);
            } else {
                imageView.setBackgroundResource(oOo00OO0.bg_round_tr85);
            }
        }
    }

    public final void setRoomGiftRunWayAnima(@Nullable o0OOooO0 o0ooooo0) {
        this.roomGiftRunWayAnima = o0ooooo0;
    }

    public final void setText(@Nullable Spanned htmlStr) {
        if (htmlStr != null) {
            setText(htmlStr.toString());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomRunWayItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setText(String numberData) {
        if (TextUtils.isEmpty(numberData)) {
            return;
        }
        setNumber(numberData);
        int i = this.f31063OooOO0;
        xb xbVar = this.f31058OooO0Oo;
        try {
            Integer showNumber = Integer.valueOf(numberData);
            RoomRunWayModel roomRunWayModel = this.f31061OooO0oO;
            if (roomRunWayModel == null || !roomRunWayModel.isLuckyflag() || OooOo00.OooO00o(roomRunWayModel.getLuckyinstances()) || roomRunWayModel.getLuckyinstances().size() <= this.f31064OooOO0O) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(showNumber, "showNumber");
            if (showNumber.intValue() >= roomRunWayModel.getLuckyinstances().get(this.f31064OooOO0O).getLnumtime()) {
                LuckyInstancesModel luckyInstancesModel = roomRunWayModel.getLuckyinstances().get(this.f31064OooOO0O);
                String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.lucky_gift_runway_tips), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLmultiple() + "</b></font> "), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLreward() + "</b></font> ");
                xbVar.f59358OooOO0o.setTextColor(o0000.OooO00o(oO00O0o.white));
                TextView it = xbVar.f59356OooOO0;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o000OO00.OooOOOO(it);
                it.setText(Html.fromHtml(strOooO00o));
                ViewGroup.LayoutParams layoutParams = it.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                float f = 24;
                o000OO00.OooOO0O(it, o0000O0.OooO00o(f));
                int iOooO00o = o0000O0.OooO00o(f);
                Intrinsics.checkNotNullParameter(it, "<this>");
                it.setPaddingRelative(it.getPaddingStart(), it.getPaddingTop(), iOooO00o, it.getPaddingBottom());
                if (this.bgAnimationUiIs) {
                    it.setBackgroundResource(oOo00OO0.bg_lucky_tips_vip6);
                } else {
                    it.setBackgroundResource(oOo00OO0.bg_lucky_tips);
                    ImageView imageView = xbVar.f59349OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(imageView, "binding.contentBg");
                    int i2 = oOo00OO0.bg_lucky_gift;
                    if (!this.f31066OooOOO) {
                        this.f31066OooOOO = true;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        alphaAnimation.setFillAfter(true);
                        alphaAnimation.setDuration(200);
                        imageView.startAnimation(alphaAnimation);
                        alphaAnimation.setAnimationListener(new o0OOO00(imageView, i2));
                    }
                }
                this.f31064OooOO0O++;
                this.f31065OooOO0o++;
                Message message = new Message();
                message.what = i;
                message.obj = Long.valueOf(this.f31065OooOO0o);
                this.f31067OooOOO0.sendMessageDelayed(message, i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public /* synthetic */ RoomRunWayItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomRunWayItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        xb xbVarInflate = xb.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(xbVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f31058OooO0Oo = xbVarInflate;
        NetImageView netImageView = xbVarInflate.f59353OooO0o0;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivFromHeadClick");
        o000OO00.OooO(netImageView, new OooO00o());
        ConstraintLayout constraintLayout = xbVarInflate.f59354OooO0oO;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.layoutContent");
        o000OO00.OooO(constraintLayout, new OooO0O0());
        OooO0OO();
        this.f31063OooOO0 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f31065OooOO0o = -1L;
        this.f31067OooOOO0 = new OooO0OO();
    }
}
