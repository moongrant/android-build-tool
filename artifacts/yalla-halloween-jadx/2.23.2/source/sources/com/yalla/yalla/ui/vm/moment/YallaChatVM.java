package com.yalla.yalla.ui.vm.moment;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import androidx.compose.material.TextFieldImplKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.code.android.util.o000O00O;
import com.code.android.util.o00oO0o;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.FriendChatModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.topic.TopicGroupCreateModel;
import com.yalla.yalla.model.topic.TopicGroupInfoModel;
import com.yalla.yalla.model.topic.TopicGroupJoinModel;
import com.yalla.yalla.model.topic.TopicInfoModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import io.agora.rtc.Constants;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.o00O0O;
import p412o0Oo0o0O.o0O00OOO;
import p423o0OoO0OO.o00O00OO;
import p614o0oo0o.o000oOoO;
import p650o0ooo.p5;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u000fJ*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R(\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u00109\u001a\b\u0012\u0004\u0012\u000202018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R$\u0010<\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/YallaChatVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/model/FriendChatModel;", "friendChat", "", "yallaChatBindAndFriendChat", "yallaChatLogin", "data", "toYallaChat", "", "yallaChatAuthCode", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/AccountBindResult;", "bindChat", "", "circleId", "Lcom/yalla/yalla/model/topic/TopicGroupCreateModel;", "createGroup", "code", "", "type", "bindChatCreateGroup", "getGroupInfo", "Lcom/yalla/yalla/model/topic/TopicGroupInfoModel;", "Lcom/yalla/yalla/model/topic/TopicGroupJoinModel;", "joinGroup", "bindChatJoinGroup", "friendId", "friendYallaChat", "bindChatFriendYallaChat", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "topicInfoModel", "Lcom/yalla/yalla/model/topic/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/topic/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/topic/TopicInfoModel;)V", "Landroidx/lifecycle/MutableLiveData;", "topicGroupInfoModel", "Landroidx/lifecycle/MutableLiveData;", "getTopicGroupInfoModel", "()Landroidx/lifecycle/MutableLiveData;", "Lo0oo0o/o000oOoO;", "yallaChatSdk$delegate", "Lkotlin/Lazy;", "getYallaChatSdk", "()Lo0oo0o/o000oOoO;", "yallaChatSdk", "Landroidx/compose/runtime/MutableState;", "", "yallaChatDialogBindShow", "Landroidx/compose/runtime/MutableState;", "getYallaChatDialogBindShow", "()Landroidx/compose/runtime/MutableState;", "setYallaChatDialogBindShow", "(Landroidx/compose/runtime/MutableState;)V", "yallaChatDialogFriendNoBindShow", "getYallaChatDialogFriendNoBindShow", "setYallaChatDialogFriendNoBindShow", "friendChatModel", "Lcom/yalla/yalla/model/FriendChatModel;", "getFriendChatModel", "()Lcom/yalla/yalla/model/FriendChatModel;", "setFriendChatModel", "(Lcom/yalla/yalla/model/FriendChatModel;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class YallaChatVM extends p394o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @Nullable
    private FriendChatModel friendChatModel;

    @Nullable
    private TopicInfoModel topicInfoModel;

    @NotNull
    private MutableState<Boolean> yallaChatDialogBindShow;

    @NotNull
    private MutableState<Boolean> yallaChatDialogFriendNoBindShow;

    @NotNull
    private final MutableLiveData<TopicGroupInfoModel> topicGroupInfoModel = new MutableLiveData<>();

    /* JADX INFO: renamed from: yallaChatSdk$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy yallaChatSdk = LazyKt.lazy(Oooo0.f31977OooO0Oo);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatJoinGroup$1", f = "YallaChatVM.kt", i = {}, l = {Constants.ERR_ALREADY_IN_RECORDING, Constants.ERR_ALREADY_IN_RECORDING}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupJoinModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31934OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31935OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31936OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31937OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31938OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, String str, int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f31935OooO0o = j;
            this.f31937OooO0oO = str;
            this.f31938OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f31935OooO0o, this.f31937OooO0oO, this.f31938OooO0oo, continuation);
            oooO.f31936OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicGroupJoinModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31934OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31936OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31936OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long j = this.f31935OooO0o;
            String str = this.f31937OooO0oO;
            int i2 = this.f31938OooO0oo;
            this.f31936OooO0o0 = liveDataScope;
            this.f31934OooO0Oo = 1;
            obj = o0o00ooo2.OooO0Oo(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31936OooO0o0 = null;
            this.f31934OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<MutableState<Boolean>, Composer, Integer, Unit> {
        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(MutableState<Boolean> mutableState, Composer composer, Integer num) {
            MutableState<Boolean> it = mutableState;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1334849081, iIntValue, -1, "com.yalla.yalla.ui.vm.moment.YallaChatVM.<anonymous> (YallaChatVM.kt:39)");
                }
                p5 p5Var = p5.f59107OooO00o;
                YallaChatVM yallaChatVM = YallaChatVM.this;
                p5Var.OooO00o(yallaChatVM.getYallaChatDialogBindShow(), new com.yalla.yalla.ui.vm.moment.OooOO0O(yallaChatVM), composer2, 384, 0);
                p5Var.OooO0O0(yallaChatVM.getYallaChatDialogFriendNoBindShow(), null, composer2, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChat$1", f = "YallaChatVM.kt", i = {}, l = {93, 93}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountBindResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31940OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31941OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31942OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f31941OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f31941OooO0o, continuation);
            oooO0O0.f31942OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<AccountBindResult>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31940OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31942OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31942OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            this.f31942OooO0o0 = liveDataScope;
            this.f31940OooO0Oo = 1;
            obj = o0o00ooo2.OooO00o(this.f31941OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31942OooO0o0 = null;
            this.f31940OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatCreateGroup$1", f = "YallaChatVM.kt", i = {}, l = {111, 111}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupCreateModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31943OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31944OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31945OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31946OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31947OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, String str, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f31944OooO0o = j;
            this.f31946OooO0oO = str;
            this.f31947OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f31944OooO0o, this.f31946OooO0oO, this.f31947OooO0oo, continuation);
            oooO0OO.f31945OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicGroupCreateModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31943OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31945OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31945OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long j = this.f31944OooO0o;
            String str = this.f31946OooO0oO;
            int i2 = this.f31947OooO0oo;
            this.f31945OooO0o0 = liveDataScope;
            this.f31943OooO0Oo = 1;
            obj = o0o00ooo2.OooO0O0(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31945OooO0o0 = null;
            this.f31943OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatFriendYallaChat$1", f = "YallaChatVM.kt", i = {0}, l = {183, 185}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendChatModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31948OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31949OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31950OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31951OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ int f31952OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, String str, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31949OooO0o = j;
            this.f31951OooO0oO = str;
            this.f31952OooO0oo = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f31949OooO0o, this.f31951OooO0oO, this.f31952OooO0oo, continuation);
            oooO0o.f31950OooO0o0 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FriendChatModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31948OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31950OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31950OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long j = this.f31949OooO0o;
            String str = this.f31951OooO0oO;
            int i2 = this.f31952OooO0oo;
            this.f31950OooO0o0 = liveDataScope;
            this.f31948OooO0Oo = 1;
            obj = o0o00ooo2.OooO0OO(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31950OooO0o0 = null;
            this.f31948OooO0Oo = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$createGroup$1", f = "YallaChatVM.kt", i = {}, l = {101, 101}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupCreateModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31953OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31954OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31955OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31954OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f31954OooO0o, continuation);
            oooOO1.f31955OooO0o0 = obj;
            return oooOO1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicGroupCreateModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31953OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31955OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31955OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            this.f31955OooO0o0 = liveDataScope;
            this.f31953OooO0Oo = 1;
            obj = o0o00ooo2.OooO0o(this.f31954OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31955OooO0o0 = null;
            this.f31953OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$friendYallaChat$1", f = "YallaChatVM.kt", i = {0}, l = {170, 172}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendChatModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31956OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31957OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31958OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31957OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f31957OooO0o, continuation);
            oooOO0O.f31958OooO0o0 = obj;
            return oooOO0O;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<FriendChatModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31956OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31958OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31958OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            this.f31958OooO0o0 = liveDataScope;
            this.f31956OooO0Oo = 1;
            obj = o0o00ooo2.OooO0oO(this.f31957OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31958OooO0o0 = null;
            this.f31956OooO0Oo = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$2", f = "YallaChatVM.kt", i = {}, l = {142, 142}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupInfoModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31959OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31960OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31961OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(long j, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f31960OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f31960OooO0o, continuation);
            oooOOO.f31961OooO0o0 = obj;
            return oooOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicGroupInfoModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31959OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31961OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31961OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            this.f31961OooO0o0 = liveDataScope;
            this.f31959OooO0Oo = 1;
            obj = o0o00ooo2.OooO0o0(this.f31960OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31961OooO0o0 = null;
            this.f31959OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$1$1", f = "YallaChatVM.kt", i = {}, l = {120, 121}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31962OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f31963OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f31964OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$1$1$1", f = "YallaChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupInfoModel> f31965OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ TopicInfoModel f31966OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ YallaChatVM f31967OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<TopicGroupInfoModel> apiResult, YallaChatVM yallaChatVM, TopicInfoModel topicInfoModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31965OooO0Oo = apiResult;
                this.f31967OooO0o0 = yallaChatVM;
                this.f31966OooO0o = topicInfoModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f31965OooO0Oo, this.f31967OooO0o0, this.f31966OooO0o, continuation);
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
                TopicGroupInfoModel data = this.f31965OooO0Oo.getData();
                if (data != null) {
                    TopicInfoModel topicInfoModel = this.f31966OooO0o;
                    data.setLocalTopicId(topicInfoModel.getId());
                    data.setLocalPosition(topicInfoModel.getPositionid());
                    data.setLocalTopicName(topicInfoModel.getName());
                    this.f31967OooO0o0.getTopicGroupInfoModel().setValue(data);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(TopicInfoModel topicInfoModel, YallaChatVM yallaChatVM, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31964OooO0o0 = topicInfoModel;
            this.f31963OooO0o = yallaChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f31964OooO0o0, this.f31963OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31962OooO0Oo;
            TopicInfoModel topicInfoModel = this.f31964OooO0o0;
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
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            long id = topicInfoModel.getId();
            this.f31962OooO0Oo = 1;
            obj = o0o00ooo2.OooO0o0(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o((ApiResult) obj, this.f31963OooO0o, topicInfoModel, null);
            this.f31962OooO0Oo = 2;
            if (com.code.android.util.OooOOO.OooO0o0(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$joinGroup$1", f = "YallaChatVM.kt", i = {}, l = {TextFieldImplKt.AnimationDuration, TextFieldImplKt.AnimationDuration}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupJoinModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31968OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f31969OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31970OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f31969OooO0o = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f31969OooO0o, continuation);
            oooOOOO.f31970OooO0o0 = obj;
            return oooOOOO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<TopicGroupJoinModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31968OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31970OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31970OooO0o0;
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            this.f31970OooO0o0 = liveDataScope;
            this.f31968OooO0Oo = 1;
            obj = o0o00ooo2.OooO0oo(this.f31969OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31970OooO0o0 = null;
            this.f31968OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$yallaChatBindAndFriendChat$1", f = "YallaChatVM.kt", i = {}, l = {64, 69}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31971OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f31972OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ FriendChatModel f31973OooO0o0;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$yallaChatBindAndFriendChat$1$1", f = "YallaChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<FriendChatModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public /* synthetic */ Object f31974OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ YallaChatVM f31975OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(YallaChatVM yallaChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f31975OooO0o0 = yallaChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f31975OooO0o0, continuation);
                oooO00o.f31974OooO0Oo = obj;
                return oooO00o;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FriendChatModel friendChatModel, Continuation<? super Unit> continuation) {
                return ((OooO00o) create(friendChatModel, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                FriendChatModel friendChatModel = (FriendChatModel) this.f31974OooO0Oo;
                if (friendChatModel != null) {
                    this.f31975OooO0o0.toYallaChat(friendChatModel);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(FriendChatModel friendChatModel, YallaChatVM yallaChatVM, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f31973OooO0o0 = friendChatModel;
            this.f31972OooO0o = yallaChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f31973OooO0o0, this.f31972OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31971OooO0Oo;
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
            o0O00OOO o0o00ooo2 = o0O00OOO.f46288OooO00o;
            FriendChatModel friendChatModel = this.f31973OooO0o0;
            long localUserId = friendChatModel.getLocalUserId();
            String localAuthCode = friendChatModel.getLocalAuthCode();
            int localBindChatFriendChatType = friendChatModel.getLocalBindChatFriendChatType();
            this.f31971OooO0Oo = 1;
            obj = o0o00ooo2.OooO0OO(localUserId, localAuthCode, localBindChatFriendChatType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ApiResult apiResult = (ApiResult) obj;
            OooO00o oooO00o = new OooO00o(this.f31972OooO0o, null);
            this.f31971OooO0Oo = 2;
            if (o00O0O.OooO0OO(apiResult, false, null, null, oooO00o, this, 7) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<BaseResp, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOo00 f31976OooO0Oo = new OooOo00();

        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(BaseResp baseResp) {
            BaseResp it = baseResp;
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<o000oOoO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo0 f31977OooO0Oo = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000oOoO invoke() {
            Context context = o000O00O.f13421OooO00o;
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            Intrinsics.checkNotNull(activityOooO0O0);
            return new o000oOoO(activityOooO0O0);
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<AuthResponse, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FriendChatModel f31978OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f31979OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(YallaChatVM yallaChatVM, FriendChatModel friendChatModel) {
            super(1);
            this.f31978OooO0Oo = friendChatModel;
            this.f31979OooO0o0 = yallaChatVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AuthResponse authResponse) {
            AuthResponse it = authResponse;
            Intrinsics.checkNotNullParameter(it, "it");
            if (o00O00OO.OooO0o(it.getAuthCode())) {
                String authCode = it.getAuthCode();
                FriendChatModel friendChatModel = this.f31978OooO0Oo;
                friendChatModel.setLocalAuthCode(authCode);
                this.f31979OooO0o0.yallaChatBindAndFriendChat(friendChatModel);
            }
            return Unit.INSTANCE;
        }
    }

    public YallaChatVM() {
        Boolean bool = Boolean.FALSE;
        this.yallaChatDialogBindShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.yallaChatDialogFriendNoBindShow = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Context context = o000O00O.f13421OooO00o;
        ComponentCallbacks2 componentCallbacks2OooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        p404o0Oo0OO0.o00O0O o00o0o2 = componentCallbacks2OooO0O0 instanceof p404o0Oo0OO0.o00O0O ? (p404o0Oo0OO0.o00O0O) componentCallbacks2OooO0O0 : null;
        if (o00o0o2 != null) {
            o00o0o2.showDialog(null, ComposableLambdaKt.composableLambdaInstance(1334849081, true, new OooO00o()));
        }
    }

    private final o000oOoO getYallaChatSdk() {
        return (o000oOoO) this.yallaChatSdk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yallaChatBindAndFriendChat(FriendChatModel friendChat) {
        com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooOo(friendChat, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<AccountBindResult>> bindChat(@NotNull String yallaChatAuthCode) {
        Intrinsics.checkNotNullParameter(yallaChatAuthCode, "yallaChatAuthCode");
        return o00oO0o.OooO00o(new OooO0O0(yallaChatAuthCode, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupCreateModel>> bindChatCreateGroup(long circleId, @NotNull String code, int type) {
        Intrinsics.checkNotNullParameter(code, "code");
        return o00oO0o.OooO00o(new OooO0OO(circleId, code, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<FriendChatModel>> bindChatFriendYallaChat(long friendId, @NotNull String code, int type) {
        Intrinsics.checkNotNullParameter(code, "code");
        return o00oO0o.OooO00o(new OooO0o(friendId, code, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupJoinModel>> bindChatJoinGroup(long circleId, @NotNull String code, int type) {
        Intrinsics.checkNotNullParameter(code, "code");
        return o00oO0o.OooO00o(new OooO(circleId, code, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupCreateModel>> createGroup(long circleId) {
        return o00oO0o.OooO00o(new OooOO0(circleId, null));
    }

    @NotNull
    public final LiveData<ApiResult<FriendChatModel>> friendYallaChat(long friendId) {
        return o00oO0o.OooO00o(new OooOO0O(friendId, null));
    }

    @Nullable
    public final FriendChatModel getFriendChatModel() {
        return this.friendChatModel;
    }

    public final void getGroupInfo() {
        TopicInfoModel topicInfoModel = this.topicInfoModel;
        if (topicInfoModel != null) {
            com.code.android.util.OooOOO.OooO0O0(ViewModelKt.getViewModelScope(this), new OooOOO0(topicInfoModel, this, null));
        }
    }

    @NotNull
    public final MutableLiveData<TopicGroupInfoModel> getTopicGroupInfoModel() {
        return this.topicGroupInfoModel;
    }

    @Nullable
    public final TopicInfoModel getTopicInfoModel() {
        return this.topicInfoModel;
    }

    @NotNull
    public final MutableState<Boolean> getYallaChatDialogBindShow() {
        return this.yallaChatDialogBindShow;
    }

    @NotNull
    public final MutableState<Boolean> getYallaChatDialogFriendNoBindShow() {
        return this.yallaChatDialogFriendNoBindShow;
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupJoinModel>> joinGroup(long circleId) {
        return o00oO0o.OooO00o(new OooOOOO(circleId, null));
    }

    public final void setFriendChatModel(@Nullable FriendChatModel friendChatModel) {
        this.friendChatModel = friendChatModel;
    }

    public final void setTopicInfoModel(@Nullable TopicInfoModel topicInfoModel) {
        this.topicInfoModel = topicInfoModel;
    }

    public final void setYallaChatDialogBindShow(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.yallaChatDialogBindShow = mutableState;
    }

    public final void setYallaChatDialogFriendNoBindShow(@NotNull MutableState<Boolean> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.yallaChatDialogFriendNoBindShow = mutableState;
    }

    public final void toYallaChat(@NotNull FriendChatModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        o000oOoO yallaChatSdk = getYallaChatSdk();
        String credential = data.getCredentialCode();
        String openId = data.getOpenId();
        String targetOpenId = data.getFriendOpenId();
        String localUserName = data.getLocalUserName();
        OooOo00 action = OooOo00.f31976OooO0Oo;
        yallaChatSdk.getClass();
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(targetOpenId, "targetOpenId");
        Intrinsics.checkNotNullParameter(action, "action");
        o000oOoO.OooO00o.OooO00o(o000oOoO.f57513OooO0O0, new p614o0oo0o.o00O0O(yallaChatSdk, credential, openId, targetOpenId, localUserName, action));
    }

    public final void yallaChatLogin() {
        FriendChatModel friendChatModel = this.friendChatModel;
        if (friendChatModel == null) {
            return;
        }
        getYallaChatSdk().OooO00o(new Oooo000(this, friendChatModel));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupInfoModel>> getGroupInfo(long circleId) {
        return o00oO0o.OooO00o(new OooOOO(circleId, null));
    }
}
