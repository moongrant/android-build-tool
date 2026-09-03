package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.common.model.ApiResult;
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
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.o00OO0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicManagerVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "()V", "add", "", "dateSortCircleMemberList", "", "Ljava/lang/Long;", "del", "indexCircleMemberList", "circleAdmin", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/common/db/table/UserInfo;", "circleId", "", "circleAdminAdd", "toUserId", "circleAdminDel", "circleMemberList", "isRefresh", "", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class TopicManagerVM extends MomentVM {
    public static final int $stable = 8;
    private final int add = 1;
    private final int del = 2;

    @Nullable
    private Long dateSortCircleMemberList = 0L;
    private int indexCircleMemberList = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdmin$1", f = "TopicManagerVM.kt", i = {}, l = {27, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25969Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25970Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25971Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25971Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25971Oooo0oo, continuation);
            oooO00o.f25970Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25969Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25970Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25970Oooo0oO;
            o00OO0O0 o00oo0o1 = o00OO0O0.f42707OooO00o;
            String str = this.f25971Oooo0oo;
            this.f25970Oooo0oO = liveDataScope;
            this.f25969Oooo0o = 1;
            obj = o00oo0o1.OooO00o(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25970Oooo0oO = null;
            this.f25969Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdminAdd$1", f = "TopicManagerVM.kt", i = {}, l = {31, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25972Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25973Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25974Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25975Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f25976OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, TopicManagerVM topicManagerVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25975Oooo0oo = str;
            this.f25972Oooo = str2;
            this.f25976OoooO00 = topicManagerVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f25975Oooo0oo, this.f25972Oooo, this.f25976OoooO00, continuation);
            oooO0O0.f25974Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25973Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25974Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25974Oooo0oO;
            o00OO0O0 o00oo0o1 = o00OO0O0.f42707OooO00o;
            String str = this.f25975Oooo0oo;
            String str2 = this.f25972Oooo;
            int i2 = this.f25976OoooO00.add;
            this.f25974Oooo0oO = liveDataScope;
            this.f25973Oooo0o = 1;
            obj = o00oo0o1.OooO0O0(str, str2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25974Oooo0oO = null;
            this.f25973Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdminDel$1", f = "TopicManagerVM.kt", i = {}, l = {35, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25977Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25978Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25979Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25980Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f25981OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, TopicManagerVM topicManagerVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25980Oooo0oo = str;
            this.f25977Oooo = str2;
            this.f25981OoooO00 = topicManagerVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f25980Oooo0oo, this.f25977Oooo, this.f25981OoooO00, continuation);
            oooO0OO.f25979Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25978Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25979Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25979Oooo0oO;
            o00OO0O0 o00oo0o1 = o00OO0O0.f42707OooO00o;
            String str = this.f25980Oooo0oo;
            String str2 = this.f25977Oooo;
            int i2 = this.f25981OoooO00.del;
            this.f25979Oooo0oO = liveDataScope;
            this.f25978Oooo0o = 1;
            obj = o00oo0o1.OooO0O0(str, str2, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25979Oooo0oO = null;
            this.f25978Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleMemberList$1", f = "TopicManagerVM.kt", i = {0}, l = {20, 23}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f25982Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25983Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25984Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f25985Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25986OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, TopicManagerVM topicManagerVM, String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f25985Oooo0oo = z;
            this.f25982Oooo = topicManagerVM;
            this.f25986OoooO00 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f25985Oooo0oo, this.f25982Oooo, this.f25986OoooO00, continuation);
            oooO0o.f25984Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserInfo>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25983Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25984Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25984Oooo0oO;
            if (this.f25985Oooo0oo) {
                this.f25982Oooo.indexCircleMemberList = 1;
            } else {
                this.f25982Oooo.indexCircleMemberList++;
            }
            o00OO0O0 o00oo0o1 = o00OO0O0.f42707OooO00o;
            String str = this.f25986OoooO00;
            int i2 = this.f25982Oooo.indexCircleMemberList;
            Long l = this.f25982Oooo.dateSortCircleMemberList;
            long jLongValue = l != null ? l.longValue() : 0L;
            this.f25984Oooo0oO = liveDataScope;
            this.f25983Oooo0o = 1;
            obj = o00oo0o1.OooO0OO(str, i2, jLongValue, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            this.f25982Oooo.dateSortCircleMemberList = Boxing.boxLong(apiResult.getDateSort());
            this.f25982Oooo.indexCircleMemberList = apiResult.getPage().getPageIndex();
            this.f25984Oooo0oO = null;
            this.f25983Oooo0o = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdmin(@NotNull String circleId) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o0000O0O.OooO00o(new OooO00o(circleId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdminAdd(@NotNull String toUserId, @NotNull String circleId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o0000O0O.OooO00o(new OooO0O0(toUserId, circleId, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdminDel(@NotNull String toUserId, @NotNull String circleId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o0000O0O.OooO00o(new OooO0OO(toUserId, circleId, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleMemberList(@NotNull String circleId, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o0000O0O.OooO00o(new OooO0o(isRefresh, this, circleId, null));
    }
}
