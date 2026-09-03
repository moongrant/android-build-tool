package com.yalla.yalla.common.manager.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.GifListJson;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0013\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR&\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/yalla/yalla/common/manager/data/SharedGifFaceManager;", "", "()V", "containsPayEmojiLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getContainsPayEmojiLiveData", "()Landroidx/lifecycle/MutableLiveData;", "currentRegion", "", "Ljava/lang/Integer;", "gifFaceListLiveData", "", "Lcom/yalla/yalla/model/GifListJson;", "getGifFaceListLiveData", "setGifFaceListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "loadingGIFList", "initAppGifList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SharedGifFaceManager {
    public static final int $stable;

    @NotNull
    public static final SharedGifFaceManager INSTANCE = new SharedGifFaceManager();

    @NotNull
    private static final MutableLiveData<Boolean> containsPayEmojiLiveData;

    @Nullable
    private static Integer currentRegion;

    @NotNull
    private static MutableLiveData<List<GifListJson>> gifFaceListLiveData;
    private static boolean loadingGIFList;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.data.SharedGifFaceManager$initAppGifList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.data.SharedGifFaceManager", f = "SharedGifFaceManager.kt", i = {0}, l = {73}, m = "initAppGifList", n = {"this"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedGifFaceManager.this.initAppGifList(this);
        }
    }

    static {
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        currentRegion = oooOOO.OooOOO().getValue();
        containsPayEmojiLiveData = new MutableLiveData<>(Boolean.FALSE);
        gifFaceListLiveData = new MutableLiveData<>();
        oooOOO.OooOOO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.OooO0O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedGifFaceManager.m257_init_$lambda1((Integer) obj);
            }
        });
        oooOOO.OooOooO().observeForever(new Observer() { // from class: com.yalla.yalla.common.manager.data.OooO00o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                SharedGifFaceManager.m258_init_$lambda3((Boolean) obj);
            }
        });
        $stable = 8;
    }

    private SharedGifFaceManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-1, reason: not valid java name */
    public static final void m257_init_$lambda1(Integer num) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!Intrinsics.areEqual(num, currentRegion)) {
                currentRegion = num;
                gifFaceListLiveData.postValue(CollectionsKt.emptyList());
                containsPayEmojiLiveData.postValue(Boolean.FALSE);
            }
            Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: _init_$lambda-3, reason: not valid java name */
    public static final void m258_init_$lambda3(Boolean bool) {
        try {
            Result.Companion companion = Result.INSTANCE;
            if (!bool.booleanValue()) {
                gifFaceListLiveData.postValue(CollectionsKt.emptyList());
                containsPayEmojiLiveData.postValue(Boolean.FALSE);
            }
            Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getContainsPayEmojiLiveData() {
        return containsPayEmojiLiveData;
    }

    @NotNull
    public final MutableLiveData<List<GifListJson>> getGifFaceListLiveData() {
        return gifFaceListLiveData;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object initAppGifList(@NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objOooO0OO = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0OO);
            if (loadingGIFList) {
                return Unit.INSTANCE;
            }
            loadingGIFList = true;
            p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
            String str = p153o00Oo0oO.o0ooOOo.f32293o0000O00;
            SharedGifFaceManager$initAppGifList$$inlined$call$1 sharedGifFaceManager$initAppGifList$$inlined$call$1 = new SharedGifFaceManager$initAppGifList$$inlined$call$1(com.app.base.app.appConfig.apiDataModela.OooO00o.OooO0O0(str, "url", str, 0), null);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objOooO0OO = o0000O0.OooO0OO(sharedGifFaceManager$initAppGifList$$inlined$call$1, anonymousClass1);
            if (objOooO0OO == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0OO);
        }
        ApiResult apiResult = (ApiResult) objOooO0OO;
        loadingGIFList = false;
        Collection collection = (Collection) apiResult.getData();
        if (!(collection == null || collection.isEmpty())) {
            List list = (List) apiResult.getData();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((GifListJson) it.next()).getBuyType() == 1) {
                        MutableLiveData<Boolean> mutableLiveData = containsPayEmojiLiveData;
                        if (Intrinsics.areEqual(mutableLiveData.getValue(), Boxing.boxBoolean(false))) {
                            mutableLiveData.postValue(Boxing.boxBoolean(true));
                        }
                    }
                }
            }
            gifFaceListLiveData.postValue((List<GifListJson>) apiResult.getData());
        }
        return Unit.INSTANCE;
    }

    public final void setGifFaceListLiveData(@NotNull MutableLiveData<List<GifListJson>> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        gifFaceListLiveData = mutableLiveData;
    }
}
