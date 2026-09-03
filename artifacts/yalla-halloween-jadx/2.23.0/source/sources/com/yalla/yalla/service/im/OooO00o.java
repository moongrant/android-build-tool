package com.yalla.yalla.service.im;

import android.util.Base64;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import com.app.base.protobuf.MessageIM;
import com.google.protobuf.InvalidProtocolBufferException;
import com.yalla.yalla.data.db.table.ChatMessage;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o0o0000.OooO0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p403o0Oo0OOo.oo0o0O0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.IMMessageService$onCreate$1$1", f = "IMMessageService.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24946OooO0Oo;

    public OooO00o(Continuation<? super OooO00o> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO00o(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws InvalidProtocolBufferException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24946OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f24946OooO0Oo = 1;
            OooO0O0 oooO0O0 = new OooO0O0();
            oo0o0O0 oo0o0o0OooOOOo = o000OOo.OooO00o().OooOOOo();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Iterator it = oo0o0o0OooOOOo.OooOOOo(((Number) OooO0OO.OooO0O0()).longValue()).iterator();
            while (it.hasNext()) {
                MessageIM.Message message = MessageIM.Message.parseFrom(Base64.decode(((ChatMessage) it.next()).getUnknownMessage(), 0));
                Intrinsics.checkNotNullExpressionValue(message, "message");
                oooO0O0.OooO0Oo(message, false);
            }
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
