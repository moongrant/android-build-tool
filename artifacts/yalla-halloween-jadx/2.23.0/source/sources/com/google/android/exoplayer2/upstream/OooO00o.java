package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p244o00oo0Oo.o00;
import p244o00oo0Oo.o00O0OO0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface OooO00o extends o00 {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0215OooO00o {
        OooO00o OooO00o();
    }

    long OooO00o(DataSpec dataSpec) throws IOException;

    void OooO0OO(o00O0OO0 o00o0oo1);

    Map<String, List<String>> OooO0o0();

    @Nullable
    Uri OooOO0O();

    void close() throws IOException;
}
