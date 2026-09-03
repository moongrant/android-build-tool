package p448o0OoOoo;

import androidx.lifecycle.Observer;
import com.yalla.yalla.module.event.vm.EventViewModel;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Oo00<T> implements Observer {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ EventViewModel f47442OooO0Oo;

    public o00Oo00(EventViewModel eventViewModel) {
        this.f47442OooO0Oo = eventViewModel;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        this.f47442OooO0Oo.updateReadState(((Number) obj).longValue());
    }
}
