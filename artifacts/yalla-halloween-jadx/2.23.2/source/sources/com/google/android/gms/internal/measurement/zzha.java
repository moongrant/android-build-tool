package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzha {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static HashMap f15223OooO0O0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Object f15228OooO0oO;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicBoolean f15222OooO00o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f15224OooO0OO = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f15225OooO0Oo = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final HashMap f15227OooO0o0 = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f15226OooO0o = new HashMap(16, 1.0f);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f15229OooO0oo = new String[0];

    public static void OooO00o(Object obj, String str, String str2) {
        synchronized (zzha.class) {
            if (obj == f15228OooO0oO) {
                f15223OooO0O0.put(str, str2);
            }
        }
    }

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzha.class) {
            if (f15223OooO0O0 == null) {
                f15222OooO00o.set(false);
                f15223OooO0O0 = new HashMap(16, 1.0f);
                f15228OooO0oO = new Object();
                contentResolver.registerContentObserver(zza, true, new o00O00O());
            } else if (f15222OooO00o.getAndSet(false)) {
                f15223OooO0O0.clear();
                f15224OooO0OO.clear();
                f15225OooO0Oo.clear();
                f15227OooO0o0.clear();
                f15226OooO0o.clear();
                f15228OooO0oO = new Object();
            }
            Object obj = f15228OooO0oO;
            String str3 = null;
            if (f15223OooO0O0.containsKey(str)) {
                String str4 = (String) f15223OooO0O0.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f15229OooO0oo.length;
            Cursor cursorQuery = contentResolver.query(zza, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    OooO00o(obj, str, null);
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(1);
                cursorQuery.close();
                if (string != null && string.equals(null)) {
                    string = null;
                }
                OooO00o(obj, str, string);
                if (string != null) {
                    return string;
                }
                return null;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
        }
    }
}
