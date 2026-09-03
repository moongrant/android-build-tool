package com.geetest.captcha;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import com.qiniu.android.common.Constants;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class m {
    public static String a(Context context) {
        String strA;
        String strA2 = f.a(context, "gt_db");
        if (!f.a(strA2)) {
            return strA2;
        }
        String string = Settings.System.getString(context.getContentResolver(), "com.baidu.deviceid");
        if (!f.a(string)) {
            f.a(context, "gt_db", string);
            return string;
        }
        try {
            String string2 = Settings.System.getString(context.getContentResolver(), "com.baidu.deviceid.v2");
            if (!f.a(string2)) {
                String string3 = new JSONObject(l.a(e.a(Base64.decode(string2, 2), "30212102dicudiab", "30212102dicudiab"), Constants.UTF_8)).getString("deviceid");
                if (!f.a(string3)) {
                    f.a(context, "gt_db", string3);
                    return string3;
                }
            }
        } catch (Exception unused) {
        }
        try {
            String strA3 = l.a(new FileInputStream("/sdcard/backups/.SystemConfig/.cuid2"), Constants.UTF_8);
            if (!f.a(strA3)) {
                String string4 = new JSONObject(l.a(e.a(Base64.decode(strA3, 2), "30212102dicudiab", "30212102dicudiab"), Constants.UTF_8)).getString("deviceid");
                if (!f.a(string4)) {
                    f.a(context, "gt_db", string4);
                    return string4;
                }
            }
        } catch (Exception unused2) {
        }
        try {
            if (!new File("/sdcard/backups/.SystemConfig/.cuid").exists()) {
                if (new File("/sdcard/baidu/.cuid").exists()) {
                    strA = l.a(new FileInputStream("/sdcard/baidu/.cuid"), Constants.UTF_8);
                }
                return "$unknown";
            }
            strA = l.a(new FileInputStream("/sdcard/backups/.SystemConfig/.cuid"), Constants.UTF_8);
            String[] strArrSplit = l.a(e.a(Base64.decode(strA, 2), "30212102dicudiab", "30212102dicudiab"), Constants.UTF_8).split("=");
            if (!f.a(strArrSplit[1])) {
                f.a(context, "gt_db", strArrSplit[1]);
                return strArrSplit[1];
            }
        } catch (Exception unused3) {
        }
        return "$unknown";
    }
}
