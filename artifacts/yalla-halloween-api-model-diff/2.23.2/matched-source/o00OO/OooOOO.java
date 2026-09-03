package o00OO;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO implements o0000O00<DocumentData> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooOOO f36865OooO00o = new OooOOO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36866OooO0O0 = JsonReader.OooO00o.OooO00o("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // o00OO.o0000O00
    public final DocumentData OooO00o(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.OooO0OO();
        DocumentData.Justification justification2 = justification;
        String strOooo0 = null;
        String strOooo1 = null;
        float fOooOooo = 0.0f;
        float fOooOooo2 = 0.0f;
        float fOooOooo3 = 0.0f;
        float fOooOooo4 = 0.0f;
        int iOooo00o = 0;
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        boolean zOooOo = true;
        while (jsonReader.OooOo0()) {
            switch (jsonReader.Oooo0o0(f36866OooO0O0)) {
                case 0:
                    strOooo0 = jsonReader.Oooo0();
                    break;
                case 1:
                    strOooo1 = jsonReader.Oooo0();
                    break;
                case 2:
                    fOooOooo = (float) jsonReader.OooOooo();
                    break;
                case 3:
                    int iOooo00o2 = jsonReader.Oooo00o();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iOooo00o2 <= justification2.ordinal() && iOooo00o2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iOooo00o2];
                    }
                    break;
                case 4:
                    iOooo00o = jsonReader.Oooo00o();
                    break;
                case 5:
                    fOooOooo2 = (float) jsonReader.OooOooo();
                    break;
                case 6:
                    fOooOooo3 = (float) jsonReader.OooOooo();
                    break;
                case 7:
                    iOooO00o = o00Ooo.OooO00o(jsonReader);
                    break;
                case 8:
                    iOooO00o2 = o00Ooo.OooO00o(jsonReader);
                    break;
                case 9:
                    fOooOooo4 = (float) jsonReader.OooOooo();
                    break;
                case 10:
                    zOooOo = jsonReader.OooOo();
                    break;
                default:
                    jsonReader.Oooo0oO();
                    jsonReader.OoooO00();
                    break;
            }
        }
        jsonReader.OooOOo();
        return new DocumentData(strOooo0, strOooo1, fOooOooo, justification2, iOooo00o, fOooOooo2, fOooOooo3, iOooO00o, iOooO00o2, fOooOooo4, zOooOo);
    }
}
