package p499o0o00o;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p415o0Oo0oO0.o00Ooo;
import p423o0OoO0OO.o00O0000;
import p483o0o000Oo.o00000O;
import p492o0o00OO0.o0000;
import p516o0o0O00o.o0;
import p562o0oOo000.o000000;
import p650o0ooo.o0OOOO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyPacketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,94:1\n76#2:95\n*S KotlinDebug\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager\n*L\n37#1:95\n*E\n"})
public final class o0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0OO0 f49951OooO00o = new o0OO0();

    public static final class OooO00o extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f49952OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLuckyPacketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager$Content$3\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,94:1\n154#2:95\n*S KotlinDebug\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager$Content$3\n*L\n58#1:95\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Room.EnvelopInfo> f49953OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f49954OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SnapshotStateList<Room.EnvelopInfo> snapshotStateList, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f49953OooO0Oo = snapshotStateList;
            this.f49954OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897702625, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomLuckyPacketManager.Content.<anonymous> (RoomLuckyPacketManager.kt:49)");
            }
            o0.OooO00o(PaddingKt.m482paddingqDBjuR0$default(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0OOooO0(this.f49954OooO0o0), 253), 0.0f, Dp.m3775constructorimpl(10), 0.0f, 0.0f, 13, null), null, "svga/room_lucky_packet_side.svga", StringResources_androidKt.stringResource(o000000.Lucky_Bag, composer2, 0), Integer.valueOf(this.f49953OooO0Oo.size()), 0.0f, null, false, composer2, 384, 226);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f49956OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f49956OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f49956OooO0o0 | 1);
            o0OO0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static void OooO0O0(MixedRoomActivity mixedRoomActivity, boolean z) {
        Room.EnvelopInfo envelopInfo;
        if (mixedRoomActivity == null) {
            return;
        }
        if (z && o00Ooo.OooO0oo().OooOO0O() == 1) {
            return;
        }
        o00000O o00000o = com.yalla.yalla.service.room.OooO00o.f24528OooOOoo;
        SnapshotStateList<Room.EnvelopInfo> snapshotStateList = o00000o.f48480OooO00o;
        if (snapshotStateList.size() <= 0 || (envelopInfo = snapshotStateList.get(0)) == null) {
            return;
        }
        if (z && (envelopInfo = snapshotStateList.get(snapshotStateList.size() - 1)) == null) {
            return;
        }
        MutableState<Boolean> mutableState = o00000o.f48481OooO0O0;
        if (mutableState.getValue().booleanValue()) {
            return;
        }
        mutableState.setValue(Boolean.TRUE);
        o0OOOO0o o0oooo0o2 = new o0OOOO0o(mixedRoomActivity);
        o0OO0o00 o0oo0o01 = o0OO0o00.f49975OooO0Oo;
        o0oooo0o2.f58714OooOo00 = false;
        long bonusid = envelopInfo.getBonusid();
        int bonustype = envelopInfo.getBonustype();
        String userheadphoto = envelopInfo.getUserheadphoto();
        Intrinsics.checkNotNullExpressionValue(userheadphoto, "getUserheadphoto(...)");
        String giftimg = envelopInfo.getGiftimg();
        Intrinsics.checkNotNullExpressionValue(giftimg, "getGiftimg(...)");
        String username = envelopInfo.getUsername();
        Intrinsics.checkNotNullExpressionValue(username, "getUsername(...)");
        envelopInfo.getBonuscount();
        String bonusinfo = envelopInfo.getBonusinfo();
        Intrinsics.checkNotNullExpressionValue(bonusinfo, "getBonusinfo(...)");
        o0oooo0o2.OooOO0O(bonusid, bonustype, userheadphoto, giftimg, username, bonusinfo, o0oo0o01);
        o0oooo0o2.OooO();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1409165047);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409165047, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomLuckyPacketManager.Content (RoomLuckyPacketManager.kt:35)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            Observable<Object> observable = LiveEventBus.get("LuckyPacket_AddNew");
            Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
            o00O0000.OooO00o(observable, new o0000(mixedRoomActivity, 1), composerStartRestartGroup, 72);
            o00000O o00000o = com.yalla.yalla.service.room.OooO00o.f24528OooOOoo;
            SnapshotStateList<Room.EnvelopInfo> snapshotStateList = o00000o.f48480OooO00o;
            AnimatedVisibilityKt.AnimatedVisibility(!o00000o.f48481OooO0O0.getValue().booleanValue() && (snapshotStateList.isEmpty() ^ true), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, OooO00o.f49952OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1897702625, true, new OooO0O0(snapshotStateList, mixedRoomActivity)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
    }
}
