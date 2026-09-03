package com.google.android.gms.internal.measurement;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzc' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class zznd {
    public static final zznd zza;
    public static final zznd zzb;
    public static final zznd zzc;
    public static final zznd zzd;
    public static final zznd zze;
    public static final zznd zzf;
    public static final zznd zzg;
    public static final zznd zzh;
    public static final zznd zzi;
    public static final zznd zzj;
    public static final zznd zzk;
    public static final zznd zzl;
    public static final zznd zzm;
    public static final zznd zzn;
    public static final zznd zzo;
    public static final zznd zzp;
    public static final zznd zzq;
    public static final zznd zzr;
    private static final /* synthetic */ zznd[] zzs;
    private final zzne zzt;

    static {
        zznd zzndVar = new zznd("DOUBLE", 0, zzne.DOUBLE);
        zza = zzndVar;
        zznd zzndVar2 = new zznd("FLOAT", 1, zzne.FLOAT);
        zzb = zzndVar2;
        zzne zzneVar = zzne.LONG;
        zznd zzndVar3 = new zznd("INT64", 2, zzneVar);
        zzc = zzndVar3;
        zznd zzndVar4 = new zznd("UINT64", 3, zzneVar);
        zzd = zzndVar4;
        zzne zzneVar2 = zzne.INT;
        zznd zzndVar5 = new zznd("INT32", 4, zzneVar2);
        zze = zzndVar5;
        zznd zzndVar6 = new zznd("FIXED64", 5, zzneVar);
        zzf = zzndVar6;
        zznd zzndVar7 = new zznd("FIXED32", 6, zzneVar2);
        zzg = zzndVar7;
        zznd zzndVar8 = new zznd("BOOL", 7, zzne.BOOLEAN);
        zzh = zzndVar8;
        zznd zzndVar9 = new zznd("STRING", 8, zzne.STRING);
        zzi = zzndVar9;
        zzne zzneVar3 = zzne.MESSAGE;
        zznd zzndVar10 = new zznd("GROUP", 9, zzneVar3);
        zzj = zzndVar10;
        zznd zzndVar11 = new zznd("MESSAGE", 10, zzneVar3);
        zzk = zzndVar11;
        zznd zzndVar12 = new zznd("BYTES", 11, zzne.BYTE_STRING);
        zzl = zzndVar12;
        zznd zzndVar13 = new zznd("UINT32", 12, zzneVar2);
        zzm = zzndVar13;
        zznd zzndVar14 = new zznd("ENUM", 13, zzne.ENUM);
        zzn = zzndVar14;
        zznd zzndVar15 = new zznd("SFIXED32", 14, zzneVar2);
        zzo = zzndVar15;
        zznd zzndVar16 = new zznd("SFIXED64", 15, zzneVar);
        zzp = zzndVar16;
        zznd zzndVar17 = new zznd("SINT32", 16, zzneVar2);
        zzq = zzndVar17;
        zznd zzndVar18 = new zznd("SINT64", 17, zzneVar);
        zzr = zzndVar18;
        zzs = new zznd[]{zzndVar, zzndVar2, zzndVar3, zzndVar4, zzndVar5, zzndVar6, zzndVar7, zzndVar8, zzndVar9, zzndVar10, zzndVar11, zzndVar12, zzndVar13, zzndVar14, zzndVar15, zzndVar16, zzndVar17, zzndVar18};
    }

    public zznd(String str, int i, zzne zzneVar) {
        super(str, i);
        this.zzt = zzneVar;
    }

    public static zznd[] values() {
        return (zznd[]) zzs.clone();
    }

    public final zzne zza() {
        return this.zzt;
    }
}
