package o0OO0OoO;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzei;
import com.google.android.gms.internal.measurement.zzej;
import com.google.android.gms.internal.measurement.zzer;
import com.google.android.gms.internal.measurement.zzes;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzfq;
import com.google.android.gms.internal.measurement.zzfs;
import com.google.android.gms.internal.measurement.zzgg;
import com.google.android.gms.internal.measurement.zzgh;
import com.google.android.gms.internal.measurement.zzgj;
import com.google.android.gms.internal.measurement.zzgl;
import com.google.android.gms.internal.measurement.zzny;
import com.google.android.gms.internal.measurement.zzob;
import com.google.android.gms.measurement.internal.zzeb;
import com.google.android.gms.measurement.internal.zzem;
import com.google.android.gms.measurement.internal.zzeo;
import com.google.android.gms.measurement.internal.zzkz;
import com.google.android.gms.measurement.internal.zzlb;
import com.umeng.analytics.pro.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO extends oo0OOoo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public String f37481OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public p021OooOooo.Oooo0 f37482OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public HashSet f37483OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Long f37484OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Long f37485OooO0oo;

    public OooO0OO(zzkz zzkzVar) {
        super(zzkzVar);
    }

    @Override // o0OO0OoO.oo0OOoo
    public final void OooO0O0() {
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02ac A[Catch: SQLiteException -> 0x02cc, all -> 0x0450, TryCatch #18 {all -> 0x0450, blocks: (B:97:0x0295, B:99:0x029b, B:101:0x02ac, B:102:0x02b4, B:105:0x02c7, B:113:0x02d4), top: B:448:0x0285 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02c7 A[Catch: SQLiteException -> 0x02cc, all -> 0x0450, TRY_LEAVE, TryCatch #18 {all -> 0x0450, blocks: (B:97:0x0295, B:99:0x029b, B:101:0x02ac, B:102:0x02b4, B:105:0x02c7, B:113:0x02d4), top: B:448:0x0285 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0305  */
    /* JADX WARN: Code duplicated, block: B:122:0x0313  */
    /* JADX WARN: Code duplicated, block: B:124:0x032f  */
    /* JADX WARN: Code duplicated, block: B:166:0x0453  */
    /* JADX WARN: Code duplicated, block: B:168:0x0457  */
    /* JADX WARN: Code duplicated, block: B:172:0x0464  */
    /* JADX WARN: Code duplicated, block: B:174:0x0489  */
    /* JADX WARN: Code duplicated, block: B:180:0x049e  */
    /* JADX WARN: Code duplicated, block: B:184:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:185:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:189:0x04cd  */
    /* JADX WARN: Code duplicated, block: B:195:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:202:0x0516  */
    /* JADX WARN: Code duplicated, block: B:205:0x051f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0529  */
    /* JADX WARN: Code duplicated, block: B:209:0x054f  */
    /* JADX WARN: Code duplicated, block: B:210:0x0553  */
    /* JADX WARN: Code duplicated, block: B:215:0x0570 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:240:0x0613  */
    /* JADX WARN: Code duplicated, block: B:243:0x0627  */
    /* JADX WARN: Code duplicated, block: B:247:0x064b  */
    /* JADX WARN: Code duplicated, block: B:248:0x068a  */
    /* JADX WARN: Code duplicated, block: B:251:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:257:0x071a A[LOOP:8: B:257:0x071a->B:272:0x0776, LOOP_START, PHI: r10 r11
      0x071a: PHI (r10v21 java.lang.String) = (r10v11 java.lang.String), (r10v26 java.lang.String) binds: [B:256:0x0718, B:272:0x0776] A[DONT_GENERATE, DONT_INLINE]
      0x071a: PHI (r11v18 java.lang.String) = (r11v8 java.lang.String), (r11v21 java.lang.String) binds: [B:256:0x0718, B:272:0x0776] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:263:0x0742  */
    /* JADX WARN: Code duplicated, block: B:265:0x074d  */
    /* JADX WARN: Code duplicated, block: B:272:0x0776 A[LOOP:8: B:257:0x071a->B:272:0x0776, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:275:0x077f  */
    /* JADX WARN: Code duplicated, block: B:291:0x07b7 A[PHI: r0 r4 r11 r18 r20 r65
      0x07b7: PHI (r0v102 java.util.Map) = (r0v104 java.util.Map), (r0v112 java.util.Map) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]
      0x07b7: PHI (r4v31 android.database.Cursor) = (r4v32 android.database.Cursor), (r4v36 android.database.Cursor) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]
      0x07b7: PHI (r11v13 java.lang.String) = (r11v14 java.lang.String), (r11v17 java.lang.String) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]
      0x07b7: PHI (r18v9 java.lang.String) = (r18v10 java.lang.String), (r18v14 java.lang.String) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]
      0x07b7: PHI (r20v7 java.lang.String) = (r20v8 java.lang.String), (r20v11 java.lang.String) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]
      0x07b7: PHI (r65v5 java.util.Iterator) = (r65v6 java.util.Iterator), (r65v8 java.util.Iterator) binds: [B:290:0x07b5, B:277:0x0787] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:298:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:302:0x07de  */
    /* JADX WARN: Code duplicated, block: B:308:0x0813  */
    /* JADX WARN: Code duplicated, block: B:310:0x0840 A[LOOP:10: B:306:0x080d->B:310:0x0840, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:314:0x085c  */
    /* JADX WARN: Code duplicated, block: B:320:0x0880  */
    /* JADX WARN: Code duplicated, block: B:323:0x088f  */
    /* JADX WARN: Code duplicated, block: B:325:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:329:0x08e6 A[Catch: SQLiteException -> 0x094a, all -> 0x0973, LOOP:4: B:329:0x08e6->B:344:0x093e, LOOP_START, PHI: r3
      0x08e6: PHI (r3v57 java.util.Iterator) = (r3v50 java.util.Iterator), (r3v59 java.util.Iterator) binds: [B:328:0x08e4, B:344:0x093e] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #9 {all -> 0x0973, blocks: (B:327:0x08e0, B:329:0x08e6, B:330:0x08eb, B:332:0x08fc, B:334:0x090c, B:336:0x0917, B:341:0x0933, B:338:0x091e, B:340:0x092c, B:356:0x0955, B:346:0x0943), top: B:436:0x08e0 }] */
    /* JADX WARN: Code duplicated, block: B:334:0x090c A[Catch: SQLiteException -> 0x094a, all -> 0x0973, TryCatch #9 {all -> 0x0973, blocks: (B:327:0x08e0, B:329:0x08e6, B:330:0x08eb, B:332:0x08fc, B:334:0x090c, B:336:0x0917, B:341:0x0933, B:338:0x091e, B:340:0x092c, B:356:0x0955, B:346:0x0943), top: B:436:0x08e0 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x0915  */
    /* JADX WARN: Code duplicated, block: B:344:0x093e A[LOOP:4: B:329:0x08e6->B:344:0x093e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:345:0x0941  */
    /* JADX WARN: Code duplicated, block: B:365:0x097b  */
    /* JADX WARN: Code duplicated, block: B:369:0x098f  */
    /* JADX WARN: Code duplicated, block: B:372:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:375:0x09c5  */
    /* JADX WARN: Code duplicated, block: B:377:0x09dc  */
    /* JADX WARN: Code duplicated, block: B:379:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:380:0x09f9  */
    /* JADX WARN: Code duplicated, block: B:382:0x0a29  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a31  */
    /* JADX WARN: Code duplicated, block: B:394:0x0a82  */
    /* JADX WARN: Code duplicated, block: B:395:0x0a8b  */
    /* JADX WARN: Code duplicated, block: B:399:0x0a9a A[PHI: r66
      0x0a9a: PHI (r66v3 java.util.Map) = (r66v4 java.util.Map), (r0v133 java.util.Map) binds: [B:398:0x0a98, B:396:0x0a8c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:405:0x0acb  */
    /* JADX WARN: Code duplicated, block: B:410:0x0b2b A[Catch: SQLiteException -> 0x0b3f, TRY_LEAVE, TryCatch #13 {SQLiteException -> 0x0b3f, blocks: (B:408:0x0b21, B:410:0x0b2b), top: B:442:0x0b21 }] */
    /* JADX WARN: Code duplicated, block: B:473:0x0b56 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x0939 A[EDGE_INSN: B:478:0x0939->B:343:0x0939 BREAK  A[LOOP:4: B:329:0x08e6->B:344:0x093e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x09a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x0aa3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0a6c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0a96 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x0635 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0621 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x076f A[EDGE_INSN: B:491:0x076f->B:271:0x076f BREAK  A[LOOP:8: B:257:0x071a->B:272:0x0776], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:0x0802 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x07f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x0858 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:0x084e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x05ce A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:510:0x04aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:512:0x0498 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:515:0x04ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x04dc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:531:0x043d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x020e A[EDGE_INSN: B:550:0x020e->B:73:0x020e BREAK  A[LOOP:22: B:62:0x01c2->B:74:0x0214], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x01af A[Catch: SQLiteException -> 0x0221, all -> 0x0b5b, TRY_LEAVE, TryCatch #3 {SQLiteException -> 0x0221, blocks: (B:57:0x01a9, B:59:0x01af, B:61:0x01bd, B:62:0x01c2, B:63:0x01cc, B:64:0x01dc, B:66:0x01eb), top: B:426:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x01bd A[Catch: SQLiteException -> 0x0221, all -> 0x0b5b, TRY_ENTER, TryCatch #3 {SQLiteException -> 0x0221, blocks: (B:57:0x01a9, B:59:0x01af, B:61:0x01bd, B:62:0x01c2, B:63:0x01cc, B:64:0x01dc, B:66:0x01eb), top: B:426:0x01a9 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0214 A[LOOP:22: B:62:0x01c2->B:74:0x0214, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:87:0x0248  */
    /* JADX WARN: Code duplicated, block: B:91:0x0253  */
    /* JADX WARN: Code duplicated, block: B:93:0x025e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0269  */
    /* JADX WARN: Code duplicated, block: B:99:0x029b A[Catch: SQLiteException -> 0x02cc, all -> 0x0450, LOOP:11: B:99:0x029b->B:501:?, LOOP_START, TryCatch #18 {all -> 0x0450, blocks: (B:97:0x0295, B:99:0x029b, B:101:0x02ac, B:102:0x02b4, B:105:0x02c7, B:113:0x02d4), top: B:448:0x0285 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v47, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v41, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v45, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    @WorkerThread
    public final List OooO0OO(String str, List list, List list2, Long l, Long l2) throws Throwable {
        int i;
        int i2;
        boolean z;
        ?? r5;
        Map map;
        Cursor cursor;
        String str2;
        Cursor cursorQuery;
        Map map2;
        String str3;
        Map map3;
        Iterator it;
        String str4;
        String str5;
        String str6;
        int iIntValue;
        zzgh zzghVar;
        BitSet bitSet;
        BitSet bitSet2;
        p021OooOooo.Oooo0 oooo0;
        List<zzej> list3;
        int i3;
        String str7;
        Long lValueOf;
        String str8;
        p021OooOooo.Oooo0 oooo1;
        ?? OooOOo2;
        Cursor cursorRawQuery;
        Map map4;
        p021OooOooo.Oooo0 oooo2;
        Iterator it2;
        zzgh zzghVar2;
        List list4;
        Map map5;
        Map mapEmptyMap;
        Integer numValueOf;
        List arrayList;
        o0OO0o00 o0oo0o01;
        p021OooOooo.Oooo0 oooo3;
        Iterator it3;
        zzfs zzfsVar;
        zzfs zzfsVarOooO00o;
        OooOO0O oooOO0OZzi;
        String str9;
        String strZzh;
        OooOOOO oooOOOOOooOo;
        OooOOOO oooOOOO;
        long j;
        String strZzh2;
        Map mapEmptyMap2;
        Iterator it4;
        String str10;
        String str11;
        String str12;
        Iterator it5;
        int iIntValue2;
        HashSet hashSet;
        Integer numValueOf2;
        Iterator it6;
        boolean zOooO;
        Map map6;
        o0OO0o o0oo0o2;
        OooOO0O oooOO0OZzi2;
        String str13;
        p021OooOooo.Oooo0 oooo4;
        Cursor cursor2;
        Cursor cursorQuery2;
        Integer numValueOf3;
        List list5;
        List arrayList2;
        String str14;
        String str15;
        p021OooOooo.Oooo0 oooo5;
        Iterator it7;
        String strZzf;
        Map mapEmptyMap3;
        String str16;
        String str17;
        Iterator it8;
        int iIntValue3;
        HashSet hashSet2;
        Integer numValueOf4;
        Iterator it9;
        boolean zOooO2;
        zzes zzesVar;
        Integer numValueOf5;
        o0OO o0oo;
        Integer numValueOf6;
        OooOO0O oooOO0OZzi3;
        String str18;
        p021OooOooo.Oooo0 oooo6;
        Cursor cursor3;
        Cursor cursorQuery3;
        Integer numValueOf7;
        List list6;
        List arrayList3;
        String str19;
        ArrayList arrayList4;
        Iterator it10;
        OooOO0O oooOO0OZzi4;
        String str20;
        ContentValues contentValues;
        p021OooOooo.Oooo0 oooo7;
        int i4;
        Cursor cursorQuery4;
        List arrayList5;
        String str21 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.f37481OooO0Oo = str;
        this.f37483OooO0o0 = new HashSet();
        this.f37482OooO0o = new p021OooOooo.Oooo0();
        this.f37484OooO0oO = l;
        this.f37485OooO0oo = l2;
        Iterator it11 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it11.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((zzfs) it11.next()).zzh())) {
                z = true;
                break;
            }
        }
        zzny.zzc();
        boolean zZzs = this.f37615OooO00o.zzf().zzs(this.f37481OooO0Oo, zzeb.zzW);
        zzny.zzc();
        boolean zZzs2 = this.f37615OooO00o.zzf().zzs(this.f37481OooO0Oo, zzeb.zzV);
        if (z) {
            OooOO0O oooOO0OZzi5 = this.f37794OooO0O0.zzi();
            String str22 = this.f37481OooO0Oo;
            oooOO0OZzi5.OooO00o();
            oooOO0OZzi5.zzg();
            Preconditions.checkNotEmpty(str22);
            ContentValues contentValues2 = new ContentValues();
            ?? r6 = "current_session_count";
            contentValues2.put("current_session_count", (Integer) 0);
            try {
                r6 = new String[]{str22};
                oooOO0OZzi5.OooOOo().update(d.ar, contentValues2, "app_id = ?", r6);
                r5 = r6;
            } catch (SQLiteException e) {
                oooOO0OZzi5.f37615OooO00o.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeo.OooO0o0(str22), e);
                r5 = r6;
            }
        }
        Map mapEmptyMap4 = Collections.emptyMap();
        String str23 = "Database error querying filters. appId";
        String str24 = "data";
        String str25 = "audience_id";
        if (zZzs2 && zZzs) {
            OooOO0O oooOO0OZzi6 = this.f37794OooO0O0.zzi();
            String str26 = this.f37481OooO0Oo;
            Preconditions.checkNotEmpty(str26);
            p021OooOooo.Oooo0 oooo8 = new p021OooOooo.Oooo0();
            try {
                try {
                    cursorQuery4 = oooOO0OZzi6.OooOOo().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str26}, null, null, null);
                    try {
                        if (cursorQuery4.moveToFirst()) {
                            while (true) {
                                try {
                                    zzej zzejVar = (zzej) ((zzei) zzlb.OooOOoo(zzej.zzc(), cursorQuery4.getBlob(i2))).zzaE();
                                    if (zzejVar.zzo()) {
                                        Integer numValueOf8 = Integer.valueOf(cursorQuery4.getInt(i));
                                        List list7 = (List) oooo8.get(numValueOf8);
                                        if (list7 == null) {
                                            arrayList5 = new ArrayList();
                                            oooo8.put(numValueOf8, arrayList5);
                                        } else {
                                            arrayList5 = list7;
                                        }
                                        arrayList5.add(zzejVar);
                                    }
                                } catch (IOException e2) {
                                    oooOO0OZzi6.f37615OooO00o.zzay().zzd().zzc("Failed to merge filter. appId", zzeo.OooO0o0(str26), e2);
                                }
                                if (!cursorQuery4.moveToNext()) {
                                    break;
                                }
                                i = 0;
                                i2 = 1;
                            }
                            cursorQuery4.close();
                            map = oooo8;
                        } else {
                            mapEmptyMap4 = Collections.emptyMap();
                            cursorQuery4.close();
                            map = mapEmptyMap4;
                        }
                    } catch (SQLiteException e3) {
                        e = e3;
                        oooOO0OZzi6.f37615OooO00o.zzay().zzd().zzc("Database error querying filters. appId", zzeo.OooO0o0(str26), e);
                        mapEmptyMap4 = Collections.emptyMap();
                        if (cursorQuery4 != null) {
                        }
                        map = mapEmptyMap4;
                        OooOO0O oooOO0OZzi7 = this.f37794OooO0O0.zzi();
                        String str27 = this.f37481OooO0Oo;
                        oooOO0OZzi7.OooO00o();
                        oooOO0OZzi7.zzg();
                        Preconditions.checkNotEmpty(str27);
                        cursorQuery = oooOO0OZzi7.OooOOo().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str27}, null, null, null);
                        try {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    oooo7 = new p021OooOooo.Oooo0();
                                    while (true) {
                                        i4 = cursorQuery.getInt(0);
                                        try {
                                            oooo7.put(Integer.valueOf(i4), (zzgh) ((zzgg) zzlb.OooOOoo(zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                                            str2 = str25;
                                        } catch (IOException e4) {
                                            str2 = str25;
                                            try {
                                                oooOO0OZzi7.f37615OooO00o.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeo.OooO0o0(str27), Integer.valueOf(i4), e4);
                                            } catch (SQLiteException e5) {
                                                e = e5;
                                                str24 = str24;
                                                oooOO0OZzi7.f37615OooO00o.zzay().zzd().zzc("Database error querying filter results. appId", zzeo.OooO0o0(str27), e);
                                                Map mapEmptyMap5 = Collections.emptyMap();
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                map2 = mapEmptyMap5;
                                                if (map2.isEmpty()) {
                                                    str6 = "Database error querying filters. appId";
                                                    str4 = "current_results";
                                                    str5 = str2;
                                                } else {
                                                    HashSet hashSet3 = new HashSet(map2.keySet());
                                                    if (z) {
                                                        String str28 = this.f37481OooO0Oo;
                                                        OooOO0O oooOO0OZzi8 = this.f37794OooO0O0.zzi();
                                                        str8 = this.f37481OooO0Oo;
                                                        oooOO0OZzi8.OooO00o();
                                                        oooOO0OZzi8.zzg();
                                                        Preconditions.checkNotEmpty(str8);
                                                        oooo1 = new p021OooOooo.Oooo0();
                                                        OooOOo2 = oooOO0OZzi8.OooOOo();
                                                        try {
                                                            try {
                                                                cursorRawQuery = OooOOo2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                                                                try {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        do {
                                                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                                                            arrayList = (List) oooo1.get(numValueOf);
                                                                            if (arrayList == null) {
                                                                                arrayList = new ArrayList();
                                                                                oooo1.put(numValueOf, arrayList);
                                                                            }
                                                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                                                        } while (cursorRawQuery.moveToNext());
                                                                        mapEmptyMap = oooo1;
                                                                    } else {
                                                                        mapEmptyMap = Collections.emptyMap();
                                                                    }
                                                                } catch (SQLiteException e6) {
                                                                    e = e6;
                                                                    oooOO0OZzi8.f37615OooO00o.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeo.OooO0o0(str8), e);
                                                                    Map mapEmptyMap6 = Collections.emptyMap();
                                                                    mapEmptyMap = mapEmptyMap6;
                                                                    map4 = mapEmptyMap6;
                                                                    if (cursorRawQuery != null) {
                                                                    }
                                                                    Preconditions.checkNotEmpty(str28);
                                                                    Preconditions.checkNotNull(map2);
                                                                    oooo2 = new p021OooOooo.Oooo0();
                                                                    if (!map2.isEmpty()) {
                                                                        it2 = map2.keySet().iterator();
                                                                        while (it2.hasNext()) {
                                                                            int iIntValue4 = ((Integer) it2.next()).intValue();
                                                                            Integer numValueOf9 = Integer.valueOf(iIntValue4);
                                                                            zzghVar2 = (zzgh) map2.get(numValueOf9);
                                                                            list4 = (List) map4.get(numValueOf9);
                                                                            if (list4 != null) {
                                                                            }
                                                                            map5 = map4;
                                                                            oooo2.put(numValueOf9, zzghVar2);
                                                                            map4 = map5;
                                                                            it2 = it2;
                                                                            str23 = str23;
                                                                        }
                                                                    }
                                                                    str3 = str23;
                                                                    map3 = oooo2;
                                                                    it = hashSet3.iterator();
                                                                    while (it.hasNext()) {
                                                                        iIntValue = ((Integer) it.next()).intValue();
                                                                        zzghVar = (zzgh) map3.get(Integer.valueOf(iIntValue));
                                                                        bitSet = new BitSet();
                                                                        bitSet2 = new BitSet();
                                                                        oooo0 = new p021OooOooo.Oooo0();
                                                                        if (zzghVar != null) {
                                                                            for (zzfq zzfqVar : zzghVar.zzj()) {
                                                                                if (zzfqVar.zzh()) {
                                                                                    Integer numValueOf10 = Integer.valueOf(zzfqVar.zza());
                                                                                    if (zzfqVar.zzg()) {
                                                                                        lValueOf = Long.valueOf(zzfqVar.zzb());
                                                                                    } else {
                                                                                        lValueOf = null;
                                                                                    }
                                                                                    oooo0.put(numValueOf10, lValueOf);
                                                                                }
                                                                            }
                                                                        }
                                                                        p021OooOooo.Oooo0 oooo9 = new p021OooOooo.Oooo0();
                                                                        if (zzghVar != null) {
                                                                            for (zzgj zzgjVar : zzghVar.zzm()) {
                                                                                if (!zzgjVar.zzi()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        Map map7 = map3;
                                                                        if (zzghVar != null) {
                                                                            i3 = 0;
                                                                            while (i3 < zzghVar.zzd() * 64) {
                                                                                if (zzlb.OooOoOO(zzghVar.zzn(), i3)) {
                                                                                    str7 = str21;
                                                                                    this.f37615OooO00o.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                                                    bitSet2.set(i3);
                                                                                    if (zzlb.OooOoOO(zzghVar.zzk(), i3)) {
                                                                                        bitSet.set(i3);
                                                                                    }
                                                                                    i3++;
                                                                                    str21 = str7;
                                                                                } else {
                                                                                    str7 = str21;
                                                                                }
                                                                                oooo0.remove(Integer.valueOf(i3));
                                                                                i3++;
                                                                                str21 = str7;
                                                                            }
                                                                        }
                                                                        String str29 = str21;
                                                                        Integer numValueOf11 = Integer.valueOf(iIntValue);
                                                                        zzgh zzghVar3 = (zzgh) map2.get(numValueOf11);
                                                                        if (!zZzs2) {
                                                                        }
                                                                        this.f37482OooO0o.put(Integer.valueOf(iIntValue), new o0OOooO0(this, this.f37481OooO0Oo, zzghVar3, bitSet, bitSet2, oooo0, oooo9));
                                                                        map2 = map2;
                                                                        map = map;
                                                                        map3 = map7;
                                                                        str2 = str2;
                                                                        str21 = str29;
                                                                    }
                                                                    str4 = str21;
                                                                    str5 = str2;
                                                                    str6 = str3;
                                                                    if (!list.isEmpty()) {
                                                                        o0oo0o01 = new o0OO0o00(this);
                                                                        oooo3 = new p021OooOooo.Oooo0();
                                                                        it3 = list.iterator();
                                                                        while (it3.hasNext()) {
                                                                            zzfsVar = (zzfs) it3.next();
                                                                            zzfsVarOooO00o = o0oo0o01.OooO00o(this.f37481OooO0Oo, zzfsVar);
                                                                            if (zzfsVarOooO00o != null) {
                                                                                oooOO0OZzi = this.f37794OooO0O0.zzi();
                                                                                str9 = this.f37481OooO0Oo;
                                                                                strZzh = zzfsVarOooO00o.zzh();
                                                                                oooOOOOOooOo = oooOO0OZzi.OooOo(str9, zzfsVar.zzh());
                                                                                if (oooOOOOOooOo == null) {
                                                                                    oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.OooO0o0(str9), oooOO0OZzi.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                                                                    oooOOOO = new OooOOOO(str9, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                                                                } else {
                                                                                    oooOOOO = new OooOOOO(oooOOOOOooOo.f37504OooO00o, oooOOOOOooOo.f37505OooO0O0, oooOOOOOooOo.f37506OooO0OO + 1, oooOOOOOooOo.f37507OooO0Oo + 1, oooOOOOOooOo.f37509OooO0o0 + 1, oooOOOOOooOo.f37508OooO0o, oooOOOOOooOo.f37510OooO0oO, oooOOOOOooOo.f37511OooO0oo, oooOOOOOooOo.f37503OooO, oooOOOOOooOo.f37512OooOO0, oooOOOOOooOo.f37513OooOO0O);
                                                                                }
                                                                                this.f37794OooO0O0.zzi().OooO0o(oooOOOO);
                                                                                j = oooOOOO.f37506OooO0OO;
                                                                                strZzh2 = zzfsVarOooO00o.zzh();
                                                                                mapEmptyMap2 = (Map) oooo3.get(strZzh2);
                                                                                if (mapEmptyMap2 == null) {
                                                                                    oooOO0OZzi2 = this.f37794OooO0O0.zzi();
                                                                                    str13 = this.f37481OooO0Oo;
                                                                                    oooOO0OZzi2.OooO00o();
                                                                                    oooOO0OZzi2.zzg();
                                                                                    Preconditions.checkNotEmpty(str13);
                                                                                    Preconditions.checkNotEmpty(strZzh2);
                                                                                    oooo4 = new p021OooOooo.Oooo0();
                                                                                    try {
                                                                                        try {
                                                                                            it4 = it3;
                                                                                            try {
                                                                                                cursorQuery2 = oooOO0OZzi2.OooOOo().query("event_filters", new String[]{str5, str24}, "app_id=? AND event_name=?", new String[]{str13, strZzh2}, null, null, null);
                                                                                                try {
                                                                                                    try {
                                                                                                        if (cursorQuery2.moveToFirst()) {
                                                                                                            while (true) {
                                                                                                                str10 = str5;
                                                                                                                try {
                                                                                                                    try {
                                                                                                                        zzej zzejVar2 = (zzej) ((zzei) zzlb.OooOOoo(zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                                                                        list5 = (List) oooo4.get(numValueOf3);
                                                                                                                        if (list5 == null) {
                                                                                                                            str11 = str24;
                                                                                                                            try {
                                                                                                                                arrayList2 = new ArrayList();
                                                                                                                                oooo4.put(numValueOf3, arrayList2);
                                                                                                                            } catch (SQLiteException e7) {
                                                                                                                                e = e7;
                                                                                                                                str12 = str6;
                                                                                                                                oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzc(str12, zzeo.OooO0o0(str13), e);
                                                                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                                                                if (cursorQuery2 != null) {
                                                                                                                                    cursorQuery2.close();
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            str11 = str24;
                                                                                                                            arrayList2 = list5;
                                                                                                                        }
                                                                                                                        arrayList2.add(zzejVar2);
                                                                                                                    } catch (IOException e8) {
                                                                                                                        str11 = str24;
                                                                                                                        oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzc("Failed to merge filter. appId", zzeo.OooO0o0(str13), e8);
                                                                                                                    }
                                                                                                                    if (!cursorQuery2.moveToNext()) {
                                                                                                                        break;
                                                                                                                    }
                                                                                                                    str5 = str10;
                                                                                                                    str24 = str11;
                                                                                                                } catch (SQLiteException e9) {
                                                                                                                    e = e9;
                                                                                                                    str11 = str24;
                                                                                                                    str12 = str6;
                                                                                                                    oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzc(str12, zzeo.OooO0o0(str13), e);
                                                                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                                                                    if (cursorQuery2 != null) {
                                                                                                                        cursorQuery2.close();
                                                                                                                    }
                                                                                                                    oooo3.put(strZzh2, mapEmptyMap2);
                                                                                                                    it5 = mapEmptyMap2.keySet().iterator();
                                                                                                                    while (it5.hasNext()) {
                                                                                                                        iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                                                        hashSet = this.f37483OooO0o0;
                                                                                                                        numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                                        if (hashSet.contains(numValueOf2)) {
                                                                                                                            this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                                        } else {
                                                                                                                            it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                                                                                                                            zOooO = true;
                                                                                                                            while (true) {
                                                                                                                                if (it6.hasNext()) {
                                                                                                                                    map6 = mapEmptyMap2;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                zzej zzejVar3 = (zzej) it6.next();
                                                                                                                                o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar3);
                                                                                                                                map6 = mapEmptyMap2;
                                                                                                                                zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar3.zzb()));
                                                                                                                                if (zOooO) {
                                                                                                                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                                                                                                                mapEmptyMap2 = map6;
                                                                                                                            }
                                                                                                                            if (!zOooO) {
                                                                                                                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                                                            }
                                                                                                                            mapEmptyMap2 = map6;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    it3 = it4;
                                                                                                                    str6 = str12;
                                                                                                                    o0oo0o01 = o0oo0o01;
                                                                                                                    str5 = str10;
                                                                                                                    str24 = str11;
                                                                                                                }
                                                                                                            }
                                                                                                            cursorQuery2.close();
                                                                                                            mapEmptyMap2 = oooo4;
                                                                                                            str12 = str6;
                                                                                                        } else {
                                                                                                            str10 = str5;
                                                                                                            str11 = str24;
                                                                                                            mapEmptyMap2 = Collections.emptyMap();
                                                                                                            str12 = str6;
                                                                                                            cursorQuery2.close();
                                                                                                        }
                                                                                                    } catch (Throwable th) {
                                                                                                        th = th;
                                                                                                        cursor2 = cursorQuery2;
                                                                                                        if (cursor2 != null) {
                                                                                                            cursor2.close();
                                                                                                        }
                                                                                                        throw th;
                                                                                                    }
                                                                                                } catch (SQLiteException e10) {
                                                                                                    e = e10;
                                                                                                    str10 = str5;
                                                                                                }
                                                                                            } catch (SQLiteException e11) {
                                                                                                e = e11;
                                                                                                str10 = str5;
                                                                                                str11 = str24;
                                                                                                cursorQuery2 = null;
                                                                                                str12 = str6;
                                                                                                oooOO0OZzi2.f37615OooO00o.zzay().zzd().zzc(str12, zzeo.OooO0o0(str13), e);
                                                                                                mapEmptyMap2 = Collections.emptyMap();
                                                                                                if (cursorQuery2 != null) {
                                                                                                    cursorQuery2.close();
                                                                                                }
                                                                                                oooo3.put(strZzh2, mapEmptyMap2);
                                                                                                it5 = mapEmptyMap2.keySet().iterator();
                                                                                                while (it5.hasNext()) {
                                                                                                    iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                                    hashSet = this.f37483OooO0o0;
                                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                                    if (hashSet.contains(numValueOf2)) {
                                                                                                        this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                                    } else {
                                                                                                        it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                                                                                                        zOooO = true;
                                                                                                        while (true) {
                                                                                                            if (it6.hasNext()) {
                                                                                                                map6 = mapEmptyMap2;
                                                                                                                break;
                                                                                                            }
                                                                                                            zzej zzejVar4 = (zzej) it6.next();
                                                                                                            o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar4);
                                                                                                            map6 = mapEmptyMap2;
                                                                                                            zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar4.zzb()));
                                                                                                            if (zOooO) {
                                                                                                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                                                break;
                                                                                                            }
                                                                                                            OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                                                                                            mapEmptyMap2 = map6;
                                                                                                        }
                                                                                                        if (!zOooO) {
                                                                                                            this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                                        }
                                                                                                        mapEmptyMap2 = map6;
                                                                                                    }
                                                                                                }
                                                                                                it3 = it4;
                                                                                                str6 = str12;
                                                                                                o0oo0o01 = o0oo0o01;
                                                                                                str5 = str10;
                                                                                                str24 = str11;
                                                                                            }
                                                                                        } catch (SQLiteException e12) {
                                                                                            e = e12;
                                                                                            it4 = it3;
                                                                                        }
                                                                                        oooo3.put(strZzh2, mapEmptyMap2);
                                                                                    } catch (Throwable th2) {
                                                                                        th = th2;
                                                                                        cursor2 = null;
                                                                                    }
                                                                                } else {
                                                                                    it4 = it3;
                                                                                    str10 = str5;
                                                                                    str11 = str24;
                                                                                    str12 = str6;
                                                                                }
                                                                                it5 = mapEmptyMap2.keySet().iterator();
                                                                                while (it5.hasNext()) {
                                                                                    iIntValue2 = ((Integer) it5.next()).intValue();
                                                                                    hashSet = this.f37483OooO0o0;
                                                                                    numValueOf2 = Integer.valueOf(iIntValue2);
                                                                                    if (hashSet.contains(numValueOf2)) {
                                                                                        this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                                    } else {
                                                                                        it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                                                                                        zOooO = true;
                                                                                        while (true) {
                                                                                            if (it6.hasNext()) {
                                                                                                map6 = mapEmptyMap2;
                                                                                                break;
                                                                                            }
                                                                                            zzej zzejVar5 = (zzej) it6.next();
                                                                                            o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar5);
                                                                                            map6 = mapEmptyMap2;
                                                                                            zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar5.zzb()));
                                                                                            if (zOooO) {
                                                                                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                                break;
                                                                                            }
                                                                                            OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                                                                            mapEmptyMap2 = map6;
                                                                                        }
                                                                                        if (!zOooO) {
                                                                                            this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                                        }
                                                                                        mapEmptyMap2 = map6;
                                                                                    }
                                                                                }
                                                                                it3 = it4;
                                                                                str6 = str12;
                                                                                o0oo0o01 = o0oo0o01;
                                                                                str5 = str10;
                                                                                str24 = str11;
                                                                            }
                                                                        }
                                                                    }
                                                                    str14 = str5;
                                                                    str15 = str24;
                                                                    String str30 = str6;
                                                                    if (!list2.isEmpty()) {
                                                                        oooo5 = new p021OooOooo.Oooo0();
                                                                        it7 = list2.iterator();
                                                                        while (it7.hasNext()) {
                                                                            zzgl zzglVar = (zzgl) it7.next();
                                                                            strZzf = zzglVar.zzf();
                                                                            mapEmptyMap3 = (Map) oooo5.get(strZzf);
                                                                            if (mapEmptyMap3 == null) {
                                                                                oooOO0OZzi3 = this.f37794OooO0O0.zzi();
                                                                                str18 = this.f37481OooO0Oo;
                                                                                oooOO0OZzi3.OooO00o();
                                                                                oooOO0OZzi3.zzg();
                                                                                Preconditions.checkNotEmpty(str18);
                                                                                Preconditions.checkNotEmpty(strZzf);
                                                                                oooo6 = new p021OooOooo.Oooo0();
                                                                                str16 = str14;
                                                                                str17 = str15;
                                                                                try {
                                                                                    cursorQuery3 = oooOO0OZzi3.OooOOo().query("property_filters", new String[]{str16, str17}, "app_id=? AND property_name=?", new String[]{str18, strZzf}, null, null, null);
                                                                                    try {
                                                                                        try {
                                                                                            if (cursorQuery3.moveToFirst()) {
                                                                                                while (true) {
                                                                                                    try {
                                                                                                        zzes zzesVar2 = (zzes) ((zzer) zzlb.OooOOoo(zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                                                                        numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                                                        list6 = (List) oooo6.get(numValueOf7);
                                                                                                        if (list6 == null) {
                                                                                                            arrayList3 = new ArrayList();
                                                                                                            oooo6.put(numValueOf7, arrayList3);
                                                                                                        } else {
                                                                                                            arrayList3 = list6;
                                                                                                        }
                                                                                                        arrayList3.add(zzesVar2);
                                                                                                    } catch (IOException e13) {
                                                                                                        oooOO0OZzi3.f37615OooO00o.zzay().zzd().zzc("Failed to merge filter", zzeo.OooO0o0(str18), e13);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (!cursorQuery3.moveToNext()) {
                                                                                                            break;
                                                                                                        }
                                                                                                        it7 = it7;
                                                                                                    } catch (SQLiteException e14) {
                                                                                                        e = e14;
                                                                                                        oooOO0OZzi3.f37615OooO00o.zzay().zzd().zzc(str30, zzeo.OooO0o0(str18), e);
                                                                                                        mapEmptyMap3 = Collections.emptyMap();
                                                                                                        if (cursorQuery3 != null) {
                                                                                                            cursorQuery3.close();
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                cursorQuery3.close();
                                                                                                mapEmptyMap3 = oooo6;
                                                                                            } else {
                                                                                                it7 = it7;
                                                                                                mapEmptyMap3 = Collections.emptyMap();
                                                                                                cursorQuery3.close();
                                                                                            }
                                                                                        } catch (Throwable th3) {
                                                                                            th = th3;
                                                                                            cursor3 = cursorQuery3;
                                                                                            if (cursor3 != null) {
                                                                                                cursor3.close();
                                                                                            }
                                                                                            throw th;
                                                                                        }
                                                                                    } catch (SQLiteException e15) {
                                                                                        e = e15;
                                                                                        it7 = it7;
                                                                                    }
                                                                                } catch (SQLiteException e16) {
                                                                                    e = e16;
                                                                                    it7 = it7;
                                                                                    cursorQuery3 = null;
                                                                                } catch (Throwable th4) {
                                                                                    th = th4;
                                                                                    cursor3 = null;
                                                                                }
                                                                                oooo5.put(strZzf, mapEmptyMap3);
                                                                            } else {
                                                                                it7 = it7;
                                                                                str16 = str14;
                                                                                str17 = str15;
                                                                            }
                                                                            it8 = mapEmptyMap3.keySet().iterator();
                                                                            while (it8.hasNext()) {
                                                                                iIntValue3 = ((Integer) it8.next()).intValue();
                                                                                hashSet2 = this.f37483OooO0o0;
                                                                                numValueOf4 = Integer.valueOf(iIntValue3);
                                                                                if (hashSet2.contains(numValueOf4)) {
                                                                                    this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                                    break;
                                                                                }
                                                                                it9 = ((List) mapEmptyMap3.get(numValueOf4)).iterator();
                                                                                zOooO2 = true;
                                                                                while (true) {
                                                                                    if (it9.hasNext()) {
                                                                                        zzesVar = (zzes) it9.next();
                                                                                        if (Log.isLoggable(this.f37615OooO00o.zzay().zzq(), 2)) {
                                                                                            zzem zzemVarZzj = this.f37615OooO00o.zzay().zzj();
                                                                                            Integer numValueOf12 = Integer.valueOf(iIntValue3);
                                                                                            if (zzesVar.zzj()) {
                                                                                                numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                                            } else {
                                                                                                numValueOf6 = null;
                                                                                            }
                                                                                            zzemVarZzj.zzd("Evaluating filter. audience, filter, property", numValueOf12, numValueOf6, this.f37615OooO00o.zzj().OooO0o(zzesVar.zze()));
                                                                                            this.f37615OooO00o.zzay().zzj().zzb("Filter definition", this.f37794OooO0O0.zzu().OooOo0(zzesVar));
                                                                                        }
                                                                                        if (zzesVar.zzj()) {
                                                                                        }
                                                                                        zzem zzemVarZzk = this.f37615OooO00o.zzay().zzk();
                                                                                        Object objOooO0o0 = zzeo.OooO0o0(this.f37481OooO0Oo);
                                                                                        if (zzesVar.zzj()) {
                                                                                            numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                                        } else {
                                                                                            numValueOf5 = null;
                                                                                        }
                                                                                        zzemVarZzk.zzc("Invalid property filter ID. appId, id", objOooO0o0, String.valueOf(numValueOf5));
                                                                                        this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                                                                        mapEmptyMap3 = mapEmptyMap3;
                                                                                    } else {
                                                                                        mapEmptyMap3 = mapEmptyMap3;
                                                                                    }
                                                                                    if (!zOooO2) {
                                                                                        this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                                                                    }
                                                                                    mapEmptyMap3 = mapEmptyMap3;
                                                                                    OooO0Oo(Integer.valueOf(iIntValue3)).OooO0O0(o0oo);
                                                                                    mapEmptyMap3 = mapEmptyMap3;
                                                                                }
                                                                            }
                                                                            it7 = it7;
                                                                            str15 = str17;
                                                                            str14 = str16;
                                                                        }
                                                                    }
                                                                    str19 = str14;
                                                                    arrayList4 = new ArrayList();
                                                                    OooOooo.Oooo0.OooO0OO oooO0OO = (OooOooo.Oooo0.OooO0OO) this.f37482OooO0o.keySet();
                                                                    oooO0OO.removeAll(this.f37483OooO0o0);
                                                                    it10 = oooO0OO.iterator();
                                                                    while (it10.hasNext()) {
                                                                        int iIntValue5 = ((Integer) it10.next()).intValue();
                                                                        p021OooOooo.Oooo0 oooo10 = this.f37482OooO0o;
                                                                        Integer numValueOf13 = Integer.valueOf(iIntValue5);
                                                                        o0OOooO0 o0ooooo1 = (o0OOooO0) oooo10.get(numValueOf13);
                                                                        Preconditions.checkNotNull(o0ooooo1);
                                                                        zzfo zzfoVarOooO00o = o0ooooo1.OooO00o(iIntValue5);
                                                                        arrayList4.add(zzfoVarOooO00o);
                                                                        oooOO0OZzi4 = this.f37794OooO0O0.zzi();
                                                                        str20 = this.f37481OooO0Oo;
                                                                        zzgh zzghVarZzd = zzfoVarOooO00o.zzd();
                                                                        oooOO0OZzi4.OooO00o();
                                                                        oooOO0OZzi4.zzg();
                                                                        Preconditions.checkNotEmpty(str20);
                                                                        Preconditions.checkNotNull(zzghVarZzd);
                                                                        byte[] bArrZzbv = zzghVarZzd.zzbv();
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", str20);
                                                                        contentValues.put(str19, numValueOf13);
                                                                        String str31 = str4;
                                                                        contentValues.put(str31, bArrZzbv);
                                                                        try {
                                                                            try {
                                                                                if (oooOO0OZzi4.OooOOo().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                                                    oooOO0OZzi4.f37615OooO00o.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.OooO0o0(str20));
                                                                                }
                                                                            } catch (SQLiteException e17) {
                                                                                e = e17;
                                                                                oooOO0OZzi4.f37615OooO00o.zzay().zzd().zzc("Error storing filter results. appId", zzeo.OooO0o0(str20), e);
                                                                            }
                                                                        } catch (SQLiteException e18) {
                                                                            e = e18;
                                                                        }
                                                                        str4 = str31;
                                                                    }
                                                                    return arrayList4;
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                if (OooOOo2 != 0) {
                                                                    OooOOo2.close();
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (SQLiteException e19) {
                                                            e = e19;
                                                            cursorRawQuery = null;
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            OooOOo2 = 0;
                                                            if (OooOOo2 != 0) {
                                                                OooOOo2.close();
                                                            }
                                                            throw th;
                                                        }
                                                        cursorRawQuery.close();
                                                        map4 = mapEmptyMap;
                                                        Preconditions.checkNotEmpty(str28);
                                                        Preconditions.checkNotNull(map2);
                                                        oooo2 = new p021OooOooo.Oooo0();
                                                        if (!map2.isEmpty()) {
                                                            it2 = map2.keySet().iterator();
                                                            while (it2.hasNext()) {
                                                                int iIntValue6 = ((Integer) it2.next()).intValue();
                                                                Integer numValueOf14 = Integer.valueOf(iIntValue6);
                                                                zzghVar2 = (zzgh) map2.get(numValueOf14);
                                                                list4 = (List) map4.get(numValueOf14);
                                                                if (list4 != null) {
                                                                }
                                                                map5 = map4;
                                                                oooo2.put(numValueOf14, zzghVar2);
                                                                map4 = map5;
                                                                it2 = it2;
                                                                str23 = str23;
                                                            }
                                                        }
                                                        str3 = str23;
                                                        map3 = oooo2;
                                                    } else {
                                                        str3 = "Database error querying filters. appId";
                                                        map3 = map2;
                                                    }
                                                    it = hashSet3.iterator();
                                                    while (it.hasNext()) {
                                                        iIntValue = ((Integer) it.next()).intValue();
                                                        zzghVar = (zzgh) map3.get(Integer.valueOf(iIntValue));
                                                        bitSet = new BitSet();
                                                        bitSet2 = new BitSet();
                                                        oooo0 = new p021OooOooo.Oooo0();
                                                        if (zzghVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (zzfqVar.zzh()) {
                                                                    Integer numValueOf15 = Integer.valueOf(zzfqVar.zza());
                                                                    if (zzfqVar.zzg()) {
                                                                        lValueOf = Long.valueOf(zzfqVar.zzb());
                                                                    } else {
                                                                        lValueOf = null;
                                                                    }
                                                                    oooo0.put(numValueOf15, lValueOf);
                                                                }
                                                            }
                                                        }
                                                        p021OooOooo.Oooo0 oooo11 = new p021OooOooo.Oooo0();
                                                        if (zzghVar != null) {
                                                            while (r2.hasNext()) {
                                                                if (!zzgjVar.zzi()) {
                                                                }
                                                            }
                                                        }
                                                        Map map8 = map3;
                                                        if (zzghVar != null) {
                                                            i3 = 0;
                                                            while (i3 < zzghVar.zzd() * 64) {
                                                                if (zzlb.OooOoOO(zzghVar.zzn(), i3)) {
                                                                    str7 = str21;
                                                                    this.f37615OooO00o.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                                    bitSet2.set(i3);
                                                                    if (zzlb.OooOoOO(zzghVar.zzk(), i3)) {
                                                                        bitSet.set(i3);
                                                                    }
                                                                    i3++;
                                                                    str21 = str7;
                                                                } else {
                                                                    str7 = str21;
                                                                }
                                                                oooo0.remove(Integer.valueOf(i3));
                                                                i3++;
                                                                str21 = str7;
                                                            }
                                                        }
                                                        String str210 = str21;
                                                        Integer numValueOf16 = Integer.valueOf(iIntValue);
                                                        zzgh zzghVar4 = (zzgh) map2.get(numValueOf16);
                                                        if (!zZzs2) {
                                                        }
                                                        this.f37482OooO0o.put(Integer.valueOf(iIntValue), new o0OOooO0(this, this.f37481OooO0Oo, zzghVar4, bitSet, bitSet2, oooo0, oooo11));
                                                        map2 = map2;
                                                        map = map;
                                                        map3 = map8;
                                                        str2 = str2;
                                                        str21 = str210;
                                                    }
                                                    str4 = str21;
                                                    str5 = str2;
                                                    str6 = str3;
                                                }
                                                if (!list.isEmpty()) {
                                                    o0oo0o01 = new o0OO0o00(this);
                                                    oooo3 = new p021OooOooo.Oooo0();
                                                    it3 = list.iterator();
                                                    while (it3.hasNext()) {
                                                        zzfsVar = (zzfs) it3.next();
                                                        zzfsVarOooO00o = o0oo0o01.OooO00o(this.f37481OooO0Oo, zzfsVar);
                                                        if (zzfsVarOooO00o != null) {
                                                            oooOO0OZzi = this.f37794OooO0O0.zzi();
                                                            str9 = this.f37481OooO0Oo;
                                                            strZzh = zzfsVarOooO00o.zzh();
                                                            oooOOOOOooOo = oooOO0OZzi.OooOo(str9, zzfsVar.zzh());
                                                            if (oooOOOOOooOo == null) {
                                                                oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.OooO0o0(str9), oooOO0OZzi.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                                                oooOOOO = new OooOOOO(str9, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                                            } else {
                                                                oooOOOO = new OooOOOO(oooOOOOOooOo.f37504OooO00o, oooOOOOOooOo.f37505OooO0O0, oooOOOOOooOo.f37506OooO0OO + 1, oooOOOOOooOo.f37507OooO0Oo + 1, oooOOOOOooOo.f37509OooO0o0 + 1, oooOOOOOooOo.f37508OooO0o, oooOOOOOooOo.f37510OooO0oO, oooOOOOOooOo.f37511OooO0oo, oooOOOOOooOo.f37503OooO, oooOOOOOooOo.f37512OooOO0, oooOOOOOooOo.f37513OooOO0O);
                                                            }
                                                            this.f37794OooO0O0.zzi().OooO0o(oooOOOO);
                                                            j = oooOOOO.f37506OooO0OO;
                                                            strZzh2 = zzfsVarOooO00o.zzh();
                                                            mapEmptyMap2 = (Map) oooo3.get(strZzh2);
                                                            if (mapEmptyMap2 == null) {
                                                                oooOO0OZzi2 = this.f37794OooO0O0.zzi();
                                                                str13 = this.f37481OooO0Oo;
                                                                oooOO0OZzi2.OooO00o();
                                                                oooOO0OZzi2.zzg();
                                                                Preconditions.checkNotEmpty(str13);
                                                                Preconditions.checkNotEmpty(strZzh2);
                                                                oooo4 = new p021OooOooo.Oooo0();
                                                                it4 = it3;
                                                                cursorQuery2 = oooOO0OZzi2.OooOOo().query("event_filters", new String[]{str5, str24}, "app_id=? AND event_name=?", new String[]{str13, strZzh2}, null, null, null);
                                                                if (cursorQuery2.moveToFirst()) {
                                                                    while (true) {
                                                                        str10 = str5;
                                                                        zzej zzejVar6 = (zzej) ((zzei) zzlb.OooOOoo(zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                                        numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                                        list5 = (List) oooo4.get(numValueOf3);
                                                                        if (list5 == null) {
                                                                            str11 = str24;
                                                                            arrayList2 = new ArrayList();
                                                                            oooo4.put(numValueOf3, arrayList2);
                                                                        } else {
                                                                            str11 = str24;
                                                                            arrayList2 = list5;
                                                                        }
                                                                        arrayList2.add(zzejVar6);
                                                                        if (!cursorQuery2.moveToNext()) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        str5 = str10;
                                                                        str24 = str11;
                                                                    }
                                                                    cursorQuery2.close();
                                                                    mapEmptyMap2 = oooo4;
                                                                    str12 = str6;
                                                                } else {
                                                                    str10 = str5;
                                                                    str11 = str24;
                                                                    mapEmptyMap2 = Collections.emptyMap();
                                                                    str12 = str6;
                                                                    cursorQuery2.close();
                                                                }
                                                                oooo3.put(strZzh2, mapEmptyMap2);
                                                            } else {
                                                                it4 = it3;
                                                                str10 = str5;
                                                                str11 = str24;
                                                                str12 = str6;
                                                            }
                                                            it5 = mapEmptyMap2.keySet().iterator();
                                                            while (it5.hasNext()) {
                                                                iIntValue2 = ((Integer) it5.next()).intValue();
                                                                hashSet = this.f37483OooO0o0;
                                                                numValueOf2 = Integer.valueOf(iIntValue2);
                                                                if (hashSet.contains(numValueOf2)) {
                                                                    this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                                                } else {
                                                                    it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                                                                    zOooO = true;
                                                                    while (true) {
                                                                        if (it6.hasNext()) {
                                                                            map6 = mapEmptyMap2;
                                                                            break;
                                                                        }
                                                                        zzej zzejVar7 = (zzej) it6.next();
                                                                        o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar7);
                                                                        map6 = mapEmptyMap2;
                                                                        zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar7.zzb()));
                                                                        if (zOooO) {
                                                                            this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                            break;
                                                                        }
                                                                        OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                                                        mapEmptyMap2 = map6;
                                                                    }
                                                                    if (!zOooO) {
                                                                        this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                                    }
                                                                    mapEmptyMap2 = map6;
                                                                }
                                                            }
                                                            it3 = it4;
                                                            str6 = str12;
                                                            o0oo0o01 = o0oo0o01;
                                                            str5 = str10;
                                                            str24 = str11;
                                                        }
                                                    }
                                                }
                                                str14 = str5;
                                                str15 = str24;
                                                String str32 = str6;
                                                if (!list2.isEmpty()) {
                                                    oooo5 = new p021OooOooo.Oooo0();
                                                    it7 = list2.iterator();
                                                    while (it7.hasNext()) {
                                                        zzgl zzglVar2 = (zzgl) it7.next();
                                                        strZzf = zzglVar2.zzf();
                                                        mapEmptyMap3 = (Map) oooo5.get(strZzf);
                                                        if (mapEmptyMap3 == null) {
                                                            oooOO0OZzi3 = this.f37794OooO0O0.zzi();
                                                            str18 = this.f37481OooO0Oo;
                                                            oooOO0OZzi3.OooO00o();
                                                            oooOO0OZzi3.zzg();
                                                            Preconditions.checkNotEmpty(str18);
                                                            Preconditions.checkNotEmpty(strZzf);
                                                            oooo6 = new p021OooOooo.Oooo0();
                                                            str16 = str14;
                                                            str17 = str15;
                                                            cursorQuery3 = oooOO0OZzi3.OooOOo().query("property_filters", new String[]{str16, str17}, "app_id=? AND property_name=?", new String[]{str18, strZzf}, null, null, null);
                                                            if (cursorQuery3.moveToFirst()) {
                                                                while (true) {
                                                                    zzes zzesVar3 = (zzes) ((zzer) zzlb.OooOOoo(zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                                    numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                                    list6 = (List) oooo6.get(numValueOf7);
                                                                    if (list6 == null) {
                                                                        arrayList3 = new ArrayList();
                                                                        oooo6.put(numValueOf7, arrayList3);
                                                                    } else {
                                                                        arrayList3 = list6;
                                                                    }
                                                                    arrayList3.add(zzesVar3);
                                                                    if (!cursorQuery3.moveToNext()) {
                                                                        break;
                                                                        break;
                                                                    }
                                                                    it7 = it7;
                                                                }
                                                                cursorQuery3.close();
                                                                mapEmptyMap3 = oooo6;
                                                            } else {
                                                                it7 = it7;
                                                                mapEmptyMap3 = Collections.emptyMap();
                                                                cursorQuery3.close();
                                                            }
                                                            oooo5.put(strZzf, mapEmptyMap3);
                                                        } else {
                                                            it7 = it7;
                                                            str16 = str14;
                                                            str17 = str15;
                                                        }
                                                        it8 = mapEmptyMap3.keySet().iterator();
                                                        while (it8.hasNext()) {
                                                            iIntValue3 = ((Integer) it8.next()).intValue();
                                                            hashSet2 = this.f37483OooO0o0;
                                                            numValueOf4 = Integer.valueOf(iIntValue3);
                                                            if (hashSet2.contains(numValueOf4)) {
                                                                this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                                                break;
                                                                break;
                                                            }
                                                            it9 = ((List) mapEmptyMap3.get(numValueOf4)).iterator();
                                                            zOooO2 = true;
                                                            while (true) {
                                                                if (it9.hasNext()) {
                                                                    zzesVar = (zzes) it9.next();
                                                                    if (Log.isLoggable(this.f37615OooO00o.zzay().zzq(), 2)) {
                                                                        zzem zzemVarZzj2 = this.f37615OooO00o.zzay().zzj();
                                                                        Integer numValueOf17 = Integer.valueOf(iIntValue3);
                                                                        if (zzesVar.zzj()) {
                                                                            numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                                        } else {
                                                                            numValueOf6 = null;
                                                                        }
                                                                        zzemVarZzj2.zzd("Evaluating filter. audience, filter, property", numValueOf17, numValueOf6, this.f37615OooO00o.zzj().OooO0o(zzesVar.zze()));
                                                                        this.f37615OooO00o.zzay().zzj().zzb("Filter definition", this.f37794OooO0O0.zzu().OooOo0(zzesVar));
                                                                    }
                                                                    if (zzesVar.zzj()) {
                                                                    }
                                                                    zzem zzemVarZzk2 = this.f37615OooO00o.zzay().zzk();
                                                                    Object objOooO0o1 = zzeo.OooO0o0(this.f37481OooO0Oo);
                                                                    if (zzesVar.zzj()) {
                                                                        numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                                    } else {
                                                                        numValueOf5 = null;
                                                                    }
                                                                    zzemVarZzk2.zzc("Invalid property filter ID. appId, id", objOooO0o1, String.valueOf(numValueOf5));
                                                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                                                    mapEmptyMap3 = mapEmptyMap3;
                                                                } else {
                                                                    mapEmptyMap3 = mapEmptyMap3;
                                                                }
                                                                if (!zOooO2) {
                                                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                                                }
                                                                mapEmptyMap3 = mapEmptyMap3;
                                                                OooO0Oo(Integer.valueOf(iIntValue3)).OooO0O0(o0oo);
                                                                mapEmptyMap3 = mapEmptyMap3;
                                                            }
                                                        }
                                                        it7 = it7;
                                                        str15 = str17;
                                                        str14 = str16;
                                                    }
                                                }
                                                str19 = str14;
                                                arrayList4 = new ArrayList();
                                                OooOooo.Oooo0.OooO0OO oooO0OO2 = (OooOooo.Oooo0.OooO0OO) this.f37482OooO0o.keySet();
                                                oooO0OO2.removeAll(this.f37483OooO0o0);
                                                it10 = oooO0OO2.iterator();
                                                while (it10.hasNext()) {
                                                    int iIntValue7 = ((Integer) it10.next()).intValue();
                                                    p021OooOooo.Oooo0 oooo12 = this.f37482OooO0o;
                                                    Integer numValueOf18 = Integer.valueOf(iIntValue7);
                                                    o0OOooO0 o0ooooo2 = (o0OOooO0) oooo12.get(numValueOf18);
                                                    Preconditions.checkNotNull(o0ooooo2);
                                                    zzfo zzfoVarOooO00o2 = o0ooooo2.OooO00o(iIntValue7);
                                                    arrayList4.add(zzfoVarOooO00o2);
                                                    oooOO0OZzi4 = this.f37794OooO0O0.zzi();
                                                    str20 = this.f37481OooO0Oo;
                                                    zzgh zzghVarZzd2 = zzfoVarOooO00o2.zzd();
                                                    oooOO0OZzi4.OooO00o();
                                                    oooOO0OZzi4.zzg();
                                                    Preconditions.checkNotEmpty(str20);
                                                    Preconditions.checkNotNull(zzghVarZzd2);
                                                    byte[] bArrZzbv2 = zzghVarZzd2.zzbv();
                                                    contentValues = new ContentValues();
                                                    contentValues.put("app_id", str20);
                                                    contentValues.put(str19, numValueOf18);
                                                    String str33 = str4;
                                                    contentValues.put(str33, bArrZzbv2);
                                                    if (oooOO0OZzi4.OooOOo().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                                        oooOO0OZzi4.f37615OooO00o.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.OooO0o0(str20));
                                                    }
                                                    str4 = str33;
                                                }
                                                return arrayList4;
                                            }
                                        }
                                        try {
                                            if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
                                            oooo7 = oooo7;
                                            str25 = str2;
                                            str24 = str24;
                                        } catch (SQLiteException e20) {
                                            e = e20;
                                            oooOO0OZzi7.f37615OooO00o.zzay().zzd().zzc("Database error querying filter results. appId", zzeo.OooO0o0(str27), e);
                                            Map mapEmptyMap7 = Collections.emptyMap();
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            map2 = mapEmptyMap7;
                                        }
                                    }
                                    cursorQuery.close();
                                    map2 = oooo7;
                                } else {
                                    Map mapEmptyMap8 = Collections.emptyMap();
                                    cursorQuery.close();
                                    map2 = mapEmptyMap8;
                                    str2 = "audience_id";
                                    str24 = "data";
                                }
                            } catch (SQLiteException e21) {
                                e = e21;
                                str2 = "audience_id";
                            }
                            if (map2.isEmpty()) {
                                str6 = "Database error querying filters. appId";
                                str4 = "current_results";
                                str5 = str2;
                            } else {
                                HashSet hashSet4 = new HashSet(map2.keySet());
                                if (z) {
                                    String str211 = this.f37481OooO0Oo;
                                    OooOO0O oooOO0OZzi9 = this.f37794OooO0O0.zzi();
                                    str8 = this.f37481OooO0Oo;
                                    oooOO0OZzi9.OooO00o();
                                    oooOO0OZzi9.zzg();
                                    Preconditions.checkNotEmpty(str8);
                                    oooo1 = new p021OooOooo.Oooo0();
                                    OooOOo2 = oooOO0OZzi9.OooOOo();
                                    cursorRawQuery = OooOOo2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                                            arrayList = (List) oooo1.get(numValueOf);
                                            if (arrayList == null) {
                                                arrayList = new ArrayList();
                                                oooo1.put(numValueOf, arrayList);
                                            }
                                            arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                                        } while (cursorRawQuery.moveToNext());
                                        mapEmptyMap = oooo1;
                                    } else {
                                        mapEmptyMap = Collections.emptyMap();
                                    }
                                    cursorRawQuery.close();
                                    map4 = mapEmptyMap;
                                    Preconditions.checkNotEmpty(str211);
                                    Preconditions.checkNotNull(map2);
                                    oooo2 = new p021OooOooo.Oooo0();
                                    if (!map2.isEmpty()) {
                                        it2 = map2.keySet().iterator();
                                        while (it2.hasNext()) {
                                            int iIntValue8 = ((Integer) it2.next()).intValue();
                                            Integer numValueOf19 = Integer.valueOf(iIntValue8);
                                            zzghVar2 = (zzgh) map2.get(numValueOf19);
                                            list4 = (List) map4.get(numValueOf19);
                                            if (list4 != null) {
                                            }
                                            map5 = map4;
                                            oooo2.put(numValueOf19, zzghVar2);
                                            map4 = map5;
                                            it2 = it2;
                                            str23 = str23;
                                        }
                                    }
                                    str3 = str23;
                                    map3 = oooo2;
                                } else {
                                    str3 = "Database error querying filters. appId";
                                    map3 = map2;
                                }
                                it = hashSet4.iterator();
                                while (it.hasNext()) {
                                    iIntValue = ((Integer) it.next()).intValue();
                                    zzghVar = (zzgh) map3.get(Integer.valueOf(iIntValue));
                                    bitSet = new BitSet();
                                    bitSet2 = new BitSet();
                                    oooo0 = new p021OooOooo.Oooo0();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (zzfqVar.zzh()) {
                                                Integer numValueOf110 = Integer.valueOf(zzfqVar.zza());
                                                if (zzfqVar.zzg()) {
                                                    lValueOf = Long.valueOf(zzfqVar.zzb());
                                                } else {
                                                    lValueOf = null;
                                                }
                                                oooo0.put(numValueOf110, lValueOf);
                                            }
                                        }
                                    }
                                    p021OooOooo.Oooo0 oooo13 = new p021OooOooo.Oooo0();
                                    if (zzghVar != null) {
                                        while (r2.hasNext()) {
                                            if (!zzgjVar.zzi()) {
                                            }
                                        }
                                    }
                                    Map map9 = map3;
                                    if (zzghVar != null) {
                                        i3 = 0;
                                        while (i3 < zzghVar.zzd() * 64) {
                                            if (zzlb.OooOoOO(zzghVar.zzn(), i3)) {
                                                str7 = str21;
                                                this.f37615OooO00o.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                                                bitSet2.set(i3);
                                                if (zzlb.OooOoOO(zzghVar.zzk(), i3)) {
                                                    bitSet.set(i3);
                                                }
                                                i3++;
                                                str21 = str7;
                                            } else {
                                                str7 = str21;
                                            }
                                            oooo0.remove(Integer.valueOf(i3));
                                            i3++;
                                            str21 = str7;
                                        }
                                    }
                                    String str212 = str21;
                                    Integer numValueOf111 = Integer.valueOf(iIntValue);
                                    zzgh zzghVar5 = (zzgh) map2.get(numValueOf111);
                                    if (!zZzs2) {
                                    }
                                    this.f37482OooO0o.put(Integer.valueOf(iIntValue), new o0OOooO0(this, this.f37481OooO0Oo, zzghVar5, bitSet, bitSet2, oooo0, oooo13));
                                    map2 = map2;
                                    map = map;
                                    map3 = map9;
                                    str2 = str2;
                                    str21 = str212;
                                }
                                str4 = str21;
                                str5 = str2;
                                str6 = str3;
                            }
                            if (!list.isEmpty()) {
                                o0oo0o01 = new o0OO0o00(this);
                                oooo3 = new p021OooOooo.Oooo0();
                                it3 = list.iterator();
                                while (it3.hasNext()) {
                                    zzfsVar = (zzfs) it3.next();
                                    zzfsVarOooO00o = o0oo0o01.OooO00o(this.f37481OooO0Oo, zzfsVar);
                                    if (zzfsVarOooO00o != null) {
                                        oooOO0OZzi = this.f37794OooO0O0.zzi();
                                        str9 = this.f37481OooO0Oo;
                                        strZzh = zzfsVarOooO00o.zzh();
                                        oooOOOOOooOo = oooOO0OZzi.OooOo(str9, zzfsVar.zzh());
                                        if (oooOOOOOooOo == null) {
                                            oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.OooO0o0(str9), oooOO0OZzi.f37615OooO00o.zzj().OooO0Oo(strZzh));
                                            oooOOOO = new OooOOOO(str9, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                                        } else {
                                            oooOOOO = new OooOOOO(oooOOOOOooOo.f37504OooO00o, oooOOOOOooOo.f37505OooO0O0, oooOOOOOooOo.f37506OooO0OO + 1, oooOOOOOooOo.f37507OooO0Oo + 1, oooOOOOOooOo.f37509OooO0o0 + 1, oooOOOOOooOo.f37508OooO0o, oooOOOOOooOo.f37510OooO0oO, oooOOOOOooOo.f37511OooO0oo, oooOOOOOooOo.f37503OooO, oooOOOOOooOo.f37512OooOO0, oooOOOOOooOo.f37513OooOO0O);
                                        }
                                        this.f37794OooO0O0.zzi().OooO0o(oooOOOO);
                                        j = oooOOOO.f37506OooO0OO;
                                        strZzh2 = zzfsVarOooO00o.zzh();
                                        mapEmptyMap2 = (Map) oooo3.get(strZzh2);
                                        if (mapEmptyMap2 == null) {
                                            oooOO0OZzi2 = this.f37794OooO0O0.zzi();
                                            str13 = this.f37481OooO0Oo;
                                            oooOO0OZzi2.OooO00o();
                                            oooOO0OZzi2.zzg();
                                            Preconditions.checkNotEmpty(str13);
                                            Preconditions.checkNotEmpty(strZzh2);
                                            oooo4 = new p021OooOooo.Oooo0();
                                            it4 = it3;
                                            cursorQuery2 = oooOO0OZzi2.OooOOo().query("event_filters", new String[]{str5, str24}, "app_id=? AND event_name=?", new String[]{str13, strZzh2}, null, null, null);
                                            if (cursorQuery2.moveToFirst()) {
                                                while (true) {
                                                    str10 = str5;
                                                    zzej zzejVar8 = (zzej) ((zzei) zzlb.OooOOoo(zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                                    numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                                    list5 = (List) oooo4.get(numValueOf3);
                                                    if (list5 == null) {
                                                        str11 = str24;
                                                        arrayList2 = new ArrayList();
                                                        oooo4.put(numValueOf3, arrayList2);
                                                    } else {
                                                        str11 = str24;
                                                        arrayList2 = list5;
                                                    }
                                                    arrayList2.add(zzejVar8);
                                                    if (!cursorQuery2.moveToNext()) {
                                                        break;
                                                        break;
                                                    }
                                                    str5 = str10;
                                                    str24 = str11;
                                                }
                                                cursorQuery2.close();
                                                mapEmptyMap2 = oooo4;
                                                str12 = str6;
                                            } else {
                                                str10 = str5;
                                                str11 = str24;
                                                mapEmptyMap2 = Collections.emptyMap();
                                                str12 = str6;
                                                cursorQuery2.close();
                                            }
                                            oooo3.put(strZzh2, mapEmptyMap2);
                                        } else {
                                            it4 = it3;
                                            str10 = str5;
                                            str11 = str24;
                                            str12 = str6;
                                        }
                                        it5 = mapEmptyMap2.keySet().iterator();
                                        while (it5.hasNext()) {
                                            iIntValue2 = ((Integer) it5.next()).intValue();
                                            hashSet = this.f37483OooO0o0;
                                            numValueOf2 = Integer.valueOf(iIntValue2);
                                            if (hashSet.contains(numValueOf2)) {
                                                this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                                            } else {
                                                it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                                                zOooO = true;
                                                while (true) {
                                                    if (it6.hasNext()) {
                                                        map6 = mapEmptyMap2;
                                                        break;
                                                    }
                                                    zzej zzejVar9 = (zzej) it6.next();
                                                    o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar9);
                                                    map6 = mapEmptyMap2;
                                                    zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar9.zzb()));
                                                    if (zOooO) {
                                                        this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                        break;
                                                    }
                                                    OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                                    mapEmptyMap2 = map6;
                                                }
                                                if (!zOooO) {
                                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                                }
                                                mapEmptyMap2 = map6;
                                            }
                                        }
                                        it3 = it4;
                                        str6 = str12;
                                        o0oo0o01 = o0oo0o01;
                                        str5 = str10;
                                        str24 = str11;
                                    }
                                }
                            }
                            str14 = str5;
                            str15 = str24;
                            String str34 = str6;
                            if (!list2.isEmpty()) {
                                oooo5 = new p021OooOooo.Oooo0();
                                it7 = list2.iterator();
                                while (it7.hasNext()) {
                                    zzgl zzglVar3 = (zzgl) it7.next();
                                    strZzf = zzglVar3.zzf();
                                    mapEmptyMap3 = (Map) oooo5.get(strZzf);
                                    if (mapEmptyMap3 == null) {
                                        oooOO0OZzi3 = this.f37794OooO0O0.zzi();
                                        str18 = this.f37481OooO0Oo;
                                        oooOO0OZzi3.OooO00o();
                                        oooOO0OZzi3.zzg();
                                        Preconditions.checkNotEmpty(str18);
                                        Preconditions.checkNotEmpty(strZzf);
                                        oooo6 = new p021OooOooo.Oooo0();
                                        str16 = str14;
                                        str17 = str15;
                                        cursorQuery3 = oooOO0OZzi3.OooOOo().query("property_filters", new String[]{str16, str17}, "app_id=? AND property_name=?", new String[]{str18, strZzf}, null, null, null);
                                        if (cursorQuery3.moveToFirst()) {
                                            while (true) {
                                                zzes zzesVar4 = (zzes) ((zzer) zzlb.OooOOoo(zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                                                numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                                                list6 = (List) oooo6.get(numValueOf7);
                                                if (list6 == null) {
                                                    arrayList3 = new ArrayList();
                                                    oooo6.put(numValueOf7, arrayList3);
                                                } else {
                                                    arrayList3 = list6;
                                                }
                                                arrayList3.add(zzesVar4);
                                                if (!cursorQuery3.moveToNext()) {
                                                    break;
                                                    break;
                                                }
                                                it7 = it7;
                                            }
                                            cursorQuery3.close();
                                            mapEmptyMap3 = oooo6;
                                        } else {
                                            it7 = it7;
                                            mapEmptyMap3 = Collections.emptyMap();
                                            cursorQuery3.close();
                                        }
                                        oooo5.put(strZzf, mapEmptyMap3);
                                    } else {
                                        it7 = it7;
                                        str16 = str14;
                                        str17 = str15;
                                    }
                                    it8 = mapEmptyMap3.keySet().iterator();
                                    while (it8.hasNext()) {
                                        iIntValue3 = ((Integer) it8.next()).intValue();
                                        hashSet2 = this.f37483OooO0o0;
                                        numValueOf4 = Integer.valueOf(iIntValue3);
                                        if (hashSet2.contains(numValueOf4)) {
                                            this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                                            break;
                                            break;
                                        }
                                        it9 = ((List) mapEmptyMap3.get(numValueOf4)).iterator();
                                        zOooO2 = true;
                                        while (true) {
                                            if (it9.hasNext()) {
                                                zzesVar = (zzes) it9.next();
                                                if (Log.isLoggable(this.f37615OooO00o.zzay().zzq(), 2)) {
                                                    zzem zzemVarZzj3 = this.f37615OooO00o.zzay().zzj();
                                                    Integer numValueOf112 = Integer.valueOf(iIntValue3);
                                                    if (zzesVar.zzj()) {
                                                        numValueOf6 = Integer.valueOf(zzesVar.zza());
                                                    } else {
                                                        numValueOf6 = null;
                                                    }
                                                    zzemVarZzj3.zzd("Evaluating filter. audience, filter, property", numValueOf112, numValueOf6, this.f37615OooO00o.zzj().OooO0o(zzesVar.zze()));
                                                    this.f37615OooO00o.zzay().zzj().zzb("Filter definition", this.f37794OooO0O0.zzu().OooOo0(zzesVar));
                                                }
                                                if (zzesVar.zzj()) {
                                                }
                                                zzem zzemVarZzk3 = this.f37615OooO00o.zzay().zzk();
                                                Object objOooO0o2 = zzeo.OooO0o0(this.f37481OooO0Oo);
                                                if (zzesVar.zzj()) {
                                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                                } else {
                                                    numValueOf5 = null;
                                                }
                                                zzemVarZzk3.zzc("Invalid property filter ID. appId, id", objOooO0o2, String.valueOf(numValueOf5));
                                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                                mapEmptyMap3 = mapEmptyMap3;
                                            } else {
                                                mapEmptyMap3 = mapEmptyMap3;
                                            }
                                            if (!zOooO2) {
                                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                            }
                                            mapEmptyMap3 = mapEmptyMap3;
                                            OooO0Oo(Integer.valueOf(iIntValue3)).OooO0O0(o0oo);
                                            mapEmptyMap3 = mapEmptyMap3;
                                        }
                                    }
                                    it7 = it7;
                                    str15 = str17;
                                    str14 = str16;
                                }
                            }
                            str19 = str14;
                            arrayList4 = new ArrayList();
                            OooOooo.Oooo0.OooO0OO oooO0OO3 = (OooOooo.Oooo0.OooO0OO) this.f37482OooO0o.keySet();
                            oooO0OO3.removeAll(this.f37483OooO0o0);
                            it10 = oooO0OO3.iterator();
                            while (it10.hasNext()) {
                                int iIntValue9 = ((Integer) it10.next()).intValue();
                                p021OooOooo.Oooo0 oooo14 = this.f37482OooO0o;
                                Integer numValueOf113 = Integer.valueOf(iIntValue9);
                                o0OOooO0 o0ooooo3 = (o0OOooO0) oooo14.get(numValueOf113);
                                Preconditions.checkNotNull(o0ooooo3);
                                zzfo zzfoVarOooO00o3 = o0ooooo3.OooO00o(iIntValue9);
                                arrayList4.add(zzfoVarOooO00o3);
                                oooOO0OZzi4 = this.f37794OooO0O0.zzi();
                                str20 = this.f37481OooO0Oo;
                                zzgh zzghVarZzd3 = zzfoVarOooO00o3.zzd();
                                oooOO0OZzi4.OooO00o();
                                oooOO0OZzi4.zzg();
                                Preconditions.checkNotEmpty(str20);
                                Preconditions.checkNotNull(zzghVarZzd3);
                                byte[] bArrZzbv3 = zzghVarZzd3.zzbv();
                                contentValues = new ContentValues();
                                contentValues.put("app_id", str20);
                                contentValues.put(str19, numValueOf113);
                                String str35 = str4;
                                contentValues.put(str35, bArrZzbv3);
                                if (oooOO0OZzi4.OooOOo().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                                    oooOO0OZzi4.f37615OooO00o.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.OooO0o0(str20));
                                }
                                str4 = str35;
                            }
                            return arrayList4;
                        } catch (Throwable th7) {
                            th = th7;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    if (r5 != 0) {
                        r5.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e22) {
                e = e22;
                cursorQuery4 = null;
            } catch (Throwable th9) {
                th = th9;
                r5 = 0;
                if (r5 != 0) {
                    r5.close();
                }
                throw th;
            }
        } else {
            map = mapEmptyMap4;
        }
        OooOO0O oooOO0OZzi10 = this.f37794OooO0O0.zzi();
        String str213 = this.f37481OooO0Oo;
        oooOO0OZzi10.OooO00o();
        oooOO0OZzi10.zzg();
        Preconditions.checkNotEmpty(str213);
        try {
            cursorQuery = oooOO0OZzi10.OooOOo().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str213}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                Map mapEmptyMap9 = Collections.emptyMap();
                cursorQuery.close();
                map2 = mapEmptyMap9;
                str2 = "audience_id";
                str24 = "data";
            } else {
                oooo7 = new p021OooOooo.Oooo0();
                while (true) {
                    i4 = cursorQuery.getInt(0);
                    oooo7.put(Integer.valueOf(i4), (zzgh) ((zzgg) zzlb.OooOOoo(zzgh.zzf(), cursorQuery.getBlob(1))).zzaE());
                    str2 = str25;
                    if (!cursorQuery.moveToNext()) {
                        break;
                        break;
                    }
                    oooo7 = oooo7;
                    str25 = str2;
                    str24 = str24;
                }
                cursorQuery.close();
                map2 = oooo7;
            }
        } catch (SQLiteException e23) {
            e = e23;
            str2 = "audience_id";
            str24 = "data";
            cursorQuery = null;
        } catch (Throwable th10) {
            th = th10;
            cursor = null;
        }
        if (map2.isEmpty()) {
            str6 = "Database error querying filters. appId";
            str4 = "current_results";
            str5 = str2;
        } else {
            HashSet hashSet5 = new HashSet(map2.keySet());
            if (z) {
                String str214 = this.f37481OooO0Oo;
                OooOO0O oooOO0OZzi11 = this.f37794OooO0O0.zzi();
                str8 = this.f37481OooO0Oo;
                oooOO0OZzi11.OooO00o();
                oooOO0OZzi11.zzg();
                Preconditions.checkNotEmpty(str8);
                oooo1 = new p021OooOooo.Oooo0();
                OooOOo2 = oooOO0OZzi11.OooOOo();
                cursorRawQuery = OooOOo2.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str8, str8});
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        numValueOf = Integer.valueOf(cursorRawQuery.getInt(0));
                        arrayList = (List) oooo1.get(numValueOf);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            oooo1.put(numValueOf, arrayList);
                        }
                        arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                    } while (cursorRawQuery.moveToNext());
                    mapEmptyMap = oooo1;
                } else {
                    mapEmptyMap = Collections.emptyMap();
                }
                cursorRawQuery.close();
                map4 = mapEmptyMap;
                Preconditions.checkNotEmpty(str214);
                Preconditions.checkNotNull(map2);
                oooo2 = new p021OooOooo.Oooo0();
                if (!map2.isEmpty()) {
                    it2 = map2.keySet().iterator();
                    while (it2.hasNext()) {
                        int iIntValue10 = ((Integer) it2.next()).intValue();
                        Integer numValueOf114 = Integer.valueOf(iIntValue10);
                        zzghVar2 = (zzgh) map2.get(numValueOf114);
                        list4 = (List) map4.get(numValueOf114);
                        if (list4 != null || list4.isEmpty()) {
                            map5 = map4;
                            oooo2.put(numValueOf114, zzghVar2);
                            map4 = map5;
                            it2 = it2;
                            str23 = str23;
                        } else {
                            Map map10 = map4;
                            List listOooOo0O = this.f37794OooO0O0.zzu().OooOo0O(zzghVar2.zzk(), list4);
                            if (listOooOo0O.isEmpty()) {
                                map4 = map10;
                            } else {
                                zzgg zzggVar = (zzgg) zzghVar2.zzby();
                                zzggVar.zzf();
                                zzggVar.zzb(listOooOo0O);
                                List listOooOo0O2 = this.f37794OooO0O0.zzu().OooOo0O(zzghVar2.zzn(), list4);
                                zzggVar.zzh();
                                zzggVar.zzd(listOooOo0O2);
                                zzob.zzc();
                                if (this.f37615OooO00o.zzf().zzs(null, zzeb.zzaA)) {
                                    ArrayList arrayList6 = new ArrayList();
                                    Iterator it12 = zzghVar2.zzj().iterator();
                                    while (it12.hasNext()) {
                                        zzfq zzfqVar2 = (zzfq) it12.next();
                                        Iterator it13 = it12;
                                        if (!list4.contains(Integer.valueOf(zzfqVar2.zza()))) {
                                            arrayList6.add(zzfqVar2);
                                        }
                                        it12 = it13;
                                    }
                                    zzggVar.zze();
                                    zzggVar.zza(arrayList6);
                                    ArrayList arrayList7 = new ArrayList();
                                    for (zzgj zzgjVar2 : zzghVar2.zzm()) {
                                        if (!list4.contains(Integer.valueOf(zzgjVar2.zzb()))) {
                                            arrayList7.add(zzgjVar2);
                                        }
                                    }
                                    zzggVar.zzg();
                                    zzggVar.zzc(arrayList7);
                                } else {
                                    for (int i5 = 0; i5 < zzghVar2.zza(); i5++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zze(i5).zza()))) {
                                            zzggVar.zzi(i5);
                                        }
                                    }
                                    for (int i6 = 0; i6 < zzghVar2.zzc(); i6++) {
                                        if (list4.contains(Integer.valueOf(zzghVar2.zzi(i6).zzb()))) {
                                            zzggVar.zzj(i6);
                                        }
                                    }
                                }
                                oooo2.put(Integer.valueOf(iIntValue10), (zzgh) zzggVar.zzaE());
                                map5 = map10;
                                map4 = map5;
                                it2 = it2;
                                str23 = str23;
                            }
                        }
                    }
                }
                str3 = str23;
                map3 = oooo2;
            } else {
                str3 = "Database error querying filters. appId";
                map3 = map2;
            }
            it = hashSet5.iterator();
            while (it.hasNext()) {
                iIntValue = ((Integer) it.next()).intValue();
                zzghVar = (zzgh) map3.get(Integer.valueOf(iIntValue));
                bitSet = new BitSet();
                bitSet2 = new BitSet();
                oooo0 = new p021OooOooo.Oooo0();
                if (zzghVar != null && zzghVar.zza() != 0) {
                    while (r2.hasNext()) {
                        if (zzfqVar.zzh()) {
                            Integer numValueOf115 = Integer.valueOf(zzfqVar.zza());
                            if (zzfqVar.zzg()) {
                                lValueOf = Long.valueOf(zzfqVar.zzb());
                            } else {
                                lValueOf = null;
                            }
                            oooo0.put(numValueOf115, lValueOf);
                        }
                    }
                }
                p021OooOooo.Oooo0 oooo15 = new p021OooOooo.Oooo0();
                if (zzghVar != null && zzghVar.zzc() != 0) {
                    while (r2.hasNext()) {
                        if (!zzgjVar.zzi() && zzgjVar.zza() > 0) {
                            oooo15.put(Integer.valueOf(zzgjVar.zzb()), Long.valueOf(zzgjVar.zzc(zzgjVar.zza() - 1)));
                            map3 = map3;
                        }
                    }
                }
                Map map11 = map3;
                if (zzghVar != null) {
                    i3 = 0;
                    while (i3 < zzghVar.zzd() * 64) {
                        if (zzlb.OooOoOO(zzghVar.zzn(), i3)) {
                            str7 = str21;
                            this.f37615OooO00o.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(iIntValue), Integer.valueOf(i3));
                            bitSet2.set(i3);
                            if (zzlb.OooOoOO(zzghVar.zzk(), i3)) {
                                bitSet.set(i3);
                            }
                            i3++;
                            str21 = str7;
                        } else {
                            str7 = str21;
                        }
                        oooo0.remove(Integer.valueOf(i3));
                        i3++;
                        str21 = str7;
                    }
                }
                String str215 = str21;
                Integer numValueOf116 = Integer.valueOf(iIntValue);
                zzgh zzghVar6 = (zzgh) map2.get(numValueOf116);
                if (!zZzs2 && zZzs && (list3 = (List) map.get(numValueOf116)) != null && this.f37485OooO0oo != null && this.f37484OooO0oO != null) {
                    for (zzej zzejVar10 : list3) {
                        int iZzb = zzejVar10.zzb();
                        long jLongValue = this.f37485OooO0oo.longValue() / 1000;
                        if (zzejVar10.zzm()) {
                            jLongValue = this.f37484OooO0oO.longValue() / 1000;
                        }
                        Integer numValueOf20 = Integer.valueOf(iZzb);
                        if (oooo0.containsKey(numValueOf20)) {
                            oooo0.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                        if (oooo15.containsKey(numValueOf20)) {
                            oooo15.put(numValueOf20, Long.valueOf(jLongValue));
                        }
                    }
                }
                this.f37482OooO0o.put(Integer.valueOf(iIntValue), new o0OOooO0(this, this.f37481OooO0Oo, zzghVar6, bitSet, bitSet2, oooo0, oooo15));
                map2 = map2;
                map = map;
                map3 = map11;
                str2 = str2;
                str21 = str215;
            }
            str4 = str21;
            str5 = str2;
            str6 = str3;
        }
        if (!list.isEmpty()) {
            o0oo0o01 = new o0OO0o00(this);
            oooo3 = new p021OooOooo.Oooo0();
            it3 = list.iterator();
            while (it3.hasNext()) {
                zzfsVar = (zzfs) it3.next();
                zzfsVarOooO00o = o0oo0o01.OooO00o(this.f37481OooO0Oo, zzfsVar);
                if (zzfsVarOooO00o != null) {
                    oooOO0OZzi = this.f37794OooO0O0.zzi();
                    str9 = this.f37481OooO0Oo;
                    strZzh = zzfsVarOooO00o.zzh();
                    oooOOOOOooOo = oooOO0OZzi.OooOo(str9, zzfsVar.zzh());
                    if (oooOOOOOooOo == null) {
                        oooOO0OZzi.f37615OooO00o.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeo.OooO0o0(str9), oooOO0OZzi.f37615OooO00o.zzj().OooO0Oo(strZzh));
                        oooOOOO = new OooOOOO(str9, zzfsVar.zzh(), 1L, 1L, 1L, zzfsVar.zzd(), 0L, null, null, null, null);
                    } else {
                        oooOOOO = new OooOOOO(oooOOOOOooOo.f37504OooO00o, oooOOOOOooOo.f37505OooO0O0, oooOOOOOooOo.f37506OooO0OO + 1, oooOOOOOooOo.f37507OooO0Oo + 1, oooOOOOOooOo.f37509OooO0o0 + 1, oooOOOOOooOo.f37508OooO0o, oooOOOOOooOo.f37510OooO0oO, oooOOOOOooOo.f37511OooO0oo, oooOOOOOooOo.f37503OooO, oooOOOOOooOo.f37512OooOO0, oooOOOOOooOo.f37513OooOO0O);
                    }
                    this.f37794OooO0O0.zzi().OooO0o(oooOOOO);
                    j = oooOOOO.f37506OooO0OO;
                    strZzh2 = zzfsVarOooO00o.zzh();
                    mapEmptyMap2 = (Map) oooo3.get(strZzh2);
                    if (mapEmptyMap2 == null) {
                        oooOO0OZzi2 = this.f37794OooO0O0.zzi();
                        str13 = this.f37481OooO0Oo;
                        oooOO0OZzi2.OooO00o();
                        oooOO0OZzi2.zzg();
                        Preconditions.checkNotEmpty(str13);
                        Preconditions.checkNotEmpty(strZzh2);
                        oooo4 = new p021OooOooo.Oooo0();
                        it4 = it3;
                        cursorQuery2 = oooOO0OZzi2.OooOOo().query("event_filters", new String[]{str5, str24}, "app_id=? AND event_name=?", new String[]{str13, strZzh2}, null, null, null);
                        if (cursorQuery2.moveToFirst()) {
                            while (true) {
                                str10 = str5;
                                zzej zzejVar11 = (zzej) ((zzei) zzlb.OooOOoo(zzej.zzc(), cursorQuery2.getBlob(1))).zzaE();
                                numValueOf3 = Integer.valueOf(cursorQuery2.getInt(0));
                                list5 = (List) oooo4.get(numValueOf3);
                                if (list5 == null) {
                                    str11 = str24;
                                    arrayList2 = new ArrayList();
                                    oooo4.put(numValueOf3, arrayList2);
                                } else {
                                    str11 = str24;
                                    arrayList2 = list5;
                                }
                                arrayList2.add(zzejVar11);
                                if (!cursorQuery2.moveToNext()) {
                                    break;
                                    break;
                                }
                                str5 = str10;
                                str24 = str11;
                            }
                            cursorQuery2.close();
                            mapEmptyMap2 = oooo4;
                            str12 = str6;
                        } else {
                            str10 = str5;
                            str11 = str24;
                            mapEmptyMap2 = Collections.emptyMap();
                            str12 = str6;
                            cursorQuery2.close();
                        }
                        oooo3.put(strZzh2, mapEmptyMap2);
                    } else {
                        it4 = it3;
                        str10 = str5;
                        str11 = str24;
                        str12 = str6;
                    }
                    it5 = mapEmptyMap2.keySet().iterator();
                    while (it5.hasNext()) {
                        iIntValue2 = ((Integer) it5.next()).intValue();
                        hashSet = this.f37483OooO0o0;
                        numValueOf2 = Integer.valueOf(iIntValue2);
                        if (hashSet.contains(numValueOf2)) {
                            this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf2);
                        } else {
                            it6 = ((List) mapEmptyMap2.get(numValueOf2)).iterator();
                            zOooO = true;
                            while (true) {
                                if (it6.hasNext()) {
                                    map6 = mapEmptyMap2;
                                    break;
                                }
                                zzej zzejVar12 = (zzej) it6.next();
                                o0oo0o2 = new o0OO0o(this, this.f37481OooO0Oo, iIntValue2, zzejVar12);
                                map6 = mapEmptyMap2;
                                zOooO = o0oo0o2.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzfsVarOooO00o, j, oooOOOO, OooO0o0(iIntValue2, zzejVar12.zzb()));
                                if (zOooO) {
                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                                    break;
                                }
                                OooO0Oo(Integer.valueOf(iIntValue2)).OooO0O0(o0oo0o2);
                                mapEmptyMap2 = map6;
                            }
                            if (!zOooO) {
                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue2));
                            }
                            mapEmptyMap2 = map6;
                        }
                    }
                    it3 = it4;
                    str6 = str12;
                    o0oo0o01 = o0oo0o01;
                    str5 = str10;
                    str24 = str11;
                }
            }
        }
        str14 = str5;
        str15 = str24;
        String str36 = str6;
        if (!list2.isEmpty()) {
            oooo5 = new p021OooOooo.Oooo0();
            it7 = list2.iterator();
            while (it7.hasNext()) {
                zzgl zzglVar4 = (zzgl) it7.next();
                strZzf = zzglVar4.zzf();
                mapEmptyMap3 = (Map) oooo5.get(strZzf);
                if (mapEmptyMap3 == null) {
                    oooOO0OZzi3 = this.f37794OooO0O0.zzi();
                    str18 = this.f37481OooO0Oo;
                    oooOO0OZzi3.OooO00o();
                    oooOO0OZzi3.zzg();
                    Preconditions.checkNotEmpty(str18);
                    Preconditions.checkNotEmpty(strZzf);
                    oooo6 = new p021OooOooo.Oooo0();
                    str16 = str14;
                    str17 = str15;
                    cursorQuery3 = oooOO0OZzi3.OooOOo().query("property_filters", new String[]{str16, str17}, "app_id=? AND property_name=?", new String[]{str18, strZzf}, null, null, null);
                    if (cursorQuery3.moveToFirst()) {
                        while (true) {
                            zzes zzesVar5 = (zzes) ((zzer) zzlb.OooOOoo(zzes.zzc(), cursorQuery3.getBlob(1))).zzaE();
                            numValueOf7 = Integer.valueOf(cursorQuery3.getInt(0));
                            list6 = (List) oooo6.get(numValueOf7);
                            if (list6 == null) {
                                arrayList3 = new ArrayList();
                                oooo6.put(numValueOf7, arrayList3);
                            } else {
                                arrayList3 = list6;
                            }
                            arrayList3.add(zzesVar5);
                            if (!cursorQuery3.moveToNext()) {
                                break;
                                break;
                            }
                            it7 = it7;
                        }
                        cursorQuery3.close();
                        mapEmptyMap3 = oooo6;
                    } else {
                        it7 = it7;
                        mapEmptyMap3 = Collections.emptyMap();
                        cursorQuery3.close();
                    }
                    oooo5.put(strZzf, mapEmptyMap3);
                } else {
                    it7 = it7;
                    str16 = str14;
                    str17 = str15;
                }
                it8 = mapEmptyMap3.keySet().iterator();
                while (it8.hasNext()) {
                    iIntValue3 = ((Integer) it8.next()).intValue();
                    hashSet2 = this.f37483OooO0o0;
                    numValueOf4 = Integer.valueOf(iIntValue3);
                    if (hashSet2.contains(numValueOf4)) {
                        this.f37615OooO00o.zzay().zzj().zzb("Skipping failed audience ID", numValueOf4);
                        break;
                        break;
                    }
                    it9 = ((List) mapEmptyMap3.get(numValueOf4)).iterator();
                    zOooO2 = true;
                    while (true) {
                        if (it9.hasNext()) {
                            zzesVar = (zzes) it9.next();
                            if (Log.isLoggable(this.f37615OooO00o.zzay().zzq(), 2)) {
                                zzem zzemVarZzj4 = this.f37615OooO00o.zzay().zzj();
                                Integer numValueOf117 = Integer.valueOf(iIntValue3);
                                if (zzesVar.zzj()) {
                                    numValueOf6 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf6 = null;
                                }
                                zzemVarZzj4.zzd("Evaluating filter. audience, filter, property", numValueOf117, numValueOf6, this.f37615OooO00o.zzj().OooO0o(zzesVar.zze()));
                                this.f37615OooO00o.zzay().zzj().zzb("Filter definition", this.f37794OooO0O0.zzu().OooOo0(zzesVar));
                            }
                            if (zzesVar.zzj() || zzesVar.zza() > 256) {
                                zzem zzemVarZzk4 = this.f37615OooO00o.zzay().zzk();
                                Object objOooO0o3 = zzeo.OooO0o0(this.f37481OooO0Oo);
                                if (zzesVar.zzj()) {
                                    numValueOf5 = Integer.valueOf(zzesVar.zza());
                                } else {
                                    numValueOf5 = null;
                                }
                                zzemVarZzk4.zzc("Invalid property filter ID. appId, id", objOooO0o3, String.valueOf(numValueOf5));
                                this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                mapEmptyMap3 = mapEmptyMap3;
                            } else {
                                o0oo = new o0OO(this, this.f37481OooO0Oo, iIntValue3, zzesVar);
                                zOooO2 = o0oo.OooO(this.f37484OooO0oO, this.f37485OooO0oo, zzglVar4, OooO0o0(iIntValue3, zzesVar.zza()));
                                if (zOooO2) {
                                    OooO0Oo(Integer.valueOf(iIntValue3)).OooO0O0(o0oo);
                                    mapEmptyMap3 = mapEmptyMap3;
                                } else {
                                    this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                                }
                            }
                        } else {
                            mapEmptyMap3 = mapEmptyMap3;
                        }
                        if (!zOooO2) {
                            this.f37483OooO0o0.add(Integer.valueOf(iIntValue3));
                        }
                        mapEmptyMap3 = mapEmptyMap3;
                    }
                }
                it7 = it7;
                str15 = str17;
                str14 = str16;
            }
        }
        str19 = str14;
        arrayList4 = new ArrayList();
        OooOooo.Oooo0.OooO0OO oooO0OO4 = (OooOooo.Oooo0.OooO0OO) this.f37482OooO0o.keySet();
        oooO0OO4.removeAll(this.f37483OooO0o0);
        it10 = oooO0OO4.iterator();
        while (it10.hasNext()) {
            int iIntValue11 = ((Integer) it10.next()).intValue();
            p021OooOooo.Oooo0 oooo16 = this.f37482OooO0o;
            Integer numValueOf118 = Integer.valueOf(iIntValue11);
            o0OOooO0 o0ooooo4 = (o0OOooO0) oooo16.get(numValueOf118);
            Preconditions.checkNotNull(o0ooooo4);
            zzfo zzfoVarOooO00o4 = o0ooooo4.OooO00o(iIntValue11);
            arrayList4.add(zzfoVarOooO00o4);
            oooOO0OZzi4 = this.f37794OooO0O0.zzi();
            str20 = this.f37481OooO0Oo;
            zzgh zzghVarZzd4 = zzfoVarOooO00o4.zzd();
            oooOO0OZzi4.OooO00o();
            oooOO0OZzi4.zzg();
            Preconditions.checkNotEmpty(str20);
            Preconditions.checkNotNull(zzghVarZzd4);
            byte[] bArrZzbv4 = zzghVarZzd4.zzbv();
            contentValues = new ContentValues();
            contentValues.put("app_id", str20);
            contentValues.put(str19, numValueOf118);
            String str37 = str4;
            contentValues.put(str37, bArrZzbv4);
            if (oooOO0OZzi4.OooOOo().insertWithOnConflict("audience_filter_values", null, contentValues, 5) == -1) {
                oooOO0OZzi4.f37615OooO00o.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeo.OooO0o0(str20));
            }
            str4 = str37;
        }
        return arrayList4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o0OOooO0 OooO0Oo(Integer num) {
        if (this.f37482OooO0o.containsKey(num)) {
            return (o0OOooO0) this.f37482OooO0o.getOrDefault(num, null);
        }
        o0OOooO0 o0ooooo1 = new o0OOooO0(this, this.f37481OooO0Oo);
        this.f37482OooO0o.put(num, o0ooooo1);
        return o0ooooo1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean OooO0o0(int i, int i2) {
        o0OOooO0 o0ooooo1 = (o0OOooO0) this.f37482OooO0o.getOrDefault(Integer.valueOf(i), null);
        if (o0ooooo1 == null) {
            return false;
        }
        return o0ooooo1.f37850OooO0Oo.get(i2);
    }
}
