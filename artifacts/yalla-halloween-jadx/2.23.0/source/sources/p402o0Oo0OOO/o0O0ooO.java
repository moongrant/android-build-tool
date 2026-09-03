package p402o0Oo0OOO;

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
import p464o0Oooo.o000000O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o0O0ooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static int f44521OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f44522OooO0O0;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f44523OooO0Oo = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer it = num;
            int i = o0O0ooO.f44521OooO00o;
            if (it == null || it.intValue() != i) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                o0O0ooO.f44521OooO00o = it.intValue();
                o0O0ooO.f44522OooO0O0.postValue(new ArrayList());
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
                int i = o0O0ooO.f44521OooO00o;
                BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new SharedLuckyPacketManager$loadData$1(null), 3, null);
            }
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f44524OooO0Oo;

        public OooO0OO(OooO00o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f44524OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f44524OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f44524OooO0Oo;
        }

        public final int hashCode() {
            return this.f44524OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44524OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        T value = o000000O.OooOOO0().getValue();
        Intrinsics.checkNotNull(value);
        f44521OooO00o = ((Number) value).intValue();
        o000000O.OooOOO0().observeForever(new OooO0OO(OooO00o.f44523OooO0Oo));
        f44522OooO0O0 = new OooO0O0();
    }
}
