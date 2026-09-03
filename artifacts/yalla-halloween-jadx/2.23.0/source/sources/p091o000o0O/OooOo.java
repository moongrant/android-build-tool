package p091o000o0O;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "key")
    public final String f35237OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    @ColumnInfo(name = "long_value")
    public final Long f35238OooO0O0;

    public OooOo(@NonNull String str, long j) {
        this.f35237OooO00o = str;
        this.f35238OooO0O0 = Long.valueOf(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOo)) {
            return false;
        }
        OooOo oooOo = (OooOo) obj;
        if (!this.f35237OooO00o.equals(oooOo.f35237OooO00o)) {
            return false;
        }
        Long l = oooOo.f35238OooO0O0;
        Long l2 = this.f35238OooO0O0;
        if (l2 != null) {
            return l2.equals(l);
        }
        return l == null;
    }

    public final int hashCode() {
        int iHashCode = this.f35237OooO00o.hashCode() * 31;
        Long l = this.f35238OooO0O0;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
