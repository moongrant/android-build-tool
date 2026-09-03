package p578o0oOoOoo;

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
import p455o0Ooo0O0.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.module.media.dialog.CompressVideoChangeMusicVoiceKt$CompressVideoChangeMusicVoiceDialog$3$1", f = "CompressVideoChangeMusicVoice.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class oOO0OOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f56456OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO0OOO(oo0o0Oo oo0o0oo, Continuation<? super oOO0OOO> continuation) {
        super(2, continuation);
        this.f56456OooO0Oo = oo0o0oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOO0OOO(this.f56456OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOO0OOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        oo0o0Oo oo0o0oo = this.f56456OooO0Oo;
        oo0o0oo.OooO0oo().f46616OooO00o.setValue(Boxing.boxFloat(oo0o0oo.OooO0oO()));
        oo0o0oo.OooO0oo().f46617OooO0O0.setValue(Boxing.boxFloat(oo0o0oo.OooO0O0()));
        return Unit.INSTANCE;
    }
}
