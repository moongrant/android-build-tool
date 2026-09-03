package p162o00OoOoO;

import com.google.gson.o0ooOOo;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00000 extends o0ooOOo<Float> {

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.NULL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[JsonToken.STRING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.o0ooOOo
    @NotNull
    public Float read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        float fNextDouble = 0.0f;
        if (i == 1) {
            jsonReader.nextNull();
        } else if (i != 2) {
            if (i == 3) {
                fNextDouble = (float) jsonReader.nextDouble();
            } else if (i == 4) {
                try {
                    String strNextString = jsonReader.nextString();
                    Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                    fNextDouble = Float.parseFloat(strNextString);
                } catch (Exception unused) {
                }
            }
        } else if (jsonReader.nextBoolean()) {
            fNextDouble = 1.0f;
        }
        return Float.valueOf(fNextDouble);
    }

    @Override // com.google.gson.o0ooOOo
    public void write(@Nullable JsonWriter jsonWriter, @Nullable Float f) throws IOException {
        if (jsonWriter != null) {
            jsonWriter.value(Float.valueOf(f != null ? f.floatValue() : 0.0f));
        }
    }
}
