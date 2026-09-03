package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f12684OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f12685OooO0Oo;

    public TimingInfoFullSupport(long j) {
        super(j, null);
        this.f12684OooO0OO = new HashMap();
        this.f12685OooO0Oo = new HashMap();
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void OooO00o(String str, TimingInfo timingInfo) {
        HashMap map = this.f12684OooO0OO;
        List arrayList = (List) map.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(str, arrayList);
        }
        if (timingInfo.f12683OooO0O0 != null) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.OooO00o(getClass()).OooO0oO("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public final Map<String, Number> OooO0OO() {
        return this.f12685OooO0Oo;
    }

    @Override // com.amazonaws.util.TimingInfo
    public final Map<String, List<TimingInfo>> OooO0Oo() {
        return this.f12684OooO0OO;
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void OooO0o(long j, String str) {
        this.f12685OooO0Oo.put(str, Long.valueOf(j));
    }

    @Override // com.amazonaws.util.TimingInfo
    public final void OooO0o0(String str) {
        Number number = (Number) this.f12685OooO0Oo.get(str);
        OooO0o((number != null ? number.intValue() : 0) + 1, str);
    }
}
