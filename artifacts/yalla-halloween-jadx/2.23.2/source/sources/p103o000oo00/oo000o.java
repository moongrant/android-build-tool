package p103o000oo00;

import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import com.google.firebase.crashlytics.internal.model.OooOO0O;
import java.io.IOException;
import java.util.Map;
import o000OOoO.o0OoOo0;
import p080o000OoO.o000O0Oo;
import p288o0O0Oo.OooO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oo000o implements o0OoOo0, OooO0O0.OooO00o {
    @Override // o000OOoO.o0OoOo0
    public final Extractor[] OooO00o(Uri uri, Map map) {
        return OooO0OO();
    }

    @Override // o0O0Oo.OooO0O0.OooO00o
    public final Object OooO0O0(JsonReader jsonReader) throws IOException {
        p299o0O0o00.oo000o oo000oVar = OooO0O0.f41451OooO00o;
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

    public final Extractor[] OooO0OO() {
        o000O0Oo o000o0oo2 = new o000O0Oo(0L);
        ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
        return new Extractor[]{new TsExtractor(o000o0oo2, new DefaultTsPayloadReaderFactory(o0O00.f19060OooO0oo))};
    }
}
