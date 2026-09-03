package p196o00o0Oo;

import android.content.Context;
import androidx.annotation.RestrictTo;
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
import p191o00o0O0O.OooOo;
import p191o00o0O0O.o00O0O;
import p191o00o0O0O.o0Oo0oo;
import p193o00o0OO0.OooOOOO;
import p193o00o0OO0.Oooo000;
import p193o00o0OO0.o00oO0o;
import p194o00o0OOO.o000O00;
import p195o00o0OOo.o000O0O0;
import p198o00o0OoO.o00;
import p198o00o0OoO.o000OOo0;
import p198o00o0OoO.o00O00O;
import p199o00o0Ooo.o00OOOO0;
import p201o00o0o00.OooOOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o00O0000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000OOo0 f39020OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f39021OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Oooo000 f39022OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00 f39023OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O00 f39024OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00OOOO0 f39025OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f39026OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooOOO0 f39027OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOOO0 f39028OooO0oo;

    @Inject
    public o00O0000(Context context, Oooo000 oooo000, o00 o00Var, o00O00 o00o01, Executor executor, o00OOOO0 o00oooo1, @WallTime OooOOO0 oooOOO0, @Monotonic OooOOO0 oooOOO1, o000OOo0 o000ooo1) {
        this.f39021OooO00o = context;
        this.f39022OooO0O0 = oooo000;
        this.f39023OooO0OO = o00Var;
        this.f39024OooO0Oo = o00o01;
        this.f39026OooO0o0 = executor;
        this.f39025OooO0o = o00oooo1;
        this.f39027OooO0oO = oooOOO0;
        this.f39028OooO0oo = oooOOO1;
        this.f39020OooO = o000ooo1;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void OooO00o(final o0Oo0oo o0oo0oo2, int i) {
        OooO00o oooO00oOooO0O0;
        o00oO0o o00oo0o2 = this.f39022OooO0O0.get(o0oo0oo2.OooO0O0());
        new OooO00o(BackendResponse.Status.OK, 0L);
        final long jMax = 0;
        while (true) {
            o000O0Oo o000o0oo2 = new o000O0Oo(this, o0oo0oo2);
            o00OOOO0 o00oooo1 = this.f39025OooO0o;
            if (!((Boolean) o00oooo1.OooO0OO(o000o0oo2)).booleanValue()) {
                o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o00
                    @Override // o00o0Ooo.o00OOOO0.OooO00o
                    public final Object OooO0OO() {
                        o00O0000 o00o0001 = this.f38988OooO0Oo;
                        o00o0001.f39023OooO0OO.OoooO(o00o0001.f39027OooO0oO.getTime() + jMax, o0oo0oo2);
                        return null;
                    }
                });
                return;
            }
            final Iterable iterable = (Iterable) o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o000OO0O
                @Override // o00o0Ooo.o00OOOO0.OooO00o
                public final Object OooO0OO() {
                    return this.f39008OooO0Oo.f39023OooO0OO.o000000o(o0oo0oo2);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return;
            }
            if (o00oo0o2 == null) {
                o000O0O0.OooO00o(o0oo0oo2, "Uploader", "Unknown backend for %s, deleting event batch for it...");
                oooO00oOooO0O0 = new OooO00o(BackendResponse.Status.FATAL_ERROR, -1L);
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o00O00O) it.next()).OooO00o());
                }
                if (o0oo0oo2.OooO0OO() != null) {
                    final o000OOo0 o000ooo1 = this.f39020OooO;
                    Objects.requireNonNull(o000ooo1);
                    o000O00 o000o01 = (o000O00) o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o000O00
                        @Override // o00o0Ooo.o00OOOO0.OooO00o
                        public final Object OooO0OO() {
                            return o000ooo1.OooO0oO();
                        }
                    });
                    OooOo.OooO00o oooO00o = new OooOo.OooO00o();
                    oooO00o.f38902OooO0o = new HashMap();
                    oooO00o.f38901OooO0Oo = Long.valueOf(this.f39027OooO0oO.getTime());
                    oooO00o.f38903OooO0o0 = Long.valueOf(this.f39028OooO0oo.getTime());
                    oooO00o.OooO0Oo("GDT_CLIENT_METRICS");
                    p176o00o0.OooOo oooOo = new p176o00o0.OooOo("proto");
                    o000o01.getClass();
                    OooOO0 oooOO1 = p191o00o0O0O.o00oO0o.f38936OooO00o;
                    oooOO1.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        oooOO1.OooO00o(byteArrayOutputStream, o000o01);
                    } catch (IOException unused) {
                    }
                    oooO00o.OooO0OO(new o00O0O(oooOo, byteArrayOutputStream.toByteArray()));
                    arrayList.add(o00oo0o2.OooO00o(oooO00o.OooO0O0()));
                }
                oooO00oOooO0O0 = o00oo0o2.OooO0O0(new OooOOOO(arrayList, o0oo0oo2.OooO0OO()));
            }
            if (oooO00oOooO0O0.f10872OooO00o == BackendResponse.Status.TRANSIENT_ERROR) {
                o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o000O0O0
                    @Override // o00o0Ooo.o00OOOO0.OooO00o
                    public final Object OooO0OO() {
                        o00O0000 o00o0001 = this.f38998OooO0Oo;
                        o00 o00Var = o00o0001.f39023OooO0OO;
                        o00Var.OoooOOo(iterable);
                        o00Var.OoooO(o00o0001.f39027OooO0oO.getTime() + jMax, o0oo0oo2);
                        return null;
                    }
                });
                this.f39024OooO0Oo.OooO00o(o0oo0oo2, i + 1, true);
                return;
            }
            o00oooo1.OooO0OO(new o000O(this, iterable));
            BackendResponse.Status status = BackendResponse.Status.OK;
            BackendResponse.Status status2 = oooO00oOooO0O0.f10872OooO00o;
            if (status2 == status) {
                jMax = Math.max(jMax, oooO00oOooO0O0.f10873OooO0O0);
                if (o0oo0oo2.OooO0OO() != null) {
                    o00oooo1.OooO0OO(new o000OO00(this));
                }
            } else if (status2 == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strOooO0oO = ((o00O00O) it2.next()).OooO00o().OooO0oO();
                    if (map.containsKey(strOooO0oO)) {
                        map.put(strOooO0oO, Integer.valueOf(((Integer) map.get(strOooO0oO)).intValue() + 1));
                    } else {
                        map.put(strOooO0oO, 1);
                    }
                }
                o00oooo1.OooO0OO(new o00OOOO0.OooO00o() { // from class: o00o0Oo.o000OOo0
                    @Override // o00o0Ooo.o00OOOO0.OooO00o
                    public final Object OooO0OO() {
                        o00O0000 o00o0001 = this.f39010OooO0Oo;
                        o00o0001.getClass();
                        for (Map.Entry entry : map.entrySet()) {
                            o00o0001.f39020OooO.OooOOo0(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
        }
    }
}
