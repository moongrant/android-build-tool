package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.OooOO0;
import androidx.media3.common.o000oOoO;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public interface OooO0o extends TrackSelection {

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final o000oOoO f8248OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int[] f8249OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f8250OooO0OO;

        public OooO00o() {
            throw null;
        }

        public OooO00o(int i, o000oOoO o000oooo2, int[] iArr) {
            if (iArr.length == 0) {
                Log.OooO0Oo("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
            }
            this.f8248OooO00o = o000oooo2;
            this.f8249OooO0O0 = iArr;
            this.f8250OooO0OO = i;
        }
    }

    public interface OooO0O0 {
    }

    void OooO(boolean z);

    void OooO00o();

    void OooO0Oo(float f);

    void OooO0o();

    void OooO0o0();

    void OooOO0();

    OooOO0 OooOO0O();

    void OooOO0o();
}
