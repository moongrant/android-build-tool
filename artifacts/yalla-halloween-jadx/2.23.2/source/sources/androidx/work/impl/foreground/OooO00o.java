package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import o00O0O0O.OooO0OO;
import o00O0O0O.OooO0o;
import o00O0OO.OooOo;
import o00O0OO.o00Ooo;
import o00O0OO.o0ooOOo;
import oo00o.OooO;
import oo00o.o00000O0;
import p022Oooo00O.OooOO0;
import p022Oooo00O.o00O00OO;
import p115o00O00oO.o00O0O;
import p115o00O00oO.o0Oo0oo;
import p119o00O0Oo0.o0OoOo0;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class OooO00o implements OooO0OO, OooO {

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final String f11555OooOOO0 = o0Oo0oo.OooO0o("SystemFgDispatcher");

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final HashMap f11556OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00000O0 f11557OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Object f11558OooO0o = new Object();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OoOo0 f11559OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOo f11560OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final LinkedHashMap f11561OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final HashSet f11562OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooO0o f11563OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public InterfaceC0188OooO00o f11564OooOO0o;

    /* JADX INFO: renamed from: androidx.work.impl.foreground.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0188OooO00o {
    }

    public OooO00o(@NonNull Context context) {
        o00000O0 o00000o0OooO0Oo = o00000O0.OooO0Oo(context);
        this.f11557OooO0Oo = o00000o0OooO0Oo;
        this.f11559OooO0o0 = o00000o0OooO0Oo.f60222OooO0Oo;
        this.f11560OooO0oO = null;
        this.f11561OooO0oo = new LinkedHashMap();
        this.f11562OooOO0 = new HashSet();
        this.f11556OooO = new HashMap();
        this.f11563OooOO0O = new OooO0o(o00000o0OooO0Oo.f60227OooOO0, this);
        o00000o0OooO0Oo.f60223OooO0o.OooO00o(this);
    }

    @NonNull
    public static Intent OooO00o(@NonNull Context context, @NonNull OooOo oooOo, @NonNull o00O0O o00o0o2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", o00o0o2.f36151OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", o00o0o2.f36152OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", o00o0o2.f36153OooO0OO);
        intent.putExtra("KEY_WORKSPEC_ID", oooOo.f36202OooO00o);
        intent.putExtra("KEY_GENERATION", oooOo.f36203OooO0O0);
        return intent;
    }

    @NonNull
    public static Intent OooO0O0(@NonNull Context context, @NonNull OooOo oooOo, @NonNull o00O0O o00o0o2) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", oooOo.f36202OooO00o);
        intent.putExtra("KEY_GENERATION", oooOo.f36203OooO0O0);
        intent.putExtra("KEY_NOTIFICATION_ID", o00o0o2.f36151OooO00o);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", o00o0o2.f36152OooO0O0);
        intent.putExtra("KEY_NOTIFICATION", o00o0o2.f36153OooO0OO);
        return intent;
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0OO(@NonNull ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o00Ooo o00ooo2 = (o00Ooo) it.next();
            String str = o00ooo2.f36216OooO00o;
            o0Oo0oo.OooO0Oo().OooO00o(f11555OooOOO0, o00O00OO.OooO00o("Constraints unmet for WorkSpec ", str));
            OooOo oooOoOooO00o = o0ooOOo.OooO00o(o00ooo2);
            o00000O0 o00000o1 = this.f11557OooO0Oo;
            ((p119o00O0Oo0.o00O0O) o00000o1.f60222OooO0Oo).OooO00o(new o00O0OOO.o0ooOOo(o00000o1, new oo00o.o0ooOOo(oooOoOooO00o), true));
        }
    }

    @Override // oo00o.OooO
    @MainThread
    public final void OooO0Oo(@NonNull OooOo oooOo, boolean z) {
        Map.Entry entry;
        synchronized (this.f11558OooO0o) {
            try {
                o00Ooo o00ooo2 = (o00Ooo) this.f11556OooO.remove(oooOo);
                if (o00ooo2 != null ? this.f11562OooOO0.remove(o00ooo2) : false) {
                    this.f11563OooOO0O.OooO0Oo(this.f11562OooOO0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        o00O0O o00o0o2 = (o00O0O) this.f11561OooO0oo.remove(oooOo);
        if (oooOo.equals(this.f11560OooO0oO) && this.f11561OooO0oo.size() > 0) {
            Iterator it = this.f11561OooO0oo.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f11560OooO0oO = (OooOo) entry.getKey();
            if (this.f11564OooOO0o != null) {
                o00O0O o00o0o3 = (o00O0O) entry.getValue();
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.f11564OooOO0o;
                systemForegroundService.f11570OooO0Oo.post(new OooO0O0(systemForegroundService, o00o0o3.f36151OooO00o, o00o0o3.f36153OooO0OO, o00o0o3.f36152OooO0O0));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f11564OooOO0o;
                systemForegroundService2.f11570OooO0Oo.post(new oo0o0O0.OooO(systemForegroundService2, o00o0o3.f36151OooO00o));
            }
        }
        InterfaceC0188OooO00o interfaceC0188OooO00o = this.f11564OooOO0o;
        if (o00o0o2 == null || interfaceC0188OooO00o == null) {
            return;
        }
        o0Oo0oo.OooO0Oo().OooO00o(f11555OooOOO0, "Removing Notification (id: " + o00o0o2.f36151OooO00o + ", workSpecId: " + oooOo + ", notificationType: " + o00o0o2.f36152OooO0O0);
        SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC0188OooO00o;
        systemForegroundService3.f11570OooO0Oo.post(new oo0o0O0.OooO(systemForegroundService3, o00o0o2.f36151OooO00o));
    }

    @Override // o00O0O0O.OooO0OO
    public final void OooO0o(@NonNull List<o00Ooo> list) {
    }

    @MainThread
    public final void OooO0o0(@NonNull Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        OooOo oooOo = new OooOo(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        o0Oo0oo.OooO0Oo().OooO00o(f11555OooOOO0, OooOO0.OooO00o(oo0o0O0.OooO0O0.OooO00o("Notifying with (id:", intExtra, ", workSpecId: ", stringExtra, ", notificationType :"), intExtra2, ")"));
        if (notification == null || this.f11564OooOO0o == null) {
            return;
        }
        o00O0O o00o0o2 = new o00O0O(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.f11561OooO0oo;
        linkedHashMap.put(oooOo, o00o0o2);
        if (this.f11560OooO0oO == null) {
            this.f11560OooO0oO = oooOo;
            SystemForegroundService systemForegroundService = (SystemForegroundService) this.f11564OooOO0o;
            systemForegroundService.f11570OooO0Oo.post(new OooO0O0(systemForegroundService, intExtra, notification, intExtra2));
            return;
        }
        SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.f11564OooOO0o;
        systemForegroundService2.f11570OooO0Oo.post(new oo0o0O0.OooO0o(systemForegroundService2, intExtra, notification));
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((o00O0O) ((Map.Entry) it.next()).getValue()).f36152OooO0O0;
        }
        o00O0O o00o0o3 = (o00O0O) linkedHashMap.get(this.f11560OooO0oO);
        if (o00o0o3 != null) {
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.f11564OooOO0o;
            systemForegroundService3.f11570OooO0Oo.post(new OooO0O0(systemForegroundService3, o00o0o3.f36151OooO00o, o00o0o3.f36153OooO0OO, i));
        }
    }
}
