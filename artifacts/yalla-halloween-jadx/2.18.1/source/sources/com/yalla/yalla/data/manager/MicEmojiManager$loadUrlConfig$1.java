package com.yalla.yalla.data.manager;

import com.app.base.app.appConfig.apiDataModela.OooO00o;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.GifListJson;
import java.util.List;
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
import p254o00ooO0O.o0000O0;
import p486o0o000o0.oo0o0Oo;
import p518o0o0O00o.o000O000;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.manager.MicEmojiManager$loadUrlConfig$1", f = "MicEmojiManager.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
public final class MicEmojiManager$loadUrlConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f21399Oooo0o;

    public MicEmojiManager$loadUrlConfig$1(Continuation<? super MicEmojiManager$loadUrlConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MicEmojiManager$loadUrlConfig$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new MicEmojiManager$loadUrlConfig$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f21399Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            oo0o0Oo oo0o0oo = oo0o0Oo.f40929OooO00o;
            String str = oo0o0Oo.f40930OooO0O0;
            o00O000o o00o000oOooO0O0 = OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("type", Boxing.boxInt(1));
            MicEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1 micEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1 = new MicEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
            this.f21399Oooo0o = 1;
            obj = o0000O0.OooO0OO(micEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1, this);
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
        if (apiResult.isSuccess()) {
            o000O000 o000o001 = o000O000.f42185OooO00o;
            o000O000.f42186OooO0O0.postValue((List<GifListJson>) apiResult.getData());
        }
        return Unit.INSTANCE;
    }
}
