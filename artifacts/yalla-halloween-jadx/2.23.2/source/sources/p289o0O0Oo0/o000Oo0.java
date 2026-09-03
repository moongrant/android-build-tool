package p289o0O0Oo0;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import p286o0O0OOoO.o0OOO0o;
import p525o0o0OO0.o0o0Oo;
import p559o0oOo.o00O0O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000Oo0 implements Continuation, o00O0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f41531OooO0Oo;

    public /* synthetic */ o000Oo0(Object obj) {
        this.f41531OooO0Oo = obj;
    }

    @Override // p559o0oOo.o00O0O
    public final void OooO0OO() {
        o0o0Oo o0o0oo = (o0o0Oo) this.f41531OooO0Oo;
        int i = o0o0Oo.f53251OooOo0;
        o0o0oo.OooO0oO();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        ((o000O00) this.f41531OooO0Oo).getClass();
        if (task.isSuccessful()) {
            o000000O o000000o2 = (o000000O) task.getResult();
            o0OOO0o o0ooo0o2 = o0OOO0o.f41436OooO00o;
            o0ooo0o2.OooO0O0("Crashlytics report successfully enqueued to DataTransport: " + o000000o2.OooO0OO());
            File fileOooO0O0 = o000000o2.OooO0O0();
            if (fileOooO0O0.delete()) {
                o0ooo0o2.OooO0O0("Deleted report file: " + fileOooO0O0.getPath());
            } else {
                o0ooo0o2.OooO0Oo("Crashlytics could not delete report file: " + fileOooO0O0.getPath(), null);
            }
            z = true;
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
