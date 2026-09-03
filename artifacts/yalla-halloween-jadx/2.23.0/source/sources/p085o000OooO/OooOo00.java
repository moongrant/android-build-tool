package p085o000OooO;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;
import p084o000Ooo0.o00O0O;
import p094o000o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 implements o00O0O {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MutableLiveData<o00O0O.OooO00o> f35137OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0000O00<o00O0O.OooO00o.OooO0OO> f35138OooO0Oo = new o0000O00<>();

    public OooOo00() {
        OooO00o(o00O0O.f35112OooO0O0);
    }

    public final void OooO00o(@NonNull o00O0O.OooO00o oooO00o) {
        this.f35137OooO0OO.postValue(oooO00o);
        boolean z = oooO00o instanceof o00O0O.OooO00o.OooO0OO;
        o0000O00<o00O0O.OooO00o.OooO0OO> o0000o00 = this.f35138OooO0Oo;
        if (z) {
            o0000o00.OooO0oo((o00O0O.OooO00o.OooO0OO) oooO00o);
        } else if (oooO00o instanceof o00O0O.OooO00o.C0411OooO00o) {
            o0000o00.OooOO0(((o00O0O.OooO00o.C0411OooO00o) oooO00o).f35113OooO00o);
        }
    }
}
