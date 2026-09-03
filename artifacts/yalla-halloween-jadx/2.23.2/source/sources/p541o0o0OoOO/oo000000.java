package p541o0o0OoOO;

import android.content.DialogInterface;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.LocalSoftwareKeyboardController;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.code.android.util.o000O;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.model.room.RoomError1051;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.dialog.RoomBlackListUnJoinAndUnFollowDialog;
import java.util.ArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p207o00o0oO0.o000O0Oo;
import p429o0OoOO.o0Oo0oo;
import p540o0o0OoO0.oOO00OO;
import p540o0o0OoO0.oOo0oooO;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLiveScreenConnectState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLiveScreenConnectState.kt\ncom/yalla/yalla/ui/screen/room/live/RoomLiveScreenConnectState\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,172:1\n76#2:173\n36#3:174\n25#3:181\n25#3:188\n25#3:195\n36#3:202\n1097#4,6:175\n1097#4,6:182\n1097#4,6:189\n1097#4,6:196\n1097#4,6:203\n*S KotlinDebug\n*F\n+ 1 RoomLiveScreenConnectState.kt\ncom/yalla/yalla/ui/screen/room/live/RoomLiveScreenConnectState\n*L\n48#1:173\n93#1:174\n107#1:181\n123#1:188\n158#1:195\n168#1:202\n93#1:175,6\n107#1:182,6\n123#1:189,6\n158#1:196,6\n168#1:203,6\n*E\n"})
public final class oo000000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo000000 f55314OooO00o = new oo000000();

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55315OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55317OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i) {
            super(2);
            this.f55317OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55317OooO0o0 | 1);
            oo000000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState$Content$2", f = "RoomLiveScreenConnectState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f55318OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomError1051 f55319OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<DialogInterface, Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f55320OooO0Oo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(DialogInterface dialogInterface) {
                DialogInterface it = dialogInterface;
                Intrinsics.checkNotNullParameter(it, "it");
                MutableState mutableState = o0Oo0oo.f46817OooO00o;
                o0Oo0oo.OooO00o();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(FragmentActivity fragmentActivity, RoomError1051 roomError1051, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f55318OooO0Oo = fragmentActivity;
            this.f55319OooO0o0 = roomError1051;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f55318OooO0Oo, this.f55319OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RoomBlackListUnJoinAndUnFollowDialog roomBlackListUnJoinAndUnFollowDialog = new RoomBlackListUnJoinAndUnFollowDialog(this.f55318OooO0Oo);
            RoomError1051 roomError1051 = this.f55319OooO0o0;
            boolean isJoined = roomError1051.getIsJoined();
            boolean isFollowed = roomError1051.getIsFollowed();
            TextView tvTitle = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44397OooO0oo;
            Intrinsics.checkNotNullExpressionValue(tvTitle, "tvTitle");
            o000O.OooO0O0(tvTitle);
            TextView textView = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44396OooO0oO;
            int i = o000000.BlackList_UnJoin_And_UnFollow_Title;
            textView.setText(o0000.OooO0OO(i));
            Button btUnJoinAndUnFollow = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44394OooO0o;
            Intrinsics.checkNotNullExpressionValue(btUnJoinAndUnFollow, "btUnJoinAndUnFollow");
            o000O.OooO0O0(btUnJoinAndUnFollow);
            Button btUnJoin = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44395OooO0o0;
            Intrinsics.checkNotNullExpressionValue(btUnJoin, "btUnJoin");
            o000O.OooO0O0(btUnJoin);
            Button btUnFollow = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44393OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(btUnFollow, "btUnFollow");
            o000O.OooO0O0(btUnFollow);
            TextView btOk = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44392OooO0OO;
            Intrinsics.checkNotNullExpressionValue(btOk, "btOk");
            o000O.OooO0O0(btOk);
            if (isJoined && isFollowed) {
                roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44396OooO0oO.setText(o0000.OooO0OO(i));
                Button btUnJoinAndUnFollow2 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44394OooO0o;
                Intrinsics.checkNotNullExpressionValue(btUnJoinAndUnFollow2, "btUnJoinAndUnFollow");
                o000O.OooOOOO(btUnJoinAndUnFollow2);
                Button btUnJoin2 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44395OooO0o0;
                Intrinsics.checkNotNullExpressionValue(btUnJoin2, "btUnJoin");
                o000O.OooOOOO(btUnJoin2);
            } else if (isJoined) {
                roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44396OooO0oO.setText(o0000.OooO0OO(i));
                Button btUnJoin3 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44395OooO0o0;
                Intrinsics.checkNotNullExpressionValue(btUnJoin3, "btUnJoin");
                o000O.OooOOOO(btUnJoin3);
            } else if (isFollowed) {
                roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44396OooO0oO.setText(o0000.OooO0OO(o000000.BlackList_UnFollow_Title));
                Button btUnFollow2 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44393OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(btUnFollow2, "btUnFollow");
                o000O.OooOOOO(btUnFollow2);
            } else {
                ImageView btCancel = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44391OooO0O0;
                Intrinsics.checkNotNullExpressionValue(btCancel, "btCancel");
                o000O.OooO0O0(btCancel);
                TextView tvTitle2 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44397OooO0oo;
                Intrinsics.checkNotNullExpressionValue(tvTitle2, "tvTitle");
                o000O.OooOOOO(tvTitle2);
                roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44397OooO0oo.setText(o0000.OooO0OO(o000000.room_ban_title));
                roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44396OooO0oO.setText(o0000.OooO0OO(o000000.room_ban_toast));
                TextView btOk2 = roomBlackListUnJoinAndUnFollowDialog.OooOO0().f44392OooO0OO;
                Intrinsics.checkNotNullExpressionValue(btOk2, "btOk");
                o000O.OooOOOO(btOk2);
            }
            roomBlackListUnJoinAndUnFollowDialog.OooO00o(OooO00o.f55320OooO0Oo);
            roomBlackListUnJoinAndUnFollowDialog.OooO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55321OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f55322OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(FragmentActivity fragmentActivity) {
            super(0);
            this.f55322OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            int i = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(this.f55322OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55323OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0O f55324OooO0Oo = new OooOO0O();

        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO f55325OooO0Oo = new OooOOO();

        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            o0Oo0oo.OooO00o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55327OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i) {
            super(2);
            this.f55327OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55327OooO0o0 | 1);
            oo000000.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState$ErrorTipDialog$2$1", f = "RoomLiveScreenConnectState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SoftwareKeyboardController f55328OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(SoftwareKeyboardController softwareKeyboardController, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f55328OooO0Oo = softwareKeyboardController;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f55328OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SoftwareKeyboardController softwareKeyboardController = this.f55328OooO0Oo;
            if (softwareKeyboardController != null) {
                softwareKeyboardController.hide();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f55330OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f55331OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55332OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f55333OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(String str, String str2, int i, int i2) {
            super(2);
            this.f55331OooO0o0 = str;
            this.f55330OooO0o = str2;
            this.f55332OooO0oO = i;
            this.f55333OooO0oo = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oo000000.this.OooO0O0(this.f55331OooO0o0, this.f55330OooO0o, composer, RecomposeScopeImplKt.updateChangedFlags(this.f55332OooO0oO | 1), this.f55333OooO0oo);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:141:0x0463  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-463181827);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463181827, i2, -1, "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState.Content (RoomLiveScreenConnectState.kt:46)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            FragmentActivity fragmentActivity = (FragmentActivity) objConsume;
            composerStartRestartGroup.startReplaceableGroup(-1581286587);
            MutableState mutableState = o0Oo0oo.f46817OooO00o;
            if (o0Oo0oo.OooO0oO() == RoomState.Hook) {
                ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
                if (com.yalla.yalla.service.room.OooO00o.OooO0OO() instanceof com.yalla.yalla.service.room.OooO0OO.OooO00o) {
                    com.yalla.yalla.service.room.OooO0OO OooO0OO2 = com.yalla.yalla.service.room.OooO00o.OooO0OO();
                    com.yalla.yalla.service.room.OooO0OO.OooO00o oooO00o = OooO0OO2 instanceof com.yalla.yalla.service.room.OooO0OO.OooO00o ? (com.yalla.yalla.service.room.OooO0OO.OooO00o) OooO0OO2 : null;
                    if (oooO00o != null && oooO00o.f24588OooO00o == 1011) {
                        OooO0O0(StringResources_androidKt.stringResource(o000000.room_ban_toast, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.room_ban_title, composerStartRestartGroup, 0), composerStartRestartGroup, (i2 << 6) & 896, 0);
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(i));
                return;
            }
            composerStartRestartGroup.endReplaceableGroup();
            ArrayList arrayList2 = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            com.yalla.yalla.service.room.OooO0OO OooO0OO3 = com.yalla.yalla.service.room.OooO00o.OooO0OO();
            if (Intrinsics.areEqual(OooO0OO3, com.yalla.yalla.service.room.OooO0OO.OooO0o.f24593OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(-1581285829);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (Intrinsics.areEqual(OooO0OO3, com.yalla.yalla.service.room.OooO0OO.OooO0O0.f24590OooO00o)) {
                composerStartRestartGroup.startReplaceableGroup(-1581285782);
                oOO00OO.f55015OooO00o.OooO00o(composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                if (OooO0OO3 instanceof com.yalla.yalla.service.room.OooO0OO.AbstractC0317OooO0OO) {
                    composerStartRestartGroup.startReplaceableGroup(-1581285668);
                    oOo0oooO.f55031OooO00o.OooO00o(composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (OooO0OO3 instanceof com.yalla.yalla.service.room.OooO0OO.OooO00o) {
                    composerStartRestartGroup.startReplaceableGroup(-1581285546);
                    com.yalla.yalla.service.room.OooO0OO OooO0OO4 = com.yalla.yalla.service.room.OooO00o.OooO0OO();
                    com.yalla.yalla.service.room.OooO0OO.OooO00o oooO00o2 = OooO0OO4 instanceof com.yalla.yalla.service.room.OooO0OO.OooO00o ? (com.yalla.yalla.service.room.OooO0OO.OooO00o) OooO0OO4 : null;
                    Integer numValueOf = oooO00o2 != null ? Integer.valueOf(oooO00o2.f24588OooO00o) : null;
                    if (numValueOf != null && numValueOf.intValue() == 3) {
                        composerStartRestartGroup.startReplaceableGroup(-1581285341);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf != null && numValueOf.intValue() == 1026) {
                        composerStartRestartGroup.startReplaceableGroup(-1581285262);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
                        composerStartRestartGroup.startReplaceableGroup(-1581285187);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.Network_connection_lost, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf != null && numValueOf.intValue() == 2002) {
                        composerStartRestartGroup.startReplaceableGroup(-1581285071);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.Network_connection_lost, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf == null) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284978);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.net_connection_error, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284863);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.net_connection_error, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1004) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284746);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.microom_code_1004, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1014) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284622);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.microom_code_1014, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1015) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284509);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.microom_code_1015, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1006) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284390);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.microom_code_1006, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1055) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284276);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.room_ban_title, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1024) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284162);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.login_error_tips, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (numValueOf.intValue() == 1011) {
                        composerStartRestartGroup.startReplaceableGroup(-1581284051);
                        OooO0O0(StringResources_androidKt.stringResource(o000000.room_ban_toast, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.room_ban_title, composerStartRestartGroup, 0), composerStartRestartGroup, (i2 << 6) & 896, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        if (numValueOf.intValue() == 1051) {
                            composerStartRestartGroup.startReplaceableGroup(-1581283845);
                            String str = oooO00o2.f24589OooO0O0;
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            boolean zChanged = composerStartRestartGroup.changed(str);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                String str2 = oooO00o2.f24589OooO0O0;
                                objRememberedValue = str2 != null ? (RoomError1051) p187o00o00o0.OooO.OooO0O0(RoomError1051.class, str2) : null;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            RoomError1051 roomError1051 = (RoomError1051) objRememberedValue;
                            if (roomError1051 != null) {
                                composerStartRestartGroup.startReplaceableGroup(-1581283630);
                                EffectsKt.LaunchedEffect(roomError1051, new OooO0O0(fragmentActivity, roomError1051, null), composerStartRestartGroup, 72);
                                composerStartRestartGroup.endReplaceableGroup();
                            } else {
                                composerStartRestartGroup.startReplaceableGroup(-1581283208);
                                OooO0O0(StringResources_androidKt.stringResource(o000000.net_connection_error, composerStartRestartGroup, 0), null, composerStartRestartGroup, (i2 << 6) & 896, 2);
                                composerStartRestartGroup.endReplaceableGroup();
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                        } else {
                            if (numValueOf.intValue() == 1053) {
                                Object objOooO00o = androidx.compose.animation.OooOo00.OooO00o(composerStartRestartGroup, -1581283005, -492369756);
                                if (objOooO00o == Composer.INSTANCE.getEmpty()) {
                                    objOooO00o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objOooO00o);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                composer3 = composerStartRestartGroup;
                                o000O0Oo.OooO0Oo((MutableState) objOooO00o, StringResources_androidKt.stringResource(o000000.room_ban_title, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(o000000.failed_into_room_reason, composerStartRestartGroup, 0), null, false, false, OooO0OO.f55321OooO0Oo, null, null, false, null, false, new OooO0o(fragmentActivity), null, false, false, null, OooO.f55315OooO0Oo, null, null, composer3, 1769478, 12582912, 913304);
                                composer3.endReplaceableGroup();
                            } else {
                                composer3 = composerStartRestartGroup;
                                if (numValueOf.intValue() == 4000000) {
                                    Object objOooO00o2 = androidx.compose.animation.OooOo00.OooO00o(composer3, -1581282179, -492369756);
                                    if (objOooO00o2 == Composer.INSTANCE.getEmpty()) {
                                        objOooO00o2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                                        composer3.updateRememberedValue(objOooO00o2);
                                    }
                                    composer3.endReplaceableGroup();
                                    o000O0Oo.OooO0Oo((MutableState) objOooO00o2, null, null, oO0.f55077OooO00o, false, false, null, OooOO0.f55323OooO0Oo, null, false, null, false, OooOO0O.f55324OooO0Oo, null, false, false, null, null, null, null, composer3, 12782598, 384, 1044310);
                                    composer3.endReplaceableGroup();
                                } else {
                                    composer3.startReplaceableGroup(-1581280923);
                                    composer2 = composer3;
                                    OooO0O0(StringResources_androidKt.stringResource(o000000.Network_connection_lost, composer3, 0), null, composer3, (i2 << 6) & 896, 2);
                                    composer2.endReplaceableGroup();
                                }
                            }
                            composer2 = composer3;
                        }
                        composer2.endReplaceableGroup();
                    }
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1581280769);
                    composer2.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            composer2 = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO0(i));
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0103  */
    /* JADX WARN: Code duplicated, block: B:47:0x011c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0128  */
    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO0O0(String str, String str2, Composer composer, int i, int i2) {
        int i3;
        String str3;
        int i4;
        String str4;
        Object objRememberedValue;
        Composer.Companion companion;
        Composer composer2;
        SoftwareKeyboardController current;
        boolean zChanged;
        Object objRememberedValue2;
        String str5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-540665971);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (composerStartRestartGroup.changed(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                str3 = str2;
                i3 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    str4 = null;
                } else {
                    str4 = str3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-540665971, i4, -1, "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState.ErrorTipDialog (RoomLiveScreenConnectState.kt:155)");
                }
                o0000O00.OooO0O0("ErrorTipDialog msg = " + str + ", title = " + str4);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                String str6 = str4;
                o000O0Oo.OooO0Oo((MutableState) objRememberedValue, str6, str, null, false, false, null, null, null, false, null, false, OooOOO.f55325OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, (i4 & 112) | 196614 | ((i4 << 6) & 896), 384, 1044440);
                composer2 = composerStartRestartGroup;
                current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceableGroup(1157296644);
                zChanged = composer2.changed(current);
                objRememberedValue2 = composer2.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OooOOOO(current, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 70);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                str5 = str6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                str5 = str3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(str, str5, i, i2));
        }
        i3 |= 48;
        str3 = str2;
        i4 = i3;
        if ((i4 & 91) == 18) {
            if (i5 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540665971, i4, -1, "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState.ErrorTipDialog (RoomLiveScreenConnectState.kt:155)");
            }
            o0000O00.OooO0O0("ErrorTipDialog msg = " + str + ", title = " + str4);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String str7 = str4;
            o000O0Oo.OooO0Oo((MutableState) objRememberedValue, str7, str, null, false, false, null, null, null, false, null, false, OooOOO.f55325OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, (i4 & 112) | 196614 | ((i4 << 6) & 896), 384, 1044440);
            composer2 = composerStartRestartGroup;
            current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
            Unit unit2 = Unit.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(current);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooOOOO(current, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOOOO(current, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str5 = str7;
        } else {
            if (i5 != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-540665971, i4, -1, "com.yalla.yalla.ui.screen.room.live.RoomLiveScreenConnectState.ErrorTipDialog (RoomLiveScreenConnectState.kt:155)");
            }
            o0000O00.OooO0O0("ErrorTipDialog msg = " + str + ", title = " + str4);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            String str8 = str4;
            o000O0Oo.OooO0Oo((MutableState) objRememberedValue, str8, str, null, false, false, null, null, null, false, null, false, OooOOO.f55325OooO0Oo, null, false, false, null, null, null, null, composerStartRestartGroup, (i4 & 112) | 196614 | ((i4 << 6) & 896), 384, 1044440);
            composer2 = composerStartRestartGroup;
            current = LocalSoftwareKeyboardController.INSTANCE.getCurrent(composer2, LocalSoftwareKeyboardController.$stable);
            Unit unit3 = Unit.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            zChanged = composer2.changed(current);
            objRememberedValue2 = composer2.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new OooOOOO(current, null);
                composer2.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new OooOOOO(current, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 70);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            str5 = str8;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo00(str, str5, i, i2));
    }
}
