package p233o00oOoOO;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O000O<T> extends o0O000Oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Integer f39902OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f39903OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Priority f39904OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0O000O(Object obj, Priority priority) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f39903OooO0O0 = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f39904OooO0OO = priority;
    }

    @Override // p233o00oOoOO.o0O000Oo
    @Nullable
    public final Integer OooO00o() {
        return this.f39902OooO00o;
    }

    @Override // p233o00oOoOO.o0O000Oo
    public final T OooO0O0() {
        return this.f39903OooO0O0;
    }

    @Override // p233o00oOoOO.o0O000Oo
    public final Priority OooO0OO() {
        return this.f39904OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0O000Oo)) {
            return false;
        }
        o0O000Oo o0o000oo2 = (o0O000Oo) obj;
        Integer num = this.f39902OooO00o;
        if (num != null ? num.equals(o0o000oo2.OooO00o()) : o0o000oo2.OooO00o() == null) {
            if (this.f39903OooO0O0.equals(o0o000oo2.OooO0O0()) && this.f39904OooO0OO.equals(o0o000oo2.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f39902OooO00o;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f39903OooO0O0.hashCode()) * 1000003) ^ this.f39904OooO0OO.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f39902OooO00o + ", payload=" + this.f39903OooO0O0 + ", priority=" + this.f39904OooO0OO + "}";
    }
}
