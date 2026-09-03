package p115o00O00oO;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000OO implements o00O000o<DocumentData> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000OO f36451OooO00o = new o00000OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f36452OooO0O0 = JsonReader.OooO00o.OooO00o("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // p115o00O00oO.o00O000o
    public final DocumentData OooO00o(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.OooO0OO();
        DocumentData.Justification justification2 = justification;
        String strOooo00o = null;
        String strOooo00o2 = null;
        float fOooOo = 0.0f;
        float fOooOo2 = 0.0f;
        float fOooOo3 = 0.0f;
        float fOooOo4 = 0.0f;
        int iOooOooO = 0;
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        boolean zOooOo0 = true;
        while (jsonReader.OooOo00()) {
            switch (jsonReader.Oooo0OO(f36452OooO0O0)) {
                case 0:
                    strOooo00o = jsonReader.Oooo00o();
                    break;
                case 1:
                    strOooo00o2 = jsonReader.Oooo00o();
                    break;
                case 2:
                    fOooOo = (float) jsonReader.OooOo();
                    break;
                case 3:
                    int iOooOooO2 = jsonReader.OooOooO();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iOooOooO2 <= justification2.ordinal() && iOooOooO2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iOooOooO2];
                    }
                    break;
                case 4:
                    iOooOooO = jsonReader.OooOooO();
                    break;
                case 5:
                    fOooOo2 = (float) jsonReader.OooOo();
                    break;
                case 6:
                    fOooOo3 = (float) jsonReader.OooOo();
                    break;
                case 7:
                    iOooO00o = o000.OooO00o(jsonReader);
                    break;
                case 8:
                    iOooO00o2 = o000.OooO00o(jsonReader);
                    break;
                case 9:
                    fOooOo4 = (float) jsonReader.OooOo();
                    break;
                case 10:
                    zOooOo0 = jsonReader.OooOo0();
                    break;
                default:
                    jsonReader.Oooo0o0();
                    jsonReader.Oooo0o();
                    break;
            }
        }
        jsonReader.OooOOo0();
        return new DocumentData(strOooo00o, strOooo00o2, fOooOo, justification2, iOooOooO, fOooOo2, fOooOo3, iOooO00o, iOooO00o2, fOooOo4, zOooOo0);
    }
}
