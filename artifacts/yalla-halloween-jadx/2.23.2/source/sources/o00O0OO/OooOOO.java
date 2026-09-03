package o00O0OO;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import com.facebook.appevents.AppEventsConstants;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = o00Ooo.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, primaryKeys = {"work_spec_id", "generation"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "work_spec_id")
    @NotNull
    public final String f36199OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(defaultValue = AppEventsConstants.EVENT_PARAM_VALUE_NO)
    public final int f36200OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @JvmField
    @ColumnInfo(name = "system_id")
    public final int f36201OooO0OO;

    public OooOOO(@NotNull String workSpecId, int i, int i2) {
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        this.f36199OooO00o = workSpecId;
        this.f36200OooO0O0 = i;
        this.f36201OooO0OO = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        OooOOO oooOOO = (OooOOO) obj;
        return Intrinsics.areEqual(this.f36199OooO00o, oooOOO.f36199OooO00o) && this.f36200OooO0O0 == oooOOO.f36200OooO0O0 && this.f36201OooO0OO == oooOOO.f36201OooO0OO;
    }

    public final int hashCode() {
        return (((this.f36199OooO00o.hashCode() * 31) + this.f36200OooO0O0) * 31) + this.f36201OooO0OO;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f36199OooO00o);
        sb.append(", generation=");
        sb.append(this.f36200OooO0O0);
        sb.append(", systemId=");
        return androidx.compose.foundation.layout.OooO0O0.OooO00o(sb, this.f36201OooO0OO, ')');
    }
}
