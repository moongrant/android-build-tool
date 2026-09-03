package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O0;
import com.common.support.networkstate.NetworkStateUtil;
import com.yalla.yalla.api.old.service.YallaTeamApiService;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p376o0OOoOOO.o00;
import p376o0OOoOOO.o00O0000;
import p377o0OOoOo.o000OO0O;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p403o0Oo0OOo.oO0oO000;
import p464o0Oooo.o0O0oo0o;
import p579o0oOoo.oO;
import p579o0oOoo.oO000Oo0;
import p581o0oOoo00.o000OOo;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYallaTeamMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageRepo.kt\ncom/yalla/yalla/data/repository/YallaTeamMessageRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n18#2,7:66\n25#2,10:74\n18#2,2:84\n20#2,5:88\n25#2,10:94\n109#3:73\n109#3:93\n1855#4,2:86\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageRepo.kt\ncom/yalla/yalla/data/repository/YallaTeamMessageRepo\n*L\n19#1:66,7\n19#1:74,10\n31#1:84,2\n31#1:88,5\n31#1:94,10\n19#1:73\n31#1:93\n35#1:86,2\n*E\n"})
public final class r0 extends o0O0oo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final r0 f45135OooO00o = new r0();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {0, 0}, l = {32}, m = "submitCustomerSatisfaction", n = {"messageId", "score"}, s = {"J$0", "I$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f45136OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f45137OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f45138OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f45140OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f45137OooO0o = obj;
            this.f45140OooO0oo |= Integer.MIN_VALUE;
            return r0.this.OooO0O0(0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO00o(int i, @NotNull String str, @NotNull Continuation continuation) {
        q0 q0Var;
        if (continuation instanceof q0) {
            q0Var = (q0) continuation;
            int i2 = q0Var.f45102OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.f45102OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(this, continuation);
            }
        } else {
            q0Var = new q0(this, continuation);
        }
        q0 q0Var2 = q0Var;
        Object objFeedback = q0Var2.f45101OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = q0Var2.f45102OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objFeedback);
                Object value = o000OO0O.f44234OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-yallaTeam>(...)");
                YallaTeamApiService yallaTeamApiService = (YallaTeamApiService) value;
                String strOooO0O0 = oO000Oo0.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(message)");
                String strValueOf = String.valueOf(i);
                String strOooO0O1 = oO000Oo0.OooO0O0(o00Ooo.OooO0Oo());
                Intrinsics.checkNotNullExpressionValue(strOooO0O1, "utf8ToUnicode(AppInfo.versionName)");
                String strOooO0O2 = oO000Oo0.OooO0O0(oo000o.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + oo000o.OooO0OO());
                Intrinsics.checkNotNullExpressionValue(strOooO0O2, "utf8ToUnicode(Device.pho… \" \" + Device.phoneModel)");
                String strOooO0Oo = oo000o.OooO0Oo();
                String string = oO.OooO00o().toString();
                String strOooO0O3 = oO000Oo0.OooO0O0(NetworkStateUtil.INSTANCE.networkOperatorName(o000O0.OooO00o()));
                Intrinsics.checkNotNullExpressionValue(strOooO0O3, "utf8ToUnicode(NetworkSta…ratorName(Utils.context))");
                q0Var2.f45102OooO0o = 1;
                objFeedback = yallaTeamApiService.feedback(strOooO0O0, strValueOf, strOooO0O1, strOooO0O2, strOooO0Oo, string, strOooO0O3, q0Var2);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO0O0(long j, int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO00o oooO00o;
        long j2 = j;
        int i2 = i;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i3 = oooO00o.f45140OooO0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f45140OooO0oo = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objSubmitCustomerSatisfaction = oooO00o.f45137OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f45140OooO0oo;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                Object value = o000OO0O.f44234OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "<get-yallaTeam>(...)");
                oooO00o.f45136OooO0Oo = j2;
                oooO00o.f45138OooO0o0 = i2;
                oooO00o.f45140OooO0oo = 1;
                objSubmitCustomerSatisfaction = ((YallaTeamApiService) value).submitCustomerSatisfaction(j2, i2, oooO00o);
                if (objSubmitCustomerSatisfaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = oooO00o.f45138OooO0o0;
                long j3 = oooO00o.f45136OooO0Oo;
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                i2 = i5;
                j2 = j3;
            }
            if (!((ApiResult) objSubmitCustomerSatisfaction).isSuccess()) {
                return objSubmitCustomerSatisfaction;
            }
            oO0oO000 oo0oo000Oooo0 = o000OOo.OooO00o().Oooo0();
            Intrinsics.checkNotNullExpressionValue(oo0oo000Oooo0, "DB.yallaTeamMessageDao()");
            for (YallaTeamMessage yallaTeamMessage : oO0oO000.OooO00o.OooO00o(oo0oo000Oooo0, j2)) {
                if ((yallaTeamMessage != null ? yallaTeamMessage.getSatisfactionSurvey() : null) != null) {
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey != null) {
                        satisfactionSurvey.setScore(i2);
                    }
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey2 = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey2 != null) {
                        satisfactionSurvey2.setSubmit(true);
                    }
                    o000OOo.OooO00o().Oooo0().OooO0oO(yallaTeamMessage);
                }
            }
            return objSubmitCustomerSatisfaction;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            OooOOO0.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
