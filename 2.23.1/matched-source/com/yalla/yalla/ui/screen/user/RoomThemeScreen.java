package com.yalla.yalla.ui.screen.user;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.google.accompanist.pager.Pager;
import com.yalla.yalla.ui.vm.user.RoomThemeVM;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p230o00oOo0o.o00000;
import p230o00oOo0o.o000000;
import p477o0Ooooo0.o0O0o;
import p515o0o0O00.o000OO00;
import p532o0o0OOOO.o0O00OOO;
import p544o0o0OoOO.y0;
import p577o0oOoOOO.f;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0017¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/ui/screen/user/RoomThemeScreen;", "Lo0o0OOOO/o0O00OOO;", "Landroidx/compose/foundation/layout/ColumnScope;", "", "Content", "(Landroidx/compose/foundation/layout/ColumnScope;Landroidx/compose/runtime/Composer;I)V", "Lcom/yalla/yalla/ui/screen/user/RoomThemePageType;", "pageType", "MainContent", "(Lcom/yalla/yalla/ui/screen/user/RoomThemePageType;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeScreen\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,88:1\n76#2:89\n81#3,11:90\n81#3,11:101\n154#4:112\n154#4:113\n*S KotlinDebug\n*F\n+ 1 RoomThemeScreen.kt\ncom/yalla/yalla/ui/screen/user/RoomThemeScreen\n*L\n40#1:89\n41#1:90,11\n42#1:101,11\n49#1:112\n79#1:113\n*E\n"})
public final class RoomThemeScreen extends o0O00OOO {
    public static final int $stable = 0;

    @NotNull
    public static final RoomThemeScreen INSTANCE = new RoomThemeScreen();

    public static final class OooO00o extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29586OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ ColumnScope f29587OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(ColumnScope columnScope, int i) {
            super(2);
            this.f29587OooO0o0 = columnScope;
            this.f29586OooO0o = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29586OooO0o | 1);
            RoomThemeScreen.this.Content(this.f29587OooO0o0, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f29589OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemePageType f29590OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f29591OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomThemePageType roomThemePageType, int i, int i2) {
            super(2);
            this.f29590OooO0o0 = roomThemePageType;
            this.f29589OooO0o = i;
            this.f29591OooO0oO = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f29589OooO0o | 1);
            RoomThemeScreen.this.MainContent(this.f29590OooO0o0, composer, iUpdateChangedFlags, this.f29591OooO0oO);
            return Unit.INSTANCE;
        }
    }

    private RoomThemeScreen() {
    }

    @Override // p532o0o0OOOO.o0O00OOO
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@NotNull ColumnScope columnScope, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(columnScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-581352477);
        if ((i & 112) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 81) == 16 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581352477, i2, -1, "com.yalla.yalla.ui.screen.user.RoomThemeScreen.Content (RoomThemeScreen.kt:32)");
            }
            MainContent(null, composerStartRestartGroup, i2 & 112, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO00o(columnScope, i));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void MainContent(@Nullable RoomThemePageType roomThemePageType, @Nullable Composer composer, int i, int i2) {
        RoomThemePageType roomThemePageType2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-81456521);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            roomThemePageType2 = roomThemePageType;
        } else if ((i & 14) == 0) {
            roomThemePageType2 = roomThemePageType;
            i3 = (composerStartRestartGroup.changed(roomThemePageType2) ? 4 : 2) | i;
        } else {
            roomThemePageType2 = roomThemePageType;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            RoomThemePageType roomThemePageType3 = i4 != 0 ? RoomThemePageType.Mine : roomThemePageType2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-81456521, i3, -1, "com.yalla.yalla.ui.screen.user.RoomThemeScreen.MainContent (RoomThemeScreen.kt:38)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
            ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(f.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(composerStartRestartGroup, 6);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel2 = ViewModelKt.viewModel(RoomThemeVM.class, current2, null, null, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            RoomThemeVM roomThemeVM = (RoomThemeVM) viewModel2;
            o000000 o000000VarOooO00o = o00000.OooO00o(roomThemePageType3.getValue(), composerStartRestartGroup, 0, 0);
            List<String> pageList = roomThemeVM.getPageList();
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 52;
            o000OO00.OooO00o(pageList, o000000VarOooO00o, BackgroundKt.m171backgroundbw27NRU$default(SizeKt.m511height3ABfNKs(companion, Dp.m3775constructorimpl(f)), o0O0o.f48092OooO00o, null, 2, null), null, y0.f55286OooO00o, composerStartRestartGroup, 24584, 8);
            Pager.OooO00o(roomThemeVM.getPageList().size(), PaddingKt.m482paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, Dp.m3775constructorimpl(f), 0.0f, 0.0f, 13, null), o000000VarOooO00o, false, 0.0f, null, null, null, null, false, y0.f55287OooO0O0, composerStartRestartGroup, 805306416, 6, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            roomThemePageType2 = roomThemePageType3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new OooO0O0(roomThemePageType2, i, i2));
    }
}
