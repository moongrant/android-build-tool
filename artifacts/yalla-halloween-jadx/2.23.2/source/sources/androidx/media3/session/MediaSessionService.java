package androidx.media3.session;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.CallSuper;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MediaSessionService extends Service {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f9206OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @GuardedBy("lock")
    public OooOO0 f9207OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    @GuardedBy("lock")
    public OooO00o f9208OooO0o0;

    public static final class OooO00o extends OooOOO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final WeakReference<MediaSessionService> f9209OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final androidx.media.OooOOOO f9210OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final Handler f9211OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final Set<OooOO0O> f9212OooO0oO;

        public OooO00o(MediaSessionService mediaSessionService) {
            androidx.media.OooOOOO oooOOOO;
            this.f9209OooO0Oo = new WeakReference<>(mediaSessionService);
            Context applicationContext = mediaSessionService.getApplicationContext();
            this.f9211OooO0o0 = new Handler(applicationContext.getMainLooper());
            synchronized (androidx.media.OooOOOO.f6161OooO0OO) {
                if (androidx.media.OooOOOO.f6162OooO0Oo == null) {
                    androidx.media.OooOOOO.f6162OooO0Oo = new androidx.media.OooOOOO(applicationContext.getApplicationContext());
                }
                oooOOOO = androidx.media.OooOOOO.f6162OooO0Oo;
            }
            this.f9210OooO0o = oooOOOO;
            this.f9212OooO0oO = Collections.synchronizedSet(new HashSet());
        }

        public final void OooOOoo(@Nullable final OooOO0O oooOO0O, @Nullable Bundle bundle) {
            if (oooOO0O == null || bundle == null) {
                return;
            }
            try {
                final OooO0OO oooO0OO = (OooO0OO) OooO0OO.f9251OooOOO.OooO0OO(bundle);
                if (this.f9209OooO0Oo.get() == null) {
                    try {
                        oooOO0O.OooO00o(0);
                        return;
                    } catch (RemoteException unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                final int callingUid = Binder.getCallingUid();
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                if (callingPid == 0) {
                    callingPid = oooO0OO.f9256OooO0oO;
                }
                final int i = callingPid;
                final androidx.media.OooOOOO.OooO0O0 oooO0O0 = new androidx.media.OooOOOO.OooO0O0(oooO0OO.f9254OooO0o, i, callingUid);
                final boolean zOooO00o = this.f9210OooO0o.f6163OooO00o.OooO00o(oooO0O0.f6164OooO00o);
                this.f9212OooO0oO.add(oooOO0O);
                try {
                    this.f9211OooO0o0.post(new Runnable(oooOO0O, oooO0O0, oooO0OO, zOooO00o, i, callingUid) { // from class: androidx.media3.session.o00O000o

                        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
                        public final /* synthetic */ androidx.media.OooOOOO.OooO0O0 f9330OooO0o;

                        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
                        public final /* synthetic */ OooOO0O f9331OooO0o0;

                        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
                        public final /* synthetic */ OooO0OO f9332OooO0oO;

                        @Override // java.lang.Runnable
                        public final void run() {
                            androidx.media.OooOOOO.OooO0O0 oooO0O1 = this.f9330OooO0o;
                            OooO0OO oooO0OO2 = this.f9332OooO0oO;
                            MediaSessionService.OooO00o oooO00o = this.f9329OooO0Oo;
                            Set<OooOO0O> set = oooO00o.f9212OooO0oO;
                            OooOO0O oooOO0O2 = this.f9331OooO0o0;
                            set.remove(oooOO0O2);
                            try {
                                MediaSessionService mediaSessionService = oooO00o.f9209OooO0Oo.get();
                                if (mediaSessionService != null) {
                                    int i2 = oooO0OO2.f9253OooO0Oo;
                                    try {
                                        mediaSessionService.OooO0O0(new o00O000.OooO00o(oooO0O1));
                                    } catch (Exception e) {
                                        Log.OooO0oO("MSSImpl", "Failed to add a session to session service", e);
                                    }
                                }
                                try {
                                    oooOO0O2.OooO00o(0);
                                } catch (RemoteException unused2) {
                                }
                            } catch (Throwable th) {
                                try {
                                    oooOO0O2.OooO00o(0);
                                } catch (RemoteException unused3) {
                                }
                                throw th;
                            }
                        }
                    });
                } finally {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                }
            } catch (RuntimeException e) {
                Log.OooO0oO("MSSImpl", "Ignoring malformed Bundle for ConnectionRequest", e);
            }
        }
    }

    public MediaSessionService() {
        new Handler(Looper.getMainLooper());
        new p190o00o0O.OooO();
    }

    public final OooOO0 OooO00o() {
        OooOO0 oooOO1;
        synchronized (this.f9206OooO0Oo) {
            if (this.f9207OooO0o == null) {
                this.f9207OooO0o = new OooOO0(this);
            }
            oooOO1 = this.f9207OooO0o;
        }
        return oooOO1;
    }

    @Nullable
    public abstract void OooO0O0(o00O000.OooO00o oooO00o);

    @Override // android.app.Service
    @Nullable
    @CallSuper
    public IBinder onBind(@Nullable Intent intent) {
        String action;
        OooO00o oooO00o;
        if (intent == null || (action = intent.getAction()) == null) {
            return null;
        }
        if (action.equals("androidx.media3.session.MediaSessionService")) {
            synchronized (this.f9206OooO0Oo) {
                oooO00o = this.f9208OooO0o0;
                p080o000OoO.o00Oo0.OooO0o(oooO00o);
            }
            return oooO00o;
        }
        if (!action.equals("android.media.browse.MediaBrowserService")) {
            return null;
        }
        androidx.media.OooOOOO.OooO0O0 oooO0O0 = new androidx.media.OooOOOO.OooO0O0("android.media.session.MediaController", -1, -1);
        Bundle bundle = Bundle.EMPTY;
        OooO0O0(new o00O000.OooO00o(oooO0O0));
        return null;
    }

    @Override // android.app.Service
    @CallSuper
    public final void onCreate() {
        super.onCreate();
        synchronized (this.f9206OooO0Oo) {
            this.f9208OooO0o0 = new OooO00o(this);
        }
    }

    @Override // android.app.Service
    @CallSuper
    public final void onDestroy() {
        super.onDestroy();
        synchronized (this.f9206OooO0Oo) {
            OooO00o oooO00o = this.f9208OooO0o0;
            if (oooO00o != null) {
                oooO00o.f9209OooO0Oo.clear();
                oooO00o.f9211OooO0o0.removeCallbacksAndMessages(null);
                Iterator<OooOO0O> it = oooO00o.f9212OooO0oO.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().OooO00o(0);
                    } catch (RemoteException unused) {
                    }
                }
                this.f9208OooO0o0 = null;
            }
        }
    }

    @Override // android.app.Service
    @CallSuper
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        if (intent == null) {
            return 1;
        }
        OooOO0 oooOO0OooO00o = OooO00o();
        if (intent.getData() != null) {
            synchronized (o00O000.f9322OooO00o) {
                Iterator<o00O000> it = o00O000.f9323OooO0O0.values().iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw null;
                }
            }
        }
        oooOO0OooO00o.getClass();
        if ("android.intent.action.MEDIA_BUTTON".equals(intent.getAction())) {
            androidx.media.OooOOOO.OooO0O0 oooO0O0 = new androidx.media.OooOOOO.OooO0O0("android.media.session.MediaController", -1, -1);
            Bundle bundle = Bundle.EMPTY;
            OooO0O0(new o00O000.OooO00o(oooO0O0));
        }
        return 1;
    }
}
