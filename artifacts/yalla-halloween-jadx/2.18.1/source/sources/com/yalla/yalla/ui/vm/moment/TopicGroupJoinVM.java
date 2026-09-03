package com.yalla.yalla.ui.vm.moment;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.model.TopicGroupJoinModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.util.Objects;
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
import p254o00ooO0O.o000O0O0;
import p515o0o0O00.o00O00;
import p516o0o0O000.o0Oo0oo;
import p520o0o0O0O0.o0oOO;
import p522o0o0O0o.o00O0;
import p606o0oo0O.OooOo;
import p623o0oo0oO0.o0000O0;
import p623o0oo0oO0.o0000oo;
import p623o0oo0oO0.o000O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b#\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J \u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001b¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicGroupJoinVM;", "Lo00OO/OooO00o;", "", "toGroupJoin", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/TopicGroupJoinModel;", "successListener", "getGroupJoinVoucher", "getBindChatJoinGroupVoucher", "checkGroupJoinOrInto", "toBindingYallaChat", "Lcom/yalla/yalla/model/TopicGroupInfoModel;", "topicGroupInfoModel", "Lcom/yalla/yalla/model/TopicGroupInfoModel;", "getTopicGroupInfoModel", "()Lcom/yalla/yalla/model/TopicGroupInfoModel;", "setTopicGroupInfoModel", "(Lcom/yalla/yalla/model/TopicGroupInfoModel;)V", "topicGroupJoinModel", "Lcom/yalla/yalla/model/TopicGroupJoinModel;", "Lo000oOoO/o0O00OO;", "", "alphaToolbar", "Lo000oOoO/o0O00OO;", "getAlphaToolbar", "()Lo000oOoO/o0O00OO;", "setAlphaToolbar", "(Lo000oOoO/o0O00OO;)V", "", "showDialogBinding", "getShowDialogBinding", "setShowDialogBinding", "isDisbanded", "setDisbanded", "_model", "<init>", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class TopicGroupJoinVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private o0O00OO<Boolean> isDisbanded;

    @NotNull
    private o0O00OO<Boolean> showDialogBinding;

    @NotNull
    private TopicGroupInfoModel topicGroupInfoModel;

    @NotNull
    private final o0000O0 yallaChatSdk;

    @NotNull
    private TopicGroupJoinModel topicGroupJoinModel = new TopicGroupJoinModel();

    @NotNull
    private o0O00OO<Float> alphaToolbar = o0OOO00.OooO0Oo(Float.valueOf(ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE));

    public static final class OooO extends Lambda implements Function1<BaseResp, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f25948Oooo0o = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResp baseResp) {
            BaseResp it = baseResp;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                OooOo.OooO0O0("203004");
                o00O00.OooO0O0("加群/群聊 成功！");
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
            TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
            topicGroupJoinVM.getGroupJoinVoucher(new com.yalla.yalla.ui.vm.moment.OooO0OO(topicGroupJoinVM));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getBindChatJoinGroupVoucher$1", f = "TopicGroupJoinVM.kt", i = {}, l = {Constants.ERR_MODULE_NOT_FOUND, 162}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f25950Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f25951Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25952Oooo0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getBindChatJoinGroupVoucher$1$1$1", f = "TopicGroupJoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ TopicGroupJoinVM f25954Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupJoinModel> f25955Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f25956Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupJoinVM topicGroupJoinVM, ApiResult<TopicGroupJoinModel> apiResult, Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25954Oooo0o = topicGroupJoinVM;
                this.f25955Oooo0oO = apiResult;
                this.f25956Oooo0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25954Oooo0o, this.f25955Oooo0oO, this.f25956Oooo0oo, continuation);
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
                this.f25954Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                if (this.f25955Oooo0oO.isSuccess()) {
                    TopicGroupJoinModel data = this.f25955Oooo0oO.getData();
                    if (data != null) {
                        TopicGroupJoinVM topicGroupJoinVM = this.f25954Oooo0o;
                        Function1<TopicGroupJoinModel, Unit> function1 = this.f25956Oooo0oo;
                        topicGroupJoinVM.topicGroupJoinModel = data;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                        LiveEventBus.get("TOPIC_FOLLOW_SUCCESS").post(Boxing.boxLong(topicGroupJoinVM.getTopicGroupInfoModel().getLocalTopicId()));
                    }
                } else {
                    ApiError error = this.f25955Oooo0oO.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f25950Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupJoinVM.this.new OooO0O0(this.f25950Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25952Oooo0oO;
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
            TopicGroupJoinVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long localTopicId = TopicGroupJoinVM.this.getTopicGroupInfoModel().getLocalTopicId();
            String localCredentialCode = TopicGroupJoinVM.this.getTopicGroupInfoModel().getLocalCredentialCode();
            int localBindChatGroupJoinType = TopicGroupJoinVM.this.getTopicGroupInfoModel().getLocalBindChatGroupJoinType();
            this.f25952Oooo0oO = 1;
            obj = o0ooo2.OooO0Oo(localTopicId, localCredentialCode, localBindChatGroupJoinType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
            Function1<TopicGroupJoinModel, Unit> function1 = this.f25950Oooo;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupJoinVM, (ApiResult) obj, function1, null);
            this.f25951Oooo0o = obj;
            this.f25952Oooo0oO = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getGroupJoinVoucher$1", f = "TopicGroupJoinVM.kt", i = {}, l = {120, 123}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f25957Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f25958Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public int f25959Oooo0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getGroupJoinVoucher$1$1$1", f = "TopicGroupJoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ TopicGroupJoinVM f25961Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupJoinModel> f25962Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f25963Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupJoinVM topicGroupJoinVM, ApiResult<TopicGroupJoinModel> apiResult, Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f25961Oooo0o = topicGroupJoinVM;
                this.f25962Oooo0oO = apiResult;
                this.f25963Oooo0oo = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f25961Oooo0o, this.f25962Oooo0oO, this.f25963Oooo0oo, continuation);
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
                this.f25961Oooo0o.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                if (this.f25962Oooo0oO.isSuccess()) {
                    TopicGroupJoinModel data = this.f25962Oooo0oO.getData();
                    if (data != null) {
                        TopicGroupJoinVM topicGroupJoinVM = this.f25961Oooo0o;
                        Function1<TopicGroupJoinModel, Unit> function1 = this.f25963Oooo0oo;
                        topicGroupJoinVM.topicGroupJoinModel = data;
                        topicGroupJoinVM.getTopicGroupInfoModel().setLocalCredentialCode(data.getCredentialCode());
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    int code2 = this.f25962Oooo0oO.getCode();
                    if (code2 == 2077) {
                        this.f25961Oooo0o.getTopicGroupInfoModel().setLocalBindChatGroupJoinType(2);
                        this.f25961Oooo0o.toBindingYallaChat();
                    } else if (code2 != 2078) {
                        ApiError error = this.f25962Oooo0oO.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                    } else {
                        this.f25961Oooo0o.getTopicGroupInfoModel().setLocalBindChatGroupJoinType(1);
                        this.f25961Oooo0o.getShowDialogBinding().setValue(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f25957Oooo = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupJoinVM.this.new OooO0OO(this.f25957Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f25959Oooo0oO;
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
            TopicGroupJoinVM.this.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long localTopicId = TopicGroupJoinVM.this.getTopicGroupInfoModel().getLocalTopicId();
            this.f25959Oooo0oO = 1;
            obj = o0ooo2.OooO0oo(localTopicId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
            Function1<TopicGroupJoinModel, Unit> function1 = this.f25957Oooo;
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupJoinVM, (ApiResult) obj, function1, null);
            this.f25958Oooo0o = obj;
            this.f25959Oooo0oO = 2;
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
                TopicGroupJoinVM.this.getTopicGroupInfoModel().setLocalCredentialCode(it.getAuthCode());
                TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
                topicGroupJoinVM.getBindChatJoinGroupVoucher(new com.yalla.yalla.ui.vm.moment.OooO(topicGroupJoinVM));
            }
            return Unit.INSTANCE;
        }
    }

    public TopicGroupJoinVM(@Nullable TopicGroupInfoModel topicGroupInfoModel) {
        this.topicGroupInfoModel = new TopicGroupInfoModel();
        Boolean bool = Boolean.FALSE;
        this.showDialogBinding = o0OOO00.OooO0Oo(bool);
        this.isDisbanded = o0OOO00.OooO0Oo(bool);
        Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            contextOooO0O0 = null;
        }
        this.yallaChatSdk = new o0000O0(contextOooO0O0);
        if (topicGroupInfoModel != null) {
            this.topicGroupInfoModel = topicGroupInfoModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBindChatJoinGroupVoucher(Function1<? super TopicGroupJoinModel, Unit> successListener) {
        p254o00ooO0O.o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0O0(successListener, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getBindChatJoinGroupVoucher$default(TopicGroupJoinVM topicGroupJoinVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        topicGroupJoinVM.getBindChatJoinGroupVoucher(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getGroupJoinVoucher(Function1<? super TopicGroupJoinModel, Unit> successListener) {
        p254o00ooO0O.o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooO0OO(successListener, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getGroupJoinVoucher$default(TopicGroupJoinVM topicGroupJoinVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        topicGroupJoinVM.getGroupJoinVoucher(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toGroupJoin() {
        OooOo.OooO0O0("203003");
        o0000O0 o0000o1 = this.yallaChatSdk;
        String credential = this.topicGroupJoinModel.getCredentialCode();
        String openId = this.topicGroupJoinModel.getOpenId();
        String groupOpenId = this.topicGroupJoinModel.getGroupOpenId();
        String thirdTag = this.topicGroupJoinModel.getThirdTag();
        OooO action = OooO.f25948Oooo0o;
        Objects.requireNonNull(o0000o1);
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(groupOpenId, "groupOpenId");
        Intrinsics.checkNotNullParameter(action, "action");
        o000O000 action2 = new o000O000(o0000o1, credential, openId, groupOpenId, thirdTag, action);
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

    public final void checkGroupJoinOrInto() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("topicGroupInfoModel = ");
        sbOooO0o0.append(o0Oo0oo.OooO0O0(this.topicGroupInfoModel));
        o00O00.OooO0O0(sbOooO0o0.toString());
        if (this.topicGroupInfoModel.getIsDisbanded()) {
            ToastUtil.f12567OooO00o.OooO0O0(o000O0O0.OooO0OO(R.string.topic_group_join_dissolved));
            this.isDisbanded.setValue(Boolean.TRUE);
            return;
        }
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

    @NotNull
    public final o0O00OO<Boolean> isDisbanded() {
        return this.isDisbanded;
    }

    public final void setAlphaToolbar(@NotNull o0O00OO<Float> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.alphaToolbar = o0o00oo2;
    }

    public final void setDisbanded(@NotNull o0O00OO<Boolean> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.isDisbanded = o0o00oo2;
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
        this.yallaChatSdk.OooO00o(new OooO0o());
    }
}
