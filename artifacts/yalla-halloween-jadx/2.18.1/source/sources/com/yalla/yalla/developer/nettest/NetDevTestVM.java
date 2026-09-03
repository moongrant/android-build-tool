package com.yalla.yalla.developer.nettest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.RoomMemberTaskModel;
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
import o00OO.OooO00o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p484o0o000OO.OooOOO0;
import p484o0o000OO.OooOOOO;
import p547o0o0o00O.o00O000o;
import p547o0o0o00O.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/developer/nettest/NetDevTestVM;", "Lo00OO/OooO00o;", "Lo0o000OO/OooOOOO;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/model/RoomMemberTaskModel;", "getTest1", "getTest2", "postTest1", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class NetDevTestVM extends OooO00o {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$getTest1$1, reason: invalid class name */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$getTest1$1", f = "NetDevTestVM.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21606Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21607Oooo0oO;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.f21607Oooo0oO = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21606Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f21607Oooo0oO;
                String strOooO0O0 = o00O00O.OooO0O0("/getTest1");
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(strOooO0O0, "url", strOooO0O0, 0);
                o00o000oOooO0O0.OooO0O0("RoomId", Boxing.boxInt(506725118));
                NetDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1 netDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
                this.f21607Oooo0oO = oooOOOO2;
                this.f21606Oooo0o = 1;
                Object objOooO0OO = o0000O0.OooO0OO(netDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f21607Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$getTest2$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$getTest2$1", f = "NetDevTestVM.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class C04971 extends SuspendLambda implements Function2<OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21610Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21611Oooo0oO;

        public C04971(Continuation<? super C04971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04971 c04971 = new C04971(continuation);
            c04971.f21611Oooo0oO = obj;
            return c04971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((C04971) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21610Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f21611Oooo0oO;
                String strOooO0O0 = o00O00O.OooO0O0("/getTest2");
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(strOooO0O0, "url", strOooO0O0, 0);
                o00o000oOooO0O0.OooO0O0("RoomId", Boxing.boxInt(506725118));
                NetDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1 netDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
                this.f21611Oooo0oO = oooOOOO2;
                this.f21610Oooo0o = 1;
                Object objOooO0OO = o0000O0.OooO0OO(netDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f21611Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$postTest1$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$postTest1$1", f = "NetDevTestVM.kt", i = {0}, l = {38}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class C04981 extends SuspendLambda implements Function2<OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21614Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21615Oooo0oO;

        public C04981(Continuation<? super C04981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C04981 c04981 = new C04981(continuation);
            c04981.f21615Oooo0oO = obj;
            return c04981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<List<? extends RoomMemberTaskModel>>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((C04981) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21614Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f21615Oooo0oO;
                String strOooO0O0 = o00O00O.OooO0O0("/postTest1");
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(strOooO0O0, "url", strOooO0O0, 1);
                o00o000oOooO0O0.OooO0O0("RoomId", Boxing.boxInt(506725118));
                NetDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1 netDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1(o00o000oOooO0O0, null);
                this.f21615Oooo0oO = oooOOOO2;
                this.f21614Oooo0o = 1;
                Object objOooO0OO = o0000O0.OooO0OO(netDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f21615Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final OooOOOO<ApiResult<List<RoomMemberTaskModel>>> getTest1() {
        return OooOOO0.OooO00o(this, new AnonymousClass1(null));
    }

    @NotNull
    public final OooOOOO<ApiResult<List<RoomMemberTaskModel>>> getTest2() {
        return OooOOO0.OooO00o(this, new C04971(null));
    }

    @NotNull
    public final OooOOOO<ApiResult<List<RoomMemberTaskModel>>> postTest1() {
        return OooOOO0.OooO00o(this, new C04981(null));
    }
}
