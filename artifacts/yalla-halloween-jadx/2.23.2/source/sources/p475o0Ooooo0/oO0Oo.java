package p475o0Ooooo0;

import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p289o0O0Oo0.OooOO0O;
import p290o0O0Oo0O.OooO0o;
import p290o0O0Oo0O.OooOo;
import p414o0Oo0oO.oO000O0;
import p415o0Oo0oO0.o00Ooo;

/* JADX INFO: loaded from: classes4.dex */
public final class oO0Oo extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final oO0Oo f48112OooO0Oo = new oO0Oo();

    public oO0Oo() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        boolean zEquals;
        String value = str;
        oO000O0 oo000o0OooO00o = o00Ooo.OooO00o();
        Intrinsics.checkNotNull(value);
        oo000o0OooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        oo000o0OooO00o.OooO("userIdx", value);
        final OooOo oooOo = p285o0O0OOo.OooOo.OooO00o().f41429OooO00o.f41572OooO0oO.f41547OooO0Oo;
        oooOo.getClass();
        String strOooO0O0 = OooO0o.OooO0O0(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, value);
        synchronized (oooOo.f41624OooO0o) {
            String reference = oooOo.f41624OooO0o.getReference();
            if (strOooO0O0 == null) {
                zEquals = reference == null;
            } else {
                zEquals = strOooO0O0.equals(reference);
            }
            if (!zEquals) {
                oooOo.f41624OooO0o.set(strOooO0O0, true);
                oooOo.f41621OooO0O0.OooO00o(new Callable() { // from class: o0O0Oo0O.OooOOOO
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        BufferedWriter bufferedWriter;
                        boolean z;
                        String reference2;
                        BufferedWriter bufferedWriter2;
                        OooOo oooOo2 = oooOo;
                        synchronized (oooOo2.f41624OooO0o) {
                            bufferedWriter = null;
                            z = false;
                            if (oooOo2.f41624OooO0o.isMarked()) {
                                reference2 = oooOo2.f41624OooO0o.getReference();
                                oooOo2.f41624OooO0o.set(reference2, false);
                                z = true;
                            } else {
                                reference2 = null;
                            }
                        }
                        if (z) {
                            File fileOooO0O0 = oooOo2.f41620OooO00o.f41599OooO00o.OooO0O0(oooOo2.f41622OooO0OO, "user-data");
                            try {
                                String string = new OooOO0(reference2).toString();
                                bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooO0O0), OooOO0O.f41598OooO0O0));
                                try {
                                    bufferedWriter2.write(string);
                                    bufferedWriter2.flush();
                                } catch (Exception e) {
                                    e = e;
                                    try {
                                        Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                    } catch (Throwable th) {
                                        th = th;
                                        bufferedWriter = bufferedWriter2;
                                        bufferedWriter2 = bufferedWriter;
                                        OooOO0O.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    OooOO0O.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter2 = bufferedWriter;
                                OooOO0O.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                throw th;
                            }
                            OooOO0O.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                        }
                        return null;
                    }
                });
            }
        }
        p285o0O0OOo.OooOo.OooO00o().OooO0OO("userIdx", value);
        return Unit.INSTANCE;
    }
}
