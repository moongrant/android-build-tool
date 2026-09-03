package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.fragment.ContributionFragment;
import com.app.base.model.ChatModel;
import com.app.base.model.FriendCheckModel;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.GifFaceBuyModel;
import com.yalla.yalla.common.repository.RoomJoinFollowRepo$buyEmoji$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomJoinFollowRepo$unFollowRoom$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomJoinFollowRepo$unJoinRoom$$inlined$call$1;
import com.yalla.yalla.common.repository.RoomJoinFollowRepo$unJoinRoomAndUnFollowRoom$$inlined$call$1;
import com.yalla.yalla.data.repository.RoomRepo$followRoom$$inlined$call$1;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O00O;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p254o00ooO0O.o000Oo0;
import p484o0o000OO.OooOOOO;
import p486o0o000o0.o000OOo;
import p520o0o0O0O0.Oooo0;
import p520o0o0O0O0.o00oO0o;
import p520o0o0O0O0.o0OOO0o;
import p530o0o0OOO.o00OO00O;
import p530o0o0OOO.oo0O;
import p533o0o0OOOo.oO00000o;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\u00152\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/common/vm/LiveRoomVM;", "Lo00OO/OooO00o;", "", "loadEventState", "", "targetId", "Landroidx/lifecycle/LiveData;", "Lcom/app/base/model/FriendCheckModel;", "checkIsFriend", "targetUserId", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Landroidx/lifecycle/MutableLiveData;", "", "addFriend", ContributionFragment.ARG_1, "Lcom/yalla/yalla/common/model/ApiResult;", "", "unJoinRoom", "", "follow", "Lo0o000OO/OooOOOO;", "followRoom", "unFollowRoom", "unJoinRoomAndUnFollowRoom", "type", "catalogId", "Lcom/yalla/yalla/common/model/GifFaceBuyModel;", "buyEmoji", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class LiveRoomVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$loadEventState$1$1", f = "LiveRoomVM.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21240Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Long f21241Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Long l, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f21241Oooo0oO = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f21241Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21240Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0 oooo0 = Oooo0.f42257OooO00o;
                Long roomId = this.f21241Oooo0oO;
                Intrinsics.checkNotNullExpressionValue(roomId, "roomId");
                long jLongValue = roomId.longValue();
                this.f21240Oooo0o = 1;
                if (oooo0.OooO0oo(jLongValue, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$1", f = "LiveRoomVM.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21242Oooo0o;

        /* JADX INFO: renamed from: com.yalla.yalla.common.vm.LiveRoomVM$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0226OooO00o implements FlowCollector<Boolean> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ LiveRoomVM f21244Oooo0o;

            /* JADX INFO: renamed from: com.yalla.yalla.common.vm.LiveRoomVM$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$1$1", f = "LiveRoomVM.kt", i = {0}, l = {28}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class C0227OooO00o extends ContinuationImpl {

                /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
                public int f21245Oooo;

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public C0226OooO00o f21246Oooo0o;

                /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
                public /* synthetic */ Object f21247Oooo0oO;

                public C0227OooO00o(Continuation<? super C0227OooO00o> continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f21247Oooo0oO = obj;
                    this.f21245Oooo |= Integer.MIN_VALUE;
                    return C0226OooO00o.this.OooO00o(false, this);
                }
            }

            /* JADX INFO: renamed from: com.yalla.yalla.common.vm.LiveRoomVM$OooO00o$OooO00o$OooO0O0 */
            @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$1$1$emit$2", f = "LiveRoomVM.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
            public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public int f21249Oooo0o;

                public OooO0O0(Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new OooO0O0(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return new OooO0O0(continuation).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f21249Oooo0o;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f21249Oooo0o = 1;
                        if (DelayKt.delay(5000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            public C0226OooO00o(LiveRoomVM liveRoomVM) {
                this.f21244Oooo0o = liveRoomVM;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Nullable
            public final Object OooO00o(boolean z, @NotNull Continuation<? super Unit> continuation) {
                C0227OooO00o c0227OooO00o;
                C0226OooO00o c0226OooO00o;
                if (continuation instanceof C0227OooO00o) {
                    c0227OooO00o = (C0227OooO00o) continuation;
                    int i = c0227OooO00o.f21245Oooo;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0227OooO00o.f21245Oooo = i - Integer.MIN_VALUE;
                    } else {
                        c0227OooO00o = new C0227OooO00o(continuation);
                    }
                } else {
                    c0227OooO00o = new C0227OooO00o(continuation);
                }
                Object obj = c0227OooO00o.f21247Oooo0oO;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = c0227OooO00o.f21245Oooo;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    OooO0O0 oooO0O0 = new OooO0O0(null);
                    c0227OooO00o.f21246Oooo0o = this;
                    c0227OooO00o.f21245Oooo = 1;
                    if (BuildersKt.withContext(io2, oooO0O0, c0227OooO00o) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0226OooO00o = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0226OooO00o = c0227OooO00o.f21246Oooo0o;
                    ResultKt.throwOnFailure(obj);
                }
                c0226OooO00o.f21244Oooo0o.loadEventState();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Boolean bool, Continuation continuation) {
                return OooO00o(bool.booleanValue(), continuation);
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return LiveRoomVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21242Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> mutableSharedFlow = o00OO00O.f43313OooooOo.OooO00o().f43323OooO0oo;
                C0226OooO00o c0226OooO00o = new C0226OooO00o(LiveRoomVM.this);
                this.f21242Oooo0o = 1;
                if (mutableSharedFlow.collect(c0226OooO00o, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$buyEmoji$1", f = "LiveRoomVM.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<OooOOOO<ApiResult<GifFaceBuyModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f21250Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21251Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21252Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ int f21253Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21253Oooo0oo = i;
            this.f21250Oooo = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f21253Oooo0oo, this.f21250Oooo, continuation);
            oooO0O0.f21252Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<GifFaceBuyModel>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21251Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f21252Oooo0oO;
                int i2 = this.f21253Oooo0oo;
                int i3 = this.f21250Oooo;
                this.f21252Oooo0oO = oooOOOO2;
                this.f21251Oooo0o = 1;
                o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                String str = o000OOo.f40918OooO0oO;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 1);
                o00o000oOooO0O0.OooO0O0("type", Boxing.boxInt(i2));
                o00o000oOooO0O0.OooO0O0("catalogId", Boxing.boxInt(i3));
                Object objOooO0OO = o0000O0.OooO0OO(new RoomJoinFollowRepo$buyEmoji$$inlined$call$1(o00o000oOooO0O0, null), this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f21252Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            oooOOOO.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$checkIsFriend$1", f = "LiveRoomVM.kt", i = {}, l = {37, 37}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<FriendCheckModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21254Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21255Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f21256Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21256Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f21256Oooo0oo, continuation);
            oooO0OO.f21255Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<FriendCheckModel> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21254Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21255Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21255Oooo0oO;
            long j = this.f21256Oooo0oo;
            this.f21255Oooo0oO = liveDataScope;
            this.f21254Oooo0o = 1;
            obj = o0OOO0o.f42810OooO00o.OooO0OO(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21255Oooo0oO = null;
            this.f21254Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$followRoom$1", f = "LiveRoomVM.kt", i = {0}, l = {45}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<OooOOOO<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21257Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21258Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21259Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f21259Oooo0oo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f21259Oooo0oo, continuation);
            oooO0o.f21258Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OooOOOO<ApiResult<Object>> oooOOOO, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(oooOOOO, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OooOOOO oooOOOO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21257Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                OooOOOO oooOOOO2 = (OooOOOO) this.f21258Oooo0oO;
                Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                boolean z = this.f21259Oooo0oo;
                this.f21258Oooo0oO = oooOOOO2;
                this.f21257Oooo0o = 1;
                o000OOo o000ooo2 = o000OOo.f40912OooO00o;
                String str = o000OOo.f40916OooO0o;
                o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0);
                o00o000oOooO0O0.OooO0O0("barid", Boxing.boxLong(jLongValue));
                o00o000oOooO0O0.OooO0O0("type", Boxing.boxInt(o000Oo0.OooO0O0(Boxing.boxBoolean(!z))));
                Object objOooO0OO = o0000O0.OooO0OO(new RoomRepo$followRoom$$inlined$call$1(o00o000oOooO0O0, null), this);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooOOOO = oooOOOO2;
                obj = objOooO0OO;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooOOOO = (OooOOOO) this.f21258Oooo0oO;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                o00OO00O.f43313OooooOo.OooO00o().f43327OooOOO.postValue(Boxing.boxBoolean(this.f21259Oooo0oo));
                if (this.f21259Oooo0oo) {
                    oo0O oo0o = oo0O.f43387OooO00o;
                    oO00000o oo00000o = oo0O.f43389OooO0OO;
                    ChatModel chatModel = new ChatModel();
                    chatModel.type = 27;
                    o000O00O.OooO().OooO00o(chatModel);
                }
            }
            oooOOOO.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$unFollowRoom$1", f = "LiveRoomVM.kt", i = {}, l = {54, 54}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21260Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21261Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21262Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f21262Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f21262Oooo0oo, continuation);
            oooOO1.f21261Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21260Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21261Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21261Oooo0oO;
            String str = this.f21262Oooo0oo;
            this.f21261Oooo0oO = liveDataScope;
            this.f21260Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String url = o000OOo.f40917OooO0o0;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("barid", str);
            o00o000o2.OooO0O0("type", Boxing.boxInt(1));
            obj = o0000O0.OooO0OO(new RoomJoinFollowRepo$unFollowRoom$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21261Oooo0oO = null;
            this.f21260Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$unJoinRoom$1", f = "LiveRoomVM.kt", i = {}, l = {41, 41}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21263Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21264Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21265Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f21265Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f21265Oooo0oo, continuation);
            oooOO0O.f21264Oooo0oO = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21263Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21264Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21264Oooo0oO;
            String str = this.f21265Oooo0oo;
            this.f21264Oooo0oO = liveDataScope;
            this.f21263Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String url = o000OOo.f40914OooO0OO;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("barid", str);
            o00o000o2.OooO0O0("type", Boxing.boxInt(0));
            obj = o0000O0.OooO0OO(new RoomJoinFollowRepo$unJoinRoom$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21264Oooo0oO = null;
            this.f21263Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.LiveRoomVM$unJoinRoomAndUnFollowRoom$1", f = "LiveRoomVM.kt", i = {}, l = {57, 57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21266Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21267Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21268Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f21268Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f21268Oooo0oo, continuation);
            oooOOO0.f21267Oooo0oO = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21266Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21267Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21267Oooo0oO;
            String str = this.f21268Oooo0oo;
            this.f21267Oooo0oO = liveDataScope;
            this.f21266Oooo0o = 1;
            o000OOo o000ooo2 = o000OOo.f40912OooO00o;
            String url = o000OOo.f40915OooO0Oo;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("barid", str);
            o00o000o2.OooO0O0("type", Boxing.boxInt(1));
            obj = o0000O0.OooO0OO(new RoomJoinFollowRepo$unJoinRoomAndUnFollowRoom$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21267Oooo0oO = null;
            this.f21266Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public LiveRoomVM() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadEventState() {
        Long value = o00OO00O.f43313OooooOo.OooO00o().f43319OooO0Oo.getValue();
        if (value != null) {
            o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO(value, null));
        }
    }

    @NotNull
    public final MutableLiveData<Integer> addFriend(long targetUserId, @Nullable String message) {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00oO0o(targetUserId, message, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final OooOOOO<ApiResult<GifFaceBuyModel>> buyEmoji(int type, int catalogId) {
        return p484o0o000OO.OooOOO0.OooO00o(this, new OooO0O0(type, catalogId, null));
    }

    @NotNull
    public final LiveData<FriendCheckModel> checkIsFriend(long targetId) {
        return o0000O0O.OooO00o(new OooO0OO(targetId, null));
    }

    @NotNull
    public final OooOOOO<ApiResult<Object>> followRoom(boolean follow) {
        return p484o0o000OO.OooOOO0.OooO00o(this, new OooO0o(follow, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unFollowRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o0000O0O.OooO00o(new OooOO0(roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unJoinRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o0000O0O.OooO00o(new OooOO0O(roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unJoinRoomAndUnFollowRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o0000O0O.OooO00o(new OooOOO0(roomId, null));
    }
}
