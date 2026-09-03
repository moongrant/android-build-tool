package p331o0O0oooO;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0O0o00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ApiKey<?> f37107OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Feature f37108OooO0O0;

    public /* synthetic */ o0O0o00O(ApiKey apiKey, Feature feature) {
        this.f37107OooO00o = apiKey;
        this.f37108OooO0O0 = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof o0O0o00O)) {
            o0O0o00O o0o0o00o = (o0O0o00O) obj;
            if (Objects.equal(this.f37107OooO00o, o0o0o00o.f37107OooO00o) && Objects.equal(this.f37108OooO0O0, o0o0o00o.f37108OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f37107OooO00o, this.f37108OooO0O0);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.f37107OooO00o).add("feature", this.f37108OooO0O0).toString();
    }
}
