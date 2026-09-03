package com.yalla.yalla.ui.vm.room;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.common.ui.view.VipState;
import com.yalla.yalla.model.ItemVipModel;
import com.yalla.yalla.model.PersonalVipModel;
import com.yalla.yalla.model.VipExperienceDetailModel;
import com.yalla.yalla.model.VipModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import o0o0000.OooOOOO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p100o000oOoO.o0OOO00;
import p254o00ooO0O.o0000O0O;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0o0Oo;
import p630o0ooO00.o000O0;
import p630o0ooO00.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u00103J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007J\u001e\u0010\u000e\u001a\u00020\u00042\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000bJ\u0006\u0010\u000f\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010$\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R+\u0010+\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020%8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/yalla/yalla/ui/vm/room/VipVM;", "Lo00OO/OooO00o;", "", "changeType", "", "changeKaVipShowState", "changeShowPremiumFirst", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "", "loadKaVipModel", "Lkotlin/Function1;", "Lcom/yalla/yalla/model/ItemVipModel;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "forEachItemKaVipModel", "updateKaVipDialogState", "isNetworkRequesting", "Z", "", "Lcom/yalla/yalla/model/VipModel;", "kaVipModels", "Ljava/util/List;", "getKaVipModels", "()Ljava/util/List;", "setKaVipModels", "(Ljava/util/List;)V", "<set-?>", "isChecked$delegate", "Lo000oOoO/o0O00OO;", "isChecked", "()Z", "setChecked", "(Z)V", "showPremiumFirst$delegate", "getShowPremiumFirst", "setShowPremiumFirst", "showPremiumFirst", "Lcom/yalla/yalla/model/PersonalVipModel;", "personalKaVipModel$delegate", "getPersonalKaVipModel", "()Lcom/yalla/yalla/model/PersonalVipModel;", "setPersonalKaVipModel", "(Lcom/yalla/yalla/model/PersonalVipModel;)V", "personalKaVipModel", "Lo0ooO00/o000O0;", "Lcom/yalla/yalla/model/VipExperienceDetailModel;", "experienceDetailsFlow", "Lo0ooO00/o000O0;", "getExperienceDetailsFlow", "()Lo0ooO00/o000O0;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class VipVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final o000O0<VipExperienceDetailModel> experienceDetailsFlow;

    /* JADX INFO: renamed from: isChecked$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO isChecked;
    private boolean isNetworkRequesting;

    @NotNull
    private List<VipModel> kaVipModels;

    /* JADX INFO: renamed from: personalKaVipModel$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO personalKaVipModel;

    /* JADX INFO: renamed from: showPremiumFirst$delegate, reason: from kotlin metadata */
    @NotNull
    private final o0O00OO showPremiumFirst;

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$updateKaVipDialogState$1", f = "VipVM.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26101Oooo0o;

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
            int i = this.f26101Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                this.f26101Oooo0o = 1;
                if (o0o0oo.OooO0oO(this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$changeKaVipShowState$1", f = "VipVM.kt", i = {}, l = {37}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26102Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f26103Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ VipVM f26104Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, VipVM vipVM, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f26103Oooo0oO = i;
            this.f26104Oooo0oo = vipVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f26103Oooo0oO, this.f26104Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26102Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                int i2 = this.f26103Oooo0oO;
                this.f26102Oooo0o = 1;
                obj = o0o0oo.OooO00o(i2, this);
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
            if (apiResult.isSuccess()) {
                VipVM vipVM = this.f26104Oooo0oo;
                vipVM.setChecked(!vipVM.isChecked());
                int value = (this.f26104Oooo0oo.isChecked() ? VipState.VipHide : VipState.Vip).getValue();
                OooOOO oooOOO = OooOOO.f41216OooO00o;
                Pair<Integer, Integer> value2 = oooOOO.OooO().getValue();
                oooOOO.OooO().postValue(new Pair<>(Boxing.boxInt(value), Boxing.boxInt(value2 != null ? value2.getSecond().intValue() : VipLevel.Vip0.getValue())));
            } else {
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            }
            this.f26104Oooo0oo.isNetworkRequesting = false;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$changeShowPremiumFirst$1", f = "VipVM.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26105Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ int f26106Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ VipVM f26107Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i, VipVM vipVM, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f26106Oooo0oO = i;
            this.f26107Oooo0oo = vipVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0O0(this.f26106Oooo0oO, this.f26107Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26105Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                int i2 = this.f26106Oooo0oO;
                this.f26105Oooo0o = 1;
                obj = o0o0oo.OooO0O0(i2, this);
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
            if (apiResult.isSuccess()) {
                VipVM vipVM = this.f26107Oooo0oo;
                vipVM.setShowPremiumFirst(!vipVM.getShowPremiumFirst());
                LiveEventBus.get("KA_VIP_SHOW_PREMIUM_FIRST").post(Boxing.boxBoolean(this.f26107Oooo0oo.getShowPremiumFirst()));
            } else {
                ApiError error = apiResult.getError();
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
            }
            this.f26107Oooo0oo.isNetworkRequesting = false;
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$experienceDetailsFlow$1", f = "VipVM.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<Integer, Continuation<? super o000OO0O<VipExperienceDetailModel>>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f26108Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ int f26109Oooo0oO;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(continuation);
            oooO0OO.f26109Oooo0oO = ((Number) obj).intValue();
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Integer num, Continuation<? super o000OO0O<VipExperienceDetailModel>> continuation) {
            return ((OooO0OO) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26108Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = this.f26109Oooo0oO;
                o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                this.f26108Oooo0o = 1;
                obj = o0o0oo.OooO0Oo(i2, this);
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
            return ApiResult.toPagingLoadResource$default(apiResult, (List) apiResult.getData(), false, 2, null);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$loadKaVipModel$1", f = "VipVM.kt", i = {0, 1, 1}, l = {68, 78, 67}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u2d0", "$this$invokeSuspend_u24lambda_u2d0", "personalKaVip"}, s = {"L$2", "L$1", "L$2"})
    public static final class OooO0o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<Boolean>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f26110Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f26111Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public ApiResult f26112Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public LiveDataScope f26113Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public /* synthetic */ Object f26115OoooO00;

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$loadKaVipModel$1$1$kaVipPrivilege$1", f = "VipVM.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<List<VipModel>>>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f26116Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ VipVM f26117Oooo0oO;

            /* JADX INFO: renamed from: com.yalla.yalla.ui.vm.room.VipVM$OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C0265OooO00o extends Lambda implements Function1<ItemVipModel, Unit> {

                /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
                public static final C0265OooO00o f26118Oooo0o = new C0265OooO00o();

                public C0265OooO00o() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(ItemVipModel itemVipModel) {
                    ItemVipModel itemKaVipModel = itemVipModel;
                    Intrinsics.checkNotNullParameter(itemKaVipModel, "itemKaVipModel");
                    itemKaVipModel.getLocalShowRedDot().setValue(Boolean.valueOf(ItemVipModel.INSTANCE.isShowRedDot(itemKaVipModel.getPrivilegeId())));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(VipVM vipVM, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f26117Oooo0oO = vipVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f26117Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<List<VipModel>>> continuation) {
                return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f26116Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                    this.f26116Oooo0o = 1;
                    obj = o0o0oo.OooO0o0(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                VipVM vipVM = this.f26117Oooo0oO;
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult.isSuccess()) {
                    List list = (List) apiResult.getData();
                    if (list != null) {
                        vipVM.getKaVipModels().clear();
                        vipVM.getKaVipModels().addAll(list);
                        vipVM.forEachItemKaVipModel(C0265OooO00o.f26118Oooo0o);
                    }
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                return obj;
            }
        }

        @DebugMetadata(c = "com.yalla.yalla.ui.vm.room.VipVM$loadKaVipModel$1$1$personalKaVip$1", f = "VipVM.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ApiResult<PersonalVipModel>>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public int f26119Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ VipVM f26120Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(VipVM vipVM, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f26120Oooo0oO = vipVM;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO0O0(this.f26120Oooo0oO, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiResult<PersonalVipModel>> continuation) {
                return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.f26119Oooo0o;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    o0o0Oo o0o0oo = o0o0Oo.f42836OooO00o;
                    this.f26119Oooo0o = 1;
                    obj = o0o0oo.OooO0o(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                VipVM vipVM = this.f26120Oooo0oO;
                ApiResult apiResult = (ApiResult) obj;
                if (apiResult.isSuccess()) {
                    PersonalVipModel personalVipModel = (PersonalVipModel) apiResult.getData();
                    if (personalVipModel != null) {
                        vipVM.setPersonalKaVipModel(personalVipModel);
                    }
                } else {
                    ApiError error = apiResult.getError();
                    Intrinsics.checkNotNullParameter(error, "error");
                    BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new OooOOOO(error, null), 3, null);
                }
                return obj;
            }
        }

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0o oooO0o = VipVM.this.new OooO0o(continuation);
            oooO0o.f26115OoooO00 = obj;
            return oooO0o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<Boolean>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x009f  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
        /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:41:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:46:0x0101 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            VipVM vipVM;
            ApiResult apiResult;
            LiveDataScope liveDataScope;
            ApiResult apiResult2;
            ApiResult apiResult3;
            ApiResult apiResult4;
            ApiResult apiResult5;
            Collection collection;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f26110Oooo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = this.f26113Oooo0oo;
                    apiResult2 = this.f26112Oooo0oO;
                    vipVM = (VipVM) this.f26111Oooo0o;
                    apiResult = (ApiResult) this.f26115OoooO00;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    liveDataScope = this.f26113Oooo0oo;
                    apiResult4 = this.f26112Oooo0oO;
                    apiResult2 = (ApiResult) this.f26111Oooo0o;
                    apiResult3 = (ApiResult) this.f26115OoooO00;
                    ResultKt.throwOnFailure(obj);
                    apiResult5 = (ApiResult) obj;
                    if (!apiResult4.isSuccess() && apiResult5.isSuccess()) {
                        apiResult2.setCode(1000);
                    } else if (apiResult4.isSuccess() && apiResult4.getError().getCode() > 0) {
                        apiResult2.setCode(apiResult4.getError().getCode());
                    } else if (!apiResult5.isSuccess() && apiResult5.getError().getCode() > 0) {
                        apiResult2.setCode(apiResult5.getError().getCode());
                    }
                    collection = (Collection) apiResult5.getData();
                    if (collection != null || collection.isEmpty()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        apiResult2.setData(Boxing.boxBoolean(true));
                    }
                    this.f26115OoooO00 = null;
                    this.f26111Oooo0o = null;
                    this.f26112Oooo0oO = null;
                    this.f26113Oooo0oo = null;
                    this.f26110Oooo = 3;
                    if (liveDataScope.emit(apiResult3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            LiveDataScope liveDataScope2 = (LiveDataScope) this.f26115OoooO00;
            ApiResult apiResult6 = new ApiResult();
            vipVM = VipVM.this;
            CoroutineDispatcher io2 = Dispatchers.getIO();
            OooO0O0 oooO0O0 = new OooO0O0(vipVM, null);
            this.f26115OoooO00 = apiResult6;
            this.f26111Oooo0o = vipVM;
            this.f26112Oooo0oO = apiResult6;
            this.f26113Oooo0oo = liveDataScope2;
            this.f26110Oooo = 1;
            Object objWithContext = BuildersKt.withContext(io2, oooO0O0, this);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult = apiResult6;
            liveDataScope = liveDataScope2;
            obj = objWithContext;
            apiResult2 = apiResult;
            ApiResult apiResult7 = (ApiResult) obj;
            CoroutineDispatcher io3 = Dispatchers.getIO();
            OooO00o oooO00o = new OooO00o(vipVM, null);
            this.f26115OoooO00 = apiResult;
            this.f26111Oooo0o = apiResult2;
            this.f26112Oooo0oO = apiResult7;
            this.f26113Oooo0oo = liveDataScope;
            this.f26110Oooo = 2;
            Object objWithContext2 = BuildersKt.withContext(io3, oooO00o, this);
            if (objWithContext2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResult3 = apiResult;
            apiResult4 = apiResult7;
            obj = objWithContext2;
            apiResult5 = (ApiResult) obj;
            if (!apiResult4.isSuccess()) {
                if (apiResult4.isSuccess()) {
                    if (!apiResult5.isSuccess()) {
                        apiResult2.setCode(apiResult5.getError().getCode());
                    }
                } else if (!apiResult5.isSuccess()) {
                    apiResult2.setCode(apiResult5.getError().getCode());
                }
            } else if (apiResult4.isSuccess()) {
                if (!apiResult5.isSuccess()) {
                    apiResult2.setCode(apiResult5.getError().getCode());
                }
            } else if (!apiResult5.isSuccess()) {
                apiResult2.setCode(apiResult5.getError().getCode());
            }
            collection = (Collection) apiResult5.getData();
            if (collection != null) {
                z = true;
            } else {
                z = true;
            }
            if (!z) {
                apiResult2.setData(Boxing.boxBoolean(true));
            }
            this.f26115OoooO00 = null;
            this.f26111Oooo0o = null;
            this.f26112Oooo0oO = null;
            this.f26113Oooo0oo = null;
            this.f26110Oooo = 3;
            if (liveDataScope.emit(apiResult3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public VipVM() {
        Boolean bool = Boolean.FALSE;
        this.isChecked = o0OOO00.OooO0Oo(bool);
        this.showPremiumFirst = o0OOO00.OooO0Oo(bool);
        this.personalKaVipModel = o0OOO00.OooO0Oo(new PersonalVipModel());
        this.kaVipModels = new ArrayList();
        this.experienceDetailsFlow = new o000O0<>(ViewModelKt.getViewModelScope(this), new OooO0OO(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void forEachItemKaVipModel$default(VipVM vipVM, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        vipVM.forEachItemKaVipModel(function1);
    }

    public final void changeKaVipShowState(int changeType) {
        if (this.isNetworkRequesting) {
            return;
        }
        this.isNetworkRequesting = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO00o(changeType, this, null), 2, null);
    }

    public final void changeShowPremiumFirst(int changeType) {
        if (this.isNetworkRequesting) {
            return;
        }
        this.isNetworkRequesting = true;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0O0(changeType, this, null), 2, null);
    }

    public final void forEachItemKaVipModel(@Nullable Function1<? super ItemVipModel, Unit> listener) {
        Iterator<T> it = this.kaVipModels.iterator();
        while (it.hasNext()) {
            List<ItemVipModel> privilegeData = ((VipModel) it.next()).getPrivilegeData();
            if (privilegeData != null) {
                for (ItemVipModel itemVipModel : privilegeData) {
                    if (listener != null) {
                        listener.invoke(itemVipModel);
                    }
                }
            }
        }
    }

    @NotNull
    public final o000O0<VipExperienceDetailModel> getExperienceDetailsFlow() {
        return this.experienceDetailsFlow;
    }

    @NotNull
    public final List<VipModel> getKaVipModels() {
        return this.kaVipModels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final PersonalVipModel getPersonalKaVipModel() {
        return (PersonalVipModel) this.personalKaVipModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowPremiumFirst() {
        return ((Boolean) this.showPremiumFirst.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isChecked() {
        return ((Boolean) this.isChecked.getValue()).booleanValue();
    }

    @NotNull
    public final LiveData<ApiResult<Boolean>> loadKaVipModel() {
        return o0000O0O.OooO00o(new OooO0o(null));
    }

    public final void setChecked(boolean z) {
        this.isChecked.setValue(Boolean.valueOf(z));
    }

    public final void setKaVipModels(@NotNull List<VipModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.kaVipModels = list;
    }

    public final void setPersonalKaVipModel(@NotNull PersonalVipModel personalVipModel) {
        Intrinsics.checkNotNullParameter(personalVipModel, "<set-?>");
        this.personalKaVipModel.setValue(personalVipModel);
    }

    public final void setShowPremiumFirst(boolean z) {
        this.showPremiumFirst.setValue(Boolean.valueOf(z));
    }

    public final void updateKaVipDialogState() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooO(null), 3, null);
    }
}
