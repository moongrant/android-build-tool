package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.OooO;
import com.google.firebase.perf.v1.ApplicationProcessState;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import o0O0oo00.OooO00o;
import p309o0O0oO0.o000OOo0;
import p309o0O0oO0.o00O0O00;
import p678oooOO0.o0O0O00;
import p678oooOO0.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public class SessionManager extends o0O0O00 {

    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final oo0o0Oo appStateMonitor;
    private final Set<WeakReference<OooO00o>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.OooO0OO(), oo0o0Oo.OooO00o());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession.f19982OooO0o) {
            this.gaugeManager.logGaugeMetadata(perfSession.f19981OooO0Oo, ApplicationProcessState.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f19982OooO0o) {
            this.gaugeManager.logGaugeMetadata(perfSession.f19981OooO0Oo, applicationProcessState);
        }
    }

    private void startOrStopCollectingGauges(ApplicationProcessState applicationProcessState) {
        PerfSession perfSession = this.perfSession;
        if (perfSession.f19982OooO0o) {
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

    @Override // p678oooOO0.o0O0O00, oooOO0.oo0o0Oo.OooO0O0
    public void onUpdateAppState(ApplicationProcessState applicationProcessState) {
        super.onUpdateAppState(applicationProcessState);
        if (this.appStateMonitor.f60393OooOo00) {
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

    public void registerForSessionUpdates(WeakReference<OooO00o> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(final Context context) {
        final PerfSession perfSession = this.perfSession;
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: o0O0oo00.OooO0O0
            @Override // java.lang.Runnable
            public final void run() {
                this.f42026OooO0Oo.lambda$setApplicationContext$0(context, perfSession);
            }
        });
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession) {
        this.perfSession = perfSession;
    }

    public void unregisterForSessionUpdates(WeakReference<OooO00o> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(ApplicationProcessState applicationProcessState) {
        synchronized (this.clients) {
            this.perfSession = PerfSession.OooO0OO();
            Iterator<WeakReference<OooO00o>> it = this.clients.iterator();
            while (it.hasNext()) {
                OooO00o oooO00o = it.next().get();
                if (oooO00o != null) {
                    oooO00o.OooO00o(this.perfSession);
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
        o00O0O00 o00o0o01;
        OooO<Long> oooOOooOOO0;
        OooO<Long> oooOOooO0OO;
        long jLongValue;
        boolean z;
        boolean z2;
        PerfSession perfSession = this.perfSession;
        perfSession.getClass();
        long minutes = TimeUnit.MICROSECONDS.toMinutes(perfSession.f19983OooO0o0.OooO00o());
        o000OOo0 o000ooo0OooO0o0 = o000OOo0.OooO0o0();
        o000ooo0OooO0o0.getClass();
        synchronized (o00O0O00.class) {
            if (o00O0O00.f41802OooO00o == null) {
                o00O0O00.f41802OooO00o = new o00O0O00();
            }
            o00o0o01 = o00O0O00.f41802OooO00o;
        }
        OooO<Long> oooOOooOO0O = o000ooo0OooO0o0.OooOO0O(o00o0o01);
        if (oooOOooOO0O.OooO0O0()) {
            if (oooOOooOO0O.OooO00o().longValue() > 0) {
                jLongValue = oooOOooOO0O.OooO00o().longValue();
            } else {
                oooOOooOOO0 = o000ooo0OooO0o0.OooOOO0(o00o0o01);
                if (oooOOooOOO0.OooO0O0()) {
                    if (oooOOooOOO0.OooO00o().longValue() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        o000ooo0OooO0o0.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                        jLongValue = oooOOooOOO0.OooO00o().longValue();
                    } else {
                        oooOOooO0OO = o000ooo0OooO0o0.OooO0OO(o00o0o01);
                        if (oooOOooO0OO.OooO0O0()) {
                            if (oooOOooO0OO.OooO00o().longValue() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                jLongValue = oooOOooO0OO.OooO00o().longValue();
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
                    oooOOooO0OO = o000ooo0OooO0o0.OooO0OO(o00o0o01);
                    if (oooOOooO0OO.OooO0O0()) {
                        Long l3 = 240L;
                        jLongValue = l3.longValue();
                    } else {
                        if (oooOOooO0OO.OooO00o().longValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jLongValue = oooOOooO0OO.OooO00o().longValue();
                        } else {
                            Long l4 = 240L;
                            jLongValue = l4.longValue();
                        }
                    }
                }
            }
        } else {
            oooOOooOOO0 = o000ooo0OooO0o0.OooOOO0(o00o0o01);
            if (oooOOooOOO0.OooO0O0()) {
                oooOOooO0OO = o000ooo0OooO0o0.OooO0OO(o00o0o01);
                if (oooOOooO0OO.OooO0O0()) {
                    Long l5 = 240L;
                    jLongValue = l5.longValue();
                } else {
                    if (oooOOooO0OO.OooO00o().longValue() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jLongValue = oooOOooO0OO.OooO00o().longValue();
                    } else {
                        Long l6 = 240L;
                        jLongValue = l6.longValue();
                    }
                }
            } else {
                if (oooOOooOOO0.OooO00o().longValue() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    o000ooo0OooO0o0.f41787OooO0OO.OooO0OO(oooOOooOOO0.OooO00o().longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                    jLongValue = oooOOooOOO0.OooO00o().longValue();
                } else {
                    oooOOooO0OO = o000ooo0OooO0o0.OooO0OO(o00o0o01);
                    if (oooOOooO0OO.OooO0O0()) {
                        Long l7 = 240L;
                        jLongValue = l7.longValue();
                    } else {
                        if (oooOOooO0OO.OooO00o().longValue() > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            jLongValue = oooOOooO0OO.OooO00o().longValue();
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
        updatePerfSession(this.appStateMonitor.f60390OooOOo);
        return true;
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager, PerfSession perfSession, oo0o0Oo oo0o0oo) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = perfSession;
        this.appStateMonitor = oo0o0oo;
        registerForAppState();
    }
}
