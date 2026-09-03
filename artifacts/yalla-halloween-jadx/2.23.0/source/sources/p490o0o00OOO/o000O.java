package p490o0o00OOO;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.uikit.svga.SVGAView;
import com.code.android.util.o0000;
import com.code.android.util.o000000;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000OO00;
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
import p101o000oo.Oooo000;
import p362o0OOo0O.OooOO0;
import p396o0Oo0O.OooOOO;
import p406o0Oo0Ooo.oOO0O0O;
import p464o0Oooo.o000000O;
import p489o0o00OO0.OooO;
import p519o0o0O0oO.g2;
import p519o0o0O0oO.i2;
import p519o0o0O0oO.o0O00o00;
import p533o0o0Oo0.oo0O;
import p579o0oOoo.oO00O0oO;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.h8;
import p641o0ooOOOO.n9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomUserInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomUserInfoManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomUserInfoManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,435:1\n1#2:436\n288#3,2:437\n*S KotlinDebug\n*F\n+ 1 RoomUserInfoManager.kt\ncom/yalla/yalla/ui/activity/room/live/bottom/RoomUserInfoManager\n*L\n298#1:437,2\n*E\n"})
public final class o000O extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final MixedRoomActivity f48593OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f48594OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public FriendCheckModel f48595OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public RoomUserInfoModel f48596OooO0o0;

    public static final class OooO00o extends Lambda implements Function0<g2> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final g2 invoke() {
            return new g2(o000O.this.f48593OooO0O0);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f48598OooO0Oo;

        public OooO0O0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f48598OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f48598OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f48598OooO0Oo;
        }

        public final int hashCode() {
            return this.f48598OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f48598OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f48599OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null && num2.intValue() == 1) {
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.send_successfully);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            } else if (num2 != null && num2.intValue() == 2) {
                String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Added_successfully);
                if (!(strOooO0OO2 == null || StringsKt.isBlank(strOooO0OO2))) {
                    o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(strOooO0OO2, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o2.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                    }
                }
            } else if (num2 != null && num2.intValue() == 3) {
                String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.Friends_Already);
                if (!(strOooO0OO3 == null || StringsKt.isBlank(strOooO0OO3))) {
                    o000Oo0 o000oo0OooO00o3 = o000O00.OooO00o(strOooO0OO3, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o3.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o3);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O f48600OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f48601OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, o000O o000o) {
            super(1);
            this.f48600OooO0Oo = o000o;
            this.f48601OooO0o0 = j;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String it = str;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f48600OooO0Oo.OooO0o(this.f48601OooO0o0, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(@NotNull MixedRoomActivity roomActivity) {
        super(roomActivity);
        Intrinsics.checkNotNullParameter(roomActivity, "roomActivity");
        this.f48593OooO0O0 = roomActivity;
        this.f48594OooO0OO = LazyKt.lazy(new OooO00o());
        this.f48595OooO0Oo = new FriendCheckModel();
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        oooO00o.OooO00o().f25040OoooO0.observe(roomActivity, new OooO0O0(new o000O000(this)));
        MutableLiveData<Long> mutableLiveData = oooO00o.OooO00o().f25042OoooO0O;
        OooO0O0 oooO0O0 = new OooO0O0(new o000O0o(this));
        MixedRoomActivity mixedRoomActivity = this.f48470OooO00o;
        mutableLiveData.observe(mixedRoomActivity, oooO0O0);
        oooO00o.OooO00o().f25039OoooO.observe(mixedRoomActivity, new OooO0O0(new o000Oo0(this)));
        oooO00o.OooO00o().f25043OoooOO0.observe(mixedRoomActivity, new OooO0O0(new o000O00(this)));
        LiveEventBus.get("QUERY_USER_IN_ROOM_INFORMATION", RoomUserInfoModel.class).observe(mixedRoomActivity, new o000O0(this));
    }

    /* JADX WARN: Code duplicated, block: B:162:0x079e  */
    /* JADX WARN: Code duplicated, block: B:164:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:165:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:51:0x0316  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(o000O o000o, g2 g2Var, RoomUserInfoModel userModel) {
        int i;
        h8 h8Var;
        o000o.f48596OooO0o0 = userModel;
        g2Var.f52270OooOOO = new o00O00O(o000o, userModel);
        g2Var.f52272OooOOOO = new oOO00O(o000o, userModel);
        g2Var.f52273OooOOOo = new o00O00OO(o000o, userModel);
        g2Var.f52275OooOOo0 = new o00O00o0(o000o, userModel);
        g2Var.f52274OooOOo = new oo00o(o000o, userModel);
        g2Var.f52276OooOOoo = new o00O0(o000o);
        g2Var.f52279OooOo00 = new o00O0O00(o000o, userModel);
        g2Var.f52278OooOo0 = new o00O0O0(o000o, userModel);
        g2Var.f52280OooOo0O = new o00O0O0O(o000o, userModel);
        g2Var.f52281OooOo0o = new o000OOo0(o000o, userModel);
        g2Var.f52277OooOo = new o00(o000o, userModel);
        g2Var.f52283OooOoO0 = new o00O0000(o000o, userModel);
        g2Var.f52282OooOoO = new o0O0ooO(o000o, userModel);
        g2Var.f52284OooOoOO = new o00oOoo(o000o, userModel);
        g2Var.f52286OooOoo0 = new o00O000(o000o, userModel);
        g2Var.f52285OooOoo = new o00O000o(o000o, userModel);
        g2Var.f52287OooOooO = new o00O00(o000o, userModel);
        Intrinsics.checkNotNullParameter(userModel, "userModel");
        h8 h8Var2 = g2Var.f52269OooOO0o;
        h8Var2.f58068OooOoO0.setYalla(userModel.getRole().getValue().intValue());
        g2Var.f52288OooOooo = userModel.getUserId().getValue().longValue();
        Context context = g2Var.f52532OooO0Oo;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o(context);
        oooO00o.f43911OooO0OO = OooOOO.OooO00o(userModel.getUserHeader().getValue());
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
        oooO00o.f43928OooOo0 = true;
        oooO00o.OooO0O0(2, o0000.OooO00o(oO00O0o.white));
        oooO00o.f43923OooOOOo = oOo00OO0.icon_head_default;
        oooO00o.f43914OooO0o0 = true;
        oooO00o.OooO0Oo(h8Var2.f58052OooOO0);
        oO00O0oO oo00o0oo = g2Var.f52271OooOOO0;
        LifeCycleDialog lifeCycleDialog = g2Var.f52534OooO0o0;
        if (oo00o0oo == null) {
            g2Var.f52271OooOOO0 = new oO00O0oO(lifeCycleDialog, h8Var2.f58053OooOO0O);
        }
        oO00O0oO oo00o0oo2 = g2Var.f52271OooOOO0;
        if (oo00o0oo2 != null) {
            oo00o0oo2.OooO00o(userModel.getUserHeaderFrame().getValue());
        }
        h8Var2.f58051OooO0oo.setVisibility(userModel.isOfficialRole() ? 0 : 8);
        long jLongValue = userModel.getUserId().getValue().longValue();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        h8Var2.f58056OooOOO0.setVisibility((l != null && jLongValue == l.longValue()) ? 4 : 0);
        h8Var2.f58061OooOOoo.setSex(userModel.getSex().getValue().intValue());
        boolean z = userModel.getShowVIP().getValue().booleanValue() && userModel.getVipState().getValue().intValue() == VipState.Vip.getValue() && userModel.getVipLevel().getValue().intValue() >= VipLevel.Vip4.getValue();
        UserNameView userNameView = h8Var2.f58066OooOo0o;
        userNameView.setFlash(z);
        String strOooO0O0 = oOO0O0O.OooO0O0(userModel.getUserId().getValue().longValue(), "");
        boolean zIsBlank = StringsKt.isBlank(strOooO0O0);
        TextView textView = h8Var2.f58062OooOo;
        if (zIsBlank) {
            textView.setVisibility(8);
            userNameView.setText(userModel.getUserName().getValue());
        } else {
            textView.setVisibility(0);
            textView.setText(o0000.OooO0OO(oO00OOo0.User_Edit_Remark_name) + ZegoConstants.ZegoVideoDataAuxPublishingStream + ((Object) userModel.getUserName().getValue()));
            userNameView.setText(strOooO0O0);
        }
        int iIntValue = userModel.getRoomMemberType().getValue().intValue();
        h8Var2.f58046OooO0OO.setIdentityInfo(iIntValue);
        h8Var2.f58049OooO0o0.f57846OooO0O0.OooO0OO(iIntValue, true, true);
        h8Var2.f58060OooOOo0.setUserPrettyId(userModel.getIdLevel().getValue().intValue());
        h8Var2.f58065OooOo0O.setText(Oooo000.OooO00o("ID:", userModel.getUserIdx().getValue()));
        h8Var2.f58063OooOo0.setText("LV." + userModel.getUserLevel().getValue() + ZegoConstants.ZegoVideoDataAuxPublishingStream);
        ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
        RoomUserInfoModel roomUserInfoModelOooO0o0 = com.yalla.yalla.service.room.OooO00o.OooO0o0(userModel.getUserId().getValue());
        if (roomUserInfoModelOooO0o0 != null) {
            h8Var2.f58057OooOOOO.OooO00o(roomUserInfoModelOooO0o0.getMemberLevel().getValue(), roomUserInfoModelOooO0o0.getBadgeUrl().getValue(), roomUserInfoModelOooO0o0.isTopRank().getValue().booleanValue(), 9.0f);
        }
        UserRankView userRankView = h8Var2.f58059OooOOo;
        userRankView.setBgHeight(18);
        userRankView.OooO00o(userModel.getRankWeek().getValue().intValue(), userModel.getRankDay().getValue().intValue());
        Intrinsics.checkNotNullExpressionValue(userRankView, "binding.rankLayout");
        o000OO00.OooO(userRankView, new i2(userModel));
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
        h8Var2.f58069OooOoOO.setVisibility(i);
        String value2 = userModel.getMedal().getValue();
        boolean z2 = value2 == null || StringsKt.isBlank(value2);
        UserMedalView userMedalView = h8Var2.f58055OooOOO;
        if (z2) {
            userMedalView.setVisibility(8);
        } else {
            userMedalView.OooO00o(userModel.getMedal().getValue(), lifeCycleDialog);
            userMedalView.setVisibility(0);
        }
        int iIntValue2 = userModel.getVipState().getValue().intValue();
        int iIntValue3 = userModel.getVipLevel().getValue().intValue();
        int iOooO0O0 = o000000.OooO0O0(userModel.getShowVIP().getValue());
        RoomUserVipView roomUserVipView = h8Var2.f58054OooOO0o;
        MixedRoomActivity mixedRoomActivity = g2Var.f52268OooOO0O;
        roomUserVipView.OooO0O0(iIntValue2, iIntValue3, iOooO0O0, mixedRoomActivity);
        int iOooO0O1 = o000000.OooO0O0(userModel.isPremium().getValue());
        int iIntValue4 = userModel.getPremiumLevel().getValue().intValue();
        UserInfoPremiumLayout userInfoPremiumLayout = h8Var2.f58070OooOoo;
        userInfoPremiumLayout.getClass();
        userInfoPremiumLayout.setVisibility(iOooO0O1 == 1 ? 0 : 8);
        n9 n9Var = userInfoPremiumLayout.f30785OooO0Oo;
        n9Var.f58464OooO0O0.OooO0OO(iOooO0O1, iIntValue4);
        int value3 = PremiumLevel.Premium1.getValue();
        TextView textView2 = n9Var.f58466OooO0Oo;
        LinearLayoutCompat linearLayoutCompat = n9Var.f58465OooO0OO;
        if (iIntValue4 == value3) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_user_info_dialog_aristocrat_1);
            textView2.setText(o0000.OooO0OO(oO00OOo0.Patrician));
        } else if (iIntValue4 == PremiumLevel.Premium2.getValue()) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_user_info_dialog_aristocrat_2);
            textView2.setText(o0000.OooO0OO(oO00OOo0.Knight));
        } else if (iIntValue4 == PremiumLevel.Premium3.getValue()) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_user_info_dialog_aristocrat_3);
            textView2.setText(o0000.OooO0OO(oO00OOo0.Baron));
        } else if (iIntValue4 == PremiumLevel.Premium4.getValue()) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_user_info_dialog_aristocrat_4);
            textView2.setText(o0000.OooO0OO(oO00OOo0.Count));
        } else if (iIntValue4 == PremiumLevel.Premium5.getValue()) {
            linearLayoutCompat.setBackgroundResource(oOo00OO0.room_user_info_dialog_aristocrat_5);
            textView2.setText(o0000.OooO0OO(oO00OOo0.Marquis));
        } else {
            userInfoPremiumLayout.setVisibility(8);
        }
        boolean zOooO0o0 = p591o0oo000O.OooO.OooO0o0();
        NetImageView netImageView = h8Var2.f58050OooO0oO;
        if (zOooO0o0) {
            netImageView.setScaleX(-1.0f);
        }
        boolean zIsBlank2 = StringsKt.isBlank(userModel.getVehicleUrl().getValue());
        View view = h8Var2.f58071OooOoo0;
        if (zIsBlank2 || userModel.getVehicleId().getValue().intValue() == 0) {
            netImageView.setVisibility(8);
            view.setVisibility(8);
        } else {
            netImageView.setVisibility(0);
            view.setVisibility(0);
            OooOO0.OooO00o oooO00o2 = new OooOO0.OooO00o(context);
            oooO00o2.f43911OooO0OO = userModel.getVehicleUrl().getValue();
            oooO00o2.f43909OooO00o = 0;
            oooO00o2.f43923OooOOOo = oOo00OO0.icon_vehicel_placeholder;
            oooO00o2.OooO0Oo(netImageView);
        }
        LinearLayoutCompat linearLayoutCompat2 = h8Var2.f58047OooO0Oo.f57747OooO0o;
        long jLongValue2 = userModel.getUserId().getValue().longValue();
        Long l2 = (Long) o000000O.OooOOo0().getValue();
        linearLayoutCompat2.setVisibility((l2 == null || jLongValue2 != l2.longValue()) ? 0 : 8);
        int iIntValue5 = userModel.getWealthLevel().getValue().intValue();
        RoomUserWealthView roomUserWealthView = h8Var2.f58072OooOooO;
        if (iIntValue5 > 1) {
            Intrinsics.checkNotNullExpressionValue(roomUserWealthView, "binding.wealthView");
            o000OO00.OooOOOO(roomUserWealthView);
            roomUserWealthView.OooO0O0(mixedRoomActivity, userModel.getWealthLevel().getValue().intValue(), userModel.getWealthProfileCardImg().getValue(), userModel.getWealthBadge().getValue());
        } else {
            Intrinsics.checkNotNullExpressionValue(roomUserWealthView, "binding.wealthView");
            o000OO00.OooO0O0(roomUserWealthView);
        }
        userModel.parseDataByDefaultJsonString();
        RoomUserInfoDTO.ProfileCardInfo value4 = userModel.getProfileCardInfoEntity().getValue();
        if (value4 != null) {
            String backgroundEffectsUrl = value4.getBackgroundEffectsUrl();
            SVGAView sVGAView = h8Var2.f58058OooOOOo;
            sVGAView.OooOO0O(backgroundEffectsUrl, mixedRoomActivity);
            sVGAView.OooOO0o();
            OooOO0.OooO00o oooO00o3 = new OooOO0.OooO00o(context);
            oooO00o3.f43911OooO0OO = value4.getAvatarBorder();
            oooO00o3.f43909OooO00o = 0;
            OooOO0.OooO00o oooO00o4 = new OooOO0.OooO00o();
            int i2 = oOo00OO0.bg_defult_tr00;
            oooO00o4.f43923OooOOOo = i2;
            oooO00o4.f43913OooO0o = i2;
            String str = oooO00o4.f43916OooO0oo;
            boolean z3 = oooO00o4.f43912OooO0Oo;
            int i3 = oooO00o4.f43923OooOOOo;
            int i4 = oooO00o4.f43926OooOOoo;
            int i5 = oooO00o4.f43913OooO0o;
            ImageView imageView = oooO00o4.f43917OooOO0;
            boolean z4 = oooO00o4.f43921OooOOO0;
            boolean z5 = oooO00o4.f43914OooO0o0;
            int i6 = oooO00o4.f43920OooOOO;
            int i7 = oooO00o4.f43922OooOOOO;
            int i8 = oooO00o4.f43936OooOoo0;
            int i9 = oooO00o4.f43935OooOoo;
            int i10 = oooO00o4.f43929OooOo00;
            boolean z6 = oooO00o4.f43928OooOo0;
            int i11 = oooO00o4.f43931OooOo0o;
            int i12 = oooO00o4.f43927OooOo;
            int i13 = oooO00o4.f43933OooOoO0;
            int i14 = oooO00o4.f43932OooOoO;
            int i15 = oooO00o4.f43934OooOoOO;
            int i16 = oooO00o4.f43937OooOooO;
            int i17 = oooO00o4.f43938OooOooo;
            boolean z7 = oooO00o4.f43930OooOo0O;
            boolean z8 = oooO00o4.f43940Oooo00O;
            oooO00o3.f43916OooO0oo = str;
            oooO00o3.f43912OooO0Oo = z3;
            oooO00o3.f43923OooOOOo = i3;
            oooO00o3.f43926OooOOoo = i4;
            oooO00o3.f43913OooO0o = i5;
            oooO00o3.f43917OooOO0 = imageView;
            oooO00o3.f43920OooOOO = i6;
            oooO00o3.f43922OooOOOO = i7;
            oooO00o3.f43936OooOoo0 = i8;
            oooO00o3.f43935OooOoo = i9;
            oooO00o3.f43929OooOo00 = i10;
            oooO00o3.f43928OooOo0 = z6;
            oooO00o3.f43930OooOo0O = z7;
            oooO00o3.f43931OooOo0o = i11;
            oooO00o3.f43927OooOo = i12;
            oooO00o3.f43933OooOoO0 = i13;
            oooO00o3.f43932OooOoO = i14;
            oooO00o3.f43934OooOoOO = i15;
            oooO00o3.f43937OooOooO = i16;
            oooO00o3.f43938OooOooo = i17;
            oooO00o3.f43940Oooo00O = z8;
            oooO00o3.f43921OooOOO0 = z4;
            oooO00o3.f43914OooO0o0 = z5;
            oooO00o3.f43928OooOo0 = true;
            oooO00o3.f43914OooO0o0 = true;
            oooO00o3.OooO0Oo(h8Var2.f58064OooOo00);
            OooOO0.OooO00o oooO00o5 = new OooOO0.OooO00o(context);
            oooO00o5.f43911OooO0OO = value4.getBackgroundUrl();
            oooO00o5.f43909OooO00o = 0;
            OooOO0.OooO00o oooO00o6 = new OooOO0.OooO00o();
            oooO00o6.f43923OooOOOo = i2;
            oooO00o6.f43913OooO0o = i2;
            String str2 = oooO00o6.f43916OooO0oo;
            boolean z9 = oooO00o6.f43912OooO0Oo;
            int i18 = oooO00o6.f43923OooOOOo;
            int i19 = oooO00o6.f43926OooOOoo;
            int i20 = oooO00o6.f43913OooO0o;
            ImageView imageView2 = oooO00o6.f43917OooOO0;
            boolean z10 = oooO00o6.f43921OooOOO0;
            boolean z11 = oooO00o6.f43914OooO0o0;
            int i21 = oooO00o6.f43920OooOOO;
            int i22 = oooO00o6.f43922OooOOOO;
            int i23 = oooO00o6.f43936OooOoo0;
            int i24 = oooO00o6.f43935OooOoo;
            int i25 = oooO00o6.f43929OooOo00;
            boolean z12 = oooO00o6.f43928OooOo0;
            int i26 = oooO00o6.f43931OooOo0o;
            int i27 = oooO00o6.f43927OooOo;
            int i28 = oooO00o6.f43933OooOoO0;
            int i29 = oooO00o6.f43932OooOoO;
            int i30 = oooO00o6.f43934OooOoOO;
            int i31 = oooO00o6.f43937OooOooO;
            int i32 = oooO00o6.f43938OooOooo;
            boolean z13 = oooO00o6.f43930OooOo0O;
            boolean z14 = oooO00o6.f43940Oooo00O;
            oooO00o5.f43916OooO0oo = str2;
            oooO00o5.f43912OooO0Oo = z9;
            oooO00o5.f43923OooOOOo = i18;
            oooO00o5.f43926OooOOoo = i19;
            oooO00o5.f43913OooO0o = i20;
            oooO00o5.f43917OooOO0 = imageView2;
            oooO00o5.f43920OooOOO = i21;
            oooO00o5.f43922OooOOOO = i22;
            oooO00o5.f43936OooOoo0 = i23;
            oooO00o5.f43935OooOoo = i24;
            oooO00o5.f43929OooOo00 = i25;
            oooO00o5.f43928OooOo0 = z12;
            oooO00o5.f43930OooOo0O = z13;
            oooO00o5.f43931OooOo0o = i26;
            oooO00o5.f43927OooOo = i27;
            oooO00o5.f43933OooOoO0 = i28;
            oooO00o5.f43932OooOoO = i29;
            oooO00o5.f43934OooOoOO = i30;
            oooO00o5.f43937OooOooO = i31;
            oooO00o5.f43938OooOooo = i32;
            oooO00o5.f43940Oooo00O = z14;
            oooO00o5.f43921OooOOO0 = z10;
            oooO00o5.f43914OooO0o0 = z11;
            oooO00o5.f43914OooO0o0 = true;
            h8Var = h8Var2;
            NetImageView netImageView2 = h8Var.f58045OooO0O0;
            oooO00o5.OooO0Oo(netImageView2);
            netImageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            h8Var = h8Var2;
        }
        Pair<Boolean, Boolean> pairOooO0Oo = OooO0Oo(userModel.getUserId().getValue().longValue());
        g2Var.OooOOO0(pairOooO0Oo);
        long jLongValue3 = userModel.getUserId().getValue().longValue();
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            Long l3 = (Long) o000000O.OooOOo0().getValue();
            boolean z15 = l3 != null && l3.longValue() == jLongValue3;
            if (z15) {
                o000o.OooO0o0().OooOO0o(z15, false);
            } else {
                MixedRoomActivity mixedRoomActivity2 = o000o.f48470OooO00o;
                mixedRoomActivity2.f23441Oooo.checkIsFriend(jLongValue3).observe(mixedRoomActivity2, new OooO0O0(new o000(o000o, z15)));
            }
        }
        if (MixedRoomDataSource.OooO0o0().f23461OooO0o0 != null) {
            long j = (Long) o000000O.OooOOo0().getValue();
            if (j == null) {
                j = 0L;
            }
            RoomUserInfoModel roomUserInfoModelOooO0o1 = com.yalla.yalla.service.room.OooO00o.OooO0o0(j);
            MutableStateFlow<Integer> role = roomUserInfoModelOooO0o1 != null ? roomUserInfoModelOooO0o1.getRole() : null;
            long jLongValue4 = userModel.getUserId().getValue().longValue();
            Long l4 = (Long) o000000O.OooOOo0().getValue();
            if (l4 != null && jLongValue4 == l4.longValue()) {
                g2.OooOO0O(o000o.OooO0o0(), false, false, false, 15);
            } else {
                boolean z16 = role != null && role.getValue().intValue() == 1;
                com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o7 = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
                if (!z16) {
                    if (role != null && role.getValue().intValue() == 4) {
                        if (oooO00o7.OooO00o().OooOOO()) {
                            o000o.OooO0o0().OooOO0(true, true, true, true);
                        } else {
                            g2.OooOO0O(o000o.OooO0o0(), false, true, true, 3);
                        }
                    } else if (oooO00o7.OooO00o().OooOOO()) {
                        o000o.OooO0o0().OooOO0(true, true, true, true);
                    } else if (oooO00o7.OooO00o().OooOO0o()) {
                        if (userModel.getRoomMemberType().getValue().intValue() == 1 || userModel.getRoomMemberType().getValue().intValue() == 2) {
                            g2.OooOO0O(o000o.OooO0o0(), false, false, false, 15);
                        } else {
                            g2.OooOO0O(o000o.OooO0o0(), true, true, true, 1);
                        }
                    }
                } else if (oooO00o7.OooO00o().OooOOO()) {
                    o000o.OooO0o0().OooOO0(true, true, true, true);
                } else {
                    g2.OooOO0O(o000o.OooO0o0(), false, true, true, 3);
                }
            }
        }
        h8Var.f58049OooO0o0.f57847OooO0OO.setImageResource(pairOooO0Oo.getFirst().booleanValue() ? oOo00OO0.room_dialog_user_info_set_up_mic_down : oOo00OO0.room_dialog_user_info_set_up_mic_up);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Multi-variable type inference failed */
    public static Pair OooO0Oo(long j) {
        Object next;
        boolean zBooleanValue;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        boolean z = false;
        if (l != null && j == l.longValue()) {
            zBooleanValue = false;
        } else {
            Iterator<T> it = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47380OooOO0O.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((oo0O) next).f54838OooO0OO.getValue().longValue() == j));
            oo0O oo0o = (oo0O) next;
            if (oo0o != null) {
                zBooleanValue = oo0o.f54839OooO0Oo.getValue().booleanValue();
                z = true;
            } else {
                zBooleanValue = false;
            }
        }
        return new Pair(Boolean.valueOf(z), Boolean.valueOf(zBooleanValue));
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO00o() {
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue(null);
    }

    @Override // p489o0o00OO0.OooO
    public final void OooO0O0() {
        com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25040OoooO0.postValue(null);
    }

    public final void OooO0o(long j, String str) {
        MixedRoomActivity mixedRoomActivity = this.f48470OooO00o;
        mixedRoomActivity.f23441Oooo.addFriend(j, str).observe(mixedRoomActivity, new OooO0O0(OooO0OO.f48599OooO0Oo));
    }

    public final g2 OooO0o0() {
        return (g2) this.f48594OooO0OO.getValue();
    }

    public final void OooO0oO(long j) {
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.UserInfo_Dialog_Friend_Request);
        String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.import_verifymessage);
        String strOooO0OO3 = o0000.OooO0OO(oO00OOo0.iam);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0O00o00.OooO00o(this.f48470OooO00o, strOooO0OO, strOooO0OO2, strOooO0OO3 + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000000O.OooOOoo().getValue(), new OooO0o(j, this));
    }
}
