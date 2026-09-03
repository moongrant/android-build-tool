package p102o000oo;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import p016OooOoO0.OooOo00;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0OO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f29814OooO00o = o0OoOo0.OooO0o0("WorkerFactory");

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final ListenableWorker OooO00o(@NonNull Context context, @NonNull String str, @NonNull WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ListenableWorker listenableWorker = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (Throwable th) {
            o0OoOo0.OooO0OO().OooO0O0(f29814OooO00o, OooOo00.OooO0Oo("Invalid class: ", str), th);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                listenableWorker = (ListenableWorker) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th2) {
                o0OoOo0.OooO0OO().OooO0O0(f29814OooO00o, OooOo00.OooO0Oo("Could not instantiate ", str), th2);
            }
        }
        if (listenableWorker == null || !listenableWorker.f9726Oooo) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
