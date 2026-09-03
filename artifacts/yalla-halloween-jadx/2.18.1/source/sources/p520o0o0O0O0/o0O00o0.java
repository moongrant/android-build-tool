package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.support.common.util.NetworkUtil;
import com.yalla.yalla.api.service.YallaTeamApiService;
import com.yalla.yalla.common.db.table.YallaTeamMessage;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.FeedbackModel;
import com.yalla.yalla.util.NetWork;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.o00Oo0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p490o0o00O0.o000000;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.o00O00OO;
import p515o0o0O00.o00O00;
import p516o0o0O000.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O00o0 extends o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00o0 f42793OooO00o = new o0O00o0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {}, l = {19}, m = "sendYallaTeamMessage", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42794Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42796Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42794Oooo0o = obj;
            this.f42796Oooo0oo |= Integer.MIN_VALUE;
            return o0O00o0.this.OooO00o(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {0, 0}, l = {31}, m = "submitCustomerSatisfaction", n = {"messageId", "score"}, s = {"J$0", "I$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public long f42798Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f42799Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public /* synthetic */ Object f42800Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f42801OoooO00;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42800Oooo0oo = obj;
            this.f42801OoooO00 |= Integer.MIN_VALUE;
            return o0O00o0.this.OooO0O0(0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooO00o(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<FeedbackModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f42796Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f42796Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        OooO00o oooO00o2 = oooO00o;
        Object objFeedback = oooO00o2.f42794Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o2.f42796Oooo0oo;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objFeedback);
                o00Oo0 o00oo1 = o00Oo0.f40833OooO00o;
                YallaTeamApiService yallaTeamApiServiceOooO00o = o00Oo0.OooO00o();
                String strOooO0O0 = o000oOoO.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(message)");
                String strValueOf = String.valueOf(i);
                o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
                String strOooO0O1 = o000oOoO.OooO0O0(o0OOO0o.OooO0O0());
                Intrinsics.checkNotNullExpressionValue(strOooO0O1, "utf8ToUnicode(AppInfo.versionName)");
                StringBuilder sb = new StringBuilder();
                o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
                sb.append(o0Oo0oo.OooO0O0());
                sb.append(' ');
                sb.append(o0Oo0oo.OooO0OO());
                String strOooO0O2 = o000oOoO.OooO0O0(sb.toString());
                Intrinsics.checkNotNullExpressionValue(strOooO0O2, "utf8ToUnicode(Device.pho… \" \" + Device.phoneModel)");
                String strOooO0Oo = o0Oo0oo.OooO0Oo();
                String string = NetWork.OooO00o().toString();
                String strOooO0O3 = o000oOoO.OooO0O0(NetworkUtil.f20498OooO00o.OooO0Oo());
                Intrinsics.checkNotNullExpressionValue(strOooO0O3, "utf8ToUnicode(NetworkUtil.networkOperatorName())");
                oooO00o2.f42796Oooo0oo = 1;
                objFeedback = yallaTeamApiServiceOooO00o.feedback(strOooO0O0, strValueOf, strOooO0O1, strOooO0O2, strOooO0Oo, string, strOooO0O3, oooO00o2);
                if (objFeedback == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objFeedback);
            }
            return objFeedback;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o5 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Nullable
    public final Object OooO0O0(long j, int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO0O0 oooO0O0;
        long j2;
        int i2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i3 = oooO0O0.f42801OoooO00;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42801OoooO00 = i3 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objSubmitCustomerSatisfaction = oooO0O0.f42800Oooo0oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO0O0.f42801OoooO00;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                o00Oo0 o00oo1 = o00Oo0.f40833OooO00o;
                YallaTeamApiService yallaTeamApiServiceOooO00o = o00Oo0.OooO00o();
                oooO0O0.f42798Oooo0o = j;
                oooO0O0.f42799Oooo0oO = i;
                oooO0O0.f42801OoooO00 = 1;
                objSubmitCustomerSatisfaction = yallaTeamApiServiceOooO00o.submitCustomerSatisfaction(j, i, oooO0O0);
                if (objSubmitCustomerSatisfaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j2 = j;
                i2 = i;
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = oooO0O0.f42799Oooo0oO;
                long j3 = oooO0O0.f42798Oooo0o;
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                j2 = j3;
            }
            if (!((ApiResult) objSubmitCustomerSatisfaction).isSuccess()) {
                return objSubmitCustomerSatisfaction;
            }
            o000000 o000000VarOooo0OO = OooO0OO.OooO00o().Oooo0OO();
            Intrinsics.checkNotNullExpressionValue(o000000VarOooo0OO, "DB.yallaTeamMessageDao()");
            for (YallaTeamMessage yallaTeamMessage : o000000.OooO00o.OooO00o(o000000VarOooo0OO, j2, 0L, 2, null)) {
                if ((yallaTeamMessage != null ? yallaTeamMessage.getSatisfactionSurvey() : null) != null) {
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey != null) {
                        satisfactionSurvey.setScore(i2);
                    }
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey2 = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey2 != null) {
                        satisfactionSurvey2.setSubmit(true);
                    }
                    OooO0OO.OooO00o().Oooo0OO().OooO0o(yallaTeamMessage);
                }
            }
            return objSubmitCustomerSatisfaction;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            p516o0o0O000.o0OOO0o o0ooo0o2 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo;
            }
            Object objOooO0O0 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
            return objOooO0O0;
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            p516o0o0O000.o0OOO0o o0ooo0o3 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo2 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo2;
            }
            Object objOooO0O1 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
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
            p516o0o0O000.o0OOO0o o0ooo0o4 = p516o0o0O000.o0OOO0o.f42120OooO00o;
            String strOooO0oo3 = p516o0o0O000.o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo3;
            }
            Object objOooO0O2 = p516o0o0O000.o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O2);
            return objOooO0O2;
        }
    }
}
