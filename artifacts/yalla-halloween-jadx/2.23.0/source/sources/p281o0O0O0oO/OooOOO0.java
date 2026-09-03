package p281o0O0O0oO;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f41960OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41961OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f41962OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f41963OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f41964OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f41965OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f41966OooO0oO;

    public OooOOO0(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f41961OooO0O0 = str;
        this.f41960OooO00o = str2;
        this.f41962OooO0OO = str3;
        this.f41963OooO0Oo = str4;
        this.f41965OooO0o0 = str5;
        this.f41964OooO0o = str6;
        this.f41966OooO0oO = str7;
    }

    @Nullable
    public static OooOOO0 OooO00o(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new OooOOO0(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO0)) {
            return false;
        }
        OooOOO0 oooOOO0 = (OooOOO0) obj;
        return Objects.equal(this.f41961OooO0O0, oooOOO0.f41961OooO0O0) && Objects.equal(this.f41960OooO00o, oooOOO0.f41960OooO00o) && Objects.equal(this.f41962OooO0OO, oooOOO0.f41962OooO0OO) && Objects.equal(this.f41963OooO0Oo, oooOOO0.f41963OooO0Oo) && Objects.equal(this.f41965OooO0o0, oooOOO0.f41965OooO0o0) && Objects.equal(this.f41964OooO0o, oooOOO0.f41964OooO0o) && Objects.equal(this.f41966OooO0oO, oooOOO0.f41966OooO0oO);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f41961OooO0O0, this.f41960OooO00o, this.f41962OooO0OO, this.f41963OooO0Oo, this.f41965OooO0o0, this.f41964OooO0o, this.f41966OooO0oO);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f41961OooO0O0).add("apiKey", this.f41960OooO00o).add("databaseUrl", this.f41962OooO0OO).add("gcmSenderId", this.f41965OooO0o0).add("storageBucket", this.f41964OooO0o).add("projectId", this.f41966OooO0oO).toString();
    }
}
