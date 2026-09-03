package p302o0O0o00;

import android.net.Uri;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.firebase.crashlytics.internal.model.OooOO0;
import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import p296o0O0OoO0.o00O0O;
import p364o0OOOooO.o000O0;
import p371o0OOo0Oo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O000o implements o00O0O, o000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o00O000o f36085OooO0Oo = new o00O000o();

    @Override // o0OOOooO.o000O0.OooO00o
    public final Object OooO00o(JsonReader jsonReader) throws IOException {
        o00Oo0 o00oo1 = o000O0.f38576OooO00o;
        OooOO0.OooO00o oooO00o = new OooOO0.OooO00o();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            Objects.requireNonNull(strNextName);
            if (strNextName.equals("filename")) {
                oooO00o.OooO0OO(jsonReader.nextString());
            } else if (strNextName.equals("contents")) {
                oooO00o.OooO0O0(Base64.decode(jsonReader.nextString(), 2));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return oooO00o.OooO00o();
    }

    @Override // p296o0O0OoO0.o00O0O
    public final Extractor[] OooO0O0(Uri uri, Map map) {
        return OooO0OO();
    }

    public final Extractor[] OooO0OO() {
        return new Extractor[]{new TsExtractor()};
    }
}
