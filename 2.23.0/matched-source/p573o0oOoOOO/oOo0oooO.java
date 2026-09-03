package p573o0oOoOOO;

import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.event.EventModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.ExploreRepository$loadEvents$$inlined$call$1;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p385o0OOooOO.o00oOoo;

/* JADX INFO: loaded from: classes5.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadEvents$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {72, 72}, m = "invokeSuspend", n = {}, s = {})
public final class oOo0oooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<EventModel>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56309OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56310OooO0o0;

    public oOo0oooO(Continuation<? super oOo0oooO> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oOo0oooO ooo0oooo = new oOo0oooO(continuation);
        ooo0oooo.f56310OooO0o0 = obj;
        return ooo0oooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<EventModel>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((oOo0oooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56309OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56310OooO0o0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        liveDataScope = (LiveDataScope) this.f56310OooO0o0;
        this.f56310OooO0o0 = liveDataScope;
        this.f56309OooO0Oo = 1;
        String strOooO0O0 = o000OOo0.OooO0O0("/Webservers/Event/GetTop5");
        obj = OooOOO.OooO0Oo(new ExploreRepository$loadEvents$$inlined$call$1(o00oOoo.OooO00o(strOooO0O0, "url", strOooO0O0, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56310OooO0o0 = null;
        this.f56309OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
