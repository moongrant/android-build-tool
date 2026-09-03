package com.yalla.yalla.data.cache;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.cache.SharedLuckyPacketManager$loadData$1", f = "SharedLuckyPacketManager.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nSharedLuckyPacketManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedLuckyPacketManager.kt\ncom/yalla/yalla/data/cache/SharedLuckyPacketManager$loadData$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,59:1\n62#2:60\n*S KotlinDebug\n*F\n+ 1 SharedLuckyPacketManager.kt\ncom/yalla/yalla/data/cache/SharedLuckyPacketManager$loadData$1\n*L\n49#1:60\n*E\n"})
public final class SharedLuckyPacketManager$loadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22789OooO0Oo;

    public SharedLuckyPacketManager$loadData$1(Continuation<? super SharedLuckyPacketManager$loadData$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SharedLuckyPacketManager$loadData$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new SharedLuckyPacketManager$loadData$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22789OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = o000OOo0.OooO0OO("/Webservers/Bar/RedPaperPropList");
            Intrinsics.checkNotNullParameter(url, "url");
            SharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1 sharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1 = new SharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1(new o0O0ooO(url, 0), null);
            this.f22789OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(sharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1, this);
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
        int i2 = p402o0Oo0OOO.o0O0ooO.f44521OooO00o;
        Collection collection = (Collection) apiResult.getData();
        if (collection == null || collection.isEmpty()) {
            p402o0Oo0OOO.o0O0ooO.f44522OooO0O0.postValue(new ArrayList());
            return Unit.INSTANCE;
        }
        p402o0Oo0OOO.o0O0ooO.f44522OooO0O0.postValue(apiResult.getData());
        return Unit.INSTANCE;
    }
}
