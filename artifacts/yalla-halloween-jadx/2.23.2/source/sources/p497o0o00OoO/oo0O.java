package p497o0o00OoO;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OooOo00;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.session.o00O0O0;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.VipState;
import com.yalla.yalla.model.room.RoomUserInfoDTO;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.dialog.LifeCycleDialog;
import com.yalla.yalla.ui.view.UserInfoPremiumLayout;
import com.yalla.yalla.ui.view.UserMedalView;
import com.yalla.yalla.ui.view.UserNameView;
import com.yalla.yalla.ui.view.UserRankView;
import com.yalla.yalla.ui.view.room.RoomUserVipView;
import com.yalla.yalla.ui.view.room.RoomUserWealthView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p368o0OOo0Oo.Oooo000;
import p405o0Oo0OOO.c1;
import p405o0Oo0OOO.v;
import p412o0Oo0o0O.o000O000;
import p475o0Ooooo0.o0O00oO0;
import p495o0o00Oo.OooOO0O;
import p541o0o0OoOO.oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOOO00Oo;
import p642o0ooOOO0.d1;
import p650o0ooo.g2;
import p650o0ooo.i2;
import p650o0ooo.o00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomUserInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserInfoManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomUserInfoManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,437:1\n1#2:438\n288#3,2:439\n*S KotlinDebug\n*F\n+ 1 RoomUserInfoManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomUserInfoManager\n*L\n300#1:439,2\n*E\n"})
public final class oo0O extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f49901OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f49902OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public FriendCheckModel f49903OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f49904OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<g2> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final g2 invoke() {
            return new g2(oo0O.this.f49901OooO0O0);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f49906OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f49906OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f49906OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f49906OooO0Oo;
        }

        public final int hashCode() {
            return this.f49906OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f49906OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f49907OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null && num2.intValue() == 1) {
                String strOooO0OO = o0000.OooO0OO(o000000.send_successfully);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (num2 != null && num2.intValue() == 2) {
                String strOooO0OO2 = o0000.OooO0OO(o000000.Added_successfully);
                if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                    o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            } else if (num2 != null && num2.intValue() == 3) {
                String strOooO0OO3 = o0000.OooO0OO(o000000.Friends_Already);
                if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                    o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ oo0O f49908OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f49909OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, oo0O oo0o) {
            super(1);
            this.f49908OooO0Oo = oo0o;
            this.f49909OooO0o0 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f49908OooO0Oo.OooO0o(this.f49909OooO0o0, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo0O(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f49901OooO0O0 = roomActivity;
        this.f49902OooO0OO = LazyKt.lazy(new OooO00o());
        this.f49903OooO0Oo = new FriendCheckModel();
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        oooO00o.OooO00o().f24578OoooO0.observe(roomActivity, new OooO0O0(new o00O0OO(this)));
        MutableLiveData<Long> mutableLiveData = oooO00o.OooO00o().f24580OoooO0O;
        OooO0O0 oooO0O0 = new OooO0O0(new o00O0OOO(this));
        MixedRoomActivity mixedRoomActivity = this.f49626OooO00o;
        mutableLiveData.observe(mixedRoomActivity, oooO0O0);
        oooO00o.OooO00o().f24577OoooO.observe(mixedRoomActivity, new OooO0O0(new oo0oOO0(this)));
        oooO00o.OooO00o().f24581OoooOO0.observe(mixedRoomActivity, new OooO0O0(new o00O(this)));
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION", RoomUserInfoModel.class).observe(mixedRoomActivity, new o00O0O0(this, 0));
    }

    /* JADX WARN: Code duplicated, block: B:162:0x079e  */
    /* JADX WARN: Code duplicated, block: B:164:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:165:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0315  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(oo0O oo0o, g2 g2Var, RoomUserInfoModel userModel) {
        int i;
        v vVar;
        oo0o.f49904OooO0o0 = userModel;
        g2Var.f58224OooOOO = new o0O00o0(oo0o, userModel);
        g2Var.f58226OooOOOO = new oo00oO(oo0o, userModel);
        g2Var.f58227OooOOOo = new o0oOOo(oo0o, userModel);
        g2Var.f58229OooOOo0 = new o0O0o(oo0o, userModel);
        g2Var.f58228OooOOo = new o0(oo0o, userModel);
        g2Var.f58230OooOOoo = new o0O00000(oo0o);
        g2Var.f58233OooOo00 = new o0O0000O(oo0o, userModel);
        g2Var.f58232OooOo0 = new o0O000(oo0o, userModel);
        g2Var.f58234OooOo0O = new o0O000O(oo0o, userModel);
        g2Var.f58235OooOo0o = new o00OOO00(oo0o, userModel);
        g2Var.f58231OooOo = new o00OOO0(oo0o, userModel);
        g2Var.f58237OooOoO0 = new o00OOO0O(oo0o, userModel);
        g2Var.f58236OooOoO = new o0o0Oo(oo0o, userModel);
        g2Var.f58238OooOoOO = new o00OOOO0(oo0o, userModel);
        g2Var.f58240OooOoo0 = new o00OOOOo(oo0o, userModel);
        g2Var.f58239OooOoo = new o00Oo00(oo0o, userModel);
        g2Var.f58241OooOooO = new o0oOO(oo0o, userModel);
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        v vVar2 = g2Var.f58223OooOO0o;
        vVar2.f45606OooOoO0.setYalla(userModel.getRole().getValue().intValue());
        g2Var.f58242OooOooo = userModel.getUserId().getValue().longValue();
        Context context = g2Var.f58507OooO0Oo;
        Oooo000.OooO00o oooO00o = new Oooo000.OooO00o(context);
        oooO00o.f43126OooO0OO = p403o0Oo0OO.OooO0OO.OooO00o(userModel.getUserHeader().getValue());
        oooO00o.f43124OooO00o = 0;
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43143OooOo0 = true;
        oooO00o.OooO0O0(2, o0000.OooO00o(o0OOO0o.white));
        oooO00o.f43138OooOOOo = o0Oo0oo.icon_head_default;
        oooO00o.f43129OooO0o0 = true;
        oooO00o.OooO0Oo(vVar2.f45590OooOO0);
        oOOO00Oo oooo00oo = g2Var.f58225OooOOO0;
        LifeCycleDialog lifeCycleDialog = g2Var.f58509OooO0o0;
        if (oooo00oo == null) {
            g2Var.f58225OooOOO0 = new oOOO00Oo(lifeCycleDialog, vVar2.f45591OooOO0O);
        }
        oOOO00Oo oooo00oo2 = g2Var.f58225OooOOO0;
        if (oooo00oo2 != null) {
            oooo00oo2.OooO00o(userModel.getUserHeaderFrame().getValue());
        }
        vVar2.f45589OooO0oo.setVisibility(userModel.isOfficialRole() ? 0 : 8);
        long jLongValue = userModel.getUserId().getValue().longValue();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        vVar2.f45594OooOOO0.setVisibility((l != null && jLongValue == l.longValue()) ? 4 : 0);
        vVar2.f45599OooOOoo.setSex(userModel.getSex().getValue().intValue());
        boolean z = userModel.getShowVIP().getValue().booleanValue() && userModel.getVipState().getValue().intValue() == VipState.Vip.getValue() && userModel.getVipLevel().getValue().intValue() >= VipLevel.Vip4.getValue();
        UserNameView userNameView = vVar2.f45604OooOo0o;
        userNameView.setFlash(z);
        String strOooO0O0 = o000O000.OooO0O0(userModel.getUserId().getValue().longValue(), "");
        boolean zIsBlank = StringsKt.isBlank(strOooO0O0);
        TextView textView = vVar2.f45600OooOo;
        if (zIsBlank) {
            textView.setVisibility(8);
            userNameView.setText(userModel.getUserName().getValue());
        } else {
            textView.setVisibility(0);
            textView.setText(o0000.OooO0OO(o000000.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) userModel.getUserName().getValue()));
            userNameView.setText(strOooO0O0);
        }
        int iIntValue = userModel.getRoomMemberType().getValue().intValue();
        vVar2.f45584OooO0OO.setIdentityInfo(iIntValue);
        vVar2.f45587OooO0o0.f45544OooO0O0.OooO0OO(iIntValue, true, true);
        vVar2.f45598OooOOo0.setUserPrettyId(userModel.getIdLevel().getValue().intValue());
        vVar2.f45603OooOo0O.setText(o00O0O0.OooO0O0("ID:", userModel.getUserIdx().getValue()));
        vVar2.f45601OooOo0.setText("LV." + userModel.getUserLevel().getValue() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(userModel.getUserId().getValue());
        if (roomUserInfoModelOooO0o0 != null) {
            vVar2.f45595OooOOOO.OooO00o(roomUserInfoModelOooO0o0.getMemberLevel().getValue(), roomUserInfoModelOooO0o0.getBadgeUrl().getValue(), roomUserInfoModelOooO0o0.isTopRank().getValue().booleanValue(), 9.0f);
        }
        UserRankView rankLayout = vVar2.f45597OooOOo;
        rankLayout.setBgHeight(18);
        rankLayout.OooO00o(userModel.getRankWeek().getValue().intValue(), userModel.getRankDay().getValue().intValue());
        Intrinsics.checkNotNullExpressionValue(rankLayout, "rankLayout");
        o000O.OooO(rankLayout, new i2(userModel));
        if (userModel.getRankWeek().getValue().intValue() > 0 || userModel.getRankDay().getValue().intValue() > 0 || (userModel.getMemberLevel().getValue().intValue() > 0 && (!StringsKt.isBlank(userModel.getBadgeUrl().getValue())))) {
            String value = userModel.getMedal().getValue();
            if (value == null || StringsKt.isBlank(value)) {
                i = 8;
            } else {
                i = 0;
            }
        } else {
            i = 8;
        }
        vVar2.f45607OooOoOO.setVisibility(i);
        String value2 = userModel.getMedal().getValue();
        boolean z2 = value2 == null || StringsKt.isBlank(value2);
        UserMedalView userMedalView = vVar2.f45593OooOOO;
        if (z2) {
            userMedalView.setVisibility(8);
        } else {
            userMedalView.OooO00o(userModel.getMedal().getValue(), lifeCycleDialog);
            userMedalView.setVisibility(0);
        }
        int iIntValue2 = userModel.getVipState().getValue().intValue();
        int iIntValue3 = userModel.getVipLevel().getValue().intValue();
        int iOooO0O0 = com.code.android.util.o000000.OooO0O0(userModel.getShowVIP().getValue());
        RoomUserVipView roomUserVipView = vVar2.f45592OooOO0o;
        MixedRoomActivity mixedRoomActivity = g2Var.f58222OooOO0O;
        roomUserVipView.OooO0O0(iIntValue2, iIntValue3, iOooO0O0, mixedRoomActivity);
        int iOooO0O1 = com.code.android.util.o000000.OooO0O0(userModel.isPremium().getValue());
        int iIntValue4 = userModel.getPremiumLevel().getValue().intValue();
        UserInfoPremiumLayout userInfoPremiumLayout = vVar2.f45608OooOoo;
        userInfoPremiumLayout.getClass();
        userInfoPremiumLayout.setVisibility(iOooO0O1 == 1 ? 0 : 8);
        c1 c1Var = userInfoPremiumLayout.f30240OooO0Oo;
        c1Var.f43754OooO0O0.OooO0OO(iOooO0O1, iIntValue4);
        int value3 = PremiumLevel.Premium1.getValue();
        TextView textView2 = c1Var.f43756OooO0Oo;
        LinearLayoutCompat linearLayoutCompat = c1Var.f43755OooO0OO;
        if (iIntValue4 == value3) {
            linearLayoutCompat.setBackgroundResource(o0Oo0oo.room_user_info_dialog_aristocrat_1);
            textView2.setText(o0000.OooO0OO(o000000.Patrician));
        } else if (iIntValue4 == PremiumLevel.Premium2.getValue()) {
            linearLayoutCompat.setBackgroundResource(o0Oo0oo.room_user_info_dialog_aristocrat_2);
            textView2.setText(o0000.OooO0OO(o000000.Knight));
        } else if (iIntValue4 == PremiumLevel.Premium3.getValue()) {
            linearLayoutCompat.setBackgroundResource(o0Oo0oo.room_user_info_dialog_aristocrat_3);
            textView2.setText(o0000.OooO0OO(o000000.Baron));
        } else if (iIntValue4 == PremiumLevel.Premium4.getValue()) {
            linearLayoutCompat.setBackgroundResource(o0Oo0oo.room_user_info_dialog_aristocrat_4);
            textView2.setText(o0000.OooO0OO(o000000.Count));
        } else if (iIntValue4 == PremiumLevel.Premium5.getValue()) {
            linearLayoutCompat.setBackgroundResource(o0Oo0oo.room_user_info_dialog_aristocrat_5);
            textView2.setText(o0000.OooO0OO(o000000.Marquis));
        } else {
            userInfoPremiumLayout.setVisibility(8);
        }
        boolean zOooO0o0 = p595o0oo00O.OooOo00.OooO0o0();
        NetImageView netImageView = vVar2.f45588OooO0oO;
        if (zOooO0o0) {
            netImageView.setScaleX(-1.0f);
        }
        boolean zIsBlank2 = StringsKt.isBlank(userModel.getVehicleUrl().getValue());
        View view = vVar2.f45609OooOoo0;
        if (zIsBlank2 || userModel.getVehicleId().getValue().intValue() == 0) {
            netImageView.setVisibility(8);
            view.setVisibility(8);
        } else {
            netImageView.setVisibility(0);
            view.setVisibility(0);
            Oooo000.OooO00o oooO00o2 = new Oooo000.OooO00o(context);
            oooO00o2.f43126OooO0OO = userModel.getVehicleUrl().getValue();
            oooO00o2.f43124OooO00o = 0;
            oooO00o2.f43138OooOOOo = o0Oo0oo.icon_vehicel_placeholder;
            oooO00o2.OooO0Oo(netImageView);
        }
        LinearLayoutCompat linearLayoutCompat2 = vVar2.f45585OooO0Oo.f45489OooO0o;
        long jLongValue2 = userModel.getUserId().getValue().longValue();
        Long l2 = (Long) o0O00oO0.OooOOo0().getValue();
        linearLayoutCompat2.setVisibility((l2 == null || jLongValue2 != l2.longValue()) ? 0 : 8);
        int iIntValue5 = userModel.getWealthLevel().getValue().intValue();
        RoomUserWealthView wealthView = vVar2.f45610OooOooO;
        if (iIntValue5 > 1) {
            Intrinsics.checkNotNullExpressionValue(wealthView, "wealthView");
            o000O.OooOOOO(wealthView);
            wealthView.OooO0O0(mixedRoomActivity, userModel.getWealthLevel().getValue().intValue(), userModel.getWealthProfileCardImg().getValue(), userModel.getWealthBadge().getValue());
        } else {
            Intrinsics.checkNotNullExpressionValue(wealthView, "wealthView");
            o000O.OooO0O0(wealthView);
        }
        userModel.parseDataByDefaultJsonString();
        RoomUserInfoDTO.ProfileCardInfo value4 = userModel.getProfileCardInfoEntity().getValue();
        if (value4 != null) {
            String backgroundEffectsUrl = value4.getBackgroundEffectsUrl();
            SVGAView sVGAView = vVar2.f45596OooOOOo;
            sVGAView.OooOO0O(backgroundEffectsUrl, mixedRoomActivity);
            sVGAView.OooOO0o();
            Oooo000.OooO00o oooO00o3 = new Oooo000.OooO00o(context);
            oooO00o3.f43126OooO0OO = value4.getAvatarBorder();
            oooO00o3.f43124OooO00o = 0;
            Oooo000.OooO00o oooO00o4 = new Oooo000.OooO00o();
            int i2 = o0Oo0oo.bg_defult_tr00;
            oooO00o4.f43138OooOOOo = i2;
            oooO00o4.f43128OooO0o = i2;
            String str = oooO00o4.f43131OooO0oo;
            boolean z3 = oooO00o4.f43127OooO0Oo;
            int i3 = oooO00o4.f43138OooOOOo;
            int i4 = oooO00o4.f43141OooOOoo;
            int i5 = oooO00o4.f43128OooO0o;
            ImageView imageView = oooO00o4.f43132OooOO0;
            boolean z4 = oooO00o4.f43136OooOOO0;
            boolean z5 = oooO00o4.f43129OooO0o0;
            int i6 = oooO00o4.f43135OooOOO;
            int i7 = oooO00o4.f43137OooOOOO;
            int i8 = oooO00o4.f43151OooOoo0;
            int i9 = oooO00o4.f43150OooOoo;
            int i10 = oooO00o4.f43144OooOo00;
            boolean z6 = oooO00o4.f43143OooOo0;
            int i11 = oooO00o4.f43146OooOo0o;
            int i12 = oooO00o4.f43142OooOo;
            int i13 = oooO00o4.f43148OooOoO0;
            int i14 = oooO00o4.f43147OooOoO;
            int i15 = oooO00o4.f43149OooOoOO;
            int i16 = oooO00o4.f43152OooOooO;
            int i17 = oooO00o4.f43153OooOooo;
            boolean z7 = oooO00o4.f43145OooOo0O;
            boolean z8 = oooO00o4.f43155Oooo00O;
            oooO00o3.f43131OooO0oo = str;
            oooO00o3.f43127OooO0Oo = z3;
            oooO00o3.f43138OooOOOo = i3;
            oooO00o3.f43141OooOOoo = i4;
            oooO00o3.f43128OooO0o = i5;
            oooO00o3.f43132OooOO0 = imageView;
            oooO00o3.f43135OooOOO = i6;
            oooO00o3.f43137OooOOOO = i7;
            oooO00o3.f43151OooOoo0 = i8;
            oooO00o3.f43150OooOoo = i9;
            oooO00o3.f43144OooOo00 = i10;
            oooO00o3.f43143OooOo0 = z6;
            oooO00o3.f43145OooOo0O = z7;
            oooO00o3.f43146OooOo0o = i11;
            oooO00o3.f43142OooOo = i12;
            oooO00o3.f43148OooOoO0 = i13;
            oooO00o3.f43147OooOoO = i14;
            oooO00o3.f43149OooOoOO = i15;
            oooO00o3.f43152OooOooO = i16;
            oooO00o3.f43153OooOooo = i17;
            oooO00o3.f43155Oooo00O = z8;
            oooO00o3.f43136OooOOO0 = z4;
            oooO00o3.f43129OooO0o0 = z5;
            oooO00o3.f43143OooOo0 = true;
            oooO00o3.f43129OooO0o0 = true;
            oooO00o3.OooO0Oo(vVar2.f45602OooOo00);
            Oooo000.OooO00o oooO00o5 = new Oooo000.OooO00o(context);
            oooO00o5.f43126OooO0OO = value4.getBackgroundUrl();
            oooO00o5.f43124OooO00o = 0;
            Oooo000.OooO00o oooO00o6 = new Oooo000.OooO00o();
            oooO00o6.f43138OooOOOo = i2;
            oooO00o6.f43128OooO0o = i2;
            String str2 = oooO00o6.f43131OooO0oo;
            boolean z9 = oooO00o6.f43127OooO0Oo;
            int i18 = oooO00o6.f43138OooOOOo;
            int i19 = oooO00o6.f43141OooOOoo;
            int i20 = oooO00o6.f43128OooO0o;
            ImageView imageView2 = oooO00o6.f43132OooOO0;
            boolean z10 = oooO00o6.f43136OooOOO0;
            boolean z11 = oooO00o6.f43129OooO0o0;
            int i21 = oooO00o6.f43135OooOOO;
            int i22 = oooO00o6.f43137OooOOOO;
            int i23 = oooO00o6.f43151OooOoo0;
            int i24 = oooO00o6.f43150OooOoo;
            int i25 = oooO00o6.f43144OooOo00;
            boolean z12 = oooO00o6.f43143OooOo0;
            int i26 = oooO00o6.f43146OooOo0o;
            int i27 = oooO00o6.f43142OooOo;
            int i28 = oooO00o6.f43148OooOoO0;
            int i29 = oooO00o6.f43147OooOoO;
            int i30 = oooO00o6.f43149OooOoOO;
            int i31 = oooO00o6.f43152OooOooO;
            int i32 = oooO00o6.f43153OooOooo;
            boolean z13 = oooO00o6.f43145OooOo0O;
            boolean z14 = oooO00o6.f43155Oooo00O;
            oooO00o5.f43131OooO0oo = str2;
            oooO00o5.f43127OooO0Oo = z9;
            oooO00o5.f43138OooOOOo = i18;
            oooO00o5.f43141OooOOoo = i19;
            oooO00o5.f43128OooO0o = i20;
            oooO00o5.f43132OooOO0 = imageView2;
            oooO00o5.f43135OooOOO = i21;
            oooO00o5.f43137OooOOOO = i22;
            oooO00o5.f43151OooOoo0 = i23;
            oooO00o5.f43150OooOoo = i24;
            oooO00o5.f43144OooOo00 = i25;
            oooO00o5.f43143OooOo0 = z12;
            oooO00o5.f43145OooOo0O = z13;
            oooO00o5.f43146OooOo0o = i26;
            oooO00o5.f43142OooOo = i27;
            oooO00o5.f43148OooOoO0 = i28;
            oooO00o5.f43147OooOoO = i29;
            oooO00o5.f43149OooOoOO = i30;
            oooO00o5.f43152OooOooO = i31;
            oooO00o5.f43153OooOooo = i32;
            oooO00o5.f43155Oooo00O = z14;
            oooO00o5.f43136OooOOO0 = z10;
            oooO00o5.f43129OooO0o0 = z11;
            oooO00o5.f43129OooO0o0 = true;
            vVar = vVar2;
            NetImageView netImageView2 = vVar.f45583OooO0O0;
            oooO00o5.OooO0Oo(netImageView2);
            netImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            vVar = vVar2;
        }
        Pair<Boolean, Boolean> pairOooO0Oo = OooO0Oo(userModel.getUserId().getValue().longValue());
        g2Var.OooOOO0(pairOooO0Oo);
        long jLongValue3 = userModel.getUserId().getValue().longValue();
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            Long l3 = (Long) o0O00oO0.OooOOo0().getValue();
            boolean z15 = l3 != null && l3.longValue() == jLongValue3;
            if (z15) {
                oo0o.OooO0o0().OooOO0o(z15, false);
            } else {
                MixedRoomActivity mixedRoomActivity2 = oo0o.f49626OooO00o;
                mixedRoomActivity2.f22972Oooo.checkIsFriend(jLongValue3).observe(mixedRoomActivity2, new OooO0O0(new oo0o0O0(oo0o, z15)));
            }
        }
        if (MixedRoomDataSource.OooO0o0().f22992OooO0o0 != null) {
            long j = (Long) o0O00oO0.OooOOo0().getValue();
            if (j == null) {
                j = 0L;
            }
            RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(j);
            MutableStateFlow<Integer> role = roomUserInfoModelOooO0o1 != null ? roomUserInfoModelOooO0o1.getRole() : null;
            long jLongValue4 = userModel.getUserId().getValue().longValue();
            Long l4 = (Long) o0O00oO0.OooOOo0().getValue();
            if (l4 != null && jLongValue4 == l4.longValue()) {
                g2.OooOO0O(oo0o.OooO0o0(), false, false, false, 15);
            } else {
                boolean z16 = role != null && role.getValue().intValue() == 1;
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o7 = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
                if (!z16) {
                    if (role != null && role.getValue().intValue() == 4) {
                        if (oooO00o7.OooO00o().OooOOO()) {
                            oo0o.OooO0o0().OooOO0(true, true, true, true);
                        } else {
                            g2.OooOO0O(oo0o.OooO0o0(), false, true, true, 3);
                        }
                    } else if (oooO00o7.OooO00o().OooOOO()) {
                        oo0o.OooO0o0().OooOO0(true, true, true, true);
                    } else if (oooO00o7.OooO00o().OooOO0o()) {
                        if (userModel.getRoomMemberType().getValue().intValue() == 1 || userModel.getRoomMemberType().getValue().intValue() == 2) {
                            g2.OooOO0O(oo0o.OooO0o0(), false, false, false, 15);
                        } else {
                            g2.OooOO0O(oo0o.OooO0o0(), true, true, true, 1);
                        }
                    }
                } else if (oooO00o7.OooO00o().OooOOO()) {
                    oo0o.OooO0o0().OooOO0(true, true, true, true);
                } else {
                    g2.OooOO0O(oo0o.OooO0o0(), false, true, true, 3);
                }
            }
        }
        vVar.f45587OooO0o0.f45545OooO0OO.setImageResource(pairOooO0Oo.getFirst().booleanValue() ? o0Oo0oo.room_dialog_user_info_set_up_mic_down : o0Oo0oo.room_dialog_user_info_set_up_mic_up);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Pair OooO0Oo(long j) {
        Object next;
        boolean zBooleanValue;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Long l = (Long) o0O00oO0.OooOOo0().getValue();
        boolean z = false;
        if (l != null && j == l.longValue()) {
            zBooleanValue = false;
        } else {
            Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48585OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo00) next).f55307OooO0OO.getValue().longValue() == j));
            oo00 oo00Var = (oo00) next;
            if (oo00Var != null) {
                zBooleanValue = oo00Var.f55308OooO0Oo.getValue().booleanValue();
                z = true;
            } else {
                zBooleanValue = false;
            }
        }
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(zBooleanValue));
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO00o() {
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(null);
    }

    @Override // p495o0o00Oo.OooOO0O
    public final void OooO0O0() {
        com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24578OoooO0.postValue(null);
    }

    public final void OooO0o(long j, String str) {
        MixedRoomActivity mixedRoomActivity = this.f49626OooO00o;
        mixedRoomActivity.f22972Oooo.addFriend(j, str).observe(mixedRoomActivity, new OooO0O0(OooO0OO.f49907OooO0Oo));
    }

    public final g2 OooO0o0() {
        return (g2) this.f49902OooO0OO.getValue();
    }

    public final void OooO0oO(long j) {
        String strOooO0OO = o0000.OooO0OO(o000000.UserInfo_Dialog_Friend_Request);
        String strOooO0OO2 = o0000.OooO0OO(o000000.import_verifymessage);
        String strOooO0OO3 = o0000.OooO0OO(o000000.iam);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o00O.OooO00o(this.f49626OooO00o, strOooO0OO, strOooO0OO2, strOooO0OO3 + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0O00oO0.OooOOoo().getValue(), new OooO0o(j, this));
    }
}
