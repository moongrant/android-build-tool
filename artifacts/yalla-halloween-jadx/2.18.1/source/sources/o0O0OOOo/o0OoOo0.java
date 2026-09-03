package o0O0OOOo;

import android.database.Cursor;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0OoOo0 implements oo0o0Oo.OooO00o, p357o0OOOo0O.o0Oo0oo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0 f35687OooO0Oo = new o0OoOo0();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ o0OoOo0 f35688OooO0o0 = new o0OoOo0();

    @Override // p357o0OOOo0O.o0Oo0oo
    public final List OooO00o(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // o0O0OOOo.oo0o0Oo.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        o0O0O0Oo.OooO0O0 oooO0O0 = oo0o0Oo.f35695OoooO0;
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
