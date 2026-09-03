package p107o000ooO0;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;
import p102o000oo.o00Oo0;
import p236o00oOoo.o00OOOO0;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo00 implements o00Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MutableLiveData<o00Oo0.OooO0O0> f29955OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OOOO0<o00Oo0.OooO0O0.OooO0OO> f29956OooO0Oo = new o00OOOO0<>();

    public OooOo00() {
        OooO00o(o00Oo0.f29812OooO0O0);
    }

    public final void OooO00o(@NonNull o00Oo0.OooO0O0 oooO0O0) {
        this.f29955OooO0OO.postValue(oooO0O0);
        if (oooO0O0 instanceof o00Oo0.OooO0O0.OooO0OO) {
            this.f29956OooO0Oo.OooOO0((o00Oo0.OooO0O0.OooO0OO) oooO0O0);
        } else if (oooO0O0 instanceof o00Oo0.OooO0O0.OooO00o) {
            this.f29956OooO0Oo.OooOO0O(((o00Oo0.OooO0O0.OooO00o) oooO0O0).f29813OooO00o);
        }
    }
}
