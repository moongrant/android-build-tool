package p186o00o00o;

import com.facebook.internal.ServerProtocol;
import com.google.gson.o0OOO0o;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends o0OOO0o<Boolean> {

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
    public Boolean read(@Nullable JsonReader jsonReader) throws IOException {
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
            return Boolean.valueOf(zNextBoolean);
        }
        jsonReader.nextNull();
        zNextBoolean = false;
        return Boolean.valueOf(zNextBoolean);
    }

    @Override // com.google.gson.o0OOO0o
    public void write(@Nullable JsonWriter jsonWriter, @Nullable Boolean bool) throws IOException {
        if (bool == null) {
            if (jsonWriter != null) {
                jsonWriter.value(false);
            }
        } else if (jsonWriter != null) {
            jsonWriter.value(bool.booleanValue());
        }
    }
}
