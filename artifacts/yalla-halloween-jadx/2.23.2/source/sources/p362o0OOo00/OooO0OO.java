package p362o0OOo00;

import android.net.Uri;
import android.support.v4.media.OooO00o;
import android.util.SparseArray;
import androidx.media3.common.OooOOO0;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.cache.CacheDataSource;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.OooO0O0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p072o000O0oO.o00000;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0OO implements o00000 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final SparseArray<Constructor<? extends OooO0O0>> f43002OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CacheDataSource.OooO00o f43003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Executor f43004OooO0O0;

    static {
        SparseArray<Constructor<? extends OooO0O0>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, OooO0O0(Class.forName("androidx.media3.exoplayer.dash.offline.DashDownloader")));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, OooO0O0(Class.forName("androidx.media3.exoplayer.hls.offline.HlsDownloader")));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, OooO0O0(Class.forName("androidx.media3.exoplayer.smoothstreaming.offline.SsDownloader")));
        } catch (ClassNotFoundException unused3) {
        }
        f43002OooO0OO = sparseArray;
    }

    public OooO0OO(CacheDataSource.OooO00o oooO00o, ExecutorService executorService) {
        oooO00o.getClass();
        this.f43003OooO00o = oooO00o;
        executorService.getClass();
        this.f43004OooO0O0 = executorService;
    }

    public static Constructor<? extends OooO0O0> OooO0O0(Class<?> cls) {
        try {
            return cls.asSubclass(OooO0O0.class).getConstructor(OooOOO0.class, CacheDataSource.OooO00o.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Downloader constructor missing", e);
        }
    }

    @Override // p072o000O0oO.o00000
    public final OooO0O0 OooO00o(DownloadRequest downloadRequest) {
        int iOooo000 = o00.Oooo000(downloadRequest.f7776OooO0o0, downloadRequest.f7775OooO0o);
        Executor executor = this.f43004OooO0O0;
        CacheDataSource.OooO00o oooO00o = this.f43003OooO00o;
        String str = downloadRequest.f7773OooO;
        Uri uri = downloadRequest.f7776OooO0o0;
        if (iOooo000 != 0 && iOooo000 != 1 && iOooo000 != 2) {
            if (iOooo000 != 4) {
                throw new IllegalArgumentException(OooO00o.OooO00o("Unsupported type: ", iOooo000));
            }
            OooOOO0.OooO0O0 oooO0O0 = new OooOOO0.OooO0O0();
            oooO0O0.f6520OooO0O0 = uri;
            oooO0O0.f6525OooO0oO = str;
            return new androidx.media3.exoplayer.offline.OooO0OO(oooO0O0.OooO00o(), oooO00o, executor);
        }
        Constructor<? extends OooO0O0> constructor = f43002OooO0OO.get(iOooo000);
        if (constructor == null) {
            throw new IllegalStateException(OooO00o.OooO00o("Module missing for content type ", iOooo000));
        }
        OooOOO0.OooO0O0 oooO0O1 = new OooOOO0.OooO0O0();
        oooO0O1.f6520OooO0O0 = uri;
        List<StreamKey> list = downloadRequest.f7777OooO0oO;
        oooO0O1.f6523OooO0o = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
        oooO0O1.f6525OooO0oO = str;
        try {
            return constructor.newInstance(oooO0O1.OooO00o(), oooO00o, executor);
        } catch (Exception unused) {
            throw new IllegalStateException(OooO00o.OooO00o("Failed to instantiate downloader for content type ", iOooo000));
        }
    }
}
