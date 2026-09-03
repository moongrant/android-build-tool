package p033OoooO0O;

import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o0ooOOo implements Executor {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile o0ooOOo f1414OooO0Oo;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
