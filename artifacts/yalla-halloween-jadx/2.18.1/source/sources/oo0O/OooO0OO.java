package oo0O;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.GiftPropAll;
import com.yalla.yalla.model.GiftPropModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f53327OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Map<Integer, GiftPropModel>> f53328OooO0O0 = new MutableLiveData<>(new LinkedHashMap());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<GiftPropAll>> f53329OooO0OO = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f53330OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public static Integer f53331OooO0o0;

    public static final class OooO implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f53332Oooo0o;

        public OooO(Object obj) {
            this.f53332Oooo0o = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f53332Oooo0o).observeForever(OooO00o.f53333OooO00o);
        }
    }

    public static final class OooO00o<T> implements Observer {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o<T> f53333OooO00o = new OooO00o<>();

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (Intrinsics.areEqual(num, OooO0OO.f53331OooO0o0)) {
                return;
            }
            OooO0OO oooO0OO = OooO0OO.f53327OooO00o;
            OooO0OO.f53331OooO0o0 = num;
            oooO0OO.OooO0Oo(true);
        }
    }

    public static final class OooO0O0<T> implements Observer {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0O0<T> f53334OooO00o = new OooO0O0<>();

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            Boolean it = (Boolean) obj;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                OooO0OO.f53327OooO00o.OooO0Oo(true);
            }
        }
    }

    /* JADX INFO: renamed from: oo0O.OooO0OO$OooO0OO, reason: collision with other inner class name */
    @DebugMetadata(c = "com.app.base.application.data.GiftPropManager$initDataIfEmpty$1", f = "GiftPropManager.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0440OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f53335Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f53336Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0440OooO0OO(boolean z, Continuation<? super C0440OooO0OO> continuation) {
            super(2, continuation);
            this.f53336Oooo0oO = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0440OooO0OO(this.f53336Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0440OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0032  */
        /* JADX WARN: Code duplicated, block: B:18:0x003c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53335Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f53336Oooo0oO) {
                    OooO0OO oooO0OO = OooO0OO.f53327OooO00o;
                    this.f53335Oooo0o = 1;
                    if (OooO0OO.OooO00o(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    List<GiftPropAll> value = OooO0OO.f53329OooO0OO.getValue();
                    boolean z = false;
                    if (value != null && value.isEmpty()) {
                        z = true;
                    }
                    if (z) {
                        OooO0OO oooO0OO2 = OooO0OO.f53327OooO00o;
                        this.f53335Oooo0o = 1;
                        if (OooO0OO.OooO00o(this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
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

    @DebugMetadata(c = "com.app.base.application.data.GiftPropManager$observeAllGiftList$1", f = "GiftPropManager.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f53337Oooo0o;

        public OooO0o(Continuation<? super OooO0o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return new OooO0o(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f53337Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (OooO0OO.f53329OooO0OO.getValue() == null) {
                    OooO0OO oooO0OO = OooO0OO.f53327OooO00o;
                    this.f53337Oooo0o = 1;
                    if (OooO0OO.OooO00o(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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

    public static final class OooOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Object f53338Oooo0o;

        public OooOO0(Object obj) {
            this.f53338Oooo0o = obj;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f53338Oooo0o).observeForever(OooO0O0.f53334OooO00o);
        }
    }

    static {
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        f53331OooO0o0 = oooOOO.OooOOO().getValue();
        MutableLiveData<Integer> mutableLiveDataOooOOO = oooOOO.OooOOO();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOOO.observeForever(OooO00o.f53333OooO00o);
        } else {
            new Handler(Looper.getMainLooper()).post(new OooO(mutableLiveDataOooOOO));
        }
        MutableLiveData<Boolean> mutableLiveDataOooOooO = oooOOO.OooOooO();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOooO.observeForever(OooO0O0.f53334OooO00o);
        } else {
            new Handler(Looper.getMainLooper()).post(new OooOO0(mutableLiveDataOooOooO));
        }
    }

    public static final Object OooO00o(Continuation continuation) {
        if (f53330OooO0Oo) {
            return Unit.INSTANCE;
        }
        f53330OooO0Oo = true;
        Object objOooO0OO = o0000O0.OooO0OO(new oo0O.OooO0o(null), continuation);
        return objOooO0OO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0OO : Unit.INSTANCE;
    }

    @Nullable
    public final GiftPropModel OooO0O0(int i) {
        Map<Integer, GiftPropModel> value = f53328OooO0O0.getValue();
        if (value != null) {
            return value.get(Integer.valueOf(i));
        }
        return null;
    }

    public final boolean OooO0OO() {
        OooO0Oo(false);
        List<GiftPropAll> value = f53329OooO0OO.getValue();
        return value != null && value.isEmpty();
    }

    public final void OooO0Oo(boolean z) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getMain(), null, new C0440OooO0OO(z, null), 2, null);
    }

    public final void OooO0o0(@NotNull LifecycleOwner owner, @NotNull Observer<List<GiftPropAll>> observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new OooO0o(null), 2, null);
        f53329OooO0OO.observe(owner, observer);
    }
}
