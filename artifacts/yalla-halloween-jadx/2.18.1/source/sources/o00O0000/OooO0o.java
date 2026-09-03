package o00O0000;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes.dex */
@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "key")
    public String f30122OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @ColumnInfo(name = "long_value")
    public Long f30123OooO0O0;

    public OooO0o() {
        this.f30122OooO00o = "reschedule_needed";
        this.f30123OooO0O0 = 0L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        if (!this.f30122OooO00o.equals(oooO0o.f30122OooO00o)) {
            return false;
        }
        Long l = this.f30123OooO0O0;
        Long l2 = oooO0o.f30123OooO0O0;
        if (l != null) {
            return l.equals(l2);
        }
        return l2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f30122OooO00o.hashCode() * 31;
        Long l = this.f30123OooO0O0;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public OooO0o(@NonNull String str, long j) {
        this.f30122OooO00o = str;
        this.f30123OooO0O0 = Long.valueOf(j);
    }
}
