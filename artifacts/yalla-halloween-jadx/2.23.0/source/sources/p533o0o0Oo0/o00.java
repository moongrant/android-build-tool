package p533o0o0Oo0;

import android.app.Activity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.LifecycleOwner;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.mixedroom.model.RoomLoginInformation;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.vm.LiveRoomVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import p100o000oOoo.o0000O0;
import p150o00Oo0oO.o00000OO;
import p151o00Oo0oo.o000OO;
import p417o0OoO0.o00O0O;
import p417o0OoO0.o00Oo0;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p475o0o000.oo0o0Oo;
import p516o0o0O0OO.o0ooOOo;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOO;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,335:1\n66#2,6:336\n72#2:370\n76#2:420\n66#2,6:422\n72#2:456\n76#2:469\n67#2,5:471\n72#2:504\n76#2:521\n78#3,11:342\n78#3,11:377\n91#3:414\n91#3:419\n78#3,11:428\n91#3:468\n78#3,11:476\n91#3:520\n78#3,11:528\n78#3,11:566\n91#3:601\n91#3:607\n456#4,8:353\n464#4,3:367\n456#4,8:388\n464#4,3:402\n467#4,3:411\n467#4,3:416\n456#4,8:439\n464#4,3:453\n36#4:457\n467#4,3:465\n456#4,8:487\n464#4,3:501\n36#4:506\n467#4,3:517\n456#4,8:539\n464#4,3:553\n456#4,8:577\n464#4,3:591\n467#4,3:598\n467#4,3:604\n4144#5,6:361\n4144#5,6:396\n4144#5,6:447\n4144#5,6:495\n4144#5,6:547\n4144#5,6:585\n73#6,6:371\n79#6:405\n83#6:415\n72#6,7:559\n79#6:594\n83#6:602\n154#7:406\n154#7:407\n154#7:408\n154#7:409\n154#7:410\n154#7:421\n154#7:464\n154#7:470\n154#7:505\n154#7:513\n154#7:514\n154#7:516\n154#7:557\n154#7:558\n154#7:595\n154#7:596\n154#7:597\n164#7:603\n1097#8,6:458\n1097#8,6:507\n76#9:515\n72#10,6:522\n78#10:556\n82#10:608\n81#11:609\n81#11:610\n81#11:611\n107#11,2:612\n81#11:614\n81#11:615\n81#11:616\n81#11:617\n107#11,2:618\n81#11:620\n81#11:621\n81#11:622\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt\n*L\n92#1:336,6\n92#1:370\n92#1:420\n135#1:422,6\n135#1:456\n135#1:469\n179#1:471,5\n179#1:504\n179#1:521\n92#1:342,11\n98#1:377,11\n98#1:414\n92#1:419\n135#1:428,11\n135#1:468\n179#1:476,11\n179#1:520\n296#1:528,11\n306#1:566,11\n306#1:601\n296#1:607\n92#1:353,8\n92#1:367,3\n98#1:388,8\n98#1:402,3\n98#1:411,3\n92#1:416,3\n135#1:439,8\n135#1:453,3\n140#1:457\n135#1:465,3\n179#1:487,8\n179#1:501,3\n198#1:506\n179#1:517,3\n296#1:539,8\n296#1:553,3\n306#1:577,8\n306#1:591,3\n306#1:598,3\n296#1:604,3\n92#1:361,6\n98#1:396,6\n135#1:447,6\n179#1:495,6\n296#1:547,6\n306#1:585,6\n98#1:371,6\n98#1:405\n98#1:415\n306#1:559,7\n306#1:594\n306#1:602\n117#1:406\n119#1:407\n123#1:408\n125#1:409\n127#1:410\n135#1:421\n147#1:464\n179#1:470\n186#1:505\n205#1:513\n244#1:514\n270#1:516\n297#1:557\n303#1:558\n309#1:595\n310#1:596\n314#1:597\n317#1:603\n140#1:458,6\n198#1:507,6\n265#1:515\n296#1:522,6\n296#1:556\n296#1:608\n121#1:609\n137#1:610\n138#1:611\n138#1:612,2\n151#1:614\n162#1:615\n178#1:616\n195#1:617\n195#1:618,2\n238#1:620\n299#1:621\n312#1:622\n*E\n"})
public final class o00 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f54584OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102042");
            o0O0ooO onLogin = o0O0ooO.f54822OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f54585OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102049");
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47514OooOO0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt$RoomFollowAndJoinMemberIconButton$1$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,335:1\n489#2,11:336\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt$RoomFollowAndJoinMemberIconButton$1$2$1\n*L\n199#1:336,11\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54586OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<Boolean> mutableState) {
            super(1);
            this.f54586OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.f8593OooO0o0 = new o00O0000(this.f54586OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f54587OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102049");
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47506OooO00o.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f54588OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
            oo0o0oo.getClass();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            oo0o0oo.f47512OooO0oO.setValue("");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f54589OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47513OooO0oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f54590OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f54591OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f54592OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f54590OooO0Oo = liveRoomVM;
            this.f54592OooO0o0 = o0o0ooo0;
            this.f54591OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0OO000.OooO00o("102163");
            o00O000 onLogin = new o00O000(this.f54590OooO0Oo, this.f54592OooO0o0, this.f54591OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f54593OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54594OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f54595OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, int i) {
            super(2);
            this.f54593OooO0Oo = liveRoomVM;
            this.f54595OooO0o0 = o0o0ooo0;
            this.f54594OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54594OooO0o | 1);
            o00.OooO00o(this.f54593OooO0Oo, this.f54595OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f54596OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<coil.request.OooO00o.C0170OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f54597OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MutableState<Boolean> mutableState) {
            super(1);
            this.f54597OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0170OooO00o c0170OooO00o) {
            coil.request.OooO00o.C0170OooO00o it = c0170OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            o00O000o listener = new o00O000o(this.f54597OooO0Oo);
            Intrinsics.checkNotNullParameter(it, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            it.f8593OooO0o0 = new o00O0O(listener, listener, listener);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54598OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(int i) {
            super(2);
            this.f54598OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f54598OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f54599OooO0Oo = new OooOo00();

        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }
    }

    public static final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f54600OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(int i) {
            super(2);
            this.f54600OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f54600OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-23470811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-23470811, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomFollowAndJoinMemberIconButton (LiveRoomScreenTopInfo.kt:175)");
        }
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25008OooOO0o, composerStartRestartGroup, 8);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM523size3ABfNKs = SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(37));
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM523size3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Integer num = (Integer) stateObserveAsState.getValue();
        if (num != null && num.intValue() == 1) {
            composerStartRestartGroup.startReplaceableGroup(1809607140);
            ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_room_member_host, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, OooO00o.f54585OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                composerStartRestartGroup.startReplaceableGroup(1809607731);
                MutableState mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOO0.f54596OooO0Oo, composerStartRestartGroup, 3080, 6);
                oo0o0Oo oo0o0oo = com.yalla.yalla.service.room.OooO00o.f24986OooOOOO;
                String str = (String) oo0o0oo.f47509OooO0Oo.getValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0O0(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(o00Oo0.OooO0OO(str, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, OooO0OO.f54587OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                composerStartRestartGroup.startReplaceableGroup(1809608487);
                MutableState mutableState2 = oo0o0oo.f47512OooO0oO;
                if (!StringsKt.isBlank((String) mutableState2.getValue())) {
                    p154o00OoO00.OooOo00.OooO00o((String) mutableState2.getValue(), true, 1, null, OooO0o.f54588OooO0Oo, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 221616, 8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(String.valueOf(oo0o0oo.OooO0Oo()), (Modifier) null, o0oO0O0o.f46946OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 199680, 0, 65490);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
                composerStartRestartGroup = composer2;
            } else if (num != null && num.intValue() == 0) {
                composerStartRestartGroup.startReplaceableGroup(1809609557);
                if (Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25007OooOO0O, composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                    composerStartRestartGroup.startReplaceableGroup(1809609693);
                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_room_member_join, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, OooO.f54584OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24986OooOOOO.f47513OooO0oo.getValue()).booleanValue()) {
                        p154o00OoO00.OooOo00.OooO00o("svga/anim_room_member_guide.svga", true, 1, null, OooOO0.f54589OooO0Oo, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 221622, 8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1809610948);
                    ImageKt.Image(PainterResources_androidKt.painterResource(oO00OOO.ic_room_follow, composerStartRestartGroup, 0), (String) null, o0O0O00.OooO0O0(SizeKt.m523size3ABfNKs(companion, Dp.m3765constructorimpl(27)), false, false, 0L, false, null, null, null, new OooOO0O(liveRoomVM, o0o0ooo0, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1809612204);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(liveRoomVM, o0o0ooo0, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Composer composer, int i) {
        Modifier modifier;
        Modifier modifierM169backgroundbw27NRU$default;
        Composer composerStartRestartGroup = composer.startRestartGroup(702224724);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(702224724, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomHeader (LiveRoomScreenTopInfo.kt:133)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(36, companion, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24998OooO00o, composerStartRestartGroup, 8);
            MutableState mutableState = (MutableState) RememberSaveableKt.m1322rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOo00.f54599OooO0Oo, composerStartRestartGroup, 3080, 6);
            String str = (String) stateObserveAsState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOOOO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            o0000O0 o0000o0OooO0O0 = o00Oo0.OooO0O0(str, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0);
            ContentScale crop = ContentScale.INSTANCE.getCrop();
            Modifier modifierOooO0O0 = com.facebook.OooOo.OooO0O0(4, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null));
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                modifier = modifierOooO0O0;
                modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f46946OooO0O0, null, 2, null);
            } else {
                modifier = modifierOooO0O0;
                modifierM169backgroundbw27NRU$default = companion;
            }
            ImageKt.Image(o0000o0OooO0O0, (String) null, modifier.then(modifierM169backgroundbw27NRU$default), (Alignment) null, crop, 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24979OooO0oO.f47373OooO0OO, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, o0OO00O.f54823OooO00o, composerStartRestartGroup, 200064, 18);
            Boolean havePassword = (Boolean) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25012OooOOOo, Boolean.FALSE, composerStartRestartGroup, 56).getValue();
            Intrinsics.checkNotNullExpressionValue(havePassword, "havePassword");
            AnimatedVisibilityKt.AnimatedVisibility(havePassword.booleanValue(), (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, o0OO00O.f54824OooO0O0, composerStartRestartGroup, 200064, 18);
            if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOo(i));
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0223  */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(Composer composer, int i) {
        Composer composer2;
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-818200644);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-818200644, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomNameAndID (LiveRoomScreenTopInfo.kt:294)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxHeight$default);
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
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO;
            String str = (String) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24999OooO0O0, "", composerStartRestartGroup, 56).getValue();
            if (str == null) {
                str = "";
            }
            long jOooO0OO = com.code.android.util.o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            long j = o0oO0O0o.f46946OooO0O0;
            o000OO.OooO00o(str, j, jOooO0OO, SizeKt.m530widthInVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(99), 1, null), false, composerStartRestartGroup, 3072, 16);
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
            if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            o0ooOOo.f51940OooO00o.OooO0O0(((Number) com.yalla.yalla.service.room.OooO00o.f24978OooO0o0.f47487OooO0O0.getValue()).intValue(), 432, 0, composerStartRestartGroup, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3765constructorimpl(5), 0.0f, 11, null), Dp.m3765constructorimpl(16)));
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f25000OooO0OO, 0L, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(926086501);
            if (((Long) stateObserveAsState.getValue()) == null) {
                composer2 = composerStartRestartGroup;
                i2 = 6;
            } else {
                Long l = (Long) stateObserveAsState.getValue();
                if ((l != null ? l.longValue() : 0L) > 0) {
                    String str2 = "ID:" + ((Long) stateObserveAsState.getValue());
                    long jOooO0OO2 = com.code.android.util.o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    Modifier modifierM478paddingVpY3zN4$default = PaddingKt.m478paddingVpY3zN4$default(companion, 0.0f, Dp.m3765constructorimpl(4), 1, null);
                    composer2 = composerStartRestartGroup;
                    TextKt.m1251Text4IGK_g(str2, modifierM478paddingVpY3zN4$default, j, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                    i2 = 6;
                } else {
                    composer2 = composerStartRestartGroup;
                    i2 = 6;
                }
            }
            p148o00Oo0o.o0ooOOo.OooO00o(composer2);
            com.code.android.util.OooOO0.OooO0o(Dp.m3765constructorimpl((float) 5.5d), null, composer2, i2, 2);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo000(i));
    }

    public static final void OooO0Oo(LiveRoomVM liveRoomVM, o0O0OOO0 o0o0ooo0, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-855353523);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855353523, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTop (LiveRoomScreenTopInfo.kt:90)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM168backgroundbw27NRU = BackgroundKt.m168backgroundbw27NRU(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), o0oO0O0o.f46947OooO0OO, RoundedCornerShapeKt.RoundedCornerShape$default(0, 50, 50, 0, 9, (Object) null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = p018OooOoo0.OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM168backgroundbw27NRU);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, null, 3, null), false, false, 0L, false, null, null, null, o000OO00.f54719OooO0Oo, 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o2 = androidx.compose.material.OooO.OooO00o(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 6;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        OooO0O0(composerStartRestartGroup, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        OooO0OO(composerStartRestartGroup, 0);
        if (((RoomLoginInformation) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24995OoooOOO.OooO00o().f25005OooO0oo, null, composerStartRestartGroup, 56).getValue()) != null) {
            composerStartRestartGroup.startReplaceableGroup(1808510552);
            float f2 = 3;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            OooO00o(liveRoomVM, o0o0ooo0, composerStartRestartGroup, (i & 14) | 64);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1808510732);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(16), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OOo0(liveRoomVM, o0o0ooo0, i));
    }
}
