package androidx.media3.session;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes2.dex */
public interface OooOOO0 extends IInterface {

    public static abstract class OooO00o extends Binder implements OooOOO0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final /* synthetic */ int f9261OooO0Oo = 0;

        /* JADX INFO: renamed from: androidx.media3.session.OooOOO0$OooO00o$OooO00o, reason: collision with other inner class name */
        public static class C0160OooO00o implements OooOOO0 {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final IBinder f9262OooO0Oo;

            public C0160OooO00o(IBinder iBinder) {
                this.f9262OooO0Oo = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.f9262OooO0Oo;
            }
        }
    }
}
