package com.yalla.yalla.developer.nettest;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomMemberTaskModel;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002J\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0002¨\u0006\u000b"}, d2 = {"Lcom/yalla/yalla/developer/nettest/NetDevTestVM;", "Lo0Oo0/OooOO0;", "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/room/RoomMemberTaskModel;", "getTest1", "getTest2", "postTest1", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class NetDevTestVM extends OooOO0 {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$getTest1$1, reason: invalid class name */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$getTest1$1", f = "NetDevTestVM.kt", i = {0}, l = {37}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nNetDevTestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$getTest1$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,36:1\n62#2:37\n*S KotlinDebug\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$getTest1$1\n*L\n15#1:37\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f22893OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f22894OooO0o0;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.f22894OooO0o0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22893OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f22894OooO0o0;
                String strOooO0OO = oo000o.OooO0OO("/getTest1");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(506725118), "RoomId");
                NetDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1 netDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1(o0oooooOooO00o, null);
                this.f22894OooO0o0 = o00oo0o2;
                this.f22893OooO0Oo = 1;
                Object objOooO0Oo = OooOOO.OooO0Oo(netDevTestVM$getTest1$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f22894OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$getTest2$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$getTest2$1", f = "NetDevTestVM.kt", i = {0}, l = {37}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nNetDevTestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$getTest2$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,36:1\n62#2:37\n*S KotlinDebug\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$getTest2$1\n*L\n23#1:37\n*E\n"})
    public static final class C09111 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f22897OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f22898OooO0o0;

        public C09111(Continuation<? super C09111> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09111 c09111 = new C09111(continuation);
            c09111.f22898OooO0o0 = obj;
            return c09111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((C09111) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22897OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f22898OooO0o0;
                String strOooO0OO = oo000o.OooO0OO("/getTest2");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(506725118), "RoomId");
                NetDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1 netDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1(o0oooooOooO00o, null);
                this.f22898OooO0o0 = o00oo0o2;
                this.f22897OooO0Oo = 1;
                Object objOooO0Oo = OooOOO.OooO0Oo(netDevTestVM$getTest2$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f22898OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.developer.nettest.NetDevTestVM$postTest1$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.yalla.yalla.developer.nettest.NetDevTestVM$postTest1$1", f = "NetDevTestVM.kt", i = {0}, l = {37}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nNetDevTestVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$postTest1$1\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,36:1\n62#2:37\n*S KotlinDebug\n*F\n+ 1 NetDevTestVM.kt\ncom/yalla/yalla/developer/nettest/NetDevTestVM$postTest1$1\n*L\n32#1:37\n*E\n"})
    public static final class C09121 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f22901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f22902OooO0o0;

        public C09121(Continuation<? super C09121> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C09121 c09121 = new C09121(continuation);
            c09121.f22902OooO0o0 = obj;
            return c09121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<List<? extends RoomMemberTaskModel>>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((C09121) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f22901OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f22902OooO0o0;
                String strOooO0OO = oo000o.OooO0OO("/postTest1");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(506725118), "RoomId");
                NetDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1 netDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1 = new NetDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1(o0oooooOooO00o, null);
                this.f22902OooO0o0 = o00oo0o2;
                this.f22901OooO0Oo = 1;
                Object objOooO0Oo = OooOOO.OooO0Oo(netDevTestVM$postTest1$1$invokeSuspend$$inlined$call$1, this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f22902OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue((ApiResult) obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<RoomMemberTaskModel>>> getTest1() {
        return o00O.OooO00o(this, new AnonymousClass1(null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<RoomMemberTaskModel>>> getTest2() {
        return o00O.OooO00o(this, new C09111(null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<List<RoomMemberTaskModel>>> postTest1() {
        return o00O.OooO00o(this, new C09121(null));
    }
}
