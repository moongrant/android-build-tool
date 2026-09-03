package p198o00o0OoO;

import android.database.Cursor;
import android.util.Base64;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import p191o00o0O0O.Oooo0;
import p191o00o0O0O.o0Oo0oo;
import p202o00o0o0O.o00000O0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o00O0OO0 implements o00OO00O.OooO00o, TextInputLayout.OooOO0 {
    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        Cursor cursor = (Cursor) obj;
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            Oooo0.OooO00o OooO00o2 = o0Oo0oo.OooO00o();
            OooO00o2.OooO0O0(cursor.getString(1));
            OooO00o2.OooO0OO(o00000O0.OooO0O0(cursor.getInt(2)));
            String string = cursor.getString(3);
            OooO00o2.f38911OooO0O0 = string == null ? null : Base64.decode(string, 0);
            arrayList.add(OooO00o2.OooO00o());
        }
        return arrayList;
    }
}
