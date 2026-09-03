package com.amazonaws.util;

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class AWSRequestMetricsFullSupport extends AWSRequestMetrics {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f9572OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f9573OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Log f9569OooO0Oo = LogFactory.OooO0O0("com.amazonaws.latency");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f9571OooO0o0 = "=";

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f9570OooO0o = ", ";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AWSRequestMetricsFullSupport() {
        super(new TimingInfoFullSupport(System.nanoTime()));
        System.currentTimeMillis();
        this.f9572OooO0O0 = new HashMap();
        this.f9573OooO0OO = new HashMap();
    }

    public static void OooO0oO(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append((Object) f9571OooO0o0);
        sb.append(obj2);
        sb.append((Object) f9570OooO0o);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO00o(AWSRequestMetrics.Field field, Serializable serializable) {
        String strName = field.name();
        HashMap map = this.f9572OooO0O0;
        List arrayList = (List) map.get(strName);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(strName, arrayList);
        }
        arrayList.add(serializable);
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0O0(AWSRequestMetrics.Field field) {
        String strName = field.name();
        TimingInfo timingInfo = (TimingInfo) this.f9573OooO0OO.get(strName);
        if (timingInfo != null) {
            timingInfo.OooO0O0();
            Long l = timingInfo.f9592OooO0O0;
            this.f9568OooO00o.OooO00o(strName, new TimingInfoUnmodifiable(timingInfo.f9591OooO00o, Long.valueOf(l == null ? -1L : l.longValue())));
        } else {
            LogFactory.OooO00o(getClass()).OooO("Trying to end an event which was never started: " + strName);
        }
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0OO(AWSRequestMetrics.Field field) {
        this.f9568OooO00o.OooO0o0(field.name());
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0Oo() {
        Log log = f9569OooO0Oo;
        if (log.OooO0OO()) {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry entry : this.f9572OooO0O0.entrySet()) {
                OooO0oO(entry.getKey(), entry.getValue(), sb);
            }
            TimingInfo timingInfo = this.f9568OooO00o;
            for (Map.Entry<String, Number> entry2 : timingInfo.OooO0OO().entrySet()) {
                OooO0oO(entry2.getKey(), entry2.getValue(), sb);
            }
            for (Map.Entry<String, List<TimingInfo>> entry3 : timingInfo.OooO0Oo().entrySet()) {
                OooO0oO(entry3.getKey(), entry3.getValue(), sb);
            }
            log.OooO0oo(sb.toString());
        }
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0o(AWSRequestMetrics.Field field) {
        this.f9573OooO0OO.put(field.name(), new TimingInfoFullSupport(System.nanoTime()));
    }

    @Override // com.amazonaws.util.AWSRequestMetrics
    public final void OooO0o0(AWSRequestMetrics.Field field, long j) {
        this.f9568OooO00o.OooO0o(j, field.name());
    }
}
