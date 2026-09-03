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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p084o000Ooo0.OooOOO0;
import p084o000Ooo0.o000oOoO;
import p085o000OooO.OooOOOO;
import p085o000OooO.o0OOO0o;
import p089o000o00O.o00O00o0;
import p089o000o00O.oo00o;
import p091o000o0O.o0Oo0oo;
import p092o000o0O0.o0000;
import p092o000o0O0.o0000O00;
import p092o000o0O0.o0000oo;
import p093o000o0OO.o000OOo;
import p096o000o0o0.o0000O0;
import p096o000o0o0.o0000O0O;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements o00O00o0, OooOOOO {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f8468OooOOO0 = o000oOoO.OooO0o0("SystemFgDispatcher");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f8469OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o f8470OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f8471OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000O0 f8472OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public String f8473OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LinkedHashMap f8474OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f8475OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final oo00o f8476OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public InterfaceC0169OooO00o f8477OooOO0o;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0169OooO00o {
    }

    public OooO00o(@NonNull Context context) {
        o0OOO0o o0ooo0oOooO0OO = o0OOO0o.OooO0OO(context);
        this.f8470OooO0Oo = o0ooo0oOooO0OO;
        o0000O0 o0000o1 = o0ooo0oOooO0OO.f35161OooO0Oo;
        this.f8472OooO0o0 = o0000o1;
        this.f8473OooO0oO = null;
        this.f8474OooO0oo = new LinkedHashMap();
        this.f8475OooOO0 = new HashSet();
        this.f8469OooO = new HashMap();
        this.f8476OooOO0O = new oo00o(context, o0000o1, this);
        o0ooo0oOooO0OO.f35162OooO0o.OooO00o(this);
    }

    @NonNull
    public static Intent OooO00o(@NonNull Context context, @NonNull String str, @NonNull OooOOO0 oooOOO0) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", oooOOO0.f35102OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oooOOO0.f35103OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", oooOOO0.f35104OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @NonNull
    public static Intent OooO0OO(@NonNull Context context, @NonNull String str, @NonNull OooOOO0 oooOOO0) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", oooOOO0.f35102OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", oooOOO0.f35103OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", oooOOO0.f35104OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0O0(@NonNull ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            o000oOoO.OooO0OO().OooO00o(f8468OooOOO0, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            o0OOO0o o0ooo0o2 = this.f8470OooO0Oo;
            ((o0000O0O) o0ooo0o2.f35161OooO0Oo).OooO00o(new o000OOo(o0ooo0o2, str, true));
        }
    }

    @MainThread
    public final void OooO0Oo(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o000oOoO.OooO0OO().OooO00o(f8468OooOOO0, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f8477OooOO0o == null) {
            return;
        }
        OooOOO0 oooOOO0 = new OooOOO0(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f8474OooO0oo;
        linkedHashMap.put(stringExtra, oooOOO0);
        if (TextUtils.isEmpty(this.f8473OooO0oO)) {
            this.f8473OooO0oO = stringExtra;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f8477OooOO0o;
            systemForegroundService.f8479OooO0Oo.post(new o0000(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f8477OooOO0o;
        systemForegroundService2.f8479OooO0Oo.post(new o0000O00(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((OooOOO0) ((Map.Entry) it.next()).getValue()).f35103OooO0O0;
        }
        OooOOO0 oooOOO1 = (OooOOO0) linkedHashMap.get(this.f8473OooO0oO);
        if (oooOOO1 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f8477OooOO0o;
            systemForegroundService3.f8479OooO0Oo.post(new o0000(systemForegroundService3, oooOOO1.f35102OooO00o, oooOOO1.f35104OooO0OO, i));
        }
    }

    @Override // p089o000o00O.o00O00o0
    public final void OooO0o(@NonNull List<String> list) {
    }

    @Override // p085o000OooO.OooOOOO
    @MainThread
    public final void OooO0o0(@NonNull String str, boolean z) {
        Map.Entry entry;
        synchronized (this.f8471OooO0o) {
            try {
                o0Oo0oo o0oo0oo2 = (o0Oo0oo) this.f8469OooO.remove(str);
                if (o0oo0oo2 != null ? this.f8475OooOO0.remove(o0oo0oo2) : false) {
                    this.f8476OooOO0O.OooO0OO(this.f8475OooOO0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        OooOOO0 oooOOO0 = (OooOOO0) this.f8474OooO0oo.remove(str);
        if (str.equals(this.f8473OooO0oO) && this.f8474OooO0oo.size() > 0) {
            Iterator it = this.f8474OooO0oo.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f8473OooO0oO = (String) entry.getKey();
            if (this.f8477OooOO0o != null) {
                OooOOO0 oooOOO1 = (OooOOO0) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f8477OooOO0o;
                systemForegroundService.f8479OooO0Oo.post(new o0000(systemForegroundService, oooOOO1.f35102OooO00o, oooOOO1.f35104OooO0OO, oooOOO1.f35103OooO0O0));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f8477OooOO0o;
                systemForegroundService2.f8479OooO0Oo.post(new o0000oo(systemForegroundService2, oooOOO1.f35102OooO00o));
            }
        }
        InterfaceC0169OooO00o interfaceC0169OooO00o = this.f8477OooOO0o;
        if (oooOOO0 == null || interfaceC0169OooO00o == null) {
            return;
        }
        o000oOoO.OooO0OO().OooO00o(f8468OooOOO0, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(oooOOO0.f35102OooO00o), str, Integer.valueOf(oooOOO0.f35103OooO0O0)), new Throwable[0]);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0169OooO00o;
        systemForegroundService3.f8479OooO0Oo.post(new o0000oo(systemForegroundService3, oooOOO0.f35102OooO00o));
    }
}
