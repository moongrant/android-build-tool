package p285o0O0OOo;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO implements Continuation<Void, Object> {
    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(@NonNull Task<Void> task) throws Exception {
        if (task.isSuccessful()) {
            return null;
        }
        Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
        return null;
    }
}
