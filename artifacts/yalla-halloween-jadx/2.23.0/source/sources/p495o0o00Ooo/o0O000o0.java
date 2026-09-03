package p495o0o00Ooo;

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
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.Observer;
import com.app.base.protobuf.room.Room;
import com.code.android.util.o0O0O00;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p408o0Oo0o0O.o00Oo0;
import p417o0OoO0.o00000O;
import p475o0o000.o0Oo0oo;
import p507o0o00ooo.a1;
import p519o0o0O0oO.oO00Oo00;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomLuckyPacketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,93:1\n76#2:94\n*S KotlinDebug\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager\n*L\n36#1:94\n*E\n"})
public final class o0O000o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O000o0 f48796OooO00o = new o0O000o0();

    public static final class OooO00o implements Observer<Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48797OooO0Oo;

        public OooO00o(MixedRoomActivity mixedRoomActivity) {
            this.f48797OooO0Oo = mixedRoomActivity;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            o0O000o0.OooO0O0(this.f48797OooO0Oo, true);
        }
    }

    @SourceDebugExtension({"SMAP\nRoomLuckyPacketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager$Content$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,93:1\n154#2:94\n*S KotlinDebug\n*F\n+ 1 RoomLuckyPacketManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomLuckyPacketManager$Content$2\n*L\n57#1:94\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Room.EnvelopInfo> f48798OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48799OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(SnapshotStateList<Room.EnvelopInfo> snapshotStateList, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f48798OooO0Oo = snapshotStateList;
            this.f48799OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1897702625, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomLuckyPacketManager.Content.<anonymous> (RoomLuckyPacketManager.kt:47)");
            }
            a1.OooO00o(PaddingKt.m480paddingqDBjuR0$default(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0OoO00O(this.f48799OooO0o0), 253), 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), null, "svga/room_lucky_packet_side.svga", StringResources_androidKt.stringResource(oO00OOo0.Lucky_Bag, composer2, 0), Integer.valueOf(this.f48798OooO0Oo.size()), 0.0f, null, false, composer2, 384, 226);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48801OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f48801OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48801OooO0o0 | 1);
            o0O000o0.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static void OooO0O0(MixedRoomActivity mixedRoomActivity, boolean z) {
        Room.EnvelopInfo envelopInfo;
        if (mixedRoomActivity == null) {
            return;
        }
        if (z && o00Oo0.OooO0oo().OooOO0O() == 1) {
            return;
        }
        o0Oo0oo o0oo0oo2 = com.yalla.yalla.service.room.OooO00o.f24990OooOOoo;
        SnapshotStateList<Room.EnvelopInfo> snapshotStateList = o0oo0oo2.f47475OooO00o;
        if (snapshotStateList.size() <= 0 || (envelopInfo = snapshotStateList.get(0)) == null) {
            return;
        }
        if (z && (envelopInfo = snapshotStateList.get(snapshotStateList.size() - 1)) == null) {
            return;
        }
        MutableState<Boolean> mutableState = o0oo0oo2.f47476OooO0O0;
        if (mutableState.getValue().booleanValue()) {
            return;
        }
        mutableState.setValue(Boolean.TRUE);
        oO00Oo00 oo00oo00 = new oO00Oo00(mixedRoomActivity);
        o0O00O0o o0o00o0o = o0O00O0o.f48812OooO0Oo;
        oo00oo00.f52843OooOo00 = false;
        long bonusid = envelopInfo.getBonusid();
        int bonustype = envelopInfo.getBonustype();
        String userheadphoto = envelopInfo.getUserheadphoto();
        Intrinsics.checkNotNullExpressionValue(userheadphoto, "this.userheadphoto");
        String giftimg = envelopInfo.getGiftimg();
        Intrinsics.checkNotNullExpressionValue(giftimg, "this.giftimg");
        String username = envelopInfo.getUsername();
        Intrinsics.checkNotNullExpressionValue(username, "this.username");
        envelopInfo.getBonuscount();
        String bonusinfo = envelopInfo.getBonusinfo();
        Intrinsics.checkNotNullExpressionValue(bonusinfo, "this.bonusinfo");
        oo00oo00.OooOO0O(bonusid, bonustype, userheadphoto, giftimg, username, bonusinfo, o0o00o0o);
        oo00oo00.OooO();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1409165047);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1409165047, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomLuckyPacketManager.Content (RoomLuckyPacketManager.kt:34)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            Observable<Object> observable = LiveEventBus.get("LuckyPacket_AddNew");
            Intrinsics.checkNotNullExpressionValue(observable, "get(EventKey.LuckyPacket_AddNew)");
            o00000O.OooO00o(observable, new OooO00o(mixedRoomActivity), composerStartRestartGroup, 8);
            o0Oo0oo o0oo0oo2 = com.yalla.yalla.service.room.OooO00o.f24990OooOOoo;
            SnapshotStateList<Room.EnvelopInfo> snapshotStateList = o0oo0oo2.f47475OooO00o;
            AnimatedVisibilityKt.AnimatedVisibility(!o0oo0oo2.f47476OooO0O0.getValue().booleanValue() && (snapshotStateList.isEmpty() ^ true), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1897702625, true, new OooO0O0(snapshotStateList, mixedRoomActivity)), composerStartRestartGroup, 200064, 18);
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
