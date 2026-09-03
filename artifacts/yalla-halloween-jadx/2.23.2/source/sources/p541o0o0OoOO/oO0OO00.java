package p541o0o0OoOO;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.facebook.appevents.AppEventsConstants;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.service.room.RoomLiveService;
import com.yalla.yalla.ui.activity.moment.PurchaseLockRoomActivity;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import com.yalla.yalla.util.WebPageInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO0.o0OoOo0;
import p207o00o0oO0.o000O0Oo;
import p384o0OOoo0O.o00O0O;
import p424o0OoO0Oo.o00OO0O0;
import p475o0Ooooo0.o0O00oO0;
import p483o0o000Oo.o0000Ooo;
import p483o0o000Oo.o0Oo0oo;
import p516o0o0O00o.o0oOO;
import p540o0o0OoO0.o0O00O0o;
import p540o0o0OoO0.o0OoO00O;
import p540o0o0OoO0.oO0O00oO;
import p540o0o0OoO0.ooOOOOoo;
import p562o0oOo000.o000000;
import p577o0oOoOo.o0oOo0O0;
import p650o0ooo.q2;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,124:1\n81#2,11:125\n81#2,11:136\n76#3:147\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs\n*L\n37#1:125,11\n38#1:136,11\n39#1:147\n*E\n"})
public final class oO0OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0OO00 f55113OooO00o = new oO0OO00();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f55114OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55115OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f55116OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f55114OooO0Oo = liveRoomVM;
            this.f55116OooO0o0 = o0ooo0o1;
            this.f55115OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o00OO0O0<ApiResult<Object>> o00oo0o0FollowRoom = this.f55114OooO0Oo.followRoom(false);
            o0oOO.OooO0O0(o00oo0o0FollowRoom, this.f55116OooO0o0, false, 6);
            o00O0O.OooO0Oo(o00oo0o0FollowRoom, this.f55115OooO0o, false, null, null, ooo0o.f55335OooO0Oo, 14);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55117OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24515OooO0o.f48650OooO0O0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs$OnDialog$11\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55118OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
            if (context2 != null) {
                int i = PurchaseLockRoomActivity.f25791OooOo0o;
                Intrinsics.checkNotNullParameter(context2, "context");
                context2.startActivity(new Intent(context2, (Class<?>) PurchaseLockRoomActivity.class));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55119OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55121OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f55121OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55121OooO0o0 | 1);
            oO0OO00.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55122OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f55123OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            String userid = String.valueOf(o0O00oO0.OooOOo0().getValue());
            Intrinsics.checkNotNullParameter(userid, "userid");
            Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "followtype");
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10022, "{\"userid\":" + userid + ",\"followtype\":0}");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f55124OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String jsonStr = String.valueOf(((Number) com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48540OooOo0O.getValue()).longValue());
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            RoomLiveService roomLiveService = RoomLiveService.f24596OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10022, "{\"userid\":" + jsonStr + "}");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f55125OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOOO f55126OooO0Oo = new OooOOOO();

        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f55127OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0Oo0oo o0oo0oo2 = com.yalla.yalla.service.room.OooO00o.f24515OooO0o;
            if (((WebPageInfo) o0oo0oo2.f48651OooO0OO.getValue()).f32281OooO0Oo == WebFrom.ActivityNotice) {
                o0oo0000.OooO00o.OooO0OO("101050", MapsKt.mapOf(new Pair("activity", ((WebPageInfo) o0oo0oo2.f48651OooO0OO.getValue()).f32293OooOOo0)));
            }
            o0oo0oo2.OooO0Oo(WebPageInfo.f32279OooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f55128OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48541OooOo0o.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f55129OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48592OooOOo0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(162236607);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(162236607, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenDialogs.OnDialog (LiveRoomScreenDialogs.kt:35)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(LiveRoomVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LiveRoomVM liveRoomVM = (LiveRoomVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
            o000O0Oo.OooO0Oo(o0000ooo.f48542OooOoO, StringResources_androidKt.stringResource(o000000.Unfollow, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.un_follow_content, composerStartRestartGroup, 0), null, false, false, null, null, StringResources_androidKt.stringResource(o000000.Confirm, composerStartRestartGroup, 0), false, null, false, new OooO(liveRoomVM, (o0oOo0O0) viewModel2, lifecycleOwner), null, false, false, null, OooOO0.f55122OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913144);
            o000O0Oo.OooO0Oo(o0000ooo.f48539OooOo00, StringResources_androidKt.stringResource(o000000.Unjoin_the_Member_Group, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.unjoin_the_member_group_tip, composerStartRestartGroup, 0), null, false, false, null, null, null, false, null, false, OooOO0O.f55123OooO0Oo, null, false, false, null, OooOOO0.f55125OooO0Oo, null, null, composerStartRestartGroup, 0, 12583296, 913400);
            o000O0Oo.OooO0Oo(o0000ooo.f48538OooOo0, StringResources_androidKt.stringResource(o000000.Remove_Member, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.remove_member_tip, composerStartRestartGroup, 0), null, false, false, null, null, StringResources_androidKt.stringResource(o000000.Remove, composerStartRestartGroup, 0), false, null, false, OooOOO.f55124OooO0Oo, null, false, false, null, OooOOOO.f55126OooO0Oo, null, null, composerStartRestartGroup, 0, 12583296, 913144);
            o000O0Oo.OooO0Oo(o0000ooo.f48541OooOo0o, StringResources_androidKt.stringResource(o000000.room_member_convene_dialog_title, composerStartRestartGroup, 0), o0OoOo0.OooO0O0(o0000.OooO0OO(o000000.room_member_convene_dialog_info1), "\n", o0000.OooO0OO(o000000.room_member_convene_dialog_info2)), null, false, false, null, null, null, false, null, false, OooOo00.f55128OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044472);
            q2 q2Var = q2.f59127OooO00o;
            o0Oo0oo o0oo0oo2 = com.yalla.yalla.service.room.OooO00o.f24515OooO0o;
            q2Var.OooO00o((WebPageInfo) o0oo0oo2.f48651OooO0OO.getValue(), OooOo.f55127OooO0Oo, composerStartRestartGroup, 440);
            ooOOOOoo.f55062OooO00o.OooO00o(composerStartRestartGroup, 6);
            oO0O00oO.f54964OooO00o.OooO00o(composerStartRestartGroup, 6);
            o0OoO00O.f54866OooO00o.OooO00o(composerStartRestartGroup, 6);
            o0O00O0o.f54749OooO00o.OooO00o(composerStartRestartGroup, 6);
            o000O0Oo.OooO0Oo(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48592OooOOo0, null, o0000.OooO0OO(o000000.apply_mic_is_turned_off), null, false, false, null, null, null, false, null, false, Oooo000.f55129OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044474);
            o000O0Oo.OooO0Oo(o0oo0oo2.f48650OooO0O0, null, o0000.OooO0OO(o000000.login_error_tips), null, false, false, null, null, null, false, null, false, OooO00o.f55117OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044474);
            composer2 = composerStartRestartGroup;
            o000O0Oo.OooO0Oo(com.yalla.yalla.service.room.OooO00o.f24529OooOo0.f48502OooO0OO, null, StringResources_androidKt.stringResource(o000000.You_have_not_purchased_Room_Lock_yet_confirm_to_buy, composer2, 0), null, false, false, null, null, null, false, null, false, OooO0O0.f55118OooO0Oo, null, false, false, null, OooO0OO.f55119OooO0Oo, null, null, composer2, 0, 12583296, 913402);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(i));
    }
}
