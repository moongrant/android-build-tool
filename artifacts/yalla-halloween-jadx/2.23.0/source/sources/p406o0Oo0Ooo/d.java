package p406o0Oo0Ooo;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.LockBuyModel;
import com.yalla.yalla.model.room.LockShopModel;
import com.yalla.yalla.model.room.LockTimeModel;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
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
import p464o0Oooo.o000000O;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nLockRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockRepo.kt\ncom/yalla/yalla/data/repository/LockRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,43:1\n18#2,7:44\n25#2,10:52\n18#2,7:62\n25#2,10:70\n18#2,7:80\n25#2,10:88\n109#3:51\n109#3:69\n109#3:87\n*S KotlinDebug\n*F\n+ 1 LockRepo.kt\ncom/yalla/yalla/data/repository/LockRepo\n*L\n21#1:44,7\n21#1:52,10\n28#1:62,7\n28#1:70,10\n40#1:80,7\n40#1:88,10\n21#1:51\n28#1:69\n40#1:87\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final d f44754OooO00o = new d();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LockRepo", f = "LockRepo.kt", i = {}, l = {22}, m = "loadLastTime", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44755OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44756OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44755OooO0Oo = obj;
            this.f44756OooO0o |= Integer.MIN_VALUE;
            return d.this.OooO00o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LockRepo", f = "LockRepo.kt", i = {}, l = {41}, m = "shopPurchase", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44758OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44759OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44758OooO0Oo = obj;
            this.f44759OooO0o |= Integer.MIN_VALUE;
            return d.this.OooO0O0(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.LockRepo", f = "LockRepo.kt", i = {}, l = {31, 33}, m = "shopUnitPrice", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f44761OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f44762OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f44761OooO0Oo = obj;
            this.f44762OooO0o |= Integer.MIN_VALUE;
            return d.this.OooO0OO(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super ApiResult<LockTimeModel>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f44756OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f44756OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objLoadLastTime = oooO00o.f44755OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f44756OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objLoadLastTime);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooO00o.f44756OooO0o = 1;
                objLoadLastTime = mainApiServiceOooO00o.loadLastTime(1, oooO00o);
                if (objLoadLastTime == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadLastTime);
            }
            return objLoadLastTime;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0O0(long j, @NotNull Continuation<? super ApiResult<LockBuyModel>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f44759OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f44759OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objShopPurchase1 = oooO0O0.f44758OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f44759OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShopPurchase1);
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooO0O0.f44759OooO0o = 1;
                objShopPurchase1 = mainApiServiceOooO00o.shopPurchase1(j, oooO0O0);
                if (objShopPurchase1 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShopPurchase1);
            }
            return objShopPurchase1;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object OooO0OO(@NotNull Continuation<? super ApiResult<LockShopModel>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f44762OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f44762OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object obj = oooO0OO.f44761OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f44762OooO0o;
        try {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            o000000O o000000o2 = o000000O.f46674OooO00o;
            Pair pair = (Pair) o000000O.OooOO0o().getValue();
            if (!(pair != null && ((Boolean) pair.getFirst()).booleanValue())) {
                MainApiService mainApiServiceOooO00o = o0000O00.OooO00o();
                oooO0OO.f44762OooO0o = 2;
                Object objShopUnitPrice1 = mainApiServiceOooO00o.shopUnitPrice1(1, 1, oooO0OO);
                return objShopUnitPrice1 == coroutine_suspended ? coroutine_suspended : objShopUnitPrice1;
            }
            MainApiService mainApiServiceOooO00o2 = o0000O00.OooO00o();
            int iIntValue = ((Number) pair.getSecond()).intValue();
            oooO0OO.f44762OooO0o = 1;
            Object objShopUnitPrice2 = mainApiServiceOooO00o2.shopUnitPrice1(1, 1, iIntValue, oooO0OO);
            return objShopUnitPrice2 == coroutine_suspended ? coroutine_suspended : objShopUnitPrice2;
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
