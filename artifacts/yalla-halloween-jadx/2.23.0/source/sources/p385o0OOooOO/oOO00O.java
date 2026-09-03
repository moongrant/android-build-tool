package p385o0OOooOO;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.code.android.util.OooOOO;
import com.code.android.util.o0OoOo0;
import com.yalla.yalla.model.gift.GiftPropAll;
import com.yalla.yalla.model.gift.GiftPropModel;
import com.yalla.yalla.model.gift.GiftPropTypeUser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt\n*L\n1#1,377:1\n1855#2,2:378\n1855#2,2:380\n1855#2,2:382\n1855#2,2:384\n1855#2,2:386\n7#3,8:388\n7#3,8:396\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager\n*L\n119#1:378,2\n146#1:380,2\n252#1:382,2\n361#1:384,2\n371#1:386,2\n51#1:388,8\n59#1:396,8\n*E\n"})
public final class oOO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Map<Integer, GiftPropModel>> f44351OooO00o = new MutableLiveData<>(new LinkedHashMap());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<Map<Integer, GiftPropModel>> f44352OooO0O0 = new MutableLiveData<>(new LinkedHashMap());

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<GiftPropModel>> f44353OooO0OO = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public static final MutableLiveData<List<GiftPropAll>> f44354OooO0Oo = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public static Integer f44355OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f44356OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$refreshGiftBackpack$1", f = "GiftPropManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nGiftPropManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$refreshGiftBackpack$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,377:1\n2634#2:378\n1864#2,3:380\n1#3:379\n*S KotlinDebug\n*F\n+ 1 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager$refreshGiftBackpack$1\n*L\n334#1:378\n338#1:380,3\n334#1:379\n*E\n"})
    public static final class OooO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ int f44357OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ long f44358OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ long f44359OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(long j, long j2, int i, Continuation continuation) {
            super(2, continuation);
            this.f44357OooO0Oo = i;
            this.f44359OooO0o0 = j;
            this.f44358OooO0o = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO(this.f44359OooO0o0, this.f44358OooO0o, this.f44357OooO0Oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            List<GiftPropModel> listAll;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44352OooO0O0;
            Map<Integer, GiftPropModel> value = mutableLiveData.getValue();
            long j = this.f44358OooO0o;
            long j2 = this.f44359OooO0o0;
            int i = this.f44357OooO0Oo;
            List<GiftPropAll> list = null;
            if (value != null) {
                GiftPropModel giftPropModel = value.get(Boxing.boxInt(i));
                if (giftPropModel != null) {
                    giftPropModel.setGiftBackpackPropNum(j2);
                    giftPropModel.setGiftBackpackMinExpirationTimeStamp(j);
                    if (j2 < 1) {
                        value.remove(Boxing.boxInt(i));
                    } else {
                        value.put(Boxing.boxInt(i), giftPropModel);
                    }
                }
            } else {
                value = null;
            }
            mutableLiveData.postValue(value);
            MutableLiveData<List<GiftPropAll>> mutableLiveData2 = oOO00O.f44354OooO0Oo;
            List<GiftPropAll> value2 = mutableLiveData2.getValue();
            if (value2 != null) {
                for (GiftPropAll giftPropAll : value2) {
                    if (giftPropAll.getGiftPropTypeUser() == GiftPropTypeUser.Backpack.getValue() && (listAll = giftPropAll.getListAll()) != null) {
                        int i2 = 0;
                        int i3 = -1;
                        for (Object obj2 : listAll) {
                            int i4 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            GiftPropModel giftPropModel2 = (GiftPropModel) obj2;
                            if (giftPropModel2.getGiftId() == i) {
                                giftPropModel2.setGiftBackpackPropNum(j2);
                                giftPropModel2.setGiftBackpackMinExpirationTimeStamp(j);
                                if (j2 >= 1) {
                                    i2 = i3;
                                }
                                i3 = i2;
                            }
                            i2 = i4;
                        }
                        if (i3 != -1 && listAll.size() > i3) {
                            listAll.remove(i3);
                        }
                    }
                }
                list = value2;
            }
            mutableLiveData2.postValue(list);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44360OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            if (!Intrinsics.areEqual(num2, oOO00O.f44355OooO0o)) {
                oOO00O.f44355OooO0o = num2;
                oOO00O.OooO0Oo(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f44361OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                oOO00O.OooO0Oo(true);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$initDataIfEmpty$1", f = "GiftPropManager.kt", i = {}, l = {164}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f44362OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f44363OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f44363OooO0o0 = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0OO(this.f44363OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003a  */
        /* JADX WARN: Code duplicated, block: B:18:0x0044 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f44362OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f44363OooO0o0) {
                    MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData = oOO00O.f44351OooO00o;
                    this.f44362OooO0Oo = 1;
                    if (oOO00O.OooO00o(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    List<GiftPropAll> value = oOO00O.f44354OooO0Oo.getValue();
                    if (o0OoOo0.OooO0o0(0, value != null ? Boxing.boxInt(value.size()) : null) <= 1) {
                        MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData2 = oOO00O.f44351OooO00o;
                        this.f44362OooO0Oo = 1;
                        if (oOO00O.OooO00o(this) == coroutine_suspended) {
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
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData3 = oOO00O.f44351OooO00o;
            Map<Integer, GiftPropModel> value2 = mutableLiveData3.getValue();
            Integer numBoxInt = value2 != null ? Boxing.boxInt(value2.size()) : null;
            p592o0oo00O.OooOOO0.OooO0O0("WRM GiftData allGiftMapForId.size = " + numBoxInt + ", \ndata = " + p140o00OOooo.OooOO0.OooO00o(mutableLiveData3.getValue()));
            MutableLiveData<Map<Integer, GiftPropModel>> mutableLiveData4 = oOO00O.f44352OooO0O0;
            Map<Integer, GiftPropModel> value3 = mutableLiveData4.getValue();
            Integer numBoxInt2 = value3 != null ? Boxing.boxInt(value3.size()) : null;
            p592o0oo00O.OooOOO0.OooO0o("WRM GiftData backpackGiftMapForId.size = " + numBoxInt2 + ", \ndata = " + p140o00OOooo.OooOO0.OooO00o(mutableLiveData4.getValue()));
            MutableLiveData<List<GiftPropModel>> mutableLiveData5 = oOO00O.f44353OooO0OO;
            List<GiftPropModel> value4 = mutableLiveData5.getValue();
            Integer numBoxInt3 = value4 != null ? Boxing.boxInt(value4.size()) : null;
            p592o0oo00O.OooOOO0.OooO0O0("WRM GiftData allGiftNewList.size = " + numBoxInt3 + ", \ndata = " + p140o00OOooo.OooOO0.OooO00o(mutableLiveData5.getValue()));
            MutableLiveData<List<GiftPropAll>> mutableLiveData6 = oOO00O.f44354OooO0Oo;
            List<GiftPropAll> value5 = mutableLiveData6.getValue();
            Integer numBoxInt4 = value5 != null ? Boxing.boxInt(value5.size()) : null;
            p592o0oo00O.OooOOO0.OooO("WRM GiftData allGiftList.size = " + numBoxInt4 + ", \ndata = " + p140o00OOooo.OooOO0.OooO00o(mutableLiveData6.getValue()));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.app.golbalData.GiftPropManager$observeAllGiftList$1", f = "GiftPropManager.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f44364OooO0Oo;

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
            int i = this.f44364OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<GiftPropAll> value = oOO00O.f44354OooO0Oo.getValue();
                if (o0OoOo0.OooO0o0(0, value != null ? Boxing.boxInt(value.size()) : null) <= 1) {
                    this.f44364OooO0Oo = 1;
                    if (oOO00O.OooO00o(this) == coroutine_suspended) {
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

    public static final class OooOO0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f44365OooO0Oo;

        public OooOO0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44365OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f44365OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f44365OooO0Oo;
        }

        public final int hashCode() {
            return this.f44365OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44365OooO0Oo.invoke(obj);
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager\n*L\n1#1,15:1\n52#2,7:16\n*E\n"})
    public static final class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f44366OooO0Oo;

        public OooOO0O(MutableLiveData mutableLiveData) {
            this.f44366OooO0Oo = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f44366OooO0Oo).observeForever(new OooOO0(OooO00o.f44360OooO0Oo));
        }
    }

    @SourceDebugExtension({"SMAP\nThreadUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadUtils.kt\ncom/code/android/util/ThreadUtilsKt$applyOnUIThread$1\n+ 2 GiftPropManager.kt\ncom/yalla/yalla/app/golbalData/GiftPropManager\n*L\n1#1,15:1\n60#2,6:16\n*E\n"})
    public static final class OooOOO0 implements Runnable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Object f44367OooO0Oo;

        public OooOOO0(MutableLiveData mutableLiveData) {
            this.f44367OooO0Oo = mutableLiveData;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((MutableLiveData) this.f44367OooO0Oo).observeForever(new OooOO0(OooO0O0.f44361OooO0Oo));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        f44355OooO0o = (Integer) o000000O.OooOOO0().getValue();
        MutableLiveData mutableLiveDataOooOOO0 = o000000O.OooOOO0();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOOO0.observeForever(new OooOO0(OooO00o.f44360OooO0Oo));
        } else {
            new Handler(Looper.getMainLooper()).post(new OooOO0O(mutableLiveDataOooOOO0));
        }
        MutableLiveData mutableLiveDataOooOo0O = o000000O.OooOo0O();
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            mutableLiveDataOooOo0O.observeForever(new OooOO0(OooO0O0.f44361OooO0Oo));
        } else {
            new Handler(Looper.getMainLooper()).post(new OooOOO0(mutableLiveDataOooOo0O));
        }
    }

    public static final Object OooO00o(Continuation continuation) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boxing.boxBoolean(false))) {
            return Unit.INSTANCE;
        }
        if (f44356OooO0o0) {
            return Unit.INSTANCE;
        }
        f44356OooO0o0 = true;
        Object objOooO0Oo = OooOOO.OooO0Oo(new oo00o(null), continuation);
        return objOooO0Oo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objOooO0Oo : Unit.INSTANCE;
    }

    @Nullable
    public static GiftPropModel OooO0O0(int i) {
        Map<Integer, GiftPropModel> value = f44351OooO00o.getValue();
        if (value != null) {
            return value.get(Integer.valueOf(i));
        }
        return null;
    }

    public static boolean OooO0OO() {
        long redPostCountLocal;
        List<GiftPropAll> value = f44354OooO0Oo.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            redPostCountLocal = 0;
            while (it.hasNext()) {
                redPostCountLocal += ((GiftPropAll) it.next()).getRedPostCountLocal();
            }
        } else {
            redPostCountLocal = 0;
        }
        return redPostCountLocal > 0;
    }

    @JvmStatic
    public static final void OooO0Oo(boolean z) {
        OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new OooO0OO(z, null));
    }

    public static void OooO0o(int i, long j, long j2) {
        OooOOO.OooO0OO(CoroutineScopeKt.MainScope(), new OooO(j, j2, i, null));
    }

    public static void OooO0o0(@NotNull LifecycleOwner owner, @NotNull Observer observer) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(observer, "observer");
        OooOOO.OooO0O0(CoroutineScopeKt.MainScope(), new OooO0o(null));
        f44354OooO0Oo.observe(owner, observer);
    }
}
