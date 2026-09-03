package p115o00O00oO;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36437OooO00o = JsonReader.OooO00o.OooO00o("x", "y");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36438OooO00o;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f36438OooO00o = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36438OooO00o[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36438OooO00o[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ColorInt
    public static int OooO00o(JsonReader jsonReader) throws IOException {
        jsonReader.OooO00o();
        int iOooOo = (int) (jsonReader.OooOo() * 255.0d);
        int iOooOo2 = (int) (jsonReader.OooOo() * 255.0d);
        int iOooOo3 = (int) (jsonReader.OooOo() * 255.0d);
        while (jsonReader.OooOo00()) {
            jsonReader.Oooo0o();
        }
        jsonReader.OooO0oO();
        return Color.argb(255, iOooOo, iOooOo2, iOooOo3);
    }

    public static PointF OooO0O0(JsonReader jsonReader, float f) throws IOException {
        int i = OooO00o.f36438OooO00o[jsonReader.Oooo0().ordinal()];
        if (i == 1) {
            float fOooOo = (float) jsonReader.OooOo();
            float fOooOo2 = (float) jsonReader.OooOo();
            while (jsonReader.OooOo00()) {
                jsonReader.Oooo0o();
            }
            return new PointF(fOooOo * f, fOooOo2 * f);
        }
        if (i == 2) {
            jsonReader.OooO00o();
            float fOooOo3 = (float) jsonReader.OooOo();
            float fOooOo4 = (float) jsonReader.OooOo();
            while (jsonReader.Oooo0() != JsonReader.Token.END_ARRAY) {
                jsonReader.Oooo0o();
            }
            jsonReader.OooO0oO();
            return new PointF(fOooOo3 * f, fOooOo4 * f);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + jsonReader.Oooo0());
        }
        jsonReader.OooO0OO();
        float fOooO0Oo = 0.0f;
        float fOooO0Oo2 = 0.0f;
        while (jsonReader.OooOo00()) {
            int iOooo0OO = jsonReader.Oooo0OO(f36437OooO00o);
            if (iOooo0OO == 0) {
                fOooO0Oo = OooO0Oo(jsonReader);
            } else if (iOooo0OO != 1) {
                jsonReader.Oooo0o0();
                jsonReader.Oooo0o();
            } else {
                fOooO0Oo2 = OooO0Oo(jsonReader);
            }
        }
        jsonReader.OooOOo0();
        return new PointF(fOooO0Oo * f, fOooO0Oo2 * f);
    }

    public static ArrayList OooO0OO(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.OooO00o();
        while (jsonReader.Oooo0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
            arrayList.add(OooO0O0(jsonReader, f));
            jsonReader.OooO0oO();
        }
        jsonReader.OooO0oO();
        return arrayList;
    }

    public static float OooO0Oo(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenOooo0 = jsonReader.Oooo0();
        int i = OooO00o.f36438OooO00o[tokenOooo0.ordinal()];
        if (i == 1) {
            return (float) jsonReader.OooOo();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenOooo0);
        }
        jsonReader.OooO00o();
        float fOooOo = (float) jsonReader.OooOo();
        while (jsonReader.OooOo00()) {
            jsonReader.Oooo0o();
        }
        jsonReader.OooO0oO();
        return fOooOo;
    }
}
