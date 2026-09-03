package androidx.compose.ui.graphics.colorspace;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.Player;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.IOException;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import p176o00o0.Oooo0;
import p245o00oo0o.o00O0OO;
import p295o0O0OooO.oo00o;
import p296o0O0Oooo.o00O0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0O0 implements DoubleFunction, com.google.android.exoplayer2.OooO.OooO00o, Oooo0 {
    @Override // com.google.android.exoplayer2.OooO.OooO00o
    public final com.google.android.exoplayer2.OooO OooO0O0(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Player.OooO00o.f11342OooO0o);
        if (integerArrayList == null) {
            return Player.OooO00o.f11343OooO0o0;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < integerArrayList.size(); i++) {
            sparseBooleanArray.append(integerArrayList.get(i).intValue(), true);
        }
        return new Player.OooO00o(new o00O0OO(sparseBooleanArray));
    }

    @Override // p176o00o0.Oooo0
    public final Object apply(Object obj) {
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        o00O0O0.f42326OooO0O0.getClass();
        oo00o oo00oVar = p288o0O0Oo0O.OooOOO.f42269OooO00o;
        oo00oVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            oo00oVar.OooO00o(stringWriter, crashlyticsReport);
        } catch (IOException unused) {
        }
        return stringWriter.toString().getBytes(Charset.forName("UTF-8"));
    }

    @Override // androidx.compose.ui.graphics.colorspace.DoubleFunction
    public final double invoke(double d) {
        return ColorSpaces.ExtendedSrgb$lambda$0(d);
    }
}
