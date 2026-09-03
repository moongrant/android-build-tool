package p293o0O0Oo0O;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f35765OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f35766OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f35767OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f35768OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f35769OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f35770OooO0o0;

    @RequiresApi(19)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioTrack f35771OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AudioTimestamp f35772OooO0O0 = new AudioTimestamp();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f35773OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f35774OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f35775OooO0o0;

        public OooO00o(AudioTrack audioTrack) {
            this.f35771OooO00o = audioTrack;
        }
    }

    public o00Oo0(AudioTrack audioTrack) {
        if (o000OOo0.f36740OooO00o >= 19) {
            this.f35765OooO00o = new OooO00o(audioTrack);
            OooO00o();
        } else {
            this.f35765OooO00o = null;
            OooO0O0(3);
        }
    }

    public final void OooO00o() {
        if (this.f35765OooO00o != null) {
            OooO0O0(0);
        }
    }

    public final void OooO0O0(int i) {
        this.f35766OooO0O0 = i;
        if (i == 0) {
            this.f35770OooO0o0 = 0L;
            this.f35769OooO0o = -1L;
            this.f35767OooO0OO = System.nanoTime() / 1000;
            this.f35768OooO0Oo = 10000L;
            return;
        }
        if (i == 1) {
            this.f35768OooO0Oo = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f35768OooO0Oo = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f35768OooO0Oo = 500000L;
        }
    }
}
