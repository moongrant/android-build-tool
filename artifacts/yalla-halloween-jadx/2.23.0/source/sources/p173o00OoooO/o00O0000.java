package p173o00OoooO;

import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.instrument.crashreport.CrashHandler;
import java.util.Comparator;
import p244o00oo0Oo.o00O0O00;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0000 implements Comparator {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f38542OooO0Oo;

    public /* synthetic */ o00O0000(int i) {
        this.f38542OooO0Oo = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f38542OooO0Oo) {
            case 0:
                return CrashHandler.Companion.m4156sendExceptionReports$lambda2((InstrumentData) obj, (InstrumentData) obj2);
            default:
                return Float.compare(((o00O0O00.OooO00o) obj).f40530OooO0OO, ((o00O0O00.OooO00o) obj2).f40530OooO0OO);
        }
    }
}
