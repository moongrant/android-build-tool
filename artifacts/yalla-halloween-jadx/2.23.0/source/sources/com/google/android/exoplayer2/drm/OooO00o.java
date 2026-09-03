package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.o000oOoO;
import com.google.common.collect.o0OO0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import p207o00o0oOo.o0O00O0o;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO00o implements o0O00O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f11766OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @GuardedBy("lock")
    public o000oOoO.OooO f11767OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @GuardedBy("lock")
    public DefaultDrmSessionManager f11768OooO0OO;

    @RequiresApi(18)
    public static DefaultDrmSessionManager OooO0O0(o000oOoO.OooO oooO) {
        com.google.android.exoplayer2.upstream.OooO0o.OooO00o oooO00o = new com.google.android.exoplayer2.upstream.OooO0o.OooO00o();
        oooO00o.f14241OooO0O0 = null;
        Uri uri = oooO.f12685OooO0o0;
        OooOO0O oooOO0O = new OooOO0O(uri == null ? null : uri.toString(), oooO.f12682OooO, oooO00o);
        o0OO0<Map.Entry<String, String>> it = oooO.f12684OooO0o.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            String value = next.getValue();
            key.getClass();
            value.getClass();
            synchronized (oooOO0O.f11783OooO0Oo) {
                oooOO0O.f11783OooO0Oo.put(key, value);
            }
        }
        HashMap map = new HashMap();
        UUID uuid = C.f10896OooO00o;
        com.google.android.exoplayer2.upstream.OooO oooO2 = new com.google.android.exoplayer2.upstream.OooO();
        UUID uuid2 = oooO.f12683OooO0Oo;
        kotlin.collections.OooO00o oooO00o2 = OooOO0.f11776OooO0Oo;
        uuid2.getClass();
        boolean z = oooO.f12686OooO0oO;
        boolean z2 = oooO.f12687OooO0oo;
        int[] iArrOooO0Oo = com.google.common.primitives.OooO0o.OooO0Oo(oooO.f12688OooOO0);
        for (int i : iArrOooO0Oo) {
            boolean z3 = true;
            if (i != 2 && i != 1) {
                z3 = false;
            }
            o00O000o.OooO00o(z3);
        }
        DefaultDrmSessionManager defaultDrmSessionManager = new DefaultDrmSessionManager(uuid2, oooO00o2, oooOO0O, map, z, (int[]) iArrOooO0Oo.clone(), z2, oooO2, 300000L);
        byte[] bArr = oooO.f12689OooOO0O;
        byte[] bArrCopyOf = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        o00O000o.OooO0Oo(defaultDrmSessionManager.f11729OooOOO0.isEmpty());
        defaultDrmSessionManager.f11738OooOo0O = 0;
        defaultDrmSessionManager.f11739OooOo0o = bArrCopyOf;
        return defaultDrmSessionManager;
    }

    @Override // p207o00o0oOo.o0O00O0o
    public final OooO0OO OooO00o(o000oOoO o000oooo2) {
        DefaultDrmSessionManager defaultDrmSessionManager;
        o000oooo2.f12670OooO0o0.getClass();
        o000oOoO.OooO oooO = o000oooo2.f12670OooO0o0.f12760OooO0o;
        if (oooO == null || o0O00.f40595OooO00o < 18) {
            return OooO0OO.f11774OooO00o;
        }
        synchronized (this.f11766OooO00o) {
            if (!o0O00.OooO00o(oooO, this.f11767OooO0O0)) {
                this.f11767OooO0O0 = oooO;
                this.f11768OooO0OO = OooO0O0(oooO);
            }
            defaultDrmSessionManager = this.f11768OooO0OO;
            defaultDrmSessionManager.getClass();
        }
        return defaultDrmSessionManager;
    }
}
