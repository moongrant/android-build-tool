package p310o0O0o0oo;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.OooO00o;
import p296o0O0OoO0.o00O0O;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements o00O0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o.InterfaceC0104OooO00o f36262OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final SparseArray<o00O0O0> f36263OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int[] f36264OooO0OO;

    public o000O(OooO00o.InterfaceC0104OooO00o interfaceC0104OooO00o, o00O0O o00o0o2) {
        this.f36262OooO00o = interfaceC0104OooO00o;
        SparseArray<o00O0O0> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, (o00O0O0) Class.forName("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory").asSubclass(o00O0O0.class).getConstructor(OooO00o.InterfaceC0104OooO00o.class).newInstance(interfaceC0104OooO00o));
        } catch (Exception unused) {
        }
        try {
            sparseArray.put(1, (o00O0O0) Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(o00O0O0.class).getConstructor(OooO00o.InterfaceC0104OooO00o.class).newInstance(interfaceC0104OooO00o));
        } catch (Exception unused2) {
        }
        try {
            sparseArray.put(2, (o00O0O0) Class.forName("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory").asSubclass(o00O0O0.class).getConstructor(OooO00o.InterfaceC0104OooO00o.class).newInstance(interfaceC0104OooO00o));
        } catch (Exception unused3) {
        }
        sparseArray.put(3, new oo0o0O0.OooO0O0(interfaceC0104OooO00o, o00o0o2));
        this.f36263OooO0O0 = sparseArray;
        this.f36264OooO0OO = new int[sparseArray.size()];
        for (int i = 0; i < this.f36263OooO0O0.size(); i++) {
            this.f36264OooO0OO[i] = this.f36263OooO0O0.keyAt(i);
        }
    }
}
