package p466o0OooO0;

import com.google.android.exoplayer2.OooO00o;
import com.google.android.exoplayer2.o000oOoO;
import java.util.Collection;
import java.util.HashMap;
import p310o0O0o0oo.o00O;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 extends OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000oOoO[] f40523OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f40524OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f40525OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int[] f40526OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int[] f40527OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Object[] f40528OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final HashMap<Object, Integer> f40529OooOO0O;

    public o000O0(Collection<? extends o000O000> collection, o00O o00o2) {
        super(o00o2);
        int size = collection.size();
        this.f40526OooO0oO = new int[size];
        this.f40527OooO0oo = new int[size];
        this.f40523OooO = new o000oOoO[size];
        this.f40528OooOO0 = new Object[size];
        this.f40529OooOO0O = new HashMap<>();
        int iOooOOO = 0;
        int iOooO0oo = 0;
        int i = 0;
        for (o000O000 o000o001 : collection) {
            this.f40523OooO[i] = o000o001.OooO0O0();
            this.f40527OooO0oo[i] = iOooOOO;
            this.f40526OooO0oO[i] = iOooO0oo;
            iOooOOO += this.f40523OooO[i].OooOOO();
            iOooO0oo += this.f40523OooO[i].OooO0oo();
            this.f40528OooOO0[i] = o000o001.OooO00o();
            this.f40529OooOO0O.put(this.f40528OooOO0[i], Integer.valueOf(i));
            i++;
        }
        this.f40525OooO0o0 = iOooOOO;
        this.f40524OooO0o = iOooO0oo;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooO0oo() {
        return this.f40524OooO0o;
    }

    @Override // com.google.android.exoplayer2.o000oOoO
    public final int OooOOO() {
        return this.f40525OooO0o0;
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOOOo(Object obj) {
        Integer num = this.f40529OooOO0O.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOOo(int i) {
        return o000OOo0.OooO0Oo(this.f40527OooO0oo, i + 1);
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOOo0(int i) {
        return o000OOo0.OooO0Oo(this.f40526OooO0oO, i + 1);
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final Object OooOOoo(int i) {
        return this.f40528OooOO0[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOo0(int i) {
        return this.f40527OooO0oo[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final int OooOo00(int i) {
        return this.f40526OooO0oO[i];
    }

    @Override // com.google.android.exoplayer2.OooO00o
    public final o000oOoO OooOo0o(int i) {
        return this.f40523OooO[i];
    }
}
