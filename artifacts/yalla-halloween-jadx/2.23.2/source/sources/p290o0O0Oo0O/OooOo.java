package p290o0O0Oo0O;

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
import p289o0O0Oo0.OooOO0O;
import p289o0O0Oo0.OooOOO0;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0O f41620OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOOO0 f41621OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41622OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO00o f41623OooO0Oo = new OooO00o(false);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f41625OooO0o0 = new OooO00o(true);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicMarkableReference<String> f41624OooO0o = new AtomicMarkableReference<>(null, false);

    public class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AtomicMarkableReference<OooO0o> f41626OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f41627OooO0O0 = new AtomicReference<>(null);

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f41628OooO0OO;

        public OooO00o(boolean z) {
            this.f41628OooO0OO = z;
            this.f41626OooO00o = new AtomicMarkableReference<>(new OooO0o(z ? 8192 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY), false);
        }

        public final boolean OooO00o(String str, String str2) {
            synchronized (this) {
                boolean zOooO0OO = this.f41626OooO00o.getReference().OooO0OO(str, str2);
                boolean z = false;
                if (!zOooO0OO) {
                    return false;
                }
                AtomicMarkableReference<OooO0o> atomicMarkableReference = this.f41626OooO00o;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                Callable<Void> callable = new Callable() { // from class: o0O0Oo0O.OooOo00
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        Map<String, String> mapOooO00o;
                        BufferedWriter bufferedWriter;
                        OooOo.OooO00o oooO00o = this.f41630OooO00o;
                        BufferedWriter bufferedWriter2 = null;
                        oooO00o.f41627OooO0O0.set(null);
                        synchronized (oooO00o) {
                            if (oooO00o.f41626OooO00o.isMarked()) {
                                mapOooO00o = oooO00o.f41626OooO00o.getReference().OooO00o();
                                AtomicMarkableReference<OooO0o> atomicMarkableReference2 = oooO00o.f41626OooO00o;
                                atomicMarkableReference2.set(atomicMarkableReference2.getReference(), false);
                            } else {
                                mapOooO00o = null;
                            }
                        }
                        if (mapOooO00o != null) {
                            OooOo oooOo = OooOo.this;
                            OooOO0O oooOO0O = oooOo.f41620OooO00o;
                            String str3 = oooOo.f41622OooO0OO;
                            File fileOooO0O0 = oooO00o.f41628OooO0OO ? oooOO0O.f41599OooO00o.OooO0O0(str3, "internal-keys") : oooOO0O.f41599OooO00o.OooO0O0(str3, "keys");
                            try {
                                String string = new JSONObject(mapOooO00o).toString();
                                bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooO0O0), OooOO0O.f41598OooO0O0));
                                try {
                                    bufferedWriter.write(string);
                                    bufferedWriter.flush();
                                } catch (Exception e) {
                                    e = e;
                                    try {
                                        Log.w("FirebaseCrashlytics", "Error serializing key/value metadata.", e);
                                        OooOO0O.OooO0Oo(fileOooO0O0);
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedWriter2 = bufferedWriter;
                                        bufferedWriter = bufferedWriter2;
                                        OooOO0O.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    OooOO0O.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter = bufferedWriter2;
                                OooOO0O.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                                throw th;
                            }
                            OooOO0O.OooO00o(bufferedWriter, "Failed to close key/value metadata file.");
                        }
                        return null;
                    }
                };
                AtomicReference<Callable<Void>> atomicReference = this.f41627OooO0O0;
                do {
                    if (atomicReference.compareAndSet(null, callable)) {
                        z = true;
                        break;
                    }
                } while (atomicReference.get() == null);
                if (z) {
                    OooOo.this.f41621OooO0O0.OooO00o(callable);
                }
                return true;
            }
        }
    }

    public OooOo(String str, OooOo00 oooOo00, OooOOO0 oooOOO0) {
        this.f41622OooO0OO = str;
        this.f41620OooO00o = new OooOO0O(oooOo00);
        this.f41621OooO0O0 = oooOOO0;
    }
}
