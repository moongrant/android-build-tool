package oo00o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO implements p115o00O00oO.oo0o0Oo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final MutableLiveData<o00O00oO.oo0o0Oo.OooO00o> f60261OooO0OO = new MutableLiveData<>();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p117o00O0OOo.o00000O<o00O00oO.oo0o0Oo.OooO00o.OooO0OO> f60262OooO0Oo = new p117o00O0OOo.o00000O<>();

    public o000oOoO() {
        OooO00o(p115o00O00oO.oo0o0Oo.f36164OooO0O0);
    }

    public final void OooO00o(@NonNull o00O00oO.oo0o0Oo.OooO00o oooO00o) {
        this.f60261OooO0OO.postValue(oooO00o);
        boolean z = oooO00o instanceof o00O00oO.oo0o0Oo.OooO00o.OooO0OO;
        p117o00O0OOo.o00000O<o00O00oO.oo0o0Oo.OooO00o.OooO0OO> o00000o = this.f60262OooO0Oo;
        if (z) {
            o00000o.OooO((o00O00oO.oo0o0Oo.OooO00o.OooO0OO) oooO00o);
        } else if (oooO00o instanceof o00O00oO.oo0o0Oo.OooO00o.C0414OooO00o) {
            o00000o.OooOO0(((o00O00oO.oo0o0Oo.OooO00o.C0414OooO00o) oooO00o).f36165OooO00o);
        }
    }
}
