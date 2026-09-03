package com.yalla.yalla.data.manager;

import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import java.util.ArrayList;
import java.util.List;
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
import p412o0Oo0oOo.t0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.manager.VoteGiftManager$loadGiftConfig$1", f = "VoteGiftManager.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nVoteGiftManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VoteGiftManager.kt\ncom/yalla/yalla/data/manager/VoteGiftManager$loadGiftConfig$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n62#2:52\n1#3:53\n*S KotlinDebug\n*F\n+ 1 VoteGiftManager.kt\ncom/yalla/yalla/data/manager/VoteGiftManager$loadGiftConfig$1\n*L\n33#1:52\n*E\n"})
public final class VoteGiftManager$loadGiftConfig$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f22855OooO0Oo;

    public VoteGiftManager$loadGiftConfig$1(Continuation<? super VoteGiftManager$loadGiftConfig$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new VoteGiftManager$loadGiftConfig$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return new VoteGiftManager$loadGiftConfig$1(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f22855OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String url = o000OOo0.OooO0OO("Webservers/vote/GetGiftList");
            Intrinsics.checkNotNullParameter(url, "url");
            VoteGiftManager$loadGiftConfig$1$invokeSuspend$$inlined$call$1 voteGiftManager$loadGiftConfig$1$invokeSuspend$$inlined$call$1 = new VoteGiftManager$loadGiftConfig$1$invokeSuspend$$inlined$call$1(new o0O0ooO(url, 0), null);
            this.f22855OooO0Oo = 1;
            obj = OooOOO.OooO0Oo(voteGiftManager$loadGiftConfig$1$invokeSuspend$$inlined$call$1, this);
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
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            List list = (List) apiResult.getData();
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(list.get(i2));
                    if (arrayList2.size() == 8 || i2 == list.size() - 1) {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.addAll(arrayList2);
                        arrayList.add(arrayList3);
                        arrayList2.clear();
                    }
                }
            }
            t0.f45257OooO00o.postValue(arrayList);
        }
        return Unit.INSTANCE;
    }
}
