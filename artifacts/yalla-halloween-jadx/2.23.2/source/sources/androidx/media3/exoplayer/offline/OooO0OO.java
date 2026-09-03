package androidx.media3.exoplayer.offline;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.cache.Cache;
import androidx.media3.datasource.cache.CacheDataSource;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import o000Oo0.OooOO0;
import p072o000O0oO.o00000O0;
import p080o000OoO.o00;
import p080o000OoO.o000O0o;
import p080o000OoO.o00Oo0;
import p080o000OoO.oo0o0Oo;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO implements OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Executor f7835OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final DataSpec f7836OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final CacheDataSource f7837OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOO0 f7838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public volatile OooO00o f7839OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooO0O0.OooO00o f7840OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public volatile boolean f7841OooO0oO;

    public class OooO00o extends o000O0o<Void, IOException> {
        public OooO00o() {
        }

        @Override // p080o000OoO.o000O0o
        public final void OooO0O0() {
            OooO0OO.this.f7838OooO0Oo.f34805OooOO0 = true;
        }

        @Override // p080o000OoO.o000O0o
        public final void OooO0OO() throws Exception {
            OooO0OO.this.f7838OooO0Oo.OooO00o();
        }
    }

    public OooO0OO(OooOOO0 oooOOO0, CacheDataSource.OooO00o oooO00o, Executor executor) {
        executor.getClass();
        this.f7835OooO00o = executor;
        OooOOO0.OooOO0O oooOO0O = oooOOO0.f6486OooO0o0;
        oooOO0O.getClass();
        Map mapEmptyMap = Collections.emptyMap();
        Uri uri = oooOO0O.f6575OooO0Oo;
        String str = oooOO0O.f6574OooO;
        o00Oo0.OooO0oO(uri, "The uri must be set.");
        DataSpec dataSpec = new DataSpec(uri, 0L, 1, null, mapEmptyMap, 0L, 512000L, str, 4, null);
        this.f7836OooO0O0 = dataSpec;
        androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o = oooO00o.f7070OooO0Oo;
        CacheDataSource cacheDataSourceOooO0O0 = oooO00o.OooO0O0(interfaceC0142OooO00o != null ? interfaceC0142OooO00o.OooO00o() : null, oooO00o.f7071OooO0o0 | 1, -1000);
        this.f7837OooO0OO = cacheDataSourceOooO0O0;
        this.f7838OooO0Oo = new OooOO0(cacheDataSourceOooO0O0, dataSpec, new o00000O0(this));
    }

    @Override // androidx.media3.exoplayer.offline.OooO0O0
    public final void OooO00o(@Nullable OooO0O0.OooO00o oooO00o) throws InterruptedException, IOException {
        this.f7840OooO0o0 = oooO00o;
        boolean z = false;
        boolean z2 = false;
        while (!z2) {
            try {
                if (this.f7841OooO0oO) {
                    break;
                }
                this.f7839OooO0o = new OooO00o();
                this.f7835OooO00o.execute(this.f7839OooO0o);
                try {
                    this.f7839OooO0o.get();
                    z2 = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i = o00.f34910OooO00o;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                OooO00o oooO00o2 = this.f7839OooO0o;
                oooO00o2.getClass();
                oooO00o2.OooO00o();
                throw th;
            }
        }
        OooO00o oooO00o3 = this.f7839OooO0o;
        oooO00o3.getClass();
        oo0o0Oo oo0o0oo = oooO00o3.f34975OooO0o0;
        synchronized (oo0o0oo) {
            while (!oo0o0oo.f35000OooO00o) {
                try {
                    oo0o0oo.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // androidx.media3.exoplayer.offline.OooO0O0
    public final void cancel() {
        this.f7841OooO0oO = true;
        OooO00o oooO00o = this.f7839OooO0o;
        if (oooO00o != null) {
            oooO00o.cancel(true);
        }
    }

    @Override // androidx.media3.exoplayer.offline.OooO0O0
    public final void remove() {
        CacheDataSource cacheDataSource = this.f7837OooO0OO;
        Cache cache = cacheDataSource.f7049OooO00o;
        ((o000Oo0.OooO0OO) cacheDataSource.f7054OooO0o0).getClass();
        DataSpec dataSpec = this.f7836OooO0O0;
        String string = dataSpec.f6977OooO0oo;
        if (string == null) {
            string = dataSpec.f6970OooO00o.toString();
        }
        cache.OooOO0O(string);
    }
}
