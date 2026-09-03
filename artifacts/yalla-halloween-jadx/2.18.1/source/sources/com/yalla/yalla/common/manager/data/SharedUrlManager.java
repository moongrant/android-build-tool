package com.yalla.yalla.common.manager.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UrlConfigModel;
import com.yalla.yalla.common.repository.AppConfigRepo$loadUrlConfigList$$inlined$call$1;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b6\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010G\u001a\u00020HH\u0002J\b\u0010I\u001a\u00020HH\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\tR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0007\"\u0004\b\u001d\u0010\tR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0007\"\u0004\b#\u0010\tR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0007\"\u0004\b&\u0010\tR \u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010\tR \u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0007\"\u0004\b,\u0010\tR \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\tR \u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0007\"\u0004\b2\u0010\tR \u00103\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0007\"\u0004\b5\u0010\tR \u00106\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0007\"\u0004\b8\u0010\tR\u001a\u00109\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u0007\"\u0004\b@\u0010\tR \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0007\"\u0004\bC\u0010\tR \u0010D\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0007\"\u0004\bF\u0010\t¨\u0006J"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedUrlManager;", "", "()V", "camelUrl", "Landroidx/lifecycle/MutableLiveData;", "", "getCamelUrl", "()Landroidx/lifecycle/MutableLiveData;", "setCamelUrl", "(Landroidx/lifecycle/MutableLiveData;)V", "crystalExchangeHistoryUrl", "getCrystalExchangeHistoryUrl", "setCrystalExchangeHistoryUrl", "crystalStoreUrl", "getCrystalStoreUrl", "setCrystalStoreUrl", "currentRegion", "", "feedBackLoginUrl", "getFeedBackLoginUrl", "setFeedBackLoginUrl", "feedBackUrl", "getFeedBackUrl", "setFeedBackUrl", "firstChargeRewardUrl", "getFirstChargeRewardUrl", "setFirstChargeRewardUrl", "fruitGameUrl", "getFruitGameUrl", "setFruitGameUrl", "giftBlindHistory", "getGiftBlindHistory", "setGiftBlindHistory", "levelUrl", "getLevelUrl", "setLevelUrl", "premiumUrl", "getPremiumUrl", "setPremiumUrl", "prettyRoomIdUrl", "getPrettyRoomIdUrl", "setPrettyRoomIdUrl", "prettyUserIdUrl", "getPrettyUserIdUrl", "setPrettyUserIdUrl", "roomBonusUrl", "getRoomBonusUrl", "setRoomBonusUrl", "roomMemberRankPage", "getRoomMemberRankPage", "setRoomMemberRankPage", "roomMemberRankRule", "getRoomMemberRankRule", "setRoomMemberRankRule", "roomMemberTaskRule", "getRoomMemberTaskRule", "setRoomMemberTaskRule", "smHost", "getSmHost", "()Ljava/lang/String;", "setSmHost", "(Ljava/lang/String;)V", "turntableGameUrl", "getTurntableGameUrl", "setTurntableGameUrl", "vipWebDetail", "getVipWebDetail", "setVipWebDetail", "yallachatTreeUrl", "getYallachatTreeUrl", "setYallachatTreeUrl", "clearUrl", "", "loadUrlConfig", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SharedUrlManager {
    public static final int $stable;

    @NotNull
    public static final SharedUrlManager INSTANCE = new SharedUrlManager();

    @NotNull
    private static MutableLiveData<String> camelUrl;

    @NotNull
    private static MutableLiveData<String> crystalExchangeHistoryUrl;

    @NotNull
    private static MutableLiveData<String> crystalStoreUrl;
    private static int currentRegion;

    @NotNull
    private static MutableLiveData<String> feedBackLoginUrl;

    @NotNull
    private static MutableLiveData<String> feedBackUrl;

    @NotNull
    private static MutableLiveData<String> firstChargeRewardUrl;

    @NotNull
    private static MutableLiveData<String> fruitGameUrl;

    @NotNull
    private static MutableLiveData<String> giftBlindHistory;

    @NotNull
    private static MutableLiveData<String> levelUrl;

    @NotNull
    private static MutableLiveData<String> premiumUrl;

    @NotNull
    private static MutableLiveData<String> prettyRoomIdUrl;

    @NotNull
    private static MutableLiveData<String> prettyUserIdUrl;

    @NotNull
    private static MutableLiveData<String> roomBonusUrl;

    @NotNull
    private static MutableLiveData<String> roomMemberRankPage;

    @NotNull
    private static MutableLiveData<String> roomMemberRankRule;

    @NotNull
    private static MutableLiveData<String> roomMemberTaskRule;

    @NotNull
    private static String smHost;

    @NotNull
    private static MutableLiveData<String> turntableGameUrl;

    @NotNull
    private static MutableLiveData<String> vipWebDetail;

    @NotNull
    private static MutableLiveData<String> yallachatTreeUrl;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedUrlManager$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedUrlManager$1", f = "SharedUrlManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
        public static final void m283invokeSuspend$lambda0(Integer it) {
            int i = SharedUrlManager.currentRegion;
            if (it != null && it.intValue() == i) {
                return;
            }
            SharedUrlManager sharedUrlManager = SharedUrlManager.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            SharedUrlManager.currentRegion = it.intValue();
            sharedUrlManager.clearUrl();
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.oo0o0Oo
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj2) {
                    SharedUrlManager.AnonymousClass1.m283invokeSuspend$lambda0((Integer) obj2);
                }
            });
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedUrlManager$loadUrlConfig$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedUrlManager$loadUrlConfig$1", f = "SharedUrlManager.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    public static final class C04761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C04761(Continuation<? super C04761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C04761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                p480o0o000.OooO0O0 oooO0O0 = p480o0o000.OooO0O0.f40748OooO00o;
                String str = p480o0o000.OooO0O0.f40752OooO0o0;
                obj = o0000O0.OooO0OO(new AppConfigRepo$loadUrlConfigList$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
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
            if (!apiResult.isSuccess()) {
                return Unit.INSTANCE;
            }
            List<UrlConfigModel> list = (List) apiResult.getData();
            if (list != null) {
                for (UrlConfigModel urlConfigModel : list) {
                    switch (urlConfigModel.getType()) {
                        case 2:
                            SharedUrlManager.INSTANCE.getLevelUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 4:
                            SharedUrlManager.INSTANCE.getFeedBackLoginUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 6:
                            SharedUrlManager.INSTANCE.getCrystalStoreUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 7:
                            SharedUrlManager.INSTANCE.getCrystalExchangeHistoryUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 8:
                            SharedUrlManager.INSTANCE.getRoomBonusUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 9:
                            SharedUrlManager.INSTANCE.getPrettyUserIdUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 10:
                            SharedUrlManager.INSTANCE.getPrettyRoomIdUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 11:
                            SharedUrlManager.INSTANCE.getPremiumUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 12:
                            SharedUrlManager.INSTANCE.getFruitGameUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 13:
                            SharedUrlManager.INSTANCE.getTurntableGameUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 15:
                            SharedUrlManager.INSTANCE.getFeedBackUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 16:
                            SharedUrlManager.INSTANCE.getCamelUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 17:
                            SharedUrlManager.INSTANCE.getVipWebDetail().postValue(urlConfigModel.getValue());
                            break;
                        case 18:
                            SharedUrlManager.INSTANCE.getFirstChargeRewardUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 19:
                            SharedUrlManager.INSTANCE.getYallachatTreeUrl().postValue(urlConfigModel.getValue());
                            break;
                        case 20:
                            SharedUrlManager.INSTANCE.getRoomMemberTaskRule().postValue(urlConfigModel.getValue());
                            break;
                        case 21:
                            SharedUrlManager.INSTANCE.getRoomMemberRankRule().postValue(urlConfigModel.getValue());
                            break;
                        case 22:
                            SharedUrlManager.INSTANCE.getRoomMemberRankPage().postValue(urlConfigModel.getValue());
                            break;
                        case 23:
                            SharedUrlManager.INSTANCE.getGiftBlindHistory().postValue(urlConfigModel.getValue());
                            break;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    static {
        Integer value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO().getValue();
        Intrinsics.checkNotNull(value);
        currentRegion = value.intValue();
        smHost = "";
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new AnonymousClass1(null), 2, null);
        premiumUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$premiumUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        levelUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$levelUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        feedBackUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$feedBackUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        camelUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$camelUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        feedBackLoginUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$feedBackLoginUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        turntableGameUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$turntableGameUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        crystalStoreUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$crystalStoreUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        crystalExchangeHistoryUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$crystalExchangeHistoryUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        roomBonusUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$roomBonusUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        prettyUserIdUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$prettyUserIdUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        prettyRoomIdUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$prettyRoomIdUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        fruitGameUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$fruitGameUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        vipWebDetail = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$vipWebDetail$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        firstChargeRewardUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$firstChargeRewardUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        yallachatTreeUrl = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$yallachatTreeUrl$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        roomMemberTaskRule = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$roomMemberTaskRule$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        roomMemberRankRule = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$roomMemberRankRule$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        roomMemberRankPage = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$roomMemberRankPage$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        giftBlindHistory = new MutableLiveData<String>() { // from class: com.yalla.yalla.common.manager.data.SharedUrlManager$giftBlindHistory$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super String> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                String value2 = getValue();
                if (value2 == null || StringsKt.isBlank(value2)) {
                    SharedUrlManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        $stable = 8;
    }

    private SharedUrlManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearUrl() {
        premiumUrl.postValue("");
        levelUrl.postValue("");
        feedBackUrl.postValue("");
        feedBackLoginUrl.postValue("");
        turntableGameUrl.postValue("");
        crystalStoreUrl.postValue("");
        crystalExchangeHistoryUrl.postValue("");
        roomBonusUrl.postValue("");
        prettyUserIdUrl.postValue("");
        prettyRoomIdUrl.postValue("");
        fruitGameUrl.postValue("");
        vipWebDetail.postValue("");
        roomMemberRankPage.postValue("");
        giftBlindHistory.postValue("");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadUrlConfig() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new C04761(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<String> getCamelUrl() {
        return camelUrl;
    }

    @NotNull
    public final MutableLiveData<String> getCrystalExchangeHistoryUrl() {
        return crystalExchangeHistoryUrl;
    }

    @NotNull
    public final MutableLiveData<String> getCrystalStoreUrl() {
        return crystalStoreUrl;
    }

    @NotNull
    public final MutableLiveData<String> getFeedBackLoginUrl() {
        return feedBackLoginUrl;
    }

    @NotNull
    public final MutableLiveData<String> getFeedBackUrl() {
        return feedBackUrl;
    }

    @NotNull
    public final MutableLiveData<String> getFirstChargeRewardUrl() {
        return firstChargeRewardUrl;
    }

    @NotNull
    public final MutableLiveData<String> getFruitGameUrl() {
        return fruitGameUrl;
    }

    @NotNull
    public final MutableLiveData<String> getGiftBlindHistory() {
        return giftBlindHistory;
    }

    @NotNull
    public final MutableLiveData<String> getLevelUrl() {
        return levelUrl;
    }

    @NotNull
    public final MutableLiveData<String> getPremiumUrl() {
        return premiumUrl;
    }

    @NotNull
    public final MutableLiveData<String> getPrettyRoomIdUrl() {
        return prettyRoomIdUrl;
    }

    @NotNull
    public final MutableLiveData<String> getPrettyUserIdUrl() {
        return prettyUserIdUrl;
    }

    @NotNull
    public final MutableLiveData<String> getRoomBonusUrl() {
        return roomBonusUrl;
    }

    @NotNull
    public final MutableLiveData<String> getRoomMemberRankPage() {
        return roomMemberRankPage;
    }

    @NotNull
    public final MutableLiveData<String> getRoomMemberRankRule() {
        return roomMemberRankRule;
    }

    @NotNull
    public final MutableLiveData<String> getRoomMemberTaskRule() {
        return roomMemberTaskRule;
    }

    @NotNull
    public final String getSmHost() {
        return smHost;
    }

    @NotNull
    public final MutableLiveData<String> getTurntableGameUrl() {
        return turntableGameUrl;
    }

    @NotNull
    public final MutableLiveData<String> getVipWebDetail() {
        return vipWebDetail;
    }

    @NotNull
    public final MutableLiveData<String> getYallachatTreeUrl() {
        return yallachatTreeUrl;
    }

    public final void setCamelUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        camelUrl = mutableLiveData;
    }

    public final void setCrystalExchangeHistoryUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        crystalExchangeHistoryUrl = mutableLiveData;
    }

    public final void setCrystalStoreUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        crystalStoreUrl = mutableLiveData;
    }

    public final void setFeedBackLoginUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        feedBackLoginUrl = mutableLiveData;
    }

    public final void setFeedBackUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        feedBackUrl = mutableLiveData;
    }

    public final void setFirstChargeRewardUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        firstChargeRewardUrl = mutableLiveData;
    }

    public final void setFruitGameUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        fruitGameUrl = mutableLiveData;
    }

    public final void setGiftBlindHistory(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        giftBlindHistory = mutableLiveData;
    }

    public final void setLevelUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        levelUrl = mutableLiveData;
    }

    public final void setPremiumUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        premiumUrl = mutableLiveData;
    }

    public final void setPrettyRoomIdUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        prettyRoomIdUrl = mutableLiveData;
    }

    public final void setPrettyUserIdUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        prettyUserIdUrl = mutableLiveData;
    }

    public final void setRoomBonusUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        roomBonusUrl = mutableLiveData;
    }

    public final void setRoomMemberRankPage(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        roomMemberRankPage = mutableLiveData;
    }

    public final void setRoomMemberRankRule(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        roomMemberRankRule = mutableLiveData;
    }

    public final void setRoomMemberTaskRule(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        roomMemberTaskRule = mutableLiveData;
    }

    public final void setSmHost(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        smHost = str;
    }

    public final void setTurntableGameUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        turntableGameUrl = mutableLiveData;
    }

    public final void setVipWebDetail(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        vipWebDetail = mutableLiveData;
    }

    public final void setYallachatTreeUrl(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        yallachatTreeUrl = mutableLiveData;
    }
}
