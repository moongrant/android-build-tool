package p186o00o00o;

import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Ooo extends o0OOO0o<MutableStateFlow<String>> {

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
    public MutableStateFlow<String> read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        String strValueOf = "";
        if (i == 1) {
            jsonReader.nextNull();
        } else if (i == 2) {
            strValueOf = String.valueOf(jsonReader.nextBoolean());
        } else if (i == 3 || i == 4) {
            strValueOf = jsonReader.nextString();
        }
        Intrinsics.checkNotNullExpressionValue(strValueOf, "when (reader?.peek()) {\n… else -> \"\"\n            }");
        return StateFlowKt.MutableStateFlow(strValueOf);
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable MutableStateFlow<String> mutableStateFlow) throws IOException {
        String value;
        if (jsonWriter != null) {
            if (mutableStateFlow == null || (value = mutableStateFlow.getValue()) == null) {
                value = "";
            }
            jsonWriter.value(value);
        }
    }
}
