package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzif;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 extends zzif {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final oo0o0O0 f37464Oooo0o = new oo0o0O0();

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzif
    public final boolean zzb() {
        return false;
    }
}
