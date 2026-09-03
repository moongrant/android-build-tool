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
import p388o0OOooO.o00000O0;
import p498o0o00Oo0.o00O00;
import p498o0o00Oo0.o00O00O;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/common/model/Response;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.repository.ApiBaseRepository$call$2", f = "ApiBaseRepository.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class ApiBaseRepository$call$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Object>>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ Function1<o00OO0O0.OooO0O0, Unit> f20663Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Function1 f20664Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00O00O f20665Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f20666Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ o00O00O f20667OoooO00;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation<Response<Object>> f20668OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ o00O00O f20669OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.common.repository.ApiBaseRepository$call$2$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0205OooO00o extends o00000O0<Response<Object>> {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public OooO00o(CancellableContinuation<? super Response<Object>> cancellableContinuation, o00O00O o00o00o2) {
            this.f20668OooO00o = cancellableContinuation;
            this.f20669OooO0O0 = o00o00o2;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            if (!Intrinsics.areEqual(str, "1011")) {
                super.onError(str, str2);
            }
            CancellableContinuation<Response<Object>> cancellableContinuation = this.f20668OooO00o;
            Result.Companion companion = Result.INSTANCE;
            o00O00.OooO00o(this.f20669OooO0O0, str, str2, cancellableContinuation);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            if (str == null || StringsKt.isBlank(str)) {
                CancellableContinuation<Response<Object>> cancellableContinuation = this.f20668OooO00o;
                Result.Companion companion = Result.INSTANCE;
                o00O00.OooO00o(this.f20669OooO0O0, "-1", "", cancellableContinuation);
                return;
            }
            CancellableContinuation<Response<Object>> cancellableContinuation2 = this.f20668OooO00o;
            o00O00O o00o00o2 = this.f20669OooO0O0;
            Type type = new C0205OooO00o().getType();
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            Response responseOooO0Oo = o00o00o2.OooO0Oo((Response) OooO0o.OooO00o(type, "type", str, type));
            Result.Companion companion2 = Result.INSTANCE;
            cancellableContinuation2.resumeWith(Result.m502constructorimpl(responseOooO0Oo));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiBaseRepository$call$2(Function1<? super o00OO0O0.OooO0O0, Unit> function1, o00O00O o00o00o2, Continuation<? super ApiBaseRepository$call$2> continuation) {
        super(2, continuation);
        this.f20663Oooo = function1;
        this.f20667OoooO00 = o00o00o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new ApiBaseRepository$call$2(this.f20663Oooo, this.f20667OoooO00, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Object>> continuation) {
        return ((ApiBaseRepository$call$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f20666Oooo0oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<o00OO0O0.OooO0O0, Unit> function1 = this.f20663Oooo;
            o00O00O o00o00o2 = this.f20667OoooO00;
            this.f20664Oooo0o = function1;
            this.f20665Oooo0oO = o00o00o2;
            this.f20666Oooo0oo = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
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
