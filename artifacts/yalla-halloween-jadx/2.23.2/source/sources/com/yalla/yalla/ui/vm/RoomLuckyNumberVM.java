package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomLuckyNumberHistoryModel;
import com.yalla.yalla.model.room.RoomMemberListModel;
import com.yalla.yalla.repository.RoomLuckyNumberRepo$luckyNumberRecord$$inlined$call$1;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p382o0OOoo.OooOOO;
import p391o0OOooo0.oo000o;
import p394o0Oo0.OooOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/RoomLuckyNumberVM;", "Lo0Oo0/OooOO0;", "", ContributionFragment.ARG_1, "", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/room/RoomMemberListModel;", "", "Lcom/yalla/yalla/model/room/RoomLuckyNumberHistoryModel;", "luckyNumberRecord", "", "luckyNumberRecordPageIndex", "I", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomLuckyNumberVM extends OooOO0 {
    public static final int $stable = 8;
    private int luckyNumberRecordPageIndex = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.RoomLuckyNumberVM$luckyNumberRecord$1", f = "RoomLuckyNumberVM.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30928OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30929OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30930OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ RoomLuckyNumberVM f30931OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f30932OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, RoomLuckyNumberVM roomLuckyNumberVM, long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30929OooO0o = z;
            this.f30931OooO0oO = roomLuckyNumberVM;
            this.f30932OooO0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f30929OooO0o, this.f30931OooO0oO, this.f30932OooO0oo, continuation);
            oooO00o.f30930OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30928OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30930OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30930OooO0o0;
            boolean z = this.f30929OooO0o;
            RoomLuckyNumberVM roomLuckyNumberVM = this.f30931OooO0oO;
            if (z) {
                roomLuckyNumberVM.luckyNumberRecordPageIndex = 1;
            }
            int i2 = roomLuckyNumberVM.luckyNumberRecordPageIndex;
            roomLuckyNumberVM.luckyNumberRecordPageIndex = i2 + 1;
            this.f30930OooO0o0 = liveDataScope;
            this.f30928OooO0Oo = 1;
            String str = OooOOO.f43286OooOOO0;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f30932OooO0oo), "roomid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(20), "pagesize");
            o0oooooOooO00o.OooO00o();
            obj = com.code.android.util.OooOOO.OooO0Oo(new RoomLuckyNumberRepo$luckyNumberRecord$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30930OooO0o0 = null;
            this.f30928OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>> luckyNumberRecord(long roomId, boolean refresh) {
        return o00oO0o.OooO00o(new OooO00o(refresh, this, roomId, null));
    }
}
