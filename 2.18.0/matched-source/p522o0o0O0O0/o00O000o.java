package p522o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.MainApiService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.CustomPrices;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.MyThemeListModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.model.ThemeBoughtModel;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.model.ThemeModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p500o0o00Oo0.oOO00O;
import p517o0o0O00.o00O00;
import p518o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o00O000o extends oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00O000o f42656OooO00o = new o00O000o();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {9}, m = "getThemeStyleListData", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42657Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42658OoooO0;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42657Oooo = obj;
            this.f42658OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {32}, m = "getCustomRoomThemePrices", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42660Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42661OoooO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42660Oooo = obj;
            this.f42661OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {37}, m = "getRoomThemeGiveCount", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42663Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42664OoooO0;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42663Oooo = obj;
            this.f42664OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooO0o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {22}, m = "getThemeCustomizeListData", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42666Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42667OoooO0;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42666Oooo = obj;
            this.f42667OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooO0oO(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {17}, m = "getThemeMineListData", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42669Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42670OoooO0;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42669Oooo = obj;
            this.f42670OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooO0oo(0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {12}, m = "getThemeTypeListData", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42672Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42673OoooO0;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42672Oooo = obj;
            this.f42673OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooOO0(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {14}, m = "goBuyTheme", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42675Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42676OoooO0;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42675Oooo = obj;
            this.f42676OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooOO0O(0L, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {28}, m = "renewCustomTheme", n = {}, s = {})
    public static final class OooOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42678Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42679OoooO0;

        public OooOOO(Continuation<? super OooOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42678Oooo = obj;
            this.f42679OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooOOO0(0L, 0, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {35}, m = "purchaseCustomImage", n = {}, s = {})
    public static final class OooOOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42681Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42682OoooO0;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42681Oooo = obj;
            this.f42682OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooOO0o(null, 0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.ThemeRepo", f = "ThemeRepo.kt", i = {}, l = {20}, m = "setRoomTheme", n = {}, s = {})
    public static final class OooOOOO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public /* synthetic */ Object f42684Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public int f42685OoooO0;

        public OooOOOO(Continuation<? super OooOOOO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42684Oooo = obj;
            this.f42685OoooO0 |= Integer.MIN_VALUE;
            return o00O000o.this.OooOOO(0L, 0L, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO(@NotNull Continuation<? super ApiResult<List<ThemeListModel>>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f42658OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f42658OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object objShopRoomThemeListTop = oooO.f42657Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f42658OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeListTop);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO.f42658OoooO0 = 1;
                objShopRoomThemeListTop = mainApiServiceOooO0OO.shopRoomThemeListTop(oooO);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooO0o(@NotNull Continuation<? super ApiResult<Integer>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i = oooO0O0.f42664OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42664OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object roomThemeGiveCount = oooO0O0.f42663Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0O0.f42664OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(roomThemeGiveCount);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0O0.f42664OoooO0 = 1;
                roomThemeGiveCount = mainApiServiceOooO0OO.getRoomThemeGiveCount(oooO0O0);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooO0o0(@NotNull Continuation<? super ApiResult<List<CustomPrices>>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i = oooO00o.f42661OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO00o.f42661OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object customRoomThemePrices = oooO00o.f42660Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO00o.f42661OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(customRoomThemePrices);
                o0o0000.OooO00o oooO00o2 = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO00o.f42661OoooO0 = 1;
                customRoomThemePrices = mainApiServiceOooO0OO.getCustomRoomThemePrices(oooO00o);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooO0oO(@NotNull Continuation<? super ApiResult<List<CustomizeThemeModel>>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f42667OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42667OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objCustomizeRoomThemeList = oooO0OO.f42666Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f42667OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCustomizeRoomThemeList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0OO.f42667OoooO0 = 1;
                objCustomizeRoomThemeList = mainApiServiceOooO0OO.customizeRoomThemeList(oooO0OO);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooO0oo(int i, int i2, @NotNull Continuation<? super ApiResult<MyThemeListModel>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i3 = oooO0o.f42670OoooO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooO0o.f42670OoooO0 = i3 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object objShopRoomThemeList = oooO0o.f42669Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooO0o.f42670OoooO0;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeList);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooO0o.f42670OoooO0 = 1;
                objShopRoomThemeList = mainApiServiceOooO0OO.shopRoomThemeList(i, i2, oooO0o);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooOO0(int i, @NotNull Continuation<? super ApiResult<List<ThemeModel>>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i2 = oooOO1.f42673OoooO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOO1.f42673OoooO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object objShopRoomThemeListByType = oooOO1.f42672Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOO1.f42673OoooO0;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objShopRoomThemeListByType);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOO1.f42673OoooO0 = 1;
                objShopRoomThemeListByType = mainApiServiceOooO0OO.shopRoomThemeListByType(i, oooOO1);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooOO0O(long j, @NotNull Continuation<? super ApiResult<ThemeBoughtModel>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f42676OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42676OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objShopPurchaseTheme = oooOO0O.f42675Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f42676OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objShopPurchaseTheme);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOO0O.f42676OoooO0 = 1;
                objShopPurchaseTheme = mainApiServiceOooO0OO.shopPurchaseTheme(j, oooOO0O);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
    public final Object OooOO0o(@NotNull String str, int i, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation) {
        OooOOO0 oooOOO0;
        if (continuation instanceof OooOOO0) {
            oooOOO0 = (OooOOO0) continuation;
            int i2 = oooOOO0.f42682OoooO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooOOO0.f42682OoooO0 = i2 - Integer.MIN_VALUE;
            } else {
                oooOOO0 = new OooOOO0(continuation);
            }
        } else {
            oooOOO0 = new OooOOO0(continuation);
        }
        Object objPurchaseCustomImage = oooOOO0.f42681Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooOOO0.f42682OoooO0;
        String str2 = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objPurchaseCustomImage);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOOO0.f42682OoooO0 = 1;
                objPurchaseCustomImage = mainApiServiceOooO0OO.purchaseCustomImage(str, i, oooOOO0);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOOO(long j, long j2, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooOOOO oooOOOO;
        if (continuation instanceof OooOOOO) {
            oooOOOO = (OooOOOO) continuation;
            int i = oooOOOO.f42685OoooO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOOOO.f42685OoooO0 = i - Integer.MIN_VALUE;
            } else {
                oooOOOO = new OooOOOO(continuation);
            }
        } else {
            oooOOOO = new OooOOOO(continuation);
        }
        OooOOOO oooOOOO2 = oooOOOO;
        Object objRoomThemeEdit = oooOOOO2.f42684Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOOOO2.f42685OoooO0;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objRoomThemeEdit);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOOOO2.f42685OoooO0 = 1;
                objRoomThemeEdit = mainApiServiceOooO0OO.roomThemeEdit(j, j2, oooOOOO2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object OooOOO0(long j, int i, int i2, @NotNull Continuation<? super ApiResult<RenewCustomizeTheme>> continuation) {
        OooOOO oooOOO;
        if (continuation instanceof OooOOO) {
            oooOOO = (OooOOO) continuation;
            int i3 = oooOOO.f42679OoooO0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oooOOO.f42679OoooO0 = i3 - Integer.MIN_VALUE;
            } else {
                oooOOO = new OooOOO(continuation);
            }
        } else {
            oooOOO = new OooOOO(continuation);
        }
        OooOOO oooOOO2 = oooOOO;
        Object objRenewCustomTheme = oooOOO2.f42678Oooo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = oooOOO2.f42679OoooO0;
        String str = "";
        try {
            if (i4 == 0) {
                ResultKt.throwOnFailure(objRenewCustomTheme);
                o0o0000.OooO00o oooO00o = o0o0000.OooO00o.f40787OooO00o;
                MainApiService mainApiServiceOooO0OO = o0o0000.OooO00o.OooO0OO();
                oooOOO2.f42679OoooO0 = 1;
                objRenewCustomTheme = mainApiServiceOooO0OO.renewCustomTheme(j, i, i2, oooOOO2);
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
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0O0("time out "), "WebAPIException", 1, "time out");
            o0OOO0o o0ooo0o2 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o3 = o0OOO0o.f42139OooO00o;
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
            o0OOO0o o0ooo0o4 = o0OOO0o.f42139OooO00o;
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
