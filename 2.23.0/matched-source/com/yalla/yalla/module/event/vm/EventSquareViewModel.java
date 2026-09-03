package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.EventRepo$getSquareEventList$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o0OO00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;
import p587o0oOooo.o0OO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventSquareViewModel;", "Lo0Oo00oO/o0O0O00;", "", "sortEvent", "", "<set-?>", "isSortByTime$delegate", "Landroidx/compose/runtime/MutableState;", "isSortByTime", "()Z", "setSortByTime", "(Z)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "refreshEvent", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getRefreshEvent", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/event/EventModel;", "squareEventPager", "Lo00Oo000/OooO0O0;", "getSquareEventPager", "()Lo00Oo000/OooO0O0;", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nEventSquareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquareViewModel.kt\ncom/yalla/yalla/module/event/vm/EventSquareViewModel\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,42:1\n81#2:43\n107#2,2:44\n*S KotlinDebug\n*F\n+ 1 EventSquareViewModel.kt\ncom/yalla/yalla/module/event/vm/EventSquareViewModel\n*L\n17#1:43\n17#1:44,2\n*E\n"})
public final class EventSquareViewModel extends o0O0O00 {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: isSortByTime$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isSortByTime = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @NotNull
    private final MutableSharedFlow<Boolean> refreshEvent = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @NotNull
    private final p143o00Oo000.OooO0O0<EventModel> squareEventPager = new p143o00Oo000.OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO0O0(null));

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventSquareViewModel$sortEvent$1", f = "EventSquareViewModel.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24100OooO0Oo;

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
            int i = this.f24100OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> refreshEvent = EventSquareViewModel.this.getRefreshEvent();
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.f24100OooO0Oo = 1;
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

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventSquareViewModel$squareEventPager$1", f = "EventSquareViewModel.kt", i = {0}, l = {21}, m = "invokeSuspend", n = {"it"}, s = {"I$0"})
    @SourceDebugExtension({"SMAP\nEventSquareViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSquareViewModel.kt\ncom/yalla/yalla/module/event/vm/EventSquareViewModel$squareEventPager$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n1855#2,2:43\n*S KotlinDebug\n*F\n+ 1 EventSquareViewModel.kt\ncom/yalla/yalla/module/event/vm/EventSquareViewModel$squareEventPager$1\n*L\n24#1:43,2\n*E\n"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<EventModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24102OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f24104OooO0o0;

        public static final class OooO00o extends Lambda implements Function1<EventModel, Boolean> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public static final OooO00o f24105OooO0Oo = new OooO00o();

            public OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(EventModel eventModel) {
                EventModel event = eventModel;
                Intrinsics.checkNotNullParameter(event, "event");
                long id = event.getId();
                o0OO00o0 o0oo00o0OooOo0O = o000OOo.OooO00o().OooOo0O();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                return Boolean.valueOf(o0oo00o0OooOo0O.OooO0O0(3, ((Number) OooO0OO.OooO0O0()).longValue(), String.valueOf(id)) != null);
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = EventSquareViewModel.this.new OooO0O0(continuation);
            oooO0O0.f24104OooO0o0 = ((Number) obj).intValue();
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<EventModel>> continuation) {
            return ((OooO0O0) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            int i;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f24102OooO0Oo;
            EventSquareViewModel eventSquareViewModel = EventSquareViewModel.this;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                int i3 = this.f24104OooO0o0;
                int i4 = eventSquareViewModel.isSortByTime() ? 1 : 2;
                this.f24104OooO0o0 = i3;
                this.f24102OooO0Oo = 1;
                String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetList");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i4), "ordertype");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i3), "pageindex");
                Object objOooO0Oo = OooOOO.OooO0Oo(new EventRepo$getSquareEventList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = i3;
                obj = objOooO0Oo;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f24104OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (!eventSquareViewModel.isSortByTime() && i == 1) {
                ArrayList arrayList = new ArrayList();
                List list = (List) apiResult.getData();
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Boxing.boxLong(((EventModel) it.next()).getId()));
                    }
                }
                o0OO000.OooO0O0("301001", MapsKt.mapOf(new Pair("roomeventlist", arrayList.toString())));
            }
            List list2 = (List) apiResult.getData();
            if (list2 != null) {
                Boxing.boxBoolean(CollectionsKt.removeAll(list2, (Function1) OooO00o.f24105OooO0Oo));
            }
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @NotNull
    public final MutableSharedFlow<Boolean> getRefreshEvent() {
        return this.refreshEvent;
    }

    @NotNull
    public final p143o00Oo000.OooO0O0<EventModel> getSquareEventPager() {
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
