package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.constant.LucklyPacket$Action;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.PacketHistoryModel;
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
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/PacketHistoryVM;", "Lo00OO/OooO00o;", "", "refresh", "Lcom/yalla/yalla/common/constant/LucklyPacket$Type;", "packetType", "Lcom/yalla/yalla/common/constant/LucklyPacket$Action;", "listType", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/PacketHistoryModel;", "loadPacketHistory", "", "pageIndex", "I", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PacketHistoryVM extends o00OO.OooO00o {
    public static final int $stable = 8;
    private int pageIndex = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.PacketHistoryVM$loadPacketHistory$1", f = "PacketHistoryVM.kt", i = {0}, l = {14, 18}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<PacketHistoryModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ PacketHistoryVM f26089Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26090Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26091Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26092Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ LucklyPacket$Action f26093OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ LucklyPacket$Type f26094OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, PacketHistoryVM packetHistoryVM, LucklyPacket$Type lucklyPacket$Type, LucklyPacket$Action lucklyPacket$Action, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26092Oooo0oo = z;
            this.f26089Oooo = packetHistoryVM;
            this.f26094OoooO00 = lucklyPacket$Type;
            this.f26093OoooO0 = lucklyPacket$Action;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26092Oooo0oo, this.f26089Oooo, this.f26094OoooO00, this.f26093OoooO0, continuation);
            oooO00o.f26091Oooo0oO = obj;
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
            int i = this.f26090Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26091Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26091Oooo0oO;
            if (this.f26092Oooo0oo) {
                this.f26089Oooo.pageIndex = 1;
            }
            o000O0Oo o000o0oo2 = o000O0Oo.f42574OooO00o;
            LucklyPacket$Type lucklyPacket$Type = this.f26094OoooO00;
            LucklyPacket$Action lucklyPacket$Action = this.f26093OoooO0;
            int i2 = this.f26089Oooo.pageIndex;
            this.f26091Oooo0oO = liveDataScope;
            this.f26090Oooo0o = 1;
            obj = o000o0oo2.OooO00o(lucklyPacket$Type, lucklyPacket$Action, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                this.f26089Oooo.pageIndex++;
            }
            this.f26091Oooo0oO = null;
            this.f26090Oooo0o = 2;
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
        return o0000O0O.OooO00o(new OooO00o(refresh, this, packetType, listType, null));
    }
}
