package p535o0o0Oo0;

import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.jeremyliao.liveeventbus.core.Observable;
import com.yalla.yalla.model.moment.MomentCommentDetailModel;
import com.yalla.yalla.model.moment.MomentSendCommentModel;
import com.yalla.yalla.ui.vm.moment.MomentCommentsVM;
import com.yalla.yalla.ui.vm.moment.MomentVideoVM;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p107o000ooO0.o00O0O;
import p188o00o00oO.o000;
import p194o00o0OO.oo00o;
import p423o0OoO0OO.o000O0O0;
import p423o0OoO0OO.o00O0000;
import p476o0OooooO.o0OOo000;
import p493o0o00OOO.OooOo;
import p510o0o00ooo.w4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMomentCommentDialogComments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogComments\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,185:1\n81#2,11:186\n81#2,11:197\n66#3,6:208\n72#3:242\n76#3:247\n78#4,11:214\n91#4:246\n456#5,8:225\n464#5,3:239\n467#5,3:243\n4144#6,6:233\n*S KotlinDebug\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogComments\n*L\n42#1:186,11\n43#1:197,11\n47#1:208,6\n47#1:242\n47#1:247\n47#1:214,11\n47#1:246\n47#1:225,8\n47#1:239,3\n47#1:243,3\n47#1:233,6\n*E\n"})
public final class o0O0O0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0O f53680OooO00o = new o0O0O0O();

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53682OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53683OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, int i2) {
            super(2);
            this.f53683OooO0o0 = i;
            this.f53682OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53682OooO0o | 1);
            o0O0O0O.this.OooO00o(this.f53683OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments$Content$1$1", f = "MomentCommentDialogComments.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f53684OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ LazyListState f53685OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53686OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(MomentCommentsVM momentCommentsVM, LazyListState lazyListState, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f53686OooO0o0 = momentCommentsVM;
            this.f53685OooO0o = lazyListState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f53686OooO0o0, this.f53685OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<MomentCommentDetailModel> list;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53684OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o000<MomentCommentDetailModel> commentsPagerState = this.f53686OooO0o0.getCommentsPagerState();
                boolean z = false;
                if (commentsPagerState != null && (list = commentsPagerState.f38497OooO0Oo) != null && (!list.isEmpty())) {
                    z = true;
                }
                if (z) {
                    LazyListState lazyListState = this.f53685OooO0o;
                    this.f53684OooO0Oo = 1;
                    if (LazyListState.animateScrollToItem$default(lazyListState, 0, 0, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0<T> implements FlowCollector {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<MomentCommentDetailModel> f53687OooO0Oo;

        public OooO0O0(p107o000ooO0.OooOOOO<MomentCommentDetailModel> oooOOOO) {
            this.f53687OooO0Oo = oooOOOO;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(@NotNull Object obj, @NotNull Continuation<? super Unit> continuation) {
            this.f53687OooO0Oo.OooO0Oo();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments$Content$1$3", f = "MomentCommentDialogComments.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<MomentCommentDetailModel> f53688OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f53689OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(p107o000ooO0.OooOOOO<MomentCommentDetailModel> oooOOOO, MomentVideoVM momentVideoVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f53688OooO0Oo = oooOOOO;
            this.f53689OooO0o0 = momentVideoVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f53688OooO0Oo, this.f53689OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            if (this.f53688OooO0Oo.OooO0OO().f35618OooO00o instanceof androidx.paging.OooOOO0.OooO0O0) {
                this.f53689OooO0o0.refreshMomentDetail();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LazyListState f53690OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MomentVideoVM f53691OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ p107o000ooO0.OooOOOO<MomentCommentDetailModel> f53692OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53693OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LazyListState lazyListState, p107o000ooO0.OooOOOO<MomentCommentDetailModel> oooOOOO, MomentVideoVM momentVideoVM, MomentCommentsVM momentCommentsVM) {
            super(3);
            this.f53690OooO0Oo = lazyListState;
            this.f53692OooO0o0 = oooOOOO;
            this.f53691OooO0o = momentVideoVM;
            this.f53693OooO0oO = momentCommentsVM;
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
                    ComposerKt.traceEventStart(792293939, iIntValue, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments.Content.<anonymous>.<anonymous> (MomentCommentDialogComments.kt:78)");
                }
                LazyDslKt.LazyColumn(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), this.f53690OooO0Oo, null, false, null, null, null, false, new o0O0OOO0(this.f53692OooO0o0, this.f53691OooO0o, this.f53693OooO0oO), composer2, 6, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53695OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f53696OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(int i, int i2) {
            super(2);
            this.f53696OooO0o0 = i;
            this.f53695OooO0o = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53695OooO0o | 1);
            o0O0O0O.this.OooO00o(this.f53696OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53697OooO00o;

        public OooOO0O(MomentCommentsVM momentCommentsVM) {
            this.f53697OooO00o = momentCommentsVM;
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO00o(@NotNull MomentCommentDetailModel data) {
            List<MomentCommentDetailModel> list;
            Intrinsics.checkNotNullParameter(data, "data");
            o000<MomentCommentDetailModel> commentsPagerState = this.f53697OooO00o.getCommentsPagerState();
            if (commentsPagerState == null || (list = commentsPagerState.f38497OooO0Oo) == null) {
                return;
            }
            list.add(data);
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
            List<MomentCommentDetailModel> list;
            Intrinsics.checkNotNullParameter(data, "data");
            o000<MomentCommentDetailModel> commentsPagerState = this.f53697OooO00o.getCommentsPagerState();
            if (commentsPagerState == null || (list = commentsPagerState.f38497OooO0Oo) == null) {
                return;
            }
            list.set(i, data);
        }
    }

    @SourceDebugExtension({"SMAP\nMomentCommentDialogComments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogComments$InitObservers$3$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    public static final class OooOOO implements OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53698OooO00o;

        public OooOOO(MomentCommentsVM momentCommentsVM) {
            this.f53698OooO00o = momentCommentsVM;
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO00o(@NotNull MomentCommentDetailModel data) {
            List<MomentCommentDetailModel> list;
            Object next;
            Intrinsics.checkNotNullParameter(data, "data");
            o000<MomentCommentDetailModel> commentsPagerState = this.f53698OooO00o.getCommentsPagerState();
            if (commentsPagerState == null || (list = commentsPagerState.f38497OooO0Oo) == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((MomentCommentDetailModel) next).getLocalId() == data.getLocalId()));
            MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) next;
            if (momentCommentDetailModel != null) {
                momentCommentDetailModel.setId(data.getId());
            }
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    @SourceDebugExtension({"SMAP\nMomentCommentDialogComments.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MomentCommentDialogComments.kt\ncom/yalla/yalla/ui/screen/moment/media/MomentCommentDialogComments$InitObservers$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,185:1\n1#2:186\n*E\n"})
    public static final class OooOOO0 implements OooOo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53699OooO00o;

        public OooOOO0(MomentCommentsVM momentCommentsVM) {
            this.f53699OooO00o = momentCommentsVM;
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO00o(@NotNull MomentCommentDetailModel data) {
            List<MomentCommentDetailModel> list;
            Object next;
            o000<MomentCommentDetailModel> commentsPagerState;
            List<MomentCommentDetailModel> list2;
            Intrinsics.checkNotNullParameter(data, "data");
            MomentCommentsVM momentCommentsVM = this.f53699OooO00o;
            o000<MomentCommentDetailModel> commentsPagerState2 = momentCommentsVM.getCommentsPagerState();
            if (commentsPagerState2 == null || (list = commentsPagerState2.f38497OooO0Oo) == null) {
                return;
            }
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((MomentCommentDetailModel) next).getLocalId() == data.getLocalId()));
            MomentCommentDetailModel momentCommentDetailModel = (MomentCommentDetailModel) next;
            if (momentCommentDetailModel == null || (commentsPagerState = momentCommentsVM.getCommentsPagerState()) == null || (list2 = commentsPagerState.f38497OooO0Oo) == null) {
                return;
            }
            list2.remove(momentCommentDetailModel);
        }

        @Override // p493o0o00OOO.OooOo
        public final void OooO0O0(@NotNull MomentCommentDetailModel data, int i) {
            Intrinsics.checkNotNullParameter(data, "data");
        }
    }

    public static final class OooOOOO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f53701OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MomentCommentsVM f53702OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(MomentCommentsVM momentCommentsVM, int i) {
            super(2);
            this.f53702OooO0o0 = momentCommentsVM;
            this.f53701OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f53701OooO0o | 1);
            o0O0O0O.this.OooO0O0(this.f53702OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, @Nullable Composer composer, int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-299925679);
        int currentMarker = composerStartRestartGroup.getCurrentMarker();
        if ((i2 & 112) == 0) {
            i3 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-299925679, i3, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments.Content (MomentCommentDialogComments.kt:40)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentCommentsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentCommentsVM momentCommentsVM = (MomentCommentsVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(MomentVideoVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentVideoVM momentVideoVM = (MomentVideoVM) viewModel2;
            OooO0O0(momentCommentsVM, composerStartRestartGroup, (i3 & 112) | 8);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(BackgroundKt.m171backgroundbw27NRU$default(companion, o0OOo000.f48135OooO0O0, null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
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
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composerStartRestartGroup);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion2, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            o000<MomentCommentDetailModel> commentsPagerState = momentCommentsVM.getCommentsPagerState();
            SharedFlow sharedFlow = commentsPagerState != null ? commentsPagerState.f38501OooO0oo : null;
            composerStartRestartGroup.startReplaceableGroup(-26346876);
            p107o000ooO0.OooOOOO oooOOOOOooO00o = sharedFlow == null ? null : o00O0O.OooO00o(sharedFlow, composerStartRestartGroup);
            composerStartRestartGroup.endReplaceableGroup();
            if (oooOOOOOooO00o == null) {
                composerStartRestartGroup.endToMarker(currentMarker);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new OooO(i, i2));
                return;
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
            EffectsKt.LaunchedEffect(Long.valueOf(momentCommentsVM.getAnimateScrollToItem()), new OooO00o(momentCommentsVM, lazyListStateRememberLazyListState, null), composerStartRestartGroup, 64);
            o000O0O0.OooO0OO(momentCommentsVM.getFlow(), null, new OooO0O0(oooOOOOOooO00o), composerStartRestartGroup, 520, 1);
            EffectsKt.LaunchedEffect(oooOOOOOooO00o.OooO0OO().f35618OooO00o, new OooO0OO(oooOOOOOooO00o, momentVideoVM, null), composerStartRestartGroup, 72);
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ComposableLambda composableLambda = o00OOOO0.f53643OooO00o;
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 792293939, true, new OooO0o(lazyListStateRememberLazyListState, oooOOOOOooO00o, momentVideoVM, momentCommentsVM));
            int i4 = p107o000ooO0.OooOOOO.f35803OooO0o0;
            composer2 = composerStartRestartGroup;
            oo00o.OooO00o(oooOOOOOooO00o, modifierFillMaxSize$default2, lazyListStateRememberLazyListState, null, false, null, composableLambda, null, composableLambda2, composerStartRestartGroup, 102236216, 184);
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup2.updateScope(new OooOO0(i, i2));
    }

    @Composable
    public final void OooO0O0(final MomentCommentsVM momentCommentsVM, Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(63771987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(63771987, i, -1, "com.yalla.yalla.ui.screen.moment.media.MomentCommentDialogComments.InitObservers (MomentCommentDialogComments.kt:123)");
        }
        Observable<Object> observable = LiveEventBus.get("MOMENT_VIDEO_COMMENTS_SEND_ADD");
        Intrinsics.checkNotNullExpressionValue(observable, "get(...)");
        o00O0000.OooO00o(observable, new Observer() { // from class: o0o0Oo0.o0O00o00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentSendCommentModel sendComment = (MomentSendCommentModel) obj;
                MomentCommentsVM vm = momentCommentsVM;
                Intrinsics.checkNotNullParameter(vm, "$vm");
                Intrinsics.checkNotNullParameter(sendComment, "sendComment");
                o000<MomentCommentDetailModel> commentsPagerState = vm.getCommentsPagerState();
                p493o0o00OOO.Oooo000.OooO00o(commentsPagerState != null ? commentsPagerState.f38497OooO0Oo : null, sendComment, new o0O0O0O.OooOO0O(vm));
            }
        }, composerStartRestartGroup, 72);
        Observable<Object> observable2 = LiveEventBus.get("MOMENT_VIDEO_COMMENTS_SEND_FAIL");
        Intrinsics.checkNotNullExpressionValue(observable2, "get(...)");
        o00O0000.OooO00o(observable2, new w4(momentCommentsVM, 1), composerStartRestartGroup, 72);
        Observable<Object> observable3 = LiveEventBus.get("MOMENT_VIDEO_COMMENTS_SENDING_SUCCESS");
        Intrinsics.checkNotNullExpressionValue(observable3, "get(...)");
        o00O0000.OooO00o(observable3, new Observer() { // from class: o0o0Oo0.o0O00oO0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MomentSendCommentModel sendComment = (MomentSendCommentModel) obj;
                MomentCommentsVM vm = momentCommentsVM;
                Intrinsics.checkNotNullParameter(vm, "$vm");
                Intrinsics.checkNotNullParameter(sendComment, "sendComment");
                o000<MomentCommentDetailModel> commentsPagerState = vm.getCommentsPagerState();
                p493o0o00OOO.Oooo000.OooO00o(commentsPagerState != null ? commentsPagerState.f38497OooO0Oo : null, sendComment, new o0O0O0O.OooOOO(vm));
            }
        }, composerStartRestartGroup, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOOOO(momentCommentsVM, i));
    }
}
