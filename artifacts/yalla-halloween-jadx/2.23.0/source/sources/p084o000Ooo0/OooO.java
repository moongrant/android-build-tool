package p084o000Ooo0;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.work.NetworkType;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final OooO f35082OooO = new OooO(new OooO00o());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @ColumnInfo(name = "required_network_type")
    public NetworkType f35083OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "requires_charging")
    public boolean f35084OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @ColumnInfo(name = "requires_device_idle")
    public boolean f35085OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColumnInfo(name = "requires_battery_not_low")
    public boolean f35086OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColumnInfo(name = "trigger_content_update_delay")
    public long f35087OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @ColumnInfo(name = "requires_storage_not_low")
    public boolean f35088OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ColumnInfo(name = "trigger_max_content_delay")
    public long f35089OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColumnInfo(name = "content_uri_triggers")
    public OooOO0 f35090OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final NetworkType f35091OooO00o = NetworkType.NOT_REQUIRED;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f35092OooO0O0 = -1;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f35093OooO0OO = -1;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOO0 f35094OooO0Oo = new OooOO0();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public OooO() {
        this.f35083OooO00o = NetworkType.NOT_REQUIRED;
        this.f35087OooO0o = -1L;
        this.f35089OooO0oO = -1L;
        this.f35090OooO0oo = new OooOO0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OooO.class != obj.getClass()) {
            return false;
        }
        OooO oooO = (OooO) obj;
        if (this.f35084OooO0O0 == oooO.f35084OooO0O0 && this.f35085OooO0OO == oooO.f35085OooO0OO && this.f35086OooO0Oo == oooO.f35086OooO0Oo && this.f35088OooO0o0 == oooO.f35088OooO0o0 && this.f35087OooO0o == oooO.f35087OooO0o && this.f35089OooO0oO == oooO.f35089OooO0oO && this.f35083OooO00o == oooO.f35083OooO00o) {
            return this.f35090OooO0oo.equals(oooO.f35090OooO0oo);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f35083OooO00o.hashCode() * 31) + (this.f35084OooO0O0 ? 1 : 0)) * 31) + (this.f35085OooO0OO ? 1 : 0)) * 31) + (this.f35086OooO0Oo ? 1 : 0)) * 31) + (this.f35088OooO0o0 ? 1 : 0)) * 31;
        long j = this.f35087OooO0o;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f35089OooO0oO;
        return this.f35090OooO0oo.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public OooO(OooO00o oooO00o) {
        this.f35083OooO00o = NetworkType.NOT_REQUIRED;
        this.f35087OooO0o = -1L;
        this.f35089OooO0oO = -1L;
        this.f35090OooO0oo = new OooOO0();
        this.f35084OooO0O0 = false;
        int i = Build.VERSION.SDK_INT;
        this.f35085OooO0OO = false;
        this.f35083OooO00o = oooO00o.f35091OooO00o;
        this.f35086OooO0Oo = false;
        this.f35088OooO0o0 = false;
        if (i >= 24) {
            this.f35090OooO0oo = oooO00o.f35094OooO0Oo;
            this.f35087OooO0o = oooO00o.f35092OooO0O0;
            this.f35089OooO0oO = oooO00o.f35093OooO0OO;
        }
    }

    public OooO(@NonNull OooO oooO) {
        this.f35083OooO00o = NetworkType.NOT_REQUIRED;
        this.f35087OooO0o = -1L;
        this.f35089OooO0oO = -1L;
        this.f35090OooO0oo = new OooOO0();
        this.f35084OooO0O0 = oooO.f35084OooO0O0;
        this.f35085OooO0OO = oooO.f35085OooO0OO;
        this.f35083OooO00o = oooO.f35083OooO00o;
        this.f35086OooO0Oo = oooO.f35086OooO0Oo;
        this.f35088OooO0o0 = oooO.f35088OooO0o0;
        this.f35090OooO0oo = oooO.f35090OooO0oo;
    }
}
