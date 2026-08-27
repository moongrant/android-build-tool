package com.yalla.yalla.domain;

import androidx.camera.camera2.internal.o000O00;
import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.json.JsonUtil;
import com.facebook.internal.ServerProtocol;
import com.yalla.yalla.api.call.YLApi$CommonRequest$callString$2;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.ext.o000;
import com.yalla.yalla.model.DomainLinkRequestItem;
import com.yalla.yalla.model.DomainModel;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p247o00oo0oO.o000OO0O;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 1)
public final class DomainConnectDetect {

    @StabilityInferred(parameters = 1)
    @SourceDebugExtension({"SMAP\nDomainConnectDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$RoomDomain\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtilKt\n*L\n1#1,451:1\n111#2:452\n37#3:453\n*S KotlinDebug\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$RoomDomain\n*L\n167#1:452\n168#1:453\n*E\n"})
    public static final class OooO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO f49272OooO00o = new OooO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final String f49273OooO0O0 = "/health/QKSZxWc9p1oAnTnSPFG1";

        public static Object OooO0O0(OooO oooO, List list, SuspendLambda suspendLambda) {
            oooO.getClass();
            return SupervisorKt.supervisorScope(new DomainConnectDetect$RoomDomain$isAvailableLeastOne$2(list, false, null), suspendLambda);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Nullable
        public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
            DomainConnectDetect$RoomDomain$isAvailable$1 domainConnectDetect$RoomDomain$isAvailable$1;
            Object objM7825constructorimpl;
            if (continuationImpl instanceof DomainConnectDetect$RoomDomain$isAvailable$1) {
                domainConnectDetect$RoomDomain$isAvailable$1 = (DomainConnectDetect$RoomDomain$isAvailable$1) continuationImpl;
                int i = domainConnectDetect$RoomDomain$isAvailable$1.f49284OooOO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    domainConnectDetect$RoomDomain$isAvailable$1.f49284OooOO0 = i - Integer.MIN_VALUE;
                } else {
                    domainConnectDetect$RoomDomain$isAvailable$1 = new DomainConnectDetect$RoomDomain$isAvailable$1(this, continuationImpl);
                }
            } else {
                domainConnectDetect$RoomDomain$isAvailable$1 = new DomainConnectDetect$RoomDomain$isAvailable$1(this, continuationImpl);
            }
            Object objOooO0Oo = domainConnectDetect$RoomDomain$isAvailable$1.f49283OooO0oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = domainConnectDetect$RoomDomain$isAvailable$1.f49284OooOO0;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objOooO0Oo);
                    Result.Companion companion = Result.INSTANCE;
                    String url = o000.OooOOO0(str) + f49273OooO0O0;
                    Intrinsics.checkNotNullParameter(url, "url");
                    com.yalla.yalla.api.call.OooO oooO = new com.yalla.yalla.api.call.OooO(url, 0);
                    LinkedHashMap linkedHashMap = oooO.f44950OooO0Oo;
                    oooO.OooO0o0();
                    linkedHashMap.put("AbortDataCheck", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    linkedHashMap.put("Custom", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    YLApi$CommonRequest$callString$2 yLApi$CommonRequest$callString$2 = new YLApi$CommonRequest$callString$2(oooO, null);
                    domainConnectDetect$RoomDomain$isAvailable$1.f49282OooO0oO = str;
                    domainConnectDetect$RoomDomain$isAvailable$1.f49284OooOO0 = 1;
                    objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(yLApi$CommonRequest$callString$2, domainConnectDetect$RoomDomain$isAvailable$1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = domainConnectDetect$RoomDomain$isAvailable$1.f49282OooO0oO;
                    ResultKt.throwOnFailure(objOooO0Oo);
                }
                JsonUtil.f27146OooO00o.getClass();
                objM7825constructorimpl = Result.m7825constructorimpl((RoomDomainManager.HostLinkCode) JsonUtil.OooO0Oo(RoomDomainManager.HostLinkCode.class, (String) objOooO0Oo));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
            }
            RoomDomainManager.HostLinkCode hostLinkCode = (RoomDomainManager.HostLinkCode) (Result.m7831isFailureimpl(objM7825constructorimpl) ? null : objM7825constructorimpl);
            com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
            String url2 = str + "/Webservers/apk/CheckHealthy";
            Intrinsics.checkNotNullParameter(url2, "url");
            oooO00o.OooO0o(4, o000O00.OooO00o("直连探测：探测房间域名-\nurl = ", o000OO0O.OooO00o(new com.yalla.yalla.api.call.OooO(url2, 0)), "\nresult = ", o000OO0O.OooO00o(hostLinkCode), ","));
            return new DomainLinkRequestItem(str, hostLinkCode != null && hostLinkCode.getCode() == 200);
        }
    }

    @StabilityInferred(parameters = 1)
    @SourceDebugExtension({"SMAP\nDomainConnectDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$FileDomain\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,451:1\n91#2,14:452\n*S KotlinDebug\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$FileDomain\n*L\n278#1:452,14\n*E\n"})
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO00o f49274OooO00o = new OooO00o();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final String f49275OooO0O0 = "/CheckHealthy.json";

        public static Object OooO0O0(OooO00o oooO00o, List list, SuspendLambda suspendLambda) {
            oooO00o.getClass();
            return SupervisorKt.supervisorScope(new DomainConnectDetect$FileDomain$isAvailableLeastOne$2(list, false, null), suspendLambda);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Nullable
        public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
            DomainConnectDetect$FileDomain$isAvailable$1 domainConnectDetect$FileDomain$isAvailable$1;
            String str2;
            Throwable th;
            com.yalla.yalla.api.call.OooO oooO;
            Object objM7825constructorimpl;
            if (continuationImpl instanceof DomainConnectDetect$FileDomain$isAvailable$1) {
                domainConnectDetect$FileDomain$isAvailable$1 = (DomainConnectDetect$FileDomain$isAvailable$1) continuationImpl;
                int i = domainConnectDetect$FileDomain$isAvailable$1.f49188OooOO0O;
                if ((i & Integer.MIN_VALUE) != 0) {
                    domainConnectDetect$FileDomain$isAvailable$1.f49188OooOO0O = i - Integer.MIN_VALUE;
                } else {
                    domainConnectDetect$FileDomain$isAvailable$1 = new DomainConnectDetect$FileDomain$isAvailable$1(this, continuationImpl);
                }
            } else {
                domainConnectDetect$FileDomain$isAvailable$1 = new DomainConnectDetect$FileDomain$isAvailable$1(this, continuationImpl);
            }
            Object objOooO0Oo = domainConnectDetect$FileDomain$isAvailable$1.f49184OooO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = domainConnectDetect$FileDomain$isAvailable$1.f49188OooOO0O;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0Oo);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String url = str + f49275OooO0O0;
                    Intrinsics.checkNotNullParameter(url, "url");
                    com.yalla.yalla.api.call.OooO oooO2 = new com.yalla.yalla.api.call.OooO(url, 0);
                    oooO2.OooO0o0();
                    DomainConnectDetect$FileDomain$isAvailable$lambda$0$$inlined$call$1 domainConnectDetect$FileDomain$isAvailable$lambda$0$$inlined$call$1 = new DomainConnectDetect$FileDomain$isAvailable$lambda$0$$inlined$call$1(oooO2, null);
                    domainConnectDetect$FileDomain$isAvailable$1.f49185OooO0oO = str;
                    domainConnectDetect$FileDomain$isAvailable$1.f49186OooO0oo = oooO2;
                    domainConnectDetect$FileDomain$isAvailable$1.f49188OooOO0O = 1;
                    objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(domainConnectDetect$FileDomain$isAvailable$lambda$0$$inlined$call$1, domainConnectDetect$FileDomain$isAvailable$1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                    oooO = oooO2;
                } catch (Throwable th2) {
                    str2 = str;
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooO = domainConnectDetect$FileDomain$isAvailable$1.f49186OooO0oo;
                str2 = domainConnectDetect$FileDomain$isAvailable$1.f49185OooO0oO;
                try {
                    ResultKt.throwOnFailure(objOooO0Oo);
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            }
            ApiResult apiResult = (ApiResult) objOooO0Oo;
            if (!apiResult.isSuccess()) {
                com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
            }
            com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
            String url2 = str2 + "/Webservers/apk/CheckHealthy";
            Intrinsics.checkNotNullParameter(url2, "url");
            oooO00o.OooO0o(4, "直连探测：探测文件域名-\nurl = " + o000OO0O.OooO00o(new com.yalla.yalla.api.call.OooO(url2, 0)) + "\nresult = " + o000OO0O.OooO00o(apiResult) + ",");
            objM7825constructorimpl = Result.m7825constructorimpl(Boxing.boxBoolean(apiResult.isSuccess()));
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            if (Result.m7831isFailureimpl(objM7825constructorimpl)) {
                objM7825constructorimpl = boolBoxBoolean;
            }
            return new DomainLinkRequestItem(str2, ((Boolean) objM7825constructorimpl).booleanValue());
        }
    }

    @StabilityInferred(parameters = 1)
    @SourceDebugExtension({"SMAP\nDomainConnectDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$GameDomain\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtilKt\n*L\n1#1,451:1\n111#2:452\n37#3:453\n*S KotlinDebug\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$GameDomain\n*L\n225#1:452\n226#1:453\n*E\n"})
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0O0 f49276OooO00o = new OooO0O0();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final String f49277OooO0O0 = "/health/QLSZxWc9t1oPnTnSPFG1";

        public static Object OooO0O0(OooO0O0 oooO0O0, List list, SuspendLambda suspendLambda) {
            oooO0O0.getClass();
            return SupervisorKt.supervisorScope(new DomainConnectDetect$GameDomain$isAvailableLeastOne$2(list, false, null), suspendLambda);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0015  */
        @Nullable
        public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
            DomainConnectDetect$GameDomain$isAvailable$1 domainConnectDetect$GameDomain$isAvailable$1;
            Object objM7825constructorimpl;
            if (continuationImpl instanceof DomainConnectDetect$GameDomain$isAvailable$1) {
                domainConnectDetect$GameDomain$isAvailable$1 = (DomainConnectDetect$GameDomain$isAvailable$1) continuationImpl;
                int i = domainConnectDetect$GameDomain$isAvailable$1.f49211OooOO0;
                if ((i & Integer.MIN_VALUE) != 0) {
                    domainConnectDetect$GameDomain$isAvailable$1.f49211OooOO0 = i - Integer.MIN_VALUE;
                } else {
                    domainConnectDetect$GameDomain$isAvailable$1 = new DomainConnectDetect$GameDomain$isAvailable$1(this, continuationImpl);
                }
            } else {
                domainConnectDetect$GameDomain$isAvailable$1 = new DomainConnectDetect$GameDomain$isAvailable$1(this, continuationImpl);
            }
            Object objOooO0Oo = domainConnectDetect$GameDomain$isAvailable$1.f49210OooO0oo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = domainConnectDetect$GameDomain$isAvailable$1.f49211OooOO0;
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objOooO0Oo);
                    Result.Companion companion = Result.INSTANCE;
                    String url = o000.OooOOO0(str) + f49277OooO0O0;
                    Intrinsics.checkNotNullParameter(url, "url");
                    com.yalla.yalla.api.call.OooO oooO = new com.yalla.yalla.api.call.OooO(url, 0);
                    LinkedHashMap linkedHashMap = oooO.f44950OooO0Oo;
                    oooO.OooO0o0();
                    linkedHashMap.put("AbortDataCheck", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    linkedHashMap.put("Custom", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
                    YLApi$CommonRequest$callString$2 yLApi$CommonRequest$callString$2 = new YLApi$CommonRequest$callString$2(oooO, null);
                    domainConnectDetect$GameDomain$isAvailable$1.f49209OooO0oO = str;
                    domainConnectDetect$GameDomain$isAvailable$1.f49211OooOO0 = 1;
                    objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(yLApi$CommonRequest$callString$2, domainConnectDetect$GameDomain$isAvailable$1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = domainConnectDetect$GameDomain$isAvailable$1.f49209OooO0oO;
                    ResultKt.throwOnFailure(objOooO0Oo);
                }
                JsonUtil.f27146OooO00o.getClass();
                objM7825constructorimpl = Result.m7825constructorimpl((RoomDomainManager.HostLinkCode) JsonUtil.OooO0Oo(RoomDomainManager.HostLinkCode.class, (String) objOooO0Oo));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
            }
            RoomDomainManager.HostLinkCode hostLinkCode = (RoomDomainManager.HostLinkCode) (Result.m7831isFailureimpl(objM7825constructorimpl) ? null : objM7825constructorimpl);
            com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
            String url2 = str + "/Webservers/apk/CheckHealthy";
            Intrinsics.checkNotNullParameter(url2, "url");
            oooO00o.OooO0o(4, o000O00.OooO00o("直连探测：探测游戏域名-\nurl = ", o000OO0O.OooO00o(new com.yalla.yalla.api.call.OooO(url2, 0)), "\nresult = ", o000OO0O.OooO00o(hostLinkCode), ","));
            return new DomainLinkRequestItem(str, hostLinkCode != null && hostLinkCode.getCode() == 200);
        }
    }

    @StabilityInferred(parameters = 0)
    @SourceDebugExtension({"SMAP\nDomainConnectDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$LoginDomain\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,451:1\n91#2,14:452\n*S KotlinDebug\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$LoginDomain\n*L\n110#1:452,14\n*E\n"})
    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0OO f49278OooO00o = new OooO0OO();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public static final List<String> f49279OooO0O0 = CollectionsKt.mutableListOf("User/UserSmRegister", "User/Userlogin", "User/TwitterLogin", "User/FbLogin", "User/ApLogin", "User/PhoneSaleLogin", "User/VisitorLogin", "User/ActivateAccount", "User/GetUserToken", "User/UserInformation", "User/CheckPhoneRegister", "Account/EmailLogin", "Account/EmailRegister", "Account/CheckEmailRegister", "Account/GoogleLogin", "Account/YallaChatLogin", "Api/GetConfig", "Api/GetInitConfig", "AppUI/GetCountry");

        public static Object OooO0O0(OooO0OO oooO0OO, List list, SuspendLambda suspendLambda) {
            oooO0OO.getClass();
            return SupervisorKt.supervisorScope(new DomainConnectDetect$LoginDomain$isAvailableLeastOne$2(list, null), suspendLambda);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Nullable
        public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
            DomainConnectDetect$LoginDomain$isAvailable$1 domainConnectDetect$LoginDomain$isAvailable$1;
            com.yalla.yalla.api.call.OooO oooO;
            Throwable th;
            Object objM7825constructorimpl;
            String str2 = str;
            if (continuationImpl instanceof DomainConnectDetect$LoginDomain$isAvailable$1) {
                domainConnectDetect$LoginDomain$isAvailable$1 = (DomainConnectDetect$LoginDomain$isAvailable$1) continuationImpl;
                int i = domainConnectDetect$LoginDomain$isAvailable$1.f49231OooOO0O;
                if ((i & Integer.MIN_VALUE) != 0) {
                    domainConnectDetect$LoginDomain$isAvailable$1.f49231OooOO0O = i - Integer.MIN_VALUE;
                } else {
                    domainConnectDetect$LoginDomain$isAvailable$1 = new DomainConnectDetect$LoginDomain$isAvailable$1(this, continuationImpl);
                }
            } else {
                domainConnectDetect$LoginDomain$isAvailable$1 = new DomainConnectDetect$LoginDomain$isAvailable$1(this, continuationImpl);
            }
            Object objOooO0Oo = domainConnectDetect$LoginDomain$isAvailable$1.f49227OooO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = domainConnectDetect$LoginDomain$isAvailable$1.f49231OooOO0O;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0Oo);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String url = str2 + "/Webservers/apk/CheckHealthy";
                    Intrinsics.checkNotNullParameter(url, "url");
                    oooO = new com.yalla.yalla.api.call.OooO(url, 0);
                    oooO.OooO0o0();
                    DomainConnectDetect$LoginDomain$isAvailable$lambda$0$$inlined$call$1 domainConnectDetect$LoginDomain$isAvailable$lambda$0$$inlined$call$1 = new DomainConnectDetect$LoginDomain$isAvailable$lambda$0$$inlined$call$1(oooO, null);
                    domainConnectDetect$LoginDomain$isAvailable$1.f49228OooO0oO = str2;
                    domainConnectDetect$LoginDomain$isAvailable$1.f49229OooO0oo = oooO;
                    domainConnectDetect$LoginDomain$isAvailable$1.f49231OooOO0O = 1;
                    objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(domainConnectDetect$LoginDomain$isAvailable$lambda$0$$inlined$call$1, domainConnectDetect$LoginDomain$isAvailable$1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.yalla.yalla.api.call.OooO oooO2 = domainConnectDetect$LoginDomain$isAvailable$1.f49229OooO0oo;
                String str3 = domainConnectDetect$LoginDomain$isAvailable$1.f49228OooO0oO;
                try {
                    ResultKt.throwOnFailure(objOooO0Oo);
                    oooO = oooO2;
                    str2 = str3;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            }
            ApiResult apiResult = (ApiResult) objOooO0Oo;
            if (!apiResult.isSuccess()) {
                com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
            }
            com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
            String url2 = str2 + "/Webservers/apk/CheckHealthy";
            Intrinsics.checkNotNullParameter(url2, "url");
            oooO00o.OooO0o(4, "直连探测：探测登录域名-\nurl = " + o000OO0O.OooO00o(new com.yalla.yalla.api.call.OooO(url2, 0)) + "\nresult = " + o000OO0O.OooO00o(apiResult) + ",");
            objM7825constructorimpl = Result.m7825constructorimpl(Boxing.boxBoolean(apiResult.isSuccess()));
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            if (Result.m7831isFailureimpl(objM7825constructorimpl)) {
                objM7825constructorimpl = boolBoxBoolean;
            }
            return new DomainLinkRequestItem(str2, ((Boolean) objM7825constructorimpl).booleanValue());
        }
    }

    @StabilityInferred(parameters = 1)
    @SourceDebugExtension({"SMAP\nDomainConnectDetect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$MainDomain\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n*L\n1#1,451:1\n91#2,14:452\n*S KotlinDebug\n*F\n+ 1 DomainConnectDetect.kt\ncom/yalla/yalla/domain/DomainConnectDetect$MainDomain\n*L\n33#1:452,14\n*E\n"})
    public static final class OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public static final OooO0o f49280OooO00o = new OooO0o();

        public static Object OooO0O0(OooO0o oooO0o, List list, SuspendLambda suspendLambda) {
            oooO0o.getClass();
            return SupervisorKt.supervisorScope(new DomainConnectDetect$MainDomain$isAvailableLeastOne$2(list, false, null), suspendLambda);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001b  */
        @Nullable
        public final Object OooO00o(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
            DomainConnectDetect$MainDomain$isAvailable$1 domainConnectDetect$MainDomain$isAvailable$1;
            com.yalla.yalla.api.call.OooO oooO;
            Throwable th;
            Object objM7825constructorimpl;
            String str2 = str;
            if (continuationImpl instanceof DomainConnectDetect$MainDomain$isAvailable$1) {
                domainConnectDetect$MainDomain$isAvailable$1 = (DomainConnectDetect$MainDomain$isAvailable$1) continuationImpl;
                int i = domainConnectDetect$MainDomain$isAvailable$1.f49252OooOO0O;
                if ((i & Integer.MIN_VALUE) != 0) {
                    domainConnectDetect$MainDomain$isAvailable$1.f49252OooOO0O = i - Integer.MIN_VALUE;
                } else {
                    domainConnectDetect$MainDomain$isAvailable$1 = new DomainConnectDetect$MainDomain$isAvailable$1(this, continuationImpl);
                }
            } else {
                domainConnectDetect$MainDomain$isAvailable$1 = new DomainConnectDetect$MainDomain$isAvailable$1(this, continuationImpl);
            }
            Object objOooO0Oo = domainConnectDetect$MainDomain$isAvailable$1.f49248OooO;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = domainConnectDetect$MainDomain$isAvailable$1.f49252OooOO0O;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0Oo);
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String url = str2 + "/Webservers/apk/CheckHealthy";
                    Intrinsics.checkNotNullParameter(url, "url");
                    oooO = new com.yalla.yalla.api.call.OooO(url, 0);
                    oooO.OooO0o0();
                    DomainConnectDetect$MainDomain$isAvailable$lambda$0$$inlined$call$1 domainConnectDetect$MainDomain$isAvailable$lambda$0$$inlined$call$1 = new DomainConnectDetect$MainDomain$isAvailable$lambda$0$$inlined$call$1(oooO, null);
                    domainConnectDetect$MainDomain$isAvailable$1.f49249OooO0oO = str2;
                    domainConnectDetect$MainDomain$isAvailable$1.f49250OooO0oo = oooO;
                    domainConnectDetect$MainDomain$isAvailable$1.f49252OooOO0O = 1;
                    objOooO0Oo = com.code.android.util.o0Oo0oo.OooO0Oo(domainConnectDetect$MainDomain$isAvailable$lambda$0$$inlined$call$1, domainConnectDetect$MainDomain$isAvailable$1);
                    if (objOooO0Oo == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.yalla.yalla.api.call.OooO oooO2 = domainConnectDetect$MainDomain$isAvailable$1.f49250OooO0oo;
                String str3 = domainConnectDetect$MainDomain$isAvailable$1.f49249OooO0oO;
                try {
                    ResultKt.throwOnFailure(objOooO0Oo);
                    oooO = oooO2;
                    str2 = str3;
                } catch (Throwable th3) {
                    th = th3;
                    str2 = str3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM7825constructorimpl = Result.m7825constructorimpl(ResultKt.createFailure(th));
                }
            }
            ApiResult apiResult = (ApiResult) objOooO0Oo;
            if (!apiResult.isSuccess()) {
                com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o.OooO0OO(oooO.f44947OooO00o, false, 0L, apiResult.getMessage());
            }
            com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
            String url2 = str2 + "/Webservers/apk/CheckHealthy";
            Intrinsics.checkNotNullParameter(url2, "url");
            oooO00o.OooO0o(4, "直连探测：探测主域名-\nurl = " + o000OO0O.OooO00o(new com.yalla.yalla.api.call.OooO(url2, 0)) + "\nresult = " + o000OO0O.OooO00o(apiResult) + ",");
            objM7825constructorimpl = Result.m7825constructorimpl(Boxing.boxBoolean(apiResult.isSuccess()));
            Boolean boolBoxBoolean = Boxing.boxBoolean(false);
            if (Result.m7831isFailureimpl(objM7825constructorimpl)) {
                objM7825constructorimpl = boolBoxBoolean;
            }
            return new DomainLinkRequestItem(str2, ((Boolean) objM7825constructorimpl).booleanValue());
        }
    }

    @Nullable
    public static Object OooO00o(@Nullable DomainModel.Domains domains, @NotNull SuspendLambda suspendLambda) {
        return SupervisorKt.supervisorScope(new DomainConnectDetect$checkAvailableAuto$2(domains, null), suspendLambda);
    }

    @Nullable
    public static Object OooO0O0(@NotNull Continuation continuation) {
        return SupervisorKt.supervisorScope(new DomainConnectDetect$test$2(2, null), continuation);
    }
}
