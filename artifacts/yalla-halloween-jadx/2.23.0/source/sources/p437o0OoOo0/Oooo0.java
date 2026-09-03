package p437o0OoOo0;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Size;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.view.OooO0O0;
import androidx.camera.view.OooO0OO;
import androidx.camera.view.OooO0o;
import androidx.camera.view.PreviewView;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p028Oooo0oO.o00O0O0;
import p176o00o0.OooOo;
import p194o00o0OOO.o000O0;
import p194o00o0OOO.o000O00;
import p194o00o0OOO.o000O00O;
import p194o00o0OOO.o000O0Oo;
import p194o00o0OOO.o000OO0O;
import p195o00o0OOo.o000O0O0;
import p198o00o0OoO.o00O0000;
import p198o00o0OoO.o00OO00O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements SurfaceRequest.OooO0o, o00OO00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f46062OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f46063OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46064OooO0o0;

    public /* synthetic */ Oooo0(Object obj, Object obj2, Object obj3) {
        this.f46062OooO0Oo = obj;
        this.f46064OooO0o0 = obj2;
        this.f46063OooO0o = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x00a0  */
    @Override // androidx.camera.core.SurfaceRequest.OooO0o
    public final void OooO00o(SurfaceRequest.OooO0OO oooO0OO) {
        boolean z;
        PreviewView previewView;
        OooO0OO oooO0OO2;
        PreviewView.OooO00o oooO00o = (PreviewView.OooO00o) this.f46062OooO0Oo;
        CameraInternal cameraInternal = (CameraInternal) this.f46064OooO0o0;
        SurfaceRequest surfaceRequest = (SurfaceRequest) this.f46063OooO0o;
        oooO00o.getClass();
        o00O0O0.OooO00o("PreviewView", "Preview transformation info updated. " + oooO0OO);
        Integer numValueOf = Integer.valueOf(cameraInternal.OooO().OooO0o0());
        if (numValueOf != null) {
            if (numValueOf.intValue() != 0) {
                z = false;
            }
            previewView = PreviewView.this;
            OooO0O0 oooO0O0 = previewView.f4138OooO0o;
            Size size = surfaceRequest.f3505OooO0O0;
            oooO0O0.getClass();
            o00O0O0.OooO00o("PreviewTransform", "Transformation info set: " + oooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + size + ZegoConstants.ZegoVideoDataAuxPublishingStream + z);
            oooO0O0.f4113OooO0O0 = oooO0OO.OooO00o();
            oooO0O0.f4114OooO0OO = oooO0OO.OooO0O0();
            oooO0O0.f4117OooO0o0 = oooO0OO.OooO0Oo();
            oooO0O0.f4112OooO00o = size;
            oooO0O0.f4116OooO0o = z;
            oooO0O0.f4118OooO0oO = oooO0OO.OooO0o0();
            oooO0O0.f4115OooO0Oo = oooO0OO.OooO0OO();
            if (oooO0OO.OooO0Oo() != -1 || ((oooO0OO2 = previewView.f4139OooO0o0) != null && (oooO0OO2 instanceof OooO0o))) {
                previewView.f4140OooO0oO = true;
            } else {
                previewView.f4140OooO0oO = false;
            }
            previewView.OooO00o();
        }
        o00O0O0.OooO0oo("PreviewView", "The lens facing is null, probably an external.");
        z = true;
        previewView = PreviewView.this;
        OooO0O0 oooO0O1 = previewView.f4138OooO0o;
        Size size2 = surfaceRequest.f3505OooO0O0;
        oooO0O1.getClass();
        o00O0O0.OooO00o("PreviewTransform", "Transformation info set: " + oooO0OO + ZegoConstants.ZegoVideoDataAuxPublishingStream + size2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + z);
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

    /* JADX WARN: Code duplicated, block: B:10:0x0034 A[PHI: r6
      0x0034: PHI (r6v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
      (r6v2 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r6v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
     binds: [B:9:0x0032, B:12:0x003c, B:15:0x0045, B:18:0x004e, B:21:0x0057, B:24:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o00o0OoO.o00OO00O.OooO00o
    public final Object apply(Object obj) {
        o00OO00O o00oo00o = (o00OO00O) this.f46062OooO0Oo;
        Map map = (Map) this.f46064OooO0o0;
        o000O00.OooO00o oooO00o = (o000O00.OooO00o) this.f46063OooO0o;
        Cursor cursor = (Cursor) obj;
        OooOo oooOo = o00OO00O.f39091OooO;
        o00oo00o.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
            if (i != reason.getNumber()) {
                LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                if (i == reason2.getNumber()) {
                    reason = reason2;
                } else {
                    reason2 = LogEventDropped.Reason.CACHE_FULL;
                    if (i == reason2.getNumber()) {
                        reason = reason2;
                    } else {
                        reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        if (i == reason2.getNumber()) {
                            reason = reason2;
                        } else {
                            reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            if (i == reason2.getNumber()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                if (i == reason2.getNumber()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                    if (i == reason2.getNumber()) {
                                        reason = reason2;
                                    } else {
                                        o000O0O0.OooO00o(Integer.valueOf(i), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new LogEventDropped(j, reason));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i2 = o000O0.f38971OooO0OO;
            new ArrayList();
            oooO00o.f38980OooO0O0.add(new o000O0((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long time = o00oo00o.f39094OooO0o0.getTime();
        SQLiteDatabase sQLiteDatabaseOooOOo = o00oo00o.OooOOo();
        sQLiteDatabaseOooOOo.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseOooOOo.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
            try {
                cursorRawQuery.moveToNext();
                o000OO0O o000oo0o2 = new o000OO0O(cursorRawQuery.getLong(0), time);
                cursorRawQuery.close();
                sQLiteDatabaseOooOOo.setTransactionSuccessful();
                sQLiteDatabaseOooOOo.endTransaction();
                oooO00o.f38979OooO00o = o000oo0o2;
                oooO00o.f38981OooO0OO = new o000O00O(new o000O0Oo(o00oo00o.OooOOo().compileStatement("PRAGMA page_size").simpleQueryForLong() * o00oo00o.OooOOo().compileStatement("PRAGMA page_count").simpleQueryForLong(), o00O0000.f39077OooO00o.f39066OooO0O0));
                oooO00o.f38982OooO0Oo = o00oo00o.f39096OooO0oo.get();
                return new o000O00(oooO00o.f38979OooO00o, Collections.unmodifiableList(oooO00o.f38980OooO0O0), oooO00o.f38981OooO0OO, oooO00o.f38982OooO0Oo);
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseOooOOo.endTransaction();
            throw th2;
        }
    }
}
