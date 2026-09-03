package p089o000o000;

import androidx.recyclerview.widget.OooOo;
import java.util.Objects;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0000oo extends OooOo.OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0000O00<Object> f28753OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0000O00<Object> f28754OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ OooOo.OooO<Object> f28755OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f28756OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ int f28757OooO0o0;

    public o0000oo(o0000O00<Object> o0000o00, o0000O00<Object> o0000o01, OooOo.OooO<Object> oooO, int i, int i2) {
        this.f28753OooO00o = o0000o00;
        this.f28754OooO0O0 = o0000o01;
        this.f28755OooO0OO = oooO;
        this.f28756OooO0Oo = i;
        this.f28757OooO0o0 = i2;
    }

    @Override // androidx.recyclerview.widget.OooOo.OooO0O0
    public final boolean OooO00o(int i, int i2) {
        Object objOooO0Oo = this.f28753OooO00o.OooO0Oo(i);
        Object objOooO0Oo2 = this.f28754OooO0O0.OooO0Oo(i2);
        if (objOooO0Oo == objOooO0Oo2) {
            return true;
        }
        return this.f28755OooO0OO.OooO00o(objOooO0Oo, objOooO0Oo2);
    }

    @Override // androidx.recyclerview.widget.OooOo.OooO0O0
    public final boolean OooO0O0(int i, int i2) {
        Object objOooO0Oo = this.f28753OooO00o.OooO0Oo(i);
        Object objOooO0Oo2 = this.f28754OooO0O0.OooO0Oo(i2);
        if (objOooO0Oo == objOooO0Oo2) {
            return true;
        }
        return this.f28755OooO0OO.OooO0O0(objOooO0Oo, objOooO0Oo2);
    }

    @Override // androidx.recyclerview.widget.OooOo.OooO0O0
    @Nullable
    public final Object OooO0OO(int i, int i2) {
        if (this.f28753OooO00o.OooO0Oo(i) == this.f28754OooO0O0.OooO0Oo(i2)) {
            return Boolean.TRUE;
        }
        Objects.requireNonNull(this.f28755OooO0OO);
        return null;
    }
}
