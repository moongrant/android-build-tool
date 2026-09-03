package com.yalla.yalla.repository;

import androidx.compose.runtime.o000oOoO;
import com.code.android.json.OooO00o;
import com.google.gson.reflect.TypeToken;
import com.yalla.yalla.http.iteratehttp.OooO0OO;
import com.yalla.yalla.model.http.Response;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00;
import p406o0Oo0Ooo.oOO00O0;
import p464o0Oooo.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/Response;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.yalla.yalla.repository.ApiBaseRepository$call$2", f = "ApiBaseRepository.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,72:1\n314#2,11:73\n*S KotlinDebug\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n*L\n27#1:73,11\n*E\n"})
public final class ApiBaseRepository$call$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Function1 f24747OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Function1<OooO0OO.OooO0O0, Unit> f24748OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f24749OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f24750OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ApiBaseRepository$call$2(Function1<? super OooO0OO.OooO0O0, Unit> function1, o0O00oO0 o0o00oo1, Continuation<? super ApiBaseRepository$call$2> continuation) {
        super(2, continuation);
        this.f24748OooO0o = function1;
        this.f24750OooO0oO = o0o00oo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        Intrinsics.needClassReification();
        return new ApiBaseRepository$call$2(this.f24748OooO0o, this.f24750OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Object>> continuation) {
        return ((ApiBaseRepository$call$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f24749OooO0o0;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<OooO0OO.OooO0O0, Unit> function1 = this.f24748OooO0o;
            this.f24747OooO0Oo = function1;
            final o0O00oO0 o0o00oo1 = this.f24750OooO0oO;
            this.f24749OooO0o0 = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            Intrinsics.needClassReification();
            function1.invoke(new OooO0OO.OooO0O0() { // from class: com.yalla.yalla.repository.ApiBaseRepository$call$2$1$1
                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0O0(@Nullable String str, @Nullable String str2) {
                    if (!Intrinsics.areEqual(str, "1011")) {
                        super.OooO0O0(str, str2);
                    }
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationImpl.resumeWith(oOO00O0.OooO00o(o0o00oo1, str, str2));
                }

                @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
                public final void OooO0o0(@Nullable String str) {
                    boolean z = str == null || StringsKt.isBlank(str);
                    o0O00oO0 o0o00oo2 = o0o00oo1;
                    CancellableContinuation<Response<Object>> cancellableContinuation = cancellableContinuationImpl;
                    if (z) {
                        Result.Companion companion = Result.INSTANCE;
                        o00.OooO0Oo(o0o00oo2, "-1", "", cancellableContinuation);
                    } else {
                        Intrinsics.needClassReification();
                        Type type = new TypeToken<Response<Object>>() { // from class: com.yalla.yalla.repository.ApiBaseRepository$call$2$1$1$onFinish$$inlined$toBean$1
                        }.getType();
                        Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                        androidx.compose.ui.focus.OooO00o.OooO0OO(o0o00oo2, (Response) o000oOoO.OooO00o(type, "type", str, type), cancellableContinuation);
                    }
                }
            });
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
