package com.yalla.yalla.data.cache;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.yalla.yalla.model.gift.GifListJson;
import com.yalla.yalla.model.http.ApiResult;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p391o0OOooo0.oo000o;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nSharedGifFaceManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedGifFaceManager.kt\ncom/yalla/yalla/data/cache/SharedGifFaceManager\n+ 2 YLApi.kt\ncom/yalla/yalla/api/call/YLApi$CommonRequest\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,76:1\n62#2:77\n1855#3,2:78\n7#4,8:80\n7#4,8:88\n*S KotlinDebug\n*F\n+ 1 SharedGifFaceManager.kt\ncom/yalla/yalla/data/cache/SharedGifFaceManager\n*L\n63#1:77\n67#1:78,2\n26#1:80,8\n39#1:88,8\n*E\n"})
public final class SharedGifFaceManager {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final SharedGifFaceManager f22301OooO00o = new SharedGifFaceManager();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Integer f22302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Boolean> f22303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<GifListJson>> f22304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f22305OooO0o0;

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 SharedGifFaceManager.kt\ncom/yalla/yalla/data/cache/SharedGifFaceManager\n*L\n1#1,15:1\n27#2,11:16\n*E\n"})
    public static final class OooO implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f22306OooO0Oo;

        public OooO(MutableLiveData mutableLiveData) {
            this.f22306OooO0Oo = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f22306OooO0Oo).observeForever(new OooO0o(OooO00o.f22307OooO0Oo));
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f22307OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!Intrinsics.areEqual(num2, SharedGifFaceManager.f22302OooO0O0)) {
                    SharedGifFaceManager.f22302OooO0O0 = num2;
                    SharedGifFaceManager.f22301OooO00o.getClass();
                    SharedGifFaceManager.f22304OooO0Oo.postValue(CollectionsKt.emptyList());
                    SharedGifFaceManager.f22303OooO0OO.postValue(Boolean.FALSE);
                }
                Result.m4215constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f22308OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (!bool2.booleanValue()) {
                    SharedGifFaceManager.f22301OooO00o.getClass();
                    SharedGifFaceManager.f22304OooO0Oo.postValue(CollectionsKt.emptyList());
                    SharedGifFaceManager.f22303OooO0OO.postValue(Boolean.FALSE);
                }
                Result.m4215constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m4215constructorimpl(ResultKt.createFailure(th));
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.data.cache.SharedGifFaceManager", f = "SharedGifFaceManager.kt", i = {0}, l = {77}, m = "initAppGifList", n = {"this"}, s = {"L$0"})
    public static final class OooO0OO extends ContinuationImpl {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public /* synthetic */ Object f22309OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f22310OooO0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f22309OooO0Oo = obj;
            this.f22310OooO0o |= Integer.MIN_VALUE;
            return SharedGifFaceManager.this.OooO00o(this);
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f22312OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f22312OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f22312OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f22312OooO0Oo;
        }

        public final int hashCode() {
            return this.f22312OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f22312OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 SharedGifFaceManager.kt\ncom/yalla/yalla/data/cache/SharedGifFaceManager\n*L\n1#1,15:1\n40#2,9:16\n*E\n"})
    public static final class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f22313OooO0Oo;

        public OooOO0(MutableLiveData mutableLiveData) {
            this.f22313OooO0Oo = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f22313OooO0Oo).observeForever(new OooO0o(OooO0O0.f22308OooO0Oo));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        f22302OooO0O0 = (Integer) o0O00oO0.OooOOO0().getValue();
        f22303OooO0OO = new MutableLiveData<>(Boolean.FALSE);
        f22304OooO0Oo = new MutableLiveData<>();
        MutableLiveData mutableLiveDataOooOOO0 = o0O00oO0.OooOOO0();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOOO0.observeForever(new OooO0o(OooO00o.f22307OooO0Oo));
        } else {
            new Handler(Looper.getMainLooper()).post(new OooO(mutableLiveDataOooOOO0));
        }
        MutableLiveData mutableLiveDataOooOo0O = o0O00oO0.OooOo0O();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOo0O.observeForever(new OooO0o(OooO0O0.f22308OooO0Oo));
        } else {
            new Handler(Looper.getMainLooper()).post(new OooOO0(mutableLiveDataOooOo0O));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super Unit> continuation) {
        OooO0OO oooO0OO;
        if (continuation instanceof OooO0OO) {
            oooO0OO = (OooO0OO) continuation;
            int i = oooO0OO.f22310OooO0o;
            if ((i & Integer.MIN_VALUE) != 0) {
                oooO0OO.f22310OooO0o = i - Integer.MIN_VALUE;
            } else {
                oooO0OO = new OooO0OO(continuation);
            }
        } else {
            oooO0OO = new OooO0OO(continuation);
        }
        Object objOooO0Oo = oooO0OO.f22309OooO0Oo;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = oooO0OO.f22310OooO0o;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objOooO0Oo);
            if (f22305OooO0o0) {
                return Unit.INSTANCE;
            }
            f22305OooO0o0 = true;
            String str = Oooo0.f43416o0000Ooo;
            SharedGifFaceManager$initAppGifList$$inlined$call$1 sharedGifFaceManager$initAppGifList$$inlined$call$1 = new SharedGifFaceManager$initAppGifList$$inlined$call$1(oo000o.OooO00o(str, "url", str, 0), null);
            oooO0OO.getClass();
            oooO0OO.f22310OooO0o = 1;
            objOooO0Oo = OooOOO.OooO0Oo(sharedGifFaceManager$initAppGifList$$inlined$call$1, oooO0OO);
            if (objOooO0Oo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objOooO0Oo);
        }
        ApiResult apiResult = (ApiResult) objOooO0Oo;
        f22305OooO0o0 = false;
        Collection collection = (Collection) apiResult.getData();
        if (!(collection == null || collection.isEmpty())) {
            List list = (List) apiResult.getData();
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((GifListJson) it.next()).getBuyType() == 1) {
                        MutableLiveData<Boolean> mutableLiveData = f22303OooO0OO;
                        if (Intrinsics.areEqual(mutableLiveData.getValue(), Boxing.boxBoolean(false))) {
                            mutableLiveData.postValue(Boxing.boxBoolean(true));
                        }
                    }
                }
            }
            f22304OooO0Oo.postValue((List<GifListJson>) apiResult.getData());
        }
        return Unit.INSTANCE;
    }
}
