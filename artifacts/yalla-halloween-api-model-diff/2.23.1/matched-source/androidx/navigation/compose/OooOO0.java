package androidx.navigation.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateHolderKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,120:1\n1855#2,2:121\n1855#2,2:124\n766#2:131\n857#2,2:132\n76#3:123\n76#3:126\n36#4:127\n1097#5,3:128\n1100#5,3:134\n81#6:137\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt\n*L\n46#1:121,2\n72#1:124,2\n109#1:131\n109#1:132,2\n71#1:123\n105#1:126\n106#1:127\n106#1:128,3\n106#1:134,3\n42#1:137\n*E\n"})
public final class OooOO0 {

    public static final class OooO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<NavBackStackEntry> f10115OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f10116OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Collection<NavBackStackEntry> f10117OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(List<NavBackStackEntry> list, Collection<NavBackStackEntry> collection, int i) {
            super(2);
            this.f10115OooO0Oo = list;
            this.f10117OooO0o0 = collection;
            this.f10116OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10116OooO0o | 1);
            OooOO0.OooO0O0(this.f10115OooO0Oo, this.f10117OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f10118OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f10119OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(OooOo00 oooOo00, NavBackStackEntry navBackStackEntry) {
            super(0);
            this.f10118OooO0Oo = oooOo00;
            this.f10119OooO0o0 = navBackStackEntry;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f10118OooO0Oo.OooO0O0().OooO0Oo(this.f10119OooO0o0, false);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f10120OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f10121OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ SaveableStateHolder f10122OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ OooOo00.OooO00o f10123OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NavBackStackEntry navBackStackEntry, SaveableStateHolder saveableStateHolder, OooOo00 oooOo00, OooOo00.OooO00o oooO00o) {
            super(2);
            this.f10120OooO0Oo = navBackStackEntry;
            this.f10122OooO0o0 = saveableStateHolder;
            this.f10121OooO0o = oooOo00;
            this.f10123OooO0oO = oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1129586364, iIntValue, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:51)");
                }
                OooOo00 oooOo00 = this.f10121OooO0o;
                NavBackStackEntry navBackStackEntry = this.f10120OooO0Oo;
                EffectsKt.DisposableEffect(navBackStackEntry, new OooOOO0(oooOo00, navBackStackEntry), composer2, 8);
                OooOo.OooO00o(navBackStackEntry, this.f10122OooO0o0, ComposableLambdaKt.composableLambda(composer2, -497631156, true, new OooOOO(this.f10123OooO0oO, navBackStackEntry)), composer2, 456);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ OooOo00 f10124OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f10125OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooOo00 oooOo00, int i) {
            super(2);
            this.f10124OooO0Oo = oooOo00;
            this.f10125OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10125OooO0o0 | 1);
            OooOO0.OooO00o(this.f10124OooO0Oo, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nDialogHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n+ 2 Effects.kt\nandroidx/compose/runtime/DisposableEffectScope\n*L\n1#1,120:1\n63#2,5:121\n*S KotlinDebug\n*F\n+ 1 DialogHost.kt\nandroidx/navigation/compose/DialogHostKt$PopulateVisibleList$1$1\n*L\n93#1:121,5\n*E\n"})
    public static final class OooO0o extends Lambda implements Function1<DisposableEffectScope, DisposableEffectResult> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ NavBackStackEntry f10126OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<NavBackStackEntry> f10127OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f10128OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(NavBackStackEntry navBackStackEntry, List list, boolean z) {
            super(1);
            this.f10126OooO0Oo = navBackStackEntry;
            this.f10128OooO0o0 = z;
            this.f10127OooO0o = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
            final List<NavBackStackEntry> list = this.f10127OooO0o;
            final boolean z = this.f10128OooO0o0;
            final NavBackStackEntry navBackStackEntry = this.f10126OooO0Oo;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.navigation.compose.DialogHostKt$PopulateVisibleList$1$1$observer$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(@NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
                    boolean z2 = z;
                    NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
                    List<NavBackStackEntry> list2 = list;
                    if (z2 && !list2.contains(navBackStackEntry2)) {
                        list2.add(navBackStackEntry2);
                    }
                    if (event == Lifecycle.Event.ON_START && !list2.contains(navBackStackEntry2)) {
                        list2.add(navBackStackEntry2);
                    }
                    if (event == Lifecycle.Event.ON_STOP) {
                        list2.remove(navBackStackEntry2);
                    }
                }
            };
            navBackStackEntry.getLifecycle().addObserver(lifecycleEventObserver);
            return new OooOOOO(navBackStackEntry, lifecycleEventObserver);
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void OooO00o(@NotNull OooOo00 oooOo00, @Nullable Composer composer, int i) {
        Object obj;
        Composer composerStartRestartGroup = composer.startRestartGroup(294589392);
        if ((((i & 14) == 0 ? (composerStartRestartGroup.changed(oooOo00) ? 4 : 2) | i : i) & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(294589392, i, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:39)");
            }
            SaveableStateHolder saveableStateHolderRememberSaveableStateHolder = SaveableStateHolderKt.rememberSaveableStateHolder(composerStartRestartGroup, 0);
            State stateCollectAsState = SnapshotStateKt.collectAsState(oooOo00.OooO0O0().f35765OooO0o0, null, composerStartRestartGroup, 8, 1);
            List list = (List) stateCollectAsState.getValue();
            composerStartRestartGroup.startReplaceableGroup(467378629);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467378629, 8, -1, "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:102)");
            }
            boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(list);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = objRememberedValue;
                SnapshotStateList snapshotStateListMutableStateListOf = SnapshotStateKt.mutableStateListOf();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (zBooleanValue ? true : ((NavBackStackEntry) obj2).getLifecycle().getState().isAtLeast(Lifecycle.State.STARTED)) {
                        arrayList.add(obj2);
                    }
                }
                snapshotStateListMutableStateListOf.addAll(arrayList);
                composerStartRestartGroup.updateRememberedValue(snapshotStateListMutableStateListOf);
                obj = snapshotStateListMutableStateListOf;
            }
            obj = objRememberedValue;
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList<NavBackStackEntry> snapshotStateList = (SnapshotStateList) obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composerStartRestartGroup.endReplaceableGroup();
            OooO0O0(snapshotStateList, (List) stateCollectAsState.getValue(), composerStartRestartGroup, 64);
            for (NavBackStackEntry navBackStackEntry : snapshotStateList) {
                NavDestination destination = navBackStackEntry.getDestination();
                Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                OooOo00.OooO00o oooO00o = (OooOo00.OooO00o) destination;
                AndroidDialog_androidKt.Dialog(new OooO00o(oooOo00, navBackStackEntry), oooO00o.f10145OooOOO0, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1129586364, true, new OooO0O0(navBackStackEntry, saveableStateHolderRememberSaveableStateHolder, oooOo00, oooO00o)), composerStartRestartGroup, 384, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0OO(oooOo00, i));
    }

    @Composable
    public static final void OooO0O0(@NotNull List<NavBackStackEntry> list, @NotNull Collection<NavBackStackEntry> collection, @Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1537894851);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1537894851, i, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:69)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue();
        for (NavBackStackEntry navBackStackEntry : collection) {
            EffectsKt.DisposableEffect(navBackStackEntry.getLifecycle(), new OooO0o(navBackStackEntry, list, zBooleanValue), composerStartRestartGroup, 8);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO(list, collection, i));
    }
}
