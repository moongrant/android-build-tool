package com.google.firebase.abt;

import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.firebase.remoteconfig.RemoteConfigConstants$ExperimentDescriptionFieldKey;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import o0O0OOO0.OooO00o;
import p301o0O0o0O.OooO0o;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseABTesting {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0o<OooO00o> f19313OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19314OooO0O0 = OriginService.REMOTE_CONFIG;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f19315OooO0OO = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(OooO0o oooO0o) {
        this.f19313OooO00o = oooO0o;
    }

    public static boolean OooO00o(ArrayList arrayList, o0O0OO0.OooO00o oooO00o) {
        String str = oooO00o.f41335OooO00o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o0O0OO0.OooO00o oooO00o2 = (o0O0OO0.OooO00o) it.next();
            if (oooO00o2.f41335OooO00o.equals(str) && oooO00o2.f41336OooO0O0.equals(oooO00o.f41336OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    public final List<OooO00o.OooO0O0> OooO0O0() {
        return this.f19313OooO00o.get().OooO0Oo(this.f19314OooO0O0);
    }

    @WorkerThread
    public final void OooO0OO(ArrayList arrayList) throws AbtException {
        String str;
        OooO0Oo();
        ArrayList<o0O0OO0.OooO00o> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList2.isEmpty();
                OooO0o<OooO00o> oooO0o = this.f19313OooO00o;
                if (zIsEmpty) {
                    OooO0Oo();
                    Iterator<OooO00o.OooO0O0> it2 = OooO0O0().iterator();
                    while (it2.hasNext()) {
                        oooO0o.get().OooO0OO(it2.next().f41358OooO0O0);
                    }
                    return;
                }
                OooO0Oo();
                List<OooO00o.OooO0O0> listOooO0O0 = OooO0O0();
                ArrayList arrayList3 = new ArrayList();
                for (Iterator<OooO00o.OooO0O0> it3 = listOooO0O0.iterator(); it3.hasNext(); it3 = it3) {
                    OooO00o.OooO0O0 next = it3.next();
                    String[] strArr = o0O0OO0.OooO00o.f41333OooO0oO;
                    String str2 = next.f41360OooO0Oo;
                    arrayList3.add(new o0O0OO0.OooO00o(next.f41358OooO0O0, String.valueOf(next.f41359OooO0OO), str2 != null ? str2 : "", new Date(next.f41369OooOOO0), next.f41362OooO0o0, next.f41365OooOO0));
                    oooO0o = oooO0o;
                }
                OooO0o<OooO00o> oooO0o2 = oooO0o;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    str = this.f19314OooO0O0;
                    if (!zHasNext) {
                        break;
                    }
                    o0O0OO0.OooO00o oooO00o = (o0O0OO0.OooO00o) it4.next();
                    if (!OooO00o(arrayList2, oooO00o)) {
                        arrayList4.add(oooO00o.OooO00o(str));
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    oooO0o2.get().OooO0OO(((OooO00o.OooO0O0) it5.next()).f41358OooO0O0);
                }
                ArrayList<o0O0OO0.OooO00o> arrayList5 = new ArrayList();
                for (o0O0OO0.OooO00o oooO00o2 : arrayList2) {
                    if (!OooO00o(arrayList3, oooO00o2)) {
                        arrayList5.add(oooO00o2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(OooO0O0());
                if (this.f19315OooO0OO == null) {
                    this.f19315OooO0OO = Integer.valueOf(oooO0o2.get().OooO0o(str));
                }
                int iIntValue = this.f19315OooO0OO.intValue();
                for (o0O0OO0.OooO00o oooO00o3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        oooO0o2.get().OooO0OO(((OooO00o.OooO0O0) arrayDeque.pollFirst()).f41358OooO0O0);
                    }
                    OooO00o.OooO0O0 oooO0O0OooO00o = oooO00o3.OooO00o(str);
                    oooO0o2.get().OooO0O0(oooO0O0OooO00o);
                    arrayDeque.offer(oooO0O0OooO00o);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = o0O0OO0.OooO00o.f41333OooO0oO;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = o0O0OO0.OooO00o.f41333OooO0oO;
            for (int i = 0; i < 5; i++) {
                String str3 = strArr3[i];
                if (!map.containsKey(str3)) {
                    arrayList6.add(str3);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new AbtException(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new o0O0OO0.OooO00o((String) map.get(RemoteConfigConstants$ExperimentDescriptionFieldKey.EXPERIMENT_ID), (String) map.get(RemoteConfigConstants$ExperimentDescriptionFieldKey.VARIANT_ID), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", o0O0OO0.OooO00o.f41334OooO0oo.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }

    public final void OooO0Oo() throws AbtException {
        if (this.f19313OooO00o.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
