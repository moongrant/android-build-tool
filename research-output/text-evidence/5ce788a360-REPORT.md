# Yalla historical APK forensics — 3.6.2

Window: treasure-tycoon-window

- version: 3.6.2
- label: treasure-tycoon-window
- target_hit_files: 145
- relevant_source_files: 1203
- target_images: 60
- urls: 1179
- api_routes: 560

## Target context
```
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1836-            database.OooOo("CREATE TABLE IF NOT EXISTS `SystemMessageTable` (`mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `uid` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, `vipLevel` INTEGER, `joinTopicId` INTEGER, `topicType` INTEGER, `topicId` INTEGER, `topicName` TEXT, `topicFailType` INTEGER, `userUpLevel` INTEGER, `userUpCoin` INTEGER, `userUpCrystal` INTEGER, `roomUpLevel` INTEGER, `roomWageCoin` INTEGER, `aristocracyBuyType` INTEGER, `aristocracyLevel` INTEGER, `uniqueIdExpirationTime` INTEGER, `consumerRebateCoin` INTEGER, `unlockAvatarFrameUrl` TEXT, `subscribeRewardCoin` INTEGER, `medalLevel` INTEGER, `medalId` INTEGER, PRIMARY KEY(`uid`, `mid`))");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1837-            database.OooOo("CREATE UNIQUE INDEX IF NOT EXISTS `index_SystemMessageTable_uid_mid` ON `SystemMessageTable` (`uid`, `mid`)");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1838-            database.OooOo("CREATE TABLE IF NOT EXISTS `FriendRequestMessageTable` (`uid` INTEGER NOT NULL, `targetUserId` INTEGER NOT NULL, `mid` TEXT, `state` INTEGER NOT NULL, `message` TEXT, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `targetUserId`))");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1839-            database.OooOo("CREATE UNIQUE INDEX IF NOT EXISTS `index_FriendRequestMessageTable_uid_targetUserId` ON `FriendRequestMessageTable` (`uid`, `targetUserId`)");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1840-            database.OooOo("CREATE TABLE IF NOT EXISTS `YallaTeamMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `type` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `isRead` INTEGER NOT NULL, PRIMARY KEY(`uid`, `mid`))");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1841-            database.OooOo("CREATE UNIQUE INDEX IF NOT EXISTS `index_YallaTeamMessageTable_uid_mid` ON `YallaTeamMessageTable` (`uid`, `mid`)");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1842-            database.OooOo("CREATE TABLE IF NOT EXISTS `ConversationTable` (`uid` INTEGER NOT NULL, `targetId` INTEGER NOT NULL, `mid` TEXT NOT NULL, `sendState` INTEGER NOT NULL, `title` TEXT NOT NULL, `message` TEXT NOT NULL, `type` INTEGER NOT NULL, `unReadCount` INTEGER NOT NULL, `draft` TEXT NOT NULL, `time` INTEGER NOT NULL, `topTime` INTEGER NOT NULL, `isVoiceAndUnread` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, PRIMARY KEY(`targetId`, `uid`))");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1843-            database.OooOo("CREATE UNIQUE INDEX IF NOT EXISTS `index_ConversationTable_uid_targetId` ON `ConversationTable` (`uid`, `targetId`)");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java:1844:            database.OooOo("CREATE TABLE IF NOT EXISTS `ChatMessageTable` (`uid` INTEGER NOT NULL, `mid` TEXT NOT NULL, `targetId` INTEGER NOT NULL, `contentType` INTEGER NOT NULL, `message` TEXT NOT NULL, `time` INTEGER NOT NULL, `sendState` INTEGER NOT NULL, `isWarn` INTEGER NOT NULL, `isAcceptMsg` INTEGER NOT NULL, `voiceUrl` TEXT, `voiceDuration` INTEGER, `voiceFileName` TEXT, `isVoiceRead` INTEGER, `emoticonType` INTEGER, `emoticonValue` INTEGER, `emoticonIsRead` INTEGER, `giftId` INTEGER, `giftNumber` INTEGER,`giftUrl` TEXT, `gifId` INTEGER, `gifUrl` TEXT, `roomHeader` TEXT, `roomName` TEXT, `roomId` INTEGER, `roomIdx` INTEGER, `roomIp` TEXT, `momentId` INTEGER, `momentImage` TEXT, `momentText` TEXT, `momentMsg` TEXT, `topicId` INTEGER, `topicImage` TEXT, `topicName` TEXT, `topicUserCount` INTEGER, `topicMomentCount` INTEGER, `topicMsg` TEXT, `shareUserId` INTEGER, `shareUserIdx` INTEGER, `shareUserHead` TEXT, `shareUserName` TEXT, `shareUserMessage` TEXT, `activityImage` TEXT, `activityText1` TEXT, `activityText2` TEXT, `activityMsg` TEXT, `activityUrl` TEXT, PRIMARY KEY(`uid`, `mid`))");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1845-            database.OooOo("CREATE UNIQUE INDEX IF NOT EXISTS `index_ChatMessageTable_uid_mid` ON `ChatMessageTable` (`uid`, `mid`)");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1846-            long jOooO0O0 = OooO0O0(database, "ChatMessage");
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1847-            if (jOooO0O0 > 0) {
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1848-                LongProgression longProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(0, jOooO0O0), 500L);
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1849-                long first = longProgressionStep.getFirst();
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1850-                long last = longProgressionStep.getLast();
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1851-                long step = longProgressionStep.getStep();
/tmp/jadx-out/sources/p559o0OoooOo/oOO0O0O0.java-1852-                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
--
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-1-package androidx.compose.animation.core;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-2-
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-3-import android.view.View;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-4-import com.yalla.yalla.mixedroom.model.TreasureBoxProgressModel;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java:5:import com.yalla.yalla.model.ActivityCenterItemModel;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-6-import com.yalla.yalla.model.ActivityListModel;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-7-import com.yalla.yalla.model.moment.MomentCommentDetailModel;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-8-import com.yalla.yalla.module.event.p028ui.view.ActivityCenterItemViewKt;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-9-import com.yalla.yalla.module.moment.activity.postDetailCommentSonList.MomentReplyHeaderView;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-10-import com.yalla.yalla.module.room.fragment.TreasureBoxFragment;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-11-import kotlin.TuplesKt;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-12-import kotlin.Unit;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-13-import kotlin.collections.MapsKt;
--
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-32-    public final Object invoke(Object obj) {
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-33-        int i = this.f8757OooO0oO;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-34-        Object obj2 = this.f8758OooO0oo;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-35-        switch (i) {
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-36-            case 0:
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-37-                return SeekableTransitionState.animateOneFrameLambda$lambda$4((SeekableTransitionState) obj2, ((Long) obj).longValue());
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-38-            case 1:
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-39-                ActivityListModel activity = (ActivityListModel) obj2;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java:40:                ActivityCenterItemModel it = (ActivityCenterItemModel) obj;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-41-                Intrinsics.checkNotNullParameter(activity, "$activity");
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-42-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-43-                com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("101165", MapsKt.mapOf(TuplesKt.m1450to("categoryid", Long.valueOf(activity.getCategoryId()))));
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-44-                ActivityCenterItemViewKt.OooO0Oo(it);
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-45-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-46-            case 2:
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-47-                return TreasureBoxFragment.initView$lambda$13((TreasureBoxFragment) obj2, (TreasureBoxProgressModel) obj);
/tmp/jadx-out/sources/androidx/compose/animation/core/o0ooOOo.java-48-            default:
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-2-
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-3-import android.os.Looper;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-4-import android.view.View;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-5-import androidx.compose.foundation.lazy.LazyListScope;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-6-import androidx.compose.p008ui.layout.Placeable;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-7-import androidx.compose.runtime.collection.MutableVector;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-8-import androidx.compose.runtime.internal.ComposableLambdaKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-9-import com.yalla.yalla.data.constant.ClientCodeType;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java:10:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-11-import com.yalla.yalla.module.account.p026ui.acitivity.EmailActivity;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-12-import com.yalla.yalla.module.moment.p035vm.MomentCommentsVM;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-13-import com.yalla.yalla.module.user.activity.UserInfoEditActivity;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-14-import kotlin.TuplesKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-15-import kotlin.Unit;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-16-import kotlin.collections.MapsKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-17-import kotlin.jvm.functions.Function1;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-18-import kotlin.jvm.internal.Intrinsics;
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-57-                LazyListScope.CC.OooOOOO(LazyColumn, lazyPagingItems.OooO0O0(), null, null, ComposableLambdaKt.composableLambdaInstance(1060891556, true, new com.yalla.yalla.module.event.p028ui.screen.o0oO0O0o(lazyPagingItems)), 6, null);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-58-                com.code.android.uikit.swiprefresh.o00O0O.OooO0o0(LazyColumn, lazyPagingItems, null, 6);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-59-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-60-            case 3:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-61-                com.yalla.yalla.module.main.p031ui.dialog.o0000 this$1 = (com.yalla.yalla.module.main.p031ui.dialog.o0000) obj2;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-62-                View it2 = (View) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-63-                Intrinsics.checkNotNullParameter(this$1, "this$0");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-64-                Intrinsics.checkNotNullParameter(it2, "it");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java:65:                OfficialActionModel officialActionModel = this$1.f59769Ooooo00;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java:66:                if (officialActionModel != null) {
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java:67:                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("101049", MapsKt.mapOf(TuplesKt.m1450to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m1450to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m1450to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-68-                }
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-69-                this$1.OooOO0o();
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-70-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-71-            case 4:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-72-                MomentCommentsVM vm = (MomentCommentsVM) obj2;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-73-                int iIntValue = ((Integer) obj).intValue();
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-74-                Intrinsics.checkNotNullParameter(vm, "$vm");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O0o.java-75-                vm.switchSortType(iIntValue);
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-1-package androidx.compose.foundation.layout;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-2-
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-3-import android.content.Context;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-4-import android.view.View;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-5-import androidx.compose.p008ui.layout.Placeable;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-6-import com.yalla.yalla.model.WebFrom;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:7:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-8-import com.yalla.yalla.module.user.screen.HeaderFrameScreen;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-9-import com.yalla.yalla.p048ui.activity.main.WebActivity;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-10-import com.yalla.yalla.util.WebPageInfo;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-11-import kotlin.TuplesKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-12-import kotlin.Unit;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-13-import kotlin.collections.MapsKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-14-import kotlin.jvm.functions.Function1;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-15-import kotlin.jvm.internal.Intrinsics;
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-37-            case 0:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-38-                return FlowLayoutKt.breakDownItems_di9J0FM$lambda$20$lambda$19((Ref.ObjectRef) obj2, (Placeable) obj);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-39-            case 1:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-40-                com.yalla.yalla.module.main.p031ui.dialog.o0000 this$0 = (com.yalla.yalla.module.main.p031ui.dialog.o0000) obj2;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-41-                View it = (View) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-42-                Intrinsics.checkNotNullParameter(this$0, "this$0");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-43-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-44-                com.yalla.yalla.util.log.OooOO0.OooO0O0("MainDialogUserReturn 活动 \nData:'" + this$0.f59769Ooooo00 + "'");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:45:                OfficialActionModel officialActionModel = this$0.f59769Ooooo00;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:46:                if (officialActionModel != null) {
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:47:                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("101048", MapsKt.mapOf(TuplesKt.m1450to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m1450to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m1450to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:48:                    String h5EntranceUrl = officialActionModel.getH5EntranceUrl();
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:49:                    if (h5EntranceUrl != null && h5EntranceUrl.length() > 0) {
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-50-                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java:51:                        webPageInfo.OooO0o0(h5EntranceUrl);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-52-                        webPageInfo.f84438OooOO0o = true;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-53-                        int i2 = WebActivity.f79403OooOoo0;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-54-                        WebActivity.OooO00o.OooO00o(this$0.OooOoO0(), webPageInfo);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-55-                        this$0.OooOO0o();
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-56-                    }
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-57-                }
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-58-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000Oo0.java-59-            case 2:
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-1-package androidx.compose.foundation.layout;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-2-
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-3-import androidx.compose.foundation.lazy.grid.LazyGridScope;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-4-import androidx.compose.p008ui.layout.Placeable;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-5-import androidx.compose.runtime.internal.ComposableLambdaKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-6-import androidx.compose.runtime.snapshots.SnapshotStateList;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java:7:import com.yalla.yalla.model.ActivityCenterItemModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-8-import com.yalla.yalla.model.ActivityListModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-9-import com.yalla.yalla.model.CountryModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-10-import com.yalla.yalla.model.PremiumPrivilegeModel;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-11-import com.yalla.yalla.module.event.p028ui.view.ActivityCenterItemViewKt;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-12-import com.yalla.yalla.module.user.activity.UserInfoEditActivity;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-13-import com.yalla.yalla.module.user.fragment.PremiumFragment;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-14-import java.util.HashMap;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-15-import java.util.List;
--
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-42-            case 1:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-43-                SnapshotStateList<ActivityListModel> list = (SnapshotStateList) obj2;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-44-                LazyGridScope LazyVerticalGrid = (LazyGridScope) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-45-                Intrinsics.checkNotNullParameter(list, "$list");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-46-                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-47-                LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, new com.yalla.yalla.module.event.p028ui.view.OooO0OO(), null, com.yalla.yalla.module.event.p028ui.view.OooOOO.f55658OooO00o, 5, null);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-48-                for (ActivityListModel activityListModel : list) {
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-49-                    LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, new com.yalla.yalla.module.event.p028ui.view.OooO0o(), null, ComposableLambdaKt.composableLambdaInstance(-1233331998, true, new ActivityCenterItemViewKt.OooO00o(activityListModel)), 5, null);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java:50:                    List<ActivityCenterItemModel> activityList = activityListModel.getActivityList();
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-51-                    LazyVerticalGrid.items(activityList.size(), null, null, new ActivityCenterItemViewKt.OooO0O0(activityList), ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new ActivityCenterItemViewKt.OooO0OO(activityList)));
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-52-                }
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-53-                LazyGridScope.CC.OooO00o(LazyVerticalGrid, null, new com.yalla.yalla.module.event.p028ui.view.OooO(0), null, com.yalla.yalla.module.event.p028ui.view.OooOOO.f55659OooO0O0, 5, null);
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-54-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-55-            case 2:
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-56-                List data = (List) obj2;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-57-                LazyGridScope LazyVerticalGrid2 = (LazyGridScope) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/layout/o000O00.java-58-                Intrinsics.checkNotNullParameter(data, "$data");
--
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-46-    public /* synthetic */ o00OO00O(Object obj, int i) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-47-        this.f10367OooO0oO = i;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-48-        this.f10368OooO0oo = obj;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-49-    }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-50-
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-51-    /* JADX WARN: Multi-variable type inference failed */
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-52-    @Override // kotlin.jvm.functions.Function3
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-53-    public final Object invoke(Object obj, Object obj2, Object obj3) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java:54:        String activityUrl;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-55-        String string;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-56-        int i = this.f10367OooO0oO;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-57-        Object obj4 = this.f10368OooO0oo;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-58-        switch (i) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-59-            case 0:
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-60-                return Boolean.valueOf(TextFieldDecoratorModifierNode.applySemantics$lambda$20((TextFieldDecoratorModifierNode) obj4, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Boolean) obj3).booleanValue()));
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-61-            default:
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-62-                final PrivateChatActivity this$0 = (PrivateChatActivity) obj4;
--
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-212-                        StringBuilder sb = new StringBuilder();
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-213-                        sb.append(userId);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-214-                        oooOO2.OooO0oo(sb.toString(), (6 & 2) == 0, (6 & 4) == 0);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-215-                    }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-216-                } else if (id == p593o0o0O.o00oO0o.clShareActivitySend || p593o0o0O.o00oO0o.clShareActivityReceive == id) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-217-                    if (chatMessage.getShareActivityInfo() != null) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-218-                        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.PrivateChatShare);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-219-                        ChatMessage.ShareActivityInfo shareActivityInfo = chatMessage.getShareActivityInfo();
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java:220:                        if (shareActivityInfo == null || (activityUrl = shareActivityInfo.getActivityUrl()) == null) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java:221:                            activityUrl = "";
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-222-                        }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java:223:                        webPageInfo.OooO0o0(activityUrl);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-224-                        String str = webPageInfo.f84435OooO0oo;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-225-                        if (str != null && !StringsKt.isBlank(str)) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-226-                            Intent intent = new Intent(this$0, (Class<?>) WebActivity.class);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-227-                            intent.putExtra("pageinfo", webPageInfo);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-228-                            this$0.startActivity(intent);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-229-                        }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-230-                    }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00OO00O.java-231-                } else if (id == p593o0o0O.o00oO0o.clRoomTheme) {
--
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-1-package androidx.compose.foundation.text.input.internal;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-2-
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-3-import android.content.Context;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-4-import androidx.compose.runtime.MutableState;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-5-import com.yalla.yalla.model.RoomBroadcastModel;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-6-import com.yalla.yalla.model.http.Response;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java:7:import com.yalla.yalla.model.room.RoomActivityModel;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-8-import com.yalla.yalla.model.topic.TopicInfoModel;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-9-import com.yalla.yalla.model.user.UserInfoModel;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-10-import com.yalla.yalla.module.moment.activity.TopicDetailActivity;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-11-import com.yalla.yalla.module.moment.p035vm.TopicInfoVM;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-12-import com.yalla.yalla.module.room.p037ui.comp.o0O0o00O;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-13-import com.yalla.yalla.module.room.screen.live.dialog.RoomActivityWebDialogBanner;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-14-import kotlin.TuplesKt;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-15-import kotlin.Unit;
--
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-60-                Intrinsics.checkNotNullParameter(this$0, "this$0");
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-61-                Response response = (Response) this$0.OooOoo().getTopicDetailLiveData().getValue();
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-62-                if (response != null && (topicInfoModel = (TopicInfoModel) response.getData()) != null) {
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-63-                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0O0("203006");
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-64-                    ((TopicInfoVM) this$0.f62856OooOoO.getValue()).topicUserVerify(String.valueOf(topicInfoModel.getId())).observe(this$0, new TopicDetailActivity.OooO0O0(new com.yalla.yalla.developer.screen.OooOo00(this$0, i2)));
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-65-                }
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-66-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-67-            case 3:
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java:68:                RoomActivityModel.RoomActivity item = (RoomActivityModel.RoomActivity) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-69-                Intrinsics.checkNotNullParameter(item, "$item");
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-70-                RoomActivityWebDialogBanner.OooO0o0(0, true);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java:71:                com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("102248", MapsKt.mapOf(TuplesKt.m1450to("type", 2), TuplesKt.m1450to("url", item.getActivityurl())));
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-72-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-73-            case 4:
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-74-                RoomBroadcastModel data = (RoomBroadcastModel) obj;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-75-                Intrinsics.checkNotNullParameter(data, "$data");
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-76-                o0O0o00O.OooO0O0(data);
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-77-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-78-            case 5:
/tmp/jadx-out/sources/androidx/compose/foundation/text/input/internal/o00O000.java-79-                MutableState isShow = (MutableState) obj;
--
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-44-            default:
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-45-                MutableState giftModel$delegate = (MutableState) this.f12210OooO0oo;
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-46-                WebPageInfo toHalfWebDialog = (WebPageInfo) obj;
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-47-                Intrinsics.checkNotNullParameter(giftModel$delegate, "$giftModel$delegate");
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-48-                Intrinsics.checkNotNullParameter(toHalfWebDialog, "$this$toHalfWebDialog");
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-49-                toHalfWebDialog.f84437OooOO0O = false;
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-50-                GiftPropModel giftPropModel = (GiftPropModel) giftModel$delegate.getValue();
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-51-                Intrinsics.checkNotNull(giftPropModel);
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java:52:                toHalfWebDialog.OooO0o0(giftPropModel.getActivityUrl());
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-53-                return Unit.INSTANCE;
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-54-        }
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-55-    }
/tmp/jadx-out/sources/androidx/compose/material/o0o0000.java-56-}
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-5-import kotlin.jvm.internal.DefaultConstructorMarker;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-6-import kotlin.jvm.internal.Intrinsics;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-7-import org.jetbrains.annotations.NotNull;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-8-import org.jetbrains.annotations.Nullable;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-9-import p102OooOOo.OooO0O0;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-10-import p106OooOo0O.Oooo000;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-11-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-12-/* JADX INFO: loaded from: classes4.dex */
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java:13:@Metadata(m1442d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/FootballGamePlugin;", "", "()V", "CampChanged", "CampUser", "GameOver", "GameRenderComplete", "GameUnderMaintenance", "PrizePool", "SendGift", "Visitor", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$CampChanged;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$CampUser;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$GameOver;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$GameRenderComplete;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$GameUnderMaintenance;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$PrizePool;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$SendGift;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$Visitor;", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-14-public abstract class FootballGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-15-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-16-    @Metadata(m1442d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$CampChanged;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin;", "camp", "", "(I)V", "getCamp", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-17-    public static final /* data */ class CampChanged extends FootballGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-18-        private final int camp;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-19-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-20-        public CampChanged(int i) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-21-            super(null);
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-142-        @NotNull
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-143-        public static final GameUnderMaintenance INSTANCE = new GameUnderMaintenance();
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-144-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-145-        private GameUnderMaintenance() {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-146-            super(null);
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-147-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-148-    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-149-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java:150:    @Metadata(m1442d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$PrizePool;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin;", "()V", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java:151:    public static final class PrizePool extends FootballGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-152-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-153-        @NotNull
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java:154:        public static final PrizePool INSTANCE = new PrizePool();
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-155-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java:156:        private PrizePool() {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-157-            super(null);
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-158-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-159-    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-160-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-161-    @Metadata(m1442d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/FootballGamePlugin$SendGift;", "Lcom/chatpartygame/flutter/plugin/FootballGamePlugin;", "user", "Lcom/chatpartygame/flutter/model/UserBean;", "(Lcom/chatpartygame/flutter/model/UserBean;)V", "getUser", "()Lcom/chatpartygame/flutter/model/UserBean;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-162-    public static final /* data */ class SendGift extends FootballGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-163-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/FootballGamePlugin.java-164-        @NotNull
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-4-import com.chatpartygame.flutter.model.SendGiftInfo;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-5-import kotlin.Metadata;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-6-import kotlin.jvm.internal.DefaultConstructorMarker;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-7-import kotlin.jvm.internal.Intrinsics;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-8-import org.jetbrains.annotations.NotNull;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-9-import org.jetbrains.annotations.Nullable;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-10-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-11-/* JADX INFO: loaded from: classes4.dex */
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java:12:@Metadata(m1442d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin;", "", "()V", "GameInfoChanged", "GameOver", "GameRenderComplete", "PrizePool", "SendGift", "ServiceError", "VisitorJoin", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$GameInfoChanged;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$GameOver;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$GameRenderComplete;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$PrizePool;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$SendGift;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$ServiceError;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$VisitorJoin;", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-13-public abstract class RacingCarGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-14-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-15-    @Metadata(m1442d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$GameInfoChanged;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin;", "gameInfo", "Lcom/chatpartygame/flutter/model/GameRacingCarInfo;", "(Lcom/chatpartygame/flutter/model/GameRacingCarInfo;)V", "getGameInfo", "()Lcom/chatpartygame/flutter/model/GameRacingCarInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-16-    public static final /* data */ class GameInfoChanged extends RacingCarGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-17-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-18-        @NotNull
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-19-        private final GameRacingCarInfo gameInfo;
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-20-
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-83-        @NotNull
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-84-        public static final GameRenderComplete INSTANCE = new GameRenderComplete();
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-85-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-86-        private GameRenderComplete() {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-87-            super(null);
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-88-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-89-    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-90-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java:91:    @Metadata(m1442d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$PrizePool;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin;", "()V", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java:92:    public static final class PrizePool extends RacingCarGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-93-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-94-        @NotNull
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java:95:        public static final PrizePool INSTANCE = new PrizePool();
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-96-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java:97:        private PrizePool() {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-98-            super(null);
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-99-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-100-    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-101-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-102-    @Metadata(m1442d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m1443d2 = {"Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin$SendGift;", "Lcom/chatpartygame/flutter/plugin/RacingCarGamePlugin;", "giftInfo", "Lcom/chatpartygame/flutter/model/SendGiftInfo;", "(Lcom/chatpartygame/flutter/model/SendGiftInfo;)V", "getGiftInfo", "()Lcom/chatpartygame/flutter/model/SendGiftInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "chatgameflutter_release"}, m1444k = 1, m1445mv = {1, 9, 0}, m1447xi = 48)
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-103-    public static final /* data */ class SendGift extends RacingCarGamePlugin {
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-104-
/tmp/jadx-out/sources/com/chatpartygame/flutter/plugin/RacingCarGamePlugin.java-105-        @NotNull
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-54-        if (handleCommonMethod(call, result)) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-55-            return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-56-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-57-        String str = call.f101426OooO00o;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-58-        Object obj = call.f101427OooO0O0;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-59-        if (str != null) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-60-            switch (str.hashCode()) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-61-                case -1858351398:
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java:62:                    if (str.equals("prizePoolClick")) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java:63:                        notify(FootballGamePlugin.PrizePool.INSTANCE);
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-64-                        return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-65-                    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-66-                    break;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-67-                case -1769294874:
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-68-                    if (str.equals("gameOver")) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-69-                        notify(FootballGamePlugin.GameOver.INSTANCE);
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-70-                        return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/FootballHandler.java-71-                    }
--
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-46-        if (handleCommonMethod(call, result)) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-47-            return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-48-        }
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-49-        String str = call.f101426OooO00o;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-50-        Object obj = call.f101427OooO0O0;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-51-        if (str != null) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-52-            switch (str.hashCode()) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-53-                case -1858351398:
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java:54:                    if (str.equals("prizePoolClick")) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java:55:                        notify(RacingCarGamePlugin.PrizePool.INSTANCE);
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-56-                        return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-57-                    }
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-58-                    break;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-59-                case -1769294874:
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-60-                    if (str.equals("gameOver")) {
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-61-                        notify(RacingCarGamePlugin.GameOver.INSTANCE);
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-62-                        return;
/tmp/jadx-out/sources/com/chatpartygame/flutter/handler/RacingCarHandler.java-63-                    }
--
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-1-package com.yalla.yalla.developer.screen;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-2-
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-3-import android.app.Activity;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-4-import android.content.Context;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-5-import com.code.android.util.o0o0Oo;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-6-import com.common.support.longlink.LongLink;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java:7:import com.yalla.yalla.model.ActivityCenterItemModel;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-8-import com.yalla.yalla.model.WebFrom;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-9-import com.yalla.yalla.module.moment.activity.TopicManagerActivity;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-10-import com.yalla.yalla.module.user.fragment.PremiumFragment;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-11-import com.yalla.yalla.p048ui.activity.main.WebActivity;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-12-import com.yalla.yalla.p048ui.p049vm.main.MainDialogVM;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-13-import com.yalla.yalla.util.WebPageInfo;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-14-import kotlin.Unit;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-15-import kotlin.jvm.functions.Function0;
--
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-32-    @Override // kotlin.jvm.functions.Function0
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-33-    public final Object invoke() {
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-34-        int i = this.f52562OooO0oO;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-35-        Object obj = this.f52563OooO0oo;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-36-        switch (i) {
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-37-            case 0:
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-38-                return RouteTestScreen.Content$lambda$33$lambda$29((Activity) obj);
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-39-            case 1:
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java:40:                ActivityCenterItemModel item = (ActivityCenterItemModel) obj;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-41-                Intrinsics.checkNotNullParameter(item, "$item");
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-42-                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.ActivityNotice);
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java:43:                webPageInfo.OooO0o0(item.getActivityUrl());
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-44-                webPageInfo.OooO0Oo(item.getTitle());
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-45-                WebPageInfo.ShareType.Companion companion = WebPageInfo.ShareType.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-46-                int isShare = item.getIsShare();
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-47-                companion.getClass();
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-48-                webPageInfo.OooO0OO(WebPageInfo.ShareType.Companion.OooO00o(isShare), item.getImageUrl(), item.getDescription());
/tmp/jadx-out/sources/com/yalla/yalla/developer/screen/o000OOo0.java-49-                we
```