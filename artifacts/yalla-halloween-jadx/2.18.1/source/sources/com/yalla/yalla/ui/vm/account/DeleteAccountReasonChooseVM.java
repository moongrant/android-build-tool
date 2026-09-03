package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.repository.AccountRepo$getCancelReason$$inlined$call$1;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import come.code.android.easyrefreshcontentstatus.ContentState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o0000O0;
import p480o0o000.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R7\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010#\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM;", "Lo00OO/OooO00o;", "", "loadFriendCount", "loadData", "Lcom/yalla/yalla/model/AccountBindInfo;", "accountInfo", "Lcom/yalla/yalla/model/AccountBindInfo;", "getAccountInfo", "()Lcom/yalla/yalla/model/AccountBindInfo;", "setAccountInfo", "(Lcom/yalla/yalla/model/AccountBindInfo;)V", "Lcome/code/android/easyrefreshcontentstatus/ContentState;", "<set-?>", "contentState$delegate", "Lo000oOoO/o0O00OO;", "getContentState", "()Lcome/code/android/easyrefreshcontentstatus/ContentState;", "setContentState", "(Lcome/code/android/easyrefreshcontentstatus/ContentState;)V", "contentState", "", "Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;", "cancelReasonList$delegate", "getCancelReasonList", "()Ljava/util/List;", "setCancelReasonList", "(Ljava/util/List;)V", "cancelReasonList", "", "friendCount$delegate", "getFriendCount", "()I", "setFriendCount", "(I)V", "friendCount", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class DeleteAccountReasonChooseVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private AccountBindInfo accountInfo;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO contentState = o0OOO00.OooO0Oo(ContentState.Loading);

    /* JADX INFO: renamed from: cancelReasonList$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO cancelReasonList = o0OOO00.OooO0Oo(CollectionsKt.emptyList());

    /* JADX INFO: renamed from: friendCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO friendCount = o0OOO00.OooO0Oo(0);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadData$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25300Oooo0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeleteAccountReasonChooseVM.this.new OooO00o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25300Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f25300Oooo0o = 1;
                OooO0OO oooO0OO = OooO0OO.f40754OooO00o;
                String str = OooO0OO.f40763OooOO0O;
                obj = o0000O0.OooO0OO(new AccountRepo$getCancelReason$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                DeleteAccountReasonChooseVM.this.setContentState(ContentState.Content);
                List<DeleteAccountReasonChooseModel> list = (List) apiResult.getData();
                if (list != null) {
                    DeleteAccountReasonChooseVM.this.setCancelReasonList(list);
                }
            } else {
                DeleteAccountReasonChooseVM.this.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadFriendCount$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25302Oooo0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadFriendCount$1$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ int f25304Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ DeleteAccountReasonChooseVM f25305Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25305Oooo0oO = deleteAccountReasonChooseVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f25305Oooo0oO, continuation);
                oooO00o.f25304Oooo0o = ((Number) obj).intValue();
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Integer num, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f25305Oooo0oO.setFriendCount(this.f25304Oooo0o);
                return Unit.INSTANCE;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DeleteAccountReasonChooseVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25302Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowOooOO0O = p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOO0O(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
                OooO00o oooO00o = new OooO00o(DeleteAccountReasonChooseVM.this, null);
                this.f25302Oooo0o = 1;
                if (FlowKt.collectLatest(flowOooOO0O, oooO00o, this) == coroutine_suspended) {
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

    public DeleteAccountReasonChooseVM() {
        loadData();
        loadFriendCount();
    }

    private final void loadFriendCount() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }

    @Nullable
    public final AccountBindInfo getAccountInfo() {
        return this.accountInfo;
    }

    @NotNull
    public final List<DeleteAccountReasonChooseModel> getCancelReasonList() {
        return (List) this.cancelReasonList.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final ContentState getContentState() {
        return (ContentState) this.contentState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getFriendCount() {
        return ((Number) this.friendCount.getValue()).intValue();
    }

    public final void loadData() {
        setContentState(ContentState.Loading);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(null), 3, null);
    }

    public final void setAccountInfo(@Nullable AccountBindInfo accountBindInfo) {
        this.accountInfo = accountBindInfo;
    }

    public final void setCancelReasonList(@NotNull List<DeleteAccountReasonChooseModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.cancelReasonList.setValue(list);
    }

    public final void setContentState(@NotNull ContentState contentState) {
        Intrinsics.checkNotNullParameter(contentState, "<set-?>");
        this.contentState.setValue(contentState);
    }

    public final void setFriendCount(int i) {
        this.friendCount.setValue(Integer.valueOf(i));
    }
}
