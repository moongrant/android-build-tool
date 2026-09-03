package p442o0OoOoO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.event.vm.EventSquareViewModel;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class o0o0Oo implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventSquareViewModel f46286OooO0Oo;

    public o0o0Oo(EventSquareViewModel eventSquareViewModel) {
        this.f46286OooO0Oo = eventSquareViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        long jLongValue = l.longValue();
        EventSquareViewModel eventSquareViewModel = this.f46286OooO0Oo;
        CollectionsKt.removeAll((List) eventSquareViewModel.getSquareEventPager().f37663OooO0Oo, (Function1) new o00OOO0O(jLongValue));
        eventSquareViewModel.getSquareEventPager().OooO0O0();
    }
}
