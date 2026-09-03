package p108o000ooOO;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.background.systemalarm.OooO00o;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import p102o000oo.o0OoOo0;
import p107o000ooO0.Oooo000;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class oO00o0 implements Oooo000 {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final String f30017Oooo0oO = o0OoOo0.OooO0o0("SystemAlarmScheduler");

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Context f30018Oooo0o;

    public oO00o0(@NonNull Context context) {
        this.f30018Oooo0o = context.getApplicationContext();
    }

    @Override // p107o000ooO0.Oooo000
    public final boolean OooO00o() {
        return true;
    }

    @Override // p107o000ooO0.Oooo000
    public final void OooO0OO(@NonNull o00O0000.o0OoOo0... o0oooo0Arr) {
        for (o00O0000.o0OoOo0 o0oooo1 : o0oooo0Arr) {
            o0OoOo0.OooO0OO().OooO00o(f30017Oooo0oO, String.format("Scheduling work with workSpecId %s", o0oooo1.f30152OooO00o), new Throwable[0]);
            this.f30018Oooo0o.startService(OooO00o.OooO0OO(this.f30018Oooo0o, o0oooo1.f30152OooO00o));
        }
    }

    @Override // p107o000ooO0.Oooo000
    public final void OooO0o0(@NonNull String str) {
        Context context = this.f30018Oooo0o;
        String str2 = OooO00o.f9781Oooo;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        this.f30018Oooo0o.startService(intent);
    }
}
