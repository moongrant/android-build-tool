package com.yalla.yalla.common.repository;

import OooO0o.OooO0o;
import com.yalla.yalla.common.model.Response;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000Oo0;
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0010\b\u0001\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0001*\u00020\u0003H\u008a@"}, d2 = {"T", "Lcom/yalla/yalla/common/model/Response;", "R", "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.ApiBaseRepository$complexCall$2", f = "ApiBaseRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class ApiBaseRepository$complexCall$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Response<Object>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<o00OO0O0.OooO0O0, Unit> f20670Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Function1 f20671Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00O00O f20672Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f20673Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20674OoooO00;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Response<Object>> f20675OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20676OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.ApiBaseRepository$complexCall$2$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0206OooO00o extends o00000O0<Response<Object>> {
        }

        public static final class OooO0O0 extends o00000O0<Response<Object>> {
        }

        public static final class OooO0OO extends o00000O0<Response<Object>> {
        }

        public OooO00o(CancellableContinuation<Response<Object>> cancellableContinuation, o00O00O o00o00o2) {
            this.f20675OooO00o = cancellableContinuation;
            this.f20676OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            CancellableContinuation<Response<Object>> cancellableContinuation = this.f20675OooO00o;
            o00O00O o00o00o2 = this.f20676OooO0O0;
            Intrinsics.needClassReification();
            Type type = new C0206OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response response = (Response) OooO0o.OooO00o(type, "type", "{}", type);
            o00o00o2.OooO00o(response, str != null ? Integer.valueOf(o000Oo0.OooO0OO(str, 0)) : null, str2);
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m502constructorimpl(response));
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation<Response<Object>> cancellableContinuation = this.f20675OooO00o;
                o00O00O o00o00o2 = this.f20676OooO0O0;
                Intrinsics.needClassReification();
                Type type = new OooO0O0().getType();
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                Response response = (Response) OooO0o.OooO00o(type, "type", "{}", type);
                o00o00o2.OooO00o(response, -1, "");
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m502constructorimpl(response));
                return;
            }
            CancellableContinuation<Response<Object>> cancellableContinuation2 = this.f20675OooO00o;
            o00O00O o00o00o3 = this.f20676OooO0O0;
            Intrinsics.needClassReification();
            Type type2 = new OooO0OO().getType();
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            Response response2 = (Response) OooO0o.OooO00o(type2, "type", str, type2);
            o00o00o3.OooO0O0(response2);
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(response2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiBaseRepository$complexCall$2(Function1<? super o00OO0O0.OooO0O0, Unit> function1, o00O00O o00o00o2, Continuation<? super ApiBaseRepository$complexCall$2> continuation) {
        super(2, continuation);
        this.f20670Oooo = function1;
        this.f20674OoooO00 = o00o00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiBaseRepository$complexCall$2(this.f20670Oooo, this.f20674OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<Response<Object>> continuation) {
        return ((ApiBaseRepository$complexCall$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20673Oooo0oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<o00OO0O0.OooO0O0, Unit> function1 = this.f20670Oooo;
            o00O00O o00o00o2 = this.f20674OoooO00;
            this.f20671Oooo0o = function1;
            this.f20672Oooo0oO = o00o00o2;
            this.f20673Oooo0oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Intrinsics.needClassReification();
            function1.invoke(new OooO00o(cancellableContinuationImpl, o00o00o2));
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
