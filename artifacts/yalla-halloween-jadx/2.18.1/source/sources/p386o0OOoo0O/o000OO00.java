package p386o0OOoo0O;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 extends o00O0<AtomicLongArray> {
    public final /* synthetic */ o00O0 val$longAdapter;

    public o000OO00(o00O0 o00o1) {
        this.val$longAdapter = o00o1;
    }

    @Override // p386o0OOoo0O.o00O0
    public AtomicLongArray read(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.val$longAdapter.read(jsonReader)).longValue()));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // p386o0OOoo0O.o00O0
    public void write(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        jsonWriter.beginArray();
        int length = atomicLongArray.length();
        for (int i = 0; i < length; i++) {
            this.val$longAdapter.write(jsonWriter, Long.valueOf(atomicLongArray.get(i)));
        }
        jsonWriter.endArray();
    }
}
