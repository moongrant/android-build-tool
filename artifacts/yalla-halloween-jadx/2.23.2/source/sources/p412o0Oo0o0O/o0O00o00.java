package p412o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000O00O;
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
import o000O00O.o000O0O0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p380o0OOoOo.o00oO0o;
import p384o0OOoo0O.o0Oo0oo;
import p386o0OOooO.o000000;
import p386o0OOooO.oo0o0Oo;
import p407o0Oo0Oo.oO00000;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.oO0O00o0;
import p590o0oOooo0.a0;
import p590o0oOooo0.oOO0OOO;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nYallaTeamMessageRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YallaTeamMessageRepo.kt\ncom/yalla/yalla/data/repository/YallaTeamMessageRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n18#2,7:66\n25#2,10:74\n18#2,2:84\n20#2,5:88\n25#2,10:94\n109#3:73\n109#3:93\n1855#4,2:86\n*S KotlinDebug\n*F\n+ 1 YallaTeamMessageRepo.kt\ncom/yalla/yalla/data/repository/YallaTeamMessageRepo\n*L\n19#1:66,7\n19#1:74,10\n31#1:84,2\n31#1:88,5\n31#1:94,10\n19#1:73\n31#1:93\n35#1:86,2\n*E\n"})
public final class o0O00o00 extends oO0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O00o00 f46318OooO00o = new o0O00o00();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {0, 0}, l = {32}, m = "submitCustomerSatisfaction", n = {"messageId", "score"}, s = {"J$0", "I$0"})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f46319OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public /* synthetic */ Object f46320OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f46321OooO0o0;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f46323OooO0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46320OooO0o = obj;
            this.f46323OooO0oo |= Integer.MIN_VALUE;
            return o0O00o00.this.OooO0O0(0L, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Nullable
    public final Object OooO00o(int i, @NotNull String str, @NotNull Continuation continuation) {
        o0oO0Ooo o0oo0ooo2;
        if (continuation instanceof o0oO0Ooo) {
            o0oo0ooo2 = (o0oO0Ooo) continuation;
            int i2 = o0oo0ooo2.f46340OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0oo0ooo2.f46340OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                o0oo0ooo2 = new o0oO0Ooo(this, continuation);
            }
        } else {
            o0oo0ooo2 = new o0oO0Ooo(this, continuation);
        }
        o0oO0Ooo o0oo0ooo3 = o0oo0ooo2;
        Object objFeedback = o0oo0ooo3.f46339OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = o0oo0ooo3.f46340OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objFeedback);
                Object value = o0Oo0oo.f43466OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                YallaTeamApiService yallaTeamApiService = (YallaTeamApiService) value;
                String strOooO0O0 = oOO0OOO.OooO0O0(str);
                Intrinsics.checkNotNullExpressionValue(strOooO0O0, "utf8ToUnicode(...)");
                String strValueOf = String.valueOf(i);
                String strOooO0O1 = oOO0OOO.OooO0O0(oo0o0Oo.OooO0Oo());
                Intrinsics.checkNotNullExpressionValue(strOooO0O1, "utf8ToUnicode(...)");
                String strOooO0O2 = oOO0OOO.OooO0O0(o000000.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + o000000.OooO0OO());
                Intrinsics.checkNotNullExpressionValue(strOooO0O2, "utf8ToUnicode(...)");
                String strOooO0Oo = o000000.OooO0Oo();
                String string = a0.OooO00o().toString();
                String strOooO0O3 = oOO0OOO.OooO0O0(NetworkStateUtil.INSTANCE.networkOperatorName(o000O00O.OooO00o()));
                Intrinsics.checkNotNullExpressionValue(strOooO0O3, "utf8ToUnicode(...)");
                o0oo0ooo3.f46340OooO0o = 1;
                objFeedback = yallaTeamApiService.feedback(strOooO0O0, strValueOf, strOooO0O1, strOooO0O2, strOooO0Oo, string, strOooO0O3, o0oo0ooo3);
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
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
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
            int i3 = oooO00o.f46323OooO0oo;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO00o.f46323OooO0oo = i3 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objSubmitCustomerSatisfaction = oooO00o.f46320OooO0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO00o.f46323OooO0oo;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                Object value = o0Oo0oo.f43466OooO00o.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                oooO00o.f46319OooO0Oo = j2;
                oooO00o.f46321OooO0o0 = i2;
                oooO00o.f46323OooO0oo = 1;
                objSubmitCustomerSatisfaction = ((YallaTeamApiService) value).submitCustomerSatisfaction(j2, i2, oooO00o);
                if (objSubmitCustomerSatisfaction == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i5 = oooO00o.f46321OooO0o0;
                long j3 = oooO00o.f46319OooO0Oo;
                ResultKt.throwOnFailure(objSubmitCustomerSatisfaction);
                i2 = i5;
                j2 = j3;
            }
            if (!((ApiResult) objSubmitCustomerSatisfaction).isSuccess()) {
                return objSubmitCustomerSatisfaction;
            }
            oO00000 oo00000Oooo0O0 = o00Oo0.OooO00o().Oooo0O0();
            Intrinsics.checkNotNullExpressionValue(oo00000Oooo0O0, "yallaTeamMessageDao(...)");
            for (YallaTeamMessage yallaTeamMessage : oO00000.OooO00o.OooO00o(oo00000Oooo0O0, j2)) {
                if ((yallaTeamMessage != null ? yallaTeamMessage.getSatisfactionSurvey() : null) != null) {
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey != null) {
                        satisfactionSurvey.setScore(i2);
                    }
                    YallaTeamMessage.SatisfactionSurvey satisfactionSurvey2 = yallaTeamMessage.getSatisfactionSurvey();
                    if (satisfactionSurvey2 != null) {
                        satisfactionSurvey2.setSubmit(true);
                    }
                    o00Oo0.OooO00o().Oooo0O0().OooO0oO(yallaTeamMessage);
                }
            }
            return objSubmitCustomerSatisfaction;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o000O0O0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            o0000O00.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }
}
