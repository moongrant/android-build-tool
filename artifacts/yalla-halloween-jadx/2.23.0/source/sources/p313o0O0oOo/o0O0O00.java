package p313o0O0oOo;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0O0O00 implements Callable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o000000 f42579OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o000000O f42580OooO0O0;

    public /* synthetic */ o0O0O00(o000000 o000000Var, o000000O o000000o2) {
        this.f42579OooO00o = o000000Var;
        this.f42580OooO0O0 = o000000o2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        o000000 o000000Var = this.f42579OooO00o;
        o000000O o000000o2 = this.f42580OooO0O0;
        o0000O0 o0000o1 = o000000Var.f42543OooO0O0;
        synchronized (o0000o1) {
            FileOutputStream fileOutputStreamOpenFileOutput = o0000o1.f42564OooO00o.openFileOutput(o0000o1.f42565OooO0O0, 0);
            try {
                fileOutputStreamOpenFileOutput.write(o000000o2.toString().getBytes("UTF-8"));
                fileOutputStreamOpenFileOutput.close();
            } catch (Throwable th) {
                fileOutputStreamOpenFileOutput.close();
                throw th;
            }
        }
        return null;
    }
}
