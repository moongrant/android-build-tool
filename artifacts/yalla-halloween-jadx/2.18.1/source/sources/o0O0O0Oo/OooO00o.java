package o0O0O0Oo;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o<T> extends OooO0OO<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final T f35380OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Priority f35381OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public OooO00o(Object obj, Priority priority) {
        Objects.requireNonNull(obj, "Null payload");
        this.f35380OooO00o = obj;
        Objects.requireNonNull(priority, "Null priority");
        this.f35381OooO0O0 = priority;
    }

    @Override // o0O0O0Oo.OooO0OO
    @Nullable
    public final Integer OooO00o() {
        return null;
    }

    @Override // o0O0O0Oo.OooO0OO
    public final T OooO0O0() {
        return this.f35380OooO00o;
    }

    @Override // o0O0O0Oo.OooO0OO
    public final Priority OooO0OO() {
        return this.f35381OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        return oooO0OO.OooO00o() == null && this.f35380OooO00o.equals(oooO0OO.OooO0O0()) && this.f35381OooO0O0.equals(oooO0OO.OooO0OO());
    }

    public final int hashCode() {
        return this.f35381OooO0O0.hashCode() ^ (((-721379959) ^ this.f35380OooO00o.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=" + ((Object) null) + ", payload=" + this.f35380OooO00o + ", priority=" + this.f35381OooO0O0 + "}";
    }
}
