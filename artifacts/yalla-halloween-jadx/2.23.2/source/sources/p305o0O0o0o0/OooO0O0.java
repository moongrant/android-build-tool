package p305o0O0o0o0;

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
import p626o0ooO.o0OOO0o;
import p626o0ooO.oo0o0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f41764OooO0OO = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("iidPrefs")
    public final SharedPreferences f41765OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41766OooO0O0;

    /* JADX WARN: Code duplicated, block: B:12:0x003c  */
    public OooO0O0(@NonNull o0OOO0o o0ooo0o2) {
        o0ooo0o2.OooO00o();
        this.f41765OooO00o = o0ooo0o2.f57662OooO00o.getSharedPreferences("com.google.android.gms.appid", 0);
        o0ooo0o2.OooO00o();
        oo0o0Oo oo0o0oo = o0ooo0o2.f57664OooO0OO;
        String str = oo0o0oo.f57679OooO0o0;
        if (str == null) {
            o0ooo0o2.OooO00o();
            str = oo0o0oo.f57675OooO0O0;
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
        this.f41766OooO0O0 = str;
    }

    @Nullable
    public final String OooO00o() {
        String string;
        synchronized (this.f41765OooO00o) {
            string = this.f41765OooO00o.getString("|S|id", null);
        }
        return string;
    }

    @Nullable
    public final String OooO0O0() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f41765OooO00o) {
            String strEncodeToString = null;
            String string = this.f41765OooO00o.getString("|S||P|", null);
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
