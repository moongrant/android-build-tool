package p607o0oo0O0;

import androidx.lifecycle.LiveDataScope;
import com.app.base.model.RoomIndexModel;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomKickUser;
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
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0000O0O;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.KickRecordVM$getKickRecordList$1", f = "KickRecordVM.kt", i = {}, l = {18, 18}, m = "invokeSuspend", n = {}, s = {})
public final class o0OoOo0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<RoomKickUser>>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f48322Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48323Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48324Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ long f48325Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(long j, int i, Continuation<? super o0OoOo0> continuation) {
        super(2, continuation);
        this.f48325Oooo0oo = j;
        this.f48322Oooo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o0OoOo0 o0oooo1 = new o0OoOo0(this.f48325Oooo0oo, this.f48322Oooo, continuation);
        o0oooo1.f48324Oooo0oO = obj;
        return o0oooo1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<List<RoomKickUser>>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o0OoOo0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48323Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48324Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48324Oooo0oO;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        RoomIndexModel value = OooOOO.f41251Oooo0OO.getValue();
        long jOooO0oO = 0;
        if (value != null && (str = value.barid) != null) {
            jOooO0oO = OooO.OooO0oO(str);
        }
        o0000O0O o0000o0o2 = o0000O0O.f42422OooO00o;
        long j = this.f48325Oooo0oo;
        int i2 = this.f48322Oooo;
        this.f48324Oooo0oO = liveDataScope;
        this.f48323Oooo0o = 1;
        obj = o0000o0o2.OooO00o(jOooO0oO, j, i2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48324Oooo0oO = null;
        this.f48323Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
