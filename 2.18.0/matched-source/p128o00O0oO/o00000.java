package p128o00O0oO;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.umeng.analytics.pro.ak;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class o00000 implements o0O0ooO<DocumentData> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final o00000 f31088OooO00o = new o00000();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final JsonReader.OooO00o f31089OooO0O0 = JsonReader.OooO00o.OooO00o(ak.aH, "f", ak.aB, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    @Override // p128o00O0oO.o0O0ooO
    public final DocumentData OooO00o(JsonReader jsonReader, float f) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.OooO0O0();
        DocumentData.Justification justification2 = justification;
        String strOooOoOO = null;
        String strOooOoOO2 = null;
        float fOooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int iOooOo0O = 0;
        float fOooOOoo2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooOOoo3 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        int iOooO00o = 0;
        int iOooO00o2 = 0;
        float fOooOOoo4 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        boolean zOooOOo = true;
        while (jsonReader.OooOOO()) {
            switch (jsonReader.Oooo0(f31089OooO0O0)) {
                case 0:
                    strOooOoOO = jsonReader.OooOoOO();
                    break;
                case 1:
                    strOooOoOO2 = jsonReader.OooOoOO();
                    break;
                case 2:
                    fOooOOoo = (float) jsonReader.OooOOoo();
                    break;
                case 3:
                    int iOooOo0O2 = jsonReader.OooOo0O();
                    justification2 = DocumentData.Justification.CENTER;
                    if (iOooOo0O2 <= justification2.ordinal() && iOooOo0O2 >= 0) {
                        justification2 = DocumentData.Justification.values()[iOooOo0O2];
                    }
                    break;
                case 4:
                    iOooOo0O = jsonReader.OooOo0O();
                    break;
                case 5:
                    fOooOOoo2 = (float) jsonReader.OooOOoo();
                    break;
                case 6:
                    fOooOOoo3 = (float) jsonReader.OooOOoo();
                    break;
                case 7:
                    iOooO00o = o000OO.OooO00o(jsonReader);
                    break;
                case 8:
                    iOooO00o2 = o000OO.OooO00o(jsonReader);
                    break;
                case 9:
                    fOooOOoo4 = (float) jsonReader.OooOOoo();
                    break;
                case 10:
                    zOooOOo = jsonReader.OooOOo();
                    break;
                default:
                    jsonReader.Oooo0OO();
                    jsonReader.Oooo0o();
                    break;
            }
        }
        jsonReader.OooO0o();
        return new DocumentData(strOooOoOO, strOooOoOO2, fOooOOoo, justification2, iOooOo0O, fOooOOoo2, fOooOOoo3, iOooO00o, iOooO00o2, fOooOOoo4, zOooOOo);
    }
}
