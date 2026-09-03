package com.yalla.yalla.ui.vm.event;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p520o0o0O0O0.Oooo0;
import p606o0oo0O.OooOo;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR+\u0010\r\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventSquareViewModel;", "Lo00OO/OooO00o;", "", "sortEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "refreshEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getRefreshEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "<set-?>", "isSortByTime$delegate", "Lo000oOoO/o0O00OO;", "isSortByTime", "()Z", "setSortByTime", "(Z)V", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/EventModel;", "squareEventPager", "Lo0ooO00/o000O0;", "getSquareEventPager", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventSquareViewModel extends o00OO.OooO00o {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isSortByTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isSortByTime = o0OOO00.OooO0Oo(Boolean.FALSE);

    @NotNull
    private final MutableSharedFlow<Boolean> refreshEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @NotNull
    private final o000O0<EventModel> squareEventPager = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventSquareViewModel$sortEvent$1", f = "EventSquareViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25440Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventSquareViewModel.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25440Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> refreshEvent = EventSquareViewModel.this.getRefreshEvent();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f25440Oooo0o = 1;
                if (refreshEvent.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventSquareViewModel$squareEventPager$1", f = "EventSquareViewModel.kt", i = {0}, l = {20}, m = "invokeSuspend", n = {"it"}, s = {"I$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<EventModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25442Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f25443Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = EventSquareViewModel.this.new OooO0O0(continuation);
            oooO0O0.f25443Oooo0oO = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<EventModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f25442Oooo0o;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                int i3 = this.f25443Oooo0oO;
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                int i4 = EventSquareViewModel.this.isSortByTime() ? 1 : 2;
                this.f25443Oooo0oO = i3;
                this.f25442Oooo0o = 1;
                Object objOooO = oooo0.OooO(i4, i3, this);
                if (objOooO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
                obj = objOooO;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f25443Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (!EventSquareViewModel.this.isSortByTime() && i == 1) {
                ArrayList arrayList = new ArrayList();
                List list = (List) apiResult.getData();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxLong(((EventModel) it.next()).getId()));
                    }
                }
                OooOo.OooO0OO("301001", MapsKt.mapOf(new Pair("roomeventlist", arrayList.toString())));
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @NotNull
    public final MutableSharedFlow<Boolean> getRefreshEvent() {
        return this.refreshEvent;
    }

    @NotNull
    public final o000O0<EventModel> getSquareEventPager() {
        return this.squareEventPager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isSortByTime() {
        return ((Boolean) this.isSortByTime.getValue()).booleanValue();
    }

    public final void setSortByTime(boolean z) {
        this.isSortByTime.setValue(Boolean.valueOf(z));
    }

    public final void sortEvent() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
        setSortByTime(!isSortByTime());
    }
}
