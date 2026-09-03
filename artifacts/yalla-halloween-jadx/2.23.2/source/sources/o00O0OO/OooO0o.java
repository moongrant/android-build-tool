package o00O0OO;

import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Entity
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "key")
    @NotNull
    public final String f36195OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @ColumnInfo(name = "long_value")
    @Nullable
    public final Long f36196OooO0O0;

    public OooO0o(@NotNull String key, @Nullable Long l) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f36195OooO00o = key;
        this.f36196OooO0O0 = l;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0o)) {
            return false;
        }
        OooO0o oooO0o = (OooO0o) obj;
        return Intrinsics.areEqual(this.f36195OooO00o, oooO0o.f36195OooO00o) && Intrinsics.areEqual(this.f36196OooO0O0, oooO0o.f36196OooO0O0);
    }

    public final int hashCode() {
        int iHashCode = this.f36195OooO00o.hashCode() * 31;
        Long l = this.f36196OooO0O0;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    @NotNull
    public final String toString() {
        return "Preference(key=" + this.f36195OooO00o + ", value=" + this.f36196OooO0O0 + ')';
    }
}
