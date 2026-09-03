package com.yalla.yalla.common.fs;

import android.content.Context;
import android.os.Environment;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import p494o0o00OO0.OooOO0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static WeakReference<Context> f20597OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static List<StorageVolume> f20598OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static List<StorageVolume> f20599OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static List<String> f20600OooO0Oo;

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    static {
        String property;
        Properties properties;
        Environment.getExternalStorageDirectory().getAbsolutePath();
        f20600OooO0Oo = new ArrayList();
        f20598OooO0O0 = new ArrayList();
        f20599OooO0OO = new ArrayList();
        List<String> list = f20600OooO0Oo;
        if (list == 0 || list.size() <= 0) {
            if (OooOO0.f41174OooO0O0 == null) {
                OooOO0.f41174OooO0O0 = new OooOO0();
            }
            OooOO0 oooOO1 = OooOO0.f41174OooO0O0;
            String str = null;
            if (oooOO1.f41175OooO00o == null) {
                InputStream resourceAsStream = OooOO0.class.getResourceAsStream("/assets/sdcard.properties");
                if (resourceAsStream != null) {
                    properties = new Properties();
                    try {
                        try {
                            properties.load(resourceAsStream);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        try {
                            resourceAsStream.close();
                        } catch (IOException e2) {
                            e2.printStackTrace();
                        }
                    } catch (Throwable th) {
                        try {
                            resourceAsStream.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                        throw th;
                    }
                } else {
                    properties = null;
                }
                oooOO1.f41175OooO00o = properties;
            }
            Properties properties2 = oooOO1.f41175OooO00o;
            if (properties2 != null && (property = properties2.getProperty("possible_sdcard_names")) != null && !property.equals("")) {
                try {
                    str = new String(property.getBytes("ISO8859-1"), "UTF-8");
                } catch (UnsupportedEncodingException e4) {
                    e4.printStackTrace();
                }
            }
            if (str == null || str.equals("")) {
                return;
            }
            String[] strArrSplit = str.split(",");
            list.clear();
            list.addAll(Arrays.asList(strArrSplit));
        }
    }

    public OooO00o(Context context) {
        f20597OooO00o = new WeakReference<>(context);
    }
}
