package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import p709oo0oOOo.OooOO0O;
import p709oo0oOOo.o000oOoO;

/* JADX INFO: loaded from: classes2.dex */
public interface OooO00o extends OooOO0O {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0104OooO00o {
        OooO00o OooO00o();
    }

    long OooO0o(DataSpec dataSpec) throws IOException;

    Map<String, List<String>> OooO0oo();

    void OooOO0O(o000oOoO o000oooo2);

    @Nullable
    Uri OooOO0o();

    void close() throws IOException;
}
