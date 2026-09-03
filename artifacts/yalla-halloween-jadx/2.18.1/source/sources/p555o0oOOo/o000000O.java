package p555o0oOOo;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p214o00oO0.o00O0O0;
import p217o00oO00o.o000000;
import p242o00oo000.OooOO0O;
import p242o00oo000.OooOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O implements oo0o0Oo {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f44639OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f44640OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public OooOO0O f44642OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo f44641OooO0Oo = new o000OOo();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0000 f44638OooO00o = new o0000();

    @Deprecated
    public o000000O(File file, long j) {
        this.f44639OooO0O0 = file;
        this.f44640OooO0OO = j;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o0oOOo.o000OOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayDeque, java.util.Queue<o0oOOo.o000OOo$OooO00o>] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.HashMap, java.util.Map<java.lang.String, o0oOOo.o000OOo$OooO00o>] */
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
    @Override // p555o0oOOo.oo0o0Oo
    public final void OooO00o(o000000 o000000Var, oo0o0Oo.OooO0O0 oooO0O0) {
        o000OOo.OooO00o oooO00o;
        String strOooO00o = this.f44638OooO00o.OooO00o(o000000Var);
        o000OOo o000ooo2 = this.f44641OooO0Oo;
        synchronized (o000ooo2) {
            oooO00o = (o000OOo.OooO00o) o000ooo2.f44654OooO00o.get(strOooO00o);
            if (oooO00o == null) {
                o000OOo.OooO0O0 oooO0O1 = o000ooo2.f44655OooO0O0;
                synchronized (oooO0O1.f44658OooO00o) {
                    oooO00o = (o000OOo.OooO00o) oooO0O1.f44658OooO00o.poll();
                }
                if (oooO00o == null) {
                    oooO00o = new o000OOo.OooO00o();
                }
                o000ooo2.f44654OooO00o.put(strOooO00o, oooO00o);
            }
            oooO00o.f44657OooO0O0++;
        }
        oooO00o.f44656OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strOooO00o + " for for Key: " + o000000Var);
            }
            try {
                OooOO0O oooOO0OOooO0OO = OooO0OO();
                if (oooOO0OOooO0OO.OooOOo(strOooO00o) == null) {
                    OooOO0O.OooO0OO OooO0oo2 = oooOO0OOooO0OO.OooO0oo(strOooO00o);
                    if (OooO0oo2 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strOooO00o);
                    }
                    try {
                        o00O0O0 o00o0o0 = (o00O0O0) oooO0O0;
                        if (o00o0o0.f33410OooO00o.OooO0O0(o00o0o0.f33411OooO0O0, OooO0oo2.OooO0O0(), o00o0o0.f33412OooO0OO)) {
                            OooOO0O.OooO00o(OooOO0O.this, OooO0oo2, true);
                            OooO0oo2.f34140OooO0OO = true;
                        }
                        if (!OooO0oo2.f34140OooO0OO) {
                            try {
                                OooO0oo2.OooO00o();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!OooO0oo2.f34140OooO0OO) {
                            try {
                                OooO0oo2.OooO00o();
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
            this.f44641OooO0Oo.OooO00o(strOooO00o);
        } catch (Throwable th2) {
            this.f44641OooO0Oo.OooO00o(strOooO00o);
            throw th2;
        }
    }

    @Override // p555o0oOOo.oo0o0Oo
    public final File OooO0O0(o000000 o000000Var) {
        String strOooO00o = this.f44638OooO00o.OooO00o(o000000Var);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strOooO00o + " for for Key: " + o000000Var);
        }
        try {
            OooOO0O.OooO oooOOooOOo = OooO0OO().OooOOo(strOooO00o);
            if (oooOOooOOo != null) {
                return oooOOooOOo.f34136OooO00o[0];
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

    public final synchronized OooOO0O OooO0OO() throws IOException {
        if (this.f44642OooO0o0 == null) {
            this.f44642OooO0o0 = OooOO0O.OooOo0O(this.f44639OooO0O0, this.f44640OooO0OO);
        }
        return this.f44642OooO0o0;
    }

    public final synchronized void OooO0Oo() {
        this.f44642OooO0o0 = null;
    }

    @Override // p555o0oOOo.oo0o0Oo
    public final synchronized void clear() {
        try {
            try {
                OooOO0O oooOO0OOooO0OO = OooO0OO();
                oooOO0OOooO0OO.close();
                OooOOO.OooO00o(oooOO0OOooO0OO.f34123Oooo0o);
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
