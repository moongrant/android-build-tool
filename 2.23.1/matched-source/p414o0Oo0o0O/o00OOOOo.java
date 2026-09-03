package p414o0Oo0o0O;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.old.service.MainApiService;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import java.io.IOException;
import java.util.List;
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
import p039OoooOoo.o00O0OO0;
import p382o0OOoOo.o00oO0o;
import p474o0OoooOO.oO0oO000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nThemeRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThemeRepo.kt\ncom/yalla/yalla/data/repository/ThemeRepo\n+ 2 ApiCall.kt\ncom/yalla/yalla/http/ApiCallKt\n+ 3 JsonUtil.kt\ncom/code/android/json/JsonUtil\n*L\n1#1,40:1\n18#2,7:41\n25#2,10:49\n18#2,7:59\n25#2,10:67\n18#2,7:77\n25#2,10:85\n18#2,7:95\n25#2,10:103\n18#2,7:113\n25#2,10:121\n18#2,7:131\n25#2,10:139\n18#2,7:149\n25#2,10:157\n18#2,7:167\n25#2,10:175\n18#2,7:185\n25#2,10:193\n18#2,7:203\n25#2,10:211\n18#2,7:221\n25#2,10:229\n109#3:48\n109#3:66\n109#3:84\n109#3:102\n109#3:120\n109#3:138\n109#3:156\n109#3:174\n109#3:192\n109#3:210\n109#3:228\n*S KotlinDebug\n*F\n+ 1 ThemeRepo.kt\ncom/yalla/yalla/data/repository/ThemeRepo\n*L\n9#1:41,7\n9#1:49,10\n12#1:59,7\n12#1:67,10\n14#1:77,7\n14#1:85,10\n17#1:95,7\n17#1:103,10\n20#1:113,7\n20#1:121,10\n22#1:131,7\n22#1:139,10\n28#1:149,7\n28#1:157,10\n30#1:167,7\n30#1:175,10\n32#1:185,7\n32#1:193,10\n35#1:203,7\n35#1:211,10\n37#1:221,7\n37#1:229,10\n9#1:48\n12#1:66\n14#1:84\n17#1:102\n20#1:120\n22#1:138\n28#1:156\n30#1:174\n32#1:192\n35#1:210\n37#1:228\n*E\n"})
public final class o00OOOOo extends oO0oO000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00OOOOo f46210OooO00o = new o00OOOOo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {9}, m = "getThemeStyleListData", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46211OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46212OooO0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46211OooO0Oo = obj;
            this.f46212OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0oO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {32}, m = "getCustomRoomThemePrices", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46214OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46215OooO0o;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46214OooO0Oo = obj;
            this.f46215OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0OO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {37}, m = "getRoomThemeGiveCount", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46217OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46218OooO0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46217OooO0Oo = obj;
            this.f46218OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0Oo(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {22}, m = "getThemeCustomizeListData", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46220OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46221OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46220OooO0Oo = obj;
            this.f46221OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {17}, m = "getThemeMineListData", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46223OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46224OooO0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46223OooO0Oo = obj;
            this.f46224OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0o(0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {12}, m = "getThemeTypeListData", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46226OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46227OooO0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46226OooO0Oo = obj;
            this.f46227OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO0oo(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {14}, m = "goBuyTheme", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46229OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46230OooO0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46229OooO0Oo = obj;
            this.f46230OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooO(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {28}, m = "renewCustomTheme", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46232OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46233OooO0o;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46232OooO0Oo = obj;
            this.f46233OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooOO0O(0L, 0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {35}, m = "purchaseCustomImage", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46235OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46236OooO0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46235OooO0Oo = obj;
            this.f46236OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooOO0(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {20}, m = "setRoomTheme", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f46238OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f46239OooO0o;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f46238OooO0Oo = obj;
            this.f46239OooO0o |= Integer.MIN_VALUE;
            return o00OOOOo.this.OooOO0o(0L, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO(long j, @NotNull Continuation<? super ApiResult<ThemeBoughtModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f46230OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f46230OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objShopPurchaseTheme = oooOO0O.f46229OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f46230OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShopPurchaseTheme);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooOO0O.f46230OooO0o = 1;
                objShopPurchaseTheme = mainApiServiceOooO00o.shopPurchaseTheme(j, oooOO0O);
                if (objShopPurchaseTheme == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShopPurchaseTheme);
            }
            return objShopPurchaseTheme;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0OO(@NotNull Continuation<? super ApiResult<List<CustomPrices>>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f46215OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f46215OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object customRoomThemePrices = oooO00o.f46214OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f46215OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(customRoomThemePrices);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooO00o.f46215OooO0o = 1;
                customRoomThemePrices = mainApiServiceOooO00o.getCustomRoomThemePrices(oooO00o);
                if (customRoomThemePrices == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(customRoomThemePrices);
            }
            return customRoomThemePrices;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0Oo(@NotNull Continuation<? super ApiResult<Integer>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f46218OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f46218OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object roomThemeGiveCount = oooO0O0.f46217OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f46218OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(roomThemeGiveCount);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooO0O0.f46218OooO0o = 1;
                roomThemeGiveCount = mainApiServiceOooO00o.getRoomThemeGiveCount(oooO0O0);
                if (roomThemeGiveCount == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(roomThemeGiveCount);
            }
            return roomThemeGiveCount;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0o(int i, int i2, @NotNull Continuation<? super ApiResult<MyThemeListModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i3 = oooO0o.f46224OooO0o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0o.f46224OooO0o = i3 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objShopRoomThemeList = oooO0o.f46223OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO0o.f46224OooO0o;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeList);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooO0o.f46224OooO0o = 1;
                objShopRoomThemeList = mainApiServiceOooO00o.shopRoomThemeList(i, i2, oooO0o);
                if (objShopRoomThemeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShopRoomThemeList);
            }
            return objShopRoomThemeList;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super ApiResult<List<CustomizeThemeModel>>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f46221OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f46221OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objCustomizeRoomThemeList = oooO0OO.f46220OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f46221OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCustomizeRoomThemeList);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooO0OO.f46221OooO0o = 1;
                objCustomizeRoomThemeList = mainApiServiceOooO00o.customizeRoomThemeList(oooO0OO);
                if (objCustomizeRoomThemeList == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objCustomizeRoomThemeList);
            }
            return objCustomizeRoomThemeList;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO0oO(@NotNull Continuation<? super ApiResult<List<ThemeListModel>>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f46212OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f46212OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objShopRoomThemeListTop = oooO.f46211OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f46212OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeListTop);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooO.f46212OooO0o = 1;
                objShopRoomThemeListTop = mainApiServiceOooO00o.shopRoomThemeListTop(oooO);
                if (objShopRoomThemeListTop == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShopRoomThemeListTop);
            }
            return objShopRoomThemeListTop;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooO0oo(int i, @NotNull Continuation<? super ApiResult<List<ThemeModel>>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i2 = oooOO1.f46227OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO1.f46227OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objShopRoomThemeListByType = oooOO1.f46226OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO1.f46227OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeListByType);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooOO1.f46227OooO0o = 1;
                objShopRoomThemeListByType = mainApiServiceOooO00o.shopRoomThemeListByType(i, oooOO1);
                if (objShopRoomThemeListByType == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objShopRoomThemeListByType);
            }
            return objShopRoomThemeListByType;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i2 = oooOOO0.f46236OooO0o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOO0.f46236OooO0o = i2 - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objPurchaseCustomImage = oooOOO0.f46235OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOO0.f46236OooO0o;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPurchaseCustomImage);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooOOO0.f46236OooO0o = 1;
                objPurchaseCustomImage = mainApiServiceOooO00o.purchaseCustomImage(str, i, oooOOO0);
                if (objPurchaseCustomImage == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPurchaseCustomImage);
            }
            return objPurchaseCustomImage;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0O(long j, int i, int i2, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i3 = oooOOO.f46233OooO0o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOOO.f46233OooO0o = i3 - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        OooOOO oooOOO2 = oooOOO;
        Object objRenewCustomTheme = oooOOO2.f46232OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooOOO2.f46233OooO0o;
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objRenewCustomTheme);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooOOO2.f46233OooO0o = 1;
                objRenewCustomTheme = mainApiServiceOooO00o.renewCustomTheme(j, i, i2, oooOOO2);
                if (objRenewCustomTheme == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRenewCustomTheme);
            }
            return objRenewCustomTheme;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
            String message = e3.getMessage();
            String name = message == null ? e3.getClass().getName() : message;
            Intrinsics.checkNotNull(name);
            String strOooO0oo3 = com.code.android.json.OooO00o.OooO00o().OooO0oo(new ApiError(2, name, null, 4, null));
            Object objOooO0OO3 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo3 != null ? strOooO0oo3 : "");
            Intrinsics.checkNotNull(objOooO0OO3);
            return objOooO0OO3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object OooOO0o(long j, long j2, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f46239OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f46239OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        OooOOOO oooOOOO2 = oooOOOO;
        Object objRoomThemeEdit = oooOOOO2.f46238OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO2.f46239OooO0o;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRoomThemeEdit);
                MainApiService mainApiServiceOooO00o = p386o0OOoo0O.OooOOOO.OooO00o();
                oooOOOO2.f46239OooO0o = 1;
                objRoomThemeEdit = mainApiServiceOooO00o.roomThemeEdit(j, j2, oooOOOO2);
                if (objRoomThemeEdit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objRoomThemeEdit);
            }
            return objRoomThemeEdit;
        } catch (IOException e) {
            String strOooO0oo = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00oO0o.OooO00o("WebAPIException", "time out ", e, 1, "time out", null, 4, null));
            Object objOooO0OO = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo != null ? strOooO0oo : "");
            Intrinsics.checkNotNull(objOooO0OO);
            return objOooO0OO;
        } catch (CancellationException e2) {
            String strOooO0oo2 = com.code.android.json.OooO00o.OooO00o().OooO0oo(o00O0OO0.OooO0Oo("WebAPIException", "canceled ", e2, 3, "canceled", null, 4, null));
            Object objOooO0OO2 = com.code.android.json.OooO00o.OooO0OO(ApiResult.class, strOooO0oo2 != null ? strOooO0oo2 : "");
            Intrinsics.checkNotNull(objOooO0OO2);
            return objOooO0OO2;
        } catch (Exception e3) {
            p597o0oo00O.OooOOOO.OooO0o0("WebAPIException", e3.getMessage(), e3);
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
