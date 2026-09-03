package p245o00oo0o;

import android.util.JsonReader;
import androidx.camera.core.impl.OooOOOO;
import com.google.firebase.crashlytics.internal.model.OooO0o;
import java.io.IOException;
import p288o0O0Oo0O.OooOOO;
import p295o0O0OooO.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0O0O implements OooOOO.OooO00o {
    @Override // o0O0Oo0O.OooOOO.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        oo00o oo00oVar = OooOOO.f42269OooO00o;
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        String strNextString3 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            strNextName.hashCode();
            switch (strNextName) {
                case "libraryName":
                    strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        throw new NullPointerException("Null libraryName");
                    }
                    break;
                    break;
                case "arch":
                    strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        throw new NullPointerException("Null arch");
                    }
                    break;
                    break;
                case "buildId":
                    strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        throw new NullPointerException("Null buildId");
                    }
                    break;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        String strOooO00o = strNextString == null ? " arch" : "";
        if (strNextString2 == null) {
            strOooO00o = strOooO00o.concat(" libraryName");
        }
        if (strNextString3 == null) {
            strOooO00o = OooOOOO.OooO00o(strOooO00o, " buildId");
        }
        if (strOooO00o.isEmpty()) {
            return new OooO0o(strNextString, strNextString2, strNextString3);
        }
        throw new IllegalStateException("Missing required properties:".concat(strOooO00o));
    }
}
