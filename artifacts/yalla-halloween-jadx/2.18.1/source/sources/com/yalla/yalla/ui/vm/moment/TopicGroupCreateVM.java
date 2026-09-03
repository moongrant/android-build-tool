package com.yalla.yalla.ui.vm.moment;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicGroupCreateModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p515o0o0O00.o00O00;
import p520o0o0O0O0.o0oOO;
import p522o0o0O0o.o00O0;
import p606o0oo0O.OooOo;
import p623o0oo0oO0.o0000O0;
import p623o0oo0oO0.o0000OO0;
import p623o0oo0oO0.o0000oo;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J \u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010%\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R(\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicGroupCreateVM;", "Lo00OO/OooO00o;", "", "toGroupCreate", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/TopicGroupCreateModel;", "successListener", "getGroupCreateVoucher", "getBindChatGroupCreateVoucher", "", "isAdequateFollowedCount", "isAdequateCreateDaysCount", "checkIsGroupCreate", "toBindingYallaChat", "Lcom/yalla/yalla/model/TopicGroupInfoModel;", "topicGroupInfoModel", "Lcom/yalla/yalla/model/TopicGroupInfoModel;", "getTopicGroupInfoModel", "()Lcom/yalla/yalla/model/TopicGroupInfoModel;", "setTopicGroupInfoModel", "(Lcom/yalla/yalla/model/TopicGroupInfoModel;)V", "topicGroupCreateModel", "Lcom/yalla/yalla/model/TopicGroupCreateModel;", "Lo0oo0oO0/o0000O0;", "yallaChatSdk$delegate", "Lkotlin/Lazy;", "getYallaChatSdk", "()Lo0oo0oO0/o0000O0;", "yallaChatSdk", "Lo000oOoO/o0O00OO;", "", "alphaToolbar", "Lo000oOoO/o0O00OO;", "getAlphaToolbar", "()Lo000oOoO/o0O00OO;", "setAlphaToolbar", "(Lo000oOoO/o0O00OO;)V", "showDialogBinding", "getShowDialogBinding", "setShowDialogBinding", "isCreateSuccess", "setCreateSuccess", "_model", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicGroupCreateVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private o0O00OO<Boolean> isCreateSuccess;

    @NotNull
    private o0O00OO<Boolean> showDialogBinding;

    @NotNull
    private TopicGroupInfoModel topicGroupInfoModel;

    /* JADX INFO: renamed from: yallaChatSdk$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy yallaChatSdk;

    @NotNull
    private TopicGroupCreateModel topicGroupCreateModel = new TopicGroupCreateModel();

    @NotNull
    private o0O00OO<Float> alphaToolbar = o0OOO00.OooO0Oo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));

    public static final class OooO extends Lambda implements Function1<BaseResp, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResp baseResp) {
            BaseResp it = baseResp;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                OooOo.OooO0O0("203002");
                TopicGroupCreateVM.this.getTopicGroupInfoModel().setType(2);
                o00O00.OooO0O0("建群成功！");
                TopicGroupCreateVM.this.isCreateSuccess().setValue(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
            topicGroupCreateVM.getGroupCreateVoucher(new com.yalla.yalla.ui.vm.moment.OooO00o(topicGroupCreateVM));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getBindChatGroupCreateVoucher$1", f = "TopicGroupCreateVM.kt", i = {}, l = {134, 139}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f25932Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f25933Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25934Oooo0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getBindChatGroupCreateVoucher$1$1$1", f = "TopicGroupCreateVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ TopicGroupCreateVM f25936Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupCreateModel> f25937Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f25938Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupCreateVM topicGroupCreateVM, ApiResult<TopicGroupCreateModel> apiResult, Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25936Oooo0o = topicGroupCreateVM;
                this.f25937Oooo0oO = apiResult;
                this.f25938Oooo0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25936Oooo0o, this.f25937Oooo0oO, this.f25938Oooo0oo, continuation);
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
                this.f25936Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                if (this.f25937Oooo0oO.isSuccess()) {
                    o00O00.OooO0O0("Binding YallaChat Success");
                    TopicGroupCreateModel data = this.f25937Oooo0oO.getData();
                    if (data != null) {
                        TopicGroupCreateVM topicGroupCreateVM = this.f25936Oooo0o;
                        Function1<TopicGroupCreateModel, Unit> function1 = this.f25938Oooo0oo;
                        topicGroupCreateVM.topicGroupCreateModel = data;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    ApiError error = this.f25937Oooo0oO.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25932Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupCreateVM.this.new OooO0O0(this.f25932Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25934Oooo0oO;
            if (i != 0) {
                if (i == 1) {
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
            TopicGroupCreateVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long localTopicId = TopicGroupCreateVM.this.getTopicGroupInfoModel().getLocalTopicId();
            String localCredentialCode = TopicGroupCreateVM.this.getTopicGroupInfoModel().getLocalCredentialCode();
            int localBindChatGroupCreateType = TopicGroupCreateVM.this.getTopicGroupInfoModel().getLocalBindChatGroupCreateType();
            this.f25934Oooo0oO = 1;
            obj = o0ooo2.OooO0O0(localTopicId, localCredentialCode, localBindChatGroupCreateType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
            Function1<TopicGroupCreateModel, Unit> function1 = this.f25932Oooo;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupCreateVM, (ApiResult) obj, function1, null);
            this.f25933Oooo0o = obj;
            this.f25934Oooo0oO = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getGroupCreateVoucher$1", f = "TopicGroupCreateVM.kt", i = {}, l = {100, 101}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f25939Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f25940Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25941Oooo0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getGroupCreateVoucher$1$1$1", f = "TopicGroupCreateVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ TopicGroupCreateVM f25943Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupCreateModel> f25944Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f25945Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupCreateVM topicGroupCreateVM, ApiResult<TopicGroupCreateModel> apiResult, Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25943Oooo0o = topicGroupCreateVM;
                this.f25944Oooo0oO = apiResult;
                this.f25945Oooo0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25943Oooo0o, this.f25944Oooo0oO, this.f25945Oooo0oo, continuation);
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
                this.f25943Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                if (this.f25944Oooo0oO.isSuccess()) {
                    TopicGroupCreateModel data = this.f25944Oooo0oO.getData();
                    if (data != null) {
                        TopicGroupCreateVM topicGroupCreateVM = this.f25943Oooo0o;
                        Function1<TopicGroupCreateModel, Unit> function1 = this.f25945Oooo0oo;
                        topicGroupCreateVM.topicGroupCreateModel = data;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    int code2 = this.f25944Oooo0oO.getCode();
                    if (code2 == 2077) {
                        this.f25943Oooo0o.getTopicGroupInfoModel().setLocalBindChatGroupCreateType(2);
                        this.f25943Oooo0o.toBindingYallaChat();
                    } else if (code2 != 2078) {
                        ApiError error = this.f25944Oooo0oO.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    } else {
                        this.f25943Oooo0o.getTopicGroupInfoModel().setLocalBindChatGroupCreateType(1);
                        this.f25943Oooo0o.getShowDialogBinding().setValue(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25939Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupCreateVM.this.new OooO0OO(this.f25939Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25941Oooo0oO;
            if (i != 0) {
                if (i == 1) {
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
            TopicGroupCreateVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long localTopicId = TopicGroupCreateVM.this.getTopicGroupInfoModel().getLocalTopicId();
            this.f25941Oooo0oO = 1;
            obj = o0ooo2.OooO0o(localTopicId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
            Function1<TopicGroupCreateModel, Unit> function1 = this.f25939Oooo;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupCreateVM, (ApiResult) obj, function1, null);
            this.f25940Oooo0o = obj;
            this.f25941Oooo0oO = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<AuthResponse, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AuthResponse authResponse) {
            AuthResponse it = authResponse;
            Intrinsics.checkNotNullParameter(it, "it");
            if (o00O0.OooO0o0(it.getAuthCode())) {
                TopicGroupCreateVM.this.getTopicGroupInfoModel().setLocalCredentialCode(it.getAuthCode());
                TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
                topicGroupCreateVM.getBindChatGroupCreateVoucher(new com.yalla.yalla.ui.vm.moment.OooO0O0(topicGroupCreateVM));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o0000O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOO0 f25947Oooo0o = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O0 invoke() {
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            return new o0000O0(contextOooO0O0);
        }
    }

    public TopicGroupCreateVM(@Nullable TopicGroupInfoModel topicGroupInfoModel) {
        this.topicGroupInfoModel = new TopicGroupInfoModel();
        Boolean bool = Boolean.FALSE;
        this.showDialogBinding = o0OOO00.OooO0Oo(bool);
        this.isCreateSuccess = o0OOO00.OooO0Oo(bool);
        this.yallaChatSdk = LazyKt.lazy(OooOO0.f25947Oooo0o);
        if (topicGroupInfoModel != null) {
            this.topicGroupInfoModel = topicGroupInfoModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBindChatGroupCreateVoucher(Function1<? super TopicGroupCreateModel, Unit> successListener) {
        p254o00ooO0O.o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(successListener, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBindChatGroupCreateVoucher$default(TopicGroupCreateVM topicGroupCreateVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        topicGroupCreateVM.getBindChatGroupCreateVoucher(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getGroupCreateVoucher(Function1<? super TopicGroupCreateModel, Unit> successListener) {
        p254o00ooO0O.o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0OO(successListener, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getGroupCreateVoucher$default(TopicGroupCreateVM topicGroupCreateVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        topicGroupCreateVM.getGroupCreateVoucher(function1);
    }

    private final o0000O0 getYallaChatSdk() {
        return (o0000O0) this.yallaChatSdk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toGroupCreate() {
        OooOo.OooO0O0("203001");
        o0000O0 yallaChatSdk = getYallaChatSdk();
        String credential = this.topicGroupCreateModel.getCredentialCode();
        String openId = this.topicGroupCreateModel.getOpenId();
        String localTopicName = this.topicGroupInfoModel.getLocalTopicName();
        String thirdTag = this.topicGroupCreateModel.getThirdTag();
        OooO action = new OooO();
        Objects.requireNonNull(yallaChatSdk);
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(action, "action");
        o0000OO0 action2 = new o0000OO0(yallaChatSdk, credential, openId, null, localTopicName, thirdTag, action);
        o0000oo notInstall = true & true ? o0000oo.f48642Oooo0o : null;
        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
        Intrinsics.checkNotNullParameter(action2, "action");
        if (PackManager.INSTANCE.isInstalledYallaChat()) {
            action2.invoke();
        } else {
            notInstall.invoke();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
        }
    }

    public final void checkIsGroupCreate() {
        OooO00o action = new OooO00o();
        o0000oo notInstall = true & true ? o0000oo.f48642Oooo0o : null;
        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
        Intrinsics.checkNotNullParameter(action, "action");
        if (PackManager.INSTANCE.isInstalledYallaChat()) {
            action.invoke();
        } else {
            notInstall.invoke();
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0000O0.OooO00o.C0419OooO00o(null), 2, null);
        }
    }

    @NotNull
    public final o0O00OO<Float> getAlphaToolbar() {
        return this.alphaToolbar;
    }

    @NotNull
    public final o0O00OO<Boolean> getShowDialogBinding() {
        return this.showDialogBinding;
    }

    @NotNull
    public final TopicGroupInfoModel getTopicGroupInfoModel() {
        return this.topicGroupInfoModel;
    }

    public final boolean isAdequateCreateDaysCount() {
        return this.topicGroupInfoModel.getCreateDay() >= this.topicGroupInfoModel.getCreateDayMin();
    }

    public final boolean isAdequateFollowedCount() {
        return this.topicGroupInfoModel.getFollowedCount() >= this.topicGroupInfoModel.getFollowedCountMin();
    }

    @NotNull
    public final o0O00OO<Boolean> isCreateSuccess() {
        return this.isCreateSuccess;
    }

    public final void setAlphaToolbar(@NotNull o0O00OO<Float> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.alphaToolbar = o0o00oo2;
    }

    public final void setCreateSuccess(@NotNull o0O00OO<Boolean> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.isCreateSuccess = o0o00oo2;
    }

    public final void setShowDialogBinding(@NotNull o0O00OO<Boolean> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.showDialogBinding = o0o00oo2;
    }

    public final void setTopicGroupInfoModel(@NotNull TopicGroupInfoModel topicGroupInfoModel) {
        Intrinsics.checkNotNullParameter(topicGroupInfoModel, "<set-?>");
        this.topicGroupInfoModel = topicGroupInfoModel;
    }

    public final void toBindingYallaChat() {
        getYallaChatSdk().OooO00o(new OooO0o());
    }
}
