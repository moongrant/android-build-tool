package p617o0oo0o;

import androidx.lifecycle.ViewModelProvider;
import com.yalla.yalla.ui.vm.moment.MomentVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class o000Oo0 extends Lambda implements Function0<MomentVM> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ o000O000 f48546Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o000O000 o000o001) {
        super(0);
        this.f48546Oooo0o = o000o001;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MomentVM invoke() {
        return (MomentVM) new ViewModelProvider(this.f48546Oooo0o.f48496OooO00o).get(MomentVM.class);
    }
}
