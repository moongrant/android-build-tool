package com.yalla.yalla.module.event.vm;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.data.repository.EventSettingRepo;
import com.yalla.yalla.model.event.EventSettingModel;
import com.yalla.yalla.model.http.ApiResult;
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
import p394o0Oo0.OooOO0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/yalla/yalla/module/event/vm/EventSettingViewModel;", "Lo0Oo0/OooOO0;", "", "setEventSettingState", "Landroidx/compose/runtime/MutableState;", "", "hasPermissions", "Landroidx/compose/runtime/MutableState;", "getHasPermissions", "()Landroidx/compose/runtime/MutableState;", "settingState", "getSettingState", "<init>", "()V", "Event_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class EventSettingViewModel extends OooOO0 {
    public static final int $stable = 0;

    @NotNull
    private final MutableState<Boolean> hasPermissions;

    @NotNull
    private final MutableState<Boolean> settingState;

    @DebugMetadata(c = "com.yalla.yalla.module.event.vm.EventSettingViewModel$setEventSettingState$1", f = "EventSettingViewModel.kt", i = {}, l = {17}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f23631OooO0Oo;

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
            int i = this.f23631OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                int i2 = !Intrinsics.areEqual(o0O00oO0.OooOo00().getValue(), Boxing.boxBoolean(true)) ? 1 : 0;
                EventSettingRepo eventSettingRepo = EventSettingRepo.f22490OooO00o;
                this.f23631OooO0Oo = 1;
                obj = eventSettingRepo.OooO0O0(i2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MutableState<Boolean> settingState = EventSettingViewModel.this.getSettingState();
            EventSettingModel eventSettingModel = (EventSettingModel) ((ApiResult) obj).getData();
            settingState.setValue(Boxing.boxBoolean((eventSettingModel != null ? eventSettingModel.isAddToCalendar() : 0) == 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventSettingViewModel() {
        Boolean bool = Boolean.FALSE;
        this.hasPermissions = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Boolean bool2 = (Boolean) o0O00oO0.OooOo00().getValue();
        this.settingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool2 != null ? bool2 : bool, null, 2, null);
    }

    @NotNull
    public final MutableState<Boolean> getHasPermissions() {
        return this.hasPermissions;
    }

    @NotNull
    public final MutableState<Boolean> getSettingState() {
        return this.settingState;
    }

    public final void setEventSettingState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }
}
