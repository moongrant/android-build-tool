package o000OOoO;

import android.database.Cursor;
import androidx.media3.extractor.Extractor;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import p233o00oOoOO.o0OoOoOo;
import p248o00oo0o0.o000OO00;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class OooOOO0 implements OooOOO.OooO00o.InterfaceC0402OooO00o, o000OO00.OooO00o {
    @Override // o000OOoO.OooOOO.OooO00o.InterfaceC0402OooO00o
    public final Constructor OooO00o() {
        return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(Extractor.class).getConstructor(new Class[0]);
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = o000OO00.f40194OooO;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            byte[] bArr2 = (byte[]) arrayList.get(i);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }
}
