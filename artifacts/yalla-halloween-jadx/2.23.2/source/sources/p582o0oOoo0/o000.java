package p582o0oOoo0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.paging.Oooo0;
import androidx.paging.o0O0O00;
import androidx.paging.o0OOO0o;
import com.yalla.yalla.data.db.table.SystemMessage;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import p101o000oo.o00O000;
import p101o000oo.o00O0OOO;
import p101o000oo.o00oOoo;
import p101o000oo.o0O0ooO;
import p407o0Oo0Oo.o0OO0o00;
import p408o0Oo0Oo0.o00Oo0;
import p475o0Ooooo0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o000 extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LiveData<SystemMessage> f56620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LiveData<o0OOO0o<SystemMessage>> f56621OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<o0O0O00<Integer, SystemMessage>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56622OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, SystemMessage> invoke() {
            o0OO0o00 o0oo0o00Oooo00O = o00Oo0.OooO00o().Oooo00O();
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            return o0oo0o00Oooo00O.OooO0Oo((Long) o0O00oO0.OooOOo0().getValue());
        }
    }

    public o000() {
        o0OO0o00 o0oo0o00Oooo00O = o00Oo0.OooO00o().Oooo00O();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        this.f56620OooO00o = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(o0oo0o00Oooo00O.OooO0o0(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO00o pagingSourceFactory = OooO00o.f56622OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o00O000 config = new o00O000(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f56621OooO0O0 = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(p101o000oo.o0OOO0o.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O0OOO ? new o0O0ooO(pagingSourceFactory) : new o00oOoo(pagingSourceFactory, null), null, config).f10273OooO0o, viewModelScope), 500L), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
