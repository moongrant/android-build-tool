package p168o00Ooo0;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import oO0OO0OO.OooO00o;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import p516o0o0O000.o0OoOo0;
import p640o0ooO0oO.o000O0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f32637OooO00o;

    static {
        o000O0O0.OooO00o(-42265945021968L);
        o000O0O0.OooO00o(-42356139335184L);
        f32637OooO00o = o0OoOo0.OooO00o().getBytes();
    }

    public static String OooO00o(String str) {
        return OooO0O0(o000O0O0.OooO00o(-42124211101200L), str);
    }

    public static String OooO0O0(String str, String str2) throws NullPointerException {
        if (str == null || str.length() == 0) {
            throw new NullPointerException(o000O0O0.OooO00o(-41471376072208L));
        }
        if (str2 == null || str2.length() == 0) {
            throw new NullPointerException(o000O0O0.OooO00o(-41561570385424L));
        }
        try {
            SecretKeySpec secretKeySpecOooO0o0 = OooO0o0(str);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f32637OooO00o);
            byte[] bArrOooO00o = OooO00o.OooO00o(str2);
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance(o000O0O0.OooO00o(-41634584829456L));
            cipher.init(2, secretKeySpecOooO0o0, ivParameterSpec);
            return new String(cipher.doFinal(bArrOooO00o));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        } catch (NoSuchPaddingException e7) {
            e7.printStackTrace();
            return o000O0O0.OooO00o(-41724779142672L);
        }
    }

    public static String OooO0OO(String str) {
        return OooO0Oo(o000O0O0.OooO00o(-41982477180432L), str);
    }

    public static String OooO0Oo(String str, String str2) throws NullPointerException {
        if (str == null || str.length() == 0) {
            throw new NullPointerException(o000O0O0.OooO00o(-40706871893520L));
        }
        if (str2 == null || str2.length() == 0) {
            throw new NullPointerException(o000O0O0.OooO00o(-40797066206736L));
        }
        try {
            SecretKeySpec secretKeySpecOooO0o0 = OooO0o0(str);
            byte[] bytes = str2.getBytes(o000O0O0.OooO00o(-40870080650768L));
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f32637OooO00o);
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance(o000O0O0.OooO00o(-40891555487248L));
            cipher.init(1, secretKeySpecOooO0o0, ivParameterSpec);
            return new String(OooO00o.OooO0O0(cipher.doFinal(bytes)));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (InvalidAlgorithmParameterException e2) {
            e2.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (InvalidKeyException e3) {
            e3.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (NoSuchAlgorithmException e4) {
            e4.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (BadPaddingException e5) {
            e5.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (IllegalBlockSizeException e6) {
            e6.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        } catch (NoSuchPaddingException e7) {
            e7.printStackTrace();
            return o000O0O0.OooO00o(-40981749800464L);
        }
    }

    public static SecretKeySpec OooO0o0(String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[32];
        for (int i = 0; i < 32; i++) {
            bArr[i] = 0;
        }
        System.arraycopy(str.getBytes(o000O0O0.OooO00o(-41913757703696L)), 0, bArr, 0, 32);
        return new SecretKeySpec(str.getBytes(o000O0O0.OooO00o(-41939527507472L)), o000O0O0.OooO00o(-41965297311248L));
    }
}
