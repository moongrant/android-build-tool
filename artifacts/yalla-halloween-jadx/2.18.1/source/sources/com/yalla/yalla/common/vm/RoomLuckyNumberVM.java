package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.RoomMemberListModel;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.RoomLuckyNumberRepo$luckyNumberRecord$$inlined$call$1;
import com.yalla.yalla.model.RoomLuckyNumberHistoryModel;
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
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p486o0o000o0.o000OOo;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J.\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/common/vm/RoomLuckyNumberVM;", "Lo00OO/OooO00o;", "", ContributionFragment.ARG_1, "", "refresh", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/app/base/model/RoomMemberListModel;", "", "Lcom/yalla/yalla/model/RoomLuckyNumberHistoryModel;", "luckyNumberRecord", "", "luckyNumberRecordPageIndex", "I", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomLuckyNumberVM extends o00OO.OooO00o {
    public static final int $stable = 8;
    private int luckyNumberRecordPageIndex = 1;

    @DebugMetadata(c = "com.yalla.yalla.common.vm.RoomLuckyNumberVM$luckyNumberRecord$1", f = "RoomLuckyNumberVM.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ RoomLuckyNumberVM f21298Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21299Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21300Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21301Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f21302OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, RoomLuckyNumberVM roomLuckyNumberVM, long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21301Oooo0oo = z;
            this.f21298Oooo = roomLuckyNumberVM;
            this.f21302OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21301Oooo0oo, this.f21298Oooo, this.f21302OoooO00, continuation);
            oooO00o.f21300Oooo0oO = obj;
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
            int i = this.f21299Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21300Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21300Oooo0oO;
            if (this.f21301Oooo0oo) {
                this.f21298Oooo.luckyNumberRecordPageIndex = 1;
            }
            long j = this.f21302OoooO00;
            RoomLuckyNumberVM roomLuckyNumberVM = this.f21298Oooo;
            int i2 = roomLuckyNumberVM.luckyNumberRecordPageIndex;
            roomLuckyNumberVM.luckyNumberRecordPageIndex = i2 + 1;
            this.f21300Oooo0oO = liveDataScope;
            this.f21299Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String str = o000OOo.f40923OooOOO;
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
            o00o000oOooO0O0.OooO0O0("roomid", Boxing.boxLong(j));
            o00o000oOooO0O0.OooO0O0("pageindex", Boxing.boxInt(i2));
            o00o000oOooO0O0.OooO0O0("pagesize", Boxing.boxInt(20));
            o00o000oOooO0O0.OooO00o();
            obj = o0000O0.OooO0OO(new RoomLuckyNumberRepo$luckyNumberRecord$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21300Oooo0oO = null;
            this.f21299Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<RoomMemberListModel<List<RoomLuckyNumberHistoryModel>>>> luckyNumberRecord(long roomId, boolean refresh) {
        return o0000O0O.OooO00o(new OooO00o(refresh, this, roomId, null));
    }
}
