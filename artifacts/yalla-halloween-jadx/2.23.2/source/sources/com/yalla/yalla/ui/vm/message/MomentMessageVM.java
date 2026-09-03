package com.yalla.yalla.ui.vm.message;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0O0O00;
import androidx.paging.o0OOO0o;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.data.db.table.MomentMessage;
import com.yalla.yalla.data.repository.MomentMessageApiRepo$commentWrite$$inlined$call$1;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.vm.moment.BaseMomentDetailVM;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p101o000oo.o00O000;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p380o0OOoOo.o0ooOOo;
import p380o0OOoOo.oo000o;
import p407o0Oo0Oo.o00O0OOO;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;
import p590o0oOooo0.oOO0OOO;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bJF\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/vm/message/MomentMessageVM;", "Lcom/yalla/yalla/ui/vm/moment/BaseMomentDetailVM;", "", "updateCommentMsgReadState", "", "type", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/o0OOO0o;", "Lcom/yalla/yalla/data/db/table/MomentMessage;", "loadDataPaging", "deleteData", "", "mid", "deleteMsgItem", "momentId", "content", "commentId", "parentUserId", "parentUserName", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "commentWriteMsg", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MomentMessageVM extends BaseMomentDetailVM {
    public static final int $stable = 0;

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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Long l = (Long) o0O00oO0.OooOOo0().getValue();
            if (l != null) {
                o00Oo0.OooO00o().OooOo().OooO00o(l);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$commentWriteMsg$1", f = "MomentMessageVM.kt", i = {}, l = {43, 43}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f31396OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31397OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31398OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31399OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31400OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f31401OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f31402OooOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, String str3, String str4, String str5, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31398OooO0o = str;
            this.f31400OooO0oO = str2;
            this.f31401OooO0oo = str3;
            this.f31396OooO = str4;
            this.f31402OooOO0 = str5;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f31398OooO0o, this.f31400OooO0oO, this.f31401OooO0oo, this.f31396OooO, this.f31402OooOO0, continuation);
            oooO00o.f31399OooO0o0 = obj;
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
            int i = this.f31397OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31399OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31399OooO0o0;
            this.f31399OooO0o0 = liveDataScope;
            this.f31397OooO0Oo = 1;
            String strOooO0Oo = oo000o.OooO0Oo("/Webservers/Comment/Write");
            o0ooOOo o0oooooOooO00o = p391o0OOooo0.oo000o.OooO00o(strOooO0Oo, "url", strOooO0Oo, 1);
            o0oooooOooO00o.OooO0O0(this.f31398OooO0o, "dyid");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f31400OooO0oO), "content");
            o0oooooOooO00o.OooO0O0(this.f31401OooO0oo, "cid");
            o0oooooOooO00o.OooO0O0(this.f31396OooO, "parentUserId");
            o0oooooOooO00o.OooO0O0(oOO0OOO.OooO0O0(this.f31402OooOO0), "parentUserName");
            obj = OooOOO.OooO0Oo(new MomentMessageApiRepo$commentWrite$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31399OooO0o0 = null;
            this.f31397OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$deleteData$1", f = "MomentMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f31403OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31403OooO0Oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31403OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            int i = this.f31403OooO0Oo;
            if (i == 0) {
                o00O0OOO o00o0oooOooOo = o00Oo0.OooO00o().OooOo();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo.OooOO0o((Long) o0O00oO0.OooOOo0().getValue());
            } else if (i == 1) {
                o00O0OOO o00o0oooOooOo2 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo2, "momentMessageDao(...)");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo2.OooO0Oo((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 1, (248 & 4) != 0 ? 0 : 2, 0, 0, 0, 0, 0);
            } else if (i == 2) {
                o00O0OOO o00o0oooOooOo3 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo3, "momentMessageDao(...)");
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo3.OooO0Oo((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 3, (248 & 4) != 0 ? 0 : 4, 0, 0, 0, 0, 0);
            } else if (i == 3) {
                o00O0OOO o00o0oooOooOo4 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo4, "momentMessageDao(...)");
                o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo4.OooO0Oo((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 5, (248 & 4) != 0 ? 0 : 6, 0, 0, 0, 0, 0);
            } else if (i == 4) {
                o00O0OOO o00o0oooOooOo5 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo5, "momentMessageDao(...)");
                o0O00oO0 o0o00oo5 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo5.OooO0Oo((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 7, (248 & 4) != 0 ? 0 : 0, 0, 0, 0, 0, 0);
            } else if (i == 5) {
                o00O0OOO o00o0oooOooOo6 = o00Oo0.OooO00o().OooOo();
                o0O00oO0 o0o00oo6 = o0O00oO0.f47936OooO00o;
                o00o0oooOooOo6.OooO0OO((Long) o0O00oO0.OooOOo0().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.message.MomentMessageVM$deleteMsgItem$1", f = "MomentMessageVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f31404OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31404OooO0Oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f31404OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String mid = this.f31404OooO0Oo;
            Intrinsics.checkNotNullParameter(mid, "mid");
            o00O0OOO o00o0oooOooOo = o00Oo0.OooO00o().OooOo();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o00o0oooOooOo.OooOO0O(mid, (Long) o0O00oO0.OooOOo0().getValue());
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<o0O0O00<Integer, MomentMessage>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f31405OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(0);
            this.f31405OooO0Oo = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, MomentMessage> invoke() {
            int i = this.f31405OooO0Oo;
            if (i == 0) {
                o00O0OOO o00o0oooOooOo = o00Oo0.OooO00o().OooOo();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo.OooOOOO((Long) o0O00oO0.OooOOo0().getValue());
            }
            if (i == 1) {
                o00O0OOO o00o0oooOooOo2 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo2, "momentMessageDao(...)");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo2.OooO0o0((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 2, (248 & 4) != 0 ? 0 : 1, 0, 0, 0, 0, 0);
            }
            if (i == 2) {
                o00O0OOO o00o0oooOooOo3 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo3, "momentMessageDao(...)");
                o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo3.OooO0o0((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 3, (248 & 4) != 0 ? 0 : 4, 0, 0, 0, 0, 0);
            }
            if (i == 3) {
                o00O0OOO o00o0oooOooOo4 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo4, "momentMessageDao(...)");
                o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo4.OooO0o0((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 5, (248 & 4) != 0 ? 0 : 6, 0, 0, 0, 0, 0);
            }
            if (i == 4) {
                o00O0OOO o00o0oooOooOo5 = o00Oo0.OooO00o().OooOo();
                Intrinsics.checkNotNullExpressionValue(o00o0oooOooOo5, "momentMessageDao(...)");
                o0O00oO0 o0o00oo5 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo5.OooO0o0((Long) o0O00oO0.OooOOo0().getValue(), (248 & 2) != 0 ? 0 : 7, (248 & 4) != 0 ? 0 : 0, 0, 0, 0, 0, 0);
            }
            if (i == 5) {
                o00O0OOO o00o0oooOooOo6 = o00Oo0.OooO00o().OooOo();
                o0O00oO0 o0o00oo6 = o0O00oO0.f47936OooO00o;
                return o00o0oooOooOo6.OooOOO0((Long) o0O00oO0.OooOOo0().getValue());
            }
            o00O0OOO o00o0oooOooOo7 = o00Oo0.OooO00o().OooOo();
            o0O00oO0 o0o00oo7 = o0O00oO0.f47936OooO00o;
            return o00o0oooOooOo7.OooOOOO((Long) o0O00oO0.OooOOo0().getValue());
        }
    }

    @NotNull
    public final LiveData<ApiResult<Object>> commentWriteMsg(@NotNull String momentId, @NotNull String content, @Nullable String commentId, @Nullable String parentUserId, @Nullable String parentUserName) {
        Intrinsics.checkNotNullParameter(momentId, "momentId");
        Intrinsics.checkNotNullParameter(content, "content");
        return o00oO0o.OooO00o(new OooO00o(momentId, content, commentId, parentUserId, parentUserName, null));
    }

    public final void deleteData(int type) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(type, null), 2, null);
    }

    public final void deleteMsgItem(@NotNull String mid) {
        Intrinsics.checkNotNullParameter(mid, "mid");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0OO(mid, null), 2, null);
    }

    @NotNull
    public final Flow<o0OOO0o<MomentMessage>> loadDataPaging(int type) {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO0o pagingSourceFactory = new OooO0o(type);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        return p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof p101o000oo.o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope);
    }

    public final void updateCommentMsgReadState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO(null), 2, null);
    }
}
