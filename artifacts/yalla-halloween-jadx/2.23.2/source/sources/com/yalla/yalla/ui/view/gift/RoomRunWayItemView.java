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
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
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
import p187o00o00o0.OooO;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.m3;
import p412o0Oo0o0O.o000O000;
import p423o0OoO0OO.o00O00O;
import p558o0oOOooo.oO0O00oO;
import p558o0oOOooo.oO0O0Oo0;
import p558o0oOOooo.oOo0oooO;
import p558o0oOOooo.ooOOO00O;
import p558o0oOOooo.ooOOO0Oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p595o0oo00O.OooOo00;
import p598o0oo00Oo.o0000O00;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u00064"}, d2 = {"Lcom/yalla/yalla/ui/view/gift/RoomRunWayItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/RoomRunWayModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "", "setData", "Landroid/text/Spanned;", "htmlStr", "setText", "", "numberData", "setNumber", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "OooO0o0", "Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "getActivity", "()Lcom/yalla/yalla/mixedroom/MixedRoomActivity;", "setActivity", "(Lcom/yalla/yalla/mixedroom/MixedRoomActivity;)V", "activity", "Lo0oOOooo/oO0O00oO;", "OooO0o", "Lo0oOOooo/oO0O00oO;", "getRoomGiftRunWayAnima", "()Lo0oOOooo/oO0O00oO;", "setRoomGiftRunWayAnima", "(Lo0oOOooo/oO0O00oO;)V", "roomGiftRunWayAnima", "", "OooO0oo", "Z", "getBgAnimationUiIs", "()Z", "setBgAnimationUiIs", "(Z)V", "bgAnimationUiIs", "Lkotlin/Function0;", "OooO", "Lkotlin/jvm/functions/Function0;", "getBgAnimationUiInitListener", "()Lkotlin/jvm/functions/Function0;", "setBgAnimationUiInitListener", "(Lkotlin/jvm/functions/Function0;)V", "bgAnimationUiInitListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomRunWayItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> bgAnimationUiInitListener;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final m3 f30513OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public oO0O00oO roomGiftRunWayAnima;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public MixedRoomActivity activity;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public RoomRunWayModel f30516OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name and from kotlin metadata */
    public boolean bgAnimationUiIs;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f30518OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f30519OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f30520OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public boolean f30521OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    @NotNull
    public final OooO0OO f30522OooOOO0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0oo0000.OooO00o.OooO0O0("102210");
            RoomRunWayModel roomRunWayModel = RoomRunWayItemView.this.f30516OooO0oO;
            long jOooO = o0OoOo0.OooO(0L, roomRunWayModel != null ? roomRunWayModel.getFromUserId() : null);
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(jOooO));
            if (roomUserInfoModelOooO0o0 != null) {
                com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(roomUserInfoModelOooO0o0);
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
            o0oo0000.OooO00o.OooO0O0("102211");
            com.yalla.yalla.service.room.OooO00o.f24527OooOOo0.f48626OooO0oo.postValue(RoomRunWayItemView.this.f30516OooO0oO);
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
            if (i == roomRunWayItemView.f30518OooOO0) {
                Object obj = msg.obj;
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Long");
                long jLongValue = ((Long) obj).longValue();
                StringBuilder sbOooO00o = o00O0000.OooO00o("幸运礼物 消失Tips: showContentTipsIndex = ", roomRunWayItemView.f30520OooOO0o, ", messageObj = ");
                sbOooO00o.append(jLongValue);
                o0000O00.OooO0O0(sbOooO00o.toString());
                if (roomRunWayItemView.f30520OooOO0o == jLongValue) {
                    TextView tvContentTips = roomRunWayItemView.f30513OooO0Oo.f44174OooOO0;
                    Intrinsics.checkNotNullExpressionValue(tvContentTips, "tvContentTips");
                    o000O.OooO0O0(tvContentTips);
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
        if (OooOo00.OooO0o0()) {
            charArray = ArraysKt.reversedArray(charArray);
        }
        m3 m3Var = this.f30513OooO0Oo;
        m3Var.f44173OooO0oo.removeAllViews();
        ?? it = ArraysKt.getIndices(charArray).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linearLayout = m3Var.f44173OooO0oo;
            if (!zHasNext) {
                break;
            }
            int iNextInt = it.nextInt();
            if (Character.isDigit(charArray[iNextInt])) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                NumberView numberView = new NumberView(context, null, 6, 0);
                numberView.setSize(NumberSize.Size.RunWay);
                numberView.setData(charArray[iNextInt] - '0');
                numberView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                linearLayout.addView(numberView);
            }
        }
        oO0O00oO oo0o00oo = this.roomGiftRunWayAnima;
        if (oo0o00oo != null) {
            Object value = oo0o00oo.f56216OooO0OO.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            linearLayout.startAnimation((Animation) value);
        }
    }

    public final void OooO0O0(int i) {
        m3 m3Var = this.f30513OooO0Oo;
        ImageView xTv = m3Var.f44177OooOOO0;
        Intrinsics.checkNotNullExpressionValue(xTv, "xTv");
        o000O.OooOOOO(xTv);
        LinearLayout layoutCount = m3Var.f44173OooO0oo;
        Intrinsics.checkNotNullExpressionValue(layoutCount, "layoutCount");
        o000O.OooOOOO(layoutCount);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        setText(sb.toString());
    }

    public final void OooO0OO() {
        m3 m3Var = this.f30513OooO0Oo;
        m3Var.f44167OooO0O0.setImageDrawable(null);
        m3Var.f44167OooO0O0.setBackgroundDrawable(null);
        m3Var.f44165OooO.clearAnimation();
        m3Var.f44165OooO.setImageDrawable(null);
        SVGAView svgaBg = m3Var.f44165OooO;
        Intrinsics.checkNotNullExpressionValue(svgaBg, "svgaBg");
        o000O.OooO0O0(svgaBg);
        m3Var.f44169OooO0Oo.setImageDrawable(null);
        m3Var.f44175OooOO0O.setText("");
        m3Var.f44176OooOO0o.setText("");
        m3Var.f44176OooOO0o.setTextColor(o0000.OooO00o(o0OOO0o.color_FAE976));
        m3Var.f44170OooO0o.setImageDrawable(null);
        TextView tvContentTips = m3Var.f44174OooOO0;
        Intrinsics.checkNotNullExpressionValue(tvContentTips, "tvContentTips");
        o000O.OooO0O0(tvContentTips);
        Group contentGroup = m3Var.f44168OooO0OO;
        Intrinsics.checkNotNullExpressionValue(contentGroup, "contentGroup");
        o000O.OooOOOO(contentGroup);
        ImageView xTv = m3Var.f44177OooOOO0;
        Intrinsics.checkNotNullExpressionValue(xTv, "xTv");
        o000O.OooO0O0(xTv);
        LinearLayout layoutCount = m3Var.f44173OooO0oo;
        Intrinsics.checkNotNullExpressionValue(layoutCount, "layoutCount");
        o000O.OooO0O0(layoutCount);
    }

    @Override // android.view.View
    public final void clearAnimation() {
        this.f30522OooOOO0.removeMessages(this.f30518OooOO0);
        oO0O00oO oo0o00oo = this.roomGiftRunWayAnima;
        m3 m3Var = this.f30513OooO0Oo;
        if (oo0o00oo != null) {
            m3Var.f44172OooO0oO.clearAnimation();
        }
        m3Var.f44173OooO0oo.clearAnimation();
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
    public final oO0O00oO getRoomGiftRunWayAnima() {
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
        this.f30516OooO0oO = model;
        o0000O00.OooO0o("addGiftAnimation setData data = ".concat(OooO.OooO00o(model)));
        OooO0OO();
        m3 m3Var = this.f30513OooO0Oo;
        ConstraintLayout layoutContent = m3Var.f44172OooO0oO;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        o000O.OooO0O0(layoutContent);
        RoomRunWayModel roomRunWayModel = this.f30516OooO0oO;
        if (roomRunWayModel != null) {
            ConstraintLayout constraintLayout = m3Var.f44166OooO00o;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
            o000O.OooOOOO(constraintLayout);
            ConstraintLayout layoutContent2 = m3Var.f44172OooO0oO;
            Intrinsics.checkNotNullExpressionValue(layoutContent2, "layoutContent");
            o000O.OooOOOO(layoutContent2);
            oO0O00oO oo0o00oo = this.roomGiftRunWayAnima;
            if (oo0o00oo != null) {
                Object value = oo0o00oo.f56214OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                layoutContent2.startAnimation((Animation) value);
            }
            Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
            oooO00o.OooO00o(d1.OooO0OO());
            oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(roomRunWayModel.getFromUserHead());
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0Oo(m3Var.f44169OooO0Oo);
            m3Var.f44175OooOO0O.setText(o000O000.OooO0O0(Long.parseLong(roomRunWayModel.getFromUserId()), roomRunWayModel.getFromUserName()));
            String strOooO0O0 = o000O000.OooO0O0(roomRunWayModel.getToUserId(), roomRunWayModel.getToUserName());
            TextView textView = m3Var.f44176OooOO0o;
            textView.setText(strOooO0O0);
            textView.setTextColor(o0000.OooO00o(o0OOO0o.color_FAE976));
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(getContext());
            oooO00o2.OooO00o(d1.OooO0O0());
            oooO00o2.f43126OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(roomRunWayModel.getGiftUrl());
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.OooO0Oo(m3Var.f44170OooO0o);
            this.bgAnimationUiIs = false;
            if (roomRunWayModel.isVip6()) {
                this.bgAnimationUiIs = true;
                oOo0oooO ooo0oooo = new oOo0oooO(this);
                SVGAView svgaView = m3Var.f44165OooO;
                Intrinsics.checkNotNull(svgaView);
                o000O.OooOOOO(svgaView);
                Group contentGroup = m3Var.f44168OooO0OO;
                Intrinsics.checkNotNullExpressionValue(contentGroup, "contentGroup");
                o000O.OooO0OO(contentGroup);
                ooOOO0Oo ooooo0oo = new ooOOO0Oo(ooo0oooo, svgaView, this);
                ooOOO00O ooooo00o = new ooOOO00O(this);
                Intrinsics.checkNotNullParameter(svgaView, "svgaView");
                o00O00O.OooO00o(svgaView, "svga/gift_run_way_bg_vip6_start.svga", 1, ooooo0oo, ooooo00o);
                return;
            }
            int type = roomRunWayModel.getType();
            ImageView imageView = m3Var.f44167OooO0O0;
            if (type == 7) {
                imageView.setBackgroundResource(o0Oo0oo.ic_room_run_way_bg_all_in_room);
                return;
            }
            if (roomRunWayModel.getType() == 8) {
                imageView.setBackgroundResource(o0Oo0oo.ic_room_run_way_bg_all_in_mic);
            } else if (roomRunWayModel.getGiftType() == GiftPropTypeTag.Blind.getValue()) {
                imageView.setBackgroundResource(o0Oo0oo.ic_room_run_way_bg_blind);
            } else {
                imageView.setBackgroundResource(o0Oo0oo.bg_round_tr85);
            }
        }
    }

    public final void setRoomGiftRunWayAnima(@Nullable oO0O00oO oo0o00oo) {
        this.roomGiftRunWayAnima = oo0o00oo;
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
        int i = this.f30518OooOO0;
        m3 m3Var = this.f30513OooO0Oo;
        try {
            Integer numValueOf = Integer.valueOf(numberData);
            RoomRunWayModel roomRunWayModel = this.f30516OooO0oO;
            if (roomRunWayModel == null || !roomRunWayModel.isLuckyflag() || com.code.android.util.OooOo00.OooO00o(roomRunWayModel.getLuckyinstances()) || roomRunWayModel.getLuckyinstances().size() <= this.f30519OooOO0O) {
                return;
            }
            Intrinsics.checkNotNull(numValueOf);
            if (numValueOf.intValue() >= roomRunWayModel.getLuckyinstances().get(this.f30519OooOO0O).getLnumtime()) {
                LuckyInstancesModel luckyInstancesModel = roomRunWayModel.getLuckyinstances().get(this.f30519OooOO0O);
                String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000000.lucky_gift_runway_tips), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLmultiple() + "</b></font> "), "<font color='#D8FF23' size='22px'><b>" + luckyInstancesModel.getLreward() + "</b></font> ");
                m3Var.f44176OooOO0o.setTextColor(o0000.OooO00o(o0OOO0o.white));
                TextView textView = m3Var.f44174OooOO0;
                Intrinsics.checkNotNull(textView);
                o000O.OooOOOO(textView);
                textView.setText(Html.fromHtml(strOooO00o));
                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                float f = 24;
                o000O.OooOO0O(textView, o0000O0.OooO00o(f));
                int iOooO00o = o0000O0.OooO00o(f);
                Intrinsics.checkNotNullParameter(textView, "<this>");
                textView.setPaddingRelative(textView.getPaddingStart(), textView.getPaddingTop(), iOooO00o, textView.getPaddingBottom());
                if (this.bgAnimationUiIs) {
                    textView.setBackgroundResource(o0Oo0oo.bg_lucky_tips_vip6);
                } else {
                    textView.setBackgroundResource(o0Oo0oo.bg_lucky_tips);
                    ImageView contentBg = m3Var.f44167OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(contentBg, "contentBg");
                    int i2 = o0Oo0oo.bg_lucky_gift;
                    if (!this.f30521OooOOO) {
                        this.f30521OooOOO = true;
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        alphaAnimation.setFillAfter(true);
                        alphaAnimation.setDuration(200);
                        contentBg.startAnimation(alphaAnimation);
                        alphaAnimation.setAnimationListener(new oO0O0Oo0(contentBg, i2));
                    }
                }
                this.f30519OooOO0O++;
                this.f30520OooOO0o++;
                Message message = new Message();
                message.what = i;
                message.obj = Long.valueOf(this.f30520OooOO0o);
                this.f30522OooOOO0.sendMessageDelayed(message, i);
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
        m3 m3VarInflate = m3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(m3VarInflate, "inflate(...)");
        this.f30513OooO0Oo = m3VarInflate;
        NetImageView ivFromHeadClick = m3VarInflate.f44171OooO0o0;
        Intrinsics.checkNotNullExpressionValue(ivFromHeadClick, "ivFromHeadClick");
        o000O.OooO(ivFromHeadClick, new OooO00o());
        ConstraintLayout layoutContent = m3VarInflate.f44172OooO0oO;
        Intrinsics.checkNotNullExpressionValue(layoutContent, "layoutContent");
        o000O.OooO(layoutContent, new OooO0O0());
        OooO0OO();
        this.f30518OooOO0 = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
        this.f30520OooOO0o = -1L;
        this.f30522OooOOO0 = new OooO0OO();
    }
}
