package p671oo0oOOo;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.FirebaseABTesting;
import com.twitter.sdk.android.tweetui.Oooo000;
import org.json.JSONArray;
import org.json.JSONException;
import p313o0O0oOo.o000000;
import p313o0O0oOo.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOo00 implements Continuation, Oooo000 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f60922OooO0Oo;

    public /* synthetic */ OooOo00(Object obj) {
        this.f60922OooO0Oo = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        boolean z;
        OooOo oooOo = (OooOo) this.f60922OooO0Oo;
        oooOo.getClass();
        if (task.isSuccessful()) {
            o000000 o000000Var = oooOo.f60916OooO0OO;
            synchronized (o000000Var) {
                o000000Var.f42544OooO0OO = Tasks.forResult(null);
            }
            o000000Var.f42543OooO0O0.OooO00o();
            if (task.getResult() != null) {
                JSONArray jSONArray = ((o000000O) task.getResult()).f42550OooO0Oo;
                FirebaseABTesting firebaseABTesting = oooOo.f60914OooO00o;
                if (firebaseABTesting != null) {
                    try {
                        firebaseABTesting.OooO0OO(OooOo.OooO0Oo(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
