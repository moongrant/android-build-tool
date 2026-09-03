package p579o0oOoOoO;

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
import p380o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadEvents$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {72, 72}, m = "invokeSuspend", n = {}, s = {})
public final class oOO00OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<EventModel>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f56527OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f56528OooO0o0;

    public oOO00OO(Continuation<? super oOO00OO> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oOO00OO ooo00oo = new oOO00OO(continuation);
        ooo00oo.f56528OooO0o0 = obj;
        return ooo00oo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<EventModel>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((oOO00OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f56527OooO0Oo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f56528OooO0o0;
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
        liveDataScope = (LiveDataScope) this.f56528OooO0o0;
        this.f56528OooO0o0 = liveDataScope;
        this.f56527OooO0Oo = 1;
        String strOooO0O0 = oo000o.OooO0O0("/Webservers/Event/GetTop5");
        obj = OooOOO.OooO0Oo(new ExploreRepository$loadEvents$$inlined$call$1(p391o0OOooo0.oo000o.OooO00o(strOooO0O0, "url", strOooO0O0, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f56528OooO0o0 = null;
        this.f56527OooO0Oo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
