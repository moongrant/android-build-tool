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
public final class OooOO0O extends o0OOO0o<Integer> {

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
    @Override // com.google.gson.o0OOO0o
    @NotNull
    public Integer read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        int iNextInt = 1;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    iNextInt = jsonReader.nextInt();
                } else if (i == 4) {
                    try {
                        String strNextString = jsonReader.nextString();
                        Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                        iNextInt = Integer.parseInt(strNextString);
                    } catch (Exception unused) {
                        iNextInt = 0;
                    }
                }
            } else if (!jsonReader.nextBoolean()) {
            }
            return Integer.valueOf(iNextInt);
        }
        jsonReader.nextNull();
        iNextInt = 0;
        return Integer.valueOf(iNextInt);
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable Integer num) throws IOException {
        if (jsonWriter != null) {
            jsonWriter.value(Integer.valueOf(num != null ? num.intValue() : 0));
        }
    }
}
