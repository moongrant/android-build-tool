package p292o0O0OoO;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import org.json.JSONObject;
import p289o0O0Oo0.OooOO0O;
import p293o0O0OoO0.OooOo00;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f41653OooO00o;

    public Oooo000(OooOo00 oooOo00) {
        this.f41653OooO00o = new File(oooOo00.f41695OooO0O0, "com.crashlytics.settings.json");
    }

    public final JSONObject OooO00o() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = this.f41653OooO00o;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(OooOO0O.OooOO0o(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        OooOO0O.OooO00o(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    OooOO0O.OooO00o(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            OooOO0O.OooO00o(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            OooOO0O.OooO00o(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
