package p402o0Oo0OOO;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.model.WeeklyStarModel;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f44515OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f44516OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44517OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            int i = o00O00O.f44515OooO00o;
            if (it == null || it.intValue() != i) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o00O00O.f44515OooO00o = it.intValue();
                o00O00O.f44516OooO0O0.postValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f44518OooO0Oo;

        public OooO0O0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44518OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f44518OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f44518OooO0Oo;
        }

        public final int hashCode() {
            return this.f44518OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44518OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO0OO extends MutableLiveData<WeeklyStarModel> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super WeeklyStarModel> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            if (getValue() == null) {
                int i = o00O00O.f44515OooO00o;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new oOO00O(null), 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        T value = o000000O.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        f44515OooO00o = ((Number) value).intValue();
        o000000O.OooOOO0().observeForever(new OooO0O0(OooO00o.f44517OooO0Oo));
        f44516OooO0O0 = new OooO0OO();
    }
}
