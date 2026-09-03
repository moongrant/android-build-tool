package p363o0OOOoo0;

import OooO00o.OooO00o;
import android.util.Log;
import androidx.annotation.Nullable;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import o0OOo000.OooOO0;
import org.json.JSONException;
import org.json.JSONObject;
import p361o0OOOoOo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f38563OooO00o;

    static {
        Charset.forName("UTF-8");
    }

    public OooOo00(OooOO0 oooOO1) {
        this.f38563OooO00o = oooOO1;
    }

    public static Map<String, String> OooO00o(String str) throws JSONException {
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
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Deleted corrupt file: ");
            sbOooO0o0.append(file.getAbsolutePath());
            Log.i("FirebaseCrashlytics", sbOooO0o0.toString(), null);
        }
    }

    public final Map<String, String> OooO0O0(String str, boolean z) throws Throwable {
        FileInputStream fileInputStream;
        Exception e;
        File fileOooO0oO = z ? this.f38563OooO00o.OooO0oO(str, "internal-keys") : this.f38563OooO00o.OooO0oO(str, "keys");
        if (!fileOooO0oO.exists() || fileOooO0oO.length() == 0) {
            OooO0Oo(fileOooO0oO);
            return Collections.emptyMap();
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(fileOooO0oO);
            try {
                try {
                    Map<String, String> mapOooO00o = OooO00o(Oooo0.OooOOO0(fileInputStream));
                    Oooo0.OooO00o(fileInputStream, "Failed to close user metadata file.");
                    return mapOooO00o;
                } catch (Exception e2) {
                    e = e2;
                    Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                    OooO0Oo(fileOooO0oO);
                    Oooo0.OooO00o(fileInputStream, "Failed to close user metadata file.");
                    return Collections.emptyMap();
                }
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                Oooo0.OooO00o(fileInputStream2, "Failed to close user metadata file.");
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            Oooo0.OooO00o(fileInputStream2, "Failed to close user metadata file.");
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.Closeable] */
    @Nullable
    public final String OooO0OO(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileOooO0oO = this.f38563OooO00o.OooO0oO(str, "user-data");
        ?? r5 = 0;
        if (fileOooO0oO.exists()) {
            ?? r2 = (fileOooO0oO.length() > 0L ? 1 : (fileOooO0oO.length() == 0L ? 0 : -1));
            try {
                if (r2 != 0) {
                    try {
                        fileInputStream = new FileInputStream(fileOooO0oO);
                        try {
                            JSONObject jSONObject = new JSONObject(Oooo0.OooOOO0(fileInputStream));
                            String strOptString = !jSONObject.isNull("userId") ? jSONObject.optString("userId", null) : null;
                            String str2 = "Loaded userId " + strOptString + " for session " + str;
                            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                Log.d("FirebaseCrashlytics", str2, null);
                            }
                            Oooo0.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return strOptString;
                        } catch (Exception e) {
                            e = e;
                            Log.w("FirebaseCrashlytics", "Error deserializing user metadata.", e);
                            OooO0Oo(fileOooO0oO);
                            Oooo0.OooO00o(fileInputStream, "Failed to close user metadata file.");
                            return null;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        Oooo0.OooO00o(r5, "Failed to close user metadata file.");
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r5 = r2;
            }
        }
        String strOooO0Oo = p016OooOoO0.OooOo00.OooO0Oo("No userId set for session ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", strOooO0Oo, null);
        }
        OooO0Oo(fileOooO0oO);
        return null;
    }
}
