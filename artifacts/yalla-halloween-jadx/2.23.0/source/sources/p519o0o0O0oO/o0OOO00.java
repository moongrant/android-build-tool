package p519o0o0O0oO;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yalla.yalla.model.RecommendNewPostModel;
import com.yalla.yalla.ui.vm.moment.MomentFollowingTopUserVM;
import java.util.List;
import kotlin.Unit;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p150o00Oo0oO.o0000Ooo;
import p184o00o00o.OooOo00;
import p509o0o0O0.o0ooOOo;
import p515o0o0O0O0.o0Oo0oo;
import p579o0oOoo.oO0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFollowingMomentTopUserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,303:1\n81#2,11:304\n25#3:315\n1097#4,6:316\n81#5:322\n*S KotlinDebug\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3\n*L\n120#1:304,11\n130#1:315\n130#1:316,6\n130#1:322\n*E\n"})
public final class o0OOO00 extends Lambda implements Function4<OooOo00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f52737OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f52738OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f52739OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oO0O0O00 f52740OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO00(MutableState mutableState, FragmentActivity fragmentActivity, oO0O0O00 oo0o0o00, List list) {
        super(4);
        this.f52737OooO0Oo = list;
        this.f52739OooO0o0 = mutableState;
        this.f52738OooO0o = fragmentActivity;
        this.f52740OooO0oO = oo0o0o00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(OooOo00 oooOo00, Integer num, Composer composer, Integer num2) {
        int i;
        OooOo00 HorizontalPager = oooOo00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            i = (composer2.changed(iIntValue) ? 32 : 16) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((i & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364918662, iIntValue2, -1, "com.yalla.yalla.ui.dialog.FollowingUserMomentContent.<anonymous>.<anonymous> (FollowingMomentTopUserDialog.kt:118)");
            }
            String strValueOf = String.valueOf(iIntValue);
            composer2.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(MomentFollowingTopUserVM.class, current, strValueOf, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            MomentFollowingTopUserVM momentFollowingTopUserVM = (MomentFollowingTopUserVM) viewModel;
            RecommendNewPostModel recommendNewPostModel = this.f52737OooO0Oo.get(iIntValue);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new o0OO0(momentFollowingTopUserVM, recommendNewPostModel, null), composer2, 70);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o0Oo0oo(lazyListStateRememberLazyListState), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composer2.startReplaceableGroup(2006949143);
            if (this.f52739OooO0o0.getValue().intValue() == iIntValue) {
                o0ooOOo.OooO00o(momentFollowingTopUserVM, null, composer2, 0, 2);
                ((o0Oo0oo) mutableState.getValue()).OooO0O0(momentFollowingTopUserVM.getListData().size(), null, composer2, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
            }
            composer2.endReplaceableGroup();
            o0000Ooo.OooO0o0(momentFollowingTopUserVM.getContentState().getValue(), false, null, null, null, null, new o0OO0O0(momentFollowingTopUserVM, recommendNewPostModel), ComposableLambdaKt.composableLambda(composer2, -689581304, true, new o0OO(lazyListStateRememberLazyListState, momentFollowingTopUserVM, this.f52738OooO0o, mutableState, this.f52740OooO0oO, recommendNewPostModel)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
