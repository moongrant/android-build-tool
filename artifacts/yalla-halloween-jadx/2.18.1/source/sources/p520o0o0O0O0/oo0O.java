package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.api.service.UserInfoService;
import com.yalla.yalla.api.service.UserMomentService;
import com.yalla.yalla.common.db.table.Friend;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.CheckUserInRoomModel;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.model.HeUserInfoModel;
import com.yalla.yalla.model.ReportPublishModel;
import com.yalla.yalla.model.UserDefaultHeadListModel;
import com.yalla.yalla.model.UserEditResult;
import com.yalla.yalla.model.UserVisitorModel;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.o00O00O;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class oo0O extends o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final oo0O f42896OooO00o = new oo0O();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {131}, m = "getUserInRoomInfo", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42897Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42899Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42897Oooo0o = obj;
            this.f42899Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooOO0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {146}, m = "clickVisitor", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42900Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42902Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42900Oooo0o = obj;
            this.f42902Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooO0o(null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {139}, m = "closeMark", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42903Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42905Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42903Oooo0o = obj;
            this.f42905Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooO0oO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {ZegoConstants.RoomError.SessionError}, m = "closeReportLogs", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42906Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42908Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42906Oooo0o = obj;
            this.f42908Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooO0oo(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {133}, m = "getAvatarList", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42909Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42911Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42909Oooo0o = obj;
            this.f42911Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {0, 0, 1, 1, 1, 1, 2}, l = {44, 54, 60}, m = "loadUserInfoByNet", n = {"this", "userId", "this", "apiResult", ReportItem.QualityKeyResult, "userId", ReportItem.QualityKeyResult}, s = {"L$0", "J$0", "L$0", "L$1", "L$2", "J$0", "L$0"})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public long f42912Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f42913Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ApiResult f42914Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public ApiResult f42915Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f42917OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f42918OoooO0O;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42917OoooO00 = obj;
            this.f42918OoooO0O |= Integer.MIN_VALUE;
            return oo0O.this.OooOO0O(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {144}, m = "loadUserVisitorList", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42919Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42921Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42919Oooo0o = obj;
            this.f42921Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooOO0o(0, null, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {135}, m = "userInformationEdit", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42922Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42924Oooo0oo;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42922Oooo0o = obj;
            this.f42924Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooOOO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {137}, m = "reportPublish", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42925Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42927Oooo0oo;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42925Oooo0o = obj;
            this.f42927Oooo0oo |= Integer.MIN_VALUE;
            return oo0O.this.OooOOO0(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object OooO0o0(oo0O oo0o, long j, Continuation continuation) {
        o00OOO0 o00ooo1;
        Objects.requireNonNull(oo0o);
        if (continuation instanceof o00OOO0) {
            o00ooo1 = (o00OOO0) continuation;
            int i = o00ooo1.f42720Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                o00ooo1.f42720Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                o00ooo1 = new o00OOO0(oo0o, continuation);
            }
        } else {
            o00ooo1 = new o00OOO0(oo0o, continuation);
        }
        Object objOooOO0O = o00ooo1.f42718Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = o00ooo1.f42720Oooo0oo;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooOO0O);
            o00ooo1.f42720Oooo0oo = 1;
            objOooOO0O = oo0o.OooOO0O(j, o00ooo1);
            if (objOooOO0O == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooOO0O);
        }
        return ((ApiResult) objOooOO0O).getData();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO(@NotNull Continuation<? super ApiResult<List<UserDefaultHeadListModel>>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i = oooO0o.f42911Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0o.f42911Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object avatarList = oooO0o.f42909Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0o.f42911Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(avatarList);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooO0o.f42911Oooo0oo = 1;
                avatarList = userInfoServiceOooO0O0.getAvatarList(oooO0o);
                if (avatarList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(avatarList);
            }
            return avatarList;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o(@NotNull String str, @NotNull Continuation<? super ApiResult<Object>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42902Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42902Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objVisitorLogClick = oooO00o.f42900Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42902Oooo0oo;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objVisitorLogClick);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooO00o.f42902Oooo0oo = 1;
                objVisitorLogClick = userInfoServiceOooO0O0.visitorLogClick(str, oooO00o);
                if (objVisitorLogClick == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objVisitorLogClick);
            }
            return objVisitorLogClick;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oO(@NotNull Continuation<? super ApiResult<Boolean>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42905Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42905Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objCloseMark = oooO0O0.f42903Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42905Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCloseMark);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooO0O0.f42905Oooo0oo = 1;
                objCloseMark = userInfoServiceOooO0O0.closeMark(oooO0O0);
                if (objCloseMark == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCloseMark);
            }
            return objCloseMark;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oo(@NotNull Continuation<? super ApiResult<Boolean>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f42908Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42908Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objCloseReportLogs = oooO0OO.f42906Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f42908Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCloseReportLogs);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooO0OO.f42908Oooo0oo = 1;
                objCloseReportLogs = userInfoServiceOooO0O0.closeReportLogs(oooO0OO);
                if (objCloseReportLogs == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCloseReportLogs);
            }
            return objCloseReportLogs;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0(long j, @NotNull Continuation<? super ApiResult<CheckUserInRoomModel>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f42899Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f42899Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objUserInBar = oooO.f42897Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f42899Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserInBar);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooO.f42899Oooo0oo = 1;
                objUserInBar = userInfoServiceOooO0O0.userInBar(j, oooO);
                if (objUserInBar == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserInBar);
            }
            return objUserInBar;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:56:0x0125  */
    /* JADX WARN: Code duplicated, block: B:58:0x012d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0132  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0142  */
    /* JADX WARN: Code duplicated, block: B:70:0x0179  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:78:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:85:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:90:0x020c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0245 A[RETURN] */
    @Nullable
    public final Object OooOO0O(long j, @NotNull Continuation<? super ApiResult<UserInfoModel>> continuation) {
        OooOO0 oooOO1;
        oo0O oo0o;
        oo0O oo0o2;
        String message;
        String strOooO0oo;
        String strOooO0oo2;
        String strOooO0oo3;
        ApiResult apiResult;
        ApiResult apiResult2;
        HeUserInfoModel heUserInfoModel;
        List<UserInfoModel> data;
        boolean z;
        UserInfoModel userInfoModel;
        long jLongValue;
        Friend friend;
        Long value;
        long j2 = j;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f42918OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f42918OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objHeInformation = oooOO1.f42917OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f42918OoooO0O;
        String str = "";
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHeInformation);
            try {
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooOO1.f42913Oooo0o = this;
                oooOO1.f42912Oooo = j2;
                oooOO1.f42918OoooO0O = 1;
                objHeInformation = userInfoServiceOooO0O0.heInformation(j2, oooOO1);
                if (objHeInformation == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oo0o2 = this;
                apiResult = (ApiResult) objHeInformation;
                apiResult2 = new ApiResult();
                apiResult2.setCode(apiResult.getCode());
                apiResult2.setMessage(apiResult.getMessage());
                if (!apiResult.isSuccess()) {
                    heUserInfoModel = (HeUserInfoModel) apiResult.getData();
                    if (heUserInfoModel != null) {
                        data = heUserInfoModel.getData();
                    } else {
                        data = null;
                    }
                    if (data != null) {
                        z = true;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        Object data2 = apiResult.getData();
                        Intrinsics.checkNotNull(data2);
                        List<UserInfoModel> data3 = ((HeUserInfoModel) data2).getData();
                        Intrinsics.checkNotNull(data3);
                        userInfoModel = data3.get(0);
                        apiResult2.setData(userInfoModel);
                        p491o0o00O00.OooO0OO.OooO00o().Oooo0O0().OooO0OO(userInfoModel);
                        oooOO1.f42913Oooo0o = oo0o2;
                        oooOO1.f42914Oooo0oO = apiResult;
                        oooOO1.f42915Oooo0oo = apiResult2;
                        oooOO1.f42912Oooo = j2;
                        oooOO1.f42918OoooO0O = 2;
                        Objects.requireNonNull(oo0o2);
                        if (userInfoModel.getIsFriend()) {
                            friend = new Friend();
                            friend.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                            friend.setFriendId(userInfoModel.getUserId());
                            friend.setMemoName(userInfoModel.getMemoName());
                            jLongValue = 0;
                            friend.setInRoom(userInfoModel.getInRoom() > 0);
                            if (userInfoModel.getFriendTime() > 0) {
                                friend.setTime(userInfoModel.getFriendTime());
                            }
                            o00O0O.f42677OooO00o.OooO0o(friend);
                        } else {
                            jLongValue = 0;
                            p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), userInfoModel.getUserId());
                        }
                        if (Unit.INSTANCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                if (!apiResult.isSuccess()) {
                    p490o0o00O0.OooOOO OooOOo2 = p491o0o00O00.OooO0OO.OooO00o().OooOOo();
                    p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                    value = oooOOO.OooOo().getValue();
                    if (value != null) {
                        jLongValue = value.longValue();
                    }
                    OooOOo2.OooO0o0(jLongValue, j2);
                    p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO)).longValue(), j2);
                    oooOO1.f42913Oooo0o = apiResult2;
                    oooOO1.f42914Oooo0oO = null;
                    oooOO1.f42915Oooo0oo = null;
                    oooOO1.f42918OoooO0O = 3;
                    Objects.requireNonNull(oo0o2);
                    p491o0o00O00.OooO0OO.OooO00o().Oooo0O0().OooO00o(j2);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return apiResult2;
            } catch (IOException e) {
                e = e;
                oo0o = this;
                ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
                strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
                if (strOooO0oo3 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo3;
                }
                objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(objHeInformation);
                oo0o2 = oo0o;
            } catch (CancellationException unused) {
                oo0o = this;
                ApiError apiError = new ApiError(3, "canceled");
                o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
                strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
                if (strOooO0oo2 != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo2;
                }
                objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(objHeInformation);
                oo0o2 = oo0o;
            } catch (Exception e2) {
                e = e2;
                oo0o = this;
                o00O00.OooO0o0("WebAPIException", e.getMessage());
                e.printStackTrace();
                message = e.getMessage();
                if (message == null) {
                    message = e.getClass().getName();
                }
                Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                ApiError apiError2 = new ApiError(2, message);
                o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
                strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError2);
                if (strOooO0oo != null) {
                    Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                    str = strOooO0oo;
                }
                objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                Intrinsics.checkNotNull(objHeInformation);
                oo0o2 = oo0o;
            }
        } else {
            if (i2 == 1) {
                j2 = oooOO1.f42912Oooo;
                oo0o = (oo0O) oooOO1.f42913Oooo0o;
                try {
                    ResultKt.throwOnFailure(objHeInformation);
                } catch (IOException e3) {
                    e = e3;
                    ApiError apiErrorOooO00o2 = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
                    o0OOO0o o0ooo0o5 = o0OOO0o.f42120OooO00o;
                    strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o2);
                    if (strOooO0oo3 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                        str = strOooO0oo3;
                    }
                    objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                    Intrinsics.checkNotNull(objHeInformation);
                } catch (CancellationException unused2) {
                    ApiError apiError3 = new ApiError(3, "canceled");
                    o0OOO0o o0ooo0o6 = o0OOO0o.f42120OooO00o;
                    strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError3);
                    if (strOooO0oo2 != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                        str = strOooO0oo2;
                    }
                    objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                    Intrinsics.checkNotNull(objHeInformation);
                } catch (Exception e4) {
                    e = e4;
                    o00O00.OooO0o0("WebAPIException", e.getMessage());
                    e.printStackTrace();
                    message = e.getMessage();
                    if (message == null) {
                        message = e.getClass().getName();
                    }
                    Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
                    ApiError apiError4 = new ApiError(2, message);
                    o0OOO0o o0ooo0o7 = o0OOO0o.f42120OooO00o;
                    strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiError4);
                    if (strOooO0oo != null) {
                        Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                        str = strOooO0oo;
                    }
                    objHeInformation = o0OOO0o.OooO0O0(str, ApiResult.class);
                    Intrinsics.checkNotNull(objHeInformation);
                }
                oo0o2 = oo0o;
                apiResult = (ApiResult) objHeInformation;
                apiResult2 = new ApiResult();
                apiResult2.setCode(apiResult.getCode());
                apiResult2.setMessage(apiResult.getMessage());
                if (!apiResult.isSuccess()) {
                    heUserInfoModel = (HeUserInfoModel) apiResult.getData();
                    if (heUserInfoModel != null) {
                        data = heUserInfoModel.getData();
                    } else {
                        data = null;
                    }
                    if (data != null || data.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Object data4 = apiResult.getData();
                        Intrinsics.checkNotNull(data4);
                        List<UserInfoModel> data5 = ((HeUserInfoModel) data4).getData();
                        Intrinsics.checkNotNull(data5);
                        userInfoModel = data5.get(0);
                        apiResult2.setData(userInfoModel);
                        p491o0o00O00.OooO0OO.OooO00o().Oooo0O0().OooO0OO(userInfoModel);
                        oooOO1.f42913Oooo0o = oo0o2;
                        oooOO1.f42914Oooo0oO = apiResult;
                        oooOO1.f42915Oooo0oo = apiResult2;
                        oooOO1.f42912Oooo = j2;
                        oooOO1.f42918OoooO0O = 2;
                        Objects.requireNonNull(oo0o2);
                        if (userInfoModel.getIsFriend()) {
                            friend = new Friend();
                            friend.setUid(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                            friend.setFriendId(userInfoModel.getUserId());
                            friend.setMemoName(userInfoModel.getMemoName());
                            jLongValue = 0;
                            friend.setInRoom(userInfoModel.getInRoom() > 0);
                            if (userInfoModel.getFriendTime() > 0) {
                                friend.setTime(userInfoModel.getFriendTime());
                            }
                            o00O0O.f42677OooO00o.OooO0o(friend);
                        } else {
                            jLongValue = 0;
                            p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue(), userInfoModel.getUserId());
                        }
                        if (Unit.INSTANCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                if (!apiResult.isSuccess() && apiResult.getError().getCode() == 1057) {
                    p490o0o00O0.OooOOO OooOOo3 = p491o0o00O00.OooO0OO.OooO00o().OooOOo();
                    p498o0o00Oo0.OooOOO oooOOO2 = p498o0o00Oo0.OooOOO.f41216OooO00o;
                    value = oooOOO2.OooOo().getValue();
                    if (value != null) {
                        jLongValue = value.longValue();
                    }
                    OooOOo3.OooO0o0(jLongValue, j2);
                    p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO2)).longValue(), j2);
                    oooOO1.f42913Oooo0o = apiResult2;
                    oooOO1.f42914Oooo0oO = null;
                    oooOO1.f42915Oooo0oo = null;
                    oooOO1.f42918OoooO0O = 3;
                    Objects.requireNonNull(oo0o2);
                    p491o0o00O00.OooO0OO.OooO00o().Oooo0O0().OooO00o(j2);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return apiResult2;
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ApiResult apiResult3 = (ApiResult) oooOO1.f42913Oooo0o;
                ResultKt.throwOnFailure(objHeInformation);
                return apiResult3;
            }
            j2 = oooOO1.f42912Oooo;
            apiResult2 = oooOO1.f42915Oooo0oo;
            apiResult = oooOO1.f42914Oooo0oO;
            oo0o2 = (oo0O) oooOO1.f42913Oooo0o;
            ResultKt.throwOnFailure(objHeInformation);
        }
        jLongValue = 0;
        if (!apiResult.isSuccess()) {
            p490o0o00O0.OooOOO OooOOo4 = p491o0o00O00.OooO0OO.OooO00o().OooOOo();
            p498o0o00Oo0.OooOOO oooOOO3 = p498o0o00Oo0.OooOOO.f41216OooO00o;
            value = oooOOO3.OooOo().getValue();
            if (value != null) {
                jLongValue = value.longValue();
            }
            OooOOo4.OooO0o0(jLongValue, j2);
            p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooOOO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(oooOOO3)).longValue(), j2);
            oooOO1.f42913Oooo0o = apiResult2;
            oooOO1.f42914Oooo0oO = null;
            oooOO1.f42915Oooo0oo = null;
            oooOO1.f42918OoooO0O = 3;
            Objects.requireNonNull(oo0o2);
            p491o0o00O00.OooO0OO.OooO00o().Oooo0O0().OooO00o(j2);
            if (Unit.INSTANCE == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return apiResult2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOO0o(int i, @NotNull String str, @NotNull Continuation<? super ApiResult<UserVisitorModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i2 = oooOO0O.f42921Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42921Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objUserVisitorlist = oooOO0O.f42919Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO0O.f42921Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUserVisitorlist);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooOO0O.f42921Oooo0oo = 1;
                objUserVisitorlist = userInfoServiceOooO0O0.userVisitorlist(i, str, oooOO0O);
                if (objUserVisitorlist == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserVisitorlist);
            }
            return objUserVisitorlist;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOO(long j, @NotNull Continuation<? super ApiResult<UserEditResult>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i = oooOOO.f42924Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO.f42924Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        Object objUserInformationEdit = oooOOO.f42922Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO.f42924Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUserInformationEdit);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserInfoService userInfoServiceOooO0O0 = o0ooOOo.OooO0O0();
                oooOOO.f42924Oooo0oo = 1;
                objUserInformationEdit = userInfoServiceOooO0O0.userInformationEdit(j, oooOOO);
                if (objUserInformationEdit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUserInformationEdit);
            }
            return objUserInformationEdit;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooOOO0(@NotNull Continuation<? super ApiResult<ReportPublishModel>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i = oooOOO0.f42927Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOO0.f42927Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objReportPublish = oooOOO0.f42925Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOO0.f42927Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objReportPublish);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                UserMomentService userMomentServiceOooO0OO = o0ooOOo.OooO0OO();
                oooOOO0.f42927Oooo0oo = 1;
                objReportPublish = userMomentServiceOooO0OO.reportPublish(oooOOO0);
                if (objReportPublish == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReportPublish);
            }
            return objReportPublish;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42120OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O1);
            return objOooO0O1;
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
