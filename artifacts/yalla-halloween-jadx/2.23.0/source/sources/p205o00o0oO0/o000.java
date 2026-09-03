package p205o00o0oO0;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public final OooO00o f39307OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f39308OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f39309OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f39310OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f39311OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f39312OooO0o0;

    @RequiresApi(19)
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final AudioTrack f39313OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AudioTimestamp f39314OooO0O0 = new AudioTimestamp();

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f39315OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f39316OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public long f39317OooO0o0;

        public OooO00o(AudioTrack audioTrack) {
            this.f39313OooO00o = audioTrack;
        }
    }

    public o000(AudioTrack audioTrack) {
        if (o0O00.f40595OooO00o >= 19) {
            this.f39307OooO00o = new OooO00o(audioTrack);
            OooO00o();
        } else {
            this.f39307OooO00o = null;
            OooO0O0(3);
        }
    }

    public final void OooO00o() {
        if (this.f39307OooO00o != null) {
            OooO0O0(0);
        }
    }

    public final void OooO0O0(int i) {
        this.f39308OooO0O0 = i;
        if (i == 0) {
            this.f39312OooO0o0 = 0L;
            this.f39311OooO0o = -1L;
            this.f39309OooO0OO = System.nanoTime() / 1000;
            this.f39310OooO0Oo = 10000L;
            return;
        }
        if (i == 1) {
            this.f39310OooO0Oo = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f39310OooO0Oo = 10000000L;
        } else {
            if (i != 4) {
                throw new IllegalStateException();
            }
            this.f39310OooO0Oo = 500000L;
        }
    }
}
