package android.support.v4.media.session;

import android.os.IBinder;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public MediaControllerCompat$MediaControllerImplApi21.OooO00o f4266OooO00o;

    public static class OooO00o implements OooOO0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooO0OO> f4267OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.f4267OooO00o = new WeakReference<>(oooO0OO);
        }
    }

    public static class OooO0O0 extends android.support.v4.media.session.OooO00o.AbstractBinderC0028OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final WeakReference<OooO0OO> f4268OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.f4268OooO00o = new WeakReference<>(oooO0OO);
        }
    }

    public OooO0OO() {
        new OooOO0O(new OooO00o(this));
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
    }
}
