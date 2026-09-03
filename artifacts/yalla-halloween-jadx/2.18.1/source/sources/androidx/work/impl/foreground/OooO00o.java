package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o00.OooO0OO;
import o00.OooO0o;
import o00O000.OooO0O0;
import p102o000oo.OooOOO;
import p102o000oo.o0OoOo0;
import p107o000ooO0.OooOOOO;
import p107o000ooO0.o00oO0o;
import p109o000ooo.o00000OO;
import p109o000ooo.o0000Ooo;
import p326o0O0ooO.oo00o;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements o00000OO, OooOOOO {

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public static final String f9824OoooOOO = o0OoOo0.OooO0o0("SystemFgDispatcher");

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Object f9825Oooo = new Object();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Context f9826Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o00oO0o f9827Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final o00O000.OooO00o f9828Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final Set<o00O0000.o0OoOo0> f9829OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final Map<String, OooOOO> f9830OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f9831OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final Map<String, o00O0000.o0OoOo0> f9832OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public final o0000Ooo f9833OoooOO0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public InterfaceC0071OooO00o f9834o000oOoO;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0071OooO00o {
    }

    public OooO00o(@NonNull Context context) {
        this.f9826Oooo0o = context;
        o00oO0o o00oo0oOooO0O0 = o00oO0o.OooO0O0(context);
        this.f9827Oooo0oO = o00oo0oOooO0O0;
        o00O000.OooO00o oooO00o = o00oo0oOooO0O0.f29977OooO0Oo;
        this.f9828Oooo0oo = oooO00o;
        this.f9831OoooO00 = null;
        this.f9830OoooO0 = new LinkedHashMap();
        this.f9829OoooO = new HashSet();
        this.f9832OoooO0O = new HashMap();
        this.f9833OoooOO0 = new o0000Ooo(this.f9826Oooo0o, oooO00o, this);
        this.f9827Oooo0oO.f29978OooO0o.OooO00o(this);
    }

    @NonNull
    public static Intent OooO00o(@NonNull Context context, @NonNull String str, @NonNull OooOOO oooOOO) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", oooOOO.f29801OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oooOOO.f29802OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", oooOOO.f29803OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent OooO0OO(@NonNull Context context, @NonNull String str, @NonNull OooOOO oooOOO) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", oooOOO.f29801OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oooOOO.f29802OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", oooOOO.f29803OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0O0(@NonNull List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            o0OoOo0.OooO0OO().OooO00o(f9824OoooOOO, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            o00oO0o o00oo0o2 = this.f9827Oooo0oO;
            ((OooO0O0) o00oo0o2.f29977OooO0Oo).OooO00o(new oo00o(o00oo0o2, str, true));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, o00O0000.o0OoOo0>] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000oo.OooOOO>] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.HashSet, java.util.Set<o00O0000.o0OoOo0>] */
    @Override // p107o000ooO0.OooOOOO
    @MainThread
    public final void OooO0Oo(@NonNull String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f9825Oooo) {
            o00O0000.o0OoOo0 o0oooo1 = (o00O0000.o0OoOo0) this.f9832OoooO0O.remove(str);
            if (o0oooo1 != null ? this.f9829OoooO.remove(o0oooo1) : false) {
                this.f9833OoooOO0.OooO0O0(this.f9829OoooO);
            }
        }
        OooOOO oooOOORemove = this.f9830OoooO0.remove(str);
        if (str.equals(this.f9831OoooO00) && this.f9830OoooO0.size() > 0) {
            Iterator it = this.f9830OoooO0.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f9831OoooO00 = (String) entry.getKey();
            if (this.f9834o000oOoO != null) {
                OooOOO oooOOO = (OooOOO) entry.getValue();
                ((SystemForegroundService) this.f9834o000oOoO).OooO0O0(oooOOO.f29801OooO00o, oooOOO.f29802OooO0O0, oooOOO.f29803OooO0OO);
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f9834o000oOoO;
                systemForegroundService.f9837Oooo0o.post(new OooO0o(systemForegroundService, oooOOO.f29801OooO00o));
            }
        }
        InterfaceC0071OooO00o interfaceC0071OooO00o = this.f9834o000oOoO;
        if (oooOOORemove == null || interfaceC0071OooO00o == null) {
            return;
        }
        o0OoOo0.OooO0OO().OooO00o(f9824OoooOOO, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(oooOOORemove.f29801OooO00o), str, Integer.valueOf(oooOOORemove.f29802OooO0O0)), new Throwable[0]);
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) interfaceC0071OooO00o;
        systemForegroundService2.f9837Oooo0o.post(new OooO0o(systemForegroundService2, oooOOORemove.f29801OooO00o));
    }

    @Override // p109o000ooo.o00000OO
    public final void OooO0o(@NonNull List<String> list) {
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000oo.OooOOO>] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, o000oo.OooOOO>] */
    @MainThread
    public final void OooO0o0(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o0OoOo0.OooO0OO().OooO00o(f9824OoooOOO, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f9834o000oOoO == null) {
            return;
        }
        this.f9830OoooO0.put(stringExtra, new OooOOO(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f9831OoooO00)) {
            this.f9831OoooO00 = stringExtra;
            ((SystemForegroundService) this.f9834o000oOoO).OooO0O0(intExtra, intExtra2, notification);
            return;
        }
        SystemForegroundService systemForegroundService = (SystemForegroundService) this.f9834o000oOoO;
        systemForegroundService.f9837Oooo0o.post(new OooO0OO(systemForegroundService, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f9830OoooO0.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((OooOOO) ((Map.Entry) it.next()).getValue()).f29802OooO0O0;
        }
        OooOOO oooOOO = (OooOOO) this.f9830OoooO0.get(this.f9831OoooO00);
        if (oooOOO != null) {
            ((SystemForegroundService) this.f9834o000oOoO).OooO0O0(oooOOO.f29801OooO00o, i, oooOOO.f29803OooO0OO);
        }
    }

    @MainThread
    public final void OooO0oO() {
        this.f9834o000oOoO = null;
        synchronized (this.f9825Oooo) {
            this.f9833OoooOO0.OooO0OO();
        }
        this.f9827Oooo0oO.f29978OooO0o.OooO0o0(this);
    }
}
