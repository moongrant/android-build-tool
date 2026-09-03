package p528o0o0OOOo;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.OooOo00;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
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
import com.yalla.yalla.model.moment.MomentDetailModel;
import com.yalla.yalla.model.moment.MomentGift;
import com.yalla.yalla.ui.vm.moment.MomentGiftsVM;
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
import p406o0Oo0Ooo.oOO0O0O;
import p417o0OoO0.o0000;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p517o0o0O0o.OooOOOO;
import p528o0o0OOOo.oO00000o;
import p528o0o0OOOo.oO0000O;
import p584o0oOooO0.oO00OOo0;
import p605o0oo0OO0.o000OO00;
import p642o0ooOOo.o0OO;
import p642o0ooOOo.o0OO0O0;
import p642o0ooOOo.oO00000;
import p642o0ooOOo.oO0000Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentCommentDialogGifts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogGifts.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogGifts\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,293:1\n81#2,11:294\n81#2,11:305\n81#2,11:356\n81#2,11:367\n81#2,11:410\n66#3,6:316\n72#3:350\n76#3:355\n66#3,6:458\n72#3:492\n76#3:499\n78#4,11:322\n91#4:354\n78#4,11:428\n78#4,11:464\n91#4:498\n78#4,11:507\n78#4,11:542\n91#4:586\n78#4,11:590\n91#4:625\n91#4:630\n91#4:635\n456#5,8:333\n464#5,3:347\n467#5,3:351\n25#5:383\n456#5,8:439\n464#5,3:453\n456#5,8:475\n464#5,3:489\n467#5,3:495\n456#5,8:518\n464#5,3:532\n456#5,8:553\n464#5,3:567\n467#5,3:583\n456#5,8:601\n464#5,3:615\n467#5,3:622\n467#5,3:627\n467#5,3:632\n4144#6,6:341\n4144#6,6:447\n4144#6,6:483\n4144#6,6:526\n4144#6,6:561\n4144#6,6:609\n154#7:378\n154#7:421\n154#7:457\n154#7:493\n154#7:494\n154#7:571\n154#7:572\n154#7:573\n154#7:574\n154#7:575\n154#7:576\n154#7:577\n154#7:578\n154#7:579\n154#7:580\n154#7:581\n154#7:582\n154#7:619\n154#7:620\n154#7:621\n73#8,4:379\n77#8,20:390\n955#9,6:384\n73#10,6:422\n79#10:456\n72#10,7:500\n79#10:535\n73#10,6:536\n79#10:570\n83#10:587\n77#10,2:588\n79#10:618\n83#10:626\n83#10:631\n83#10:636\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogGifts.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogGifts\n*L\n65#1:294,11\n66#1:305,11\n107#1:356,11\n108#1:367,11\n181#1:410,11\n67#1:316,6\n67#1:350\n67#1:355\n192#1:458,6\n192#1:492\n192#1:499\n67#1:322,11\n67#1:354\n183#1:428,11\n192#1:464,11\n192#1:498\n205#1:507,11\n208#1:542,11\n208#1:586\n266#1:590,11\n266#1:625\n205#1:630\n183#1:635\n67#1:333,8\n67#1:347,3\n67#1:351,3\n110#1:383\n183#1:439,8\n183#1:453,3\n192#1:475,8\n192#1:489,3\n192#1:495,3\n205#1:518,8\n205#1:532,3\n208#1:553,8\n208#1:567,3\n208#1:583,3\n266#1:601,8\n266#1:615,3\n266#1:622,3\n205#1:627,3\n183#1:632,3\n67#1:341,6\n183#1:447,6\n192#1:483,6\n205#1:526,6\n208#1:561,6\n266#1:609,6\n113#1:378\n184#1:421\n193#1:457\n197#1:493\n202#1:494\n213#1:571\n222#1:572\n226#1:573\n229#1:574\n236#1:575\n243#1:576\n247#1:577\n251#1:578\n252#1:579\n255#1:580\n260#1:581\n261#1:582\n274#1:619\n278#1:620\n281#1:621\n110#1:379,4\n110#1:390,20\n110#1:384,6\n183#1:422,6\n183#1:456\n205#1:500,7\n205#1:535\n208#1:536,6\n208#1:570\n208#1:587\n266#1:588,2\n266#1:618\n266#1:626\n205#1:631\n183#1:636\n*E\n"})
public final class oO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oO0Oo f54032OooO00o = new oO0Oo();

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts$Content$1$1", f = "MomentCommentDialogGifts.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RefreshState f54033OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f54034OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RefreshState refreshState, MomentVideoVM momentVideoVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f54033OooO0Oo = refreshState;
            this.f54034OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f54033OooO0Oo, this.f54034OooO0o0, continuation);
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
            if (this.f54033OooO0Oo.OooO0OO() == RefreshState.State.Null) {
                this.f54034OooO0o0.refreshMomentDetail();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f54035OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o000O0.OooO0O0<MomentGift> f54036OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LazyListState lazyListState, o000O0.OooO0O0<MomentGift> oooO0O0) {
            super(3);
            this.f54035OooO0Oo = lazyListState;
            this.f54036OooO0o0 = oooO0O0;
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
                    ComposerKt.traceEventStart(1981293371, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts.Content.<anonymous>.<anonymous> (MomentCommentDialogGifts.kt:89)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f54035OooO0Oo, null, false, null, null, null, false, new ooo0Oo0(this.f54036OooO0o0), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54038OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54039OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(int i, int i2) {
            super(2);
            this.f54039OooO0o0 = i;
            this.f54038OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54038OooO0o | 1);
            oO0Oo.this.OooO00o(this.f54039OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f54041OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f54042OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i, int i2) {
            super(2);
            this.f54042OooO0o0 = i;
            this.f54041OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f54041OooO0o | 1);
            oO0Oo.this.OooO00o(this.f54042OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final void OooO0O0(oO0Oo oo0oo, Composer composer, int i) {
        oo0oo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(-430700392);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-430700392, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts.ItemTitle (MomentCommentDialogGifts.kt:105)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentGiftsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MomentGiftsVM momentGiftsVM = (MomentGiftsVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentVideoVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            final MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel2;
            MomentDetailModel currentMomentDetail = momentVideoVM.getCurrentMomentDetail();
            if ((currentMomentDetail != null ? currentMomentDetail.getTotalPropValue() : 0L) <= 0) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new o(oo0oo, i));
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
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifierM169backgroundbw27NRU$default, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts$ItemTitle$$inlined$ConstraintLayout$1
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
            }, 1, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -819894182, true, new Function2<Composer, Integer, Unit>() { // from class: com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts$ItemTitle$$inlined$ConstraintLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Unit invoke(Composer composer2, Integer num) {
                    long j;
                    long j2;
                    Composer composer3 = composer2;
                    if (((num.intValue() & 11) ^ 2) == 0 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                    } else {
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        constraintLayoutScope2.getClass();
                        constraintLayoutScope2.OooO0Oo();
                        ConstraintLayoutScope.OooO00o oooO00oOooO0OO = constraintLayoutScope2.OooO0OO();
                        o0OO0O0 o0oo0o0OooO00o = oooO00oOooO0OO.OooO00o();
                        o0OO0O0 o0oo0o0OooO0O0 = oooO00oOooO0OO.OooO0O0();
                        String strStringResource = StringResources_androidKt.stringResource(oO00OOo0.XXX_gift_value, composer3, 0);
                        String[] strArr = new String[1];
                        MomentDetailModel currentMomentDetail2 = momentVideoVM.getCurrentMomentDetail();
                        String strOooO0o = p590o0oo0.OooOOOO.OooO0o(o0OoOo0.OooOO0(currentMomentDetail2 != null ? Long.valueOf(currentMomentDetail2.getTotalPropValue()) : null), false);
                        Intrinsics.checkNotNullExpressionValue(strOooO0o, "formatNumberToKMUnit(vid…alPropValue.safeToLong())");
                        strArr[0] = strOooO0o;
                        String strOooO00o = o000OO00.OooO00o(strStringResource, strArr);
                        long sp = TextUnitKt.getSp(14);
                        long j3 = o000OOo.OooO0OO(composer3).f37712OooOO0o;
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        float f = 16;
                        TextKt.m1251Text4IGK_g(strOooO00o, PaddingKt.m478paddingVpY3zN4$default(ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO00o, p528o0o0OOOo.oO00000.f53816OooO0Oo), Dp.m3765constructorimpl(f), 0.0f, 2, null), j3, sp, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131056);
                        Modifier modifierM476padding3ABfNKs = PaddingKt.m476padding3ABfNKs(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(PaddingKt.m478paddingVpY3zN4$default(ConstraintLayoutScope.OooO00o(companion2, o0oo0o0OooO0O0, oO00000o.f53817OooO0Oo), Dp.m3765constructorimpl(f), 0.0f, 2, null), Dp.m3765constructorimpl(30)), RoundedCornerShapeKt.RoundedCornerShape(50)), o0oO0O0o.f47078o000o0O, null, 2, null), Dp.m3765constructorimpl(3));
                        composer3.startReplaceableGroup(693286680);
                        Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooOOO.OooO00o(companion3, start, composer3, 0, -1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM476padding3ABfNKs);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer3);
                        Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
                        if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        float f2 = 24;
                        Modifier modifierClip = ClipKt.clip(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), RoundedCornerShapeKt.RoundedCornerShape(50));
                        MomentGiftsVM momentGiftsVM2 = momentGiftsVM;
                        float f3 = 8;
                        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(modifierClip, momentGiftsVM2.getGiftsSortType() == 1 ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f46945OooO00o, null, 2, null), Dp.m3765constructorimpl(f3), 0.0f, 2, null), false, false, 0L, false, null, null, null, new oO0000O(momentGiftsVM2), 253);
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o2 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO0O0);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1309constructorimpl2 = Updater.m1309constructorimpl(composer3);
                        Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl2, measurePolicyOooO00o2, composerM1309constructorimpl2, currentCompositionLocalMap2);
                        if (composerM1309constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash2, composerM1309constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        String strStringResource2 = StringResources_androidKt.stringResource(oO00OOo0.byValue, composer3, 0);
                        long sp2 = TextUnitKt.getSp(14);
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        int iM3671getCentere0LSkKk = companion5.m3671getCentere0LSkKk();
                        if (momentGiftsVM2.getGiftsSortType() == 1) {
                            composer3.startReplaceableGroup(1851250665);
                            j = o000OOo.OooO0OO(composer3).f37701OooO;
                        } else {
                            composer3.startReplaceableGroup(1851250680);
                            j = o000OOo.OooO0OO(composer3).f37711OooOO0O;
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(strStringResource2, boxScopeInstance.align(companion2, companion3.getCenter()), j, sp2, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 130544);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        Modifier modifierOooO0O1 = o0O0O00.OooO0O0(PaddingKt.m478paddingVpY3zN4$default(BackgroundKt.m169backgroundbw27NRU$default(ClipKt.clip(SizeKt.m509height3ABfNKs(companion2, Dp.m3765constructorimpl(f2)), RoundedCornerShapeKt.RoundedCornerShape(50)), momentGiftsVM2.getGiftsSortType() == 0 ? o0oO0O0o.f46946OooO0O0 : o0oO0O0o.f46945OooO00o, null, 2, null), Dp.m3765constructorimpl(f3), 0.0f, 2, null), false, false, 0L, false, null, null, null, new p528o0o0OOOo.oO0000Oo(momentGiftsVM2), 253);
                        composer3.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyOooO00o3 = p018OooOoo0.OooOOO.OooO00o(companion3, false, composer3, 0, -1323940314);
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierOooO0O1);
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM1309constructorimpl3 = Updater.m1309constructorimpl(composer3);
                        Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl3, measurePolicyOooO00o3, composerM1309constructorimpl3, currentCompositionLocalMap3);
                        if (composerM1309constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash3, composerM1309constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                        }
                        androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer3)), composer3, 2058660585);
                        String strStringResource3 = StringResources_androidKt.stringResource(oO00OOo0.byTime, composer3, 0);
                        long sp3 = TextUnitKt.getSp(14);
                        int iM3671getCentere0LSkKk2 = companion5.m3671getCentere0LSkKk();
                        if (momentGiftsVM2.getGiftsSortType() == 0) {
                            composer3.startReplaceableGroup(1851251666);
                            j2 = o000OOo.OooO0OO(composer3).f37701OooO;
                        } else {
                            composer3.startReplaceableGroup(1851251681);
                            j2 = o000OOo.OooO0OO(composer3).f37711OooOO0O;
                        }
                        composer3.endReplaceableGroup();
                        TextKt.m1251Text4IGK_g(strStringResource3, boxScopeInstance.align(companion2, companion3.getCenter()), j2, sp3, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m3664boximpl(iM3671getCentere0LSkKk2), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 130544);
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
                        composer3.endNode();
                        composer3.endReplaceableGroup();
                        composer3.endReplaceableGroup();
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
        scopeUpdateScopeEndRestartGroup2.updateScope(new oO0000o0(oo0oo, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooO0OO(oO0Oo oo0oo, int i, MomentGift momentGift, Composer composer, int i2) {
        Modifier.Companion companion;
        oo0oo.getClass();
        Composer composerStartRestartGroup = composer.startRestartGroup(2132583286);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2132583286, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts.ItemView (MomentCommentDialogGifts.kt:179)");
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
            scopeUpdateScopeEndRestartGroup.updateScope(new oO000(oo0oo, i, momentGift, i2));
            return;
        }
        Alignment.Companion companion2 = Alignment.INSTANCE;
        Alignment.Vertical centerVertically = companion2.getCenterVertically();
        Modifier.Companion companion3 = Modifier.INSTANCE;
        float f = 16;
        Modifier modifierOooO0O0 = o0O0O00.OooO0O0(BackgroundKt.m169backgroundbw27NRU$default(SizeKt.m509height3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Dp.m3765constructorimpl(f), 0.0f, Dp.m3765constructorimpl(12), 0.0f, 10, null), Dp.m3765constructorimpl(60)), o0oO0O0o.f46946OooO0O0, null, 2, null), false, false, 0L, false, null, null, null, new oO000O0O(momentGift), 253);
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
        float f2 = 36;
        oooOOOO.OooOO0O(p139o00OOooO.OooO0o.OooO0oo(80, 80, momentGift.getHeadUrl()), SizeKt.m523size3ABfNKs(boxScopeInstance.align(companion3, companion2.getCenter()), Dp.m3765constructorimpl(f2)), 0.0f, null, false, composerStartRestartGroup, 262144, 28);
        float f3 = 2;
        oooOOOO.OooOOo0(ConstantsKt.MINIMUM_BLOCK_SIZE, 0, composerStartRestartGroup, boxScopeInstance.align(OffsetKt.m437offsetVpY3zN4$default(companion3, Dp.m3765constructorimpl(f3), 0.0f, 2, null), companion2.getTopEnd()), UserInfo.Role.INSTANCE.isOfficial(momentGift.role));
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o3 = OooO.OooO00o(arrangement, centerVertically2, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion3);
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
        function3ModifierMaterializerOf3.invoke(SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Alignment.Vertical centerVertically3 = companion2.getCenterVertically();
        Modifier modifierWeight = rowScopeInstance.weight(companion3, 1.0f, true);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyOooO00o4 = OooO.OooO00o(arrangement, centerVertically3, composerStartRestartGroup, 48, -1323940314);
        int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor4 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierWeight);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor4);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl4 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o4 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl4, measurePolicyOooO00o4, composerM1309constructorimpl4, currentCompositionLocalMap4);
        if (composerM1309constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash4, composerM1309constructorimpl4, currentCompositeKeyHash4, function2OooO00o4);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf4, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(10), null, composerStartRestartGroup, 6, 2);
        long userId = momentGift.getUserId();
        String nickname = momentGift.getNickname();
        Intrinsics.checkNotNullExpressionValue(nickname, "item.nickname");
        oooOOOO.OooOOOo(oOO0O0O.OooO0O0(userId, nickname), o000OOo.OooO0OO(composerStartRestartGroup).f37710OooOO0, false, TextUnitKt.getSp(16), 0, 0, null, false, rowScopeInstance.weight(companion3, 1.0f, false), composerStartRestartGroup, 1073744896, 244);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        oooOOOO.OooO0oO(Integer.valueOf(momentGift.getSex()), SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(f)), composerStartRestartGroup, 560, 0);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        long userId2 = momentGift.getUserId();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        Long l = (Long) o000000O.OooOOo0().getValue();
        if (l != null && userId2 == l.longValue() && Intrinsics.areEqual(o000000O.OooOo().getValue(), Boolean.TRUE)) {
            composerStartRestartGroup.startReplaceableGroup(718034208);
            oooOOOO.OooOo(o0OoOo0.OooO0o0(0, (Integer) o000000O.OooO0oO().getValue()), o0OoOo0.OooOOO((String) o000000O.OooO0o0().getValue(), ""), SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(19)), o0000O0.OooO0OO(10, composerStartRestartGroup, 6), composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
            companion = companion3;
        } else {
            composerStartRestartGroup.startReplaceableGroup(718034577);
            int i3 = momentGift.wealthLevel;
            String wealthBadgeImage = momentGift.wealthBadgeImage;
            long jOooO0OO = o0000O0.OooO0OO(10, composerStartRestartGroup, 6);
            Modifier modifierM509height3ABfNKs = SizeKt.m509height3ABfNKs(companion3, Dp.m3765constructorimpl(19));
            Intrinsics.checkNotNullExpressionValue(wealthBadgeImage, "wealthBadgeImage");
            companion = companion3;
            oooOOOO.OooOo(i3, wealthBadgeImage, modifierM509height3ABfNKs, jOooO0OO, composerStartRestartGroup, 33152, 0);
            composerStartRestartGroup.endReplaceableGroup();
        }
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        float f4 = 19;
        Modifier.Companion companion5 = companion;
        OooOOOO.OooOo0(null, Integer.valueOf(momentGift.kaVIPLv), null, Dp.m3765constructorimpl(f), SizeKt.m509height3ABfNKs(companion5, Dp.m3765constructorimpl(f4)), composerStartRestartGroup, 289792, 5);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        OooOOOO.OooOOo(Boolean.valueOf(o0000.OooO0OO(Integer.valueOf(momentGift.getIsVip()))), Integer.valueOf(momentGift.getVipLevel()), false, Dp.m3765constructorimpl(f4), SizeKt.m509height3ABfNKs(companion5, Dp.m3765constructorimpl(f4)), composerStartRestartGroup, 289792, 4);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        Arrangement.Horizontal start = arrangement.getStart();
        Alignment.Vertical centerVertically4 = companion2.getCenterVertically();
        Modifier modifierWeight2 = rowScopeInstance.weight(SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), 0.36f, false);
        composerStartRestartGroup.startReplaceableGroup(693286680);
        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, centerVertically4, composerStartRestartGroup, 54);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
        Function0<ComposeUiNode> constructor5 = companion4.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierWeight2);
        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor5);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM1309constructorimpl5 = Updater.m1309constructorimpl(composerStartRestartGroup);
        Function2 function2OooO00o5 = androidx.compose.animation.OooO.OooO00o(companion4, composerM1309constructorimpl5, measurePolicyRowMeasurePolicy, composerM1309constructorimpl5, currentCompositionLocalMap5);
        if (composerM1309constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
            androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash5, composerM1309constructorimpl5, currentCompositeKeyHash5, function2OooO00o5);
        }
        OooOO0.OooO00o(0, function3ModifierMaterializerOf5, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(4), null, composerStartRestartGroup, 6, 2);
        oooOOOO.OooO00o(p139o00OOooO.OooO0o.OooO0oo(70, 70, momentGift.getPropImage()), SizeKt.m523size3ABfNKs(companion5, Dp.m3765constructorimpl(f2)), 0.0f, null, false, composerStartRestartGroup, 262192, 28);
        com.code.android.util.OooOO0.OooO0Oo(Dp.m3765constructorimpl(f3), null, composerStartRestartGroup, 6, 2);
        TextKt.m1251Text4IGK_g(android.support.v4.media.OooO00o.OooO00o("×  ", momentGift.getPropNum()), (Modifier) null, o000OOo.OooO0OO(composerStartRestartGroup).f37711OooOO0O, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 3072, 3072, 122866);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new oO0Ooooo(oo0oo, i, momentGift, i2));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, @Nullable Composer composer, int i2) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1453465895);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i2 & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1453465895, i2, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogGifts.Content (MomentCommentDialogGifts.kt:63)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentGiftsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentGiftsVM momentGiftsVM = (MomentGiftsVM) viewModel;
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
            p143o00Oo000.OooO0O0<MomentGift> giftsPagerState = momentGiftsVM.getGiftsPagerState();
            SharedFlow sharedFlow = giftsPagerState != null ? giftsPagerState.f37667OooO0oo : null;
            composerStartRestartGroup.startReplaceableGroup(-1590228201);
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
            ComposableLambda composableLambda = o0O0O0Oo.f53703OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1981293371, true, new OooO0O0(lazyListStateRememberLazyListState, oooO0O0OooO00o));
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
