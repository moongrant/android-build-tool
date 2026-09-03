package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import p008OooOOo.OooO0O0;
import p008OooOOo.OooO0OO;
import p019OooOooO.o000000O;
import p190o00o0O.OooO;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooO f3375OooO0Oo = new OooO();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f3376OooO0o0 = new OooO00o();

    public class OooO00o extends OooO0OO.OooO00o {

        /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0013OooO00o implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ o000000O f3378OooO00o;

            public C0013OooO00o(o000000O o000000o2) {
                this.f3378OooO00o = o000000o2;
            }

            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                CustomTabsService customTabsService = CustomTabsService.this;
                o000000O o000000o2 = this.f3378OooO00o;
                customTabsService.getClass();
                try {
                    synchronized (customTabsService.f3375OooO0Oo) {
                        IBinder iBinderAsBinder = o000000o2.f392OooO00o.asBinder();
                        iBinderAsBinder.unlinkToDeath((IBinder.DeathRecipient) customTabsService.f3375OooO0Oo.getOrDefault(iBinderAsBinder, null), 0);
                        customTabsService.f3375OooO0Oo.remove(iBinderAsBinder);
                    }
                } catch (NoSuchElementException unused) {
                }
            }
        }

        public OooO00o() {
        }

        @Override // p008OooOOo.OooO0OO
        public final boolean OooO0oO(OooO0O0 oooO0O0, Uri uri, Bundle bundle, ArrayList arrayList) {
            return CustomTabsService.this.OooO0O0();
        }

        @Override // p008OooOOo.OooO0OO
        public final boolean OooOOOO(long j) {
            return CustomTabsService.this.OooO0oo();
        }

        @Override // p008OooOOo.OooO0OO
        public final boolean OooOOo0(OooO0O0 oooO0O0) {
            try {
                C0013OooO00o c0013OooO00o = new C0013OooO00o(new o000000O(oooO0O0));
                synchronized (CustomTabsService.this.f3375OooO0Oo) {
                    oooO0O0.asBinder().linkToDeath(c0013OooO00o, 0);
                    CustomTabsService.this.f3375OooO0Oo.put(oooO0O0.asBinder(), c0013OooO00o);
                }
                return CustomTabsService.this.OooO0OO();
            } catch (RemoteException unused) {
                return false;
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Relation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Result {
    }

    public abstract Bundle OooO00o();

    public abstract boolean OooO0O0();

    public abstract boolean OooO0OO();

    public abstract int OooO0Oo();

    public abstract boolean OooO0o();

    public abstract boolean OooO0o0();

    public abstract boolean OooO0oO();

    public abstract boolean OooO0oo();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f3376OooO0o0;
    }
}
