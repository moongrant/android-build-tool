package p191o00o0O0O;

import android.content.Context;
import java.util.concurrent.Executor;
import p192o00o0OO.o0000O;
import p193o00o0OO0.o00Oo0;
import p193o00o0OO0.oo000o;
import p196o00o0Oo.o00O000o;
import p196o00o0Oo.o0O0ooO;
import p197o00o0Oo0.o000000O;
import p197o00o0Oo0.o000OOo;
import p197o00o0Oo0.o0OO00O;
import p198o00o0OoO.o00O000;
import p198o00o0OoO.o00OO00O;
import p198o00o0OoO.o00OO0O0;
import p198o00o0OoO.o0o0Oo;
import p625o0ooO000.o000;

/* JADX INFO: loaded from: classes3.dex */
public final class o000oOoO extends o000000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public o000<o000000> f38928OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000<Executor> f38929OooO0Oo = o0000O.OooO00o(oo000o.OooO00o.f38947OooO00o);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public o000 f38930OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p192o00o0OO.o000 f38931OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public o0o0Oo f38932OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public o000<o00OO00O> f38933OooO0oo;

    public o000oOoO(Context context) {
        if (context == null) {
            throw new NullPointerException("instance cannot be null");
        }
        p192o00o0OO.o000 o000Var = new p192o00o0OO.o000(context);
        this.f38931OooO0o0 = o000Var;
        this.f38930OooO0o = o0000O.OooO00o(new oo000o(o000Var, new o00Oo0(o000Var)));
        p192o00o0OO.o000 o000Var2 = this.f38931OooO0o0;
        this.f38932OooO0oO = new o0o0Oo(o000Var2);
        o000<o00OO00O> o000VarOooO00o = o0000O.OooO00o(new o00OO0O0(this.f38932OooO0oO, o0000O.OooO00o(new o00O000(o000Var2))));
        this.f38933OooO0oo = o000VarOooO00o;
        o000OOo o000ooo2 = new o000OOo();
        p192o00o0OO.o000 o000Var3 = this.f38931OooO0o0;
        o000000O o000000o2 = new o000000O(o000Var3, o000VarOooO00o, o000ooo2);
        o000<Executor> o000Var4 = this.f38929OooO0Oo;
        o000 o000Var5 = this.f38930OooO0o;
        this.f38928OooO = o0000O.OooO00o(new o00000(new o0OO00O(o000Var4, o000Var5, o000000o2, o000VarOooO00o, o000VarOooO00o), new o0O0ooO(o000Var3, o000Var5, o000VarOooO00o, o000000o2, o000Var4, o000VarOooO00o, o000VarOooO00o), new o00O000o(o000Var4, o000VarOooO00o, o000000o2, o000VarOooO00o)));
    }
}
