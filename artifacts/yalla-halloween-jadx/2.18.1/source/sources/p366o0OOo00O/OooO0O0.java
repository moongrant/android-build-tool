package p366o0OOo00O;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import o0OOo000.OooOO0;
import org.json.JSONObject;
import p361o0OOOoOo.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final File f38631OooO00o;

    public OooO0O0(OooOO0 oooOO1) {
        this.f38631OooO00o = oooOO1.OooO0O0("com.crashlytics.settings.json");
    }

    public final JSONObject OooO00o() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = this.f38631OooO00o;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(Oooo0.OooOOO0(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        Oooo0.OooO00o(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    Oooo0.OooO00o(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            Oooo0.OooO00o(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            Oooo0.OooO00o(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }
}
