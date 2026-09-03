package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00OOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f3745OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final LinkedHashMap f3746OooO0O0 = new LinkedHashMap();

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NonNull
        public final SessionConfig f3747OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NonNull
        public final o00Oo00<?> f3748OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public boolean f3749OooO0OO = false;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f3750OooO0Oo = false;

        public OooO00o(@NonNull SessionConfig sessionConfig, @NonNull o00Oo00<?> o00oo00) {
            this.f3747OooO00o = sessionConfig;
            this.f3748OooO0O0 = o00oo00;
        }
    }

    public o00OOOO0(@NonNull String str) {
        this.f3745OooO00o = str;
    }

    @NonNull
    public final SessionConfig.OooOO0 OooO00o() {
        SessionConfig.OooOO0 oooOO1 = new SessionConfig.OooOO0();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3746OooO0O0.entrySet()) {
            OooO00o oooO00o = (OooO00o) entry.getValue();
            if (oooO00o.f3749OooO0OO) {
                oooOO1.OooO00o(oooO00o.f3747OooO00o);
                arrayList.add((String) entry.getKey());
            }
        }
        p028Oooo0oO.o00O0O0.OooO00o("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f3745OooO00o);
        return oooOO1;
    }

    @NonNull
    public final Collection<SessionConfig> OooO0O0() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3746OooO0O0.entrySet()) {
            if (((OooO00o) entry.getValue()).f3749OooO0OO) {
                arrayList.add(((OooO00o) entry.getValue()).f3747OooO00o);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @NonNull
    public final Collection<o00Oo00<?>> OooO0OO() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.f3746OooO0O0.entrySet()) {
            if (((OooO00o) entry.getValue()).f3749OooO0OO) {
                arrayList.add(((OooO00o) entry.getValue()).f3748OooO0O0);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean OooO0Oo(@NonNull String str) {
        LinkedHashMap linkedHashMap = this.f3746OooO0O0;
        if (linkedHashMap.containsKey(str)) {
            return ((OooO00o) linkedHashMap.get(str)).f3749OooO0OO;
        }
        return false;
    }

    public final void OooO0o(@NonNull String str, @NonNull SessionConfig sessionConfig, @NonNull o00Oo00<?> o00oo00) {
        LinkedHashMap linkedHashMap = this.f3746OooO0O0;
        if (linkedHashMap.containsKey(str)) {
            OooO00o oooO00o = new OooO00o(sessionConfig, o00oo00);
            OooO00o oooO00o2 = (OooO00o) linkedHashMap.get(str);
            oooO00o.f3749OooO0OO = oooO00o2.f3749OooO0OO;
            oooO00o.f3750OooO0Oo = oooO00o2.f3750OooO0Oo;
            linkedHashMap.put(str, oooO00o);
        }
    }

    public final void OooO0o0(@NonNull String str) {
        LinkedHashMap linkedHashMap = this.f3746OooO0O0;
        if (linkedHashMap.containsKey(str)) {
            OooO00o oooO00o = (OooO00o) linkedHashMap.get(str);
            oooO00o.f3750OooO0Oo = false;
            if (oooO00o.f3749OooO0OO) {
                return;
            }
            linkedHashMap.remove(str);
        }
    }
}
