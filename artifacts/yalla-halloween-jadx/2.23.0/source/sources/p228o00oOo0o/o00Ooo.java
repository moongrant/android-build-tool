package p228o00oOo0o;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import p224o00oOOoO.o00O00o0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo implements o00O00o0<o00Ooo> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final o00000 f39939OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final long f39940OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final long f39941OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f39942OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f39943OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final long f39944OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f39945OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final long f39946OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final long f39947OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public final o000OOo f39948OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final Uri f39949OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final o0Oo0oo f39950OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final List<o0OOO0o> f39951OooOOO0;

    public o00Ooo(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable o0Oo0oo o0oo0oo2, @Nullable o00000 o00000Var, @Nullable o000OOo o000ooo2, @Nullable Uri uri, ArrayList arrayList) {
        this.f39940OooO00o = j;
        this.f39941OooO0O0 = j2;
        this.f39942OooO0OO = j3;
        this.f39943OooO0Oo = z;
        this.f39945OooO0o0 = j4;
        this.f39944OooO0o = j5;
        this.f39946OooO0oO = j6;
        this.f39947OooO0oo = j7;
        this.f39950OooOO0o = o0oo0oo2;
        this.f39939OooO = o00000Var;
        this.f39949OooOO0O = uri;
        this.f39948OooOO0 = o000ooo2;
        this.f39951OooOOO0 = arrayList;
    }

    @Override // p224o00oOOoO.o00O00o0
    public final o00Ooo OooO00o(List list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= OooO0OO()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f12883OooO0Oo != i) {
                long jOooO0Oo = OooO0Oo(i);
                if (jOooO0Oo != -9223372036854775807L) {
                    j += jOooO0Oo;
                }
            } else {
                o0OOO0o o0ooo0oOooO0O0 = OooO0O0(i);
                List<o00O0O> list2 = o0ooo0oOooO0O0.f39978OooO0OO;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.f12883OooO0Oo;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.f12885OooO0o0;
                    o00O0O o00o0o2 = list2.get(i3);
                    List<oo0o0Oo> list3 = o00o0o2.f39931OooO0OO;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.f12884OooO0o));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.f12883OooO0Oo != i2) {
                            break;
                        }
                    } while (streamKey.f12885OooO0o0 == i3);
                    List<o00O0O> list4 = list2;
                    arrayList2.add(new o00O0O(o00o0o2.f39929OooO00o, o00o0o2.f39930OooO0O0, arrayList3, o00o0o2.f39932OooO0Oo, o00o0o2.f39934OooO0o0, o00o0o2.f39933OooO0o));
                    if (streamKey.f12883OooO0Oo != i2) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new o0OOO0o(o0ooo0oOooO0O0.f39976OooO00o, o0ooo0oOooO0O0.f39977OooO0O0 - j, arrayList2, o0ooo0oOooO0O0.f39979OooO0Oo));
            }
            i++;
        }
        long j2 = this.f39941OooO0O0;
        return new o00Ooo(this.f39940OooO00o, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.f39942OooO0OO, this.f39943OooO0Oo, this.f39945OooO0o0, this.f39944OooO0o, this.f39946OooO0oO, this.f39947OooO0oo, this.f39950OooOO0o, this.f39939OooO, this.f39948OooOO0, this.f39949OooOO0O, arrayList);
    }

    public final o0OOO0o OooO0O0(int i) {
        return this.f39951OooOOO0.get(i);
    }

    public final int OooO0OO() {
        return this.f39951OooOOO0.size();
    }

    public final long OooO0Oo(int i) {
        long j;
        long j2;
        List<o0OOO0o> list = this.f39951OooOOO0;
        if (i == list.size() - 1) {
            j = this.f39941OooO0O0;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = list.get(i).f39977OooO0O0;
        } else {
            j = list.get(i + 1).f39977OooO0O0;
            j2 = list.get(i).f39977OooO0O0;
        }
        return j - j2;
    }

    public final long OooO0o0(int i) {
        return o0O00.Oooo0O0(OooO0Oo(i));
    }
}
