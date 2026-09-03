package com.yalla.yalla.module.account.ui.screen;

import android.os.Bundle;
import androidx.compose.animation.Oooo000;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.GridCells;
import androidx.compose.foundation.lazy.grid.LazyGridDslKt;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
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
import androidx.navigation.NavBackStackEntry;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.facebook.appevents.OooOOO0;
import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0O00oO0;
import p193o00o0O0O.o0000oo;
import p194o00o0OO.o00O0OO0;
import p196o00o0OOO.oOO00O;
import p516o0o0O00o.o0O0oo0o;
import p532o0o0OOo0.o000O0;
import p532o0o0OOo0.o00O00O;
import p562o0oOo000.o000000;
import p590o0oOooo0.oOO0O00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u0005J\u0018\u0010\u000e\u001a\u00020\u000bH\u0017ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen;", "Lo0o0OOo0/o000O0;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "MainContent", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM;", "viewModel", "MainContainer", "(Lcom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM;Landroidx/compose/runtime/Composer;I)V", "Content", "Landroidx/compose/ui/graphics/Color;", "getWindowBackgroundColor-WaAFU9c", "(Landroidx/compose/runtime/Composer;I)J", "getWindowBackgroundColor", "<init>", "()V", "Account_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountReasonFirstChooseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,162:1\n81#2,11:163\n76#3:174\n36#4:175\n1097#5,6:176\n164#6:182\n154#6:183\n154#6:184\n154#6:185\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen\n*L\n52#1:163,11\n54#1:174\n55#1:175\n55#1:176,6\n108#1:182\n111#1:183\n115#1:184\n116#1:185\n*E\n"})
public final class DeleteAccountReasonFirstChooseScreen extends o000O0 {
    public static final int $stable = 0;

    @NotNull
    public static final DeleteAccountReasonFirstChooseScreen INSTANCE = new DeleteAccountReasonFirstChooseScreen();

    @SourceDebugExtension({"SMAP\nDeleteAccountReasonFirstChooseScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen$MainContent$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,162:1\n72#2,6:163\n78#2:197\n72#2,6:199\n78#2:233\n82#2:238\n82#2:285\n78#3,11:169\n78#3,11:205\n91#3:237\n78#3,11:246\n91#3:279\n91#3:284\n456#4,8:180\n464#4,3:194\n456#4,8:216\n464#4,3:230\n467#4,3:234\n456#4,8:257\n464#4,3:271\n467#4,3:276\n467#4,3:281\n4144#5,6:188\n4144#5,6:224\n4144#5,6:265\n154#6:198\n154#6:239\n154#6:275\n66#7,6:240\n72#7:274\n76#7:280\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonFirstChooseScreen.kt\ncom/yalla/yalla/module/account/ui/screen/DeleteAccountReasonFirstChooseScreen$MainContent$3\n*L\n66#1:163,6\n66#1:197\n67#1:199,6\n67#1:233\n67#1:238\n66#1:285\n66#1:169,11\n67#1:205,11\n67#1:237\n75#1:246,11\n75#1:279\n66#1:284\n66#1:180,8\n66#1:194,3\n67#1:216,8\n67#1:230,3\n67#1:234,3\n75#1:257,8\n75#1:271,3\n75#1:276,3\n66#1:281,3\n66#1:188,6\n67#1:224,6\n75#1:265,6\n69#1:198\n79#1:239\n84#1:275\n75#1:240,6\n75#1:274\n75#1:280\n*E\n"})
    public static final class OooO extends Lambda implements Function3<BoxScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f23114OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
            super(3);
            this.f23114OooO0Oo = deleteAccountReasonChooseVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            BoxScope ContentStatus = boxScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(ContentStatus, "$this$ContentStatus");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1103410886, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.MainContent.<anonymous> (DeleteAccountReasonFirstChooseScreen.kt:65)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                composer2.startReplaceableGroup(-483455358);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyOooO0O0 = o0O00oO0.OooO0O0(companion2, top, composer2, 0, -1323940314);
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
                Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
                if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                Modifier modifierOooO00o = androidx.compose.foundation.layout.OooOO0.OooO00o(ColumnScopeInstance.INSTANCE, PaddingKt.m479paddingVpY3zN4(companion, Dp.m3775constructorimpl(20), Dp.m3775constructorimpl(29)), 1.0f, false, 2, null);
                composer2.startReplaceableGroup(-483455358);
                MeasurePolicy measurePolicyOooO0O1 = o0O00oO0.OooO0O0(companion2, arrangement.getTop(), composer2, 0, -1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierOooO00o);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl2 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o2 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl2, measurePolicyOooO0O1, composerM1320constructorimpl2, currentCompositionLocalMap2);
                if (composerM1320constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash2, composerM1320constructorimpl2, currentCompositeKeyHash2, function2OooO00o2);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf2, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                DeleteAccountReasonFirstChooseScreen.INSTANCE.MainContainer(this.f23114OooO0Oo, composer2, DeleteAccountReasonChooseVM.$stable | 48);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(BackgroundKt.m171backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), o0000oo.OooO0OO(composer2).f38618OooO0O0, null, 2, null), Dp.m3775constructorimpl(30), Dp.m3775constructorimpl(12));
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyOooO00o = Oooo000.OooO00o(companion2, false, composer2, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer composerM1320constructorimpl3 = Updater.m1320constructorimpl(composer2);
                Function2 function2OooO00o3 = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl3, measurePolicyOooO00o, composerM1320constructorimpl3, currentCompositionLocalMap3);
                if (composerM1320constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash3, composerM1320constructorimpl3, currentCompositeKeyHash3, function2OooO00o3);
                }
                androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf3, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                o00O0OO0.OooO00o(o0000.OooO0OO(o000000.Cancel), 0L, null, null, null, null, null, 0.0f, null, false, false, 0L, false, null, null, null, null, null, SizeKt.m511height3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(37)), com.yalla.yalla.module.account.ui.screen.OooO.f23168OooO0Oo, composer2, 0, 905969664, 262142);
                if (OooOOO0.OooO0O0(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23116OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23117OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f23117OooO0o0 = columnScope;
            this.f23116OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23116OooO0o | 1);
            DeleteAccountReasonFirstChooseScreen.this.Content(this.f23117OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<LazyGridScope, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f23118OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
            super(1);
            this.f23118OooO0Oo = deleteAccountReasonChooseVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LazyGridScope lazyGridScope) {
            LazyGridScope LazyVerticalGrid = lazyGridScope;
            Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
            DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = this.f23118OooO0Oo;
            LazyGridScope.CC.OooO0O0(LazyVerticalGrid, deleteAccountReasonChooseVM.getCancelReasonList().size(), null, null, null, ComposableLambdaKt.composableLambdaInstance(-1542439203, true, new com.yalla.yalla.module.account.ui.screen.OooO0o(deleteAccountReasonChooseVM)), 14, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23120OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f23121OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, int i) {
            super(2);
            this.f23121OooO0o0 = deleteAccountReasonChooseVM;
            this.f23120OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23120OooO0o | 1);
            DeleteAccountReasonFirstChooseScreen.this.MainContainer(this.f23121OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ DeleteAccountReasonChooseVM f23122OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM) {
            super(0);
            this.f23122OooO0Oo = deleteAccountReasonChooseVM;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f23122OooO0Oo.loadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f23124OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f23125OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(ColumnScope columnScope, int i) {
            super(2);
            this.f23125OooO0o0 = columnScope;
            this.f23124OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f23124OooO0o | 1);
            DeleteAccountReasonFirstChooseScreen.this.MainContent(this.f23125OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    private DeleteAccountReasonFirstChooseScreen() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContainer(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(18068840);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(deleteAccountReasonChooseVM) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(18068840, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.MainContainer (DeleteAccountReasonFirstChooseScreen.kt:93)");
            }
            String strOooO0OO = o0000.OooO0OO(o000000.delete_account_cancel_reason_title);
            p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
            TextKt.m1261Text4IGK_g(o0000O.OooO00o(strOooO0OO, p475o0Ooooo0.o0O00oO0.OooOOoo().getValue()), (Modifier) null, o0000oo.OooO0OO(composerStartRestartGroup).f38616OooO, oOO0O00O.OooO0OO(17, composerStartRestartGroup), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 196608, 0, 131026);
            String strOooO00o = deleteAccountReasonChooseVM.getFriendCount() > 0 ? o0000O.OooO00o(o0000.OooO0OO(o000000.delete_account_cancel_reason_warn_1), String.valueOf(deleteAccountReasonChooseVM.getFriendCount())) : o0000.OooO0OO(o000000.delete_account_cancel_reason_warn_2);
            Modifier.Companion companion = Modifier.INSTANCE;
            TextKt.m1261Text4IGK_g(strOooO00o, PaddingKt.m482paddingqDBjuR0$default(companion, 0.0f, Dp.m3775constructorimpl((float) 7.5d), 0.0f, 0.0f, 13, null), o0000oo.OooO0OO(composerStartRestartGroup).f38626OooOO0O, oOO0O00O.OooO0OO(15, composerStartRestartGroup), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 48, 0, 131056);
            com.code.android.util.OooOO0.OooO0o(Dp.m3775constructorimpl(20), null, composerStartRestartGroup, 6, 2);
            GridCells.Fixed fixed = new GridCells.Fixed(2);
            Arrangement arrangement = Arrangement.INSTANCE;
            float f = 16;
            composer2 = composerStartRestartGroup;
            LazyGridDslKt.LazyVerticalGrid(fixed, SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), null, null, false, arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), arrangement.m392spacedBy0680j_4(Dp.m3775constructorimpl(f)), null, false, new OooO0O0(deleteAccountReasonChooseVM), composerStartRestartGroup, 1769520, FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(deleteAccountReasonChooseVM, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(ColumnScope columnScope, Composer composer, int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1935615624);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1935615624, i2, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.MainContent (DeleteAccountReasonFirstChooseScreen.kt:50)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(DeleteAccountReasonChooseVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = (DeleteAccountReasonChooseVM) viewModel;
            Bundle bundleOooO0O0 = o00O00O.OooO0O0((NavBackStackEntry) composerStartRestartGroup.consume(o00O00O.f53500OooO00o), composerStartRestartGroup);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(bundleOooO0O0);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = bundleOooO0O0.get(LinkedAccountsScreen.ACCOUNT_INFO_PARAM);
                deleteAccountReasonChooseVM.setAccountInfo(obj instanceof AccountBindInfo ? (AccountBindInfo) obj : null);
                composerStartRestartGroup.updateRememberedValue(null);
            }
            composerStartRestartGroup.endReplaceableGroup();
            oOO00O.OooO0o0(deleteAccountReasonChooseVM.getContentState(), false, androidx.compose.foundation.layout.OooOO0.OooO00o(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, null, new OooO0o(deleteAccountReasonChooseVM), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1103410886, true, new OooO(deleteAccountReasonChooseVM)), composerStartRestartGroup, 12582912, 58);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooOO0(columnScope, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(886411247);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(columnScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        int i3 = i2;
        if ((i3 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(886411247, i3, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.Content (DeleteAccountReasonFirstChooseScreen.kt:44)");
            }
            o0O0oo0o.OooO00o(o0000.OooO0OO(o000000.delete_account), 0.0f, 0L, null, null, null, null, null, BackgroundKt.m171backgroundbw27NRU$default(Modifier.INSTANCE, o0000oo.OooO0OO(composerStartRestartGroup).f38618OooO0O0, null, 2, null), composerStartRestartGroup, 0, 254);
            composer2 = composerStartRestartGroup;
            MainContent(columnScope, composer2, (i3 & 14) | (i3 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @Override // p532o0o0OOo0.o000O0
    @Composable
    /* JADX INFO: renamed from: getWindowBackgroundColor-WaAFU9c */
    public long mo4200getWindowBackgroundColorWaAFU9c(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-966070806);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-966070806, i, -1, "com.yalla.yalla.module.account.ui.screen.DeleteAccountReasonFirstChooseScreen.getWindowBackgroundColor (DeleteAccountReasonFirstChooseScreen.kt:159)");
        }
        long j = o0000oo.OooO0OO(composer).f38619OooO0OO;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
