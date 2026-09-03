package com.yalla.yalla.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.base.model.MarqueeModel;
import com.app.base.model.roomBroadcastModel.RoomBroadcastModel;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOOO0;
import com.yalla.support.common.util.OooOo;
import com.yalla.support.common.util.OooOo00;
import com.yalla.support.common.util.Oooo0;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.oOO00O;
import p405o0Oo0OO0.OooOO0;
import p515o0o0O00.o00O00;
import p522o0o0O0o.oo0o0O0;
import p530o0o0OOO.o00OO00O;
import p601o0oo00Oo.o0OO0O0;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.cj;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/RoomBroadcastStaticView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/app/base/model/roomBroadcastModel/RoomBroadcastModel;", "data", "", "setData", "Lkotlin/Function0;", "OoooOoO", "Lkotlin/jvm/functions/Function0;", "getGoListener", "()Lkotlin/jvm/functions/Function0;", "setGoListener", "(Lkotlin/jvm/functions/Function0;)V", "goListener", "", "", "OoooOoo", "Lkotlin/Lazy;", "getGiftTypeList", "()Ljava/util/List;", "giftTypeList", "Ooooo00", "getAllTotalGiftTypeList", "allTotalGiftTypeList", "Landroid/content/Context;", d.R, "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
@SuppressLint({"NotifyDataSetChanged"})
public final class RoomBroadcastStaticView extends ConstraintLayout {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f25081Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final cj f25082Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final String f25083Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @NotNull
    public final String f25084Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f25085OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f25086OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f25087OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f25088OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final int f25089OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public final int f25090OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public final int f25091OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final int f25092OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> goListener;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy giftTypeList;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy allTotalGiftTypeList;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f25096Ooooo0o;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public final int f25097o000oOoO;

    public static final class OooO00o extends Lambda implements Function0<List<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f25098Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Integer> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(12);
            arrayList.add(14);
            arrayList.add(22);
            return arrayList;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<List<Integer>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f25099Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<Integer> invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(10);
            arrayList.add(12);
            arrayList.add(14);
            arrayList.add(15);
            arrayList.add(17);
            arrayList.add(21);
            arrayList.add(22);
            return arrayList;
        }
    }

    public static final class OooO0OO extends OooOOO0 {
        public OooO0OO() {
            super(0L, 1, null);
        }

        @Override // com.yalla.support.common.util.OooOOO0
        public final void onNoDoubleClick(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Function0<Unit> goListener = RoomBroadcastStaticView.this.getGoListener();
            if (goListener != null) {
                goListener.invoke();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastStaticView(@NotNull Context context) {
        this(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(RoomBroadcastStaticView roomBroadcastStaticView, OooOO0 oooOO1, boolean z) {
        Objects.requireNonNull(roomBroadcastStaticView);
        oooOO1.OooO0OO(true, "profile1");
        oooOO1.OooO0OO(true, "profile2");
        oooOO1.OooO0OO(true, ShareConstants.WEB_DIALOG_PARAM_TITLE);
        oooOO1.OooO0OO(true, "gift");
        oooOO1.OooO0OO(true, "x");
        oooOO1.OooO0OO(true, "number");
        oooOO1.OooO0OO(true, "button");
        oooOO1.OooO0OO(true, "img_350");
        oooOO1.OooO0OO(true, "img_361");
        oooOO1.OooO0OO(true, "img_283");
        oooOO1.OooO0OO(true, "img_277");
        oooOO1.OooO0OO(true, "img_354");
        oooOO1.OooO0OO(true, "img_355");
        oooOO1.OooO0OO(true, "img_354");
        oooOO1.OooO0OO(true, "img_355");
        boolean z2 = true ^ z;
        oooOO1.OooO0OO(z2, "lvse_00000");
        oooOO1.OooO0OO(z2, "lvse_00001");
        oooOO1.OooO0OO(z2, "lvse_00002");
        oooOO1.OooO0OO(z2, "lvse_00003");
        oooOO1.OooO0OO(z2, "lvse_00004");
        oooOO1.OooO0OO(z2, "lvse_00005");
        oooOO1.OooO0OO(z2, "lvse_00006");
        oooOO1.OooO0OO(z2, "lvse_00007");
        oooOO1.OooO0OO(z2, "lvse_00008");
        oooOO1.OooO0OO(z2, "lvse_00009");
        oooOO1.OooO0OO(z2, "lvse_00010");
        oooOO1.OooO0OO(z2, "lvse_00011");
        oooOO1.OooO0OO(z2, "lvse_00012");
        oooOO1.OooO0OO(z2, "lvse_00013");
        oooOO1.OooO0OO(z2, "lvse_00014");
        oooOO1.OooO0OO(z2, "lvse_00015");
        oooOO1.OooO0OO(z2, "lvse_00016");
        oooOO1.OooO0OO(z2, "lvse_00017");
        oooOO1.OooO0OO(z2, "lvse_00018");
        oooOO1.OooO0OO(z2, "lvse_00019");
        oooOO1.OooO0OO(z2, "jinse_00000");
        oooOO1.OooO0OO(z2, "jinse_00001");
        oooOO1.OooO0OO(z2, "jinse_00002");
        oooOO1.OooO0OO(z2, "jinse_00003");
        oooOO1.OooO0OO(z2, "jinse_00004");
        oooOO1.OooO0OO(z2, "jinse_00005");
        oooOO1.OooO0OO(z2, "jinse_00006");
        oooOO1.OooO0OO(z2, "jinse_00007");
        oooOO1.OooO0OO(z2, "jinse_00008");
        oooOO1.OooO0OO(z2, "jinse_00009");
        oooOO1.OooO0OO(z2, "jinse_00010");
        oooOO1.OooO0OO(z2, "jinse_00011");
        oooOO1.OooO0OO(z2, "jinse_00012");
        oooOO1.OooO0OO(z2, "jinse_00013");
        oooOO1.OooO0OO(z2, "jinse_00014");
        oooOO1.OooO0OO(z2, "jinse_00015");
        oooOO1.OooO0OO(z2, "jinse_00016");
        oooOO1.OooO0OO(z2, "jinse_00017");
        oooOO1.OooO0OO(z2, "jinse_00018");
        oooOO1.OooO0OO(z2, "jinse_00019");
    }

    private final List<Integer> getAllTotalGiftTypeList() {
        return (List) this.allTotalGiftTypeList.getValue();
    }

    private final List<Integer> getGiftTypeList() {
        return (List) this.giftTypeList.getValue();
    }

    public final void OooO0OO() {
        RoomBroadcastModel roomBroadcastModel = this.f25096Ooooo0o;
        if (roomBroadcastModel != null) {
            long barid = roomBroadcastModel.getBarid();
            Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
            if (value != null && barid == value.longValue()) {
                ImageView imageView = this.f25082Oooo0o.f49123OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.ivGo");
                oOO00O.OooO00o(imageView);
            } else {
                ImageView imageView2 = this.f25082Oooo0o.f49123OooO0OO;
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.ivGo");
                oOO00O.OooO(imageView2);
            }
        }
    }

    public final void OooO0Oo(RoomBroadcastModel roomBroadcastModel, boolean z) {
        try {
            this.f25082Oooo0o.f49122OooO0O0.setVisibility(0);
            this.f25082Oooo0o.f49123OooO0OO.setVisibility(0);
            this.f25082Oooo0o.f49136OooOOo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.room_gift), roomBroadcastModel.getBaridx() + ""));
            String userName = roomBroadcastModel.getFrom().getUserName();
            this.f25082Oooo0o.f49125OooO0o.setVisibility(8);
            this.f25082Oooo0o.f49135OooOOOo.setText(userName);
            this.f25082Oooo0o.f49138OooOOoo.setText(R.string.room_broadcast_send_gift_all_in_mic);
            if (roomBroadcastModel.getGift() != null && roomBroadcastModel.getNum() > 0) {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(roomBroadcastModel.getGift().getImage());
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f25082Oooo0o.f49122OooO0O0);
                this.f25082Oooo0o.f49130OooOO0O.setNumber(roomBroadcastModel.getNum());
            }
            if (z) {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.color_333333));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25087OoooO00);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25086OoooO0);
                this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_yellow);
            } else {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_green);
            }
            OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void OooO0o0(RoomBroadcastModel roomBroadcastModel, boolean z, boolean z2, boolean z3) {
        String userName;
        String userName2;
        try {
            this.f25082Oooo0o.f49122OooO0O0.setVisibility(0);
            this.f25082Oooo0o.f49123OooO0OO.setVisibility(0);
            this.f25082Oooo0o.f49136OooOOo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.room_gift), roomBroadcastModel.getBaridx() + ""));
            RoomUserInfoModel from = roomBroadcastModel.getFrom();
            if (from == null || (userName = from.getUserName()) == null) {
                userName = "";
            }
            RoomUserInfoModel to = roomBroadcastModel.getTo();
            if (to == null || (userName2 = to.getUserName()) == null) {
                userName2 = "";
            }
            if (roomBroadcastModel.moraflag == 0 && roomBroadcastModel.envelopflag == 0) {
                this.f25082Oooo0o.f49125OooO0o.setVisibility(8);
            } else {
                this.f25082Oooo0o.f49125OooO0o.setVisibility(0);
                if (roomBroadcastModel.moraflag == 1) {
                    this.f25082Oooo0o.f49125OooO0o.setImageResource(R.drawable.icon_room_bottom_game_box_mora);
                }
                if (roomBroadcastModel.envelopflag == 1) {
                    this.f25082Oooo0o.f49125OooO0o.setImageResource(R.drawable.icon_room_bottom_game_box_lucky_golds);
                }
            }
            boolean zIsBlindGift = roomBroadcastModel.isBlindGift();
            if (z3) {
                this.f25082Oooo0o.f49139OooOo0.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.lucky_gift_broadcast), userName));
                TextView textView = this.f25082Oooo0o.f49139OooOo0;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.tvWow");
                oOO00O.OooO(textView);
                String strOooO00o = OooOo.OooO00o(OooOo.OooO00o(OooOOO.OooO0OO(R.string.lucky_gift_broadcast_get_xxx_times_reward_a_total_of_xxx_gold_coins), "<font color='#FFC339' size='13sp'><b>" + roomBroadcastModel.getLuckymultiple() + "</b></font> "), "<font color='#FFC339' size='13sp'><b>" + roomBroadcastModel.getLuckymoney() + "</b></font> ");
                this.f25082Oooo0o.f49137OooOOo0.setVisibility(0);
                this.f25082Oooo0o.f49137OooOOo0.setText(Html.fromHtml(strOooO00o));
            } else if (z2) {
                this.f25082Oooo0o.f49135OooOOOo.setText(userName);
                this.f25082Oooo0o.f49138OooOOoo.setText(R.string.room_broadcast_send_gift_all_in_room);
            } else if (zIsBlindGift) {
                this.f25082Oooo0o.f49135OooOOOo.setText("");
                this.f25082Oooo0o.f49140OooOo00.setText("");
                this.f25082Oooo0o.f49138OooOOoo.setText(OooOo.OooO00o(OooOo.OooO00o(OooOOO.OooO0OO(R.string.XXX1_presentedInARomanticGiftBox_XXX2), userName), userName2));
                TextView textView2 = this.f25082Oooo0o.f49138OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvTo");
                oo0o0O0.OooO0o0(textView2, new String[]{userName}, OooOOO.OooO00o(R.color.rec_color_FFF990));
                TextView textView3 = this.f25082Oooo0o.f49138OooOOoo;
                Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                oo0o0O0.OooO0o0(textView3, new String[]{userName2}, OooOOO.OooO00o(R.color.rec_color_FFF990));
            } else {
                this.f25082Oooo0o.f49135OooOOOo.setText(userName);
                this.f25082Oooo0o.f49138OooOOoo.setText(R.string.room_broadcast_sent);
                this.f25082Oooo0o.f49140OooOo00.setText(userName2);
            }
            if (roomBroadcastModel.getGift() != null && roomBroadcastModel.getNum() > 0) {
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                oooO00o.OooO00o(o00OOO.OooO00o.OooO0Oo());
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgFormat(roomBroadcastModel.getGift().getImage());
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f25082Oooo0o.f49122OooO0O0);
                this.f25082Oooo0o.f49130OooOO0O.setNumber(roomBroadcastModel.getNum());
            }
            if (z) {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.color_333333));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25087OoooO00);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25086OoooO0);
                this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_yellow);
            } else if (z3) {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                this.f25082Oooo0o.f49123OooO0OO.setVisibility(8);
                this.f25082Oooo0o.f49130OooOO0O.setVisibility(8);
            } else if (zIsBlindGift) {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_green);
            } else {
                this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_green);
            }
            OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Nullable
    public final Function0<Unit> getGoListener() {
        return this.goListener;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x0435  */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x03f1, please report this as an issue */
    public final void setData(@NotNull RoomBroadcastModel data) {
        String userHeader;
        Intrinsics.checkNotNullParameter(data, "data");
        this.f25096Ooooo0o = data;
        ImageView imageView = this.f25082Oooo0o.f49132OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView, "binding.topView");
        oOO00O.OooO00o(imageView);
        this.f25082Oooo0o.f49136OooOOo.setBackground(null);
        this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
        String str = "";
        this.f25082Oooo0o.f49136OooOOo.setText("");
        this.f25082Oooo0o.f49126OooO0o0.setImageDrawable(null);
        this.f25082Oooo0o.f49126OooO0o0.setVisibility(8);
        this.f25082Oooo0o.f49128OooO0oo.setBackground(null);
        this.f25082Oooo0o.f49139OooOo0.setVisibility(8);
        this.f25082Oooo0o.f49135OooOOOo.setText("");
        this.f25082Oooo0o.f49134OooOOOO.setText("");
        this.f25082Oooo0o.f49134OooOOOO.setTextColor(OooOOO.OooO00o(R.color.white));
        this.f25082Oooo0o.f49138OooOOoo.setText("");
        this.f25082Oooo0o.f49138OooOOoo.setTextColor(OooOOO.OooO00o(R.color.white));
        this.f25082Oooo0o.f49140OooOo00.setText("");
        this.f25082Oooo0o.f49137OooOOo0.setVisibility(8);
        SVGAView sVGAView = this.f25082Oooo0o.f49133OooOOO0;
        Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.svgaBg");
        oOO00O.OooO00o(sVGAView);
        this.f25082Oooo0o.f49137OooOOo0.setTextColor(OooOOO.OooO00o(R.color.color_ffffff));
        this.f25082Oooo0o.f49127OooO0oO.setImageDrawable(null);
        this.f25082Oooo0o.f49127OooO0oO.setVisibility(8);
        this.f25082Oooo0o.f49122OooO0O0.setImageDrawable(null);
        this.f25082Oooo0o.f49122OooO0O0.setVisibility(8);
        this.f25082Oooo0o.f49123OooO0OO.setVisibility(8);
        this.f25082Oooo0o.f49125OooO0o.setVisibility(8);
        this.f25082Oooo0o.f49130OooOO0O.setVisibility(8);
        if (data.getType() == 19) {
            return;
        }
        int type = data.getType();
        if (type == 21) {
            this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
            OooO0Oo(data, false);
        } else if (type == 22) {
            this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
            OooO0Oo(data, true);
        } else if (type != 91) {
            switch (type) {
                case 9:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(false);
                    o00O00.OooO0O0("贵族发送 广播/喇叭 data = " + data.toJSONString());
                    this.f25082Oooo0o.f49136OooOOo.setText("");
                    TextView textView = this.f25082Oooo0o.f49134OooOOOO;
                    p453o0Ooo.OooOO0 oooOO1 = p453o0Ooo.OooOO0.f40347OooO00o;
                    String message = data.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message, "data.message");
                    textView.setText(p453o0Ooo.OooOO0.OooO0Oo(message, OooOo00.OooO00o(16.0f)));
                    if (data.getFrom() != null) {
                        this.f25082Oooo0o.f49136OooOOo.setText(data.getFrom().getUserName());
                        this.f25082Oooo0o.f49126OooO0o0.OooO0Oo(true, data.getFrom().getPremiumLevel());
                    }
                    this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                    this.f25082Oooo0o.f49134OooOOOO.setTextColor(OooOOO.OooO00o(R.color.white));
                    this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                    this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                    this.f25082Oooo0o.f49129OooOO0.setBackgroundResource(this.f25092OoooOo0);
                    break;
                case 10:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    OooO0o0(data, false, false, false);
                    break;
                case 11:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(false);
                    MarqueeModel marqueeModel = new MarqueeModel();
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("");
                    sbOooO0o0.append(data.getMessage());
                    sbOooO0o0.append(' ');
                    marqueeModel.content = Html.fromHtml(sbOooO0o0.toString());
                    this.f25082Oooo0o.f49136OooOOo.setText(OooOOO.OooO0OO(R.string.Broadcast));
                    TextView textView2 = this.f25082Oooo0o.f49134OooOOOO;
                    p453o0Ooo.OooOO0 oooOO2 = p453o0Ooo.OooOO0.f40347OooO00o;
                    String message2 = data.getMessage();
                    Intrinsics.checkNotNullExpressionValue(message2, "data.message");
                    textView2.setText(p453o0Ooo.OooOO0.OooO0Oo(message2, OooOo00.OooO00o(16.0f)));
                    this.f25082Oooo0o.f49134OooOOOO.setTextColor(OooOOO.OooO00o(R.color.rec_color_FFF990));
                    this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                    this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                    this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                    break;
                case 12:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    OooO0o0(data, true, false, false);
                    break;
                case 13:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    o00O00.OooO0O0("开通贵族/续费贵族 data = " + data.toJSONString());
                    if (data.getRoomBroadcastOpenNobleDataModel() != null) {
                        this.f25082Oooo0o.f49136OooOOo.setText(data.getRoomBroadcastOpenNobleDataModel().getNickname());
                        int action = data.getRoomBroadcastOpenNobleDataModel().getAction();
                        if (action == 1) {
                            this.f25082Oooo0o.f49138OooOOoo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.noble_open_broadcast), UserPremiumView.f21052OoooO00.OooO0O0(data.getRoomBroadcastOpenNobleDataModel().getViplevel())));
                        } else if (action == 2) {
                            this.f25082Oooo0o.f49138OooOOoo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.noble_renewal_broadcast), UserPremiumView.f21052OoooO00.OooO0O0(data.getRoomBroadcastOpenNobleDataModel().getViplevel())));
                        }
                        this.f25082Oooo0o.f49127OooO0oO.OooO0Oo(true, data.getRoomBroadcastOpenNobleDataModel().getViplevel());
                        this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25087OoooO00);
                        this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.color_87000000));
                        this.f25082Oooo0o.f49138OooOOoo.setTextColor(OooOOO.OooO00o(R.color.color_FAE976));
                        this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25086OoooO0);
                    }
                    break;
                case 14:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    OooO0o0(data, true, true, false);
                    break;
                case 15:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    OooO0o0(data, false, true, false);
                    break;
                case 16:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    OooO0o0(data, false, false, true);
                    break;
                case 17:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    this.f25082Oooo0o.f49136OooOOo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.room_gift), data.getBaridx() + ""));
                    this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                    this.f25082Oooo0o.f49138OooOOoo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.room_broadcast_send_red_package), data.getFrom().getUserName()));
                    this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                    this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                    this.f25082Oooo0o.f49123OooO0OO.setVisibility(0);
                    this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_green);
                    this.f25082Oooo0o.f49125OooO0o.setVisibility(0);
                    this.f25082Oooo0o.f49125OooO0o.setImageResource(R.drawable.icon_room_bottom_game_box_lucky_golds);
                    OooO0OO();
                    break;
                case 18:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    this.f25082Oooo0o.f49135OooOOOo.setVisibility(0);
                    String str2 = data.username;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strOooO00o = OooOo.OooO00o(OooOOO.OooO0OO(R.string.won_golds_lucky_wheel), str2);
                    Intrinsics.checkNotNull(data);
                    this.f25082Oooo0o.f49138OooOOoo.setText(OooOo.OooO00o(strOooO00o, String.valueOf(data.wincoinnum)));
                    TextView textView3 = this.f25082Oooo0o.f49138OooOOoo;
                    Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTo");
                    Oooo0.OooO0O0(textView3, OooOOO.OooO00o(R.color.color_coin), String.valueOf(data.wincoinnum));
                    this.f25082Oooo0o.f49123OooO0OO.setVisibility(0);
                    this.f25082Oooo0o.f49125OooO0o.setImageResource(R.drawable.ic_broadcast_turntable_game);
                    this.f25082Oooo0o.f49125OooO0o.setVisibility(0);
                    this.f25082Oooo0o.f49137OooOOo0.setVisibility(0);
                    this.f25082Oooo0o.f49137OooOOo0.setText(String.valueOf(data.wincoinnum));
                    this.f25082Oooo0o.f49137OooOOo0.setTextColor(OooOOO.OooO00o(R.color.color_FFC339));
                    this.f25082Oooo0o.f49136OooOOo.setText(OooOo.OooO00o(OooOOO.OooO0OO(R.string.room_gift), data.getBaridx() + ""));
                    this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
                    this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
                    this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
                    this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.icon_broadcast_content_go_green);
                    OooO0OO();
                    break;
                default:
                    this.f25082Oooo0o.f49121OooO00o.setEnabled(true);
                    break;
            }
        } else {
            this.f25082Oooo0o.f49121OooO00o.setEnabled(false);
            o00O00.OooO0O0("贵族发送 广播/喇叭 data = " + data.toJSONString());
            this.f25082Oooo0o.f49136OooOOo.setText("");
            TextView textView4 = this.f25082Oooo0o.f49134OooOOOO;
            p453o0Ooo.OooOO0 oooOO3 = p453o0Ooo.OooOO0.f40347OooO00o;
            String message3 = data.getMessage();
            Intrinsics.checkNotNullExpressionValue(message3, "data.message");
            textView4.setText(p453o0Ooo.OooOO0.OooO0Oo(message3, OooOo00.OooO00o(16.0f)));
            if (data.getFrom() != null) {
                this.f25082Oooo0o.f49136OooOOo.setText(data.getFrom().getUserName());
                this.f25082Oooo0o.f49126OooO0o0.OooO0Oo(true, data.getFrom().getPremiumLevel());
            }
            this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
            this.f25082Oooo0o.f49134OooOOOO.setTextColor(OooOOO.OooO00o(R.color.white));
            this.f25082Oooo0o.f49131OooOO0o.setBackgroundResource(this.f25081Oooo);
            this.f25082Oooo0o.f49120OooO.setBackgroundResource(this.f25088OoooO0O);
            this.f25082Oooo0o.f49129OooOO0.setBackgroundResource(this.f25092OoooOo0);
        }
        RoomUserInfoModel from = data.getFrom();
        if (from != null && (userHeader = from.getUserHeader()) != null) {
            str = userHeader;
        }
        int type2 = data.getType();
        NetImageView netImageView = this.f25082Oooo0o.f49124OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(netImageView, "binding.ivHeaderImage");
        oOO00O.OooO00o(netImageView);
        if (getGiftTypeList().contains(Integer.valueOf(type2))) {
            if (str.length() > 0) {
                boolean zContains = getAllTotalGiftTypeList().contains(Integer.valueOf(type2));
                NetImageView netImageView2 = this.f25082Oooo0o.f49124OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(netImageView2, "binding.ivHeaderImage");
                oOO00O.OooO(netImageView2);
                oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(getContext());
                int color = Color.parseColor("#33000000");
                int iOooO00o = OooOo00.OooO00o(1);
                oooO00o.f48434OooO0oo = null;
                oooO00o.f48430OooO0Oo = false;
                oooO00o.f48441OooOOOo = R.drawable.ic_logo;
                oooO00o.f48444OooOOoo = 2;
                oooO00o.f48431OooO0o = R.drawable.ic_logo;
                oooO00o.f48435OooOO0 = null;
                oooO00o.f48438OooOOO = -1;
                oooO00o.f48440OooOOOO = -1;
                oooO00o.f48454OooOoo0 = 2;
                oooO00o.f48453OooOoo = 0;
                oooO00o.f48447OooOo00 = 0;
                oooO00o.f48446OooOo0 = true;
                oooO00o.f48448OooOo0O = false;
                oooO00o.f48449OooOo0o = 0;
                oooO00o.f48445OooOo = 0;
                oooO00o.f48451OooOoO0 = 0;
                oooO00o.f48450OooOoO = 0;
                oooO00o.f48452OooOoOO = 0;
                oooO00o.f48455OooOooO = iOooO00o;
                oooO00o.f48456OooOooo = color;
                oooO00o.f48458Oooo00O = true;
                oooO00o.f48439OooOOO0 = false;
                oooO00o.OooO0Oo(1, OooOOO.OooO00o(R.color.tr_00));
                oooO00o.f48429OooO0OO = CloudImageUtilKt.imgSize(str, OooOo00.OooO00o(29), true);
                oooO00o.f48427OooO00o = 0;
                oooO00o.OooO0o(this.f25082Oooo0o.f49124OooO0Oo);
                RoomBroadcastModel roomBroadcastModel = this.f25096Ooooo0o;
                this.f25082Oooo0o.f49124OooO0Oo.setBackgroundResource(p522o0o0O0o.oOO00O.OooO0OO(roomBroadcastModel != null ? Boolean.valueOf(roomBroadcastModel.isBlindGift()) : null) ? this.f25091OoooOOo : zContains ? this.f25097o000oOoO : this.f25090OoooOOO);
            }
        }
        int showeffectflag = data.getShoweffectflag();
        int type3 = data.getType();
        if (!getGiftTypeList().contains(Integer.valueOf(type3))) {
            ImageView imageView2 = this.f25082Oooo0o.f49132OooOOO;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding.topView");
            oOO00O.OooO(imageView2);
            return;
        }
        ImageView imageView3 = this.f25082Oooo0o.f49132OooOOO;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding.topView");
        oOO00O.OooO00o(imageView3);
        boolean zContains2 = getAllTotalGiftTypeList().contains(Integer.valueOf(type3));
        boolean z = showeffectflag == 1;
        if (z) {
            SVGAView sVGAView2 = this.f25082Oooo0o.f49133OooOOO0;
            Intrinsics.checkNotNullExpressionValue(sVGAView2, "binding.svgaBg");
            oOO00O.OooO00o(sVGAView2);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            new p405o0Oo0OO0.OooOo00(context).OooO0oO(zContains2 ? this.f25083Oooo0oO : this.f25084Oooo0oo, new o0OO0O0(null, this, z));
        }
        this.f25082Oooo0o.f49131OooOO0o.setBackground(null);
        this.f25082Oooo0o.f49136OooOOo.setTextColor(OooOOO.OooO00o(R.color.white));
        ImageView imageView4 = this.f25082Oooo0o.f49123OooO0OO;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding.ivGo");
        oOO00O.OooO(imageView4);
        this.f25082Oooo0o.f49123OooO0OO.setImageResource(R.drawable.ic_broadcast_iv_go);
        RoomBroadcastModel roomBroadcastModel2 = this.f25096Ooooo0o;
        if (p522o0o0O0o.oOO00O.OooO0OO(roomBroadcastModel2 != null ? Boolean.valueOf(roomBroadcastModel2.isBlindGift()) : null)) {
            ImageView imageView5 = this.f25082Oooo0o.f49120OooO;
            Intrinsics.checkNotNullExpressionValue(imageView5, "binding.layoutContent30");
            oOO00O.OooO00o(imageView5);
            ImageView imageView6 = this.f25082Oooo0o.f49129OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView6, "binding.layoutContent40");
            oOO00O.OooO(imageView6);
            this.f25082Oooo0o.f49129OooOO0.setBackgroundResource(this.f25092OoooOo0);
        } else {
            ImageView imageView7 = this.f25082Oooo0o.f49120OooO;
            Intrinsics.checkNotNullExpressionValue(imageView7, "binding.layoutContent30");
            oOO00O.OooO(imageView7);
            ImageView imageView8 = this.f25082Oooo0o.f49129OooOO0;
            Intrinsics.checkNotNullExpressionValue(imageView8, "binding.layoutContent40");
            oOO00O.OooO00o(imageView8);
            this.f25082Oooo0o.f49120OooO.setBackgroundResource(zContains2 ? this.f25085OoooO : this.f25089OoooOO0);
        }
        OooO0OO();
    }

    public final void setGoListener(@Nullable Function0<Unit> function0) {
        this.goListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastStaticView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastStaticView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        cj cjVarInflate = cj.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(cjVarInflate, "inflate(LayoutInflater.from(context), this, true)");
        this.f25082Oooo0o = cjVarInflate;
        this.f25083Oooo0oO = "svga/room_broadcast_bg_yellow.svga";
        this.f25084Oooo0oo = "svga/room_broadcast_bg_green.svga";
        this.f25081Oooo = R.drawable.icon_broadcast_title_bg_green;
        this.f25087OoooO00 = R.drawable.icon_broadcast_title_bg_yellow;
        this.f25086OoooO0 = R.drawable.icon_broadcast_noble_bg_yellow;
        this.f25088OoooO0O = R.drawable.icon_broadcast_content_bg_green;
        this.f25085OoooO = R.drawable.ic_broadcast_bg_yellow;
        this.f25089OoooOO0 = R.drawable.ic_broadcast_bg_green;
        this.f25097o000oOoO = R.drawable.bg_round_bg_064535_stroke_fffa80_r360;
        this.f25090OoooOOO = R.drawable.bg_round_bg_573a0c_stroke_fffa80_r360;
        this.f25091OoooOOo = R.drawable.ic_broadcast_gift_blind_head_bg;
        this.f25092OoooOo0 = R.drawable.ic_broadcast_gift_blind_bg;
        OooO0OO oooO0OO = new OooO0OO();
        this.giftTypeList = LazyKt.lazy(OooO0O0.f25099Oooo0o);
        this.allTotalGiftTypeList = LazyKt.lazy(OooO00o.f25098Oooo0o);
        cjVarInflate.f49121OooO00o.setOnClickListener(oooO0OO);
    }
}
