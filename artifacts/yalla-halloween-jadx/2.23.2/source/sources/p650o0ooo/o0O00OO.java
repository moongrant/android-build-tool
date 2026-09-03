package p650o0ooo;

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
import p196o00o0OOO.oOO00O;
import p230o00oOo0o.o0O0O00;
import p519o0o0O0OO.o00O00;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nFollowingMomentTopUserDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,303:1\n81#2,11:304\n25#3:315\n1097#4,6:316\n81#5:322\n*S KotlinDebug\n*F\n+ 1 FollowingMomentTopUserDialog.kt\ncom/yalla/yalla/ui/dialog/FollowingMomentTopUserDialogKt$FollowingUserMomentContent$2$3\n*L\n120#1:304,11\n130#1:315\n130#1:316,6\n130#1:322\n*E\n"})
public final class o0O00OO extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List<RecommendNewPostModel> f58630OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f58631OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Integer> f58632OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ l f58633OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00OO(MutableState mutableState, FragmentActivity fragmentActivity, l lVar, List list) {
        super(4);
        this.f58630OooO0Oo = list;
        this.f58632OooO0o0 = mutableState;
        this.f58631OooO0o = fragmentActivity;
        this.f58633OooO0oO = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        o0O0O00 HorizontalPager = o0o0o00;
        int iIntValue = num.intValue();
        Composer composer2 = composer;
        int iIntValue2 = num2.intValue();
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if ((iIntValue2 & 112) == 0) {
            iIntValue2 |= composer2.changed(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 721) == 144 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(364918662, iIntValue2, -1, "com.yalla.yalla.ui.dialog.FollowingUserMomentContent.<anonymous>.<anonymous> (FollowingMomentTopUserDialog.kt:119)");
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
            RecommendNewPostModel recommendNewPostModel = this.f58630OooO0Oo.get(iIntValue);
            EffectsKt.LaunchedEffect(Unit.INSTANCE, new o0OoOoOo(momentFollowingTopUserVM, recommendNewPostModel, null), composer2, 70);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue = composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o000OO(lazyListStateRememberLazyListState), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue;
            composer2.startReplaceableGroup(2006949143);
            if (this.f58632OooO0o0.getValue().intValue() == iIntValue) {
                o00O00.OooO00o(momentFollowingTopUserVM, null, composer2, 0, 2);
                ((o000OO) mutableState.getValue()).OooO0O0(momentFollowingTopUserVM.getListData().size(), null, composer2, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
            }
            composer2.endReplaceableGroup();
            oOO00O.OooO0o0(momentFollowingTopUserVM.getContentState().getValue(), false, null, null, null, null, new o0O000Oo(momentFollowingTopUserVM, recommendNewPostModel), ComposableLambdaKt.composableLambda(composer2, -689581304, true, new o0O00O(lazyListStateRememberLazyListState, momentFollowingTopUserVM, this.f58631OooO0o, mutableState, this.f58633OooO0oO, recommendNewPostModel)), composer2, 12582912, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
