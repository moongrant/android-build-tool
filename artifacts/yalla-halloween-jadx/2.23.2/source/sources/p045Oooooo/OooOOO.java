package p045Oooooo;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO extends OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f1812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Timebase f1814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f1815OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f1816OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1817OooO0o0;

    public static final class OooO00o extends OooOO0O.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f1818OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f1819OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Timebase f1820OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Integer f1821OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Integer f1822OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f1823OooO0o0;
    }

    public OooOOO(String str, int i, Timebase timebase, int i2, int i3, int i4) {
        this.f1812OooO00o = str;
        this.f1813OooO0O0 = i;
        this.f1814OooO0OO = timebase;
        this.f1815OooO0Oo = i2;
        this.f1817OooO0o0 = i3;
        this.f1816OooO0o = i4;
    }

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final String OooO0O0() {
        return this.f1812OooO00o;
    }

    @Override // p045Oooooo.o00Ooo
    @NonNull
    public final Timebase OooO0OO() {
        return this.f1814OooO0OO;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0Oo() {
        return this.f1815OooO0Oo;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0o() {
        return this.f1813OooO0O0;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0o0() {
        return this.f1816OooO0o;
    }

    @Override // p045Oooooo.OooOO0O
    public final int OooO0oO() {
        return this.f1817OooO0o0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        return this.f1812OooO00o.equals(((OooOOO) oooOO0O).f1812OooO00o) && this.f1813OooO0O0 == oooOO0O.OooO0o() && this.f1814OooO0OO.equals(((OooOOO) oooOO0O).f1814OooO0OO) && this.f1815OooO0Oo == oooOO0O.OooO0Oo() && this.f1817OooO0o0 == oooOO0O.OooO0oO() && this.f1816OooO0o == oooOO0O.OooO0o0();
    }

    public final int hashCode() {
        return ((((((((((this.f1812OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1813OooO0O0) * 1000003) ^ this.f1814OooO0OO.hashCode()) * 1000003) ^ this.f1815OooO0Oo) * 1000003) ^ this.f1817OooO0o0) * 1000003) ^ this.f1816OooO0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioEncoderConfig{mimeType=");
        sb.append(this.f1812OooO00o);
        sb.append(", profile=");
        sb.append(this.f1813OooO0O0);
        sb.append(", inputTimebase=");
        sb.append(this.f1814OooO0OO);
        sb.append(", bitrate=");
        sb.append(this.f1815OooO0Oo);
        sb.append(", sampleRate=");
        sb.append(this.f1817OooO0o0);
        sb.append(", channelCount=");
        return OooOO0.OooO00o(sb, this.f1816OooO0o, "}");
    }
}
