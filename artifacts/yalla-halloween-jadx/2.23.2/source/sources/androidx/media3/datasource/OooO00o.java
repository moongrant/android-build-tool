package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import o000O0O.OooOo;
import p069o0000ooO.o00000O0;

/* JADX INFO: loaded from: classes.dex */
public interface OooO00o extends o00000O0 {

    /* JADX INFO: renamed from: androidx.media3.datasource.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0142OooO00o {
        @UnstableApi
        OooO00o OooO00o();
    }

    @UnstableApi
    long OooO00o(DataSpec dataSpec) throws IOException;

    @UnstableApi
    Map<String, List<String>> OooO0Oo();

    @UnstableApi
    void OooO0oO(OooOo oooOo);

    @Nullable
    @UnstableApi
    Uri OooOO0O();

    @UnstableApi
    void close() throws IOException;
}
