package com.yalla.yalla.data.db.converter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.code.android.util.o000000;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.o0ooOOo;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yalla/yalla/data/db/converter/BooleanTypeAdapter;", "Lcom/google/gson/o0ooOOo;", "", "Lcom/google/gson/stream/JsonWriter;", "out", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "write", "(Lcom/google/gson/stream/JsonWriter;Ljava/lang/Boolean;)V", "Lcom/google/gson/stream/JsonReader;", "reader", "read", "(Lcom/google/gson/stream/JsonReader;)Ljava/lang/Boolean;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BooleanTypeAdapter extends o0ooOOo<Boolean> {
    public static final int $stable = 0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[JsonToken.values().length];
            try {
                iArr[JsonToken.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[JsonToken.NULL.ordinal()] = 2;
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
    /* JADX WARN: Code duplicated, block: B:23:0x0034  */
    @Override // com.google.gson.o0ooOOo
    @NotNull
    public Boolean read(@Nullable JsonReader reader) throws IOException {
        boolean zNextBoolean;
        JsonToken jsonTokenPeek = reader != null ? reader.peek() : null;
        int i = jsonTokenPeek == null ? -1 : WhenMappings.$EnumSwitchMapping$0[jsonTokenPeek.ordinal()];
        boolean z = true;
        if (i != 1) {
            zNextBoolean = false;
            if (i != 2) {
                if (i == 3) {
                    if (reader.nextInt() != 1) {
                        z = false;
                    }
                    zNextBoolean = z;
                } else if (i == 4) {
                    if (o000000.OooO0o0(reader.nextString()) != 1) {
                        z = false;
                    }
                    zNextBoolean = z;
                }
            }
        } else {
            zNextBoolean = reader.nextBoolean();
        }
        return Boolean.valueOf(zNextBoolean);
    }

    @Override // com.google.gson.o0ooOOo
    public void write(@Nullable JsonWriter out, @Nullable Boolean value) throws IOException {
        if (value == null) {
            if (out != null) {
                out.value(false);
            }
        } else if (out != null) {
            out.value(value);
        }
    }
}
