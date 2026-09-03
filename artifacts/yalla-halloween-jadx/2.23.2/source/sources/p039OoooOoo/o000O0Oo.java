package p039OoooOoo;

import android.location.Location;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.OooOOOO;
import java.io.File;
import kotlin.ULong;

/* JADX INFO: loaded from: classes.dex */
public final class o000O0Oo extends o00O0000.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f1621OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f1622OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Location f1623OooO0OO = null;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final File f1624OooO0Oo;

    public static final class OooO00o extends o00O0000.OooO00o.AbstractC0006OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public Long f1625OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public Long f1626OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public File f1627OooO0OO;

        public final o000O0Oo OooO00o() {
            String strOooO00o = this.f1625OooO00o == null ? " fileSizeLimit" : "";
            if (this.f1626OooO0O0 == null) {
                strOooO00o = strOooO00o.concat(" durationLimitMillis");
            }
            if (this.f1627OooO0OO == null) {
                strOooO00o = OooOOOO.OooO00o(strOooO00o, " file");
            }
            if (strOooO00o.isEmpty()) {
                return new o000O0Oo(this.f1625OooO00o.longValue(), this.f1626OooO0O0.longValue(), this.f1627OooO0OO);
            }
            throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
        }

        public final OooO00o OooO0O0() {
            this.f1626OooO0O0 = 0L;
            return this;
        }

        public final OooO00o OooO0OO() {
            this.f1625OooO00o = 0L;
            return this;
        }
    }

    public o000O0Oo(long j, long j2, File file) {
        this.f1621OooO00o = j;
        this.f1622OooO0O0 = j2;
        this.f1624OooO0Oo = file;
    }

    @Override // OoooOoo.o00oOoo.OooO00o
    @IntRange(from = ULong.MIN_VALUE)
    public final long OooO00o() {
        return this.f1622OooO0O0;
    }

    @Override // OoooOoo.o00oOoo.OooO00o
    @IntRange(from = ULong.MIN_VALUE)
    public final long OooO0O0() {
        return this.f1621OooO00o;
    }

    @Override // OoooOoo.o00oOoo.OooO00o
    @Nullable
    public final Location OooO0OO() {
        return this.f1623OooO0OO;
    }

    @Override // OoooOoo.o00O0000.OooO00o
    @NonNull
    public final File OooO0Oo() {
        return this.f1624OooO0Oo;
    }

    public final boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o00O0000.OooO00o)) {
            return false;
        }
        o00O0000.OooO00o oooO00o = (o00O0000.OooO00o) obj;
        return this.f1621OooO00o == oooO00o.OooO0O0() && this.f1622OooO0O0 == oooO00o.OooO00o() && ((location = this.f1623OooO0OO) != null ? location.equals(oooO00o.OooO0OO()) : oooO00o.OooO0OO() == null) && this.f1624OooO0Oo.equals(oooO00o.OooO0Oo());
    }

    public final int hashCode() {
        long j = this.f1621OooO00o;
        long j2 = this.f1622OooO0O0;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        Location location = this.f1623OooO0OO;
        return ((i ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f1624OooO0Oo.hashCode();
    }

    public final String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f1621OooO00o + ", durationLimitMillis=" + this.f1622OooO0O0 + ", location=" + this.f1623OooO0OO + ", file=" + this.f1624OooO0Oo + "}";
    }
}
