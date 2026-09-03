package p246o00oo0Oo;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.media3.session.o000OOo;
import androidx.media3.session.o0O0O00;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.backends.OooO00o;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import com.google.firebase.encoders.proto.OooOO0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p233o00oOoOO.o0OoOoOo;
import p238o00oOooo.o0O0OOOo;
import p238o00oOooo.o0OO000o;
import p238o00oOooo.o0OO00OO;
import p238o00oOooo.o0oOo0O0;
import p242o00oo00O.o000000O;
import p244o00oo0O0.o00000OO;
import p247o00oo0o.o000O00;
import p248o00oo0o0.o0000O00;
import p248o00oo0o0.o0000oo;
import p249o00oo0oO.o000O0Oo;

/* JADX INFO: loaded from: classes3.dex */
public final class o000O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0000O00 f40142OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f40143OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000000O f40144OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0000oo f40145OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0 f40146OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O00 f40147OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f40148OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000O0Oo f40149OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000O0Oo f40150OooO0oo;

    @Inject
    public o000O000(Context context, o000000O o000000o2, o0000oo o0000ooVar, o000O0 o000o0, Executor executor, o000O00 o000o01, @WallTime o000O0Oo o000o0oo2, @Monotonic o000O0Oo o000o0oo3, o0000O00 o0000o00) {
        this.f40143OooO00o = context;
        this.f40144OooO0O0 = o000000o2;
        this.f40145OooO0OO = o0000ooVar;
        this.f40146OooO0Oo = o000o0;
        this.f40148OooO0o0 = executor;
        this.f40147OooO0o = o000o01;
        this.f40149OooO0oO = o000o0oo2;
        this.f40150OooO0oo = o000o0oo3;
        this.f40142OooO = o0000o00;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(final o0OO00OO o0oo00oo2, int i) {
        OooO00o oooO00oOooO0O0;
        p242o00oo00O.o0000oo o0000ooVar = this.f40144OooO0O0.get(o0oo00oo2.OooO0O0());
        new OooO00o(BackendResponse.Status.OK, 0L);
        final long jMax = 0;
        while (true) {
            o000O00.OooO00o oooO00o = new o000O00.OooO00o() { // from class: o00oo0Oo.o0000O0
                @Override // o00oo0o.o000O00.OooO00o
                public final Object OooO0OO() {
                    return Boolean.valueOf(this.f40122OooO0Oo.f40145OooO0OO.OooOO0o(o0oo00oo2));
                }
            };
            o000O00 o000o01 = this.f40147OooO0o;
            if (!((Boolean) o000o01.OooO0OO(oooO00o)).booleanValue()) {
                o000o01.OooO0OO(new o000O00.OooO00o() { // from class: o00oo0Oo.o0000OO0
                    @Override // o00oo0o.o000O00.OooO00o
                    public final Object OooO0OO() {
                        o000O000 o000o001 = this.f40129OooO0Oo;
                        o000o001.f40145OooO0OO.OooOoo0(o000o001.f40149OooO0oO.getTime() + jMax, o0oo00oo2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) o000o01.OooO0OO(new o0O0O00(this, o0oo00oo2));
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (o0000ooVar == null) {
                o00000OO.OooO00o(o0oo00oo2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                oooO00oOooO0O0 = new OooO00o(BackendResponse.Status.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((p248o00oo0o0.o000O000) it.next()).OooO00o());
                }
                if (o0oo00oo2.OooO0OO() != null) {
                    o0000O00 o0000o00 = this.f40142OooO;
                    Objects.requireNonNull(o0000o00);
                    p245o00oo0OO.o000000O o000000o2 = (p245o00oo0OO.o000000O) o000o01.OooO0OO(new o000(o0000o00));
                    o0O0OOOo.OooO00o oooO00o2 = new o0O0OOOo.OooO00o();
                    oooO00o2.f40003OooO0o = new HashMap();
                    oooO00o2.f40002OooO0Oo = Long.valueOf(this.f40149OooO0oO.getTime());
                    oooO00o2.f40004OooO0o0 = Long.valueOf(this.f40150OooO0oo.getTime());
                    oooO00o2.OooO0Oo("GDT_CLIENT_METRICS");
                    o0OoOoOo o0oooooo = new o0OoOoOo("proto");
                    o000000o2.getClass();
                    OooOO0 oooOO1 = o0OO000o.f40026OooO00o;
                    oooOO1.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        oooOO1.OooO00o(byteArrayOutputStream, o000000o2);
                    } catch (IOException unused) {
                    }
                    oooO00o2.OooO0OO(new o0oOo0O0(o0oooooo, byteArrayOutputStream.toByteArray()));
                    arrayList.add(o0000ooVar.OooO00o(oooO00o2.OooO0O0()));
                }
                oooO00oOooO0O0 = o0000ooVar.OooO0O0(new p242o00oo00O.o0O0O00(arrayList, o0oo00oo2.OooO0OO()));
            }
            if (oooO00oOooO0O0.f13920OooO00o == BackendResponse.Status.TRANSIENT_ERROR) {
                o000o01.OooO0OO(new o000O00.OooO00o() { // from class: o00oo0Oo.o0000O0O
                    @Override // o00oo0o.o000O00.OooO00o
                    public final Object OooO0OO() {
                        o000O000 o000o001 = this.f40125OooO0Oo;
                        o0000oo o0000ooVar2 = o000o001.f40145OooO0OO;
                        o0000ooVar2.OoooOOo(iterable);
                        o0000ooVar2.OooOoo0(o000o001.f40149OooO0oO.getTime() + jMax, o0oo00oo2);
                        return null;
                    }
                });
                this.f40146OooO0Oo.OooO0O0(o0oo00oo2, i + 1, true);
                return;
            }
            o000o01.OooO0OO(new o000OOo(this, iterable));
            BackendResponse.Status status = BackendResponse.Status.OK;
            BackendResponse.Status status2 = oooO00oOooO0O0.f13920OooO00o;
            if (status2 == status) {
                jMax = Math.max(jMax, oooO00oOooO0O0.f13921OooO0O0);
                if (o0oo00oo2.OooO0OO() != null) {
                    o000o01.OooO0OO(new o000OO(this));
                }
            } else if (status2 == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strOooO0oO = ((p248o00oo0o0.o000O000) it2.next()).OooO00o().OooO0oO();
                    if (map.containsKey(strOooO0oO)) {
                        map.put(strOooO0oO, Integer.valueOf(((Integer) map.get(strOooO0oO)).intValue() + 1));
                    } else {
                        map.put(strOooO0oO, 1);
                    }
                }
                o000o01.OooO0OO(new o000O00.OooO00o() { // from class: o00oo0Oo.o0000O
                    @Override // o00oo0o.o000O00.OooO00o
                    public final Object OooO0OO() {
                        o000O000 o000o001 = this.f40120OooO0Oo;
                        o000o001.getClass();
                        for (Map.Entry entry : map.entrySet()) {
                            o000o001.f40142OooO.OooOOo(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
        }
    }
}
