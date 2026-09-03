package com.yalla.yalla.module.event.ui.view;

import androidx.compose.runtime.MutableState;
import com.yalla.yalla.data.repository.EventSettingRepo;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.event.ui.view.EventKt$showAddToCalendarDialog$2$1$4$1", f = "Event.kt", i = {}, l = {600, 604}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24060OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f24061OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MutableState<Boolean> mutableState, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f24061OooO0o0 = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0O(this.f24061OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0077 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24060OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            boolean zAreEqual = Intrinsics.areEqual(o000000O.OooOo00().getValue(), Boxing.boxBoolean(false));
            EventSettingRepo eventSettingRepo = EventSettingRepo.f22961OooO00o;
            MutableState<Boolean> mutableState = this.f24061OooO0o0;
            if (zAreEqual) {
                Boolean autoAddCalendar = mutableState.getValue();
                Intrinsics.checkNotNullExpressionValue(autoAddCalendar, "autoAddCalendar");
                if (autoAddCalendar.booleanValue()) {
                    this.f24060OooO0Oo = 1;
                    if (eventSettingRepo.OooO0O0(1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(o000000O.OooOo00().getValue(), Boxing.boxBoolean(true)) && !mutableState.getValue().booleanValue()) {
                    this.f24060OooO0Oo = 2;
                    if (eventSettingRepo.OooO0O0(0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (Intrinsics.areEqual(o000000O.OooOo00().getValue(), Boxing.boxBoolean(true))) {
                this.f24060OooO0Oo = 2;
                if (eventSettingRepo.OooO0O0(0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
