package p457o0Ooo0O;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p550o0oOOO0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.dialog.CompressVideoChangeMusicVoiceKt$CompressVideoChangeMusicVoiceDialog$3$1", f = "CompressVideoChangeMusicVoice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00O00OO f47713OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO(o00O00OO o00o00oo2, Continuation<? super o000OO> continuation) {
        super(2, continuation);
        this.f47713OooO0Oo = o00o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000OO(this.f47713OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        o00O00OO o00o00oo2 = this.f47713OooO0Oo;
        o00o00oo2.OooO0oo().f55987OooO00o.setValue(Boxing.boxFloat(o00o00oo2.OooO0oO()));
        o00o00oo2.OooO0oo().f55988OooO0O0.setValue(Boxing.boxFloat(o00o00oo2.OooO0O0()));
        return Unit.INSTANCE;
    }
}
