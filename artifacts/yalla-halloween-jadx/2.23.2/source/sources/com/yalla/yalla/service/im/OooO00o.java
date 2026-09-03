package com.yalla.yalla.service.im;

import android.util.Base64;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0Oo.Oooo000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p481o0o000O0.OooOO0O;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.IMMessageService$onCreate$1$1", f = "IMMessageService.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
public final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f24484OooO0Oo;

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
        int i = this.f24484OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f24484OooO0Oo = 1;
            OooOO0O oooOO0O = new OooOO0O();
            Oooo000 oooo000OooOOo0 = o00Oo0.OooO00o().OooOOo0();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Iterator it = oooo000OooOOo0.OooOOOo(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()).iterator();
            while (it.hasNext()) {
                MessageIM.Message from = MessageIM.Message.parseFrom(Base64.decode(((ChatMessage) it.next()).getUnknownMessage(), 0));
                Intrinsics.checkNotNull(from);
                oooOO0O.OooO0Oo(from, false);
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
