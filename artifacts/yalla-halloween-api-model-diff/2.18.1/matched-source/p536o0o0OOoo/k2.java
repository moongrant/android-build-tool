package p536o0o0OOoo;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooO;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.constant.MainPage;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.manager.RoomStateManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.model.MomentDetailModel;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.message.YallaTeamMessageActivity;
import com.yalla.yalla.ui.activity.moment.PostDetailActivity;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity;
import com.yalla.yalla.ui.activity.store.PurchaseSkillCardActivity;
import com.yalla.yalla.ui.activity.store.PurchaseTopCardActivity;
import com.yalla.yalla.ui.activity.store.VehicleStoreActivity;
import com.yalla.yalla.ui.activity.store.WalletActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import java.util.Objects;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import p584o0oOoo.o000O;
import p592o0oOooo.b;
import p606o0oo0O.OooOo;

/* JADX INFO: loaded from: classes2.dex */
public final class k2 extends Lambda implements Function1<YallaTeamMessage, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ YallaTeamMessageActivity f43809Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(YallaTeamMessageActivity yallaTeamMessageActivity) {
        super(1);
        this.f43809Oooo0o = yallaTeamMessageActivity;
    }

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
        VipLevel kaVipLevel;
        final YallaTeamMessage it = yallaTeamMessage;
        Intrinsics.checkNotNullParameter(it, "it");
        final YallaTeamMessageActivity context = this.f43809Oooo0o;
        YallaTeamMessageActivity.OooO00o oooO00o = YallaTeamMessageActivity.f22251OoooooO;
        Objects.requireNonNull(context);
        if (it.getMessageType() == 2) {
            Bundle bundleOooO00o = OooO0OO.OooO00o();
            bundleOooO00o.putString("Title", it.getDetailTitle());
            bundleOooO00o.putString("ImageUrl", it.getDetailImage());
            o000O.OooO00o(b.f47417OooO00o, bundleOooO00o);
        } else {
            int i = 0;
            if (it.getJumpType() == 1 && OooO.OooO0o0(it.getJumpId()) == 101) {
                int i2 = PurchaseSkillCardActivity.f23211Oooooo;
                Intent intent = new Intent(context, (Class<?>) PurchaseSkillCardActivity.class);
                intent.putExtra("page", 0);
                context.startActivity(intent);
            } else if (it.getJumpType() == 1 && OooO.OooO0o0(it.getJumpId()) == 102) {
                Intent intent2 = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
                intent2.putExtra("IS_SHOW_RECHARGE", false);
                context.startActivity(intent2);
            } else if (it.getJumpType() == 1 && OooO.OooO0o0(it.getJumpId()) == 103) {
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) VehicleStoreActivity.class));
            } else if (it.getJumpType() == 1 && OooO.OooO0o0(it.getJumpId()) == 104) {
                Intrinsics.checkNotNullParameter(context, "context");
                context.startActivity(new Intent(context, (Class<?>) PurchaseLockRoomActivity.class));
            } else if (it.getJumpType() == 1 && OooO.OooO0o0(it.getJumpId()) == 105) {
                context.startActivity(new Intent(context, (Class<?>) PurchaseTopCardActivity.class));
            } else if (it.getJumpType() == 2) {
                SharedUrlManager.INSTANCE.getPrettyRoomIdUrl().observe(context, new c2(it, context, i));
            } else if (it.getJumpType() == 3) {
                SharedUrlManager.INSTANCE.getPrettyUserIdUrl().observe(context, new Observer() { // from class: o0o0OOoo.d2
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        YallaTeamMessage message = it;
                        YallaTeamMessageActivity context2 = context;
                        String url = (String) obj;
                        YallaTeamMessageActivity.OooO00o oooO00o2 = YallaTeamMessageActivity.f22251OoooooO;
                        Intrinsics.checkNotNullParameter(message, "$message");
                        Intrinsics.checkNotNullParameter(context2, "this$0");
                        if (com.yalla.support.common.util.OooO0OO.OooO00o(url)) {
                            return;
                        }
                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.StoreCoin);
                        Intrinsics.checkNotNullExpressionValue(url, "s");
                        Intrinsics.checkNotNullParameter(url, "url");
                        webPageInfo.f21217Oooo0oO = url;
                        webPageInfo.f21220OoooO0 = true;
                        webPageInfo.OooO0OO(OooOOO.OooO0OO(R.string.user_unique_id));
                        webPageInfo.OooO00o("typeid", String.valueOf(message.getJumpType()));
                        webPageInfo.OooO00o("jumpname", message.getJumpId());
                        Intrinsics.checkNotNullParameter(context2, "context");
                        Intent intent3 = new Intent(context2, (Class<?>) WebActivity.class);
                        intent3.putExtra("pageinfo", webPageInfo);
                        context2.startActivity(intent3);
                    }
                });
            } else if (it.getJumpType() == 4 && OooO.OooO0o0(it.getJumpId()) == 401) {
                PremiumLevel level = PremiumLevel.Premium1;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(level, "level");
                Intent intent3 = new Intent(context, (Class<?>) PremiumActivity.class);
                intent3.putExtra("VipLevel", level.getValue());
                context.startActivity(intent3);
            } else if (it.getJumpType() == 4 && OooO.OooO0o0(it.getJumpId()) == 402) {
                PremiumLevel level2 = PremiumLevel.Premium2;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(level2, "level");
                Intent intent4 = new Intent(context, (Class<?>) PremiumActivity.class);
                intent4.putExtra("VipLevel", level2.getValue());
                context.startActivity(intent4);
            } else if (it.getJumpType() == 5 && OooO.OooO0o0(it.getJumpId()) == 501) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent5 = new Intent();
                intent5.setClass(context, MainActivity.class);
                intent5.putExtra("page", 0);
                intent5.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent5);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.PopularPage.getValue()));
            } else if (it.getJumpType() == 5 && OooO.OooO0o0(it.getJumpId()) == 502) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent6 = new Intent();
                intent6.setClass(context, MainActivity.class);
                intent6.putExtra("page", 0);
                intent6.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent6);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.RecommendPage.getValue()));
            } else if (it.getJumpType() == 5 && OooO.OooO0o0(it.getJumpId()) == 503) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent7 = new Intent();
                intent7.setClass(context, MainActivity.class);
                intent7.putExtra("page", 3);
                intent7.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent7);
            } else if (it.getJumpType() == 6 && OooO.OooO0o0(it.getJumpId()) == 601) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent8 = new Intent();
                intent8.setClass(context, MainActivity.class);
                intent8.putExtra("page", 1);
                intent8.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent8);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentFollowingPage.getValue()));
            } else if (it.getJumpType() == 6 && OooO.OooO0o0(it.getJumpId()) == 602) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent9 = new Intent();
                intent9.setClass(context, MainActivity.class);
                intent9.putExtra("page", 1);
                intent9.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent9);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentFeaturedPage.getValue()));
            } else if (it.getJumpType() == 6 && OooO.OooO0o0(it.getJumpId()) == 603) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent10 = new Intent();
                intent10.setClass(context, MainActivity.class);
                intent10.putExtra("page", 1);
                intent10.putExtra("INTENT_CHILD_PAGE", -1);
                context.startActivity(intent10);
                LiveEventBus.get("OPEN_MAIN_ACTIVITY_PAGE").post(Integer.valueOf(MainPage.MomentTopicsPage.getValue()));
            } else if (it.getJumpType() == 8) {
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent11 = new Intent(context, (Class<?>) WalletActivity.class);
                OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", "YallaTeamMessageActivity")));
                intent11.putExtra("FromInfo", "YallaTeamMessageActivity");
                context.startActivity(intent11);
            } else if (it.getJumpType() == 7) {
                switch (OooO.OooO0o0(it.getJumpId())) {
                    case 701:
                        kaVipLevel = VipLevel.Vip1;
                        break;
                    case 702:
                        kaVipLevel = VipLevel.Vip2;
                        break;
                    case 703:
                        kaVipLevel = VipLevel.Vip3;
                        break;
                    case 704:
                        kaVipLevel = VipLevel.Vip4;
                        break;
                    case 705:
                        kaVipLevel = VipLevel.Vip5;
                        break;
                    default:
                        kaVipLevel = VipLevel.Vip1;
                        break;
                }
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(kaVipLevel, "kaVipLevel");
                Intent intent12 = new Intent(context, (Class<?>) VipActivity.class);
                intent12.putExtra("KA_VIP_LEVEL", kaVipLevel.getValue());
                context.startActivity(intent12);
            } else if (it.getJumpType() == 103) {
                RoomStateManager.enterRoom$default(RoomStateManager.INSTANCE, OooO.OooO0oO(it.getJumpId()), (EnterRoomParentPage) null, 2, (Object) null);
            } else if (it.getJumpType() == 104) {
                MomentDetailModel momentDetailModel = new MomentDetailModel();
                momentDetailModel.setId(OooO.OooO0oO(it.getJumpId()));
                PostDetailActivity.OooO00o oooO00o2 = PostDetailActivity.f22417o0O0O00;
                PostDetailActivity.f22417o0O0O00.OooO00o(context, momentDetailModel, (256 & 4) != 0 ? false : false, (256 & 8) != 0 ? 1 : 0, (256 & 16) != 0 ? null : null, (256 & 32) != 0 ? false : false, (256 & 64) != 0 ? null : null, (256 & 128) != 0 ? false : false, (256 & 256) != 0 ? "" : null);
            } else if (it.getJumpType() == 105) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.YallaTeamLink);
                webPageInfo.OooO0Oo(it.getJumpId());
                Intrinsics.checkNotNullParameter(context, "context");
                Intent intent13 = new Intent(context, (Class<?>) WebActivity.class);
                intent13.putExtra("pageinfo", webPageInfo);
                context.startActivity(intent13);
            }
        }
        return Unit.INSTANCE;
    }
}
