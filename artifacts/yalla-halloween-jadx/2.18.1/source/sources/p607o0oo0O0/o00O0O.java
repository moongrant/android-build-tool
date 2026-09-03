package p607o0oo0O0;

import androidx.lifecycle.LiveDataScope;
import com.app.base.model.RoomIndexModel;
import com.yalla.support.common.util.OooO;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.SearchKickRecordModel;
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
@DebugMetadata(c = "com.yalla.yalla.ui.vm.room.KickRecordVM$getSearchKickRecordList$1", f = "KickRecordVM.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<SearchKickRecordModel>>, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f48300Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f48301Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f48302Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ String f48303Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(String str, int i, Continuation<? super o00O0O> continuation) {
        super(2, continuation);
        this.f48303Oooo0oo = str;
        this.f48300Oooo = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        o00O0O o00o0o2 = new o00O0O(this.f48303Oooo0oo, this.f48300Oooo, continuation);
        o00o0o2.f48302Oooo0oO = obj;
        return o00o0o2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LiveDataScope<ApiResult<SearchKickRecordModel>> liveDataScope, Continuation<? super Unit> continuation) {
        return ((o00O0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        LiveDataScope liveDataScope;
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f48301Oooo0o;
        if (i != 0) {
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f48302Oooo0oO;
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
        liveDataScope = (LiveDataScope) this.f48302Oooo0oO;
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        RoomIndexModel value = OooOOO.f41251Oooo0OO.getValue();
        long jOooO0oO = 0;
        if (value != null && (str = value.barid) != null) {
            jOooO0oO = OooO.OooO0oO(str);
        }
        o0000O0O o0000o0o2 = o0000O0O.f42422OooO00o;
        String str2 = this.f48303Oooo0oo;
        int i2 = this.f48300Oooo;
        this.f48302Oooo0oO = liveDataScope;
        this.f48301Oooo0o = 1;
        obj = o0000o0o2.OooO0O0(jOooO0oO, str2, i2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.f48302Oooo0oO = null;
        this.f48301Oooo0o = 2;
        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
