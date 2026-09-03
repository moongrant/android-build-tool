package p102o000oo;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooOO0O f29788OooO = new OooOO0O(new OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @ColumnInfo(name = "required_network_type")
    public NetworkType f29789OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "requires_charging")
    public boolean f29790OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @ColumnInfo(name = "requires_device_idle")
    public boolean f29791OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColumnInfo(name = "requires_battery_not_low")
    public boolean f29792OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColumnInfo(name = "trigger_content_update_delay")
    public long f29793OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @ColumnInfo(name = "requires_storage_not_low")
    public boolean f29794OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ColumnInfo(name = "trigger_max_content_delay")
    public long f29795OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColumnInfo(name = "content_uri_triggers")
    public OooOOO0 f29796OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public NetworkType f29797OooO00o = NetworkType.NOT_REQUIRED;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public long f29798OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public long f29799OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooOOO0 f29800OooO0Oo = new OooOOO0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooOO0O() {
        this.f29789OooO00o = NetworkType.NOT_REQUIRED;
        this.f29793OooO0o = -1L;
        this.f29795OooO0oO = -1L;
        this.f29796OooO0oo = new OooOOO0();
    }

    @RequiresApi(24)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean OooO00o() {
        return this.f29796OooO0oo.OooO00o() > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooOO0O.class != obj.getClass()) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        if (this.f29790OooO0O0 == oooOO0O.f29790OooO0O0 && this.f29791OooO0OO == oooOO0O.f29791OooO0OO && this.f29792OooO0Oo == oooOO0O.f29792OooO0Oo && this.f29794OooO0o0 == oooOO0O.f29794OooO0o0 && this.f29793OooO0o == oooOO0O.f29793OooO0o && this.f29795OooO0oO == oooOO0O.f29795OooO0oO && this.f29789OooO00o == oooOO0O.f29789OooO00o) {
            return this.f29796OooO0oo.equals(oooOO0O.f29796OooO0oo);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f29789OooO00o.hashCode() * 31) + (this.f29790OooO0O0 ? 1 : 0)) * 31) + (this.f29791OooO0OO ? 1 : 0)) * 31) + (this.f29792OooO0Oo ? 1 : 0)) * 31) + (this.f29794OooO0o0 ? 1 : 0)) * 31;
        long j = this.f29793OooO0o;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f29795OooO0oO;
        return this.f29796OooO0oo.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public OooOO0O(OooO00o oooO00o) {
        this.f29789OooO00o = NetworkType.NOT_REQUIRED;
        this.f29793OooO0o = -1L;
        this.f29795OooO0oO = -1L;
        this.f29796OooO0oo = new OooOOO0();
        this.f29790OooO0O0 = false;
        int i = Build.VERSION.SDK_INT;
        this.f29791OooO0OO = false;
        this.f29789OooO00o = oooO00o.f29797OooO00o;
        this.f29792OooO0Oo = false;
        this.f29794OooO0o0 = false;
        if (i >= 24) {
            this.f29796OooO0oo = oooO00o.f29800OooO0Oo;
            this.f29793OooO0o = oooO00o.f29798OooO0O0;
            this.f29795OooO0oO = oooO00o.f29799OooO0OO;
        }
    }

    public OooOO0O(@NonNull OooOO0O oooOO0O) {
        this.f29789OooO00o = NetworkType.NOT_REQUIRED;
        this.f29793OooO0o = -1L;
        this.f29795OooO0oO = -1L;
        this.f29796OooO0oo = new OooOOO0();
        this.f29790OooO0O0 = oooOO0O.f29790OooO0O0;
        this.f29791OooO0OO = oooOO0O.f29791OooO0OO;
        this.f29789OooO00o = oooOO0O.f29789OooO00o;
        this.f29792OooO0Oo = oooOO0O.f29792OooO0Oo;
        this.f29794OooO0o0 = oooOO0O.f29794OooO0o0;
        this.f29796OooO0oo = oooOO0O.f29796OooO0oo;
    }
}
