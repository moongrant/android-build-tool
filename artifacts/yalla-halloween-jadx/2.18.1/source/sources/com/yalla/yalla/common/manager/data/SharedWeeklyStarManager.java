package com.yalla.yalla.common.manager.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.WeeklyStarModel;
import com.yalla.yalla.common.repository.AppConfigRepo$loadWeeklyStart$$inlined$call$1;
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
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedWeeklyStarManager;", "", "()V", "currentRegion", "", "weeklyStar", "Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/common/model/WeeklyStarModel;", "getWeeklyStar", "()Landroidx/lifecycle/MutableLiveData;", "setWeeklyStar", "(Landroidx/lifecycle/MutableLiveData;)V", "clearUrl", "", "loadUrlConfig", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SharedWeeklyStarManager {
    public static final int $stable;

    @NotNull
    public static final SharedWeeklyStarManager INSTANCE = new SharedWeeklyStarManager();
    private static int currentRegion;

    @NotNull
    private static MutableLiveData<WeeklyStarModel> weeklyStar;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedWeeklyStarManager$loadUrlConfig$1, reason: invalid class name */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedWeeklyStarManager$loadUrlConfig$1", f = "SharedWeeklyStarManager.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
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
                this.label = 1;
                p480o0o000.OooO0O0 oooO0O0 = p480o0o000.OooO0O0.f40748OooO00o;
                String str = p480o0o000.OooO0O0.f40751OooO0Oo;
                obj = o0000O0.OooO0OO(new AppConfigRepo$loadWeeklyStart$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null), this);
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
            SharedWeeklyStarManager.INSTANCE.getWeeklyStar().postValue(apiResult.getData());
            return Unit.INSTANCE;
        }
    }

    static {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        Integer value = oooOOO.OooOOO().getValue();
        Intrinsics.checkNotNull(value);
        currentRegion = value.intValue();
        oooOOO.OooOOO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.o0O0O00
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedWeeklyStarManager.m284_init_$lambda0((Integer) obj);
            }
        });
        weeklyStar = new MutableLiveData<WeeklyStarModel>() { // from class: com.yalla.yalla.common.manager.data.SharedWeeklyStarManager$weeklyStar$1
            @Override // androidx.lifecycle.LiveData
            public void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super WeeklyStarModel> observer) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(observer, "observer");
                removeObservers(owner);
                super.observe(owner, observer);
                if (getValue() == null) {
                    SharedWeeklyStarManager.INSTANCE.loadUrlConfig();
                }
            }
        };
        $stable = 8;
    }

    private SharedWeeklyStarManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-0, reason: not valid java name */
    public static final void m284_init_$lambda0(Integer it) {
        int i = currentRegion;
        if (it != null && it.intValue() == i) {
            return;
        }
        SharedWeeklyStarManager sharedWeeklyStarManager = INSTANCE;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        currentRegion = it.intValue();
        sharedWeeklyStarManager.clearUrl();
    }

    private final void clearUrl() {
        weeklyStar.postValue(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadUrlConfig() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new AnonymousClass1(null), 2, null);
    }

    @NotNull
    public final MutableLiveData<WeeklyStarModel> getWeeklyStar() {
        return weeklyStar;
    }

    public final void setWeeklyStar(@NotNull MutableLiveData<WeeklyStarModel> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        weeklyStar = mutableLiveData;
    }
}
