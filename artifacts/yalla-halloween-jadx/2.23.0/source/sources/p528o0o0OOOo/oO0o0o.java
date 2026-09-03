package p528o0o0OOOo;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material.OooO;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.code.android.util.o0000O0;
import com.code.android.util.o0O0O00;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.model.PostUserModel;
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.ui.vm.moment.MomentPraiseVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p018OooOoo0.OooOOO;
import p147o00Oo0Oo.o000OOo;
import p150o00Oo0oO.o00000OO;
import p406o0Oo0Ooo.oOO0O0O;
import p417o0OoO0.o0000;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p517o0o0O0o.OooOOOO;
import p528o0o0OOOo.ooOOOOoo;
import p584o0oOooO0.oO00OOo0;
import p605o0oo0OO0.o000OO00;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentCommentDialogPraises.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogPraises.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogPraises\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,203:1\n81#2,11:204\n81#2,11:215\n81#2,11:266\n81#2,11:309\n66#3,6:226\n72#3:260\n76#3:265\n66#3,6:357\n72#3:391\n76#3:398\n78#4,11:232\n91#4:264\n78#4,11:327\n78#4,11:363\n91#4:397\n78#4,11:405\n91#4:449\n91#4:454\n456#5,8:243\n464#5,3:257\n467#5,3:261\n25#5:282\n456#5,8:338\n464#5,3:352\n456#5,8:374\n464#5,3:388\n467#5,3:394\n456#5,8:416\n464#5,3:430\n467#5,3:446\n467#5,3:451\n4144#6,6:251\n4144#6,6:346\n4144#6,6:382\n4144#6,6:424\n154#7:277\n154#7:320\n154#7:356\n154#7:392\n154#7:393\n154#7:434\n154#7:435\n154#7:436\n154#7:437\n154#7:438\n154#7:439\n154#7:440\n154#7:441\n154#7:442\n154#7:443\n154#7:444\n154#7:445\n73#8,4:278\n77#8,20:289\n955#9,6:283\n73#10,6:321\n79#10:355\n73#10,6:399\n79#10:433\n83#10:450\n83#10:455\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogPraises.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogPraises\n*L\n59#1:204,11\n60#1:215,11\n100#1:266,11\n121#1:309,11\n61#1:226,6\n61#1:260\n61#1:265\n132#1:357,6\n132#1:391\n132#1:398\n61#1:232,11\n61#1:264\n123#1:327,11\n132#1:363,11\n132#1:397\n146#1:405,11\n146#1:449\n123#1:454\n61#1:243,8\n61#1:257,3\n61#1:261,3\n102#1:282\n123#1:338,8\n123#1:352,3\n132#1:374,8\n132#1:388,3\n132#1:394,3\n146#1:416,8\n146#1:430,3\n146#1:446,3\n123#1:451,3\n61#1:251,6\n123#1:346,6\n132#1:382,6\n146#1:424,6\n103#1:277\n124#1:320\n133#1:356\n137#1:392\n142#1:393\n150#1:434\n159#1:435\n163#1:436\n166#1:437\n173#1:438\n180#1:439\n184#1:440\n188#1:441\n189#1:442\n192#1:443\n197#1:444\n198#1:445\n102#1:278,4\n102#1:289,20\n102#1:283,6\n123#1:321,6\n123#1:355\n146#1:399,6\n146#1:433\n146#1:450\n123#1:455\n*E\n"})
public final class oO0o0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0o0o f54055OooO00o = new oO0o0o();

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises$Content$1$1", f = "MomentCommentDialogPraises.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f54056OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54057OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RefreshState refreshState, MomentVideoVM momentVideoVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54056OooO0Oo = refreshState;
            this.f54057OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54056OooO0Oo, this.f54057OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f54056OooO0Oo.OooO0OO() == RefreshState.State.Null) {
                this.f54057OooO0o0.refreshMomentDetail();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f54058OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<PostUserModel> f54059OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LazyListState lazyListState, o000O0.OooO0O0<PostUserModel> oooO0O0) {
            super(3);
            this.f54058OooO0Oo = lazyListState;
            this.f54059OooO0o0 = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope RefreshContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(RefreshContentStatus, "$this$RefreshContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1984781061, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises.Content.<anonymous>.<anonymous> (MomentCommentDialogPraises.kt:82)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f54058OooO0Oo, null, false, null, null, null, false, new oO0Oo0oo(this.f54059OooO0o0), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54061OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54062OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2) {
            super(2);
            this.f54062OooO0o0 = i;
            this.f54061OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54061OooO0o | 1);
            oO0o0o.this.OooO00o(this.f54062OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54064OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54065OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, int i2) {
            super(2);
            this.f54065OooO0o0 = i;
            this.f54064OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54064OooO0o | 1);
            oO0o0o.this.OooO00o(this.f54065OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oO0o0o oo0o0o, Composer composer, int i) {
        oo0o0o.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(76714968);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(76714968, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises.ItemTitle (MomentCommentDialogPraises.kt:98)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel;
            MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
            if ((currentMomentDetail != null ? currentMomentDetail.getPraiseNum() : 0L) <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new oO000OOo(oo0o0o, i));
                return;
            }
            Modifier modifierM169backgroundbw27NRU$default = BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m3765constructorimpl(44)), o0oO0O0o.f46946OooO0O0, null, 2, null);
            Object objOooO00o = OooOo00.OooO00o(composerStartRestartGroup, -270267587, -3687241);
            Composer.Companion companion = Composer.INSTANCE;
            if (objOooO00o == companion.getEmpty()) {
                objOooO00o = new oO00000();
                composerStartRestartGroup.updateRememberedValue(objOooO00o);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final oO00000 oo00000 = (oO00000) objOooO00o;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-3687241);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Pair pairOooO0O0 = o0OO.OooO0O0(constraintLayoutScope, (MutableState) objRememberedValue2, oo00000, composerStartRestartGroup);
            MeasurePolicy measurePolicy = (MeasurePolicy) pairOooO0O0.component1();
            final Function0 function0 = (Function0) pairOooO0O0.component2();
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM169backgroundbw27NRU$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises$ItemTitle$$inlined$ConstraintLayout$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                    Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                    oO0000Oo.OooO00o(semantics, oo00000);
                    return Unit.INSTANCE;
                }
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises$ItemTitle$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        o0OO0O0 o0oo0o0OooO00o = constraintLayoutScope2.OooO0OO().OooO00o();
                        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.XXX_likes, composer3, 0);
                        String[] strArr = new String[1];
                        MomentDetailModel currentMomentDetail2 = momentVideoVM.getCurrentMomentDetail();
                        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(o0OoOo0.OooOO0(currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getPraiseNum()) : null), false);
                        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(vid…?.praiseNum.safeToLong())");
                        strArr[0] = strOooO0o;
                        TextKt.m1251Text4IGK_g(o000OO00.OooO00o(strStringResource, strArr), PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(ConstraintLayoutScope.OooO00o(Modifier.INSTANCE, o0oo0o0OooO00o, ooOOOOoo.f54412OooO0Oo), 0.0f, 1, null), Dp.m3765constructorimpl(16), 0.0f, 2, null), o000OOo.OooO0OO(composer3).f37712OooOO0o, TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131056);
                    }
                    return Unit.INSTANCE;
                }
            }), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new oO0OOo0o(oo0o0o, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(oO0o0o oo0o0o, int i, PostUserModel postUserModel, Composer composer, int i2) {
        Modifier.Companion companion;
        oo0o0o.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-799129498);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-799129498, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises.ItemView (MomentCommentDialogPraises.kt:119)");
        }
        composerStartRestartGroup.startReplaceableGroup(1729797275);
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        ViewModel viewModel = ViewModelKt.viewModel(MomentVideoVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
        composerStartRestartGroup.endReplaceableGroup();
        MomentDetailModel currentMomentDetail = ((MomentVideoVM) viewModel).getCurrentMomentDetail();
        if ((currentMomentDetail != null ? Long.valueOf(currentMomentDetail.getId()) : null) == null) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new oO000Oo0(oo0o0o, i, postUserModel, i2));
            return;
        }
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(60)), o0oO0O0o.f46946OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, new oO000o00(postUserModel), 253);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        Arrangement arrangement = Arrangement.INSTANCE;
        MeasurePolicy measurePolicyOooO00o = OooO.OooO00o(arrangement, centerVertically, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
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
        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        Modifier modifierOooO00o = com.facebook.OooOo00.OooO00o(38, companion3, composerStartRestartGroup, 733328855);
        MeasurePolicy measurePolicyOooO00o2 = OooOOO.OooO00o(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
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
        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OooOOOO oooOOOO = OooOOOO.f51970OooO00o;
        oooOOOO.OooOO0O(p139o00OOooO.OooO0o.OooO0oo(80, 80, postUserModel.getHeadurl()), SizeKt.m523size3ABfNKs(boxScopeInstance.align(companion3, companion2.getCenter()), Dp.m3765constructorimpl(36)), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        float f2 = 2;
        oooOOOO.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(OffsetKt.m437offsetVpY3zN4$default(companion3, Dp.m3765constructorimpl(f2), 0.0f, 2, null), companion2.getTopEnd()), UserInfo.Role.INSTANCE.isOfficial(postUserModel.getRole()));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        Modifier modifierWeight = rowScopeInstance.weight(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), 1.0f, false);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o3 = OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierWeight);
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
        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(10), null, composerStartRestartGroup, 6, 2);
        long userid = postUserModel.getUserid();
        String nickname = postUserModel.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        oooOOOO.OooOOOo(oOO0O0O.OooO0O0(userid, nickname), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, false, TextUnitKt.getSp(16), 0, 0, null, false, rowScopeInstance.weight(companion3, 1.0f, false), composerStartRestartGroup, 1073744896, 244);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        oooOOOO.OooO0oO(Integer.valueOf(postUserModel.getSex()), SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 560, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        long userid2 = postUserModel.getUserid();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userid2 == l.longValue() && Intrinsics.areEqual(o000000O.OooOo().getValue(), Boolean.TRUE)) {
            composerStartRestartGroup.startReplaceableGroup(1653369909);
            companion = companion3;
            oooOOOO.OooOo(o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()), o0OoOo0.OooOOO((String) o000000O.OooO0o0().getValue(), ""), SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            companion = companion3;
            composerStartRestartGroup.startReplaceableGroup(1653370250);
            int i3 = postUserModel.wealthLevel;
            String wealthBadgeImage = postUserModel.wealthBadgeImage;
            long jOooO0OO = o0000O0.OooO0OO(10, composerStartRestartGroup, 6);
            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(19));
            Intrinsics.checkNotNullExpressionValue(wealthBadgeImage, "wealthBadgeImage");
            oooOOOO.OooOo(i3, wealthBadgeImage, modifierM509height3ABfNKs, jOooO0OO, composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        float f3 = 19;
        OooOOOO.OooOo0(null, Integer.valueOf(postUserModel.kaVIPLv), null, Dp.m3765constructorimpl(f), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composerStartRestartGroup, 289792, 5);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f2), null, composerStartRestartGroup, 6, 2);
        OooOOOO.OooOOo(Boolean.valueOf(o0000.OooO0OO(Integer.valueOf(postUserModel.getVip()))), Integer.valueOf(postUserModel.getVipLevel()), false, Dp.m3765constructorimpl(f3), SizeKt.m509height3ABfNKs(companion, Dp.m3765constructorimpl(f3)), composerStartRestartGroup, 289792, 4);
        if (o00000OO.OooO00o(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new oO0O0OoO(oo0o0o, i, postUserModel, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, @Nullable Composer composer, int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-430612071);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i2 & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-430612071, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogPraises.Content (MomentCommentDialogPraises.kt:57)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentPraiseVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentPraiseVM momentPraiseVM = (MomentPraiseVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentVideoVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel2;
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m169backgroundbw27NRU$default(companion, o0oO0O0o.f46946OooO0O0, null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = OooOOO.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            p143o00Oo000.OooO0O0<PostUserModel> praisesPagerState = momentPraiseVM.getPraisesPagerState();
            SharedFlow sharedFlow = praisesPagerState != null ? praisesPagerState.f37667OooO0oo : null;
            composerStartRestartGroup.startReplaceableGroup(-372899405);
            o000O0.OooO0O0 oooO0O0OooO00o = sharedFlow == null ? null : o000O0.OooOOO.OooO00o(sharedFlow, composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            if (oooO0O0OooO00o == null) {
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(i, i2));
                return;
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composerStartRestartGroup);
            EffectsKt.LaunchedEffect(Boolean.valueOf(refreshStateOooO0OO.OooO0OO() == RefreshState.State.Null), new OooO00o(refreshStateOooO0OO, momentVideoVM, null), composerStartRestartGroup, 64);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambda = o0O0OO0.f53715OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1984781061, true, new OooO0O0(lazyListStateRememberLazyListState, oooO0O0OooO00o));
            int i3 = o000O0.OooO0O0.f34327OooO0o0;
            composer2 = composerStartRestartGroup;
            p148o00Oo0o.o0O0O00.OooO00o(oooO0O0OooO00o, modifierFillMaxSize$default2, lazyListStateRememberLazyListState, refreshStateOooO0OO, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102240312, 176);
            if (androidx.compose.material.OooOO0.OooO0O0(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooO0o(i, i2));
    }
}
