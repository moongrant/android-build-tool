package p172o00OooOo;

import com.facebook.internal.instrument.InstrumentUtility;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000OOo0 implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return InstrumentUtility.m4151listExceptionAnalysisReportFiles$lambda2(file, str);
    }
}
