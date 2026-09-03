package p290o0O0Oo0O;

import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p022Oooo00O.o00O00OO;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Charset f41598OooO0O0 = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOo00 f41599OooO00o;

    public OooOO0O(OooOo00 oooOo00) {
        this.f41599OooO00o = oooOo00;
    }

    public static HashMap OooO00o(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = null;
            if (!jSONObject.isNull(next)) {
                strOptString = jSONObject.optString(next, null);
            }
            map.put(next, strOptString);
        }
        return map;
    }

    public static void OooO0Oo(File file) {
        if (file.exists() && file.delete()) {
            Log.i("FirebaseCrashlytics", "Deleted corrupt file: " + file.getAbsolutePath(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [long] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final Map<String, String> OooO0O0(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        OooOo00 oooOo00 = this.f41599OooO00o;
        File fileOooO0O0 = z ? oooOo00.OooO0O0(str, "internal-keys") : oooOo00.OooO0O0(str, "keys");
        if (fileOooO0O0.exists()) {
            ?? length = fileOooO0O0.length();
            if (length != 0) {
                ?? r8 = 0;
                try {
                    try {
                        fileInputStream = new FileInputStream(fileOooO0O0);
                        try {
                            HashMap mapOooO00o = OooO00o(p289o0O0Oo0.OooOO0O.OooOO0o(fileInputStream));
                            p289o0O0Oo0.OooOO0O.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return mapOooO00o;
                        } catch (Exception e2) {
                            e = e2;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            OooO0Oo(fileOooO0O0);
                            p289o0O0Oo0.OooOO0O.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        r8 = length;
                        p289o0O0Oo0.OooOO0O.OooO00o(r8, "Failed to close user metadata file.");
                        throw th;
                    }
                } catch (Exception e3) {
                    fileInputStream = null;
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    p289o0O0Oo0.OooOO0O.OooO00o(r8, "Failed to close user metadata file.");
                    throw th;
                }
            }
        }
        OooO0Oo(fileOooO0O0);
        return Collections.emptyMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.Closeable] */
    @Nullable
    public final String OooO0OO(String str) {
        FileInputStream fileInputStream;
        File fileOooO0O0 = this.f41599OooO00o.OooO0O0(str, "user-data");
        ?? r4 = 0;
        if (fileOooO0O0.exists()) {
            ?? r3 = (fileOooO0O0.length() > 0L ? 1 : (fileOooO0O0.length() == 0L ? 0 : -1));
            try {
                if (r3 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileOooO0O0);
                        try {
                            JSONObject jSONObject = new JSONObject(p289o0O0Oo0.OooOO0O.OooOO0o(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            p289o0O0Oo0.OooOO0O.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            OooO0Oo(fileOooO0O0);
                            p289o0O0Oo0.OooOO0O.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        p289o0O0Oo0.OooOO0O.OooO00o(r4, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r4 = r3;
            }
        }
        String strOooO00o = o00O00OO.OooO00o("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooO00o, null);
        }
        OooO0Oo(fileOooO0O0);
        return null;
    }
}
