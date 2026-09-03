package p044OooooOO;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import p100o000oOoO.o0o0Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o00O000o implements o0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ LiveData f4003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ Observer f4004OooO0O0;

    public o00O000o(LiveData liveData, Observer observer) {
        this.f4003OooO00o = liveData;
        this.f4004OooO0O0 = observer;
    }

    @Override // p100o000oOoO.o0o0Oo
    public final void dispose() {
        this.f4003OooO00o.removeObserver(this.f4004OooO0O0);
    }
}
