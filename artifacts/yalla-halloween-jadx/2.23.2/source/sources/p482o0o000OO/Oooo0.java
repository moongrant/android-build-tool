package p482o0o000OO;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.room.RoomLiveService$observeMuteAllSound$1", f = "RoomLiveService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Oooo0 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ boolean f48428OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ boolean f48429OooO0o0;

    public Oooo0(Continuation<? super Oooo0> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        Oooo0 oooo0 = new Oooo0(continuation);
        oooo0.f48428OooO0Oo = zBooleanValue;
        oooo0.f48429OooO0o0 = zBooleanValue2;
        return oooo0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.f48428OooO0Oo || this.f48429OooO0o0);
    }
}
