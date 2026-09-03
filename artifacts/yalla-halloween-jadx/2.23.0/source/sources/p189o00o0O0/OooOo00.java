package p189o00o0O0;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class OooOo00 {
    @NonNull
    public static OooOO0O OooO00o(@NonNull BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        OooOO0O oooOO0O = new OooOO0O(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return oooOO0O;
                    }
                    OooOO0O oooOO0O2 = new OooOO0O(jsonReader.nextLong());
                    jsonReader.close();
                    return oooOO0O2;
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } catch (Throwable th) {
            jsonReader.close();
            throw th;
        }
    }

    public abstract long OooO0O0();
}
