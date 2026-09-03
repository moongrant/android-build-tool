package com.yalla.yalla.ui.vm.moment;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.OooOOO;
import com.code.android.util.o000O0;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicGroupCreateModel;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p375o0OOoOO.o00000O0;
import p394o0Oo00oO.o0O0O00;
import p406o0Oo0Ooo.p0;
import p417o0OoO0.o0000O0O;
import p587o0oOooo.o0OO000;
import p602o0oo0O0O.o000O000;
import p602o0oo0O0O.o000OO;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010*\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b+\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0007\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J \u0010\b\u001a\u00020\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0002J\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u000b\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001a\u001a\u0004\b\"\u0010\u001c\"\u0004\b#\u0010\u001eR\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/TopicGroupCreateVM;", "Lo0Oo00oO/o0O0O00;", "", "toGroupCreate", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/topic/TopicGroupCreateModel;", "successListener", "getGroupCreateVoucher", "getBindChatGroupCreateVoucher", "", "isAdequateFollowedCount", "isAdequateCreateDaysCount", "checkIsGroupCreate", "toBindingYallaChat", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "topicGroupInfoModel", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "getTopicGroupInfoModel", "()Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "setTopicGroupInfoModel", "(Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;)V", "topicGroupCreateModel", "Lcom/yalla/yalla/model/topic/TopicGroupCreateModel;", "Landroidx/compose/runtime/MutableState;", "", "alphaToolbar", "Landroidx/compose/runtime/MutableState;", "getAlphaToolbar", "()Landroidx/compose/runtime/MutableState;", "setAlphaToolbar", "(Landroidx/compose/runtime/MutableState;)V", "showDialogBinding", "getShowDialogBinding", "setShowDialogBinding", "isCreateSuccess", "setCreateSuccess", "Lo0oo0O0O/o000OO;", "yallaChatSdk$delegate", "Lkotlin/Lazy;", "getYallaChatSdk", "()Lo0oo0O0O/o000OO;", "yallaChatSdk", "_model", "<init>", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class TopicGroupCreateVM extends o0O0O00 {
    public static final int $stable = 8;

    @NotNull
    private MutableState<Boolean> isCreateSuccess;

    @NotNull
    private MutableState<Boolean> showDialogBinding;

    @NotNull
    private TopicGroupInfoModel topicGroupInfoModel;

    /* JADX INFO: renamed from: yallaChatSdk$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy yallaChatSdk;

    @NotNull
    private TopicGroupCreateModel topicGroupCreateModel = new TopicGroupCreateModel();

    @NotNull
    private MutableState<Float> alphaToolbar = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);

    public static final class OooO extends Lambda implements Function1<BaseResp, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResp baseResp) {
            BaseResp it = baseResp;
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.isSuccess()) {
                o0OO000.OooO00o("203002");
                TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
                topicGroupCreateVM.getTopicGroupInfoModel().setType(2);
                p592o0oo00O.OooOOO0.OooO0O0("建群成功！");
                topicGroupCreateVM.isCreateSuccess().setValue(Boolean.TRUE);
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
            topicGroupCreateVM.getGroupCreateVoucher(new com.yalla.yalla.ui.vm.moment.OooO0OO(topicGroupCreateVM));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getBindChatGroupCreateVoucher$1", f = "TopicGroupCreateVM.kt", i = {}, l = {133, 138}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f32396OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32398OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f32399OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getBindChatGroupCreateVoucher$1$1$1", f = "TopicGroupCreateVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ TopicGroupCreateVM f32400OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f32401OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupCreateModel> f32402OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupCreateVM topicGroupCreateVM, ApiResult<TopicGroupCreateModel> apiResult, Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32400OooO0Oo = topicGroupCreateVM;
                this.f32402OooO0o0 = apiResult;
                this.f32401OooO0o = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f32400OooO0Oo, this.f32402OooO0o0, this.f32401OooO0o, continuation);
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
                TopicGroupCreateVM topicGroupCreateVM = this.f32400OooO0Oo;
                topicGroupCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                ApiResult<TopicGroupCreateModel> apiResult = this.f32402OooO0o0;
                if (apiResult.isSuccess()) {
                    p592o0oo00O.OooOOO0.OooO0O0("Binding YallaChat Success");
                    TopicGroupCreateModel data = apiResult.getData();
                    if (data != null) {
                        topicGroupCreateVM.topicGroupCreateModel = data;
                        Function1<TopicGroupCreateModel, Unit> function1 = this.f32401OooO0o;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f32399OooO0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupCreateVM.this.new OooO0O0(this.f32399OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32398OooO0o0;
            TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
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
            topicGroupCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            p0 p0Var = p0.f45072OooO00o;
            long localTopicId = topicGroupCreateVM.getTopicGroupInfoModel().getLocalTopicId();
            String localCredentialCode = topicGroupCreateVM.getTopicGroupInfoModel().getLocalCredentialCode();
            int localBindChatGroupCreateType = topicGroupCreateVM.getTopicGroupInfoModel().getLocalBindChatGroupCreateType();
            this.f32398OooO0o0 = 1;
            obj = p0Var.OooO0O0(localTopicId, localCredentialCode, localBindChatGroupCreateType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupCreateVM, (ApiResult) obj, this.f32399OooO0oO, null);
            this.f32396OooO0Oo = obj;
            this.f32398OooO0o0 = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getGroupCreateVoucher$1", f = "TopicGroupCreateVM.kt", i = {}, l = {99, 100}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Object f32403OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f32405OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f32406OooO0oO;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.TopicGroupCreateVM$getGroupCreateVoucher$1$1$1", f = "TopicGroupCreateVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ TopicGroupCreateVM f32407OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ Function1<TopicGroupCreateModel, Unit> f32408OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupCreateModel> f32409OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public OooO00o(TopicGroupCreateVM topicGroupCreateVM, ApiResult<TopicGroupCreateModel> apiResult, Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f32407OooO0Oo = topicGroupCreateVM;
                this.f32409OooO0o0 = apiResult;
                this.f32408OooO0o = function1;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f32407OooO0Oo, this.f32409OooO0o0, this.f32408OooO0o, continuation);
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
                TopicGroupCreateVM topicGroupCreateVM = this.f32407OooO0Oo;
                topicGroupCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(false));
                ApiResult<TopicGroupCreateModel> apiResult = this.f32409OooO0o0;
                if (apiResult.isSuccess()) {
                    TopicGroupCreateModel data = apiResult.getData();
                    if (data != null) {
                        topicGroupCreateVM.topicGroupCreateModel = data;
                        Function1<TopicGroupCreateModel, Unit> function1 = this.f32408OooO0o;
                        if (function1 != null) {
                            function1.invoke(data);
                        }
                    }
                } else {
                    int code = apiResult.getCode();
                    if (code == 2077) {
                        topicGroupCreateVM.getTopicGroupInfoModel().setLocalBindChatGroupCreateType(2);
                        topicGroupCreateVM.toBindingYallaChat();
                    } else if (code != 2078) {
                        ApiError error = apiResult.getError();
                        Intrinsics.checkNotNullParameter(error, "error");
                        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
                    } else {
                        topicGroupCreateVM.getTopicGroupInfoModel().setLocalBindChatGroupCreateType(1);
                        topicGroupCreateVM.getShowDialogBinding().setValue(Boxing.boxBoolean(true));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Function1<? super TopicGroupCreateModel, Unit> function1, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f32406OooO0oO = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TopicGroupCreateVM.this.new OooO0OO(this.f32406OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f32405OooO0o0;
            TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
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
            topicGroupCreateVM.getShowLoadingDialog().setValue(Boxing.boxBoolean(true));
            p0 p0Var = p0.f45072OooO00o;
            long localTopicId = topicGroupCreateVM.getTopicGroupInfoModel().getLocalTopicId();
            this.f32405OooO0o0 = 1;
            obj = p0Var.OooO0o(localTopicId, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(topicGroupCreateVM, (ApiResult) obj, this.f32406OooO0oO, null);
            this.f32403OooO0Oo = obj;
            this.f32405OooO0o0 = 2;
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
            if (o0000O0O.OooO0o(it.getAuthCode())) {
                TopicGroupCreateVM topicGroupCreateVM = TopicGroupCreateVM.this;
                topicGroupCreateVM.getTopicGroupInfoModel().setLocalCredentialCode(it.getAuthCode());
                topicGroupCreateVM.getBindChatGroupCreateVoucher(new com.yalla.yalla.ui.vm.moment.OooO0o(topicGroupCreateVM));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<o000OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f32411OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000OO invoke() {
            Context context = o000O0.f10354OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            Intrinsics.checkNotNull(activityOooO0O0);
            return new o000OO(activityOooO0O0);
        }
    }

    public TopicGroupCreateVM(@Nullable TopicGroupInfoModel topicGroupInfoModel) {
        this.topicGroupInfoModel = new TopicGroupInfoModel();
        Boolean bool = Boolean.FALSE;
        this.showDialogBinding = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isCreateSuccess = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.yallaChatSdk = LazyKt.lazy(OooOO0.f32411OooO0Oo);
        if (topicGroupInfoModel != null) {
            this.topicGroupInfoModel = topicGroupInfoModel;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getBindChatGroupCreateVoucher(Function1<? super TopicGroupCreateModel, Unit> successListener) {
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0O0(successListener, null));
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
        OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooO0OO(successListener, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getGroupCreateVoucher$default(TopicGroupCreateVM topicGroupCreateVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        topicGroupCreateVM.getGroupCreateVoucher(function1);
    }

    private final o000OO getYallaChatSdk() {
        return (o000OO) this.yallaChatSdk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toGroupCreate() {
        o0OO000.OooO00o("203001");
        o000OO yallaChatSdk = getYallaChatSdk();
        String credential = this.topicGroupCreateModel.getCredentialCode();
        String openId = this.topicGroupCreateModel.getOpenId();
        String localTopicName = this.topicGroupInfoModel.getLocalTopicName();
        String thirdTag = this.topicGroupCreateModel.getThirdTag();
        OooO action = new OooO();
        yallaChatSdk.getClass();
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(action, "action");
        o000OO.OooO00o.OooO00o(o000OO.f56890OooO0O0, new o000O000(yallaChatSdk, credential, openId, null, localTopicName, thirdTag, action));
    }

    public final void checkIsGroupCreate() {
        o000OO.OooO00o.OooO00o(o000OO.f56890OooO0O0, new OooO00o());
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

    public final boolean isAdequateCreateDaysCount() {
        return this.topicGroupInfoModel.getCreateDay() >= this.topicGroupInfoModel.getCreateDayMin();
    }

    public final boolean isAdequateFollowedCount() {
        return this.topicGroupInfoModel.getFollowedCount() >= this.topicGroupInfoModel.getFollowedCountMin();
    }

    @NotNull
    public final MutableState<Boolean> isCreateSuccess() {
        return this.isCreateSuccess;
    }

    public final void setAlphaToolbar(@NotNull MutableState<Float> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.alphaToolbar = mutableState;
    }

    public final void setCreateSuccess(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.isCreateSuccess = mutableState;
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
        getYallaChatSdk().OooO00o(new OooO0o());
    }
}
