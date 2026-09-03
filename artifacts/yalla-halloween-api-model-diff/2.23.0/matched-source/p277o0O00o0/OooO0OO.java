package p277o0O00o0;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.anrreport.ANRHandler;
import com.twitter.sdk.android.tweetui.OooOOO0;
import com.twitter.sdk.android.tweetui.o0000O0O;
import java.util.Comparator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooO0OO implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f41794OooO0Oo;

    public /* synthetic */ OooO0OO(int i) {
        this.f41794OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f41794OooO0Oo) {
            case 0:
                return ANRHandler.m4154sendANRReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
            default:
                OooOOO0 oooOOO0 = (OooOOO0) obj;
                OooOOO0 oooOOO1 = (OooOOO0) obj2;
                Pattern pattern = o0000O0O.f22449OooO00o;
                if (oooOOO0 != null || oooOOO1 == null) {
                    if (oooOOO0 == null || oooOOO1 != null) {
                        if (oooOOO0 != null || oooOOO1 != null) {
                            int i = oooOOO0.f22309OooO00o;
                            int i2 = oooOOO1.f22309OooO00o;
                            if (i >= i2) {
                                if (i > i2) {
                                }
                            }
                        }
                        return 0;
                    }
                    return 1;
                }
                return -1;
        }
    }
}
