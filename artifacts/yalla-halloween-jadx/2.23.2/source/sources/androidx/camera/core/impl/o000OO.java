package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000OO {
    public static void OooO00o(@NonNull List<DeferrableSurface> list) {
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().OooO0O0();
        }
    }

    public static void OooO0O0(@NonNull List<DeferrableSurface> list) throws DeferrableSurface.SurfaceClosedException {
        if (list.isEmpty()) {
            return;
        }
        int i = 0;
        do {
            try {
                list.get(i).OooO0o0();
                i++;
            } catch (DeferrableSurface.SurfaceClosedException e) {
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    list.get(i2).OooO0O0();
                }
                throw e;
            }
        } while (i < list.size());
    }

    @NonNull
    public static o0ooOO0.o000Oo0.OooO0o OooO0OO(@NonNull List list, @NonNull final Executor executor, @NonNull final ScheduledExecutorService scheduledExecutorService) {
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(p030OoooO.OooOo.OooO0o0(((DeferrableSurface) it.next()).OooO0OO()));
        }
        return p639o0ooOO0.o000Oo0.OooO00o(new o0ooOO0.o000Oo0.OooO0OO() { // from class: androidx.camera.core.impl.o0000O0

            /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
            public final /* synthetic */ long f3669OooO0oO = 5000;

            /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
            public final /* synthetic */ boolean f3670OooO0oo = false;

            @Override // o0ooOO0.o000Oo0.OooO0OO
            public final Object OooO0o0(final o0ooOO0.o000Oo0.OooO00o oooO00o) {
                final Executor executor2 = executor;
                final long j = this.f3669OooO0oO;
                final p030OoooO.o00Ooo o00oooOooO0oO = p030OoooO.OooOo.OooO0oO(arrayList);
                ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(new Runnable() { // from class: androidx.camera.core.impl.o0000
                    @Override // java.lang.Runnable
                    public final void run() {
                        final com.google.common.util.concurrent.OooOO0O oooOO0O = o00oooOooO0oO;
                        final o0ooOO0.o000Oo0.OooO00o oooO00o2 = oooO00o;
                        final long j2 = j;
                        executor2.execute(new Runnable() { // from class: androidx.camera.core.impl.o0000oo
                            @Override // java.lang.Runnable
                            public final void run() {
                                com.google.common.util.concurrent.OooOO0O oooOO0O2 = oooOO0O;
                                if (oooOO0O2.isDone()) {
                                    return;
                                }
                                oooO00o2.OooO0OO(new TimeoutException("Cannot complete surfaceList within " + j2));
                                oooOO0O2.cancel(true);
                            }
                        });
                    }
                }, j, TimeUnit.MILLISECONDS);
                oooO00o.OooO00o(new o0000O00(o00oooOooO0oO, 0), executor2);
                o00oooOooO0oO.OooO0oo(new OoooO.OooOo.OooO0O0(o00oooOooO0oO, new o0000O0O(this.f3670OooO0oo, oooO00o, scheduledFutureSchedule)), executor2);
                return "surfaceList";
            }
        });
    }
}
