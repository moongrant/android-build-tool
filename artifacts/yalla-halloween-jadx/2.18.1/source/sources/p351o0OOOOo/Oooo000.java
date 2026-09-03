package p351o0OOOOo;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f38282OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38283OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f38284OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f38285OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f38286OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f38287OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f38288OooO0oO;

    public Oooo000(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f38283OooO0O0 = str;
        this.f38282OooO00o = str2;
        this.f38284OooO0OO = str3;
        this.f38285OooO0Oo = str4;
        this.f38287OooO0o0 = str5;
        this.f38286OooO0o = str6;
        this.f38288OooO0oO = str7;
    }

    @Nullable
    public static Oooo000 OooO00o(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new Oooo000(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Oooo000)) {
            return false;
        }
        Oooo000 oooo000 = (Oooo000) obj;
        return Objects.equal(this.f38283OooO0O0, oooo000.f38283OooO0O0) && Objects.equal(this.f38282OooO00o, oooo000.f38282OooO00o) && Objects.equal(this.f38284OooO0OO, oooo000.f38284OooO0OO) && Objects.equal(this.f38285OooO0Oo, oooo000.f38285OooO0Oo) && Objects.equal(this.f38287OooO0o0, oooo000.f38287OooO0o0) && Objects.equal(this.f38286OooO0o, oooo000.f38286OooO0o) && Objects.equal(this.f38288OooO0oO, oooo000.f38288OooO0oO);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f38283OooO0O0, this.f38282OooO00o, this.f38284OooO0OO, this.f38285OooO0Oo, this.f38287OooO0o0, this.f38286OooO0o, this.f38288OooO0oO);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f38283OooO0O0).add("apiKey", this.f38282OooO00o).add("databaseUrl", this.f38284OooO0OO).add("gcmSenderId", this.f38287OooO0o0).add("storageBucket", this.f38286OooO0o).add("projectId", this.f38288OooO0oO).toString();
    }
}
