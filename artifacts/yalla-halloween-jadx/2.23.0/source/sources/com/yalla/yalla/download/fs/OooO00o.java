package com.yalla.yalla.download.fs;

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
import p269o00ooooo.oO0OOO00;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static WeakReference<Context> f23379OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static List<StorageVolume> f23380OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final ArrayList f23381OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final ArrayList f23382OooO0Oo;

    static {
        String property;
        Properties properties;
        Environment.getExternalStorageDirectory().getAbsolutePath();
        ArrayList arrayList = new ArrayList();
        f23382OooO0Oo = arrayList;
        f23380OooO0O0 = new ArrayList();
        f23381OooO0OO = new ArrayList();
        if (arrayList.size() > 0) {
            return;
        }
        if (oO0OOO00.f41389OooO0O0 == null) {
            oO0OOO00.f41389OooO0O0 = new oO0OOO00();
        }
        oO0OOO00 oo0ooo00 = oO0OOO00.f41389OooO0O0;
        String str = null;
        if (((Properties) oo0ooo00.f41390OooO00o) == null) {
            InputStream resourceAsStream = oO0OOO00.class.getResourceAsStream("/assets/sdcard.properties");
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
            oo0ooo00.f41390OooO00o = properties;
        }
        Properties properties2 = (Properties) oo0ooo00.f41390OooO00o;
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
        arrayList.clear();
        arrayList.addAll(Arrays.asList(strArrSplit));
    }

    public OooO00o(Context context) {
        f23379OooO00o = new WeakReference<>(context);
    }
}
