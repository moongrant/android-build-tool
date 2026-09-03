package p626o0ooO;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* JADX INFO: loaded from: classes3.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f57674OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f57675OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final String f57676OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f57677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final String f57678OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final String f57679OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final String f57680OooO0oO;

    public oo0o0Oo(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f57675OooO0O0 = str;
        this.f57674OooO00o = str2;
        this.f57676OooO0OO = str3;
        this.f57677OooO0Oo = str4;
        this.f57679OooO0o0 = str5;
        this.f57678OooO0o = str6;
        this.f57680OooO0oO = str7;
    }

    @Nullable
    public static oo0o0Oo OooO00o(@NonNull Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new oo0o0Oo(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oo0o0Oo)) {
            return false;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) obj;
        return Objects.equal(this.f57675OooO0O0, oo0o0oo.f57675OooO0O0) && Objects.equal(this.f57674OooO00o, oo0o0oo.f57674OooO00o) && Objects.equal(this.f57676OooO0OO, oo0o0oo.f57676OooO0OO) && Objects.equal(this.f57677OooO0Oo, oo0o0oo.f57677OooO0Oo) && Objects.equal(this.f57679OooO0o0, oo0o0oo.f57679OooO0o0) && Objects.equal(this.f57678OooO0o, oo0o0oo.f57678OooO0o) && Objects.equal(this.f57680OooO0oO, oo0o0oo.f57680OooO0oO);
    }

    public final int hashCode() {
        return Objects.hashCode(this.f57675OooO0O0, this.f57674OooO00o, this.f57676OooO0OO, this.f57677OooO0Oo, this.f57679OooO0o0, this.f57678OooO0o, this.f57680OooO0oO);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f57675OooO0O0).add("apiKey", this.f57674OooO00o).add("databaseUrl", this.f57676OooO0OO).add("gcmSenderId", this.f57679OooO0o0).add("storageBucket", this.f57678OooO0o).add("projectId", this.f57680OooO0oO).toString();
    }
}
