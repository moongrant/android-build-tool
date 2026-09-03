package p285o0O0O0o;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class o00Oo0 {
    @NonNull
    public static o00Oo0 OooO00o(@NonNull Reader reader) throws IOException {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        Oooo0 oooo0 = new Oooo0(Long.parseLong(jsonReader.nextString()));
                        jsonReader.close();
                        return oooo0;
                    }
                    Oooo0 oooo1 = new Oooo0(jsonReader.nextLong());
                    jsonReader.close();
                    return oooo1;
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
