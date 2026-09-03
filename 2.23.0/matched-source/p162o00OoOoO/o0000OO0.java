package p162o00OoOoO;

import com.google.gson.o0ooOOo;
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
public final class o0000OO0 extends o0ooOOo<MutableStateFlow<Long>> {

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

    @Override // com.google.gson.o0ooOOo
    @NotNull
    public MutableStateFlow<Long> read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        long jNextLong = 0;
        if (i == 1) {
            jsonReader.nextNull();
        } else if (i != 2) {
            if (i == 3) {
                jNextLong = jsonReader.nextLong();
            } else if (i == 4) {
                try {
                    String strNextString = jsonReader.nextString();
                    Intrinsics.checkNotNullExpressionValue(strNextString, "reader.nextString()");
                    jNextLong = Long.parseLong(strNextString);
                } catch (Exception unused) {
                }
            }
        } else if (jsonReader.nextBoolean()) {
            jNextLong = 1;
        }
        return StateFlowKt.MutableStateFlow(Long.valueOf(jNextLong));
    }

    @Override // com.google.gson.o0ooOOo
    public void write(@Nullable JsonWriter jsonWriter, @Nullable MutableStateFlow<Long> mutableStateFlow) throws IOException {
        if (jsonWriter != null) {
            jsonWriter.value(mutableStateFlow != null ? mutableStateFlow.getValue().longValue() : 0L);
        }
    }
}
