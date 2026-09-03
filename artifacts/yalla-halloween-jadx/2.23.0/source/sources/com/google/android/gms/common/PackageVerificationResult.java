package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.errorprone.annotations.CheckReturnValue;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
public class PackageVerificationResult {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f14632OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f14633OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public final Throwable f14634OooO0OO;

    public PackageVerificationResult(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f14632OooO00o = z;
        this.f14633OooO0O0 = str;
        this.f14634OooO0OO = th;
    }

    @NonNull
    public static PackageVerificationResult zza(@NonNull String str, @NonNull String str2, @Nullable Throwable th) {
        return new PackageVerificationResult(false, str2, th);
    }

    @NonNull
    public static PackageVerificationResult zzd(@NonNull String str, int i) {
        return new PackageVerificationResult(true, null, null);
    }

    public final void zzb() {
        if (this.f14632OooO00o) {
            return;
        }
        String strConcat = "PackageVerificationRslt: ".concat(String.valueOf(this.f14633OooO0O0));
        Throwable th = this.f14634OooO0OO;
        if (th == null) {
            throw new SecurityException(strConcat);
        }
        throw new SecurityException(strConcat, th);
    }

    public final boolean zzc() {
        return this.f14632OooO00o;
    }
}
