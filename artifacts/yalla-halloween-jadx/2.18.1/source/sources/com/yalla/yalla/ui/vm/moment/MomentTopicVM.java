package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FollowTopicModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yalla.yalla.model.TopicTypeTagModel;
import com.yalla.yalla.model.TopicVerifyState;
import java.util.Collection;
import java.util.List;
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
import p520o0o0O0O0.o000O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t0\b2\u0006\u0010\u0012\u001a\u00020\u000eJ*\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t0\b2\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\fJ\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t0\bJ*\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t0\b2\u0006\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\fJ \u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\t0\b2\u0006\u0010\u0018\u001a\u00020\u0019J\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00100\t0\bJ\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\t0\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/MomentTopicVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "()V", "circleNewListPageIndex", "", "circleOtherTypeListPageIndex", "circleRecommendListPageIndex", "circleJoin", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/FollowTopicModel;", "circleId", "", "join", "", "circleNewList", "", "Lcom/yalla/yalla/model/TopicInfoModel;", "isRefresh", "circleOtherTypeList", "typeId", "circlePersonRecommendList", "circleRecommendList", "circleSearch", "search", "", "circleTypeConfigList", "Lcom/yalla/yalla/model/TopicTypeTagModel;", "circleUserVerify", "Lcom/yalla/yalla/model/TopicVerifyState;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class MomentTopicVM extends MomentVM {
    public static final int $stable = 8;
    private int circleRecommendListPageIndex = 1;
    private int circleOtherTypeListPageIndex = 1;
    private int circleNewListPageIndex = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleRecommendList$1", f = "MomentTopicVM.kt", i = {0}, l = {45, 51}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ MomentTopicVM f25699Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25700Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25701Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25702Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ long f25703OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z, MomentTopicVM momentTopicVM, long j, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25702Oooo0oo = z;
            this.f25699Oooo = momentTopicVM;
            this.f25703OoooO00 = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f25702Oooo0oo, this.f25699Oooo, this.f25703OoooO00, continuation);
            oooO.f25701Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25700Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25701Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25701Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            int i2 = this.f25699Oooo.circleRecommendListPageIndex;
            long j = this.f25703OoooO00;
            this.f25701Oooo0oO = liveDataScope;
            this.f25700Oooo0o = 1;
            obj = o000o0.OooO0Oo(i2, 15, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                Collection collection = (Collection) apiResult.getData();
                if (!(collection == null || collection.isEmpty())) {
                    this.f25699Oooo.circleRecommendListPageIndex++;
                }
            }
            this.f25701Oooo0oO = null;
            this.f25700Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleJoin$1", f = "MomentTopicVM.kt", i = {}, l = {19, 19}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FollowTopicModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ boolean f25704Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25705Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25706Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25707Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, boolean z, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25707Oooo0oo = j;
            this.f25704Oooo = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25707Oooo0oo, this.f25704Oooo, continuation);
            oooO00o.f25706Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FollowTopicModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25705Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25706Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25706Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            long j = this.f25707Oooo0oo;
            int i2 = this.f25704Oooo ? 1 : 2;
            this.f25706Oooo0oO = liveDataScope;
            this.f25705Oooo0o = 1;
            obj = o000o0.OooO00o(j, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25706Oooo0oO = null;
            this.f25705Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleNewList$1", f = "MomentTopicVM.kt", i = {0}, l = {79, 85}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25708Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25709Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = MomentTopicVM.this.new OooO0O0(continuation);
            oooO0O0.f25709Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25708Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25709Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25709Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            int i2 = MomentTopicVM.this.circleNewListPageIndex;
            this.f25709Oooo0oO = liveDataScope;
            this.f25708Oooo0o = 1;
            obj = o000o0.OooO0O0(i2, 15, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                Collection collection = (Collection) apiResult.getData();
                if (!(collection == null || collection.isEmpty())) {
                    MomentTopicVM.this.circleNewListPageIndex++;
                }
            }
            this.f25709Oooo0oO = null;
            this.f25708Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleOtherTypeList$1", f = "MomentTopicVM.kt", i = {0}, l = {62, 68}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f25711Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25712Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25713Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25711Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = MomentTopicVM.this.new OooO0OO(this.f25711Oooo, continuation);
            oooO0OO.f25713Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25712Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25713Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25713Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            int i2 = MomentTopicVM.this.circleOtherTypeListPageIndex;
            long j = this.f25711Oooo;
            this.f25713Oooo0oO = liveDataScope;
            this.f25712Oooo0o = 1;
            obj = o000o0.OooO0Oo(i2, 15, j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                Collection collection = (Collection) apiResult.getData();
                if (!(collection == null || collection.isEmpty())) {
                    MomentTopicVM.this.circleOtherTypeListPageIndex++;
                }
            }
            this.f25713Oooo0oO = null;
            this.f25712Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circlePersonRecommendList$1", f = "MomentTopicVM.kt", i = {}, l = {106, 106}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25715Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25716Oooo0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation);
            oooO0o.f25716Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25715Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25716Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25716Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            this.f25716Oooo0oO = liveDataScope;
            this.f25715Oooo0o = 1;
            obj = o000o0.OooO0OO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25716Oooo0oO = null;
            this.f25715Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleSearch$1", f = "MomentTopicVM.kt", i = {}, l = {92, 92}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicInfoModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25717Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25718Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25719Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f25719Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f25719Oooo0oo, continuation);
            oooOO1.f25718Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicInfoModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25717Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25718Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25718Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            String str = this.f25719Oooo0oo;
            this.f25718Oooo0oO = liveDataScope;
            this.f25717Oooo0o = 1;
            obj = o000o0.OooO0o0(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25718Oooo0oO = null;
            this.f25717Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleTypeConfigList$1", f = "MomentTopicVM.kt", i = {}, l = {26, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<TopicTypeTagModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25720Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25721Oooo0oO;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(continuation);
            oooOO0O.f25721Oooo0oO = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<TopicTypeTagModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25720Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25721Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25721Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            this.f25721Oooo0oO = liveDataScope;
            this.f25720Oooo0o = 1;
            obj = o000o0.OooO0o(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25721Oooo0oO = null;
            this.f25720Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.MomentTopicVM$circleUserVerify$1", f = "MomentTopicVM.kt", i = {}, l = {99, 99}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicVerifyState>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25722Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25723Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25724Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(long j, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f25724Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = new OooOOO0(this.f25724Oooo0oo, continuation);
            oooOOO0.f25723Oooo0oO = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicVerifyState>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25722Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25723Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25723Oooo0oO;
            o000O0 o000o0 = o000O0.f42445OooO00o;
            long j = this.f25724Oooo0oo;
            this.f25723Oooo0oO = liveDataScope;
            this.f25722Oooo0o = 1;
            obj = o000o0.OooO0oO(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25723Oooo0oO = null;
            this.f25722Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ LiveData circleOtherTypeList$default(MomentTopicVM momentTopicVM, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return momentTopicVM.circleOtherTypeList(z, j);
    }

    public static /* synthetic */ LiveData circleRecommendList$default(MomentTopicVM momentTopicVM, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        return momentTopicVM.circleRecommendList(z, j);
    }

    @NotNull
    public final LiveData<ApiResult<FollowTopicModel>> circleJoin(long circleId, boolean join) {
        return o0000O0O.OooO00o(new OooO00o(circleId, join, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicInfoModel>>> circleNewList(boolean isRefresh) {
        return o0000O0O.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicInfoModel>>> circleOtherTypeList(boolean isRefresh, long typeId) {
        return o0000O0O.OooO00o(new OooO0OO(typeId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicInfoModel>>> circlePersonRecommendList() {
        return o0000O0O.OooO00o(new OooO0o(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicInfoModel>>> circleRecommendList(boolean isRefresh, long typeId) {
        return o0000O0O.OooO00o(new OooO(isRefresh, this, typeId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicInfoModel>>> circleSearch(@NotNull String search) {
        Intrinsics.checkNotNullParameter(search, "search");
        return o0000O0O.OooO00o(new OooOO0(search, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<TopicTypeTagModel>>> circleTypeConfigList() {
        return o0000O0O.OooO00o(new OooOO0O(null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicVerifyState>> circleUserVerify(long circleId) {
        return o0000O0O.OooO00o(new OooOOO0(circleId, null));
    }
}
