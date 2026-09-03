package p115o00O00oO;

import android.net.Uri;
import androidx.room.ColumnInfo;
import androidx.work.NetworkType;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Oooo0 f36130OooO = new Oooo0(0);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @ColumnInfo(name = "required_network_type")
    @NotNull
    public final NetworkType f36131OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "requires_charging")
    public final boolean f36132OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @ColumnInfo(name = "requires_device_idle")
    public final boolean f36133OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @ColumnInfo(name = "requires_battery_not_low")
    public final boolean f36134OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @ColumnInfo(name = "trigger_content_update_delay")
    public final long f36135OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @ColumnInfo(name = "requires_storage_not_low")
    public final boolean f36136OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @ColumnInfo(name = "trigger_max_content_delay")
    public final long f36137OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @ColumnInfo(name = "content_uri_triggers")
    @NotNull
    public final Set<OooO00o> f36138OooO0oo;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Uri f36139OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f36140OooO0O0;

        public OooO00o(boolean z, @NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.f36139OooO00o = uri;
            this.f36140OooO0O0 = z;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!Intrinsics.areEqual(OooO00o.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
            OooO00o oooO00o = (OooO00o) obj;
            return Intrinsics.areEqual(this.f36139OooO00o, oooO00o.f36139OooO00o) && this.f36140OooO0O0 == oooO00o.f36140OooO0O0;
        }

        public final int hashCode() {
            return (this.f36139OooO00o.hashCode() * 31) + (this.f36140OooO0O0 ? 1231 : 1237);
        }
    }

    public Oooo0() {
        this(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual(Oooo0.class, obj.getClass())) {
            return false;
        }
        Oooo0 oooo0 = (Oooo0) obj;
        if (this.f36132OooO0O0 == oooo0.f36132OooO0O0 && this.f36133OooO0OO == oooo0.f36133OooO0OO && this.f36134OooO0Oo == oooo0.f36134OooO0Oo && this.f36136OooO0o0 == oooo0.f36136OooO0o0 && this.f36135OooO0o == oooo0.f36135OooO0o && this.f36137OooO0oO == oooo0.f36137OooO0oO && this.f36131OooO00o == oooo0.f36131OooO00o) {
            return Intrinsics.areEqual(this.f36138OooO0oo, oooo0.f36138OooO0oo);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.f36131OooO00o.hashCode() * 31) + (this.f36132OooO0O0 ? 1 : 0)) * 31) + (this.f36133OooO0OO ? 1 : 0)) * 31) + (this.f36134OooO0Oo ? 1 : 0)) * 31) + (this.f36136OooO0o0 ? 1 : 0)) * 31;
        long j = this.f36135OooO0o;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f36137OooO0oO;
        return this.f36138OooO0oo.hashCode() + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }

    public Oooo0(@NotNull NetworkType requiredNetworkType, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, @NotNull Set<OooO00o> contentUriTriggers) {
        Intrinsics.checkNotNullParameter(requiredNetworkType, "requiredNetworkType");
        Intrinsics.checkNotNullParameter(contentUriTriggers, "contentUriTriggers");
        this.f36131OooO00o = requiredNetworkType;
        this.f36132OooO0O0 = z;
        this.f36133OooO0OO = z2;
        this.f36134OooO0Oo = z3;
        this.f36136OooO0o0 = z4;
        this.f36135OooO0o = j;
        this.f36137OooO0oO = j2;
        this.f36138OooO0oo = contentUriTriggers;
    }

    public /* synthetic */ Oooo0(int i) {
        this(NetworkType.NOT_REQUIRED, false, false, false, false, -1L, -1L, SetsKt.emptySet());
    }
}
