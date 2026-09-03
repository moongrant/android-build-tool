package p520o0o0O0O0;

import androidx.compose.runtime.internal.StabilityInferred;
import com.yalla.yalla.api.service.VipService;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipExperienceDetailModel;
import com.yalla.yalla.model.VipModel;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import o0o0000.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0o0Oo f42836OooO00o = new o0o0Oo();

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {16}, m = "getKaVipPrivilege", n = {}, s = {})
    public static final class OooO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42837Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42839Oooo0oo;

        public OooO(Continuation<? super OooO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42837Oooo0o = obj;
            this.f42839Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0o0(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {8}, m = "changeKaVipShowState", n = {}, s = {})
    public static final class OooO00o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42840Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42842Oooo0oo;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42840Oooo0o = obj;
            this.f42842Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO00o(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {11}, m = "changeShowPremiumFirst", n = {}, s = {})
    public static final class OooO0O0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42843Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42845Oooo0oo;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42843Oooo0o = obj;
            this.f42845Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0O0(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {14}, m = "changeVIPStealthVisit", n = {}, s = {})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42846Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42848Oooo0oo;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42846Oooo0o = obj;
            this.f42848Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0OO(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {23}, m = "getKaVipExperienceDetails", n = {}, s = {})
    public static final class OooO0o extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42849Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42851Oooo0oo;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42849Oooo0o = obj;
            this.f42851Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0Oo(0, this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {18}, m = "getPersonalKaVip", n = {}, s = {})
    public static final class OooOO0 extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42852Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42854Oooo0oo;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42852Oooo0o = obj;
            this.f42854Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0o(this);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.repository.VipRepo", f = "VipRepo.kt", i = {}, l = {20}, m = "updateKaVipDialogState", n = {}, s = {})
    public static final class OooOO0O extends ContinuationImpl {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public /* synthetic */ Object f42855Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f42857Oooo0oo;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f42855Oooo0o = obj;
            this.f42857Oooo0oo |= Integer.MIN_VALUE;
            return o0o0Oo.this.OooO0oO(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO00o(int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO00o oooO00o;
        if (continuation instanceof OooO00o) {
            oooO00o = (OooO00o) continuation;
            int i2 = oooO00o.f42842Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO00o.f42842Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO00o = new OooO00o(continuation);
            }
        } else {
            oooO00o = new OooO00o(continuation);
        }
        Object objChangeKaVipShowState = oooO00o.f42840Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO00o.f42842Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objChangeKaVipShowState);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooO00o.f42842Oooo0oo = 1;
                objChangeKaVipShowState = vipServiceOooO00o.changeKaVipShowState(i, oooO00o);
                if (objChangeKaVipShowState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objChangeKaVipShowState);
            }
            return objChangeKaVipShowState;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0O0(int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO0O0 oooO0O0;
        if (continuation instanceof OooO0O0) {
            oooO0O0 = (OooO0O0) continuation;
            int i2 = oooO0O0.f42845Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0O0.f42845Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0O0 = new OooO0O0(continuation);
            }
        } else {
            oooO0O0 = new OooO0O0(continuation);
        }
        Object objChangeShowPremiumFirst = oooO0O0.f42843Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0O0.f42845Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objChangeShowPremiumFirst);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooO0O0.f42845Oooo0oo = 1;
                objChangeShowPremiumFirst = vipServiceOooO00o.changeShowPremiumFirst(i, oooO0O0);
                if (objChangeShowPremiumFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objChangeShowPremiumFirst);
            }
            return objChangeShowPremiumFirst;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0OO(int i, @NotNull Continuation<? super ApiResult<String>> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i2 = oooO0OO.f42848Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0OO.f42848Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objChangeKAVIPStealthVisit = oooO0OO.f42846Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0OO.f42848Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objChangeKAVIPStealthVisit);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooO0OO.f42848Oooo0oo = 1;
                objChangeKAVIPStealthVisit = vipServiceOooO00o.changeKAVIPStealthVisit(i, oooO0OO);
                if (objChangeKAVIPStealthVisit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objChangeKAVIPStealthVisit);
            }
            return objChangeKAVIPStealthVisit;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0Oo(int i, @NotNull Continuation<? super ApiResult<List<VipExperienceDetailModel>>> continuation) {
        OooO0o oooO0o;
        if (continuation instanceof OooO0o) {
            oooO0o = (OooO0o) continuation;
            int i2 = oooO0o.f42851Oooo0oo;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oooO0o.f42851Oooo0oo = i2 - Integer.MIN_VALUE;
            } else {
                oooO0o = new OooO0o(continuation);
            }
        } else {
            oooO0o = new OooO0o(continuation);
        }
        Object kaVipExperienceDetails = oooO0o.f42849Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = oooO0o.f42851Oooo0oo;
        String str = "";
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(kaVipExperienceDetails);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooO0o.f42851Oooo0oo = 1;
                kaVipExperienceDetails = vipServiceOooO00o.getKaVipExperienceDetails(i, oooO0o);
                if (kaVipExperienceDetails == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(kaVipExperienceDetails);
            }
            return kaVipExperienceDetails;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o(@NotNull Continuation<? super ApiResult<PersonalVipModel>> continuation) {
        OooOO0 oooOO1;
        if (continuation instanceof OooOO0) {
            oooOO1 = (OooOO0) continuation;
            int i = oooOO1.f42854Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO1.f42854Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO1 = new OooOO0(continuation);
            }
        } else {
            oooOO1 = new OooOO0(continuation);
        }
        Object personalKaVip = oooOO1.f42852Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO1.f42854Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(personalKaVip);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooOO1.f42854Oooo0oo = 1;
                personalKaVip = vipServiceOooO00o.getPersonalKaVip(oooOO1);
                if (personalKaVip == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(personalKaVip);
            }
            return personalKaVip;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0o0(@NotNull Continuation<? super ApiResult<List<VipModel>>> continuation) {
        OooO oooO;
        if (continuation instanceof OooO) {
            oooO = (OooO) continuation;
            int i = oooO.f42839Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO.f42839Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooO = new OooO(continuation);
            }
        } else {
            oooO = new OooO(continuation);
        }
        Object kaVipPrivilege = oooO.f42837Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO.f42839Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(kaVipPrivilege);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooO.f42839Oooo0oo = 1;
                kaVipPrivilege = vipServiceOooO00o.getKaVipPrivilege(oooO);
                if (kaVipPrivilege == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(kaVipPrivilege);
            }
            return kaVipPrivilege;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object OooO0oO(@NotNull Continuation<? super ApiResult<String>> continuation) {
        OooOO0O oooOO0O;
        if (continuation instanceof OooOO0O) {
            oooOO0O = (OooOO0O) continuation;
            int i = oooOO0O.f42857Oooo0oo;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooOO0O.f42857Oooo0oo = i - Integer.MIN_VALUE;
            } else {
                oooOO0O = new OooOO0O(continuation);
            }
        } else {
            oooOO0O = new OooOO0O(continuation);
        }
        Object objUpdateKaVipDialogState = oooOO0O.f42855Oooo0o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooOO0O.f42857Oooo0oo;
        String str = "";
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objUpdateKaVipDialogState);
                o0ooOOo o0ooooo2 = o0ooOOo.f40851OooO00o;
                VipService vipServiceOooO00o = o0ooOOo.OooO00o();
                oooOO0O.f42857Oooo0oo = 1;
                objUpdateKaVipDialogState = vipServiceOooO00o.updateKaVipDialogState(oooOO0O);
                if (objUpdateKaVipDialogState == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objUpdateKaVipDialogState);
            }
            return objUpdateKaVipDialogState;
        } catch (IOException e) {
            ApiError apiErrorOooO00o = com.app.base.app.appConfig.apiDataModela.OooO0O0.OooO00o(e, OooO00o.OooO00o.OooO0o0("time out "), "WebAPIException", 1, "time out");
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
    }
}
