package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.data.constant.LucklyPacket$Action;
import com.yalla.yalla.data.constant.LucklyPacket$Type;
import com.yalla.yalla.model.PacketHistoryModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
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
import p377o0OOoOo.o0000O00;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nPacketRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PacketRepo.kt\ncom/yalla/yalla/data/repository/PacketRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,18:1\n18#2,7:19\n25#2,10:27\n18#2,7:37\n25#2,10:45\n109#3:26\n109#3:44\n*S KotlinDebug\n*F\n+ 1 PacketRepo.kt\ncom/yalla/yalla/data/repository/PacketRepo\n*L\n13#1:19,7\n13#1:27,10\n15#1:37,7\n15#1:45,10\n13#1:26\n15#1:44\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final k f44846OooO00o = new k();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.PacketRepo", f = "PacketRepo.kt", i = {}, l = {13, 15}, m = "loadPacketHistory", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44847OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44848OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44847OooO0Oo = obj;
            this.f44848OooO0o |= Integer.MIN_VALUE;
            return k.this.OooO00o(null, null, 0, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0128  */
    /* JADX WARN: Code duplicated, block: B:60:0x0143  */
    /* JADX WARN: Code duplicated, block: B:66:0x0165  */
    /* JADX WARN: Code duplicated, block: B:71:0x0187  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Nullable
    public final Object OooO00o(@NotNull LucklyPacket$Type lucklyPacket$Type, @NotNull LucklyPacket$Action lucklyPacket$Action, int i, @NotNull Continuation<? super ApiResult<PacketHistoryModel>> continuation) {
        OooO00o oooO00o;
        Class cls;
        CancellationException cancellationException;
        String message;
        String name;
        String strOooO0oo;
        String strOooO0oo2;
        String strOooO0oo3;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f44848OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f44848OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objGiftRedPaperRankList = oooO00o.f44847OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o.f44848OooO0o;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    ResultKt.throwOnFailure(objGiftRedPaperRankList);
                    return objGiftRedPaperRankList;
                }
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(objGiftRedPaperRankList);
                    return objGiftRedPaperRankList;
                } catch (IOException e) {
                    e = e;
                    cls = ApiResult.class;
                    strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
                    if (strOooO0oo3 == null) {
                        strOooO0oo3 = "";
                    }
                    Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo3);
                    Intrinsics.checkNotNull(objOooO0OO);
                    return objOooO0OO;
                } catch (CancellationException e2) {
                    cancellationException = e2;
                    cls = ApiResult.class;
                    strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", cancellationException, 3, "canceled", null, 4, null));
                    if (strOooO0oo2 == null) {
                        strOooO0oo2 = "";
                    }
                    Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo2);
                    Intrinsics.checkNotNull(objOooO0OO2);
                    return objOooO0OO2;
                } catch (Exception e3) {
                    e = e3;
                    cls = ApiResult.class;
                    OooOOO0.OooO0o0("WebAPIException", e.getMessage(), e);
                    message = e.getMessage();
                    if (message == null) {
                        name = e.getClass().getName();
                    } else {
                        name = message;
                    }
                    Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
                    strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                    if (strOooO0oo == null) {
                        strOooO0oo = "";
                    }
                    Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo);
                    Intrinsics.checkNotNull(objOooO0OO3);
                    return objOooO0OO3;
                }
            }
            ResultKt.throwOnFailure(objGiftRedPaperRankList);
            if (lucklyPacket$Type == LucklyPacket$Type.Gift) {
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                int value = lucklyPacket$Action.getValue();
                oooO00o.f44848OooO0o = 1;
                objGiftRedPaperRankList = mainApiServiceOooO00o.giftRedPaperRankList(value, i, oooO00o);
                if (objGiftRedPaperRankList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objGiftRedPaperRankList;
            }
            cls = ApiResult.class;
            try {
                MainApiService mainApiServiceOooO00o2 = o0000O00.OooO00o();
                int value2 = lucklyPacket$Action.getValue();
                oooO00o.f44848OooO0o = 2;
                Object objRedPaperRankList = mainApiServiceOooO00o2.redPaperRankList(value2, i, oooO00o);
                return objRedPaperRankList == coroutine_suspended ? coroutine_suspended : objRedPaperRankList;
            } catch (IOException e4) {
                e = e4;
                strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
                if (strOooO0oo3 == null) {
                    strOooO0oo3 = "";
                }
                Object objOooO0OO4 = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo3);
                Intrinsics.checkNotNull(objOooO0OO4);
                return objOooO0OO4;
            } catch (CancellationException e5) {
                cancellationException = e5;
                strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", cancellationException, 3, "canceled", null, 4, null));
                if (strOooO0oo2 == null) {
                    strOooO0oo2 = "";
                }
                Object objOooO0OO5 = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo2);
                Intrinsics.checkNotNull(objOooO0OO5);
                return objOooO0OO5;
            } catch (Exception e6) {
                e = e6;
                OooOOO0.OooO0o0("WebAPIException", e.getMessage(), e);
                message = e.getMessage();
                if (message == null) {
                    name = e.getClass().getName();
                } else {
                    name = message;
                }
                Intrinsics.checkNotNullExpressionValue(name, "e.message ?: e.javaClass.name");
                strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
                if (strOooO0oo == null) {
                    strOooO0oo = "";
                }
                Object objOooO0OO6 = com.code.android.json.OooO00o.OooO0OO(cls, strOooO0oo);
                Intrinsics.checkNotNull(objOooO0OO6);
                return objOooO0OO6;
            }
        } catch (IOException e7) {
            String strOooO0oo4 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00.OooO00o("WebAPIException", "time out ", e7, 1, "time out", null, 4, null));
            if (strOooO0oo4 == null) {
                strOooO0oo4 = "";
            }
            Object objOooO0OO7 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo4);
            Intrinsics.checkNotNull(objOooO0OO7);
            return objOooO0OO7;
        } catch (CancellationException e8) {
            String strOooO0oo5 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0000.OooO00o("WebAPIException", "canceled ", e8, 3, "canceled", null, 4, null));
            if (strOooO0oo5 == null) {
                strOooO0oo5 = "";
            }
            Object objOooO0OO8 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo5);
            Intrinsics.checkNotNull(objOooO0OO8);
            return objOooO0OO8;
        } catch (Exception e9) {
            OooOOO0.OooO0o0("WebAPIException", e9.getMessage(), e9);
            String message2 = e9.getMessage();
            String name2 = message2 == null ? e9.getClass().getName() : message2;
            Intrinsics.checkNotNullExpressionValue(name2, "e.message ?: e.javaClass.name");
            String strOooO0oo6 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name2, null, 4, null));
            if (strOooO0oo6 == null) {
                strOooO0oo6 = "";
            }
            Object objOooO0OO9 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo6);
            Intrinsics.checkNotNull(objOooO0OO9);
            return objOooO0OO9;
        }
    }
}
