package p300o0O0o0OO;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.stats.CodePackage;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import p281o0O0O0oO.OooOO0;
import p281o0O0O0oO.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f42398OooO0OO = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("iidPrefs")
    public final SharedPreferences f42399OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f42400OooO0O0;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public OooOo00(@NonNull OooOO0 oooOO1) {
        oooOO1.OooO00o();
        this.f42399OooO00o = oooOO1.f41949OooO00o.getSharedPreferences("com.google.android.gms.appid", 0);
        oooOO1.OooO00o();
        OooOOO0 oooOOO0 = oooOO1.f41951OooO0OO;
        String str = oooOOO0.f41965OooO0o0;
        if (str == null) {
            oooOO1.OooO00o();
            str = oooOOO0.f41961OooO0O0;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(CertificateUtil.DELIMITER);
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f42400OooO0O0 = str;
    }

    @Nullable
    public final String OooO00o() {
        String string;
        synchronized (this.f42399OooO00o) {
            string = this.f42399OooO00o.getString("|S|id", null);
        }
        return string;
    }

    @Nullable
    public final String OooO0O0() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f42399OooO00o) {
            String strEncodeToString = null;
            String string = this.f42399OooO00o.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
