package p583o0oOoo00;

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
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f56626OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f56627OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56628OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            int i = o0000.f56626OooO00o;
            if (num2 == null || num2.intValue() != i) {
                Intrinsics.checkNotNull(num2);
                o0000.f56626OooO00o = num2.intValue();
                o0000.f56627OooO0O0.postValue(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56629OooO0Oo;

        public OooO0O0(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56629OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56629OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56629OooO0Oo;
        }

        public final int hashCode() {
            return this.f56629OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56629OooO0Oo.invoke(obj);
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
                int i = o0000.f56626OooO00o;
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), Dispatchers.getIO(), null, new o0000O00(null), 2, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        T value = o0O00oO0.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        f56626OooO00o = ((Number) value).intValue();
        o0O00oO0.OooOOO0().observeForever(new OooO0O0(OooO00o.f56628OooO0Oo));
        f56627OooO0O0 = new OooO0OO();
    }
}
