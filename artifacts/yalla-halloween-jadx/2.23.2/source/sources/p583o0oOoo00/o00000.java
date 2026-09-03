package p583o0oOoo00;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.yalla.yalla.data.cache.SharedLuckyPacketManager$loadData$1;
import com.yalla.yalla.model.gift.GiftPropModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f56630OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f56631OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56632OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            int i = o00000.f56630OooO00o;
            if (num2 == null || num2.intValue() != i) {
                Intrinsics.checkNotNull(num2);
                o00000.f56630OooO00o = num2.intValue();
                o00000.f56631OooO0O0.postValue(new ArrayList());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends MutableLiveData<List<? extends GiftPropModel>> {
        @Override // androidx.lifecycle.LiveData
        public final void observe(@NotNull LifecycleOwner owner, @NotNull Observer<? super List<GiftPropModel>> observer) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(observer, "observer");
            removeObservers(owner);
            super.observe(owner, observer);
            List<? extends GiftPropModel> value = getValue();
            if (value == null || value.isEmpty()) {
                int i = o00000.f56630OooO00o;
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SharedLuckyPacketManager$loadData$1(null), 3, null);
            }
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f56633OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f56633OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f56633OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f56633OooO0Oo;
        }

        public final int hashCode() {
            return this.f56633OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f56633OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        T value = o0O00oO0.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        f56630OooO00o = ((Number) value).intValue();
        o0O00oO0.OooOOO0().observeForever(new OooO0OO(OooO00o.f56632OooO0Oo));
        f56631OooO0O0 = new OooO0O0();
    }
}
