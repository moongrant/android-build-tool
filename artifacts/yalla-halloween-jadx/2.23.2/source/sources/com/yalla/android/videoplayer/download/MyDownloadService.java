package com.yalla.android.videoplayer.download;

import androidx.media3.common.util.Log;
import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.workmanager.WorkManagerScheduler;
import kotlin.jvm.internal.Intrinsics;
import o0OOo000.OooO0o;
import p363o0OOo00O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
public class MyDownloadService extends DownloadService {

    public static final class OooO00o implements androidx.media3.exoplayer.offline.OooO00o.OooO0OO {
        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO00o(androidx.media3.exoplayer.offline.OooO00o oooO00o, boolean z) {
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO0O0() {
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO0OO() {
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0Oo(Download download) {
            int i = download.f7766OooO0O0;
            DownloadRequest downloadRequest = download.f7765OooO00o;
            if (i == 3) {
                Log.OooO0O0("MyDownloadService", "onDownloadChanged ==>" + downloadRequest.f7776OooO0o0 + "   ,download complete");
                return;
            }
            if (i == 4) {
                Log.OooO0O0("MyDownloadService", "onDownloadChanged ==>" + downloadRequest.f7776OooO0o0 + "   ,download fail");
            }
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final void OooO0o() {
            Log.OooO0O0("MyDownloadService", "onIdle ==>");
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO0o0() {
        }

        @Override // androidx.media3.exoplayer.offline.OooO00o.OooO0OO
        public final /* synthetic */ void OooO0oO(androidx.media3.exoplayer.offline.OooO00o oooO00o) {
        }
    }

    public MyDownloadService() {
        super(OooO0o.app_name);
        Log.OooO0O0("MyDownloadService", "init ");
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final androidx.media3.exoplayer.offline.OooO00o OooO0O0() {
        androidx.media3.exoplayer.offline.OooO00o oooO00o;
        OooOo00 oooOo00 = OooOo00.f43061OooO00o;
        synchronized (OooOo00.class) {
            Intrinsics.checkNotNullParameter(this, "context");
            OooOo00.f43061OooO00o.OooO00o(this);
            oooO00o = OooOo00.f43067OooO0oO;
        }
        Log.OooO0O0("MyDownloadService", "getDownloadManager ");
        if (oooO00o != null) {
            oooO00o.f7803OooO0o0.add(new OooO00o());
            if (oooO00o.f7806OooOO0 != 10) {
                oooO00o.f7806OooOO0 = 10;
                oooO00o.f7802OooO0o++;
                oooO00o.f7800OooO0OO.obtainMessage(4, 10, 0).sendToTarget();
            }
        }
        return oooO00o;
    }

    @Override // androidx.media3.exoplayer.offline.DownloadService
    public final WorkManagerScheduler OooO0OO() {
        Log.OooO0O0("MyDownloadService", "getScheduler ");
        return new WorkManagerScheduler(getBaseContext());
    }
}
