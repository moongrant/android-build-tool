package com.yalla.yalla.ui.vm.user;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import com.yalla.support.cloudfilemanager.CloudFileInfo;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.manager.cloud_file.CloudFileType;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.repository.CloudFileRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$getUserReturnReward$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$propUserHonor$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$userVehicleList$$inlined$call$1;
import com.yalla.yalla.model.MyGiftModel;
import com.yalla.yalla.model.ReportPublishModel;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p486o0o000o0.o000000O;
import p499o0o00OoO.o00000OO;
import p520o0o0O0O0.o00oO0o;
import p520o0o0O0O0.o0OOO0o;
import p520o0o0O0O0.o0Oo0oo;
import p520o0o0O0O0.oo0O;
import p547o0o0o00O.o00O000o;
import p547o0o0o00O.o00O00O;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\t\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bJ\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u0002J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u0004J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004J\u0006\u0010$\u001a\u00020#J(\u0010(\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00060\u00050\u00042\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u0011R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "Lo00OO/OooO00o;", "", "toUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "Lcom/yalla/yalla/common/model/ShopVehicleListModel;", "userVehicleList", "targetUserId", "Landroidx/lifecycle/MutableLiveData;", "", "deleteFriend", "Lcom/yalla/yalla/common/db/table/Friend;", "getFriendState", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "addFriend", "getNewFans", "getNewVisitor", ReportItem.LogTypeBlock, "blockUser", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Lcom/yalla/support/cloudfilemanager/CloudFileInfo;", "uploadCover", "uploadAvatar", "userId", "Lcom/yalla/yalla/common/model/UserInfoModel;", "loadUserInfo", "Lcom/yalla/yalla/model/ReportPublishModel;", "reportPublish", "closeMark", "closeReportLogs", "", "getUserReturnReward", "userID", "giftPageIndex", "Lcom/yalla/yalla/model/MyGiftModel$Data;", "propUserHonor", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/common/repository/CloudFileRepo;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class UserInfoVM extends o00OO.OooO00o {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo = new CloudFileRepo();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$loadUserInfo$1", f = "UserInfoVM.kt", i = {}, l = {64, 64}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<UserInfoModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26224Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26225Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26226Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f26226Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f26226Oooo0oo, continuation);
            oooO.f26225Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<UserInfoModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26224Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26225Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26225Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            long j = this.f26226Oooo0oo;
            this.f26225Oooo0oO = liveDataScope;
            this.f26224Oooo0o = 1;
            obj = oo0o.OooOO0O(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26225Oooo0oO = null;
            this.f26224Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$blockUser$1", f = "UserInfoVM.kt", i = {}, l = {47, 47, 49, 49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ long f26227Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26228Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26229Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f26230Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z, long j, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26230Oooo0oo = z;
            this.f26227Oooo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f26230Oooo0oo, this.f26227Oooo, continuation);
            oooO00o.f26229Oooo0oO = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0057 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x0071 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26228Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f26229Oooo0oO;
                if (this.f26230Oooo0oo) {
                    o0OOO0o o0ooo0o2 = o0OOO0o.f42810OooO00o;
                    long j = this.f26227Oooo;
                    this.f26229Oooo0oO = liveDataScope;
                    this.f26228Oooo0o = 1;
                    obj = o0ooo0o2.OooO0o0(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f26229Oooo0oO = null;
                    this.f26228Oooo0o = 2;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    o0OOO0o o0ooo0o3 = o0OOO0o.f42810OooO00o;
                    long j2 = this.f26227Oooo;
                    this.f26229Oooo0oO = liveDataScope;
                    this.f26228Oooo0o = 3;
                    obj = o0ooo0o3.OooO0o(j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.f26229Oooo0oO = null;
                    this.f26228Oooo0o = 4;
                    if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        liveDataScope = (LiveDataScope) this.f26229Oooo0oO;
                        ResultKt.throwOnFailure(obj);
                        this.f26229Oooo0oO = null;
                        this.f26228Oooo0o = 4;
                        if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj);
            } else {
                liveDataScope = (LiveDataScope) this.f26229Oooo0oO;
                ResultKt.throwOnFailure(obj);
                this.f26229Oooo0oO = null;
                this.f26228Oooo0o = 2;
                if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$closeMark$1", f = "UserInfoVM.kt", i = {}, l = {72, 72}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26231Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26232Oooo0oO;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f26232Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26231Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26232Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26232Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            this.f26232Oooo0oO = liveDataScope;
            this.f26231Oooo0o = 1;
            obj = oo0o.OooO0oO(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26232Oooo0oO = null;
            this.f26231Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$closeReportLogs$1", f = "UserInfoVM.kt", i = {}, l = {76, 76}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26233Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26234Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f26234Oooo0oO = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26233Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26234Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26234Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            this.f26234Oooo0oO = liveDataScope;
            this.f26233Oooo0o = 1;
            obj = oo0o.OooO0oo(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26234Oooo0oO = null;
            this.f26233Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$getUserReturnReward$1", f = "UserInfoVM.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26235Oooo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26235Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                o00000OO o00000ooOooOOO0 = p497o0o00Oo.OooOOO0.OooOOO0();
                Objects.requireNonNull(o00000ooOooOOO0);
                if (o00000ooOooOOO0.OooO0OO(o000O0O0.OooO00o(-32542139063824L) + p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue()) > 0) {
                    return Unit.INSTANCE;
                }
                this.f26235Oooo0o = 1;
                o000000O o000000o2 = o000000O.f40909OooO00o;
                String str = o000000O.f40910OooO0O0;
                obj = o0000O0.OooO0OO(new UserInfoRepo$getUserReturnReward$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
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
                p497o0o00Oo.OooOOO0 oooOOO1 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                o00000OO o00000ooOooOOO1 = p497o0o00Oo.OooOOO0.OooOOO0();
                long jCurrentTimeMillis = System.currentTimeMillis();
                Objects.requireNonNull(o00000ooOooOOO1);
                StringBuilder sb = new StringBuilder();
                sb.append(o000O0O0.OooO00o(-32640923311632L));
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                sb.append(oooOOO.OooOo().getValue());
                o00000ooOooOOO1.OooO0oo(sb.toString(), jCurrentTimeMillis);
                oooOOO.OooOoOO().postValue(apiResult.getData());
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$propUserHonor$1", f = "UserInfoVM.kt", i = {}, l = {94, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends MyGiftModel.Data>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ int f26236Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26237Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26238Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26239Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(String str, int i, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f26239Oooo0oo = str;
            this.f26236Oooo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f26239Oooo0oo, this.f26236Oooo, continuation);
            oooOO1.f26238Oooo0oO = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends MyGiftModel.Data>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26237Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26238Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26238Oooo0oO;
            String str = this.f26239Oooo0oo;
            int i2 = this.f26236Oooo;
            this.f26238Oooo0oO = liveDataScope;
            this.f26237Oooo0o = 1;
            o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
            String url = o0ooOOo.f32253Oooo0O0;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("touserid", str);
            o00o000o2.OooO0O0("pagesize", Boxing.boxInt(100));
            o00o000o2.OooO0O0("pageindex", i2 + "");
            obj = o0000O0.OooO0OO(new UserInfoRepo$propUserHonor$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26238Oooo0oO = null;
            this.f26237Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$reportPublish$1", f = "UserInfoVM.kt", i = {}, l = {68, 68}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportPublishModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26240Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26241Oooo0oO;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(continuation);
            oooOO0O.f26241Oooo0oO = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ReportPublishModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26240Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26241Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26241Oooo0oO;
            oo0O oo0o = oo0O.f42896OooO00o;
            this.f26241Oooo0oO = liveDataScope;
            this.f26240Oooo0o = 1;
            obj = oo0o.OooOOO0(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26241Oooo0oO = null;
            this.f26240Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$uploadCover$1", f = "UserInfoVM.kt", i = {}, l = {56, 56}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Uri f26242Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26243Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26244Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(Uri uri, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f26242Oooo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = UserInfoVM.this.new OooOOO(this.f26242Oooo, continuation);
            oooOOO.f26244Oooo0oO = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<CloudFileInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26243Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26244Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26244Oooo0oO;
            CloudFileRepo cloudFileRepo = UserInfoVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.USER_BACKGROUND;
            Uri uri = this.f26242Oooo;
            this.f26244Oooo0oO = liveDataScope;
            this.f26243Oooo0o = 1;
            obj = CloudFileRepo.OooO0o(cloudFileRepo, cloudFileType, uri, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26244Oooo0oO = null;
            this.f26243Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$uploadAvatar$1", f = "UserInfoVM.kt", i = {}, l = {60, 60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<CloudFileInfo>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Uri f26246Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26247Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26248Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Uri uri, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f26246Oooo = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = UserInfoVM.this.new OooOOO0(this.f26246Oooo, continuation);
            oooOOO0.f26248Oooo0oO = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<CloudFileInfo> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26247Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26248Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26248Oooo0oO;
            CloudFileRepo cloudFileRepo = UserInfoVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.USER_AVATAR;
            Uri uri = this.f26246Oooo;
            this.f26248Oooo0oO = liveDataScope;
            this.f26247Oooo0o = 1;
            obj = CloudFileRepo.OooO0o(cloudFileRepo, cloudFileType, uri, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26248Oooo0oO = null;
            this.f26247Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$userVehicleList$1", f = "UserInfoVM.kt", i = {}, l = {27, 27}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends ShopVehicleListModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26250Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26251Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26252Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f26252Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f26252Oooo0oo, continuation);
            oooOOOO.f26251Oooo0oO = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends ShopVehicleListModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26250Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26251Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26251Oooo0oO;
            long j = this.f26252Oooo0oo;
            this.f26251Oooo0oO = liveDataScope;
            this.f26250Oooo0o = 1;
            String strOooO0O0 = o00O00O.OooO0O0("/Webservers/Shop/PersonalVehicleList");
            o00O000o o00o000oOooO0O0 = com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(strOooO0O0, "url", strOooO0O0, 0);
            o00o000oOooO0O0.OooO0O0("touserid", Boxing.boxLong(j));
            obj = o0000O0.OooO0OO(new UserInfoRepo$userVehicleList$$inlined$call$1(o00o000oOooO0O0, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26251Oooo0oO = null;
            this.f26250Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public final MutableLiveData<Integer> addFriend(long targetUserId, @Nullable String message) {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o00oO0o(targetUserId, message, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> blockUser(long targetUserId, boolean block) {
        return o0000O0O.OooO00o(new OooO00o(block, targetUserId, null));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> closeMark() {
        return o0000O0O.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> closeReportLogs() {
        return o0000O0O.OooO00o(new OooO0OO(null));
    }

    @NotNull
    public final MutableLiveData<Boolean> deleteFriend(long targetUserId) {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o0Oo0oo(targetUserId, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Friend> getFriendState(long targetUserId) {
        return FlowLiveDataConversions.asLiveData$default(p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), targetUserId), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<Integer> getNewFans() {
        return FlowLiveDataConversions.asLiveData$default(FlowKt__ShareKt.shareIn$default(p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO0o0(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue()), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), 0, 4, null), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<Integer> getNewVisitor() {
        return FlowLiveDataConversions.asLiveData$default(FlowKt__ShareKt.shareIn$default(p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue()), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), 0, 4, null), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    public final void getUserReturnReward() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<UserInfoModel>> loadUserInfo(long userId) {
        return o0000O0O.OooO00o(new OooO(userId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MyGiftModel.Data>>> propUserHonor(@NotNull String userID, int giftPageIndex) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return o0000O0O.OooO00o(new OooOO0(userID, giftPageIndex, null));
    }

    @NotNull
    public final LiveData<ApiResult<ReportPublishModel>> reportPublish() {
        return o0000O0O.OooO00o(new OooOO0O(null));
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadAvatar(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o0000O0O.OooO00o(new OooOOO0(uri, null));
    }

    @NotNull
    public final LiveData<CloudFileInfo> uploadCover(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o0000O0O.OooO00o(new OooOOO(uri, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<ShopVehicleListModel>>> userVehicleList(long toUserId) {
        return o0000O0O.OooO00o(new OooOOOO(toUserId, null));
    }
}
