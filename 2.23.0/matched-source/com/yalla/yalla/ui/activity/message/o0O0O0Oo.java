package com.yalla.yalla.ui.activity.message;

import android.content.Intent;
import android.os.Bundle;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.MainPage;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.VipLevel;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.RedemptionCodeScreen;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.moment.MomentDetailActivity;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.message.YallaTeamImageMessageScreen;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.conscrypt.PSKKeyManager;
import p579o0oOoo.oOO0OoO0;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O0O0Oo extends Lambda implements Function1<YallaTeamMessage, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f25942OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0Oo(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f25942OooO0Oo = yallaTeamMessageActivity;
    }

    /* JADX WARN: Code duplicated, block: B:80:0x027f  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(YallaTeamMessage yallaTeamMessage) {
        VipLevel vipLevel;
        int i;
        int i2;
        YallaTeamMessage it = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getType() == 5 && p417o0OoO0.o0000O0O.OooO0o(it.getBuriedPointMessageId()) && p417o0OoO0.o0000O0O.OooO0o(it.getBuriedPointSource())) {
            p587o0oOooo.o0OO000.OooO0O0("104041", MapsKt.mapOf(TuplesKt.to("messageid", it.getBuriedPointMessageId()), TuplesKt.to("source", it.getBuriedPointSource())));
        }
        int i3 = YallaTeamMessageActivity.f25774OooOoo0;
        YallaTeamMessageActivity context = this.f25942OooO0Oo;
        context.getClass();
        if (it.getMessageType() != 2) {
            int jumpType = it.getJumpType();
            int i4 = MainActivity.f25394OooOoo;
            switch (jumpType) {
                case 1:
                    switch (com.code.android.util.o0OoOo0.OooO0o(0, it.getJumpId())) {
                        case 101:
                            PurchaseSkillCardActivity.OooOo0(0, context);
                            break;
                        case 102:
                            Intent intent = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
                            intent.putExtra("IS_SHOW_RECHARGE", false);
                            intent.putExtra("IsFromMyOutfit", false);
                            context.startActivity(intent);
                            break;
                        case 103:
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intent intent2 = new Intent(context, (Class<?>) VehicleStoreActivity.class);
                            intent2.putExtra("IS_FROM_OUTFIT", false);
                            context.startActivity(intent2);
                            break;
                        case 104:
                            Intrinsics.checkNotNullParameter(context, "context");
                            context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
                            break;
                        case 105:
                            context.startActivity(new Intent(context, (Class<?>) PurchaseTopCardActivity.class));
                            break;
                    }
                    break;
                case 2:
                    p402o0Oo0OOO.o00O000o.f44502OooOOO0.observe(context, new YallaTeamMessageActivity.OooO00o(new o0O0o00O(it, context)));
                    break;
                case 3:
                    p402o0Oo0OOO.o00O000o.f44500OooOO0o.observe(context, new YallaTeamMessageActivity.OooO00o(new o0O0o0(it, context)));
                    break;
                case 4:
                    int iOooO0o = com.code.android.util.o0OoOo0.OooO0o(0, it.getJumpId());
                    PremiumLevel level = (iOooO0o == 401 || iOooO0o != 402) ? PremiumLevel.Premium1 : PremiumLevel.Premium2;
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(level, "level");
                    Intent intent3 = new Intent(context, (Class<?>) PremiumActivity.class);
                    intent3.putExtra("VipLevel", level.getValue());
                    context.startActivity(intent3);
                    break;
                case 5:
                    switch (com.code.android.util.o0OoOo0.OooO0o(0, it.getJumpId())) {
                        case YallaTeamMessage.JumpId.RoomList_Popular /* 501 */:
                            MainActivity.OooO00o.OooO00o(context, 0, 4);
                            LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.PopularPage.getValue()));
                            break;
                        case YallaTeamMessage.JumpId.RoomList_Recommended /* 502 */:
                            MainActivity.OooO00o.OooO00o(context, 0, 4);
                            LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.RecommendPage.getValue()));
                            break;
                        case YallaTeamMessage.JumpId.RoomList_Explore /* 503 */:
                            MainActivity.OooO00o.OooO00o(context, 3, 4);
                            break;
                    }
                    break;
                case 6:
                    switch (com.code.android.util.o0OoOo0.OooO0o(0, it.getJumpId())) {
                        case YallaTeamMessage.JumpId.MomentList_Following /* 601 */:
                            MainActivity.OooO00o.OooO00o(context, 1, 4);
                            LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentFollowingPage.getValue()));
                            break;
                        case YallaTeamMessage.JumpId.MomentList_Featured /* 602 */:
                            MainActivity.OooO00o.OooO00o(context, 1, 4);
                            LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentFeaturedPage.getValue()));
                            break;
                        case YallaTeamMessage.JumpId.MomentList_Topics /* 603 */:
                            MainActivity.OooO00o.OooO00o(context, 1, 4);
                            LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentTopicsPage.getValue()));
                            break;
                    }
                    break;
                case 7:
                    switch (com.code.android.util.o0OoOo0.OooO0o(0, it.getJumpId())) {
                        case 701:
                            vipLevel = VipLevel.Vip1;
                            break;
                        case 702:
                            vipLevel = VipLevel.Vip2;
                            break;
                        case 703:
                            vipLevel = VipLevel.Vip3;
                            break;
                        case YallaTeamMessage.JumpId.Vip_Vip4 /* 704 */:
                            vipLevel = VipLevel.Vip4;
                            break;
                        case YallaTeamMessage.JumpId.Vip_Vip5 /* 705 */:
                            vipLevel = VipLevel.Vip5;
                            break;
                        case YallaTeamMessage.JumpId.Vip_Vip6 /* 706 */:
                            vipLevel = VipLevel.Vip6;
                            break;
                        default:
                            vipLevel = VipLevel.Vip1;
                            break;
                    }
                    VipScreen.navigate$default(VipScreen.INSTANCE, vipLevel, false, 2, null);
                    break;
                case 8:
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intent intent4 = new Intent(context, (Class<?>) WalletActivity.class);
                    String strOooO0OO = com.code.android.util.OooO0O0.OooO0OO();
                    LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
                    p587o0oOooo.o0OO000.OooO0O0("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
                    intent4.putExtra("FromInfo", strOooO0OO);
                    context.startActivity(intent4);
                    break;
                case 9:
                    RedemptionCodeScreen.navigate$default(RedemptionCodeScreen.INSTANCE, null, 1, null);
                    break;
                case 10:
                    switch (com.code.android.util.o000000.OooO0o0(it.getJumpId())) {
                        case 1001:
                            i = 1;
                            break;
                        case 1002:
                            i = 2;
                            break;
                        case 1003:
                            i = 3;
                            break;
                        case 1004:
                            i = 4;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, i, null, false, 6, null);
                    break;
                default:
                    switch (jumpType) {
                        case 103:
                            oOO0OoO0.OooO00o(null, null, Long.valueOf(com.code.android.util.o0OoOo0.OooO(0L, it.getJumpId())), 3);
                            break;
                        case 104:
                            MomentDetailModel momentDetailModel = new MomentDetailModel();
                            momentDetailModel.setId(com.code.android.util.o0OoOo0.OooO(0L, it.getJumpId()));
                            int i5 = MomentDetailActivity.f26057Oooo0;
                            MomentDetailActivity.OooO00o.OooO00o(context, momentDetailModel, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 4) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 8) != 0 ? 1 : 0, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 16) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 32) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 64) != 0 ? null : null, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & 128) != 0 ? false : false, (PSKKeyManager.MAX_KEY_LENGTH_BYTES & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? "" : null);
                            break;
                        case 105:
                            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaTeamLink);
                            webPageInfo.OooO0o0(it.getJumpId());
                            Intrinsics.checkNotNullParameter(context, "context");
                            Intent intent5 = new Intent(context, (Class<?>) WebActivity.class);
                            intent5.putExtra("pageinfo", webPageInfo);
                            context.startActivity(intent5);
                            break;
                        case 106:
                            int iOooO0o0 = com.code.android.util.o000000.OooO0o0(it.getJumpId());
                            if (iOooO0o0 == 0) {
                                i2 = 0;
                            } else if (iOooO0o0 == 1) {
                                i2 = 1;
                            } else if (iOooO0o0 == 2) {
                                i2 = 2;
                            } else if (iOooO0o0 == 3) {
                                i2 = 3;
                            } else if (iOooO0o0 != 4) {
                                i2 = 0;
                            } else {
                                i2 = 4;
                            }
                            MyOutfitScreen.navigate$default(MyOutfitScreen.INSTANCE, i2, null, false, 6, null);
                            break;
                        case 107:
                            oOO0OoO0.OooO00o(Integer.valueOf(com.code.android.util.o000000.OooO0o0(it.getJumpId())), GiftPropTypeUser.Backpack, null, 4);
                            break;
                        case 108:
                            RedemptionCodeScreen.navigate$default(RedemptionCodeScreen.INSTANCE, null, 1, null);
                            break;
                        default:
                            com.code.android.util.o000O00O.OooO00o(oO00OOo0.Yalla_Update_Latest_Version);
                            break;
                    }
                    break;
            }
        } else {
            Bundle bundleOooO00o = p063o0000oO.o00Ooo.OooO00o();
            bundleOooO00o.putString(YallaTeamImageMessageScreen.Key_Title, it.getDetailTitle());
            bundleOooO00o.putString(YallaTeamImageMessageScreen.Key_ImageUrl, it.getDetailImage());
            p526o0o0OOO0.oo0oOO0.OooO0o0(YallaTeamImageMessageScreen.INSTANCE, bundleOooO00o, false, null, 12);
        }
        return Unit.INSTANCE;
    }
}
