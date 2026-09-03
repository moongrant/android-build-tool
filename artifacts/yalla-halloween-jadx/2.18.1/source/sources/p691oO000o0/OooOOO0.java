package p691oO000o0;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public interface OooOOO0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int f52701OooO00o = 0;

        /* JADX INFO: renamed from: oO000o0.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0434OooO00o implements OooOOO0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public IBinder f52702OooO00o;

            public C0434OooO00o(IBinder iBinder) {
                this.f52702OooO00o = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f52702OooO00o;
            }
        }
    }
}
