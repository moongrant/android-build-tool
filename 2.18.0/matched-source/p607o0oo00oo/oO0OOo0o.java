package p607o0oo00oo;

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
import p255o00ooO0O.o0000O0;
import p549o0o0o00O.o00O00;
import p549o0o0o00O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainRoomExploreViewModel$loadEvents$1", f = "MainRoomExploreViewModel.kt", i = {}, l = {68, 68}, m = "invokeSuspend", n = {}, s = {})
public final class oO0OOo0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<EventModel>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f48315Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public /* synthetic */ Object f48316OoooO00;

    public oO0OOo0o(Continuation<? super oO0OOo0o> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        oO0OOo0o oo0ooo0o = new oO0OOo0o(continuation);
        oo0ooo0o.f48316OoooO00 = obj;
        return oo0ooo0o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<EventModel>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((oO0OOo0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48315Oooo;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48316OoooO00;
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
        liveDataScope = (LiveDataScope) this.f48316OoooO00;
        this.f48316OoooO00 = liveDataScope;
        this.f48315Oooo = 1;
        Intrinsics.checkNotNullParameter("/Webservers/Event/GetTop5", "<this>");
        String url = o00O00.OooO0OO("/Webservers/Event/GetTop5", 3);
        Intrinsics.checkNotNullParameter(url, "url");
        obj = o0000O0.OooO0OO(new ExploreRepository$loadEvents$$inlined$call$1(new o00O000(url, 0), null), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48316OoooO00 = null;
        this.f48315Oooo = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
