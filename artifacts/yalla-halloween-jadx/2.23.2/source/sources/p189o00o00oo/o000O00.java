package p189o00o00oo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p191o00o0O0.o00Oo0;
import p191o00o0O0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.code.android.startup.TaskDispatcher$sendTaskReal$2", f = "TaskDispatcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f38515OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O00O f38516OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O00(o00Oo0 o00oo1, o000O00O o000o00o2, Continuation<? super o000O00> continuation) {
        super(2, continuation);
        this.f38515OooO0Oo = o00oo1;
        this.f38516OooO0o0 = o000o00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O00(this.f38515OooO0Oo, this.f38516OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        new o0OoOo0(this.f38515OooO0Oo, this.f38516OooO0o0).run();
        return Unit.INSTANCE;
    }
}
