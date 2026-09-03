package p101o000oo;

import androidx.recyclerview.widget.Oooo000;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O00 extends Oooo000.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0<Object> f35442OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000Oo0<Object> f35443OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ Oooo000.OooO<Object> f35444OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f35445OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f35446OooO0o0;

    public o000O00(o000Oo0<Object> o000oo1, o000Oo0<Object> o000oo2, Oooo000.OooO<Object> oooO, int i, int i2) {
        this.f35442OooO00o = o000oo1;
        this.f35443OooO0O0 = o000oo2;
        this.f35444OooO0OO = oooO;
        this.f35445OooO0Oo = i;
        this.f35446OooO0o0 = i2;
    }

    @Override // androidx.recyclerview.widget.Oooo000.OooO0O0
    public final boolean OooO00o(int i, int i2) {
        Object objOooO0Oo = this.f35442OooO00o.OooO0Oo(i);
        Object objOooO0Oo2 = this.f35443OooO0O0.OooO0Oo(i2);
        if (objOooO0Oo == objOooO0Oo2) {
            return true;
        }
        return this.f35444OooO0OO.OooO00o(objOooO0Oo, objOooO0Oo2);
    }

    @Override // androidx.recyclerview.widget.Oooo000.OooO0O0
    public final boolean OooO0O0(int i, int i2) {
        Object objOooO0Oo = this.f35442OooO00o.OooO0Oo(i);
        Object objOooO0Oo2 = this.f35443OooO0O0.OooO0Oo(i2);
        if (objOooO0Oo == objOooO0Oo2) {
            return true;
        }
        return this.f35444OooO0OO.OooO0O0(objOooO0Oo, objOooO0Oo2);
    }

    @Override // androidx.recyclerview.widget.Oooo000.OooO0O0
    @Nullable
    public final Object OooO0OO(int i, int i2) {
        if (this.f35442OooO00o.OooO0Oo(i) == this.f35443OooO0O0.OooO0Oo(i2)) {
            return Boolean.TRUE;
        }
        this.f35444OooO0OO.getClass();
        return null;
    }
}
