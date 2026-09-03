package com.yalla.yalla.ui.fragment.room;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.code.android.uikit.swiprefresh.RefreshState;
import com.yalla.yalla.ui.vm.moment.RoomInfoMomentListVM;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ConstantsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import p521o0o0O0o0.o000OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nRoomInfoMomentFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment$initView$1$1\n+ 2 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,194:1\n81#2,11:195\n36#3:206\n25#3:213\n36#3:220\n1097#4,6:207\n1097#4,6:214\n1097#4,6:221\n81#5:227\n*S KotlinDebug\n*F\n+ 1 RoomInfoMomentFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomInfoMomentFragment$initView$1$1\n*L\n76#1:195,11\n77#1:206\n89#1:213\n97#1:220\n77#1:207,6\n89#1:214,6\n97#1:221,6\n89#1:227\n*E\n"})
public final class Oooo000 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ RoomInfoMomentFragment f28448OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(RoomInfoMomentFragment roomInfoMomentFragment) {
        super(2);
        this.f28448OooO0Oo = roomInfoMomentFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Composer composer, Integer num) {
        Composer composer2 = composer;
        int iIntValue = num.intValue();
        if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(493337289, iIntValue, -1, "com.yalla.yalla.ui.fragment.room.RoomInfoMomentFragment.initView.<anonymous>.<anonymous> (RoomInfoMomentFragment.kt:75)");
            }
            composer2.startReplaceableGroup(1729797275);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel(RoomInfoMomentListVM.class, current, null, null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 36936, 0);
            composer2.endReplaceableGroup();
            RoomInfoMomentListVM roomInfoMomentListVM = (RoomInfoMomentListVM) viewModel;
            Unit unit = Unit.INSTANCE;
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(roomInfoMomentListVM);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new OooO0o(roomInfoMomentListVM, null);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer2, 70);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composer2, 0, 3);
            RefreshState refreshStateOooO0OO = com.code.android.uikit.swiprefresh.OooO0O0.OooO0OO(composer2);
            if (!roomInfoMomentListVM.isRefreshIng().getValue().booleanValue()) {
                refreshStateOooO0OO.OooO0Oo(false);
            }
            RoomInfoMomentFragment roomInfoMomentFragment = this.f28448OooO0Oo;
            roomInfoMomentFragment.InitObservers(roomInfoMomentListVM, composer2, 64);
            composer2.startReplaceableGroup(-492369756);
            Object objRememberedValue2 = composer2.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new o000OO(lazyListStateRememberLazyListState), null, 2, null);
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceableGroup();
            MutableState mutableState = (MutableState) objRememberedValue2;
            ((o000OO) mutableState.getValue()).OooO0O0(roomInfoMomentListVM.getListData().size(), null, composer2, ConstantsKt.MINIMUM_BLOCK_SIZE, 2);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged2 = composer2.changed(roomInfoMomentListVM);
            Object objRememberedValue3 = composer2.rememberedValue();
            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new OooO(roomInfoMomentListVM);
                composer2.updateRememberedValue(objRememberedValue3);
            }
            composer2.endReplaceableGroup();
            com.code.android.uikit.swiprefresh.OooO0o.OooO0O0(refreshStateOooO0OO, (Function0) objRememberedValue3, null, null, false, ComposableLambdaKt.composableLambda(composer2, 1624496476, true, new OooOo(lazyListStateRememberLazyListState, mutableState, roomInfoMomentFragment, roomInfoMomentListVM)), composer2, 196616, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
