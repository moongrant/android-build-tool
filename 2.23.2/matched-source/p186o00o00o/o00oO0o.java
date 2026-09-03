package p186o00o00o;

import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o extends o0OOO0o<String> {

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

    @Override // com.google.gson.o0OOO0o
    @NotNull
    public String read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        if (i == 1) {
            jsonReader.nextNull();
            return "";
        }
        if (i == 2) {
            return String.valueOf(jsonReader.nextBoolean());
        }
        if (i != 3 && i != 4) {
            return "";
        }
        String strNextString = jsonReader.nextString();
        Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
        return strNextString;
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable String str) throws IOException {
        if (jsonWriter != null) {
            if (str == null) {
                str = "";
            }
            jsonWriter.value(str);
        }
    }
}
