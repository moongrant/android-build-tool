package p613o0oo0OO0;

import com.android.billingclient.api.o0Oo0oo;
import com.google.android.gms.common.util.CollectionUtils;
import com.yalla.yalla.api.service.LogApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.data.db.model.BuriedPoint;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0000 f48379OooO00o = new o0000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final AtomicBoolean f48380OooO0O0 = new AtomicBoolean(false);

    @DebugMetadata(c = "com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK$buriedPoint$1", f = "BuriedPointSDK.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f48381Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ String f48382OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ String f48383OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f48384OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, String str3, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f48383OoooO00 = str;
            this.f48382OoooO0 = str2;
            this.f48384OoooO0O = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f48383OoooO00, this.f48382OoooO0, this.f48384OoooO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objOooO0O0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f48381Oooo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BuriedPoint buriedPoint = BuriedPoint.Factory.INSTANCE.create(this.f48383OoooO00, this.f48382OoooO0, this.f48384OoooO0O);
                Intrinsics.checkNotNullParameter(buriedPoint, "buriedPoint");
                buriedPoint.setEventTime(System.currentTimeMillis());
                p493o0o00O00.OooO0OO.OooO00o().OooOo0o().OooO0O0(buriedPoint);
                o0000 o0000Var = o0000.f48379OooO00o;
                this.f48381Oooo = 1;
                if (p493o0o00O00.OooO0OO.OooO00o().OooOo0o().OooO00o() < 50 || (objOooO0O0 = o0000Var.OooO0O0(this)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0O0 = Unit.INSTANCE;
                }
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK", f = "BuriedPointSDK.kt", i = {0}, l = {67}, m = "checkBuriedPointListThenUpload", n = {"dataAndIdPair"}, s = {"L$0"})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Pair f48385Oooo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f48387OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public int f48388OoooO0O;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48387OoooO00 = obj;
            this.f48388OoooO0O |= Integer.MIN_VALUE;
            o0000 o0000Var = o0000.this;
            o0000 o0000Var2 = o0000.f48379OooO00o;
            return o0000Var.OooO0O0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.util.buriedpoint.core.BuriedPointSDK", f = "BuriedPointSDK.kt", i = {}, l = {98}, m = "uploadDataTest", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f48389Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f48390OoooO0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48389Oooo = obj;
            this.f48390OoooO0 |= Integer.MIN_VALUE;
            o0000 o0000Var = o0000.this;
            o0000 o0000Var2 = o0000.f48379OooO00o;
            return o0000Var.OooO0OO(null, this);
        }
    }

    public final void OooO00o(@NotNull String eventId, @NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(url, "url");
        o00O00.OooO0OO("BuriedPointSDK", "eventId:" + eventId + "   |  url:" + url + "   |  extInfo:" + str);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new OooO00o(eventId, url, str, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object OooO0O0(Continuation<? super Unit> continuation) {
        OooO0O0 oooO0O0;
        Pair pair;
        Pair pair2;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f48388OoooO0O;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f48388OoooO0O = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object obj = oooO0O0.f48387OoooO00;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f48388OoooO0O;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (f48380OooO0O0.get()) {
                return Unit.INSTANCE;
            }
            List<BuriedPoint> listOooO0Oo = p493o0o00O00.OooO0OO.OooO00o().OooOo0o().OooO0Oo();
            if (CollectionUtils.isEmpty(listOooO0Oo)) {
                pair = new Pair(-1, "");
            } else {
                Integer id = listOooO0Oo.get(listOooO0Oo.size() - 1).getId();
                Intrinsics.checkNotNull(id);
                int iIntValue = id.intValue();
                try {
                    Result.Companion companion = Result.INSTANCE;
                    for (BuriedPoint buriedPoint : listOooO0Oo) {
                        buriedPoint.setExtInfoEntity(o0Oo0oo.OooO0O0(buriedPoint.getExtInfoString(), Map.class));
                    }
                    Result.m502constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m502constructorimpl(ResultKt.createFailure(th));
                }
                pair = new Pair(Integer.valueOf(iIntValue), o0Oo0oo.OooO0Oo(listOooO0Oo));
            }
            if (((Number) pair.getFirst()).intValue() != -1) {
                String str = (String) pair.getSecond();
                oooO0O0.f48385Oooo = pair;
                oooO0O0.f48388OoooO0O = 1;
                Object objOooO0OO = OooO0OO(str, oooO0O0);
                if (objOooO0OO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pair2 = pair;
                obj = objOooO0OO;
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        pair2 = oooO0O0.f48385Oooo;
        ResultKt.throwOnFailure(obj);
        if (((Boolean) obj).booleanValue()) {
            p493o0o00O00.OooO0OO.OooO00o().OooOo0o().OooO0OO(((Number) pair2.getFirst()).intValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object OooO0OO(String str, Continuation<? super Boolean> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f48390OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f48390OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        OooO0OO oooO0OO2 = oooO0OO;
        Object objOooO0O0 = oooO0OO2.f48389Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO2.f48390OoooO0;
        String str2 = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objOooO0O0);
                f48380OooO0O0.set(true);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                LogApiService logApiServiceOooO0O0 = o0o0000.OooO00o.OooO0O0();
                oooO0OO2.f48390OoooO0 = 1;
                objOooO0O0 = logApiServiceOooO0O0.postBuriedPoint(str, 1, oooO0OO2);
                if (objOooO0O0 == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0O0);
            }
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
            String strOooO0oo = o0OOO0o.OooO00o().OooO0oo(apiErrorOooO00o);
            if (strOooO0oo != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        } catch (CancellationException unused) {
            ApiError apiError = new ApiError(3, "canceled");
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
            String strOooO0oo2 = o0OOO0o.OooO00o().OooO0oo(apiError);
            if (strOooO0oo2 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo2, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo2;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        } catch (Exception e2) {
            o00O00.OooO0o0("WebAPIException", e2.getMessage());
            e2.printStackTrace();
            String message = e2.getMessage();
            if (message == null) {
                message = e2.getClass().getName();
            }
            Intrinsics.checkNotNullExpressionValue(message, "e.message ?: e.javaClass.name");
            ApiError apiError2 = new ApiError(2, message);
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
            String strOooO0oo3 = o0OOO0o.OooO00o().OooO0oo(apiError2);
            if (strOooO0oo3 != null) {
                Intrinsics.checkNotNullExpressionValue(strOooO0oo3, "gson.toJson(model) ?: \"\"");
                str2 = strOooO0oo3;
            }
            objOooO0O0 = o0OOO0o.OooO0O0(str2, ApiResult.class);
            Intrinsics.checkNotNull(objOooO0O0);
        }
        f48380OooO0O0.set(false);
        return Boxing.boxBoolean(((ApiResult) objOooO0O0).isSuccess());
    }
}
