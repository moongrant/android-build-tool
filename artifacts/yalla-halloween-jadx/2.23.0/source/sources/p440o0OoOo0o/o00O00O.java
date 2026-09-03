package p440o0OoOo0o;

import android.app.Activity;
import android.content.Context;
import androidx.compose.animation.OooO;
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
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.OooOO0;
import com.code.android.util.o000O0;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.ui.activity.account.UntieAccountBindActivity;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.ui.vm.account.LinkedAccountsVM;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;
import p147o00Oo0Oo.o000OOo;
import p158o00OoOOO.o00Oo0;
import p427o0OoOO00.oo000o;
import p464o0Oooo.o000000O;
import p469o0OoooOO.o0oO0O0o;
import p507o0o00ooo.o1;
import p507o0o00ooo.t1;
import p507o0o00ooo.v;
import p571o0oOoOO.o0O0OOO0;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 8 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,284:1\n81#2,11:285\n81#2,11:296\n81#2,11:308\n154#3:307\n154#3:327\n164#3:328\n154#3:329\n154#3:365\n154#3:371\n76#4:319\n25#5:320\n456#5,8:347\n464#5,3:361\n467#5,3:366\n1097#6,6:321\n72#7,6:330\n78#7:364\n82#7:370\n78#8,11:336\n91#8:369\n4144#9,6:355\n81#10:372\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt\n*L\n77#1:285,11\n91#1:296,11\n104#1:308,11\n103#1:307\n214#1:327\n217#1:328\n219#1:329\n222#1:365\n270#1:371\n110#1:319\n137#1:320\n211#1:347,8\n211#1:361,3\n211#1:366,3\n137#1:321,6\n211#1:330,6\n211#1:364\n211#1:370\n211#1:336,11\n211#1:369\n211#1:355,6\n111#1:372\n*E\n"})
public final class o00O00O {

    @SourceDebugExtension({"SMAP\nLinkedAccountsScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$SettingItemYallaChat$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,284:1\n154#2:285\n154#2:286\n*S KotlinDebug\n*F\n+ 1 LinkedAccountsScreen.kt\ncom/yalla/yalla/module/account/ui/screen/LinkedAccountsScreenKt$SettingItemYallaChat$1\n*L\n267#1:285\n268#1:286\n*E\n"})
    public static final class OooO00o extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f46155OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(LinkedAccountsVM linkedAccountsVM) {
            super(3);
            this.f46155OooO0Oo = linkedAccountsVM;
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
                    ComposerKt.traceEventStart(-569093650, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat.<anonymous> (LinkedAccountsScreen.kt:261)");
                }
                ImageKt.Image(PainterResources_androidKt.painterResource(this.f46155OooO0Oo.isBindYallaChat() ? oOo00OO0.account_yalla_chat_green : oOo00OO0.account_yalla_chat_gray, composer2, 0), (String) null, SizeKt.m523size3ABfNKs(PaddingKt.m480paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m3765constructorimpl(10), 0.0f, 11, null), Dp.m3765constructorimpl(20)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 440, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f46156OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(LinkedAccountsVM linkedAccountsVM) {
            super(3);
            this.f46156OooO0Oo = linkedAccountsVM;
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
                    ComposerKt.traceEventStart(1685198541, iIntValue, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat.<anonymous> (LinkedAccountsScreen.kt:269)");
                }
                LinkedAccountsVM linkedAccountsVM = this.f46156OooO0Oo;
                if (linkedAccountsVM.isBindYallaChat()) {
                    TextKt.m1251Text4IGK_g(linkedAccountsVM.getBindYallaChatInfo(), (Modifier) null, o000OOo.OooO0OO(composer2).f37712OooOO0o, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 3072, 0, 131058);
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
        public final /* synthetic */ LinkedAccountsVM f46157OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f46158OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f46159OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager f46160OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(LinkedAccountsVM linkedAccountsVM, ScreenNavigationActivity screenNavigationActivity, o0O0OOO0 o0o0ooo0, OpenAuthManager openAuthManager) {
            super(0);
            this.f46157OooO0Oo = linkedAccountsVM;
            this.f46159OooO0o0 = screenNavigationActivity;
            this.f46158OooO0o = o0o0ooo0;
            this.f46160OooO0oO = openAuthManager;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LinkedAccountsVM linkedAccountsVM = this.f46157OooO0Oo;
            if (linkedAccountsVM.getAccountBindInfo() != null) {
                o0OO000.OooO00o("105136");
                if (linkedAccountsVM.isBindYallaChat()) {
                    int i = UntieAccountBindActivity.f25342OooOo;
                    UntieAccountBindActivity.OooO00o.OooO00o(this.f46159OooO0o0, linkedAccountsVM.getAccountBindInfo(), 12);
                } else {
                    o0O0OOO0.OooO0O0(this.f46158OooO0o);
                    this.f46160OooO0oO.OooO0o0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ LinkedAccountsVM f46161OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager f46162OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0O0OOO0 f46163OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ ScreenNavigationActivity f46164OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f46165OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(LinkedAccountsVM linkedAccountsVM, o0O0OOO0 o0o0ooo0, OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, int i) {
            super(2);
            this.f46161OooO0Oo = linkedAccountsVM;
            this.f46163OooO0o0 = o0o0ooo0;
            this.f46162OooO0o = openAuthManager;
            this.f46164OooO0oO = screenNavigationActivity;
            this.f46165OooO0oo = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            o00O00O.OooO00o(this.f46161OooO0Oo, this.f46163OooO0o0, this.f46162OooO0o, this.f46164OooO0oO, composer, RecomposeScopeImplKt.updateChangedFlags(this.f46165OooO0oo | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(LinkedAccountsVM linkedAccountsVM, o0O0OOO0 o0o0ooo0, OpenAuthManager openAuthManager, ScreenNavigationActivity screenNavigationActivity, Composer composer, int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-552403958);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(linkedAccountsVM) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changed(o0o0ooo0) ? 32 : 16;
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
                ComposerKt.traceEventStart(-552403958, i, -1, "com.yalla.yalla.module.account.ui.screen.SettingItemYallaChat (LinkedAccountsScreen.kt:253)");
            }
            if (linkedAccountsVM.isBindYallaChat()) {
                composer2 = composerStartRestartGroup;
                o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.single_third_yallachat, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -569093650, true, new OooO00o(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1685198541, true, new OooO0O0(linkedAccountsVM)), false, Dp.m3765constructorimpl(1), null, new OooO0OO(linkedAccountsVM, screenNavigationActivity, o0o0ooo0, openAuthManager), composer2, 114819072, 6, 2622);
            } else {
                o000000O o000000o2 = o000000O.f46674OooO00o;
                if (o000000O.OooOoO0()) {
                    composer2 = composerStartRestartGroup;
                    o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.single_third_yallachat, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -569093650, true, new OooO00o(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1685198541, true, new OooO0O0(linkedAccountsVM)), false, Dp.m3765constructorimpl(1), null, new OooO0OO(linkedAccountsVM, screenNavigationActivity, o0o0ooo0, openAuthManager), composer2, 114819072, 6, 2622);
                } else {
                    Context context = o000O0.f10354OooO00o;
                    Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                    if (activityOooO0O0 != null ? oo000o.OooO0OO(activityOooO0O0, "com.yallatech.yallachat") : false) {
                        composer2 = composerStartRestartGroup;
                        o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.single_third_yallachat, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -569093650, true, new OooO00o(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1685198541, true, new OooO0O0(linkedAccountsVM)), false, Dp.m3765constructorimpl(1), null, new OooO0OO(linkedAccountsVM, screenNavigationActivity, o0o0ooo0, openAuthManager), composer2, 114819072, 6, 2622);
                    } else {
                        composer2 = composerStartRestartGroup;
                    }
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
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0o(linkedAccountsVM, o0o0ooo0, openAuthManager, screenNavigationActivity, i));
    }

    public static final void OooO0O0(Composer composer, int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1265844951);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1265844951, i, -1, "com.yalla.yalla.module.account.ui.screen.AccountDeleteDialog (LinkedAccountsScreen.kt:75)");
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
            List listListOf = CollectionsKt.listOf(StringResources_androidKt.stringResource(oO00OOo0.delete_account, composerStartRestartGroup, 0));
            o0000O0O o0000o0o2 = new o0000O0O(linkedAccountsVM);
            composer2 = composerStartRestartGroup;
            o00Oo0.OooO00o(showDeleteDialog, null, listListOf, null, false, o0000o0o2, null, null, 0L, null, null, null, composerStartRestartGroup, 0, 0, 4058);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000OO(i));
    }

    public static final void OooO0OO(ColumnScope columnScope, Composer composer, int i) {
        Composer composer2;
        Modifier.Companion companion;
        ScreenNavigationActivity screenNavigationActivity;
        Object obj;
        Composer composer3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1708457668);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer3 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1708457668, i, -1, "com.yalla.yalla.module.account.ui.screen.LinkedAccountScreenContent (LinkedAccountsScreen.kt:89)");
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
            t1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.Linked_Accounts, composerStartRestartGroup, 0), 0.0f, 0L, null, null, null, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 830100379, true, new o000Oo0(linkedAccountsVM)), null, composerStartRestartGroup, 12582912, 382);
            float fM3765constructorimpl = Dp.m3765constructorimpl(10);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            OooOO0.OooO0o(fM3765constructorimpl, BackgroundKt.m169backgroundbw27NRU$default(companion2, o000OOo.OooO0OO(composerStartRestartGroup).f37704OooO0OO, null, 2, null), composerStartRestartGroup, 6, 0);
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(o0O0OOO0.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            o0O0OOO0 o0o0ooo0 = (o0O0OOO0) viewModel2;
            com.code.android.util.o00Oo0.OooO0O0(new o000O00(linkedAccountsVM, o0o0ooo0), composerStartRestartGroup, 0);
            Object objConsume = composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type com.yalla.yalla.ui.screen.ScreenNavigationActivity");
            ScreenNavigationActivity screenNavigationActivity2 = (ScreenNavigationActivity) objConsume;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            State stateObserveAsState = LiveDataAdapterKt.observeAsState(o000000O.OooOo0(), Boolean.FALSE, composerStartRestartGroup, 56);
            composerStartRestartGroup.startReplaceableGroup(-2073882990);
            Boolean isBindPhone = (Boolean) stateObserveAsState.getValue();
            Intrinsics.checkNotNullExpressionValue(isBindPhone, "isBindPhone");
            if (isBindPhone.booleanValue() || o000000O.OooOoO0()) {
                composer2 = composerStartRestartGroup;
                companion = companion2;
                o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.title_Phone_Phone, composerStartRestartGroup, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2087090472, true, new o000O00O(stateObserveAsState)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1363800039, true, new o000O0(linkedAccountsVM)), false, v.f50296OooO0OO, null, new o000O0Oo(linkedAccountsVM, screenNavigationActivity2), composer2, 114819072, 0, 2622);
            } else {
                companion = companion2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            Composer composer4 = composer2;
            composer4.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer4.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                screenNavigationActivity = screenNavigationActivity2;
                OpenAuthManager openAuthManager = new OpenAuthManager(screenNavigationActivity);
                openAuthManager.f24730OooO0O0 = new o00O000(o0o0ooo0, linkedAccountsVM, screenNavigationActivity);
                openAuthManager.f24732OooO0Oo = new o00O000o(o0o0ooo0);
                openAuthManager.f24731OooO0OO = new o00O00(o0o0ooo0);
                composer4.updateRememberedValue(openAuthManager);
                obj = openAuthManager;
            } else {
                screenNavigationActivity = screenNavigationActivity2;
                obj = objRememberedValue;
            }
            composer4.endReplaceableGroup();
            OpenAuthManager openAuthManager2 = (OpenAuthManager) obj;
            EffectsKt.DisposableEffect(Unit.INSTANCE, new o000O(screenNavigationActivity, openAuthManager2), composer4, 6);
            ScreenNavigationActivity screenNavigationActivity3 = screenNavigationActivity;
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.single_third_facebook, composer4, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composer4, -1817622765, true, new o000OO00(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composer4, -1895613036, true, new o000OOo0(linkedAccountsVM)), false, 0.0f, null, new o00(linkedAccountsVM, screenNavigationActivity, o0o0ooo0, openAuthManager2), composer4, 114819072, 0, 3646);
            int i2 = LinkedAccountsVM.$stable | 64 | ConstantsKt.MINIMUM_BLOCK_SIZE;
            int i3 = ScreenNavigationActivity.f29156OooO0oo;
            OooO00o(linkedAccountsVM, o0o0ooo0, openAuthManager2, screenNavigationActivity3, composer4, i2 | 4096);
            o1.OooO00o(StringResources_androidKt.stringResource(oO00OOo0.single_third_twitter, composer4, 0), 0L, 0.0f, null, null, false, true, ComposableLambdaKt.composableLambda(composer4, -474886276, true, new o0000OO0(linkedAccountsVM)), ComposableLambdaKt.composableLambda(composer4, 1885874621, true, new o000(linkedAccountsVM)), false, 0.0f, null, new o000O000(linkedAccountsVM, screenNavigationActivity3, o0o0ooo0, openAuthManager2), composer4, 114819072, 0, 3646);
            float f = 12;
            Modifier modifierM477paddingVpY3zN4 = PaddingKt.m477paddingVpY3zN4(BackgroundKt.background$default(PaddingKt.m476padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), Dp.m3765constructorimpl(15)), Brush.Companion.m1633verticalGradient8A3gB4$default(Brush.INSTANCE, CollectionsKt.listOf((Object[]) new Color[]{Color.m1660boximpl(o0oO0O0o.f47164o0OO00O), Color.m1660boximpl(o0oO0O0o.f47179oo0o0Oo)}), 0.0f, 0.0f, 0, 14, (Object) null), RoundedCornerShapeKt.m727RoundedCornerShape0680j_4(Dp.m3765constructorimpl((float) 7.5d)), 0.0f, 4, null), Dp.m3765constructorimpl(f), Dp.m3765constructorimpl(20));
            composer4.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyOooO00o = androidx.compose.material.OooO0o.OooO00o(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composer4, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM477paddingVpY3zN4);
            if (!(composer4.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer4.startReusableNode();
            if (composer4.getInserting()) {
                composer4.createNode(constructor);
            } else {
                composer4.useNode();
            }
            Composer composerM1309constructorimpl = Updater.m1309constructorimpl(composer4);
            Function2 function2OooO00o = OooO.OooO00o(companion3, composerM1309constructorimpl, measurePolicyOooO00o, composerM1309constructorimpl, currentCompositionLocalMap);
            if (composerM1309constructorimpl.getInserting() || !Intrinsics.areEqual(composerM1309constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                androidx.compose.animation.OooO0O0.OooO00o(currentCompositeKeyHash, composerM1309constructorimpl, currentCompositeKeyHash, function2OooO00o);
            }
            androidx.compose.animation.OooOO0.OooO00o(0, function3ModifierMaterializerOf, SkippableUpdater.m1300boximpl(SkippableUpdater.m1301constructorimpl(composer4)), composer4, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Composer composer5 = composer4;
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.Tip, composer4, 0), (Modifier) null, o0oO0O0o.f47162o0O0O00, TextUnitKt.getSp(16), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 131058);
            OooOO0.OooO0o(Dp.m3765constructorimpl(f), null, composer5, 6, 2);
            TextKt.m1251Text4IGK_g(StringResources_androidKt.stringResource(oO00OOo0.linked_account_suggest, composer5, 0), (Modifier) null, o000OOo.OooO0OO(composer5).f37710OooOO0, TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer5, 3072, 0, 131058);
            boolean zOooO0O0 = androidx.compose.material.OooOO0.OooO0O0(composer5);
            composer3 = composer5;
            if (zOooO0O0) {
                ComposerKt.traceEventEnd();
                composer3 = composer5;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o000O0o(columnScope, i));
    }
}
