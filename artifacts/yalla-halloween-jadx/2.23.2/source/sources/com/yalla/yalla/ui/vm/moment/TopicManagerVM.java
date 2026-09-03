package com.yalla.yalla.ui.vm.moment;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.db.table.UserInfo;
import com.yalla.yalla.data.repository.TopicRepository$circleAdmin$$inlined$call$1;
import com.yalla.yalla.data.repository.TopicRepository$circleAdminIns$$inlined$call$1;
import com.yalla.yalla.data.repository.TopicRepository$circleMemberList$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
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
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u000e\u0010\b\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicManagerVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "()V", "add", "", "dateSortCircleMemberList", "", "Ljava/lang/Long;", "del", "indexCircleMemberList", "circleAdmin", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/data/db/table/UserInfo;", "circleId", "", "circleAdminAdd", "toUserId", "circleAdminDel", "circleMemberList", "isRefresh", "", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TopicManagerVM extends BaseMomentDetailVM {
    public static final int $stable = 8;
    private final int add = 1;
    private final int del = 2;

    @Nullable
    private Long dateSortCircleMemberList = 0L;
    private int indexCircleMemberList = 1;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdmin$1", f = "TopicManagerVM.kt", i = {}, l = {27, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31898OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31899OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31900OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31899OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31899OooO0o, continuation);
            oooO00o.f31900OooO0o0 = obj;
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
            int i = this.f31898OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31900OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31900OooO0o0;
            this.f31900OooO0o0 = liveDataScope;
            this.f31898OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleAdmin");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31899OooO0o, "circleid");
            obj = OooOOO.OooO0Oo(new TopicRepository$circleAdmin$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31900OooO0o0 = null;
            this.f31898OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdminAdd$1", f = "TopicManagerVM.kt", i = {}, l = {31, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31901OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31902OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31903OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31904OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f31905OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, String str2, TopicManagerVM topicManagerVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31902OooO0o = str;
            this.f31904OooO0oO = str2;
            this.f31905OooO0oo = topicManagerVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31902OooO0o, this.f31904OooO0oO, this.f31905OooO0oo, continuation);
            oooO0O0.f31903OooO0o0 = obj;
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
            int i = this.f31901OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31903OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31903OooO0o0;
            int i2 = this.f31905OooO0oo.add;
            this.f31903OooO0o0 = liveDataScope;
            this.f31901OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleAdminIns");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31902OooO0o, "touserid");
            o0oooooOooO00o.OooO0O0(this.f31904OooO0oO, "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "type");
            obj = OooOOO.OooO0Oo(new TopicRepository$circleAdminIns$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31903OooO0o0 = null;
            this.f31901OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleAdminDel$1", f = "TopicManagerVM.kt", i = {}, l = {35, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31906OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31907OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31908OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31909OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f31910OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, String str2, TopicManagerVM topicManagerVM, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31907OooO0o = str;
            this.f31909OooO0oO = str2;
            this.f31910OooO0oo = topicManagerVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31907OooO0o, this.f31909OooO0oO, this.f31910OooO0oo, continuation);
            oooO0OO.f31908OooO0o0 = obj;
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
            int i = this.f31906OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31908OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31908OooO0o0;
            int i2 = this.f31910OooO0oo.del;
            this.f31908OooO0o0 = liveDataScope;
            this.f31906OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleAdminIns");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31907OooO0o, "touserid");
            o0oooooOooO00o.OooO0O0(this.f31909OooO0oO, "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "type");
            obj = OooOOO.OooO0Oo(new TopicRepository$circleAdminIns$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31908OooO0o0 = null;
            this.f31906OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicManagerVM$circleMemberList$1", f = "TopicManagerVM.kt", i = {0}, l = {20, 23}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserInfo>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31911OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f31912OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31913OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ TopicManagerVM f31914OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31915OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(boolean z, TopicManagerVM topicManagerVM, String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31912OooO0o = z;
            this.f31914OooO0oO = topicManagerVM;
            this.f31915OooO0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31912OooO0o, this.f31914OooO0oO, this.f31915OooO0oo, continuation);
            oooO0o.f31913OooO0o0 = obj;
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
            int i = this.f31911OooO0Oo;
            TopicManagerVM topicManagerVM = this.f31914OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31913OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31913OooO0o0;
            if (this.f31912OooO0o) {
                topicManagerVM.indexCircleMemberList = 1;
            } else {
                topicManagerVM.indexCircleMemberList++;
            }
            int i2 = topicManagerVM.indexCircleMemberList;
            Long l = topicManagerVM.dateSortCircleMemberList;
            long jLongValue = l != null ? l.longValue() : 0L;
            this.f31913OooO0o0 = liveDataScope;
            this.f31911OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Circle/CircleMemberlist");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 0);
            o0oooooOooO00o.OooO0O0(this.f31915OooO0oo, "circleid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(i2), "pageindex");
            o0oooooOooO00o.OooO0O0(Boxing.boxLong(jLongValue), "datesort");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(10), "pagesize");
            obj = OooOOO.OooO0Oo(new TopicRepository$circleMemberList$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            topicManagerVM.dateSortCircleMemberList = Boxing.boxLong(apiResult.getDateSort());
            topicManagerVM.indexCircleMemberList = apiResult.getPage().getPageIndex();
            this.f31913OooO0o0 = null;
            this.f31911OooO0Oo = 2;
            if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdmin(@NotNull String circleId) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o00oO0o.OooO00o(new OooO00o(circleId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdminAdd(@NotNull String toUserId, @NotNull String circleId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o00oO0o.OooO00o(new OooO0O0(toUserId, circleId, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleAdminDel(@NotNull String toUserId, @NotNull String circleId) {
        Intrinsics.checkNotNullParameter(toUserId, "toUserId");
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o00oO0o.OooO00o(new OooO0OO(toUserId, circleId, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserInfo>>> circleMemberList(@NotNull String circleId, boolean isRefresh) {
        Intrinsics.checkNotNullParameter(circleId, "circleId");
        return o00oO0o.OooO00o(new OooO0o(isRefresh, this, circleId, null));
    }
}
