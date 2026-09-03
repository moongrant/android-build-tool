package p541o0o0OoOO;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.uikit.svga.SVGAView;
import com.yalla.yalla.model.room.RoomUserInfoModel;
import com.yalla.yalla.ui.composable.room.SoundRippleAnimationType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p194o00o0OO.o00O000o;
import p200o00o0OoO.o00OO00O;
import p407o0Oo0Oo.o000;
import p423o0OoO0OO.o000O0O0;
import p423o0OoO0OO.o000OO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o0000oo;
import p523o0o0O0oo.oO000O0O;
import p523o0o0O0oo.oOo00OO0;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,696:1\n25#2:697\n36#2:708\n456#2,8:732\n464#2,3:746\n36#2:750\n36#2:757\n36#2:764\n456#2,8:789\n464#2,3:803\n467#2,3:807\n456#2,8:832\n464#2,3:846\n467#2,3:852\n467#2,3:857\n25#2:868\n36#2:876\n25#2:884\n36#2:891\n36#2:898\n1097#3,6:698\n1097#3,6:709\n1097#3,6:751\n1097#3,6:758\n1097#3,6:765\n1097#3,6:869\n1097#3,6:877\n1097#3,6:885\n1097#3,6:892\n1097#3,6:899\n76#4:704\n76#4:883\n1#5:705\n154#6:706\n154#6:707\n154#6:771\n154#6:772\n154#6:812\n154#6:813\n154#6:814\n154#6:850\n154#6:851\n154#6:862\n154#6:863\n154#6:864\n154#6:865\n154#6:866\n154#6:867\n154#6:875\n154#6:905\n154#6:906\n154#6:907\n154#6:908\n154#6:909\n72#7,6:715\n78#7:749\n82#7:861\n78#8,11:721\n78#8,11:778\n91#8:810\n78#8,11:821\n91#8:855\n91#8:860\n4144#9,6:740\n4144#9,6:797\n4144#9,6:840\n67#10,5:773\n72#10:806\n76#10:811\n73#11,6:815\n79#11:849\n83#11:856\n81#12:910\n107#12,2:911\n81#12:913\n81#12:914\n81#12:915\n81#12:916\n81#12:917\n81#12:918\n81#12:919\n81#12:920\n81#12:921\n81#12:922\n81#12:923\n81#12:924\n81#12:925\n81#12:926\n107#12,2:927\n81#12:929\n81#12:930\n81#12:931\n107#12,2:932\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt\n*L\n401#1:697\n419#1:708\n413#1:732,8\n413#1:746,3\n425#1:750\n426#1:757\n433#1:764\n434#1:789,8\n434#1:803,3\n434#1:807,3\n458#1:832,8\n458#1:846,3\n458#1:852,3\n413#1:857,3\n563#1:868\n573#1:876\n647#1:884\n648#1:891\n653#1:898\n401#1:698,6\n419#1:709,6\n425#1:751,6\n426#1:758,6\n433#1:765,6\n563#1:869,6\n573#1:877,6\n647#1:885,6\n648#1:892,6\n653#1:899,6\n402#1:704\n582#1:883\n402#1:706\n418#1:707\n437#1:771\n438#1:772\n457#1:812\n461#1:813\n462#1:814\n480#1:850\n481#1:851\n503#1:862\n510#1:863\n520#1:864\n538#1:865\n541#1:866\n542#1:867\n573#1:875\n662#1:905\n677#1:906\n678#1:907\n690#1:908\n691#1:909\n413#1:715,6\n413#1:749\n413#1:861\n413#1:721,11\n434#1:778,11\n434#1:810\n458#1:821,11\n458#1:855\n413#1:860\n413#1:740,6\n434#1:797,6\n458#1:840,6\n434#1:773,5\n434#1:806\n434#1:811\n458#1:815,6\n458#1:849\n458#1:856\n401#1:910\n401#1:911,2\n424#1:913\n426#1:914\n466#1:915\n494#1:916\n495#1:917\n496#1:918\n514#1:919\n515#1:920\n527#1:921\n528#1:922\n554#1:923\n557#1:924\n560#1:925\n563#1:926\n563#1:927,2\n605#1:929\n626#1:930\n647#1:931\n647#1:932,2\n*E\n"})
public final class oO0Oo0o0 {

    public static final class OooO extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55135OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55137OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55138OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55139OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55136OooO0Oo = boxScope;
            this.f55138OooO0o0 = oo00Var;
            this.f55137OooO0o = roomUserInfoModel;
            this.f55139OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55139OooO0oO | 1);
            oo00 oo00Var = this.f55138OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55137OooO0o;
            oO0Oo0o0.OooO00o(this.f55136OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f55140OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55141OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope) {
            super(3);
            this.f55141OooO0Oo = boxScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468687012, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteMic.<anonymous> (LiveRoomScreenMicList.kt:632)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_room_bottom_mic_top_off, composer2, 0), (String) null, this.f55141OooO0Oo.matchParentSize(Modifier.INSTANCE), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55142OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55143OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope, int i) {
            super(2);
            this.f55142OooO0Oo = boxScope;
            this.f55143OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55143OooO0o0 | 1);
            oO0Oo0o0.OooO0O0(this.f55142OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55144OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(BoxScope boxScope) {
            super(3);
            this.f55144OooO0Oo = boxScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1215933118, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteSound.<anonymous> (LiveRoomScreenMicList.kt:611)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_room_mic_mute, composer2, 0), (String) null, this.f55144OooO0Oo.matchParentSize(Modifier.INSTANCE), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55145OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55146OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55147OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(BoxScope boxScope, oo00 oo00Var, int i) {
            super(2);
            this.f55145OooO0Oo = boxScope;
            this.f55147OooO0o0 = oo00Var;
            this.f55146OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55146OooO0o | 1);
            oO0Oo0o0.OooO0OO(this.f55145OooO0Oo, this.f55147OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55148OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55149OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55150OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55151OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55148OooO0Oo = boxScope;
            this.f55150OooO0o0 = oo00Var;
            this.f55149OooO0o = roomUserInfoModel;
            this.f55151OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55151OooO0oO | 1);
            oo00 oo00Var = this.f55150OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55149OooO0o;
            oO0Oo0o0.OooO0Oo(this.f55148OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55152OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55153OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55154OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55155OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55152OooO0Oo = boxScope;
            this.f55154OooO0o0 = oo00Var;
            this.f55153OooO0o = roomUserInfoModel;
            this.f55155OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55155OooO0oO | 1);
            oo00 oo00Var = this.f55154OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55153OooO0o;
            oO0Oo0o0.OooO0Oo(this.f55152OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55156OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55157OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55158OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55159OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55156OooO0Oo = boxScope;
            this.f55158OooO0o0 = oo00Var;
            this.f55157OooO0o = roomUserInfoModel;
            this.f55159OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55159OooO0oO | 1);
            oo00 oo00Var = this.f55158OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55157OooO0o;
            oO0Oo0o0.OooO0Oo(this.f55156OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55160OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function1<SoundRippleAnimationType, Unit>> f55161OooO0o0;

        public OooOo(MutableState mutableState, RoomUserInfoModel roomUserInfoModel) {
            this.f55160OooO0Oo = roomUserInfoModel;
            this.f55161OooO0o0 = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ((Boolean) obj).booleanValue();
            RoomUserInfoModel roomUserInfoModel = this.f55160OooO0Oo;
            int iIntValue = roomUserInfoModel.getVoiceChangerId().getValue().intValue();
            MutableState<Function1<SoundRippleAnimationType, Unit>> mutableState = this.f55161OooO0o0;
            if (iIntValue > 0) {
                Function1<SoundRippleAnimationType, Unit> value = mutableState.getValue();
                if (value != null) {
                    value.invoke(SoundRippleAnimationType.MAGIC_CARD);
                }
            } else if (roomUserInfoModel.isPremium().getValue().booleanValue()) {
                Function1<SoundRippleAnimationType, Unit> value2 = mutableState.getValue();
                if (value2 != null) {
                    value2.invoke(SoundRippleAnimationType.PREMIUM);
                }
            } else {
                Function1<SoundRippleAnimationType, Unit> value3 = mutableState.getValue();
                if (value3 != null) {
                    value3.invoke(SoundRippleAnimationType.DEFAULT);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55162OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55163OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55164OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55165OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55162OooO0Oo = boxScope;
            this.f55164OooO0o0 = oo00Var;
            this.f55163OooO0o = roomUserInfoModel;
            this.f55165OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55165OooO0oO | 1);
            oo00 oo00Var = this.f55164OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55163OooO0o;
            oO0Oo0o0.OooO0Oo(this.f55162OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55166OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55167OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55168OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55169OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55166OooO0Oo = boxScope;
            this.f55168OooO0o0 = oo00Var;
            this.f55167OooO0o = roomUserInfoModel;
            this.f55169OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55169OooO0oO | 1);
            oo00 oo00Var = this.f55168OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55167OooO0o;
            oO0Oo0o0.OooO0Oo(this.f55166OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<Function1<? super SoundRippleAnimationType, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function1<SoundRippleAnimationType, Unit>> f55170OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MutableState<Function1<SoundRippleAnimationType, Unit>> mutableState) {
            super(1);
            this.f55170OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super SoundRippleAnimationType, ? extends Unit> function1) {
            Function1<? super SoundRippleAnimationType, ? extends Unit> it = function1;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f55170OooO0Oo.setValue((Function1<SoundRippleAnimationType, Unit>) it);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55171OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55172OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55173OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55171OooO0Oo = boxScope;
            this.f55173OooO0o0 = roomUserInfoModel;
            this.f55172OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55172OooO0o | 1);
            oO0Oo0o0.OooO0o0(this.f55171OooO0Oo, this.f55173OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f55174OooO0Oo;

        public o00O0O(MutableState<String> mutableState) {
            this.f55174OooO0Oo = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            this.f55174OooO0Oo.setValue((String) obj);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt$MicInfoUserMicEmoji$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,696:1\n489#2,11:697\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt$MicInfoUserMicEmoji$2$1\n*L\n659#1:697,11\n*E\n"})
    public static final class o00Oo0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f55175OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(MutableState<String> mutableState) {
            super(1);
            this.f55175OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<String> mutableState = this.f55175OooO0Oo;
            String value = mutableState.getValue();
            coil.request.OooO00o.C0189OooO00o.OooO0o(it, "coil#repeat_count", 1);
            coil.request.OooO00o.C0189OooO00o.OooO0o(it, "coil#animation_end_callback", new oO0o0000(mutableState, value));
            it.f11683OooO0o0 = new oO0oO000(mutableState);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55176OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55177OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55178OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(BoxScope boxScope, oo00 oo00Var, int i) {
            super(2);
            this.f55176OooO0Oo = boxScope;
            this.f55178OooO0o0 = oo00Var;
            this.f55177OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55177OooO0o | 1);
            oO0Oo0o0.OooO0oO(this.f55176OooO0Oo, this.f55178OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55179OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55180OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55181OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55179OooO0Oo = boxScope;
            this.f55181OooO0o0 = roomUserInfoModel;
            this.f55180OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55180OooO0o | 1);
            oO0Oo0o0.OooO0oo(this.f55179OooO0Oo, this.f55181OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OOO0o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55182OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<SVGAView> f55183OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(LifecycleOwner lifecycleOwner, Ref.ObjectRef<SVGAView> objectRef) {
            super(1);
            this.f55182OooO0Oo = lifecycleOwner;
            this.f55183OooO0o0 = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.code.android.uikit.svga.SVGAView, com.opensource.svgaplayer.SVGAImageView] */
        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            ?? sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.setLoops(1);
            sVGAView.OooOO0O("svga/anim_mic_magic_voice.svga", this.f55182OooO0Oo);
            this.f55183OooO0o0.element = sVGAView;
            return sVGAView;
        }
    }

    public static final class o0Oo0oo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55184OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55185OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo00 f55186OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f55187OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55184OooO0Oo = boxScope;
            this.f55186OooO0o0 = oo00Var;
            this.f55185OooO0o = roomUserInfoModel;
            this.f55187OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55187OooO0oO | 1);
            oo00 oo00Var = this.f55186OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f55185OooO0o;
            oO0Oo0o0.OooOO0(this.f55184OooO0Oo, oo00Var, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55188OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f55189OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55188OooO0Oo = roomUserInfoModel;
            this.f55189OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55189OooO0o0 | 1);
            oO0Oo0o0.OooO0o(this.f55188OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<SVGAView> f55190OooO0Oo;

        public o0ooOOo(Ref.ObjectRef<SVGAView> objectRef) {
            this.f55190OooO0Oo = objectRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            ((Boolean) obj).booleanValue();
            SVGAView sVGAView = this.f55190OooO0Oo.element;
            if (sVGAView != null) {
                sVGAView.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f55191OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55192OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f55193OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f55191OooO0Oo = boxScope;
            this.f55193OooO0o0 = roomUserInfoModel;
            this.f55192OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55192OooO0o | 1);
            oO0Oo0o0.OooO0oo(this.f55191OooO0Oo, this.f55193OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final long OooO(State<Long> state) {
        return state.getValue().longValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Painter painterPainterResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1650318595);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650318595, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoHeaderState (LiveRoomScreenMicList.kt:525)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo00Var.f55306OooO0O0, null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(oo00Var.f55307OooO0OO, null, composerStartRestartGroup, 8, 1);
        if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-7619312);
            painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_room_mic_lock, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (((Boolean) stateCollectAsState.getValue()).booleanValue() || ((Number) stateCollectAsState2.getValue()).longValue() <= 0) {
            composerStartRestartGroup.startReplaceableGroup(-7619130);
            painterPainterResource = PainterResources_androidKt.painterResource(p562o0oOo000.o0Oo0oo.icon_room_mic_default, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-7619174);
            MutableStateFlow<String> userHeader = roomUserInfoModel != null ? roomUserInfoModel.getUserHeader() : null;
            composerStartRestartGroup.startReplaceableGroup(-7619198);
            State stateCollectAsState3 = userHeader == null ? null : SnapshotStateKt.collectAsState(userHeader, null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.endReplaceableGroup();
            painterPainterResource = o000OO.OooO0O0(stateCollectAsState3 != null ? (String) stateCollectAsState3.getValue() : null, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endReplaceableGroup();
        }
        ContentScale crop = ContentScale.INSTANCE.getCrop();
        Modifier modifierM478padding3ABfNKs = Modifier.INSTANCE;
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(modifierM478padding3ABfNKs, Dp.m3775constructorimpl(53));
        if (!((Boolean) stateCollectAsState.getValue()).booleanValue() && ((Number) stateCollectAsState2.getValue()).longValue() > 0) {
            float f = 1;
            modifierM478padding3ABfNKs = PaddingKt.m478padding3ABfNKs(BorderKt.m182borderxT4_qwU(modifierM478padding3ABfNKs, Dp.m3775constructorimpl(f), o0OOo000.f48158OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3775constructorimpl(f));
        }
        ImageKt.Image(painterPainterResource, (String) null, ClipKt.clip(modifierM525size3ABfNKs.then(modifierM478padding3ABfNKs), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, oo00Var, roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(BoxScope boxScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2045110836);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2045110836, i2, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteMic (LiveRoomScreenMicList.kt:624)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48577OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), SemanticsModifierKt.semantics$default(boxScope.matchParentSize(Modifier.INSTANCE), false, OooO0O0.f55140OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 468687012, true, new OooO0OO(boxScope)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(boxScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(BoxScope boxScope, oo00 oo00Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(934705434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(934705434, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteSound (LiveRoomScreenMicList.kt:603)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(oo00Var.f55308OooO0Oo, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), SemanticsModifierKt.semantics$default(boxScope.matchParentSize(Modifier.INSTANCE), false, OooO.f55135OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1215933118, true, new OooOO0(boxScope)), composerStartRestartGroup, 200064, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(boxScope, oo00Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(186803807);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(186803807, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoSoundWave (LiveRoomScreenMicList.kt:552)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo00Var.f55307OooO0OO, null, composerStartRestartGroup, 8, 1);
        if (((Number) stateCollectAsState.getValue()).longValue() == 0) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(boxScope, oo00Var, roomUserInfoModel, i));
            return;
        }
        o0000oo o0000ooVar = com.yalla.yalla.service.room.OooO00o.f24517OooO0oO;
        if (((Boolean) SnapshotStateKt.collectAsState(o0000ooVar.f48578OooO0OO, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooOOO(boxScope, oo00Var, roomUserInfoModel, i));
            return;
        }
        if (((Boolean) SnapshotStateKt.collectAsState(o0000ooVar.f48577OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            long jLongValue = ((Number) stateCollectAsState.getValue()).longValue();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new OooOOOO(boxScope, oo00Var, roomUserInfoModel, i));
                return;
            }
        }
        if (roomUserInfoModel == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup4 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup4.updateScope(new OooOo00(boxScope, oo00Var, roomUserInfoModel, i));
            return;
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        o000O0O0.OooO0O0(oo00Var.f55310OooO0o0, null, new OooOo(mutableState, roomUserInfoModel), composerStartRestartGroup, 520, 1);
        oOo00OO0 ooo00oo0 = oOo00OO0.f53200OooO00o;
        Modifier modifierM517requiredSize3ABfNKs = SizeKt.m517requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(70));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Oooo000(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        ooo00oo0.OooO00o(modifierM517requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 390, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup5 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup5.updateScope(new Oooo0(boxScope, oo00Var, roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        MutableStateFlow<Integer> roomMemberType;
        Composer composerStartRestartGroup = composer.startRestartGroup(-189000665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-189000665, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserIdentity (LiveRoomScreenMicList.kt:686)");
        }
        oO0OO.OooO00o.f59939OooO00o.OooO0OO((roomUserInfoModel == null || (roomMemberType = roomUserInfoModel.getRoomMemberType()) == null) ? 0 : roomMemberType.getValue().intValue(), 518, 0, composerStartRestartGroup, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(1), 0.0f, 11, null), Dp.m3775constructorimpl(10)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0OoOo0(roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        String strOooO0Oo;
        MutableStateFlow<String> headerCardUrl;
        String value;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268342063);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1268342063, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserHeaderCard (LiveRoomScreenMicList.kt:670)");
        }
        MutableStateFlow<String> headerCardUrl2 = roomUserInfoModel != null ? roomUserInfoModel.getHeaderCardUrl() : null;
        boolean z = true;
        State stateCollectAsState = headerCardUrl2 == null ? null : SnapshotStateKt.collectAsState(headerCardUrl2, null, composerStartRestartGroup, 8, 1);
        String str = stateCollectAsState != null ? (String) stateCollectAsState.getValue() : null;
        if (str != null && !StringsKt.isBlank(str)) {
            z = false;
        }
        if (!z) {
            if (roomUserInfoModel == null || (headerCardUrl = roomUserInfoModel.getHeaderCardUrl()) == null || (value = headerCardUrl.getValue()) == null || (strOooO0Oo = p184o00o00O0.OooO0OO.OooO0Oo(value)) == null) {
                strOooO0Oo = "";
            }
            o00OO00O.OooO00o(strOooO0Oo, true, 0, null, null, SizeKt.m517requiredSize3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3775constructorimpl(10), 7, null), Dp.m3775constructorimpl(60)), composerStartRestartGroup, 196656, 28);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(boxScope, roomUserInfoModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(BoxScope boxScope, oo00 oo00Var, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1025399786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1025399786, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserMicEmoji (LiveRoomScreenMicList.kt:645)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        MutableSharedFlow<String> mutableSharedFlow = oo00Var.f55309OooO0o;
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new o00O0O(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o000O0O0.OooO0O0(mutableSharedFlow, null, (FlowCollector) objRememberedValue2, composerStartRestartGroup, 520, 1);
        if (!StringsKt.isBlank((String) mutableState.getValue())) {
            String strOooO0Oo = p184o00o00O0.OooO0OO.OooO0Oo((String) mutableState.getValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged2 = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new o00Oo0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(o000OO.OooO0OO(strOooO0Oo, (Function1) objRememberedValue3, composerStartRestartGroup, 0, 0), (String) null, SizeKt.m517requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(66)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00Ooo(boxScope, oo00Var, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1923648900);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1923648900, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserPendant (LiveRoomScreenMicList.kt:491)");
        }
        if (roomUserInfoModel == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oo000o(boxScope, roomUserInfoModel, i));
            return;
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(roomUserInfoModel.getVipLevel(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(roomUserInfoModel.isPremium(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState3 = SnapshotStateKt.collectAsState(roomUserInfoModel.getPremiumLevel(), null, composerStartRestartGroup, 8, 1);
        if (roomUserInfoModel.needShowPremiumJustForCompose(composerStartRestartGroup, 8)) {
            composerStartRestartGroup.startReplaceableGroup(1828607891);
            oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
            oO0OO.OooO00o.OooOOo(Boolean.valueOf(((Boolean) stateCollectAsState2.getValue()).booleanValue()), Integer.valueOf(((Number) stateCollectAsState3.getValue()).intValue()), false, 0.0f, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(16)), Alignment.INSTANCE.getBottomEnd()), composerStartRestartGroup, 262144, 12);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1828608129);
            oO0OO.OooO00o oooO00o2 = oO0OO.OooO00o.f59939OooO00o;
            oO0OO.OooO00o.OooOo0(null, Integer.valueOf(((Number) stateCollectAsState.getValue()).intValue()), null, 0.0f, boxScope.align(SizeKt.m525size3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(16)), Alignment.INSTANCE.getBottomEnd()), composerStartRestartGroup, 262144, 13);
            composerStartRestartGroup.endReplaceableGroup();
        }
        oO000O0O.f53112OooO00o.OooO0OO(((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRankWeek(), null, composerStartRestartGroup, 8, 1).getValue()).intValue(), ((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRankDay(), null, composerStartRestartGroup, 8, 1).getValue()).intValue(), boxScope.align(SizeKt.m527sizeVpY3zN4(Modifier.INSTANCE, Dp.m3775constructorimpl(24), Dp.m3775constructorimpl(13)), Alignment.INSTANCE.getBottomStart()), composerStartRestartGroup, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o00oO0o(boxScope, roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0(BoxScope boxScope, oo00 oo00Var, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        MutableStateFlow<Integer> voiceChangerId;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155331126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1155331126, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoVoiceChangerEffect (LiveRoomScreenMicList.kt:579)");
        }
        if (((roomUserInfoModel == null || (voiceChangerId = roomUserInfoModel.getVoiceChangerId()) == null) ? 0 : voiceChangerId.getValue().intValue()) > 0) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            o000O0O0.OooO0O0(oo00Var.f55310OooO0o0, null, new o0ooOOo(objectRef), composerStartRestartGroup, 520, 1);
            AndroidView_androidKt.AndroidView(new o0OOO0o(lifecycleOwner, objectRef), boxScope.matchParentSize(Modifier.INSTANCE), null, composerStartRestartGroup, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0Oo0oo(boxScope, oo00Var, roomUserInfoModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0O(RowScope rowScope, oo00 oo00Var, Modifier modifier, int i, Composer composer, int i2) {
        MutableStateFlow<String> userName;
        String value;
        int i3;
        String strValueOf;
        MutableStateFlow<String> userName2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1127522148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1127522148, i2, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoView (LiveRoomScreenMicList.kt:399)");
        }
        composerStartRestartGroup.startReplaceableGroup(-492369756);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Pair(0, 0), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        MutableState mutableState = (MutableState) objRememberedValue;
        float fMo326toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo326toPx0680j_4(Dp.m3775constructorimpl(22));
        composerStartRestartGroup.startReplaceableGroup(607349895);
        if (oo00Var.f55305OooO00o == i) {
            oO0O000.OooO00o(oo00Var, ((Number) ((Pair) mutableState.getValue()).getFirst()).intValue(), ((Number) ((Pair) mutableState.getValue()).getSecond()).intValue() - ((int) fMo326toPx0680j_4), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierOooO0O0 = kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO0O0(85, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion3.then(modifier), 1.0f, false, 2, null), composerStartRestartGroup, 1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new oOo00o00(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO0O0, (Function1) objRememberedValue2);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOO0.OooO00o(arrangement, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnGloballyPositioned);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo00Var.f55307OooO0OO, null, composerStartRestartGroup, 8, 1);
        Long lValueOf = Long.valueOf(OooO(stateCollectAsState));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(lValueOf);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24511OooO00o;
            objRememberedValue3 = com.yalla.yalla.service.room.OooO00o.OooO0o0(Long.valueOf(OooO(stateCollectAsState)));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        RoomUserInfoModel roomUserInfoModel = (RoomUserInfoModel) objRememberedValue3;
        Long lValueOf2 = Long.valueOf(OooO(stateCollectAsState));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged3 = composerStartRestartGroup.changed(lValueOf2);
        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
        if (zChanged3 || objRememberedValue4 == companion.getEmpty()) {
            long jOooO = OooO(stateCollectAsState);
            final String value2 = (roomUserInfoModel == null || (userName = roomUserInfoModel.getUserName()) == null) ? null : userName.getValue();
            o000 o000VarOooOOoo = p408o0Oo0Oo0.o00Oo0.OooO00o().OooOOoo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            final Flow<String> flowOooO0o0 = o000VarOooOOoo.OooO0o0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), jOooO);
            objRememberedValue4 = new Flow<String>() { // from class: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1

                /* JADX INFO: renamed from: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FriendRepo.kt\ncom/yalla/yalla/data/repository/FriendRepo\n*L\n1#1,222:1\n48#2:223\n91#3,4:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f22503OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public final /* synthetic */ String f22504OooO0o0;

                    /* JADX INFO: renamed from: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2", f = "FriendRepo.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f22505OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f22507OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f22505OooO0Oo = obj;
                            this.f22507OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.f22503OooO0Oo = flowCollector;
                        this.f22504OooO0o0 = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f22507OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f22507OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f22505OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f22507OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            String str = (String) obj;
                            if ((str == null || StringsKt.isBlank(str)) && (str = this.f22504OooO0o0) == null) {
                                str = "";
                            }
                            anonymousClass1.f22507OooO0o0 = 1;
                            if (this.f22503OooO0Oo.emit(str, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public final Object collect(@NotNull FlowCollector<? super String> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowOooO0o0.collect(new AnonymousClass2(flowCollector, value2), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Flow flow = (Flow) objRememberedValue4;
        if (roomUserInfoModel == null || (userName2 = roomUserInfoModel.getUserName()) == null || (value = userName2.getValue()) == null) {
            value = "";
        }
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(flow, value, null, composerStartRestartGroup, 8, 2);
        Long lValueOf3 = Long.valueOf(OooO(stateCollectAsState));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged4 = composerStartRestartGroup.changed(lValueOf3);
        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
        if (zChanged4 || objRememberedValue5 == companion.getEmpty()) {
            o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            objRememberedValue5 = Boolean.valueOf(l != null && l.longValue() == OooO(stateCollectAsState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        boolean zBooleanValue = ((Boolean) objRememberedValue5).booleanValue();
        Alignment center = companion2.getCenter();
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion3, 0.0f, Dp.m3775constructorimpl(15), 0.0f, 0.0f, 13, null), Dp.m3775constructorimpl(50));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(331386874);
        if (OooO(stateCollectAsState) > 0) {
            OooO0Oo(boxScopeInstance, oo00Var, roomUserInfoModel, composerStartRestartGroup, 582);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScopeInstance, oo00Var, roomUserInfoModel, composerStartRestartGroup, 582);
        composerStartRestartGroup.startReplaceableGroup(1739789805);
        if (OooO(stateCollectAsState) > 0) {
            OooOO0(boxScopeInstance, oo00Var, roomUserInfoModel, composerStartRestartGroup, 582);
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceableGroup(331387157);
                OooO0O0(boxScopeInstance, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(331387202);
                OooO0OO(boxScopeInstance, oo00Var, composerStartRestartGroup, 70);
                composerStartRestartGroup.endReplaceableGroup();
            }
            OooO0o0(boxScopeInstance, roomUserInfoModel, composerStartRestartGroup, 70);
            OooO0oo(boxScopeInstance, roomUserInfoModel, composerStartRestartGroup, 70);
            OooO0oO(boxScopeInstance, oo00Var, composerStartRestartGroup, 70);
        }
        o00O000o.OooO00o(composerStartRestartGroup);
        float f = 2;
        com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO00o = p454o0Ooo000.OooOo00.OooO00o(f, SizeKt.m511height3ABfNKs(companion3, Dp.m3775constructorimpl(20)), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1320constructorimpl3, measurePolicyOooO0O0, composerM1320constructorimpl3, currentCompositionLocalMap3);
        if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(331387740);
        if (OooO(stateCollectAsState) > 0) {
            i3 = 8;
            OooO0o(roomUserInfoModel, composerStartRestartGroup, 8);
        } else {
            i3 = 8;
        }
        composerStartRestartGroup.endReplaceableGroup();
        State stateCollectAsState3 = SnapshotStateKt.collectAsState(oo00Var.f55306OooO0O0, null, composerStartRestartGroup, i3, 1);
        oO0OO.OooO00o oooO00o = oO0OO.OooO00o.f59939OooO00o;
        composerStartRestartGroup.startReplaceableGroup(331387908);
        if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
            strValueOf = StringResources_androidKt.stringResource(o000000.tip_locked, composerStartRestartGroup, 0);
        } else {
            strValueOf = (((Boolean) stateCollectAsState3.getValue()).booleanValue() || OooO(stateCollectAsState) <= 0) ? String.valueOf(oo00Var.f55305OooO00o + 1) : (String) stateCollectAsState2.getValue();
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i4 = o0OOo000.f48347o00OOooO;
        oooO00o.OooOOOo(strValueOf, zBooleanValue ? o0OOo000.f48185Ooooo00 : o0OOo000.f48150OooOOo0, false, TextUnitKt.getSp(10), TextOverflow.INSTANCE.m3729getEllipsisgIe3tQ8(), 0, null, false, companion3.then(zBooleanValue ? PaddingKt.m480paddingVpY3zN4$default(BorderKt.m182borderxT4_qwU(companion3, Dp.m3775constructorimpl(1), o0OOo000.f48185Ooooo00, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3775constructorimpl(5), 0.0f, 2, null) : companion3), composerStartRestartGroup, 1073769472, 228);
        if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oO(rowScope, oo00Var, modifier, i, i2));
    }
}
