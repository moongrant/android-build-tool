package p464o0Oooo;

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
import o0O0OOO.OooOO0;
import p285o0O0OOoo.o000oOoO;
import p408o0Oo0o0O.o00Oo0;
import p409o0Oo0o0o.o00Ooo;
import p461o0OooO0.o000000O;
import p461o0OooO0.o0000oo;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O00OO extends Lambda implements Function1<String, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final o00O00OO f46807OooO0Oo = new o00O00OO();

    public o00O00OO() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        boolean zEquals;
        String value = str;
        o00Ooo o00oooOooO00o = o00Oo0.OooO00o();
        Intrinsics.checkNotNullExpressionValue(value, "it");
        o00oooOooO00o.getClass();
        Intrinsics.checkNotNullParameter(value, "value");
        o00oooOooO00o.OooO("userIdx", value);
        final o0000oo o0000ooVar = OooOO0.OooO00o().f42017OooO00o.f42144OooO0oO.f42196OooO0Oo;
        o0000ooVar.getClass();
        String strOooO0O0 = o000000O.OooO0O0(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, value);
        synchronized (o0000ooVar.f46654OooO0o) {
            String reference = o0000ooVar.f46654OooO0o.getReference();
            if (strOooO0O0 == null) {
                zEquals = reference == null;
            } else {
                zEquals = strOooO0O0.equals(reference);
            }
            if (!zEquals) {
                o0000ooVar.f46654OooO0o.set(strOooO0O0, true);
                o0000ooVar.f46651OooO0O0.OooO00o(new Callable() { // from class: o0OooO0.o0000
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws Throwable {
                        BufferedWriter bufferedWriter;
                        boolean z;
                        String reference2;
                        BufferedWriter bufferedWriter2;
                        o0000oo o0000ooVar2 = o0000ooVar;
                        synchronized (o0000ooVar2.f46654OooO0o) {
                            bufferedWriter = null;
                            z = false;
                            if (o0000ooVar2.f46654OooO0o.isMarked()) {
                                reference2 = o0000ooVar2.f46654OooO0o.getReference();
                                o0000ooVar2.f46654OooO0o.set(reference2, false);
                                z = true;
                            } else {
                                reference2 = null;
                            }
                        }
                        if (z) {
                            File fileOooO0O0 = o0000ooVar2.f46650OooO00o.f46629OooO00o.OooO0O0(o0000ooVar2.f46652OooO0OO, "user-data");
                            try {
                                String string = new o00000O0(reference2).toString();
                                bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileOooO0O0), o00000O.f46628OooO0O0));
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
                                        o000oOoO.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    o000oOoO.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                    throw th;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                bufferedWriter2 = null;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedWriter2 = bufferedWriter;
                                o000oOoO.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                                throw th;
                            }
                            o000oOoO.OooO00o(bufferedWriter2, "Failed to close user metadata file.");
                        }
                        return null;
                    }
                });
            }
        }
        OooOO0.OooO00o().OooO0OO("userIdx", value);
        return Unit.INSTANCE;
    }
}
