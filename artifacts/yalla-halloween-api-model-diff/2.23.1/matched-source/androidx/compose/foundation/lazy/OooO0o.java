package androidx.compose.foundation.lazy;

import android.os.Bundle;
import android.util.JsonReader;
import androidx.camera.core.impl.OooOOOO;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.model.o00Oo0;
import java.io.IOException;
import java.util.ArrayList;
import p080o000OoO.o00000;
import p080o000OoO.o00O0O;
import p292o0O0Oo0o.o0OoOo0;
import p300o0O0o00.oo000o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements androidx.media3.common.OooO0OO.OooO00o, o0O0Oo.OooO0O0.OooO00o, SuccessContinuation, o00000.OooO00o {
    public /* synthetic */ OooO0o(AnalyticsListener.OooO00o oooO00o, int i) {
    }

    public static long OooO00o(long j, int i, int i2) {
        return IntOffsetKt.IntOffset(i2, IntOffset.m3894getYimpl(j) + i);
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public Object OooO0O0(JsonReader jsonReader) throws IOException {
        oo000o oo000oVar = p289o0O0Oo.OooO0O0.f41445OooO00o;
        jsonReader.beginObject();
        String strNextString = null;
        Integer numValueOf = null;
        o0OoOo0 o0oooo1 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "frames":
                    ArrayList arrayList = new ArrayList();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(p289o0O0Oo.OooO0O0.OooO00o(jsonReader));
                    }
                    jsonReader.endArray();
                    o0oooo1 = new o0OoOo0(arrayList);
                    break;
                case "name":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    break;
                    break;
                case "importance":
                    numValueOf = Integer.valueOf(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " name" : "";
        if (numValueOf == null) {
            strOooO00o = strOooO00o.concat(" importance");
        }
        if (o0oooo1 == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " frames");
        }
        if (strOooO00o.isEmpty()) {
            return new o00Oo0(strNextString, numValueOf.intValue(), o0oooo1);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }

    @Override // androidx.media3.common.OooO0OO.OooO00o
    public androidx.media3.common.OooO0OO OooO0Oo(Bundle bundle) {
        int i = bundle.getInt(androidx.media3.session.OooO0OO.f9252OooO, 0);
        int i2 = bundle.getInt(androidx.media3.session.OooO0OO.f9257OooOOO0, 0);
        String string = bundle.getString(androidx.media3.session.OooO0OO.f9253OooOO0);
        string.getClass();
        String str = androidx.media3.session.OooO0OO.f9254OooOO0O;
        o00O0O.OooO00o(bundle.containsKey(str));
        int i3 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(androidx.media3.session.OooO0OO.f9255OooOO0o);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new androidx.media3.session.OooO0OO(i, i2, string, i3, bundle2);
    }

    @Override // o000OoO.o00000.OooO00o
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).OoooOOO();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        return Tasks.forResult(null);
    }
}
