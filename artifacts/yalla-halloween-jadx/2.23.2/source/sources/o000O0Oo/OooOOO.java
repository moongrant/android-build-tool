package o000O0Oo;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f34258OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f34259OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f34260OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f34261OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f34262OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f34263OooO0o0;

    @RequiresApi(19)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioTrack f34264OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AudioTimestamp f34265OooO0O0 = new AudioTimestamp();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f34266OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f34267OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f34268OooO0o0;

        public OooO00o(AudioTrack audioTrack) {
            this.f34264OooO00o = audioTrack;
        }
    }

    public OooOOO(AudioTrack audioTrack) {
        if (o00.f34910OooO00o >= 19) {
            this.f34258OooO00o = new OooO00o(audioTrack);
            OooO00o();
        } else {
            this.f34258OooO00o = null;
            OooO0O0(3);
        }
    }

    public final void OooO00o() {
        if (this.f34258OooO00o != null) {
            OooO0O0(0);
        }
    }

    public final void OooO0O0(int i) {
        this.f34259OooO0O0 = i;
        if (i == 0) {
            this.f34263OooO0o0 = 0L;
            this.f34262OooO0o = -1L;
            this.f34260OooO0OO = System.nanoTime() / 1000;
            this.f34261OooO0Oo = 10000L;
            return;
        }
        if (i == 1) {
            this.f34261OooO0Oo = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f34261OooO0Oo = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f34261OooO0Oo = 500000L;
        }
    }
}
