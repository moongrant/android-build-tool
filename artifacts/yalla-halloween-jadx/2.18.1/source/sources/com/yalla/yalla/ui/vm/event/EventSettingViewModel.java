package com.yalla.yalla.ui.vm.event;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.EventSettingModel;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/ui/vm/event/EventSettingViewModel;", "Lo00OO/OooO00o;", "", "setEventSettingState", "Lo000oOoO/o0O00OO;", "", "hasPermissions", "Lo000oOoO/o0O00OO;", "getHasPermissions", "()Lo000oOoO/o0O00OO;", "settingState", "getSettingState", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class EventSettingViewModel extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final o0O00OO<Boolean> hasPermissions;

    @NotNull
    private final o0O00OO<Boolean> settingState;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.event.EventSettingViewModel$setEventSettingState$1", f = "EventSettingViewModel.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25438Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EventSettingViewModel.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25438Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = !Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOoo0().getValue(), Boxing.boxBoolean(true)) ? 1 : 0;
                o0OoOo0 o0oooo1 = o0OoOo0.f42829OooO00o;
                this.f25438Oooo0o = 1;
                obj = o0oooo1.OooO0O0(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            o0O00OO<Boolean> settingState = EventSettingViewModel.this.getSettingState();
            EventSettingModel eventSettingModel = (EventSettingModel) ((ApiResult) obj).getData();
            settingState.setValue(Boxing.boxBoolean((eventSettingModel != null ? eventSettingModel.isAddToCalendar() : 0) == 1));
            return Unit.INSTANCE;
        }
    }

    public EventSettingViewModel() {
        Boolean bool = Boolean.FALSE;
        this.hasPermissions = o0OOO00.OooO0Oo(bool);
        Boolean value = OooOOO.f41216OooO00o.OooOoo0().getValue();
        this.settingState = o0OOO00.OooO0Oo(value != null ? value : bool);
    }

    @NotNull
    public final o0O00OO<Boolean> getHasPermissions() {
        return this.hasPermissions;
    }

    @NotNull
    public final o0O00OO<Boolean> getSettingState() {
        return this.settingState;
    }

    public final void setEventSettingState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }
}
