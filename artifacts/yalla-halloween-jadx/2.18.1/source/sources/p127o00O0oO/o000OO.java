package p127o00O0oO;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final JsonReader.OooO00o f31113OooO00o = JsonReader.OooO00o.OooO00o("x", "y");

    public static /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f31114OooO00o;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f31114OooO00o = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31114OooO00o[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31114OooO00o[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @ColorInt
    public static int OooO00o(JsonReader jsonReader) throws IOException {
        jsonReader.OooO00o();
        int iOooOOoo = (int) (jsonReader.OooOOoo() * 255.0d);
        int iOooOOoo2 = (int) (jsonReader.OooOOoo() * 255.0d);
        int iOooOOoo3 = (int) (jsonReader.OooOOoo() * 255.0d);
        while (jsonReader.OooOOO()) {
            jsonReader.Oooo0o();
        }
        jsonReader.OooO0Oo();
        return Color.argb(KotlinVersion.MAX_COMPONENT_VALUE, iOooOOoo, iOooOOoo2, iOooOOoo3);
    }

    public static PointF OooO0O0(JsonReader jsonReader, float f) throws IOException {
        int i = OooO00o.f31114OooO00o[jsonReader.OooOoo().ordinal()];
        if (i == 1) {
            float fOooOOoo = (float) jsonReader.OooOOoo();
            float fOooOOoo2 = (float) jsonReader.OooOOoo();
            while (jsonReader.OooOOO()) {
                jsonReader.Oooo0o();
            }
            return new PointF(fOooOOoo * f, fOooOOoo2 * f);
        }
        if (i == 2) {
            jsonReader.OooO00o();
            float fOooOOoo3 = (float) jsonReader.OooOOoo();
            float fOooOOoo4 = (float) jsonReader.OooOOoo();
            while (jsonReader.OooOoo() != JsonReader.Token.END_ARRAY) {
                jsonReader.Oooo0o();
            }
            jsonReader.OooO0Oo();
            return new PointF(fOooOOoo3 * f, fOooOOoo4 * f);
        }
        if (i != 3) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Unknown point starts with ");
            sbOooO0o0.append(jsonReader.OooOoo());
            throw new IllegalArgumentException(sbOooO0o0.toString());
        }
        jsonReader.OooO0O0();
        float fOooO0Oo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        float fOooO0Oo2 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;
        while (jsonReader.OooOOO()) {
            int iOooo0 = jsonReader.Oooo0(f31113OooO00o);
            if (iOooo0 == 0) {
                fOooO0Oo = OooO0Oo(jsonReader);
            } else if (iOooo0 != 1) {
                jsonReader.Oooo0OO();
                jsonReader.Oooo0o();
            } else {
                fOooO0Oo2 = OooO0Oo(jsonReader);
            }
        }
        jsonReader.OooO0o();
        return new PointF(fOooO0Oo * f, fOooO0Oo2 * f);
    }

    public static List<PointF> OooO0OO(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.OooO00o();
        while (jsonReader.OooOoo() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.OooO00o();
            arrayList.add(OooO0O0(jsonReader, f));
            jsonReader.OooO0Oo();
        }
        jsonReader.OooO0Oo();
        return arrayList;
    }

    public static float OooO0Oo(JsonReader jsonReader) throws IOException {
        JsonReader.Token tokenOooOoo = jsonReader.OooOoo();
        int i = OooO00o.f31114OooO00o[tokenOooOoo.ordinal()];
        if (i == 1) {
            return (float) jsonReader.OooOOoo();
        }
        if (i != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + tokenOooOoo);
        }
        jsonReader.OooO00o();
        float fOooOOoo = (float) jsonReader.OooOOoo();
        while (jsonReader.OooOOO()) {
            jsonReader.Oooo0o();
        }
        jsonReader.OooO0Oo();
        return fOooOOoo;
    }
}
