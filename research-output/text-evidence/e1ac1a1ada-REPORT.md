# Yalla historical APK forensics — 2.28.0

Window: lucky-carnival-window

- version: 2.28.0
- label: lucky-carnival-window
- target_hit_files: 116
- relevant_source_files: 806
- target_images: 60
- urls: 796
- api_routes: 448

## Target context
```
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-11-public final class OooOo extends OooOOO<ChatMessage> {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-12-    public OooOo(YlAppDataBase ylAppDataBase) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-13-        super(ylAppDataBase);
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-14-    }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-15-
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-16-    @Override // androidx.room.SharedSQLiteStatement
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-17-    @NonNull
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-18-    public final String OooO0OO() {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java:19:        return "INSERT OR REPLACE INTO `ChatMessageTable` (`uid`,`mid`,`targetId`,`contentType`,`message`,`time`,`sendState`,`isWarn`,`isAcceptMsg`,`unknownMessage`,`voiceUrl`,`voiceDuration`,`voiceFileName`,`isVoiceRead`,`emoticonType`,`emoticonValue`,`emoticonIsRead`,`giftId`,`giftNumber`,`giftUrl`,`isGiftBlind`,`isGiftBlindBox`,`isGiftBackpack`,`isGiftCustomMade`,`isPreset`,`isGifText`,`gifId`,`gifUrl`,`roomHeader`,`roomName`,`roomId`,`roomIdx`,`roomIp`,`momentId`,`momentImage`,`momentText`,`momentMsg`,`momentType`,`topicId`,`topicImage`,`topicName`,`topicUserCount`,`topicMomentCount`,`topicMsg`,`shareUserId`,`shareUserIdx`,`shareUserHead`,`shareUserName`,`shareUserMessage`,`activityImage`,`activityText1`,`activityText2`,`activityMsg`,`activityUrl`,`invitationCode`,`recallOrRecruite`,`themeBgName`,`themeBgImgUrl`,`themeVideoUrl`,`themeDayLimit`,`themeExpireTime`,`themeGiveId`,`themeState`,`eventId`,`eventName`,`eventImageUrl`,`eventTagId`,`eventStartTime`,`eventEndTime`,`eventRoomId`,`eventRoomName`,`eventRoomIp`,`eventDeleted`,`imageUrl`,`imageFilePath`,`imageWidth`,`imageHeight`,`giftWallGiftId`,`giftWallNum`,`giftWallGiftIcon`,`giftWallExpire`,`giftWallPrice`,`giftWallIlluminateState`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-20-    }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-21-
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-22-    @Override // androidx.room.OooOOO
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-23-    public final void OooO0o0(@NonNull SupportSQLiteStatement supportSQLiteStatement, @NonNull ChatMessage chatMessage) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-24-        ChatMessage chatMessage2 = chatMessage;
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-25-        supportSQLiteStatement.bindLong(1, chatMessage2.getUid());
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-26-        if (chatMessage2.getMid() == null) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-27-            supportSQLiteStatement.bindNull(2);
--
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-244-            } else {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-245-                supportSQLiteStatement.bindString(52, shareActivityInfo.getActivityText2());
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-246-            }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-247-            if (shareActivityInfo.getActivityMsg() == null) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-248-                supportSQLiteStatement.bindNull(53);
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-249-            } else {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-250-                supportSQLiteStatement.bindString(53, shareActivityInfo.getActivityMsg());
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-251-            }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java:252:            if (shareActivityInfo.getActivityUrl() == null) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-253-                supportSQLiteStatement.bindNull(54);
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-254-            } else {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java:255:                supportSQLiteStatement.bindString(54, shareActivityInfo.getActivityUrl());
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-256-            }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-257-            if (shareActivityInfo.getInvitationCode() == null) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-258-                supportSQLiteStatement.bindNull(55);
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-259-            } else {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-260-                supportSQLiteStatement.bindString(55, shareActivityInfo.getInvitationCode());
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-261-            }
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-262-            if (shareActivityInfo.getRecallOrRecruite() == null) {
/tmp/jadx-out/sources/p409o0OOOo0O/OooOo.java-263-                supportSQLiteStatement.bindNull(56);
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-4-import android.view.View;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-5-import android.view.Window;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-6-import android.widget.ImageView;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-7-import androidx.compose.runtime.internal.StabilityInferred;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-8-import androidx.constraintlayout.widget.ConstraintLayout;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-9-import androidx.fragment.app.FragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-10-import com.code.android.util.o0000OO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-11-import com.yalla.yalla.model.WebFrom;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:12:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-13-import com.yalla.yalla.p042ui.activity.main.WebActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-14-import com.yalla.yalla.p042ui.view.AutoImage;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-15-import com.yalla.yalla.p044z.BaseDialog;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-16-import com.yalla.yalla.util.WebPageInfo;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-17-import com.yalla.yalla.util.log.Loger;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-18-import kotlin.Lazy;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-19-import kotlin.LazyKt;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-20-import kotlin.TuplesKt;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-36-    public final FragmentActivity f40439OooOO0O;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-37-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-38-    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-39-    @NotNull
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-40-    public final Lazy f40440OooOO0o;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-41-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-42-    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-43-    @Nullable
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:44:    public OfficialActionModel f40441OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-45-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-46-    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-47-    public MainDialogUserReturn(@NotNull FragmentActivity fragmentActivity) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-48-        super(fragmentActivity, 0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-49-        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-50-        this.f40439OooOO0O = fragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-51-        Lazy lazy = LazyKt.lazy(new Function0<o00oO0o>() { // from class: com.yalla.yalla.module.main.dialog.MainDialogUserReturn$binding$2
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-52-            {
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-77-                super(1);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-78-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-79-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-80-            @Override // kotlin.jvm.functions.Function1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-81-            public final Unit invoke(View view) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-82-                View it = view;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-83-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-84-                MainDialogUserReturn mainDialogUserReturn = MainDialogUserReturn.this;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:85:                OfficialActionModel officialActionModel = mainDialogUserReturn.f40441OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:86:                if (officialActionModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:87:                    p454o0Oo0O.OooO0o.OooO0OO("101049", MapsKt.mapOf(TuplesKt.m553to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m553to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m553to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-88-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-89-                mainDialogUserReturn.OooO0O0();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-90-                return Unit.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-91-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-92-        });
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-93-        AutoImage autoImage = ((o00oO0o) lazy.getValue()).f71380OooO0O0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-94-        Intrinsics.checkNotNullExpressionValue(autoImage, "autoImage");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-95-        o0000OO0.OooOO0(autoImage, new Function1<View, Unit>() { // from class: com.yalla.yalla.module.main.dialog.MainDialogUserReturn.2
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-98-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-99-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-100-            @Override // kotlin.jvm.functions.Function1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-101-            public final Unit invoke(View view) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-102-                View it = view;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-103-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-104-                MainDialogUserReturn mainDialogUserReturn = MainDialogUserReturn.this;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-105-                Loger.OooO00o("MainDialogUserReturn 活动 \nData:'" + mainDialogUserReturn.f40441OooOOO0 + "'");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:106:                OfficialActionModel officialActionModel = mainDialogUserReturn.f40441OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:107:                if (officialActionModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:108:                    p454o0Oo0O.OooO0o.OooO0OO("101048", MapsKt.mapOf(TuplesKt.m553to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m553to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m553to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java:109:                    String url = officialActionModel.getH5EntranceUrl();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-110-                    if (url != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-111-                        if (url.length() > 0) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-112-                            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-113-                            Intrinsics.checkNotNullParameter(url, "url");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-114-                            webPageInfo.f62761OooO0o0 = url;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-115-                            webPageInfo.f62758OooO = true;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-116-                            int i = WebActivity.f57811OooOoO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/dialog/MainDialogUserReturn.java-117-                            WebActivity.OooO00o.OooO00o(mainDialogUserReturn.f63011OooO0Oo, webPageInfo);
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-4-import android.view.View;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-5-import android.view.Window;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-6-import android.widget.ImageView;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-7-import androidx.compose.runtime.internal.StabilityInferred;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-8-import androidx.constraintlayout.widget.ConstraintLayout;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-9-import androidx.fragment.app.FragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-10-import com.code.android.util.o0000OO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-11-import com.yalla.yalla.model.WebFrom;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:12:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-13-import com.yalla.yalla.p042ui.activity.main.WebActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-14-import com.yalla.yalla.p042ui.view.AutoImage;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-15-import com.yalla.yalla.p044z.BaseDialog;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-16-import com.yalla.yalla.util.WebPageInfo;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-17-import com.yalla.yalla.util.log.Loger;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-18-import kotlin.Lazy;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-19-import kotlin.LazyKt;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-20-import kotlin.TuplesKt;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-37-    public final FragmentActivity f41252OooOO0O;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-38-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-39-    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-40-    @NotNull
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-41-    public final Lazy f41253OooOO0o;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-42-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-43-    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-44-    @Nullable
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:45:    public OfficialActionModel f41254OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-46-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-47-    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-48-    public MainDialogOfficialAction(@NotNull FragmentActivity fragmentActivity) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-49-        super(fragmentActivity, 0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-50-        Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-51-        this.f41252OooOO0O = fragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-52-        Lazy lazy = LazyKt.lazy(new Function0<o0Oo0oo>() { // from class: com.yalla.yalla.module.main.ui.dialog.MainDialogOfficialAction$binding$2
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-53-            {
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-78-                super(1);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-79-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-80-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-81-            @Override // kotlin.jvm.functions.Function1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-82-            public final Unit invoke(View view) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-83-                View it = view;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-84-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-85-                MainDialogOfficialAction mainDialogOfficialAction = MainDialogOfficialAction.this;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:86:                OfficialActionModel officialActionModel = mainDialogOfficialAction.f41254OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:87:                if (officialActionModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:88:                    OooO0o.OooO0OO("101049", MapsKt.mapOf(TuplesKt.m553to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m553to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m553to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-89-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-90-                mainDialogOfficialAction.OooO0O0();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-91-                return Unit.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-92-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-93-        });
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-94-        AutoImage autoImage = ((o0Oo0oo) lazy.getValue()).f72011OooO0O0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-95-        Intrinsics.checkNotNullExpressionValue(autoImage, "autoImage");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-96-        o0000OO0.OooOO0(autoImage, new Function1<View, Unit>() { // from class: com.yalla.yalla.module.main.ui.dialog.MainDialogOfficialAction.2
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-99-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-100-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-101-            @Override // kotlin.jvm.functions.Function1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-102-            public final Unit invoke(View view) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-103-                View it = view;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-104-                Intrinsics.checkNotNullParameter(it, "it");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-105-                MainDialogOfficialAction mainDialogOfficialAction = MainDialogOfficialAction.this;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-106-                Loger.OooO00o("OfficialActionDialog 活动 \nData:'" + mainDialogOfficialAction.f41254OooOOO0 + "'");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:107:                OfficialActionModel officialActionModel = mainDialogOfficialAction.f41254OooOOO0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:108:                if (officialActionModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:109:                    OooO0o.OooO0OO("101048", MapsKt.mapOf(TuplesKt.m553to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m553to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m553to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java:110:                    String url = officialActionModel.getH5EntranceUrl();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-111-                    if (url != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-112-                        if (url.length() > 0) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-113-                            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-114-                            Intrinsics.checkNotNullParameter(url, "url");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-115-                            webPageInfo.f62761OooO0o0 = url;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-116-                            webPageInfo.f62758OooO = true;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-117-                            int i = WebActivity.f57811OooOoO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/dialog/MainDialogOfficialAction.java-118-                            WebActivity.OooO00o.OooO00o(mainDialogOfficialAction.f63011OooO0Oo, webPageInfo);
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-49-import com.code.android.util.OooOo00;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-50-import com.yalla.yalla.common.module_service.IMainModuleService;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-51-import com.yalla.yalla.common.module_service.OooO00o;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-52-import com.yalla.yalla.common.module_service.OooOOO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-53-import com.yalla.yalla.ext.OooOOOO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-54-import com.yalla.yalla.ext.o000OOo;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-55-import com.yalla.yalla.manager.main.MainDialogManager$DialogType;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-56-import com.yalla.yalla.model.WebFrom;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:57:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-58-import com.yalla.yalla.p042ui.activity.main.WebActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-59-import com.yalla.yalla.p042ui.p043vm.main.MainRoomVM;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-60-import com.yalla.yalla.repository.Account;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-61-import com.yalla.yalla.util.WebPageInfo;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-62-import kotlin.TuplesKt;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-63-import kotlin.Unit;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-64-import kotlin.collections.MapsKt;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-65-import kotlin.jvm.functions.Function0;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-693-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-694-    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-695-    @Composable
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-696-    public final void OooO0Oo(final FragmentActivity fragmentActivity, final MainRoomVM mainRoomVM, Composer composer, final int i) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-697-        Composer composerStartRestartGroup = composer.startRestartGroup(-750958383);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-698-        if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-699-            ComposerKt.traceEventStart(-750958383, i, -1, "com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon.OfficialActionIcon (MainRoomActionIcon.kt:70)");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-700-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:701:        final OfficialActionModel officialActionModel = mainRoomVM.getOfficialActionModel();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:702:        if (officialActionModel != null && officialActionModel.getDefaultIsShowButton()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:703:            f40990OooO00o.OooO0OO(OooOo00.OooOOOO(officialActionModel.getEntranceImgUrl(), ""), OooOO0.icon_picture_default, new Function0<Unit>() { // from class: com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon$OfficialActionIcon$1$1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-704-                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-705-                {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-706-                    super(0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-707-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-708-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-709-                @Override // kotlin.jvm.functions.Function0
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-710-                public final Unit invoke() {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:711:                    final OfficialActionModel officialActionModel2 = officialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:712:                    officialActionModel2.getType();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-713-                    final FragmentActivity fragmentActivity2 = fragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-714-                    Function0<Unit> onLogin = new Function0<Unit>() { // from class: com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon$OfficialActionIcon$1$1.2
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-715-                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-716-                        {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-717-                            super(0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-718-                        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-719-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-720-                        @Override // kotlin.jvm.functions.Function0
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-721-                        public final Unit invoke() {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:722:                            String url = officialActionModel2.getH5EntranceUrl();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-723-                            if (url != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-724-                                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-725-                                Intrinsics.checkNotNullParameter(url, "url");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-726-                                webPageInfo.f62761OooO0o0 = url;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-727-                                webPageInfo.f62758OooO = true;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-728-                                int i2 = WebActivity.f57811OooOoO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-729-                                WebActivity.OooO00o.OooO00o(fragmentActivity2, webPageInfo);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-730-                            }
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-777-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-778-    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-779-    @Composable
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-780-    public final void OooO0o0(final FragmentActivity fragmentActivity, final MainRoomVM mainRoomVM, Composer composer, final int i) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-781-        Composer composerStartRestartGroup = composer.startRestartGroup(-453405385);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-782-        if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-783-            ComposerKt.traceEventStart(-453405385, i, -1, "com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon.UserReturnIcon (MainRoomActionIcon.kt:100)");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-784-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:785:        final OfficialActionModel userReturnModel = mainRoomVM.getUserReturnModel();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-786-        if (userReturnModel != null && userReturnModel.getDefaultIsShowButton()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-787-            f40990OooO00o.OooO0OO(OooOo00.OooOOOO(userReturnModel.getEntranceImgUrl(), ""), OooOO0.icon_picture_default, new Function0<Unit>() { // from class: com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon$UserReturnIcon$1$1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-788-                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-789-                {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-790-                    super(0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-791-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-792-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-793-                @Override // kotlin.jvm.functions.Function0
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-794-                public final Unit invoke() {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-795-                    OooO0o.OooO0O0("101050");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:796:                    final OfficialActionModel officialActionModel = userReturnModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-797-                    final FragmentActivity fragmentActivity2 = fragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-798-                    Function0<Unit> onLogin = new Function0<Unit>() { // from class: com.yalla.yalla.module.main.ui.comp.MainRoomActionIcon$UserReturnIcon$1$1.1
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-799-                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-800-                        {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-801-                            super(0);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-802-                        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-803-
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-804-                        @Override // kotlin.jvm.functions.Function0
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-805-                        public final Unit invoke() {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java:806:                            String url = officialActionModel.getH5EntranceUrl();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-807-                            if (url != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-808-                                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Unknow);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-809-                                Intrinsics.checkNotNullParameter(url, "url");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-810-                                webPageInfo.f62761OooO0o0 = url;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-811-                                webPageInfo.f62758OooO = true;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-812-                                int i2 = WebActivity.f57811OooOoO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-813-                                WebActivity.OooO00o.OooO00o(fragmentActivity2, webPageInfo);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/comp/MainRoomActionIcon.java-814-                            }
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-8-import androidx.compose.runtime.RecomposeScopeImplKt;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-9-import androidx.compose.runtime.ScopeUpdateScope;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-10-import androidx.fragment.app.FragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-11-import androidx.lifecycle.MutableLiveData;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-12-import com.code.android.util.OooOo00;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-13-import com.yalla.yalla.common.module_service.IMainModuleService;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-14-import com.yalla.yalla.common.module_service.OooOOO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-15-import com.yalla.yalla.manager.main.MainDialogManager$DialogType;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:16:import com.yalla.yalla.model.user.OfficialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-17-import com.yalla.yalla.module.main.dialog.MainDialogBindYallaChat;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-18-import com.yalla.yalla.module.main.dialog.MainDialogClock;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-19-import com.yalla.yalla.module.main.dialog.MainDialogUserReturn;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-20-import com.yalla.yalla.module.main.p030ui.dialog.MainDialogOfficialAction;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-21-import com.yalla.yalla.p042ui.p043vm.main.MainRoomVM;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-22-import com.yalla.yalla.p042ui.view.AutoImage;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-23-import com.yalla.yalla.repository.Account;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-24-import kotlin.TuplesKt;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-88-    public static final void OooO0O0(@NotNull final FragmentActivity activity, @NotNull final MainRoomVM vm, @NotNull final Function0<Unit> onShow, @Nullable Composer composer, final int i) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-89-        Intrinsics.checkNotNullParameter(activity, "activity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-90-        Intrinsics.checkNotNullParameter(vm, "vm");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-91-        Intrinsics.checkNotNullParameter(onShow, "onShow");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-92-        Composer composerStartRestartGroup = composer.startRestartGroup(1056342818);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-93-        if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-94-            ComposerKt.traceEventStart(1056342818, i, -1, "com.yalla.yalla.module.main.ui.maindialog.OfficialActionDialog (MainDialogs.kt:40)");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-95-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:96:        final OfficialActionModel officialActionModel = vm.getOfficialActionModel();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:97:        if (officialActionModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:98:            if (!officialActionModel.getDefaultIsShowDialog()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-99-                if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-100-                    ComposerKt.traceEventEnd();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-101-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-102-                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-103-                if (scopeUpdateScopeEndRestartGroup == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-104-                    return;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-105-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-106-                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.main.ui.maindialog.MainDialogsKt$OfficialActionDialog$1$1
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-116-                        MainRoomVM mainRoomVM = vm;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-117-                        Function0<Unit> function0 = onShow;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-118-                        MainDialogsKt.OooO0O0(activity, mainRoomVM, function0, composer2, iUpdateChangedFlags);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-119-                        return Unit.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-120-                    }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-121-                });
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-122-                return;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-123-            }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:124:            if (!officialActionModel.getDefaultIsShowPopUp()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-125-                if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-126-                    ComposerKt.traceEventEnd();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-127-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-128-                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-129-                if (scopeUpdateScopeEndRestartGroup2 == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-130-                    return;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-131-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-132-                scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.module.main.ui.maindialog.MainDialogsKt$OfficialActionDialog$1$2
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-158-                public final Unit invoke(DialogInterface dialogInterface) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-159-                    Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-160-                    IMainModuleService iMainModuleService = OooOOO.f35710OooO0OO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-161-                    if (iMainModuleService == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-162-                        Intrinsics.throwUninitializedPropertyAccessException("main");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-163-                        iMainModuleService = null;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-164-                    }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-165-                    iMainModuleService.OooOOO0(MainDialogManager$DialogType.OFFICIAL_ACTION);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:166:                    OfficialActionModel officialActionModel2 = officialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:167:                    officialActionModel2.setShowPopUp(false);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:168:                    officialActionModel2.refresh();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-169-                    return Unit.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-170-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-171-            });
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:172:            mainDialogOfficialAction.f41254OooOOO0 = officialActionModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-173-            AutoImage autoImage = ((o0Oo0oo) mainDialogOfficialAction.f41253OooOO0o.getValue()).f72011OooO0O0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-174-            autoImage.getClass();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-175-            FragmentActivity fragmentActivity = mainDialogOfficialAction.f41252OooOO0O;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-176-            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-177-            autoImage.f60874OooO0oO = fragmentActivity;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-178-            autoImage.f60870OooO = 16;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-179-            autoImage.f60877OooOO0O = Boolean.TRUE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-180-            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-181-            Intrinsics.checkNotNullParameter(scaleType, "scaleType");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-182-            autoImage.f60876OooOO0 = scaleType;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-183-            autoImage.f60875OooO0oo = OooOO0.icon_picture_default;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:184:            autoImage.OooO00o(OooOo00.OooOOOO(officialActionModel.getPopUpImgUrl(), ""));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:185:            OooO0o.OooO0OO("301005", MapsKt.mapOf(TuplesKt.m553to("url", officialActionModel.getH5EntranceUrl()), TuplesKt.m553to("type", Integer.valueOf(officialActionModel.getType())), TuplesKt.m553to("activity", Integer.valueOf(officialActionModel.getActivityId()))));
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-186-            mainDialogOfficialAction.OooO();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-187-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-188-        if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-189-            ComposerKt.traceEventEnd();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-190-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-191-        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-192-        if (scopeUpdateScopeEndRestartGroup3 == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-193-            return;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-262-    @Composable
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-263-    public static final void OooO0Oo(@NotNull final FragmentActivity activity, @NotNull final MainRoomVM vm, @Nullable Composer composer, final int i) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-264-        Intrinsics.checkNotNullParameter(activity, "activity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-265-        Intrinsics.checkNotNullParameter(vm, "vm");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-266-        Composer composerStartRestartGroup = composer.startRestartGroup(-52165932);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-267-        if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-268-            ComposerKt.traceEventStart(-52165932, i, -1, "com.yalla.yalla.module.main.ui.maindialog.UserReturnDialog (MainDialogs.kt:17)");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-269-        }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:270:        final OfficialActionModel userReturnModel = vm.getUserReturnModel();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-271-        if (userReturnModel != null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-272-            if (!userReturnModel.getDefaultIsShowDialog()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-273-                if (ComposerKt.isTraceInProgress()) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-274-                    ComposerKt.traceEventEnd();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-275-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-276-                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-277-                if (scopeUpdateScopeEndRestartGroup == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-278-                    return;
--
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-327-                public final Unit invoke(DialogInterface dialogInterface) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-328-                    Intrinsics.checkNotNullParameter(dialogInterface, "<anonymous parameter 0>");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-329-                    IMainModuleService iMainModuleService = OooOOO.f35710OooO0OO;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-330-                    if (iMainModuleService == null) {
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-331-                        Intrinsics.throwUninitializedPropertyAccessException("main");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-332-                        iMainModuleService = null;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-333-                    }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-334-                    iMainModuleService.OooOOO0(MainDialogManager$DialogType.USER_RETURN);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:335:                    OfficialActionModel officialActionModel = userReturnModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:336:                    officialActionModel.setShowPopUp(false);
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java:337:                    officialActionModel.refresh();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-338-                    return Unit.INSTANCE;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-339-                }
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-340-            });
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-341-            mainDialogUserReturn.f40441OooOOO0 = userReturnModel;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-342-            AutoImage autoImage = ((o00oO0o) mainDialogUserReturn.f40440OooOO0o.getValue()).f71380OooO0O0;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-343-            autoImage.getClass();
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-344-            FragmentActivity fragmentActivity = mainDialogUserReturn.f40439OooOO0O;
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-345-            Intrinsics.checkNotNullParameter(fragmentActivity, "fragmentActivity");
/tmp/jadx-out/sources/com/yalla/yalla/module/main/p030ui/maindialog/MainDialogsKt.java-346-            a
```