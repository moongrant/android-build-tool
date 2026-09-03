package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.EventRepo$getMineEventList$$inlined$call$1;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.module.event.ui.screen.EventPage;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00Oo000.OooO;
import p143o00Oo000.OooO0O0;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventMineViewModel;", "Lcom/yalla/yalla/module/event/vm/EventViewModel;", "Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/model/event/EventModel;", "mineEventPager", "Lo00Oo000/OooO0O0;", "getMineEventPager", "()Lo00Oo000/OooO0O0;", "Lcom/yalla/yalla/module/event/ui/screen/EventPage;", "eventPage", "<init>", "(Lcom/yalla/yalla/module/event/ui/screen/EventPage;)V", "Event_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class EventMineViewModel extends EventViewModel {
    public static final int $stable = 8;

    @NotNull
    private final OooO0O0<EventModel> mineEventPager;

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventMineViewModel$mineEventPager$1", f = "EventMineViewModel.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super OooO<EventModel>>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f24089OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ EventPage f24090OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ int f24091OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ EventMineViewModel f24092OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(EventPage eventPage, EventMineViewModel eventMineViewModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f24090OooO0o = eventPage;
            this.f24092OooO0oO = eventMineViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f24090OooO0o, this.f24092OooO0oO, continuation);
            oooO00o.f24091OooO0o0 = ((Number) obj).intValue();
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super OooO<EventModel>> continuation) {
            return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24089OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f24091OooO0o0;
                int i3 = this.f24090OooO0o == EventPage.MineSubscribe ? 1 : 2;
                this.f24089OooO0Oo = 1;
                String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetMyList");
                o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i3), "type");
                o0o0oooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
                obj = OooOOO.OooO0Oo(new EventRepo$getMineEventList$$inlined$call$1(o0o0oooOooO00o, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            this.f24092OooO0oO.updateTimeDivision((List) apiResult.getData());
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    public EventMineViewModel(@NotNull EventPage eventPage) {
        Intrinsics.checkNotNullParameter(eventPage, "eventPage");
        this.mineEventPager = new OooO0O0<>(ViewModelKt.getViewModelScope(this), new OooO00o(eventPage, this, null));
    }

    @NotNull
    public final OooO0O0<EventModel> getMineEventPager() {
        return this.mineEventPager;
    }
}
