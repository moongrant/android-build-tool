package com.yalla.yalla.ui.vm.account;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.lifecycle.ViewModelKt;
import com.code.android.uikit.contentstate.ContentState;
import com.code.android.util.OooOOO;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getCancelReason$$inlined$call$1;
import com.yalla.yalla.model.AccountBindInfo;
import com.yalla.yalla.model.DeleteAccountReasonChooseModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.module.account.ui.screen.LinkedAccountsScreen;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p381o0OOoo0O.Oooo0;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o0O00;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR7\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00168F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\b\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM;", "Lo0Oo00oO/o0O0O00;", "", "loadFriendCount", "loadData", "Lcom/code/android/uikit/contentstate/ContentState;", "<set-?>", "contentState$delegate", "Landroidx/compose/runtime/MutableState;", "getContentState", "()Lcom/code/android/uikit/contentstate/ContentState;", "setContentState", "(Lcom/code/android/uikit/contentstate/ContentState;)V", "contentState", "", "Lcom/yalla/yalla/model/DeleteAccountReasonChooseModel;", "cancelReasonList$delegate", "getCancelReasonList", "()Ljava/util/List;", "setCancelReasonList", "(Ljava/util/List;)V", "cancelReasonList", "", "friendCount$delegate", "getFriendCount", "()I", "setFriendCount", "(I)V", "friendCount", "Lcom/yalla/yalla/model/AccountBindInfo;", LinkedAccountsScreen.ACCOUNT_INFO_PARAM, "Lcom/yalla/yalla/model/AccountBindInfo;", "getAccountInfo", "()Lcom/yalla/yalla/model/AccountBindInfo;", "setAccountInfo", "(Lcom/yalla/yalla/model/AccountBindInfo;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDeleteAccountReasonChooseVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeleteAccountReasonChooseVM.kt\ncom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,57:1\n81#2:58\n107#2,2:59\n81#2:61\n107#2,2:62\n81#2:64\n107#2,2:65\n*S KotlinDebug\n*F\n+ 1 DeleteAccountReasonChooseVM.kt\ncom/yalla/yalla/ui/vm/account/DeleteAccountReasonChooseVM\n*L\n18#1:58\n18#1:59,2\n20#1:61\n20#1:62,2\n22#1:64\n22#1:65,2\n*E\n"})
public final class DeleteAccountReasonChooseVM extends o0O0O00 {
    public static final int $stable = 8;

    @Nullable
    private AccountBindInfo accountInfo;

    /* JADX INFO: renamed from: contentState$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState contentState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ContentState.Loading, null, 2, null);

    /* JADX INFO: renamed from: cancelReasonList$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState cancelReasonList = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);

    /* JADX INFO: renamed from: friendCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState friendCount = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadData$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31601OooO0Oo;

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
            int i = this.f31601OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f31601OooO0Oo = 1;
                accountRepo.getClass();
                String str = Oooo0.f44259OooOO0o;
                obj = OooOOO.OooO0Oo(new AccountRepo$getCancelReason$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null), this);
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
            boolean zIsSuccess = apiResult.isSuccess();
            DeleteAccountReasonChooseVM deleteAccountReasonChooseVM = DeleteAccountReasonChooseVM.this;
            if (zIsSuccess) {
                deleteAccountReasonChooseVM.setContentState(ContentState.Content);
                List<DeleteAccountReasonChooseModel> list = (List) apiResult.getData();
                if (list != null) {
                    deleteAccountReasonChooseVM.setCancelReasonList(list);
                }
            } else {
                deleteAccountReasonChooseVM.setContentState(ContentState.Error);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadFriendCount$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31603OooO0Oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.account.DeleteAccountReasonChooseVM$loadFriendCount$1$1", f = "DeleteAccountReasonChooseVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<Integer, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ int f31605OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ DeleteAccountReasonChooseVM f31606OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(DeleteAccountReasonChooseVM deleteAccountReasonChooseVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31606OooO0o0 = deleteAccountReasonChooseVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31606OooO0o0, continuation);
                oooO00o.f31605OooO0Oo = ((Number) obj).intValue();
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
                this.f31606OooO0o0.setFriendCount(this.f31605OooO0Oo);
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
            int i = this.f31603OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                Flow<Integer> flowOooO0o = o0o00OooOOo.OooO0o(((Number) OooO0OO.OooO0O0()).longValue());
                OooO00o oooO00o = new OooO00o(DeleteAccountReasonChooseVM.this, null);
                this.f31603OooO0Oo = 1;
                if (FlowKt.collectLatest(flowOooO0o, oooO00o, this) == coroutine_suspended) {
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
