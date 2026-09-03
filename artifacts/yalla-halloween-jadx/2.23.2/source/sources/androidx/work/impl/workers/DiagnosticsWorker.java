package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.OooO0OO;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00O0OO.OooOOOO;
import o00O0OO.Oooo0;
import o00O0OO.o0Oo0oo;
import o00O0OO.oo000o;
import oo00o.o00000O0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(@NotNull Context context, @NotNull WorkerParameters parameters) {
        super(context, parameters);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
    }

    @Override // androidx.work.Worker
    @NotNull
    public final OooO0OO.OooO00o OooO0oO() {
        o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(this.f11476OooO0Oo);
        Intrinsics.checkNotNullExpressionValue(o00000o0OooO0Oo, "getInstance(applicationContext)");
        WorkDatabase workDatabase = o00000o0OooO0Oo.f60221OooO0OO;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManager.workDatabase");
        oo000o oo000oVarOooOo0 = workDatabase.OooOo0();
        Oooo0 oooo0OooOOoo = workDatabase.OooOOoo();
        o0Oo0oo o0oo0ooOooOo0O = workDatabase.OooOo0O();
        OooOOOO oooOOOOOooOOo = workDatabase.OooOOo();
        ArrayList arrayListOooO0Oo = oo000oVarOooOo0.OooO0Oo(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        ArrayList arrayListOooOOo0 = oo000oVarOooOo0.OooOOo0();
        ArrayList arrayListOooOO0O = oo000oVarOooOo0.OooOO0O();
        if (!arrayListOooO0Oo.isEmpty()) {
            p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo = p115o00O00oO.o0Oo0oo.OooO0Oo();
            String str = oo0oOO0.OooO0OO.f60362OooO00o;
            o0oo0ooOooO0Oo.OooO0o0(str, "Recently completed work:\n\n");
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str, oo0oOO0.OooO0OO.OooO00o(oooo0OooOOoo, o0oo0ooOooOo0O, oooOOOOOooOOo, arrayListOooO0Oo));
        }
        if (!arrayListOooOOo0.isEmpty()) {
            p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo2 = p115o00O00oO.o0Oo0oo.OooO0Oo();
            String str2 = oo0oOO0.OooO0OO.f60362OooO00o;
            o0oo0ooOooO0Oo2.OooO0o0(str2, "Running work:\n\n");
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str2, oo0oOO0.OooO0OO.OooO00o(oooo0OooOOoo, o0oo0ooOooOo0O, oooOOOOOooOOo, arrayListOooOOo0));
        }
        if (!arrayListOooOO0O.isEmpty()) {
            p115o00O00oO.o0Oo0oo o0oo0ooOooO0Oo3 = p115o00O00oO.o0Oo0oo.OooO0Oo();
            String str3 = oo0oOO0.OooO0OO.f60362OooO00o;
            o0oo0ooOooO0Oo3.OooO0o0(str3, "Enqueued work:\n\n");
            p115o00O00oO.o0Oo0oo.OooO0Oo().OooO0o0(str3, oo0oOO0.OooO0OO.OooO00o(oooo0OooOOoo, o0oo0ooOooOo0O, oooOOOOOooOOo, arrayListOooOO0O));
        }
        OooO0OO.OooO00o.C0186OooO0OO c0186OooO0OO = new OooO0OO.OooO00o.C0186OooO0OO();
        Intrinsics.checkNotNullExpressionValue(c0186OooO0OO, "success()");
        return c0186OooO0OO;
    }
}
