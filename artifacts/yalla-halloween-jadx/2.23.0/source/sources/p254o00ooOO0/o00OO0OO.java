package p254o00ooOO0;

import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o00OO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ApiKey<?> f40974OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Feature f40975OooO0O0;

    public /* synthetic */ o00OO0OO(ApiKey apiKey, Feature feature) {
        this.f40974OooO00o = apiKey;
        this.f40975OooO0O0 = feature;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof o00OO0OO)) {
            o00OO0OO o00oo0oo = (o00OO0OO) obj;
            if (Objects.equal(this.f40974OooO00o, o00oo0oo.f40974OooO00o) && Objects.equal(this.f40975OooO0O0, o00oo0oo.f40975OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f40974OooO00o, this.f40975OooO0O0);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("key", this.f40974OooO00o).add("feature", this.f40975OooO0O0).toString();
    }
}
