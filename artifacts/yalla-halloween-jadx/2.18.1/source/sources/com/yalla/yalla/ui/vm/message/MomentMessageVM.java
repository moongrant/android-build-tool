package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.MomentMessage;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p254o00ooO0O.o0000O0O;
import p490o0o00O0.o0OoOo0;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJ\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eJF\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u000e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000bR\"\u0010\u0019\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/MomentMessageVM;", "Lcom/yalla/yalla/ui/vm/moment/MomentVM;", "", "updateCommentMsgReadState", "", "type", "Lkotlinx/coroutines/flow/Flow;", "Lo000o000/o0O0ooO;", "Lcom/yalla/yalla/common/db/table/MomentMessage;", "loadDataPaging", "deleteData", "", "mid", "deleteMsgItem", "Landroidx/lifecycle/LiveData;", "countCommentMsg", "momentId", "content", "commentId", "parentUserId", "parentUserName", "Lcom/yalla/yalla/common/model/ApiResult;", "", "commentWriteMsg", "", "lastTime", "J", "getLastTime", "()J", "setLastTime", "(J)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MomentMessageVM extends MomentVM {
    public static final int $stable = 8;
    private long lastTime;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$updateCommentMsgReadState$1", f = "MomentMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            Long value = OooOOO.f41216OooO00o.OooOo().getValue();
            if (value != null) {
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0o0(value);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$commentWriteMsg$1", f = "MomentMessageVM.kt", i = {}, l = {49, 49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25601Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25602Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25603Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f25604Oooo0oo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f25605OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f25606OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f25607OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, String str3, String str4, String str5, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25604Oooo0oo = str;
            this.f25601Oooo = str2;
            this.f25606OoooO00 = str3;
            this.f25605OoooO0 = str4;
            this.f25607OoooO0O = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f25604Oooo0oo, this.f25601Oooo, this.f25606OoooO00, this.f25605OoooO0, this.f25607OoooO0O, continuation);
            oooO00o.f25603Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25602Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25603Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25603Oooo0oO;
            o000Oo0 o000oo1 = o000Oo0.f42661OooO00o;
            String str = this.f25604Oooo0oo;
            String str2 = this.f25601Oooo;
            String str3 = this.f25606OoooO00;
            String str4 = this.f25605OoooO0;
            String str5 = this.f25607OoooO0O;
            this.f25603Oooo0oO = liveDataScope;
            this.f25602Oooo0o = 1;
            obj = o000oo1.OooO00o(str, str2, str3, str4, str5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25603Oooo0oO = null;
            this.f25602Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$deleteData$1", f = "MomentMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f25608Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25608Oooo0o = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25608Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = this.f25608Oooo0o;
            if (i == 0) {
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOO0o(OooOOO.f41216OooO00o.OooOo().getValue());
            } else if (i == 1) {
                o0OoOo0 o0oooo0OooOoO0 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO0, "DB.momentMessageDao()");
                o0oooo0OooOoO0.OooOO0O(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 1, (248 & 4) == 0 ? 2 : 0, 0, 0, 0, 0, 0);
            } else if (i == 2) {
                o0OoOo0 o0oooo0OooOoO1 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO1, "DB.momentMessageDao()");
                o0oooo0OooOoO1.OooOO0O(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 3, (248 & 4) == 0 ? 4 : 0, 0, 0, 0, 0, 0);
            } else if (i == 3) {
                o0OoOo0 o0oooo0OooOoO2 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO2, "DB.momentMessageDao()");
                o0oooo0OooOoO2.OooOO0O(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 5, (248 & 4) == 0 ? 6 : 0, 0, 0, 0, 0, 0);
            } else if (i == 4) {
                o0OoOo0 o0oooo0OooOoO3 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO3, "DB.momentMessageDao()");
                o0oooo0OooOoO3.OooOO0O(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 7, (248 & 4) == 0 ? 0 : 0, 0, 0, 0, 0, 0);
            } else if (i == 5) {
                p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooO0oo(OooOOO.f41216OooO00o.OooOo().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$deleteMsgItem$1", f = "MomentMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f25609Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25609Oooo0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f25609Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f25609Oooo0o;
            Intrinsics.checkNotNullParameter(mid, "mid");
            p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOO0(mid, OooOOO.f41216OooO00o.OooOo().getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o00O00o0<Integer, MomentMessage>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ int f25610Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(0);
            this.f25610Oooo0o = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, MomentMessage> invoke() {
            int i = this.f25610Oooo0o;
            if (i == 0) {
                return p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOOO(OooOOO.f41216OooO00o.OooOo().getValue());
            }
            if (i == 1) {
                o0OoOo0 o0oooo0OooOoO0 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO0, "DB.momentMessageDao()");
                return o0oooo0OooOoO0.OooOOOO(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 2, (248 & 4) == 0 ? 1 : 0, 0, 0, 0, 0, 0);
            }
            if (i == 2) {
                o0OoOo0 o0oooo0OooOoO1 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO1, "DB.momentMessageDao()");
                return o0oooo0OooOoO1.OooOOOO(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 3, (248 & 4) == 0 ? 4 : 0, 0, 0, 0, 0, 0);
            }
            if (i == 3) {
                o0OoOo0 o0oooo0OooOoO2 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
                Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO2, "DB.momentMessageDao()");
                return o0oooo0OooOoO2.OooOOOO(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 5, (248 & 4) == 0 ? 6 : 0, 0, 0, 0, 0, 0);
            }
            if (i != 4) {
                return i == 5 ? p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOOO0(OooOOO.f41216OooO00o.OooOo().getValue()) : p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOOO(OooOOO.f41216OooO00o.OooOo().getValue());
            }
            o0OoOo0 o0oooo0OooOoO3 = p491o0o00O00.OooO0OO.OooO00o().OooOoO0();
            Intrinsics.checkNotNullExpressionValue(o0oooo0OooOoO3, "DB.momentMessageDao()");
            return o0oooo0OooOoO3.OooOOOO(OooOOO.f41216OooO00o.OooOo().getValue(), (248 & 2) != 0 ? 0 : 7, (248 & 4) == 0 ? 0 : 0, 0, 0, 0, 0, 0);
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> commentWriteMsg(@NotNull String momentId, @NotNull String content, @Nullable String commentId, @Nullable String parentUserId, @Nullable String parentUserName) {
        Intrinsics.checkNotNullParameter(momentId, "momentId");
        Intrinsics.checkNotNullParameter(content, "content");
        return o0000O0O.OooO00o(new OooO00o(momentId, content, commentId, parentUserId, parentUserName, null));
    }

    @NotNull
    public final LiveData<Integer> countCommentMsg() {
        return FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(p491o0o00O00.OooO0OO.OooO00o().OooOoO0().OooOOOo(OooOOO.f41216OooO00o.OooOo().getValue()), 300L), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    public final void deleteData(int type) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(type, null), 2, null);
    }

    public final void deleteMsgItem(@NotNull String mid) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(mid, null), 2, null);
    }

    public final long getLastTime() {
        return this.lastTime;
    }

    @NotNull
    public final Flow<o0O0ooO<MomentMessage>> loadDataPaging(int type) {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0o pagingSourceFactory = new OooO0o(type);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o;
    }

    public final void setLastTime(long j) {
        this.lastTime = j;
    }

    public final void updateCommentMsgReadState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }
}
