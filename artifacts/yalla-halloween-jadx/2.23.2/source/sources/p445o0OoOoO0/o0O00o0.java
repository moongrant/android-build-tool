package p445o0OoOoO0;

import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.OooOO0;
import com.code.android.util.o000O00O;
import com.code.android.util.o00Oo0;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p429o0OoOO.o00Ooo;
import p475o0Ooooo0.o0O00oO0;
import p476o0OooooO.o0OOo000;
import p516o0o0O00o.o00O00o0;
import p516o0o0O00o.o0O0oo0o;
import p516o0o0O00o.o0oO0Ooo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p577o0oOoOo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,311:1\n81#2,11:312\n81#2,11:323\n81#2,11:335\n154#3:334\n154#3:354\n164#3:355\n154#3:356\n154#3:392\n154#3:398\n76#4:346\n25#5:347\n456#5,8:374\n464#5,3:388\n467#5,3:393\n1097#6,6:348\n72#7,6:357\n78#7:391\n82#7:397\n78#8,11:363\n91#8:396\n4144#9,6:382\n81#10:399\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt\n*L\n80#1:312,11\n94#1:323,11\n107#1:335,11\n106#1:334\n241#1:354\n244#1:355\n246#1:356\n249#1:392\n297#1:398\n113#1:346\n152#1:347\n238#1:374,8\n238#1:388,3\n238#1:393,3\n152#1:348,6\n238#1:357,6\n238#1:391\n238#1:397\n238#1:363,11\n238#1:396\n238#1:382,6\n114#1:399\n*E\n"})
public final class o0O00o0 {

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f47342OooO0Oo;

        public OooO(o00OOO00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f47342OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f47342OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f47342OooO0Oo;
        }

        public final int hashCode() {
            return this.f47342OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47342OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$SettingItemYallaChat$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,311:1\n154#2:312\n154#2:313\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$SettingItemYallaChat$1\n*L\n294#1:312\n295#1:313\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f47343OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LinkedAccountsVM linkedAccountsVM) {
            super(3);
            this.f47343OooO0Oo = linkedAccountsVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-569093650, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat.<anonymous> (LinkedAccountsScreen.kt:289)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(this.f47343OooO0Oo.isBindYallaChat() ? o0Oo0oo.account_yalla_chat_green : o0Oo0oo.account_yalla_chat_gray, composer2, 0), (String) null, SizeKt.m525size3ABfNKs(PaddingKt.m482paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3775constructorimpl(10), 0.0f, 11, null), Dp.m3775constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f47344OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LinkedAccountsVM linkedAccountsVM) {
            super(3);
            this.f47344OooO0Oo = linkedAccountsVM;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope SettingItem = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(SettingItem, "$this$SettingItem");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1685198541, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat.<anonymous> (LinkedAccountsScreen.kt:297)");
                }
                LinkedAccountsVM linkedAccountsVM = this.f47344OooO0Oo;
                if (linkedAccountsVM.isBindYallaChat()) {
                    TextKt.m1261Text4IGK_g(linkedAccountsVM.getBindYallaChatInfo(), (Modifier) null, o0000oo.OooO0OO(composer2).f38627OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f47345OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f47346OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f47347OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager f47348OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, o0oOo0O0 o0ooo0o1, LinkedAccountsVM linkedAccountsVM) {
            super(0);
            this.f47345OooO0Oo = linkedAccountsVM;
            this.f47347OooO0o0 = screenNavigationActivity;
            this.f47346OooO0o = o0ooo0o1;
            this.f47348OooO0oO = openAuthManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LinkedAccountsVM linkedAccountsVM = this.f47345OooO0Oo;
            if (linkedAccountsVM.getAccountBindInfo() != null) {
                o0oo0000.OooO00o.OooO0O0("105136");
                if (linkedAccountsVM.isBindYallaChat()) {
                    int i = UntieAccountBindActivity.f24887OooOo;
                    UntieAccountBindActivity.OooO00o.OooO00o(this.f47347OooO0o0, linkedAccountsVM.getAccountBindInfo(), 12);
                } else {
                    o0oOo0O0.OooO0O0(this.f47346OooO0o);
                    this.f47348OooO0oO.OooO0o0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f47349OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager f47350OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0oOo0O0 f47351OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f47352OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f47353OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LinkedAccountsVM linkedAccountsVM, o0oOo0O0 o0ooo0o1, OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, int i) {
            super(2);
            this.f47349OooO0Oo = linkedAccountsVM;
            this.f47351OooO0o0 = o0ooo0o1;
            this.f47350OooO0o = openAuthManager;
            this.f47352OooO0oO = screenNavigationActivity;
            this.f47353OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o0O00o0.OooO00o(this.f47349OooO0Oo, this.f47351OooO0o0, this.f47350OooO0o, this.f47352OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f47353OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(LinkedAccountsVM linkedAccountsVM, o0oOo0O0 o0ooo0o1, OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552403958);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(linkedAccountsVM) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(o0ooo0o1) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= composerStartRestartGroup.changed(openAuthManager) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= composerStartRestartGroup.changed(screenNavigationActivity) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if ((i2 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-552403958, i2, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat (LinkedAccountsScreen.kt:285)");
            }
            if (linkedAccountsVM.isBindYallaChat() || !linkedAccountsVM.isHideYc()) {
                composer2 = composerStartRestartGroup;
                o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.single_third_yallachat, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -569093650, true, new OooO00o(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1685198541, true, new OooO0O0(linkedAccountsVM)), false, Dp.m3775constructorimpl(1), null, new OooO0OO(openAuthManager, screenNavigationActivity, o0ooo0o1, linkedAccountsVM), composer2, 114819072, 6, 2622);
            } else {
                Context context = o000O00O.f13421OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null ? o00Ooo.OooO0OO(activityOooO0O0, "com.yallatech.yallachat") : false) {
                    composer2 = composerStartRestartGroup;
                    o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.single_third_yallachat, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -569093650, true, new OooO00o(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1685198541, true, new OooO0O0(linkedAccountsVM)), false, Dp.m3775constructorimpl(1), null, new OooO0OO(openAuthManager, screenNavigationActivity, o0ooo0o1, linkedAccountsVM), composer2, 114819072, 6, 2622);
                } else {
                    composer2 = composerStartRestartGroup;
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(linkedAccountsVM, o0ooo0o1, openAuthManager, screenNavigationActivity, i));
    }

    public static final void OooO0O0(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1265844951);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265844951, i, -1, "com.yalla.yalla.module.account.ui.screen.AccountDeleteDialog (LinkedAccountsScreen.kt:78)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(LinkedAccountsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LinkedAccountsVM linkedAccountsVM = (LinkedAccountsVM) viewModel;
            MutableState<Boolean> showDeleteDialog = linkedAccountsVM.getShowDeleteDialog();
            List listListOf = CollectionsKt.listOf(StringResources_androidKt.stringResource(o000000.delete_account, composerStartRestartGroup, 0));
            oo00o oo00oVar = new oo00o(linkedAccountsVM);
            composer2 = composerStartRestartGroup;
            p207o00o0oO0.o000O00O.OooO00o(showDeleteDialog, null, listListOf, null, false, oo00oVar, null, null, 0L, null, null, null, composerStartRestartGroup, 0, 0, 4058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o00O0(i));
    }

    public static final void OooO0OO(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Modifier.Companion companion;
        ScreenNavigationActivity screenNavigationActivity;
        Object obj;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708457668);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer5 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1708457668, i, -1, "com.yalla.yalla.module.account.ui.screen.LinkedAccountScreenContent (LinkedAccountsScreen.kt:92)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(LinkedAccountsVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            LinkedAccountsVM linkedAccountsVM = (LinkedAccountsVM) viewModel;
            o0O0oo0o.OooO00o(StringResources_androidKt.stringResource(o000000.Linked_Accounts, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 830100379, true, new o00O0OO(linkedAccountsVM)), null, composerStartRestartGroup, 12582912, 382);
            float fM3775constructorimpl = Dp.m3775constructorimpl(10);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            OooOO0.OooO0o(fM3775constructorimpl, BackgroundKt.m171backgroundbw27NRU$default(companion2, o0000oo.OooO0OO(composerStartRestartGroup).f38619OooO0OO, null, 2, null), composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0oOo0O0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0oOo0O0 o0ooo0o1 = (o0oOo0O0) viewModel2;
            o00Oo0.OooO0O0(new o00O0OOO(linkedAccountsVM, o0ooo0o1), composerStartRestartGroup, 0);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
            ScreenNavigationActivity screenNavigationActivity2 = (ScreenNavigationActivity) objConsume;
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o0O00oO0.OooOo0(), Boolean.FALSE, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(-2073882842);
            Boolean bool = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(bool, "LinkedAccountScreenContent$lambda$0(...)");
            if (bool.booleanValue() || !linkedAccountsVM.isHidePh()) {
                composer2 = composerStartRestartGroup;
                companion = companion2;
                o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.title_Phone_Phone, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2087090472, true, new oo0oOO0(stateObserveAsState)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1363800039, true, new o00O(linkedAccountsVM, stateObserveAsState)), false, o00O00o0.f51375OooO0OO, null, new o00OO000(linkedAccountsVM, screenNavigationActivity2), composer2, 114819072, 0, 2622);
            } else {
                companion = companion2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            Composer composer6 = composer2;
            composer6.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer6.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                screenNavigationActivity = screenNavigationActivity2;
                OpenAuthManager openAuthManager = new OpenAuthManager(screenNavigationActivity);
                openAuthManager.f24267OooO0O0 = new o00OOOOo(o0ooo0o1, linkedAccountsVM, screenNavigationActivity);
                openAuthManager.f24269OooO0Oo = new o00Oo00(o0ooo0o1);
                openAuthManager.f24268OooO0OO = new o0oOO(o0ooo0o1);
                composer6.updateRememberedValue(openAuthManager);
                obj = openAuthManager;
            } else {
                screenNavigationActivity = screenNavigationActivity2;
                obj = objRememberedValue;
            }
            composer6.endReplaceableGroup();
            OpenAuthManager openAuthManager2 = (OpenAuthManager) obj;
            EffectsKt.DisposableEffect(Unit.INSTANCE, new o00OO0OO(screenNavigationActivity, openAuthManager2), composer6, 6);
            composer6.startReplaceableGroup(-2073879958);
            if (linkedAccountsVM.isHideFb()) {
                composer3 = composer6;
            } else {
                Composer composer7 = composer6;
                o0oO0Ooo.OooO00o(StringResources_androidKt.stringResource(o000000.single_third_facebook, composer6, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composer6, -1735314943, true, new oo0O(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composer6, 1857056514, true, new o00OO(linkedAccountsVM)), false, 0.0f, null, new o00OOO0(openAuthManager2, screenNavigationActivity, o0ooo0o1, linkedAccountsVM), composer7, 114819072, 0, 3646);
                composer3 = composer7;
            }
            composer3.endReplaceableGroup();
            int i2 = LinkedAccountsVM.$stable | 64 | ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i3 = ScreenNavigationActivity.f28622OooO0oo;
            OooO00o(linkedAccountsVM, o0ooo0o1, openAuthManager2, screenNavigationActivity, composer3, i2 | 4096);
            Composer composer8 = composer3;
            composer8.startReplaceableGroup(-2073878499);
            if (linkedAccountsVM.isHideTt()) {
                composer4 = composer8;
            } else {
                String strStringResource = StringResources_androidKt.stringResource(o000000.single_third_twitter, composer8, 0);
                ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composer8, -1261796000, true, new o00O0O0(linkedAccountsVM));
                ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composer8, -1964391839, true, new o00O0O0O(linkedAccountsVM));
                o00O0OO0 o00o0oo1 = new o00O0OO0(openAuthManager2, screenNavigationActivity, o0ooo0o1, linkedAccountsVM);
                Composer composer9 = composer8;
                o0oO0Ooo.OooO00o(strStringResource, 0L, 0.0f, null, null, false, true, composableLambda, composableLambda2, false, 0.0f, null, o00o0oo1, composer9, 114819072, 0, 3646);
                composer4 = composer9;
            }
            composer4.endReplaceableGroup();
            float f = 12;
            Modifier modifierM479paddingVpY3zN4 = PaddingKt.m479paddingVpY3zN4(BackgroundKt.background$default(PaddingKt.m478padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3775constructorimpl(15)), Brush.Companion.m1644verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1671boximpl(o0OOo000.f48248o000OOo), Color.m1671boximpl(o0OOo000.f48198o000000)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m729RoundedCornerShape0680j_4(Dp.m3775constructorimpl((float) 7.5d)), 0.0f, 4, null), Dp.m3775constructorimpl(f), Dp.m3775constructorimpl(20));
            composer4.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO0O0 = p022Oooo00O.o0O00oO0.OooO0O0(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer4, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM479paddingVpY3zN4);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            Composer composerM1320constructorimpl = Updater.m1320constructorimpl(composer4);
            Function2 function2OooO00o = androidx.compose.animation.OooO.OooO00o(companion3, composerM1320constructorimpl, measurePolicyOooO0O0, composerM1320constructorimpl, currentCompositionLocalMap);
            if (composerM1320constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1320constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO0O0(currentCompositeKeyHash, composerM1320constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1311boximpl(SkippableUpdater.m1312constructorimpl(composer4)), composer4, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.Tip, composer4, 0), (Modifier) null, o0OOo000.f48199o000000O, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
            OooOO0.OooO0o(Dp.m3775constructorimpl(f), null, composer4, 6, 2);
            TextKt.m1261Text4IGK_g(StringResources_androidKt.stringResource(o000000.linked_account_suggest, composer4, 0), (Modifier) null, o0000oo.OooO0OO(composer4).f38625OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 3072, 0, 131058);
            boolean zOooO00o = androidx.compose.material.OooO0o.OooO00o(composer4);
            composer5 = composer4;
            if (zOooO00o) {
                ComposerKt.traceEventEnd();
                composer5 = composer4;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer5.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oo0o0O0(columnScope, i));
    }
}
