package com.google.android.gms.internal.measurement;

import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.oo0o0Oo;
import com.yallatech.support.platform.share.bean.ShareRequest;
import java.util.List;
import java.util.Objects;
import p334o0OO00o.o00oOoo;
import p334o0OO00o.o0O000;
import p334o0OO00o.o0O0OO0;
import p334o0OO00o.o0O0OOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgc extends zzke implements zzlm {
    public static final /* synthetic */ int zza = 0;
    private static final zzgc zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private zzkl zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private zzgf zzT;
    private zzkj zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private zzfy zzad;
    private String zzae;
    private zzkl zzaf;
    private String zzag;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzkl zzi;
    private zzkl zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;

    static {
        zzgc zzgcVar = new zzgc();
        zze = zzgcVar;
        zzke.OooO0oO(zzgc.class, zzgcVar);
    }

    public zzgc() {
        o0O0OO0 o0o0oo0 = o0O0OO0.f37394Oooo;
        this.zzi = o0o0oo0;
        this.zzj = o0o0oo0;
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = o0o0oo0;
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = o0O000.f37354Oooo;
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
        this.zzae = "";
        this.zzaf = o0o0oo0;
        this.zzag = "";
    }

    public static /* synthetic */ void OooOO0O(zzgc zzgcVar) {
        zzgcVar.zzf &= Integer.MAX_VALUE;
        zzgcVar.zzP = zze.zzP;
    }

    public static /* synthetic */ void OooOO0o(zzgc zzgcVar, int i) {
        zzgcVar.zzg |= 2;
        zzgcVar.zzR = i;
    }

    public static /* synthetic */ void OooOOO(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzg |= 4;
        zzgcVar.zzS = str;
    }

    public static /* synthetic */ void OooOOO0(zzgc zzgcVar, int i, zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        zzgcVar.oo000o();
        zzgcVar.zzi.set(i, zzfsVar);
    }

    public static /* synthetic */ void OooOOOO(zzgc zzgcVar, zzgf zzgfVar) {
        Objects.requireNonNull(zzgfVar);
        zzgcVar.zzT = zzgfVar;
        zzgcVar.zzg |= 8;
    }

    public static /* synthetic */ void OooOOOo(zzgc zzgcVar, Iterable iterable) {
        zzkj zzkjVar = zzgcVar.zzU;
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzgcVar.zzU = zzkjVar.zzd(size == 0 ? 10 : size + size);
        }
        zzin.OooO0O0(iterable, zzgcVar.zzU);
    }

    public static /* synthetic */ void OooOOo(zzgc zzgcVar, long j) {
        zzgcVar.zzg |= 16;
        zzgcVar.zzV = j;
    }

    public static /* synthetic */ void OooOOo0(zzgc zzgcVar, zzfs zzfsVar) {
        Objects.requireNonNull(zzfsVar);
        zzgcVar.oo000o();
        zzgcVar.zzi.add(zzfsVar);
    }

    public static /* synthetic */ void OooOOoo(zzgc zzgcVar, long j) {
        zzgcVar.zzg |= 32;
        zzgcVar.zzW = j;
    }

    public static /* synthetic */ void OooOo(zzgc zzgcVar) {
        zzgcVar.zzf |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
        zzgcVar.zzy = 73000L;
    }

    public static /* synthetic */ void OooOo0(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.oo000o();
        zzin.OooO0O0(iterable, zzgcVar.zzi);
    }

    public static /* synthetic */ void OooOo00(zzgc zzgcVar, String str) {
        zzgcVar.zzg |= 128;
        zzgcVar.zzY = str;
    }

    public static /* synthetic */ void OooOo0O(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 8192;
        zzgcVar.zzw = str;
    }

    public static /* synthetic */ void OooOo0o(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 16384;
        zzgcVar.zzx = j;
    }

    public static /* synthetic */ void OooOoO(zzgc zzgcVar) {
        zzgcVar.zzf &= -65537;
        zzgcVar.zzz = zze.zzz;
    }

    public static /* synthetic */ void OooOoO0(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 65536;
        zzgcVar.zzz = str;
    }

    public static /* synthetic */ void OooOoOO(zzgc zzgcVar, boolean z) {
        zzgcVar.zzf |= 131072;
        zzgcVar.zzA = z;
    }

    public static /* synthetic */ void OooOoo(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 262144;
        zzgcVar.zzB = str;
    }

    public static /* synthetic */ void OooOoo0(zzgc zzgcVar) {
        zzgcVar.zzf &= -131073;
        zzgcVar.zzA = false;
    }

    public static /* synthetic */ void OooOooO(zzgc zzgcVar) {
        zzgcVar.zzf &= -262145;
        zzgcVar.zzB = zze.zzB;
    }

    public static /* synthetic */ void OooOooo(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 524288;
        zzgcVar.zzC = j;
    }

    public static /* synthetic */ void Oooo(zzgc zzgcVar) {
        zzgcVar.zzf &= -268435457;
        zzgcVar.zzM = zze.zzM;
    }

    public static /* synthetic */ void Oooo0(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 4194304;
        zzgcVar.zzF = str;
    }

    public static /* synthetic */ void Oooo000(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 1048576;
        zzgcVar.zzD = i;
    }

    public static /* synthetic */ void Oooo00O(zzgc zzgcVar, String str) {
        zzgcVar.zzf |= 2097152;
        zzgcVar.zzE = str;
    }

    public static /* synthetic */ void Oooo00o(zzgc zzgcVar) {
        zzgcVar.zzf &= -2097153;
        zzgcVar.zzE = zze.zzE;
    }

    public static /* synthetic */ void Oooo0O0(zzgc zzgcVar, boolean z) {
        zzgcVar.zzf |= 8388608;
        zzgcVar.zzG = z;
    }

    public static /* synthetic */ void Oooo0OO(zzgc zzgcVar, Iterable iterable) {
        zzkl zzklVar = zzgcVar.zzH;
        if (!zzklVar.zzc()) {
            zzgcVar.zzH = zzke.OooO0o0(zzklVar);
        }
        zzin.OooO0O0(iterable, zzgcVar.zzH);
    }

    public static /* synthetic */ void Oooo0o(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 16777216;
        zzgcVar.zzI = str;
    }

    public static void Oooo0o0(zzgc zzgcVar) {
        zzgcVar.zzH = o0O0OO0.f37394Oooo;
    }

    public static /* synthetic */ void Oooo0oO(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 33554432;
        zzgcVar.zzJ = i;
    }

    public static /* synthetic */ void Oooo0oo(zzgc zzgcVar) {
        zzgcVar.zzf |= 1;
        zzgcVar.zzh = 1;
    }

    public static /* synthetic */ void OoooO(zzgc zzgcVar, Iterable iterable) {
        zzkl zzklVar = zzgcVar.zzaf;
        if (!zzklVar.zzc()) {
            zzgcVar.zzaf = zzke.OooO0o0(zzklVar);
        }
        zzin.OooO0O0(iterable, zzgcVar.zzaf);
    }

    public static /* synthetic */ void OoooO0(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzg |= 8192;
        zzgcVar.zzae = str;
    }

    public static /* synthetic */ void OoooO00(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 536870912;
        zzgcVar.zzN = j;
    }

    public static /* synthetic */ void OoooO0O(zzgc zzgcVar) {
        zzgcVar.zzg &= -8193;
        zzgcVar.zzae = zze.zzae;
    }

    public static void OoooOO0(zzgc zzgcVar) {
        zzgcVar.zzi = o0O0OO0.f37394Oooo;
    }

    public static /* synthetic */ void OoooOOO(zzgc zzgcVar, int i) {
        zzgcVar.oo000o();
        zzgcVar.zzi.remove(i);
    }

    public static /* synthetic */ void OoooOOo(zzgc zzgcVar, int i, zzgl zzglVar) {
        Objects.requireNonNull(zzglVar);
        zzgcVar.o00oO0o();
        zzgcVar.zzj.set(i, zzglVar);
    }

    public static /* synthetic */ void OoooOo0(zzgc zzgcVar, zzgl zzglVar) {
        Objects.requireNonNull(zzglVar);
        zzgcVar.o00oO0o();
        zzgcVar.zzj.add(zzglVar);
    }

    public static /* synthetic */ void OoooOoO(zzgc zzgcVar, Iterable iterable) {
        zzgcVar.o00oO0o();
        zzin.OooO0O0(iterable, zzgcVar.zzj);
    }

    public static /* synthetic */ void OoooOoo(zzgc zzgcVar, int i) {
        zzgcVar.o00oO0o();
        zzgcVar.zzj.remove(i);
    }

    public static /* synthetic */ void Ooooo00(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 2;
        zzgcVar.zzk = j;
    }

    public static /* synthetic */ void Ooooo0o(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 4;
        zzgcVar.zzl = j;
    }

    public static /* synthetic */ void OooooO0(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 8;
        zzgcVar.zzm = j;
    }

    public static /* synthetic */ void OooooOO(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 16;
        zzgcVar.zzn = j;
    }

    public static /* synthetic */ void OooooOo(zzgc zzgcVar) {
        zzgcVar.zzf &= -17;
        zzgcVar.zzn = 0L;
    }

    public static /* synthetic */ void Oooooo(zzgc zzgcVar) {
        zzgcVar.zzf &= -33;
        zzgcVar.zzo = 0L;
    }

    public static /* synthetic */ void Oooooo0(zzgc zzgcVar, long j) {
        zzgcVar.zzf |= 32;
        zzgcVar.zzo = j;
    }

    public static /* synthetic */ void OoooooO(zzgc zzgcVar) {
        zzgcVar.zzf |= 64;
        zzgcVar.zzp = "android";
    }

    public static /* synthetic */ void Ooooooo(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 128;
        zzgcVar.zzq = str;
    }

    public static /* synthetic */ void o000oOoO(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzg |= 16384;
        zzgcVar.zzag = str;
    }

    public static /* synthetic */ void o00O0O(zzgc zzgcVar) {
        zzgcVar.zzf &= -257;
        zzgcVar.zzr = zze.zzr;
    }

    public static /* synthetic */ void o00Oo0(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 512;
        zzgcVar.zzs = str;
    }

    public static /* synthetic */ void o00Ooo(zzgc zzgcVar, int i) {
        zzgcVar.zzf |= 1024;
        zzgcVar.zzt = i;
    }

    public static /* synthetic */ void o00o0O(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= RecyclerView.oo0o0Oo.FLAG_MOVED;
        zzgcVar.zzu = str;
    }

    public static /* synthetic */ void o00ooo(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 4096;
        zzgcVar.zzv = str;
    }

    public static /* synthetic */ void o0OoOo0(zzgc zzgcVar) {
        zzgcVar.zzf &= -129;
        zzgcVar.zzq = zze.zzq;
    }

    public static /* synthetic */ void ooOO(zzgc zzgcVar, String str) {
        Objects.requireNonNull(str);
        zzgcVar.zzf |= 256;
        zzgcVar.zzr = str;
    }

    public static zzgb zzt() {
        return (zzgb) zze.OooO0oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzke
    public final Object OooOO0(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new o0O0OOO0(zze, "\u00014\u0000\u0002\u0001A4\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.", new Object[]{"zzf", "zzg", "zzh", "zzi", zzfs.class, "zzj", zzgl.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", zzfo.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", o00oOoo.f37349OooO00o, "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i2 == 3) {
            return new zzgc();
        }
        oo0o0Oo oo0o0oo = null;
        if (i2 == 4) {
            return new zzgb(oo0o0oo);
        }
        if (i2 != 5) {
            return null;
        }
        return zze;
    }

    public final void o00oO0o() {
        zzkl zzklVar = this.zzj;
        if (zzklVar.zzc()) {
            return;
        }
        this.zzj = zzke.OooO0o0(zzklVar);
    }

    public final void oo000o() {
        zzkl zzklVar = this.zzi;
        if (zzklVar.zzc()) {
            return;
        }
        this.zzi = zzke.OooO0o0(zzklVar);
    }

    public final String zzA() {
        return this.zzw;
    }

    public final String zzB() {
        return this.zzY;
    }

    public final String zzC() {
        return this.zzr;
    }

    public final String zzD() {
        return this.zzP;
    }

    public final String zzE() {
        return this.zzI;
    }

    public final String zzF() {
        return this.zzF;
    }

    public final String zzG() {
        return this.zzE;
    }

    public final String zzH() {
        return this.zzq;
    }

    public final String zzI() {
        return this.zzp;
    }

    public final String zzJ() {
        return this.zzz;
    }

    public final String zzK() {
        return this.zzae;
    }

    public final String zzL() {
        return this.zzs;
    }

    public final List zzM() {
        return this.zzH;
    }

    public final List zzN() {
        return this.zzi;
    }

    public final List zzO() {
        return this.zzj;
    }

    public final int zza() {
        return this.zzJ;
    }

    public final boolean zzaW() {
        return this.zzA;
    }

    public final boolean zzaX() {
        return this.zzG;
    }

    public final boolean zzaY() {
        return (this.zzf & 33554432) != 0;
    }

    public final boolean zzaZ() {
        return (this.zzf & 1048576) != 0;
    }

    public final int zzb() {
        return this.zzD;
    }

    public final boolean zzba() {
        return (this.zzf & 536870912) != 0;
    }

    public final boolean zzbb() {
        return (this.zzg & 128) != 0;
    }

    public final boolean zzbc() {
        return (this.zzf & 524288) != 0;
    }

    public final boolean zzbd() {
        return (this.zzg & 16) != 0;
    }

    public final boolean zzbe() {
        return (this.zzf & 8) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 16384) != 0;
    }

    public final boolean zzbg() {
        return (this.zzf & 131072) != 0;
    }

    public final boolean zzbh() {
        return (this.zzf & 32) != 0;
    }

    public final boolean zzbi() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbj() {
        return (this.zzf & 1) != 0;
    }

    public final boolean zzbk() {
        return (this.zzg & 2) != 0;
    }

    public final boolean zzbl() {
        return (this.zzf & 8388608) != 0;
    }

    public final boolean zzbm() {
        return (this.zzg & 8192) != 0;
    }

    public final boolean zzbn() {
        return (this.zzf & 4) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 1024) != 0;
    }

    public final boolean zzbp() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0;
    }

    public final int zzc() {
        return this.zzi.size();
    }

    public final int zzd() {
        return this.zzh;
    }

    public final int zze() {
        return this.zzR;
    }

    public final int zzf() {
        return this.zzt;
    }

    public final int zzg() {
        return this.zzj.size();
    }

    public final long zzh() {
        return this.zzN;
    }

    public final long zzi() {
        return this.zzC;
    }

    public final long zzj() {
        return this.zzV;
    }

    public final long zzk() {
        return this.zzm;
    }

    public final long zzm() {
        return this.zzx;
    }

    public final long zzn() {
        return this.zzo;
    }

    public final long zzo() {
        return this.zzn;
    }

    public final long zzp() {
        return this.zzl;
    }

    public final long zzq() {
        return this.zzk;
    }

    public final long zzr() {
        return this.zzy;
    }

    public final zzfs zzs(int i) {
        return (zzfs) this.zzi.get(i);
    }

    public final zzgl zzv(int i) {
        return (zzgl) this.zzj.get(i);
    }

    public final String zzw() {
        return this.zzS;
    }

    public final String zzx() {
        return this.zzv;
    }

    public final String zzy() {
        return this.zzB;
    }

    public final String zzz() {
        return this.zzu;
    }
}
