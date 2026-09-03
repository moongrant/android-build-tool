package p533o0o0Oo0;

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
import com.code.android.util.o000O0;
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
import p158o00OoOOO.oo000o;
import p377o0OOoOo.o000O000;
import p420o0OoO0OO.o0OO00O;
import p464o0Oooo.o000000O;
import p475o0o000.o000oOoO;
import p475o0o000.oo0o0Oo;
import p507o0o00ooo.v0;
import p519o0o0O0oO.q2;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p669oO0Oo.o000O00;
import p669oO0Oo.o000Oo0;
import p669oO0Oo.o0O00O0o;
import p669oO0Oo.o0OO0oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLiveRoomScreenDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,124:1\n81#2,11:125\n81#2,11:136\n76#3:147\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs\n*L\n37#1:125,11\n38#1:136,11\n39#1:147\n*E\n"})
public final class o0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000O f54670OooO00o = new o0000O();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f54671OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54672OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f54673OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f54671OooO0Oo = liveRoomVM;
            this.f54673OooO0o0 = o0o0ooo0;
            this.f54672OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO00O<ApiResult<Object>> o0oo00oFollowRoom = this.f54671OooO0Oo.followRoom(false);
            v0.OooO0O0(o0oo00oFollowRoom, this.f54673OooO0o0, false, 6);
            o000O000.OooO0Oo(o0oo00oFollowRoom, this.f54672OooO0o, false, null, null, o000OO.f54718OooO0Oo, 14);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54674OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24977OooO0o.f47438OooO0O0.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenDialogs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenDialogs.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenDialogs$OnDialog$11\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,124:1\n1#2:125\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f54675OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity context2 = com.code.android.util.OooO0O0.OooO0O0();
            if (context2 != null) {
                int i = PurchaseLockRoomActivity.f26240OooOo0o;
                Intrinsics.checkNotNullParameter(context2, "context");
                context2.startActivity(new Intent(context2, (Class<?>) PurchaseLockRoomActivity.class));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54676OooO0Oo = new OooO0OO();

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
        public final /* synthetic */ int f54678OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(2);
            this.f54678OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54678OooO0o0 | 1);
            o0000O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54679OooO0Oo = new OooOO0();

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
        public static final OooOO0O f54680OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String userid = String.valueOf(o000000O.OooOOo0().getValue());
            Intrinsics.checkNotNullParameter(userid, "userid");
            Intrinsics.checkNotNullParameter(AppEventsConstants.EVENT_PARAM_VALUE_NO, "followtype");
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10022, "{\"userid\":" + userid + ",\"followtype\":0}");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f54681OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String jsonStr = String.valueOf(((Number) com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47527OooOo0O.getValue()).longValue());
            Intrinsics.checkNotNullParameter(jsonStr, "jsonStr");
            RoomLiveService roomLiveService = RoomLiveService.f25058OooOo00;
            if (roomLiveService != null) {
                roomLiveService.OooO0oO(10022, "{\"userid\":" + jsonStr + "}");
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f54682OooO0Oo = new OooOOO0();

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
        public static final OooOOOO f54683OooO0Oo = new OooOOOO();

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
        public static final OooOo f54684OooO0Oo = new OooOo();

        public OooOo() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o000oOoO o000oooo2 = com.yalla.yalla.service.room.OooO00o.f24977OooO0o;
            if (((WebPageInfo) o000oooo2.f47439OooO0OO.getValue()).f32817OooO0Oo == WebFrom.ActivityNotice) {
                o0OO000.OooO0O0("101050", MapsKt.mapOf(new Pair("activity", ((WebPageInfo) o000oooo2.f47439OooO0OO.getValue()).f32829OooOOo0)));
            }
            o000oooo2.OooO0Oo(WebPageInfo.f32815OooOOo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f54685OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47528OooOo0o.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f54686OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47387OooOOo0.setValue(Boolean.FALSE);
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
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            oo000o.OooO0Oo(oo0o0oo.f47529OooOoO, StringResources_androidKt.stringResource(oO00OOo0.Unfollow, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.un_follow_content, composerStartRestartGroup, 0), null, false, false, null, null, StringResources_androidKt.stringResource(oO00OOo0.Confirm, composerStartRestartGroup, 0), false, null, false, new OooO(liveRoomVM, (o0O0OOO0) viewModel2, lifecycleOwner), null, false, false, null, OooOO0.f54679OooO0Oo, null, null, composerStartRestartGroup, 0, 12582912, 913144);
            oo000o.OooO0Oo(oo0o0oo.f47526OooOo00, StringResources_androidKt.stringResource(oO00OOo0.Unjoin_the_Member_Group, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.unjoin_the_member_group_tip, composerStartRestartGroup, 0), null, false, false, null, null, null, false, null, false, OooOO0O.f54680OooO0Oo, null, false, false, null, OooOOO0.f54682OooO0Oo, null, null, composerStartRestartGroup, 0, 12583296, 913400);
            oo000o.OooO0Oo(oo0o0oo.f47525OooOo0, StringResources_androidKt.stringResource(oO00OOo0.Remove_Member, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(oO00OOo0.remove_member_tip, composerStartRestartGroup, 0), null, false, false, null, null, StringResources_androidKt.stringResource(oO00OOo0.Remove, composerStartRestartGroup, 0), false, null, false, OooOOO.f54681OooO0Oo, null, false, false, null, OooOOOO.f54683OooO0Oo, null, null, composerStartRestartGroup, 0, 12583296, 913144);
            oo000o.OooO0Oo(oo0o0oo.f47528OooOo0o, StringResources_androidKt.stringResource(oO00OOo0.room_member_convene_dialog_title, composerStartRestartGroup, 0), o0OoOo0.OooO00o(o0000.OooO0OO(oO00OOo0.room_member_convene_dialog_info1), "\n", o0000.OooO0OO(oO00OOo0.room_member_convene_dialog_info2)), null, false, false, null, null, null, false, null, false, OooOo00.f54685OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044472);
            q2 q2Var = q2.f53094OooO00o;
            o000oOoO o000oooo2 = com.yalla.yalla.service.room.OooO00o.f24977OooO0o;
            q2Var.OooO00o((WebPageInfo) o000oooo2.f47439OooO0OO.getValue(), OooOo.f54684OooO0Oo, composerStartRestartGroup, 440);
            o0O00O0o.f60602OooO00o.OooO00o(composerStartRestartGroup, 6);
            o0OO0oO0.f60705OooO00o.OooO00o(composerStartRestartGroup, 6);
            o000Oo0.f60514OooO00o.OooO00o(composerStartRestartGroup, 6);
            o000O00.f60457OooO00o.OooO00o(composerStartRestartGroup, 6);
            oo000o.OooO0Oo(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47387OooOOo0, null, o0000.OooO0OO(oO00OOo0.apply_mic_is_turned_off), null, false, false, null, null, null, false, null, false, Oooo000.f54686OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044474);
            oo000o.OooO0Oo(o000oooo2.f47438OooO0O0, null, o0000.OooO0OO(oO00OOo0.login_error_tips), null, false, false, null, null, null, false, null, false, OooO00o.f54674OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, 0, 384, 1044474);
            composer2 = composerStartRestartGroup;
            oo000o.OooO0Oo(com.yalla.yalla.service.room.OooO00o.f24991OooOo0.f47433OooO0OO, null, StringResources_androidKt.stringResource(oO00OOo0.You_have_not_purchased_Room_Lock_yet_confirm_to_buy, composer2, 0), null, false, false, null, null, null, false, null, false, OooO0O0.f54675OooO0Oo, null, false, false, null, OooO0OO.f54676OooO0Oo, null, null, composer2, 0, 12583296, 913402);
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
