package com.yalla.yalla.ui.vm.user;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.Response;
import com.yalla.yalla.data.repository.UserInfoRepo$editFriendRemark$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$editUserBio$$inlined$call$1;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.model.UserEditResult;
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
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0O;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.oo0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u0002J\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f0\u0006J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u00062\u0006\u0010\u0010\u001a\u00020\u0004¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserInfoEditVM;", "Lo00OO/OooO00o;", "", ViewHierarchyConstants.TEXT_KEY, "", "toUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/Response;", "", "editFriendRemark", "bio", "editUserBio", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/model/UserDefaultHeadListModel;", "getAvatarList", "avatarId", "Lcom/yalla/yalla/model/UserEditResult;", "changeDefaultUrl", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoEditVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$changeDefaultUrl$1", f = "UserInfoEditVM.kt", i = {}, l = {27, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<UserEditResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26212Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26213Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26214Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26214Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26214Oooo0oo, continuation);
            oooO00o.f26213Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<UserEditResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26212Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26213Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26213Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            long j = this.f26214Oooo0oo;
            this.f26213Oooo0oO = liveDataScope;
            this.f26212Oooo0o = 1;
            obj = oo0o.OooOOO(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26213Oooo0oO = null;
            this.f26212Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$editFriendRemark$1", f = "UserInfoEditVM.kt", i = {0}, l = {11, 15}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<Response<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f26215Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26216Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26217Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26218Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, long j, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26218Oooo0oo = str;
            this.f26215Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f26218Oooo0oo, this.f26215Oooo, continuation);
            oooO0O0.f26217Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Response<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26216Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26217Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26217Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            String str = this.f26218Oooo0oo;
            long j = this.f26215Oooo;
            this.f26217Oooo0oO = liveDataScope;
            this.f26216Oooo0o = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new UserInfoRepo$editFriendRemark$$inlined$call$1(oo0o, null, str, j), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            Response response = (Response) obj;
            if (response.getIsSuccess()) {
                long j2 = this.f26215Oooo;
                String memo = this.f26218Oooo0oo;
                Intrinsics.checkNotNullParameter(memo, "memo");
                p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOo0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue(), j2, memo);
            }
            this.f26217Oooo0oO = null;
            this.f26216Oooo0o = 2;
            if (liveDataScope.emit(response, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$editUserBio$1", f = "UserInfoEditVM.kt", i = {}, l = {19, 19}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<Response<Object>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26219Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26220Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26221Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(String str, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26221Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f26221Oooo0oo, continuation);
            oooO0OO.f26220Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Response<Object>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26219Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26220Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26220Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            String str = this.f26221Oooo0oo;
            this.f26220Oooo0oO = liveDataScope;
            this.f26219Oooo0o = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new UserInfoRepo$editUserBio$$inlined$call$1(oo0o, null, str), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26220Oooo0oO = null;
            this.f26219Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$getAvatarList$1", f = "UserInfoEditVM.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserDefaultHeadListModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26222Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26223Oooo0oO;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(continuation);
            oooO0o.f26223Oooo0oO = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserDefaultHeadListModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26222Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26223Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26223Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            this.f26223Oooo0oO = liveDataScope;
            this.f26222Oooo0o = 1;
            obj = oo0o.OooO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26223Oooo0oO = null;
            this.f26222Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final LiveData<ApiResult<UserEditResult>> changeDefaultUrl(long avatarId) {
        return o0000O0O.OooO00o(new OooO00o(avatarId, null));
    }

    @NotNull
    public final LiveData<Response<Object>> editFriendRemark(@NotNull String text, long toUserId) {
        Intrinsics.checkNotNullParameter(text, "text");
        return o0000O0O.OooO00o(new OooO0O0(text, toUserId, null));
    }

    @NotNull
    public final LiveData<Response<Object>> editUserBio(@NotNull String bio) {
        Intrinsics.checkNotNullParameter(bio, "bio");
        return o0000O0O.OooO00o(new OooO0OO(bio, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserDefaultHeadListModel>>> getAvatarList() {
        return o0000O0O.OooO00o(new OooO0o(null));
    }
}
