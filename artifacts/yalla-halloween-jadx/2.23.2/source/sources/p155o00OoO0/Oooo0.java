package p155o00OoO0;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p144o00Oo.o000;
import p152o00Oo0o0.o000000O;
import p152o00Oo0o0.o000OOo;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements OooOo00 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f37939OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f37940OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o000OOo f37942OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo f37941OooO0Oo = new OooOo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final oo000o f37938OooO00o = new oo000o();

    @Deprecated
    public Oooo0(File file, long j) {
        this.f37939OooO0O0 = file;
        this.f37940OooO0OO = j;
    }

    public final synchronized o000OOo OooO00o() throws IOException {
        if (this.f37942OooO0o0 == null) {
            this.f37942OooO0o0 = o000OOo.OooOooo(this.f37939OooO0O0, this.f37940OooO0OO);
        }
        return this.f37942OooO0o0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p155o00OoO0.OooOo00
    public final void OooO0O0(o0OOO0o o0ooo0o2, o000 o000Var) {
        OooOo.OooO00o OooO00o2;
        String strOooO0O0 = this.f37938OooO00o.OooO0O0(o0ooo0o2);
        OooOo oooOo = this.f37941OooO0Oo;
        synchronized (oooOo) {
            OooO00o2 = (OooOo.OooO00o) oooOo.f37933OooO00o.get(strOooO0O0);
            if (OooO00o2 == null) {
                OooO00o2 = oooOo.f37934OooO0O0.OooO00o();
                oooOo.f37933OooO00o.put(strOooO0O0, OooO00o2);
            }
            OooO00o2.f37936OooO0O0++;
        }
        OooO00o2.f37935OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strOooO0O0 + " for for Key: " + o0ooo0o2);
            }
            try {
                o000OOo o000oooOooO00o = OooO00o();
                if (o000oooOooO00o.OooOo0(strOooO0O0) == null) {
                    o000OOo.OooO0OO oooO0OOOooOOo = o000oooOooO00o.OooOOo(strOooO0O0);
                    if (oooO0OOOooOOo == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strOooO0O0));
                    }
                    try {
                        if (o000Var.f37532OooO00o.OooO0O0(o000Var.f37533OooO0O0, oooO0OOOooOOo.OooO0O0(), o000Var.f37534OooO0OO)) {
                            o000OOo.OooO00o(o000OOo.this, oooO0OOOooOOo, true);
                            oooO0OOOooOOo.f37813OooO0OO = true;
                        }
                        if (!oooO0OOOooOOo.f37813OooO0OO) {
                            try {
                                oooO0OOOooOOo.OooO00o();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!oooO0OOOooOOo.f37813OooO0OO) {
                            try {
                                oooO0OOOooOOo.OooO00o();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
            this.f37941OooO0Oo.OooO00o(strOooO0O0);
        } catch (Throwable th2) {
            this.f37941OooO0Oo.OooO00o(strOooO0O0);
            throw th2;
        }
    }

    @Override // p155o00OoO0.OooOo00
    public final File OooO0OO(o0OOO0o o0ooo0o2) {
        String strOooO0O0 = this.f37938OooO00o.OooO0O0(o0ooo0o2);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strOooO0O0 + " for for Key: " + o0ooo0o2);
        }
        try {
            o000OOo.OooO oooOOooOo0 = OooO00o().OooOo0(strOooO0O0);
            if (oooOOooOo0 != null) {
                return oooOOooOo0.f37809OooO00o[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    public final synchronized void OooO0Oo() {
        this.f37942OooO0o0 = null;
    }

    @Override // p155o00OoO0.OooOo00
    public final synchronized void clear() {
        try {
            try {
                o000OOo o000oooOooO00o = OooO00o();
                o000oooOooO00o.close();
                o000000O.OooO00o(o000oooOooO00o.f37796OooO0Oo);
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to clear disk cache or disk cache cleared externally", e);
                }
            }
            OooO0Oo();
        } catch (Throwable th) {
            OooO0Oo();
            throw th;
        }
    }
}
