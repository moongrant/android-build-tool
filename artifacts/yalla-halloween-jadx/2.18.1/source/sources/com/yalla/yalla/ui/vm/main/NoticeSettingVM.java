package com.yalla.yalla.ui.vm.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.repository.UserConfigRepo$changeFriendRequestNotice$$inlined$call$1;
import com.yalla.yalla.data.repository.UserConfigRepo$loadFriendRequestNotice$$inlined$call$1;
import com.yalla.yalla.model.FriendRequestNoticeSettingModel;
import java.util.Objects;
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
import p497o0o00Oo.OooOOO0;
import p498o0o00Oo0.OooOOO;
import p499o0o00OoO.o00000OO;
import p520o0o0O0O0.o00OO0OO;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/NoticeSettingVM;", "Lo00OO/OooO00o;", "", "loadNoticeSetting", "", "open", "changeFriendRequestNotice", "changePrivateChatNotice", "Landroidx/lifecycle/MutableLiveData;", "friendRequest", "Landroidx/lifecycle/MutableLiveData;", "getFriendRequest", "()Landroidx/lifecycle/MutableLiveData;", "privateChat", "getPrivateChat", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class NoticeSettingVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<Boolean> friendRequest;

    @NotNull
    private final MutableLiveData<Boolean> privateChat;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.NoticeSettingVM$changeFriendRequestNotice$1", f = "NoticeSettingVM.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25513Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f25514Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ NoticeSettingVM f25515Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, NoticeSettingVM noticeSettingVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25514Oooo0oO = z;
            this.f25515Oooo0oo = noticeSettingVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25514Oooo0oO, this.f25515Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25513Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0OO o00oo0oo = o00OO0OO.f42717OooO00o;
                boolean z = this.f25514Oooo0oO;
                this.f25513Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new UserConfigRepo$changeFriendRequestNotice$$inlined$call$1(o00oo0oo, null, z), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Response) obj).getIsSuccess()) {
                this.f25515Oooo0oo.getFriendRequest().setValue(Boxing.boxBoolean(this.f25514Oooo0oO));
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                OooOOO0.OooOOO0().OooOOO(this.f25514Oooo0oO);
            } else {
                this.f25515Oooo0oo.getFriendRequest().setValue(this.f25515Oooo0oo.getFriendRequest().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.NoticeSettingVM$loadNoticeSetting$1", f = "NoticeSettingVM.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25516Oooo0o;

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
            int i = this.f25516Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o00OO0OO o00oo0oo = o00OO0OO.f42717OooO00o;
                this.f25516Oooo0o = 1;
                obj = BuildersKt.withContext(Dispatchers.getIO(), new UserConfigRepo$loadFriendRequestNotice$$inlined$call$1(o00oo0oo, null), this);
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
            if (response.getIsSuccess()) {
                FriendRequestNoticeSettingModel friendRequestNoticeSettingModel = (FriendRequestNoticeSettingModel) response.getData();
                boolean z = false;
                if (friendRequestNoticeSettingModel != null) {
                    z = friendRequestNoticeSettingModel.getFriendRequest() == 1;
                }
                NoticeSettingVM.this.getFriendRequest().setValue(Boxing.boxBoolean(z));
                OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
                OooOOO0.OooOOO0().OooOOO(z);
            } else {
                NoticeSettingVM.this.getFriendRequest().setValue(NoticeSettingVM.this.getFriendRequest().getValue());
            }
            return Unit.INSTANCE;
        }
    }

    public NoticeSettingVM() {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00000OO o00000ooOooOOO0 = OooOOO0.OooOOO0();
        Objects.requireNonNull(o00000ooOooOOO0);
        this.friendRequest = new MutableLiveData<>(Boolean.valueOf(o00000ooOooOOO0.OooO00o(o000O0O0.OooO00o(-32284441026064L) + OooOOO.f41216OooO00o.OooOo().getValue(), true)));
        this.privateChat = new MutableLiveData<>(Boolean.valueOf(OooOOO0.OooOOO0().OooOOO0()));
    }

    public final void changeFriendRequestNotice(boolean open) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO00o(open, this, null), 3, null);
    }

    public final void changePrivateChatNotice(boolean open) {
        OooOOO0 oooOOO0 = OooOOO0.f41180OooO00o;
        o00000OO o00000ooOooOOO0 = OooOOO0.OooOOO0();
        Objects.requireNonNull(o00000ooOooOOO0);
        o00000ooOooOOO0.OooO0o(o000O0O0.OooO00o(-32207131614736L) + OooOOO.f41216OooO00o.OooOo().getValue(), open);
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
