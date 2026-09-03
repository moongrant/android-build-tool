package com.geetest.core;

import android.content.Context;
import android.content.pm.Signature;
import com.app.base.interfaceType.FeedbackType;
import com.facebook.appevents.AppEventsConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import kotlin.UByte;

/* JADX INFO: loaded from: classes2.dex */
public class Utils {
    private static String getLogStatus() {
        Process processExec = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec("logcat -b system -d");
                if (processExec == null) {
                    if (processExec == null) {
                        return FeedbackType.Suggestions;
                    }
                    processExec.destroy();
                    return FeedbackType.Suggestions;
                }
                String line = new BufferedReader(new InputStreamReader(processExec.getInputStream()), 8192).readLine();
                if (line == "" || line == null) {
                    processExec.destroy();
                    return AppEventsConstants.EVENT_PARAM_VALUE_NO;
                }
                processExec.destroy();
                return "1";
            } catch (IOException e) {
                e.printStackTrace();
                if (processExec == null) {
                    return FeedbackType.Recharge;
                }
                processExec.destroy();
                return FeedbackType.Recharge;
            }
        } catch (Throwable th) {
            if (processExec != null) {
                processExec.destroy();
            }
            throw th;
        }
    }

    private static String getSignature(Context context) {
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return "";
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(signatureArr[0].toByteArray());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & UByte.MAX_VALUE) | 256).substring(1, 3));
            }
            return sb.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
