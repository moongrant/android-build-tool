package com.yalla.yalla.ui.vm.user;

import android.net.Uri;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o00oO0o;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.share.internal.ShareConstants;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.data.db.table.Friend;
import com.yalla.yalla.data.repository.UserInfoRepo;
import com.yalla.yalla.data.repository.UserInfoRepo$closeMark$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$closeReportLogs$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$propUserHonor$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$reportPublish$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$userFollow$$inlined$call$1;
import com.yalla.yalla.data.repository.UserInfoRepo$userVehicleList$$inlined$call$1;
import com.yalla.yalla.manager.cloud_file.CloudFileType;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.model.ShopVehicleListModel;
import com.yalla.yalla.model.gift.MyGiftModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.repository.CloudFileRepo;
import com.yalla.yalla.util.WebPageInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.SharingStarted;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o0ooOOo;
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.oo000o;
import p407o0Oo0Oo.o00;
import p407o0Oo0Oo.o000;
import p407o0Oo0Oo.o0O;
import p408o0Oo0Oo0.o00Oo0;
import p412o0Oo0o0O.o000O0;
import p412o0Oo0o0O.o000OO00;
import p412o0Oo0o0O.o000OOo0;
import p475o0Ooooo0.o0O00oO0;
import p532o0o0OOo0.oOO00O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00042\u0006\u0010\t\u001a\u00020\u0002J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0004J\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u000bJ\u0016\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u0016\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00042\u0006\u0010\u0018\u001a\u00020\u0017J\u001a\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u0002J\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00050\u0004J\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004J\u0012\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00050\u0004J(\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00060\u00050\u00042\u0006\u0010#\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\u0011J\"\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u00042\u0006\u0010'\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000bR+\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "Lo0Oo0/OooOO0;", "", "toUserId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "", "Lcom/yalla/yalla/model/ShopVehicleListModel;", "userVehicleList", "targetUserId", "Landroidx/lifecycle/MutableLiveData;", "", "deleteFriend", "Lcom/yalla/yalla/data/db/table/Friend;", "getFriendState", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "addFriend", "getNewFans", "getNewVisitor", ReportItem.LogTypeBlock, "blockUser", "Landroid/net/Uri;", ShareConstants.MEDIA_URI, "Lo00o000O/OooO0o;", "uploadCover", "uploadAvatar", "userId", "Lcom/yalla/yalla/model/user/UserInfoModel;", "loadUserInfo", "Lcom/yalla/yalla/model/ReportPublishModel;", "reportPublish", "closeMark", "closeReportLogs", "userID", "giftPageIndex", "Lcom/yalla/yalla/model/gift/MyGiftModel$Data;", "propUserHonor", "fUserid", "isFollow", "Lcom/yalla/yalla/model/user/OfficialActionModel;", "userFollow", "Lcom/yalla/yalla/util/WebPageInfo;", "<set-?>", "halfDialogWebPageInfo$delegate", "Landroidx/compose/runtime/MutableState;", "getHalfDialogWebPageInfo", "()Lcom/yalla/yalla/util/WebPageInfo;", "setHalfDialogWebPageInfo", "(Lcom/yalla/yalla/util/WebPageInfo;)V", "halfDialogWebPageInfo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "cloudFileRepo", "Lcom/yalla/yalla/repository/CloudFileRepo;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nUserInfoVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserInfoVM.kt\ncom/yalla/yalla/ui/vm/user/UserInfoVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,101:1\n81#2:102\n107#2,2:103\n*S KotlinDebug\n*F\n+ 1 UserInfoVM.kt\ncom/yalla/yalla/ui/vm/user/UserInfoVM\n*L\n27#1:102\n27#1:103,2\n*E\n"})
public final class UserInfoVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 0;

    @NotNull
    private final CloudFileRepo cloudFileRepo;

    /* JADX INFO: renamed from: halfDialogWebPageInfo$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState halfDialogWebPageInfo;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$propUserHonor$1", f = "UserInfoVM.kt", i = {}, l = {91, 91}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends MyGiftModel.Data>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32211OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32212OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32213OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f32214OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(int i, String str, Continuation continuation) {
            super(2, continuation);
            this.f32212OooO0o = str;
            this.f32214OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f32214OooO0oO, this.f32212OooO0o, continuation);
            oooO.f32213OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<? extends MyGiftModel.Data>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32211OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32213OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32213OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32213OooO0o0 = liveDataScope;
            this.f32211OooO0Oo = 1;
            userInfoRepo.getClass();
            String str = Oooo0.f43368Oooo0O0;
            o0ooOOo o0oooooOooO00o = oo000o.OooO00o(str, "url", str, 0);
            o0oooooOooO00o.OooO0O0(this.f32212OooO0o, "touserid");
            o0oooooOooO00o.OooO0O0(Boxing.boxInt(100), "pagesize");
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32214OooO0oO);
            o0oooooOooO00o.OooO0O0(sb.toString(), "pageindex");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$propUserHonor$$inlined$call$1(o0oooooOooO00o, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32213OooO0o0 = null;
            this.f32211OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$blockUser$1", f = "UserInfoVM.kt", i = {0, 1}, l = {56, 57, 61}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync"}, s = {"L$0", "L$0"})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32215OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f32216OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32217OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ long f32218OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(long j, boolean z, Continuation continuation) {
            super(2, continuation);
            this.f32216OooO0o = z;
            this.f32218OooO0oO = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f32218OooO0oO, this.f32216OooO0o, continuation);
            oooO00o.f32217OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Boolean> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0063 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:27:0x008b A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            boolean zBooleanValue;
            Boolean boolBoxBoolean;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32215OooO0Oo;
            boolean z = this.f32216OooO0o;
            long j = this.f32218OooO0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f32217OooO0o0;
                o000OO00 o000oo01 = o000OO00.f46018OooO00o;
                if (z) {
                    this.f32217OooO0o0 = liveDataScope;
                    this.f32215OooO0Oo = 1;
                    obj = o000oo01.OooO0oo(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        o00 o00VarOooOo00 = o00Oo0.OooO00o().OooOo00();
                        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                        o00VarOooOo00.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f32217OooO0o0 = null;
                    this.f32215OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.f32217OooO0o0 = liveDataScope;
                    this.f32215OooO0Oo = 2;
                    obj = o000oo01.OooO(j, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    if (zBooleanValue) {
                        o00 o00VarOooOo01 = o00Oo0.OooO00o().OooOo00();
                        o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                        o00VarOooOo01.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
                    }
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    this.f32217OooO0o0 = null;
                    this.f32215OooO0Oo = 3;
                    if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope = (LiveDataScope) this.f32217OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue) {
                    o00 o00VarOooOo02 = o00Oo0.OooO00o().OooOo00();
                    o0O00oO0 o0o00oo3 = o0O00oO0.f47936OooO00o;
                    o00VarOooOo02.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
                }
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f32217OooO0o0 = null;
                this.f32215OooO0Oo = 3;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.f32217OooO0o0;
                ResultKt.throwOnFailure(obj);
                zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue && z) {
                    o00 o00VarOooOo03 = o00Oo0.OooO00o().OooOo00();
                    o0O00oO0 o0o00oo4 = o0O00oO0.f47936OooO00o;
                    o00VarOooOo03.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), j);
                }
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                this.f32217OooO0o0 = null;
                this.f32215OooO0Oo = 3;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$closeMark$1", f = "UserInfoVM.kt", i = {}, l = {83, 83}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32219OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32220OooO0o0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(continuation);
            oooO0O0.f32220OooO0o0 = obj;
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
            int i = this.f32219OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32220OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32220OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32220OooO0o0 = liveDataScope;
            this.f32219OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = p380o0OOoOo.oo000o.OooO0OO("/Webservers/User/CloseMark");
            Intrinsics.checkNotNullParameter(url, "url");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$closeMark$$inlined$call$1(new o0ooOOo(url, 1), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32220OooO0o0 = null;
            this.f32219OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$closeReportLogs$1", f = "UserInfoVM.kt", i = {}, l = {87, 87}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32221OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32222OooO0o0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f32222OooO0o0 = obj;
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
            int i = this.f32221OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32222OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32222OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32222OooO0o0 = liveDataScope;
            this.f32221OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = p380o0OOoOo.oo000o.OooO0OO("/Webservers/User/CloseReportLogs");
            Intrinsics.checkNotNullParameter(url, "url");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$closeReportLogs$$inlined$call$1(new o0ooOOo(url, 1), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32222OooO0o0 = null;
            this.f32221OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$loadUserInfo$1", f = "UserInfoVM.kt", i = {}, l = {75, 75}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<UserInfoModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32223OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32224OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32225OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f32224OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f32224OooO0o, continuation);
            oooO0o.f32225OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<UserInfoModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32223OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32225OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32225OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32225OooO0o0 = liveDataScope;
            this.f32223OooO0Oo = 1;
            obj = userInfoRepo.OooO0oo(this.f32224OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32225OooO0o0 = null;
            this.f32223OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$reportPublish$1", f = "UserInfoVM.kt", i = {}, l = {79, 79}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<ReportPublishModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32226OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32227OooO0o0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(continuation);
            oooOO1.f32227OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<ReportPublishModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32226OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32227OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32227OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32227OooO0o0 = liveDataScope;
            this.f32226OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = p380o0OOoOo.oo000o.OooO0Oo("/Webservers/Moment/ReportPublish");
            Intrinsics.checkNotNullParameter(url, "url");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$reportPublish$$inlined$call$1(new o0ooOOo(url, 1), null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32227OooO0o0 = null;
            this.f32226OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$uploadAvatar$1", f = "UserInfoVM.kt", i = {}, l = {71, 71}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<p182o00o000O.OooO0o>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32228OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32230OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Uri f32231OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(Uri uri, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f32231OooO0oO = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = UserInfoVM.this.new OooOO0O(this.f32231OooO0oO, continuation);
            oooOO0O.f32230OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<p182o00o000O.OooO0o> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32228OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32230OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32230OooO0o0;
            CloudFileRepo cloudFileRepo = UserInfoVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.USER_AVATAR;
            Uri uri = this.f32231OooO0oO;
            this.f32230OooO0o0 = liveDataScope;
            this.f32228OooO0Oo = 1;
            obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32230OooO0o0 = null;
            this.f32228OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$userFollow$1", f = "UserInfoVM.kt", i = {}, l = {98, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<OfficialActionModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32232OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f32233OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32234OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f32235OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(String str, boolean z, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f32233OooO0o = str;
            this.f32235OooO0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f32233OooO0o, this.f32235OooO0oO, continuation);
            oooOOO.f32234OooO0o0 = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<OfficialActionModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32232OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32234OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32234OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32234OooO0o0 = liveDataScope;
            this.f32232OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = p380o0OOoOo.oo000o.OooO0OO("/Webservers/Messages/UserFollow");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(this.f32233OooO0o, "fuserid");
            o0ooooo.OooO0O0(this.f32235OooO0oO ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO, "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$userFollow$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32234OooO0o0 = null;
            this.f32232OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$uploadCover$1", f = "UserInfoVM.kt", i = {}, l = {67, 67}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<LiveDataScope<p182o00o000O.OooO0o>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32236OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32238OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Uri f32239OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Uri uri, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f32239OooO0oO = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO0 oooOOO0 = UserInfoVM.this.new OooOOO0(this.f32239OooO0oO, continuation);
            oooOOO0.f32238OooO0o0 = obj;
            return oooOOO0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<p182o00o000O.OooO0o> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32236OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32238OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32238OooO0o0;
            CloudFileRepo cloudFileRepo = UserInfoVM.this.cloudFileRepo;
            CloudFileType cloudFileType = CloudFileType.USER_BACKGROUND;
            Uri uri = this.f32239OooO0oO;
            this.f32238OooO0o0 = liveDataScope;
            this.f32236OooO0Oo = 1;
            obj = CloudFileRepo.OooO0Oo(cloudFileRepo, cloudFileType, uri, null, false, this, 28);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32238OooO0o0 = null;
            this.f32236OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.user.UserInfoVM$userVehicleList$1", f = "UserInfoVM.kt", i = {}, l = {33, 33}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<? extends ShopVehicleListModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f32240OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f32241OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f32242OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f32241OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f32241OooO0o, continuation);
            oooOOOO.f32242OooO0o0 = obj;
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
            int i = this.f32240OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f32242OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f32242OooO0o0;
            UserInfoRepo userInfoRepo = UserInfoRepo.f22735OooO00o;
            this.f32242OooO0o0 = liveDataScope;
            this.f32240OooO0Oo = 1;
            userInfoRepo.getClass();
            String url = p380o0OOoOo.oo000o.OooO0OO("/Webservers/Shop/PersonalVehicleList");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(Boxing.boxLong(this.f32241OooO0o), "touserid");
            obj = com.code.android.util.OooOOO.OooO0Oo(new UserInfoRepo$userVehicleList$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f32242OooO0o0 = null;
            this.f32240OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public UserInfoVM() {
        WebPageInfo webPageInfo = WebPageInfo.f32279OooOOo;
        this.halfDialogWebPageInfo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(WebPageInfo.f32279OooOOo, null, 2, null);
        this.cloudFileRepo = new CloudFileRepo();
    }

    @NotNull
    public final MutableLiveData<Integer> addFriend(long targetUserId, @Nullable String message) {
        ArrayList arrayListOooO00o = oOO00O.OooO00o();
        String str = (String) CollectionsKt.getOrNull(arrayListOooO00o, arrayListOooO00o.size() - 2);
        if (str == null) {
            str = "";
        }
        String source = str;
        Intrinsics.checkNotNullParameter(source, "source");
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000O0(targetUserId, message, source, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> blockUser(long targetUserId, boolean block) {
        return o00oO0o.OooO00o(new OooO00o(targetUserId, block, null));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> closeMark() {
        return o00oO0o.OooO00o(new OooO0O0(null));
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> closeReportLogs() {
        return o00oO0o.OooO00o(new OooO0OO(null));
    }

    @NotNull
    public final MutableLiveData<Boolean> deleteFriend(long targetUserId) {
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new o000OOo0(targetUserId, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Friend> getFriendState(long targetUserId) {
        o000 o000VarOooOOoo = o00Oo0.OooO00o().OooOOoo();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return FlowLiveDataConversions.asLiveData$default(o000VarOooOOoo.OooOOOo(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue(), targetUserId), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final WebPageInfo getHalfDialogWebPageInfo() {
        return (WebPageInfo) this.halfDialogWebPageInfo.getValue();
    }

    @NotNull
    public final LiveData<Integer> getNewFans() {
        o0O o0oOooo000 = o00Oo0.OooO00o().Oooo000();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return FlowLiveDataConversions.asLiveData$default(FlowKt__ShareKt.shareIn$default(o0oOooo000.OooOO0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), 0, 4, null), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<Integer> getNewVisitor() {
        o0O o0oOooo000 = o00Oo0.OooO00o().Oooo000();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        return FlowLiveDataConversions.asLiveData$default(FlowKt__ShareKt.shareIn$default(o0oOooo000.OooO0o(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), ViewModelKt.getViewModelScope(this), SharingStarted.INSTANCE.getLazily(), 0, 4, null), ViewModelKt.getViewModelScope(this).getCoroutineContext(), 0L, 2, (Object) null);
    }

    @NotNull
    public final LiveData<ApiResult<UserInfoModel>> loadUserInfo(long userId) {
        return o00oO0o.OooO00o(new OooO0o(userId, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<MyGiftModel.Data>>> propUserHonor(@NotNull String userID, int giftPageIndex) {
        Intrinsics.checkNotNullParameter(userID, "userID");
        return o00oO0o.OooO00o(new OooO(giftPageIndex, userID, null));
    }

    @NotNull
    public final LiveData<ApiResult<ReportPublishModel>> reportPublish() {
        return o00oO0o.OooO00o(new OooOO0(null));
    }

    public final void setHalfDialogWebPageInfo(@NotNull WebPageInfo webPageInfo) {
        Intrinsics.checkNotNullParameter(webPageInfo, "<set-?>");
        this.halfDialogWebPageInfo.setValue(webPageInfo);
    }

    @NotNull
    public final LiveData<p182o00o000O.OooO0o> uploadAvatar(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o00oO0o.OooO00o(new OooOO0O(uri, null));
    }

    @NotNull
    public final LiveData<p182o00o000O.OooO0o> uploadCover(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return o00oO0o.OooO00o(new OooOOO0(uri, null));
    }

    @NotNull
    public final LiveData<ApiResult<OfficialActionModel>> userFollow(@NotNull String fUserid, boolean isFollow) {
        Intrinsics.checkNotNullParameter(fUserid, "fUserid");
        return o00oO0o.OooO00o(new OooOOO(fUserid, isFollow, null));
    }

    @NotNull
    public final LiveData<ApiResult<List<ShopVehicleListModel>>> userVehicleList(long toUserId) {
        return o00oO0o.OooO00o(new OooOOOO(toUserId, null));
    }
}
