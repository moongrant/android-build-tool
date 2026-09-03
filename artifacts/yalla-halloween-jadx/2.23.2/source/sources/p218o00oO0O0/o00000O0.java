package p218o00oO0O0;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00000O0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ANRHandler.m4156sendANRReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
