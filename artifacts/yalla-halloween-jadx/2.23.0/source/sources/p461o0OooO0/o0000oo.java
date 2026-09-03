package p461o0OooO0;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONObject;
import p285o0O0OOoo.o000oOoO;
import p285o0O0OOoo.o0OoOo0;
import p286o0O0Oo.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000O f46650OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OoOo0 f46651OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f46652OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f46653OooO0Oo = new OooO00o(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f46655OooO0o0 = new OooO00o(true);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicMarkableReference<String> f46654OooO0o = new AtomicMarkableReference<>(null, false);

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicMarkableReference<o000000O> f46656OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f46657OooO0O0 = new AtomicReference<>(null);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f46658OooO0OO;

        public OooO00o(boolean z) {
            this.f46658OooO0OO = z;
            this.f46656OooO00o = new AtomicMarkableReference<>(new o000000O(z ? 8192 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), false);
        }

        public final boolean OooO00o(String str, String str2) {
            synchronized (this) {
                boolean zOooO0OO = this.f46656OooO00o.getReference().OooO0OO(str, str2);
                boolean z = false;
                if (!zOooO0OO) {
                    return false;
                }
                AtomicMarkableReference<o000000O> atomicMarkableReference = this.f46656OooO00o;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                Callable<Void> callable = new Callable() { // from class: o0OooO0.o0000O00
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        Map<String, String> mapOooO00o;
                        BufferedWriter bufferedWriter;
                        o0000oo.OooO00o oooO00o = this.f46643OooO00o;
                        BufferedWriter bufferedWriter2 = null;
                        oooO00o.f46657OooO0O0.set(null);
                        synchronized (oooO00o) {
                            if (oooO00o.f46656OooO00o.isMarked()) {
                                mapOooO00o = oooO00o.f46656OooO00o.getReference().OooO00o();
                                AtomicMarkableReference<o000000O> atomicMarkableReference2 = oooO00o.f46656OooO00o;
                                atomicMarkableReference2.set(atomicMarkableReference2.getReference(), false);
                            } else {
                                mapOooO00o = null;
                            }
                        }
                        if (mapOooO00o != null) {
                            o0000oo o0000ooVar = o0000oo.this;
                            o00000O o00000o = o0000ooVar.f46650OooO00o;
                            String str3 = o0000ooVar.f46652OooO0OO;
                            File fileOooO0O0 = oooO00o.f46658OooO0OO ? o00000o.f46629OooO00o.OooO0O0(str3, "internal-keys") : o00000o.f46629OooO00o.OooO0O0(str3, "keys");
                            try {
                                String string = new JSONObject(mapOooO00o).toString();
                                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooO0O0), o00000O.f46628OooO0O0));
                                try {
                                    bufferedWriter.write(string);
                                    bufferedWriter.flush();
                                } catch (Exception e) {
                                    e = e;
                                    try {
                                        Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                                        o00000O.OooO0Oo(fileOooO0O0);
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedWriter2 = bufferedWriter;
                                        bufferedWriter = bufferedWriter2;
                                        o000oOoO.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    o000oOoO.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter = bufferedWriter2;
                                o000oOoO.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                throw th;
                            }
                            o000oOoO.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                        }
                        return null;
                    }
                };
                AtomicReference<Callable<Void>> atomicReference = this.f46657OooO0O0;
                do {
                    if (atomicReference.compareAndSet(null, callable)) {
                        z = true;
                        break;
                    }
                } while (atomicReference.get() == null);
                if (z) {
                    o0000oo.this.f46651OooO0O0.OooO00o(callable);
                }
                return true;
            }
        }
    }

    public o0000oo(String str, OooOo00 oooOo00, o0OoOo0 o0oooo0) {
        this.f46652OooO0OO = str;
        this.f46650OooO00o = new o00000O(oooOo00);
        this.f46651OooO0O0 = o0oooo0;
    }
}
