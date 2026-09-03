package com.yalla.yalla.common.manager.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.GiftPropModel;
import java.util.ArrayList;
import java.util.Collection;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p547o0o0o00O.o00O000o;
import p547o0o0o00O.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR.\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedLuckyPacketManager;", "Lo00OO/OooO00o;", "", "loadData", "", "loading", "Z", "", "currentRegion", "I", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/yalla/yalla/model/GiftPropModel;", "data", "Landroidx/lifecycle/MutableLiveData;", "getData", "()Landroidx/lifecycle/MutableLiveData;", "setData", "(Landroidx/lifecycle/MutableLiveData;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class SharedLuckyPacketManager extends o00OO.OooO00o {
    public static final int $stable;

    @NotNull
    public static final SharedLuckyPacketManager INSTANCE = new SharedLuckyPacketManager();
    private static int currentRegion;

    @NotNull
    private static MutableLiveData<List<GiftPropModel>> data;
    private static boolean loading;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedLuckyPacketManager$loadData$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedLuckyPacketManager$loadData$1", f = "SharedLuckyPacketManager.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
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
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String url = o00O00O.OooO0O0("/Webservers/Bar/RedPaperPropList");
                Intrinsics.checkNotNullParameter(url, "url");
                SharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1 sharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1 = new SharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1(new o00O000o(url, 0), null);
                this.label = 1;
                obj = o0000O0.OooO0OO(sharedLuckyPacketManager$loadData$1$invokeSuspend$$inlined$call$1, this);
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
            SharedLuckyPacketManager sharedLuckyPacketManager = SharedLuckyPacketManager.INSTANCE;
            SharedLuckyPacketManager.loading = false;
            Collection collection = (Collection) apiResult.getData();
            if (collection == null || collection.isEmpty()) {
                sharedLuckyPacketManager.getData().postValue(new ArrayList());
                return Unit.INSTANCE;
            }
            sharedLuckyPacketManager.getData().postValue(apiResult.getData());
            return Unit.INSTANCE;
        }
    }

    static {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Integer value = oooOOO.OooOOO().getValue();
        Intrinsics.checkNotNull(value);
        currentRegion = value.intValue();
        oooOOO.OooOOO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.OooO0OO
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedLuckyPacketManager.m259_init_$lambda0((Integer) obj);
            }
        });
        data = new MutableLiveData<List<? extends GiftPropModel>>() { // from class: com.yalla.yalla.common.manager.data.SharedLuckyPacketManager$data$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super List<GiftPropModel>> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                List<? extends GiftPropModel> value2 = getValue();
                if (value2 == null || value2.isEmpty()) {
                    SharedLuckyPacketManager.INSTANCE.loadData();
                }
            }
        };
        $stable = 8;
    }

    private SharedLuckyPacketManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m259_init_$lambda0(Integer it) {
        int i = currentRegion;
        if (it != null && it.intValue() == i) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(it, "it");
        currentRegion = it.intValue();
        data.postValue(new ArrayList());
    }

    @NotNull
    public final MutableLiveData<List<GiftPropModel>> getData() {
        return data;
    }

    public final void loadData() {
        loading = true;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    public final void setData(@NotNull MutableLiveData<List<GiftPropModel>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        data = mutableLiveData;
    }
}
