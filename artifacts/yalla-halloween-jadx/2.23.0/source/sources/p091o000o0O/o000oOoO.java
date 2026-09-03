package p091o000o0O;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes2.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = o0Oo0oo.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class o000oOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    public final String f35249OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "system_id")
    public final int f35250OooO0O0;

    public o000oOoO(@NonNull String str, int i) {
        this.f35249OooO00o = str;
        this.f35250OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o000oOoO)) {
            return false;
        }
        o000oOoO o000oooo2 = (o000oOoO) obj;
        if (this.f35250OooO0O0 != o000oooo2.f35250OooO0O0) {
            return false;
        }
        return this.f35249OooO00o.equals(o000oooo2.f35249OooO00o);
    }

    public final int hashCode() {
        return (this.f35249OooO00o.hashCode() * 31) + this.f35250OooO0O0;
    }
}
