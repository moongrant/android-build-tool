package p246o00oo0o0;

import android.util.Base64;
import android.util.JsonReader;
import com.google.firebase.crashlytics.internal.model.OooOO0O;
import java.io.IOException;
import p288o0O0Oo0O.OooOOO;
import p295o0O0OooO.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o000O0 implements o000O0Oo, OooOOO.OooO00o {
    @Override // o0O0Oo0O.OooOOO.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        oo00o oo00oVar = OooOOO.f42269OooO00o;
        jsonReader.beginObject();
        String strNextString = null;
        byte[] bArrDecode = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("filename")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    throw new NullPointerException("Null filename");
                }
            } else if (strNextName.equals("contents")) {
                bArrDecode = Base64.decode(jsonReader.nextString(), 2);
                if (bArrDecode == null) {
                    throw new NullPointerException("Null contents");
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        String strConcat = strNextString == null ? " filename" : "";
        if (bArrDecode == null) {
            strConcat = strConcat.concat(" contents");
        }
        if (strConcat.isEmpty()) {
            return new OooOO0O(strNextString, bArrDecode);
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }
}
