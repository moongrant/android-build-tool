package p476o0o0000o;

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
public final class o000O0 extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ boolean f47575OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ boolean f47576OooO0o0;

    public o000O0(Continuation<? super o000O0> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        o000O0 o000o0 = new o000O0(continuation);
        o000o0.f47575OooO0Oo = zBooleanValue;
        o000o0.f47576OooO0o0 = zBooleanValue2;
        return o000o0.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.f47575OooO0Oo || this.f47576OooO0o0);
    }
}
