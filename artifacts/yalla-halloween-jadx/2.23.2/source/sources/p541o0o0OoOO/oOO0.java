package p541o0o0OoOO;

import android.app.Activity;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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
import androidx.media3.session.o00O0;
import androidx.media3.session.o00O0O0;
import com.code.android.util.o0000O0;
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
import p194o00o0OO.o00O000o;
import p200o00o0OoO.o00OO00O;
import p423o0OoO0OO.o0000O0O;
import p423o0OoO0OO.o000OO;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p483o0o000Oo.o0000Ooo;
import p523o0o0O0oo.oO000O0O;
import p562o0oOo000.o0O0O00;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,334:1\n66#2,6:335\n72#2:369\n76#2:419\n66#2,6:421\n72#2:455\n76#2:468\n67#2,5:470\n72#2:503\n76#2:520\n78#3,11:341\n78#3,11:376\n91#3:413\n91#3:418\n78#3,11:427\n91#3:467\n78#3,11:475\n91#3:519\n78#3,11:527\n78#3,11:565\n91#3:600\n91#3:606\n456#4,8:352\n464#4,3:366\n456#4,8:387\n464#4,3:401\n467#4,3:410\n467#4,3:415\n456#4,8:438\n464#4,3:452\n36#4:456\n467#4,3:464\n456#4,8:486\n464#4,3:500\n36#4:505\n467#4,3:516\n456#4,8:538\n464#4,3:552\n456#4,8:576\n464#4,3:590\n467#4,3:597\n467#4,3:603\n4144#5,6:360\n4144#5,6:395\n4144#5,6:446\n4144#5,6:494\n4144#5,6:546\n4144#5,6:584\n73#6,6:370\n79#6:404\n83#6:414\n72#6,7:558\n79#6:593\n83#6:601\n154#7:405\n154#7:406\n154#7:407\n154#7:408\n154#7:409\n154#7:420\n154#7:463\n154#7:469\n154#7:504\n154#7:512\n154#7:513\n154#7:515\n154#7:556\n154#7:557\n154#7:594\n154#7:595\n154#7:596\n164#7:602\n1097#8,6:457\n1097#8,6:506\n76#9:514\n72#10,6:521\n78#10:555\n82#10:607\n81#11:608\n81#11:609\n81#11:610\n107#11,2:611\n81#11:613\n81#11:614\n81#11:615\n81#11:616\n107#11,2:617\n81#11:619\n81#11:620\n81#11:621\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt\n*L\n91#1:335,6\n91#1:369\n91#1:419\n134#1:421,6\n134#1:455\n134#1:468\n178#1:470,5\n178#1:503\n178#1:520\n91#1:341,11\n97#1:376,11\n97#1:413\n91#1:418\n134#1:427,11\n134#1:467\n178#1:475,11\n178#1:519\n295#1:527,11\n305#1:565,11\n305#1:600\n295#1:606\n91#1:352,8\n91#1:366,3\n97#1:387,8\n97#1:401,3\n97#1:410,3\n91#1:415,3\n134#1:438,8\n134#1:452,3\n139#1:456\n134#1:464,3\n178#1:486,8\n178#1:500,3\n197#1:505\n178#1:516,3\n295#1:538,8\n295#1:552,3\n305#1:576,8\n305#1:590,3\n305#1:597,3\n295#1:603,3\n91#1:360,6\n97#1:395,6\n134#1:446,6\n178#1:494,6\n295#1:546,6\n305#1:584,6\n97#1:370,6\n97#1:404\n97#1:414\n305#1:558,7\n305#1:593\n305#1:601\n116#1:405\n118#1:406\n122#1:407\n124#1:408\n126#1:409\n134#1:420\n146#1:463\n178#1:469\n185#1:504\n204#1:512\n243#1:513\n269#1:515\n296#1:556\n302#1:557\n308#1:594\n309#1:595\n313#1:596\n316#1:602\n139#1:457,6\n197#1:506,6\n264#1:514\n295#1:521,6\n295#1:555\n295#1:607\n120#1:608\n136#1:609\n137#1:610\n137#1:611,2\n150#1:613\n161#1:614\n177#1:615\n194#1:616\n194#1:617,2\n237#1:619\n298#1:620\n311#1:621\n*E\n"})
public final class oOO0 {

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f55198OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102042");
            oOO0O00O onLogin = oOO0O00O.f55235OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f55199OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102049");
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48527OooOO0.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nLiveRoomScreenTopInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt$RoomFollowAndJoinMemberIconButton$1$2$1\n+ 2 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n*L\n1#1,334:1\n489#2,11:335\n*S KotlinDebug\n*F\n+ 1 LiveRoomScreenTopInfo.kt\ncom/yalla/yalla/ui/screen/room/live/LiveRoomScreenTopInfoKt$RoomFollowAndJoinMemberIconButton$1$2$1\n*L\n198#1:335,11\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55200OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(MutableState<Boolean> mutableState) {
            super(1);
            this.f55200OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            it.f11683OooO0o0 = new oOO0O000(this.f55200OooO0Oo);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f55201OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102049");
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48519OooO00o.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f55202OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
            o0000ooo.getClass();
            Intrinsics.checkNotNullParameter("", "<set-?>");
            o0000ooo.f48525OooO0oO.setValue("");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f55203OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48526OooO0oo.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f55204OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f55205OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f55206OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f55204OooO0Oo = liveRoomVM;
            this.f55206OooO0o0 = o0ooo0o1;
            this.f55205OooO0o = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0oo0000.OooO00o.OooO0O0("102163");
            oOO0O0O0 onLogin = new oOO0O0O0(this.f55204OooO0Oo, this.f55206OooO0o0, this.f55205OooO0o);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LiveRoomVM f55207OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f55208OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f55209OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, int i) {
            super(2);
            this.f55207OooO0Oo = liveRoomVM;
            this.f55209OooO0o0 = o0ooo0o1;
            this.f55208OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f55208OooO0o | 1);
            oOO0.OooO00o(this.f55207OooO0Oo, this.f55209OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOOO0 f55210OooO0Oo = new OooOOO0();

        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<coil.request.OooO00o.C0189OooO00o, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f55211OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MutableState<Boolean> mutableState) {
            super(1);
            this.f55211OooO0Oo = mutableState;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(coil.request.OooO00o.C0189OooO00o c0189OooO00o) {
            coil.request.OooO00o.C0189OooO00o it = c0189OooO00o;
            Intrinsics.checkNotNullParameter(it, "it");
            oOO0O0O listener = new oOO0O0O(this.f55211OooO0Oo);
            Intrinsics.checkNotNullParameter(it, "<this>");
            Intrinsics.checkNotNullParameter(listener, "listener");
            it.f11683OooO0o0 = new o0000O0O(listener, listener, listener);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo f55212OooO0Oo = new OooOo();

        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f55213OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55214OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(int i) {
            super(2);
            this.f55214OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0.OooO0O0(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55214OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<MutableState<Boolean>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f55215OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MutableState<Boolean> invoke() {
            return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.TRUE, null, 2, null);
        }
    }

    public static final class o000oOoO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f55216OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(int i) {
            super(2);
            this.f55216OooO0Oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            oOO0.OooO0OO(composer, RecomposeScopeImplKt.updateChangedFlags(this.f55216OooO0Oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-23470811);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-23470811, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomFollowAndJoinMemberIconButton (LiveRoomScreenTopInfo.kt:174)");
        }
        com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
        State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24546OooOO0o, composerStartRestartGroup, 8);
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM525size3ABfNKs = SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(37));
        Alignment center = Alignment.INSTANCE.getCenter();
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM525size3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Integer num = (Integer) stateObserveAsState.getValue();
        if (num != null && num.intValue() == 1) {
            composerStartRestartGroup.startReplaceableGroup(1809607160);
            ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_member_host, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, OooO00o.f55199OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            if ((num != null && num.intValue() == 2) || (num != null && num.intValue() == 3)) {
                composerStartRestartGroup.startReplaceableGroup(1809607751);
                MutableState mutableState = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) OooOOO0.f55210OooO0Oo, composerStartRestartGroup, 3080, 6);
                o0000Ooo o0000ooo = com.yalla.yalla.service.room.OooO00o.f24524OooOOOO;
                String str = (String) o0000ooo.f48522OooO0Oo.getValue();
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                boolean zChanged = composerStartRestartGroup.changed(mutableState);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new OooO0O0(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ImageKt.Image(o000OO.OooO0OO(str, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, OooO0OO.f55201OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                composerStartRestartGroup.startReplaceableGroup(1809608507);
                MutableState mutableState2 = o0000ooo.f48525OooO0oO;
                if (!StringsKt.isBlank((String) mutableState2.getValue())) {
                    o00OO00O.OooO00o((String) mutableState2.getValue(), true, 1, null, OooO0o.f55202OooO0Oo, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 221616, 8);
                }
                composerStartRestartGroup.endReplaceableGroup();
                if (((Boolean) mutableState.getValue()).booleanValue()) {
                    composer2 = composerStartRestartGroup;
                    TextKt.m1261Text4IGK_g(String.valueOf(o0000ooo.OooO0Oo()), (Modifier) null, o0OOo000.f48135OooO0O0, TextUnitKt.getSp(11), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composer2, 199680, 0, 65490);
                } else {
                    composer2 = composerStartRestartGroup;
                }
                composer2.endReplaceableGroup();
                composerStartRestartGroup = composer2;
            } else if (num != null && num.intValue() == 0) {
                composerStartRestartGroup.startReplaceableGroup(1809609577);
                if (Intrinsics.areEqual((Boolean) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24545OooOO0O, composerStartRestartGroup, 8).getValue(), Boolean.TRUE)) {
                    composerStartRestartGroup.startReplaceableGroup(1809609713);
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_member_join, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, OooO.f55198OooO0Oo, 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    if (((Boolean) com.yalla.yalla.service.room.OooO00o.f24524OooOOOO.f48526OooO0oo.getValue()).booleanValue()) {
                        o00OO00O.OooO00o("svga/anim_room_member_guide.svga", true, 1, null, OooOO0.f55203OooO0Oo, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), composerStartRestartGroup, 221622, 8);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(1809610968);
                    ImageKt.Image(PainterResources_androidKt.painterResource(o0O0O00.ic_room_follow, composerStartRestartGroup, 0), (String) null, com.code.android.util.o0O0O00.OooO0O0(SizeKt.m525size3ABfNKs(companion, Dp.m3775constructorimpl(27)), false, false, 0L, false, null, null, null, new OooOO0O(liveRoomVM, o0ooo0o1, (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())), 253), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(1809612224);
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO(liveRoomVM, o0ooo0o1, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(702224724);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(702224724, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomHeader (LiveRoomScreenTopInfo.kt:132)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierOooO00o = o00O0.OooO00o(36, companion, composerStartRestartGroup, 733328855);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24536OooO00o, composerStartRestartGroup, 8);
            MutableState mutableState = (MutableState) RememberSaveableKt.m1333rememberSaveable(new Object[0], (Saver) null, (String) null, (Function0) Oooo000.f55215OooO0Oo, composerStartRestartGroup, 3080, 6);
            String str = (String) stateObserveAsState.getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(mutableState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooOOOO(mutableState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            ImageKt.Image(o000OO.OooO0O0(str, (Function1) objRememberedValue, composerStartRestartGroup, 0, 0), (String) null, o00O0O0.OooO00o(4, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null)).then(((Boolean) mutableState.getValue()).booleanValue() ? BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48135OooO0O0, null, 2, null) : companion), (Alignment) null, ContentScale.INSTANCE.getCrop(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
            AnimatedVisibilityKt.AnimatedVisibility(((Boolean) SnapshotStateKt.collectAsState(com.yalla.yalla.service.room.OooO00o.f24517OooO0oO.f48578OooO0OO, null, composerStartRestartGroup, 8, 1).getValue()).booleanValue(), SemanticsModifierKt.semantics$default(companion, false, OooOo00.f55213OooO0Oo, 1, null), EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null), (String) null, oOo000o0.f55294OooO00o, composerStartRestartGroup, 200064, 16);
            Boolean bool = (Boolean) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24550OooOOOo, Boolean.FALSE, composerStartRestartGroup, 56).getValue();
            EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
            ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null);
            Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, OooOo.f55212OooO0Oo, 1, null);
            Intrinsics.checkNotNull(bool);
            AnimatedVisibilityKt.AnimatedVisibility(bool.booleanValue(), modifierSemantics$default, enterTransitionFadeIn$default, exitTransitionFadeOut$default, (String) null, oOo000o0.f55295OooO0O0, composerStartRestartGroup, 200064, 16);
            if (androidx.compose.material.OooO0o.OooO00o(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Oooo0(i));
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
                ComposerKt.traceEventStart(-818200644, i, -1, "com.yalla.yalla.ui.screen.room.live.RoomNameAndID (LiveRoomScreenTopInfo.kt:293)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(companion2, top, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(6), null, composerStartRestartGroup, 6, 2);
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            String str = (String) LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24537OooO0O0, "", composerStartRestartGroup, 56).getValue();
            if (str == null) {
                str = "";
            }
            long jOooO0OO = o0000O0.OooO0OO(15, composerStartRestartGroup, 6);
            long j = o0OOo000.f48135OooO0O0;
            p197o00o0OOo.o00O0O0.OooO00o(str, j, jOooO0OO, SizeKt.m532widthInVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(99), 1, null), false, composerStartRestartGroup, 3072, 16);
            SpacerKt.Spacer(androidx.compose.foundation.layout.OooOO0.OooO00o(columnScopeInstance, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Alignment.Vertical centerVertically = companion2.getCenterVertically();
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyOooO0O1 = androidx.compose.material.OooO0OO.OooO0O0(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
            Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
            if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            oO000O0O.f53112OooO00o.OooO0O0(((Number) com.yalla.yalla.service.room.OooO00o.f24516OooO0o0.f48460OooO0O0.getValue()).intValue(), 432, 0, composerStartRestartGroup, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m3775constructorimpl(5), 0.0f, 11, null), Dp.m3775constructorimpl(16)));
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(oooO00o.OooO00o().f24538OooO0OO, 0L, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(926086521);
            if (((Long) stateObserveAsState.getValue()) == null) {
                composer2 = composerStartRestartGroup;
                i2 = 6;
            } else {
                Long l = (Long) stateObserveAsState.getValue();
                if ((l != null ? l.longValue() : 0L) > 0) {
                    String str2 = "ID:" + ((Long) stateObserveAsState.getValue());
                    long jOooO0OO2 = o0000O0.OooO0OO(12, composerStartRestartGroup, 6);
                    Modifier modifierM480paddingVpY3zN4$default = PaddingKt.m480paddingVpY3zN4$default(companion, 0.0f, Dp.m3775constructorimpl(4), 1, null);
                    composer2 = composerStartRestartGroup;
                    TextKt.m1261Text4IGK_g(str2, modifierM480paddingVpY3zN4$default, j, jOooO0OO2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 48, 0, 131056);
                    i2 = 6;
                } else {
                    composer2 = composerStartRestartGroup;
                    i2 = 6;
                }
            }
            o00O000o.OooO00o(composer2);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl((float) 5.5d), null, composer2, i2, 2);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new o000oOoO(i));
    }

    public static final void OooO0Oo(LiveRoomVM liveRoomVM, o0oOo0O0 o0ooo0o1, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-855353523);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-855353523, i, -1, "com.yalla.yalla.ui.screen.room.live.LiveRoomScreenTop (LiveRoomScreenTopInfo.kt:89)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM170backgroundbw27NRU = BackgroundKt.m170backgroundbw27NRU(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), o0OOo000.f48136OooO0OO, RoundedCornerShapeKt.RoundedCornerShape$default(0, 50, 50, 0, 9, (Object) null));
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.animation.Oooo000.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM170backgroundbw27NRU);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
        if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier modifierOooO0O0 = com.code.android.util.o0O0O00.OooO0O0(AnimationModifierKt.animateContentSize$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), null, null, 3, null), false, false, 0L, false, null, null, null, oOO00OO.f55232OooO0Oo, 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO0O0 = androidx.compose.material.OooO0OO.OooO0O0(Arrangement.INSTANCE, centerVertically, composerStartRestartGroup, 48, -1323940314);
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
        Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O0, composerM1320constructorimpl2, currentCompositionLocalMap2);
        if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        float f = 6;
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        OooO0O0(composerStartRestartGroup, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f), null, composerStartRestartGroup, 6, 2);
        OooO0OO(composerStartRestartGroup, 0);
        if (((RoomLoginInformation) LiveDataAdapterKt.observeAsState(com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24543OooO0oo, null, composerStartRestartGroup, 56).getValue()) != null) {
            composerStartRestartGroup.startReplaceableGroup(1808510504);
            float f2 = 3;
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            OooO00o(liveRoomVM, o0ooo0o1, composerStartRestartGroup, (i & 14) | 64);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1808510684);
            com.code.android.util.OooOO0.OooO0Oo(Dp.m3775constructorimpl(16), null, composerStartRestartGroup, 6, 2);
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (com.facebook.appevents.OooOOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new ooooO000(liveRoomVM, o0ooo0o1, i));
    }
}
