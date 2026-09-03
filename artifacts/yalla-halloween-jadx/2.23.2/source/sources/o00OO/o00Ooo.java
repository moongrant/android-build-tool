package o00OO;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f36900OooO00o = JsonReader.OooO00o.OooO00o("x", "y");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f36901OooO00o;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f36901OooO00o = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36901OooO00o[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36901OooO00o[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ColorInt
    public static int OooO00o(JsonReader jsonReader) throws IOException {
        jsonReader.OooO00o();
        int iOooOooo = (int) (jsonReader.OooOooo() * 255.0d);
        int iOooOooo2 = (int) (jsonReader.OooOooo() * 255.0d);
        int iOooOooo3 = (int) (jsonReader.OooOooo() * 255.0d);
        while (jsonReader.OooOo0()) {
            jsonReader.OoooO00();
        }
        jsonReader.OooO0oO();
        return Color.argb(255, iOooOooo, iOooOooo2, iOooOooo3);
    }

    public static PointF OooO0O0(JsonReader jsonReader, float f) throws IOException {
        int i = OooO00o.f36901OooO00o[jsonReader.Oooo0O0().ordinal()];
        if (i == 1) {
            float fOooOooo = (float) jsonReader.OooOooo();
            float fOooOooo2 = (float) jsonReader.OooOooo();
            while (jsonReader.OooOo0()) {
                jsonReader.OoooO00();
            }
            return new PointF(fOooOooo * f, fOooOooo2 * f);
        }
        if (i == 2) {
            jsonReader.OooO00o();
            float fOooOooo3 = (float) jsonReader.OooOooo();
            float fOooOooo4 = (float) jsonReader.OooOooo();
            while (jsonReader.Oooo0O0() != JsonReader.Token.END_ARRAY) {
                jsonReader.OoooO00();
            }
            jsonReader.OooO0oO();
            return new PointF(fOooOooo3 * f, fOooOooo4 * f);
        }
        if (i != 3) {
            throw new IllegalArgumentException("Unknown point starts with " + jsonReader.Oooo0O0());
        }
        jsonReader.OooO0OO();
        float fOooO0Oo = 0.0f;
        float fOooO0Oo2 = 0.0f;
        while (jsonReader.OooOo0()) {
            int iOooo0o0 = jsonReader.Oooo0o0(f36900OooO00o);
            if (iOooo0o0 == 0) {
                fOooO0Oo = OooO0Oo(jsonReader);
            } else if (iOooo0o0 != 1) {
                jsonReader.Oooo0oO();
                jsonReader.OoooO00();
            } else {
                fOooO0Oo2 = OooO0Oo(jsonReader);
            }
        }
        jsonReader.OooOOo();
        return new PointF(fOooO0Oo * f, fOooO0Oo2 * f);
    }

    public static ArrayList OooO0OO(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.OooO00o();
        while (jsonReader.Oooo0O0() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
            arrayList.add(OooO0O0(jsonReader, f));
            jsonReader.OooO0oO();
        }
        jsonReader.OooO0oO();
        return arrayList;
    }

    public static float OooO0Oo(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenOooo0O0 = jsonReader.Oooo0O0();
        int i = OooO00o.f36901OooO00o[tokenOooo0O0.ordinal()];
        if (i == 1) {
            return (float) jsonReader.OooOooo();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenOooo0O0);
        }
        jsonReader.OooO00o();
        float fOooOooo = (float) jsonReader.OooOooo();
        while (jsonReader.OooOo0()) {
            jsonReader.OoooO00();
        }
        jsonReader.OooO0oO();
        return fOooOooo;
    }
}
