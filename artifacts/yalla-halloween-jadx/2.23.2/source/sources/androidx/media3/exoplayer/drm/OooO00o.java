package androidx.media3.exoplayer.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.o0OO0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o000OO0O.OooOo;
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO00o implements o000OO0O.OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f7636OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("lock")
    public androidx.media3.common.OooOOO0.OooO f7637OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("lock")
    public DefaultDrmSessionManager f7638OooO0OO;

    @RequiresApi(18)
    public static DefaultDrmSessionManager OooO0O0(androidx.media3.common.OooOOO0.OooO oooO) {
        androidx.media3.datasource.OooO0o.OooO00o oooO00o = new androidx.media3.datasource.OooO0o.OooO00o();
        oooO00o.f7016OooO0O0 = null;
        Uri uri = oooO.f6501OooO0o0;
        OooOO0O oooOO0O = new OooOO0O(uri == null ? null : uri.toString(), oooO.f6498OooO, oooO00o);
        o0OO0<Map.Entry<String, String>> it = oooO.f6500OooO0o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (oooOO0O.f7653OooO0Oo) {
                oooOO0O.f7653OooO0Oo.put(key, value);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = C.f6206OooO00o;
        androidx.media3.exoplayer.upstream.OooO00o oooO00o2 = new androidx.media3.exoplayer.upstream.OooO00o();
        UUID uuid2 = oooO.f6499OooO0Oo;
        OooOo oooOo = OooOO0.f7646OooO0Oo;
        uuid2.getClass();
        boolean z = oooO.f6502OooO0oO;
        boolean z2 = oooO.f6503OooO0oo;
        int[] iArrOooO0Oo = com.google.common.primitives.OooO0OO.OooO0Oo(oooO.f6504OooOO0);
        for (int i : iArrOooO0Oo) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            o00Oo0.OooO00o(z3);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, oooOo, oooOO0O, map, z, (int[]) iArrOooO0Oo.clone(), z2, oooO00o2, 300000L);
        byte[] bArr = oooO.f6505OooOO0O;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        o00Oo0.OooO0Oo(defaultDrmSessionManager.f7608OooOOO0.isEmpty());
        defaultDrmSessionManager.f7617OooOo0O = 0;
        defaultDrmSessionManager.f7618OooOo0o = bArrCopyOf;
        return defaultDrmSessionManager;
    }

    @Override // o000OO0O.OooOO0O
    public final OooO0OO OooO00o(androidx.media3.common.OooOOO0 oooOOO0) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        oooOOO0.f6486OooO0o0.getClass();
        androidx.media3.common.OooOOO0.OooO oooO = oooOOO0.f6486OooO0o0.f6576OooO0o;
        if (oooO == null || o00.f34910OooO00o < 18) {
            return OooO0OO.f7644OooO00o;
        }
        synchronized (this.f7636OooO00o) {
            if (!o00.OooO00o(oooO, this.f7637OooO0O0)) {
                this.f7637OooO0O0 = oooO;
                this.f7638OooO0OO = OooO0O0(oooO);
            }
            defaultDrmSessionManager = this.f7638OooO0OO;
            defaultDrmSessionManager.getClass();
        }
        return defaultDrmSessionManager;
    }
}
