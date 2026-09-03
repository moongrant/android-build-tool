package com.yalla.yalla.ui.vm.moment;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.AccountBindResult;
import com.yalla.yalla.model.FriendChatModel;
import com.yalla.yalla.model.TopicGroupCreateModel;
import com.yalla.yalla.model.TopicGroupInfoModel;
import com.yalla.yalla.model.TopicGroupJoinModel;
import com.yalla.yalla.model.TopicInfoModel;
import com.yallatech.support.platform.base.BaseResp;
import com.yallatech.support.platform.login.bean.AuthResponse;
import io.agora.rtc.Constants;
import java.util.Objects;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.o000oOoO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p031OoooO.o0000O;
import p043OooooO0.o00O0000;
import p100o000oOoO.o00O000;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.o0OOO00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p520o0o0O0O0.o0oOO;
import p522o0o0O0o.o00O0;
import p579o0oOoOOo.t1;
import p623o0oo0oO0.o0000oo;
import p623o0oo0oO0.o000OO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bB\u0010CJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b2\u0006\u0010\n\u001a\u00020\tJ\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ*\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0004J\u001a\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ\u001a\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000fJ*\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\f0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014J\u001a\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u000fJ*\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014R$\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R(\u0010?\u001a\b\u0012\u0004\u0012\u000208078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010>¨\u0006D"}, d2 = {"Lcom/yalla/yalla/ui/vm/moment/YallaChatVM;", "Lo00OO/OooO00o;", "Lcom/yalla/yalla/model/FriendChatModel;", "friendChat", "", "yallaChatBindAndFriendChat", "yallaChatLogin", "data", "toYallaChat", "", "yallaChatAuthCode", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/model/AccountBindResult;", "bindChat", "", "circleId", "Lcom/yalla/yalla/model/TopicGroupCreateModel;", "createGroup", "code", "", "type", "bindChatCreateGroup", "getGroupInfo", "Lcom/yalla/yalla/model/TopicGroupInfoModel;", "Lcom/yalla/yalla/model/TopicGroupJoinModel;", "joinGroup", "bindChatJoinGroup", "friendId", "friendYallaChat", "bindChatFriendYallaChat", "Lcom/yalla/yalla/model/TopicInfoModel;", "topicInfoModel", "Lcom/yalla/yalla/model/TopicInfoModel;", "getTopicInfoModel", "()Lcom/yalla/yalla/model/TopicInfoModel;", "setTopicInfoModel", "(Lcom/yalla/yalla/model/TopicInfoModel;)V", "Landroidx/lifecycle/MutableLiveData;", "topicGroupInfoModel", "Landroidx/lifecycle/MutableLiveData;", "getTopicGroupInfoModel", "()Landroidx/lifecycle/MutableLiveData;", "Lo0oo0oO0/o0000O0;", "yallaChatSdk$delegate", "Lkotlin/Lazy;", "getYallaChatSdk", "()Lo0oo0oO0/o0000O0;", "yallaChatSdk", "friendChatModel", "Lcom/yalla/yalla/model/FriendChatModel;", "getFriendChatModel", "()Lcom/yalla/yalla/model/FriendChatModel;", "setFriendChatModel", "(Lcom/yalla/yalla/model/FriendChatModel;)V", "Lo000oOoO/o0O00OO;", "", "yallaChatDialogBindShow", "Lo000oOoO/o0O00OO;", "getYallaChatDialogBindShow", "()Lo000oOoO/o0O00OO;", "setYallaChatDialogBindShow", "(Lo000oOoO/o0O00OO;)V", "yallaChatDialogFriendNoBindShow", "getYallaChatDialogFriendNoBindShow", "setYallaChatDialogFriendNoBindShow", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class YallaChatVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @Nullable
    private FriendChatModel friendChatModel;

    @Nullable
    private TopicInfoModel topicInfoModel;

    @NotNull
    private o0O00OO<Boolean> yallaChatDialogBindShow;

    @NotNull
    private o0O00OO<Boolean> yallaChatDialogFriendNoBindShow;

    @NotNull
    private final MutableLiveData<TopicGroupInfoModel> topicGroupInfoModel = new MutableLiveData<>();

    /* JADX INFO: renamed from: yallaChatSdk$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy yallaChatSdk = LazyKt.lazy(Oooo0.f26036Oooo0o);

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatJoinGroup$1", f = "YallaChatVM.kt", i = {}, l = {161, 161}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupJoinModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f25993Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25994Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f25995Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f25996Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f25997OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, String str, int i, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f25996Oooo0oo = j;
            this.f25993Oooo = str;
            this.f25997OoooO00 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f25996Oooo0oo, this.f25993Oooo, this.f25997OoooO00, continuation);
            oooO.f25995Oooo0oO = obj;
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
            int i = this.f25994Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f25995Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f25995Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f25996Oooo0oo;
            String str = this.f25993Oooo;
            int i2 = this.f25997OoooO00;
            this.f25995Oooo0oO = liveDataScope;
            this.f25994Oooo0o = 1;
            obj = o0ooo2.OooO0Oo(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f25995Oooo0oO = null;
            this.f25994Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function3<o0O00OO<Boolean>, oOO00O, Integer, Unit> {
        public OooO00o() {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(o0O00OO<Boolean> o0o00oo2, oOO00O ooo00o, Integer num) {
            o0O00OO<Boolean> it = o0o00oo2;
            oOO00O ooo00o2 = ooo00o;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(it, "it");
            if ((iIntValue & 81) == 16 && ooo00o2.OooOo0()) {
                ooo00o2.OooOoo0();
            } else {
                Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
                t1 t1Var = t1.f46310OooO00o;
                t1Var.OooO00o(YallaChatVM.this.getYallaChatDialogBindShow(), new com.yalla.yalla.ui.vm.moment.OooOO0(YallaChatVM.this), ooo00o2, 384, 0);
                t1Var.OooO0O0(YallaChatVM.this.getYallaChatDialogFriendNoBindShow(), null, ooo00o2, 384, 2);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChat$1", f = "YallaChatVM.kt", i = {}, l = {94, 94}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<AccountBindResult>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f25999Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26000Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f26001Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26001Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f26001Oooo0oo, continuation);
            oooO0O0.f26000Oooo0oO = obj;
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
            int i = this.f25999Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26000Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26000Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            String str = this.f26001Oooo0oo;
            this.f26000Oooo0oO = liveDataScope;
            this.f25999Oooo0o = 1;
            obj = o0ooo2.OooO00o(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26000Oooo0oO = null;
            this.f25999Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatCreateGroup$1", f = "YallaChatVM.kt", i = {}, l = {112, 112}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupCreateModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f26002Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26003Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26004Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26005Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f26006OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(long j, String str, int i, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f26005Oooo0oo = j;
            this.f26002Oooo = str;
            this.f26006OoooO00 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f26005Oooo0oo, this.f26002Oooo, this.f26006OoooO00, continuation);
            oooO0OO.f26004Oooo0oO = obj;
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
            int i = this.f26003Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26004Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26004Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26005Oooo0oo;
            String str = this.f26002Oooo;
            int i2 = this.f26006OoooO00;
            this.f26004Oooo0oO = liveDataScope;
            this.f26003Oooo0o = 1;
            obj = o0ooo2.OooO0O0(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26004Oooo0oO = null;
            this.f26003Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$bindChatFriendYallaChat$1", f = "YallaChatVM.kt", i = {0}, l = {184, 186}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendChatModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f26007Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26008Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26009Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26010Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ int f26011OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(long j, String str, int i, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f26010Oooo0oo = j;
            this.f26007Oooo = str;
            this.f26011OoooO00 = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = new OooO0o(this.f26010Oooo0oo, this.f26007Oooo, this.f26011OoooO00, continuation);
            oooO0o.f26009Oooo0oO = obj;
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
            int i = this.f26008Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26009Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26009Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26010Oooo0oo;
            String str = this.f26007Oooo;
            int i2 = this.f26011OoooO00;
            this.f26009Oooo0oO = liveDataScope;
            this.f26008Oooo0o = 1;
            obj = o0ooo2.OooO0OO(j, str, i2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26009Oooo0oO = null;
            this.f26008Oooo0o = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$createGroup$1", f = "YallaChatVM.kt", i = {}, l = {102, 102}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupCreateModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26012Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26013Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26014Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(long j, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f26014Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0 oooOO1 = new OooOO0(this.f26014Oooo0oo, continuation);
            oooOO1.f26013Oooo0oO = obj;
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
            int i = this.f26012Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26013Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26013Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26014Oooo0oo;
            this.f26013Oooo0oO = liveDataScope;
            this.f26012Oooo0o = 1;
            obj = o0ooo2.OooO0o(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26013Oooo0oO = null;
            this.f26012Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$friendYallaChat$1", f = "YallaChatVM.kt", i = {0}, l = {171, 173}, m = "invokeSuspend", n = {"$this$liveDataAsync"}, s = {"L$0"})
    public static final class OooOO0O extends SuspendLambda implements Function2<LiveDataScope<ApiResult<FriendChatModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26015Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26016Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26017Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(long j, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f26017Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOO0O oooOO0O = new OooOO0O(this.f26017Oooo0oo, continuation);
            oooOO0O.f26016Oooo0oO = obj;
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
            int i = this.f26015Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26016Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26016Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26017Oooo0oo;
            this.f26016Oooo0oO = liveDataScope;
            this.f26015Oooo0o = 1;
            obj = o0ooo2.OooO0oO(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26016Oooo0oO = null;
            this.f26015Oooo0o = 2;
            if (liveDataScope.emit((ApiResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$2", f = "YallaChatVM.kt", i = {}, l = {143, 143}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupInfoModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26018Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26019Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26020Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(long j, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f26020Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOO oooOOO = new OooOOO(this.f26020Oooo0oo, continuation);
            oooOOO.f26019Oooo0oO = obj;
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
            int i = this.f26018Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26019Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26019Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26020Oooo0oo;
            this.f26019Oooo0oO = liveDataScope;
            this.f26018Oooo0o = 1;
            obj = o0ooo2.OooO0o0(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26019Oooo0oO = null;
            this.f26018Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$1$1", f = "YallaChatVM.kt", i = {}, l = {121, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26021Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ TopicInfoModel f26022Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f26023Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$getGroupInfo$1$1$1", f = "YallaChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ ApiResult<TopicGroupInfoModel> f26024Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ YallaChatVM f26025Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ TopicInfoModel f26026Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ApiResult<TopicGroupInfoModel> apiResult, YallaChatVM yallaChatVM, TopicInfoModel topicInfoModel, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f26024Oooo0o = apiResult;
                this.f26025Oooo0oO = yallaChatVM;
                this.f26026Oooo0oo = topicInfoModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f26024Oooo0o, this.f26025Oooo0oO, this.f26026Oooo0oo, continuation);
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
                ApiResult<TopicGroupInfoModel> apiResult = this.f26024Oooo0o;
                YallaChatVM yallaChatVM = this.f26025Oooo0oO;
                TopicInfoModel topicInfoModel = this.f26026Oooo0oo;
                TopicGroupInfoModel data = apiResult.getData();
                if (data != null) {
                    data.setLocalTopicId(topicInfoModel.getId());
                    data.setLocalPosition(topicInfoModel.getPositionid());
                    data.setLocalTopicName(topicInfoModel.getName());
                    yallaChatVM.getTopicGroupInfoModel().setValue(data);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(TopicInfoModel topicInfoModel, YallaChatVM yallaChatVM, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f26022Oooo0oO = topicInfoModel;
            this.f26023Oooo0oo = yallaChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO0(this.f26022Oooo0oO, this.f26023Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26021Oooo0o;
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
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long id = this.f26022Oooo0oO.getId();
            this.f26021Oooo0o = 1;
            obj = o0ooo2.OooO0o0(id, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o((ApiResult) obj, this.f26023Oooo0oo, this.f26022Oooo0oO, null);
            this.f26021Oooo0o = 2;
            if (o0000O0.OooO0Oo(oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$joinGroup$1", f = "YallaChatVM.kt", i = {}, l = {Constants.ERR_PUBLISH_STREAM_CDN_ERROR, Constants.ERR_PUBLISH_STREAM_CDN_ERROR}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<TopicGroupJoinModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26027Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f26028Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ long f26029Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(long j, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f26029Oooo0oo = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOOOO oooOOOO = new OooOOOO(this.f26029Oooo0oo, continuation);
            oooOOOO.f26028Oooo0oO = obj;
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
            int i = this.f26027Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f26028Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f26028Oooo0oO;
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long j = this.f26029Oooo0oo;
            this.f26028Oooo0oO = liveDataScope;
            this.f26027Oooo0o = 1;
            obj = o0ooo2.OooO0oo(j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f26028Oooo0oO = null;
            this.f26027Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$yallaChatBindAndFriendChat$1", f = "YallaChatVM.kt", i = {}, l = {65, 70}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26030Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ FriendChatModel f26031Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f26032Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.moment.YallaChatVM$yallaChatBindAndFriendChat$1$1", f = "YallaChatVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<FriendChatModel, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public /* synthetic */ Object f26033Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ YallaChatVM f26034Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(YallaChatVM yallaChatVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f26034Oooo0oO = yallaChatVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f26034Oooo0oO, continuation);
                oooO00o.f26033Oooo0o = obj;
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
                FriendChatModel friendChatModel = (FriendChatModel) this.f26033Oooo0o;
                if (friendChatModel != null) {
                    this.f26034Oooo0oO.toYallaChat(friendChatModel);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(FriendChatModel friendChatModel, YallaChatVM yallaChatVM, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f26031Oooo0oO = friendChatModel;
            this.f26032Oooo0oo = yallaChatVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo(this.f26031Oooo0oO, this.f26032Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26030Oooo0o;
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
            o0oOO o0ooo2 = o0oOO.f42858OooO00o;
            long localUserId = this.f26031Oooo0oO.getLocalUserId();
            String localAuthCode = this.f26031Oooo0oO.getLocalAuthCode();
            int localBindChatFriendChatType = this.f26031Oooo0oO.getLocalBindChatFriendChatType();
            this.f26030Oooo0o = 1;
            obj = o0ooo2.OooO0OO(localUserId, localAuthCode, localBindChatFriendChatType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            OooO00o oooO00o = new OooO00o(this.f26032Oooo0oo, null);
            this.f26030Oooo0o = 2;
            if (o000oOoO.OooO0O0((ApiResult) obj, false, (7 & 2) != 0 ? null : null, null, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<BaseResp, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooOo00 f26035Oooo0o = new OooOo00();

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

    public static final class Oooo0 extends Lambda implements Function0<p623o0oo0oO0.o0000O0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo0 f26036Oooo0o = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p623o0oo0oO0.o0000O0 invoke() {
            Context contextOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
            if (contextOooO0O0 == null && (contextOooO0O0 = o0000O.f2657OooO00o) == null) {
                Intrinsics.throwUninitializedPropertyAccessException(d.R);
                contextOooO0O0 = null;
            }
            return new p623o0oo0oO0.o0000O0(contextOooO0O0);
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<AuthResponse, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ FriendChatModel f26037Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ YallaChatVM f26038Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(FriendChatModel friendChatModel, YallaChatVM yallaChatVM) {
            super(1);
            this.f26037Oooo0o = friendChatModel;
            this.f26038Oooo0oO = yallaChatVM;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AuthResponse authResponse) {
            AuthResponse it = authResponse;
            Intrinsics.checkNotNullParameter(it, "it");
            if (o00O0.OooO0o0(it.getAuthCode())) {
                this.f26037Oooo0o.setLocalAuthCode(it.getAuthCode());
                this.f26038Oooo0oO.yallaChatBindAndFriendChat(this.f26037Oooo0o);
            }
            return Unit.INSTANCE;
        }
    }

    public YallaChatVM() {
        Boolean bool = Boolean.FALSE;
        this.yallaChatDialogBindShow = o0OOO00.OooO0Oo(bool);
        this.yallaChatDialogFriendNoBindShow = o0OOO00.OooO0Oo(bool);
        Object objOooO0O0 = com.yalla.support.common.util.OooO0O0.f20502OooO00o.OooO0O0();
        if (objOooO0O0 == null && (objOooO0O0 = o0000O.f2657OooO00o) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(d.R);
            objOooO0O0 = null;
        }
        o00OOO00.OooOO0O oooOO0O = objOooO0O0 instanceof o00OOO00.OooOO0O ? (o00OOO00.OooOO0O) objOooO0O0 : null;
        if (oooOO0O != null) {
            oooOO0O.showDialog(null, o00O0000.OooO0O0(1334849081, true, new OooO00o()));
        }
    }

    private final p623o0oo0oO0.o0000O0 getYallaChatSdk() {
        return (p623o0oo0oO0.o0000O0) this.yallaChatSdk.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void yallaChatBindAndFriendChat(FriendChatModel friendChat) {
        o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooOo(friendChat, this, null));
    }

    @NotNull
    public final LiveData<ApiResult<AccountBindResult>> bindChat(@NotNull String yallaChatAuthCode) {
        Intrinsics.checkNotNullParameter(yallaChatAuthCode, "yallaChatAuthCode");
        return o0000O0O.OooO00o(new OooO0O0(yallaChatAuthCode, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupCreateModel>> bindChatCreateGroup(long circleId, @NotNull String code2, int type) {
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO0OO(circleId, code2, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<FriendChatModel>> bindChatFriendYallaChat(long friendId, @NotNull String code2, int type) {
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO0o(friendId, code2, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupJoinModel>> bindChatJoinGroup(long circleId, @NotNull String code2, int type) {
        Intrinsics.checkNotNullParameter(code2, "code");
        return o0000O0O.OooO00o(new OooO(circleId, code2, type, null));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupCreateModel>> createGroup(long circleId) {
        return o0000O0O.OooO00o(new OooOO0(circleId, null));
    }

    @NotNull
    public final LiveData<ApiResult<FriendChatModel>> friendYallaChat(long friendId) {
        return o0000O0O.OooO00o(new OooOO0O(friendId, null));
    }

    @Nullable
    public final FriendChatModel getFriendChatModel() {
        return this.friendChatModel;
    }

    public final void getGroupInfo() {
        TopicInfoModel topicInfoModel = this.topicInfoModel;
        if (topicInfoModel != null) {
            o0000O0.OooO00o(ViewModelKt.getViewModelScope(this), new OooOOO0(topicInfoModel, this, null));
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
    public final o0O00OO<Boolean> getYallaChatDialogBindShow() {
        return this.yallaChatDialogBindShow;
    }

    @NotNull
    public final o0O00OO<Boolean> getYallaChatDialogFriendNoBindShow() {
        return this.yallaChatDialogFriendNoBindShow;
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupJoinModel>> joinGroup(long circleId) {
        return o0000O0O.OooO00o(new OooOOOO(circleId, null));
    }

    public final void setFriendChatModel(@Nullable FriendChatModel friendChatModel) {
        this.friendChatModel = friendChatModel;
    }

    public final void setTopicInfoModel(@Nullable TopicInfoModel topicInfoModel) {
        this.topicInfoModel = topicInfoModel;
    }

    public final void setYallaChatDialogBindShow(@NotNull o0O00OO<Boolean> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.yallaChatDialogBindShow = o0o00oo2;
    }

    public final void setYallaChatDialogFriendNoBindShow(@NotNull o0O00OO<Boolean> o0o00oo2) {
        Intrinsics.checkNotNullParameter(o0o00oo2, "<set-?>");
        this.yallaChatDialogFriendNoBindShow = o0o00oo2;
    }

    public final void toYallaChat(@NotNull FriendChatModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        p623o0oo0oO0.o0000O0 yallaChatSdk = getYallaChatSdk();
        String credential = data.getCredentialCode();
        String openId = data.getOpenId();
        String targetOpenId = data.getFriendOpenId();
        String localUserName = data.getLocalUserName();
        OooOo00 action = OooOo00.f26035Oooo0o;
        Objects.requireNonNull(yallaChatSdk);
        Intrinsics.checkNotNullParameter(credential, "credential");
        Intrinsics.checkNotNullParameter(openId, "openId");
        Intrinsics.checkNotNullParameter(targetOpenId, "targetOpenId");
        Intrinsics.checkNotNullParameter(action, "action");
        o000OO action2 = new o000OO(yallaChatSdk, credential, openId, targetOpenId, localUserName, action);
        o0000oo notInstall = o0000oo.f48642Oooo0o;
        Intrinsics.checkNotNullParameter(notInstall, "notInstall");
        Intrinsics.checkNotNullParameter(action2, "action");
        if (PackManager.INSTANCE.isInstalledYallaChat()) {
            action2.invoke();
            return;
        }
        Objects.requireNonNull(notInstall);
        Unit unit = Unit.INSTANCE;
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new o0oo0oO0.o0000O0.OooO00o.C0419OooO00o(null), 2, null);
    }

    public final void yallaChatLogin() {
        FriendChatModel friendChatModel = this.friendChatModel;
        if (friendChatModel == null) {
            return;
        }
        getYallaChatSdk().OooO00o(new Oooo000(friendChatModel, this));
    }

    @NotNull
    public final LiveData<ApiResult<TopicGroupInfoModel>> getGroupInfo(long circleId) {
        return o0000O0O.OooO00o(new OooOOO(circleId, null));
    }
}
