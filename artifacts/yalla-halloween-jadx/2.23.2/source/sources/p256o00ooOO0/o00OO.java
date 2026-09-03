package p256o00ooOO0;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ApiKey<?> f40289OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Feature f40290OooO0O0;

    public /* synthetic */ o00OO(ApiKey apiKey, Feature feature) {
        this.f40289OooO00o = apiKey;
        this.f40290OooO0O0 = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof o00OO)) {
            o00OO o00oo2 = (o00OO) obj;
            if (Objects.equal(this.f40289OooO00o, o00oo2.f40289OooO00o) && Objects.equal(this.f40290OooO0O0, o00oo2.f40290OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40289OooO00o, this.f40290OooO0O0);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.f40289OooO00o).add("feature", this.f40290OooO0O0).toString();
    }
}
