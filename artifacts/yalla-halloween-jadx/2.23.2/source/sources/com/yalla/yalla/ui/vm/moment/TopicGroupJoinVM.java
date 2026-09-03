package com.yalla.yalla.ui.vm.moment;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import io.agora.rtc.Constants;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p381o0OOoOo0.Oooo000;
import p412o0Oo0o0O.o0O00OOO;
import p423o0OoO0OO.o00O00OO;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;
import p614o0oo0o.o000oOoO;
import p614o0oo0o.o00oO0o;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J \u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R(\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0017\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicGroupJoinVM;", "Lo0Oo0/OooOO0;", "", "toGroupJoin", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/topic/TopicGroupJoinModel;", "successListener", "getGroupJoinVoucher", "getBindChatJoinGroupVoucher", "checkGroupJoinOrInto", "toBindingYallaChat", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "topicGroupInfoModel", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "getTopicGroupInfoModel", "()Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "setTopicGroupInfoModel", "(Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;)V", "topicGroupJoinModel", "Lcom/yalla/yalla/model/topic/TopicGroupJoinModel;", "Landroidx/compose/runtime/MutableState;", "", "alphaToolbar", "Landroidx/compose/runtime/MutableState;", "getAlphaToolbar", "()Landroidx/compose/runtime/MutableState;", "setAlphaToolbar", "(Landroidx/compose/runtime/MutableState;)V", "", "showDialogBinding", "getShowDialogBinding", "setShowDialogBinding", "isDisbanded", "setDisbanded", "Lo0oo0o/o000oOoO;", "yallaChatSdk", "Lo0oo0o/o000oOoO;", "_model", "<init>", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class TopicGroupJoinVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Boolean> isDisbanded;

    @NotNull
    private MutableState<Boolean> showDialogBinding;

    @NotNull
    private TopicGroupInfoModel topicGroupInfoModel;

    @NotNull
    private final o000oOoO yallaChatSdk;

    @NotNull
    private TopicGroupJoinModel topicGroupJoinModel = new TopicGroupJoinModel();

    @NotNull
    private MutableState<Float> alphaToolbar = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    public static final class OooO extends Lambda implements Function1<BaseResp, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f31876OooO0Oo = new OooO();

        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResp baseResp) {
            BaseResp it = baseResp;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                o0oo0000.OooO00o.OooO0O0("203004");
                o0000O00.OooO0O0("加群/群聊 成功！");
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
            topicGroupJoinVM.getGroupJoinVoucher(new com.yalla.yalla.ui.vm.moment.OooO0o(topicGroupJoinVM));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getBindChatJoinGroupVoucher$1", f = "TopicGroupJoinVM.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f31878OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31880OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f31881OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getBindChatJoinGroupVoucher$1$1$1", f = "TopicGroupJoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ TopicGroupJoinVM f31882OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f31883OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupJoinModel> f31884OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupJoinVM topicGroupJoinVM, ApiResult<TopicGroupJoinModel> apiResult, Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31882OooO0Oo = topicGroupJoinVM;
                this.f31884OooO0o0 = apiResult;
                this.f31883OooO0o = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31882OooO0Oo, this.f31884OooO0o0, this.f31883OooO0o, continuation);
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
                TopicGroupJoinVM topicGroupJoinVM = this.f31882OooO0Oo;
                topicGroupJoinVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                ApiResult<TopicGroupJoinModel> apiResult = this.f31884OooO0o0;
                if (apiResult.isSuccess()) {
                    TopicGroupJoinModel data = apiResult.getData();
                    if (data != null) {
                        topicGroupJoinVM.topicGroupJoinModel = data;
                        Function1<TopicGroupJoinModel, Unit> function1 = this.f31883OooO0o;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                        LiveEventBus.get("TOPIC_FOLLOW_SUCCESS").post(Boxing.boxLong(topicGroupJoinVM.getTopicGroupInfoModel().getLocalTopicId()));
                    }
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31881OooO0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupJoinVM.this.new OooO0O0(this.f31881OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31880OooO0o0;
            TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
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
            topicGroupJoinVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long localTopicId = topicGroupJoinVM.getTopicGroupInfoModel().getLocalTopicId();
            String localCredentialCode = topicGroupJoinVM.getTopicGroupInfoModel().getLocalCredentialCode();
            int localBindChatGroupJoinType = topicGroupJoinVM.getTopicGroupInfoModel().getLocalBindChatGroupJoinType();
            this.f31880OooO0o0 = 1;
            obj = o0o00ooo2.OooO0Oo(localTopicId, localCredentialCode, localBindChatGroupJoinType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupJoinVM, (ApiResult) obj, this.f31881OooO0oO, null);
            this.f31878OooO0Oo = obj;
            this.f31880OooO0o0 = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getGroupJoinVoucher$1", f = "TopicGroupJoinVM.kt", i = {}, l = {119, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f31885OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f31887OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f31888OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupJoinVM$getGroupJoinVoucher$1$1$1", f = "TopicGroupJoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ TopicGroupJoinVM f31889OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupJoinModel, Unit> f31890OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupJoinModel> f31891OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupJoinVM topicGroupJoinVM, ApiResult<TopicGroupJoinModel> apiResult, Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31889OooO0Oo = topicGroupJoinVM;
                this.f31891OooO0o0 = apiResult;
                this.f31890OooO0o = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31889OooO0Oo, this.f31891OooO0o0, this.f31890OooO0o, continuation);
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
                TopicGroupJoinVM topicGroupJoinVM = this.f31889OooO0Oo;
                topicGroupJoinVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                ApiResult<TopicGroupJoinModel> apiResult = this.f31891OooO0o0;
                if (apiResult.isSuccess()) {
                    TopicGroupJoinModel data = apiResult.getData();
                    if (data != null) {
                        topicGroupJoinVM.topicGroupJoinModel = data;
                        topicGroupJoinVM.getTopicGroupInfoModel().setLocalCredentialCode(data.getCredentialCode());
                        Function1<TopicGroupJoinModel, Unit> function1 = this.f31890OooO0o;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    int code = apiResult.getCode();
                    if (code == 2077) {
                        topicGroupJoinVM.getTopicGroupInfoModel().setLocalBindChatGroupJoinType(2);
                        topicGroupJoinVM.toBindingYallaChat();
                    } else if (code != 2078) {
                        ApiError error = apiResult.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new Oooo000(error, null), 3, null);
                    } else {
                        topicGroupJoinVM.getTopicGroupInfoModel().setLocalBindChatGroupJoinType(1);
                        topicGroupJoinVM.getShowDialogBinding().setValue(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super TopicGroupJoinModel, Unit> function1, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31888OooO0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupJoinVM.this.new OooO0OO(this.f31888OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31887OooO0o0;
            TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
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
            topicGroupJoinVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long localTopicId = topicGroupJoinVM.getTopicGroupInfoModel().getLocalTopicId();
            this.f31887OooO0o0 = 1;
            obj = o0o00ooo2.OooO0oo(localTopicId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupJoinVM, (ApiResult) obj, this.f31888OooO0oO, null);
            this.f31885OooO0Oo = obj;
            this.f31887OooO0o0 = 2;
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
            if (o00O00OO.OooO0o(it.getAuthCode())) {
                TopicGroupJoinVM topicGroupJoinVM = TopicGroupJoinVM.this;
                topicGroupJoinVM.getTopicGroupInfoModel().setLocalCredentialCode(it.getAuthCode());
                topicGroupJoinVM.getBindChatJoinGroupVoucher(new OooOO0(topicGroupJoinVM));
            }
            return Unit.INSTANCE;
        }
    }

    public TopicGroupJoinVM(@Nullable TopicGroupInfoModel topicGroupInfoModel) {
        this.topicGroupInfoModel = new TopicGroupInfoModel();
        Boolean bool = Boolean.FALSE;
        this.showDialogBinding = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisbanded = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Context context = o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        Intrinsics.checkNotNull(activityOooO0O0);
        this.yallaChatSdk = new o000oOoO(activityOooO0O0);
        if (topicGroupInfoModel != null) {
            this.topicGroupInfoModel = topicGroupInfoModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBindChatJoinGroupVoucher(Function1<? super TopicGroupJoinModel, Unit> successListener) {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(successListener, null));
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
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0OO(successListener, null));
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
        o0oo0000.OooO00o.OooO0O0("203003");
        o000oOoO o000oooo2 = this.yallaChatSdk;
        String credential = this.topicGroupJoinModel.getCredentialCode();
        String openId = this.topicGroupJoinModel.getOpenId();
        String groupOpenId = this.topicGroupJoinModel.getGroupOpenId();
        String thirdTag = this.topicGroupJoinModel.getThirdTag();
        OooO action = OooO.f31876OooO0Oo;
        o000oooo2.getClass();
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(groupOpenId, "groupOpenId");
        Intrinsics.checkNotNullParameter(action, "action");
        o000oOoO.OooO00o.OooO00o(o000oOoO.f57513OooO0O0, new o00oO0o(o000oooo2, credential, openId, groupOpenId, thirdTag, action));
    }

    public final void checkGroupJoinOrInto() {
        o0000O00.OooO0O0("topicGroupInfoModel = ".concat(p187o00o00o0.OooO.OooO00o(this.topicGroupInfoModel)));
        if (!this.topicGroupInfoModel.getIsDisbanded()) {
            o000oOoO.OooO00o.OooO00o(o000oOoO.f57513OooO0O0, new OooO00o());
            return;
        }
        String strOooO0OO = o0000.OooO0OO(o000000.topic_group_join_dissolved);
        if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o000oo0OooO00o.run();
            } else {
                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
            }
        }
        this.isDisbanded.setValue(Boolean.TRUE);
    }

    @NotNull
    public final MutableState<Float> getAlphaToolbar() {
        return this.alphaToolbar;
    }

    @NotNull
    public final MutableState<Boolean> getShowDialogBinding() {
        return this.showDialogBinding;
    }

    @NotNull
    public final TopicGroupInfoModel getTopicGroupInfoModel() {
        return this.topicGroupInfoModel;
    }

    @NotNull
    public final MutableState<Boolean> isDisbanded() {
        return this.isDisbanded;
    }

    public final void setAlphaToolbar(@NotNull MutableState<Float> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.alphaToolbar = mutableState;
    }

    public final void setDisbanded(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isDisbanded = mutableState;
    }

    public final void setShowDialogBinding(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.showDialogBinding = mutableState;
    }

    public final void setTopicGroupInfoModel(@NotNull TopicGroupInfoModel topicGroupInfoModel) {
        Intrinsics.checkNotNullParameter(topicGroupInfoModel, "<set-?>");
        this.topicGroupInfoModel = topicGroupInfoModel;
    }

    public final void toBindingYallaChat() {
        this.yallaChatSdk.OooO00o(new OooO0o());
    }
}
