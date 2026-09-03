package o00OO;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o0000O00<DocumentData> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f36861OooO00o = new OooOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36862OooO0O0 = JsonReader.OooO00o.OooO00o("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // o00OO.o0000O00
    public final DocumentData OooO00o(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.OooO0OO();
        DocumentData.Justification justification2 = justification;
        String strOooo0O0 = null;
        String strOooo0O1 = null;
        float fOooOoO = 0.0f;
        float fOooOoO2 = 0.0f;
        float fOooOoO3 = 0.0f;
        float fOooOoO4 = 0.0f;
        int iOooo00O = 0;
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        boolean zOooOo0o = true;
        while (jsonReader.OooOo0O()) {
            switch (jsonReader.Oooo0oO(f36862OooO0O0)) {
                case 0:
                    strOooo0O0 = jsonReader.Oooo0O0();
                    break;
                case 1:
                    strOooo0O1 = jsonReader.Oooo0O0();
                    break;
                case 2:
                    fOooOoO = (float) jsonReader.OooOoO();
                    break;
                case 3:
                    int iOooo00O2 = jsonReader.Oooo00O();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iOooo00O2 <= justification2.ordinal() && iOooo00O2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iOooo00O2];
                    }
                    break;
                case 4:
                    iOooo00O = jsonReader.Oooo00O();
                    break;
                case 5:
                    fOooOoO2 = (float) jsonReader.OooOoO();
                    break;
                case 6:
                    fOooOoO3 = (float) jsonReader.OooOoO();
                    break;
                case 7:
                    iOooO00o = o00Ooo.OooO00o(jsonReader);
                    break;
                case 8:
                    iOooO00o2 = o00Ooo.OooO00o(jsonReader);
                    break;
                case 9:
                    fOooOoO4 = (float) jsonReader.OooOoO();
                    break;
                case 10:
                    zOooOo0o = jsonReader.OooOo0o();
                    break;
                default:
                    jsonReader.Oooo0oo();
                    jsonReader.Oooo();
                    break;
            }
        }
        jsonReader.OooOOoo();
        return new DocumentData(strOooo0O0, strOooo0O1, fOooOoO, justification2, iOooo00O, fOooOoO2, fOooOoO3, iOooO00o, iOooO00o2, fOooOoO4, zOooOo0o);
    }
}
