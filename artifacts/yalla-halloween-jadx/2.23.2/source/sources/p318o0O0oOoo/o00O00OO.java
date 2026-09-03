package p318o0O0oOoo;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00OO implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ oo00o f41978OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o00O0 f41979OooO0O0;

    public /* synthetic */ o00O00OO(oo00o oo00oVar, o00O0 o00o1) {
        this.f41978OooO00o = oo00oVar;
        this.f41979OooO0O0 = o00o1;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        oo00o oo00oVar = this.f41978OooO00o;
        o00O0 o00o1 = this.f41979OooO0O0;
        oo0oOO0 oo0ooo0 = oo00oVar.f42010OooO0O0;
        synchronized (oo0ooo0) {
            FileOutputStream fileOutputStreamOpenFileOutput = oo0ooo0.f42020OooO00o.openFileOutput(oo0ooo0.f42021OooO0O0, 0);
            try {
                fileOutputStreamOpenFileOutput.write(o00o1.toString().getBytes("UTF-8"));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                fileOutputStreamOpenFileOutput.close();
                throw th;
            }
        }
        return null;
    }
}
