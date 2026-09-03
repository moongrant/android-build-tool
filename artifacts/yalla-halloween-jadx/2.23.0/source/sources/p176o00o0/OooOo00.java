package p176o00o0;

import androidx.annotation.Nullable;
import com.google.android.datatransport.Priority;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00<T> extends Oooo000<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Integer f38565OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final T f38566OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Priority f38567OooO0OO;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOo00(Object obj, Priority priority) {
        if (obj == 0) {
            throw new NullPointerException("Null payload");
        }
        this.f38566OooO0O0 = obj;
        if (priority == null) {
            throw new NullPointerException("Null priority");
        }
        this.f38567OooO0OO = priority;
    }

    @Override // p176o00o0.Oooo000
    @Nullable
    public final Integer OooO00o() {
        return this.f38565OooO00o;
    }

    @Override // p176o00o0.Oooo000
    public final T OooO0O0() {
        return this.f38566OooO0O0;
    }

    @Override // p176o00o0.Oooo000
    public final Priority OooO0OO() {
        return this.f38567OooO0OO;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        Integer num = this.f38565OooO00o;
        if (num != null ? num.equals(oooo000.OooO00o()) : oooo000.OooO00o() == null) {
            if (this.f38566OooO0O0.equals(oooo000.OooO0O0()) && this.f38567OooO0OO.equals(oooo000.OooO0OO())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.f38565OooO00o;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f38566OooO0O0.hashCode()) * 1000003) ^ this.f38567OooO0OO.hashCode();
    }

    public final String toString() {
        return "Event{code=" + this.f38565OooO00o + ", payload=" + this.f38566OooO0O0 + ", priority=" + this.f38567OooO0OO + "}";
    }
}
