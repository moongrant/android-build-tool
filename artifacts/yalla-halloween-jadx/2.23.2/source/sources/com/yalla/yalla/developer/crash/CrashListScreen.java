package com.yalla.yalla.developer.crash;

import androidx.compose.animation.OooOO0;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.CardKt;
import androidx.compose.material.TextKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/developer/crash/CrashListScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCrashListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,67:1\n81#2,11:68\n66#3,6:79\n72#3:113\n76#3:118\n78#4,11:85\n91#4:117\n456#5,8:96\n464#5,3:110\n467#5,3:114\n4144#6,6:104\n*S KotlinDebug\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen\n*L\n27#1:68,11\n44#1:79,6\n44#1:113\n44#1:118\n44#1:85,11\n44#1:117\n44#1:96,8\n44#1:110,3\n44#1:114,3\n44#1:104,6\n*E\n"})
public final class CrashListScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final CrashListScreen INSTANCE = new CrashListScreen();

    @SourceDebugExtension({"SMAP\nCrashListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,67:1\n154#2:68\n*S KotlinDebug\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$1\n*L\n34#1:68\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f22878OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(CrashListViewModel crashListViewModel) {
            super(3);
            this.f22878OooO0Oo = crashListViewModel;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Toolbar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Toolbar, "$this$Toolbar");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-585971246, iIntValue, -1, "com.yalla.yalla.developer.crash.CrashListScreen.Content.<anonymous> (CrashListScreen.kt:29)");
                }
                TextKt.m1261Text4IGK_g("clear all", PaddingKt.m478padding3ABfNKs(ClickableKt.m204clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, new com.yalla.yalla.developer.crash.OooO0OO(this.f22878OooO0Oo), 7, null), Dp.m3775constructorimpl(10)), o0OOo000.f48135OooO0O0, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131064);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.developer.crash.CrashListScreen$Content$2", f = "CrashListScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f22879OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(CrashListViewModel crashListViewModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f22879OooO0Oo = crashListViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f22879OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            CrashListViewModel crashListViewModel = this.f22879OooO0Oo;
            if (crashListViewModel.getListLiveData().isEmpty()) {
                crashListViewModel.loadCrashFiles();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nCrashListScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$3$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,67:1\n136#2,12:68\n*S KotlinDebug\n*F\n+ 1 CrashListScreen.kt\ncom/yalla/yalla/developer/crash/CrashListScreen$Content$3$1\n*L\n49#1:68,12\n*E\n"})
    public static final class OooO0OO extends Lambda implements Function1<LazyListScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ CrashListViewModel f22880OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(CrashListViewModel crashListViewModel) {
            super(1);
            this.f22880OooO0Oo = crashListViewModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyListScope lazyListScope) {
            LazyListScope LazyColumn = lazyListScope;
            Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
            final SnapshotStateList<Pair<String, File>> listLiveData = this.f22880OooO0Oo.getListLiveData();
            final CrashListScreen$Content$3$1$invoke$$inlined$items$default$1 crashListScreen$Content$3$1$invoke$$inlined$items$default$1 = CrashListScreen$Content$3$1$invoke$$inlined$items$default$1.f22874OooO0Oo;
            LazyColumn.items(listLiveData.size(), null, new Function1<Integer, Object>() { // from class: com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Integer num) {
                    return crashListScreen$Content$3$1$invoke$$inlined$items$default$1.invoke(listLiveData.get(num.intValue()));
                }
            }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yalla.yalla.developer.crash.CrashListScreen$Content$3$1$invoke$$inlined$items$default$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(4);
                }

                @Override // kotlin.jvm.functions.Function4
                public final Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    int i;
                    LazyItemScope items = lazyItemScope;
                    int iIntValue = num.intValue();
                    Composer composer2 = composer;
                    int iIntValue2 = num2.intValue();
                    Intrinsics.checkNotNullParameter(items, "$this$items");
                    if ((iIntValue2 & 14) == 0) {
                        i = (composer2.changed(items) ? 4 : 2) | iIntValue2;
                    } else {
                        i = iIntValue2;
                    }
                    if ((iIntValue2 & 112) == 0) {
                        i |= composer2.changed(iIntValue) ? 32 : 16;
                    }
                    if ((i & 731) == 146 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                    } else {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-632812321, i, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:144)");
                        }
                        Pair pair = (Pair) listLiveData.get(iIntValue);
                        CardKt.m1015CardFjzlyU(ClickableKt.m204clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(PaddingKt.m478padding3ABfNKs(Modifier.INSTANCE, Dp.m3775constructorimpl(10)), 0.0f, 1, null), false, null, null, new OooO0o(pair), 7, null), null, o0000oo.OooO0OO(composer2).f38619OooO0OO, 0L, null, 0.0f, ComposableLambdaKt.composableLambda(composer2, 1194592952, true, new OooO(pair)), composer2, 1572864, 58);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    return Unit.INSTANCE;
                }
            }));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f22882OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f22883OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ColumnScope columnScope, int i) {
            super(2);
            this.f22883OooO0o0 = columnScope;
            this.f22882OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f22882OooO0o | 1);
            CrashListScreen.this.Content(this.f22883OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private CrashListScreen() {
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1927698129);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1927698129, i, -1, "com.yalla.yalla.developer.crash.CrashListScreen.Content (CrashListScreen.kt:25)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(CrashListViewModel.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            CrashListViewModel crashListViewModel = (CrashListViewModel) viewModel;
            composer2 = composerStartRestartGroup;
            o0O0oo0o.OooO00o("Crash Log", 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -585971246, true, new OooO00o(crashListViewModel)), null, composerStartRestartGroup, 12582918, 382);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new OooO0O0(crashListViewModel, null), composer2, 70);
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            composer2.startReplaceableGroup(733328855);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer2);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO00o, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (crashListViewModel.getListLiveData().isEmpty()) {
                composer2.startReplaceableGroup(1836021276);
                TextKt.m1261Text4IGK_g("no data ", boxScopeInstance.align(companion, companion2.getCenter()), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131068);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(1836021382);
                LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, new OooO0OO(crashListViewModel), composer2, 0, 255);
                composer2.endReplaceableGroup();
            }
            if (androidx.compose.material.OooO0o.OooO00o(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(columnScope, i));
    }
}
