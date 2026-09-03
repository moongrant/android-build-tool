package o0OO0OoO;

import android.util.Log;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzel;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzfw;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzlb;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO0o extends o0OO0oO0 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final zzej f37829OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ OooO0OO f37830OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO0o(OooO0OO oooO0OO, String str, int i, zzej zzejVar) {
        super(str, i);
        this.f37830OooO0oo = oooO0OO;
        this.f37829OooO0oO = zzejVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:106:0x0311  */
    /* JADX WARN: Code duplicated, block: B:109:0x0323  */
    /* JADX WARN: Code duplicated, block: B:117:0x0362  */
    /* JADX WARN: Code duplicated, block: B:123:0x037f  */
    /* JADX WARN: Code duplicated, block: B:128:0x038d  */
    /* JADX WARN: Code duplicated, block: B:130:0x0393  */
    /* JADX WARN: Code duplicated, block: B:131:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:135:0x03b4  */
    /* JADX WARN: Code duplicated, block: B:138:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:144:0x0421 A[EDGE_INSN: B:144:0x0421->B:147:0x0479 BREAK  A[LOOP:1: B:60:0x01af->B:65:0x01e4]] */
    /* JADX WARN: Code duplicated, block: B:145:0x044d A[EDGE_INSN: B:145:0x044d->B:147:0x0479 BREAK  A[LOOP:1: B:60:0x01af->B:65:0x01e4]] */
    /* JADX WARN: Code duplicated, block: B:183:0x01ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x020f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x022d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0215 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0233 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x01f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x032d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x02e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x0479 A[EDGE_INSN: B:200:0x0479->B:147:0x0479 BREAK  A[LOOP:1: B:60:0x01af->B:65:0x01e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0477 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x0389 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0337 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x0479 A[EDGE_INSN: B:206:0x0479->B:147:0x0479 BREAK  A[LOOP:1: B:60:0x01af->B:65:0x01e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x03f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x03ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0479 A[EDGE_INSN: B:210:0x0479->B:147:0x0479 BREAK  A[LOOP:1: B:60:0x01af->B:65:0x01e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x03c6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0331 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x041f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:215:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e4 A[LOOP:1: B:60:0x01af->B:65:0x01e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:75:0x021f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0228  */
    /* JADX WARN: Code duplicated, block: B:82:0x023d  */
    /* JADX WARN: Code duplicated, block: B:83:0x0246  */
    /* JADX WARN: Code duplicated, block: B:87:0x0251  */
    /* JADX WARN: Code duplicated, block: B:92:0x029a  */
    /* JADX WARN: Code duplicated, block: B:97:0x02ae  */
    public final boolean OooO(Long l, Long l2, zzfs zzfsVar, long j, OooOOOO oooOOOO, boolean z) {
        HashSet hashSet;
        Iterator it;
        p021OooOooo.Oooo0 oooo0;
        Iterator it2;
        Iterator it3;
        zzel zzelVar;
        boolean z2;
        String strZze;
        Object orDefault;
        Boolean boolOooO0o;
        Boolean boolOooO0Oo;
        String str;
        Boolean boolOooO0oO;
        zzfw zzfwVar;
        Long lValueOf;
        Double dValueOf;
        zzel zzelVar2;
        String string;
        zzny.zzc();
        boolean zZzs = this.f37830OooO0oo.f37615OooO00o.zzf().zzs(this.f37835OooO00o, zzeb.zzW);
        long j2 = this.f37829OooO0oO.zzn() ? oooOOOO.f37509OooO0o0 : j;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        Boolean bool = null;
        if (Log.isLoggable(this.f37830OooO0oo.f37615OooO00o.zzay().zzq(), 2)) {
            this.f37830OooO0oo.f37615OooO00o.zzay().zzj().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(this.f37836OooO0O0), this.f37829OooO0oO.zzp() ? Integer.valueOf(this.f37829OooO0oO.zzb()) : null, this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(this.f37829OooO0oO.zzg()));
            zzem zzemVarZzj = this.f37830OooO0oo.f37615OooO00o.zzay().zzj();
            zzlb zzlbVarZzu = this.f37830OooO0oo.f37794OooO0O0.zzu();
            zzej zzejVar = this.f37829OooO0oO;
            Objects.requireNonNull(zzlbVarZzu);
            if (zzejVar == null) {
                string = "null";
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("\nevent_filter {\n");
                if (zzejVar.zzp()) {
                    zzlb.OooOO0O(sbOooO0o0, 0, "filter_id", Integer.valueOf(zzejVar.zzb()));
                }
                zzlb.OooOO0O(sbOooO0o0, 0, "event_name", zzlbVarZzu.f37615OooO00o.zzj().OooO0Oo(zzejVar.zzg()));
                String strOooO = zzlb.OooO(zzejVar.zzk(), zzejVar.zzm(), zzejVar.zzn());
                if (!strOooO.isEmpty()) {
                    zzlb.OooOO0O(sbOooO0o0, 0, "filter_type", strOooO);
                }
                if (zzejVar.zzo()) {
                    zzlb.OooOO0o(sbOooO0o0, 1, "event_count_filter", zzejVar.zzf());
                }
                if (zzejVar.zza() > 0) {
                    sbOooO0o0.append("  filters {\n");
                    Iterator it4 = zzejVar.zzh().iterator();
                    while (it4.hasNext()) {
                        zzlbVarZzu.OooO0oO(sbOooO0o0, 2, (zzel) it4.next());
                    }
                }
                zzlb.OooO0oo(sbOooO0o0, 1);
                sbOooO0o0.append("}\n}\n");
                string = sbOooO0o0.toString();
            }
            zzemVarZzj.zzb("Filter definition", string);
        }
        if (!this.f37829OooO0oO.zzp() || this.f37829OooO0oO.zzb() > 256) {
            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Invalid event filter ID. appId, id", zzeo.OooO0o0(this.f37835OooO00o), String.valueOf(this.f37829OooO0oO.zzp() ? Integer.valueOf(this.f37829OooO0oO.zzb()) : null));
            return false;
        }
        boolean z3 = this.f37829OooO0oO.zzk() || this.f37829OooO0oO.zzm() || this.f37829OooO0oO.zzn();
        if (z && !z3) {
            this.f37830OooO0oo.f37615OooO00o.zzay().zzj().zzc("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.f37836OooO0O0), this.f37829OooO0oO.zzp() ? Integer.valueOf(this.f37829OooO0oO.zzb()) : null);
            return true;
        }
        zzej zzejVar2 = this.f37829OooO0oO;
        String strZzh = zzfsVar.zzh();
        if (!zzejVar2.zzo()) {
            hashSet = new HashSet();
            it = zzejVar2.zzh().iterator();
            while (true) {
                if (it.hasNext()) {
                    oooo0 = new p021OooOooo.Oooo0();
                    it2 = zzfsVar.zzi().iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            it3 = zzejVar2.zzh().iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                zzelVar = (zzel) it3.next();
                                if (zzelVar.zzh() || !zzelVar.zzg()) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                strZze = zzelVar.zze();
                                if (strZze.isEmpty()) {
                                    orDefault = oooo0.getOrDefault(strZze, null);
                                    if (orDefault instanceof Long) {
                                        if (orDefault instanceof Double) {
                                            if (orDefault instanceof String) {
                                                if (orDefault == null) {
                                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Unknown param type. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                    break;
                                                }
                                                this.f37830OooO0oo.f37615OooO00o.zzay().zzj().zzc("Missing param for filter. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                            if (zzelVar.zzk()) {
                                                if (zzelVar.zzi()) {
                                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No filter for String param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                    break;
                                                }
                                                str = (String) orDefault;
                                                if (zzlb.OooOoo(str)) {
                                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                    break;
                                                }
                                                boolOooO0oO = o0OO0oO0.OooO0oO(str, zzelVar.zzc());
                                            } else {
                                                boolOooO0oO = o0OO0oO0.OooO0o0((String) orDefault, zzelVar.zzd(), this.f37830OooO0oo.f37615OooO00o.zzay());
                                            }
                                            if (boolOooO0oO != null) {
                                                break;
                                            }
                                            if (boolOooO0oO.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        } else {
                                            if (zzelVar.zzi()) {
                                                this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No number filter for double param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                break;
                                            }
                                            double dDoubleValue = ((Double) orDefault).doubleValue();
                                            try {
                                                boolOooO0Oo = o0OO0oO0.OooO0Oo(new BigDecimal(dDoubleValue), zzelVar.zzc(), Math.ulp(dDoubleValue));
                                            } catch (NumberFormatException unused) {
                                                boolOooO0Oo = null;
                                            }
                                            if (boolOooO0Oo != null) {
                                                break;
                                            }
                                            if (boolOooO0Oo.booleanValue() == z2) {
                                                bool = Boolean.FALSE;
                                                break;
                                            }
                                        }
                                    } else {
                                        if (zzelVar.zzi()) {
                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No number filter for long param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                            break;
                                        }
                                        boolOooO0o = o0OO0oO0.OooO0o(((Long) orDefault).longValue(), zzelVar.zzc());
                                        if (boolOooO0o != null) {
                                            break;
                                        }
                                        if (boolOooO0o.booleanValue() == z2) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                    }
                                } else {
                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzb("Event has empty param name. event", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                    break;
                                }
                            }
                        } else {
                            zzfwVar = (zzfw) it2.next();
                            if (!hashSet.contains(zzfwVar.zzg())) {
                                if (zzfwVar.zzw()) {
                                    if (zzfwVar.zzu()) {
                                        if (zzfwVar.zzy()) {
                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Unknown value for param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(zzfwVar.zzg()));
                                            break;
                                        }
                                        oooo0.put(zzfwVar.zzg(), zzfwVar.zzh());
                                    } else {
                                        String strZzg = zzfwVar.zzg();
                                        if (zzfwVar.zzu()) {
                                            dValueOf = Double.valueOf(zzfwVar.zza());
                                        } else {
                                            dValueOf = null;
                                        }
                                        oooo0.put(strZzg, dValueOf);
                                    }
                                } else {
                                    String strZzg2 = zzfwVar.zzg();
                                    if (zzfwVar.zzw()) {
                                        lValueOf = Long.valueOf(zzfwVar.zzd());
                                    } else {
                                        lValueOf = null;
                                    }
                                    oooo0.put(strZzg2, lValueOf);
                                }
                            }
                        }
                    }
                } else {
                    zzelVar2 = (zzel) it.next();
                    if (zzelVar2.zze().isEmpty()) {
                        this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzb("null or empty param name in filter. event", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh));
                        break;
                    }
                    hashSet.add(zzelVar2.zze());
                }
            }
        } else {
            Boolean boolOooO0o2 = o0OO0oO0.OooO0o(j2, zzejVar2.zzf());
            if (boolOooO0o2 != null) {
                if (boolOooO0o2.booleanValue()) {
                    hashSet = new HashSet();
                    it = zzejVar2.zzh().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            oooo0 = new p021OooOooo.Oooo0();
                            it2 = zzfsVar.zzi().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    it3 = zzejVar2.zzh().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            bool = Boolean.TRUE;
                                            break;
                                        }
                                        zzelVar = (zzel) it3.next();
                                        if (zzelVar.zzh()) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        strZze = zzelVar.zze();
                                        if (strZze.isEmpty()) {
                                            orDefault = oooo0.getOrDefault(strZze, null);
                                            if (orDefault instanceof Long) {
                                                if (orDefault instanceof Double) {
                                                    if (orDefault instanceof String) {
                                                        if (orDefault == null) {
                                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Unknown param type. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                            break;
                                                        }
                                                        this.f37830OooO0oo.f37615OooO00o.zzay().zzj().zzc("Missing param for filter. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                    if (zzelVar.zzk()) {
                                                        if (zzelVar.zzi()) {
                                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No filter for String param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                            break;
                                                        }
                                                        str = (String) orDefault;
                                                        if (zzlb.OooOoo(str)) {
                                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Invalid param value for number filter. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                            break;
                                                        }
                                                        boolOooO0oO = o0OO0oO0.OooO0oO(str, zzelVar.zzc());
                                                    } else {
                                                        boolOooO0oO = o0OO0oO0.OooO0o0((String) orDefault, zzelVar.zzd(), this.f37830OooO0oo.f37615OooO00o.zzay());
                                                    }
                                                    if (boolOooO0oO != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolOooO0oO.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else if (zzelVar.zzi()) {
                                                    double dDoubleValue2 = ((Double) orDefault).doubleValue();
                                                    boolOooO0Oo = o0OO0oO0.OooO0Oo(new BigDecimal(dDoubleValue2), zzelVar.zzc(), Math.ulp(dDoubleValue2));
                                                    if (boolOooO0Oo != null) {
                                                        break;
                                                        break;
                                                    }
                                                    if (boolOooO0Oo.booleanValue() == z2) {
                                                        bool = Boolean.FALSE;
                                                        break;
                                                    }
                                                } else {
                                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No number filter for double param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                    break;
                                                }
                                            } else if (zzelVar.zzi()) {
                                                boolOooO0o = o0OO0oO0.OooO0o(((Long) orDefault).longValue(), zzelVar.zzc());
                                                if (boolOooO0o != null) {
                                                    break;
                                                    break;
                                                }
                                                if (boolOooO0o.booleanValue() == z2) {
                                                    bool = Boolean.FALSE;
                                                    break;
                                                }
                                            } else {
                                                this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("No number filter for long param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(strZze));
                                                break;
                                            }
                                        } else {
                                            this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzb("Event has empty param name. event", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                            break;
                                        }
                                    }
                                } else {
                                    zzfwVar = (zzfw) it2.next();
                                    if (!hashSet.contains(zzfwVar.zzg())) {
                                        if (zzfwVar.zzw()) {
                                            if (zzfwVar.zzu()) {
                                                if (zzfwVar.zzy()) {
                                                    this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzc("Unknown value for param. event, param", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh), this.f37830OooO0oo.f37615OooO00o.zzj().OooO0o0(zzfwVar.zzg()));
                                                    break;
                                                }
                                                oooo0.put(zzfwVar.zzg(), zzfwVar.zzh());
                                            } else {
                                                String strZzg3 = zzfwVar.zzg();
                                                if (zzfwVar.zzu()) {
                                                    dValueOf = Double.valueOf(zzfwVar.zza());
                                                } else {
                                                    dValueOf = null;
                                                }
                                                oooo0.put(strZzg3, dValueOf);
                                            }
                                        } else {
                                            String strZzg4 = zzfwVar.zzg();
                                            if (zzfwVar.zzw()) {
                                                lValueOf = Long.valueOf(zzfwVar.zzd());
                                            } else {
                                                lValueOf = null;
                                            }
                                            oooo0.put(strZzg4, lValueOf);
                                        }
                                    }
                                }
                            }
                        } else {
                            zzelVar2 = (zzel) it.next();
                            if (zzelVar2.zze().isEmpty()) {
                                this.f37830OooO0oo.f37615OooO00o.zzay().zzk().zzb("null or empty param name in filter. event", this.f37830OooO0oo.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                break;
                            }
                            hashSet.add(zzelVar2.zze());
                        }
                    }
                } else {
                    bool = Boolean.FALSE;
                }
            }
        }
        this.f37830OooO0oo.f37615OooO00o.zzay().zzj().zzb("Event filter result", bool != null ? bool : "null");
        if (bool == null) {
            return false;
        }
        Boolean bool2 = Boolean.TRUE;
        this.f37837OooO0OO = bool2;
        if (!bool.booleanValue()) {
            return true;
        }
        this.f37838OooO0Oo = bool2;
        if (z3 && zzfsVar.zzu()) {
            Long lValueOf2 = Long.valueOf(zzfsVar.zzd());
            if (this.f37829OooO0oO.zzm()) {
                if (zZzs && this.f37829OooO0oO.zzo()) {
                    lValueOf2 = l;
                }
                this.f37839OooO0o = lValueOf2;
            } else {
                if (zZzs && this.f37829OooO0oO.zzo()) {
                    lValueOf2 = l2;
                }
                this.f37840OooO0o0 = lValueOf2;
            }
        }
        return true;
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final int OooO00o() {
        return this.f37829OooO0oO.zzb();
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final boolean OooO0O0() {
        return this.f37829OooO0oO.zzo();
    }

    @Override // o0OO0OoO.o0OO0oO0
    public final boolean OooO0OO() {
        return false;
    }
}
