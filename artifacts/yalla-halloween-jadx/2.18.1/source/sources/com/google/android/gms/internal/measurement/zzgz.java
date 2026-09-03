package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import p334o0OO00o.o00O00;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgz {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static HashMap f15932OooO0O0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Object f15937OooO0oO;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final AtomicBoolean f15931OooO00o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final HashMap f15933OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final HashMap f15934OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final HashMap f15936OooO0o0 = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final HashMap f15935OooO0o = new HashMap();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String[] f15938OooO0oo = new String[0];

    public static String zza(ContentResolver contentResolver, String str, String str2) {
        synchronized (zzgz.class) {
            String str3 = null;
            if (f15932OooO0O0 == null) {
                f15931OooO00o.set(false);
                f15932OooO0O0 = new HashMap();
                f15937OooO0oO = new Object();
                contentResolver.registerContentObserver(zza, true, new o00O00());
            } else if (f15931OooO00o.getAndSet(false)) {
                f15932OooO0O0.clear();
                f15933OooO0OO.clear();
                f15934OooO0Oo.clear();
                f15936OooO0o0.clear();
                f15935OooO0o.clear();
                f15937OooO0oO = new Object();
            }
            Object obj = f15937OooO0oO;
            if (f15932OooO0O0.containsKey(str)) {
                String str4 = (String) f15932OooO0O0.get(str);
                if (str4 != null) {
                    str3 = str4;
                }
                return str3;
            }
            int length = f15938OooO0oo.length;
            Cursor cursorQuery = contentResolver.query(zza, null, null, new String[]{str}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                if (!cursorQuery.moveToFirst()) {
                    synchronized (zzgz.class) {
                        if (obj == f15937OooO0oO) {
                            f15932OooO0O0.put(str, null);
                        }
                    }
                    cursorQuery.close();
                    return null;
                }
                String string = cursorQuery.getString(1);
                if (string != null && string.equals(null)) {
                    string = null;
                }
                synchronized (zzgz.class) {
                    if (obj == f15937OooO0oO) {
                        f15932OooO0O0.put(str, string);
                    }
                }
                str3 = string != null ? string : null;
                cursorQuery.close();
                return str3;
            } catch (Throwable th) {
                cursorQuery.close();
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }
}
