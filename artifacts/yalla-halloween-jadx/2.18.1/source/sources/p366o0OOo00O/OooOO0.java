package p366o0OOo00O;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p335o0OO00oo.OooOOO;
import p361o0OOOoOo.Oooo0;
import p365o0OOOooo.o000O0Oo;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOO0 implements SuccessContinuation<Void, Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ OooOO0O f38634OooO00o;

    public OooOO0(OooOO0O oooOO0O) {
        this.f38634OooO00o = oooOO0O;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Void r9) throws Exception {
        JSONObject jSONObjectOooO0Oo;
        Exception e;
        FileWriter fileWriter;
        OooOO0O oooOO0O = this.f38634OooO00o;
        OooO0o oooO0o = oooOO0O.f38640OooO0o;
        OooOo00 oooOo00 = oooOO0O.f38637OooO0O0;
        Objects.requireNonNull(oooO0o);
        FileWriter fileWriter2 = null;
        try {
            Map<String, String> mapOooO0OO = oooO0o.OooO0OO(oooOo00);
            OooOOO oooOOO = oooO0o.f38633OooO0O0;
            String str = oooO0o.f38632OooO00o;
            Objects.requireNonNull(oooOOO);
            o000O0Oo o000o0oo2 = new o000O0Oo(str, mapOooO0OO);
            o000o0oo2.OooO0OO("User-Agent", "Crashlytics Android SDK/18.2.13");
            o000o0oo2.OooO0OO("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            oooO0o.OooO00o(o000o0oo2, oooOo00);
            String str2 = "Requesting settings from " + oooO0o.f38632OooO00o;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapOooO0OO;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectOooO0Oo = oooO0o.OooO0Oo(o000o0oo2.OooO0O0());
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
            jSONObjectOooO0Oo = null;
        }
        if (jSONObjectOooO0Oo != null) {
            OooO oooOOooO00o = this.f38634OooO00o.f38638OooO0OO.OooO00o(jSONObjectOooO0Oo);
            OooO0O0 oooO0O0 = this.f38634OooO00o.f38641OooO0o0;
            long j = oooOOooO00o.f38624OooO0OO;
            Objects.requireNonNull(oooO0O0);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectOooO0Oo.put("expires_at", j);
                fileWriter = new FileWriter(oooO0O0.f38631OooO00o);
                try {
                    fileWriter.write(jSONObjectOooO0Oo.toString());
                    fileWriter.flush();
                } catch (Exception e3) {
                    e = e3;
                    try {
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                    } catch (Throwable th) {
                        th = th;
                        fileWriter2 = fileWriter;
                        fileWriter = fileWriter2;
                        Oooo0.OooO00o(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    Oooo0.OooO00o(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                Oooo0.OooO00o(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            Oooo0.OooO00o(fileWriter, "Failed to close settings writer.");
            this.f38634OooO00o.OooO0OO(jSONObjectOooO0Oo, "Loaded settings: ");
            OooOO0O oooOO0O2 = this.f38634OooO00o;
            String str4 = oooOO0O2.f38637OooO0O0.f38650OooO0o;
            SharedPreferences.Editor editorEdit = Oooo0.OooO0oO(oooOO0O2.f38636OooO00o).edit();
            editorEdit.putString("existing_instance_identifier", str4);
            editorEdit.apply();
            this.f38634OooO00o.f38643OooO0oo.set(oooOOooO00o);
            this.f38634OooO00o.f38635OooO.get().trySetResult(oooOOooO00o);
        }
        return Tasks.forResult(null);
    }
}
