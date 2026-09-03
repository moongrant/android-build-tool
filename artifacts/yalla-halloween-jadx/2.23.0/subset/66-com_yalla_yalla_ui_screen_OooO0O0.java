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
import o000O00.o00000O;
import o000O00.o00000O0;
import p382o0OOoo0o.o00Ooo;
import p526o0o0OOO0.o00O00O;
import p526o0o0OOO0.o00O0OOO;
import p526o0o0OOO0.oo0oOO0;

/* JADX INFO: loaded from: classes4.dex */
public final class OooO0O0 extends Lambda implements Function1<o00000O0, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O f29152OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(o00000O o00000o) {
        super(1);
        this.f29152OooO0Oo = o00000o;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(o00000O0 o00000o1) {
        o00000O0 builder = o00000o1;
        Intrinsics.checkNotNullParameter(builder, "$this$NavHost");
        Intrinsics.checkNotNullParameter(builder, "builder");
        o00000O navController = this.f29152OooO0Oo;
        Intrinsics.checkNotNullParameter(navController, "navController");
        o00O0OOO.OooO00o(builder, navController, MyUserInfoScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, UserVisitorScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, FollowingScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, StoreScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, VipScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, MyOutfitScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, StoreChatBubbleScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, StoreChatBubbleMineScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, RoomThemeCustomCreateScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, TopicGroupCreateScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, TopicGroupJoinScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, YallaTeamImageMessageScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, FriendRequestMessageScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, FriendRequestDetailScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, VipSettingScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, VipExperienceScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, ReportScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, ReportScreenInnerPage.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, ReportUserScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, ReportRuleExplainPageScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, MainSearchScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, RedemptionCodeScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, RedemptionCodeRecordScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, HeaderFrameScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, MomentEditRecordScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, UserMomentListScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, VideoFeedScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, MomentReplyScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, RoomSettingScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, RoomUserActionRecordScreen.INSTANCE);
        o00O0OOO.OooO00o(builder, navController, NetworkTestScreen.INSTANCE);
        if (!o00Ooo.OooO0o0()) {
            o00O0OOO.OooO00o(builder, navController, CrashListScreen.INSTANCE);
            o00O0OOO.OooO00o(builder, navController, CrashDetailScreen.INSTANCE);
            o00O0OOO.OooO00o(builder, navController, NetDevTestScreen.INSTANCE);
            o00O0OOO.OooO00o(builder, navController, DarkThemeSettingScreen.INSTANCE);
            o00O0OOO.OooO00o(builder, navController, NestScrollScreen.INSTANCE);
        }
        Iterator it = oo0oOO0.f53620OooO0OO.iterator();
        while (it.hasNext()) {
            o00O0OOO.OooO00o(builder, navController, (o00O00O) it.next());
        }
        return Unit.INSTANCE;
    }
}
