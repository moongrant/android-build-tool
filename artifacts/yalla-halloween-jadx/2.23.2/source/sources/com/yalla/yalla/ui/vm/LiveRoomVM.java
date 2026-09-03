package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o000000;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.repository.EventRepo$getRoomEventState$$inlined$call$1;
import com.yalla.yalla.data.repository.RoomRepo$followRoom$$inlined$call$1;
import com.yalla.yalla.mixedroom.MixedRoomDataSource;
import com.yalla.yalla.model.FriendCheckModel;
import com.yalla.yalla.model.GifFaceBuyModel;
import com.yalla.yalla.model.chat.ChatModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.RoomJoinFollowRepo$buyEmoji$$inlined$call$1;
import com.yalla.yalla.repository.RoomJoinFollowRepo$unFollowRoom$$inlined$call$1;
import com.yalla.yalla.repository.RoomJoinFollowRepo$unJoinRoom$$inlined$call$1;
import com.yalla.yalla.repository.RoomJoinFollowRepo$unJoinRoomAndUnFollowRoom$$inlined$call$1;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p412o0Oo0o0O.o000O0;
import p412o0Oo0o0O.o000OO00;
import p424o0OoO0Oo.o00O;
import p424o0OoO0Oo.o00OO0O0;
import p532o0o0OOo0.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00062\u0006\u0010\u000f\u001a\u00020\nJ\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\u00152\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r¨\u0006\u001f"}, d2 = {"Lcom/yalla/yalla/ui/vm/LiveRoomVM;", "Lo0Oo0/OooOO0;", "", "loadEventState", "", "targetId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/FriendCheckModel;", "checkIsFriend", "targetUserId", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "Landroidx/lifecycle/MutableLiveData;", "", "addFriend", ContributionFragment.ARG_1, "Lcom/yalla/yalla/model/http/ApiResult;", "", "unJoinRoom", "", "follow", "Lo0OoO0Oo/o00OO0O0;", "followRoom", "unFollowRoom", "unJoinRoomAndUnFollowRoom", "type", "catalogId", "Lcom/yalla/yalla/model/GifFaceBuyModel;", "buyEmoji", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class LiveRoomVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$loadEventState$1$1", f = "LiveRoomVM.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30890OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Long f30891OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(Long l, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f30891OooO0o0 = l;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f30891OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30890OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Long roomId = this.f30891OooO0o0;
                Intrinsics.checkNotNullExpressionValue(roomId, "$roomId");
                long jLongValue = roomId.longValue();
                this.f30890OooO0Oo = 1;
                String strOooO0O0 = oo000o.OooO0O0("Webservers/Event/GetFirstByRoom");
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0O0, "url", strOooO0O0, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(jLongValue), ContributionFragment.ARG_1);
                if (OooOOO.OooO0Oo(new EventRepo$getRoomEventState$$inlined$call$1(o0oooooOooO00o, null), this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$1", f = "LiveRoomVM.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30892OooO0Oo;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.LiveRoomVM$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0349OooO00o<T> implements FlowCollector {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ LiveRoomVM f30894OooO0Oo;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.LiveRoomVM$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$1$1$1", f = "LiveRoomVM.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0350OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public int f30895OooO0Oo;

                public C0350OooO00o(Continuation<? super C0350OooO00o> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0350OooO00o(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return new C0350OooO00o(continuation).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.f30895OooO0Oo;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f30895OooO0Oo = 1;
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

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.LiveRoomVM$OooO00o$OooO00o$OooO0O0 */
            @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$1$1", f = "LiveRoomVM.kt", i = {0}, l = {30}, m = "emit", n = {"this"}, s = {"L$0"})
            public static final class OooO0O0 extends ContinuationImpl {

                /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
                public C0349OooO00o f30896OooO0Oo;

                /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                public final /* synthetic */ C0349OooO00o<T> f30897OooO0o;

                /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                public /* synthetic */ Object f30898OooO0o0;

                /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                public int f30899OooO0oO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public OooO0O0(C0349OooO00o<? super T> c0349OooO00o, Continuation<? super OooO0O0> continuation) {
                    super(continuation);
                    this.f30897OooO0o = c0349OooO00o;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.f30898OooO0o0 = obj;
                    this.f30899OooO0oO |= Integer.MIN_VALUE;
                    return this.f30897OooO0o.OooO00o(false, this);
                }
            }

            public C0349OooO00o(LiveRoomVM liveRoomVM) {
                this.f30894OooO0Oo = liveRoomVM;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Nullable
            public final Object OooO00o(boolean z, @NotNull Continuation<? super Unit> continuation) {
                OooO0O0 oooO0O0;
                C0349OooO00o<T> c0349OooO00o;
                if (continuation instanceof OooO0O0) {
                    oooO0O0 = (OooO0O0) continuation;
                    int i = oooO0O0.f30899OooO0oO;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        oooO0O0.f30899OooO0oO = i - Integer.MIN_VALUE;
                    } else {
                        oooO0O0 = new OooO0O0(this, continuation);
                    }
                } else {
                    oooO0O0 = new OooO0O0(this, continuation);
                }
                Object obj = oooO0O0.f30898OooO0o0;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = oooO0O0.f30899OooO0oO;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C0350OooO00o c0350OooO00o = new C0350OooO00o(null);
                    oooO0O0.f30896OooO0Oo = this;
                    oooO0O0.f30899OooO0oO = 1;
                    if (BuildersKt.withContext(io2, c0350OooO00o, oooO0O0) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c0349OooO00o = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0349OooO00o = oooO0O0.f30896OooO0Oo;
                    ResultKt.throwOnFailure(obj);
                }
                c0349OooO00o.f30894OooO0Oo.loadEventState();
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return OooO00o(((Boolean) obj).booleanValue(), continuation);
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
            int i = this.f30892OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableSharedFlow<Boolean> mutableSharedFlow = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24542OooO0oO;
                C0349OooO00o c0349OooO00o = new C0349OooO00o(LiveRoomVM.this);
                this.f30892OooO0Oo = 1;
                if (mutableSharedFlow.collect(c0349OooO00o, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$buyEmoji$1", f = "LiveRoomVM.kt", i = {}, l = {76}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<o00OO0O0<ApiResult<GifFaceBuyModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30900OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ int f30901OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30902OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f30903OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, int i2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30901OooO0o = i;
            this.f30903OooO0oO = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f30901OooO0o, this.f30903OooO0oO, continuation);
            oooO0O0.f30902OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<GifFaceBuyModel>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30900OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f30902OooO0o0;
                this.f30902OooO0o0 = o00oo0o2;
                this.f30900OooO0Oo = 1;
                String str = p382o0OOoo.OooOOO.f43279OooO0o;
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 1);
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f30901OooO0o), "type");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(this.f30903OooO0oO), "catalogId");
                Object objOooO0Oo = OooOOO.OooO0Oo(new RoomJoinFollowRepo$buyEmoji$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f30902OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            o00oo0o1.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$checkIsFriend$1", f = "LiveRoomVM.kt", i = {}, l = {39, 39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<FriendCheckModel>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30904OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f30905OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30906OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f30905OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f30905OooO0o, continuation);
            oooO0OO.f30906OooO0o0 = obj;
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
            int i = this.f30904OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30906OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30906OooO0o0;
            this.f30906OooO0o0 = liveDataScope;
            this.f30904OooO0Oo = 1;
            obj = o000OO00.f46018OooO00o.OooO0o(this.f30905OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30906OooO0o0 = null;
            this.f30904OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$followRoom$1", f = "LiveRoomVM.kt", i = {0}, l = {48}, m = "invokeSuspend", n = {"$this$jobLiveData"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<o00OO0O0<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30907OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30908OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30909OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f30908OooO0o = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f30908OooO0o, continuation);
            oooO0o.f30909OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(o00OO0O0<ApiResult<Object>> o00oo0o1, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(o00oo0o1, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            o00OO0O0 o00oo0o1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30907OooO0Oo;
            com.yalla.yalla.service.room.OooO0O0.OooO00o oooO00o = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO;
            boolean z = this.f30908OooO0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0O0 o00oo0o2 = (o00OO0O0) this.f30909OooO0o0;
                Long value = oooO00o.OooO00o().f24539OooO0Oo.getValue();
                if (value == null) {
                    value = Boxing.boxLong(0L);
                }
                long jLongValue = value.longValue();
                this.f30909OooO0o0 = o00oo0o2;
                this.f30907OooO0Oo = 1;
                String str = p382o0OOoo.OooOOO.f43280OooO0o0;
                o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0);
                o0oooooOooO00o.OooO0O0(Boxing.boxLong(jLongValue), "barid");
                o0oooooOooO00o.OooO0O0(Boxing.boxInt(o000000.OooO0O0(Boxing.boxBoolean(!z))), "type");
                Object objOooO0Oo = OooOOO.OooO0Oo(new RoomRepo$followRoom$$inlined$call$1(o0oooooOooO00o, null), this);
                if (objOooO0Oo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o00oo0o1 = o00oo0o2;
                obj = objOooO0Oo;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o00oo0o1 = (o00OO0O0) this.f30909OooO0o0;
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                oooO00o.OooO00o().f24545OooOO0O.postValue(Boxing.boxBoolean(z));
                if (z) {
                    ChatModel chatModel = new ChatModel();
                    chatModel.setType(27);
                    MixedRoomDataSource.OooO0o0().OooO00o(chatModel);
                }
            }
            o00oo0o1.postValue(apiResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$unFollowRoom$1", f = "LiveRoomVM.kt", i = {}, l = {57, 57}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30910OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f30911OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30912OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f30911OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f30911OooO0o, continuation);
            oooOO1.f30912OooO0o0 = obj;
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
            int i = this.f30910OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30912OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30912OooO0o0;
            this.f30912OooO0o0 = liveDataScope;
            this.f30910OooO0Oo = 1;
            String str = p382o0OOoo.OooOOO.f43278OooO0Oo;
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(this.f30911OooO0o, "barid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(1), "type");
            obj = OooOOO.OooO0Oo(new RoomJoinFollowRepo$unFollowRoom$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30912OooO0o0 = null;
            this.f30910OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$unJoinRoom$1", f = "LiveRoomVM.kt", i = {}, l = {44, 44}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30913OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f30914OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30915OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(String str, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f30914OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f30914OooO0o, continuation);
            oooOO0O.f30915OooO0o0 = obj;
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
            int i = this.f30913OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30915OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30915OooO0o0;
            this.f30915OooO0o0 = liveDataScope;
            this.f30913OooO0Oo = 1;
            String str = p382o0OOoo.OooOOO.f43276OooO0O0;
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(this.f30914OooO0o, "barid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(0), "type");
            obj = OooOOO.OooO0Oo(new RoomJoinFollowRepo$unJoinRoom$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30915OooO0o0 = null;
            this.f30913OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.LiveRoomVM$unJoinRoomAndUnFollowRoom$1", f = "LiveRoomVM.kt", i = {}, l = {60, 60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30916OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f30917OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30918OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(String str, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f30917OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f30917OooO0o, continuation);
            oooOOO0.f30918OooO0o0 = obj;
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
            int i = this.f30916OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30918OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30918OooO0o0;
            this.f30918OooO0o0 = liveDataScope;
            this.f30916OooO0Oo = 1;
            String str = p382o0OOoo.OooOOO.f43277OooO0OO;
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(this.f30917OooO0o, "barid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(1), "type");
            obj = OooOOO.OooO0Oo(new RoomJoinFollowRepo$unJoinRoomAndUnFollowRoom$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30918OooO0o0 = null;
            this.f30916OooO0Oo = 2;
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
        Long value = com.yalla.yalla.service.room.OooO0O0.f24533OoooOOO.OooO00o().f24539OooO0Oo.getValue();
        if (value != null) {
            OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO(value, null));
        }
    }

    @NotNull
    public final MutableLiveData<Integer> addFriend(long targetUserId, @Nullable String message) {
        String source = (String) CollectionsKt.last((List) oOO00O.OooO00o());
        Intrinsics.checkNotNullParameter(source, "source");
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000O0(targetUserId, message, source, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final o00OO0O0<ApiResult<GifFaceBuyModel>> buyEmoji(int type, int catalogId) {
        return o00O.OooO00o(this, new OooO0O0(type, catalogId, null));
    }

    @NotNull
    public final LiveData<FriendCheckModel> checkIsFriend(long targetId) {
        return o00oO0o.OooO00o(new OooO0OO(targetId, null));
    }

    @NotNull
    public final o00OO0O0<ApiResult<Object>> followRoom(boolean follow) {
        return o00O.OooO00o(this, new OooO0o(follow, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unFollowRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o00oO0o.OooO00o(new OooOO0(roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unJoinRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o00oO0o.OooO00o(new OooOO0O(roomId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Object>> unJoinRoomAndUnFollowRoom(@NotNull String roomId) {
        Intrinsics.checkNotNullParameter(roomId, "roomId");
        return o00oO0o.OooO00o(new OooOOO0(roomId, null));
    }
}
