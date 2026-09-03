package p533o0o0Oo0;

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
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p150o00Oo0oO.o00000OO;
import p403o0Oo0OOo.o0O00;
import p445o0OoOoo.o0oOO;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.o000000;
import p516o0o0O0OO.o0000;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,695:1\n25#2:696\n36#2:707\n456#2,8:731\n464#2,3:745\n36#2:749\n36#2:756\n36#2:763\n456#2,8:788\n464#2,3:802\n467#2,3:806\n456#2,8:831\n464#2,3:845\n467#2,3:851\n467#2,3:856\n25#2:867\n36#2:875\n25#2:883\n36#2:890\n1097#3,6:697\n1097#3,6:708\n1097#3,6:750\n1097#3,6:757\n1097#3,6:764\n1097#3,6:868\n1097#3,6:876\n1097#3,6:884\n1097#3,6:891\n76#4:703\n76#4:882\n1#5:704\n154#6:705\n154#6:706\n154#6:770\n154#6:771\n154#6:811\n154#6:812\n154#6:813\n154#6:849\n154#6:850\n154#6:861\n154#6:862\n154#6:863\n154#6:864\n154#6:865\n154#6:866\n154#6:874\n154#6:897\n154#6:898\n154#6:899\n154#6:900\n154#6:901\n72#7,6:714\n78#7:748\n82#7:860\n78#8,11:720\n78#8,11:777\n91#8:809\n78#8,11:820\n91#8:854\n91#8:859\n4144#9,6:739\n4144#9,6:796\n4144#9,6:839\n67#10,5:772\n72#10:805\n76#10:810\n73#11,6:814\n79#11:848\n83#11:855\n81#12:902\n107#12,2:903\n81#12:905\n81#12:906\n81#12:907\n81#12:908\n81#12:909\n81#12:910\n81#12:911\n81#12:912\n81#12:913\n81#12:914\n81#12:915\n81#12:916\n81#12:917\n81#12:918\n107#12,2:919\n81#12:921\n81#12:922\n81#12:923\n107#12,2:924\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt\n*L\n400#1:696\n418#1:707\n412#1:731,8\n412#1:745,3\n424#1:749\n425#1:756\n432#1:763\n433#1:788,8\n433#1:802,3\n433#1:806,3\n457#1:831,8\n457#1:845,3\n457#1:851,3\n412#1:856,3\n562#1:867\n572#1:875\n646#1:883\n652#1:890\n400#1:697,6\n418#1:708,6\n424#1:750,6\n425#1:757,6\n432#1:764,6\n562#1:868,6\n572#1:876,6\n646#1:884,6\n652#1:891,6\n401#1:703\n581#1:882\n401#1:705\n417#1:706\n436#1:770\n437#1:771\n456#1:811\n460#1:812\n461#1:813\n479#1:849\n480#1:850\n502#1:861\n509#1:862\n519#1:863\n537#1:864\n540#1:865\n541#1:866\n572#1:874\n661#1:897\n676#1:898\n677#1:899\n689#1:900\n690#1:901\n412#1:714,6\n412#1:748\n412#1:860\n412#1:720,11\n433#1:777,11\n433#1:809\n457#1:820,11\n457#1:854\n412#1:859\n412#1:739,6\n433#1:796,6\n457#1:839,6\n433#1:772,5\n433#1:805\n433#1:810\n457#1:814,6\n457#1:848\n457#1:855\n400#1:902\n400#1:903,2\n423#1:905\n425#1:906\n465#1:907\n493#1:908\n494#1:909\n495#1:910\n513#1:911\n514#1:912\n526#1:913\n527#1:914\n553#1:915\n556#1:916\n559#1:917\n562#1:918\n562#1:919,2\n604#1:921\n625#1:922\n646#1:923\n646#1:924,2\n*E\n"})
public final class o000 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54601OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54602OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54603OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(BoxScope boxScope, oo0O oo0o, int i) {
            super(2);
            this.f54601OooO0Oo = boxScope;
            this.f54603OooO0o0 = oo0o;
            this.f54602OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54602OooO0o | 1);
            o000.OooO0OO(this.f54601OooO0Oo, this.f54603OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54604OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54605OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54606OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54607OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54604OooO0Oo = boxScope;
            this.f54606OooO0o0 = oo0o;
            this.f54605OooO0o = roomUserInfoModel;
            this.f54607OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54607OooO0oO | 1);
            oo0O oo0o = this.f54606OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54605OooO0o;
            o000.OooO00o(this.f54604OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54608OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(BoxScope boxScope) {
            super(3);
            this.f54608OooO0Oo = boxScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468687012, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteMic.<anonymous> (LiveRoomScreenMicList.kt:630)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_room_bottom_mic_top_off, composer2, 0), (String) null, this.f54608OooO0Oo.matchParentSize(Modifier.INSTANCE), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54609OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54610OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(BoxScope boxScope, int i) {
            super(2);
            this.f54609OooO0Oo = boxScope;
            this.f54610OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54610OooO0o0 | 1);
            o000.OooO0O0(this.f54609OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54611OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(BoxScope boxScope) {
            super(3);
            this.f54611OooO0Oo = boxScope;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            AnimatedVisibilityScope AnimatedVisibility = animatedVisibilityScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1215933118, iIntValue, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteSound.<anonymous> (LiveRoomScreenMicList.kt:609)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(oOo00OO0.icon_room_mic_mute, composer2, 0), (String) null, this.f54611OooO0Oo.matchParentSize(Modifier.INSTANCE), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composer2, 24632, 104);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54612OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54613OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54614OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54615OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54612OooO0Oo = boxScope;
            this.f54614OooO0o0 = oo0o;
            this.f54613OooO0o = roomUserInfoModel;
            this.f54615OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54615OooO0oO | 1);
            oo0O oo0o = this.f54614OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54613OooO0o;
            o000.OooO0Oo(this.f54612OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54616OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54617OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54618OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54619OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54616OooO0Oo = boxScope;
            this.f54618OooO0o0 = oo0o;
            this.f54617OooO0o = roomUserInfoModel;
            this.f54619OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54619OooO0oO | 1);
            oo0O oo0o = this.f54618OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54617OooO0o;
            o000.OooO0Oo(this.f54616OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54620OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54621OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54622OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54623OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54620OooO0Oo = boxScope;
            this.f54622OooO0o0 = oo0o;
            this.f54621OooO0o = roomUserInfoModel;
            this.f54623OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54623OooO0oO | 1);
            oo0O oo0o = this.f54622OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54621OooO0o;
            o000.OooO0Oo(this.f54620OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54624OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54625OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54626OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54627OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54624OooO0Oo = boxScope;
            this.f54626OooO0o0 = oo0o;
            this.f54625OooO0o = roomUserInfoModel;
            this.f54627OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54627OooO0oO | 1);
            oo0O oo0o = this.f54626OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54625OooO0o;
            o000.OooO0Oo(this.f54624OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements FlowCollector<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54628OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function1<SoundRippleAnimationType, Unit>> f54629OooO0o0;

        public OooOOOO(MutableState mutableState, RoomUserInfoModel roomUserInfoModel) {
            this.f54628OooO0Oo = roomUserInfoModel;
            this.f54629OooO0o0 = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Boolean bool, Continuation continuation) {
            bool.booleanValue();
            RoomUserInfoModel roomUserInfoModel = this.f54628OooO0Oo;
            int iIntValue = roomUserInfoModel.getVoiceChangerId().getValue().intValue();
            MutableState<Function1<SoundRippleAnimationType, Unit>> mutableState = this.f54629OooO0o0;
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

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54630OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54631OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54632OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54633OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54630OooO0Oo = boxScope;
            this.f54632OooO0o0 = oo0o;
            this.f54631OooO0o = roomUserInfoModel;
            this.f54633OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54633OooO0oO | 1);
            oo0O oo0o = this.f54632OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54631OooO0o;
            o000.OooO0Oo(this.f54630OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<Function1<? super SoundRippleAnimationType, ? extends Unit>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Function1<SoundRippleAnimationType, Unit>> f54634OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(MutableState<Function1<SoundRippleAnimationType, Unit>> mutableState) {
            super(1);
            this.f54634OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Function1<? super SoundRippleAnimationType, ? extends Unit> function1) {
            Function1<? super SoundRippleAnimationType, ? extends Unit> it = function1;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f54634OooO0Oo.setValue((Function1<SoundRippleAnimationType, Unit>) it);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54635OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54636OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54635OooO0Oo = roomUserInfoModel;
            this.f54636OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54636OooO0o0 | 1);
            o000.OooO0o(this.f54635OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54637OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54638OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54639OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54637OooO0Oo = boxScope;
            this.f54639OooO0o0 = roomUserInfoModel;
            this.f54638OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54638OooO0o | 1);
            o000.OooO0o0(this.f54637OooO0Oo, this.f54639OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO implements FlowCollector<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54640OooO0Oo;

        public o000oOoO(MutableState<String> mutableState) {
            this.f54640OooO0Oo = mutableState;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(String str, Continuation continuation) {
            this.f54640OooO0Oo.setValue(str);
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54641OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54642OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54643OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(BoxScope boxScope, oo0O oo0o, int i) {
            super(2);
            this.f54641OooO0Oo = boxScope;
            this.f54643OooO0o0 = oo0o;
            this.f54642OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54642OooO0o | 1);
            o000.OooO0oO(this.f54641OooO0Oo, this.f54643OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Oo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54644OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54645OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54646OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54644OooO0Oo = boxScope;
            this.f54646OooO0o0 = roomUserInfoModel;
            this.f54645OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54645OooO0o | 1);
            o000.OooO0oo(this.f54644OooO0Oo, this.f54646OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54647OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54648OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54649OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54647OooO0Oo = boxScope;
            this.f54649OooO0o0 = roomUserInfoModel;
            this.f54648OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54648OooO0o | 1);
            o000.OooO0oo(this.f54647OooO0Oo, this.f54649OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<Context, SVGAView> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54650OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<SVGAView> f54651OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(LifecycleOwner lifecycleOwner, Ref.ObjectRef<SVGAView> objectRef) {
            super(1);
            this.f54650OooO0Oo = lifecycleOwner;
            this.f54651OooO0o0 = objectRef;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, com.code.android.uikit.svga.SVGAView, com.opensource.svgaplayer.SVGAImageView] */
        @Override // kotlin.jvm.functions.Function1
        public final SVGAView invoke(Context context) {
            Context it = context;
            Intrinsics.checkNotNullParameter(it, "it");
            ?? sVGAView = new SVGAView(it, null, 6, 0);
            sVGAView.setLoops(1);
            sVGAView.OooOO0O("svga/anim_mic_magic_voice.svga", this.f54650OooO0Oo);
            this.f54651OooO0o0.element = sVGAView;
            return sVGAView;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenMicList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt$MicInfoUserMicEmoji$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,695:1\n489#2,11:696\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenMicList.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenMicListKt$MicInfoUserMicEmoji$2$1\n*L\n658#1:696,11\n*E\n"})
    public static final class o0OoOo0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f54652OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(MutableState<String> mutableState) {
            super(1);
            this.f54652OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            MutableState<String> mutableState = this.f54652OooO0Oo;
            String value = mutableState.getValue();
            coil.request.OooO00o.C0170OooO00o.OooO0o(it, "coil#repeat_count", 1);
            coil.request.OooO00o.C0170OooO00o.OooO0o(it, "coil#animation_end_callback", new o000O000(mutableState, value));
            it.f8593OooO0o0 = new o000O0o(mutableState);
            return Unit.INSTANCE;
        }
    }

    public static final class o0ooOOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ BoxScope f54653OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RoomUserInfoModel f54654OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ oo0O f54655OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f54656OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, int i) {
            super(2);
            this.f54653OooO0Oo = boxScope;
            this.f54655OooO0o0 = oo0o;
            this.f54654OooO0o = roomUserInfoModel;
            this.f54656OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54656OooO0oO | 1);
            oo0O oo0o = this.f54655OooO0o0;
            RoomUserInfoModel roomUserInfoModel = this.f54654OooO0o;
            o000.OooOO0(this.f54653OooO0Oo, oo0o, roomUserInfoModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o implements FlowCollector<Boolean> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<SVGAView> f54657OooO0Oo;

        public oo000o(Ref.ObjectRef<SVGAView> objectRef) {
            this.f54657OooO0Oo = objectRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Boolean bool, Continuation continuation) {
            bool.booleanValue();
            SVGAView sVGAView = this.f54657OooO0Oo.element;
            if (sVGAView != null) {
                sVGAView.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final long OooO(State<Long> state) {
        return state.getValue().longValue();
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Painter painterPainterResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1650318595);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1650318595, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoHeaderState (LiveRoomScreenMicList.kt:524)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo0o.f54837OooO0O0, null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(oo0o.f54838OooO0OO, null, composerStartRestartGroup, 8, 1);
        if (((Boolean) stateCollectAsState.getValue()).booleanValue()) {
            composerStartRestartGroup.startReplaceableGroup(-7619359);
            painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_room_mic_lock, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else if (((Boolean) stateCollectAsState.getValue()).booleanValue() || ((Number) stateCollectAsState2.getValue()).longValue() <= 0) {
            composerStartRestartGroup.startReplaceableGroup(-7619177);
            painterPainterResource = PainterResources_androidKt.painterResource(oOo00OO0.icon_room_mic_default, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-7619221);
            MutableStateFlow<String> userHeader = roomUserInfoModel != null ? roomUserInfoModel.getUserHeader() : null;
            composerStartRestartGroup.startReplaceableGroup(-7619245);
            State stateCollectAsState3 = userHeader == null ? null : SnapshotStateKt.collectAsState(userHeader, null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.endReplaceableGroup();
            painterPainterResource = p417o0OoO0.o00Oo0.OooO0O0(stateCollectAsState3 != null ? (String) stateCollectAsState3.getValue() : null, null, composerStartRestartGroup, 0, 1);
            composerStartRestartGroup.endReplaceableGroup();
        }
        ContentScale crop = ContentScale.INSTANCE.getCrop();
        Modifier modifierM476padding3ABfNKs = Modifier.INSTANCE;
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(modifierM476padding3ABfNKs, Dp.m3765constructorimpl(53));
        if (!((Boolean) stateCollectAsState.getValue()).booleanValue() && ((Number) stateCollectAsState2.getValue()).longValue() > 0) {
            float f = 1;
            modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BorderKt.m180borderxT4_qwU(modifierM476padding3ABfNKs, Dp.m3765constructorimpl(f), o0oO0O0o.f46969OooOoO0, RoundedCornerShapeKt.getCircleShape()), Dp.m3765constructorimpl(f));
        }
        ImageKt.Image(painterPainterResource, (String) null, ClipKt.clip(modifierM523size3ABfNKs.then(modifierM476padding3ABfNKs), RoundedCornerShapeKt.getCircleShape()), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24632, 104);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(boxScope, oo0o, roomUserInfoModel, i));
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
                ComposerKt.traceEventStart(-2045110836, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteMic (LiveRoomScreenMicList.kt:623)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47372OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), boxScope.matchParentSize(Modifier.INSTANCE), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 468687012, true, new OooO0O0(boxScope)), composerStartRestartGroup, 200064, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(boxScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(BoxScope boxScope, oo0O oo0o, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(934705434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(934705434, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoMuteSound (LiveRoomScreenMicList.kt:602)");
        }
        AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(oo0o.f54839OooO0Oo, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), boxScope.matchParentSize(Modifier.INSTANCE), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1215933118, true, new OooO0o(boxScope)), composerStartRestartGroup, 200064, 16);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(boxScope, oo0o, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(186803807);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(186803807, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoSoundWave (LiveRoomScreenMicList.kt:551)");
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo0o.f54838OooO0OO, null, composerStartRestartGroup, 8, 1);
        if (((Number) stateCollectAsState.getValue()).longValue() == 0) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(boxScope, oo0o, roomUserInfoModel, i));
            return;
        }
        o000000 o000000Var = com.yalla.yalla.service.room.OooO00o.f24979OooO0oO;
        if (((Boolean) SnapshotStateKt.collectAsState(o000000Var.f47373OooO0OO, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup2 == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0O(boxScope, oo0o, roomUserInfoModel, i));
            return;
        }
        if (((Boolean) SnapshotStateKt.collectAsState(o000000Var.f47372OooO0O0, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue()) {
            long jLongValue = ((Number) stateCollectAsState.getValue()).longValue();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            if (l != null && jLongValue == l.longValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup3.updateScope(new OooOOO0(boxScope, oo0o, roomUserInfoModel, i));
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
            scopeUpdateScopeEndRestartGroup4.updateScope(new OooOOO(boxScope, oo0o, roomUserInfoModel, i));
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
        p417o0OoO0.o000000.OooO0O0(oo0o.f54841OooO0o0, null, new OooOOOO(mutableState, roomUserInfoModel), composerStartRestartGroup, 8, 1);
        o0000 o0000Var = o0000.f51866OooO00o;
        Modifier modifierM515requiredSize3ABfNKs = SizeKt.m515requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(70));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new OooOo00(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        o0000Var.OooO00o(modifierM515requiredSize3ABfNKs, (Function1) objRememberedValue2, composerStartRestartGroup, 390, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup5 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup5 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup5.updateScope(new OooOo(boxScope, oo0o, roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o(RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        MutableStateFlow<Integer> roomMemberType;
        Composer composerStartRestartGroup = composer.startRestartGroup(-189000665);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-189000665, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserIdentity (LiveRoomScreenMicList.kt:685)");
        }
        p517o0o0O0o.OooOOOO.f51970OooO00o.OooO0OO((roomUserInfoModel == null || (roomMemberType = roomUserInfoModel.getRoomMemberType()) == null) ? 0 : roomMemberType.getValue().intValue(), 518, 0, composerStartRestartGroup, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(1), 0.0f, 11, null), Dp.m3765constructorimpl(10)));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0o0(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        String strOooO0Oo;
        MutableStateFlow<String> headerCardUrl;
        String value;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1268342063);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1268342063, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserHeaderCard (LiveRoomScreenMicList.kt:669)");
        }
        MutableStateFlow<String> headerCardUrl2 = roomUserInfoModel != null ? roomUserInfoModel.getHeaderCardUrl() : null;
        boolean z = true;
        State stateCollectAsState = headerCardUrl2 == null ? null : SnapshotStateKt.collectAsState(headerCardUrl2, null, composerStartRestartGroup, 8, 1);
        String str = stateCollectAsState != null ? (String) stateCollectAsState.getValue() : null;
        if (str != null && !StringsKt.isBlank(str)) {
            z = false;
        }
        if (!z) {
            if (roomUserInfoModel == null || (headerCardUrl = roomUserInfoModel.getHeaderCardUrl()) == null || (value = headerCardUrl.getValue()) == null || (strOooO0Oo = p139o00OOooO.OooO0o.OooO0Oo(value)) == null) {
                strOooO0Oo = "";
            }
            p154o00OoO00.OooOo00.OooO00o(strOooO0Oo, true, 0, null, null, SizeKt.m515requiredSize3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(10), 7, null), Dp.m3765constructorimpl(60)), composerStartRestartGroup, 196656, 28);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(boxScope, roomUserInfoModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oO(BoxScope boxScope, oo0O oo0o, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1025399786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1025399786, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserMicEmoji (LiveRoomScreenMicList.kt:644)");
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
        p417o0OoO0.o000000.OooO0O0(oo0o.f54840OooO0o, null, new o000oOoO(mutableState), composerStartRestartGroup, 8, 1);
        if (!StringsKt.isBlank((String) mutableState.getValue())) {
            String strOooO0Oo = p139o00OOooO.OooO0o.OooO0Oo((String) mutableState.getValue());
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new o0OoOo0(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(p417o0OoO0.o00Oo0.OooO0OO(strOooO0Oo, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 0), (String) null, SizeKt.m515requiredSize3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(66)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 432, 120);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0O(boxScope, oo0o, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0oo(BoxScope boxScope, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1923648900);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1923648900, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoUserPendant (LiveRoomScreenMicList.kt:490)");
        }
        if (roomUserInfoModel == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new o00Oo0(boxScope, roomUserInfoModel, i));
            return;
        }
        State stateCollectAsState = SnapshotStateKt.collectAsState(roomUserInfoModel.getVipLevel(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState2 = SnapshotStateKt.collectAsState(roomUserInfoModel.isPremium(), null, composerStartRestartGroup, 8, 1);
        State stateCollectAsState3 = SnapshotStateKt.collectAsState(roomUserInfoModel.getPremiumLevel(), null, composerStartRestartGroup, 8, 1);
        if (roomUserInfoModel.needShowPremiumJustForCompose(composerStartRestartGroup, 8)) {
            composerStartRestartGroup.startReplaceableGroup(1828607844);
            p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
            p517o0o0O0o.OooOOOO.OooOOo(Boolean.valueOf(((Boolean) stateCollectAsState2.getValue()).booleanValue()), Integer.valueOf(((Number) stateCollectAsState3.getValue()).intValue()), false, 0.0f, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(16)), Alignment.INSTANCE.getBottomEnd()), composerStartRestartGroup, 262144, 12);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1828608082);
            p517o0o0O0o.OooOOOO oooOOOO2 = p517o0o0O0o.OooOOOO.f51970OooO00o;
            p517o0o0O0o.OooOOOO.OooOo0(null, Integer.valueOf(((Number) stateCollectAsState.getValue()).intValue()), null, 0.0f, boxScope.align(SizeKt.m523size3ABfNKs(Modifier.INSTANCE, Dp.m3765constructorimpl(16)), Alignment.INSTANCE.getBottomEnd()), composerStartRestartGroup, 262144, 13);
            composerStartRestartGroup.endReplaceableGroup();
        }
        p516o0o0O0OO.o0ooOOo.f51940OooO00o.OooO0OO(((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRankWeek(), null, composerStartRestartGroup, 8, 1).getValue()).intValue(), ((Number) SnapshotStateKt.collectAsState(roomUserInfoModel.getRankDay(), null, composerStartRestartGroup, 8, 1).getValue()).intValue(), boxScope.align(SizeKt.m525sizeVpY3zN4(Modifier.INSTANCE, Dp.m3765constructorimpl(24), Dp.m3765constructorimpl(13)), Alignment.INSTANCE.getBottomStart()), composerStartRestartGroup, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new o00Ooo(boxScope, roomUserInfoModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooOO0(BoxScope boxScope, oo0O oo0o, RoomUserInfoModel roomUserInfoModel, Composer composer, int i) {
        MutableStateFlow<Integer> voiceChangerId;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1155331126);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1155331126, i, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoVoiceChangerEffect (LiveRoomScreenMicList.kt:578)");
        }
        if (((roomUserInfoModel == null || (voiceChangerId = roomUserInfoModel.getVoiceChangerId()) == null) ? 0 : voiceChangerId.getValue().intValue()) > 0) {
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            p417o0OoO0.o000000.OooO0O0(oo0o.f54841OooO0o0, null, new oo000o(objectRef), composerStartRestartGroup, 8, 1);
            AndroidView_androidKt.AndroidView(new o00oO0o(lifecycleOwner, objectRef), boxScope.matchParentSize(Modifier.INSTANCE), null, composerStartRestartGroup, 0, 4);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o0ooOOo(boxScope, oo0o, roomUserInfoModel, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOO0O(RowScope rowScope, oo0O oo0o, Modifier modifier, int i, Composer composer, int i2) {
        MutableStateFlow<String> userName;
        String value;
        int i3;
        String strValueOf;
        MutableStateFlow<String> userName2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1127522148);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1127522148, i2, -1, "com.yalla.yalla.ui.screen.room.live.MicInfoView (LiveRoomScreenMicList.kt:394)");
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
        float fMo324toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo324toPx0680j_4(Dp.m3765constructorimpl(22));
        composerStartRestartGroup.startReplaceableGroup(607349848);
        if (oo0o.f54836OooO00o == i) {
            o0O0O00.OooO00o(oo0o, ((Number) ((Pair) mutableState.getValue()).getFirst()).intValue(), ((Number) ((Pair) mutableState.getValue()).getSecond()).intValue() - ((int) fMo324toPx0680j_4), composerStartRestartGroup, 8);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        Modifier modifierOooO00o = p153o00OoO0.OooOO0.OooO00o(85, androidx.compose.foundation.layout.OooOO0O.OooO00o(rowScope, companion3.then(modifier), 1.0f, false, 2, null), composerStartRestartGroup, 1157296644);
        boolean zChanged = composerStartRestartGroup.changed(mutableState);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new o000Oo0(mutableState);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(modifierOooO00o, (Function1) objRememberedValue2);
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooOOO0.OooO0O0(arrangement, centerHorizontally, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO0O0, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        State stateCollectAsState = SnapshotStateKt.collectAsState(oo0o.f54838OooO0OO, null, composerStartRestartGroup, 8, 1);
        Long lValueOf = Long.valueOf(OooO(stateCollectAsState));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(lValueOf);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
            ArrayList arrayList = com.yalla.yalla.service.room.OooO00o.f24973OooO00o;
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
            o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            final Flow<String> flowOooO0o0 = o0o00OooOOo.OooO0o0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue(), jOooO);
            objRememberedValue4 = new Flow<String>() { // from class: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1

                /* JADX INFO: renamed from: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2, reason: invalid class name */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 FriendRepo.kt\ncom/yalla/yalla/data/repository/FriendRepo\n*L\n1#1,222:1\n48#2:223\n91#3,4:224\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {

                    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                    public final /* synthetic */ FlowCollector f22974OooO0Oo;

                    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                    public final /* synthetic */ String f22975OooO0o0;

                    /* JADX INFO: renamed from: com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "com.yalla.yalla.data.repository.FriendRepo$loadFriendMemoName$$inlined$map$1$2", f = "FriendRepo.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,222:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {

                        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                        public /* synthetic */ Object f22976OooO0Oo;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public int f22978OooO0o0;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.f22976OooO0Oo = obj;
                            this.f22978OooO0o0 |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, String str) {
                        this.f22974OooO0Oo = flowCollector;
                        this.f22975OooO0o0 = str;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.f22978OooO0o0;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.f22978OooO0o0 = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.f22976OooO0Oo;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.f22978OooO0o0;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            String str = (String) obj;
                            if ((str == null || StringsKt.isBlank(str)) && (str = this.f22975OooO0o0) == null) {
                                str = "";
                            }
                            anonymousClass1.f22978OooO0o0 = 1;
                            if (this.f22974OooO0Oo.emit(str, anonymousClass1) == coroutine_suspended) {
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
            o000000O o000000o3 = o000000O.f46674OooO00o;
            Long l = (Long) o000000O.OooOOo0().getValue();
            objRememberedValue5 = Boolean.valueOf(l != null && l.longValue() == OooO(stateCollectAsState));
            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
        }
        composerStartRestartGroup.endReplaceableGroup();
        boolean zBooleanValue = ((Boolean) objRememberedValue5).booleanValue();
        Alignment center = companion2.getCenter();
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion3, 0.0f, Dp.m3765constructorimpl(15), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(50));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor2);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(331386827);
        if (OooO(stateCollectAsState) > 0) {
            OooO0Oo(boxScopeInstance, oo0o, roomUserInfoModel, composerStartRestartGroup, 582);
        }
        composerStartRestartGroup.endReplaceableGroup();
        OooO00o(boxScopeInstance, oo0o, roomUserInfoModel, composerStartRestartGroup, 582);
        composerStartRestartGroup.startReplaceableGroup(1739789758);
        if (OooO(stateCollectAsState) > 0) {
            OooOO0(boxScopeInstance, oo0o, roomUserInfoModel, composerStartRestartGroup, 582);
            if (zBooleanValue) {
                composerStartRestartGroup.startReplaceableGroup(331387110);
                OooO0O0(boxScopeInstance, composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(331387155);
                OooO0OO(boxScopeInstance, oo0o, composerStartRestartGroup, 70);
                composerStartRestartGroup.endReplaceableGroup();
            }
            OooO0o0(boxScopeInstance, roomUserInfoModel, composerStartRestartGroup, 70);
            OooO0oo(boxScopeInstance, roomUserInfoModel, composerStartRestartGroup, 70);
            OooO0oO(boxScopeInstance, oo0o, composerStartRestartGroup, 70);
        }
        p148o00Oo0o.o0ooOOo.OooO00o(composerStartRestartGroup);
        float f = 2;
        com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO00o2 = o0oOO.OooO00o(f, SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(20)), 0.0f, 2, null, composerStartRestartGroup, 693286680);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO00o2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor3);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(331387693);
        if (OooO(stateCollectAsState) > 0) {
            i3 = 8;
            OooO0o(roomUserInfoModel, composerStartRestartGroup, 8);
        } else {
            i3 = 8;
        }
        composerStartRestartGroup.endReplaceableGroup();
        State stateCollectAsState3 = SnapshotStateKt.collectAsState(oo0o.f54837OooO0O0, null, composerStartRestartGroup, i3, 1);
        p517o0o0O0o.OooOOOO oooOOOO = p517o0o0O0o.OooOOOO.f51970OooO00o;
        composerStartRestartGroup.startReplaceableGroup(331387861);
        if (((Boolean) stateCollectAsState3.getValue()).booleanValue()) {
            strValueOf = StringResources_androidKt.stringResource(oO00OOo0.tip_locked, composerStartRestartGroup, 0);
        } else {
            strValueOf = (((Boolean) stateCollectAsState3.getValue()).booleanValue() || OooO(stateCollectAsState) <= 0) ? String.valueOf(oo0o.f54836OooO00o + 1) : (String) stateCollectAsState2.getValue();
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i4 = o0oO0O0o.f47152o00OOOo;
        oooOOOO.OooOOOo(strValueOf, zBooleanValue ? o0oO0O0o.f46993OoooOo0 : o0oO0O0o.f46961OooOOo0, false, TextUnitKt.getSp(10), TextOverflow.INSTANCE.m3719getEllipsisgIe3tQ8(), 0, null, false, companion3.then(zBooleanValue ? PaddingKt.m478paddingVpY3zN4$default(BorderKt.m180borderxT4_qwU(companion3, Dp.m3765constructorimpl(1), o0oO0O0o.f46993OoooOo0, RoundedCornerShapeKt.RoundedCornerShape(50)), Dp.m3765constructorimpl(5), 0.0f, 2, null) : companion3), composerStartRestartGroup, 1073769472, 228);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O00(rowScope, oo0o, modifier, i, i2));
    }
}
