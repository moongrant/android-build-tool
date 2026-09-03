package p442o0OoOoO0;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.event.vm.EventViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o0O000 implements Observer<Long> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f46222OooO0Oo;

    public o0O000(EventViewModel eventViewModel) {
        this.f46222OooO0Oo = eventViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Long l) {
        this.f46222OooO0Oo.updateReadState(l.longValue());
    }
}
