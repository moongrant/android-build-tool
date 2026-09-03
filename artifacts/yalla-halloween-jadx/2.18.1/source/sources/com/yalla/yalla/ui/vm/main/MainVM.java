package com.yalla.yalla.ui.vm.main;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.application.App;
import com.common.support.apmwrapper.model.SecModel;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.repository.AppConfigRepo;
import com.yalla.yalla.common.statistical.net.FLog;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getFirstRechargeInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRepository$checkServiceUpdate$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRepository$signServiceUpdate$$inlined$call$1;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.UserFirstRechargeModel;
import com.yallatech.support.platform.YCSDKOpenKit;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p254o00ooO0O.o0000O0;
import p487o0o000oO.o0OOO0o;
import p487o0o000oO.o0Oo0oo;
import p487o0o000oO.o0ooOOo;
import p495o0o00OOO.Oooo0;
import p498o0o00Oo0.OooOOO;
import p516o0o0O000.OooOo;
import p520o0o0O0O0.o0000OO0;
import p520o0o0O0O0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rR%\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainVM;", "Lo00OO/OooO00o;", "Lo0o00OOO/Oooo0;", "Lcom/yalla/yalla/model/ApiServiceUpdateModel;", "checkTermsService", "", "signTermsService", "initBefore", "loadUserInfo", "loadUserFirstRechargeModel", "loadLimitedPsdRoom", "updateMessageStateFailed", "getEventSettingState", "Landroid/content/Context;", d.R, "atd", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "Landroidx/lifecycle/MutableLiveData;", "getHaveNewFollowingPost", "()Landroidx/lifecycle/MutableLiveData;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<Boolean> haveNewFollowingPost = new MutableLiveData<>(Boolean.FALSE);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadLimitedPsdRoom$1", f = "MainVM.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25492Oooo0o;

        public OooO(Continuation<? super OooO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25492Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000OO0 o0000oo1 = o0000OO0.f42429OooO00o;
                this.f25492Oooo0o = 1;
                obj = o0000oo1.OooO0o0(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List list = (List) ((ApiResult) obj).getData();
            if (list != null) {
                o0ooOOo o0ooooo2 = o0ooOOo.f40960OooO00o;
                o0ooOOo.f40962OooO0OO.clear();
                o0ooOOo.f40962OooO0OO.addAll(list);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$atd$1", f = "MainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Context f25493Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f25493Oooo0o = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f25493Oooo0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o0O00.OooO00o OooO00o2 = o0O00000.OooO0O0.OooO00o(this.f25493Oooo0o);
            SecModel secModel = new SecModel();
            secModel.setAccessibilityS(OooO00o2.f35031OooOOOO);
            String strOooO00o = OooO00o2.f35020OooO0OO;
            if ((strOooO00o.length() == 0) && (strOooO00o = OooOo.f42064OooO00o.OooO00o()) == null) {
                strOooO00o = "";
            }
            secModel.setAppInstallS(strOooO00o);
            secModel.setAppVirtual(OooO00o2.f35017OooO);
            secModel.setAttachPort(OooO00o2.f35028OooOO0o);
            secModel.setCFlash(OooO00o2.f35027OooOO0O);
            secModel.setDebug(OooO00o2.f35018OooO00o);
            o0Oo0oo o0oo0oo2 = o0Oo0oo.f40947OooO00o;
            secModel.setDevice(o0Oo0oo.OooO00o());
            secModel.setEmulator(OooO00o2.f35019OooO0O0);
            secModel.setFrida(false);
            secModel.setInjection(OooO00o2.f35023OooO0o0);
            secModel.setLightSensor(OooO00o2.f35029OooOOO);
            secModel.setPtrace(false);
            secModel.setRoot(OooO00o2.f35021OooO0Oo);
            secModel.setSensor(OooO00o2.f35026OooOO0);
            secModel.setSubstrate(OooO00o2.f35024OooO0oO);
            secModel.setTime(FLog.INSTANCE.logFormattedDate());
            secModel.setUsb(OooO00o2.f35030OooOOO0);
            String value = OooOOO.f41216OooO00o.OooOoO0().getValue();
            secModel.setUserId(value != null ? value : "");
            secModel.setWifiProxy(OooO00o2.f35025OooO0oo);
            secModel.setXposed(OooO00o2.f35022OooO0o);
            o0OOO0o o0ooo0o2 = o0OOO0o.f40936OooO00o;
            secModel.setVersion(o0OOO0o.OooO0O0());
            o0.OooO00o oooO00o = o0.OooO00o.f26553OooO0O0;
            o0.OooO00o.OooO0O0(secModel);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$checkTermsService$1$1", f = "MainVM.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Oooo0 f25494Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25495Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ Oooo0<ApiServiceUpdateModel> f25496Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(Oooo0<ApiServiceUpdateModel> oooo0, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25496Oooo0oo = oooo0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f25496Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Oooo0 oooo0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25495Oooo0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Oooo0<ApiServiceUpdateModel> oooo1 = this.f25496Oooo0oo;
                o0000OO0 o0000oo1 = o0000OO0.f42429OooO00o;
                this.f25494Oooo0o = oooo1;
                this.f25495Oooo0oO = 1;
                Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new MainRepository$checkServiceUpdate$$inlined$call$1(o0000oo1, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                oooo0 = oooo1;
                obj = objWithContext;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oooo0 = this.f25494Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            oooo0.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$getEventSettingState$1", f = "MainVM.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25497Oooo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0OO(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25497Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0OoOo0 o0oooo1 = o0OoOo0.f42829OooO00o;
                this.f25497Oooo0o = 1;
                if (o0oooo1.OooO00o(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$initBefore$1", f = "MainVM.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25498Oooo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25498Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                if (!StringsKt.isBlank(p497o0o00Oo.OooOOO0.OooO0o().OooOOO0())) {
                    YCSDKOpenKit.setApplicationId(p497o0o00Oo.OooOOO0.OooO0o().OooOOO0());
                    YCSDKOpenKit.setApplicationKey(p497o0o00Oo.OooOOO0.OooO0o().OooOOO());
                    YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
                    YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
                    App app = App.f11458Oooo0oO;
                    Intrinsics.checkNotNullExpressionValue(app, "getContext()");
                    yCSDKOpenKit.sdkInitialize(app);
                }
                AppConfigRepo appConfigRepo = AppConfigRepo.f20679OooO00o;
                this.f25498Oooo0o = 1;
                if (appConfigRepo.OooO0o0(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (com.yalla.support.common.util.OooO0OO.OooO00o(p491o0o00O00.OooO0OO.OooO00o().OooOOo0().OooO0O0())) {
                o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
                o00000OO.f32207OooO00o.OooO00o(null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadUserFirstRechargeModel$1", f = "MainVM.kt", i = {}, l = {75}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25499Oooo0o;

        public OooOO0(Continuation<? super OooOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UserFirstRechargeModel userFirstRechargeModel;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25499Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f25499Oooo0o = 1;
                p480o0o000.OooO0OO oooO0OO = p480o0o000.OooO0OO.f40754OooO00o;
                String str = p480o0o000.OooO0OO.f40753OooO;
                obj = o0000O0.OooO0OO(new AccountRepo$getFirstRechargeInfo$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ApiResult apiResult = (ApiResult) obj;
            if (apiResult.isSuccess() && (userFirstRechargeModel = (UserFirstRechargeModel) apiResult.getData()) != null) {
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p497o0o00Oo.OooOOO0.OooO0OO().OooOO0O(userFirstRechargeModel.getFirstRechargeCompleted());
                p499o0o00OoO.o00oO0o o00oo0oOooO0OO = p497o0o00Oo.OooOOO0.OooO0OO();
                boolean monthlyFirstRechargeCompleted = userFirstRechargeModel.getMonthlyFirstRechargeCompleted();
                Objects.requireNonNull(o00oo0oOooO0OO);
                o00oo0oOooO0OO.OooO0o("isFirstChargeMonthlyShow" + OooOOO.f41216OooO00o.OooOo().getValue(), monthlyFirstRechargeCompleted);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadUserInfo$1", f = "MainVM.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25500Oooo0o;

        public OooOO0O(Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOO0O(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25500Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f21408OooO00o;
                this.f25500Oooo0o = 1;
                if (accountRepo.OooO0o(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$signTermsService$1", f = "MainVM.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25501Oooo0o;

        public OooOOO0(Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooOOO0(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25501Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0000OO0 o0000oo1 = o0000OO0.f42429OooO00o;
                this.f25501Oooo0o = 1;
                if (BuildersKt.withContext(Dispatchers.getIO(), new MainRepository$signServiceUpdate$$inlined$call$1(o0000oo1, null), this) == coroutine_suspended) {
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

    public final void atd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(context, null), 2, null);
    }

    @NotNull
    public final Oooo0<ApiServiceUpdateModel> checkTermsService() {
        Oooo0<ApiServiceUpdateModel> oooo0 = new Oooo0<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(oooo0, null), 3, null);
        return oooo0;
    }

    public final void getEventSettingState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0OO(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getHaveNewFollowingPost() {
        return this.haveNewFollowingPost;
    }

    public final void initBefore() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(null), 2, null);
    }

    public final void loadLimitedPsdRoom() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(null), 3, null);
    }

    public final void loadUserFirstRechargeModel() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(null), 3, null);
    }

    public final void loadUserInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOO0O(null), 2, null);
    }

    public final void signTermsService() {
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooOOO0(null));
    }

    public final void updateMessageStateFailed() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new p520o0o0O0O0.OooOo(null), 2, null);
        p491o0o00O00.OooO0OO.OooO00o().OooOo00().OooO0OO(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
    }
}
