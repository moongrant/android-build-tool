package p596o0oo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yalla.yalla.common.db.table.SystemMessage;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import p089o000o000.o000OO;
import p089o000o000.o000OO00;
import p089o000o000.o000OOo0;
import p089o000o000.o00O0000;
import p089o000o000.o00O00o0;
import p089o000o000.o0O0ooO;
import p089o000o000.oo0oOO0;
import p491o0o00O00.OooO0OO;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LiveData<SystemMessage> f47629OooO00o = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooO0OO.OooO00o().Oooo00o().OooO0Oo(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue()), 300), (CoroutineContext) null, 0, 3, (Object) null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LiveData<o0O0ooO<SystemMessage>> f47630OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<o00O00o0<Integer, SystemMessage>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f47631Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00o0<Integer, SystemMessage> invoke() {
            return OooO0OO.OooO00o().Oooo00o().OooO0O0(OooOOO.f41216OooO00o.OooOo().getValue());
        }
    }

    public OooOo00() {
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        OooO00o pagingSourceFactory = OooO00o.f47631Oooo0o;
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O0000 config = new o00O0000(20, 5, false, 0, 56);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f47630OooO0O0 = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(new o000OO(pagingSourceFactory instanceof oo0oOO0 ? new o000OO00(pagingSourceFactory) : new o000OOo0(pagingSourceFactory, null), null, config).f28877OooO0o, 500L), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
