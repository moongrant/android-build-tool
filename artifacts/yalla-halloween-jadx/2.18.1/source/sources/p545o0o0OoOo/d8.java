package p545o0o0OoOo;

import android.animation.LayoutTransition;
import android.text.TextUtils;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.UserPremiumView;
import com.yalla.yalla.common.ui.view.UserVipView;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.RoomUserInfoModel;
import com.yalla.yalla.ui.view.RoomMemberBadgeView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o0000Ooo;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.oOO00O;
import p520o0o0O0O0.o00O0O;
import p522o0o0O0o.o00O0;
import p560o0oOOooO.oO00OO0O;
import p560o0oOOooO.oO00OOO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.room.live.RoomQueueFeatureManager$launchPlayJob$2", f = "RoomQueueFeatureManager.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
public final class d8 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f44366Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ e8<Object> f44367Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(e8<Object> e8Var, Continuation<? super d8> continuation) {
        super(2, continuation);
        this.f44367Oooo0oO = e8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new d8(this.f44367Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((d8) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objOooO0o0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f44366Oooo0o;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        while (!this.f44367Oooo0oO.OooO0OO().isEmpty()) {
            e8<Object> e8Var = this.f44367Oooo0oO;
            int i2 = 0;
            Object objRemove = e8Var.OooO0OO().remove(0);
            this.f44366Oooo0o = 1;
            oO00OO0O oo00oo0o = (oO00OO0O) e8Var;
            RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) objRemove;
            if (o0000Ooo.OooO00o(oo00oo0o.f44858OooO0Oo)) {
                if (roomUserInfoModel.getIsUnLoginUser()) {
                    oo00oo0o.f44861OooO0oO.setText(o000O0O0.OooO0OO(R.string.tourists_enter_room_tip));
                    oo00oo0o.f44869OooOOOo.setVisibility(8);
                } else {
                    oo00oo0o.f44861OooO0oO.setText(o00O0O.f42677OooO00o.OooO0O0(roomUserInfoModel.getUserId(), roomUserInfoModel.getUserName()));
                    oo00oo0o.f44869OooOOOo.setVisibility(0);
                }
                oo00oo0o.f44861OooO0oO.requestLayout();
                oo00oo0o.f44860OooO0o0.OooO0Oo(roomUserInfoModel.isPremium(), roomUserInfoModel.getPremiumLevel());
                UserVipView userVipView = oo00oo0o.f44859OooO0o;
                int vipLevel = roomUserInfoModel.getVipLevel();
                int vipState = roomUserInfoModel.getVipState();
                VipState vipState2 = VipState.Vip;
                userVipView.OooO0OO(vipLevel, vipState == vipState2.getValue() && roomUserInfoModel.getShowVIP());
                oo00oo0o.f44862OooO0oo.setUserPrettyId(roomUserInfoModel.getIdLevel());
                oo00oo0o.f44866OooOOO.OooO00o(roomUserInfoModel.getRankWeek(), roomUserInfoModel.getRankDay());
                oo00oo0o.f44857OooO.OooO0O0(roomUserInfoModel.getMedal(), oo00oo0o.f44858OooO0Oo);
                if (!(roomUserInfoModel.getShowPremiumFirst() && roomUserInfoModel.isPremium()) && roomUserInfoModel.getVipState() == vipState2.getValue() && roomUserInfoModel.getShowVIP()) {
                    UserVipView userKaVipView = oo00oo0o.f44859OooO0o;
                    Intrinsics.checkNotNullExpressionValue(userKaVipView, "userKaVipView");
                    oOO00O.OooO00o(userKaVipView);
                    int i3 = oO00OO0O.OooO00o.$EnumSwitchMapping$0[VipLevel.INSTANCE.OooO0O0(roomUserInfoModel.getVipLevel()).ordinal()];
                    if (i3 == 1) {
                        i2 = R.drawable.room_entry_background_vip_1;
                    } else if (i3 == 2) {
                        i2 = R.drawable.room_entry_background_vip_2;
                    } else if (i3 == 3) {
                        i2 = R.drawable.room_entry_background_vip_3;
                    } else if (i3 == 4) {
                        i2 = R.drawable.room_entry_background_vip_4;
                    } else if (i3 == 5) {
                        i2 = R.drawable.room_entry_background_vip_5;
                    }
                } else {
                    UserPremiumView userVipView2 = oo00oo0o.f44860OooO0o0;
                    Intrinsics.checkNotNullExpressionValue(userVipView2, "userVipView");
                    oOO00O.OooO00o(userVipView2);
                    if (!roomUserInfoModel.isPremium()) {
                        i2 = R.drawable.icon_room_into_tips_bg_0;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium1.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_1;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium2.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_2;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium3.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_3;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium4.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_4;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium5.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_5;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium6.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_6;
                    } else if (roomUserInfoModel.getPremiumLevel() == PremiumLevel.Premium7.getValue()) {
                        i2 = R.drawable.icon_room_into_tips_bg_7;
                    }
                }
                if (roomUserInfoModel.getBadgeState()) {
                    RoomMemberBadgeView roomMemberBadgeView = oo00oo0o.f44868OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(roomMemberBadgeView, "roomMemberBadgeView");
                    oOO00O.OooO(roomMemberBadgeView);
                    RoomMemberBadgeView roomMemberBadgeView2 = oo00oo0o.f44868OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(roomMemberBadgeView2, "roomMemberBadgeView");
                    Integer numBoxInt = Boxing.boxInt(roomUserInfoModel.getMemberLevel());
                    String badgeUrl = roomUserInfoModel.getBadgeUrl();
                    boolean isTopRank = roomUserInfoModel.getIsTopRank();
                    int i4 = RoomMemberBadgeView.f25107Oooo0oo;
                    roomMemberBadgeView2.OooO00o(numBoxInt, badgeUrl, isTopRank, 11.0f);
                } else {
                    RoomMemberBadgeView roomMemberBadgeView3 = oo00oo0o.f44868OooOOOO;
                    Intrinsics.checkNotNullExpressionValue(roomMemberBadgeView3, "roomMemberBadgeView");
                    oOO00O.OooO00o(roomMemberBadgeView3);
                }
                if (roomUserInfoModel.getBadgeState() && ((i2 == R.drawable.icon_room_into_tips_bg_0 || i2 == 0) && roomUserInfoModel.getMemberLevel() >= 9)) {
                    i2 = R.drawable.icon_room_into_tips_member_bg;
                }
                if (i2 != 0) {
                    oo00oo0o.f44864OooOO0O.setBackgroundResource(i2);
                }
                if (!o000O00O.OooO().f32445OooooOo) {
                    oo00oo0o.f44867OooOOO0.setLayoutTransition(new LayoutTransition());
                    o000O00O.OooO().f32445OooooOo = true;
                }
                oo00oo0o.f44865OooOO0o.setOnClickListener(new oO00OOO(roomUserInfoModel));
                if (TextUtils.isEmpty(roomUserInfoModel.getVehicleSVGAUrl()) || !StringsKt__StringsJVMKt.endsWith$default(o00O0.OooO0o(roomUserInfoModel.getVehicleSVGAUrl()), ".svga", false, 2, null)) {
                    objOooO0o0 = oo00oo0o.OooO0o0(roomUserInfoModel.isPremium(), roomUserInfoModel.getPremiumLevel(), this);
                    if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0o0 = Unit.INSTANCE;
                    }
                } else {
                    objOooO0o0 = oo00oo0o.OooO0o(roomUserInfoModel.getVehicleSVGAUrl(), this);
                    if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0o0 = Unit.INSTANCE;
                    }
                }
            } else {
                objOooO0o0 = Unit.INSTANCE;
            }
            if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objOooO0o0 = Unit.INSTANCE;
            }
            if (objOooO0o0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        this.f44367Oooo0oO.f44368OooO0O0 = null;
        return Unit.INSTANCE;
    }
}
