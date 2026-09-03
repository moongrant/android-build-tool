package p045Oooooo;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f1825OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1826OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Timebase f1827OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1829OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1830OooO0o0;

    public static final class OooO00o extends OooOO0O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f1831OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f1832OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Timebase f1833OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f1834OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Integer f1835OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f1836OooO0o0;
    }

    public OooOOO(String str, int i, Timebase timebase, int i2, int i3, int i4) {
        this.f1825OooO00o = str;
        this.f1826OooO0O0 = i;
        this.f1827OooO0OO = timebase;
        this.f1828OooO0Oo = i2;
        this.f1830OooO0o0 = i3;
        this.f1829OooO0o = i4;
    }

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final String OooO0O0() {
        return this.f1825OooO00o;
    }

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final Timebase OooO0OO() {
        return this.f1827OooO0OO;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0Oo() {
        return this.f1828OooO0Oo;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0o() {
        return this.f1826OooO0O0;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0o0() {
        return this.f1829OooO0o;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0oO() {
        return this.f1830OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f1825OooO00o.equals(((OooOOO) oooOO0O).f1825OooO00o) && this.f1826OooO0O0 == oooOO0O.OooO0o() && this.f1827OooO0OO.equals(((OooOOO) oooOO0O).f1827OooO0OO) && this.f1828OooO0Oo == oooOO0O.OooO0Oo() && this.f1830OooO0o0 == oooOO0O.OooO0oO() && this.f1829OooO0o == oooOO0O.OooO0o0();
    }

    public final int hashCode() {
        return ((((((((((this.f1825OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1826OooO0O0) * 1000003) ^ this.f1827OooO0OO.hashCode()) * 1000003) ^ this.f1828OooO0Oo) * 1000003) ^ this.f1830OooO0o0) * 1000003) ^ this.f1829OooO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.f1825OooO00o);
        sb.append(", profile=");
        sb.append(this.f1826OooO0O0);
        sb.append(", inputTimebase=");
        sb.append(this.f1827OooO0OO);
        sb.append(", bitrate=");
        sb.append(this.f1828OooO0Oo);
        sb.append(", sampleRate=");
        sb.append(this.f1830OooO0o0);
        sb.append(", channelCount=");
        return OooOO0.OooO0O0(sb, this.f1829OooO0o, "}");
    }
}
