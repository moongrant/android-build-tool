package p034OoooO0O;

import androidx.compose.foundation.text.Handle;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o00O0O.OooO;
import p032OoooO0.o00O00OO;
import p032OoooO0.o0O000;
import p032OoooO0.o0O0000O;
import p042Ooooo0o.o000O0O0;
import p218o00oO0O.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final class o0000 implements o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3467OooO00o;

    public o0000(o0000oo o0000ooVar) {
        this.f3467OooO00o = o0000ooVar;
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO00o(long j) {
        o0000oo o0000ooVar = this.f3467OooO00o;
        o0000ooVar.f3515OooOO0O = oo0o0Oo.OooO00o(o0000ooVar.OooOO0(true));
        o0000oo o0000ooVar2 = this.f3467OooO00o;
        o0000ooVar2.f3519OooOOOO.setValue(new OooO(o0000ooVar2.f3515OooOO0O));
        o0000oo o0000ooVar3 = this.f3467OooO00o;
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        o0000ooVar3.f3518OooOOO0 = OooO.f30392OooO0OO;
        o0000ooVar3.f3517OooOOO.setValue(Handle.Cursor);
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0O0() {
        o0000oo.OooO0O0(this.f3467OooO00o, null);
        o0000oo.OooO00o(this.f3467OooO00o, null);
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0OO() {
        o0000oo.OooO0O0(this.f3467OooO00o, Handle.Cursor);
        o0000oo o0000ooVar = this.f3467OooO00o;
        o0000ooVar.f3519OooOOOO.setValue(new OooO(oo0o0Oo.OooO00o(o0000ooVar.OooOO0(true))));
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0Oo(long j) {
        o0O000 o0o000OooO0OO;
        o0OOO0o o0ooo0o2;
        o0000oo o0000ooVar = this.f3467OooO00o;
        o0000ooVar.f3518OooOOO0 = OooO.OooO0oO(o0000ooVar.f3518OooOOO0, j);
        o0O0000O o0o0000o2 = this.f3467OooO00o.f3509OooO0Oo;
        if (o0o0000o2 == null || (o0o000OooO0OO = o0o0000o2.OooO0OO()) == null || (o0ooo0o2 = o0o000OooO0OO.f3314OooO00o) == null) {
            return;
        }
        o0000oo o0000ooVar2 = this.f3467OooO00o;
        o0000ooVar2.f3519OooOOOO.setValue(new OooO(OooO.OooO0oO(o0000ooVar2.f3515OooOO0O, o0000ooVar2.f3518OooOOO0)));
        OooO OooO2 = o0000ooVar2.OooO();
        Intrinsics.checkNotNull(OooO2);
        int iOooOOO0 = o0ooo0o2.OooOOO0(OooO2.f30395OooO00o);
        long jOooO00o = o000O0O0.OooO00o(iOooOOO0, iOooOOO0);
        if (o0OO00O.OooO0O0(jOooO00o, o0000ooVar2.OooOO0O().f27237OooO0O0)) {
            return;
        }
        oo000o oo000oVar = o0000ooVar2.f3513OooO0oo;
        if (oo000oVar != null) {
            oo000oVar.OooO00o();
        }
        o0000ooVar2.f3508OooO0OO.invoke(o0000ooVar2.OooO0o0(o0000ooVar2.OooOO0O().f27236OooO00o, jOooO00o));
    }

    @Override // p032OoooO0.o00O00OO
    public final void onCancel() {
    }

    @Override // p032OoooO0.o00O00OO
    public final void onStop() {
        o0000oo.OooO0O0(this.f3467OooO00o, null);
        o0000oo.OooO00o(this.f3467OooO00o, null);
    }
}
