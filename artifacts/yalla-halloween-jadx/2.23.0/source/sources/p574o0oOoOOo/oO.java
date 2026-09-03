package p574o0oOoOOo;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
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
import o000O00O.OooOOO;
import o000O00O.o000O000;
import o000O00O.o000O0o;
import o000O00O.o000Oo0;
import o000O00O.o00O000o;
import org.jetbrains.annotations.NotNull;
import p403o0Oo0OOo.oO0O00o0;
import p464o0Oooo.o000000O;
import p581o0oOoo00.o000OOo;

/* JADX INFO: loaded from: classes5.dex */
@StabilityInferred(parameters = 0)
public final class oO extends ViewModel {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LiveData<SystemMessage> f56316OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LiveData<o0OOO0o<SystemMessage>> f56317OooO0O0;

    public static final class OooO00o extends Lambda implements Function0<o0O0O00<Integer, SystemMessage>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f56318OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00<Integer, SystemMessage> invoke() {
            oO0O00o0 oo0o00o0Oooo000 = o000OOo.OooO00o().Oooo000();
            o000000O o000000o2 = o000000O.f46674OooO00o;
            return oo0o00o0Oooo000.OooO0Oo((Long) o000000O.OooOOo0().getValue());
        }
    }

    public oO() {
        oO0O00o0 oo0o00o0Oooo000 = o000OOo.OooO00o().Oooo000();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.f56316OooO00o = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(oo0o00o0Oooo000.OooO0o0(((Number) OooO0OO.OooO0O0()).longValue()), 300L), (CoroutineContext) null, 0L, 3, (Object) null);
        CoroutineScope viewModelScope = ViewModelKt.getViewModelScope(this);
        Intrinsics.checkNotNullParameter(viewModelScope, "viewModelScope");
        OooO00o pagingSourceFactory = OooO00o.f56318OooO0Oo;
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        o000Oo0 config = new o000Oo0(20, 5, false, 20);
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(pagingSourceFactory, "pagingSourceFactory");
        this.f56317OooO0O0 = FlowLiveDataConversions.asLiveData$default(FlowKt.debounce(OooOOO.OooO00o(new Oooo0(pagingSourceFactory instanceof o00O000o ? new o000O000(pagingSourceFactory) : new o000O0o(pagingSourceFactory, null), null, config).f7179OooO0o, viewModelScope), 500L), (CoroutineContext) null, 0L, 3, (Object) null);
    }
}
