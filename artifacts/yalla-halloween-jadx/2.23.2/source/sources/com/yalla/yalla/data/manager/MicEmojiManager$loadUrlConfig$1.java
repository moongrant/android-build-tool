package com.yalla.yalla.data.manager;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p411o0Oo0o00.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.manager.MicEmojiManager$loadUrlConfig$1", f = "MicEmojiManager.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMicEmojiManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MicEmojiManager.kt\ncom/yalla/yalla/data/manager/MicEmojiManager$loadUrlConfig$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,40:1\n62#2:41\n*S KotlinDebug\n*F\n+ 1 MicEmojiManager.kt\ncom/yalla/yalla/data/manager/MicEmojiManager$loadUrlConfig$1\n*L\n31#1:41\n*E\n"})
public final class MicEmojiManager$loadUrlConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22359OooO0Oo;

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
        int i = this.f22359OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = oo000o.OooO0OO("/Webservers/Bar/EmojiConfig");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(Boxing.boxInt(1), "type");
            MicEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1 micEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1 = new MicEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1(o0ooooo, null);
            this.f22359OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(micEmojiManager$loadUrlConfig$1$invokeSuspend$$inlined$call$1, this);
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
            OooOO0O.f45930OooO00o.postValue(apiResult.getData());
        }
        return Unit.INSTANCE;
    }
}
