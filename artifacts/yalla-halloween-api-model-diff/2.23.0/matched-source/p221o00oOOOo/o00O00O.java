package p221o00oOOOo;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.o000oOoO;
import java.io.IOException;
import p288o0O0Oo0O.OooOOO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O00O implements oOO00O.OooO00o, OooOOO.OooO00o {
    @Override // o00oOOOo.oOO00O.OooO00o
    public boolean OooO00o(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // o0O0Oo0O.OooOOO.OooO00o
    public Object OooO0O0(JsonReader jsonReader) throws IOException {
        o000oOoO.OooO00o oooO00o = new o000oOoO.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "name":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null name");
                    }
                    oooO00o.f20107OooO0OO = strNextString;
                    break;
                    break;
                case "size":
                    oooO00o.f20106OooO0O0 = Long.valueOf(jsonReader.nextLong());
                    break;
                case "uuid":
                    oooO00o.f20108OooO0Oo = new String(Base64.decode(jsonReader.nextString(), 2), CrashlyticsReport.f19858OooO00o);
                    break;
                case "baseAddress":
                    oooO00o.f20105OooO00o = Long.valueOf(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }
}
