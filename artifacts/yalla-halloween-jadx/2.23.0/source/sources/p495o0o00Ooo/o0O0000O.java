package p495o0o00Ooo;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.mixedroom.MixedRoomActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p507o0o00ooo.a1;
import p584o0oOooO0.oO00OOO;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nRoomEventManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomEventManager\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,55:1\n76#2:56\n*S KotlinDebug\n*F\n+ 1 RoomEventManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomEventManager\n*L\n24#1:56\n*E\n"})
public final class o0O0000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0000O f48786OooO00o = new o0O0000O();

    @SourceDebugExtension({"SMAP\nRoomEventManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomEventManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomEventManager$Content$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,55:1\n154#2:56\n*S KotlinDebug\n*F\n+ 1 RoomEventManager.kt\ncom/yalla/yalla/ui/activity/room/live/side/RoomEventManager$Content$1\n*L\n50#1:56\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f48787OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MixedRoomActivity f48788OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, MixedRoomActivity mixedRoomActivity) {
            super(3);
            this.f48787OooO0Oo = i;
            this.f48788OooO0o0 = mixedRoomActivity;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            String strStringResource;
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(965486175, iIntValue, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomEventManager.Content.<anonymous> (RoomEventManager.kt:31)");
            }
            if (Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25044o000oOoO, composer2, 8).getValue(), Boolean.TRUE)) {
                composer2.startReplaceableGroup(505790754);
                strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Event_Live_Now, composer2, 0);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(505790836);
                strStringResource = StringResources_androidKt.stringResource(oO00OOo0.Events, composer2, 0);
                composer2.endReplaceableGroup();
            }
            a1.OooO00o(PaddingKt.m480paddingqDBjuR0$default(o0O0O00.OooO0O0(Modifier.INSTANCE, false, false, 0L, false, null, null, null, new o0O00000(this.f48788OooO0o0), 253), 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), Integer.valueOf(oO00OOO.room_ic_room_side_event), null, strStringResource, Integer.valueOf(this.f48787OooO0Oo), 0.0f, Color.m1660boximpl(ColorKt.Color(4294939427L)), true, composer2, 14155776, 36);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48790OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(2);
            this.f48790OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48790OooO0o0 | 1);
            o0O0000O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f48792OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i) {
            super(2);
            this.f48792OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f48792OooO0o0 | 1);
            o0O0000O.this.OooO00o(composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1504184777);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1504184777, i, -1, "com.yalla.yalla.ui.activity.room.live.side.RoomEventManager.Content (RoomEventManager.kt:22)");
            }
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            MixedRoomActivity mixedRoomActivity = objConsume instanceof MixedRoomActivity ? (MixedRoomActivity) objConsume : null;
            if (mixedRoomActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i));
                return;
            }
            int iIntValue = ((Number) com.yalla.yalla.service.room.OooO00o.f24987OooOOOo.f47442OooO00o.getValue()).intValue();
            AnimatedVisibilityKt.AnimatedVisibility(iIntValue > 0, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 965486175, true, new OooO00o(iIntValue, mixedRoomActivity)), composerStartRestartGroup, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0O0(i));
    }
}
