package p174o00OooOO;

import android.text.SpannableString;
import android.text.TextUtils;
import com.app.base.util.spannableStringUtils.SpannableStringModel;
import com.umeng.analytics.pro.bz;
import java.security.MessageDigest;
import org.conscrypt.EvpMdRef;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00O {
    public static byte[] OooO00o(String str, int i, String str2) {
        String str3;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            stringBuffer.append(str);
        }
        stringBuffer.append(i);
        stringBuffer.append(str2);
        stringBuffer.append("mMcShCsTr");
        byte[] bytes = stringBuffer.toString().substring(1, 9).getBytes();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            messageDigest.update(bytes);
            byte[] bArrDigest = messageDigest.digest();
            char[] cArr2 = new char[bArrDigest.length * 2];
            int i2 = 0;
            for (byte b : bArrDigest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b >>> 4) & 15];
                i2 = i3 + 1;
                cArr2[i3] = cArr[b & bz.m];
            }
            str3 = new String(cArr2);
        } catch (Exception unused) {
            str3 = null;
        }
        return str3.getBytes();
    }

    public static SpannableString OooO0O0(o0O00OO o0o00oo2) {
        SpannableStringModel<Model> spannableStringModel = o0o00oo2.f32694Oooo0oO;
        if (spannableStringModel == 0 || TextUtils.isEmpty(spannableStringModel.getContent())) {
            return null;
        }
        SpannableStringModel<Model> spannableStringModel2 = o0o00oo2.f32694Oooo0oO;
        SpannableString spannableString = new SpannableString(spannableStringModel2.getContent());
        try {
            spannableString.setSpan(o0o00oo2, spannableStringModel2.getStart(), spannableStringModel2.getEnd(), 17);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spannableString;
    }
}
