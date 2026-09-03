package com.yalla.yalla.ui.screen;

import com.yalla.yalla.developer.crash.CrashDetailScreen;
import com.yalla.yalla.developer.crash.CrashListScreen;
import com.yalla.yalla.developer.nettest.NetDevTestScreen;
import com.yalla.yalla.ui.activity.main.RedemptionCodeRecordScreen;
import com.yalla.yalla.ui.activity.main.RedemptionCodeScreen;
import com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen;
import com.yalla.yalla.ui.screen.main.DarkThemeSettingScreen;
import com.yalla.yalla.ui.screen.main.MainSearchScreen;
import com.yalla.yalla.ui.screen.main.NestScrollScreen;
import com.yalla.yalla.ui.screen.main.VipExperienceScreen;
import com.yalla.yalla.ui.screen.main.VipSettingScreen;
import com.yalla.yalla.ui.screen.message.FriendRequestDetailScreen;
import com.yalla.yalla.ui.screen.message.FriendRequestMessageScreen;
import com.yalla.yalla.ui.screen.message.YallaTeamImageMessageScreen;
import com.yalla.yalla.ui.screen.moment.MomentReplyScreen;
import com.yalla.yalla.ui.screen.moment.TopicGroupCreateScreen;
import com.yalla.yalla.ui.screen.moment.TopicGroupJoinScreen;
import com.yalla.yalla.ui.screen.moment.media.VideoFeedScreen;
import com.yalla.yalla.ui.screen.report.ReportRuleExplainPageScreen;
import com.yalla.yalla.ui.screen.report.ReportScreen;
import com.yalla.yalla.ui.screen.report.ReportScreenInnerPage;
import com.yalla.yalla.ui.screen.report.ReportUserScreen;
import com.yalla.yalla.ui.screen.room.RoomSettingScreen;
import com.yalla.yalla.ui.screen.room.RoomUserActionRecordScreen;
import com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleMineScreen;
import com.yalla.yalla.ui.screen.store.StoreChatBubbleScreen;
import com.yalla.yalla.ui.screen.user.FollowingScreen;
import com.yalla.yalla.ui.screen.user.HeaderFrameScreen;
import com.yalla.yalla.ui.screen.user.MyOutfitScreen;
import com.yalla.yalla.ui.screen.user.MyUserInfoScreen;
import com.yalla.yalla.ui.screen.user.StoreScreen;
import com.yalla.yalla.ui.screen.user.UserMomentListScreen;
import com.yalla.yalla.ui.screen.user.UserVisitorScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p105o000oo0o.o00O00OO;
import p105o000oo0o.oOO00O;
import p388o0OOooO.oo0o0Oo;
import p532o0o0OOOO.o0O00OOO;
import p532o0o0OOOO.o0O0o000;
import p532o0o0OOOO.oo0OOoo;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<oOO00O, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f28625OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o00O00OO o00o00oo2) {
        super(1);
        this.f28625OooO0Oo = o00o00oo2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(oOO00O ooo00o) {
        oOO00O builder = ooo00o;
        Intrinsics.checkNotNullParameter(builder, "$this$NavHost");
        Intrinsics.checkNotNullParameter(builder, "builder");
        o00O00OO navController = this.f28625OooO0Oo;
        Intrinsics.checkNotNullParameter(navController, "navController");
        oo0OOoo.OooO00o(builder, navController, MyUserInfoScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, UserVisitorScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, FollowingScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, StoreScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, VipScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, MyOutfitScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, StoreChatBubbleScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, StoreChatBubbleMineScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, RoomThemeCustomCreateScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, TopicGroupCreateScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, TopicGroupJoinScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, YallaTeamImageMessageScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, FriendRequestMessageScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, FriendRequestDetailScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, VipSettingScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, VipExperienceScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, ReportScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, ReportScreenInnerPage.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, ReportUserScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, ReportRuleExplainPageScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, MainSearchScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, RedemptionCodeScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, RedemptionCodeRecordScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, HeaderFrameScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, MomentEditRecordScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, UserMomentListScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, VideoFeedScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, MomentReplyScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, RoomSettingScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, RoomUserActionRecordScreen.INSTANCE);
        oo0OOoo.OooO00o(builder, navController, NetworkTestScreen.INSTANCE);
        if (!oo0o0Oo.OooO0o0()) {
            oo0OOoo.OooO00o(builder, navController, CrashListScreen.INSTANCE);
            oo0OOoo.OooO00o(builder, navController, CrashDetailScreen.INSTANCE);
            oo0OOoo.OooO00o(builder, navController, NetDevTestScreen.INSTANCE);
            oo0OOoo.OooO00o(builder, navController, DarkThemeSettingScreen.INSTANCE);
            oo0OOoo.OooO00o(builder, navController, NestScrollScreen.INSTANCE);
        }
        Iterator it = o0O0o000.f53388OooO0OO.iterator();
        while (it.hasNext()) {
            oo0OOoo.OooO00o(builder, navController, (o0O00OOO) it.next());
        }
        return Unit.INSTANCE;
    }
}
