package p492o0o00OO0;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.swiprefresh.OooO0O0;
import com.code.android.uikit.swiprefresh.OooO0o;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.yalla.yalla.ui.vm.moment.TopicDetailVM;
import com.yalla.yalla.ui.vm.moment.TopicPopularMomentVM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p230o00oOo0o.o0O0O00;
import p521o0o0O0o0.o000OO;
import p590o0oOooo0.l;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nTopicDetailContentComp.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,212:1\n81#2,11:213\n67#3,3:224\n66#3:227\n25#3:234\n67#3,3:241\n66#3:244\n67#3,3:251\n66#3:254\n1097#4,6:228\n1097#4,6:235\n1097#4,6:245\n1097#4,6:255\n81#5:261\n*S KotlinDebug\n*F\n+ 1 TopicDetailContentComp.kt\ncom/yalla/yalla/ui/activity/moment/TopicDetailContentCompKt$TopicDetailContent$2$1\n*L\n76#1:213,11\n78#1:224,3\n78#1:227\n90#1:234\n94#1:241,3\n94#1:244\n102#1:251,3\n102#1:254\n78#1:228,6\n90#1:235,6\n94#1:245,6\n102#1:255,6\n90#1:261\n*E\n"})
public final class oO0OO00o extends Lambda implements Function4<o0O0O00, Integer, Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Long f49441OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ TopicDetailVM f49442OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f49443OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ FragmentActivity f49444OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ MutableState<l> f49445OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oO0OO00o(Long l, int i, TopicDetailVM topicDetailVM, FragmentActivity fragmentActivity, MutableState<l> mutableState) {
        super(4);
        this.f49441OooO0Oo = l;
        this.f49443OooO0o0 = i;
        this.f49442OooO0o = topicDetailVM;
        this.f49444OooO0oO = fragmentActivity;
        this.f49445OooO0oo = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function4
    public final Unit invoke(o0O0O00 o0o0o00, Integer num, Composer composer, Integer num2) {
        int i;
        o0O0O00 HorizontalPager = o0o0o00;
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
                ComposerKt.traceEventStart(521700224, i, -1, "com.yalla.yalla.ui.activity.moment.TopicDetailContent.<anonymous>.<anonymous> (TopicDetailContentComp.kt:73)");
            }
            NestedScrollConnection nestedScrollConnectionRememberNestedScrollInteropConnection = NestedScrollInteropConnectionKt.rememberNestedScrollInteropConnection(null, composer2, 0, 1);
            String strValueOf = String.valueOf(iIntValue);
            composer2.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(TopicPopularMomentVM.class, current, strValueOf, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            TopicPopularMomentVM topicPopularMomentVM = (TopicPopularMomentVM) viewModel;
            Unit unit = Unit.INSTANCE;
            Integer numValueOf = Integer.valueOf(iIntValue);
            int i2 = i & 112;
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged = composer2.changed(numValueOf) | composer2.changed(topicPopularMomentVM);
            Long l = this.f49441OooO0Oo;
            boolean zChanged2 = zChanged | composer2.changed(l);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new oO00Oo00(topicPopularMomentVM, iIntValue, l, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            RefreshState refreshStateOooO0OO = OooO0O0.OooO0OO(composer2);
            if (!topicPopularMomentVM.isRefreshIng().getValue().booleanValue()) {
                refreshStateOooO0OO.OooO0Oo(false);
            }
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o000OO(lazyListStateRememberLazyListState), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            TopicDetailVM topicDetailVM = this.f49442OooO0o;
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged3 = composer2.changed(numValueOf2) | composer2.changed(topicPopularMomentVM) | composer2.changed(l);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new oO00Oo0(topicPopularMomentVM, iIntValue, l);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            oO00OOo0.OooO0O0(topicPopularMomentVM, iIntValue, topicDetailVM, (Function0) objRememberedValue3, composer2, i2 | ConstantsKt.MINIMUM_BLOCK_SIZE);
            ((o000OO) mutableState.getValue()).OooO0O0(topicPopularMomentVM.getListData().size(), null, composer2, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            composer2.startReplaceableGroup(1618982084);
            boolean zChanged4 = composer2.changed(numValueOf3) | composer2.changed(topicPopularMomentVM) | composer2.changed(l);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new oOOoOOO0(topicPopularMomentVM, iIntValue, l);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            int i3 = i;
            OooO0o.OooO0O0(refreshStateOooO0OO, (Function0) objRememberedValue4, null, null, false, ComposableLambdaKt.composableLambda(composer2, -1424901549, true, new oOo00ooO(iIntValue, i3, this.f49443OooO0o0, lazyListStateRememberLazyListState, this.f49445OooO0oo, mutableState, nestedScrollConnectionRememberNestedScrollInteropConnection, this.f49444OooO0oO, this.f49442OooO0o, topicPopularMomentVM, this.f49441OooO0Oo)), composer2, 196616, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
