package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class TimingInfoFullSupport extends TimingInfo {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<String, List<TimingInfo>> f11189OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<String, Number> f11190OooO0Oo;

    public TimingInfoFullSupport(Long l, long j) {
        super(j, null);
        this.f11189OooO0OO = new HashMap();
        this.f11190OooO0Oo = new HashMap();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amazonaws.util.TimingInfo
    public final void OooO00o(String str, TimingInfo timingInfo) {
        List<TimingInfo> arrayList = this.f11189OooO0OO.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f11189OooO0OO.put(str, arrayList);
        }
        if (timingInfo.f11188OooO0O0 != null) {
            arrayList.add(timingInfo);
            return;
        }
        LogFactory.OooO00o(getClass()).OooO00o("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.TimingInfo
    public final Map<String, Number> OooO0OO() {
        return this.f11190OooO0Oo;
    }

    @Override // com.amazonaws.util.TimingInfo
    public final Map<String, List<TimingInfo>> OooO0Oo() {
        return this.f11189OooO0OO;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amazonaws.util.TimingInfo
    public final void OooO0o(String str, long j) {
        this.f11190OooO0Oo.put(str, Long.valueOf(j));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // com.amazonaws.util.TimingInfo
    public final void OooO0o0(String str) {
        Number number = this.f11190OooO0Oo.get(str);
        this.f11190OooO0Oo.put(str, Long.valueOf((number != null ? number.intValue() : 0) + 1));
    }
}
