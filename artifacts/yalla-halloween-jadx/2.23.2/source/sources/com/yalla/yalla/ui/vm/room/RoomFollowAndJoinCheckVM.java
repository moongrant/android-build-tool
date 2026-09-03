package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.OooOOO;
import com.code.android.util.o000000;
import com.yalla.yalla.api.old.ApiRoomNew$checkFollowAndJoin$$inlined$call$1;
import com.yalla.yalla.api.old.ApiRoomNew$followRoom$$inlined$call$1;
import com.yalla.yalla.api.old.ApiRoomNew$unJoinRoom$$inlined$call$1;
import com.yalla.yalla.model.FollowAndJoinRoomModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.fragment.ContributionFragment;
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
import p380o0OOoOo.oo000o;
import p394o0Oo0.OooOO0;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/RoomFollowAndJoinCheckVM;", "Lo0Oo0/OooOO0;", "", ContributionFragment.ARG_1, "Lo0OoO0Oo/o00OO0O0;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/FollowAndJoinRoomModel;", "check", "", "followRoom", "unfollowRoom", "unJoinRoom", "unJoinAndUnFollowRoom", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomFollowAndJoinCheckVM extends OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM$unfollowRoom$1", f = "RoomFollowAndJoinCheckVM.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32015OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32016OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32017OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f32016OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f32016OooO0o, continuation);
            oooO.f32017OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32015OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32017OooO0o0;
                this.f32017OooO0o0 = o00oo0o2;
                this.f32015OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/BarFollow");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f32016OooO0o), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(o000000.OooO0O0(Boxing.boxBoolean(true))), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new ApiRoomNew$followRoom$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32017OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM$check$1", f = "RoomFollowAndJoinCheckVM.kt", i = {}, l = {10}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<FollowAndJoinRoomModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32018OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32019OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32020OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f32019OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f32019OooO0o, continuation);
            oooO00o.f32020OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<FollowAndJoinRoomModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32018OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32020OooO0o0;
                this.f32020OooO0o0 = o00oo0o2;
                this.f32018OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/CheckFollowAndJoin");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f32019OooO0o), "barid");
                Object objOooO0Oo = OooOOO.OooO0Oo(new ApiRoomNew$checkFollowAndJoin$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32020OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM$followRoom$1", f = "RoomFollowAndJoinCheckVM.kt", i = {}, l = {14}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32021OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32022OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32023OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32022OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32022OooO0o, continuation);
            oooO0O0.f32023OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32021OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32023OooO0o0;
                this.f32023OooO0o0 = o00oo0o2;
                this.f32021OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/BarFollow");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f32022OooO0o), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(o000000.OooO0O0(Boxing.boxBoolean(false))), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new ApiRoomNew$followRoom$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32023OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM$unJoinAndUnFollowRoom$1", f = "RoomFollowAndJoinCheckVM.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32024OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32025OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32026OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32025OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f32025OooO0o, continuation);
            oooO0OO.f32026OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32024OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32026OooO0o0;
                this.f32026OooO0o0 = o00oo0o2;
                this.f32024OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/UnJoinBar");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f32025OooO0o), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(o000000.OooO0O0(Boxing.boxBoolean(true))), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new ApiRoomNew$unJoinRoom$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32026OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.RoomFollowAndJoinCheckVM$unJoinRoom$1", f = "RoomFollowAndJoinCheckVM.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32027OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32028OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32029OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32028OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f32028OooO0o, continuation);
            oooO0o.f32029OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<String>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32027OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f32029OooO0o0;
                this.f32029OooO0o0 = o00oo0o2;
                this.f32027OooO0Oo = 1;
                String strOooO0OO = oo000o.OooO0OO("/Webservers/Bar/UnJoinBar");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0OO, "url", strOooO0OO, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(this.f32028OooO0o), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(o000000.OooO0O0(Boxing.boxBoolean(false))), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new ApiRoomNew$unJoinRoom$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f32029OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final o00OO0O0<ApiResult<FollowAndJoinRoomModel>> check(long roomId) {
        return o00O.OooO00o(this, new OooO00o(roomId, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> followRoom(long roomId) {
        return o00O.OooO00o(this, new OooO0O0(roomId, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> unJoinAndUnFollowRoom(long roomId) {
        return o00O.OooO00o(this, new OooO0OO(roomId, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> unJoinRoom(long roomId) {
        return o00O.OooO00o(this, new OooO0o(roomId, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<String>> unfollowRoom(long roomId) {
        return o00O.OooO00o(this, new OooO(roomId, null));
    }
}
