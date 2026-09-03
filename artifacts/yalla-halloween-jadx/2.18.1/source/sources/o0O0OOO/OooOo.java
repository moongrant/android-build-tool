package o0O0OOO;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.time.Monotonic;
import com.google.android.datatransport.runtime.time.WallTime;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.inject.Inject;
import p192o00o0O0.o00000O;
import p286o0O0O0oO.o00Ooo;
import p286o0O0O0oO.o0OO00O;
import p286o0O0O0oO.o0OOO0o;
import p286o0O0O0oO.oo000o;
import p287o0O0O0oo.o00000O0;
import p287o0O0O0oo.o0000OO0;
import p287o0O0O0oo.o0000Ooo;
import p288o0O0OOo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o0O0OOOo.OooO0OO f35581OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f35582OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0000Ooo f35583OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o0O0OOOo.OooO0o f35584OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00O0O f35585OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo0 f35586OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Executor f35587OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final p289o0O0OOoO.o0000Ooo f35588OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p289o0O0OOoO.o0000Ooo f35589OooO0oo;

    @Inject
    public OooOo(Context context, o0000Ooo o0000ooo, o0O0OOOo.OooO0o oooO0o, o00O0O o00o0o2, Executor executor, o00Oo0 o00oo1, @WallTime p289o0O0OOoO.o0000Ooo o0000ooo2, @Monotonic p289o0O0OOoO.o0000Ooo o0000ooo3, o0O0OOOo.OooO0OO oooO0OO) {
        this.f35582OooO00o = context;
        this.f35583OooO0O0 = o0000ooo;
        this.f35584OooO0OO = oooO0o;
        this.f35585OooO0Oo = o00o0o2;
        this.f35587OooO0o0 = executor;
        this.f35586OooO0o = o00oo1;
        this.f35588OooO0oO = o0000ooo2;
        this.f35589OooO0oo = o0000ooo3;
        this.f35581OooO = oooO0OO;
    }

    public final BackendResponse OooO00o(final o0OO00O o0oo00o2, int i) {
        BackendResponse backendResponseOooO0O0;
        o0000OO0 o0000oo1 = this.f35583OooO0O0.get(o0oo00o2.OooO0O0());
        BackendResponse oooO00o = new com.google.android.datatransport.runtime.backends.OooO00o(BackendResponse.Status.OK, 0L);
        final long j = 0;
        while (((Boolean) this.f35586OooO0o.OooO0O0(new OooOOOO(this, o0oo00o2))).booleanValue()) {
            final Iterable iterable = (Iterable) this.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooOO0O
                @Override // o0O0OOo.o00Oo0.OooO00o
                public final Object OooO0O0() {
                    OooOo oooOo = this.f35571OooO0Oo;
                    return oooOo.f35584OooO0OO.o00O0O(o0oo00o2);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return oooO00o;
            }
            if (o0000oo1 == null) {
                o0O0OO.OooO00o.OooO00o("Uploader", "Unknown backend for %s, deleting event batch for it...", o0oo00o2);
                backendResponseOooO0O0 = BackendResponse.OooO00o();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o0O0OOOo.OooOo00) it.next()).OooO00o());
                }
                if (o0oo00o2.OooO0OO() != null) {
                    o00Oo0 o00oo1 = this.f35586OooO0o;
                    o0O0OOOo.OooO0OO oooO0OO = this.f35581OooO;
                    Objects.requireNonNull(oooO0OO);
                    o0O0OO0O.OooO00o oooO00o2 = (o0O0OO0O.OooO00o) o00oo1.OooO0O0(new o00000O(oooO0OO));
                    oo000o.OooO00o OooO00o2 = oo000o.OooO00o();
                    OooO00o2.OooO0o0(this.f35588OooO0oO.getTime());
                    OooO00o2.OooO0oO(this.f35589OooO0oo.getTime());
                    o0O0O0oO.o000oOoO.OooO0O0 oooO0O0 = (o0O0O0oO.o000oOoO.OooO0O0) OooO00o2;
                    oooO0O0.f35476OooO00o = "GDT_CLIENT_METRICS";
                    o0O0O0Oo.OooO0O0 oooO0O1 = new o0O0O0Oo.OooO0O0("proto");
                    Objects.requireNonNull(oooO00o2);
                    com.google.firebase.encoders.proto.OooOO0 oooOO1 = o0OOO0o.f35502OooO00o;
                    Objects.requireNonNull(oooOO1);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        oooOO1.OooO00o(oooO00o2, byteArrayOutputStream);
                    } catch (IOException unused) {
                    }
                    oooO0O0.f35478OooO0OO = new o00Ooo(oooO0O1, byteArrayOutputStream.toByteArray());
                    arrayList.add(o0000oo1.OooO00o(oooO0O0.OooO0OO()));
                }
                backendResponseOooO0O0 = o0000oo1.OooO0O0(new o00000O0(arrayList, o0oo00o2.OooO0OO(), null));
            }
            BackendResponse backendResponse = backendResponseOooO0O0;
            if (backendResponse.OooO0OO() == BackendResponse.Status.TRANSIENT_ERROR) {
                this.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooO
                    @Override // o0O0OOo.o00Oo0.OooO00o
                    public final Object OooO0O0() {
                        OooOo oooOo = this.f35555OooO0Oo;
                        Iterable<o0O0OOOo.OooOo00> iterable2 = iterable;
                        o0OO00O o0oo00o3 = o0oo00o2;
                        long j2 = j;
                        oooOo.f35584OooO0OO.o00000o0(iterable2);
                        oooOo.f35584OooO0OO.o00000Oo(o0oo00o3, oooOo.f35588OooO0oO.getTime() + j2);
                        return null;
                    }
                });
                this.f35585OooO0Oo.OooO0O0(o0oo00o2, i + 1, true);
                return backendResponse;
            }
            this.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooO0o
                @Override // o0O0OOo.o00Oo0.OooO00o
                public final Object OooO0O0() {
                    OooOo oooOo = this.f35567OooO0Oo;
                    oooOo.f35584OooO0OO.OooOOOO(iterable);
                    return null;
                }
            });
            if (backendResponse.OooO0OO() == BackendResponse.Status.OK) {
                long jMax = Math.max(j, backendResponse.OooO0O0());
                if (o0oo00o2.OooO0OO() != null) {
                    this.f35586OooO0o.OooO0O0(new OooOo00(this));
                }
                j = jMax;
            } else if (backendResponse.OooO0OO() == BackendResponse.Status.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strOooO0oo = ((o0O0OOOo.OooOo00) it2.next()).OooO00o().OooO0oo();
                    if (map.containsKey(strOooO0oo)) {
                        map.put(strOooO0oo, Integer.valueOf(((Integer) map.get(strOooO0oo)).intValue() + 1));
                    } else {
                        map.put(strOooO0oo, 1);
                    }
                }
                this.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooOO0
                    @Override // o0O0OOo.o00Oo0.OooO00o
                    public final Object OooO0O0() {
                        OooOo oooOo = this.f35569OooO0Oo;
                        Map map2 = map;
                        Objects.requireNonNull(oooOo);
                        for (Map.Entry entry : map2.entrySet()) {
                            oooOo.f35581OooO.OooO0o(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                        }
                        return null;
                    }
                });
            }
            oooO00o = backendResponse;
        }
        this.f35586OooO0o.OooO0O0(new o00Oo0.OooO00o() { // from class: o0O0OOO.OooOOO
            @Override // o0O0OOo.o00Oo0.OooO00o
            public final Object OooO0O0() {
                OooOo oooOo = this.f35573OooO0Oo;
                oooOo.f35584OooO0OO.o00000Oo(o0oo00o2, oooOo.f35588OooO0oO.getTime() + j);
                return null;
            }
        });
        return oooO00o;
    }
}
