package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import p008OooOOOo.OooO0O0;
import p008OooOOOo.OooO0OO;
import p019OooOoo0.o00oO0o;
import p021OooOooo.Oooo0;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomTabsService extends Service {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Map<IBinder, IBinder.DeathRecipient> f5490Oooo0o = new Oooo0();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public OooO00o f5491Oooo0oO = new OooO00o();

    public class OooO00o extends OooO0OO.OooO00o {

        /* JADX INFO: renamed from: androidx.browser.customtabs.CustomTabsService$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0033OooO00o implements IBinder.DeathRecipient {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public final /* synthetic */ o00oO0o f5493OooO00o;

            public C0033OooO00o(o00oO0o o00oo0o2) {
                this.f5493OooO00o = o00oo0o2;
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [OooOooo.o00oO0o, java.util.Map<android.os.IBinder, android.os.IBinder$DeathRecipient>] */
            /* JADX WARN: Type inference failed for: r3v0, types: [OooOooo.o00oO0o, java.util.Map<android.os.IBinder, android.os.IBinder$DeathRecipient>] */
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                CustomTabsService customTabsService = CustomTabsService.this;
                o00oO0o o00oo0o2 = this.f5493OooO00o;
                Objects.requireNonNull(customTabsService);
                try {
                    synchronized (customTabsService.f5490Oooo0o) {
                        try {
                            IBinder iBinderOooO00o = o00oo0o2.OooO00o();
                            iBinderOooO00o.unlinkToDeath((IBinder.DeathRecipient) customTabsService.f5490Oooo0o.getOrDefault(iBinderOooO00o, null), 0);
                            customTabsService.f5490Oooo0o.remove(iBinderOooO00o);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (NoSuchElementException unused) {
                }
            }
        }

        public OooO00o() {
        }

        @Override // p008OooOOOo.OooO0OO
        public final boolean OooO0Oo(OooO0O0 oooO0O0, Uri uri) {
            return CustomTabsService.this.OooO0O0();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p008OooOOOo.OooO0OO
        public final boolean OooO0oo(OooO0O0 oooO0O0) {
            try {
                C0033OooO00o c0033OooO00o = new C0033OooO00o(new o00oO0o(oooO0O0));
                synchronized (CustomTabsService.this.f5490Oooo0o) {
                    oooO0O0.asBinder().linkToDeath(c0033OooO00o, 0);
                    CustomTabsService.this.f5490Oooo0o.put(oooO0O0.asBinder(), c0033OooO00o);
                }
                return CustomTabsService.this.OooO0OO();
            } catch (RemoteException unused) {
                return false;
            }
        }

        @Override // p008OooOOOo.OooO0OO
        public final boolean OooOOO() {
            return CustomTabsService.this.OooO0oo();
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
        return this.f5491Oooo0oO;
    }
}
