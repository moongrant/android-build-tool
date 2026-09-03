package p552o0oOOo;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return CrashHandler.Companion.m4158sendExceptionReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
    }
}
