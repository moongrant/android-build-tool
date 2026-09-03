package p186o00o00o;

import com.facebook.internal.ServerProtocol;
import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOOO extends o0OOO0o<MutableStateFlow<Boolean>> {

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
    public MutableStateFlow<Boolean> read(@Nullable JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader != null ? jsonReader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : OooO00o.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        boolean zNextBoolean = true;
        if (i != 1) {
            if (i == 2) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if (i != 3) {
                if (i == 4) {
                    String strNextString = jsonReader.nextString();
                    if (!Intrinsics.areEqual(strNextString, "1") && !StringsKt__StringsJVMKt.equals(strNextString, ServerProtocol.DIALOG_RETURN_SCOPES_TRUE, true)) {
                    }
                }
            } else if (jsonReader.nextInt() != 1) {
            }
            return StateFlowKt.MutableStateFlow(Boolean.valueOf(zNextBoolean));
        }
        jsonReader.nextNull();
        zNextBoolean = false;
        return StateFlowKt.MutableStateFlow(Boolean.valueOf(zNextBoolean));
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable MutableStateFlow<Boolean> mutableStateFlow) throws IOException {
        if (jsonWriter != null) {
            boolean z = false;
            if (mutableStateFlow != null && mutableStateFlow.getValue().booleanValue()) {
                z = true;
            }
            jsonWriter.value(z);
        }
    }
}
