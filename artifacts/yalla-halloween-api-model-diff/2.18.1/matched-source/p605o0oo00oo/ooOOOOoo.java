package p605o0oo00oo;

import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.ExploreRepository$loadEvents$$inlined$call$1;
import com.yalla.yalla.model.EventModel;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p547o0o0o00O.o00O000o;
import p547o0o0o00O.o00O00O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadEvents$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {68, 68}, m = "invokeSuspend", n = {}, s = {})
public final class ooOOOOoo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<EventModel>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48298Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48299Oooo0oO;

    public ooOOOOoo(Continuation<? super ooOOOOoo> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        ooOOOOoo oooooooo = new ooOOOOoo(continuation);
        oooooooo.f48299Oooo0oO = obj;
        return oooooooo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<EventModel>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((ooOOOOoo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48298Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48299Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48299Oooo0oO;
        this.f48299Oooo0oO = liveDataScope;
        this.f48298Oooo0o = 1;
        Intrinsics.checkNotNullParameter("/Webservers/Event/GetTop5", "<this>");
        String url = o00O00O.OooO0OO("/Webservers/Event/GetTop5", 3);
        Intrinsics.checkNotNullParameter(url, "url");
        obj = o0000O0.OooO0OO(new ExploreRepository$loadEvents$$inlined$call$1(new o00O000o(url, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48299Oooo0oO = null;
        this.f48298Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
