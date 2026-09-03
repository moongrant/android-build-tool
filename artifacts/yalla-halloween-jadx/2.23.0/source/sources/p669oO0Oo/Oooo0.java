package p669oO0Oo;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.yalla.yalla.service.room.OooO00o;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.dialog.room.ComposableSingletons$LiveRoomApplyMicListDialogKt$lambda-2$1$2$2$2$2$1", f = "LiveRoomApplyMicListDialog.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ LazyListState f60406OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f60407OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(LazyListState lazyListState, MutableState<Boolean> mutableState, Continuation<? super Oooo0> continuation) {
        super(2, continuation);
        this.f60406OooO0Oo = lazyListState;
        this.f60407OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Oooo0(this.f60406OooO0Oo, this.f60407OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((Oooo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        LazyListState lazyListState = this.f60406OooO0Oo;
        if (lazyListState.isScrollInProgress()) {
            return Unit.INSTANCE;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return Unit.INSTANCE;
        }
        if (lazyListItemInfo.getIndex() == OooO00o.f24979OooO0oO.f47386OooOOo.size() - 1) {
            this.f60407OooO0o0.setValue(Boolean.FALSE);
        }
        return Unit.INSTANCE;
    }
}
