package p378o0OOoO0O;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.gms.stats.CodePackage;
import com.umeng.analytics.pro.bz;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import kotlin.KotlinVersion;
import p351o0OOOOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o000Oo0 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final String[] f38706OooO0OO = {"*", "FCM", CodePackage.GCM, ""};

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @GuardedBy("iidPrefs")
    public final SharedPreferences f38707OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38708OooO0O0;

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public o000Oo0(@NonNull OooOOO oooOOO) {
        oooOOO.OooO00o();
        this.f38707OooO00o = oooOOO.f38263OooO00o.getSharedPreferences("com.google.android.gms.appid", 0);
        oooOOO.OooO00o();
        String str = oooOOO.f38265OooO0OO.f38287OooO0o0;
        if (str == null) {
            oooOOO.OooO00o();
            str = oooOOO.f38265OooO0OO.f38283OooO0O0;
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
        this.f38708OooO0O0 = str;
    }

    @Nullable
    public final String OooO00o() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f38707OooO00o) {
            String strEncodeToString = null;
            String string = this.f38707OooO00o.getString("|S||P|", null);
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
                bArrDigest[0] = (byte) (((bArrDigest[0] & bz.m) + 112) & KotlinVersion.MAX_COMPONENT_VALUE);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
