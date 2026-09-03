package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.app.base.app.appConfig.apiDataModela.OooO0O0;
import com.yalla.yalla.api.service.MainApiService;
import com.yalla.yalla.common.constant.LucklyPacket$Action;
import com.yalla.yalla.common.constant.LucklyPacket$Type;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.PacketHistoryModel;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o000O0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O0Oo f42574OooO00o = new o000O0Oo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.PacketRepo", f = "PacketRepo.kt", i = {}, l = {14, 16}, m = "loadPacketHistory", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42575Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42577Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42575Oooo0o = obj;
            this.f42577Oooo0oo |= Integer.MIN_VALUE;
            return o000O0Oo.this.OooO00o(null, null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Nullable
    public final Object OooO00o(@NotNull LucklyPacket$Type lucklyPacket$Type, @NotNull LucklyPacket$Action lucklyPacket$Action, int i, @NotNull Continuation<? super ApiResult<PacketHistoryModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f42577Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f42577Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objRedPaperRankList = oooO00o.f42575Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o.f42577Oooo0oo;
        String str = "";
        try {
            try {
                if (i3 != 0) {
                    if (i3 == 1) {
                        ResultKt.throwOnFailure(objRedPaperRankList);
                        return objRedPaperRankList;
                    }
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objRedPaperRankList);
                    return objRedPaperRankList;
                }
                ResultKt.throwOnFailure(objRedPaperRankList);
                if (lucklyPacket$Type == LucklyPacket$Type.Gift) {
                    o0o0000.OooO00o oooO00o2 = o0o0000.OooO00o.f40768OooO00o;
                    MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                    int value = lucklyPacket$Action.getValue();
                    oooO00o.f42577Oooo0oo = 1;
                    objRedPaperRankList = mainApiServiceOooO0OO.giftRedPaperRankList(value, i, oooO00o);
                    if (objRedPaperRankList == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objRedPaperRankList;
                }
                o0o0000.OooO00o oooO00o3 = o0o0000.OooO00o.f40768OooO00o;
                MainApiService mainApiServiceOooO0OO2 = o0o0000.OooO00o.OooO0OO();
                int value2 = lucklyPacket$Action.getValue();
                oooO00o.f42577Oooo0oo = 2;
                objRedPaperRankList = mainApiServiceOooO0OO2.redPaperRankList(value2, i, oooO00o);
                if (objRedPaperRankList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objRedPaperRankList;
            } catch (IOException e) {
                ApiError apiErrorOooO00o = OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
        } catch (IOException e3) {
            ApiError apiErrorOooO00o2 = OooO0O0.OooO00o(e3, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o5 = o0OOO0o.f42120OooO00o;
            String strOooO0oo4 = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o2);
            if (strOooO0oo4 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo4, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo4;
            }
            Object objOooO0O3 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O3);
            return objOooO0O3;
        } catch (CancellationException unused2) {
            ApiError apiError3 = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o6 = o0OOO0o.f42120OooO00o;
            String strOooO0oo5 = o0OOO0o.OooO00o().OooO0oo(apiError3);
            if (strOooO0oo5 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo5, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo5;
            }
            Object objOooO0O4 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O4);
            return objOooO0O4;
        } catch (Exception e4) {
            o00O00.OooO0o0("WebAPIException", e4.getMessage());
            e4.printStackTrace();
            String message2 = e4.getMessage();
            if (message2 == null) {
                message2 = e4.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message2, "e.message ?: e.javaClass.name");
            ApiError apiError4 = new ApiError(2, message2);
            o0OOO0o o0ooo0o7 = o0OOO0o.f42120OooO00o;
            String strOooO0oo6 = o0OOO0o.OooO00o().OooO0oo(apiError4);
            if (strOooO0oo6 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo6, "gson.toJson(model) ?: \"\"");
                str = strOooO0oo6;
            }
            Object objOooO0O5 = o0OOO0o.OooO0O0(str, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O5);
            return objOooO0O5;
        }
    }
}
