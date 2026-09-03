package p034OoooO0O;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.platform.o00OO0OO;
import kotlin.jvm.internal.Intrinsics;
import o00000O.o0OO00O;
import o00000O.o0OOO0o;
import o00O0O.OooO;
import p032OoooO0.o00O00OO;
import p032OoooO0.o0O000;
import p032OoooO0.o0O0000O;
import p054o00000oo.o00O0O00;

/* JADX INFO: loaded from: classes.dex */
public final class o0000O00 implements o00O00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000oo f3497OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f3498OooO0O0;

    public o0000O00(o0000oo o0000ooVar, boolean z) {
        this.f3497OooO00o = o0000ooVar;
        this.f3498OooO0O0 = z;
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO00o(long j) {
        o0000oo o0000ooVar = this.f3497OooO00o;
        o0000ooVar.f3515OooOO0O = oo0o0Oo.OooO00o(o0000ooVar.OooOO0(this.f3498OooO0O0));
        o0000oo o0000ooVar2 = this.f3497OooO00o;
        o0000ooVar2.f3519OooOOOO.setValue(new OooO(o0000ooVar2.f3515OooOO0O));
        o0000oo o0000ooVar3 = this.f3497OooO00o;
        OooO.OooO00o oooO00o = OooO.f30391OooO0O0;
        o0000ooVar3.f3518OooOOO0 = OooO.f30392OooO0OO;
        o0000ooVar3.f3517OooOOO.setValue(this.f3498OooO0O0 ? Handle.SelectionStart : Handle.SelectionEnd);
        o0O0000O o0o0000o2 = this.f3497OooO00o.f3509OooO0Oo;
        if (o0o0000o2 == null) {
            return;
        }
        o0o0000o2.f3318OooO = false;
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0O0() {
        o0000oo.OooO0O0(this.f3497OooO00o, null);
        o0000oo.OooO00o(this.f3497OooO00o, null);
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0OO() {
        o0000oo.OooO0O0(this.f3497OooO00o, this.f3498OooO0O0 ? Handle.SelectionStart : Handle.SelectionEnd);
        o0000oo o0000ooVar = this.f3497OooO00o;
        o0000ooVar.f3519OooOOOO.setValue(new OooO(oo0o0Oo.OooO00o(o0000ooVar.OooOO0(this.f3498OooO0O0))));
    }

    @Override // p032OoooO0.o00O00OO
    public final void OooO0Oo(long j) {
        o0O000 o0o000OooO0OO;
        o0OOO0o o0ooo0o2;
        int iOooO0O0;
        int iOooOOO0;
        o0000oo o0000ooVar = this.f3497OooO00o;
        o0000ooVar.f3518OooOOO0 = OooO.OooO0oO(o0000ooVar.f3518OooOOO0, j);
        o0O0000O o0o0000o2 = this.f3497OooO00o.f3509OooO0Oo;
        if (o0o0000o2 != null && (o0o000OooO0OO = o0o0000o2.OooO0OO()) != null && (o0ooo0o2 = o0o000OooO0OO.f3314OooO00o) != null) {
            o0000oo o0000ooVar2 = this.f3497OooO00o;
            boolean z = this.f3498OooO0O0;
            o0000ooVar2.f3519OooOOOO.setValue(new OooO(OooO.OooO0oO(o0000ooVar2.f3515OooOO0O, o0000ooVar2.f3518OooOOO0)));
            if (z) {
                OooO OooO2 = o0000ooVar2.OooO();
                Intrinsics.checkNotNull(OooO2);
                iOooO0O0 = o0ooo0o2.OooOOO0(OooO2.f30395OooO00o);
            } else {
                o00O0O00 o00o0o01 = o0000ooVar2.f3507OooO0O0;
                long j2 = o0000ooVar2.OooOO0O().f27237OooO0O0;
                o0OO00O.OooO00o oooO00o = o0OO00O.f26874OooO0O0;
                iOooO0O0 = o00o0o01.OooO0O0((int) (j2 >> 32));
            }
            int i = iOooO0O0;
            if (z) {
                iOooOOO0 = o0000ooVar2.f3507OooO0O0.OooO0O0(o0OO00O.OooO0Oo(o0000ooVar2.OooOO0O().f27237OooO0O0));
            } else {
                OooO OooO3 = o0000ooVar2.OooO();
                Intrinsics.checkNotNull(OooO3);
                iOooOOO0 = o0ooo0o2.OooOOO0(OooO3.f30395OooO00o);
            }
            o0000oo.OooO0OO(o0000ooVar2, o0000ooVar2.OooOO0O(), i, iOooOOO0, z, o00oO0o.OooO00o.f3548OooO0OO);
        }
        o0O0000O o0o0000o3 = this.f3497OooO00o.f3509OooO0Oo;
        if (o0o0000o3 == null) {
            return;
        }
        o0o0000o3.f3318OooO = false;
    }

    @Override // p032OoooO0.o00O00OO
    public final void onCancel() {
    }

    @Override // p032OoooO0.o00O00OO
    public final void onStop() {
        o0000oo.OooO0O0(this.f3497OooO00o, null);
        o0000oo.OooO00o(this.f3497OooO00o, null);
        o0000oo o0000ooVar = this.f3497OooO00o;
        o0O0000O o0o0000o2 = o0000ooVar.f3509OooO0Oo;
        if (o0o0000o2 != null) {
            o0o0000o2.f3318OooO = true;
        }
        o00OO0OO o00oo0oo = o0000ooVar.f3512OooO0oO;
        if ((o00oo0oo != null ? o00oo0oo.getStatus() : null) == TextToolbarStatus.Hidden) {
            this.f3497OooO00o.OooOOOO();
        }
    }
}
