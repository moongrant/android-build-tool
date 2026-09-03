package p292o0O0OoO;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;
import p289o0O0Oo0.OooOO0O;
import p298o0O0Oooo.o0000O;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Oo0 implements SuccessContinuation<Void, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00Ooo f41656OooO0Oo;

    public o00Oo0(o00Ooo o00ooo2) {
        this.f41656OooO0Oo = o00ooo2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Void r14) throws Exception {
        JSONObject jSONObjectOooO0Oo;
        Exception e;
        FileWriter fileWriter;
        o00Ooo o00ooo2 = this.f41656OooO0Oo;
        o000oOoO o000oooo2 = o00ooo2.f41662OooO0o;
        o0OOO0o o0ooo0o2 = o00ooo2.f41659OooO0O0;
        String str = o000oooo2.f41654OooO00o;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapOooO0OO = o000oOoO.OooO0OO(o0ooo0o2);
            o000oooo2.f41655OooO0O0.getClass();
            o0000O o0000o2 = new o0000O(str, mapOooO0OO);
            HashMap map = o0000o2.f41713OooO0OO;
            map.put("User-Agent", "Crashlytics Android SDK/18.3.7");
            map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            o000oOoO.OooO00o(o0000o2, o0ooo0o2);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapOooO0OO;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectOooO0Oo = o000oooo2.OooO0Oo(o0000o2.OooO0O0());
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
            jSONObjectOooO0Oo = null;
        }
        if (jSONObjectOooO0Oo != null) {
            o0OoOo0 o0oooo0OooO00o = o00ooo2.f41660OooO0OO.OooO00o(jSONObjectOooO0Oo);
            long j = o0oooo0OooO00o.f41677OooO0OO;
            Oooo000 oooo000 = o00ooo2.f41663OooO0o0;
            oooo000.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectOooO0Oo.put("expires_at", j);
                fileWriter = new FileWriter(oooo000.f41653OooO00o);
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
                        OooOO0O.OooO00o(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    OooOO0O.OooO00o(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                OooOO0O.OooO00o(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            OooOO0O.OooO00o(fileWriter, "Failed to close settings writer.");
            o00Ooo.OooO0OO(jSONObjectOooO0Oo, "Loaded settings: ");
            String str4 = o0ooo0o2.f41671OooO0o;
            SharedPreferences.Editor editorEdit = o00ooo2.f41658OooO00o.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str4);
            editorEdit.apply();
            o00ooo2.f41665OooO0oo.set(o0oooo0OooO00o);
            o00ooo2.f41657OooO.get().trySetResult(o0oooo0OooO00o);
        }
        return Tasks.forResult(null);
    }
}
