package p174o00Ooooo;

import com.facebook.internal.instrument.errorreport.ErrorReportData;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00oOoo implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ErrorReportHandler.m4159sendErrorReports$lambda0((ErrorReportData) obj, (ErrorReportData) obj2);
    }
}
