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
import o0O0OO0O.OooO00o;
import p282o0O0O0oo.OooOOOO;
import p298o0O0o00o.OooO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseABTesting {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO0OO<OooO00o> f19787OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f19788OooO0O0 = OriginService.REMOTE_CONFIG;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Integer f19789OooO0OO = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(OooO0OO oooO0OO) {
        this.f19787OooO00o = oooO0OO;
    }

    public static boolean OooO00o(ArrayList arrayList, OooOOOO oooOOOO) {
        String str = oooOOOO.f41969OooO00o;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OooOOOO oooOOOO2 = (OooOOOO) it.next();
            if (oooOOOO2.f41969OooO00o.equals(str) && oooOOOO2.f41970OooO0O0.equals(oooOOOO.f41970OooO0O0)) {
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    public final List<OooO00o.OooO0O0> OooO0O0() {
        return this.f19787OooO00o.get().OooO0Oo(this.f19788OooO0O0);
    }

    @WorkerThread
    public final void OooO0OO(ArrayList arrayList) throws AbtException {
        String str;
        OooO0Oo();
        ArrayList<OooOOOO> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                boolean zIsEmpty = arrayList2.isEmpty();
                OooO0OO<OooO00o> oooO0OO = this.f19787OooO00o;
                if (zIsEmpty) {
                    OooO0Oo();
                    Iterator<OooO00o.OooO0O0> it2 = OooO0O0().iterator();
                    while (it2.hasNext()) {
                        oooO0OO.get().OooO0O0(it2.next().f41991OooO0O0);
                    }
                    return;
                }
                OooO0Oo();
                List<OooO00o.OooO0O0> listOooO0O0 = OooO0O0();
                ArrayList arrayList3 = new ArrayList();
                for (Iterator<OooO00o.OooO0O0> it3 = listOooO0O0.iterator(); it3.hasNext(); it3 = it3) {
                    OooO00o.OooO0O0 next = it3.next();
                    String[] strArr = OooOOOO.f41967OooO0oO;
                    String str2 = next.f41993OooO0Oo;
                    arrayList3.add(new OooOOOO(next.f41991OooO0O0, String.valueOf(next.f41992OooO0OO), str2 != null ? str2 : "", new Date(next.f42002OooOOO0), next.f41995OooO0o0, next.f41998OooOO0));
                    oooO0OO = oooO0OO;
                }
                OooO0OO<OooO00o> oooO0OO2 = oooO0OO;
                ArrayList arrayList4 = new ArrayList();
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it4.hasNext();
                    str = this.f19788OooO0O0;
                    if (!zHasNext) {
                        break;
                    }
                    OooOOOO oooOOOO = (OooOOOO) it4.next();
                    if (!OooO00o(arrayList2, oooOOOO)) {
                        arrayList4.add(oooOOOO.OooO00o(str));
                    }
                }
                Iterator it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    oooO0OO2.get().OooO0O0(((OooO00o.OooO0O0) it5.next()).f41991OooO0O0);
                }
                ArrayList<OooOOOO> arrayList5 = new ArrayList();
                for (OooOOOO oooOOOO2 : arrayList2) {
                    if (!OooO00o(arrayList3, oooOOOO2)) {
                        arrayList5.add(oooOOOO2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(OooO0O0());
                if (this.f19789OooO0OO == null) {
                    this.f19789OooO0OO = Integer.valueOf(oooO0OO2.get().OooO0o(str));
                }
                int iIntValue = this.f19789OooO0OO.intValue();
                for (OooOOOO oooOOOO3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        oooO0OO2.get().OooO0O0(((OooO00o.OooO0O0) arrayDeque.pollFirst()).f41991OooO0O0);
                    }
                    OooO00o.OooO0O0 oooO0O0OooO00o = oooOOOO3.OooO00o(str);
                    oooO0OO2.get().OooO0OO(oooO0O0OooO00o);
                    arrayDeque.offer(oooO0O0OooO00o);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = OooOOOO.f41967OooO0oO;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = OooOOOO.f41967OooO0oO;
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
                arrayList2.add(new OooOOOO((String) map.get(RemoteConfigConstants$ExperimentDescriptionFieldKey.EXPERIMENT_ID), (String) map.get(RemoteConfigConstants$ExperimentDescriptionFieldKey.VARIANT_ID), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", OooOOOO.f41968OooO0oo.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new AbtException("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new AbtException("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }

    public final void OooO0Oo() throws AbtException {
        if (this.f19787OooO00o.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
