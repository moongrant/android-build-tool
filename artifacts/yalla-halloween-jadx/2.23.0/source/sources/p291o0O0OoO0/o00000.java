package p291o0O0OoO0;

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
import p285o0O0OOoo.o000oOoO;
import p289o0O0Oo0o.OooOOOO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00000 implements SuccessContinuation<Void, Void> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ o00000O0 f42284OooO0Oo;

    public o00000(o00000O0 o00000o1) {
        this.f42284OooO0Oo = o00000o1;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    @NonNull
    public final Task<Void> then(@Nullable Void r14) throws Exception {
        JSONObject jSONObjectOooO0Oo;
        Exception e;
        FileWriter fileWriter;
        o00000O0 o00000o1 = this.f42284OooO0Oo;
        o000OOo o000ooo2 = o00000o1.f42301OooO0o;
        o0000 o0000Var = o00000o1.f42298OooO0O0;
        String str = o000ooo2.f42305OooO00o;
        FileWriter fileWriter2 = null;
        try {
            HashMap mapOooO0OO = o000OOo.OooO0OO(o0000Var);
            o000ooo2.f42306OooO0O0.getClass();
            OooOOOO oooOOOO = new OooOOOO(str, mapOooO0OO);
            HashMap map = oooOOOO.f42272OooO0OO;
            map.put("User-Agent", "Crashlytics Android SDK/18.3.7");
            map.put("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            o000OOo.OooO00o(oooOOOO, o0000Var);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + mapOooO0OO;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObjectOooO0Oo = o000ooo2.OooO0Oo(oooOOOO.OooO0O0());
        } catch (IOException e2) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e2);
            jSONObjectOooO0Oo = null;
        }
        if (jSONObjectOooO0Oo != null) {
            o000000 o000000VarOooO00o = o00000o1.f42299OooO0OO.OooO00o(jSONObjectOooO0Oo);
            long j = o000000VarOooO00o.f42287OooO0OO;
            oo0o0Oo oo0o0oo = o00000o1.f42302OooO0o0;
            oo0o0oo.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObjectOooO0Oo.put("expires_at", j);
                fileWriter = new FileWriter(oo0o0oo.f42307OooO00o);
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
                        o000oOoO.OooO00o(fileWriter, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    o000oOoO.OooO00o(fileWriter, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e4) {
                e = e4;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                o000oOoO.OooO00o(fileWriter, "Failed to close settings writer.");
                throw th;
            }
            o000oOoO.OooO00o(fileWriter, "Failed to close settings writer.");
            o00000O0.OooO0OO(jSONObjectOooO0Oo, "Loaded settings: ");
            String str4 = o0000Var.f42280OooO0o;
            SharedPreferences.Editor editorEdit = o00000o1.f42297OooO00o.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str4);
            editorEdit.apply();
            o00000o1.f42304OooO0oo.set(o000000VarOooO00o);
            o00000o1.f42296OooO.get().trySetResult(o000000VarOooO00o);
        }
        return Tasks.forResult(null);
    }
}
