package p045Oooooo;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import p022Oooo00O.OooOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends o000OOo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f1824OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f1825OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f1826OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Timebase f1827OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Size f1828OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00 f1829OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f1830OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f1831OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f1832OooO0oo;

    public static final class OooO00o extends o000OOo0.OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public Integer f1833OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f1834OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Integer f1835OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Timebase f1836OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Size f1837OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public o00 f1838OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Integer f1839OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Integer f1840OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public Integer f1841OooO0oo;

        public final OooOOOO OooO00o() {
            String strOooO00o = this.f1834OooO00o == null ? " mimeType" : "";
            if (this.f1835OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" profile");
            }
            if (this.f1836OooO0OO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " inputTimebase");
            }
            if (this.f1837OooO0Oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " resolution");
            }
            if (this.f1839OooO0o0 == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " colorFormat");
            }
            if (this.f1838OooO0o == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " dataSpace");
            }
            if (this.f1840OooO0oO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " frameRate");
            }
            if (this.f1841OooO0oo == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " IFrameInterval");
            }
            if (this.f1833OooO == null) {
                strOooO00o = androidx.camera.core.impl.OooOOOO.OooO00o(strOooO00o, " bitrate");
            }
            if (strOooO00o.isEmpty()) {
                return new OooOOOO(this.f1834OooO00o, this.f1835OooO0O0.intValue(), this.f1836OooO0OO, this.f1837OooO0Oo, this.f1839OooO0o0.intValue(), this.f1838OooO0o, this.f1840OooO0oO.intValue(), this.f1841OooO0oo.intValue(), this.f1833OooO.intValue());
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }
    }

    public OooOOOO(String str, int i, Timebase timebase, Size size, int i2, o00 o00Var, int i3, int i4, int i5) {
        this.f1825OooO00o = str;
        this.f1826OooO0O0 = i;
        this.f1827OooO0OO = timebase;
        this.f1828OooO0Oo = size;
        this.f1830OooO0o0 = i2;
        this.f1829OooO0o = o00Var;
        this.f1831OooO0oO = i3;
        this.f1832OooO0oo = i4;
        this.f1824OooO = i5;
    }

    @Override // p045Oooooo.o000OOo0
    public final int OooO() {
        return this.f1832OooO0oo;
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

    @Override // p045Oooooo.o000OOo0
    public final int OooO0o() {
        return this.f1830OooO0o0;
    }

    @Override // p045Oooooo.o000OOo0
    public final int OooO0o0() {
        return this.f1824OooO;
    }

    @Override // p045Oooooo.o000OOo0
    @NonNull
    public final o00 OooO0oO() {
        return this.f1829OooO0o;
    }

    @Override // p045Oooooo.o000OOo0
    public final int OooO0oo() {
        return this.f1831OooO0oO;
    }

    @Override // p045Oooooo.o000OOo0
    public final int OooOO0() {
        return this.f1826OooO0O0;
    }

    @Override // p045Oooooo.o000OOo0
    @NonNull
    public final Size OooOO0O() {
        return this.f1828OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o000OOo0)) {
            return false;
        }
        o000OOo0 o000ooo1 = (o000OOo0) obj;
        return this.f1825OooO00o.equals(((OooOOOO) o000ooo1).f1825OooO00o) && this.f1826OooO0O0 == o000ooo1.OooOO0() && this.f1827OooO0OO.equals(((OooOOOO) o000ooo1).f1827OooO0OO) && this.f1828OooO0Oo.equals(o000ooo1.OooOO0O()) && this.f1830OooO0o0 == o000ooo1.OooO0o() && this.f1829OooO0o.equals(o000ooo1.OooO0oO()) && this.f1831OooO0oO == o000ooo1.OooO0oo() && this.f1832OooO0oo == o000ooo1.OooO() && this.f1824OooO == o000ooo1.OooO0o0();
    }

    public final int hashCode() {
        return ((((((((((((((((this.f1825OooO00o.hashCode() ^ 1000003) * 1000003) ^ this.f1826OooO0O0) * 1000003) ^ this.f1827OooO0OO.hashCode()) * 1000003) ^ this.f1828OooO0Oo.hashCode()) * 1000003) ^ this.f1830OooO0o0) * 1000003) ^ this.f1829OooO0o.hashCode()) * 1000003) ^ this.f1831OooO0oO) * 1000003) ^ this.f1832OooO0oo) * 1000003) ^ this.f1824OooO;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderConfig{mimeType=");
        sb.append(this.f1825OooO00o);
        sb.append(", profile=");
        sb.append(this.f1826OooO0O0);
        sb.append(", inputTimebase=");
        sb.append(this.f1827OooO0OO);
        sb.append(", resolution=");
        sb.append(this.f1828OooO0Oo);
        sb.append(", colorFormat=");
        sb.append(this.f1830OooO0o0);
        sb.append(", dataSpace=");
        sb.append(this.f1829OooO0o);
        sb.append(", frameRate=");
        sb.append(this.f1831OooO0oO);
        sb.append(", IFrameInterval=");
        sb.append(this.f1832OooO0oo);
        sb.append(", bitrate=");
        return OooOO0.OooO00o(sb, this.f1824OooO, "}");
    }
}
