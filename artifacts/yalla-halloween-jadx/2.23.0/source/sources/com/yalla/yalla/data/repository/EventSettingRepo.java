package com.yalla.yalla.data.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.event.EventSettingModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nEventSettingRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventSettingRepo.kt\ncom/yalla/yalla/data/repository/EventSettingRepo\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,30:1\n62#2:31\n62#2:32\n*S KotlinDebug\n*F\n+ 1 EventSettingRepo.kt\ncom/yalla/yalla/data/repository/EventSettingRepo\n*L\n13#1:31\n23#1:32\n*E\n"})
public final class EventSettingRepo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final EventSettingRepo f22961OooO00o = new EventSettingRepo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventSettingRepo", f = "EventSettingRepo.kt", i = {}, l = {31}, m = "getEventSettingState", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22962OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22963OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22962OooO0Oo = obj;
            this.f22963OooO0o |= Integer.MIN_VALUE;
            return EventSettingRepo.this.OooO00o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.EventSettingRepo", f = "EventSettingRepo.kt", i = {}, l = {31}, m = "setEventSettingState", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22965OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22966OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22965OooO0Oo = obj;
            this.f22966OooO0o |= Integer.MIN_VALUE;
            return EventSettingRepo.this.OooO0O0(0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ApiResult<EventSettingModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f22963OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f22963OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objOooO0Oo = oooO00o.f22962OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f22963OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = o000OOo0.OooO0O0("Webservers/Event/GetConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            EventSettingRepo$getEventSettingState$$inlined$call$1 eventSettingRepo$getEventSettingState$$inlined$call$1 = new EventSettingRepo$getEventSettingState$$inlined$call$1(new o0O0ooO(url, 0), null);
            oooO00o.f22963OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(eventSettingRepo$getEventSettingState$$inlined$call$1, oooO00o);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (apiResult.isSuccess()) {
            EventSettingModel eventSettingModel = (EventSettingModel) apiResult.getData();
            boolean z = (eventSettingModel != null ? eventSettingModel.isAddToCalendar() : 0) == 1;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOo00().postValue(Boxing.boxBoolean(z));
        }
        return objOooO0Oo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0O0(int i, @NotNull Continuation<? super ApiResult<EventSettingModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f22966OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f22966OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objOooO0Oo = oooO0O0.f22965OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f22966OooO0o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            String url = o000OOo0.OooO0O0("/Webservers/Event/SetConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            o0O0ooO o0o0ooo = new o0O0ooO(url, 1);
            o0o0ooo.OooO0O0(Boxing.boxInt(i), "isAddToCalendar");
            EventSettingRepo$setEventSettingState$$inlined$call$1 eventSettingRepo$setEventSettingState$$inlined$call$1 = new EventSettingRepo$setEventSettingState$$inlined$call$1(o0o0ooo, null);
            oooO0O0.f22966OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(eventSettingRepo$setEventSettingState$$inlined$call$1, oooO0O0);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        if (apiResult.isSuccess()) {
            EventSettingModel eventSettingModel = (EventSettingModel) apiResult.getData();
            boolean z = (eventSettingModel != null ? eventSettingModel.isAddToCalendar() : 0) == 1;
            o000000O o000000o2 = o000000O.f46674OooO00o;
            o000000O.OooOo00().postValue(Boxing.boxBoolean(z));
            LiveEventBus.get("UPDATE_AUTO_ADD_TO_CALENDAR_STATE").post(Boxing.boxBoolean(z));
        }
        return objOooO0Oo;
    }
}
