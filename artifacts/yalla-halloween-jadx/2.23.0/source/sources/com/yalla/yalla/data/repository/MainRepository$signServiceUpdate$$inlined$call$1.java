package com.yalla.yalla.data.repository;

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
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p406o0Oo0Ooo.oOO00O0;
import p464o0Oooo.o0O00oO0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u008a@¨\u0006\u0003"}, d2 = {"T", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/yalla/yalla/model/http/Response;", "com/yalla/yalla/repository/ApiBaseRepository$call$2", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "com.yalla.yalla.data.repository.MainRepository$signServiceUpdate$$inlined$call$1", f = "MainRepository.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nApiBaseRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 MainRepository.kt\ncom/yalla/yalla/data/repository/MainRepository\n*L\n1#1,72:1\n314#2,9:73\n323#2,2:83\n36#3:82\n*S KotlinDebug\n*F\n+ 1 ApiBaseRepository.kt\ncom/yalla/yalla/repository/ApiBaseRepository$call$2\n*L\n27#1:73,9\n27#1:83,2\n*E\n"})
public final class MainRepository$signServiceUpdate$$inlined$call$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Object>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22997OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00oO0 f22998OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainRepository$signServiceUpdate$$inlined$call$1(o0O00oO0 o0o00oo1, Continuation continuation) {
        super(2, continuation);
        this.f22998OooO0o0 = o0o00oo1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new MainRepository$signServiceUpdate$$inlined$call$1(this.f22998OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Object>> continuation) {
        return ((MainRepository$signServiceUpdate$$inlined$call$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22997OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final o0O00oO0 o0o00oo1 = this.f22998OooO0o0;
            this.f22997OooO0Oo = 1;
            final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            OooO0OO.OooO0O0 oooO0O0 = new OooO0OO.OooO0O0() { // from class: com.yalla.yalla.data.repository.MainRepository$signServiceUpdate$$inlined$call$1.1
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
                    CancellableContinuation cancellableContinuation = cancellableContinuationImpl;
                    if (z) {
                        Result.Companion companion = Result.INSTANCE;
                        o00.OooO0Oo(o0o00oo2, "-1", "", cancellableContinuation);
                    } else {
                        Type type = new TypeToken<Response<Object>>() { // from class: com.yalla.yalla.data.repository.MainRepository$signServiceUpdate$.inlined.call.1.1.1
                        }.getType();
                        Function2<? super String, ? super Throwable, Unit> function2 = OooO00o.f10146OooO00o;
                        androidx.compose.ui.focus.OooO00o.OooO0OO(o0o00oo2, (Response) o000oOoO.OooO00o(type, "type", str, type), cancellableContinuation);
                    }
                }
            };
            o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
            OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44134o0000, oO00o000.OooO00o(), oooO0O0);
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
