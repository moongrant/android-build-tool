package com.yalla.yalla.ui.vm.user;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import com.code.android.util.OooOOO;
import com.code.android.util.o00oO0o;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$getAvatarList$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$setFriendMemoName$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$userEdit$$inlined$call$1;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserDefaultHeadListModel;
import com.yalla.yalla.model.user.UserEditResult;
import com.yalla.yalla.repository.CloudFileRepo;
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
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o000OOo0;
import p376o0OOoOOO.o0O0ooO;
import p381o0OOoo0O.Oooo0;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p579o0oOoo.oO000Oo0;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$Jy\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00130\r0\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\tJ\u0018\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\r0\fJ3\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\f2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserInfoEditVM;", "Lo0Oo00oO/o0O0O00;", "", "name", "sex", "birthday", "tagIds", "region", "sign", "", "avatarId", "countryId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/user/UserEditResult;", "userEdit", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "remark", "toUserId", "", "setFriendMemoName", "", "Lcom/yalla/yalla/model/user/UserDefaultHeadListModel;", "getAvatarList", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "sourceId", "", "autoName", "Lo00OOOo0/OooO0OO;", "uploadAvatar", "(Landroid/net/Uri;Ljava/lang/Long;Z)Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class UserInfoEditVM extends o0O0O00 {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$getAvatarList$1", f = "UserInfoEditVM.kt", i = {}, l = {35, 35}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<UserDefaultHeadListModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32725OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32726OooO0o0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(continuation);
            oooO00o.f32726OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<UserDefaultHeadListModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32725OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32726OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32726OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            this.f32726OooO0o0 = liveDataScope;
            this.f32725OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = o000OOo0.OooO0OO("/Webservers/User/GetAvatarList");
            Intrinsics.checkNotNullParameter(url, "url");
            obj = OooOOO.OooO0Oo(new UserInfoRepo$getAvatarList$$inlined$call$1(new o0O0ooO(url, 0), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32726OooO0o0 = null;
            this.f32725OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$setFriendMemoName$1", f = "UserInfoEditVM.kt", i = {}, l = {31, 31}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends UserEditResult>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32727OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32728OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32729OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f32730OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(long j, String str, Continuation continuation) {
            super(2, continuation);
            this.f32728OooO0o = str;
            this.f32730OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f32730OooO0oO, this.f32728OooO0o, continuation);
            oooO0O0.f32729OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends UserEditResult>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32727OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32729OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32729OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            this.f32729OooO0o0 = liveDataScope;
            this.f32727OooO0Oo = 1;
            userInfoRepo.getClass();
            String str = Oooo0.f44251OooO0OO;
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 1);
            o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(this.f32728OooO0o), "memoname");
            o0o0oooOooO00o.OooO0O0(Boxing.boxLong(this.f32730OooO0oO), "touserid");
            obj = OooOOO.OooO0Oo(new UserInfoRepo$setFriendMemoName$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32729OooO0o0 = null;
            this.f32727OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$uploadAvatar$1", f = "UserInfoEditVM.kt", i = {}, l = {39, 39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<p136o00OOOo0.OooO0OO>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ boolean f32731OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32732OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32734OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Uri f32735OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ Long f32736OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(Uri uri, Long l, boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32735OooO0oO = uri;
            this.f32736OooO0oo = l;
            this.f32731OooO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = UserInfoEditVM.this.new OooO0OO(this.f32735OooO0oO, this.f32736OooO0oo, this.f32731OooO, continuation);
            oooO0OO.f32734OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<p136o00OOOo0.OooO0OO> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32732OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32734OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32734OooO0o0;
            CloudFileRepo cloudFileRepo = UserInfoEditVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.USER_AVATAR;
            Uri uri = this.f32735OooO0oO;
            Long l = this.f32736OooO0oo;
            boolean z = this.f32731OooO;
            this.f32734OooO0o0 = liveDataScope;
            this.f32732OooO0Oo = 1;
            obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, l, z, this, 16);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32734OooO0o0 = null;
            this.f32732OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoEditVM$userEdit$1", f = "UserInfoEditVM.kt", i = {}, l = {26, 26}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<UserEditResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ String f32737OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32738OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32739OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32740OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f32741OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ String f32742OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f32743OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ String f32744OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ Long f32745OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ String f32746OooOOO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32739OooO0o = str;
            this.f32741OooO0oO = str2;
            this.f32742OooO0oo = str3;
            this.f32737OooO = str4;
            this.f32743OooOO0 = str5;
            this.f32744OooOO0O = str6;
            this.f32745OooOO0o = l;
            this.f32746OooOOO0 = str7;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f32739OooO0o, this.f32741OooO0oO, this.f32742OooO0oo, this.f32737OooO, this.f32743OooOO0, this.f32744OooOO0O, this.f32745OooOO0o, this.f32746OooOOO0, continuation);
            oooO0o.f32740OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<UserEditResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32738OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32740OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32740OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f23204OooO00o;
            this.f32740OooO0o0 = liveDataScope;
            this.f32738OooO0Oo = 1;
            userInfoRepo.getClass();
            String str = Oooo0.f44250OooO0O0;
            o0O0ooO o0o0oooOooO00o = o00oOoo.OooO00o(str, "url", str, 1);
            String str2 = this.f32739OooO0o;
            if (str2 != null) {
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(StringsKt.trim((CharSequence) str2).toString()), "nickname");
            }
            String str3 = this.f32744OooOO0O;
            if (str3 != null) {
                o0o0oooOooO00o.OooO0O0(oO000Oo0.OooO0O0(str3), "sign");
            }
            String str4 = this.f32741OooO0oO;
            if (str4 != null) {
                o0o0oooOooO00o.OooO0O0(str4, "sex");
            }
            String str5 = this.f32742OooO0oo;
            if (str5 != null) {
                o0o0oooOooO00o.OooO0O0(str5, "birthday");
            }
            String str6 = this.f32737OooO;
            if (str6 != null) {
                o0o0oooOooO00o.OooO0O0(str6, "tagIds");
            }
            String str7 = this.f32743OooOO0;
            if (str7 != null) {
                o0o0oooOooO00o.OooO0O0(str7, "region");
            }
            Long l = this.f32745OooOO0o;
            if (l != null) {
                o0o0oooOooO00o.OooO0O0(Boxing.boxLong(l.longValue()), "avatarId");
            }
            String str8 = this.f32746OooOOO0;
            if (str8 != null) {
                o0o0oooOooO00o.OooO0O0(str8, "countryid");
            }
            obj = OooOOO.OooO0Oo(new UserInfoRepo$userEdit$$inlined$call$1(o0o0oooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32740OooO0o0 = null;
            this.f32738OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ LiveData uploadAvatar$default(UserInfoEditVM userInfoEditVM, Uri uri, Long l, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            l = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return userInfoEditVM.uploadAvatar(uri, l, z);
    }

    public static /* synthetic */ LiveData userEdit$default(UserInfoEditVM userInfoEditVM, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        if ((i & 32) != 0) {
            str6 = null;
        }
        if ((i & 64) != 0) {
            l = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        return userInfoEditVM.userEdit(str, str2, str3, str4, str5, str6, l, str7);
    }

    @NotNull
    public final LiveData<ApiResult<List<UserDefaultHeadListModel>>> getAvatarList() {
        return o00oO0o.OooO00o(new OooO00o(null));
    }

    @NotNull
    public final LiveData<ApiResult<List<UserEditResult>>> setFriendMemoName(@NotNull String remark, long toUserId) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        return o00oO0o.OooO00o(new OooO0O0(toUserId, remark, null));
    }

    @NotNull
    public final LiveData<p136o00OOOo0.OooO0OO> uploadAvatar(@NotNull Uri uri, @Nullable Long sourceId, boolean autoName) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o00oO0o.OooO00o(new OooO0OO(uri, sourceId, autoName, null));
    }

    @NotNull
    public final LiveData<ApiResult<UserEditResult>> userEdit(@Nullable String name, @Nullable String sex, @Nullable String birthday, @Nullable String tagIds, @Nullable String region, @Nullable String sign, @Nullable Long avatarId, @Nullable String countryId) {
        return o00oO0o.OooO00o(new OooO0o(name, sex, birthday, tagIds, region, sign, avatarId, countryId, null));
    }
}
