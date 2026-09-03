package com.google.android.gms.internal.measurement;

import com.qiniu.android.storage.Configuration;
import com.yallatech.support.platform.share.bean.ShareRequest;
import com.zego.zegoliveroom.constants.ZegoConstants;
import java.util.List;
import kotlin.io.ConstantsKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgd extends zzlb implements zzmj {
    public static final /* synthetic */ int zza = 0;
    private static final zzgd zzd;
    private String zzA;
    private long zzB;
    private int zzC;
    private String zzD;
    private String zzE;
    private boolean zzF;
    private zzli zzG;
    private String zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private String zzL;
    private long zzM;
    private long zzN;
    private String zzO;
    private String zzP;
    private int zzQ;
    private String zzR;
    private zzgg zzS;
    private zzlg zzT;
    private long zzU;
    private long zzV;
    private String zzW;
    private String zzX;
    private int zzY;
    private boolean zzZ;
    private String zzaa;
    private boolean zzab;
    private zzfz zzac;
    private String zzad;
    private zzli zzae;
    private String zzaf;
    private long zzag;
    private int zze;
    private int zzf;
    private int zzg;
    private zzli zzh;
    private zzli zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private String zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private int zzs;
    private String zzt;
    private String zzu;
    private String zzv;
    private long zzw;
    private long zzx;
    private String zzy;
    private boolean zzz;

    static {
        zzgd zzgdVar = new zzgd();
        zzd = zzgdVar;
        zzlb.OooO(zzgd.class, zzgdVar);
    }

    public zzgd() {
        o0O o0o = o0O.f15517OooO0oO;
        this.zzh = o0o;
        this.zzi = o0o;
        this.zzo = "";
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzt = "";
        this.zzu = "";
        this.zzv = "";
        this.zzy = "";
        this.zzA = "";
        this.zzD = "";
        this.zzE = "";
        this.zzG = o0o;
        this.zzH = "";
        this.zzL = "";
        this.zzO = "";
        this.zzP = "";
        this.zzR = "";
        this.zzT = o0O00O.f15532OooO0oO;
        this.zzW = "";
        this.zzX = "";
        this.zzaa = "";
        this.zzad = "";
        this.zzae = o0o;
        this.zzaf = "";
    }

    public static /* synthetic */ void OooOOO(zzgd zzgdVar, int i) {
        zzgdVar.zzf |= 2;
        zzgdVar.zzQ = i;
    }

    public static /* synthetic */ void OooOOO0(zzgd zzgdVar) {
        zzgdVar.zze &= Integer.MAX_VALUE;
        zzgdVar.zzO = zzd.zzO;
    }

    public static /* synthetic */ void OooOOOO(zzgd zzgdVar, int i, zzft zzftVar) {
        zzftVar.getClass();
        zzgdVar.o0ooOO0();
        zzgdVar.zzh.set(i, zzftVar);
    }

    public static /* synthetic */ void OooOOOo(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= 4;
        zzgdVar.zzR = str;
    }

    public static /* synthetic */ void OooOOo(zzgd zzgdVar, Iterable iterable) {
        zzlg zzlgVar = zzgdVar.zzT;
        if (!zzlgVar.zzc()) {
            int size = zzlgVar.size();
            zzgdVar.zzT = zzlgVar.zzd(size == 0 ? 10 : size + size);
        }
        zzjk.OooO0O0(iterable, zzgdVar.zzT);
    }

    public static /* synthetic */ void OooOOo0(zzgd zzgdVar, zzgg zzggVar) {
        zzggVar.getClass();
        zzgdVar.zzS = zzggVar;
        zzgdVar.zzf |= 8;
    }

    public static /* synthetic */ void OooOOoo(zzgd zzgdVar, zzft zzftVar) {
        zzftVar.getClass();
        zzgdVar.o0ooOO0();
        zzgdVar.zzh.add(zzftVar);
    }

    public static /* synthetic */ void OooOo(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 4096;
        zzgdVar.zzu = str;
    }

    public static /* synthetic */ void OooOo0(zzgd zzgdVar, long j) {
        zzgdVar.zzf |= 32;
        zzgdVar.zzV = j;
    }

    public static /* synthetic */ void OooOo00(zzgd zzgdVar, long j) {
        zzgdVar.zzf |= 16;
        zzgdVar.zzU = j;
    }

    public static /* synthetic */ void OooOo0O(zzgd zzgdVar, String str) {
        zzgdVar.zzf |= 128;
        zzgdVar.zzX = str;
    }

    public static /* synthetic */ void OooOo0o(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 2048;
        zzgdVar.zzt = str;
    }

    public static /* synthetic */ void OooOoO(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 16384;
        zzgdVar.zzw = j;
    }

    public static /* synthetic */ void OooOoO0(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 8192;
        zzgdVar.zzv = str;
    }

    public static /* synthetic */ void OooOoOO(zzgd zzgdVar) {
        zzgdVar.zze |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
        zzgdVar.zzx = 79000L;
    }

    public static /* synthetic */ void OooOoo(zzgd zzgdVar) {
        zzgdVar.zze &= -65537;
        zzgdVar.zzy = zzd.zzy;
    }

    public static /* synthetic */ void OooOoo0(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 65536;
        zzgdVar.zzy = str;
    }

    public static /* synthetic */ void OooOooO(zzgd zzgdVar, boolean z) {
        zzgdVar.zze |= 131072;
        zzgdVar.zzz = z;
    }

    public static /* synthetic */ void OooOooo(zzgd zzgdVar) {
        zzgdVar.zze &= -131073;
        zzgdVar.zzz = false;
    }

    public static /* synthetic */ void Oooo(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 16777216;
        zzgdVar.zzH = str;
    }

    public static /* synthetic */ void Oooo0(zzgd zzgdVar, int i) {
        zzgdVar.zze |= ZegoConstants.ErrorMask.RoomServerErrorMask;
        zzgdVar.zzC = i;
    }

    public static /* synthetic */ void Oooo000(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 262144;
        zzgdVar.zzA = str;
    }

    public static /* synthetic */ void Oooo00O(zzgd zzgdVar) {
        zzgdVar.zze &= -262145;
        zzgdVar.zzA = zzd.zzA;
    }

    public static /* synthetic */ void Oooo00o(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 524288;
        zzgdVar.zzB = j;
    }

    public static /* synthetic */ void Oooo0O0(zzgd zzgdVar, String str) {
        zzgdVar.zze |= 2097152;
        zzgdVar.zzD = str;
    }

    public static /* synthetic */ void Oooo0OO(zzgd zzgdVar) {
        zzgdVar.zze &= -2097153;
        zzgdVar.zzD = zzd.zzD;
    }

    public static /* synthetic */ void Oooo0o(zzgd zzgdVar, boolean z) {
        zzgdVar.zze |= 8388608;
        zzgdVar.zzF = z;
    }

    public static /* synthetic */ void Oooo0o0(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= Configuration.BLOCK_SIZE;
        zzgdVar.zzE = str;
    }

    public static /* synthetic */ void Oooo0oO(zzgd zzgdVar, Iterable iterable) {
        zzli zzliVar = zzgdVar.zzG;
        if (!zzliVar.zzc()) {
            zzgdVar.zzG = zzlb.OooO0o(zzliVar);
        }
        zzjk.OooO0O0(iterable, zzgdVar.zzG);
    }

    public static void Oooo0oo(zzgd zzgdVar) {
        zzgdVar.zzG = o0O.f15517OooO0oO;
    }

    public static /* synthetic */ void OoooO(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 536870912;
        zzgdVar.zzM = j;
    }

    public static /* synthetic */ void OoooO0(zzgd zzgdVar) {
        zzgdVar.zze |= 1;
        zzgdVar.zzg = 1;
    }

    public static /* synthetic */ void OoooO00(zzgd zzgdVar, int i) {
        zzgdVar.zze |= 33554432;
        zzgdVar.zzI = i;
    }

    public static /* synthetic */ void OoooO0O(zzgd zzgdVar) {
        zzgdVar.zze &= -268435457;
        zzgdVar.zzL = zzd.zzL;
    }

    public static /* synthetic */ void OoooOO0(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.o0ooOO0();
        zzjk.OooO0O0(iterable, zzgdVar.zzh);
    }

    public static /* synthetic */ void OoooOOO(zzgd zzgdVar) {
        zzgdVar.zzf &= -8193;
        zzgdVar.zzad = zzd.zzad;
    }

    public static /* synthetic */ void OoooOOo(zzgd zzgdVar, Iterable iterable) {
        zzli zzliVar = zzgdVar.zzae;
        if (!zzliVar.zzc()) {
            zzgdVar.zzae = zzlb.OooO0o(zzliVar);
        }
        zzjk.OooO0O0(iterable, zzgdVar.zzae);
    }

    public static void OoooOo0(zzgd zzgdVar) {
        zzgdVar.zzh = o0O.f15517OooO0oO;
    }

    public static /* synthetic */ void OoooOoO(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= 16384;
        zzgdVar.zzaf = str;
    }

    public static /* synthetic */ void OoooOoo(zzgd zzgdVar, long j) {
        zzgdVar.zzf |= ShareRequest.THUMB_DATA_SIZE_LIMIT;
        zzgdVar.zzag = j;
    }

    public static /* synthetic */ void Ooooo00(zzgd zzgdVar, int i) {
        zzgdVar.o0ooOO0();
        zzgdVar.zzh.remove(i);
    }

    public static /* synthetic */ void Ooooo0o(zzgd zzgdVar, int i, zzgm zzgmVar) {
        zzgmVar.getClass();
        zzgdVar.o0ooOOo();
        zzgdVar.zzi.set(i, zzgmVar);
    }

    public static /* synthetic */ void OooooO0(zzgd zzgdVar, zzgm zzgmVar) {
        zzgmVar.getClass();
        zzgdVar.o0ooOOo();
        zzgdVar.zzi.add(zzgmVar);
    }

    public static /* synthetic */ void OooooOO(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.o0ooOOo();
        zzjk.OooO0O0(iterable, zzgdVar.zzi);
    }

    public static /* synthetic */ void OooooOo(zzgd zzgdVar, int i) {
        zzgdVar.o0ooOOo();
        zzgdVar.zzi.remove(i);
    }

    public static /* synthetic */ void Oooooo(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 4;
        zzgdVar.zzk = j;
    }

    public static /* synthetic */ void Oooooo0(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 2;
        zzgdVar.zzj = j;
    }

    public static /* synthetic */ void OoooooO(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 8;
        zzgdVar.zzl = j;
    }

    public static /* synthetic */ void Ooooooo(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 16;
        zzgdVar.zzm = j;
    }

    public static /* synthetic */ void o000oOoO(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zzf |= 8192;
        zzgdVar.zzad = str;
    }

    public static /* synthetic */ void o00O0O(zzgd zzgdVar) {
        zzgdVar.zze &= -33;
        zzgdVar.zzn = 0L;
    }

    public static /* synthetic */ void o00Oo0(zzgd zzgdVar) {
        zzgdVar.zze |= 64;
        zzgdVar.zzo = "android";
    }

    public static /* synthetic */ void o00Ooo(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= 128;
        zzgdVar.zzp = str;
    }

    public static /* synthetic */ void o00o0O(zzgd zzgdVar) {
        zzgdVar.zze &= -129;
        zzgdVar.zzp = zzd.zzp;
    }

    public static /* synthetic */ void o00oO0O(zzgd zzgdVar, int i) {
        zzgdVar.zze |= LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        zzgdVar.zzs = i;
    }

    public static /* synthetic */ void o00oO0o(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= ConstantsKt.MINIMUM_BLOCK_SIZE;
        zzgdVar.zzr = str;
    }

    public static /* synthetic */ void o00ooo(zzgd zzgdVar, String str) {
        str.getClass();
        zzgdVar.zze |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        zzgdVar.zzq = str;
    }

    public static /* synthetic */ void o0OoOo0(zzgd zzgdVar) {
        zzgdVar.zze &= -17;
        zzgdVar.zzm = 0L;
    }

    public static /* synthetic */ void oo000o(zzgd zzgdVar) {
        zzgdVar.zze &= -257;
        zzgdVar.zzq = zzd.zzq;
    }

    public static /* synthetic */ void ooOO(zzgd zzgdVar, long j) {
        zzgdVar.zze |= 32;
        zzgdVar.zzn = j;
    }

    public static zzgc zzu() {
        return (zzgc) zzd.OooO0Oo();
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    public final Object OooOO0o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 0;
        if (i2 == 2) {
            return new o0OO000(zzd, "\u00015\u0000\u0002\u0001C5\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5ဌ(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/", new Object[]{"zze", "zzf", "zzg", "zzh", zzft.class, "zzi", zzgm.class, "zzj", "zzk", "zzl", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzm", "zzF", "zzG", zzfp.class, "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", o00oOoo.f15516OooO00o, "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag"});
        }
        if (i2 == 3) {
            return new zzgd();
        }
        if (i2 == 4) {
            return new zzgc(i3);
        }
        if (i2 != 5) {
            return null;
        }
        return zzd;
    }

    public final void o0ooOO0() {
        zzli zzliVar = this.zzh;
        if (zzliVar.zzc()) {
            return;
        }
        this.zzh = zzlb.OooO0o(zzliVar);
    }

    public final void o0ooOOo() {
        zzli zzliVar = this.zzi;
        if (zzliVar.zzc()) {
            return;
        }
        this.zzi = zzlb.OooO0o(zzliVar);
    }

    public final String zzA() {
        return this.zzt;
    }

    public final String zzB() {
        return this.zzv;
    }

    public final String zzC() {
        return this.zzX;
    }

    public final String zzD() {
        return this.zzq;
    }

    public final String zzE() {
        return this.zzO;
    }

    public final String zzF() {
        return this.zzH;
    }

    public final String zzG() {
        return this.zzE;
    }

    public final String zzH() {
        return this.zzD;
    }

    public final String zzI() {
        return this.zzp;
    }

    public final String zzJ() {
        return this.zzo;
    }

    public final String zzK() {
        return this.zzy;
    }

    public final String zzL() {
        return this.zzad;
    }

    public final String zzM() {
        return this.zzr;
    }

    public final List zzN() {
        return this.zzG;
    }

    public final List zzO() {
        return this.zzh;
    }

    public final List zzP() {
        return this.zzi;
    }

    public final int zza() {
        return this.zzI;
    }

    public final boolean zzaY() {
        return this.zzz;
    }

    public final boolean zzaZ() {
        return this.zzF;
    }

    public final int zzb() {
        return this.zzC;
    }

    public final boolean zzba() {
        return (this.zze & 33554432) != 0;
    }

    public final boolean zzbb() {
        return (this.zze & ZegoConstants.ErrorMask.RoomServerErrorMask) != 0;
    }

    public final boolean zzbc() {
        return (this.zze & 536870912) != 0;
    }

    public final boolean zzbd() {
        return (this.zzf & 128) != 0;
    }

    public final boolean zzbe() {
        return (this.zze & 524288) != 0;
    }

    public final boolean zzbf() {
        return (this.zzf & 16) != 0;
    }

    public final boolean zzbg() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzbh() {
        return (this.zze & 16384) != 0;
    }

    public final boolean zzbi() {
        return (this.zze & 131072) != 0;
    }

    public final boolean zzbj() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzbk() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzbl() {
        return (this.zze & 1) != 0;
    }

    public final boolean zzbm() {
        return (this.zzf & 2) != 0;
    }

    public final boolean zzbn() {
        return (this.zze & 8388608) != 0;
    }

    public final boolean zzbo() {
        return (this.zzf & 8192) != 0;
    }

    public final boolean zzbp() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzbq() {
        return (this.zzf & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0;
    }

    public final boolean zzbr() {
        return (this.zze & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0;
    }

    public final boolean zzbs() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzbt() {
        return (this.zze & ShareRequest.THUMB_DATA_SIZE_LIMIT) != 0;
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzQ;
    }

    public final int zzf() {
        return this.zzs;
    }

    public final int zzg() {
        return this.zzi.size();
    }

    public final long zzh() {
        return this.zzM;
    }

    public final long zzi() {
        return this.zzB;
    }

    public final long zzj() {
        return this.zzU;
    }

    public final long zzk() {
        return this.zzl;
    }

    public final long zzm() {
        return this.zzw;
    }

    public final long zzn() {
        return this.zzn;
    }

    public final long zzo() {
        return this.zzm;
    }

    public final long zzp() {
        return this.zzk;
    }

    public final long zzq() {
        return this.zzag;
    }

    public final long zzr() {
        return this.zzj;
    }

    public final long zzs() {
        return this.zzx;
    }

    public final zzft zzt(int i) {
        return (zzft) this.zzh.get(i);
    }

    public final zzgm zzw(int i) {
        return (zzgm) this.zzi.get(i);
    }

    public final String zzx() {
        return this.zzR;
    }

    public final String zzy() {
        return this.zzu;
    }

    public final String zzz() {
        return this.zzA;
    }
}
