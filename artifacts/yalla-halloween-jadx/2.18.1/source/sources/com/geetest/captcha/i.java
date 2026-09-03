package com.geetest.captcha;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.util.Base64;
import android.util.Pair;
import com.qiniu.android.common.Constants;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
final class i {

    @SuppressLint({"SdCardPath"})
    private static final String[] a = {"/sdcard/.system_log.trace", "/sdcard/tencent/.DrvZPZQ", "/sdcard/alipay/.Wg83DS3"};

    public static Pair<String, String> a(Context context) {
        String strA = f.a(context, "gt_di");
        if (!f.a(strA)) {
            try {
                return new Pair<>(new JSONObject(l.a(e.a(Base64.decode(strA, 2), "VedaT=ZbPq0Zv7Do"), Constants.UTF_8)).getString("gee_id"), strA);
            } catch (Exception unused) {
                return null;
            }
        }
        if (context.checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", Process.myPid(), Process.myUid()) != 0) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 29 && !Environment.isExternalStorageLegacy()) {
            return null;
        }
        try {
            String strA2 = l.a(new FileReader(a[0]));
            JSONObject jSONObject = new JSONObject(new String(e.a(Base64.decode(strA2, 2), "VedaT=ZbPq0Zv7Do")));
            f.a(context, "gt_di", strA2);
            return new Pair<>(jSONObject.getString("gee_id"), strA2);
        } catch (Exception unused2) {
            try {
                try {
                    try {
                        String[] strArr = a;
                        String strA3 = l.a(new FileReader(strArr[1]));
                        JSONObject jSONObject2 = new JSONObject(new String(e.a(Base64.decode(strA3, 2), "VedaT=ZbPq0Zv7Do")));
                        f.a(context, "gt_di", strA3);
                        a(strA3, strArr[0]);
                        return new Pair<>(jSONObject2.getString("gee_id"), strA3);
                    } catch (Exception unused3) {
                        String string = UUID.randomUUID().toString();
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("gee_id", string);
                        jSONObject3.put("ts", System.currentTimeMillis());
                        jSONObject3.put("ver", "1.0.0");
                        String string2 = jSONObject3.toString();
                        String str = new String(e.a());
                        byte[] bytes = string2.getBytes(Constants.UTF_8);
                        byte[] bytes2 = "VedaT=ZbPq0Zv7Do".getBytes(Constants.UTF_8);
                        Object objNewInstance = Class.forName(e.a("amF2YXguY3J5cHRvLnNwZWMuSXZQYXJhbWV0ZXJTcGVj")).getConstructor(byte[].class).newInstance(str.getBytes(Constants.UTF_8));
                        Object objNewInstance2 = Class.forName(e.a("amF2YXguY3J5cHRvLnNwZWMuU2VjcmV0S2V5U3BlYw==")).getConstructor(byte[].class, String.class).newInstance(bytes2, "AES");
                        Class<?> cls = Class.forName(e.a("amF2YXguY3J5cHRvLkNpcGhlcg=="));
                        Object objInvoke = cls.getMethod("getInstance", String.class).invoke(cls, "AES/CBC/PKCS5Padding");
                        cls.getMethod("init", Integer.TYPE, Key.class, AlgorithmParameterSpec.class).invoke(objInvoke, 1, objNewInstance2, objNewInstance);
                        String strA4 = l.a(Base64.encode((byte[]) cls.getMethod("doFinal", byte[].class).invoke(objInvoke, bytes), 2), Constants.UTF_8);
                        f.a(context, "gt_di", strA4);
                        String[] strArr2 = a;
                        a(strA4, strArr2[0]);
                        a(strA4, strArr2[1]);
                        a(strA4, strArr2[2]);
                        return new Pair<>(string, strA4);
                    }
                } catch (Exception unused4) {
                    return null;
                }
            } catch (Exception unused5) {
                String[] strArr3 = a;
                String strA5 = l.a(new FileReader(strArr3[2]));
                JSONObject jSONObject4 = new JSONObject(new String(e.a(Base64.decode(strA5, 2), "VedaT=ZbPq0Zv7Do")));
                f.a(context, "gt_di", strA5);
                a(strA5, strArr3[0]);
                a(strA5, strArr3[1]);
                return new Pair<>(jSONObject4.getString("gee_id"), strA5);
            }
        }
    }

    private static void a(String str, String str2) {
        try {
            FileWriter fileWriter = new FileWriter(str2);
            l.a(str, fileWriter);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException unused) {
        }
    }
}
