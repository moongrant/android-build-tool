package o00O0000;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = o0OoOo0.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "work_spec_id")
    public final String f30126OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "system_id")
    public final int f30127OooO0O0;

    public OooOO0O(@NonNull String str, int i) {
        this.f30126OooO00o = str;
        this.f30127OooO0O0 = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOO0O)) {
            return false;
        }
        OooOO0O oooOO0O = (OooOO0O) obj;
        if (this.f30127OooO0O0 != oooOO0O.f30127OooO0O0) {
            return false;
        }
        return this.f30126OooO00o.equals(oooOO0O.f30126OooO00o);
    }

    public final int hashCode() {
        return (this.f30126OooO00o.hashCode() * 31) + this.f30127OooO0O0;
    }
}
