package p362o0OOo00;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.offline.Download;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.offline.DownloadService;
import androidx.media3.exoplayer.offline.OooO00o;
import com.code.android.util.o000O00O;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.yalla.android.videoplayer.download.MyDownloadService;
import java.util.HashMap;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p072o000O0oO.o00000O;
import p363o0OOo00O.OooOo00;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0O0 f43001OooO00o = new OooO0O0();

    public static void OooO00o(@NotNull String videoUrl) {
        OooO00o oooO00o;
        o00000O o00000o;
        Download downloadOooO0oo;
        Intrinsics.checkNotNullParameter(videoUrl, "videoUrl");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (o000O00O.f13423OooO0OO.getValue().booleanValue()) {
                Context context = o000O00O.OooO00o();
                OooOo00 oooOo00 = OooOo00.f43061OooO00o;
                synchronized (OooOo00.class) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    OooOo00.f43061OooO00o.OooO00o(context);
                    oooO00o = OooOo00.f43067OooO0oO;
                }
                Integer numValueOf = (oooO00o == null || (o00000o = oooO00o.f7799OooO0O0) == null || (downloadOooO0oo = o00000o.OooO0oo(String.valueOf(Math.abs(videoUrl.hashCode())))) == null) ? null : Integer.valueOf(downloadOooO0oo.f7766OooO0O0);
                if (numValueOf == null || numValueOf.intValue() != 3) {
                    if (numValueOf == null || numValueOf.intValue() != 2) {
                        String strValueOf = String.valueOf(Math.abs(videoUrl.hashCode()));
                        Uri uri = Uri.parse(videoUrl);
                        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                        DownloadRequest downloadRequest = new DownloadRequest(strValueOf, uri, null, o0O00.f19060OooO0oo, null, null, null);
                        Intrinsics.checkNotNullExpressionValue(downloadRequest, "build(...)");
                        Context contextOooO00o = o000O00O.OooO00o();
                        HashMap<Class<? extends DownloadService>, DownloadService.OooO00o> map = DownloadService.f7780OooOO0o;
                        contextOooO00o.startService(new Intent(contextOooO00o, (Class<?>) MyDownloadService.class).setAction("androidx.media3.exoplayer.downloadService.action.ADD_DOWNLOAD").putExtra("foreground", false).putExtra("download_request", downloadRequest).putExtra("stop_reason", 0));
                    }
                }
            }
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }
}
