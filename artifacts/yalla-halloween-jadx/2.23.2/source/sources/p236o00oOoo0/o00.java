package p236o00oOoo0;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.BufferedReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
@AutoValue
public abstract class o00 {
    @NonNull
    public static o000O0O0 OooO00o(@NonNull BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        o000O0O0 o000o0o1 = new o000O0O0(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return o000o0o1;
                    }
                    o000O0O0 o000o0o2 = new o000O0O0(jsonReader.nextLong());
                    jsonReader.close();
                    return o000o0o2;
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
