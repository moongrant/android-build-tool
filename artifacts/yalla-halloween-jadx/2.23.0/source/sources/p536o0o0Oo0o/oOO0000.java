package p536o0o0Oo0o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.util.o0000O00;
import com.yalla.yalla.ui.vm.moment.MomentUserListVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p584o0oOooO0.oO00OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nUserMomentListFilterTypePop.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserMomentListFilterTypePop.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListFilterTypePop\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n81#2,11:111\n25#3:122\n25#3:130\n1097#4,6:123\n1097#4,6:131\n76#5:129\n81#6:137\n107#6,2:138\n*S KotlinDebug\n*F\n+ 1 UserMomentListFilterTypePop.kt\ncom/yalla/yalla/ui/screen/user/UserMomentListFilterTypePop\n*L\n46#1:111,11\n47#1:122\n52#1:130\n47#1:123,6\n52#1:131,6\n51#1:129\n47#1:137\n47#1:138,2\n*E\n"})
public final class oOO0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oOO0000 f55183OooO00o = new oOO0000();

    /* JADX WARN: Multi-variable type inference failed */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void OooO00o(int i, int i2, @Nullable Composer composer, @Nullable Function1 function1) {
        Function1 function2;
        int i3;
        Function1 function3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1204052238);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function2 = function1;
        } else if ((i & 14) == 0) {
            function2 = function1;
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            function2 = function1;
            i3 = i;
        }
        if ((i3 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function3 = function2;
        } else {
            function3 = i4 != 0 ? null : function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1204052238, i, -1, "com.yalla.yalla.ui.screen.user.UserMomentListFilterTypePop.Pop (UserMomentListFilterTypePop.kt:44)");
            }
            composerStartRestartGroup.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentUserListVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 36936, 0);
            composerStartRestartGroup.endReplaceableGroup();
            MomentUserListVM momentUserListVM = (MomentUserListVM) viewModel;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m3917boximpl(IntSizeKt.IntSize(0, 0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            LayoutCoordinates layoutCoordinates = momentUserListVM.getLayoutCoordinates();
            Rect rectBoundsInWindow = layoutCoordinates != null ? LayoutCoordinatesKt.boundsInWindow(layoutCoordinates) : null;
            if (rectBoundsInWindow != null) {
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    int i5 = oO00OOO.ic_user_moment_screen_pop_bg;
                    Object obj = ContextCompat.f5271OooO00o;
                    objRememberedValue2 = ContextCompat.OooO0OO.OooO0O0(context, i5);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.m4004PopupK5zGePQ(Alignment.INSTANCE.getTopStart(), IntOffsetKt.IntOffset(o0000O00.OooO0O0(), (((int) Offset.m1437getYimpl(rectBoundsInWindow.m1463getBottomCenterF1C5BW0())) - IntSize.m3924getHeightimpl(((IntSize) mutableState.getValue()).getPackedValue())) + 230), new oO0OO0O(momentUserListVM), new PopupProperties(true, true, true, null, false, false, 56, null), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1875424598, true, new oO((Drawable) objRememberedValue2, mutableState, momentUserListVM, function3)), composerStartRestartGroup, 27654, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new oOO00000(this, function3, i, i2));
    }
}
