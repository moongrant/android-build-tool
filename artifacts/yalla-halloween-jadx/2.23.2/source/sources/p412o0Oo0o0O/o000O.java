package p412o0Oo0o0O;

import androidx.lifecycle.MutableLiveData;
import com.code.android.util.o0000;
import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p562o0oOo000.o000000;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo$applyFriendRequest1$3", f = "ImMessageRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class o000O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MutableLiveData<Boolean>>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ long f45965OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O(long j, Continuation<? super o000O> continuation) {
        super(2, continuation);
        this.f45965OooO0Oo = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O(this.f45965OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MutableLiveData<Boolean>> continuation) {
        return ((o000O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        ChatMessage msg = o000OO.OooOo(this.f45965OooO0Oo, o0000.OooO0OO(o000000.addfriend_succeed_firstmessage), null, 0L, false, 60);
        o000OO.OooO0oO(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
        MutableLiveData mutableLiveData = new MutableLiveData();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00O0O0O(msg, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }
}
