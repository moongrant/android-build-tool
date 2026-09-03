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
public final class Oooo000 extends o0OOO0o<MutableStateFlow<Float>> {

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
    public MutableStateFlow<Float> read(@Nullable JsonReader jsonReader) throws IOException {
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
        return StateFlowKt.MutableStateFlow(Float.valueOf(fNextDouble));
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable MutableStateFlow<Float> mutableStateFlow) throws IOException {
        if (jsonWriter != null) {
            jsonWriter.value(Float.valueOf(mutableStateFlow != null ? mutableStateFlow.getValue().floatValue() : 0.0f));
        }
    }
}
