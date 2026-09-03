package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.OooOO0;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import p305o0O0o0oo.o00Oo0;
import p305o0O0o0oo.o00Ooo;
import p311o0O0oOO0.o000;
import p319o0O0oo0O.o0000oo;
import p319o0O0oo0O.o0Oo0oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends o00Ooo {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final o00Oo0 appStateMonitor;
    private final Set<WeakReference<o000>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.OooO0OO(), o00Oo0.OooO00o());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.f20454OooO0o) {
            this.gaugeManager.logGaugeMetadata(perfSession.f20453OooO0Oo, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f20454OooO0o) {
            this.gaugeManager.logGaugeMetadata(perfSession.f20453OooO0Oo, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f20454OooO0o) {
            this.gaugeManager.startCollectingGauges(perfSession, applicationProcessState);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        ApplicationProcessState applicationProcessState = ApplicationProcessState.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    @Override // p305o0O0o0oo.o00Ooo, o0O0o0oo.o00Oo0.OooO0O0
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (this.appStateMonitor.f42436OooOo00) {
            return;
        }
        if (applicationProcessState == ApplicationProcessState.FOREGROUND) {
            updatePerfSession(applicationProcessState);
        } else {
            if (updatePerfSessionIfExpired()) {
                return;
            }
            startOrStopCollectingGauges(applicationProcessState);
        }
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<o000> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: o0O0oOO0.o000O000
            @Override // java.lang.Runnable
            public final void run() {
                this.f42528OooO0Oo.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void unregisterForSessionUpdates(WeakReference<o000> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.OooO0OO();
            Iterator<WeakReference<o000>> it = this.clients.iterator();
            while (it.hasNext()) {
                o000 o000Var = it.next().get();
                if (o000Var != null) {
                    o000Var.OooO00o(this.perfSession);
                } else {
                    it.remove();
                }
            }
        }
        logGaugeMetadataIfCollectionEnabled(applicationProcessState);
        startOrStopCollectingGauges(applicationProcessState);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0060  */
    /* JADX WARN: Code duplicated, block: B:21:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x0073  */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7  */
    public boolean updatePerfSessionIfExpired() {
        o0000oo o0000ooVar;
        OooOO0<Long> oooOO0OooOOO0;
        OooOO0<Long> oooOO0OooO0OO;
        long jLongValue;
        boolean z;
        boolean z2;
        PerfSession perfSession = this.perfSession;
        perfSession.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(perfSession.f20455OooO0o0.OooO00o());
        o0Oo0oo o0oo0ooOooO0o0 = o0Oo0oo.OooO0o0();
        o0oo0ooOooO0o0.getClass();
        synchronized (o0000oo.class) {
            if (o0000oo.f42670OooO00o == null) {
                o0000oo.f42670OooO00o = new o0000oo();
            }
            o0000ooVar = o0000oo.f42670OooO00o;
        }
        OooOO0<Long> oooOO0OooOO0O = o0oo0ooOooO0o0.OooOO0O(o0000ooVar);
        if (oooOO0OooOO0O.OooO0O0()) {
            if (oooOO0OooOO0O.OooO00o().longValue() > 0) {
                jLongValue = oooOO0OooOO0O.OooO00o().longValue();
            } else {
                oooOO0OooOOO0 = o0oo0ooOooO0o0.OooOOO0(o0000ooVar);
                if (oooOO0OooOOO0.OooO0O0()) {
                    if (oooOO0OooOOO0.OooO00o().longValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        o0oo0ooOooO0o0.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                        jLongValue = oooOO0OooOOO0.OooO00o().longValue();
                    } else {
                        oooOO0OooO0OO = o0oo0ooOooO0o0.OooO0OO(o0000ooVar);
                        if (oooOO0OooO0OO.OooO0O0()) {
                            if (oooOO0OooO0OO.OooO00o().longValue() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                            } else {
                                Long l = 240L;
                                jLongValue = l.longValue();
                            }
                        } else {
                            Long l2 = 240L;
                            jLongValue = l2.longValue();
                        }
                    }
                } else {
                    oooOO0OooO0OO = o0oo0ooOooO0o0.OooO0OO(o0000ooVar);
                    if (oooOO0OooO0OO.OooO0O0()) {
                        Long l3 = 240L;
                        jLongValue = l3.longValue();
                    } else {
                        if (oooOO0OooO0OO.OooO00o().longValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                        } else {
                            Long l4 = 240L;
                            jLongValue = l4.longValue();
                        }
                    }
                }
            }
        } else {
            oooOO0OooOOO0 = o0oo0ooOooO0o0.OooOOO0(o0000ooVar);
            if (oooOO0OooOOO0.OooO0O0()) {
                oooOO0OooO0OO = o0oo0ooOooO0o0.OooO0OO(o0000ooVar);
                if (oooOO0OooO0OO.OooO0O0()) {
                    Long l5 = 240L;
                    jLongValue = l5.longValue();
                } else {
                    if (oooOO0OooO0OO.OooO00o().longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                    } else {
                        Long l6 = 240L;
                        jLongValue = l6.longValue();
                    }
                }
            } else {
                if (oooOO0OooOOO0.OooO00o().longValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    o0oo0ooOooO0o0.f42683OooO0OO.OooO0OO(oooOO0OooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                    jLongValue = oooOO0OooOOO0.OooO00o().longValue();
                } else {
                    oooOO0OooO0OO = o0oo0ooOooO0o0.OooO0OO(o0000ooVar);
                    if (oooOO0OooO0OO.OooO0O0()) {
                        Long l7 = 240L;
                        jLongValue = l7.longValue();
                    } else {
                        if (oooOO0OooO0OO.OooO00o().longValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jLongValue = oooOO0OooO0OO.OooO00o().longValue();
                        } else {
                            Long l8 = 240L;
                            jLongValue = l8.longValue();
                        }
                    }
                }
            }
        }
        if (!(minutes > jLongValue)) {
            return false;
        }
        updatePerfSession(this.appStateMonitor.f42433OooOOo);
        return true;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, o00Oo0 o00oo1) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = o00oo1;
        registerForAppState();
    }
}
