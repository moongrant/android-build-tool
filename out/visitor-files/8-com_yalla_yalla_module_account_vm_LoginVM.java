package com.yalla.yalla.module.account.vm;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.compose.foundation.text.selection.o00O0O0O;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.material.o0O00OO;
import androidx.compose.material3.internal.o0000O0O;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AppsFlyerLib;
import com.code.android.util.LiveDataUtilKt;
import com.code.android.util.o00OO000;
import com.code.android.util.o00OOO0;
import com.code.android.util.o0Oo0oo;
import com.code.android.util.o0o0Oo;
import com.common.support.apm.otlp.biz.entity.NetworkType;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.qiniu.android.collect.ReportItem;
import com.yalla.yalla.api.old.ApiEvent;
import com.yalla.yalla.api.old.ApiObserverKt;
import com.yalla.yalla.api.result.ApiResult;
import com.yalla.yalla.common.module_service.IMainModuleService;
import com.yalla.yalla.common.module_service.IMomentModuleService;
import com.yalla.yalla.data.cache.SharedMainMessageManager;
import com.yalla.yalla.data.db.table.YallaTeamMessage;
import com.yalla.yalla.data.manager.SharedMessageVM;
import com.yalla.yalla.data.manager.UnreadMessageNumberManager;
import com.yalla.yalla.data.repository.o00Ooo;
import com.yalla.yalla.data.repository.oo000o;
import com.yalla.yalla.ext.JobFlowKt;
import com.yalla.yalla.ext.OooOO0;
import com.yalla.yalla.ext.o00Oo0;
import com.yalla.yalla.manager.OooOOO;
import com.yalla.yalla.manager.OooOOOO;
import com.yalla.yalla.manager.RoomState;
import com.yalla.yalla.manager.RoomStateManager;
import com.yalla.yalla.model.LoginListModel;
import com.yalla.yalla.model.LoginModel;
import com.yalla.yalla.model.LoginToken;
import com.yalla.yalla.model.user.MyUserInfoModel;
import com.yalla.yalla.model.user.ThirdPartyLoginModel;
import com.yalla.yalla.open_auth.OpenAuthManager;
import com.yalla.yalla.repository.Account;
import com.yalla.yalla.statistical.business.BusinessEvent;
import com.yalla.yalla.util.AppVirtualManager;
import com.yalla.yalla.util.Oooo000;
import com.yalla.yalla.util.track.NetworkUtil;
import io.agora.rtc.Constants;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p445o0Ooo.OooOO0O;
import p447o0Ooo00.OooOo00;
import p452o0Ooo0O0.o0ooOOo;
import p464o0OoooO.o00oOoo;
import p469o0OooooO.oOO0OO;
import p469o0OooooO.oOO0OOO;

/* JADX INFO: loaded from: classes7.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\u0003J!\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010'J3\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010(\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b*\u0010+J)\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00060)2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\u0019\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00060\u000f¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020,0\u00060\u000f¢\u0006\u0004\b1\u00100J\u0015\u00102\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b2\u00103J2\u00104\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b4\u00105J!\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00060\u000f2\u0006\u00106\u001a\u00020\r¢\u0006\u0004\b8\u00109J\u0015\u0010;\u001a\u00020\u001a2\u0006\u0010:\u001a\u00020\r¢\u0006\u0004\b;\u0010<R/\u0010D\u001a\u0004\u0018\u0001072\b\u0010=\u001a\u0004\u0018\u0001078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006H"}, d2 = {"Lcom/yalla/yalla/module/account/vm/LoginVM;", "Lo0Ooo0O0/o0ooOOo;", "<init>", "()V", "", "accessToken", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;", "yallaChatLoginCovert", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "token", "", "region", "Lcom/yalla/yalla/ext/o00Oo0;", "newInstallUserIntoPlatform", "(JLjava/lang/String;I)Lcom/yalla/yalla/ext/o00Oo0;", "Lcom/yalla/yalla/model/user/MyUserInfoModel;", "userInfoModel", "Lcom/yalla/yalla/model/LoginToken;", "Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;", "type", "", "isFirst", "isGuest", "", "saveUserData", "(Lcom/yalla/yalla/model/user/MyUserInfoModel;Lcom/yalla/yalla/model/LoginToken;Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;ZZ)V", "oldRegion", "oldUserId", "changeLanguageAndRoom", "(Ljava/lang/Integer;J)V", "closeLoginPages", "logSuccessEvent", "(ZLcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;)V", "saveDataToSp", "(ZLcom/yalla/yalla/model/user/MyUserInfoModel;)V", "insertWelcomeMessage", "(Z)V", "twitterSecretOrInsUserId", "Landroidx/lifecycle/LiveData;", "thirdLogin", "(Ljava/lang/String;Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/LoginModel;", "activeAccount", "(Ljava/lang/String;J)Landroidx/lifecycle/LiveData;", "loginByVisitor", "()Lcom/yalla/yalla/ext/o00Oo0;", "newInstallUserRegisterEvent", "newInstallUserStay30s", "(J)V", "onLoginSuccess", "(ZLcom/yalla/yalla/model/user/MyUserInfoModel;Lcom/yalla/yalla/model/LoginToken;Lcom/yalla/yalla/open_auth/OpenAuthManager$AuthType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "channelSource", "Lcom/yalla/yalla/model/user/ThirdPartyLoginModel;", "getPopupConfig", "(I)Lcom/yalla/yalla/ext/o00Oo0;", "loginFrom", "logStartEvent", "(I)V", "<set-?>", "userPopupConfigModel$delegate", "Landroidx/compose/runtime/MutableState;", "getUserPopupConfigModel", "()Lcom/yalla/yalla/model/user/ThirdPartyLoginModel;", "setUserPopupConfigModel", "(Lcom/yalla/yalla/model/user/ThirdPartyLoginModel;)V", "userPopupConfigModel", "Ljava/text/SimpleDateFormat;", "dateFormat", "Ljava/text/SimpleDateFormat;", "Account_YallaRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLoginVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoginVM.kt\ncom/yalla/yalla/module/account/vm/LoginVM\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,504:1\n1#2:505\n85#3:506\n117#3,2:507\n*S KotlinDebug\n*F\n+ 1 LoginVM.kt\ncom/yalla/yalla/module/account/vm/LoginVM\n*L\n69#1:506\n69#1:507,2\n*E\n"})
public class LoginVM extends o0ooOOo {
    public static final int $stable = 8;

    @NotNull
    private final SimpleDateFormat dateFormat;

    /* JADX INFO: renamed from: userPopupConfigModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState userPopupConfigModel = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenAuthManager.AuthType.values().length];
            try {
                iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Google.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Phone.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[OpenAuthManager.AuthType.Email.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$activeAccount$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/LoginModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$activeAccount$1", f = "LoginVM.kt", i = {0, 1, 1}, l = {149, TextFieldImplKt.AnimationDuration, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$1"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public /* synthetic */ Object f51092OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ApiResult f51093OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f51094OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f51095OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ long f51096OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ LoginVM f51097OooOO0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, long j, LoginVM loginVM, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.f51095OooOO0 = str;
            this.f51096OooOO0O = j;
            this.f51097OooOO0o = loginVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f51095OooOO0, this.f51096OooOO0O, this.f51097OooOO0o, continuation);
            anonymousClass1.f51092OooO = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00a6, code lost:
        
            if (r1.emit(r13, r12) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            AnonymousClass1 anonymousClass1;
            LiveDataScope liveDataScope2;
            ApiResult apiResult2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51094OooO0oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope3 = (LiveDataScope) this.f51092OooO;
                com.yalla.yalla.data.repository.OooO00o oooO00o = com.yalla.yalla.data.repository.OooO00o.f47314OooO00o;
                this.f51092OooO = liveDataScope3;
                this.f51094OooO0oo = 1;
                Object objOooO0OO = oooO00o.OooO0OO(this.f51096OooOO0O, this.f51095OooOO0, this);
                if (objOooO0OO != coroutine_suspended) {
                    liveDataScope = liveDataScope3;
                    obj = objOooO0OO;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                liveDataScope = (LiveDataScope) this.f51092OooO;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                apiResult2 = this.f51093OooO0oO;
                liveDataScope2 = (LiveDataScope) this.f51092OooO;
                ResultKt.throwOnFailure(obj);
                anonymousClass1 = this;
                apiResult = apiResult2;
                liveDataScope = liveDataScope2;
                anonymousClass1.f51092OooO = null;
                anonymousClass1.f51093OooO0oO = null;
                anonymousClass1.f51094OooO0oo = 3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
            apiResult = (ApiResult) obj;
            if (apiResult.isSuccess()) {
                Object data = apiResult.getData();
                Intrinsics.checkNotNull(data);
                boolean zIsFirst = ((LoginModel) data).getIsFirst();
                Object data2 = apiResult.getData();
                Intrinsics.checkNotNull(data2);
                MyUserInfoModel data3 = ((LoginModel) data2).getData();
                Intrinsics.checkNotNull(data3);
                Object data4 = apiResult.getData();
                Intrinsics.checkNotNull(data4);
                LoginToken token = ((LoginModel) data4).getToken();
                Intrinsics.checkNotNull(token);
                this.f51092OooO = liveDataScope;
                this.f51093OooO0oO = apiResult;
                this.f51094OooO0oo = 2;
                anonymousClass1 = this;
                if (this.f51097OooOO0o.onLoginSuccess(zIsFirst, data3, token, null, anonymousClass1) != coroutine_suspended) {
                    liveDataScope2 = liveDataScope;
                    apiResult2 = apiResult;
                    apiResult = apiResult2;
                    liveDataScope = liveDataScope2;
                    anonymousClass1.f51092OooO = null;
                    anonymousClass1.f51093OooO0oO = null;
                    anonymousClass1.f51094OooO0oo = 3;
                }
            } else {
                anonymousClass1 = this;
                anonymousClass1.f51092OooO = null;
                anonymousClass1.f51093OooO0oO = null;
                anonymousClass1.f51094OooO0oo = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$getPopupConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/user/ThirdPartyLoginModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$getPopupConfig$1", f = "LoginVM.kt", i = {}, l = {480, 480}, m = "invokeSuspend", n = {}, s = {})
    public static final class C10131 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<ThirdPartyLoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f51098OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51099OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f51100OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10131(int i, Continuation<? super C10131> continuation) {
            super(2, continuation);
            this.f51098OooO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10131 c10131 = new C10131(this.f51098OooO, continuation);
            c10131.f51100OooO0oo = obj;
            return c10131;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<ThirdPartyLoginModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C10131) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51099OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f51100OooO0oo;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f51100OooO0oo;
            com.yalla.yalla.data.repository.OooO00o oooO00o = com.yalla.yalla.data.repository.OooO00o.f47314OooO00o;
            this.f51100OooO0oo = flowCollector;
            this.f51099OooO0oO = 1;
            obj = oooO00o.OooOOO(this.f51098OooO, 1, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            this.f51100OooO0oo = null;
            this.f51099OooO0oO = 2;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$logStartEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$logStartEvent$1", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C10141 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ int f51101OooO0oO;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$logStartEvent$1$OooO00o */
        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkUtil.NetworkType.values().length];
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_NO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_WIFI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_2G.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_3G.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_4G.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_5G.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10141(int i, Continuation<? super C10141> continuation) {
            super(2, continuation);
            this.f51101OooO0oO = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10141(this.f51101OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            NetworkType networkType;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            switch (OooO00o.$EnumSwitchMapping$0[NetworkUtil.OooO00o().ordinal()]) {
                case 1:
                    networkType = NetworkType.NO_NETWORK;
                    break;
                case 2:
                    networkType = NetworkType.NETWORK_UNKNOWN;
                    break;
                case 3:
                    networkType = NetworkType.NETWORK_WIFI;
                    break;
                case 4:
                    networkType = NetworkType.NETWORK_2G;
                    break;
                case 5:
                    networkType = NetworkType.NETWORK_3G;
                    break;
                case 6:
                    networkType = NetworkType.NETWORK_4G;
                    break;
                case 7:
                    networkType = NetworkType.NETWORK_5G;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String value = networkType.getValue();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = value.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("307008", MapsKt.mapOf(TuplesKt.to("page_source", Boxing.boxInt(this.f51101OooO0oO)), TuplesKt.to("pagename", "visit_login"), TuplesKt.to("network", upperCase), TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_DEVICE, OooOo00.OooO0O0())));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$loginByVisitor$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/LoginModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$loginByVisitor$1", f = "LoginVM.kt", i = {0, 1, 1}, l = {164, 165, 174}, m = "invokeSuspend", n = {"$this$jobFlow", "$this$jobFlow", "apiResult"}, s = {"L$0", "L$0", "L$1"})
    public static final class C10151 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public /* synthetic */ Object f51102OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ApiResult f51103OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f51104OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$loginByVisitor$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yalla/yalla/model/LoginModel;", "Lkotlin/ParameterName;", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$loginByVisitor$1$1", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03251 extends SuspendLambda implements Function2<LoginModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public /* synthetic */ Object f51106OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ LoginVM f51107OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03251(LoginVM loginVM, Continuation<? super C03251> continuation) {
                super(2, continuation);
                this.f51107OooO0oo = loginVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03251 c03251 = new C03251(this.f51107OooO0oo, continuation);
                c03251.f51106OooO0oO = obj;
                return c03251;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LoginModel loginModel, Continuation<? super Unit> continuation) {
                return ((C03251) create(loginModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                LoginModel loginModel = (LoginModel) this.f51106OooO0oO;
                if ((loginModel != null ? loginModel.getData() : null) != null) {
                    oOO0OO.OooO0OO().f93873OooOOO.OooO0OO(Boxing.boxBoolean(loginModel != null ? loginModel.getIsGameFirst() : false));
                    Intrinsics.checkNotNull(loginModel);
                    MyUserInfoModel data = loginModel.getData();
                    if (data == null) {
                        return Unit.INSTANCE;
                    }
                    LoginToken token = loginModel.getToken();
                    if (token == null) {
                        return Unit.INSTANCE;
                    }
                    this.f51107OooO0oo.saveUserData(data, token, null, loginModel.getIsFirst(), true);
                }
                return Unit.INSTANCE;
            }
        }

        public C10151(Continuation<? super C10151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10151 c10151 = LoginVM.this.new C10151(continuation);
            c10151.f51102OooO = obj;
            return c10151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<LoginModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C10151) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            if (r2.emit(r1, r13) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            C10151 c10151;
            FlowCollector flowCollector2;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51104OooO0oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector3 = (FlowCollector) this.f51102OooO;
                String countryCode = Oooo000.OooO0O0(new Oooo000()).getCountryCode();
                this.f51102OooO = flowCollector3;
                this.f51104OooO0oo = 1;
                Object objOooOOO = o00Ooo.f48615OooO00o.OooOOO(0, countryCode, this);
                if (objOooOOO != coroutine_suspended) {
                    flowCollector = flowCollector3;
                    obj = objOooOOO;
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                flowCollector = (FlowCollector) this.f51102OooO;
                ResultKt.throwOnFailure(obj);
            } else if (i == 2) {
                apiResult = this.f51103OooO0oO;
                flowCollector2 = (FlowCollector) this.f51102OooO;
                ResultKt.throwOnFailure(obj);
                c10151 = this;
                c10151.f51102OooO = null;
                c10151.f51103OooO0oO = null;
                c10151.f51104OooO0oo = 3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
            ApiResult apiResult2 = (ApiResult) obj;
            C03251 c03251 = new C03251(LoginVM.this, null);
            this.f51102OooO = flowCollector;
            this.f51103OooO0oO = apiResult2;
            this.f51104OooO0oo = 2;
            c10151 = this;
            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03251, c10151, 7) != coroutine_suspended) {
                flowCollector2 = flowCollector;
                apiResult = apiResult2;
                c10151.f51102OooO = null;
                c10151.f51103OooO0oO = null;
                c10151.f51104OooO0oo = 3;
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserIntoPlatform$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/yalla/yalla/api/result/ApiResult;", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$newInstallUserIntoPlatform$1", f = "LoginVM.kt", i = {0}, l = {237, 238}, m = "invokeSuspend", n = {"$this$jobFlow"}, s = {"L$0"})
    public static final class C10161 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<String>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ long f51108OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51109OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public /* synthetic */ Object f51110OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f51111OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ int f51112OooOO0O;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserIntoPlatform$1$OooO00o */
        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NetworkUtil.NetworkType.values().length];
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_NO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_WIFI.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_2G.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_3G.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_4G.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[NetworkUtil.NetworkType.NETWORK_5G.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10161(long j, String str, int i, Continuation<? super C10161> continuation) {
            super(2, continuation);
            this.f51108OooO = j;
            this.f51111OooOO0 = str;
            this.f51112OooOO0O = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10161 c10161 = new C10161(this.f51108OooO, this.f51111OooOO0, this.f51112OooOO0O, continuation);
            c10161.f51110OooO0oo = obj;
            return c10161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<String>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C10161) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x00b9, code lost:
        
            if (r1.emit((com.yalla.yalla.api.result.ApiResult) r12, r11) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            NetworkType networkType;
            C10161 c10161;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51109OooO0oO;
            if (i != 0) {
                if (i == 1) {
                    flowCollector = (FlowCollector) this.f51110OooO0oo;
                    ResultKt.throwOnFailure(obj);
                    c10161 = this;
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            flowCollector = (FlowCollector) this.f51110OooO0oo;
            switch (OooO00o.$EnumSwitchMapping$0[NetworkUtil.OooO00o().ordinal()]) {
                case 1:
                    networkType = NetworkType.NO_NETWORK;
                    break;
                case 2:
                    networkType = NetworkType.NETWORK_UNKNOWN;
                    break;
                case 3:
                    networkType = NetworkType.NETWORK_WIFI;
                    break;
                case 4:
                    networkType = NetworkType.NETWORK_2G;
                    break;
                case 5:
                    networkType = NetworkType.NETWORK_3G;
                    break;
                case 6:
                    networkType = NetworkType.NETWORK_4G;
                    break;
                case 7:
                    networkType = NetworkType.NETWORK_5G;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            String value = networkType.getValue();
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = value.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0Oo("301027", MapsKt.mapOf(TuplesKt.to("network", upperCase), TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_DEVICE, OooOo00.OooO0O0()), TuplesKt.to("userId", Boxing.boxLong(this.f51108OooO))));
            oo000o oo000oVar = oo000o.f48623OooO00o;
            this.f51110OooO0oo = flowCollector;
            this.f51109OooO0oO = 1;
            c10161 = this;
            obj = oo000oVar.OooO0o0(this.f51112OooOO0O, this.f51108OooO, this.f51111OooOO0, c10161);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
            c10161.f51110OooO0oo = null;
            c10161.f51109OooO0oO = 2;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserRegisterEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/LoginModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$newInstallUserRegisterEvent$1", f = "LoginVM.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 9, 9}, l = {182, 184, 185, 188, 189, 192, 193, 196, 197, 199, 220}, m = "invokeSuspend", n = {"$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", RemoteConfigConstants$RequestFieldKey.COUNTRY_CODE, "$this$jobFlow", "$this$jobFlow", ReportItem.QualityKeyResult}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$1"})
    public static final class C10171 extends SuspendLambda implements Function2<FlowCollector<? super ApiResult<LoginModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public /* synthetic */ Object f51113OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f51114OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f51115OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserRegisterEvent$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0018\u00010\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lcom/yalla/yalla/model/LoginModel;", "Lkotlin/ParameterName;", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$newInstallUserRegisterEvent$1$1", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03261 extends SuspendLambda implements Function2<LoginModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public /* synthetic */ Object f51117OooO0oO;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ LoginVM f51118OooO0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03261(LoginVM loginVM, Continuation<? super C03261> continuation) {
                super(2, continuation);
                this.f51118OooO0oo = loginVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C03261 c03261 = new C03261(this.f51118OooO0oo, continuation);
                c03261.f51117OooO0oO = obj;
                return c03261;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LoginModel loginModel, Continuation<? super Unit> continuation) {
                return ((C03261) create(loginModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                MyUserInfoModel data;
                String token;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                LoginModel loginModel = (LoginModel) this.f51117OooO0oO;
                int i = 0;
                oOO0OO.OooO0OO().f93873OooOOO.OooO0OO(Boxing.boxBoolean(loginModel != null ? loginModel.getIsGameFirst() : false));
                if (loginModel == null || (data = loginModel.getData()) == null) {
                    return Unit.INSTANCE;
                }
                LoginToken token2 = loginModel.getToken();
                if (token2 == null || (token = token2.getToken()) == null) {
                    return Unit.INSTANCE;
                }
                Calendar calendar = Calendar.getInstance();
                Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
                int iOooO00o = OooOO0.OooO00o(calendar);
                o0o0000.OooO0o oooO0oOooO0OO = oOO0OO.OooO0OO();
                long userId = data.getUserId();
                if (oooO0oOooO0OO.OooO00o().getInt("installVisitorIntoTime" + userId, 0) == iOooO00o) {
                    return Unit.INSTANCE;
                }
                Account account = Account.f74684OooO00o;
                if (Account.OooOoOO()) {
                    return Unit.INSTANCE;
                }
                o0o0000.OooO0o oooO0oOooO0OO2 = oOO0OO.OooO0OO();
                long userId2 = data.getUserId();
                oooO0oOooO0OO2.OooO00o().OooO0OO("installVisitorIntoTime" + userId2, iOooO00o);
                Map mapMapOf = MapsKt.mapOf(TuplesKt.to("userId", String.valueOf(data.getUserId())));
                String userId3 = String.valueOf(data.getUserId());
                Intrinsics.checkNotNullParameter(userId3, "userId");
                AppsFlyerLib.getInstance().setCustomerUserId(userId3);
                com.yalla.yalla.statistical.business.OooO0OO.OooO00o("af_visitors_login", mapMapOf);
                com.yalla.yalla.statistical.business.OooO0OO.OooO00o("af_set_customer_user_id", mapMapOf);
                com.yalla.yalla.util.log.OooOO0.OooO0Oo("dddsdsd", 0, new OooO0o(data, i), 6);
                long userId4 = data.getUserId();
                LoginVM loginVM = this.f51118OooO0oo;
                loginVM.newInstallUserStay30s(userId4);
                loginVM.newInstallUserIntoPlatform(data.getUserId(), token, data.getRegion());
                return Unit.INSTANCE;
            }
        }

        public C10171(Continuation<? super C10171> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10171 c10171 = LoginVM.this.new C10171(continuation);
            c10171.f51113OooO = obj;
            return c10171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super ApiResult<LoginModel>> flowCollector, Continuation<? super Unit> continuation) {
            return ((C10171) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:22:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:25:0x00d3 A[PHI: r1 r7
          0x00d3: PHI (r1v5 java.lang.String) = (r1v2 java.lang.String), (r1v7 java.lang.String) binds: [B:23:0x00d0, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]
          0x00d3: PHI (r7v5 kotlinx.coroutines.flow.FlowCollector) = (r7v2 kotlinx.coroutines.flow.FlowCollector), (r7v7 kotlinx.coroutines.flow.FlowCollector) binds: [B:23:0x00d0, B:15:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:28:0x00e1 A[PHI: r1 r7 r13
          0x00e1: PHI (r1v9 java.lang.String) = (r1v5 java.lang.String), (r1v11 java.lang.String) binds: [B:26:0x00de, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r7v9 kotlinx.coroutines.flow.FlowCollector) = (r7v5 kotlinx.coroutines.flow.FlowCollector), (r7v11 kotlinx.coroutines.flow.FlowCollector) binds: [B:26:0x00de, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]
          0x00e1: PHI (r13v14 java.lang.Object) = (r13v10 java.lang.Object), (r13v0 java.lang.Object) binds: [B:26:0x00de, B:14:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00e3 A[PHI: r1 r7 r13
          0x00e3: PHI (r1v8 java.lang.String) = (r1v2 java.lang.String), (r1v9 java.lang.String) binds: [B:21:0x00c3, B:28:0x00e1] A[DONT_GENERATE, DONT_INLINE]
          0x00e3: PHI (r7v8 kotlinx.coroutines.flow.FlowCollector) = (r7v2 kotlinx.coroutines.flow.FlowCollector), (r7v9 kotlinx.coroutines.flow.FlowCollector) binds: [B:21:0x00c3, B:28:0x00e1] A[DONT_GENERATE, DONT_INLINE]
          0x00e3: PHI (r13v11 com.yalla.yalla.api.result.ApiResult) = (r13v6 com.yalla.yalla.api.result.ApiResult), (r13v15 com.yalla.yalla.api.result.ApiResult) binds: [B:21:0x00c3, B:28:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:31:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f7 A[PHI: r1 r7
          0x00f7: PHI (r1v12 java.lang.String) = (r1v8 java.lang.String), (r1v14 java.lang.String) binds: [B:32:0x00f4, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]
          0x00f7: PHI (r7v12 kotlinx.coroutines.flow.FlowCollector) = (r7v8 kotlinx.coroutines.flow.FlowCollector), (r7v14 kotlinx.coroutines.flow.FlowCollector) binds: [B:32:0x00f4, B:13:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:37:0x0105 A[PHI: r1 r7 r13
          0x0105: PHI (r1v16 java.lang.String) = (r1v12 java.lang.String), (r1v18 java.lang.String) binds: [B:35:0x0102, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r7v16 kotlinx.coroutines.flow.FlowCollector) = (r7v12 kotlinx.coroutines.flow.FlowCollector), (r7v18 kotlinx.coroutines.flow.FlowCollector) binds: [B:35:0x0102, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]
          0x0105: PHI (r13v21 java.lang.Object) = (r13v17 java.lang.Object), (r13v0 java.lang.Object) binds: [B:35:0x0102, B:12:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:38:0x0107 A[PHI: r1 r7 r13
          0x0107: PHI (r1v15 java.lang.String) = (r1v8 java.lang.String), (r1v16 java.lang.String) binds: [B:30:0x00e7, B:37:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0107: PHI (r7v15 kotlinx.coroutines.flow.FlowCollector) = (r7v8 kotlinx.coroutines.flow.FlowCollector), (r7v16 kotlinx.coroutines.flow.FlowCollector) binds: [B:30:0x00e7, B:37:0x0105] A[DONT_GENERATE, DONT_INLINE]
          0x0107: PHI (r13v18 com.yalla.yalla.api.result.ApiResult) = (r13v11 com.yalla.yalla.api.result.ApiResult), (r13v22 com.yalla.yalla.api.result.ApiResult) binds: [B:30:0x00e7, B:37:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x010d  */
        /* JADX WARN: Code duplicated, block: B:43:0x011b A[PHI: r1 r7
          0x011b: PHI (r1v19 java.lang.String) = (r1v15 java.lang.String), (r1v21 java.lang.String) binds: [B:41:0x0118, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]
          0x011b: PHI (r7v19 kotlinx.coroutines.flow.FlowCollector) = (r7v15 kotlinx.coroutines.flow.FlowCollector), (r7v21 kotlinx.coroutines.flow.FlowCollector) binds: [B:41:0x0118, B:11:0x004e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:46:0x0129 A[PHI: r1 r7 r13
          0x0129: PHI (r1v23 java.lang.String) = (r1v19 java.lang.String), (r1v25 java.lang.String) binds: [B:44:0x0126, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x0129: PHI (r7v23 kotlinx.coroutines.flow.FlowCollector) = (r7v19 kotlinx.coroutines.flow.FlowCollector), (r7v25 kotlinx.coroutines.flow.FlowCollector) binds: [B:44:0x0126, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]
          0x0129: PHI (r13v28 java.lang.Object) = (r13v24 java.lang.Object), (r13v0 java.lang.Object) binds: [B:44:0x0126, B:10:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:47:0x012b A[PHI: r1 r7 r13
          0x012b: PHI (r1v22 java.lang.String) = (r1v15 java.lang.String), (r1v23 java.lang.String) binds: [B:39:0x010b, B:46:0x0129] A[DONT_GENERATE, DONT_INLINE]
          0x012b: PHI (r7v22 kotlinx.coroutines.flow.FlowCollector) = (r7v15 kotlinx.coroutines.flow.FlowCollector), (r7v23 kotlinx.coroutines.flow.FlowCollector) binds: [B:39:0x010b, B:46:0x0129] A[DONT_GENERATE, DONT_INLINE]
          0x012b: PHI (r13v25 com.yalla.yalla.api.result.ApiResult) = (r13v18 com.yalla.yalla.api.result.ApiResult), (r13v29 com.yalla.yalla.api.result.ApiResult) binds: [B:39:0x010b, B:46:0x0129] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:49:0x0131  */
        /* JADX WARN: Code duplicated, block: B:52:0x0141  */
        /* JADX WARN: Code duplicated, block: B:56:0x0152  */
        /* JADX WARN: Code duplicated, block: B:59:0x0158  */
        /* JADX WARN: Code duplicated, block: B:63:0x0174  */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0181, code lost:
        
            if (r2.emit(r1, r12) == r0) goto L66;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            String countryCode;
            ApiResult apiResult;
            FlowCollector flowCollector2;
            FlowCollector flowCollector3;
            FlowCollector flowCollector4;
            ApiResult apiResult2;
            C03261 c03261;
            C10171 c10171;
            ApiResult apiResult3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51115OooO0oo;
            o00Ooo o00ooo2 = o00Ooo.f48615OooO00o;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.f51113OooO;
                    countryCode = Oooo000.OooO0O0(new Oooo000()).getCountryCode();
                    this.f51113OooO = flowCollector;
                    this.f51114OooO0oO = countryCode;
                    this.f51115OooO0oo = 1;
                    obj = o00ooo2.OooOOO(1, countryCode, this);
                    if (obj != coroutine_suspended) {
                        apiResult = (ApiResult) obj;
                        if (!apiResult.isSuccess()) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 2;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 3;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (!apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 4;
                                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 5;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                apiResult = (ApiResult) obj;
                                                if (!apiResult.isSuccess()) {
                                                    if (apiResult.isSuccess()) {
                                                        this.f51113OooO = flowCollector;
                                                        this.f51114OooO0oO = countryCode;
                                                        this.f51115OooO0oo = 8;
                                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                            flowCollector3 = flowCollector;
                                                            this.f51113OooO = flowCollector3;
                                                            this.f51114OooO0oO = null;
                                                            this.f51115OooO0oo = 9;
                                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                                            if (obj != coroutine_suspended) {
                                                                flowCollector4 = flowCollector3;
                                                                apiResult = (ApiResult) obj;
                                                                flowCollector2 = flowCollector4;
                                                            }
                                                        }
                                                    } else {
                                                        flowCollector2 = flowCollector;
                                                    }
                                                    apiResult2 = apiResult;
                                                    c03261 = new C03261(LoginVM.this, null);
                                                    this.f51113OooO = flowCollector2;
                                                    this.f51114OooO0oO = apiResult2;
                                                    this.f51115OooO0oo = 10;
                                                    c10171 = this;
                                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                        apiResult3 = apiResult2;
                                                        c10171.f51113OooO = null;
                                                        c10171.f51114OooO0oO = null;
                                                        c10171.f51115OooO0oo = 11;
                                                    }
                                                    break;
                                                } else {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 6;
                                                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                                        this.f51113OooO = flowCollector;
                                                        this.f51114OooO0oO = countryCode;
                                                        this.f51115OooO0oo = 7;
                                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                                        if (obj != coroutine_suspended) {
                                                            apiResult = (ApiResult) obj;
                                                            if (apiResult.isSuccess()) {
                                                                flowCollector2 = flowCollector;
                                                            } else {
                                                                this.f51113OooO = flowCollector;
                                                                this.f51114OooO0oO = countryCode;
                                                                this.f51115OooO0oo = 8;
                                                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                                    flowCollector3 = flowCollector;
                                                                    this.f51113OooO = flowCollector3;
                                                                    this.f51114OooO0oO = null;
                                                                    this.f51115OooO0oo = 9;
                                                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                                                    if (obj != coroutine_suspended) {
                                                                        flowCollector4 = flowCollector3;
                                                                        apiResult = (ApiResult) obj;
                                                                        flowCollector2 = flowCollector4;
                                                                    }
                                                                }
                                                            }
                                                            apiResult2 = apiResult;
                                                            c03261 = new C03261(LoginVM.this, null);
                                                            this.f51113OooO = flowCollector2;
                                                            this.f51114OooO0oO = apiResult2;
                                                            this.f51115OooO0oo = 10;
                                                            c10171 = this;
                                                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                                apiResult3 = apiResult2;
                                                                c10171.f51113OooO = null;
                                                                c10171.f51114OooO0oO = null;
                                                                c10171.f51115OooO0oo = 11;
                                                            }
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (!apiResult.isSuccess()) {
                                        if (apiResult.isSuccess()) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 8;
                                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                flowCollector3 = flowCollector;
                                                this.f51113OooO = flowCollector3;
                                                this.f51114OooO0oO = null;
                                                this.f51115OooO0oo = 9;
                                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                                if (obj != coroutine_suspended) {
                                                    flowCollector4 = flowCollector3;
                                                    apiResult = (ApiResult) obj;
                                                    flowCollector2 = flowCollector4;
                                                }
                                            }
                                        } else {
                                            flowCollector2 = flowCollector;
                                        }
                                        apiResult2 = apiResult;
                                        c03261 = new C03261(LoginVM.this, null);
                                        this.f51113OooO = flowCollector2;
                                        this.f51114OooO0oO = apiResult2;
                                        this.f51115OooO0oo = 10;
                                        c10171 = this;
                                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                            apiResult3 = apiResult2;
                                            c10171.f51113OooO = null;
                                            c10171.f51114OooO0oO = null;
                                            c10171.f51115OooO0oo = 11;
                                        }
                                        break;
                                    } else {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 6;
                                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 7;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                apiResult = (ApiResult) obj;
                                                if (apiResult.isSuccess()) {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 8;
                                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                        flowCollector3 = flowCollector;
                                                        this.f51113OooO = flowCollector3;
                                                        this.f51114OooO0oO = null;
                                                        this.f51115OooO0oo = 9;
                                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                                        if (obj != coroutine_suspended) {
                                                            flowCollector4 = flowCollector3;
                                                            apiResult = (ApiResult) obj;
                                                            flowCollector2 = flowCollector4;
                                                        }
                                                    }
                                                } else {
                                                    flowCollector2 = flowCollector;
                                                }
                                                apiResult2 = apiResult;
                                                c03261 = new C03261(LoginVM.this, null);
                                                this.f51113OooO = flowCollector2;
                                                this.f51114OooO0oO = apiResult2;
                                                this.f51115OooO0oo = 10;
                                                c10171 = this;
                                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                    apiResult3 = apiResult2;
                                                    c10171.f51113OooO = null;
                                                    c10171.f51114OooO0oO = null;
                                                    c10171.f51115OooO0oo = 11;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } else if (!apiResult.isSuccess()) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 4;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 5;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (!apiResult.isSuccess()) {
                                        if (apiResult.isSuccess()) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 8;
                                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                flowCollector3 = flowCollector;
                                                this.f51113OooO = flowCollector3;
                                                this.f51114OooO0oO = null;
                                                this.f51115OooO0oo = 9;
                                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                                if (obj != coroutine_suspended) {
                                                    flowCollector4 = flowCollector3;
                                                    apiResult = (ApiResult) obj;
                                                    flowCollector2 = flowCollector4;
                                                }
                                            }
                                        } else {
                                            flowCollector2 = flowCollector;
                                        }
                                        apiResult2 = apiResult;
                                        c03261 = new C03261(LoginVM.this, null);
                                        this.f51113OooO = flowCollector2;
                                        this.f51114OooO0oO = apiResult2;
                                        this.f51115OooO0oo = 10;
                                        c10171 = this;
                                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                            apiResult3 = apiResult2;
                                            c10171.f51113OooO = null;
                                            c10171.f51114OooO0oO = null;
                                            c10171.f51115OooO0oo = 11;
                                        }
                                        break;
                                    } else {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 6;
                                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 7;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                apiResult = (ApiResult) obj;
                                                if (apiResult.isSuccess()) {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 8;
                                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                        flowCollector3 = flowCollector;
                                                        this.f51113OooO = flowCollector3;
                                                        this.f51114OooO0oO = null;
                                                        this.f51115OooO0oo = 9;
                                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                                        if (obj != coroutine_suspended) {
                                                            flowCollector4 = flowCollector3;
                                                            apiResult = (ApiResult) obj;
                                                            flowCollector2 = flowCollector4;
                                                        }
                                                    }
                                                } else {
                                                    flowCollector2 = flowCollector;
                                                }
                                                apiResult2 = apiResult;
                                                c03261 = new C03261(LoginVM.this, null);
                                                this.f51113OooO = flowCollector2;
                                                this.f51114OooO0oO = apiResult2;
                                                this.f51115OooO0oo = 10;
                                                c10171 = this;
                                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                    apiResult3 = apiResult2;
                                                    c10171.f51113OooO = null;
                                                    c10171.f51114OooO0oO = null;
                                                    c10171.f51115OooO0oo = 11;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                                return coroutine_suspended;
                            }
                        } else {
                            if (!apiResult.isSuccess()) {
                                if (apiResult.isSuccess()) {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 8;
                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                        flowCollector3 = flowCollector;
                                        this.f51113OooO = flowCollector3;
                                        this.f51114OooO0oO = null;
                                        this.f51115OooO0oo = 9;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            flowCollector4 = flowCollector3;
                                            apiResult = (ApiResult) obj;
                                            flowCollector2 = flowCollector4;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                flowCollector2 = flowCollector;
                                apiResult2 = apiResult;
                                c03261 = new C03261(LoginVM.this, null);
                                this.f51113OooO = flowCollector2;
                                this.f51114OooO0oO = apiResult2;
                                this.f51115OooO0oo = 10;
                                c10171 = this;
                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                    apiResult3 = apiResult2;
                                    c10171.f51113OooO = null;
                                    c10171.f51114OooO0oO = null;
                                    c10171.f51115OooO0oo = 11;
                                    break;
                                }
                                return coroutine_suspended;
                            }
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 6;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 7;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                }
                                return coroutine_suspended;
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 2;
                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 3;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                apiResult = (ApiResult) obj;
                                if (!apiResult.isSuccess()) {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 4;
                                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 5;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            apiResult = (ApiResult) obj;
                                            if (!apiResult.isSuccess()) {
                                                if (apiResult.isSuccess()) {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 8;
                                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                        flowCollector3 = flowCollector;
                                                        this.f51113OooO = flowCollector3;
                                                        this.f51114OooO0oO = null;
                                                        this.f51115OooO0oo = 9;
                                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                                        if (obj != coroutine_suspended) {
                                                            flowCollector4 = flowCollector3;
                                                            apiResult = (ApiResult) obj;
                                                            flowCollector2 = flowCollector4;
                                                        }
                                                    }
                                                } else {
                                                    flowCollector2 = flowCollector;
                                                }
                                                apiResult2 = apiResult;
                                                c03261 = new C03261(LoginVM.this, null);
                                                this.f51113OooO = flowCollector2;
                                                this.f51114OooO0oO = apiResult2;
                                                this.f51115OooO0oo = 10;
                                                c10171 = this;
                                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                    apiResult3 = apiResult2;
                                                    c10171.f51113OooO = null;
                                                    c10171.f51114OooO0oO = null;
                                                    c10171.f51115OooO0oo = 11;
                                                }
                                                break;
                                            } else {
                                                this.f51113OooO = flowCollector;
                                                this.f51114OooO0oO = countryCode;
                                                this.f51115OooO0oo = 6;
                                                if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 7;
                                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                                    if (obj != coroutine_suspended) {
                                                        apiResult = (ApiResult) obj;
                                                        if (apiResult.isSuccess()) {
                                                            this.f51113OooO = flowCollector;
                                                            this.f51114OooO0oO = countryCode;
                                                            this.f51115OooO0oo = 8;
                                                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                                flowCollector3 = flowCollector;
                                                                this.f51113OooO = flowCollector3;
                                                                this.f51114OooO0oO = null;
                                                                this.f51115OooO0oo = 9;
                                                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                                                if (obj != coroutine_suspended) {
                                                                    flowCollector4 = flowCollector3;
                                                                    apiResult = (ApiResult) obj;
                                                                    flowCollector2 = flowCollector4;
                                                                }
                                                            }
                                                        } else {
                                                            flowCollector2 = flowCollector;
                                                        }
                                                        apiResult2 = apiResult;
                                                        c03261 = new C03261(LoginVM.this, null);
                                                        this.f51113OooO = flowCollector2;
                                                        this.f51114OooO0oO = apiResult2;
                                                        this.f51115OooO0oo = 10;
                                                        c10171 = this;
                                                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                            apiResult3 = apiResult2;
                                                            c10171.f51113OooO = null;
                                                            c10171.f51114OooO0oO = null;
                                                            c10171.f51115OooO0oo = 11;
                                                        }
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (!apiResult.isSuccess()) {
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                } else {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 6;
                                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 7;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            apiResult = (ApiResult) obj;
                                            if (apiResult.isSuccess()) {
                                                this.f51113OooO = flowCollector;
                                                this.f51114OooO0oO = countryCode;
                                                this.f51115OooO0oo = 8;
                                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                    flowCollector3 = flowCollector;
                                                    this.f51113OooO = flowCollector3;
                                                    this.f51114OooO0oO = null;
                                                    this.f51115OooO0oo = 9;
                                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                                    if (obj != coroutine_suspended) {
                                                        flowCollector4 = flowCollector3;
                                                        apiResult = (ApiResult) obj;
                                                        flowCollector2 = flowCollector4;
                                                    }
                                                }
                                            } else {
                                                flowCollector2 = flowCollector;
                                            }
                                            apiResult2 = apiResult;
                                            c03261 = new C03261(LoginVM.this, null);
                                            this.f51113OooO = flowCollector2;
                                            this.f51114OooO0oO = apiResult2;
                                            this.f51115OooO0oo = 10;
                                            c10171 = this;
                                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                apiResult3 = apiResult2;
                                                c10171.f51113OooO = null;
                                                c10171.f51114OooO0oO = null;
                                                c10171.f51115OooO0oo = 11;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else if (!apiResult.isSuccess()) {
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 4;
                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 5;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                apiResult = (ApiResult) obj;
                                if (!apiResult.isSuccess()) {
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                } else {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 6;
                                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 7;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            apiResult = (ApiResult) obj;
                                            if (apiResult.isSuccess()) {
                                                this.f51113OooO = flowCollector;
                                                this.f51114OooO0oO = countryCode;
                                                this.f51115OooO0oo = 8;
                                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                    flowCollector3 = flowCollector;
                                                    this.f51113OooO = flowCollector3;
                                                    this.f51114OooO0oO = null;
                                                    this.f51115OooO0oo = 9;
                                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                                    if (obj != coroutine_suspended) {
                                                        flowCollector4 = flowCollector3;
                                                        apiResult = (ApiResult) obj;
                                                        flowCollector2 = flowCollector4;
                                                    }
                                                }
                                            } else {
                                                flowCollector2 = flowCollector;
                                            }
                                            apiResult2 = apiResult;
                                            c03261 = new C03261(LoginVM.this, null);
                                            this.f51113OooO = flowCollector2;
                                            this.f51114OooO0oO = apiResult2;
                                            this.f51115OooO0oo = 10;
                                            c10171 = this;
                                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                apiResult3 = apiResult2;
                                                c10171.f51113OooO = null;
                                                c10171.f51114OooO0oO = null;
                                                c10171.f51115OooO0oo = 11;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        if (!apiResult.isSuccess()) {
                            if (apiResult.isSuccess()) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 8;
                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    this.f51113OooO = flowCollector3;
                                    this.f51114OooO0oO = null;
                                    this.f51115OooO0oo = 9;
                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                    if (obj != coroutine_suspended) {
                                        flowCollector4 = flowCollector3;
                                        apiResult = (ApiResult) obj;
                                        flowCollector2 = flowCollector4;
                                    }
                                }
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                            apiResult2 = apiResult;
                            c03261 = new C03261(LoginVM.this, null);
                            this.f51113OooO = flowCollector2;
                            this.f51114OooO0oO = apiResult2;
                            this.f51115OooO0oo = 10;
                            c10171 = this;
                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                c10171.f51113OooO = null;
                                c10171.f51114OooO0oO = null;
                                c10171.f51115OooO0oo = 11;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 6;
                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 7;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                apiResult = (ApiResult) obj;
                                if (apiResult.isSuccess()) {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 8;
                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                        flowCollector3 = flowCollector;
                                        this.f51113OooO = flowCollector3;
                                        this.f51114OooO0oO = null;
                                        this.f51115OooO0oo = 9;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            flowCollector4 = flowCollector3;
                                            apiResult = (ApiResult) obj;
                                            flowCollector2 = flowCollector4;
                                        }
                                    }
                                } else {
                                    flowCollector2 = flowCollector;
                                }
                                apiResult2 = apiResult;
                                c03261 = new C03261(LoginVM.this, null);
                                this.f51113OooO = flowCollector2;
                                this.f51114OooO0oO = apiResult2;
                                this.f51115OooO0oo = 10;
                                c10171 = this;
                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                    apiResult3 = apiResult2;
                                    c10171.f51113OooO = null;
                                    c10171.f51114OooO0oO = null;
                                    c10171.f51115OooO0oo = 11;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    this.f51113OooO = flowCollector;
                    this.f51114OooO0oO = countryCode;
                    this.f51115OooO0oo = 3;
                    obj = o00ooo2.OooOOO(1, countryCode, this);
                    if (obj != coroutine_suspended) {
                        apiResult = (ApiResult) obj;
                        if (!apiResult.isSuccess()) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 4;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 5;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (!apiResult.isSuccess()) {
                                        if (apiResult.isSuccess()) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 8;
                                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                flowCollector3 = flowCollector;
                                                this.f51113OooO = flowCollector3;
                                                this.f51114OooO0oO = null;
                                                this.f51115OooO0oo = 9;
                                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                                if (obj != coroutine_suspended) {
                                                    flowCollector4 = flowCollector3;
                                                    apiResult = (ApiResult) obj;
                                                    flowCollector2 = flowCollector4;
                                                }
                                            }
                                        } else {
                                            flowCollector2 = flowCollector;
                                        }
                                        apiResult2 = apiResult;
                                        c03261 = new C03261(LoginVM.this, null);
                                        this.f51113OooO = flowCollector2;
                                        this.f51114OooO0oO = apiResult2;
                                        this.f51115OooO0oo = 10;
                                        c10171 = this;
                                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                            apiResult3 = apiResult2;
                                            c10171.f51113OooO = null;
                                            c10171.f51114OooO0oO = null;
                                            c10171.f51115OooO0oo = 11;
                                        }
                                        break;
                                    } else {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 6;
                                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                            this.f51113OooO = flowCollector;
                                            this.f51114OooO0oO = countryCode;
                                            this.f51115OooO0oo = 7;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                apiResult = (ApiResult) obj;
                                                if (apiResult.isSuccess()) {
                                                    this.f51113OooO = flowCollector;
                                                    this.f51114OooO0oO = countryCode;
                                                    this.f51115OooO0oo = 8;
                                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                        flowCollector3 = flowCollector;
                                                        this.f51113OooO = flowCollector3;
                                                        this.f51114OooO0oO = null;
                                                        this.f51115OooO0oo = 9;
                                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                                        if (obj != coroutine_suspended) {
                                                            flowCollector4 = flowCollector3;
                                                            apiResult = (ApiResult) obj;
                                                            flowCollector2 = flowCollector4;
                                                        }
                                                    }
                                                } else {
                                                    flowCollector2 = flowCollector;
                                                }
                                                apiResult2 = apiResult;
                                                c03261 = new C03261(LoginVM.this, null);
                                                this.f51113OooO = flowCollector2;
                                                this.f51114OooO0oO = apiResult2;
                                                this.f51115OooO0oo = 10;
                                                c10171 = this;
                                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                    apiResult3 = apiResult2;
                                                    c10171.f51113OooO = null;
                                                    c10171.f51114OooO0oO = null;
                                                    c10171.f51115OooO0oo = 11;
                                                }
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (!apiResult.isSuccess()) {
                            if (apiResult.isSuccess()) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 8;
                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    this.f51113OooO = flowCollector3;
                                    this.f51114OooO0oO = null;
                                    this.f51115OooO0oo = 9;
                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                    if (obj != coroutine_suspended) {
                                        flowCollector4 = flowCollector3;
                                        apiResult = (ApiResult) obj;
                                        flowCollector2 = flowCollector4;
                                    }
                                }
                            } else {
                                flowCollector2 = flowCollector;
                            }
                            apiResult2 = apiResult;
                            c03261 = new C03261(LoginVM.this, null);
                            this.f51113OooO = flowCollector2;
                            this.f51114OooO0oO = apiResult2;
                            this.f51115OooO0oo = 10;
                            c10171 = this;
                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                c10171.f51113OooO = null;
                                c10171.f51114OooO0oO = null;
                                c10171.f51115OooO0oo = 11;
                            }
                            break;
                        } else {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 6;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 7;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 4;
                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 5;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                apiResult = (ApiResult) obj;
                                if (!apiResult.isSuccess()) {
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                } else {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 6;
                                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 7;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            apiResult = (ApiResult) obj;
                                            if (apiResult.isSuccess()) {
                                                this.f51113OooO = flowCollector;
                                                this.f51114OooO0oO = countryCode;
                                                this.f51115OooO0oo = 8;
                                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                                    flowCollector3 = flowCollector;
                                                    this.f51113OooO = flowCollector3;
                                                    this.f51114OooO0oO = null;
                                                    this.f51115OooO0oo = 9;
                                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                                    if (obj != coroutine_suspended) {
                                                        flowCollector4 = flowCollector3;
                                                        apiResult = (ApiResult) obj;
                                                        flowCollector2 = flowCollector4;
                                                    }
                                                }
                                            } else {
                                                flowCollector2 = flowCollector;
                                            }
                                            apiResult2 = apiResult;
                                            c03261 = new C03261(LoginVM.this, null);
                                            this.f51113OooO = flowCollector2;
                                            this.f51114OooO0oO = apiResult2;
                                            this.f51115OooO0oo = 10;
                                            c10171 = this;
                                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                                apiResult3 = apiResult2;
                                                c10171.f51113OooO = null;
                                                c10171.f51114OooO0oO = null;
                                                c10171.f51115OooO0oo = 11;
                                            }
                                            break;
                                        }
                                    }
                                }
                            }
                            return coroutine_suspended;
                        }
                    } else {
                        if (!apiResult.isSuccess()) {
                            if (apiResult.isSuccess()) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 8;
                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    this.f51113OooO = flowCollector3;
                                    this.f51114OooO0oO = null;
                                    this.f51115OooO0oo = 9;
                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                    if (obj != coroutine_suspended) {
                                        flowCollector4 = flowCollector3;
                                        apiResult = (ApiResult) obj;
                                        flowCollector2 = flowCollector4;
                                    }
                                }
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                            apiResult2 = apiResult;
                            c03261 = new C03261(LoginVM.this, null);
                            this.f51113OooO = flowCollector2;
                            this.f51114OooO0oO = apiResult2;
                            this.f51115OooO0oo = 10;
                            c10171 = this;
                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                c10171.f51113OooO = null;
                                c10171.f51114OooO0oO = null;
                                c10171.f51115OooO0oo = 11;
                                break;
                            }
                            return coroutine_suspended;
                        }
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 6;
                        if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 7;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                apiResult = (ApiResult) obj;
                                if (apiResult.isSuccess()) {
                                    this.f51113OooO = flowCollector;
                                    this.f51114OooO0oO = countryCode;
                                    this.f51115OooO0oo = 8;
                                    if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                        flowCollector3 = flowCollector;
                                        this.f51113OooO = flowCollector3;
                                        this.f51114OooO0oO = null;
                                        this.f51115OooO0oo = 9;
                                        obj = o00ooo2.OooOOO(1, countryCode, this);
                                        if (obj != coroutine_suspended) {
                                            flowCollector4 = flowCollector3;
                                            apiResult = (ApiResult) obj;
                                            flowCollector2 = flowCollector4;
                                        }
                                    }
                                } else {
                                    flowCollector2 = flowCollector;
                                }
                                apiResult2 = apiResult;
                                c03261 = new C03261(LoginVM.this, null);
                                this.f51113OooO = flowCollector2;
                                this.f51114OooO0oO = apiResult2;
                                this.f51115OooO0oo = 10;
                                c10171 = this;
                                if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                    apiResult3 = apiResult2;
                                    c10171.f51113OooO = null;
                                    c10171.f51114OooO0oO = null;
                                    c10171.f51115OooO0oo = 11;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    this.f51113OooO = flowCollector;
                    this.f51114OooO0oO = countryCode;
                    this.f51115OooO0oo = 5;
                    obj = o00ooo2.OooOOO(1, countryCode, this);
                    if (obj != coroutine_suspended) {
                        apiResult = (ApiResult) obj;
                        if (!apiResult.isSuccess()) {
                            if (apiResult.isSuccess()) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 8;
                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    this.f51113OooO = flowCollector3;
                                    this.f51114OooO0oO = null;
                                    this.f51115OooO0oo = 9;
                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                    if (obj != coroutine_suspended) {
                                        flowCollector4 = flowCollector3;
                                        apiResult = (ApiResult) obj;
                                        flowCollector2 = flowCollector4;
                                    }
                                }
                            } else {
                                flowCollector2 = flowCollector;
                            }
                            apiResult2 = apiResult;
                            c03261 = new C03261(LoginVM.this, null);
                            this.f51113OooO = flowCollector2;
                            this.f51114OooO0oO = apiResult2;
                            this.f51115OooO0oo = 10;
                            c10171 = this;
                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                c10171.f51113OooO = null;
                                c10171.f51114OooO0oO = null;
                                c10171.f51115OooO0oo = 11;
                            }
                            break;
                        } else {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 6;
                            if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 7;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    apiResult = (ApiResult) obj;
                                    if (apiResult.isSuccess()) {
                                        this.f51113OooO = flowCollector;
                                        this.f51114OooO0oO = countryCode;
                                        this.f51115OooO0oo = 8;
                                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                            flowCollector3 = flowCollector;
                                            this.f51113OooO = flowCollector3;
                                            this.f51114OooO0oO = null;
                                            this.f51115OooO0oo = 9;
                                            obj = o00ooo2.OooOOO(1, countryCode, this);
                                            if (obj != coroutine_suspended) {
                                                flowCollector4 = flowCollector3;
                                                apiResult = (ApiResult) obj;
                                                flowCollector2 = flowCollector4;
                                            }
                                        }
                                    } else {
                                        flowCollector2 = flowCollector;
                                    }
                                    apiResult2 = apiResult;
                                    c03261 = new C03261(LoginVM.this, null);
                                    this.f51113OooO = flowCollector2;
                                    this.f51114OooO0oO = apiResult2;
                                    this.f51115OooO0oo = 10;
                                    c10171 = this;
                                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                        apiResult3 = apiResult2;
                                        c10171.f51113OooO = null;
                                        c10171.f51114OooO0oO = null;
                                        c10171.f51115OooO0oo = 11;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 5:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (!apiResult.isSuccess()) {
                        if (apiResult.isSuccess()) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 8;
                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                flowCollector3 = flowCollector;
                                this.f51113OooO = flowCollector3;
                                this.f51114OooO0oO = null;
                                this.f51115OooO0oo = 9;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    flowCollector4 = flowCollector3;
                                    apiResult = (ApiResult) obj;
                                    flowCollector2 = flowCollector4;
                                }
                            }
                            return coroutine_suspended;
                        }
                        flowCollector2 = flowCollector;
                        apiResult2 = apiResult;
                        c03261 = new C03261(LoginVM.this, null);
                        this.f51113OooO = flowCollector2;
                        this.f51114OooO0oO = apiResult2;
                        this.f51115OooO0oo = 10;
                        c10171 = this;
                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                            apiResult3 = apiResult2;
                            c10171.f51113OooO = null;
                            c10171.f51114OooO0oO = null;
                            c10171.f51115OooO0oo = 11;
                            break;
                        }
                        return coroutine_suspended;
                    }
                    this.f51113OooO = flowCollector;
                    this.f51114OooO0oO = countryCode;
                    this.f51115OooO0oo = 6;
                    if (DelayKt.delay(8000L, this) != coroutine_suspended) {
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 7;
                        obj = o00ooo2.OooOOO(1, countryCode, this);
                        if (obj != coroutine_suspended) {
                            apiResult = (ApiResult) obj;
                            if (apiResult.isSuccess()) {
                                this.f51113OooO = flowCollector;
                                this.f51114OooO0oO = countryCode;
                                this.f51115OooO0oo = 8;
                                if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                    flowCollector3 = flowCollector;
                                    this.f51113OooO = flowCollector3;
                                    this.f51114OooO0oO = null;
                                    this.f51115OooO0oo = 9;
                                    obj = o00ooo2.OooOOO(1, countryCode, this);
                                    if (obj != coroutine_suspended) {
                                        flowCollector4 = flowCollector3;
                                        apiResult = (ApiResult) obj;
                                        flowCollector2 = flowCollector4;
                                    }
                                }
                            } else {
                                flowCollector2 = flowCollector;
                            }
                            apiResult2 = apiResult;
                            c03261 = new C03261(LoginVM.this, null);
                            this.f51113OooO = flowCollector2;
                            this.f51114OooO0oO = apiResult2;
                            this.f51115OooO0oo = 10;
                            c10171 = this;
                            if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                                apiResult3 = apiResult2;
                                c10171.f51113OooO = null;
                                c10171.f51114OooO0oO = null;
                                c10171.f51115OooO0oo = 11;
                            }
                            break;
                        }
                        return coroutine_suspended;
                    }
                    return coroutine_suspended;
                case 6:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    this.f51113OooO = flowCollector;
                    this.f51114OooO0oO = countryCode;
                    this.f51115OooO0oo = 7;
                    obj = o00ooo2.OooOOO(1, countryCode, this);
                    if (obj != coroutine_suspended) {
                        apiResult = (ApiResult) obj;
                        if (apiResult.isSuccess()) {
                            this.f51113OooO = flowCollector;
                            this.f51114OooO0oO = countryCode;
                            this.f51115OooO0oo = 8;
                            if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                                flowCollector3 = flowCollector;
                                this.f51113OooO = flowCollector3;
                                this.f51114OooO0oO = null;
                                this.f51115OooO0oo = 9;
                                obj = o00ooo2.OooOOO(1, countryCode, this);
                                if (obj != coroutine_suspended) {
                                    flowCollector4 = flowCollector3;
                                    apiResult = (ApiResult) obj;
                                    flowCollector2 = flowCollector4;
                                }
                            }
                        } else {
                            flowCollector2 = flowCollector;
                        }
                        apiResult2 = apiResult;
                        c03261 = new C03261(LoginVM.this, null);
                        this.f51113OooO = flowCollector2;
                        this.f51114OooO0oO = apiResult2;
                        this.f51115OooO0oo = 10;
                        c10171 = this;
                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                            apiResult3 = apiResult2;
                            c10171.f51113OooO = null;
                            c10171.f51114OooO0oO = null;
                            c10171.f51115OooO0oo = 11;
                        }
                        break;
                    }
                    return coroutine_suspended;
                case 7:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    if (apiResult.isSuccess()) {
                        this.f51113OooO = flowCollector;
                        this.f51114OooO0oO = countryCode;
                        this.f51115OooO0oo = 8;
                        if (DelayKt.delay(8000L, this) == coroutine_suspended) {
                            flowCollector3 = flowCollector;
                            this.f51113OooO = flowCollector3;
                            this.f51114OooO0oO = null;
                            this.f51115OooO0oo = 9;
                            obj = o00ooo2.OooOOO(1, countryCode, this);
                            if (obj != coroutine_suspended) {
                                flowCollector4 = flowCollector3;
                                apiResult = (ApiResult) obj;
                                flowCollector2 = flowCollector4;
                            }
                        }
                        return coroutine_suspended;
                    }
                    flowCollector2 = flowCollector;
                    apiResult2 = apiResult;
                    c03261 = new C03261(LoginVM.this, null);
                    this.f51113OooO = flowCollector2;
                    this.f51114OooO0oO = apiResult2;
                    this.f51115OooO0oo = 10;
                    c10171 = this;
                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                        apiResult3 = apiResult2;
                        c10171.f51113OooO = null;
                        c10171.f51114OooO0oO = null;
                        c10171.f51115OooO0oo = 11;
                        break;
                    }
                    return coroutine_suspended;
                case 8:
                    countryCode = (String) this.f51114OooO0oO;
                    flowCollector3 = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    this.f51113OooO = flowCollector3;
                    this.f51114OooO0oO = null;
                    this.f51115OooO0oo = 9;
                    obj = o00ooo2.OooOOO(1, countryCode, this);
                    if (obj != coroutine_suspended) {
                        flowCollector4 = flowCollector3;
                        apiResult = (ApiResult) obj;
                        flowCollector2 = flowCollector4;
                        apiResult2 = apiResult;
                        c03261 = new C03261(LoginVM.this, null);
                        this.f51113OooO = flowCollector2;
                        this.f51114OooO0oO = apiResult2;
                        this.f51115OooO0oo = 10;
                        c10171 = this;
                        if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                            apiResult3 = apiResult2;
                            c10171.f51113OooO = null;
                            c10171.f51114OooO0oO = null;
                            c10171.f51115OooO0oo = 11;
                        }
                        break;
                    }
                    return coroutine_suspended;
                case 9:
                    flowCollector4 = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    flowCollector2 = flowCollector4;
                    apiResult2 = apiResult;
                    c03261 = new C03261(LoginVM.this, null);
                    this.f51113OooO = flowCollector2;
                    this.f51114OooO0oO = apiResult2;
                    this.f51115OooO0oo = 10;
                    c10171 = this;
                    if (ApiObserverKt.OooO0OO(apiResult2, null, null, c03261, c10171, 6) != coroutine_suspended) {
                        apiResult3 = apiResult2;
                        c10171.f51113OooO = null;
                        c10171.f51114OooO0oO = null;
                        c10171.f51115OooO0oo = 11;
                        break;
                    }
                    return coroutine_suspended;
                case 10:
                    apiResult3 = (ApiResult) this.f51114OooO0oO;
                    flowCollector2 = (FlowCollector) this.f51113OooO;
                    ResultKt.throwOnFailure(obj);
                    c10171 = this;
                    c10171.f51113OooO = null;
                    c10171.f51114OooO0oO = null;
                    c10171.f51115OooO0oo = 11;
                    break;
                case 11:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserStay30s$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$newInstallUserStay30s$1", f = "LoginVM.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    public static final class C10181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51119OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ long f51120OooO0oo;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$newInstallUserStay30s$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$newInstallUserStay30s$1$1", f = "LoginVM.kt", i = {}, l = {244}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03271 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public int f51121OooO0oO;

            public C03271() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03271(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03271) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f51121OooO0oO;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f51121OooO0oO = 1;
                    if (DelayKt.delay(30000L, this) == coroutine_suspended) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10181(long j, Continuation<? super C10181> continuation) {
            super(2, continuation);
            this.f51120OooO0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10181(this.f51120OooO0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51119OooO0oO;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C03271 c03271 = new C03271(2, null);
                this.f51119OooO0oO = 1;
                if (o0Oo0oo.OooO0Oo(c03271, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Account account = Account.f74684OooO00o;
            if (Account.OooOoOO()) {
                return Unit.INSTANCE;
            }
            com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0Oo("301026", MapsKt.mapOf(TuplesKt.to(DeviceRequestsHelper.DEVICE_INFO_DEVICE, OooOo00.OooO0O0()), TuplesKt.to("userId", Boxing.boxLong(this.f51120OooO0oo))));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$onLoginSuccess$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$onLoginSuccess$3", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ MyUserInfoModel f51122OooO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f51124OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ LoginToken f51125OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f51126OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(boolean z, MyUserInfoModel myUserInfoModel, LoginToken loginToken, OpenAuthManager.AuthType authType, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.f51124OooO0oo = z;
            this.f51122OooO = myUserInfoModel;
            this.f51125OooOO0 = loginToken;
            this.f51126OooOO0O = authType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoginVM.this.new AnonymousClass3(this.f51124OooO0oo, this.f51122OooO, this.f51125OooOO0, this.f51126OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            LoginVM.this.insertWelcomeMessage(this.f51124OooO0oo);
            LoginVM.this.saveUserData(this.f51122OooO, this.f51125OooOO0, this.f51126OooOO0O, this.f51124OooO0oo, false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$saveUserData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$saveUserData$1", f = "LoginVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C10191 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public C10191() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C10191(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C10191) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IMomentModuleService iMomentModuleService = OooOO0O.f93026OooO0o;
            if (iMomentModuleService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moment");
                iMomentModuleService = null;
            }
            iMomentModuleService.OooO0OO();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$thirdLogin$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Lcom/yalla/yalla/api/result/ApiResult;", "Lcom/yalla/yalla/model/LoginListModel;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM$thirdLogin$1", f = "LoginVM.kt", i = {0, 1, 2, 3, 4, 5, 5}, l = {87, 92, 93, 94, 96, 107, 127}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", "$this$liveDataAsync", ReportItem.QualityKeyResult}, s = {"L$0", "L$0", "L$0", "L$0", "L$0", "L$0", "L$1"})
    public static final class C10201 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<LoginListModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public /* synthetic */ Object f51127OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ApiResult f51128OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f51129OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ OpenAuthManager.AuthType f51130OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ String f51131OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final /* synthetic */ String f51132OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final /* synthetic */ LoginVM f51133OooOOO0;

        /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$thirdLogin$1$OooO00o */
        public /* synthetic */ class OooO00o {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[OpenAuthManager.AuthType.values().length];
                try {
                    iArr[OpenAuthManager.AuthType.Twitter.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.Facebook.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.WeChat.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.YallaChat.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[OpenAuthManager.AuthType.Google.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10201(OpenAuthManager.AuthType authType, String str, String str2, LoginVM loginVM, Continuation<? super C10201> continuation) {
            super(2, continuation);
            this.f51130OooOO0 = authType;
            this.f51131OooOO0O = str;
            this.f51132OooOO0o = str2;
            this.f51133OooOOO0 = loginVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C10201 c10201 = new C10201(this.f51130OooOO0, this.f51131OooOO0O, this.f51132OooOO0o, this.f51133OooOOO0, continuation);
            c10201.f51127OooO = obj;
            return c10201;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<LoginListModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C10201) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00db  */
        /* JADX WARN: Code duplicated, block: B:48:0x00e3  */
        /* JADX WARN: Code duplicated, block: B:49:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:52:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:57:0x00fd  */
        /* JADX WARN: Code duplicated, block: B:58:0x0102  */
        /* JADX WARN: Code duplicated, block: B:60:0x0105  */
        /* JADX WARN: Code duplicated, block: B:63:0x016e  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        
            if (r9 == r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
        
            if (r9 == r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
        
            if (r9 == r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b8, code lost:
        
            if (r9 == r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
        
            if (r9 == r6) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x01dd, code lost:
        
            if (r10.emit(r9, r16) == r6) goto L68;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object objOooOOO0;
            Object objOooOO0;
            Object objOooOOOO;
            Object objYallaChatLoginCovert;
            Object objOooOO0O;
            ApiResult apiResult;
            LiveDataScope liveDataScope2;
            LoginListModel loginListModel;
            List<MyUserInfoModel> data;
            List<MyUserInfoModel> list;
            LoginListModel loginListModel2;
            LoginToken token;
            boolean zIsFirst;
            MyUserInfoModel myUserInfoModel;
            LoginToken token2;
            ApiResult apiResult2;
            LiveDataScope liveDataScope3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f51129OooO0oo;
            LoginVM loginVM = this.f51133OooOOO0;
            OpenAuthManager.AuthType authType = this.f51130OooOO0;
            switch (i) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    int i2 = OooO00o.$EnumSwitchMapping$0[authType.ordinal()];
                    o00Ooo o00ooo2 = o00Ooo.f48615OooO00o;
                    String str = this.f51131OooOO0O;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            this.f51127OooO = liveDataScope;
                            this.f51129OooO0oo = 2;
                            objOooOO0 = o00ooo2.OooOO0(str, this);
                        } else if (i2 == 3) {
                            this.f51127OooO = liveDataScope;
                            this.f51129OooO0oo = 3;
                            objOooOOOO = o00ooo2.OooOOOO(str, this);
                        } else if (i2 == 4) {
                            this.f51127OooO = liveDataScope;
                            this.f51129OooO0oo = 4;
                            objYallaChatLoginCovert = loginVM.yallaChatLoginCovert(str, this);
                        } else {
                            if (i2 != 5) {
                                return Unit.INSTANCE;
                            }
                            this.f51127OooO = liveDataScope;
                            this.f51129OooO0oo = 5;
                            objOooOO0O = o00ooo2.OooOO0O(str, this);
                        }
                        break;
                    } else {
                        String str2 = this.f51132OooOO0o;
                        Intrinsics.checkNotNull(str2);
                        this.f51127OooO = liveDataScope;
                        this.f51129OooO0oo = 1;
                        objOooOOO0 = o00ooo2.OooOOO0(str, str2, this);
                        break;
                    }
                    return coroutine_suspended;
                case 1:
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    objOooOOO0 = obj;
                    apiResult = (ApiResult) objOooOOO0;
                    liveDataScope2 = liveDataScope;
                    if (apiResult.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        list = data;
                        if (list != null && !list.isEmpty()) {
                            loginListModel2 = (LoginListModel) apiResult.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                oOO0OOO<Boolean> ooo0ooo = oOO0OO.OooO0OO().f93873OooOOO;
                                Object data2 = apiResult.getData();
                                Intrinsics.checkNotNull(data2);
                                List<MyUserInfoModel> data3 = ((LoginListModel) data2).getData();
                                Intrinsics.checkNotNull(data3);
                                ooo0ooo.OooO0OO(Boxing.boxBoolean(data3.get(0).getIsGameFirst()));
                                Object data4 = apiResult.getData();
                                Intrinsics.checkNotNull(data4);
                                zIsFirst = ((LoginListModel) data4).getIsFirst();
                                Object data5 = apiResult.getData();
                                Intrinsics.checkNotNull(data5);
                                List<MyUserInfoModel> data6 = ((LoginListModel) data5).getData();
                                Intrinsics.checkNotNull(data6);
                                myUserInfoModel = data6.get(0);
                                Object data7 = apiResult.getData();
                                Intrinsics.checkNotNull(data7);
                                token2 = ((LoginListModel) data7).getToken();
                                Intrinsics.checkNotNull(token2);
                                this.f51127OooO = liveDataScope2;
                                this.f51128OooO0oO = apiResult;
                                this.f51129OooO0oo = 6;
                                if (loginVM.onLoginSuccess(zIsFirst, myUserInfoModel, token2, this.f51130OooOO0, this) != coroutine_suspended) {
                                    apiResult2 = apiResult;
                                    liveDataScope3 = liveDataScope2;
                                    apiResult = apiResult2;
                                    liveDataScope2 = liveDataScope3;
                                    this.f51127OooO = null;
                                    this.f51128OooO0oO = null;
                                    this.f51129OooO0oo = 7;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    com.yalla.yalla.statistical.dev.OooO00o oooO00o = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
                    String str3 = "thirdLogin error,type is" + authType + ",error msg =" + apiResult.getMessage() + ",error code= " + apiResult.getCode();
                    oooO00o.getClass();
                    com.yalla.yalla.statistical.dev.OooO00o.OooOOO(6, str3);
                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType.getValue())), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(0)), TuplesKt.to("pagename", "visit_login")));
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 2:
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    objOooOO0 = obj;
                    apiResult = (ApiResult) objOooOO0;
                    liveDataScope2 = liveDataScope;
                    if (apiResult.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        list = data;
                        if (list != null) {
                            loginListModel2 = (LoginListModel) apiResult.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                oOO0OOO<Boolean> ooo0ooo2 = oOO0OO.OooO0OO().f93873OooOOO;
                                Object data8 = apiResult.getData();
                                Intrinsics.checkNotNull(data8);
                                List<MyUserInfoModel> data9 = ((LoginListModel) data8).getData();
                                Intrinsics.checkNotNull(data9);
                                ooo0ooo2.OooO0OO(Boxing.boxBoolean(data9.get(0).getIsGameFirst()));
                                Object data10 = apiResult.getData();
                                Intrinsics.checkNotNull(data10);
                                zIsFirst = ((LoginListModel) data10).getIsFirst();
                                Object data11 = apiResult.getData();
                                Intrinsics.checkNotNull(data11);
                                List<MyUserInfoModel> data12 = ((LoginListModel) data11).getData();
                                Intrinsics.checkNotNull(data12);
                                myUserInfoModel = data12.get(0);
                                Object data13 = apiResult.getData();
                                Intrinsics.checkNotNull(data13);
                                token2 = ((LoginListModel) data13).getToken();
                                Intrinsics.checkNotNull(token2);
                                this.f51127OooO = liveDataScope2;
                                this.f51128OooO0oO = apiResult;
                                this.f51129OooO0oo = 6;
                                if (loginVM.onLoginSuccess(zIsFirst, myUserInfoModel, token2, this.f51130OooOO0, this) != coroutine_suspended) {
                                    apiResult2 = apiResult;
                                    liveDataScope3 = liveDataScope2;
                                    apiResult = apiResult2;
                                    liveDataScope2 = liveDataScope3;
                                    this.f51127OooO = null;
                                    this.f51128OooO0oO = null;
                                    this.f51129OooO0oo = 7;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    com.yalla.yalla.statistical.dev.OooO00o oooO00o2 = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
                    String str4 = "thirdLogin error,type is" + authType + ",error msg =" + apiResult.getMessage() + ",error code= " + apiResult.getCode();
                    oooO00o2.getClass();
                    com.yalla.yalla.statistical.dev.OooO00o.OooOOO(6, str4);
                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType.getValue())), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(0)), TuplesKt.to("pagename", "visit_login")));
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 3:
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    objOooOOOO = obj;
                    apiResult = (ApiResult) objOooOOOO;
                    liveDataScope2 = liveDataScope;
                    if (apiResult.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        list = data;
                        if (list != null) {
                            loginListModel2 = (LoginListModel) apiResult.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                oOO0OOO<Boolean> ooo0ooo3 = oOO0OO.OooO0OO().f93873OooOOO;
                                Object data14 = apiResult.getData();
                                Intrinsics.checkNotNull(data14);
                                List<MyUserInfoModel> data15 = ((LoginListModel) data14).getData();
                                Intrinsics.checkNotNull(data15);
                                ooo0ooo3.OooO0OO(Boxing.boxBoolean(data15.get(0).getIsGameFirst()));
                                Object data16 = apiResult.getData();
                                Intrinsics.checkNotNull(data16);
                                zIsFirst = ((LoginListModel) data16).getIsFirst();
                                Object data17 = apiResult.getData();
                                Intrinsics.checkNotNull(data17);
                                List<MyUserInfoModel> data18 = ((LoginListModel) data17).getData();
                                Intrinsics.checkNotNull(data18);
                                myUserInfoModel = data18.get(0);
                                Object data19 = apiResult.getData();
                                Intrinsics.checkNotNull(data19);
                                token2 = ((LoginListModel) data19).getToken();
                                Intrinsics.checkNotNull(token2);
                                this.f51127OooO = liveDataScope2;
                                this.f51128OooO0oO = apiResult;
                                this.f51129OooO0oo = 6;
                                if (loginVM.onLoginSuccess(zIsFirst, myUserInfoModel, token2, this.f51130OooOO0, this) != coroutine_suspended) {
                                    apiResult2 = apiResult;
                                    liveDataScope3 = liveDataScope2;
                                    apiResult = apiResult2;
                                    liveDataScope2 = liveDataScope3;
                                    this.f51127OooO = null;
                                    this.f51128OooO0oO = null;
                                    this.f51129OooO0oo = 7;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    com.yalla.yalla.statistical.dev.OooO00o oooO00o3 = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
                    String str5 = "thirdLogin error,type is" + authType + ",error msg =" + apiResult.getMessage() + ",error code= " + apiResult.getCode();
                    oooO00o3.getClass();
                    com.yalla.yalla.statistical.dev.OooO00o.OooOOO(6, str5);
                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType.getValue())), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(0)), TuplesKt.to("pagename", "visit_login")));
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 4:
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    objYallaChatLoginCovert = obj;
                    apiResult = (ApiResult) objYallaChatLoginCovert;
                    liveDataScope2 = liveDataScope;
                    if (apiResult.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        list = data;
                        if (list != null) {
                            loginListModel2 = (LoginListModel) apiResult.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                oOO0OOO<Boolean> ooo0ooo4 = oOO0OO.OooO0OO().f93873OooOOO;
                                Object data110 = apiResult.getData();
                                Intrinsics.checkNotNull(data110);
                                List<MyUserInfoModel> data111 = ((LoginListModel) data110).getData();
                                Intrinsics.checkNotNull(data111);
                                ooo0ooo4.OooO0OO(Boxing.boxBoolean(data111.get(0).getIsGameFirst()));
                                Object data112 = apiResult.getData();
                                Intrinsics.checkNotNull(data112);
                                zIsFirst = ((LoginListModel) data112).getIsFirst();
                                Object data113 = apiResult.getData();
                                Intrinsics.checkNotNull(data113);
                                List<MyUserInfoModel> data114 = ((LoginListModel) data113).getData();
                                Intrinsics.checkNotNull(data114);
                                myUserInfoModel = data114.get(0);
                                Object data115 = apiResult.getData();
                                Intrinsics.checkNotNull(data115);
                                token2 = ((LoginListModel) data115).getToken();
                                Intrinsics.checkNotNull(token2);
                                this.f51127OooO = liveDataScope2;
                                this.f51128OooO0oO = apiResult;
                                this.f51129OooO0oo = 6;
                                if (loginVM.onLoginSuccess(zIsFirst, myUserInfoModel, token2, this.f51130OooOO0, this) != coroutine_suspended) {
                                    apiResult2 = apiResult;
                                    liveDataScope3 = liveDataScope2;
                                    apiResult = apiResult2;
                                    liveDataScope2 = liveDataScope3;
                                    this.f51127OooO = null;
                                    this.f51128OooO0oO = null;
                                    this.f51129OooO0oo = 7;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    com.yalla.yalla.statistical.dev.OooO00o oooO00o4 = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
                    String str6 = "thirdLogin error,type is" + authType + ",error msg =" + apiResult.getMessage() + ",error code= " + apiResult.getCode();
                    oooO00o4.getClass();
                    com.yalla.yalla.statistical.dev.OooO00o.OooOOO(6, str6);
                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType.getValue())), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(0)), TuplesKt.to("pagename", "visit_login")));
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 5:
                    liveDataScope = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    objOooOO0O = obj;
                    apiResult = (ApiResult) objOooOO0O;
                    liveDataScope2 = liveDataScope;
                    if (apiResult.isSuccess()) {
                        loginListModel = (LoginListModel) apiResult.getData();
                        if (loginListModel != null) {
                            data = loginListModel.getData();
                        } else {
                            data = null;
                        }
                        list = data;
                        if (list != null) {
                            loginListModel2 = (LoginListModel) apiResult.getData();
                            if (loginListModel2 != null) {
                                token = loginListModel2.getToken();
                            } else {
                                token = null;
                            }
                            if (token != null) {
                                oOO0OOO<Boolean> ooo0ooo5 = oOO0OO.OooO0OO().f93873OooOOO;
                                Object data116 = apiResult.getData();
                                Intrinsics.checkNotNull(data116);
                                List<MyUserInfoModel> data117 = ((LoginListModel) data116).getData();
                                Intrinsics.checkNotNull(data117);
                                ooo0ooo5.OooO0OO(Boxing.boxBoolean(data117.get(0).getIsGameFirst()));
                                Object data118 = apiResult.getData();
                                Intrinsics.checkNotNull(data118);
                                zIsFirst = ((LoginListModel) data118).getIsFirst();
                                Object data119 = apiResult.getData();
                                Intrinsics.checkNotNull(data119);
                                List<MyUserInfoModel> data1110 = ((LoginListModel) data119).getData();
                                Intrinsics.checkNotNull(data1110);
                                myUserInfoModel = data1110.get(0);
                                Object data1111 = apiResult.getData();
                                Intrinsics.checkNotNull(data1111);
                                token2 = ((LoginListModel) data1111).getToken();
                                Intrinsics.checkNotNull(token2);
                                this.f51127OooO = liveDataScope2;
                                this.f51128OooO0oO = apiResult;
                                this.f51129OooO0oo = 6;
                                if (loginVM.onLoginSuccess(zIsFirst, myUserInfoModel, token2, this.f51130OooOO0, this) != coroutine_suspended) {
                                    apiResult2 = apiResult;
                                    liveDataScope3 = liveDataScope2;
                                    apiResult = apiResult2;
                                    liveDataScope2 = liveDataScope3;
                                    this.f51127OooO = null;
                                    this.f51128OooO0oO = null;
                                    this.f51129OooO0oo = 7;
                                }
                                break;
                            }
                            return coroutine_suspended;
                        }
                    }
                    com.yalla.yalla.statistical.dev.OooO00o oooO00o5 = com.yalla.yalla.statistical.dev.OooO00o.f75601OooO00o;
                    String str7 = "thirdLogin error,type is" + authType + ",error msg =" + apiResult.getMessage() + ",error code= " + apiResult.getCode();
                    oooO00o5.getClass();
                    com.yalla.yalla.statistical.dev.OooO00o.OooOOO(6, str7);
                    com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType.getValue())), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(0)), TuplesKt.to("pagename", "visit_login")));
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 6:
                    apiResult2 = this.f51128OooO0oO;
                    liveDataScope3 = (LiveDataScope) this.f51127OooO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = apiResult2;
                    liveDataScope2 = liveDataScope3;
                    this.f51127OooO = null;
                    this.f51128OooO0oO = null;
                    this.f51129OooO0oo = 7;
                    break;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.module.account.vm.LoginVM$yallaChatLoginCovert$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.module.account.vm.LoginVM", f = "LoginVM.kt", i = {}, l = {131}, m = "yallaChatLoginCovert", n = {}, s = {})
    public static final class C10211 extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f51134OooO;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public /* synthetic */ Object f51135OooO0oO;

        public C10211(Continuation<? super C10211> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f51135OooO0oO = obj;
            this.f51134OooO |= Integer.MIN_VALUE;
            return LoginVM.this.yallaChatLoginCovert(null, this);
        }
    }

    public LoginVM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT+02"));
        this.dateFormat = simpleDateFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void changeLanguageAndRoom(Integer oldRegion, long oldUserId) {
        Account account = Account.f74684OooO00o;
        boolean zAreEqual = Intrinsics.areEqual(oldRegion, Account.OooOOOO().getValue());
        boolean z = !zAreEqual;
        Long l = (Long) Account.OooOo0o().getValue();
        boolean z2 = l == null || oldUserId != l.longValue();
        RoomStateManager.f49745OooO00o.getClass();
        MutableStateFlow<RoomState> mutableStateFlow = RoomStateManager.f49746OooO0O0;
        boolean z3 = mutableStateFlow.getValue() == RoomState.InRoom;
        boolean z4 = mutableStateFlow.getValue() == RoomState.Hook;
        T value = OooOOOO.f49736OooO0O0.getValue();
        OooOOO.OooO00o oooO00o = OooOOO.OooO00o.f49733OooO00o;
        boolean zAreEqual2 = Intrinsics.areEqual(value, oooO00o);
        boolean z5 = !zAreEqual2;
        boolean z6 = oldUserId > 0;
        StringBuilder sbOooO0OO = o00O0O0O.OooO0OO("changeLanguageAndRoom == isRegionChanged: ", z, z2, ", isUserChanged: ", ", haveLoginVisitor: ");
        sbOooO0OO.append(z6);
        sbOooO0OO.append(", isInGame:");
        sbOooO0OO.append(z5);
        com.yalla.yalla.util.log.OooOO0.OooO0O0(sbOooO0OO.toString());
        IMainModuleService iMainModuleService = null;
        if (z3) {
            if (zAreEqual) {
                closeLoginPages();
                LiveEventBus.get("LOGIN_REENTER_ROOM").post(Boolean.TRUE);
                return;
            }
            String strOooO0OO = o00OO000.OooO0OO(com.yalla.yalla.module.account.OooOOO.reenter_room);
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                androidx.lifecycle.OooO0O0 oooO0O0OooO00o = o00OOO0.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    oooO0O0OooO00o.run();
                } else {
                    o0o0Oo.OooO0OO().post(oooO0O0OooO00o);
                }
            }
            RoomStateManager.OooO0O0();
            IMainModuleService iMainModuleService2 = OooOO0O.f93024OooO0OO;
            if (iMainModuleService2 != null) {
                iMainModuleService = iMainModuleService2;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("main");
            }
            Context context = o0o0Oo.f28327OooO00o;
            Activity activityOooO0OO = com.code.android.util.OooO0O0.OooO0OO();
            Intrinsics.checkNotNull(activityOooO0OO);
            IMainModuleService.OooO00o.OooO0O0(iMainModuleService, activityOooO0OO, 0, 12);
            return;
        }
        if (!zAreEqual2) {
            OooOOOO.f49735OooO00o.setValue(oooO00o);
            LiveEventBus.get("GAME_ROOM_CLOSE").post(Boolean.TRUE);
            IMainModuleService iMainModuleService3 = OooOO0O.f93024OooO0OO;
            if (iMainModuleService3 != null) {
                iMainModuleService = iMainModuleService3;
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("main");
            }
            Context context2 = o0o0Oo.f28327OooO00o;
            Activity activityOooO0OO2 = com.code.android.util.OooO0O0.OooO0OO();
            Intrinsics.checkNotNull(activityOooO0OO2);
            IMainModuleService.OooO00o.OooO0O0(iMainModuleService, activityOooO0OO2, 1, 8);
            return;
        }
        if (z4) {
            String strOooO0OO2 = o00OO000.OooO0OO(com.yalla.yalla.module.account.OooOOO.reenter_room);
            if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                androidx.lifecycle.OooO0O0 oooO0O0OooO00o2 = o00OOO0.OooO00o(strOooO0OO2, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    oooO0O0OooO00o2.run();
                } else {
                    o0o0Oo.OooO0OO().post(oooO0O0OooO00o2);
                }
            }
            RoomStateManager.OooO0O0();
        }
        IMainModuleService iMainModuleService4 = OooOO0O.f93024OooO0OO;
        if (iMainModuleService4 != null) {
            iMainModuleService = iMainModuleService4;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("main");
        }
        Context context3 = o0o0Oo.f28327OooO00o;
        Activity activityOooO0OO3 = com.code.android.util.OooO0O0.OooO0OO();
        Intrinsics.checkNotNull(activityOooO0OO3);
        IMainModuleService.OooO00o.OooO0O0(iMainModuleService, activityOooO0OO3, 0, 12);
    }

    private final void closeLoginPages() {
        LiveEventBus.get("LOGIN_SUCCESS").post(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertWelcomeMessage(boolean isFirst) {
        if (isFirst) {
            YallaTeamMessage message = new YallaTeamMessage();
            Account account = Account.f74684OooO00o;
            message.setUid(((Number) o0000O0O.OooO0OO()).longValue());
            message.setMid(com.yalla.yalla.service.im.OooO0o.f75485OooO00o.OooO00o(null));
            message.setType(6);
            message.setTime(System.currentTimeMillis());
            Intrinsics.checkNotNullParameter(message, "message");
            o00oOoo.OooO00o().OoooO00().OooO0o(message);
            SharedMessageVM sharedMessageVM = SharedMessageVM.INSTANCE;
            UnreadMessageNumberManager.OooO00o(sharedMessageVM.getUnreadYallaTeamManager());
            sharedMessageVM.getUnreadYallaTeamManager().OooO0o0();
        }
    }

    private final void logSuccessEvent(boolean isFirst, OpenAuthManager.AuthType type) {
        switch (type == null ? -1 : OooO00o.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                ApiEvent.OooO0OO(ApiEvent.LoginType.WECHAT, isFirst);
                break;
            case 2:
                ApiEvent.OooO0OO(ApiEvent.LoginType.FACEBOOK, isFirst);
                break;
            case 3:
                ApiEvent.OooO0OO(ApiEvent.LoginType.TWITTER, isFirst);
                break;
            case 4:
                ApiEvent.OooO0OO(ApiEvent.LoginType.YALLACHAT, isFirst);
                break;
            case 5:
                ApiEvent.OooO0OO(ApiEvent.LoginType.GOOGLE, isFirst);
                break;
            case 6:
                ApiEvent.OooO0OO(ApiEvent.LoginType.PHONE, isFirst);
                break;
            case 7:
                ApiEvent.OooO0OO(ApiEvent.LoginType.EMAIL, isFirst);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o00Oo0<ApiResult<String>> newInstallUserIntoPlatform(long userId, String token, int region) {
        return JobFlowKt.OooO0Oo(this, new C10161(userId, token, region, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLoginSuccess$lambda$3() {
        return "登录成功";
    }

    public static /* synthetic */ Object onLoginSuccess$suspendImpl(LoginVM loginVM, boolean z, MyUserInfoModel myUserInfoModel, LoginToken loginToken, OpenAuthManager.AuthType authType, Continuation<? super Unit> continuation) throws Throwable {
        com.yalla.yalla.util.log.OooOO0.OooO0Oo("调试异地登录", 0, new o0O00OO(3), 6);
        com.yalla.yalla.statistical.buriedpoint.OooO00o.OooO0OO("107050", MapsKt.mapOf(TuplesKt.to("sources", Boxing.boxInt(authType != null ? authType.getValue() : 0)), TuplesKt.to(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_STATUS, Boxing.boxInt(1)), TuplesKt.to("pagename", "visit_login")));
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), loginVM.new AnonymousClass3(z, myUserInfoModel, loginToken, authType, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final void saveDataToSp(boolean isFirst, MyUserInfoModel userInfoModel) {
        if (isFirst) {
            if (userInfoModel.getIsNewUser()) {
                p472o0o0000o.OooOO0O.OooOOO().OooOo00(this.dateFormat.format(new Date()));
            }
            oOO0OOO<Boolean> ooo0ooo = oOO0OO.OooO0oO().f93901OooO0O0;
            Boolean bool = Boolean.TRUE;
            ooo0ooo.OooO0OO(bool);
            oOO0OO.OooO0oO().f93902OooO0OO.OooO0OO(bool);
            p472o0o0000o.OooOO0O.OooO0oO().OooOo00(true);
            p472o0o0000o.OooOO0O.OooO0oO().OooOo0(true);
            p472o0o0000o.OooOO0O.OooO0oO().OooOOo0().postValue(bool);
            Account account = Account.f74684OooO00o;
            Account.OooOoO().postValue(bool);
            oOO0OO.OooO0OO().f93877OooOOo.OooO0OO(bool);
            SharedMainMessageManager sharedMainMessageManager = SharedMainMessageManager.INSTANCE;
            MutableLiveData<Boolean> premiumMomentEditRedDot = sharedMainMessageManager.getPremiumMomentEditRedDot();
            Boolean bool2 = Boolean.FALSE;
            premiumMomentEditRedDot.postValue(bool2);
            sharedMainMessageManager.getVipRedDot_CustomRoomTheme().postValue(bool2);
            sharedMainMessageManager.getVipRedDot_ExclusiveBubble().postValue(bool2);
            sharedMainMessageManager.getVipRedDot_IncognitoAccess().postValue(bool2);
            sharedMainMessageManager.getVipRedDot_ExclusiveBackpackGift().postValue(bool2);
            sharedMainMessageManager.getVipRedDot_ExclusiveGiftRunway().postValue(bool2);
            Calendar calendar = Calendar.getInstance();
            oOO0OOO<Integer> ooo0ooo2 = oOO0OO.OooO0OO().f93867OooO0o0;
            Intrinsics.checkNotNull(calendar);
            ooo0ooo2.OooO0OO(Integer.valueOf(OooOO0.OooO00o(calendar)));
        } else {
            p472o0o0000o.OooOO0O.OooO0oO().OooOOo().postValue(Boolean.FALSE);
        }
        oOO0OOO<Boolean> ooo0ooo3 = oOO0OO.OooO0oO().f93919OooOo0;
        Boolean bool3 = Boolean.FALSE;
        ooo0ooo3.OooO0OO(bool3);
        oOO0OO.OooO0oO().f93917OooOOoo.OooO0OO(Boolean.valueOf(isFirst));
        p472o0o0000o.OooOO0O.OooO0oO().OooOOoo(true);
        oOO0OO.OooO0oO().f93912OooOOO0.OooO0OO(bool3);
        oOO0OO.OooO0OO().f93863OooO0O0.OooO0OO(Integer.valueOf(userInfoModel.getStartupPage()));
        oOO0OO.OooO0oO().f93921OooOo0O.OooO0OO(bool3);
        oOO0OO.OooO0oO().f93922OooOo0o.OooO0OO(bool3);
        oOO0OO.OooO0oO().f93918OooOo.OooO0OO(bool3);
        oOO0OO.OooO0oO().f93924OooOoO0.OooO0OO(bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void saveUserData(MyUserInfoModel userInfoModel, LoginToken token, OpenAuthManager.AuthType type, boolean isFirst, boolean isGuest) {
        if (type != null) {
            oOO0OO.OooO00o().f93848OooO0OO.OooO0OO(Integer.valueOf(type.getValue()));
        }
        Account account = Account.f74684OooO00o;
        Integer num = (Integer) Account.OooOOOO().getValue();
        Long l = (Long) Account.OooOo0o().getValue();
        long jLongValue = l != null ? l.longValue() : 0L;
        Intrinsics.checkNotNullParameter(userInfoModel, "user");
        Intrinsics.checkNotNullParameter(token, "token");
        Account.Oooo0o(token);
        Account.Oooo0oO(isGuest, userInfoModel);
        Account.f74689OooO0o0 = isFirst;
        if (!isGuest) {
            Account.OooOooO().setValue(Boolean.TRUE);
            saveDataToSp(isFirst, userInfoModel);
            com.yalla.yalla.service.OooO0O0.OooO00o(false);
        }
        LiveEventBus.get("UPDATE_DOMAIN").post(Boolean.TRUE);
        o0Oo0oo.OooO0O0(CoroutineScopeKt.MainScope(), new C10191(2, null));
        AppVirtualManager.OooO0O0(true);
        oOO0OO.OooO0OO().f93863OooO0O0.OooO0OO(Integer.valueOf(userInfoModel.getStartupPage()));
        if (isFirst) {
            BusinessEvent.OooO0o();
        }
        logSuccessEvent(isFirst, type);
        changeLanguageAndRoom(num, jLongValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object yallaChatLoginCovert(String str, Continuation<? super ApiResult<LoginListModel>> continuation) {
        C10211 c10211;
        MyUserInfoModel myUserInfoModel;
        LoginToken token;
        MyUserInfoModel data;
        if (continuation instanceof C10211) {
            c10211 = (C10211) continuation;
            int i = c10211.f51134OooO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c10211.f51134OooO = i - Integer.MIN_VALUE;
            } else {
                c10211 = new C10211(continuation);
            }
        } else {
            c10211 = new C10211(continuation);
        }
        Object objOooOOOo = c10211.f51135OooO0oO;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c10211.f51134OooO;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooOOOo);
            c10211.f51134OooO = 1;
            objOooOOOo = o00Ooo.f48615OooO00o.OooOOOo(str, c10211);
            if (objOooOOOo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooOOOo);
        }
        ApiResult apiResult = (ApiResult) objOooOOOo;
        LoginListModel loginListModel = new LoginListModel();
        ArrayList arrayList = new ArrayList();
        LoginModel loginModel = (LoginModel) apiResult.getData();
        if (loginModel != null && (data = loginModel.getData()) != null) {
            Boxing.boxBoolean(arrayList.add(data));
        }
        LoginModel loginModel2 = (LoginModel) apiResult.getData();
        if (loginModel2 != null && (token = loginModel2.getToken()) != null) {
            loginListModel.setToken(token);
        }
        loginListModel.setData(arrayList);
        LoginModel loginModel3 = (LoginModel) apiResult.getData();
        loginListModel.setFirst(loginModel3 != null ? loginModel3.getIsFirst() : false);
        Account account = Account.f74684OooO00o;
        MutableLiveData mutableLiveDataOooOOo = Account.OooOOo();
        LoginModel loginModel4 = (LoginModel) apiResult.getData();
        mutableLiveDataOooOOo.postValue(Boxing.boxBoolean(loginModel4 != null ? loginModel4.getIsBindRemind() : false));
        ApiResult apiResult2 = new ApiResult();
        apiResult2.setCode(apiResult.getCode());
        apiResult2.setMessage(apiResult.getMessage());
        apiResult2.setData(loginListModel);
        List<MyUserInfoModel> data2 = loginListModel.getData();
        if (data2 != null && (myUserInfoModel = (MyUserInfoModel) CollectionsKt.getOrNull(data2, 0)) != null) {
            LoginModel loginModel5 = (LoginModel) apiResult.getData();
            myUserInfoModel.setGameFirst(loginModel5 != null ? loginModel5.getIsGameFirst() : false);
        }
        return apiResult2;
    }

    @NotNull
    public final LiveData<ApiResult<LoginModel>> activeAccount(@NotNull String token, long userId) {
        Intrinsics.checkNotNullParameter(token, "token");
        return LiveDataUtilKt.OooO00o(new AnonymousClass1(token, userId, this, null));
    }

    @NotNull
    public final o00Oo0<ApiResult<ThirdPartyLoginModel>> getPopupConfig(int channelSource) {
        return JobFlowKt.OooO0Oo(this, new C10131(channelSource, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final ThirdPartyLoginModel getUserPopupConfigModel() {
        return (ThirdPartyLoginModel) this.userPopupConfigModel.getValue();
    }

    public final void logStartEvent(int loginFrom) {
        o0Oo0oo.OooO0O0(ViewModelKt.getViewModelScope(this), new C10141(loginFrom, null));
    }

    @NotNull
    public final o00Oo0<ApiResult<LoginModel>> loginByVisitor() {
        return JobFlowKt.OooO0Oo(this, new C10151(null));
    }

    @NotNull
    public final o00Oo0<ApiResult<LoginModel>> newInstallUserRegisterEvent() {
        return JobFlowKt.OooO0Oo(this, new C10171(null));
    }

    public final void newInstallUserStay30s(long userId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C10181(userId, null), 3, null);
    }

    @Nullable
    public Object onLoginSuccess(boolean z, @NotNull MyUserInfoModel myUserInfoModel, @NotNull LoginToken loginToken, @Nullable OpenAuthManager.AuthType authType, @NotNull Continuation<? super Unit> continuation) {
        return onLoginSuccess$suspendImpl(this, z, myUserInfoModel, loginToken, authType, continuation);
    }

    public final void setUserPopupConfigModel(@Nullable ThirdPartyLoginModel thirdPartyLoginModel) {
        this.userPopupConfigModel.setValue(thirdPartyLoginModel);
    }

    @NotNull
    public final LiveData<ApiResult<LoginListModel>> thirdLogin(@NotNull String accessToken, @NotNull OpenAuthManager.AuthType type, @Nullable String twitterSecretOrInsUserId) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(type, "type");
        return LiveDataUtilKt.OooO00o(new C10201(type, accessToken, twitterSecretOrInsUserId, this, null));
    }
}
