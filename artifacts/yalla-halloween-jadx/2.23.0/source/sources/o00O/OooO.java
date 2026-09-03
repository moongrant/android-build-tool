package o00O;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p126o00O0oOo.o000OOo;
import p127o00O0oo.o00oO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final File f35940OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f35941OooO0OO;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public p121o00O0o.OooO0OO f35943OooO0o0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO0OO f35942OooO0Oo = new OooO0OO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f35939OooO00o = new OooOo00();

    @Deprecated
    public OooO(File file, long j) {
        this.f35940OooO0O0 = file;
        this.f35941OooO0OO = j;
    }

    @Override // o00O.OooO00o
    public final File OooO00o(o000OOo o000ooo2) {
        String strOooO0O0 = this.f35939OooO00o.OooO0O0(o000ooo2);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strOooO0O0 + " for for Key: " + o000ooo2);
        }
        try {
            o00O0o.OooO0OO.OooO oooOOooOo00 = OooO0OO().OooOo00(strOooO0O0);
            if (oooOOooOo00 != null) {
                return oooOOooOo00.f36653OooO00o[0];
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
    @Override // o00O.OooO00o
    public final void OooO0O0(o000OOo o000ooo2, o00oO0o o00oo0o2) {
        OooO0OO.OooO00o OooO00o2;
        String strOooO0O0 = this.f35939OooO00o.OooO0O0(o000ooo2);
        OooO0OO oooO0OO = this.f35942OooO0Oo;
        synchronized (oooO0OO) {
            OooO00o2 = (OooO0OO.OooO00o) oooO0OO.f35944OooO00o.get(strOooO0O0);
            if (OooO00o2 == null) {
                OooO00o2 = oooO0OO.f35945OooO0O0.OooO00o();
                oooO0OO.f35944OooO00o.put(strOooO0O0, OooO00o2);
            }
            OooO00o2.f35947OooO0O0++;
        }
        OooO00o2.f35946OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strOooO0O0 + " for for Key: " + o000ooo2);
            }
            try {
                p121o00O0o.OooO0OO OooO0OO2 = OooO0OO();
                if (OooO0OO2.OooOo00(strOooO0O0) == null) {
                    p121o00O0o.OooO0OO.C0421OooO0OO c0421OooO0OOOooOOo0 = OooO0OO2.OooOOo0(strOooO0O0);
                    if (c0421OooO0OOOooOOo0 == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strOooO0O0));
                    }
                    try {
                        if (o00oo0o2.f36840OooO00o.OooO00o(o00oo0o2.f36841OooO0O0, c0421OooO0OOOooOOo0.OooO0O0(), o00oo0o2.f36842OooO0OO)) {
                            p121o00O0o.OooO0OO.OooO00o(p121o00O0o.OooO0OO.this, c0421OooO0OOOooOOo0, true);
                            c0421OooO0OOOooOOo0.f36657OooO0OO = true;
                        }
                        if (!c0421OooO0OOOooOOo0.f36657OooO0OO) {
                            try {
                                c0421OooO0OOOooOOo0.OooO00o();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        if (!c0421OooO0OOOooOOo0.f36657OooO0OO) {
                            try {
                                c0421OooO0OOOooOOo0.OooO00o();
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
            this.f35942OooO0Oo.OooO00o(strOooO0O0);
        } catch (Throwable th2) {
            this.f35942OooO0Oo.OooO00o(strOooO0O0);
            throw th2;
        }
    }

    public final synchronized p121o00O0o.OooO0OO OooO0OO() throws IOException {
        if (this.f35943OooO0o0 == null) {
            this.f35943OooO0o0 = p121o00O0o.OooO0OO.OooOo(this.f35940OooO0O0, this.f35941OooO0OO);
        }
        return this.f35943OooO0o0;
    }

    public final synchronized void OooO0Oo() {
        this.f35943OooO0o0 = null;
    }

    @Override // o00O.OooO00o
    public final synchronized void clear() {
        try {
            try {
                p121o00O0o.OooO0OO OooO0OO2 = OooO0OO();
                OooO0OO2.close();
                p121o00O0o.OooO.OooO00o(OooO0OO2.f36640OooO0Oo);
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
