package OooOOO0;

import com.facebook.appevents.AppEventsConstants;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.UByte;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {
    @NotNull
    public static final String OooO00o(@Nullable String str, int i) {
        if (!(str.length() > 0)) {
            return "";
        }
        if (i > str.length()) {
            String strSubstring = str.substring(0, str.length());
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }
        String strSubstring2 = str.substring(0, i);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring2;
    }

    public static final String OooO0O0(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
            messageDigest.reset();
            messageDigest.update(bArr);
            byte[] bArrDigest = messageDigest.digest();
            int i = 0;
            int length = bArrDigest.length - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = i + 1;
                    if (Integer.toHexString(bArrDigest[i] & UByte.MAX_VALUE).length() == 1) {
                        stringBuffer.append(AppEventsConstants.EVENT_PARAM_VALUE_NO);
                        stringBuffer.append(Integer.toHexString(bArrDigest[i] & UByte.MAX_VALUE));
                    } else {
                        stringBuffer.append(Integer.toHexString(bArrDigest[i] & UByte.MAX_VALUE));
                    }
                    if (i2 > length) {
                        break;
                    }
                    i = i2;
                }
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        String string = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(string, "strBuff.toString()");
        return string;
    }

    public static final void OooO0OO(@NotNull File directoryOrFile) {
        File[] fileArrListFiles;
        Intrinsics.checkNotNullParameter(directoryOrFile, "directoryOrFile");
        if (directoryOrFile.exists()) {
            if (directoryOrFile.isDirectory() && (fileArrListFiles = directoryOrFile.listFiles()) != null) {
                int i = 0;
                int length = fileArrListFiles.length;
                while (i < length) {
                    File child = fileArrListFiles[i];
                    i++;
                    Intrinsics.checkNotNullExpressionValue(child, "child");
                    OooO0OO(child);
                }
            }
            directoryOrFile.delete();
        }
    }

    public static final boolean OooO0Oo(@Nullable CharSequence charSequence) {
        return charSequence != null && charSequence.length() > 0;
    }
}
