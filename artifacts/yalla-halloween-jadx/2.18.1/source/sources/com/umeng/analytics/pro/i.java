package com.umeng.analytics.pro;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    public static final int a = 2049;
    public static final int b = 2050;
    private static final int c = 1000;
    private static Context d = null;
    private static String e = null;
    private static final String f = "umeng+";
    private static final String g = "ek__id";
    private static final String h = "ek_key";
    private List<String> i;
    private List<Integer> j;
    private String k;
    private List<String> l;

    public enum a {
        AUTOPAGE,
        PAGE,
        BEGIN,
        END,
        NEWSESSION,
        INSTANTSESSIONBEGIN
    }

    public static class b {
        private static final i a = new i();

        private b() {
        }
    }

    public static i a(Context context) {
        i iVar = b.a;
        if (d == null && context != null) {
            d = context.getApplicationContext();
            iVar.k();
        }
        return iVar;
    }

    private void k() {
        synchronized (this) {
            l();
            this.i.clear();
            this.l.clear();
            this.j.clear();
        }
    }

    private void l() {
        try {
            if (TextUtils.isEmpty(e)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(d, g);
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(d).getString(g, null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = UMUtils.genId();
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(d, g, multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String strSubstring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < strSubstring.length(); i++) {
                        char cCharAt = strSubstring.charAt(i);
                        if (!Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        } else if (Integer.parseInt(Character.toString(cCharAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(cCharAt)));
                        }
                    }
                    e = sb.toString();
                }
                if (TextUtils.isEmpty(e)) {
                    return;
                }
                e += new StringBuilder(e).reverse().toString();
                String multiProcessSP2 = UMUtils.getMultiProcessSP(d, h);
                if (TextUtils.isEmpty(multiProcessSP2)) {
                    UMUtils.setMultiProcessSP(d, h, c(f));
                } else {
                    if (f.equals(d(multiProcessSP2))) {
                        return;
                    }
                    b(true, false);
                    a(true, false);
                    h();
                    i();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void b() {
        this.l.clear();
    }

    public boolean c() {
        return this.l.isEmpty();
    }

    public void d() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    String strC = u.a().c();
                    if (TextUtils.isEmpty(strC)) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                        g.a(d).b();
                        return;
                    }
                    String[] strArr = {"", "-1"};
                    for (int i = 0; i < 2; i++) {
                        sQLiteDatabaseA.execSQL("update __et set __i=\"" + strC + "\" where __i=\"" + strArr[i] + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused2) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused3) {
                h.a(d);
            } catch (Throwable unused4) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused5) {
        }
    }

    public boolean e() {
        return this.i.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0085 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r2 r5
      0x0085: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0083, B:34:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0083, B:34:0x009f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject f() {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.l.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = g.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(e.c.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.l.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    h.a(d);
                                    return jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    g.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                g.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        } catch (Throwable unused10) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0085 A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r2 r5
      0x0085: PHI (r2v5 android.database.sqlite.SQLiteDatabase) = (r2v4 android.database.sqlite.SQLiteDatabase), (r2v6 android.database.sqlite.SQLiteDatabase) binds: [B:27:0x0083, B:34:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r5v3 org.json.JSONObject) = (r5v2 org.json.JSONObject), (r5v5 org.json.JSONObject) binds: [B:27:0x0083, B:34:0x009f] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    public JSONObject g() {
        SQLiteDatabase sQLiteDatabaseA;
        JSONObject jSONObject;
        Cursor cursor = null;
        jSONObject = null;
        jSONObject = null;
        jSONObject = null;
        JSONObject jSONObject2 = null;
        cursor = null;
        cursor = null;
        Cursor cursor2 = null;
        if (this.i.isEmpty()) {
            return null;
        }
        try {
            sQLiteDatabaseA = g.a(d).a();
            try {
                sQLiteDatabaseA.beginTransaction();
                Cursor cursorA = a(e.d.a, sQLiteDatabaseA, null, "__ii=? ", new String[]{this.i.get(0)}, null, null, null, null);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToNext()) {
                            jSONObject = new JSONObject();
                            try {
                                String string = cursorA.getString(cursorA.getColumnIndex("__av"));
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__vc"));
                                jSONObject.put("__av", string);
                                jSONObject.put("__vc", string2);
                                jSONObject2 = jSONObject;
                            } catch (SQLiteDatabaseCorruptException unused) {
                                cursor2 = cursorA;
                                try {
                                    h.a(d);
                                    return jSONObject;
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        try {
                                            sQLiteDatabaseA.endTransaction();
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                    g.a(d).b();
                                }
                            } catch (Throwable unused3) {
                                cursor = cursorA;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                return jSONObject;
                            }
                        }
                    } catch (SQLiteDatabaseCorruptException unused4) {
                        jSONObject = jSONObject2;
                    } catch (Throwable unused5) {
                        jSONObject = jSONObject2;
                    }
                }
                sQLiteDatabaseA.setTransactionSuccessful();
                if (cursorA != null) {
                    cursorA.close();
                }
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused6) {
                }
                g.a(d).b();
                return jSONObject2;
            } catch (SQLiteDatabaseCorruptException unused7) {
                jSONObject = null;
            } catch (Throwable unused8) {
                jSONObject = null;
            }
        } catch (SQLiteDatabaseCorruptException unused9) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        } catch (Throwable unused10) {
            sQLiteDatabaseA = null;
            jSONObject = null;
        }
    }

    public void h() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (this.j.size() > 0) {
                        for (int i = 0; i < this.j.size(); i++) {
                            sQLiteDatabaseA.execSQL("delete from __et where rowid=" + this.j.get(i));
                        }
                    }
                    this.j.clear();
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void i() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    public void j() {
        SQLiteDatabase sQLiteDatabaseA;
        if (!TextUtils.isEmpty(this.k)) {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + this.k + "\"");
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (SQLiteDatabaseCorruptException unused) {
                    try {
                        h.a(d);
                        if (sQLiteDatabaseA != null) {
                        }
                        g.a(d).b();
                        this.k = null;
                    } catch (Throwable th) {
                        if (sQLiteDatabaseA != null) {
                            try {
                                sQLiteDatabaseA.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                        throw th;
                    }
                } catch (Throwable unused3) {
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                    this.k = null;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseA = null;
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused6) {
            }
            g.a(d).b();
        }
        this.k = null;
    }

    private i() {
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = null;
        this.l = new ArrayList();
    }

    private void b(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.get("__e")).longValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("__ii", str);
            contentValues.put("__e", String.valueOf(jLongValue));
            contentValues.put("__sp", strC2);
            contentValues.put("__pp", strC);
            contentValues.put("__av", UMGlobalContext.getInstance(d).getAppVersion());
            contentValues.put("__vc", UMUtils.getAppVersionCode(d));
            sQLiteDatabase.insert(e.c.a, null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011a  */
    /* JADX WARN: Code duplicated, block: B:47:? A[RETURN, SYNTHETIC] */
    private void c(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        Cursor cursor;
        JSONObject jSONObject2;
        String str2;
        Cursor cursor2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(e.d.a.e);
            if (jSONObjectOptJSONObject != null) {
                jSONObject2 = jSONObjectOptJSONObject;
                Cursor cursorA = a(e.d.a, sQLiteDatabase, new String[]{e.d.a.e}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    String strD = null;
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(e.d.a.e)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                    String str3 = strD;
                    cursor2 = cursorA;
                    str2 = str3;
                } else {
                    cursor2 = cursorA;
                    str2 = null;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
                str2 = null;
                cursor2 = null;
            }
            if (jSONObject2 != null) {
                try {
                    JSONArray jSONArray = new JSONArray();
                    if (!TextUtils.isEmpty(str2)) {
                        jSONArray = new JSONArray(str2);
                    }
                    jSONArray.put(jSONObject2);
                    String strC = c(jSONArray.toString());
                    if (!TextUtils.isEmpty(strC)) {
                        sQLiteDatabase.execSQL("update  __sd set __d=\"" + strC + "\" where __ii=\"" + str + "\"");
                    }
                } catch (Throwable unused2) {
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(e.d.a.d);
            if (jSONObjectOptJSONObject2 != null) {
                String strC2 = c(jSONObjectOptJSONObject2.toString());
                if (!TextUtils.isEmpty(strC2)) {
                    sQLiteDatabase.execSQL("update  __sd set __c=\"" + strC2 + "\" where __ii=\"" + str + "\"");
                }
            }
            sQLiteDatabase.execSQL("update  __sd set __f=\"" + String.valueOf(jSONObject.optLong(e.d.a.g)) + "\" where __ii=\"" + str + "\"");
            if (cursor2 != null) {
                cursor2.close();
            }
        } catch (Throwable unused3) {
            cursor = null;
        }
    }

    private Cursor a(String str, SQLiteDatabase sQLiteDatabase, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        if (sQLiteDatabase == null) {
            return null;
        }
        try {
            if (sQLiteDatabase.isOpen()) {
                return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public void a() {
        this.i.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0098, code lost:
    
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009a, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (r2 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(JSONArray jSONArray) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                JSONObject jSONObject = jSONArray.getJSONObject(i);
                                ContentValues contentValues = new ContentValues();
                                String strOptString = jSONObject.optString("__i");
                                if (TextUtils.isEmpty(strOptString) || "-1".equals(strOptString)) {
                                    strOptString = u.a().b();
                                    if (TextUtils.isEmpty(strOptString)) {
                                        strOptString = "-1";
                                    }
                                }
                                contentValues.put("__i", strOptString);
                                contentValues.put("__e", jSONObject.optString("id"));
                                contentValues.put("__t", Integer.valueOf(jSONObject.optInt("__t")));
                                contentValues.put("__av", UMUtils.getAppVersionName(d));
                                contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                                jSONObject.remove("__i");
                                jSONObject.remove("__t");
                                contentValues.put("__s", c(jSONObject.toString()));
                                sQLiteDatabaseA.insert(e.b.a, null, contentValues);
                            } catch (Exception unused) {
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        sQLiteDatabaseA.endTransaction();
                    } catch (SQLiteDatabaseCorruptException unused2) {
                        sQLiteDatabase = sQLiteDatabaseA;
                        try {
                            h.a(d);
                        } finally {
                            if (sQLiteDatabase != null) {
                                try {
                                    sQLiteDatabase.endTransaction();
                                } catch (Throwable unused3) {
                                }
                            }
                            g.a(d).b();
                        }
                    }
                } catch (Throwable unused4) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused5) {
            }
        } catch (SQLiteDatabaseCorruptException unused6) {
        } catch (Throwable unused7) {
        }
    }

    public JSONObject b(boolean z) {
        JSONObject jSONObject = new JSONObject();
        b(jSONObject, z);
        return jSONObject;
    }

    public String d(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), e.getBytes()));
        } catch (Exception unused) {
            if (Build.VERSION.SDK_INT >= 29 && !TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str);
                    UMRTLog.e(UMRTLog.RTLOG_TAG, "--->>> UMStoreManager decrypt failed, return origin data.");
                    return str;
                } catch (Throwable unused2) {
                    return null;
                }
            }
            return null;
        }
    }

    private void b(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        Cursor cursor = null;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        cursorA = a(e.a.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                    } else {
                        cursorA = a(e.a.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    }
                    cursor = cursorA;
                    if (cursor != null) {
                        JSONArray jSONArray = new JSONArray();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(cursor.getColumnIndex("__a"));
                            if (!TextUtils.isEmpty(string)) {
                                jSONArray.put(new JSONObject(d(string)));
                            }
                        }
                        if (jSONArray.length() > 0) {
                            jSONObject.put("error", jSONArray);
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                } catch (Throwable unused2) {
                    h.a(d);
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused3) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused4) {
            sQLiteDatabaseA = null;
        } catch (Throwable unused5) {
            sQLiteDatabaseA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused6) {
        }
        g.a(d).b();
    }

    public String c(String str) {
        try {
            return TextUtils.isEmpty(e) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), e.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        if (r0 != null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0058, code lost:
    
        r0.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006a, code lost:
    
        if (r0 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, String str2, int i) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("__i", str);
                    String strC = c(str2);
                    if (!TextUtils.isEmpty(strC)) {
                        contentValues.put("__a", strC);
                        contentValues.put("__t", Integer.valueOf(i));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert(e.a.a, null, contentValues);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        h.a(d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    private JSONArray b(JSONArray jSONArray) {
        JSONArray jSONArray2 = new JSONArray();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optLong("duration") > 0) {
                jSONArray2.put(jSONObjectOptJSONObject);
            }
        }
        return jSONArray2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00e6 A[EXC_TOP_SPLITTER, PHI: r1 r13
      0x00e6: PHI (r1v4 android.database.sqlite.SQLiteDatabase) = (r1v3 android.database.sqlite.SQLiteDatabase), (r1v6 android.database.sqlite.SQLiteDatabase) binds: [B:37:0x00d5, B:43:0x00e4] A[DONT_GENERATE, DONT_INLINE]
      0x00e6: PHI (r13v5 ??) = (r13v4 ??), (r13v7 ??) binds: [B:37:0x00d5, B:43:0x00e4] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    private String b(JSONObject jSONObject, boolean z) {
        ?? r13;
        SQLiteDatabase sQLiteDatabaseA;
        ?? r0 = 0;
        String string = null;
        r0 = 0;
        r0 = 0;
        r0 = 0;
        cursor = null;
        cursor = null;
        Cursor cursor = null;
        Cursor cursor2 = null;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    Cursor cursorA = a(e.c.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray = new JSONArray();
                            while (cursorA.moveToNext()) {
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                this.l.add(string);
                                String string3 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                String string4 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                if (!TextUtils.isEmpty(string3)) {
                                    jSONObject2.put(d.au, new JSONObject(d(string3)));
                                }
                                if (!TextUtils.isEmpty(string4)) {
                                    jSONObject2.put(d.av, new JSONObject(d(string4)));
                                }
                                if (!TextUtils.isEmpty(string2)) {
                                    jSONObject2.put("id", string);
                                    jSONObject2.put(d.p, string2);
                                    if (jSONObject2.length() > 0) {
                                        jSONArray.put(jSONObject2);
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            }
                            r0 = string;
                            if (jSONArray.length() > 0) {
                                jSONObject.put(d.n, jSONArray);
                                r0 = string;
                            }
                        } catch (SQLiteDatabaseCorruptException unused) {
                            r13 = r0;
                            cursor = cursorA;
                            h.a(d);
                            if (cursor != null) {
                                cursor.close();
                            }
                            if (sQLiteDatabaseA != null) {
                                try {
                                    sQLiteDatabaseA.endTransaction();
                                } catch (Throwable unused2) {
                                }
                            }
                            g.a(d).b();
                            r0 = r13;
                        } catch (Throwable unused3) {
                            r13 = r0;
                            cursor2 = cursorA;
                            h.a(d);
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                            g.a(d).b();
                            r0 = r13;
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused4) {
                    }
                    g.a(d).b();
                } catch (SQLiteDatabaseCorruptException unused5) {
                    r13 = 0;
                } catch (Throwable unused6) {
                    r13 = 0;
                }
            } catch (Throwable th) {
                if (r0 != 0) {
                    r0.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused7) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused8) {
            r13 = 0;
            sQLiteDatabaseA = null;
        } catch (Throwable unused9) {
            r13 = 0;
            sQLiteDatabaseA = null;
        }
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r2 != null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
    
        r2.endTransaction();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0099, code lost:
    
        if (r2 != null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(String str, JSONObject jSONObject, a aVar) {
        if (jSONObject == null) {
            return false;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    if (aVar == a.BEGIN) {
                        long jLongValue = ((Long) jSONObject.opt("__e")).longValue();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("__ii", str);
                        contentValues.put("__e", String.valueOf(jLongValue));
                        contentValues.put("__av", UMUtils.getAppVersionName(d));
                        contentValues.put("__vc", UMUtils.getAppVersionCode(d));
                        sQLiteDatabaseA.insert(e.d.a, null, contentValues);
                    } else if (aVar == a.INSTANTSESSIONBEGIN) {
                        b(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == a.END) {
                        a(str, jSONObject, sQLiteDatabaseA);
                    } else if (aVar == a.PAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, "__a");
                    } else if (aVar == a.AUTOPAGE) {
                        a(str, jSONObject, sQLiteDatabaseA, e.d.a.c);
                    } else if (aVar == a.NEWSESSION) {
                        c(str, jSONObject, sQLiteDatabaseA);
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    sQLiteDatabaseA.endTransaction();
                } catch (SQLiteDatabaseCorruptException unused) {
                    sQLiteDatabase = sQLiteDatabaseA;
                    try {
                        h.a(d);
                    } finally {
                        if (sQLiteDatabase != null) {
                            try {
                                sQLiteDatabase.endTransaction();
                            } catch (Throwable unused2) {
                            }
                        }
                        g.a(d).b();
                    }
                } catch (Throwable unused3) {
                    sQLiteDatabase = sQLiteDatabaseA;
                }
            } catch (Throwable unused4) {
            }
        } catch (SQLiteDatabaseCorruptException unused5) {
        } catch (Throwable unused6) {
        }
        return false;
    }

    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase) {
        try {
            long jLongValue = ((Long) jSONObject.opt(e.d.a.g)).longValue();
            long jLongValue2 = 0;
            Object objOpt = jSONObject.opt(e.d.a.h);
            if (objOpt != null && (objOpt instanceof Long)) {
                jLongValue2 = ((Long) objOpt).longValue();
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("__sp");
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("__pp");
            String strC = "";
            String strC2 = (jSONObjectOptJSONObject == null || jSONObjectOptJSONObject.length() <= 0) ? "" : c(jSONObjectOptJSONObject.toString());
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                strC = c(jSONObjectOptJSONObject2.toString());
            }
            sQLiteDatabase.execSQL("update __sd set __f=\"" + jLongValue + "\", " + e.d.a.h + "=\"" + jLongValue2 + "\", __sp=\"" + strC2 + "\", __pp=\"" + strC + "\" where __ii=\"" + str + "\"");
        } catch (Throwable unused) {
        }
    }

    public void b(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (z2) {
                        if (z) {
                            sQLiteDatabaseA.execSQL("delete from __sd");
                        }
                    } else if (this.i.size() > 0) {
                        for (int i = 0; i < this.i.size(); i++) {
                            sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + this.i.get(i) + "\"");
                        }
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #1 {Exception -> 0x004b, blocks: (B:15:0x0043, B:17:0x0048), top: B:32:0x0043 }] */
    public long a(String str) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA = null;
        long j = 0;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(e.d.a, sQLiteDatabaseA, new String[]{e.d.a.g}, "__ii=? ", new String[]{str}, null, null, null, null);
                    if (cursorA != null) {
                        cursorA.moveToFirst();
                        j = cursorA.getLong(cursorA.getColumnIndex(e.d.a.g));
                    }
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (Exception unused) {
                    if (cursorA != null) {
                        cursorA.close();
                    }
                    if (sQLiteDatabaseA != null) {
                    }
                    g.a(d).b();
                    return j;
                } catch (Throwable th) {
                    th = th;
                    if (cursorA != null) {
                        try {
                            cursorA.close();
                            if (sQLiteDatabaseA != null) {
                                sQLiteDatabaseA.endTransaction();
                            }
                        } catch (Exception unused2) {
                            g.a(d).b();
                            throw th;
                        }
                    } else if (sQLiteDatabaseA != null) {
                        sQLiteDatabaseA.endTransaction();
                    }
                    g.a(d).b();
                    throw th;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
            sQLiteDatabaseA = null;
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabaseA = null;
        }
        sQLiteDatabaseA.endTransaction();
        g.a(d).b();
        return j;
    }

    public void b(String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005c A[Catch: all -> 0x0069, LOOP:1: B:56:0x0056->B:24:0x005c, LOOP_END, TryCatch #2 {all -> 0x0069, blocks: (B:22:0x0056, B:24:0x005c, B:26:0x006c, B:28:0x0077, B:29:0x007c, B:36:0x008b, B:38:0x0091, B:40:0x0097, B:42:0x009d, B:44:0x00ab, B:41:0x009a), top: B:56:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[Catch: all -> 0x0069, TryCatch #2 {all -> 0x0069, blocks: (B:22:0x0056, B:24:0x005c, B:26:0x006c, B:28:0x0077, B:29:0x007c, B:36:0x008b, B:38:0x0091, B:40:0x0097, B:42:0x009d, B:44:0x00ab, B:41:0x009a), top: B:56:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x008a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0097 A[Catch: all -> 0x0069, TRY_ENTER, TryCatch #2 {all -> 0x0069, blocks: (B:22:0x0056, B:24:0x005c, B:26:0x006c, B:28:0x0077, B:29:0x007c, B:36:0x008b, B:38:0x0091, B:40:0x0097, B:42:0x009d, B:44:0x00ab, B:41:0x009a), top: B:56:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ab A[Catch: all -> 0x0069, TRY_LEAVE, TryCatch #2 {all -> 0x0069, blocks: (B:22:0x0056, B:24:0x005c, B:26:0x006c, B:28:0x0077, B:29:0x007c, B:36:0x008b, B:38:0x0091, B:40:0x0097, B:42:0x009d, B:44:0x00ab, B:41:0x009a), top: B:56:0x0056 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0056 A[EXC_TOP_SPLITTER, LOOP:1: B:56:0x0056->B:24:0x005c, LOOP_START, PHI: r14
      0x0056: PHI (r14v2 java.lang.String) = (r14v7 java.lang.String), (r14v3 java.lang.String) binds: [B:21:0x0054, B:24:0x005c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:44:0x00ab, please report this as an issue */
    private void a(String str, JSONObject jSONObject, SQLiteDatabase sQLiteDatabase, String str2) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArrayOptJSONArray;
        Cursor cursorA;
        JSONArray jSONArray2;
        int i;
        String strC;
        JSONObject jSONObject2;
        Cursor cursor = null;
        strD = null;
        String strD = null;
        try {
            if ("__a".equals(str2)) {
                jSONArrayOptJSONArray = jSONObject.optJSONArray("__a");
                if (jSONArrayOptJSONArray == null) {
                    return;
                }
                if (jSONArrayOptJSONArray.length() <= 0) {
                    return;
                }
            } else {
                if (e.d.a.c.equals(str2)) {
                    jSONArrayOptJSONArray = jSONObject.optJSONArray(e.d.a.c);
                    if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                        return;
                    }
                } else {
                    jSONArray = null;
                }
                cursorA = a(e.d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
                if (cursorA != null) {
                    while (cursorA.moveToNext()) {
                        try {
                            strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                        } catch (Throwable unused) {
                            cursor = cursorA;
                            if (cursor != null) {
                                cursor.close();
                                return;
                            }
                            return;
                        }
                    }
                }
                jSONArray2 = new JSONArray();
                if (!TextUtils.isEmpty(strD)) {
                    jSONArray2 = new JSONArray(strD);
                }
                if (jSONArray2.length() > 1000) {
                    if (cursorA != null) {
                        cursorA.close();
                        return;
                    }
                    return;
                }
                for (i = 0; i < jSONArray.length(); i++) {
                    try {
                        jSONObject2 = jSONArray.getJSONObject(i);
                        if (jSONObject2 != null) {
                            jSONArray2.put(jSONObject2);
                        }
                    } catch (JSONException unused2) {
                    }
                }
                strC = c(jSONArray2.toString());
                if (!TextUtils.isEmpty(strC)) {
                    sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
                }
                if (cursorA != null) {
                    cursorA.close();
                }
            }
            jSONArray = jSONArrayOptJSONArray;
            cursorA = a(e.d.a, sQLiteDatabase, new String[]{str2}, "__ii=? ", new String[]{str}, null, null, null, null);
            if (cursorA != null) {
                while (cursorA.moveToNext()) {
                    strD = d(cursorA.getString(cursorA.getColumnIndex(str2)));
                }
            }
            jSONArray2 = new JSONArray();
            if (!TextUtils.isEmpty(strD)) {
                jSONArray2 = new JSONArray(strD);
            }
            if (jSONArray2.length() > 1000) {
                if (cursorA != null) {
                    cursorA.close();
                    return;
                }
                return;
            }
            while (i < jSONArray.length()) {
                jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2 != null) {
                    jSONArray2.put(jSONObject2);
                }
            }
            strC = c(jSONArray2.toString());
            if (!TextUtils.isEmpty(strC)) {
                sQLiteDatabase.execSQL("update __sd set " + str2 + "=\"" + strC + "\" where __ii=\"" + str + "\"");
            }
            if (cursorA != null) {
                cursorA.close();
            }
        } catch (Throwable unused3) {
        }
    }

    public JSONObject a(boolean z) {
        a();
        this.j.clear();
        JSONObject jSONObject = new JSONObject();
        if (!z) {
            a(jSONObject, z);
            b(jSONObject, (String) null);
            a(jSONObject, (String) null);
        } else {
            String strA = a(jSONObject, z);
            if (!TextUtils.isEmpty(strA)) {
                b(jSONObject, strA);
                a(jSONObject, strA);
            }
        }
        return jSONObject;
    }

    private void a(JSONObject jSONObject, String str) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Cursor cursor = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    try {
                        sQLiteDatabaseA.beginTransaction();
                        if (!TextUtils.isEmpty(str)) {
                            cursorA = a(e.b.a, sQLiteDatabaseA, null, "__i=? ", new String[]{str}, null, null, null, null);
                        } else {
                            cursorA = a(e.b.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                        }
                        cursor = cursorA;
                        if (cursor != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            JSONObject jSONObject3 = new JSONObject();
                            String strB = u.a().b();
                            while (cursor.moveToNext()) {
                                int i = cursor.getInt(cursor.getColumnIndex("__t"));
                                String string = cursor.getString(cursor.getColumnIndex("__i"));
                                String string2 = cursor.getString(cursor.getColumnIndex("__s"));
                                if (TextUtils.isEmpty(string) || "-1".equals(string)) {
                                    if (!TextUtils.isEmpty(strB)) {
                                        string = strB;
                                    }
                                }
                                this.j.add(Integer.valueOf(cursor.getInt(0)));
                                if (i != 2049) {
                                    if (i == 2050 && !TextUtils.isEmpty(string2)) {
                                        JSONObject jSONObject4 = new JSONObject(d(string2));
                                        if (jSONObject3.has(string)) {
                                            jSONArray = jSONObject3.optJSONArray(string);
                                        } else {
                                            jSONArray = new JSONArray();
                                        }
                                        jSONArray.put(jSONObject4);
                                        jSONObject3.put(string, jSONArray);
                                    }
                                } else if (!TextUtils.isEmpty(string2)) {
                                    JSONObject jSONObject5 = new JSONObject(d(string2));
                                    if (jSONObject2.has(string)) {
                                        jSONArray2 = jSONObject2.optJSONArray(string);
                                    } else {
                                        jSONArray2 = new JSONArray();
                                    }
                                    jSONArray2.put(jSONObject5);
                                    jSONObject2.put(string, jSONArray2);
                                }
                            }
                            if (jSONObject2.length() > 0) {
                                JSONArray jSONArray3 = new JSONArray();
                                Iterator<String> itKeys = jSONObject2.keys();
                                while (itKeys.hasNext()) {
                                    JSONObject jSONObject6 = new JSONObject();
                                    String next = itKeys.next();
                                    jSONObject6.put(next, new JSONArray(jSONObject2.optString(next)));
                                    if (jSONObject6.length() > 0) {
                                        jSONArray3.put(jSONObject6);
                                    }
                                }
                                if (jSONArray3.length() > 0) {
                                    jSONObject.put("ekv", jSONArray3);
                                }
                            }
                            if (jSONObject3.length() > 0) {
                                JSONArray jSONArray4 = new JSONArray();
                                Iterator<String> itKeys2 = jSONObject3.keys();
                                while (itKeys2.hasNext()) {
                                    JSONObject jSONObject7 = new JSONObject();
                                    String next2 = itKeys2.next();
                                    jSONObject7.put(next2, new JSONArray(jSONObject3.optString(next2)));
                                    if (jSONObject7.length() > 0) {
                                        jSONArray4.put(jSONObject7);
                                    }
                                }
                                if (jSONArray4.length() > 0) {
                                    jSONObject.put(d.T, jSONArray4);
                                }
                            }
                        }
                        sQLiteDatabaseA.setTransactionSuccessful();
                        if (cursor != null) {
                            cursor.close();
                        }
                    } catch (SQLiteDatabaseCorruptException unused) {
                        h.a(d);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabaseA != null) {
                        }
                        g.a(d).b();
                    } catch (Throwable unused2) {
                        h.a(d);
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (sQLiteDatabaseA != null) {
                        }
                        g.a(d).b();
                    }
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused3) {
                        }
                    }
                    g.a(d).b();
                    throw th;
                }
            } catch (SQLiteDatabaseCorruptException unused4) {
                sQLiteDatabaseA = null;
            } catch (Throwable unused5) {
                sQLiteDatabaseA = null;
            }
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused6) {
        }
        g.a(d).b();
    }

    /* JADX WARN: Code duplicated, block: B:120:0x022f A[EXC_TOP_SPLITTER, PHI: r0 r12 r14
      0x022f: PHI (r0v6 java.lang.String) = (r0v2 java.lang.String), (r0v3 java.lang.String), (r0v38 java.lang.String), (r0v38 java.lang.String) binds: [B:90:0x021e, B:96:0x022d, B:82:0x0208, B:83:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r12v6 android.database.sqlite.SQLiteDatabase) = 
      (r12v3 android.database.sqlite.SQLiteDatabase)
      (r12v4 android.database.sqlite.SQLiteDatabase)
      (r12v7 android.database.sqlite.SQLiteDatabase)
      (r12v7 android.database.sqlite.SQLiteDatabase)
     binds: [B:90:0x021e, B:96:0x022d, B:82:0x0208, B:83:0x020a] A[DONT_GENERATE, DONT_INLINE]
      0x022f: PHI (r14v6 android.database.Cursor) = 
      (r14v3 android.database.Cursor)
      (r14v4 android.database.Cursor)
      (r14v33 android.database.Cursor)
      (r14v33 android.database.Cursor)
     binds: [B:90:0x021e, B:96:0x022d, B:82:0x0208, B:83:0x020a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x021b  */
    /* JADX WARN: Code duplicated, block: B:95:0x022a  */
    private String a(JSONObject jSONObject, boolean z) {
        SQLiteDatabase sQLiteDatabaseA;
        Cursor cursorA;
        JSONArray jSONArray;
        String str;
        String string = null;
        try {
            try {
                sQLiteDatabaseA = g.a(d).a();
                try {
                    sQLiteDatabaseA.beginTransaction();
                    cursorA = a(e.d.a, sQLiteDatabaseA, null, null, null, null, null, null, null);
                    if (cursorA != null) {
                        try {
                            JSONArray jSONArray2 = new JSONArray();
                            while (true) {
                                if (!cursorA.moveToNext()) {
                                    cursorA = cursorA;
                                    jSONArray = jSONArray2;
                                    break;
                                }
                                JSONObject jSONObject2 = new JSONObject();
                                String string2 = cursorA.getString(cursorA.getColumnIndex(e.d.a.g));
                                String string3 = cursorA.getString(cursorA.getColumnIndex("__e"));
                                String string4 = cursorA.getString(cursorA.getColumnIndex(e.d.a.h));
                                string = cursorA.getString(cursorA.getColumnIndex("__ii"));
                                try {
                                    if (TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                                        str = string;
                                        cursorA = cursorA;
                                        jSONArray = jSONArray2;
                                    } else {
                                        if (Long.parseLong(string2) - Long.parseLong(string3) > 0) {
                                            String string5 = cursorA.getString(cursorA.getColumnIndex("__a"));
                                            String string6 = cursorA.getString(cursorA.getColumnIndex(e.d.a.c));
                                            String string7 = cursorA.getString(cursorA.getColumnIndex(e.d.a.d));
                                            String string8 = cursorA.getString(cursorA.getColumnIndex(e.d.a.e));
                                            this.i.add(string);
                                            String string9 = cursorA.getString(cursorA.getColumnIndex("__sp"));
                                            String string10 = cursorA.getString(cursorA.getColumnIndex("__pp"));
                                            jSONObject2.put("id", string);
                                            jSONObject2.put(d.p, string3);
                                            jSONObject2.put(d.q, string2);
                                            str = string;
                                            if (!FieldManager.allow(com.umeng.commonsdk.utils.b.E)) {
                                                jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                            } else {
                                                try {
                                                    if (Long.parseLong(string4) <= 0) {
                                                        jSONObject2.put("duration", Long.parseLong(string2) - Long.parseLong(string3));
                                                    } else {
                                                        jSONObject2.put("duration", Long.parseLong(string4));
                                                        jSONObject2.put(d.s, Long.parseLong(string2) - Long.parseLong(string3));
                                                    }
                                                } catch (SQLiteDatabaseCorruptException unused) {
                                                    cursorA = cursorA;
                                                    string = str;
                                                    h.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    g.a(d).b();
                                                    return string;
                                                } catch (Throwable unused2) {
                                                    cursorA = cursorA;
                                                    string = str;
                                                    h.a(d);
                                                    if (cursorA != null) {
                                                        cursorA.close();
                                                    }
                                                    if (sQLiteDatabaseA != null) {
                                                        sQLiteDatabaseA.endTransaction();
                                                    }
                                                    g.a(d).b();
                                                    return string;
                                                }
                                            }
                                            try {
                                                if (!TextUtils.isEmpty(string5)) {
                                                    jSONObject2.put(d.t, new JSONArray(d(string5)));
                                                }
                                                boolean z2 = UMConfigure.AUTO_ACTIVITY_PAGE_COLLECTION == MobclickAgent.PageMode.AUTO;
                                                if (!TextUtils.isEmpty(string6) && z2) {
                                                    JSONArray jSONArray3 = new JSONArray(d(string6));
                                                    JSONArray jSONArray4 = new JSONArray();
                                                    if (jSONArray3.length() > 0) {
                                                        jSONArray4 = b(jSONArray3);
                                                    }
                                                    jSONObject2.put(d.u, jSONArray4);
                                                }
                                                if (!TextUtils.isEmpty(string7)) {
                                                    jSONObject2.put(d.F, new JSONObject(d(string7)));
                                                }
                                                if (!TextUtils.isEmpty(string8)) {
                                                    jSONObject2.put(d.B, new JSONArray(d(string8)));
                                                }
                                                if (!TextUtils.isEmpty(string9)) {
                                                    jSONObject2.put(d.au, new JSONObject(d(string9)));
                                                }
                                                if (!TextUtils.isEmpty(string10)) {
                                                    jSONObject2.put(d.av, new JSONObject(d(string10)));
                                                }
                                                if (jSONObject2.length() > 0) {
                                                    jSONArray = jSONArray2;
                                                    jSONArray.put(jSONObject2);
                                                } else {
                                                    jSONArray = jSONArray2;
                                                }
                                            } catch (SQLiteDatabaseCorruptException unused3) {
                                                string = str;
                                                h.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                g.a(d).b();
                                                return string;
                                            } catch (Throwable unused4) {
                                                string = str;
                                                h.a(d);
                                                if (cursorA != null) {
                                                    cursorA.close();
                                                }
                                                if (sQLiteDatabaseA != null) {
                                                }
                                                g.a(d).b();
                                                return string;
                                            }
                                        } else {
                                            str = string;
                                            cursorA = cursorA;
                                            jSONArray = jSONArray2;
                                        }
                                        if (z) {
                                            string = str;
                                            break;
                                        }
                                    }
                                    jSONArray2 = jSONArray;
                                    cursorA = cursorA;
                                    string = str;
                                } catch (SQLiteDatabaseCorruptException unused5) {
                                    cursorA = cursorA;
                                    h.a(d);
                                    if (cursorA != null) {
                                        cursorA.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                    g.a(d).b();
                                    return string;
                                } catch (Throwable unused6) {
                                    cursorA = cursorA;
                                    h.a(d);
                                    if (cursorA != null) {
                                        cursorA.close();
                                    }
                                    if (sQLiteDatabaseA != null) {
                                        sQLiteDatabaseA.endTransaction();
                                    }
                                    g.a(d).b();
                                    return string;
                                }
                            }
                            try {
                                if (this.i.size() < 1) {
                                    cursorA.close();
                                    try {
                                        sQLiteDatabaseA.endTransaction();
                                    } catch (Throwable unused7) {
                                    }
                                    g.a(d).b();
                                    return string;
                                }
                                if (jSONArray.length() > 0) {
                                    jSONObject.put(d.n, jSONArray);
                                }
                            } catch (SQLiteDatabaseCorruptException unused8) {
                                h.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                g.a(d).b();
                                return string;
                            } catch (Throwable unused9) {
                                h.a(d);
                                if (cursorA != null) {
                                    cursorA.close();
                                }
                                if (sQLiteDatabaseA != null) {
                                }
                                g.a(d).b();
                                return string;
                            }
                        } catch (SQLiteDatabaseCorruptException unused10) {
                        } catch (Throwable unused11) {
                        }
                    } else {
                        cursorA = cursorA;
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                    if (cursorA != null) {
                        cursorA.close();
                    }
                } catch (SQLiteDatabaseCorruptException unused12) {
                    cursorA = null;
                } catch (Throwable unused13) {
                    cursorA = null;
                }
            } catch (Throwable th) {
                if (cursorA != null) {
                    cursorA.close();
                }
                if (sQLiteDatabaseA != null) {
                    try {
                        sQLiteDatabaseA.endTransaction();
                    } catch (Throwable unused14) {
                    }
                }
                g.a(d).b();
                throw th;
            }
        } catch (SQLiteDatabaseCorruptException unused15) {
            sQLiteDatabaseA = null;
            cursorA = null;
        } catch (Throwable unused16) {
            sQLiteDatabaseA = null;
            cursorA = null;
        }
        try {
            sQLiteDatabaseA.endTransaction();
        } catch (Throwable unused17) {
        }
        g.a(d).b();
        return string;
    }

    public void a(boolean z, boolean z2) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!z2) {
                        int size = this.l.size();
                        int i = 0;
                        if (size > 0) {
                            int i2 = 0;
                            while (i < size) {
                                String str = this.l.get(i);
                                if (str == null) {
                                    i2 = 1;
                                }
                                sQLiteDatabaseA.execSQL("delete from __is where __ii=\"" + str + "\"");
                                i++;
                            }
                            i = i2;
                        }
                        if (i != 0) {
                            sQLiteDatabaseA.execSQL("delete from __is where __ii is null");
                        }
                    } else if (z) {
                        sQLiteDatabaseA.execSQL("delete from __is");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } catch (Throwable unused) {
                    h.a(d);
                    if (sQLiteDatabaseA != null) {
                    }
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
                if (sQLiteDatabaseA != null) {
                }
            }
            try {
                sQLiteDatabaseA.endTransaction();
            } catch (Throwable unused3) {
            }
        } finally {
            if (sQLiteDatabaseA != null) {
                try {
                    sQLiteDatabaseA.endTransaction();
                } catch (Throwable unused4) {
                }
            }
            g.a(d).b();
        }
    }

    public void a(boolean z, String str) {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            try {
                try {
                    sQLiteDatabaseA = g.a(d).a();
                    sQLiteDatabaseA.beginTransaction();
                    if (!TextUtils.isEmpty(str)) {
                        sQLiteDatabaseA.execSQL("delete from __er where __i=\"" + str + "\"");
                        sQLiteDatabaseA.execSQL("delete from __et where __i=\"" + str + "\"");
                        this.j.clear();
                        sQLiteDatabaseA.execSQL("delete from __sd where __ii=\"" + str + "\"");
                    }
                    sQLiteDatabaseA.setTransactionSuccessful();
                } finally {
                    if (sQLiteDatabaseA != null) {
                        try {
                            sQLiteDatabaseA.endTransaction();
                        } catch (Throwable unused) {
                        }
                    }
                    g.a(d).b();
                }
            } catch (SQLiteDatabaseCorruptException unused2) {
                h.a(d);
            } catch (Throwable unused3) {
                if (sQLiteDatabaseA != null) {
                }
            }
        } catch (Throwable unused4) {
        }
    }
}
