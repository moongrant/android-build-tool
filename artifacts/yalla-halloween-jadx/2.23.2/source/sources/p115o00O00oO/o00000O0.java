package p115o00O00oO;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.OooO0OO;
import androidx.work.WorkerParameters;
import p023Oooo00o.oO00OOOo;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o00000O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f36149OooO00o = o0Oo0oo.OooO0o("WorkerFactory");

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final OooO0OO OooO00o(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f36149OooO00o;
        OooO0OO oooO0OO = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(OooO0OO.class);
        } catch (Throwable th) {
            o0Oo0oo.OooO0Oo().OooO0OO(str2, "Invalid class: " + str, th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                oooO0OO = (OooO0OO) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o0Oo0oo.OooO0Oo().OooO0OO(str2, "Could not instantiate " + str, th2);
            }
        }
        if (oooO0OO == null || !oooO0OO.f11479OooO0oO) {
            return oooO0OO;
        }
        throw new IllegalStateException(oO00OOOo.OooO00o("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
