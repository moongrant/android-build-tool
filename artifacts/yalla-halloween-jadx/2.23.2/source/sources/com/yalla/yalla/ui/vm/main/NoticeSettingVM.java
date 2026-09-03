package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.data.repository.UserConfigRepo$changeFriendRequestNotice$$inlined$call$1;
import com.yalla.yalla.data.repository.UserConfigRepo$loadFriendRequestNotice$$inlined$call$1;
import com.yalla.yalla.model.FriendRequestNoticeSettingModel;
import com.yalla.yalla.model.http.Response;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p394o0Oo0.OooOO0;
import p412o0Oo0o0O.o0O00;
import p414o0Oo0oO.oO00OOO;
import p415o0Oo0oO0.o00Ooo;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/NoticeSettingVM;", "Lo0Oo0/OooOO0;", "", "loadNoticeSetting", "", "open", "changeFriendRequestNotice", "changePrivateChatNotice", "Landroidx/lifecycle/MutableLiveData;", "friendRequest", "Landroidx/lifecycle/MutableLiveData;", "getFriendRequest", "()Landroidx/lifecycle/MutableLiveData;", "privateChat", "getPrivateChat", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class NoticeSettingVM extends OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<Boolean> friendRequest;

    @NotNull
    private final MutableLiveData<Boolean> privateChat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.NoticeSettingVM$changeFriendRequestNotice$1", f = "NoticeSettingVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31269OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ NoticeSettingVM f31270OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f31271OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, NoticeSettingVM noticeSettingVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31271OooO0o0 = z;
            this.f31270OooO0o = noticeSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31271OooO0o0, this.f31270OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31269OooO0Oo;
            boolean z = this.f31271OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00 o0o01 = o0O00.f46252OooO00o;
                this.f31269OooO0Oo = 1;
                o0o01.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new UserConfigRepo$changeFriendRequestNotice$$inlined$call$1(o0o01, null, z), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            boolean isSuccess = ((Response) obj).getIsSuccess();
            NoticeSettingVM noticeSettingVM = this.f31270OooO0o;
            if (isSuccess) {
                noticeSettingVM.getFriendRequest().setValue(Boxing.boxBoolean(z));
                oO00OOO oo00oooOooOO0o = o00Ooo.OooOO0o();
                oo00oooOooOO0o.getClass();
                oo00oooOooOO0o.OooO0o("friendRequestNotice" + o0O00oO0.OooOOo0().getValue(), z);
            } else {
                noticeSettingVM.getFriendRequest().setValue(noticeSettingVM.getFriendRequest().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.NoticeSettingVM$loadNoticeSetting$1", f = "NoticeSettingVM.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31272OooO0Oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return NoticeSettingVM.this.new OooO0O0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31272OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0O00 o0o01 = o0O00.f46252OooO00o;
                this.f31272OooO0Oo = 1;
                o0o01.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new UserConfigRepo$loadFriendRequestNotice$$inlined$call$1(o0o01, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            boolean isSuccess = response.getIsSuccess();
            NoticeSettingVM noticeSettingVM = NoticeSettingVM.this;
            if (isSuccess) {
                FriendRequestNoticeSettingModel friendRequestNoticeSettingModel = (FriendRequestNoticeSettingModel) response.getData();
                boolean z = false;
                if (friendRequestNoticeSettingModel != null) {
                    z = friendRequestNoticeSettingModel.getFriendRequest() == 1;
                }
                noticeSettingVM.getFriendRequest().setValue(Boxing.boxBoolean(z));
                oO00OOO oo00oooOooOO0o = o00Ooo.OooOO0o();
                oo00oooOooOO0o.getClass();
                oo00oooOooOO0o.OooO0o("friendRequestNotice" + o0O00oO0.OooOOo0().getValue(), z);
            } else {
                noticeSettingVM.getFriendRequest().setValue(noticeSettingVM.getFriendRequest().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    public NoticeSettingVM() {
        oO00OOO oo00oooOooOO0o = o00Ooo.OooOO0o();
        oo00oooOooOO0o.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.friendRequest = new MutableLiveData<>(Boolean.valueOf(oo00oooOooOO0o.OooO0O0("friendRequestNotice" + o0O00oO0.OooOOo0().getValue(), true)));
        this.privateChat = new MutableLiveData<>(Boolean.valueOf(o00Ooo.OooOO0o().OooOOOO()));
    }

    public final void changeFriendRequestNotice(boolean open) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(open, this, null), 3, null);
    }

    public final void changePrivateChatNotice(boolean open) {
        oO00OOO oo00oooOooOO0o = o00Ooo.OooOO0o();
        oo00oooOooOO0o.getClass();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        oo00oooOooOO0o.OooO0o("privateChatNotice" + o0O00oO0.OooOOo0().getValue(), open);
        this.privateChat.setValue(Boolean.valueOf(open));
    }

    @NotNull
    public final MutableLiveData<Boolean> getFriendRequest() {
        return this.friendRequest;
    }

    @NotNull
    public final MutableLiveData<Boolean> getPrivateChat() {
        return this.privateChat;
    }

    public final void loadNoticeSetting() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(null), 3, null);
    }
}
