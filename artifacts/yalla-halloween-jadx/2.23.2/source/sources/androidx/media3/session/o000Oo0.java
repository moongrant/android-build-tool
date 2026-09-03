package androidx.media3.session;

import android.database.Cursor;
import android.util.Size;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.PreviewView;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p233o00oOoOO.o0OoOoOo;
import p238o00oOooo.o0O0OOOo;
import p238o00oOooo.o0O0oo00;
import p238o00oOooo.o0OO00OO;
import p238o00oOooo.o0oOo0O0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000Oo0 implements o000OoO.o00000O0.OooO00o, o00oo0o0.o000OO00.OooO00o, SurfaceRequest.OooO0o, o00oo0o.o000O00.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9319OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f9320OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f9321OooO0o0;

    public /* synthetic */ o000Oo0(Object obj, Object obj2, Object obj3) {
        this.f9319OooO0Oo = obj;
        this.f9321OooO0o0 = obj2;
        this.f9320OooO0o = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a0  */
    @Override // androidx.camera.core.SurfaceRequest.OooO0o
    public void OooO00o(SurfaceRequest.OooO0OO oooO0OO) {
        boolean z;
        PreviewView previewView;
        androidx.camera.view.OooO0OO oooO0OO2;
        PreviewView.OooO00o oooO00o = (PreviewView.OooO00o) this.f9319OooO0Oo;
        CameraInternal cameraInternal = (CameraInternal) this.f9321OooO0o0;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f9320OooO0o;
        oooO00o.getClass();
        p028Oooo0oO.o00O0O0.OooO00o("PreviewView", "Preview transformation info updated. " + oooO0OO);
        Integer numValueOf = Integer.valueOf(cameraInternal.OooO().OooO0o0());
        if (numValueOf != null) {
            if (numValueOf.intValue() != 0) {
                z = false;
            }
            previewView = PreviewView.this;
            androidx.camera.view.OooO0O0 oooO0O0 = previewView.f4138OooO0o;
            Size size = surfaceRequest.f3503OooO0O0;
            oooO0O0.getClass();
            p028Oooo0oO.o00O0O0.OooO00o("PreviewTransform", "Transformation info set: " + oooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + size + ZegoConstants.ZegoVideoDataAuxPublishingStream + z);
            oooO0O0.f4113OooO0O0 = oooO0OO.OooO00o();
            oooO0O0.f4114OooO0OO = oooO0OO.OooO0O0();
            oooO0O0.f4117OooO0o0 = oooO0OO.OooO0Oo();
            oooO0O0.f4112OooO00o = size;
            oooO0O0.f4116OooO0o = z;
            oooO0O0.f4118OooO0oO = oooO0OO.OooO0o0();
            oooO0O0.f4115OooO0Oo = oooO0OO.OooO0OO();
            if (oooO0OO.OooO0Oo() != -1 || ((oooO0OO2 = previewView.f4139OooO0o0) != null && (oooO0OO2 instanceof androidx.camera.view.OooO0o))) {
                previewView.f4140OooO0oO = true;
            } else {
                previewView.f4140OooO0oO = false;
            }
            previewView.OooO00o();
        }
        p028Oooo0oO.o00O0O0.OooO0oo("PreviewView", "The lens facing is null, probably an external.");
        z = true;
        previewView = PreviewView.this;
        androidx.camera.view.OooO0O0 oooO0O1 = previewView.f4138OooO0o;
        Size size2 = surfaceRequest.f3503OooO0O0;
        oooO0O1.getClass();
        p028Oooo0oO.o00O0O0.OooO00o("PreviewTransform", "Transformation info set: " + oooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + size2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + z);
        oooO0O1.f4113OooO0O0 = oooO0OO.OooO00o();
        oooO0O1.f4114OooO0OO = oooO0OO.OooO0O0();
        oooO0O1.f4117OooO0o0 = oooO0OO.OooO0Oo();
        oooO0O1.f4112OooO00o = size2;
        oooO0O1.f4116OooO0o = z;
        oooO0O1.f4118OooO0oO = oooO0OO.OooO0o0();
        oooO0O1.f4115OooO0Oo = oooO0OO.OooO0OO();
        if (oooO0OO.OooO0Oo() != -1) {
            previewView.f4140OooO0oO = true;
        } else {
            previewView.f4140OooO0oO = true;
        }
        previewView.OooO00o();
    }

    @Override // o00oo0o.o000O00.OooO00o
    public Object OooO0OO() {
        p243o00oo0O.o000OO o000oo2 = (p243o00oo0O.o000OO) this.f9319OooO0Oo;
        o0OO00OO o0oo00oo2 = (o0OO00OO) this.f9321OooO0o0;
        o000oo2.f40092OooO0Oo.o0ooOOo(o0oo00oo2, (o0O0oo00) this.f9320OooO0o);
        o000oo2.f40089OooO00o.OooO00o(o0oo00oo2, 1);
        return null;
    }

    @Override // o00oo0o0.o000OO00.OooO00o
    public Object apply(Object obj) {
        p248o00oo0o0.o000OO00 o000oo01;
        p248o00oo0o0.o000OO00 o000oo02 = (p248o00oo0o0.o000OO00) this.f9319OooO0Oo;
        List list = (List) this.f9321OooO0o0;
        o0OO00OO o0oo00oo2 = (o0OO00OO) this.f9320OooO0o;
        Cursor cursor = (Cursor) obj;
        o0OoOoOo o0oooooo = p248o00oo0o0.o000OO00.f40194OooO;
        o000oo02.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            o0O0OOOo.OooO00o oooO00o = new o0O0OOOo.OooO00o();
            oooO00o.f40003OooO0o = new HashMap();
            oooO00o.OooO0Oo(cursor.getString(1));
            oooO00o.f40002OooO0Oo = Long.valueOf(cursor.getLong(2));
            oooO00o.f40004OooO0o0 = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                oooO00o.OooO0OO(new o0oOo0O0(string == null ? p248o00oo0o0.o000OO00.f40194OooO : new o0OoOoOo(string), cursor.getBlob(5)));
                o000oo01 = o000oo02;
            } else {
                String string2 = cursor.getString(4);
                o0OoOoOo o0oooooo2 = string2 == null ? p248o00oo0o0.o000OO00.f40194OooO : new o0OoOoOo(string2);
                Cursor cursorQuery = o000oo02.OooOo00().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
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
                        p248o00oo0o0.o000OO00 o000oo03 = o000oo02;
                        System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
                        length2 += bArr2.length;
                        i++;
                        o000oo02 = o000oo03;
                    }
                    o000oo01 = o000oo02;
                    cursorQuery.close();
                    oooO00o.OooO0OO(new o0oOo0O0(o0oooooo2, bArr));
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!cursor.isNull(6)) {
                oooO00o.f40000OooO0O0 = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new p248o00oo0o0.o0000(j, o0oo00oo2, oooO00o.OooO0O0()));
            o000oo02 = o000oo01;
        }
        return null;
    }

    @Override // o000OoO.o00000O0.OooO00o
    public void invoke(Object obj) {
        ((o000OO0O.OooO0OO) this.f9319OooO0Oo).getClass();
        throw null;
    }
}
