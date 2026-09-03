package com.yalla.yalla.ui.view.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.impl.o00oOoo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o000;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o0OoOo0;
import com.facebook.share.internal.ShareConstants;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.BarInfoModel;
import com.yalla.yalla.model.MarqueeModel;
import com.yalla.yalla.model.RoomBroadcastModel;
import com.yalla.yalla.model.RoomBroadcastOpenNobleDataModel;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.ui.view.UserPremiumView;
import com.yalla.yalla.ui.view.gift.GiftNumberView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o0OO0O0O.OooOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p187o00o00o0.OooO;
import p370o0OOo0Oo.Oooo000;
import p371o0OOo0o.OooOOO;
import p371o0OOo0o.OooOOO0;
import p407o0Oo0OOO.k3;
import p425o0OoO0OO.o00O0O0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p574o0oOoO0o.o00O00o0;
import p574o0oOoO0o.o00O0O00;
import p597o0oo00O.OooOOOO;
import p645o0ooOOO0.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R*\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/view/room/RoomBroadcastViewAll;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/yalla/yalla/model/RoomBroadcastModel;", "data", "", "setData", "Lkotlin/Function0;", "OooOOo0", "Lkotlin/jvm/functions/Function0;", "getGoListener", "()Lkotlin/jvm/functions/Function0;", "setGoListener", "(Lkotlin/jvm/functions/Function0;)V", "goListener", "", "", "OooOOo", "Lkotlin/Lazy;", "getGiftTypeList", "()Ljava/util/List;", "giftTypeList", "OooOOoo", "getAllTotalGiftTypeList", "allTotalGiftTypeList", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
public final class RoomBroadcastViewAll extends ConstraintLayout {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f30755OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final k3 f30756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final String f30757OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final String f30758OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f30759OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f30760OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f30761OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f30762OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f30763OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f30764OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f30765OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f30766OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f30767OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy giftTypeList;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> goListener;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy allTotalGiftTypeList;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public RoomBroadcastModel f30771OooOo00;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            Function0<Unit> goListener = RoomBroadcastViewAll.this.getGoListener();
            if (goListener != null) {
                goListener.invoke();
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
            Function0<Unit> goListener = RoomBroadcastViewAll.this.getGoListener();
            if (goListener != null) {
                goListener.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<List<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f30774OooO0Oo = new OooO0OO();

        public OooO0OO() {
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

    public static final class OooO0o extends Lambda implements Function0<List<Integer>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f30775OooO0Oo = new OooO0o();

        public OooO0o() {
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewAll(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void OooO0O0(RoomBroadcastViewAll roomBroadcastViewAll, OooOO0 oooOO1, boolean z) {
        roomBroadcastViewAll.getClass();
        oooOO1.OooO0OO("profile1", true);
        oooOO1.OooO0OO("profile2", true);
        oooOO1.OooO0OO(ShareConstants.WEB_DIALOG_PARAM_TITLE, true);
        oooOO1.OooO0OO("gift", true);
        oooOO1.OooO0OO("x", true);
        oooOO1.OooO0OO("number", true);
        oooOO1.OooO0OO("button", true);
        oooOO1.OooO0OO("img_350", true);
        oooOO1.OooO0OO("img_361", true);
        oooOO1.OooO0OO("img_283", true);
        oooOO1.OooO0OO("img_277", true);
        oooOO1.OooO0OO("img_354", true);
        oooOO1.OooO0OO("img_355", true);
        oooOO1.OooO0OO("img_354", true);
        oooOO1.OooO0OO("img_355", true);
        boolean z2 = !z;
        oooOO1.OooO0OO("lvse_00000", z2);
        oooOO1.OooO0OO("lvse_00001", z2);
        oooOO1.OooO0OO("lvse_00002", z2);
        oooOO1.OooO0OO("lvse_00003", z2);
        oooOO1.OooO0OO("lvse_00004", z2);
        oooOO1.OooO0OO("lvse_00005", z2);
        oooOO1.OooO0OO("lvse_00006", z2);
        oooOO1.OooO0OO("lvse_00007", z2);
        oooOO1.OooO0OO("lvse_00008", z2);
        oooOO1.OooO0OO("lvse_00009", z2);
        oooOO1.OooO0OO("lvse_00010", z2);
        oooOO1.OooO0OO("lvse_00011", z2);
        oooOO1.OooO0OO("lvse_00012", z2);
        oooOO1.OooO0OO("lvse_00013", z2);
        oooOO1.OooO0OO("lvse_00014", z2);
        oooOO1.OooO0OO("lvse_00015", z2);
        oooOO1.OooO0OO("lvse_00016", z2);
        oooOO1.OooO0OO("lvse_00017", z2);
        oooOO1.OooO0OO("lvse_00018", z2);
        oooOO1.OooO0OO("lvse_00019", z2);
        oooOO1.OooO0OO("jinse_00000", z2);
        oooOO1.OooO0OO("jinse_00001", z2);
        oooOO1.OooO0OO("jinse_00002", z2);
        oooOO1.OooO0OO("jinse_00003", z2);
        oooOO1.OooO0OO("jinse_00004", z2);
        oooOO1.OooO0OO("jinse_00005", z2);
        oooOO1.OooO0OO("jinse_00006", z2);
        oooOO1.OooO0OO("jinse_00007", z2);
        oooOO1.OooO0OO("jinse_00008", z2);
        oooOO1.OooO0OO("jinse_00009", z2);
        oooOO1.OooO0OO("jinse_00010", z2);
        oooOO1.OooO0OO("jinse_00011", z2);
        oooOO1.OooO0OO("jinse_00012", z2);
        oooOO1.OooO0OO("jinse_00013", z2);
        oooOO1.OooO0OO("jinse_00014", z2);
        oooOO1.OooO0OO("jinse_00015", z2);
        oooOO1.OooO0OO("jinse_00016", z2);
        oooOO1.OooO0OO("jinse_00017", z2);
        oooOO1.OooO0OO("jinse_00018", z2);
        oooOO1.OooO0OO("jinse_00019", z2);
    }

    private final List<Integer> getAllTotalGiftTypeList() {
        return (List) this.allTotalGiftTypeList.getValue();
    }

    private final List<Integer> getGiftTypeList() {
        return (List) this.giftTypeList.getValue();
    }

    public final void OooO0OO() {
        RoomBroadcastModel roomBroadcastModel = this.f30771OooOo00;
        if (roomBroadcastModel != null) {
            long barid = roomBroadcastModel.getBarid();
            Long value = com.yalla.yalla.service.room.OooO0O0.f24541OoooOOO.OooO00o().f24547OooO0Oo.getValue();
            k3 k3Var = this.f30756OooO0Oo;
            if (value != null && barid == value.longValue()) {
                ImageView ivGo = k3Var.f44003OooO0OO;
                Intrinsics.checkNotNullExpressionValue(ivGo, "ivGo");
                o000O.OooO0O0(ivGo);
            } else {
                ImageView ivGo2 = k3Var.f44003OooO0OO;
                Intrinsics.checkNotNullExpressionValue(ivGo2, "ivGo");
                o000O.OooOOOO(ivGo2);
            }
        }
    }

    public final void OooO0Oo(RoomBroadcastModel roomBroadcastModel, boolean z) {
        k3 k3Var = this.f30756OooO0Oo;
        try {
            NetImageView netImageView = k3Var.f44002OooO0O0;
            TextView textView = k3Var.f44016OooOOo;
            ImageView imageView = k3Var.f44003OooO0OO;
            netImageView.setVisibility(0);
            imageView.setVisibility(0);
            String strOooO0OO = o0000.OooO0OO(o000OOo.room_gift);
            long baridx = roomBroadcastModel.getBaridx();
            StringBuilder sb = new StringBuilder();
            sb.append(baridx);
            textView.setText(o0000O.OooO00o(strOooO0OO, sb.toString()));
            RoomUserInfoDTO from = roomBroadcastModel.getFrom();
            String strOooOOO = o0OoOo0.OooOOO(from != null ? from.getUserName() : null, "");
            k3Var.f44005OooO0o.setVisibility(8);
            k3Var.f44015OooOOOo.setText(strOooOOO);
            k3Var.f44018OooOOoo.setText(o000OOo.room_broadcast_send_gift_all_in_mic);
            if (roomBroadcastModel.getGift() != null && roomBroadcastModel.getNum() > 0) {
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
                oooO00o.OooO00o(o0O0O0Oo.OooO0O0());
                BarInfoModel.giftClass gift = roomBroadcastModel.getGift();
                oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(gift != null ? gift.getImage() : null);
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(k3Var.f44002OooO0O0);
                k3Var.f44010OooOO0O.setNumber(roomBroadcastModel.getNum());
            }
            ImageView imageView2 = k3Var.f44000OooO;
            LinearLayout linearLayout = k3Var.f44011OooOO0o;
            if (z) {
                textView.setTextColor(o0000.OooO00o(o0ooOOo.color_333333));
                linearLayout.setBackgroundResource(this.f30760OooO0oo);
                imageView2.setBackgroundResource(this.f30755OooO);
                imageView.setImageResource(o0OOO0o.icon_broadcast_content_go_yellow);
            } else {
                textView.setTextColor(o0000.OooO00o(o0ooOOo.white));
                linearLayout.setBackgroundResource(this.f30759OooO0oO);
                imageView2.setBackgroundResource(this.f30761OooOO0);
                imageView.setImageResource(o0OOO0o.icon_broadcast_content_go_green);
            }
            OooO0OO();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0123 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000b, B:5:0x0016, B:8:0x0046, B:11:0x004d, B:13:0x0053, B:16:0x005a, B:19:0x0064, B:21:0x006a, B:28:0x0089, B:30:0x008f, B:64:0x01ab, B:67:0x01b3, B:69:0x01b9, B:71:0x01cf, B:73:0x01d5, B:76:0x01ef, B:84:0x0251, B:80:0x020e, B:82:0x0228, B:83:0x023d, B:34:0x00f7, B:38:0x0105, B:40:0x0111, B:49:0x0123, B:62:0x017e, B:50:0x013a, B:52:0x0140, B:60:0x0151, B:61:0x0168, B:63:0x01a0, B:22:0x006e, B:24:0x0078, B:25:0x007d, B:27:0x0084), top: B:89:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013a A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000b, B:5:0x0016, B:8:0x0046, B:11:0x004d, B:13:0x0053, B:16:0x005a, B:19:0x0064, B:21:0x006a, B:28:0x0089, B:30:0x008f, B:64:0x01ab, B:67:0x01b3, B:69:0x01b9, B:71:0x01cf, B:73:0x01d5, B:76:0x01ef, B:84:0x0251, B:80:0x020e, B:82:0x0228, B:83:0x023d, B:34:0x00f7, B:38:0x0105, B:40:0x0111, B:49:0x0123, B:62:0x017e, B:50:0x013a, B:52:0x0140, B:60:0x0151, B:61:0x0168, B:63:0x01a0, B:22:0x006e, B:24:0x0078, B:25:0x007d, B:27:0x0084), top: B:89:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0140 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000b, B:5:0x0016, B:8:0x0046, B:11:0x004d, B:13:0x0053, B:16:0x005a, B:19:0x0064, B:21:0x006a, B:28:0x0089, B:30:0x008f, B:64:0x01ab, B:67:0x01b3, B:69:0x01b9, B:71:0x01cf, B:73:0x01d5, B:76:0x01ef, B:84:0x0251, B:80:0x020e, B:82:0x0228, B:83:0x023d, B:34:0x00f7, B:38:0x0105, B:40:0x0111, B:49:0x0123, B:62:0x017e, B:50:0x013a, B:52:0x0140, B:60:0x0151, B:61:0x0168, B:63:0x01a0, B:22:0x006e, B:24:0x0078, B:25:0x007d, B:27:0x0084), top: B:89:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:58:0x014e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000b, B:5:0x0016, B:8:0x0046, B:11:0x004d, B:13:0x0053, B:16:0x005a, B:19:0x0064, B:21:0x006a, B:28:0x0089, B:30:0x008f, B:64:0x01ab, B:67:0x01b3, B:69:0x01b9, B:71:0x01cf, B:73:0x01d5, B:76:0x01ef, B:84:0x0251, B:80:0x020e, B:82:0x0228, B:83:0x023d, B:34:0x00f7, B:38:0x0105, B:40:0x0111, B:49:0x0123, B:62:0x017e, B:50:0x013a, B:52:0x0140, B:60:0x0151, B:61:0x0168, B:63:0x01a0, B:22:0x006e, B:24:0x0078, B:25:0x007d, B:27:0x0084), top: B:89:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0168 A[Catch: Exception -> 0x0255, TryCatch #0 {Exception -> 0x0255, blocks: (B:3:0x000b, B:5:0x0016, B:8:0x0046, B:11:0x004d, B:13:0x0053, B:16:0x005a, B:19:0x0064, B:21:0x006a, B:28:0x0089, B:30:0x008f, B:64:0x01ab, B:67:0x01b3, B:69:0x01b9, B:71:0x01cf, B:73:0x01d5, B:76:0x01ef, B:84:0x0251, B:80:0x020e, B:82:0x0228, B:83:0x023d, B:34:0x00f7, B:38:0x0105, B:40:0x0111, B:49:0x0123, B:62:0x017e, B:50:0x013a, B:52:0x0140, B:60:0x0151, B:61:0x0168, B:63:0x01a0, B:22:0x006e, B:24:0x0078, B:25:0x007d, B:27:0x0084), top: B:89:0x000b }] */
    public final void OooO0o0(RoomBroadcastModel roomBroadcastModel, boolean z, boolean z2, boolean z3) {
        String userName;
        String userName2;
        boolean z4;
        boolean z5;
        String strOooO00o;
        boolean z6;
        k3 k3Var = this.f30756OooO0Oo;
        try {
            NetImageView netImageView = k3Var.f44002OooO0O0;
            TextView textView = k3Var.f44017OooOOo0;
            TextView tvWow = k3Var.f44019OooOo0;
            TextView textView2 = k3Var.f44016OooOOo;
            ImageView imageView = k3Var.f44003OooO0OO;
            netImageView.setVisibility(0);
            imageView.setVisibility(0);
            String strOooO0OO = o0000.OooO0OO(o000OOo.room_gift);
            long baridx = roomBroadcastModel.getBaridx();
            StringBuilder sb = new StringBuilder();
            sb.append(baridx);
            textView2.setText(o0000O.OooO00o(strOooO0OO, sb.toString()));
            RoomUserInfoDTO from = roomBroadcastModel.getFrom();
            if (from == null || (userName = from.getUserName()) == null) {
                userName = "";
            }
            RoomUserInfoDTO to = roomBroadcastModel.getTo();
            if (to == null || (userName2 = to.getUserName()) == null) {
                userName2 = "";
            }
            int moraflag = roomBroadcastModel.getMoraflag();
            ImageView imageView2 = k3Var.f44005OooO0o;
            if (moraflag == 0 && roomBroadcastModel.getEnvelopflag() == 0) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                if (roomBroadcastModel.getMoraflag() == 1) {
                    imageView2.setImageResource(o0OOO0o.icon_room_bottom_game_box_mora);
                }
                if (roomBroadcastModel.getEnvelopflag() == 1) {
                    imageView2.setImageResource(o0OOO0o.icon_room_bottom_game_box_lucky_golds);
                }
            }
            boolean zOooO00o = o00O00o0.OooO00o(roomBroadcastModel);
            if (z3) {
                tvWow.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.lucky_gift_broadcast), userName));
                Intrinsics.checkNotNullExpressionValue(tvWow, "tvWow");
                o000O.OooOOOO(tvWow);
                String strOooO00o2 = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.lucky_gift_broadcast_get_xxx_times_reward_a_total_of_xxx_gold_coins), "<font color='#FFC339' size='13sp'><b>" + roomBroadcastModel.getLuckymultiple() + "</b></font> "), "<font color='#FFC339' size='13sp'><b>" + roomBroadcastModel.getLuckymoney() + "</b></font> ");
                textView.setVisibility(0);
                textView.setText(Html.fromHtml(strOooO00o2));
            } else {
                TextView textView3 = k3Var.f44015OooOOOo;
                TextView tvTo = k3Var.f44018OooOOoo;
                if (z2) {
                    textView3.setText(userName);
                    tvTo.setText(o000OOo.room_broadcast_send_gift_all_in_room);
                } else {
                    TextView textView4 = k3Var.f44020OooOo00;
                    if (zOooO00o) {
                        textView3.setText("");
                        textView4.setText("");
                        if (o00O00o0.OooO00o(roomBroadcastModel)) {
                            z4 = true;
                            if (roomBroadcastModel.getBlindBoxLevel() == 1) {
                                z5 = true;
                            }
                            if (z5) {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_Junior_broadcast_XXX1_XXX2), userName), userName2);
                            } else {
                                if (o00O00o0.OooO00o(roomBroadcastModel)) {
                                    if (roomBroadcastModel.getBlindBoxLevel() == 10) {
                                        z6 = z4;
                                    } else {
                                        z6 = false;
                                    }
                                    if (z6) {
                                        z4 = false;
                                    }
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_Premium_broadcast_XXX1_XXX2), userName), userName2);
                                } else {
                                    strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.XXX1_presentedInARomanticGiftBox_XXX2), userName), userName2);
                                }
                            }
                            tvTo.setText(strOooO00o);
                            Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                            int i = o0ooOOo.rec_color_FFF990;
                            o00O0O0.OooO0Oo(tvTo, o0000.OooO00o(i), userName);
                            Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                            o00O0O0.OooO0Oo(tvTo, o0000.OooO00o(i), userName2);
                        } else {
                            z4 = true;
                        }
                        z5 = false;
                        if (z5) {
                            strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_Junior_broadcast_XXX1_XXX2), userName), userName2);
                        } else {
                            if (o00O00o0.OooO00o(roomBroadcastModel)) {
                                z4 = false;
                            } else {
                                if (roomBroadcastModel.getBlindBoxLevel() == 10) {
                                    z6 = z4;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    z4 = false;
                                }
                            }
                            if (z4) {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.blind_gift_Premium_broadcast_XXX1_XXX2), userName), userName2);
                            } else {
                                strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(o000OOo.XXX1_presentedInARomanticGiftBox_XXX2), userName), userName2);
                            }
                        }
                        tvTo.setText(strOooO00o);
                        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                        int i2 = o0ooOOo.rec_color_FFF990;
                        o00O0O0.OooO0Oo(tvTo, o0000.OooO00o(i2), userName);
                        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                        o00O0O0.OooO0Oo(tvTo, o0000.OooO00o(i2), userName2);
                    } else {
                        textView3.setText(userName);
                        tvTo.setText(o000OOo.room_broadcast_sent);
                        textView4.setText(userName2);
                    }
                }
            }
            BarInfoModel.giftClass gift = roomBroadcastModel.getGift();
            GiftNumberView giftNumberView = k3Var.f44010OooOO0O;
            if (gift != null && roomBroadcastModel.getNum() > 0) {
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
                oooO00o.OooO00o(o0O0O0Oo.OooO0O0());
                BarInfoModel.giftClass gift2 = roomBroadcastModel.getGift();
                oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0Oo(gift2 != null ? gift2.getImage() : null);
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(k3Var.f44002OooO0O0);
                giftNumberView.setNumber(roomBroadcastModel.getNum());
            }
            ImageView imageView3 = k3Var.f44000OooO;
            LinearLayout linearLayout = k3Var.f44011OooOO0o;
            if (z) {
                textView2.setTextColor(o0000.OooO00o(o0ooOOo.color_333333));
                linearLayout.setBackgroundResource(this.f30760OooO0oo);
                imageView3.setBackgroundResource(this.f30755OooO);
                imageView.setImageResource(o0OOO0o.icon_broadcast_content_go_yellow);
            } else {
                int i3 = this.f30761OooOO0;
                int i4 = this.f30759OooO0oO;
                if (z3) {
                    textView2.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    linearLayout.setBackgroundResource(i4);
                    imageView3.setBackgroundResource(i3);
                    imageView.setVisibility(8);
                    giftNumberView.setVisibility(8);
                } else if (zOooO00o) {
                    textView2.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    linearLayout.setBackgroundResource(i4);
                    imageView3.setBackgroundResource(i3);
                    imageView.setImageResource(o0OOO0o.icon_broadcast_content_go_green);
                } else {
                    textView2.setTextColor(o0000.OooO00o(o0ooOOo.white));
                    linearLayout.setBackgroundResource(i4);
                    imageView3.setBackgroundResource(i3);
                    imageView.setImageResource(o0OOO0o.icon_broadcast_content_go_green);
                }
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

    /* JADX WARN: Code duplicated, block: B:45:0x031c  */
    /* JADX WARN: Code duplicated, block: B:47:0x034c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0432  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(@NotNull RoomBroadcastModel data) {
        int i;
        ImageView layoutContent40;
        String str;
        String userHeader;
        boolean z;
        Drawable drawable;
        int i2;
        RoomUserInfoDTO from;
        Intrinsics.checkNotNullParameter(data, "data");
        this.f30771OooOo00 = data;
        k3 k3Var = this.f30756OooO0Oo;
        ImageView topView = k3Var.f44012OooOOO;
        Intrinsics.checkNotNullExpressionValue(topView, "topView");
        o000O.OooO0O0(topView);
        TextView textView = k3Var.f44016OooOOo;
        textView.setBackground(null);
        int i3 = o0ooOOo.white;
        textView.setTextColor(o0000.OooO00o(i3));
        textView.setText("");
        UserPremiumView userPremiumView = k3Var.f44006OooO0o0;
        userPremiumView.setImageDrawable(null);
        userPremiumView.setVisibility(8);
        k3Var.f44008OooO0oo.setBackground(null);
        k3Var.f44019OooOo0.setVisibility(8);
        TextView textView2 = k3Var.f44015OooOOOo;
        textView2.setText("");
        TextView textView3 = k3Var.f44014OooOOOO;
        textView3.setText("");
        textView3.setTextColor(o0000.OooO00o(i3));
        TextView tvTo = k3Var.f44018OooOOoo;
        tvTo.setText("");
        tvTo.setTextColor(o0000.OooO00o(i3));
        k3Var.f44020OooOo00.setText("");
        TextView textView4 = k3Var.f44017OooOOo0;
        textView4.setVisibility(8);
        SVGAView svgaBg = k3Var.f44013OooOOO0;
        Intrinsics.checkNotNullExpressionValue(svgaBg, "svgaBg");
        o000O.OooO0O0(svgaBg);
        textView4.setTextColor(o0000.OooO00o(o0ooOOo.color_ffffff));
        UserPremiumView userPremiumView2 = k3Var.f44007OooO0oO;
        userPremiumView2.setImageDrawable(null);
        userPremiumView2.setVisibility(8);
        NetImageView netImageView = k3Var.f44002OooO0O0;
        netImageView.setImageDrawable(null);
        netImageView.setVisibility(8);
        ImageView ivGo = k3Var.f44003OooO0OO;
        ivGo.setVisibility(8);
        ImageView imageView = k3Var.f44005OooO0o;
        imageView.setVisibility(8);
        k3Var.f44010OooOO0O.setVisibility(8);
        if (data.getType() == 19) {
            return;
        }
        int type = data.getType();
        int i4 = this.f30767OooOOOo;
        ImageView imageView2 = k3Var.f44009OooOO0;
        ImageView layoutContent30 = k3Var.f44000OooO;
        LinearLayout linearLayout = k3Var.f44011OooOO0o;
        ConstraintLayout constraintLayout = k3Var.f44001OooO00o;
        if (type == 21) {
            i = i4;
            layoutContent40 = imageView2;
            str = "";
            constraintLayout.setEnabled(true);
            OooO0Oo(data, false);
        } else if (type != 22) {
            int i5 = this.f30761OooOO0;
            int i6 = this.f30759OooO0oO;
            if (type != 91) {
                switch (type) {
                    case 9:
                        constraintLayout.setEnabled(false);
                        OooOOOO.OooO0O0("贵族发送 广播/喇叭 data = ".concat(OooO.OooO00o(data)));
                        str = "";
                        textView.setText(str);
                        MutableLiveData<List<OooOOO0>> mutableLiveData = OooOOO.f43159OooO00o;
                        textView3.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(16.0f), data.getMessage()));
                        from = data.getFrom();
                        if (from != null) {
                            textView.setText(from.getUserName());
                            userPremiumView.OooO0Oo(from.getPremiumLevel(), true);
                        }
                        textView.setTextColor(o0000.OooO00o(i3));
                        linearLayout.setBackgroundResource(i6);
                        layoutContent30.setBackgroundResource(i5);
                        i = i4;
                        layoutContent40 = imageView2;
                        layoutContent40.setBackgroundResource(i);
                        break;
                    case 10:
                        constraintLayout.setEnabled(true);
                        OooO0o0(data, false, false, false);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 11:
                        constraintLayout.setEnabled(false);
                        new MarqueeModel().content = Html.fromHtml(data.getMessage() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
                        textView.setText(o0000.OooO0OO(o000OOo.Broadcast));
                        MutableLiveData<List<OooOOO0>> mutableLiveData2 = OooOOO.f43159OooO00o;
                        textView3.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(16.0f), data.getMessage()));
                        textView.setTextColor(o0000.OooO00o(i3));
                        linearLayout.setBackgroundResource(i6);
                        layoutContent30.setBackgroundResource(i5);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 12:
                        constraintLayout.setEnabled(true);
                        OooO0o0(data, true, false, false);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 13:
                        constraintLayout.setEnabled(true);
                        OooOOOO.OooO0O0("开通贵族/续费贵族 data = ".concat(OooO.OooO00o(data)));
                        RoomBroadcastOpenNobleDataModel roomBroadcastOpenNobleDataModel = data.getRoomBroadcastOpenNobleDataModel();
                        if (roomBroadcastOpenNobleDataModel != null) {
                            textView.setText(roomBroadcastOpenNobleDataModel.getNickname());
                            int action = roomBroadcastOpenNobleDataModel.getAction();
                            if (action == 1) {
                                String strOooO0OO = o0000.OooO0OO(o000OOo.noble_open_broadcast);
                                int i7 = UserPremiumView.f30267OooO0o0;
                                tvTo.setText(o0000O.OooO00o(strOooO0OO, UserPremiumView.OooO00o.OooO0O0(roomBroadcastOpenNobleDataModel.getViplevel())));
                            } else if (action == 2) {
                                String strOooO0OO2 = o0000.OooO0OO(o000OOo.noble_renewal_broadcast);
                                int i8 = UserPremiumView.f30267OooO0o0;
                                tvTo.setText(o0000O.OooO00o(strOooO0OO2, UserPremiumView.OooO00o.OooO0O0(roomBroadcastOpenNobleDataModel.getViplevel())));
                            }
                            userPremiumView2.OooO0Oo(roomBroadcastOpenNobleDataModel.getViplevel(), true);
                            linearLayout.setBackgroundResource(this.f30760OooO0oo);
                            textView.setTextColor(o0000.OooO00o(o0ooOOo.color_87000000));
                            tvTo.setTextColor(o0000.OooO00o(o0ooOOo.color_FAE976));
                            layoutContent30.setBackgroundResource(this.f30755OooO);
                        }
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 14:
                        constraintLayout.setEnabled(true);
                        OooO0o0(data, true, true, false);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 15:
                        constraintLayout.setEnabled(true);
                        OooO0o0(data, false, true, false);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 16:
                        constraintLayout.setEnabled(true);
                        OooO0o0(data, false, false, true);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 17:
                        constraintLayout.setEnabled(true);
                        textView.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_gift), o00oOoo.OooO00o(data.getBaridx())));
                        textView.setTextColor(o0000.OooO00o(i3));
                        String strOooO0OO3 = o0000.OooO0OO(o000OOo.room_broadcast_send_red_package);
                        String[] strArr = new String[1];
                        RoomUserInfoDTO from2 = data.getFrom();
                        strArr[0] = o0OoOo0.OooOOO(from2 != null ? from2.getUserName() : null, "");
                        tvTo.setText(o0000O.OooO00o(strOooO0OO3, strArr));
                        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                        int iOooO00o = o0000.OooO00o(o0ooOOo.rec_color_FFF990);
                        String[] strArr2 = new String[1];
                        RoomUserInfoDTO from3 = data.getFrom();
                        strArr2[0] = o0OoOo0.OooOOO(from3 != null ? from3.getUserName() : null, "");
                        o00O0O0.OooO0Oo(tvTo, iOooO00o, strArr2);
                        linearLayout.setBackgroundResource(i6);
                        layoutContent30.setBackgroundResource(i5);
                        ivGo.setVisibility(0);
                        ivGo.setImageResource(o0OOO0o.icon_broadcast_content_go_green);
                        imageView.setVisibility(0);
                        imageView.setImageResource(o0OOO0o.icon_room_bottom_game_box_lucky_golds);
                        OooO0OO();
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    case 18:
                        constraintLayout.setEnabled(true);
                        textView2.setVisibility(0);
                        String strOooO00o = o0000O.OooO00o(o0000.OooO0OO(o000OOo.won_golds_lucky_wheel), data.getUsername() != null ? data.getUsername() : "");
                        Intrinsics.checkNotNull(data);
                        tvTo.setText(o0000O.OooO00o(strOooO00o, String.valueOf(data.getWincoinnum())));
                        Intrinsics.checkNotNullExpressionValue(tvTo, "tvTo");
                        o000.OooO0O0(tvTo, o0000.OooO00o(o0ooOOo.color_coin), String.valueOf(data.getWincoinnum()));
                        ivGo.setVisibility(0);
                        imageView.setImageResource(o0OOO0o.ic_broadcast_turntable_game);
                        imageView.setVisibility(0);
                        textView4.setVisibility(0);
                        textView4.setText(String.valueOf(data.getWincoinnum()));
                        textView4.setTextColor(o0000.OooO00o(o0ooOOo.color_FFC339));
                        textView.setText(o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_gift), o00oOoo.OooO00o(data.getBaridx())));
                        textView.setTextColor(o0000.OooO00o(i3));
                        linearLayout.setBackgroundResource(i6);
                        layoutContent30.setBackgroundResource(i5);
                        ivGo.setImageResource(o0OOO0o.icon_broadcast_content_go_green);
                        OooO0OO();
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                    default:
                        constraintLayout.setEnabled(true);
                        i = i4;
                        layoutContent40 = imageView2;
                        str = "";
                        break;
                }
            } else {
                constraintLayout.setEnabled(false);
                OooOOOO.OooO0O0("贵族发送 广播/喇叭 data = ".concat(OooO.OooO00o(data)));
                str = "";
                textView.setText(str);
                MutableLiveData<List<OooOOO0>> mutableLiveData3 = OooOOO.f43159OooO00o;
                textView3.setText(OooOOO.OooO0Oo(o0000O0.OooO00o(16.0f), data.getMessage()));
                from = data.getFrom();
                if (from != null) {
                    textView.setText(from.getUserName());
                    userPremiumView.OooO0Oo(from.getPremiumLevel(), true);
                }
                textView.setTextColor(o0000.OooO00o(i3));
                linearLayout.setBackgroundResource(i6);
                layoutContent30.setBackgroundResource(i5);
                i = i4;
                layoutContent40 = imageView2;
                layoutContent40.setBackgroundResource(i);
            }
        } else {
            i = i4;
            layoutContent40 = imageView2;
            str = "";
            constraintLayout.setEnabled(true);
            OooO0Oo(data, true);
        }
        RoomUserInfoDTO from4 = data.getFrom();
        if (from4 == null || (userHeader = from4.getUserHeader()) == null) {
            userHeader = str;
        }
        int type2 = data.getType();
        NetImageView ivHeaderImage = k3Var.f44004OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivHeaderImage, "ivHeaderImage");
        o000O.OooO0O0(ivHeaderImage);
        if (getGiftTypeList().contains(Integer.valueOf(type2))) {
            if (userHeader.length() > 0) {
                boolean zContains = getAllTotalGiftTypeList().contains(Integer.valueOf(type2));
                Intrinsics.checkNotNullExpressionValue(ivHeaderImage, "ivHeaderImage");
                o000O.OooOOOO(ivHeaderImage);
                Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(getContext());
                oooO00o.OooO00o(o0O0O0Oo.OooO00o());
                int iOooO00o2 = o0000.OooO00o(o0ooOOo.tr_00);
                oooO00o.f43153OooOooO = o0000O0.OooO00o(1);
                oooO00o.f43154OooOooo = iOooO00o2;
                oooO00o.f43156Oooo00O = true;
                int i9 = o0OOO0o.ic_logo;
                oooO00o.f43129OooO0o = i9;
                oooO00o.f43139OooOOOo = i9;
                oooO00o.f43127OooO0OO = p405o0Oo0OO.OooO0OO.OooO00o(userHeader);
                z = false;
                oooO00o.f43125OooO00o = 0;
                oooO00o.OooO0Oo(ivHeaderImage);
                RoomBroadcastModel roomBroadcastModel = this.f30771OooOo00;
                if (o0OoOo0.OooO00o(roomBroadcastModel != null ? Boolean.valueOf(o00O00o0.OooO00o(roomBroadcastModel)) : null)) {
                    i2 = this.f30766OooOOOO;
                } else {
                    i2 = zContains ? this.f30765OooOOO0 : this.f30764OooOOO;
                }
                ivHeaderImage.setBackgroundResource(i2);
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        int showeffectflag = data.getShoweffectflag();
        int type3 = data.getType();
        boolean zContains2 = getGiftTypeList().contains(Integer.valueOf(type3));
        ImageView topView2 = k3Var.f44012OooOOO;
        if (!zContains2) {
            Intrinsics.checkNotNullExpressionValue(topView2, "topView");
            o000O.OooOOOO(topView2);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(topView2, "topView");
        o000O.OooO0O0(topView2);
        boolean zContains3 = getAllTotalGiftTypeList().contains(Integer.valueOf(type3));
        if (showeffectflag == 1) {
            z = true;
        }
        if (z) {
            Intrinsics.checkNotNullExpressionValue(svgaBg, "svgaBg");
            o000O.OooO0O0(svgaBg);
            drawable = null;
            new com.opensource.svgaplayer.OooO0OO(getContext()).OooO00o(zContains3 ? this.f30758OooO0o0 : this.f30757OooO0o, new o00O0O00(null, this, z));
        } else {
            drawable = null;
        }
        linearLayout.setBackground(drawable);
        textView.setTextColor(o0000.OooO00o(i3));
        Intrinsics.checkNotNullExpressionValue(ivGo, "ivGo");
        o000O.OooOOOO(ivGo);
        ivGo.setImageResource(o0OOO0o.ic_broadcast_iv_go);
        RoomBroadcastModel roomBroadcastModel2 = this.f30771OooOo00;
        Boolean boolValueOf = drawable;
        if (roomBroadcastModel2 != null) {
            boolValueOf = Boolean.valueOf(o00O00o0.OooO00o(roomBroadcastModel2));
        }
        if (o0OoOo0.OooO00o(boolValueOf)) {
            Intrinsics.checkNotNullExpressionValue(layoutContent30, "layoutContent30");
            o000O.OooO0O0(layoutContent30);
            Intrinsics.checkNotNullExpressionValue(layoutContent40, "layoutContent40");
            o000O.OooOOOO(layoutContent40);
            layoutContent40.setBackgroundResource(i);
        } else {
            Intrinsics.checkNotNullExpressionValue(layoutContent30, "layoutContent30");
            o000O.OooOOOO(layoutContent30);
            Intrinsics.checkNotNullExpressionValue(layoutContent40, "layoutContent40");
            o000O.OooO0O0(layoutContent40);
            layoutContent30.setBackgroundResource(zContains3 ? this.f30762OooOO0O : this.f30763OooOO0o);
        }
        OooO0OO();
    }

    public final void setGoListener(@Nullable Function0<Unit> function0) {
        this.goListener = function0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewAll(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ RoomBroadcastViewAll(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public RoomBroadcastViewAll(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        k3 k3VarInflate = k3.inflate(LayoutInflater.from(context), this, true);
        Intrinsics.checkNotNullExpressionValue(k3VarInflate, "inflate(...)");
        this.f30756OooO0Oo = k3VarInflate;
        this.f30758OooO0o0 = "svga/room_broadcast_bg_yellow.svga";
        this.f30757OooO0o = "svga/room_broadcast_bg_green.svga";
        this.f30759OooO0oO = o0OOO0o.icon_broadcast_title_bg_green;
        this.f30760OooO0oo = o0OOO0o.icon_broadcast_title_bg_yellow;
        this.f30755OooO = o0OOO0o.icon_broadcast_noble_bg_yellow;
        this.f30761OooOO0 = o0OOO0o.icon_broadcast_content_bg_green;
        this.f30762OooOO0O = o0OOO0o.ic_broadcast_bg_yellow;
        this.f30763OooOO0o = o0OOO0o.ic_broadcast_bg_green;
        this.f30765OooOOO0 = o0OOO0o.bg_round_bg_064535_stroke_fffa80_r360;
        this.f30764OooOOO = o0OOO0o.bg_round_bg_573a0c_stroke_fffa80_r360;
        this.f30766OooOOOO = o0OOO0o.ic_broadcast_gift_blind_head_bg;
        this.f30767OooOOOo = o0OOO0o.ic_broadcast_gift_blind_bg;
        this.giftTypeList = LazyKt.lazy(OooO0o.f30775OooO0Oo);
        this.allTotalGiftTypeList = LazyKt.lazy(OooO0OO.f30774OooO0Oo);
        ConstraintLayout constraintLayout = k3VarInflate.f44001OooO00o;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        o000O.OooO(constraintLayout, new OooO00o());
        ImageView ivGo = k3VarInflate.f44003OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivGo, "ivGo");
        o000O.OooO(ivGo, new OooO0O0());
    }
}
