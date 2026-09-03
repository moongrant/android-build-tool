package com.yalla.yalla.ui.vm.main;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.OooOo00;
import com.common.support.apm.Sailfish;
import com.common.support.atd.Detector;
import com.common.support.sailfish_commons.logmodels.SecModel;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.data.repository.AccountRepo;
import com.yalla.yalla.data.repository.AccountRepo$getFirstRechargeInfo$$inlined$call$1;
import com.yalla.yalla.data.repository.EventSettingRepo;
import com.yalla.yalla.data.repository.MainRepository$checkServiceUpdate$$inlined$call$1;
import com.yalla.yalla.data.repository.MainRepository$signServiceUpdate$$inlined$call$1;
import com.yalla.yalla.model.ApiServiceUpdateModel;
import com.yalla.yalla.model.MomentSelectMedia;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.UserFirstRechargeModel;
import com.yalla.yalla.repository.AppConfigRepo;
import com.yallatech.support.platform.YCSDKOpenKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O0;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p381o0OOoo0O.Oooo0;
import p382o0OOoo0o.o00O0O;
import p382o0OOoo0o.o00Ooo;
import p382o0OOoo0o.oo000o;
import p385o0OOooOO.o00oOoo;
import p394o0Oo00oO.o0O0O00;
import p403o0Oo0OOo.o0O00;
import p406o0Oo0Ooo.g;
import p406o0Oo0Ooo.oOO0O0;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00000O;
import p420o0OoO0OO.o0OOO0o;
import p464o0Oooo.o000000O;
import p482o0o000oO.o0Oo0oo;
import p560o0oOo000.o00000OO;
import p560o0oOo000.o0000OO0;
import p579o0oOoo.oO000O0;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0005R%\u0010\u0014\u001a\u0010\u0012\f\u0012\n \u0013*\u0004\u0018\u00010\u00120\u00120\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R+\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/vm/main/MainVM;", "Lo0Oo00oO/o0O0O00;", "Lo0OoO0OO/o0OOO0o;", "Lcom/yalla/yalla/model/ApiServiceUpdateModel;", "checkTermsService", "", "signTermsService", "initBefore", "loadUserInfo", "loadUserFirstRechargeModel", "loadLimitedPsdRoom", "updateMessageStateFailed", "getEventSettingState", "Landroid/content/Context;", "context", "atd", "clearMediaCache", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "haveNewFollowingPost", "Landroidx/lifecycle/MutableLiveData;", "getHaveNewFollowingPost", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "isShowingMomentTabAddVideoGuide$delegate", "Landroidx/compose/runtime/MutableState;", "isShowingMomentTabAddVideoGuide", "()Z", "setShowingMomentTabAddVideoGuide", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainVM.kt\ncom/yalla/yalla/ui/vm/main/MainVM\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,149:1\n81#2:150\n107#2,2:151\n1855#3,2:153\n*S KotlinDebug\n*F\n+ 1 MainVM.kt\ncom/yalla/yalla/ui/vm/main/MainVM\n*L\n43#1:150\n43#1:151,2\n141#1:153,2\n*E\n"})
public final class MainVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<Boolean> haveNewFollowingPost;

    /* JADX INFO: renamed from: isShowingMomentTabAddVideoGuide$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState isShowingMomentTabAddVideoGuide;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadLimitedPsdRoom$1", f = "MainVM.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31784OooO0Oo;

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

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31784OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g gVar = g.f44822OooO00o;
                this.f31784OooO0Oo = 1;
                obj = gVar.OooO0OO(this);
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
                ArrayList arrayList = o00O0O.f44281OooO00o;
                arrayList.clear();
                arrayList.addAll(list);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$atd$1", f = "MainVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Context f31785OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f31785OooO0Oo = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f31785OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            SecModel secModelStart = Detector.INSTANCE.start(this.f31785OooO0Oo);
            String appInstallS = secModelStart.getAppInstallS();
            if (appInstallS.length() == 0) {
                appInstallS = oO000O0.OooO00o(oO000O0.f56533OooO00o);
            }
            secModelStart.setAppInstallS(appInstallS);
            secModelStart.setDevice(oo000o.OooO00o());
            secModelStart.setTime(o0Oo0oo.OooO0O0());
            o000000O o000000o2 = o000000O.f46674OooO00o;
            String str = (String) o000000O.OooOOo().getValue();
            if (str == null) {
                str = "";
            }
            secModelStart.setUserId(str);
            secModelStart.setVersion(o00Ooo.OooO0Oo());
            Sailfish.INSTANCE.writeSecLog(secModelStart);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$checkTermsService$1$1", f = "MainVM.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public o0OOO0o f31786OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ o0OOO0o<ApiServiceUpdateModel> f31787OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31788OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(o0OOO0o<ApiServiceUpdateModel> o0ooo0o2, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31787OooO0o = o0ooo0o2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f31787OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            o0OOO0o o0ooo0o2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31788OooO0o0;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g gVar = g.f44822OooO00o;
                o0OOO0o<ApiServiceUpdateModel> o0ooo0o3 = this.f31787OooO0o;
                this.f31786OooO0Oo = o0ooo0o3;
                this.f31788OooO0o0 = 1;
                gVar.getClass();
                obj = BuildersKt.withContext(Dispatchers.getIO(), new MainRepository$checkServiceUpdate$$inlined$call$1(gVar, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0ooo0o2 = o0ooo0o3;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0ooo0o2 = this.f31786OooO0Oo;
                ResultKt.throwOnFailure(obj);
            }
            o0ooo0o2.postValue(obj);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$getEventSettingState$1", f = "MainVM.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31789OooO0Oo;

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
            int i = this.f31789OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EventSettingRepo eventSettingRepo = EventSettingRepo.f22961OooO00o;
                this.f31789OooO0Oo = 1;
                if (eventSettingRepo.OooO00o(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$initBefore$1", f = "MainVM.kt", i = {}, l = {72, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31790OooO0Oo;

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

        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31790OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (OooOo00.OooO00o(o000OOo.OooO00o().OooOOOO().OooO0O0())) {
                    o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
                    o0000O0.OooO00o(null);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (!StringsKt.isBlank(o00Oo0.OooO0o().OooOOO0())) {
                YCSDKOpenKit.setApplicationId(o00Oo0.OooO0o().OooOOO0());
                YCSDKOpenKit.setApplicationKey(o00Oo0.OooO0o().OooOOO());
                YCSDKOpenKit.setDirectUrl("https://www.yalla.live/");
                YCSDKOpenKit yCSDKOpenKit = YCSDKOpenKit.INSTANCE;
                App app = App.f22702OooO0o;
                Intrinsics.checkNotNullExpressionValue(app, "getContext()");
                yCSDKOpenKit.sdkInitialize(app);
            }
            AppConfigRepo appConfigRepo = AppConfigRepo.f24755OooO00o;
            this.f31790OooO0Oo = 1;
            if (appConfigRepo.OooO0OO(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            AppConfigRepo appConfigRepo2 = AppConfigRepo.f24755OooO00o;
            this.f31790OooO0Oo = 2;
            if (appConfigRepo2.OooO0Oo(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (OooOo00.OooO00o(o000OOo.OooO00o().OooOOOO().OooO0O0())) {
                o000O00O o000o00o3 = o000O0O0.f44226OooO00o;
                o0000O0.OooO00o(null);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadUserFirstRechargeModel$1", f = "MainVM.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31791OooO0Oo;

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
            int i = this.f31791OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f31791OooO0Oo = 1;
                accountRepo.getClass();
                String str = Oooo0.f44257OooOO0;
                obj = OooOOO.OooO0Oo(new AccountRepo$getFirstRechargeInfo$$inlined$call$1(o00oOoo.OooO00o(str, "url", str, 0), null), this);
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
                o00Oo0.OooO0OO().OooOO0O(userFirstRechargeModel.getFirstRechargeCompleted());
                p409o0Oo0o0o.o0OOO0o o0ooo0oOooO0OO = o00Oo0.OooO0OO();
                boolean monthlyFirstRechargeCompleted = userFirstRechargeModel.getMonthlyFirstRechargeCompleted();
                o0ooo0oOooO0OO.getClass();
                o0ooo0oOooO0OO.OooO0o("isFirstChargeMonthlyShow" + o000000O.OooOOo0().getValue(), monthlyFirstRechargeCompleted);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$loadUserInfo$1", f = "MainVM.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31792OooO0Oo;

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
            int i = this.f31792OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AccountRepo accountRepo = AccountRepo.f22858OooO00o;
                this.f31792OooO0Oo = 1;
                if (accountRepo.OooO0o0(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.main.MainVM$signTermsService$1", f = "MainVM.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31793OooO0Oo;

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
            int i = this.f31793OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                g gVar = g.f44822OooO00o;
                this.f31793OooO0Oo = 1;
                gVar.getClass();
                if (BuildersKt.withContext(Dispatchers.getIO(), new MainRepository$signServiceUpdate$$inlined$call$1(gVar, null), this) == coroutine_suspended) {
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

    public MainVM() {
        Boolean bool = Boolean.FALSE;
        this.haveNewFollowingPost = new MutableLiveData<>(bool);
        this.isShowingMomentTabAddVideoGuide = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
    }

    public final void atd(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(context, null), 2, null);
    }

    @NotNull
    public final o0OOO0o<ApiServiceUpdateModel> checkTermsService() {
        o0OOO0o<ApiServiceUpdateModel> o0ooo0o2 = new o0OOO0o<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO0O0(o0ooo0o2, null), 3, null);
        return o0ooo0o2;
    }

    public final void clearMediaCache() {
        ArrayList arrayList = new ArrayList();
        o00000O o00000oOooOO0 = o00Oo0.OooOO0();
        o00000oOooOO0.getClass();
        ArrayList arrayList2 = new ArrayList();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o00000O.OooO00o oooO00o = (o00000O.OooO00o) p140o00OOooo.OooOO0.OooO0O0(o00000O.OooO00o.class, o00000oOooOO0.OooO0o0("momentMediaString" + o000000O.OooOOo0().getValue(), ""));
        if (oooO00o != null) {
            arrayList2.clear();
            List<MomentSelectMedia> list = oooO00o.f45211OooO00o;
            if (list != null) {
                arrayList2.addAll(list);
            }
        }
        p515o0o0O0O0.OooO.f51694OooO00o = arrayList2;
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MomentSelectMedia) it.next()).getPath());
        }
        o00000OO o00000oo2 = o0000OO0.f56185OooO0Oo;
        o00000OO o00000oo3 = null;
        if (o00000oo2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
            o00000oo2 = null;
        }
        o00000oo2.OooO0OO();
        o00000OO o00000oo4 = o0000OO0.f56185OooO0Oo;
        if (o00000oo4 != null) {
            o00000oo3 = o00000oo4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException(ShareConstants.WEB_DIALOG_PARAM_MEDIA);
        }
        o00000oo3.OooO0o0(arrayList);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isShowingMomentTabAddVideoGuide() {
        return ((Boolean) this.isShowingMomentTabAddVideoGuide.getValue()).booleanValue();
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

    public final void setShowingMomentTabAddVideoGuide(boolean z) {
        this.isShowingMomentTabAddVideoGuide.setValue(Boolean.valueOf(z));
    }

    public final void signTermsService() {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooOOO0(null));
    }

    public final void updateMessageStateFailed() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO0O0(null), 2, null);
        o0O00 o0o00OooOOo = o000OOo.OooO00o().OooOOo();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o0o00OooOOo.OooO0O0(((Number) androidx.compose.ui.graphics.colorspace.OooO0OO.OooO0O0()).longValue());
    }
}
