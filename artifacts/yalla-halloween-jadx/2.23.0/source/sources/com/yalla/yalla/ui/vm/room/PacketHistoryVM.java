package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.constant.LucklyPacket$Action;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.model.PacketHistoryModel;
import com.yalla.yalla.model.http.ApiResult;
import kotlin.Metadata;
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
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.k;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "Lo0Oo00oO/o0O0O00;", "", "refresh", "Lcom/yalla/yalla/data/constant/LucklyPacket$Type;", "packetType", "Lcom/yalla/yalla/data/constant/LucklyPacket$Action;", "listType", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/PacketHistoryModel;", "loadPacketHistory", "", "pageIndex", "I", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class PacketHistoryVM extends o0O0O00 {
    public static final int $stable = 8;
    private int pageIndex = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.PacketHistoryVM$loadPacketHistory$1", f = "PacketHistoryVM.kt", i = {0}, l = {14, 18}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PacketHistoryModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ LucklyPacket$Action f32545OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32546OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f32547OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32548OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ PacketHistoryVM f32549OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ LucklyPacket$Type f32550OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, PacketHistoryVM packetHistoryVM, LucklyPacket$Type lucklyPacket$Type, LucklyPacket$Action lucklyPacket$Action, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32547OooO0o = z;
            this.f32549OooO0oO = packetHistoryVM;
            this.f32550OooO0oo = lucklyPacket$Type;
            this.f32545OooO = lucklyPacket$Action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f32547OooO0o, this.f32549OooO0oO, this.f32550OooO0oo, this.f32545OooO, continuation);
            oooO00o.f32548OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<PacketHistoryModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32546OooO0Oo;
            PacketHistoryVM packetHistoryVM = this.f32549OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32548OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32548OooO0o0;
            if (this.f32547OooO0o) {
                packetHistoryVM.pageIndex = 1;
            }
            k kVar = k.f44846OooO00o;
            int i2 = packetHistoryVM.pageIndex;
            this.f32548OooO0o0 = liveDataScope;
            this.f32546OooO0Oo = 1;
            obj = kVar.OooO00o(this.f32550OooO0oo, this.f32545OooO, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                packetHistoryVM.pageIndex++;
            }
            this.f32548OooO0o0 = null;
            this.f32546OooO0Oo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<PacketHistoryModel>> loadPacketHistory(boolean refresh, @NotNull LucklyPacket$Type packetType, @NotNull LucklyPacket$Action listType) {
        Intrinsics.checkNotNullParameter(packetType, "packetType");
        Intrinsics.checkNotNullParameter(listType, "listType");
        return o00oO0o.OooO00o(new OooO00o(refresh, this, packetType, listType, null));
    }
}
