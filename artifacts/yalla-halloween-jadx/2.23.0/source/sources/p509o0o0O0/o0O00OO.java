package p509o0o0O0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ProgressIndicatorKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0O0O00;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentPoll;
import com.yalla.yalla.model.moment.MomentType;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.postList.MomentAdapterTag;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p515o0o0O0O0.oo0o0Oo;
import p584o0oOooO0.oO00OOo0;
import p601o0oo0O0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nMomentVoteComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentVoteComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVoteCompKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 9 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,342:1\n76#2:343\n76#2:344\n76#2:384\n76#2:390\n76#2:391\n76#2:392\n76#2:393\n76#2:394\n76#2:395\n76#2:396\n76#2:397\n154#3:345\n154#3:409\n164#3:410\n154#3:411\n154#3:412\n154#3:483\n154#3:484\n154#3:485\n154#3:486\n154#3:487\n154#3:498\n154#3:499\n72#4,6:346\n78#4:380\n82#4:389\n72#4,6:413\n78#4:447\n82#4:497\n78#5,11:352\n91#5:388\n78#5,11:419\n78#5,11:454\n91#5:491\n91#5:496\n456#6,8:363\n464#6,3:377\n467#6,3:385\n456#6,8:430\n464#6,3:444\n456#6,8:465\n464#6,3:479\n467#6,3:488\n467#6,3:493\n4144#7,6:371\n4144#7,6:438\n4144#7,6:473\n1864#8,3:381\n81#9,11:398\n66#10,6:448\n72#10:482\n76#10:492\n*S KotlinDebug\n*F\n+ 1 MomentVoteComp.kt\ncom/yalla/yalla/ui/composable/moment/MomentVoteCompKt\n*L\n60#1:343\n75#1:344\n99#1:384\n125#1:390\n127#1:391\n128#1:392\n129#1:393\n130#1:394\n131#1:395\n132#1:396\n133#1:397\n85#1:345\n162#1:409\n164#1:410\n169#1:411\n173#1:412\n182#1:483\n195#1:484\n208#1:485\n216#1:486\n217#1:487\n243#1:498\n244#1:499\n79#1:346,6\n79#1:380\n79#1:389\n136#1:413,6\n136#1:447\n136#1:497\n79#1:352,11\n79#1:388\n136#1:419,11\n174#1:454,11\n174#1:491\n136#1:496\n79#1:363,8\n79#1:377,3\n79#1:385,3\n136#1:430,8\n136#1:444,3\n174#1:465,8\n174#1:479,3\n174#1:488,3\n136#1:493,3\n79#1:371,6\n136#1:438,6\n174#1:473,6\n87#1:381,3\n134#1:398,11\n174#1:448,6\n174#1:482\n174#1:492\n*E\n"})
public final class o0O00OO {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ MomentPoll f51088OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51089OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Modifier f51090OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51091OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(MomentPoll momentPoll, Modifier modifier, MomentDetailModel momentDetailModel, int i) {
            super(2);
            this.f51088OooO0Oo = momentPoll;
            this.f51090OooO0o0 = modifier;
            this.f51089OooO0o = momentDetailModel;
            this.f51091OooO0oO = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51091OooO0oO | 1);
            Modifier modifier = this.f51090OooO0o0;
            MomentDetailModel momentDetailModel = this.f51089OooO0o;
            o0O00OO.OooO0O0(this.f51088OooO0Oo, modifier, momentDetailModel, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51092OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51093OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Modifier modifier, int i) {
            super(2);
            this.f51092OooO0Oo = modifier;
            this.f51093OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51093OooO0o0 | 1);
            o0O00OO.OooO00o(this.f51092OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51094OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51095OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Modifier modifier, int i) {
            super(2);
            this.f51094OooO0Oo = modifier;
            this.f51095OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51095OooO0o0 | 1);
            o0O00OO.OooO00o(this.f51094OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Modifier f51096OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51097OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Modifier modifier, int i) {
            super(2);
            this.f51096OooO0Oo = modifier;
            this.f51097OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51097OooO0o0 | 1);
            o0O00OO.OooO00o(this.f51096OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<Long, Long, Long, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<String> f51098OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(Ref.ObjectRef<String> objectRef) {
            super(3);
            this.f51098OooO0Oo = objectRef;
        }

        /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Long l, Long l2, Long l3) {
            this.f51098OooO0Oo.element = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.moment_poll_time), String.valueOf(l.longValue()), String.valueOf(l2.longValue()), String.valueOf(l3.longValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MomentAdapterTag f51099OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51100OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51101OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentPoll f51102OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Context f51103OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ MomentDetailModel f51104OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ boolean f51105OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ Activity f51106OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ int f51107OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public final /* synthetic */ LifecycleOwner f51108OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ BaseMomentDetailVM f51109OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MomentPoll momentPoll, boolean z2, Context context, MomentDetailModel momentDetailModel, MomentAdapterTag momentAdapterTag, boolean z3, Activity activity, int i, BaseMomentDetailVM baseMomentDetailVM, LifecycleOwner lifecycleOwner) {
            super(0);
            this.f51100OooO0Oo = z;
            this.f51102OooO0o0 = momentPoll;
            this.f51101OooO0o = z2;
            this.f51103OooO0oO = context;
            this.f51104OooO0oo = momentDetailModel;
            this.f51099OooO = momentAdapterTag;
            this.f51105OooOO0 = z3;
            this.f51106OooOO0O = activity;
            this.f51107OooOO0o = i;
            this.f51109OooOOO0 = baseMomentDetailVM;
            this.f51108OooOOO = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            if (!this.f51100OooO0Oo) {
                o0O00OOO onLogin = new o0O00OOO(this.f51102OooO0o0, this.f51101OooO0o, this.f51103OooO0oO, this.f51104OooO0oo, this.f51099OooO, this.f51105OooOO0, this.f51106OooOO0O, this.f51107OooOO0o, this.f51109OooOOO0, this.f51108OooOOO);
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
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51110OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentPoll f51111OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentPoll.Option f51112OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51113OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(int i, MomentPoll.Option option, MomentPoll momentPoll, int i2) {
            super(2);
            this.f51110OooO0Oo = i;
            this.f51112OooO0o0 = option;
            this.f51111OooO0o = momentPoll;
            this.f51113OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51113OooO0oO | 1);
            MomentPoll.Option option = this.f51112OooO0o0;
            MomentPoll momentPoll = this.f51111OooO0o;
            o0O00OO.OooO0OO(this.f51110OooO0Oo, option, momentPoll, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f51114OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f51115OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f51116OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51117OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(int i, int i2, int i3, boolean z) {
            super(2);
            this.f51114OooO0Oo = i;
            this.f51116OooO0o0 = i2;
            this.f51115OooO0o = z;
            this.f51117OooO0oO = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f51117OooO0oO | 1);
            int i = this.f51116OooO0o0;
            boolean z = this.f51115OooO0o;
            o0O00OO.OooO0Oo(this.f51114OooO0Oo, i, z, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1987885891);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1987885891, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentVoteComp (MomentVoteComp.kt:58)");
            }
            MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
            if (momentDetailModel.getType() != MomentType.Poll.getValue()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(modifier, i));
                return;
            }
            MomentPoll momentPoll = (MomentPoll) LiveDataAdapterKt.observeAsState(momentDetailModel.getMomentPollLiveData(), composerStartRestartGroup, 8).getValue();
            if (momentPoll == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0OO(modifier, i));
                return;
            }
            OooO0O0(momentPoll, modifier, momentDetailModel, composerStartRestartGroup, ((i2 << 3) & 112) | 520);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup3.updateScope(new OooO0O0(modifier, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0O0(MomentPoll momentPoll, Modifier modifier, MomentDetailModel momentDetailModel, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1359379246);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1359379246, i, -1, "com.yalla.yalla.ui.composable.moment.MomentVoteContent (MomentVoteComp.kt:71)");
        }
        List<MomentPoll.Option> options = momentPoll.getOptions();
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        int i2 = o0oO0O0o.f47152o00OOOo;
        int i3 = 1;
        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE.then(modifier), 0.0f, 1, null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(!zBooleanValue))), zBooleanValue ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f47078o000o0O, null, 2, null), Dp.m3765constructorimpl(12));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composerStartRestartGroup.startReplaceableGroup(1332287410);
        int i4 = 0;
        for (Object obj : options) {
            int i5 = i4 + 1;
            if (i4 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            OooO0OO(i4, (MomentPoll.Option) obj, momentPoll, composerStartRestartGroup, 576);
            i4 = i5;
        }
        composerStartRestartGroup.endReplaceableGroup();
        StringBuilder sb = new StringBuilder();
        sb.append(o0000O.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.moment_poll_ballots, composerStartRestartGroup, 0), String.valueOf(momentPoll.getVoteCount())));
        sb.append(" • ");
        if (momentPoll.getIsExpire()) {
            composerStartRestartGroup.startReplaceableGroup(1332287731);
            sb.append(StringResources_androidKt.stringResource(oO00OOo0.moment_poll_vote_ended, composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(1332287830);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = "";
            long expireTime = ((Boolean) composerStartRestartGroup.consume(oo0O.f51346OooO)).booleanValue() ? (((long) ((int) momentPoll.getExpireTime())) * 60000) + System.currentTimeMillis() : momentPoll.getExpireTime();
            int length = String.valueOf(System.currentTimeMillis()).length() - String.valueOf(expireTime).length();
            if (1 <= length) {
                while (true) {
                    expireTime *= (long) 10;
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            o0000oo.OooO0oO(expireTime, new OooO0o(objectRef));
            sb.append((String) objectRef.element);
            composerStartRestartGroup.endReplaceableGroup();
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
        TextKt.m1251Text4IGK_g(string, (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37712OooOO0o, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, new PlatformTextStyle(false), (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16252927, (DefaultConstructorMarker) null), composerStartRestartGroup, 3072, 0, 65522);
        if (androidx.compose.material.OooOO0.OooO0O0(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(momentPoll, modifier, momentDetailModel, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0OO(int i, MomentPoll.Option option, MomentPoll momentPoll, Composer composer, int i2) {
        Composer composer2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2105836671);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2105836671, i2, -1, "com.yalla.yalla.ui.composable.moment.MomentVoteItem (MomentVoteComp.kt:123)");
        }
        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(oo0O.f51347OooO00o)).booleanValue();
        MomentAdapterTag momentAdapterTag = (MomentAdapterTag) composerStartRestartGroup.consume(oo0O.f51348OooO0O0);
        MomentDetailModel momentDetailModel = (MomentDetailModel) composerStartRestartGroup.consume(oo0O.f51350OooO0Oo);
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        Activity activity = (Activity) composerStartRestartGroup.consume(oo0O.f51352OooO0o0);
        boolean zBooleanValue2 = ((Boolean) composerStartRestartGroup.consume(oo0O.f51351OooO0o)).booleanValue();
        boolean zBooleanValue3 = ((Boolean) composerStartRestartGroup.consume(oo0O.f51346OooO)).booleanValue();
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(BaseMomentDetailVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierM480paddingqDBjuR0$default = PaddingKt.m480paddingqDBjuR0$default(o0O0O00.OooO0O0(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, false, 0L, false, null, null, null, new OooOO0(zBooleanValue3, momentPoll, zBooleanValue2, context, momentDetailModel, momentAdapterTag, zBooleanValue, activity, i, (BaseMomentDetailVM) viewModel, lifecycleOwner), 253), 0.0f, 0.0f, 0.0f, Dp.m3765constructorimpl(8), 7, null);
        float fM3765constructorimpl = Dp.m3765constructorimpl((float) 0.5d);
        composerStartRestartGroup.startReplaceableGroup(-185426205);
        long j = option.getIsVote() ? o0oO0O0o.f46994OoooOoO : o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o;
        composerStartRestartGroup.endReplaceableGroup();
        float f = 12;
        Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(BorderKt.m180borderxT4_qwU(modifierM480paddingqDBjuR0$default, fM3765constructorimpl, j, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(6))), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(oo0o0Oo.OooO00o(false))), o0oO0O0o.f46946OooO0O0, null, 2, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(10));
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(companion2, top, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
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
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
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
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        String optionText = option.getOptionText();
        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m480paddingqDBjuR0$default(boxScopeInstance.align(companion, companion2.getCenterStart()), 0.0f, 0.0f, Dp.m3765constructorimpl(48), 0.0f, 11, null), 0.0f, 1, null);
        composerStartRestartGroup.startReplaceableGroup(-447605959);
        long j2 = option.getIsVote() ? o0oO0O0o.f46994OoooOoO : o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m1251Text4IGK_g(optionText, modifierFillMaxWidth$default2, j2, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 131056);
        if (option.getIsVote()) {
            composerStartRestartGroup.startReplaceableGroup(-447605813);
            String strValueOf = String.valueOf(option.getVoteCount());
            composerStartRestartGroup.startReplaceableGroup(-447605703);
            long j3 = option.getIsVote() ? o0oO0O0o.f46994OoooOoO : o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0;
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.m1251Text4IGK_g(strValueOf, boxScopeInstance.align(SizeKt.m530widthInVpY3zN4$default(companion, Dp.m3765constructorimpl(32), 0.0f, 2, null), companion2.getCenterEnd()), j3, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3672getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 0, 130544);
            composerStartRestartGroup.endReplaceableGroup();
            i3 = 0;
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startReplaceableGroup(-447605377);
            if (momentPoll.getVoteOptionId() > 0 || momentPoll.getIsExpire()) {
                composerStartRestartGroup.startReplaceableGroup(-447605274);
                composer2 = composerStartRestartGroup;
                TextKt.m1251Text4IGK_g(String.valueOf(option.getVoteCount()), boxScopeInstance.align(SizeKt.m530widthInVpY3zN4$default(companion, Dp.m3765constructorimpl(32), 0.0f, 2, null), companion2.getCenterEnd()), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(TextAlign.INSTANCE.m3672getEnde0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 130544);
                composer2.endReplaceableGroup();
                i3 = 0;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-447604853);
                i3 = 0;
                SpacerKt.Spacer(BorderKt.m180borderxT4_qwU(SizeKt.m523size3ABfNKs(boxScopeInstance.align(companion, companion2.getCenterEnd()), Dp.m3765constructorimpl(15)), Dp.m3765constructorimpl(1), o000OOo.OooO0OO(composerStartRestartGroup).f37706OooO0o, RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl(f))), composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceableGroup();
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
        }
        composer2.endReplaceableGroup();
        composer2.endNode();
        composer2.endReplaceableGroup();
        composer2.endReplaceableGroup();
        Composer composer3 = composer2;
        composer3.startReplaceableGroup(-185424029);
        if (momentPoll.getVoteOptionId() > 0 || momentPoll.getIsExpire()) {
            OooO0Oo(option.getVoteCount(), momentPoll.getVoteCount(), option.getIsVote(), composer3, i3);
        }
        if (OooOo.OooO0o.OooO0O0(composer3)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0O(i, option, momentPoll, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO0Oo(int i, int i2, boolean z, Composer composer, int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-576402037);
        if ((i3 & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 32 : 16;
        }
        if ((i3 & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i4 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-576402037, i3, -1, "com.yalla.yalla.ui.composable.moment.VoteProgressIndicator (MomentVoteComp.kt:230)");
            }
            float f = i2 == 0 ? 0.0f : (i * 1.0f) / i2;
            int i5 = o0oO0O0o.f47152o00OOOo;
            ProgressIndicatorKt.m1142LinearProgressIndicator_5eSRE(f, ClipKt.clip(SizeKt.fillMaxWidth$default(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 0.0f, 13, null), Dp.m3765constructorimpl(2)), 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape()), z ? o0oO0O0o.f46994OoooOoO : o0oO0O0o.f46988OoooO00, o0oO0O0o.f47086o000oOoO, 0, composerStartRestartGroup, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOO0(i, i2, i3, z));
    }
}
