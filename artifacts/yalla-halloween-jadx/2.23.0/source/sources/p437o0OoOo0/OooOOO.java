package p437o0OoOo0;

import android.database.Cursor;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.impl.o0Oo0oo;
import androidx.camera.view.OooO00o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p033OoooO0O.o00oO0o;
import p176o00o0.OooOo;
import p191o00o0O0O.o00O0O;
import p198o00o0OoO.o000OO00;
import p198o00o0OoO.o00OO00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOO implements o00O000.OooO0OO, o00OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ List f46052OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f46053OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46054OooO0o0;

    public /* synthetic */ OooOOO(o0Oo0oo o0oo0oo2, OooO00o oooO00o, ArrayList arrayList) {
        this.f46054OooO0o0 = oooO00o;
        this.f46053OooO0o = o0oo0oo2;
        this.f46052OooO0Oo = arrayList;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        OooO00o oooO00o2 = (OooO00o) this.f46054OooO0o0;
        CameraInfo cameraInfo = (CameraInfo) this.f46053OooO0o;
        oooO00o2.getClass();
        OooOo00 oooOo00 = new OooOo00(oooO00o, cameraInfo);
        this.f46052OooO0Oo.add(oooOo00);
        ((o0Oo0oo) cameraInfo).OooO(o00oO0o.OooO00o(), oooOo00);
        return "waitForCaptureResult";
    }

    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        o00OO00O o00oo00o;
        o00OO00O o00oo00o2 = (o00OO00O) this.f46054OooO0o0;
        p191o00o0O0O.o0Oo0oo o0oo0oo2 = (p191o00o0O0O.o0Oo0oo) this.f46053OooO0o;
        Cursor cursor = (Cursor) obj;
        OooOo oooOo = o00OO00O.f39091OooO;
        o00oo00o2.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            o00o0O0O.OooOo.OooO00o oooO00o = new o00o0O0O.OooOo.OooO00o();
            oooO00o.f38902OooO0o = new HashMap();
            oooO00o.OooO0Oo(cursor.getString(1));
            oooO00o.f38901OooO0Oo = Long.valueOf(cursor.getLong(2));
            oooO00o.f38903OooO0o0 = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                oooO00o.OooO0OO(new o00O0O(string == null ? o00OO00O.f39091OooO : new OooOo(string), cursor.getBlob(5)));
                o00oo00o = o00oo00o2;
            } else {
                String string2 = cursor.getString(4);
                OooOo oooOo2 = string2 == null ? o00OO00O.f39091OooO : new OooOo(string2);
                Cursor cursorQuery = o00oo00o2.OooOOo().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = 0;
                    while (cursorQuery.moveToNext()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        arrayList.add(blob);
                        length += blob.length;
                    }
                    byte[] bArr = new byte[length];
                    int i = 0;
                    int length2 = 0;
                    while (i < arrayList.size()) {
                        byte[] bArr2 = (byte[]) arrayList.get(i);
                        o00OO00O o00oo00o3 = o00oo00o2;
                        System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                        length2 += bArr2.length;
                        i++;
                        o00oo00o2 = o00oo00o3;
                    }
                    o00oo00o = o00oo00o2;
                    cursorQuery.close();
                    oooO00o.OooO0OO(new o00O0O(oooOo2, bArr));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!cursor.isNull(6)) {
                oooO00o.f38899OooO0O0 = Integer.valueOf(cursor.getInt(6));
            }
            this.f46052OooO0Oo.add(new o000OO00(j, o0oo0oo2, oooO00o.OooO0O0()));
            o00oo00o2 = o00oo00o;
        }
        return null;
    }

    public /* synthetic */ OooOOO(o00OO00O o00oo00o, ArrayList arrayList, p191o00o0O0O.o0Oo0oo o0oo0oo2) {
        this.f46054OooO0o0 = o00oo00o;
        this.f46052OooO0Oo = arrayList;
        this.f46053OooO0o = o0oo0oo2;
    }
}
