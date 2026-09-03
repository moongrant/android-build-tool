package p051o00000o0;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
public final class OooOOO0 {
    @Nullable
    @DoNotInline
    public static Signature[] OooO00o(@NonNull SigningInfo signingInfo) {
        return signingInfo.getApkContentsSigners();
    }

    @DoNotInline
    public static long OooO0O0(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    @Nullable
    @DoNotInline
    public static Signature[] OooO0OO(@NonNull SigningInfo signingInfo) {
        return signingInfo.getSigningCertificateHistory();
    }

    @DoNotInline
    public static boolean OooO0Oo(@NonNull SigningInfo signingInfo) {
        return signingInfo.hasMultipleSigners();
    }

    @DoNotInline
    public static boolean OooO0o0(@NonNull PackageManager packageManager, @NonNull String str, @NonNull byte[] bArr, int i) {
        return packageManager.hasSigningCertificate(str, bArr, i);
    }
}
