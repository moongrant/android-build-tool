package com.google.android.exoplayer2.extractor.mkv;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.video.ColorInfo;
import com.umeng.analytics.pro.bz;
import com.zego.zegoavkit2.audioprocessing.ZegoAudioProcessing;
import io.agora.rtc.Constants;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import net.sqlcipher.database.SQLiteDatabase;
import p265o00ooo00.Oooo0;
import p296o0O0OoO0.OooOo00;
import p296o0O0OoO0.Oooo000;
import p296o0O0OoO0.o000oOoO;
import p296o0O0OoO0.o0OO00O;
import p296o0O0OoO0.o0OoOo0;
import p296o0O0OoO0.oo0o0Oo;
import p299o0O0Ooo0.o00000;
import p299o0O0Ooo0.o000000O;
import p299o0O0Ooo0.o00000O;
import p299o0O0Ooo0.o00000OO;
import p318o0O0oOo.o000;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o0000O;
import p318o0O0oOo.o0000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p320o0O0oOoO.o00O0O0;
import p320o0O0oOoO.o00O0O0O;
import p320o0O0oOoO.o00O0OO0;

/* JADX INFO: loaded from: classes2.dex */
public final class MatroskaExtractor implements Extractor {

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public static final byte[] f13781Ooooo00 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public static final byte[] f13782Ooooo0o = o000OOo0.OooOoO0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final byte[] f13783OooooO0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final UUID f13784OooooOO = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public static final Map<String, Integer> f13785OooooOo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000 f13786OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o00000 f13787OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o00000OO f13788OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final SparseArray<OooO0O0> f13789OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f13790OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000 f13791OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o000 f13792OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000 f13793OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o000 f13794OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final o000 f13795OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final o000 f13796OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final o000 f13797OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final o000 f13798OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final o000 f13799OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public ByteBuffer f13800OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public long f13801OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public long f13802OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public long f13803OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f13804OooOOoo;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public long f13805OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public OooO0O0 f13806OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public long f13807OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f13808OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f13809OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public long f13810OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f13811OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public long f13812OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @Nullable
    public o0000O0 f13813OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f13814OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    @Nullable
    public o0000O0 f13815OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f13816OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f13817Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public long f13818Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f13819Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f13820Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public long f13821Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public int f13822Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public int f13823Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f13824Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public int[] f13825Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f13826Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f13827Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f13828OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f13829OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f13830OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public int f13831OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f13832OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f13833OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public int f13834OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public byte f13835OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f13836OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public o0OoOo0 f13837OoooOoo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f13838o000oOoO;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public final class OooO00o implements EbmlProcessor {
        public OooO00o() {
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:163:0x0382  */
        /* JADX WARN: Code duplicated, block: B:166:0x03ab  */
        /* JADX WARN: Code duplicated, block: B:169:0x03b3  */
        /* JADX WARN: Code duplicated, block: B:170:0x03b7  */
        /* JADX WARN: Code duplicated, block: B:173:0x03bf  */
        /* JADX WARN: Code duplicated, block: B:174:0x03c3  */
        /* JADX WARN: Code duplicated, block: B:177:0x03cb  */
        /* JADX WARN: Code duplicated, block: B:178:0x03cf  */
        /* JADX WARN: Code duplicated, block: B:181:0x03d7  */
        /* JADX WARN: Code duplicated, block: B:182:0x03db  */
        /* JADX WARN: Code duplicated, block: B:185:0x03e3  */
        /* JADX WARN: Code duplicated, block: B:186:0x03e7  */
        /* JADX WARN: Code duplicated, block: B:189:0x03ef  */
        /* JADX WARN: Code duplicated, block: B:190:0x03f3  */
        /* JADX WARN: Code duplicated, block: B:193:0x03fb  */
        /* JADX WARN: Code duplicated, block: B:194:0x03ff  */
        /* JADX WARN: Code duplicated, block: B:197:0x0407  */
        /* JADX WARN: Code duplicated, block: B:198:0x040b  */
        /* JADX WARN: Code duplicated, block: B:201:0x0413  */
        /* JADX WARN: Code duplicated, block: B:202:0x0417  */
        /* JADX WARN: Code duplicated, block: B:205:0x041f  */
        /* JADX WARN: Code duplicated, block: B:206:0x0423  */
        /* JADX WARN: Code duplicated, block: B:209:0x042b  */
        /* JADX WARN: Code duplicated, block: B:210:0x042f  */
        /* JADX WARN: Code duplicated, block: B:213:0x0437  */
        /* JADX WARN: Code duplicated, block: B:214:0x043b  */
        /* JADX WARN: Code duplicated, block: B:217:0x0445  */
        /* JADX WARN: Code duplicated, block: B:218:0x0449  */
        /* JADX WARN: Code duplicated, block: B:221:0x0451  */
        /* JADX WARN: Code duplicated, block: B:222:0x0455  */
        /* JADX WARN: Code duplicated, block: B:225:0x045f  */
        /* JADX WARN: Code duplicated, block: B:226:0x0463  */
        /* JADX WARN: Code duplicated, block: B:229:0x046d  */
        /* JADX WARN: Code duplicated, block: B:230:0x0471  */
        /* JADX WARN: Code duplicated, block: B:233:0x047b  */
        /* JADX WARN: Code duplicated, block: B:234:0x047f  */
        /* JADX WARN: Code duplicated, block: B:237:0x0489  */
        /* JADX WARN: Code duplicated, block: B:238:0x048d  */
        /* JADX WARN: Code duplicated, block: B:241:0x0497  */
        /* JADX WARN: Code duplicated, block: B:242:0x049b  */
        /* JADX WARN: Code duplicated, block: B:245:0x04a5  */
        /* JADX WARN: Code duplicated, block: B:246:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:249:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:250:0x04b7  */
        /* JADX WARN: Code duplicated, block: B:253:0x04c1  */
        /* JADX WARN: Code duplicated, block: B:254:0x04c5  */
        /* JADX WARN: Code duplicated, block: B:257:0x04ce  */
        /* JADX WARN: Code duplicated, block: B:258:0x04d0  */
        /* JADX WARN: Code duplicated, block: B:261:0x04d9  */
        /* JADX WARN: Code duplicated, block: B:262:0x04db  */
        /* JADX WARN: Code duplicated, block: B:265:0x04e4  */
        /* JADX WARN: Code duplicated, block: B:266:0x04e6  */
        /* JADX WARN: Code duplicated, block: B:269:0x04ef  */
        /* JADX WARN: Code duplicated, block: B:270:0x04f1  */
        /* JADX WARN: Code duplicated, block: B:273:0x04fa  */
        /* JADX WARN: Code duplicated, block: B:274:0x04fc  */
        /* JADX WARN: Code duplicated, block: B:277:0x0505  */
        /* JADX WARN: Code duplicated, block: B:278:0x0507  */
        /* JADX WARN: Code duplicated, block: B:281:0x0510  */
        /* JADX WARN: Code duplicated, block: B:282:0x0512  */
        /* JADX WARN: Code duplicated, block: B:285:0x051b  */
        /* JADX WARN: Code duplicated, block: B:286:0x051d  */
        /* JADX WARN: Code duplicated, block: B:289:0x052a  */
        /* JADX WARN: Code duplicated, block: B:291:0x0532  */
        /* JADX WARN: Code duplicated, block: B:292:0x0571  */
        /* JADX WARN: Code duplicated, block: B:293:0x057b  */
        /* JADX WARN: Code duplicated, block: B:294:0x057f  */
        /* JADX WARN: Code duplicated, block: B:295:0x0584  */
        /* JADX WARN: Code duplicated, block: B:296:0x0587  */
        /* JADX WARN: Code duplicated, block: B:297:0x059d  */
        /* JADX WARN: Code duplicated, block: B:298:0x05a0  */
        /* JADX WARN: Code duplicated, block: B:300:0x05a8  */
        /* JADX WARN: Code duplicated, block: B:301:0x05cc  */
        /* JADX WARN: Code duplicated, block: B:302:0x05d0  */
        /* JADX WARN: Code duplicated, block: B:303:0x05d3  */
        /* JADX WARN: Code duplicated, block: B:304:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:305:0x05db  */
        /* JADX WARN: Code duplicated, block: B:306:0x05df  */
        /* JADX WARN: Code duplicated, block: B:307:0x05e2  */
        /* JADX WARN: Code duplicated, block: B:308:0x05e5  */
        /* JADX WARN: Code duplicated, block: B:309:0x0601  */
        /* JADX WARN: Code duplicated, block: B:310:0x0603 A[PHI: r4
          0x0603: PHI (r4v30 java.lang.String) = 
          (r4v6 java.lang.String)
          (r4v31 java.lang.String)
          (r4v35 java.lang.String)
          (r4v36 java.lang.String)
          (r4v37 java.lang.String)
          (r4v38 java.lang.String)
          (r4v39 java.lang.String)
          (r4v40 java.lang.String)
          (r4v42 java.lang.String)
          (r4v43 java.lang.String)
          (r4v44 java.lang.String)
          (r4v45 java.lang.String)
         binds: [B:288:0x0527, B:309:0x0601, B:307:0x05e2, B:306:0x05df, B:305:0x05db, B:304:0x05d7, B:303:0x05d3, B:302:0x05d0, B:297:0x059d, B:295:0x0584, B:294:0x057f, B:293:0x057b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:311:0x0607  */
        /* JADX WARN: Code duplicated, block: B:312:0x0611  */
        /* JADX WARN: Code duplicated, block: B:314:0x062a  */
        /* JADX WARN: Code duplicated, block: B:315:0x064a  */
        /* JADX WARN: Code duplicated, block: B:317:0x0653  */
        /* JADX WARN: Code duplicated, block: B:318:0x0655  */
        /* JADX WARN: Code duplicated, block: B:321:0x067d A[Catch: ArrayIndexOutOfBoundsException -> 0x06f6, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x06f6, blocks: (B:319:0x0656, B:321:0x067d, B:324:0x068e, B:328:0x06a1, B:330:0x06a6, B:332:0x06aa, B:334:0x06b0, B:336:0x06b7, B:338:0x06bf, B:340:0x06d4, B:341:0x06d7, B:342:0x06de), top: B:539:0x0656 }] */
        /* JADX WARN: Code duplicated, block: B:322:0x0687  */
        /* JADX WARN: Code duplicated, block: B:324:0x068e A[Catch: ArrayIndexOutOfBoundsException -> 0x06f6, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x06f6, blocks: (B:319:0x0656, B:321:0x067d, B:324:0x068e, B:328:0x06a1, B:330:0x06a6, B:332:0x06aa, B:334:0x06b0, B:336:0x06b7, B:338:0x06bf, B:340:0x06d4, B:341:0x06d7, B:342:0x06de), top: B:539:0x0656 }] */
        /* JADX WARN: Code duplicated, block: B:325:0x0698  */
        /* JADX WARN: Code duplicated, block: B:327:0x069f  */
        /* JADX WARN: Code duplicated, block: B:330:0x06a6 A[Catch: ArrayIndexOutOfBoundsException -> 0x06f6, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x06f6, blocks: (B:319:0x0656, B:321:0x067d, B:324:0x068e, B:328:0x06a1, B:330:0x06a6, B:332:0x06aa, B:334:0x06b0, B:336:0x06b7, B:338:0x06bf, B:340:0x06d4, B:341:0x06d7, B:342:0x06de), top: B:539:0x0656 }] */
        /* JADX WARN: Code duplicated, block: B:332:0x06aa A[Catch: ArrayIndexOutOfBoundsException -> 0x06f6, TryCatch #1 {ArrayIndexOutOfBoundsException -> 0x06f6, blocks: (B:319:0x0656, B:321:0x067d, B:324:0x068e, B:328:0x06a1, B:330:0x06a6, B:332:0x06aa, B:334:0x06b0, B:336:0x06b7, B:338:0x06bf, B:340:0x06d4, B:341:0x06d7, B:342:0x06de), top: B:539:0x0656 }] */
        /* JADX WARN: Code duplicated, block: B:339:0x06d2  */
        /* JADX WARN: Code duplicated, block: B:343:0x06df  */
        /* JADX WARN: Code duplicated, block: B:350:0x06fe  */
        /* JADX WARN: Code duplicated, block: B:351:0x0701  */
        /* JADX WARN: Code duplicated, block: B:355:0x0710  */
        /* JADX WARN: Code duplicated, block: B:358:0x071a  */
        /* JADX WARN: Code duplicated, block: B:361:0x0721 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, LOOP:3: B:359:0x071c->B:361:0x0721, LOOP_END, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:365:0x0731 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, LOOP:4: B:363:0x072c->B:365:0x0731, LOOP_END, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:368:0x0740 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:370:0x074b A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:372:0x0751 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TRY_LEAVE, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:376:0x0775 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TRY_ENTER, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:378:0x077b A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:380:0x0781 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:382:0x0787 A[Catch: ArrayIndexOutOfBoundsException -> 0x078d, TryCatch #2 {ArrayIndexOutOfBoundsException -> 0x078d, blocks: (B:356:0x0715, B:359:0x071c, B:361:0x0721, B:362:0x0726, B:363:0x072c, B:365:0x0731, B:366:0x0736, B:368:0x0740, B:370:0x074b, B:372:0x0751, B:376:0x0775, B:377:0x077a, B:378:0x077b, B:379:0x0780, B:380:0x0781, B:381:0x0786, B:382:0x0787, B:383:0x078c), top: B:540:0x0715 }] */
        /* JADX WARN: Code duplicated, block: B:386:0x0793  */
        /* JADX WARN: Code duplicated, block: B:388:0x07a0  */
        /* JADX WARN: Code duplicated, block: B:391:0x07b0  */
        /* JADX WARN: Code duplicated, block: B:392:0x07b1  */
        /* JADX WARN: Code duplicated, block: B:394:0x07b6 A[Catch: ArrayIndexOutOfBoundsException -> 0x0810, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0810, blocks: (B:389:0x07a9, B:394:0x07b6, B:396:0x07c9), top: B:537:0x07a9 }] */
        /* JADX WARN: Code duplicated, block: B:396:0x07c9 A[Catch: ArrayIndexOutOfBoundsException -> 0x0810, TRY_LEAVE, TryCatch #0 {ArrayIndexOutOfBoundsException -> 0x0810, blocks: (B:389:0x07a9, B:394:0x07b6, B:396:0x07c9), top: B:537:0x07a9 }] */
        /* JADX WARN: Code duplicated, block: B:400:0x07d6  */
        /* JADX WARN: Code duplicated, block: B:402:0x07d9  */
        /* JADX WARN: Code duplicated, block: B:404:0x07e1  */
        /* JADX WARN: Code duplicated, block: B:405:0x0802  */
        /* JADX WARN: Code duplicated, block: B:406:0x0804  */
        /* JADX WARN: Code duplicated, block: B:410:0x0818  */
        /* JADX WARN: Code duplicated, block: B:412:0x081c  */
        /* JADX WARN: Code duplicated, block: B:413:0x081e  */
        /* JADX WARN: Code duplicated, block: B:419:0x0830  */
        /* JADX WARN: Code duplicated, block: B:424:0x0848  */
        /* JADX WARN: Code duplicated, block: B:425:0x084a  */
        /* JADX WARN: Code duplicated, block: B:428:0x0857  */
        /* JADX WARN: Code duplicated, block: B:429:0x0863  */
        /* JADX WARN: Code duplicated, block: B:431:0x0869  */
        /* JADX WARN: Code duplicated, block: B:433:0x086d  */
        /* JADX WARN: Code duplicated, block: B:435:0x0872  */
        /* JADX WARN: Code duplicated, block: B:438:0x087a  */
        /* JADX WARN: Code duplicated, block: B:440:0x087f  */
        /* JADX WARN: Code duplicated, block: B:443:0x0886  */
        /* JADX WARN: Code duplicated, block: B:448:0x0899  */
        /* JADX WARN: Code duplicated, block: B:450:0x08a1  */
        /* JADX WARN: Code duplicated, block: B:470:0x095d  */
        /* JADX WARN: Code duplicated, block: B:472:0x096a  */
        /* JADX WARN: Code duplicated, block: B:475:0x0975  */
        /* JADX WARN: Code duplicated, block: B:478:0x0985  */
        /* JADX WARN: Code duplicated, block: B:484:0x099e  */
        /* JADX WARN: Code duplicated, block: B:485:0x09a0  */
        /* JADX WARN: Code duplicated, block: B:487:0x09aa  */
        /* JADX WARN: Code duplicated, block: B:488:0x09ad  */
        /* JADX WARN: Code duplicated, block: B:490:0x09b7  */
        /* JADX WARN: Code duplicated, block: B:496:0x09cf  */
        /* JADX WARN: Code duplicated, block: B:498:0x09e8  */
        /* JADX WARN: Code duplicated, block: B:501:0x09ef  */
        /* JADX WARN: Code duplicated, block: B:503:0x09f7  */
        /* JADX WARN: Code duplicated, block: B:504:0x0a08  */
        /* JADX WARN: Code duplicated, block: B:506:0x0a10  */
        /* JADX WARN: Code duplicated, block: B:515:0x0a33  */
        /* JADX WARN: Code duplicated, block: B:517:0x0a6c  */
        /* JADX WARN: Code duplicated, block: B:544:0x06d7 A[SYNTHETIC] */
        public final void OooO00o(int i) throws ParserException {
            Object obj;
            String str;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            String str2;
            Object obj6;
            String str3;
            Object obj7;
            boolean z;
            MatroskaExtractor matroskaExtractor;
            String str4;
            OooO0O0 oooO0O0;
            String str5;
            o0OoOo0 o0oooo1;
            int i2;
            String str6;
            byte b;
            String str7;
            String str8;
            String str9;
            byte[] bArr;
            List<byte[]> listSingletonList;
            o000 o000Var;
            int iOooOO0;
            boolean z2;
            long jOooOO0O;
            UUID uuid;
            int iOooOOoo;
            List<byte[]> list;
            List<byte[]> list2;
            byte[] bArr2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            byte[] bArr3;
            int i10;
            int i11;
            String str10;
            String str11;
            int i12;
            String str12;
            String str13;
            ArrayList arrayList;
            int i13;
            byte[] bArr4;
            boolean z3;
            long j;
            Pair pair;
            int i14;
            String str14;
            List<byte[]> list3;
            String str15;
            List<byte[]> list4;
            List<byte[]> list5;
            int i15;
            String str16;
            int i16;
            List<byte[]> list6;
            int i17;
            int iOooOOoo2;
            List<byte[]> list7;
            int i18;
            List<byte[]> listSingletonList2;
            List<byte[]> list8;
            byte[] bArr5;
            int i19;
            Format.OooO0O0 oooO0O1;
            int iIntValue;
            float f;
            int i20;
            ColorInfo colorInfo;
            Map<String, Integer> map;
            byte[] bArr6;
            int i21;
            int i22;
            int i23;
            List<byte[]> list9;
            o00O0O0O o00o0o0oOooO00o;
            List<byte[]> list10;
            List<byte[]> list11;
            oo0o0Oo oooO0O2;
            o0000O0 o0000o1;
            int i24;
            o0000O0 o0000o2;
            int i25;
            MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
            Objects.requireNonNull(matroskaExtractor2);
            if (i == 160) {
                if (matroskaExtractor2.f13820Oooo00O != 2) {
                    return;
                }
                int i26 = 0;
                for (int i27 = 0; i27 < matroskaExtractor2.f13823Oooo0OO; i27++) {
                    i26 += matroskaExtractor2.f13825Oooo0o0[i27];
                }
                OooO0O0 oooO0O3 = matroskaExtractor2.f13789OooO0OO.get(matroskaExtractor2.f13824Oooo0o);
                int i28 = 0;
                while (i28 < matroskaExtractor2.f13823Oooo0OO) {
                    long j2 = matroskaExtractor2.f13821Oooo00o + ((long) ((oooO0O3.f13846OooO0o0 * i28) / 1000));
                    int i29 = matroskaExtractor2.f13827Oooo0oo;
                    if (i28 == 0 && !matroskaExtractor2.f13830OoooO00) {
                        i29 |= 1;
                    }
                    int i30 = matroskaExtractor2.f13825Oooo0o0[i28];
                    int i31 = i26 - i30;
                    matroskaExtractor2.OooO00o(oooO0O3, j2, i29, i30, i31);
                    i28++;
                    i26 = i31;
                }
                matroskaExtractor2.f13820Oooo00O = 0;
                return;
            }
            if (i != 174) {
                if (i == 19899) {
                    int i32 = matroskaExtractor2.f13809OooOo0o;
                    if (i32 != -1) {
                        long j3 = matroskaExtractor2.f13805OooOo;
                        if (j3 != -1) {
                            if (i32 == 475249515) {
                                matroskaExtractor2.f13810OooOoO = j3;
                                return;
                            }
                            return;
                        }
                    }
                    throw new ParserException("Mandatory element SeekID or SeekPosition not found");
                }
                if (i == 25152) {
                    OooO0O0 oooO0O4 = matroskaExtractor2.f13806OooOo0;
                    if (oooO0O4.f13848OooO0oo) {
                        TrackOutput.OooO00o oooO00o = oooO0O4.f13849OooOO0;
                        if (oooO00o == null) {
                            throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                        }
                        oooO0O4.f13851OooOO0o = new DrmInitData(null, true, new DrmInitData.SchemeData(C.f13105OooO00o, "video/webm", oooO00o.f13736OooO0O0));
                        return;
                    }
                    return;
                }
                if (i == 28032) {
                    OooO0O0 oooO0O5 = matroskaExtractor2.f13806OooOo0;
                    if (oooO0O5.f13848OooO0oo && oooO0O5.f13840OooO != null) {
                        throw new ParserException("Combining encryption and compression is not supported");
                    }
                    return;
                }
                if (i == 357149030) {
                    if (matroskaExtractor2.f13802OooOOo == -9223372036854775807L) {
                        matroskaExtractor2.f13802OooOOo = 1000000L;
                    }
                    long j4 = matroskaExtractor2.f13804OooOOoo;
                    if (j4 != -9223372036854775807L) {
                        matroskaExtractor2.f13807OooOo00 = matroskaExtractor2.OooO0oo(j4);
                        return;
                    }
                    return;
                }
                if (i == 374648427) {
                    if (matroskaExtractor2.f13789OooO0OO.size() == 0) {
                        throw new ParserException("No valid tracks were found");
                    }
                    matroskaExtractor2.f13837OoooOoo.OooOOO0();
                    return;
                }
                if (i == 475249515 && !matroskaExtractor2.f13808OooOo0O) {
                    o0OoOo0 o0oooo2 = matroskaExtractor2.f13837OoooOoo;
                    if (matroskaExtractor2.f13803OooOOo0 == -1 || matroskaExtractor2.f13807OooOo00 == -9223372036854775807L || (o0000o1 = matroskaExtractor2.f13813OooOoo) == null || (i24 = o0000o1.f36693OooO00o) == 0 || (o0000o2 = matroskaExtractor2.f13815OooOooO) == null || o0000o2.f36693OooO00o != i24) {
                        matroskaExtractor2.f13813OooOoo = null;
                        matroskaExtractor2.f13815OooOooO = null;
                        oooO0O2 = new oo0o0Oo.OooO0O0(matroskaExtractor2.f13807OooOo00);
                    } else {
                        int[] iArrCopyOf = new int[i24];
                        long[] jArrCopyOf = new long[i24];
                        long[] jArrCopyOf2 = new long[i24];
                        long[] jArrCopyOf3 = new long[i24];
                        for (int i33 = 0; i33 < i24; i33++) {
                            jArrCopyOf3[i33] = matroskaExtractor2.f13813OooOoo.OooO0O0(i33);
                            jArrCopyOf[i33] = matroskaExtractor2.f13815OooOooO.OooO0O0(i33) + matroskaExtractor2.f13803OooOOo0;
                        }
                        int i34 = 0;
                        while (true) {
                            i25 = i24 - 1;
                            if (i34 >= i25) {
                                break;
                            }
                            int i35 = i34 + 1;
                            iArrCopyOf[i34] = (int) (jArrCopyOf[i35] - jArrCopyOf[i34]);
                            jArrCopyOf2[i34] = jArrCopyOf3[i35] - jArrCopyOf3[i34];
                            i34 = i35;
                        }
                        iArrCopyOf[i25] = (int) ((matroskaExtractor2.f13803OooOOo0 + matroskaExtractor2.f13801OooOOOo) - jArrCopyOf[i25]);
                        jArrCopyOf2[i25] = matroskaExtractor2.f13807OooOo00 - jArrCopyOf3[i25];
                        long j5 = jArrCopyOf2[i25];
                        if (j5 <= 0) {
                            StringBuilder sb = new StringBuilder(72);
                            sb.append("Discarding last cue point with unexpected duration: ");
                            sb.append(j5);
                            Log.w("MatroskaExtractor", sb.toString());
                            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i25);
                            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i25);
                            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i25);
                            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i25);
                        }
                        matroskaExtractor2.f13813OooOoo = null;
                        matroskaExtractor2.f13815OooOooO = null;
                        oooO0O2 = new OooOo00(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                    }
                    o0oooo2.OooOO0O(oooO0O2);
                    matroskaExtractor2.f13808OooOo0O = true;
                    return;
                }
                return;
            }
            String str17 = matroskaExtractor2.f13806OooOo0.f13842OooO0O0;
            String str18 = "A_VORBIS";
            String str19 = "V_MS/VFW/FOURCC";
            String str20 = "V_MPEG4/ISO/SP";
            String str21 = "S_HDMV/PGS";
            String str22 = "A_DTS/EXPRESS";
            String str23 = "A_DTS";
            String str24 = "A_AAC";
            String str25 = "S_VOBSUB";
            String str26 = "S_DVBSUB";
            String str27 = "A_TRUEHD";
            String str28 = "A_MS/ACM";
            String str29 = "S_TEXT/ASS";
            if (!"V_VP8".equals(str17) && !"V_VP9".equals(str17) && !"V_AV1".equals(str17) && !"V_MPEG2".equals(str17) && !"V_MPEG4/ISO/SP".equals(str17) && !"V_MPEG4/ISO/ASP".equals(str17) && !"V_MPEG4/ISO/AP".equals(str17) && !"V_MPEG4/ISO/AVC".equals(str17) && !"V_MPEGH/ISO/HEVC".equals(str17) && !"V_MS/VFW/FOURCC".equals(str17) && !"V_THEORA".equals(str17) && !"A_OPUS".equals(str17) && !"A_VORBIS".equals(str17) && !"A_AAC".equals(str17)) {
                if (!"A_MPEG/L2".equals(str17)) {
                    obj3 = "V_MPEG4/ISO/AP";
                    if ("A_MPEG/L3".equals(str17)) {
                        obj2 = "A_MPEG/L2";
                        obj = "A_MPEG/L3";
                        obj4 = "A_AC3";
                        str = "A_EAC3";
                    } else {
                        str20 = "V_MPEG4/ISO/SP";
                        if ("A_AC3".equals(str17)) {
                            str18 = "A_VORBIS";
                            str = "A_EAC3";
                        } else {
                            str18 = "A_VORBIS";
                            str = "A_EAC3";
                            if (!str.equals(str17)) {
                                obj2 = "A_MPEG/L2";
                                if (str27.equals(str17)) {
                                    str27 = str27;
                                } else {
                                    str23 = str23;
                                    if (str23.equals(str17)) {
                                        str27 = str27;
                                        obj = "A_MPEG/L3";
                                        str22 = str22;
                                    } else {
                                        obj = "A_MPEG/L3";
                                        str22 = str22;
                                        if (!str22.equals(str17)) {
                                            str19 = "V_MS/VFW/FOURCC";
                                            if ("A_DTS/LOSSLESS".equals(str17)) {
                                                str27 = str27;
                                                obj5 = "V_MPEG4/ISO/ASP";
                                                str2 = "A_FLAC";
                                            } else {
                                                obj5 = "V_MPEG4/ISO/ASP";
                                                str2 = "A_FLAC";
                                                if (!str2.equals(str17)) {
                                                    obj6 = "V_MPEG4/ISO/AVC";
                                                    if (str28.equals(str17) || "A_PCM/INT/LIT".equals(str17)) {
                                                        str27 = str27;
                                                        str27 = str27;
                                                        str28 = str28;
                                                    } else {
                                                        str3 = "S_TEXT/UTF8";
                                                        if (str3.equals(str17)) {
                                                            str27 = str27;
                                                            str28 = str28;
                                                            obj7 = "A_DTS/LOSSLESS";
                                                            str29 = str29;
                                                        } else {
                                                            obj7 = "A_DTS/LOSSLESS";
                                                            str29 = str29;
                                                            if (!str29.equals(str17)) {
                                                                str24 = "A_AAC";
                                                                if (str25.equals(str17)) {
                                                                    str27 = str27;
                                                                    str28 = str28;
                                                                    str25 = str25;
                                                                } else {
                                                                    str21 = str21;
                                                                    if (str21.equals(str17)) {
                                                                        str27 = str27;
                                                                        str28 = str28;
                                                                        str25 = str25;
                                                                        obj4 = "A_AC3";
                                                                        str26 = str26;
                                                                    } else {
                                                                        obj4 = "A_AC3";
                                                                        str26 = str26;
                                                                        if (!str26.equals(str17)) {
                                                                            z = false;
                                                                        }
                                                                    }
                                                                    str27 = str27;
                                                                    str28 = str28;
                                                                    str25 = str25;
                                                                    z = true;
                                                                }
                                                            }
                                                            str21 = str21;
                                                            str27 = str27;
                                                            str28 = str28;
                                                            str25 = str25;
                                                            obj4 = "A_AC3";
                                                            str26 = str26;
                                                            str27 = str27;
                                                            str28 = str28;
                                                            str25 = str25;
                                                            z = true;
                                                        }
                                                        str27 = str27;
                                                        str28 = str28;
                                                        str24 = "A_AAC";
                                                        str21 = str21;
                                                        str27 = str27;
                                                        str28 = str28;
                                                        str25 = str25;
                                                        obj4 = "A_AC3";
                                                        str26 = str26;
                                                        str27 = str27;
                                                        str28 = str28;
                                                        str25 = str25;
                                                        z = true;
                                                    }
                                                }
                                                str3 = "S_TEXT/UTF8";
                                                str27 = str27;
                                                str28 = str28;
                                                obj7 = "A_DTS/LOSSLESS";
                                                str29 = str29;
                                                str27 = str27;
                                                str28 = str28;
                                                str24 = "A_AAC";
                                                str21 = str21;
                                                str27 = str27;
                                                str28 = str28;
                                                str25 = str25;
                                                obj4 = "A_AC3";
                                                str26 = str26;
                                                str27 = str27;
                                                str28 = str28;
                                                str25 = str25;
                                                z = true;
                                            }
                                            str27 = str27;
                                            obj6 = "V_MPEG4/ISO/AVC";
                                            str3 = "S_TEXT/UTF8";
                                            str27 = str27;
                                            str28 = str28;
                                            obj7 = "A_DTS/LOSSLESS";
                                            str29 = str29;
                                            str27 = str27;
                                            str28 = str28;
                                            str24 = "A_AAC";
                                            str21 = str21;
                                            str27 = str27;
                                            str28 = str28;
                                            str25 = str25;
                                            obj4 = "A_AC3";
                                            str26 = str26;
                                            str27 = str27;
                                            str28 = str28;
                                            str25 = str25;
                                            z = true;
                                        }
                                    }
                                    str27 = str27;
                                    obj4 = "A_AC3";
                                }
                            }
                            str23 = str23;
                            str27 = str27;
                            obj = "A_MPEG/L3";
                            str22 = str22;
                            str27 = str27;
                            obj4 = "A_AC3";
                        }
                        obj2 = "A_MPEG/L2";
                        str23 = str23;
                        str27 = str27;
                        obj = "A_MPEG/L3";
                        str22 = str22;
                        str27 = str27;
                        obj4 = "A_AC3";
                    }
                    if (z) {
                        str27 = str27;
                        str28 = str28;
                        str25 = str25;
                        str4 = str26;
                        oooO0O0 = matroskaExtractor2.f13806OooOo0;
                        str5 = str23;
                        o0oooo1 = matroskaExtractor2.f13837OoooOoo;
                        i2 = oooO0O0.f13843OooO0OO;
                        str6 = oooO0O0.f13842OooO0O0;
                        Objects.requireNonNull(str6);
                        switch (str6.hashCode()) {
                            case -2095576542:
                                if (str6.equals(obj3)) {
                                    b = 0;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -2095575984:
                                if (str6.equals(str20)) {
                                    b = 1;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1985379776:
                                if (str6.equals(str28)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1784763192:
                                if (str6.equals(str27)) {
                                    b = 3;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1730367663:
                                if (str6.equals(str18)) {
                                    b = 4;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1482641358:
                                if (str6.equals(obj2)) {
                                    b = 5;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1482641357:
                                if (str6.equals(obj)) {
                                    b = 6;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -1373388978:
                                if (str6.equals(str19)) {
                                    b = 7;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -933872740:
                                if (str6.equals(str4)) {
                                    b = 8;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -538363189:
                                if (str6.equals(obj5)) {
                                    b = 9;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -538363109:
                                if (str6.equals(obj6)) {
                                    b = 10;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -425012669:
                                if (str6.equals(str25)) {
                                    b = 11;
                                } else {
                                    b = -1;
                                }
                                break;
                            case -356037306:
                                if (str6.equals(obj7)) {
                                    b = 12;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 62923557:
                                if (str6.equals(str24)) {
                                    b = bz.k;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 62923603:
                                if (str6.equals(obj4)) {
                                    b = bz.l;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 62927045:
                                if (str6.equals(str5)) {
                                    b = bz.m;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 82318131:
                                if (str6.equals("V_AV1")) {
                                    b = bz.n;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 82338133:
                                if (str6.equals("V_VP8")) {
                                    b = 17;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 82338134:
                                if (str6.equals("V_VP9")) {
                                    b = 18;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 99146302:
                                if (str6.equals(str21)) {
                                    b = 19;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 444813526:
                                if (str6.equals("V_THEORA")) {
                                    b = 20;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 542569478:
                                if (str6.equals(str22)) {
                                    b = 21;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 725957860:
                                if (str6.equals("A_PCM/INT/LIT")) {
                                    b = 22;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 738597099:
                                if (str6.equals(str29)) {
                                    b = 23;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 855502857:
                                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                    b = 24;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1422270023:
                                if (str6.equals(str3)) {
                                    b = 25;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1809237540:
                                if (str6.equals("V_MPEG2")) {
                                    b = 26;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1950749482:
                                if (str6.equals(str)) {
                                    b = 27;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1950789798:
                                if (str6.equals(str2)) {
                                    b = 28;
                                } else {
                                    b = -1;
                                }
                                break;
                            case 1951062397:
                                if (str6.equals("A_OPUS")) {
                                    b = 29;
                                } else {
                                    b = -1;
                                }
                                break;
                            default:
                                b = -1;
                                break;
                        }
                        str7 = "audio/raw";
                        str8 = "video/x-unknown";
                        str9 = "audio/x-unknown";
                        switch (b) {
                            case 0:
                            case 1:
                            case 9:
                                bArr = oooO0O0.f13850OooOO0O;
                                if (bArr == null) {
                                    listSingletonList = null;
                                } else {
                                    listSingletonList = Collections.singletonList(bArr);
                                }
                                str7 = "video/mp4v-es";
                                list2 = listSingletonList;
                                iOooOOoo = -1;
                                list = list2;
                                str9 = str7;
                                list6 = list;
                                str16 = str9;
                                i16 = iOooOOoo;
                                str11 = null;
                                i17 = -1;
                                list8 = list6;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null && (o00o0o0oOooO00o = o00O0O0O.OooO00o(new o000(bArr5))) != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i36 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i37 = i36 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue && (i21 = oooO0O0.f13855OooOOOo) != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f || oooO0O0.f13870OooOooo == -1.0f || oooO0O0.f13873Oooo000 == -1.0f || oooO0O0.f13874Oooo00O == -1.0f || oooO0O0.f13875Oooo00o == -1.0f || oooO0O0.f13872Oooo0 == -1.0f || oooO0O0.f13876Oooo0O0 == -1.0f || oooO0O0.f13877Oooo0OO == -1.0f || oooO0O0.f13879Oooo0o0 == -1.0f || oooO0O0.f13878Oooo0o == -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = new byte[25];
                                            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr6).order(ByteOrder.LITTLE_ENDIAN);
                                            byteBufferOrder.put((byte) 0);
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13869OooOooO * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13870OooOooo * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13873Oooo000 * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13874Oooo00O * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13875Oooo00o * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13872Oooo0 * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13876Oooo0O0 * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) ((oooO0O0.f13877Oooo0OO * 50000.0f) + 0.5f));
                                            byteBufferOrder.putShort((short) (oooO0O0.f13879Oooo0o0 + 0.5f));
                                            byteBufferOrder.putShort((short) (oooO0O0.f13878Oooo0o + 0.5f));
                                            byteBufferOrder.putShort((short) oooO0O0.f13868OooOoo0);
                                            byteBufferOrder.putShort((short) oooO0O0.f13867OooOoo);
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0 && Float.compare(oooO0O0.f13858OooOOoo, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0 && Float.compare(oooO0O0.f13861OooOo00, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0 || Float.compare(oooO0O0.f13861OooOo00, 180.0f) == 0) {
                                            iIntValue = 180;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -90.0f) == 0) {
                                            iIntValue = 270;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList2 = new ArrayList(2);
                                        arrayList2.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList2.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList2;
                                    } else if (!"application/vobsub".equals(str16) && !"application/pgs".equals(str16) && !"application/dvbsubs".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i37;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o;
                                trackOutputOooO00o.OooO0o0(format);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O6 = matroskaExtractor.f13806OooOo0;
                                sparseArray.put(oooO0O6.f13843OooO0OO, oooO0O6);
                                break;
                            case 2:
                                o000Var = new o000(oooO0O0.f13850OooOO0O);
                                try {
                                    iOooOO0 = o000Var.OooOO0();
                                    z2 = true;
                                    if (iOooOO0 != 1) {
                                        if (iOooOO0 == 65534) {
                                            o000Var.OooOoOO(24);
                                            jOooOO0O = o000Var.OooOO0O();
                                            uuid = MatroskaExtractor.f13784OooooOO;
                                            if (jOooOO0O == uuid.getMostSignificantBits() || o000Var.OooOO0O() != uuid.getLeastSignificantBits()) {
                                                z2 = false;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    if (z2) {
                                        iOooOOoo = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                                        if (iOooOOoo != 0) {
                                            list = null;
                                            str9 = str7;
                                            list6 = list;
                                            str16 = str9;
                                            i16 = iOooOOoo;
                                            str11 = null;
                                            i17 = -1;
                                            list8 = list6;
                                            bArr5 = oooO0O0.f13880Oooo0oO;
                                            if (bArr5 != null) {
                                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                                str16 = "video/dolby-vision";
                                            }
                                            int i38 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                            if (oooO0O0.f13886OoooOO0) {
                                                i19 = 2;
                                            } else {
                                                i19 = 0;
                                            }
                                            int i39 = i38 | i19;
                                            oooO0O1 = new Format.OooO0O0();
                                            if (o000OO.OooO0oO(str16)) {
                                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                                oooO0O1.f13177OooOoO = i16;
                                                list9 = list8;
                                            } else if (o000OO.OooO(str16)) {
                                                if (oooO0O0.f13857OooOOo0 == 0) {
                                                    i22 = oooO0O0.f13854OooOOOO;
                                                    iIntValue = -1;
                                                    if (i22 == -1) {
                                                        i22 = oooO0O0.f13853OooOOO0;
                                                    }
                                                    oooO0O0.f13854OooOOOO = i22;
                                                    i23 = oooO0O0.f13855OooOOOo;
                                                    if (i23 == -1) {
                                                        i23 = oooO0O0.f13852OooOOO;
                                                    }
                                                    oooO0O0.f13855OooOOOo = i23;
                                                } else {
                                                    iIntValue = -1;
                                                }
                                                f = -1.0f;
                                                i20 = oooO0O0.f13854OooOOOO;
                                                if (i20 != iIntValue) {
                                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                                }
                                                if (oooO0O0.f13859OooOo) {
                                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                                        bArr6 = null;
                                                    } else {
                                                        bArr6 = null;
                                                    }
                                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                                } else {
                                                    colorInfo = null;
                                                }
                                                map = MatroskaExtractor.f13785OooooOo;
                                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                                }
                                                if (oooO0O0.f13856OooOOo == 0) {
                                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                        iIntValue = 0;
                                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                        iIntValue = 90;
                                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                        iIntValue = 180;
                                                    } else {
                                                        iIntValue = 180;
                                                    }
                                                }
                                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                                oooO0O1.f13174OooOo00 = f;
                                                oooO0O1.f13171OooOOoo = iIntValue;
                                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                                oooO0O1.f13176OooOo0o = colorInfo;
                                                list9 = list8;
                                            } else if (!"application/x-subrip".equals(str16)) {
                                                if ("text/x-ssa".equals(str16)) {
                                                    list9 = list8;
                                                    ArrayList arrayList3 = new ArrayList(2);
                                                    arrayList3.add(MatroskaExtractor.f13782Ooooo0o);
                                                    arrayList3.add(oooO0O0.f13850OooOO0O);
                                                    list9 = arrayList3;
                                                } else if (!"application/vobsub".equals(str16)) {
                                                    list9 = list8;
                                                    list9 = list8;
                                                    list9 = list8;
                                                    list9 = list8;
                                                    throw new ParserException("Unexpected MIME type.");
                                                }
                                            }
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                            }
                                            oooO0O1.OooO0O0(i2);
                                            oooO0O1.f13163OooOO0O = str16;
                                            oooO0O1.f13164OooOO0o = i17;
                                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                            oooO0O1.f13157OooO0Oo = i39;
                                            oooO0O1.f13166OooOOO0 = list9;
                                            oooO0O1.f13161OooO0oo = str11;
                                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                            Format format2 = new Format(oooO0O1);
                                            TrackOutput trackOutputOooO00o2 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                            oooO0O0.f13888OoooOOo = trackOutputOooO00o2;
                                            trackOutputOooO00o2.OooO0o0(format2);
                                            matroskaExtractor = matroskaExtractor2;
                                            SparseArray<OooO0O0> sparseArray2 = matroskaExtractor.f13789OooO0OO;
                                            OooO0O0 oooO0O7 = matroskaExtractor.f13806OooOo0;
                                            sparseArray2.put(oooO0O7.f13843OooO0OO, oooO0O7);
                                        } else {
                                            int i40 = oooO0O0.f13871Oooo;
                                            StringBuilder sb2 = new StringBuilder(75);
                                            sb2.append("Unsupported PCM bit depth: ");
                                            sb2.append(i40);
                                            sb2.append(". Setting mimeType to ");
                                            sb2.append("audio/x-unknown");
                                            Log.w("MatroskaExtractor", sb2.toString());
                                        }
                                    } else {
                                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown"));
                                    }
                                    list6 = null;
                                    iOooOOoo = -1;
                                    str16 = str9;
                                    i16 = iOooOOoo;
                                    str11 = null;
                                    i17 = -1;
                                    list8 = list6;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i310 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i311 = i310 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList4 = new ArrayList(2);
                                            arrayList4.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList4.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList4;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i311;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format3 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o3 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o3;
                                    trackOutputOooO00o3.OooO0o0(format3);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray3 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O8 = matroskaExtractor.f13806OooOo0;
                                    sparseArray3.put(oooO0O8.f13843OooO0OO, oooO0O8);
                                } catch (ArrayIndexOutOfBoundsException unused) {
                                    throw new ParserException("Error parsing MS/ACM codec private");
                                }
                                break;
                            case 3:
                                oooO0O0.f13882OoooO = new OooO0OO();
                                str7 = "audio/true-hd";
                                list2 = null;
                                iOooOOoo = -1;
                                list = list2;
                                str9 = str7;
                                list6 = list;
                                str16 = str9;
                                i16 = iOooOOoo;
                                str11 = null;
                                i17 = -1;
                                list8 = list6;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i312 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i313 = i312 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList5 = new ArrayList(2);
                                        arrayList5.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList5.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList5;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i313;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format4 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o4 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o4;
                                trackOutputOooO00o4.OooO0o0(format4);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray4 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O9 = matroskaExtractor.f13806OooOo0;
                                sparseArray4.put(oooO0O9.f13843OooO0OO, oooO0O9);
                                break;
                            case 4:
                                bArr2 = oooO0O0.f13850OooOO0O;
                                try {
                                    if (bArr2[0] != 2) {
                                        throw new ParserException("Error parsing vorbis codec private");
                                    }
                                    i3 = 0;
                                    i4 = 1;
                                    while (bArr2[i4] == -1) {
                                        i3 += KotlinVersion.MAX_COMPONENT_VALUE;
                                        i4++;
                                    }
                                    i5 = i4 + 1;
                                    i6 = i3 + bArr2[i4];
                                    i7 = 0;
                                    while (bArr2[i5] == -1) {
                                        i7 += KotlinVersion.MAX_COMPONENT_VALUE;
                                        i5++;
                                    }
                                    i8 = i5 + 1;
                                    i9 = i7 + bArr2[i5];
                                    if (bArr2[i8] != 1) {
                                        throw new ParserException("Error parsing vorbis codec private");
                                    }
                                    bArr3 = new byte[i6];
                                    System.arraycopy(bArr2, i8, bArr3, 0, i6);
                                    i10 = i8 + i6;
                                    if (bArr2[i10] != 3) {
                                        throw new ParserException("Error parsing vorbis codec private");
                                    }
                                    i11 = i10 + i9;
                                    if (bArr2[i11] != 5) {
                                        throw new ParserException("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr7 = new byte[bArr2.length - i11];
                                    System.arraycopy(bArr2, i11, bArr7, 0, bArr2.length - i11);
                                    ArrayList arrayList6 = new ArrayList(2);
                                    arrayList6.add(bArr3);
                                    arrayList6.add(bArr7);
                                    str10 = "audio/vorbis";
                                    str11 = null;
                                    i12 = 8192;
                                    list5 = arrayList6;
                                    i15 = i12;
                                    str16 = str10;
                                    i16 = -1;
                                    list10 = list5;
                                    i17 = i15;
                                    list8 = list10;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i314 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i315 = i314 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList7 = new ArrayList(2);
                                            arrayList7.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList7.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList7;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i315;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format5 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o5 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o5;
                                    trackOutputOooO00o5.OooO0o0(format5);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray5 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O10 = matroskaExtractor.f13806OooOo0;
                                    sparseArray5.put(oooO0O10.f13843OooO0OO, oooO0O10);
                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                    throw new ParserException("Error parsing vorbis codec private");
                                }
                                break;
                            case 5:
                                str12 = "audio/mpeg-L2";
                                str13 = str12;
                                arrayList = null;
                                i13 = 4096;
                                i18 = i13;
                                str7 = str13;
                                i16 = -1;
                                list11 = arrayList;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i316 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i317 = i316 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList8 = new ArrayList(2);
                                        arrayList8.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList8.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList8;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i317;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format6 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o6 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o6;
                                trackOutputOooO00o6.OooO0o0(format6);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray6 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O11 = matroskaExtractor.f13806OooOo0;
                                sparseArray6.put(oooO0O11.f13843OooO0OO, oooO0O11);
                                break;
                            case 6:
                                str12 = "audio/mpeg";
                                str13 = str12;
                                arrayList = null;
                                i13 = 4096;
                                i18 = i13;
                                str7 = str13;
                                i16 = -1;
                                list11 = arrayList;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i318 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i319 = i318 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList9 = new ArrayList(2);
                                        arrayList9.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList9.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList9;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i319;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format7 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o7 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o7;
                                trackOutputOooO00o7.OooO0o0(format7);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray7 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O12 = matroskaExtractor.f13806OooOo0;
                                sparseArray7.put(oooO0O12.f13843OooO0OO, oooO0O12);
                                break;
                            case 7:
                                bArr4 = oooO0O0.f13850OooOO0O;
                                if (16 <= bArr4.length) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                try {
                                    o00000O0.OooO00o(z3);
                                    j = (((long) bArr4[16]) & 255) | ((((long) bArr4[17]) & 255) << 8) | ((((long) bArr4[18]) & 255) << 16) | ((255 & ((long) bArr4[19])) << 24);
                                    if (j == 1482049860) {
                                        pair = new Pair("video/divx", null);
                                    } else if (j == 859189832) {
                                        pair = new Pair("video/3gpp", null);
                                    } else if (j == 826496599) {
                                        i14 = 40;
                                        while (true) {
                                            if (i14 >= bArr4.length - 4) {
                                                throw new ParserException("Failed to find FourCC VC1 initialization data");
                                            }
                                            if (bArr4[i14] != 0 && bArr4[i14 + 1] == 0 && bArr4[i14 + 2] == 1) {
                                                if (bArr4[i14 + 3] == 15) {
                                                    pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr4, i14, bArr4.length)));
                                                }
                                            }
                                            i14++;
                                        }
                                    } else {
                                        Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                        pair = new Pair("video/x-unknown", null);
                                    }
                                    str14 = (String) pair.first;
                                    listSingletonList2 = (List) pair.second;
                                    str7 = str14;
                                    list4 = listSingletonList2;
                                    i16 = -1;
                                    list7 = list4;
                                    i18 = -1;
                                    list11 = list7;
                                    i15 = i18;
                                    str16 = str7;
                                    str11 = null;
                                    list10 = list11;
                                    i17 = i15;
                                    list8 = list10;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i3110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i3111 = i3110 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList10 = new ArrayList(2);
                                            arrayList10.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList10.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList10;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i3111;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format8 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o8 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o8;
                                    trackOutputOooO00o8.OooO0o0(format8);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray8 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O13 = matroskaExtractor.f13806OooOo0;
                                    sparseArray8.put(oooO0O13.f13843OooO0OO, oooO0O13);
                                } catch (ArrayIndexOutOfBoundsException unused3) {
                                    throw new ParserException("Error parsing FourCC private data");
                                }
                                break;
                            case 8:
                                byte[] bArr8 = oooO0O0.f13850OooOO0O;
                                str14 = "application/dvbsubs";
                                listSingletonList2 = Collections.singletonList(new byte[]{bArr8[0], bArr8[1], bArr8[2], bArr8[3]});
                                str7 = str14;
                                list4 = listSingletonList2;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3113 = i3112 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList11 = new ArrayList(2);
                                        arrayList11.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList11.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList11;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3113;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format9 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o9 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o9;
                                trackOutputOooO00o9.OooO0o0(format9);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray9 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O14 = matroskaExtractor.f13806OooOo0;
                                sparseArray9.put(oooO0O14.f13843OooO0OO, oooO0O14);
                                break;
                            case 10:
                                o00O0O0 o00o0o0OooO0O0 = o00O0O0.OooO0O0(new o000(oooO0O0.f13850OooOO0O));
                                list3 = o00o0o0OooO0O0.f36789OooO00o;
                                oooO0O0.f13889OoooOo0 = o00o0o0OooO0O0.f36790OooO0O0;
                                str15 = "video/avc";
                                str7 = str15;
                                list4 = list3;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3115 = i3114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList12 = new ArrayList(2);
                                        arrayList12.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList12.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList12;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format10 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o10 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o10;
                                trackOutputOooO00o10.OooO0o0(format10);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray10 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O15 = matroskaExtractor.f13806OooOo0;
                                sparseArray10.put(oooO0O15.f13843OooO0OO, oooO0O15);
                                break;
                            case 11:
                                str14 = "application/vobsub";
                                listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                                str7 = str14;
                                list4 = listSingletonList2;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3117 = i3116 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList13 = new ArrayList(2);
                                        arrayList13.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList13.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList13;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3117;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format11 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o11 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o11;
                                trackOutputOooO00o11.OooO0o0(format11);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray11 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O16 = matroskaExtractor.f13806OooOo0;
                                sparseArray11.put(oooO0O16.f13843OooO0OO, oooO0O16);
                                break;
                            case 12:
                                str8 = "audio/vnd.dts.hd";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3119 = i3118 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList14 = new ArrayList(2);
                                        arrayList14.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList14.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList14;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3119;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format12 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o12 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o12;
                                trackOutputOooO00o12.OooO0o0(format12);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray12 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O17 = matroskaExtractor.f13806OooOo0;
                                sparseArray12.put(oooO0O17.f13843OooO0OO, oooO0O17);
                                break;
                            case 13:
                                List<byte[]> listSingletonList3 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                                AacUtil.OooO00o oooO00oOooO0Oo = AacUtil.OooO0Oo(oooO0O0.f13850OooOO0O);
                                oooO0O0.f13884OoooO00 = oooO00oOooO0Oo.f13469OooO00o;
                                oooO0O0.f13881Oooo0oo = oooO00oOooO0Oo.f13470OooO0O0;
                                String str30 = oooO00oOooO0Oo.f13471OooO0OO;
                                str10 = "audio/mp4a-latm";
                                str11 = str30;
                                i12 = -1;
                                list5 = listSingletonList3;
                                i15 = i12;
                                str16 = str10;
                                i16 = -1;
                                list10 = list5;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31111 = i31110 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList15 = new ArrayList(2);
                                        arrayList15.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList15.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList15;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31111;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format13 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o13 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o13;
                                trackOutputOooO00o13.OooO0o0(format13);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray13 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O18 = matroskaExtractor.f13806OooOo0;
                                sparseArray13.put(oooO0O18.f13843OooO0OO, oooO0O18);
                                break;
                            case 14:
                                str8 = "audio/ac3";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31113 = i31112 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList16 = new ArrayList(2);
                                        arrayList16.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList16.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList16;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31113;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format14 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o14 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o14;
                                trackOutputOooO00o14.OooO0o0(format14);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray14 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O19 = matroskaExtractor.f13806OooOo0;
                                sparseArray14.put(oooO0O19.f13843OooO0OO, oooO0O19);
                                break;
                            case 15:
                            case 21:
                                str8 = "audio/vnd.dts";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31115 = i31114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList17 = new ArrayList(2);
                                        arrayList17.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList17.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList17;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format15 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o15 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o15;
                                trackOutputOooO00o15.OooO0o0(format15);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray15 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O110 = matroskaExtractor.f13806OooOo0;
                                sparseArray15.put(oooO0O110.f13843OooO0OO, oooO0O110);
                                break;
                            case 16:
                                str8 = "video/av01";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31117 = i31116 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList18 = new ArrayList(2);
                                        arrayList18.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList18.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList18;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31117;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format16 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o16 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o16;
                                trackOutputOooO00o16.OooO0o0(format16);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray16 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O111 = matroskaExtractor.f13806OooOo0;
                                sparseArray16.put(oooO0O111.f13843OooO0OO, oooO0O111);
                                break;
                            case 17:
                                str8 = "video/x-vnd.on2.vp8";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31119 = i31118 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList19 = new ArrayList(2);
                                        arrayList19.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList19.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList19;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31119;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format17 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o17 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o17;
                                trackOutputOooO00o17.OooO0o0(format17);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray17 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O112 = matroskaExtractor.f13806OooOo0;
                                sparseArray17.put(oooO0O112.f13843OooO0OO, oooO0O112);
                                break;
                            case 18:
                                str8 = "video/x-vnd.on2.vp9";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i311110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i311111 = i311110 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList110 = new ArrayList(2);
                                        arrayList110.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList110.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList110;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i311111;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format18 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o18 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o18;
                                trackOutputOooO00o18.OooO0o0(format18);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray18 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O113 = matroskaExtractor.f13806OooOo0;
                                sparseArray18.put(oooO0O113.f13843OooO0OO, oooO0O113);
                                break;
                            case 19:
                                str8 = "application/pgs";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i311112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i311113 = i311112 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList111 = new ArrayList(2);
                                        arrayList111.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList111.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList111;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i311113;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format19 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o19 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o19;
                                trackOutputOooO00o19.OooO0o0(format19);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray19 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O114 = matroskaExtractor.f13806OooOo0;
                                sparseArray19.put(oooO0O114.f13843OooO0OO, oooO0O114);
                                break;
                            case 20:
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i311114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i311115 = i311114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList112 = new ArrayList(2);
                                        arrayList112.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList112.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList112;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i311115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format110 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o110;
                                trackOutputOooO00o110.OooO0o0(format110);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray110 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O115 = matroskaExtractor.f13806OooOo0;
                                sparseArray110.put(oooO0O115.f13843OooO0OO, oooO0O115);
                                break;
                            case 22:
                                iOooOOoo2 = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                                if (iOooOOoo2 == 0) {
                                    int i41 = oooO0O0.f13871Oooo;
                                    StringBuilder sb3 = new StringBuilder(75);
                                    sb3.append("Unsupported PCM bit depth: ");
                                    sb3.append(i41);
                                    sb3.append(". Setting mimeType to ");
                                    sb3.append("audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb3.toString());
                                    list6 = null;
                                    iOooOOoo = -1;
                                    str16 = str9;
                                    i16 = iOooOOoo;
                                    str11 = null;
                                    i17 = -1;
                                    list8 = list6;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i311116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i311117 = i311116 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList113 = new ArrayList(2);
                                            arrayList113.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList113.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList113;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i311117;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format111 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o111;
                                    trackOutputOooO00o111.OooO0o0(format111);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray111 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O116 = matroskaExtractor.f13806OooOo0;
                                    sparseArray111.put(oooO0O116.f13843OooO0OO, oooO0O116);
                                } else {
                                    i16 = iOooOOoo2;
                                    list7 = null;
                                    i18 = -1;
                                    list11 = list7;
                                    i15 = i18;
                                    str16 = str7;
                                    str11 = null;
                                    list10 = list11;
                                    i17 = i15;
                                    list8 = list10;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i311118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i311119 = i311118 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList114 = new ArrayList(2);
                                            arrayList114.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList114.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList114;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i311119;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format112 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o112;
                                    trackOutputOooO00o112.OooO0o0(format112);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray112 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O117 = matroskaExtractor.f13806OooOo0;
                                    sparseArray112.put(oooO0O117.f13843OooO0OO, oooO0O117);
                                }
                                break;
                            case 23:
                                str8 = "text/x-ssa";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3111111 = i3111110 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList115 = new ArrayList(2);
                                        arrayList115.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList115.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList115;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3111111;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format113 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o113;
                                trackOutputOooO00o113.OooO0o0(format113);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray113 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O118 = matroskaExtractor.f13806OooOo0;
                                sparseArray113.put(oooO0O118.f13843OooO0OO, oooO0O118);
                                break;
                            case 24:
                                o00O0OO0 o00o0oo0OooO00o = o00O0OO0.OooO00o(new o000(oooO0O0.f13850OooOO0O));
                                list3 = o00o0oo0OooO00o.f36809OooO00o;
                                oooO0O0.f13889OoooOo0 = o00o0oo0OooO00o.f36810OooO0O0;
                                str15 = "video/hevc";
                                str7 = str15;
                                list4 = list3;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3111113 = i3111112 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList116 = new ArrayList(2);
                                        arrayList116.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList116.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList116;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3111113;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format114 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o114;
                                trackOutputOooO00o114.OooO0o0(format114);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray114 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O119 = matroskaExtractor.f13806OooOo0;
                                sparseArray114.put(oooO0O119.f13843OooO0OO, oooO0O119);
                                break;
                            case 25:
                                str8 = "application/x-subrip";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3111115 = i3111114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList117 = new ArrayList(2);
                                        arrayList117.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList117.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList117;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3111115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format115 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o115;
                                trackOutputOooO00o115.OooO0o0(format115);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray115 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1110 = matroskaExtractor.f13806OooOo0;
                                sparseArray115.put(oooO0O1110.f13843OooO0OO, oooO0O1110);
                                break;
                            case 26:
                                str8 = "video/mpeg2";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3111117 = i3111116 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList118 = new ArrayList(2);
                                        arrayList118.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList118.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList118;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3111117;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format116 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o116;
                                trackOutputOooO00o116.OooO0o0(format116);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray116 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1111 = matroskaExtractor.f13806OooOo0;
                                sparseArray116.put(oooO0O1111.f13843OooO0OO, oooO0O1111);
                                break;
                            case 27:
                                str8 = "audio/eac3";
                                str7 = str8;
                                list4 = null;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i3111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i3111119 = i3111118 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList119 = new ArrayList(2);
                                        arrayList119.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList119.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList119;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i3111119;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format117 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o117;
                                trackOutputOooO00o117.OooO0o0(format117);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray117 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1112 = matroskaExtractor.f13806OooOo0;
                                sparseArray117.put(oooO0O1112.f13843OooO0OO, oooO0O1112);
                                break;
                            case 28:
                                str14 = "audio/flac";
                                listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                                str7 = str14;
                                list4 = listSingletonList2;
                                i16 = -1;
                                list7 = list4;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31111111 = i31111110 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList1110 = new ArrayList(2);
                                        arrayList1110.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList1110.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList1110;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31111111;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format118 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o118;
                                trackOutputOooO00o118.OooO0o0(format118);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray118 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1113 = matroskaExtractor.f13806OooOo0;
                                sparseArray118.put(oooO0O1113.f13843OooO0OO, oooO0O1113);
                                break;
                            case 29:
                                ArrayList arrayList20 = new ArrayList(3);
                                arrayList20.add(oooO0O0.f13850OooOO0O);
                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                                arrayList20.add(byteBufferAllocate.order(byteOrder).putLong(oooO0O0.f13883OoooO0).array());
                                arrayList20.add(ByteBuffer.allocate(8).order(byteOrder).putLong(oooO0O0.f13885OoooO0O).array());
                                str13 = "audio/opus";
                                arrayList = arrayList20;
                                i13 = 5760;
                                i18 = i13;
                                str7 = str13;
                                i16 = -1;
                                list11 = arrayList;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31111113 = i31111112 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList1111 = new ArrayList(2);
                                        arrayList1111.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList1111.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList1111;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31111113;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format119 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o119;
                                trackOutputOooO00o119.OooO0o0(format119);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray119 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1114 = matroskaExtractor.f13806OooOo0;
                                sparseArray119.put(oooO0O1114.f13843OooO0OO, oooO0O1114);
                                break;
                            default:
                                throw new ParserException("Unrecognized codec identifier.");
                        }
                    } else {
                        str27 = str27;
                        str28 = str28;
                        str25 = str25;
                        matroskaExtractor = matroskaExtractor2;
                    }
                    matroskaExtractor.f13806OooOo0 = null;
                }
                obj3 = "V_MPEG4/ISO/AP";
                str22 = str22;
                obj4 = "A_AC3";
                str18 = "A_VORBIS";
                str = "A_EAC3";
                obj2 = "A_MPEG/L2";
                str23 = str23;
                obj = "A_MPEG/L3";
                str20 = "V_MPEG4/ISO/SP";
                str26 = str26;
                obj5 = "V_MPEG4/ISO/ASP";
                str2 = "A_FLAC";
                obj6 = "V_MPEG4/ISO/AVC";
                str3 = "S_TEXT/UTF8";
                obj7 = "A_DTS/LOSSLESS";
                str27 = str27;
                str28 = str28;
                str25 = str25;
                z = true;
                if (z) {
                    str27 = str27;
                    str28 = str28;
                    str25 = str25;
                    str4 = str26;
                    oooO0O0 = matroskaExtractor2.f13806OooOo0;
                    str5 = str23;
                    o0oooo1 = matroskaExtractor2.f13837OoooOoo;
                    i2 = oooO0O0.f13843OooO0OO;
                    str6 = oooO0O0.f13842OooO0O0;
                    Objects.requireNonNull(str6);
                    switch (str6.hashCode()) {
                        case -2095576542:
                            if (str6.equals(obj3)) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case -2095575984:
                            if (str6.equals(str20)) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case -1985379776:
                            if (str6.equals(str28)) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case -1784763192:
                            if (str6.equals(str27)) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case -1730367663:
                            if (str6.equals(str18)) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case -1482641358:
                            if (str6.equals(obj2)) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        case -1482641357:
                            if (str6.equals(obj)) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -1373388978:
                            if (str6.equals(str19)) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case -933872740:
                            if (str6.equals(str4)) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case -538363189:
                            if (str6.equals(obj5)) {
                                b = -1;
                            } else {
                                b = 9;
                            }
                            break;
                        case -538363109:
                            if (str6.equals(obj6)) {
                                b = -1;
                            } else {
                                b = 10;
                            }
                            break;
                        case -425012669:
                            if (str6.equals(str25)) {
                                b = -1;
                            } else {
                                b = 11;
                            }
                            break;
                        case -356037306:
                            if (str6.equals(obj7)) {
                                b = -1;
                            } else {
                                b = 12;
                            }
                            break;
                        case 62923557:
                            if (str6.equals(str24)) {
                                b = -1;
                            } else {
                                b = bz.k;
                            }
                            break;
                        case 62923603:
                            if (str6.equals(obj4)) {
                                b = -1;
                            } else {
                                b = bz.l;
                            }
                            break;
                        case 62927045:
                            if (str6.equals(str5)) {
                                b = -1;
                            } else {
                                b = bz.m;
                            }
                            break;
                        case 82318131:
                            if (str6.equals("V_AV1")) {
                                b = -1;
                            } else {
                                b = bz.n;
                            }
                            break;
                        case 82338133:
                            if (str6.equals("V_VP8")) {
                                b = -1;
                            } else {
                                b = 17;
                            }
                            break;
                        case 82338134:
                            if (str6.equals("V_VP9")) {
                                b = -1;
                            } else {
                                b = 18;
                            }
                            break;
                        case 99146302:
                            if (str6.equals(str21)) {
                                b = -1;
                            } else {
                                b = 19;
                            }
                            break;
                        case 444813526:
                            if (str6.equals("V_THEORA")) {
                                b = -1;
                            } else {
                                b = 20;
                            }
                            break;
                        case 542569478:
                            if (str6.equals(str22)) {
                                b = -1;
                            } else {
                                b = 21;
                            }
                            break;
                        case 725957860:
                            if (str6.equals("A_PCM/INT/LIT")) {
                                b = -1;
                            } else {
                                b = 22;
                            }
                            break;
                        case 738597099:
                            if (str6.equals(str29)) {
                                b = -1;
                            } else {
                                b = 23;
                            }
                            break;
                        case 855502857:
                            if (str6.equals("V_MPEGH/ISO/HEVC")) {
                                b = -1;
                            } else {
                                b = 24;
                            }
                            break;
                        case 1422270023:
                            if (str6.equals(str3)) {
                                b = -1;
                            } else {
                                b = 25;
                            }
                            break;
                        case 1809237540:
                            if (str6.equals("V_MPEG2")) {
                                b = -1;
                            } else {
                                b = 26;
                            }
                            break;
                        case 1950749482:
                            if (str6.equals(str)) {
                                b = -1;
                            } else {
                                b = 27;
                            }
                            break;
                        case 1950789798:
                            if (str6.equals(str2)) {
                                b = -1;
                            } else {
                                b = 28;
                            }
                            break;
                        case 1951062397:
                            if (str6.equals("A_OPUS")) {
                                b = -1;
                            } else {
                                b = 29;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    str7 = "audio/raw";
                    str8 = "video/x-unknown";
                    str9 = "audio/x-unknown";
                    switch (b) {
                        case 0:
                        case 1:
                        case 9:
                            bArr = oooO0O0.f13850OooOO0O;
                            if (bArr == null) {
                                listSingletonList = null;
                            } else {
                                listSingletonList = Collections.singletonList(bArr);
                            }
                            str7 = "video/mp4v-es";
                            list2 = listSingletonList;
                            iOooOOoo = -1;
                            list = list2;
                            str9 = str7;
                            list6 = list;
                            str16 = str9;
                            i16 = iOooOOoo;
                            str11 = null;
                            i17 = -1;
                            list8 = list6;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111115 = i31111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1112 = new ArrayList(2);
                                    arrayList1112.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1112.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1112;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1110 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1110;
                            trackOutputOooO00o1110.OooO0o0(format1110);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1110 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1115 = matroskaExtractor.f13806OooOo0;
                            sparseArray1110.put(oooO0O1115.f13843OooO0OO, oooO0O1115);
                            break;
                        case 2:
                            o000Var = new o000(oooO0O0.f13850OooOO0O);
                            iOooOO0 = o000Var.OooOO0();
                            z2 = true;
                            if (iOooOO0 != 1) {
                                if (iOooOO0 == 65534) {
                                    o000Var.OooOoOO(24);
                                    jOooOO0O = o000Var.OooOO0O();
                                    uuid = MatroskaExtractor.f13784OooooOO;
                                    if (jOooOO0O == uuid.getMostSignificantBits()) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                } else {
                                    z2 = false;
                                }
                            }
                            if (z2) {
                                iOooOOoo = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                                if (iOooOOoo != 0) {
                                    list = null;
                                    str9 = str7;
                                    list6 = list;
                                    str16 = str9;
                                    i16 = iOooOOoo;
                                    str11 = null;
                                    i17 = -1;
                                    list8 = list6;
                                    bArr5 = oooO0O0.f13880Oooo0oO;
                                    if (bArr5 != null) {
                                        str11 = o00o0o0oOooO00o.f36794OooO00o;
                                        str16 = "video/dolby-vision";
                                    }
                                    int i31111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                    if (oooO0O0.f13886OoooOO0) {
                                        i19 = 2;
                                    } else {
                                        i19 = 0;
                                    }
                                    int i31111117 = i31111116 | i19;
                                    oooO0O1 = new Format.OooO0O0();
                                    if (o000OO.OooO0oO(str16)) {
                                        oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                        oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                        oooO0O1.f13177OooOoO = i16;
                                        list9 = list8;
                                    } else if (o000OO.OooO(str16)) {
                                        if (oooO0O0.f13857OooOOo0 == 0) {
                                            i22 = oooO0O0.f13854OooOOOO;
                                            iIntValue = -1;
                                            if (i22 == -1) {
                                                i22 = oooO0O0.f13853OooOOO0;
                                            }
                                            oooO0O0.f13854OooOOOO = i22;
                                            i23 = oooO0O0.f13855OooOOOo;
                                            if (i23 == -1) {
                                                i23 = oooO0O0.f13852OooOOO;
                                            }
                                            oooO0O0.f13855OooOOOo = i23;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        f = -1.0f;
                                        i20 = oooO0O0.f13854OooOOOO;
                                        if (i20 != iIntValue) {
                                            f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                        }
                                        if (oooO0O0.f13859OooOo) {
                                            if (oooO0O0.f13869OooOooO != -1.0f) {
                                                bArr6 = null;
                                            } else {
                                                bArr6 = null;
                                            }
                                            colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                        } else {
                                            colorInfo = null;
                                        }
                                        map = MatroskaExtractor.f13785OooooOo;
                                        if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                            iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                        }
                                        if (oooO0O0.f13856OooOOo == 0) {
                                            if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                        oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                        oooO0O1.f13174OooOo00 = f;
                                        oooO0O1.f13171OooOOoo = iIntValue;
                                        oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                        oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                        oooO0O1.f13176OooOo0o = colorInfo;
                                        list9 = list8;
                                    } else if (!"application/x-subrip".equals(str16)) {
                                        if ("text/x-ssa".equals(str16)) {
                                            list9 = list8;
                                            ArrayList arrayList1113 = new ArrayList(2);
                                            arrayList1113.add(MatroskaExtractor.f13782Ooooo0o);
                                            arrayList1113.add(oooO0O0.f13850OooOO0O);
                                            list9 = arrayList1113;
                                        } else if (!"application/vobsub".equals(str16)) {
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            list9 = list8;
                                            throw new ParserException("Unexpected MIME type.");
                                        }
                                    }
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                        oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                    }
                                    oooO0O1.OooO0O0(i2);
                                    oooO0O1.f13163OooOO0O = str16;
                                    oooO0O1.f13164OooOO0o = i17;
                                    oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                    oooO0O1.f13157OooO0Oo = i31111117;
                                    oooO0O1.f13166OooOOO0 = list9;
                                    oooO0O1.f13161OooO0oo = str11;
                                    oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                    Format format1111 = new Format(oooO0O1);
                                    TrackOutput trackOutputOooO00o1111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                    oooO0O0.f13888OoooOOo = trackOutputOooO00o1111;
                                    trackOutputOooO00o1111.OooO0o0(format1111);
                                    matroskaExtractor = matroskaExtractor2;
                                    SparseArray<OooO0O0> sparseArray1111 = matroskaExtractor.f13789OooO0OO;
                                    OooO0O0 oooO0O1116 = matroskaExtractor.f13806OooOo0;
                                    sparseArray1111.put(oooO0O1116.f13843OooO0OO, oooO0O1116);
                                } else {
                                    int i42 = oooO0O0.f13871Oooo;
                                    StringBuilder sb4 = new StringBuilder(75);
                                    sb4.append("Unsupported PCM bit depth: ");
                                    sb4.append(i42);
                                    sb4.append(". Setting mimeType to ");
                                    sb4.append("audio/x-unknown");
                                    Log.w("MatroskaExtractor", sb4.toString());
                                }
                            } else {
                                Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown"));
                            }
                            list6 = null;
                            iOooOOoo = -1;
                            str16 = str9;
                            i16 = iOooOOoo;
                            str11 = null;
                            i17 = -1;
                            list8 = list6;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111119 = i31111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1114 = new ArrayList(2);
                                    arrayList1114.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1114.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1114;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1112 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1112;
                            trackOutputOooO00o1112.OooO0o0(format1112);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1112 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1117 = matroskaExtractor.f13806OooOo0;
                            sparseArray1112.put(oooO0O1117.f13843OooO0OO, oooO0O1117);
                            break;
                        case 3:
                            oooO0O0.f13882OoooO = new OooO0OO();
                            str7 = "audio/true-hd";
                            list2 = null;
                            iOooOOoo = -1;
                            list = list2;
                            str9 = str7;
                            list6 = list;
                            str16 = str9;
                            i16 = iOooOOoo;
                            str11 = null;
                            i17 = -1;
                            list8 = list6;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111 = i311111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1115 = new ArrayList(2);
                                    arrayList1115.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1115.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1115;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1113 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1113;
                            trackOutputOooO00o1113.OooO0o0(format1113);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1113 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1118 = matroskaExtractor.f13806OooOo0;
                            sparseArray1113.put(oooO0O1118.f13843OooO0OO, oooO0O1118);
                            break;
                        case 4:
                            bArr2 = oooO0O0.f13850OooOO0O;
                            if (bArr2[0] != 2) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            i3 = 0;
                            i4 = 1;
                            while (bArr2[i4] == -1) {
                                i3 += KotlinVersion.MAX_COMPONENT_VALUE;
                                i4++;
                            }
                            i5 = i4 + 1;
                            i6 = i3 + bArr2[i4];
                            i7 = 0;
                            while (bArr2[i5] == -1) {
                                i7 += KotlinVersion.MAX_COMPONENT_VALUE;
                                i5++;
                            }
                            i8 = i5 + 1;
                            i9 = i7 + bArr2[i5];
                            if (bArr2[i8] != 1) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            bArr3 = new byte[i6];
                            System.arraycopy(bArr2, i8, bArr3, 0, i6);
                            i10 = i8 + i6;
                            if (bArr2[i10] != 3) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            i11 = i10 + i9;
                            if (bArr2[i11] != 5) {
                                throw new ParserException("Error parsing vorbis codec private");
                            }
                            byte[] bArr9 = new byte[bArr2.length - i11];
                            System.arraycopy(bArr2, i11, bArr9, 0, bArr2.length - i11);
                            ArrayList arrayList21 = new ArrayList(2);
                            arrayList21.add(bArr3);
                            arrayList21.add(bArr9);
                            str10 = "audio/vorbis";
                            str11 = null;
                            i12 = 8192;
                            list5 = arrayList21;
                            i15 = i12;
                            str16 = str10;
                            i16 = -1;
                            list10 = list5;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111113 = i311111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1116 = new ArrayList(2);
                                    arrayList1116.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1116.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1116;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1114 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1114;
                            trackOutputOooO00o1114.OooO0o0(format1114);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1114 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1119 = matroskaExtractor.f13806OooOo0;
                            sparseArray1114.put(oooO0O1119.f13843OooO0OO, oooO0O1119);
                            break;
                            break;
                        case 5:
                            str12 = "audio/mpeg-L2";
                            str13 = str12;
                            arrayList = null;
                            i13 = 4096;
                            i18 = i13;
                            str7 = str13;
                            i16 = -1;
                            list11 = arrayList;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111115 = i311111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1117 = new ArrayList(2);
                                    arrayList1117.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1117.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1117;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1115 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1115;
                            trackOutputOooO00o1115.OooO0o0(format1115);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1115 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11110 = matroskaExtractor.f13806OooOo0;
                            sparseArray1115.put(oooO0O11110.f13843OooO0OO, oooO0O11110);
                            break;
                        case 6:
                            str12 = "audio/mpeg";
                            str13 = str12;
                            arrayList = null;
                            i13 = 4096;
                            i18 = i13;
                            str7 = str13;
                            i16 = -1;
                            list11 = arrayList;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111117 = i311111116 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1118 = new ArrayList(2);
                                    arrayList1118.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1118.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1118;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111117;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1116 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1116;
                            trackOutputOooO00o1116.OooO0o0(format1116);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1116 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11111 = matroskaExtractor.f13806OooOo0;
                            sparseArray1116.put(oooO0O11111.f13843OooO0OO, oooO0O11111);
                            break;
                        case 7:
                            bArr4 = oooO0O0.f13850OooOO0O;
                            if (16 <= bArr4.length) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            o00000O0.OooO00o(z3);
                            j = (((long) bArr4[16]) & 255) | ((((long) bArr4[17]) & 255) << 8) | ((((long) bArr4[18]) & 255) << 16) | ((255 & ((long) bArr4[19])) << 24);
                            if (j == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (j == 859189832) {
                                pair = new Pair("video/3gpp", null);
                            } else if (j == 826496599) {
                                i14 = 40;
                                while (true) {
                                    if (i14 >= bArr4.length - 4) {
                                        throw new ParserException("Failed to find FourCC VC1 initialization data");
                                    }
                                    if (bArr4[i14] != 0) {
                                    }
                                    i14++;
                                }
                            } else {
                                Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                pair = new Pair("video/x-unknown", null);
                            }
                            str14 = (String) pair.first;
                            listSingletonList2 = (List) pair.second;
                            str7 = str14;
                            list4 = listSingletonList2;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111119 = i311111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1119 = new ArrayList(2);
                                    arrayList1119.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1119.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1119;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1117 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1117;
                            trackOutputOooO00o1117.OooO0o0(format1117);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1117 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11112 = matroskaExtractor.f13806OooOo0;
                            sparseArray1117.put(oooO0O11112.f13843OooO0OO, oooO0O11112);
                            break;
                        case 8:
                            byte[] bArr10 = oooO0O0.f13850OooOO0O;
                            str14 = "application/dvbsubs";
                            listSingletonList2 = Collections.singletonList(new byte[]{bArr10[0], bArr10[1], bArr10[2], bArr10[3]});
                            str7 = str14;
                            list4 = listSingletonList2;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111 = i3111111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11110 = new ArrayList(2);
                                    arrayList11110.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11110.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11110;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1118 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1118;
                            trackOutputOooO00o1118.OooO0o0(format1118);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1118 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11113 = matroskaExtractor.f13806OooOo0;
                            sparseArray1118.put(oooO0O11113.f13843OooO0OO, oooO0O11113);
                            break;
                        case 10:
                            o00O0O0 o00o0o0OooO0O1 = o00O0O0.OooO0O0(new o000(oooO0O0.f13850OooOO0O));
                            list3 = o00o0o0OooO0O1.f36789OooO00o;
                            oooO0O0.f13889OoooOo0 = o00o0o0OooO0O1.f36790OooO0O0;
                            str15 = "video/avc";
                            str7 = str15;
                            list4 = list3;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111113 = i3111111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11111 = new ArrayList(2);
                                    arrayList11111.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11111.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11111;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format1119 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o1119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o1119;
                            trackOutputOooO00o1119.OooO0o0(format1119);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray1119 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11114 = matroskaExtractor.f13806OooOo0;
                            sparseArray1119.put(oooO0O11114.f13843OooO0OO, oooO0O11114);
                            break;
                        case 11:
                            str14 = "application/vobsub";
                            listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                            str7 = str14;
                            list4 = listSingletonList2;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111115 = i3111111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11112 = new ArrayList(2);
                                    arrayList11112.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11112.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11112;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11110 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11110;
                            trackOutputOooO00o11110.OooO0o0(format11110);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11110 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11115 = matroskaExtractor.f13806OooOo0;
                            sparseArray11110.put(oooO0O11115.f13843OooO0OO, oooO0O11115);
                            break;
                        case 12:
                            str8 = "audio/vnd.dts.hd";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111117 = i3111111116 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11113 = new ArrayList(2);
                                    arrayList11113.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11113.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11113;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111117;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11111 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11111;
                            trackOutputOooO00o11111.OooO0o0(format11111);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11111 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11116 = matroskaExtractor.f13806OooOo0;
                            sparseArray11111.put(oooO0O11116.f13843OooO0OO, oooO0O11116);
                            break;
                        case 13:
                            List<byte[]> listSingletonList4 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                            AacUtil.OooO00o oooO00oOooO0Oo2 = AacUtil.OooO0Oo(oooO0O0.f13850OooOO0O);
                            oooO0O0.f13884OoooO00 = oooO00oOooO0Oo2.f13469OooO00o;
                            oooO0O0.f13881Oooo0oo = oooO00oOooO0Oo2.f13470OooO0O0;
                            String str31 = oooO00oOooO0Oo2.f13471OooO0OO;
                            str10 = "audio/mp4a-latm";
                            str11 = str31;
                            i12 = -1;
                            list5 = listSingletonList4;
                            i15 = i12;
                            str16 = str10;
                            i16 = -1;
                            list10 = list5;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111119 = i3111111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11114 = new ArrayList(2);
                                    arrayList11114.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11114.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11114;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11112 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11112;
                            trackOutputOooO00o11112.OooO0o0(format11112);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11112 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11117 = matroskaExtractor.f13806OooOo0;
                            sparseArray11112.put(oooO0O11117.f13843OooO0OO, oooO0O11117);
                            break;
                        case 14:
                            str8 = "audio/ac3";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111111 = i31111111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11115 = new ArrayList(2);
                                    arrayList11115.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11115.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11115;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11113 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11113;
                            trackOutputOooO00o11113.OooO0o0(format11113);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11113 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11118 = matroskaExtractor.f13806OooOo0;
                            sparseArray11113.put(oooO0O11118.f13843OooO0OO, oooO0O11118);
                            break;
                        case 15:
                        case 21:
                            str8 = "audio/vnd.dts";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111113 = i31111111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11116 = new ArrayList(2);
                                    arrayList11116.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11116.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11116;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11114 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11114;
                            trackOutputOooO00o11114.OooO0o0(format11114);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11114 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O11119 = matroskaExtractor.f13806OooOo0;
                            sparseArray11114.put(oooO0O11119.f13843OooO0OO, oooO0O11119);
                            break;
                        case 16:
                            str8 = "video/av01";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111115 = i31111111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11117 = new ArrayList(2);
                                    arrayList11117.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11117.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11117;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11115 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11115;
                            trackOutputOooO00o11115.OooO0o0(format11115);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11115 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111110 = matroskaExtractor.f13806OooOo0;
                            sparseArray11115.put(oooO0O111110.f13843OooO0OO, oooO0O111110);
                            break;
                        case 17:
                            str8 = "video/x-vnd.on2.vp8";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111117 = i31111111116 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11118 = new ArrayList(2);
                                    arrayList11118.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11118.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11118;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111117;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11116 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11116;
                            trackOutputOooO00o11116.OooO0o0(format11116);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11116 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111111 = matroskaExtractor.f13806OooOo0;
                            sparseArray11116.put(oooO0O111111.f13843OooO0OO, oooO0O111111);
                            break;
                        case 18:
                            str8 = "video/x-vnd.on2.vp9";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111119 = i31111111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList11119 = new ArrayList(2);
                                    arrayList11119.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList11119.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList11119;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11117 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11117;
                            trackOutputOooO00o11117.OooO0o0(format11117);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11117 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111112 = matroskaExtractor.f13806OooOo0;
                            sparseArray11117.put(oooO0O111112.f13843OooO0OO, oooO0O111112);
                            break;
                        case 19:
                            str8 = "application/pgs";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111111 = i311111111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111110 = new ArrayList(2);
                                    arrayList111110.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111110.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111110;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11118 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11118;
                            trackOutputOooO00o11118.OooO0o0(format11118);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11118 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111113 = matroskaExtractor.f13806OooOo0;
                            sparseArray11118.put(oooO0O111113.f13843OooO0OO, oooO0O111113);
                            break;
                        case 20:
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111113 = i311111111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111111 = new ArrayList(2);
                                    arrayList111111.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111111.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111111;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11119 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11119;
                            trackOutputOooO00o11119.OooO0o0(format11119);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11119 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111114 = matroskaExtractor.f13806OooOo0;
                            sparseArray11119.put(oooO0O111114.f13843OooO0OO, oooO0O111114);
                            break;
                        case 22:
                            iOooOOoo2 = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                            if (iOooOOoo2 == 0) {
                                int i43 = oooO0O0.f13871Oooo;
                                StringBuilder sb5 = new StringBuilder(75);
                                sb5.append("Unsupported PCM bit depth: ");
                                sb5.append(i43);
                                sb5.append(". Setting mimeType to ");
                                sb5.append("audio/x-unknown");
                                Log.w("MatroskaExtractor", sb5.toString());
                                list6 = null;
                                iOooOOoo = -1;
                                str16 = str9;
                                i16 = iOooOOoo;
                                str11 = null;
                                i17 = -1;
                                list8 = list6;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i311111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i311111111115 = i311111111114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList111112 = new ArrayList(2);
                                        arrayList111112.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList111112.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList111112;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i311111111115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format111110 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o111110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o111110;
                                trackOutputOooO00o111110.OooO0o0(format111110);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray111110 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O111115 = matroskaExtractor.f13806OooOo0;
                                sparseArray111110.put(oooO0O111115.f13843OooO0OO, oooO0O111115);
                            } else {
                                i16 = iOooOOoo2;
                                list7 = null;
                                i18 = -1;
                                list11 = list7;
                                i15 = i18;
                                str16 = str7;
                                str11 = null;
                                list10 = list11;
                                i17 = i15;
                                list8 = list10;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i311111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i311111111117 = i311111111116 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList111113 = new ArrayList(2);
                                        arrayList111113.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList111113.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList111113;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i311111111117;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format111111 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o111111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o111111;
                                trackOutputOooO00o111111.OooO0o0(format111111);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray111111 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O111116 = matroskaExtractor.f13806OooOo0;
                                sparseArray111111.put(oooO0O111116.f13843OooO0OO, oooO0O111116);
                            }
                            break;
                        case 23:
                            str8 = "text/x-ssa";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111119 = i311111111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111114 = new ArrayList(2);
                                    arrayList111114.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111114.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111114;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111112 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111112;
                            trackOutputOooO00o111112.OooO0o0(format111112);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111112 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111117 = matroskaExtractor.f13806OooOo0;
                            sparseArray111112.put(oooO0O111117.f13843OooO0OO, oooO0O111117);
                            break;
                        case 24:
                            o00O0OO0 o00o0oo0OooO00o2 = o00O0OO0.OooO00o(new o000(oooO0O0.f13850OooOO0O));
                            list3 = o00o0oo0OooO00o2.f36809OooO00o;
                            oooO0O0.f13889OoooOo0 = o00o0oo0OooO00o2.f36810OooO0O0;
                            str15 = "video/hevc";
                            str7 = str15;
                            list4 = list3;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111111 = i3111111111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111115 = new ArrayList(2);
                                    arrayList111115.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111115.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111115;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111113 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111113;
                            trackOutputOooO00o111113.OooO0o0(format111113);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111113 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111118 = matroskaExtractor.f13806OooOo0;
                            sparseArray111113.put(oooO0O111118.f13843OooO0OO, oooO0O111118);
                            break;
                        case 25:
                            str8 = "application/x-subrip";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111113 = i3111111111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111116 = new ArrayList(2);
                                    arrayList111116.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111116.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111116;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111114 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111114;
                            trackOutputOooO00o111114.OooO0o0(format111114);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111114 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111119 = matroskaExtractor.f13806OooOo0;
                            sparseArray111114.put(oooO0O111119.f13843OooO0OO, oooO0O111119);
                            break;
                        case 26:
                            str8 = "video/mpeg2";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111115 = i3111111111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111117 = new ArrayList(2);
                                    arrayList111117.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111117.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111117;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111115 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111115;
                            trackOutputOooO00o111115.OooO0o0(format111115);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111115 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1111110 = matroskaExtractor.f13806OooOo0;
                            sparseArray111115.put(oooO0O1111110.f13843OooO0OO, oooO0O1111110);
                            break;
                        case 27:
                            str8 = "audio/eac3";
                            str7 = str8;
                            list4 = null;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111117 = i3111111111116 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111118 = new ArrayList(2);
                                    arrayList111118.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111118.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111118;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111117;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111116 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111116;
                            trackOutputOooO00o111116.OooO0o0(format111116);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111116 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1111111 = matroskaExtractor.f13806OooOo0;
                            sparseArray111116.put(oooO0O1111111.f13843OooO0OO, oooO0O1111111);
                            break;
                        case 28:
                            str14 = "audio/flac";
                            listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                            str7 = str14;
                            list4 = listSingletonList2;
                            i16 = -1;
                            list7 = list4;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i3111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i3111111111119 = i3111111111118 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111119 = new ArrayList(2);
                                    arrayList111119.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111119.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111119;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i3111111111119;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111117 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111117;
                            trackOutputOooO00o111117.OooO0o0(format111117);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111117 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1111112 = matroskaExtractor.f13806OooOo0;
                            sparseArray111117.put(oooO0O1111112.f13843OooO0OO, oooO0O1111112);
                            break;
                        case 29:
                            ArrayList arrayList22 = new ArrayList(3);
                            arrayList22.add(oooO0O0.f13850OooOO0O);
                            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(8);
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            arrayList22.add(byteBufferAllocate2.order(byteOrder2).putLong(oooO0O0.f13883OoooO0).array());
                            arrayList22.add(ByteBuffer.allocate(8).order(byteOrder2).putLong(oooO0O0.f13885OoooO0O).array());
                            str13 = "audio/opus";
                            arrayList = arrayList22;
                            i13 = 5760;
                            i18 = i13;
                            str7 = str13;
                            i16 = -1;
                            list11 = arrayList;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i31111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i31111111111111 = i31111111111110 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList1111110 = new ArrayList(2);
                                    arrayList1111110.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList1111110.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList1111110;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i31111111111111;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111118 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111118;
                            trackOutputOooO00o111118.OooO0o0(format111118);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111118 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O1111113 = matroskaExtractor.f13806OooOo0;
                            sparseArray111118.put(oooO0O1111113.f13843OooO0OO, oooO0O1111113);
                            break;
                        default:
                            throw new ParserException("Unrecognized codec identifier.");
                    }
                } else {
                    str27 = str27;
                    str28 = str28;
                    str25 = str25;
                    matroskaExtractor = matroskaExtractor2;
                }
                matroskaExtractor.f13806OooOo0 = null;
            }
            obj = "A_MPEG/L3";
            str = "A_EAC3";
            obj2 = "A_MPEG/L2";
            obj3 = "V_MPEG4/ISO/AP";
            obj4 = "A_AC3";
            obj5 = "V_MPEG4/ISO/ASP";
            str2 = "A_FLAC";
            obj6 = "V_MPEG4/ISO/AVC";
            str3 = "S_TEXT/UTF8";
            obj7 = "A_DTS/LOSSLESS";
            str27 = str27;
            str28 = str28;
            str25 = str25;
            z = true;
            if (z) {
                str27 = str27;
                str28 = str28;
                str25 = str25;
                str4 = str26;
                oooO0O0 = matroskaExtractor2.f13806OooOo0;
                str5 = str23;
                o0oooo1 = matroskaExtractor2.f13837OoooOoo;
                i2 = oooO0O0.f13843OooO0OO;
                str6 = oooO0O0.f13842OooO0O0;
                Objects.requireNonNull(str6);
                switch (str6.hashCode()) {
                    case -2095576542:
                        if (str6.equals(obj3)) {
                            b = -1;
                        } else {
                            b = 0;
                        }
                        break;
                    case -2095575984:
                        if (str6.equals(str20)) {
                            b = -1;
                        } else {
                            b = 1;
                        }
                        break;
                    case -1985379776:
                        if (str6.equals(str28)) {
                            b = -1;
                        } else {
                            b = 2;
                        }
                        break;
                    case -1784763192:
                        if (str6.equals(str27)) {
                            b = -1;
                        } else {
                            b = 3;
                        }
                        break;
                    case -1730367663:
                        if (str6.equals(str18)) {
                            b = -1;
                        } else {
                            b = 4;
                        }
                        break;
                    case -1482641358:
                        if (str6.equals(obj2)) {
                            b = -1;
                        } else {
                            b = 5;
                        }
                        break;
                    case -1482641357:
                        if (str6.equals(obj)) {
                            b = -1;
                        } else {
                            b = 6;
                        }
                        break;
                    case -1373388978:
                        if (str6.equals(str19)) {
                            b = -1;
                        } else {
                            b = 7;
                        }
                        break;
                    case -933872740:
                        if (str6.equals(str4)) {
                            b = -1;
                        } else {
                            b = 8;
                        }
                        break;
                    case -538363189:
                        if (str6.equals(obj5)) {
                            b = -1;
                        } else {
                            b = 9;
                        }
                        break;
                    case -538363109:
                        if (str6.equals(obj6)) {
                            b = -1;
                        } else {
                            b = 10;
                        }
                        break;
                    case -425012669:
                        if (str6.equals(str25)) {
                            b = -1;
                        } else {
                            b = 11;
                        }
                        break;
                    case -356037306:
                        if (str6.equals(obj7)) {
                            b = -1;
                        } else {
                            b = 12;
                        }
                        break;
                    case 62923557:
                        if (str6.equals(str24)) {
                            b = -1;
                        } else {
                            b = bz.k;
                        }
                        break;
                    case 62923603:
                        if (str6.equals(obj4)) {
                            b = -1;
                        } else {
                            b = bz.l;
                        }
                        break;
                    case 62927045:
                        if (str6.equals(str5)) {
                            b = -1;
                        } else {
                            b = bz.m;
                        }
                        break;
                    case 82318131:
                        if (str6.equals("V_AV1")) {
                            b = -1;
                        } else {
                            b = bz.n;
                        }
                        break;
                    case 82338133:
                        if (str6.equals("V_VP8")) {
                            b = -1;
                        } else {
                            b = 17;
                        }
                        break;
                    case 82338134:
                        if (str6.equals("V_VP9")) {
                            b = -1;
                        } else {
                            b = 18;
                        }
                        break;
                    case 99146302:
                        if (str6.equals(str21)) {
                            b = -1;
                        } else {
                            b = 19;
                        }
                        break;
                    case 444813526:
                        if (str6.equals("V_THEORA")) {
                            b = -1;
                        } else {
                            b = 20;
                        }
                        break;
                    case 542569478:
                        if (str6.equals(str22)) {
                            b = -1;
                        } else {
                            b = 21;
                        }
                        break;
                    case 725957860:
                        if (str6.equals("A_PCM/INT/LIT")) {
                            b = -1;
                        } else {
                            b = 22;
                        }
                        break;
                    case 738597099:
                        if (str6.equals(str29)) {
                            b = -1;
                        } else {
                            b = 23;
                        }
                        break;
                    case 855502857:
                        if (str6.equals("V_MPEGH/ISO/HEVC")) {
                            b = -1;
                        } else {
                            b = 24;
                        }
                        break;
                    case 1422270023:
                        if (str6.equals(str3)) {
                            b = -1;
                        } else {
                            b = 25;
                        }
                        break;
                    case 1809237540:
                        if (str6.equals("V_MPEG2")) {
                            b = -1;
                        } else {
                            b = 26;
                        }
                        break;
                    case 1950749482:
                        if (str6.equals(str)) {
                            b = -1;
                        } else {
                            b = 27;
                        }
                        break;
                    case 1950789798:
                        if (str6.equals(str2)) {
                            b = -1;
                        } else {
                            b = 28;
                        }
                        break;
                    case 1951062397:
                        if (str6.equals("A_OPUS")) {
                            b = -1;
                        } else {
                            b = 29;
                        }
                        break;
                    default:
                        b = -1;
                        break;
                }
                str7 = "audio/raw";
                str8 = "video/x-unknown";
                str9 = "audio/x-unknown";
                switch (b) {
                    case 0:
                    case 1:
                    case 9:
                        bArr = oooO0O0.f13850OooOO0O;
                        if (bArr == null) {
                            listSingletonList = null;
                        } else {
                            listSingletonList = Collections.singletonList(bArr);
                        }
                        str7 = "video/mp4v-es";
                        list2 = listSingletonList;
                        iOooOOoo = -1;
                        list = list2;
                        str9 = str7;
                        list6 = list;
                        str16 = str9;
                        i16 = iOooOOoo;
                        str11 = null;
                        i17 = -1;
                        list8 = list6;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111113 = i31111111111112 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111111 = new ArrayList(2);
                                arrayList1111111.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111111.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111111;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111113;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111119 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111119;
                        trackOutputOooO00o111119.OooO0o0(format111119);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111119 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111114 = matroskaExtractor.f13806OooOo0;
                        sparseArray111119.put(oooO0O1111114.f13843OooO0OO, oooO0O1111114);
                        break;
                    case 2:
                        o000Var = new o000(oooO0O0.f13850OooOO0O);
                        iOooOO0 = o000Var.OooOO0();
                        z2 = true;
                        if (iOooOO0 != 1) {
                            if (iOooOO0 == 65534) {
                                o000Var.OooOoOO(24);
                                jOooOO0O = o000Var.OooOO0O();
                                uuid = MatroskaExtractor.f13784OooooOO;
                                if (jOooOO0O == uuid.getMostSignificantBits()) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                            } else {
                                z2 = false;
                            }
                        }
                        if (z2) {
                            iOooOOoo = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                            if (iOooOOoo != 0) {
                                list = null;
                                str9 = str7;
                                list6 = list;
                                str16 = str9;
                                i16 = iOooOOoo;
                                str11 = null;
                                i17 = -1;
                                list8 = list6;
                                bArr5 = oooO0O0.f13880Oooo0oO;
                                if (bArr5 != null) {
                                    str11 = o00o0o0oOooO00o.f36794OooO00o;
                                    str16 = "video/dolby-vision";
                                }
                                int i31111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                                if (oooO0O0.f13886OoooOO0) {
                                    i19 = 2;
                                } else {
                                    i19 = 0;
                                }
                                int i31111111111115 = i31111111111114 | i19;
                                oooO0O1 = new Format.OooO0O0();
                                if (o000OO.OooO0oO(str16)) {
                                    oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                    oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                    oooO0O1.f13177OooOoO = i16;
                                    list9 = list8;
                                } else if (o000OO.OooO(str16)) {
                                    if (oooO0O0.f13857OooOOo0 == 0) {
                                        i22 = oooO0O0.f13854OooOOOO;
                                        iIntValue = -1;
                                        if (i22 == -1) {
                                            i22 = oooO0O0.f13853OooOOO0;
                                        }
                                        oooO0O0.f13854OooOOOO = i22;
                                        i23 = oooO0O0.f13855OooOOOo;
                                        if (i23 == -1) {
                                            i23 = oooO0O0.f13852OooOOO;
                                        }
                                        oooO0O0.f13855OooOOOo = i23;
                                    } else {
                                        iIntValue = -1;
                                    }
                                    f = -1.0f;
                                    i20 = oooO0O0.f13854OooOOOO;
                                    if (i20 != iIntValue) {
                                        f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                    }
                                    if (oooO0O0.f13859OooOo) {
                                        if (oooO0O0.f13869OooOooO != -1.0f) {
                                            bArr6 = null;
                                        } else {
                                            bArr6 = null;
                                        }
                                        colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                    } else {
                                        colorInfo = null;
                                    }
                                    map = MatroskaExtractor.f13785OooooOo;
                                    if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                        iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                    }
                                    if (oooO0O0.f13856OooOOo == 0) {
                                        if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                            iIntValue = 180;
                                        } else {
                                            iIntValue = 180;
                                        }
                                    }
                                    oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                    oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                    oooO0O1.f13174OooOo00 = f;
                                    oooO0O1.f13171OooOOoo = iIntValue;
                                    oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                    oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                    oooO0O1.f13176OooOo0o = colorInfo;
                                    list9 = list8;
                                } else if (!"application/x-subrip".equals(str16)) {
                                    if ("text/x-ssa".equals(str16)) {
                                        list9 = list8;
                                        ArrayList arrayList1111112 = new ArrayList(2);
                                        arrayList1111112.add(MatroskaExtractor.f13782Ooooo0o);
                                        arrayList1111112.add(oooO0O0.f13850OooOO0O);
                                        list9 = arrayList1111112;
                                    } else if (!"application/vobsub".equals(str16)) {
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        list9 = list8;
                                        throw new ParserException("Unexpected MIME type.");
                                    }
                                }
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                    oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                                }
                                oooO0O1.OooO0O0(i2);
                                oooO0O1.f13163OooOO0O = str16;
                                oooO0O1.f13164OooOO0o = i17;
                                oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                                oooO0O1.f13157OooO0Oo = i31111111111115;
                                oooO0O1.f13166OooOOO0 = list9;
                                oooO0O1.f13161OooO0oo = str11;
                                oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                                Format format1111110 = new Format(oooO0O1);
                                TrackOutput trackOutputOooO00o1111110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                                oooO0O0.f13888OoooOOo = trackOutputOooO00o1111110;
                                trackOutputOooO00o1111110.OooO0o0(format1111110);
                                matroskaExtractor = matroskaExtractor2;
                                SparseArray<OooO0O0> sparseArray1111110 = matroskaExtractor.f13789OooO0OO;
                                OooO0O0 oooO0O1111115 = matroskaExtractor.f13806OooOo0;
                                sparseArray1111110.put(oooO0O1111115.f13843OooO0OO, oooO0O1111115);
                            } else {
                                int i44 = oooO0O0.f13871Oooo;
                                StringBuilder sb6 = new StringBuilder(75);
                                sb6.append("Unsupported PCM bit depth: ");
                                sb6.append(i44);
                                sb6.append(". Setting mimeType to ");
                                sb6.append("audio/x-unknown");
                                Log.w("MatroskaExtractor", sb6.toString());
                            }
                        } else {
                            Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to ".concat("audio/x-unknown"));
                        }
                        list6 = null;
                        iOooOOoo = -1;
                        str16 = str9;
                        i16 = iOooOOoo;
                        str11 = null;
                        i17 = -1;
                        list8 = list6;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111117 = i31111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111113 = new ArrayList(2);
                                arrayList1111113.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111113.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111113;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111111 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111111;
                        trackOutputOooO00o1111111.OooO0o0(format1111111);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111111 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111116 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111111.put(oooO0O1111116.f13843OooO0OO, oooO0O1111116);
                        break;
                    case 3:
                        oooO0O0.f13882OoooO = new OooO0OO();
                        str7 = "audio/true-hd";
                        list2 = null;
                        iOooOOoo = -1;
                        list = list2;
                        str9 = str7;
                        list6 = list;
                        str16 = str9;
                        i16 = iOooOOoo;
                        str11 = null;
                        i17 = -1;
                        list8 = list6;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111119 = i31111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111114 = new ArrayList(2);
                                arrayList1111114.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111114.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111114;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111112 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111112;
                        trackOutputOooO00o1111112.OooO0o0(format1111112);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111112 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111117 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111112.put(oooO0O1111117.f13843OooO0OO, oooO0O1111117);
                        break;
                    case 4:
                        bArr2 = oooO0O0.f13850OooOO0O;
                        if (bArr2[0] != 2) {
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        i3 = 0;
                        i4 = 1;
                        while (bArr2[i4] == -1) {
                            i3 += KotlinVersion.MAX_COMPONENT_VALUE;
                            i4++;
                        }
                        i5 = i4 + 1;
                        i6 = i3 + bArr2[i4];
                        i7 = 0;
                        while (bArr2[i5] == -1) {
                            i7 += KotlinVersion.MAX_COMPONENT_VALUE;
                            i5++;
                        }
                        i8 = i5 + 1;
                        i9 = i7 + bArr2[i5];
                        if (bArr2[i8] != 1) {
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        bArr3 = new byte[i6];
                        System.arraycopy(bArr2, i8, bArr3, 0, i6);
                        i10 = i8 + i6;
                        if (bArr2[i10] != 3) {
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        i11 = i10 + i9;
                        if (bArr2[i11] != 5) {
                            throw new ParserException("Error parsing vorbis codec private");
                        }
                        byte[] bArr11 = new byte[bArr2.length - i11];
                        System.arraycopy(bArr2, i11, bArr11, 0, bArr2.length - i11);
                        ArrayList arrayList23 = new ArrayList(2);
                        arrayList23.add(bArr3);
                        arrayList23.add(bArr11);
                        str10 = "audio/vorbis";
                        str11 = null;
                        i12 = 8192;
                        list5 = arrayList23;
                        i15 = i12;
                        str16 = str10;
                        i16 = -1;
                        list10 = list5;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111111 = i311111111111110 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111115 = new ArrayList(2);
                                arrayList1111115.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111115.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111115;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111111;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111113 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111113;
                        trackOutputOooO00o1111113.OooO0o0(format1111113);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111113 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111118 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111113.put(oooO0O1111118.f13843OooO0OO, oooO0O1111118);
                        break;
                        break;
                    case 5:
                        str12 = "audio/mpeg-L2";
                        str13 = str12;
                        arrayList = null;
                        i13 = 4096;
                        i18 = i13;
                        str7 = str13;
                        i16 = -1;
                        list11 = arrayList;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111113 = i311111111111112 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111116 = new ArrayList(2);
                                arrayList1111116.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111116.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111116;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111113;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111114 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111114;
                        trackOutputOooO00o1111114.OooO0o0(format1111114);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111114 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111119 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111114.put(oooO0O1111119.f13843OooO0OO, oooO0O1111119);
                        break;
                    case 6:
                        str12 = "audio/mpeg";
                        str13 = str12;
                        arrayList = null;
                        i13 = 4096;
                        i18 = i13;
                        str7 = str13;
                        i16 = -1;
                        list11 = arrayList;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111115 = i311111111111114 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111117 = new ArrayList(2);
                                arrayList1111117.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111117.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111117;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111115;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111115 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111115;
                        trackOutputOooO00o1111115.OooO0o0(format1111115);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111115 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111110 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111115.put(oooO0O11111110.f13843OooO0OO, oooO0O11111110);
                        break;
                    case 7:
                        bArr4 = oooO0O0.f13850OooOO0O;
                        if (16 <= bArr4.length) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        o00000O0.OooO00o(z3);
                        j = (((long) bArr4[16]) & 255) | ((((long) bArr4[17]) & 255) << 8) | ((((long) bArr4[18]) & 255) << 16) | ((255 & ((long) bArr4[19])) << 24);
                        if (j == 1482049860) {
                            pair = new Pair("video/divx", null);
                        } else if (j == 859189832) {
                            pair = new Pair("video/3gpp", null);
                        } else if (j == 826496599) {
                            i14 = 40;
                            while (true) {
                                if (i14 >= bArr4.length - 4) {
                                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                                }
                                if (bArr4[i14] != 0) {
                                }
                                i14++;
                            }
                        } else {
                            Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                            pair = new Pair("video/x-unknown", null);
                        }
                        str14 = (String) pair.first;
                        listSingletonList2 = (List) pair.second;
                        str7 = str14;
                        list4 = listSingletonList2;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111117 = i311111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111118 = new ArrayList(2);
                                arrayList1111118.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111118.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111118;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111116 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111116;
                        trackOutputOooO00o1111116.OooO0o0(format1111116);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111116 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111111 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111116.put(oooO0O11111111.f13843OooO0OO, oooO0O11111111);
                        break;
                    case 8:
                        byte[] bArr12 = oooO0O0.f13850OooOO0O;
                        str14 = "application/dvbsubs";
                        listSingletonList2 = Collections.singletonList(new byte[]{bArr12[0], bArr12[1], bArr12[2], bArr12[3]});
                        str7 = str14;
                        list4 = listSingletonList2;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111119 = i311111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList1111119 = new ArrayList(2);
                                arrayList1111119.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList1111119.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList1111119;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111117 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111117;
                        trackOutputOooO00o1111117.OooO0o0(format1111117);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111117 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111112 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111117.put(oooO0O11111112.f13843OooO0OO, oooO0O11111112);
                        break;
                    case 10:
                        o00O0O0 o00o0o0OooO0O2 = o00O0O0.OooO0O0(new o000(oooO0O0.f13850OooOO0O));
                        list3 = o00o0o0OooO0O2.f36789OooO00o;
                        oooO0O0.f13889OoooOo0 = o00o0o0OooO0O2.f36790OooO0O0;
                        str15 = "video/avc";
                        str7 = str15;
                        list4 = list3;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111 = i3111111111111110 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111110 = new ArrayList(2);
                                arrayList11111110.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111110.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111110;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111118 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111118;
                        trackOutputOooO00o1111118.OooO0o0(format1111118);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111118 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111113 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111118.put(oooO0O11111113.f13843OooO0OO, oooO0O11111113);
                        break;
                    case 11:
                        str14 = "application/vobsub";
                        listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                        str7 = str14;
                        list4 = listSingletonList2;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111113 = i3111111111111112 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111111 = new ArrayList(2);
                                arrayList11111111.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111111.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111111;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111113;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format1111119 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o1111119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o1111119;
                        trackOutputOooO00o1111119.OooO0o0(format1111119);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray1111119 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111114 = matroskaExtractor.f13806OooOo0;
                        sparseArray1111119.put(oooO0O11111114.f13843OooO0OO, oooO0O11111114);
                        break;
                    case 12:
                        str8 = "audio/vnd.dts.hd";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111115 = i3111111111111114 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111112 = new ArrayList(2);
                                arrayList11111112.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111112.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111112;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111115;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111110 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111110;
                        trackOutputOooO00o11111110.OooO0o0(format11111110);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111110 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111115 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111110.put(oooO0O11111115.f13843OooO0OO, oooO0O11111115);
                        break;
                    case 13:
                        List<byte[]> listSingletonList5 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                        AacUtil.OooO00o oooO00oOooO0Oo3 = AacUtil.OooO0Oo(oooO0O0.f13850OooOO0O);
                        oooO0O0.f13884OoooO00 = oooO00oOooO0Oo3.f13469OooO00o;
                        oooO0O0.f13881Oooo0oo = oooO00oOooO0Oo3.f13470OooO0O0;
                        String str32 = oooO00oOooO0Oo3.f13471OooO0OO;
                        str10 = "audio/mp4a-latm";
                        str11 = str32;
                        i12 = -1;
                        list5 = listSingletonList5;
                        i15 = i12;
                        str16 = str10;
                        i16 = -1;
                        list10 = list5;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111117 = i3111111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111113 = new ArrayList(2);
                                arrayList11111113.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111113.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111113;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111111 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111111;
                        trackOutputOooO00o11111111.OooO0o0(format11111111);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111111 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111116 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111111.put(oooO0O11111116.f13843OooO0OO, oooO0O11111116);
                        break;
                    case 14:
                        str8 = "audio/ac3";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111119 = i3111111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111114 = new ArrayList(2);
                                arrayList11111114.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111114.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111114;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111112 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111112;
                        trackOutputOooO00o11111112.OooO0o0(format11111112);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111112 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111117 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111112.put(oooO0O11111117.f13843OooO0OO, oooO0O11111117);
                        break;
                    case 15:
                    case 21:
                        str8 = "audio/vnd.dts";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111111111 = i31111111111111110 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111115 = new ArrayList(2);
                                arrayList11111115.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111115.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111115;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111111111;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111113 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111113;
                        trackOutputOooO00o11111113.OooO0o0(format11111113);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111113 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111118 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111113.put(oooO0O11111118.f13843OooO0OO, oooO0O11111118);
                        break;
                    case 16:
                        str8 = "video/av01";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111111113 = i31111111111111112 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111116 = new ArrayList(2);
                                arrayList11111116.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111116.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111116;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111111113;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111114 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111114;
                        trackOutputOooO00o11111114.OooO0o0(format11111114);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111114 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O11111119 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111114.put(oooO0O11111119.f13843OooO0OO, oooO0O11111119);
                        break;
                    case 17:
                        str8 = "video/x-vnd.on2.vp8";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111111115 = i31111111111111114 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111117 = new ArrayList(2);
                                arrayList11111117.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111117.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111117;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111111115;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111115 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111115;
                        trackOutputOooO00o11111115.OooO0o0(format11111115);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111115 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111110 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111115.put(oooO0O111111110.f13843OooO0OO, oooO0O111111110);
                        break;
                    case 18:
                        str8 = "video/x-vnd.on2.vp9";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111111117 = i31111111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111118 = new ArrayList(2);
                                arrayList11111118.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111118.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111118;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111116 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111116;
                        trackOutputOooO00o11111116.OooO0o0(format11111116);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111116 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111111 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111116.put(oooO0O111111111.f13843OooO0OO, oooO0O111111111);
                        break;
                    case 19:
                        str8 = "application/pgs";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i31111111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i31111111111111119 = i31111111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList11111119 = new ArrayList(2);
                                arrayList11111119.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList11111119.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList11111119;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i31111111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111117 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111117;
                        trackOutputOooO00o11111117.OooO0o0(format11111117);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111117 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111112 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111117.put(oooO0O111111112.f13843OooO0OO, oooO0O111111112);
                        break;
                    case 20:
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111111111 = i311111111111111110 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111110 = new ArrayList(2);
                                arrayList111111110.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111110.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111110;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111111111;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format11111118 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o11111118 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o11111118;
                        trackOutputOooO00o11111118.OooO0o0(format11111118);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray11111118 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111113 = matroskaExtractor.f13806OooOo0;
                        sparseArray11111118.put(oooO0O111111113.f13843OooO0OO, oooO0O111111113);
                        break;
                    case 22:
                        iOooOOoo2 = o000OOo0.OooOOoo(oooO0O0.f13871Oooo);
                        if (iOooOOoo2 == 0) {
                            int i45 = oooO0O0.f13871Oooo;
                            StringBuilder sb7 = new StringBuilder(75);
                            sb7.append("Unsupported PCM bit depth: ");
                            sb7.append(i45);
                            sb7.append(". Setting mimeType to ");
                            sb7.append("audio/x-unknown");
                            Log.w("MatroskaExtractor", sb7.toString());
                            list6 = null;
                            iOooOOoo = -1;
                            str16 = str9;
                            i16 = iOooOOoo;
                            str11 = null;
                            i17 = -1;
                            list8 = list6;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111111111113 = i311111111111111112 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111111111 = new ArrayList(2);
                                    arrayList111111111.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111111111.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111111111;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111111111113;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format11111119 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o11111119 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o11111119;
                            trackOutputOooO00o11111119.OooO0o0(format11111119);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray11111119 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111111114 = matroskaExtractor.f13806OooOo0;
                            sparseArray11111119.put(oooO0O111111114.f13843OooO0OO, oooO0O111111114);
                        } else {
                            i16 = iOooOOoo2;
                            list7 = null;
                            i18 = -1;
                            list11 = list7;
                            i15 = i18;
                            str16 = str7;
                            str11 = null;
                            list10 = list11;
                            i17 = i15;
                            list8 = list10;
                            bArr5 = oooO0O0.f13880Oooo0oO;
                            if (bArr5 != null) {
                                str11 = o00o0o0oOooO00o.f36794OooO00o;
                                str16 = "video/dolby-vision";
                            }
                            int i311111111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                            if (oooO0O0.f13886OoooOO0) {
                                i19 = 2;
                            } else {
                                i19 = 0;
                            }
                            int i311111111111111115 = i311111111111111114 | i19;
                            oooO0O1 = new Format.OooO0O0();
                            if (o000OO.OooO0oO(str16)) {
                                oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                                oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                                oooO0O1.f13177OooOoO = i16;
                                list9 = list8;
                            } else if (o000OO.OooO(str16)) {
                                if (oooO0O0.f13857OooOOo0 == 0) {
                                    i22 = oooO0O0.f13854OooOOOO;
                                    iIntValue = -1;
                                    if (i22 == -1) {
                                        i22 = oooO0O0.f13853OooOOO0;
                                    }
                                    oooO0O0.f13854OooOOOO = i22;
                                    i23 = oooO0O0.f13855OooOOOo;
                                    if (i23 == -1) {
                                        i23 = oooO0O0.f13852OooOOO;
                                    }
                                    oooO0O0.f13855OooOOOo = i23;
                                } else {
                                    iIntValue = -1;
                                }
                                f = -1.0f;
                                i20 = oooO0O0.f13854OooOOOO;
                                if (i20 != iIntValue) {
                                    f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                                }
                                if (oooO0O0.f13859OooOo) {
                                    if (oooO0O0.f13869OooOooO != -1.0f) {
                                        bArr6 = null;
                                    } else {
                                        bArr6 = null;
                                    }
                                    colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                                } else {
                                    colorInfo = null;
                                }
                                map = MatroskaExtractor.f13785OooooOo;
                                if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                    iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                                }
                                if (oooO0O0.f13856OooOOo == 0) {
                                    if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                                oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                                oooO0O1.f13174OooOo00 = f;
                                oooO0O1.f13171OooOOoo = iIntValue;
                                oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                                oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                                oooO0O1.f13176OooOo0o = colorInfo;
                                list9 = list8;
                            } else if (!"application/x-subrip".equals(str16)) {
                                if ("text/x-ssa".equals(str16)) {
                                    list9 = list8;
                                    ArrayList arrayList111111112 = new ArrayList(2);
                                    arrayList111111112.add(MatroskaExtractor.f13782Ooooo0o);
                                    arrayList111111112.add(oooO0O0.f13850OooOO0O);
                                    list9 = arrayList111111112;
                                } else if (!"application/vobsub".equals(str16)) {
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    list9 = list8;
                                    throw new ParserException("Unexpected MIME type.");
                                }
                            }
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            list9 = list8;
                            if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                                oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                            }
                            oooO0O1.OooO0O0(i2);
                            oooO0O1.f13163OooOO0O = str16;
                            oooO0O1.f13164OooOO0o = i17;
                            oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                            oooO0O1.f13157OooO0Oo = i311111111111111115;
                            oooO0O1.f13166OooOOO0 = list9;
                            oooO0O1.f13161OooO0oo = str11;
                            oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                            Format format111111110 = new Format(oooO0O1);
                            TrackOutput trackOutputOooO00o111111110 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                            oooO0O0.f13888OoooOOo = trackOutputOooO00o111111110;
                            trackOutputOooO00o111111110.OooO0o0(format111111110);
                            matroskaExtractor = matroskaExtractor2;
                            SparseArray<OooO0O0> sparseArray111111110 = matroskaExtractor.f13789OooO0OO;
                            OooO0O0 oooO0O111111115 = matroskaExtractor.f13806OooOo0;
                            sparseArray111111110.put(oooO0O111111115.f13843OooO0OO, oooO0O111111115);
                        }
                        break;
                    case 23:
                        str8 = "text/x-ssa";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111111117 = i311111111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111113 = new ArrayList(2);
                                arrayList111111113.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111113.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111113;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111111 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111111 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111111;
                        trackOutputOooO00o111111111.OooO0o0(format111111111);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111111 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111116 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111111.put(oooO0O111111116.f13843OooO0OO, oooO0O111111116);
                        break;
                    case 24:
                        o00O0OO0 o00o0oo0OooO00o3 = o00O0OO0.OooO00o(new o000(oooO0O0.f13850OooOO0O));
                        list3 = o00o0oo0OooO00o3.f36809OooO00o;
                        oooO0O0.f13889OoooOo0 = o00o0oo0OooO00o3.f36810OooO0O0;
                        str15 = "video/hevc";
                        str7 = str15;
                        list4 = list3;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i311111111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i311111111111111119 = i311111111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111114 = new ArrayList(2);
                                arrayList111111114.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111114.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111114;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i311111111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111112 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111112 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111112;
                        trackOutputOooO00o111111112.OooO0o0(format111111112);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111112 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111117 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111112.put(oooO0O111111117.f13843OooO0OO, oooO0O111111117);
                        break;
                    case 25:
                        str8 = "application/x-subrip";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111111110 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111111 = i3111111111111111110 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111115 = new ArrayList(2);
                                arrayList111111115.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111115.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111115;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111111;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111113 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111113 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111113;
                        trackOutputOooO00o111111113.OooO0o0(format111111113);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111113 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111118 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111113.put(oooO0O111111118.f13843OooO0OO, oooO0O111111118);
                        break;
                    case 26:
                        str8 = "video/mpeg2";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111111112 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111113 = i3111111111111111112 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111116 = new ArrayList(2);
                                arrayList111111116.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111116.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111116;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111113;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111114 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111114 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111114;
                        trackOutputOooO00o111111114.OooO0o0(format111111114);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111114 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O111111119 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111114.put(oooO0O111111119.f13843OooO0OO, oooO0O111111119);
                        break;
                    case 27:
                        str8 = "audio/eac3";
                        str7 = str8;
                        list4 = null;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111111114 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111115 = i3111111111111111114 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111117 = new ArrayList(2);
                                arrayList111111117.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111117.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111117;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111115;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111115 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111115 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111115;
                        trackOutputOooO00o111111115.OooO0o0(format111111115);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111115 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111111110 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111115.put(oooO0O1111111110.f13843OooO0OO, oooO0O1111111110);
                        break;
                    case 28:
                        str14 = "audio/flac";
                        listSingletonList2 = Collections.singletonList(oooO0O0.f13850OooOO0O);
                        str7 = str14;
                        list4 = listSingletonList2;
                        i16 = -1;
                        list7 = list4;
                        i18 = -1;
                        list11 = list7;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111111116 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111117 = i3111111111111111116 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111118 = new ArrayList(2);
                                arrayList111111118.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111118.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111118;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111117;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111116 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111116 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111116;
                        trackOutputOooO00o111111116.OooO0o0(format111111116);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111116 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111111111 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111116.put(oooO0O1111111111.f13843OooO0OO, oooO0O1111111111);
                        break;
                    case 29:
                        ArrayList arrayList24 = new ArrayList(3);
                        arrayList24.add(oooO0O0.f13850OooOO0O);
                        ByteBuffer byteBufferAllocate3 = ByteBuffer.allocate(8);
                        ByteOrder byteOrder3 = ByteOrder.LITTLE_ENDIAN;
                        arrayList24.add(byteBufferAllocate3.order(byteOrder3).putLong(oooO0O0.f13883OoooO0).array());
                        arrayList24.add(ByteBuffer.allocate(8).order(byteOrder3).putLong(oooO0O0.f13885OoooO0O).array());
                        str13 = "audio/opus";
                        arrayList = arrayList24;
                        i13 = 5760;
                        i18 = i13;
                        str7 = str13;
                        i16 = -1;
                        list11 = arrayList;
                        i15 = i18;
                        str16 = str7;
                        str11 = null;
                        list10 = list11;
                        i17 = i15;
                        list8 = list10;
                        bArr5 = oooO0O0.f13880Oooo0oO;
                        if (bArr5 != null) {
                            str11 = o00o0o0oOooO00o.f36794OooO00o;
                            str16 = "video/dolby-vision";
                        }
                        int i3111111111111111118 = (oooO0O0.f13890o000oOoO ? 1 : 0) | 0;
                        if (oooO0O0.f13886OoooOO0) {
                            i19 = 2;
                        } else {
                            i19 = 0;
                        }
                        int i3111111111111111119 = i3111111111111111118 | i19;
                        oooO0O1 = new Format.OooO0O0();
                        if (o000OO.OooO0oO(str16)) {
                            oooO0O1.f13172OooOo = oooO0O0.f13881Oooo0oo;
                            oooO0O1.f13178OooOoO0 = oooO0O0.f13884OoooO00;
                            oooO0O1.f13177OooOoO = i16;
                            list9 = list8;
                        } else if (o000OO.OooO(str16)) {
                            if (oooO0O0.f13857OooOOo0 == 0) {
                                i22 = oooO0O0.f13854OooOOOO;
                                iIntValue = -1;
                                if (i22 == -1) {
                                    i22 = oooO0O0.f13853OooOOO0;
                                }
                                oooO0O0.f13854OooOOOO = i22;
                                i23 = oooO0O0.f13855OooOOOo;
                                if (i23 == -1) {
                                    i23 = oooO0O0.f13852OooOOO;
                                }
                                oooO0O0.f13855OooOOOo = i23;
                            } else {
                                iIntValue = -1;
                            }
                            f = -1.0f;
                            i20 = oooO0O0.f13854OooOOOO;
                            if (i20 != iIntValue) {
                                f = (oooO0O0.f13852OooOOO * i20) / (oooO0O0.f13853OooOOO0 * i21);
                            }
                            if (oooO0O0.f13859OooOo) {
                                if (oooO0O0.f13869OooOooO != -1.0f) {
                                    bArr6 = null;
                                } else {
                                    bArr6 = null;
                                }
                                colorInfo = new ColorInfo(oooO0O0.f13865OooOoO0, oooO0O0.f13866OooOoOO, oooO0O0.f13864OooOoO, bArr6);
                            } else {
                                colorInfo = null;
                            }
                            map = MatroskaExtractor.f13785OooooOo;
                            if (map.containsKey(oooO0O0.f13841OooO00o)) {
                                iIntValue = map.get(oooO0O0.f13841OooO00o).intValue();
                            }
                            if (oooO0O0.f13856OooOOo == 0) {
                                if (Float.compare(oooO0O0.f13860OooOo0, ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(oooO0O0.f13861OooOo00, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            oooO0O1.f13168OooOOOo = oooO0O0.f13853OooOOO0;
                            oooO0O1.f13170OooOOo0 = oooO0O0.f13852OooOOO;
                            oooO0O1.f13174OooOo00 = f;
                            oooO0O1.f13171OooOOoo = iIntValue;
                            oooO0O1.f13173OooOo0 = oooO0O0.f13862OooOo0O;
                            oooO0O1.f13175OooOo0O = oooO0O0.f13863OooOo0o;
                            oooO0O1.f13176OooOo0o = colorInfo;
                            list9 = list8;
                        } else if (!"application/x-subrip".equals(str16)) {
                            if ("text/x-ssa".equals(str16)) {
                                list9 = list8;
                                ArrayList arrayList111111119 = new ArrayList(2);
                                arrayList111111119.add(MatroskaExtractor.f13782Ooooo0o);
                                arrayList111111119.add(oooO0O0.f13850OooOO0O);
                                list9 = arrayList111111119;
                            } else if (!"application/vobsub".equals(str16)) {
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                list9 = list8;
                                throw new ParserException("Unexpected MIME type.");
                            }
                        }
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        list9 = list8;
                        if (!MatroskaExtractor.f13785OooooOo.containsKey(oooO0O0.f13841OooO00o)) {
                            oooO0O1.f13155OooO0O0 = oooO0O0.f13841OooO00o;
                        }
                        oooO0O1.OooO0O0(i2);
                        oooO0O1.f13163OooOO0O = str16;
                        oooO0O1.f13164OooOO0o = i17;
                        oooO0O1.f13156OooO0OO = oooO0O0.f13887OoooOOO;
                        oooO0O1.f13157OooO0Oo = i3111111111111111119;
                        oooO0O1.f13166OooOOO0 = list9;
                        oooO0O1.f13161OooO0oo = str11;
                        oooO0O1.f13165OooOOO = oooO0O0.f13851OooOO0o;
                        Format format111111117 = new Format(oooO0O1);
                        TrackOutput trackOutputOooO00o111111117 = o0oooo1.OooO00o(oooO0O0.f13843OooO0OO);
                        oooO0O0.f13888OoooOOo = trackOutputOooO00o111111117;
                        trackOutputOooO00o111111117.OooO0o0(format111111117);
                        matroskaExtractor = matroskaExtractor2;
                        SparseArray<OooO0O0> sparseArray111111117 = matroskaExtractor.f13789OooO0OO;
                        OooO0O0 oooO0O1111111112 = matroskaExtractor.f13806OooOo0;
                        sparseArray111111117.put(oooO0O1111111112.f13843OooO0OO, oooO0O1111111112);
                        break;
                    default:
                        throw new ParserException("Unrecognized codec identifier.");
                }
            } else {
                str27 = str27;
                str28 = str28;
                str25 = str25;
                matroskaExtractor = matroskaExtractor2;
            }
            matroskaExtractor.f13806OooOo0 = null;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public byte[] f13840OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f13841OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f13842OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f13843OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13844OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13845OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f13846OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13847OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public boolean f13848OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public TrackOutput.OooO00o f13849OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public byte[] f13850OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public DrmInitData f13851OooOO0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        @Nullable
        public byte[] f13880Oooo0oO;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        @Nullable
        public OooO0OO f13882OoooO;

        /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
        public boolean f13886OoooOO0;

        /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
        public TrackOutput f13888OoooOOo;

        /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
        public int f13889OoooOo0;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public int f13853OooOOO0 = -1;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public int f13852OooOOO = -1;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public int f13854OooOOOO = -1;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f13855OooOOOo = -1;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f13857OooOOo0 = 0;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f13856OooOOo = -1;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public float f13858OooOOoo = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public float f13861OooOo00 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public float f13860OooOo0 = ZegoAudioProcessing.ZegoVoiceChangerCategory.NONE;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public byte[] f13862OooOo0O = null;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f13863OooOo0o = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public boolean f13859OooOo = false;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f13865OooOoO0 = -1;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f13864OooOoO = -1;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f13866OooOoOO = -1;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f13868OooOoo0 = 1000;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f13867OooOoo = 200;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public float f13869OooOooO = -1.0f;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public float f13870OooOooo = -1.0f;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public float f13873Oooo000 = -1.0f;

        /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
        public float f13874Oooo00O = -1.0f;

        /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
        public float f13875Oooo00o = -1.0f;

        /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
        public float f13872Oooo0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
        public float f13876Oooo0O0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
        public float f13877Oooo0OO = -1.0f;

        /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
        public float f13879Oooo0o0 = -1.0f;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public float f13878Oooo0o = -1.0f;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public int f13881Oooo0oo = 1;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public int f13871Oooo = -1;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f13884OoooO00 = 8000;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public long f13883OoooO0 = 0;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public long f13885OoooO0O = 0;

        /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
        public boolean f13890o000oOoO = true;

        /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
        public String f13887OoooOOO = "eng";
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final byte[] f13891OooO00o = new byte[10];

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f13892OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f13893OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public long f13894OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13895OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f13896OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13897OooO0oO;

        public final void OooO00o(OooO0O0 oooO0O0) {
            if (this.f13893OooO0OO > 0) {
                oooO0O0.f13888OoooOOo.OooO0Oo(this.f13894OooO0Oo, this.f13896OooO0o0, this.f13895OooO0o, this.f13897OooO0oO, oooO0O0.f13849OooOO0);
                this.f13893OooO0OO = 0;
            }
        }
    }

    static {
        HashMap map = new HashMap();
        p299o0O0Ooo0.o00000O0.OooO00o(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090", 180, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f13785OooooOo = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor() {
        o000000O o000000o2 = new o000000O();
        this.f13803OooOOo0 = -1L;
        this.f13802OooOOo = -9223372036854775807L;
        this.f13804OooOOoo = -9223372036854775807L;
        this.f13807OooOo00 = -9223372036854775807L;
        this.f13810OooOoO = -1L;
        this.f13812OooOoOO = -1L;
        this.f13814OooOoo0 = -9223372036854775807L;
        this.f13787OooO00o = o000000o2;
        o000000o2.f35984OooO0Oo = new OooO00o();
        this.f13790OooO0Oo = true;
        this.f13788OooO0O0 = new o00000OO();
        this.f13789OooO0OO = new SparseArray<>();
        this.f13793OooO0oO = new o000(4);
        this.f13794OooO0oo = new o000(ByteBuffer.allocate(4).putInt(-1).array());
        this.f13786OooO = new o000(4);
        this.f13792OooO0o0 = new o000(o0000O.f36673OooO00o);
        this.f13791OooO0o = new o000(4);
        this.f13795OooOO0 = new o000();
        this.f13796OooOO0O = new o000();
        this.f13797OooOO0o = new o000(8);
        this.f13799OooOOO0 = new o000();
        this.f13798OooOOO = new o000();
        this.f13825Oooo0o0 = new int[1];
    }

    public static byte[] OooO0O0(long j, String str, long j2) {
        o00000O0.OooO00o(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return o000OOo0.OooOoO0(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void OooO(o0OoOo0 o0oooo1) {
        this.f13837OoooOoo = o0oooo1;
    }

    public final void OooO00o(OooO0O0 oooO0O0, long j, int i, int i2, int i3) {
        byte[] bArrOooO0O0;
        int i4;
        int i5;
        int i6 = i;
        OooO0OO oooO0OO = oooO0O0.f13882OoooO;
        if (oooO0OO == null) {
            if ("S_TEXT/UTF8".equals(oooO0O0.f13842OooO0O0) || "S_TEXT/ASS".equals(oooO0O0.f13842OooO0O0)) {
                if (this.f13823Oooo0OO > 1) {
                    Log.w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f13818Oooo0;
                    if (j2 == -9223372036854775807L) {
                        Log.w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = oooO0O0.f13842OooO0O0;
                        byte[] bArr = this.f13796OooOO0O.f36661OooO00o;
                        Objects.requireNonNull(str);
                        if (str.equals("S_TEXT/ASS")) {
                            bArrOooO0O0 = OooO0O0(j2, "%01d:%02d:%02d:%02d", 10000L);
                            i4 = 21;
                        } else {
                            if (!str.equals("S_TEXT/UTF8")) {
                                throw new IllegalArgumentException();
                            }
                            bArrOooO0O0 = OooO0O0(j2, "%02d:%02d:%02d,%03d", 1000L);
                            i4 = 19;
                        }
                        System.arraycopy(bArrOooO0O0, 0, bArr, i4, bArrOooO0O0.length);
                        TrackOutput trackOutput = oooO0O0.f13888OoooOOo;
                        o000 o000Var = this.f13796OooOO0O;
                        trackOutput.OooO0OO(o000Var, o000Var.f36663OooO0OO);
                        i5 = i2 + this.f13796OooOO0O.f36663OooO0OO;
                    }
                }
                i5 = i2;
            } else {
                i5 = i2;
            }
            if ((268435456 & i6) != 0) {
                if (this.f13823Oooo0OO > 1) {
                    i6 &= -268435457;
                } else {
                    o000 o000Var2 = this.f13798OooOOO;
                    int i7 = o000Var2.f36663OooO0OO;
                    oooO0O0.f13888OoooOOo.OooO00o(o000Var2, i7);
                    i5 += i7;
                }
            }
            oooO0O0.f13888OoooOOo.OooO0Oo(j, i6, i5, i3, oooO0O0.f13849OooOO0);
        } else if (oooO0OO.f13892OooO0O0) {
            int i8 = oooO0OO.f13893OooO0OO;
            int i9 = i8 + 1;
            oooO0OO.f13893OooO0OO = i9;
            if (i8 == 0) {
                oooO0OO.f13894OooO0Oo = j;
                oooO0OO.f13896OooO0o0 = i6;
                oooO0OO.f13895OooO0o = 0;
            }
            oooO0OO.f13895OooO0o += i2;
            oooO0OO.f13897OooO0oO = i3;
            if (i9 >= 16) {
                oooO0OO.OooO00o(oooO0O0);
            }
        }
        this.f13819Oooo000 = true;
    }

    public final void OooO0OO(o000oOoO o000oooo2, int i) throws IOException {
        o000 o000Var = this.f13793OooO0oO;
        if (o000Var.f36663OooO0OO >= i) {
            return;
        }
        byte[] bArr = o000Var.f36661OooO00o;
        if (bArr.length < i) {
            o000Var.OooOoO0(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i)), this.f13793OooO0oO.f36663OooO0OO);
        }
        o000 o000Var2 = this.f13793OooO0oO;
        byte[] bArr2 = o000Var2.f36661OooO00o;
        int i2 = o000Var2.f36663OooO0OO;
        o000oooo2.readFully(bArr2, i2, i - i2);
        this.f13793OooO0oO.OooOoO(i);
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public final void OooO0Oo(long j, long j2) {
        this.f13814OooOoo0 = -9223372036854775807L;
        this.f13820Oooo00O = 0;
        o000000O o000000o2 = (o000000O) this.f13787OooO00o;
        o000000o2.f35986OooO0o0 = 0;
        o000000o2.f35982OooO0O0.clear();
        o00000OO o00000oo2 = o000000o2.f35983OooO0OO;
        o00000oo2.f35994OooO0O0 = 0;
        o00000oo2.f35995OooO0OO = 0;
        o00000OO o00000oo3 = this.f13788OooO0O0;
        o00000oo3.f35994OooO0O0 = 0;
        o00000oo3.f35995OooO0OO = 0;
        OooO0oO();
        for (int i = 0; i < this.f13789OooO0OO.size(); i++) {
            OooO0OO oooO0OO = this.f13789OooO0OO.valueAt(i).f13882OoooO;
            if (oooO0OO != null) {
                oooO0OO.f13892OooO0O0 = false;
                oooO0OO.f13893OooO0OO = 0;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean OooO0o(o000oOoO o000oooo2) throws IOException {
        o00000O o00000o = new o00000O();
        Oooo000 oooo000 = (Oooo000) o000oooo2;
        long j = oooo000.f35893OooO0OO;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        oooo000.OooO0OO(o00000o.f35990OooO00o.f36661OooO00o, 0, 4, false);
        o00000o.f35991OooO0O0 = 4;
        for (long jOooOOo = o00000o.f35990OooO00o.OooOOo(); jOooOOo != 440786851; jOooOOo = ((jOooOOo << 8) & (-256)) | ((long) (o00000o.f35990OooO00o.f36661OooO00o[0] & UByte.MAX_VALUE))) {
            int i2 = o00000o.f35991OooO0O0 + 1;
            o00000o.f35991OooO0O0 = i2;
            if (i2 == i) {
                return false;
            }
            oooo000.OooO0OO(o00000o.f35990OooO00o.f36661OooO00o, 0, 1, false);
        }
        long jOooO00o = o00000o.OooO00o(o000oooo2);
        long j3 = o00000o.f35991OooO0O0;
        if (jOooO00o == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + jOooO00o >= j) {
            return false;
        }
        while (true) {
            long j4 = o00000o.f35991OooO0O0;
            long j5 = j3 + jOooO00o;
            if (j4 >= j5) {
                return j4 == j5;
            }
            if (o00000o.OooO00o(o000oooo2) == Long.MIN_VALUE) {
                return false;
            }
            long jOooO00o2 = o00000o.OooO00o(o000oooo2);
            if (jOooO00o2 < 0 || jOooO00o2 > 2147483647L) {
                return false;
            }
            if (jOooO00o2 != 0) {
                int i3 = (int) jOooO00o2;
                oooo000.OooOOOO(i3, false);
                o00000o.f35991OooO0O0 += i3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:383:0x077f  */
    /* JADX WARN: Code duplicated, block: B:446:0x08b1  */
    /* JADX WARN: Code duplicated, block: B:448:0x08bb  */
    /* JADX WARN: Code duplicated, block: B:449:0x08c4  */
    /* JADX WARN: Code duplicated, block: B:451:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:453:0x08d0  */
    /* JADX WARN: Code duplicated, block: B:459:0x08db  */
    /* JADX WARN: Code duplicated, block: B:495:0x08d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x08dd A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v14, types: [int] */
    /* JADX WARN: Type inference failed for: r13v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r3v117 */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v69 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v100 */
    /* JADX WARN: Type inference failed for: r4v106 */
    /* JADX WARN: Type inference failed for: r4v107 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v37, types: [int] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int OooO0o0(o000oOoO o000oooo2, o0OO00O o0oo00o2) throws IOException {
        int i;
        boolean z;
        String str;
        long j;
        int i2;
        int[] iArr;
        long position;
        boolean z2;
        long j2;
        MatroskaExtractor matroskaExtractor = this;
        o000oOoO o000oooo3 = o000oooo2;
        boolean z3 = false;
        matroskaExtractor.f13819Oooo000 = false;
        int i3 = 1;
        boolean z4 = true;
        while (true) {
            int i4 = -1;
            if (z4 && !matroskaExtractor.f13819Oooo000) {
                o000000O o000000o2 = (o000000O) matroskaExtractor.f13787OooO00o;
                o00000O0.OooO0o(o000000o2.f35984OooO0Oo);
                boolean z5 = z3;
                while (true) {
                    o000000O.OooO00o oooO00oPeek = o000000o2.f35982OooO0O0.peek();
                    if (oooO00oPeek == null || o000oooo2.getPosition() < oooO00oPeek.f35989OooO0O0) {
                        int i5 = 4;
                        if (o000000o2.f35986OooO0o0 == 0) {
                            long jOooO0OO = o000000o2.f35983OooO0OO.OooO0OO(o000oooo3, i3, z5, 4);
                            if (jOooO0OO == -2) {
                                o000oooo2.OooO();
                                while (true) {
                                    o000oooo3.OooOOO0(o000000o2.f35981OooO00o, z5 ? 1 : 0, 4);
                                    int iOooO0O0 = o00000OO.OooO0O0(o000000o2.f35981OooO00o[z5 ? 1 : 0]);
                                    if (iOooO0O0 != i4 && iOooO0O0 <= 4) {
                                        int iOooO00o = (int) o00000OO.OooO00o(o000000o2.f35981OooO00o, iOooO0O0, z5);
                                        Objects.requireNonNull(MatroskaExtractor.this);
                                        if (iOooO00o == 357149030 || iOooO00o == 524531317 || iOooO00o == 475249515 || iOooO00o == 374648427) {
                                            o000oooo3.OooOO0(iOooO0O0);
                                            jOooO0OO = iOooO00o;
                                        }
                                    }
                                    o000oooo3.OooOO0(i3);
                                }
                            }
                            if (jOooO0OO == -1) {
                                z = false;
                                z4 = false;
                            } else {
                                o000000o2.f35985OooO0o = (int) jOooO0OO;
                                o000000o2.f35986OooO0o0 = i3;
                            }
                            if (z4) {
                                position = o000oooo2.getPosition();
                                matroskaExtractor = this;
                                if (matroskaExtractor.f13811OooOoO0) {
                                    matroskaExtractor.f13812OooOoOO = position;
                                    o0oo00o2.f35929OooO00o = matroskaExtractor.f13810OooOoO;
                                    matroskaExtractor.f13811OooOoO0 = z;
                                } else {
                                    if (matroskaExtractor.f13808OooOo0O) {
                                        j2 = matroskaExtractor.f13812OooOoOO;
                                        if (j2 != -1) {
                                            o0oo00o2.f35929OooO00o = j2;
                                            matroskaExtractor.f13812OooOoOO = -1L;
                                        }
                                        if (z2) {
                                            return 1;
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                        return 1;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    return 1;
                                }
                            } else {
                                matroskaExtractor = this;
                            }
                            i3 = 1;
                            z3 = false;
                        }
                        if (o000000o2.f35986OooO0o0 == i3) {
                            o000000o2.f35987OooO0oO = o000000o2.f35983OooO0OO.OooO0OO(o000oooo3, z5, i3, 8);
                            o000000o2.f35986OooO0o0 = 2;
                        }
                        EbmlProcessor ebmlProcessor = o000000o2.f35984OooO0Oo;
                        int i6 = o000000o2.f35985OooO0o;
                        Objects.requireNonNull(MatroskaExtractor.this);
                        switch (i6) {
                            case 131:
                            case 136:
                            case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                            case 159:
                            case 176:
                            case 179:
                            case 186:
                            case 215:
                            case 231:
                            case 238:
                            case 241:
                            case 251:
                            case 16871:
                            case 16980:
                            case 17029:
                            case 17143:
                            case 18401:
                            case 18408:
                            case 20529:
                            case 20530:
                            case 21420:
                            case 21432:
                            case 21680:
                            case 21682:
                            case 21690:
                            case 21930:
                            case 21945:
                            case 21946:
                            case 21947:
                            case 21948:
                            case 21949:
                            case 21998:
                            case 22186:
                            case 22203:
                            case 25188:
                            case 30321:
                            case 2352003:
                            case 2807729:
                                i = 2;
                                break;
                            case 134:
                            case 17026:
                            case 21358:
                            case 2274716:
                                i = 3;
                                break;
                            case Constants.ERR_ALREADY_IN_RECORDING /* 160 */:
                            case 166:
                            case 174:
                            case 183:
                            case 187:
                            case 224:
                            case 225:
                            case 16868:
                            case 18407:
                            case 19899:
                            case 20532:
                            case 20533:
                            case 21936:
                            case 21968:
                            case 25152:
                            case 28032:
                            case 30113:
                            case 30320:
                            case 290298740:
                            case 357149030:
                            case 374648427:
                            case 408125543:
                            case 440786851:
                            case 475249515:
                            case 524531317:
                                i = 1;
                                break;
                            case 161:
                            case 163:
                            case 165:
                            case 16877:
                            case 16981:
                            case 18402:
                            case 21419:
                            case 25506:
                            case 30322:
                                i = 4;
                                break;
                            case 181:
                            case 17545:
                            case 21969:
                            case 21970:
                            case 21971:
                            case 21972:
                            case 21973:
                            case 21974:
                            case 21975:
                            case 21976:
                            case 21977:
                            case 21978:
                            case 30323:
                            case 30324:
                            case 30325:
                                i = 5;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                        if (i != 0) {
                            if (i == i3) {
                                long position2 = o000oooo2.getPosition();
                                o000000o2.f35982OooO0O0.push(new o000000O.OooO00o(o000000o2.f35985OooO0o, o000000o2.f35987OooO0oO + position2));
                                EbmlProcessor ebmlProcessor2 = o000000o2.f35984OooO0Oo;
                                int i7 = o000000o2.f35985OooO0o;
                                long j3 = o000000o2.f35987OooO0oO;
                                MatroskaExtractor matroskaExtractor2 = MatroskaExtractor.this;
                                Objects.requireNonNull(matroskaExtractor2);
                                if (i7 == 160) {
                                    matroskaExtractor2.f13830OoooO00 = false;
                                } else if (i7 == 174) {
                                    matroskaExtractor2.f13806OooOo0 = new OooO0O0();
                                } else if (i7 == 187) {
                                    matroskaExtractor2.f13816OooOooo = false;
                                } else if (i7 == 19899) {
                                    matroskaExtractor2.f13809OooOo0o = -1;
                                    matroskaExtractor2.f13805OooOo = -1L;
                                } else if (i7 == 20533) {
                                    matroskaExtractor2.f13806OooOo0.f13848OooO0oo = true;
                                } else if (i7 == 21968) {
                                    matroskaExtractor2.f13806OooOo0.f13859OooOo = true;
                                } else if (i7 == 408125543) {
                                    long j4 = matroskaExtractor2.f13803OooOOo0;
                                    if (j4 != -1 && j4 != position2) {
                                        throw new ParserException("Multiple Segment elements not supported");
                                    }
                                    matroskaExtractor2.f13803OooOOo0 = position2;
                                    matroskaExtractor2.f13801OooOOOo = j3;
                                } else if (i7 == 475249515) {
                                    matroskaExtractor2.f13813OooOoo = new o0000O0();
                                    matroskaExtractor2.f13815OooOooO = new o0000O0();
                                } else if (i7 == 524531317 && !matroskaExtractor2.f13808OooOo0O) {
                                    if (!matroskaExtractor2.f13790OooO0Oo || matroskaExtractor2.f13810OooOoO == -1) {
                                        matroskaExtractor2.f13837OoooOoo.OooOO0O(new oo0o0Oo.OooO0O0(matroskaExtractor2.f13807OooOo00));
                                        matroskaExtractor2.f13808OooOo0O = true;
                                    } else {
                                        matroskaExtractor2.f13811OooOoO0 = true;
                                    }
                                }
                                o000000o2.f35986OooO0o0 = 0;
                                z = false;
                            } else if (i == 2) {
                                long j5 = o000000o2.f35987OooO0oO;
                                if (j5 > 8) {
                                    long j6 = o000000o2.f35987OooO0oO;
                                    StringBuilder sb = new StringBuilder(42);
                                    sb.append("Invalid integer size: ");
                                    sb.append(j6);
                                    throw new ParserException(sb.toString());
                                }
                                EbmlProcessor ebmlProcessor3 = o000000o2.f35984OooO0Oo;
                                int i8 = o000000o2.f35985OooO0o;
                                long jOooO00o = o000000o2.OooO00o(o000oooo3, (int) j5);
                                MatroskaExtractor matroskaExtractor3 = MatroskaExtractor.this;
                                Objects.requireNonNull(matroskaExtractor3);
                                if (i8 != 20529) {
                                    if (i8 != 20530) {
                                        switch (i8) {
                                            case 131:
                                                matroskaExtractor3.f13806OooOo0.f13844OooO0Oo = (int) jOooO00o;
                                                break;
                                            case 136:
                                                matroskaExtractor3.f13806OooOo0.f13890o000oOoO = jOooO00o == 1;
                                                break;
                                            case Constants.ERR_PUBLISH_STREAM_NOT_FOUND /* 155 */:
                                                matroskaExtractor3.f13818Oooo0 = matroskaExtractor3.OooO0oo(jOooO00o);
                                                break;
                                            case 159:
                                                matroskaExtractor3.f13806OooOo0.f13881Oooo0oo = (int) jOooO00o;
                                                break;
                                            case 176:
                                                matroskaExtractor3.f13806OooOo0.f13853OooOOO0 = (int) jOooO00o;
                                                break;
                                            case 179:
                                                matroskaExtractor3.f13813OooOoo.OooO00o(matroskaExtractor3.OooO0oo(jOooO00o));
                                                break;
                                            case 186:
                                                matroskaExtractor3.f13806OooOo0.f13852OooOOO = (int) jOooO00o;
                                                break;
                                            case 215:
                                                matroskaExtractor3.f13806OooOo0.f13843OooO0OO = (int) jOooO00o;
                                                break;
                                            case 231:
                                                matroskaExtractor3.f13814OooOoo0 = matroskaExtractor3.OooO0oo(jOooO00o);
                                                break;
                                            case 238:
                                                matroskaExtractor3.f13817Oooo = (int) jOooO00o;
                                                break;
                                            case 241:
                                                if (!matroskaExtractor3.f13816OooOooo) {
                                                    matroskaExtractor3.f13815OooOooO.OooO00o(jOooO00o);
                                                    matroskaExtractor3.f13816OooOooo = true;
                                                }
                                                break;
                                            case 251:
                                                matroskaExtractor3.f13830OoooO00 = true;
                                                break;
                                            case 16871:
                                                matroskaExtractor3.f13806OooOo0.f13847OooO0oO = (int) jOooO00o;
                                                break;
                                            case 16980:
                                                if (jOooO00o != 3) {
                                                    StringBuilder sb2 = new StringBuilder(50);
                                                    sb2.append("ContentCompAlgo ");
                                                    sb2.append(jOooO00o);
                                                    sb2.append(" not supported");
                                                    throw new ParserException(sb2.toString());
                                                }
                                                break;
                                            case 17029:
                                                if (jOooO00o < 1 || jOooO00o > 2) {
                                                    StringBuilder sb3 = new StringBuilder(53);
                                                    sb3.append("DocTypeReadVersion ");
                                                    sb3.append(jOooO00o);
                                                    sb3.append(" not supported");
                                                    throw new ParserException(sb3.toString());
                                                }
                                                break;
                                            case 17143:
                                                if (jOooO00o != 1) {
                                                    StringBuilder sb4 = new StringBuilder(50);
                                                    sb4.append("EBMLReadVersion ");
                                                    sb4.append(jOooO00o);
                                                    sb4.append(" not supported");
                                                    throw new ParserException(sb4.toString());
                                                }
                                                break;
                                            case 18401:
                                                if (jOooO00o != 5) {
                                                    StringBuilder sb5 = new StringBuilder(49);
                                                    sb5.append("ContentEncAlgo ");
                                                    sb5.append(jOooO00o);
                                                    sb5.append(" not supported");
                                                    throw new ParserException(sb5.toString());
                                                }
                                                break;
                                            case 18408:
                                                if (jOooO00o != 1) {
                                                    StringBuilder sb6 = new StringBuilder(56);
                                                    sb6.append("AESSettingsCipherMode ");
                                                    sb6.append(jOooO00o);
                                                    sb6.append(" not supported");
                                                    throw new ParserException(sb6.toString());
                                                }
                                                break;
                                            case 21420:
                                                matroskaExtractor3.f13805OooOo = jOooO00o + matroskaExtractor3.f13803OooOOo0;
                                                break;
                                            case 21432:
                                                int i9 = (int) jOooO00o;
                                                if (i9 == 0) {
                                                    matroskaExtractor3.f13806OooOo0.f13863OooOo0o = 0;
                                                } else if (i9 == 1) {
                                                    matroskaExtractor3.f13806OooOo0.f13863OooOo0o = 2;
                                                } else if (i9 == 3) {
                                                    matroskaExtractor3.f13806OooOo0.f13863OooOo0o = 1;
                                                } else if (i9 == 15) {
                                                    matroskaExtractor3.f13806OooOo0.f13863OooOo0o = 3;
                                                }
                                                break;
                                            case 21680:
                                                matroskaExtractor3.f13806OooOo0.f13854OooOOOO = (int) jOooO00o;
                                                break;
                                            case 21682:
                                                matroskaExtractor3.f13806OooOo0.f13857OooOOo0 = (int) jOooO00o;
                                                break;
                                            case 21690:
                                                matroskaExtractor3.f13806OooOo0.f13855OooOOOo = (int) jOooO00o;
                                                break;
                                            case 21930:
                                                matroskaExtractor3.f13806OooOo0.f13886OoooOO0 = jOooO00o == 1;
                                                break;
                                            case 21998:
                                                matroskaExtractor3.f13806OooOo0.f13845OooO0o = (int) jOooO00o;
                                                break;
                                            case 22186:
                                                matroskaExtractor3.f13806OooOo0.f13883OoooO0 = jOooO00o;
                                                break;
                                            case 22203:
                                                matroskaExtractor3.f13806OooOo0.f13885OoooO0O = jOooO00o;
                                                break;
                                            case 25188:
                                                matroskaExtractor3.f13806OooOo0.f13871Oooo = (int) jOooO00o;
                                                break;
                                            case 30321:
                                                int i10 = (int) jOooO00o;
                                                if (i10 == 0) {
                                                    matroskaExtractor3.f13806OooOo0.f13856OooOOo = 0;
                                                } else if (i10 == 1) {
                                                    matroskaExtractor3.f13806OooOo0.f13856OooOOo = 1;
                                                } else if (i10 == 2) {
                                                    matroskaExtractor3.f13806OooOo0.f13856OooOOo = 2;
                                                } else if (i10 == 3) {
                                                    matroskaExtractor3.f13806OooOo0.f13856OooOOo = 3;
                                                }
                                                break;
                                            case 2352003:
                                                matroskaExtractor3.f13806OooOo0.f13846OooO0o0 = (int) jOooO00o;
                                                break;
                                            case 2807729:
                                                matroskaExtractor3.f13802OooOOo = jOooO00o;
                                                break;
                                            default:
                                                switch (i8) {
                                                    case 21945:
                                                        int i11 = (int) jOooO00o;
                                                        if (i11 == 1) {
                                                            matroskaExtractor3.f13806OooOo0.f13866OooOoOO = 2;
                                                        } else if (i11 == 2) {
                                                            matroskaExtractor3.f13806OooOo0.f13866OooOoOO = 1;
                                                        }
                                                        break;
                                                    case 21946:
                                                        int i12 = (int) jOooO00o;
                                                        if (i12 == 1) {
                                                            matroskaExtractor3.f13806OooOo0.f13864OooOoO = 3;
                                                        } else if (i12 == 16) {
                                                            matroskaExtractor3.f13806OooOo0.f13864OooOoO = 6;
                                                        } else if (i12 == 18) {
                                                            matroskaExtractor3.f13806OooOo0.f13864OooOoO = 7;
                                                        } else if (i12 == 6 || i12 == 7) {
                                                            matroskaExtractor3.f13806OooOo0.f13864OooOoO = 3;
                                                        }
                                                        break;
                                                    case 21947:
                                                        OooO0O0 oooO0O0 = matroskaExtractor3.f13806OooOo0;
                                                        oooO0O0.f13859OooOo = true;
                                                        int i13 = (int) jOooO00o;
                                                        if (i13 == 1) {
                                                            oooO0O0.f13865OooOoO0 = 1;
                                                        } else if (i13 == 9) {
                                                            oooO0O0.f13865OooOoO0 = 6;
                                                        } else if (i13 == 4 || i13 == 5 || i13 == 6 || i13 == 7) {
                                                            oooO0O0.f13865OooOoO0 = 2;
                                                        }
                                                        break;
                                                    case 21948:
                                                        matroskaExtractor3.f13806OooOo0.f13868OooOoo0 = (int) jOooO00o;
                                                        break;
                                                    case 21949:
                                                        matroskaExtractor3.f13806OooOo0.f13867OooOoo = (int) jOooO00o;
                                                        break;
                                                }
                                                break;
                                        }
                                    } else if (jOooO00o != 1) {
                                        StringBuilder sb7 = new StringBuilder(55);
                                        sb7.append("ContentEncodingScope ");
                                        sb7.append(jOooO00o);
                                        sb7.append(" not supported");
                                        throw new ParserException(sb7.toString());
                                    }
                                } else if (jOooO00o != 0) {
                                    StringBuilder sb8 = new StringBuilder(55);
                                    sb8.append("ContentEncodingOrder ");
                                    sb8.append(jOooO00o);
                                    sb8.append(" not supported");
                                    throw new ParserException(sb8.toString());
                                }
                                o000000o2.f35986OooO0o0 = 0;
                            } else if (i == 3) {
                                long j7 = o000000o2.f35987OooO0oO;
                                if (j7 > 2147483647L) {
                                    long j8 = o000000o2.f35987OooO0oO;
                                    StringBuilder sb9 = new StringBuilder(41);
                                    sb9.append("String element size: ");
                                    sb9.append(j8);
                                    throw new ParserException(sb9.toString());
                                }
                                EbmlProcessor ebmlProcessor4 = o000000o2.f35984OooO0Oo;
                                int i14 = o000000o2.f35985OooO0o;
                                int i15 = (int) j7;
                                if (i15 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr = new byte[i15];
                                    o000oooo3.readFully(bArr, 0, i15);
                                    while (i15 > 0) {
                                        int i16 = i15 - 1;
                                        if (bArr[i16] == 0) {
                                            i15 = i16;
                                        } else {
                                            str = new String(bArr, 0, i15);
                                        }
                                    }
                                    str = new String(bArr, 0, i15);
                                }
                                MatroskaExtractor matroskaExtractor4 = MatroskaExtractor.this;
                                Objects.requireNonNull(matroskaExtractor4);
                                if (i14 == 134) {
                                    matroskaExtractor4.f13806OooOo0.f13842OooO0O0 = str;
                                } else if (i14 != 17026) {
                                    if (i14 == 21358) {
                                        matroskaExtractor4.f13806OooOo0.f13841OooO00o = str;
                                    } else if (i14 == 2274716) {
                                        matroskaExtractor4.f13806OooOo0.f13887OoooOOO = str;
                                    }
                                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                    StringBuilder sb10 = new StringBuilder(str.length() + 22);
                                    sb10.append("DocType ");
                                    sb10.append(str);
                                    sb10.append(" not supported");
                                    throw new ParserException(sb10.toString());
                                }
                                o000000o2.f35986OooO0o0 = 0;
                            } else if (i == 4) {
                                EbmlProcessor ebmlProcessor5 = o000000o2.f35984OooO0Oo;
                                int i17 = o000000o2.f35985OooO0o;
                                int i18 = (int) o000000o2.f35987OooO0oO;
                                MatroskaExtractor matroskaExtractor5 = MatroskaExtractor.this;
                                Objects.requireNonNull(matroskaExtractor5);
                                if (i17 == 161 || i17 == 163) {
                                    if (matroskaExtractor5.f13820Oooo00O == 0) {
                                        matroskaExtractor5.f13824Oooo0o = (int) matroskaExtractor5.f13788OooO0O0.OooO0OO(o000oooo3, z5, i3, 8);
                                        matroskaExtractor5.f13826Oooo0oO = matroskaExtractor5.f13788OooO0O0.f35995OooO0OO;
                                        matroskaExtractor5.f13818Oooo0 = -9223372036854775807L;
                                        matroskaExtractor5.f13820Oooo00O = i3;
                                        matroskaExtractor5.f13793OooO0oO.OooOo(z5 ? 1 : 0);
                                    }
                                    OooO0O0 oooO0O1 = matroskaExtractor5.f13789OooO0OO.get(matroskaExtractor5.f13824Oooo0o);
                                    if (oooO0O1 == null) {
                                        o000oooo3.OooOO0(i18 - matroskaExtractor5.f13826Oooo0oO);
                                        matroskaExtractor5.f13820Oooo00O = z5 ? 1 : 0;
                                    } else {
                                        if (matroskaExtractor5.f13820Oooo00O == i3) {
                                            matroskaExtractor5.OooO0OO(o000oooo3, 3);
                                            ?? r10 = (matroskaExtractor5.f13793OooO0oO.f36661OooO00o[2] & 6) >> i3;
                                            if (r10 == 0) {
                                                matroskaExtractor5.f13823Oooo0OO = i3;
                                                int[] iArr2 = matroskaExtractor5.f13825Oooo0o0;
                                                if (iArr2 == null) {
                                                    iArr2 = new int[i3];
                                                } else if (iArr2.length < i3) {
                                                    iArr2 = new int[Math.max(iArr2.length * 2, (int) i3)];
                                                }
                                                matroskaExtractor5.f13825Oooo0o0 = iArr2;
                                                iArr2[z5 ? 1 : 0] = (i18 - matroskaExtractor5.f13826Oooo0oO) - 3;
                                            } else {
                                                matroskaExtractor5.OooO0OO(o000oooo3, 4);
                                                int i19 = (matroskaExtractor5.f13793OooO0oO.f36661OooO00o[3] & KotlinVersion.MAX_COMPONENT_VALUE) + i3;
                                                matroskaExtractor5.f13823Oooo0OO = i19;
                                                int[] iArr3 = matroskaExtractor5.f13825Oooo0o0;
                                                if (iArr3 == null) {
                                                    iArr3 = new int[i19];
                                                } else if (iArr3.length < i19) {
                                                    iArr3 = new int[Math.max(iArr3.length * 2, i19)];
                                                }
                                                matroskaExtractor5.f13825Oooo0o0 = iArr3;
                                                if (r10 == 2) {
                                                    int i20 = (i18 - matroskaExtractor5.f13826Oooo0oO) - 4;
                                                    int i21 = matroskaExtractor5.f13823Oooo0OO;
                                                    Arrays.fill(iArr3, z5 ? 1 : 0, i21, i20 / i21);
                                                } else if (r10 == i3) {
                                                    int i22 = 0;
                                                    int i23 = 0;
                                                    while (true) {
                                                        int i24 = matroskaExtractor5.f13823Oooo0OO - 1;
                                                        if (i22 < i24) {
                                                            matroskaExtractor5.f13825Oooo0o0[i22] = z5 ? 1 : 0;
                                                            do {
                                                                i5 += i3;
                                                                matroskaExtractor5.OooO0OO(o000oooo3, i5);
                                                                i2 = matroskaExtractor5.f13793OooO0oO.f36661OooO00o[i5 - 1] & UByte.MAX_VALUE;
                                                                iArr = matroskaExtractor5.f13825Oooo0o0;
                                                                iArr[i22] = iArr[i22] + i2;
                                                            } while (i2 == 255);
                                                            i23 += iArr[i22];
                                                            i22++;
                                                        } else {
                                                            matroskaExtractor5.f13825Oooo0o0[i24] = ((i18 - matroskaExtractor5.f13826Oooo0oO) - i5) - i23;
                                                        }
                                                    }
                                                } else {
                                                    if (r10 != 3) {
                                                        throw new ParserException(Oooo0.OooO00o(36, "Unexpected lacing value: ", r10));
                                                    }
                                                    int i25 = 0;
                                                    int i26 = 0;
                                                    ?? r3 = z5;
                                                    ?? r4 = i3;
                                                    while (true) {
                                                        int i27 = matroskaExtractor5.f13823Oooo0OO - 1;
                                                        if (i25 < i27) {
                                                            matroskaExtractor5.f13825Oooo0o0[i25] = r3;
                                                            i5++;
                                                            matroskaExtractor5.OooO0OO(o000oooo3, i5);
                                                            int i28 = i5 - 1;
                                                            if (matroskaExtractor5.f13793OooO0oO.f36661OooO00o[i28] == 0) {
                                                                throw new ParserException("No valid varint length mask found");
                                                            }
                                                            int i29 = 0;
                                                            ?? r5 = r4;
                                                            while (true) {
                                                                if (i29 < 8) {
                                                                    int i30 = r5 << (7 - i29);
                                                                    if ((matroskaExtractor5.f13793OooO0oO.f36661OooO00o[i28] & i30) != 0) {
                                                                        i5 += i29;
                                                                        matroskaExtractor5.OooO0OO(o000oooo3, i5);
                                                                        j = (~i30) & matroskaExtractor5.f13793OooO0oO.f36661OooO00o[i28] & UByte.MAX_VALUE;
                                                                        for (int i31 = i28 + 1; i31 < i5; i31++) {
                                                                            j = (j << 8) | ((long) (matroskaExtractor5.f13793OooO0oO.f36661OooO00o[i31] & UByte.MAX_VALUE));
                                                                        }
                                                                        if (i25 > 0) {
                                                                            j -= (1 << ((i29 * 7) + 6)) - 1;
                                                                        }
                                                                    } else {
                                                                        i29++;
                                                                        r5 = 1;
                                                                        o000oooo3 = o000oooo2;
                                                                    }
                                                                } else {
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j < -2147483648L || j > 2147483647L) {
                                                                throw new ParserException("EBML lacing sample size out of range.");
                                                            }
                                                            int i32 = (int) j;
                                                            int[] iArr4 = matroskaExtractor5.f13825Oooo0o0;
                                                            if (i25 != 0) {
                                                                i32 += iArr4[i25 - 1];
                                                            }
                                                            iArr4[i25] = i32;
                                                            i26 += iArr4[i25];
                                                            i25++;
                                                            r3 = 0;
                                                            r4 = 1;
                                                            o000oooo3 = o000oooo2;
                                                        } else {
                                                            matroskaExtractor5.f13825Oooo0o0[i27] = ((i18 - matroskaExtractor5.f13826Oooo0oO) - i5) - i26;
                                                        }
                                                    }
                                                }
                                            }
                                            byte[] bArr2 = matroskaExtractor5.f13793OooO0oO.f36661OooO00o;
                                            matroskaExtractor5.f13821Oooo00o = matroskaExtractor5.OooO0oo((bArr2[1] & UByte.MAX_VALUE) | (bArr2[0] << 8)) + matroskaExtractor5.f13814OooOoo0;
                                            matroskaExtractor5.f13827Oooo0oo = (oooO0O1.f13844OooO0Oo == 2 || (i17 == 163 && (matroskaExtractor5.f13793OooO0oO.f36661OooO00o[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? 1 : 0;
                                            matroskaExtractor5.f13820Oooo00O = 2;
                                            matroskaExtractor5.f13822Oooo0O0 = 0;
                                        }
                                        if (i17 == 163) {
                                            while (true) {
                                                int i33 = matroskaExtractor5.f13822Oooo0O0;
                                                if (i33 < matroskaExtractor5.f13823Oooo0OO) {
                                                    matroskaExtractor5.OooO00o(oooO0O1, ((long) ((matroskaExtractor5.f13822Oooo0O0 * oooO0O1.f13846OooO0o0) / 1000)) + matroskaExtractor5.f13821Oooo00o, matroskaExtractor5.f13827Oooo0oo, matroskaExtractor5.OooOO0(o000oooo2, oooO0O1, matroskaExtractor5.f13825Oooo0o0[i33]), 0);
                                                    matroskaExtractor5.f13822Oooo0O0++;
                                                } else {
                                                    o000oooo3 = o000oooo2;
                                                    matroskaExtractor5.f13820Oooo00O = 0;
                                                }
                                            }
                                        } else {
                                            o000oooo3 = o000oooo2;
                                            while (true) {
                                                int i34 = matroskaExtractor5.f13822Oooo0O0;
                                                if (i34 < matroskaExtractor5.f13823Oooo0OO) {
                                                    int[] iArr5 = matroskaExtractor5.f13825Oooo0o0;
                                                    iArr5[i34] = matroskaExtractor5.OooOO0(o000oooo3, oooO0O1, iArr5[i34]);
                                                    matroskaExtractor5.f13822Oooo0O0++;
                                                }
                                            }
                                        }
                                    }
                                } else if (i17 != 165) {
                                    if (i17 == 16877) {
                                        OooO0O0 oooO0O2 = matroskaExtractor5.f13806OooOo0;
                                        int i35 = oooO0O2.f13847OooO0oO;
                                        if (i35 == 1685485123 || i35 == 1685480259) {
                                            byte[] bArr3 = new byte[i18];
                                            oooO0O2.f13880Oooo0oO = bArr3;
                                            o000oooo3.readFully(bArr3, z5 ? 1 : 0, i18);
                                        } else {
                                            o000oooo3.OooOO0(i18);
                                        }
                                    } else if (i17 == 16981) {
                                        OooO0O0 oooO0O3 = matroskaExtractor5.f13806OooOo0;
                                        byte[] bArr4 = new byte[i18];
                                        oooO0O3.f13840OooO = bArr4;
                                        o000oooo3.readFully(bArr4, z5 ? 1 : 0, i18);
                                    } else if (i17 == 18402) {
                                        byte[] bArr5 = new byte[i18];
                                        o000oooo3.readFully(bArr5, z5 ? 1 : 0, i18);
                                        matroskaExtractor5.f13806OooOo0.f13849OooOO0 = new TrackOutput.OooO00o(i3, bArr5, z5 ? 1 : 0, z5 ? 1 : 0);
                                    } else if (i17 == 21419) {
                                        Arrays.fill(matroskaExtractor5.f13786OooO.f36661OooO00o, z5 ? (byte) 1 : (byte) 0);
                                        o000oooo3.readFully(matroskaExtractor5.f13786OooO.f36661OooO00o, 4 - i18, i18);
                                        matroskaExtractor5.f13786OooO.OooOoOO(z5 ? 1 : 0);
                                        matroskaExtractor5.f13809OooOo0o = (int) matroskaExtractor5.f13786OooO.OooOOo();
                                    } else if (i17 == 25506) {
                                        OooO0O0 oooO0O4 = matroskaExtractor5.f13806OooOo0;
                                        byte[] bArr6 = new byte[i18];
                                        oooO0O4.f13850OooOO0O = bArr6;
                                        o000oooo3.readFully(bArr6, z5 ? 1 : 0, i18);
                                    } else {
                                        if (i17 != 30322) {
                                            throw new ParserException(Oooo0.OooO00o(26, "Unexpected id: ", i17));
                                        }
                                        OooO0O0 oooO0O5 = matroskaExtractor5.f13806OooOo0;
                                        byte[] bArr7 = new byte[i18];
                                        oooO0O5.f13862OooOo0O = bArr7;
                                        o000oooo3.readFully(bArr7, z5 ? 1 : 0, i18);
                                    }
                                } else if (matroskaExtractor5.f13820Oooo00O == 2) {
                                    OooO0O0 oooO0O6 = matroskaExtractor5.f13789OooO0OO.get(matroskaExtractor5.f13824Oooo0o);
                                    if (matroskaExtractor5.f13817Oooo == 4 && "V_VP9".equals(oooO0O6.f13842OooO0O0)) {
                                        matroskaExtractor5.f13798OooOOO.OooOo(i18);
                                        o000oooo3.readFully(matroskaExtractor5.f13798OooOOO.f36661OooO00o, z5 ? 1 : 0, i18);
                                    } else {
                                        o000oooo3.OooOO0(i18);
                                    }
                                }
                                o000000o2.f35986OooO0o0 = 0;
                            } else {
                                if (i != 5) {
                                    throw new ParserException(Oooo0.OooO00o(32, "Invalid element type ", i));
                                }
                                long j9 = o000000o2.f35987OooO0oO;
                                if (j9 != 4 && j9 != 8) {
                                    long j10 = o000000o2.f35987OooO0oO;
                                    StringBuilder sb11 = new StringBuilder(40);
                                    sb11.append("Invalid float size: ");
                                    sb11.append(j10);
                                    throw new ParserException(sb11.toString());
                                }
                                EbmlProcessor ebmlProcessor6 = o000000o2.f35984OooO0Oo;
                                int i36 = o000000o2.f35985OooO0o;
                                int i37 = (int) j9;
                                long jOooO00o2 = o000000o2.OooO00o(o000oooo3, i37);
                                double dIntBitsToFloat = i37 == 4 ? Float.intBitsToFloat((int) jOooO00o2) : Double.longBitsToDouble(jOooO00o2);
                                MatroskaExtractor matroskaExtractor6 = MatroskaExtractor.this;
                                Objects.requireNonNull(matroskaExtractor6);
                                if (i36 == 181) {
                                    matroskaExtractor6.f13806OooOo0.f13884OoooO00 = (int) dIntBitsToFloat;
                                } else if (i36 != 17545) {
                                    switch (i36) {
                                        case 21969:
                                            matroskaExtractor6.f13806OooOo0.f13869OooOooO = (float) dIntBitsToFloat;
                                            break;
                                        case 21970:
                                            matroskaExtractor6.f13806OooOo0.f13870OooOooo = (float) dIntBitsToFloat;
                                            break;
                                        case 21971:
                                            matroskaExtractor6.f13806OooOo0.f13873Oooo000 = (float) dIntBitsToFloat;
                                            break;
                                        case 21972:
                                            matroskaExtractor6.f13806OooOo0.f13874Oooo00O = (float) dIntBitsToFloat;
                                            break;
                                        case 21973:
                                            matroskaExtractor6.f13806OooOo0.f13875Oooo00o = (float) dIntBitsToFloat;
                                            break;
                                        case 21974:
                                            matroskaExtractor6.f13806OooOo0.f13872Oooo0 = (float) dIntBitsToFloat;
                                            break;
                                        case 21975:
                                            matroskaExtractor6.f13806OooOo0.f13876Oooo0O0 = (float) dIntBitsToFloat;
                                            break;
                                        case 21976:
                                            matroskaExtractor6.f13806OooOo0.f13877Oooo0OO = (float) dIntBitsToFloat;
                                            break;
                                        case 21977:
                                            matroskaExtractor6.f13806OooOo0.f13879Oooo0o0 = (float) dIntBitsToFloat;
                                            break;
                                        case 21978:
                                            matroskaExtractor6.f13806OooOo0.f13878Oooo0o = (float) dIntBitsToFloat;
                                            break;
                                        default:
                                            switch (i36) {
                                                case 30323:
                                                    matroskaExtractor6.f13806OooOo0.f13858OooOOoo = (float) dIntBitsToFloat;
                                                    break;
                                                case 30324:
                                                    matroskaExtractor6.f13806OooOo0.f13861OooOo00 = (float) dIntBitsToFloat;
                                                    break;
                                                case 30325:
                                                    matroskaExtractor6.f13806OooOo0.f13860OooOo0 = (float) dIntBitsToFloat;
                                                    break;
                                            }
                                            break;
                                    }
                                } else {
                                    matroskaExtractor6.f13804OooOOoo = (long) dIntBitsToFloat;
                                }
                                o000000o2.f35986OooO0o0 = z5 ? 1 : 0;
                            }
                            z4 = true;
                            if (z4) {
                                position = o000oooo2.getPosition();
                                matroskaExtractor = this;
                                if (matroskaExtractor.f13811OooOoO0) {
                                    matroskaExtractor.f13812OooOoOO = position;
                                    o0oo00o2.f35929OooO00o = matroskaExtractor.f13810OooOoO;
                                    matroskaExtractor.f13811OooOoO0 = z;
                                } else {
                                    if (matroskaExtractor.f13808OooOo0O) {
                                        j2 = matroskaExtractor.f13812OooOoOO;
                                        if (j2 != -1) {
                                            o0oo00o2.f35929OooO00o = j2;
                                            matroskaExtractor.f13812OooOoOO = -1L;
                                        }
                                        if (z2) {
                                            return 1;
                                        }
                                    }
                                    z2 = false;
                                    if (z2) {
                                        return 1;
                                    }
                                }
                                z2 = true;
                                if (z2) {
                                    return 1;
                                }
                            } else {
                                matroskaExtractor = this;
                            }
                            i3 = 1;
                            z3 = false;
                        } else {
                            o000oooo3.OooOO0((int) o000000o2.f35987OooO0oO);
                            z5 = false;
                            o000000o2.f35986OooO0o0 = 0;
                            i4 = -1;
                        }
                    } else {
                        ((OooO00o) o000000o2.f35984OooO0Oo).OooO00o(o000000o2.f35982OooO0O0.pop().f35988OooO00o);
                    }
                    z = false;
                    z4 = true;
                    if (z4) {
                        position = o000oooo2.getPosition();
                        matroskaExtractor = this;
                        if (matroskaExtractor.f13811OooOoO0) {
                            matroskaExtractor.f13812OooOoOO = position;
                            o0oo00o2.f35929OooO00o = matroskaExtractor.f13810OooOoO;
                            matroskaExtractor.f13811OooOoO0 = z;
                        } else {
                            if (matroskaExtractor.f13808OooOo0O) {
                                j2 = matroskaExtractor.f13812OooOoOO;
                                if (j2 != -1) {
                                    o0oo00o2.f35929OooO00o = j2;
                                    matroskaExtractor.f13812OooOoOO = -1L;
                                }
                                if (z2) {
                                    return 1;
                                }
                            }
                            z2 = false;
                            if (z2) {
                                return 1;
                            }
                        }
                        z2 = true;
                        if (z2) {
                            return 1;
                        }
                    } else {
                        matroskaExtractor = this;
                    }
                    i3 = 1;
                    z3 = false;
                }
            }
        }
        if (z4) {
            return 0;
        }
        for (int i38 = 0; i38 < matroskaExtractor.f13789OooO0OO.size(); i38++) {
            OooO0O0 oooO0O0ValueAt = matroskaExtractor.f13789OooO0OO.valueAt(i38);
            OooO0OO oooO0OO = oooO0O0ValueAt.f13882OoooO;
            if (oooO0OO != null) {
                oooO0OO.OooO00o(oooO0O0ValueAt);
            }
        }
        return -1;
    }

    public final void OooO0oO() {
        this.f13829OoooO0 = 0;
        this.f13831OoooO0O = 0;
        this.f13828OoooO = 0;
        this.f13832OoooOO0 = false;
        this.f13838o000oOoO = false;
        this.f13833OoooOOO = false;
        this.f13834OoooOOo = 0;
        this.f13835OoooOo0 = (byte) 0;
        this.f13836OoooOoO = false;
        this.f13795OooOO0.OooOo(0);
    }

    public final long OooO0oo(long j) throws ParserException {
        long j2 = this.f13802OooOOo;
        if (j2 != -9223372036854775807L) {
            return o000OOo0.OooOooo(j, j2, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    public final int OooOO0(o000oOoO o000oooo2, OooO0O0 oooO0O0, int i) throws IOException {
        int i2;
        int i3;
        if ("S_TEXT/UTF8".equals(oooO0O0.f13842OooO0O0)) {
            OooOO0O(o000oooo2, f13781Ooooo00, i);
            int i4 = this.f13831OoooO0O;
            OooO0oO();
            return i4;
        }
        if ("S_TEXT/ASS".equals(oooO0O0.f13842OooO0O0)) {
            OooOO0O(o000oooo2, f13783OooooO0, i);
            int i5 = this.f13831OoooO0O;
            OooO0oO();
            return i5;
        }
        TrackOutput trackOutput = oooO0O0.f13888OoooOOo;
        if (!this.f13832OoooOO0) {
            if (oooO0O0.f13848OooO0oo) {
                this.f13827Oooo0oo &= -1073741825;
                if (!this.f13838o000oOoO) {
                    o000oooo2.readFully(this.f13793OooO0oO.f36661OooO00o, 0, 1);
                    this.f13829OoooO0++;
                    byte[] bArr = this.f13793OooO0oO.f36661OooO00o;
                    if ((bArr[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                    this.f13835OoooOo0 = bArr[0];
                    this.f13838o000oOoO = true;
                }
                byte b = this.f13835OoooOo0;
                if ((b & 1) == 1) {
                    boolean z = (b & 2) == 2;
                    this.f13827Oooo0oo |= 1073741824;
                    if (!this.f13836OoooOoO) {
                        o000oooo2.readFully(this.f13797OooOO0o.f36661OooO00o, 0, 8);
                        this.f13829OoooO0 += 8;
                        this.f13836OoooOoO = true;
                        o000 o000Var = this.f13793OooO0oO;
                        o000Var.f36661OooO00o[0] = (byte) ((z ? 128 : 0) | 8);
                        o000Var.OooOoOO(0);
                        trackOutput.OooO00o(this.f13793OooO0oO, 1);
                        this.f13831OoooO0O++;
                        this.f13797OooOO0o.OooOoOO(0);
                        trackOutput.OooO00o(this.f13797OooOO0o, 8);
                        this.f13831OoooO0O += 8;
                    }
                    if (z) {
                        if (!this.f13833OoooOOO) {
                            o000oooo2.readFully(this.f13793OooO0oO.f36661OooO00o, 0, 1);
                            this.f13829OoooO0++;
                            this.f13793OooO0oO.OooOoOO(0);
                            this.f13834OoooOOo = this.f13793OooO0oO.OooOOo0();
                            this.f13833OoooOOO = true;
                        }
                        int i6 = this.f13834OoooOOo * 4;
                        this.f13793OooO0oO.OooOo(i6);
                        o000oooo2.readFully(this.f13793OooO0oO.f36661OooO00o, 0, i6);
                        this.f13829OoooO0 += i6;
                        short s = (short) ((this.f13834OoooOOo / 2) + 1);
                        int i7 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f13800OooOOOO;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.f13800OooOOOO = ByteBuffer.allocate(i7);
                        }
                        this.f13800OooOOOO.position(0);
                        this.f13800OooOOOO.putShort(s);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i3 = this.f13834OoooOOo;
                            if (i8 >= i3) {
                                break;
                            }
                            int iOooOo00 = this.f13793OooO0oO.OooOo00();
                            if (i8 % 2 == 0) {
                                this.f13800OooOOOO.putShort((short) (iOooOo00 - i9));
                            } else {
                                this.f13800OooOOOO.putInt(iOooOo00 - i9);
                            }
                            i8++;
                            i9 = iOooOo00;
                        }
                        int i10 = (i - this.f13829OoooO0) - i9;
                        if (i3 % 2 == 1) {
                            this.f13800OooOOOO.putInt(i10);
                        } else {
                            this.f13800OooOOOO.putShort((short) i10);
                            this.f13800OooOOOO.putInt(0);
                        }
                        this.f13799OooOOO0.OooOoO0(this.f13800OooOOOO.array(), i7);
                        trackOutput.OooO00o(this.f13799OooOOO0, i7);
                        this.f13831OoooO0O += i7;
                    }
                }
            } else {
                byte[] bArr2 = oooO0O0.f13840OooO;
                if (bArr2 != null) {
                    this.f13795OooOO0.OooOoO0(bArr2, bArr2.length);
                }
            }
            if (oooO0O0.f13845OooO0o > 0) {
                this.f13827Oooo0oo |= SQLiteDatabase.CREATE_IF_NECESSARY;
                this.f13798OooOOO.OooOo(0);
                this.f13793OooO0oO.OooOo(4);
                o000 o000Var2 = this.f13793OooO0oO;
                byte[] bArr3 = o000Var2.f36661OooO00o;
                bArr3[0] = (byte) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[1] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[2] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                bArr3[3] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
                trackOutput.OooO00o(o000Var2, 4);
                this.f13831OoooO0O += 4;
            }
            this.f13832OoooOO0 = true;
        }
        int i11 = i + this.f13795OooOO0.f36663OooO0OO;
        if (!"V_MPEG4/ISO/AVC".equals(oooO0O0.f13842OooO0O0) && !"V_MPEGH/ISO/HEVC".equals(oooO0O0.f13842OooO0O0)) {
            if (oooO0O0.f13882OoooO != null) {
                o00000O0.OooO0Oo(this.f13795OooOO0.f36663OooO0OO == 0);
                OooO0OO oooO0OO = oooO0O0.f13882OoooO;
                if (!oooO0OO.f13892OooO0O0) {
                    o000oooo2.OooOOO0(oooO0OO.f13891OooO00o, 0, 10);
                    o000oooo2.OooO();
                    byte[] bArr4 = oooO0OO.f13891OooO00o;
                    if (bArr4[4] == -8 && bArr4[5] == 114 && bArr4[6] == 111 && (bArr4[7] & 254) == 186) {
                        i2 = 40 << ((bArr4[(bArr4[7] & UByte.MAX_VALUE) == 187 ? '\t' : '\b'] >> 4) & 7);
                    } else {
                        i2 = 0;
                    }
                    if (i2 != 0) {
                        oooO0OO.f13892OooO0O0 = true;
                    }
                }
            }
            while (true) {
                int i12 = this.f13829OoooO0;
                if (i12 >= i11) {
                    break;
                }
                int iOooOO0o = OooOO0o(o000oooo2, trackOutput, i11 - i12);
                this.f13829OoooO0 += iOooOO0o;
                this.f13831OoooO0O += iOooOO0o;
            }
        } else {
            byte[] bArr5 = this.f13791OooO0o.f36661OooO00o;
            bArr5[0] = 0;
            bArr5[1] = 0;
            bArr5[2] = 0;
            int i13 = oooO0O0.f13889OoooOo0;
            int i14 = 4 - i13;
            while (this.f13829OoooO0 < i11) {
                int i15 = this.f13828OoooO;
                if (i15 == 0) {
                    o000 o000Var3 = this.f13795OooOO0;
                    int iMin = Math.min(i13, o000Var3.f36663OooO0OO - o000Var3.f36662OooO0O0);
                    o000oooo2.readFully(bArr5, i14 + iMin, i13 - iMin);
                    if (iMin > 0) {
                        this.f13795OooOO0.OooO0OO(bArr5, i14, iMin);
                    }
                    this.f13829OoooO0 += i13;
                    this.f13791OooO0o.OooOoOO(0);
                    this.f13828OoooO = this.f13791OooO0o.OooOo00();
                    this.f13792OooO0o0.OooOoOO(0);
                    trackOutput.OooO0OO(this.f13792OooO0o0, 4);
                    this.f13831OoooO0O += 4;
                } else {
                    int iOooOO0o2 = OooOO0o(o000oooo2, trackOutput, i15);
                    this.f13829OoooO0 += iOooOO0o2;
                    this.f13831OoooO0O += iOooOO0o2;
                    this.f13828OoooO -= iOooOO0o2;
                }
            }
        }
        if ("A_VORBIS".equals(oooO0O0.f13842OooO0O0)) {
            this.f13794OooO0oo.OooOoOO(0);
            trackOutput.OooO0OO(this.f13794OooO0oo, 4);
            this.f13831OoooO0O += 4;
        }
        int i16 = this.f13831OoooO0O;
        OooO0oO();
        return i16;
    }

    public final void OooOO0O(o000oOoO o000oooo2, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        o000 o000Var = this.f13796OooOO0O;
        byte[] bArr2 = o000Var.f36661OooO00o;
        if (bArr2.length < length) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, length + i);
            Objects.requireNonNull(o000Var);
            o000Var.OooOoO0(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        o000oooo2.readFully(this.f13796OooOO0O.f36661OooO00o, bArr.length, i);
        this.f13796OooOO0O.OooOo(length);
    }

    public final int OooOO0o(o000oOoO o000oooo2, TrackOutput trackOutput, int i) throws IOException {
        o000 o000Var = this.f13795OooOO0;
        int i2 = o000Var.f36663OooO0OO - o000Var.f36662OooO0O0;
        if (i2 <= 0) {
            return trackOutput.OooO0O0(o000oooo2, i, false);
        }
        int iMin = Math.min(i, i2);
        trackOutput.OooO0OO(this.f13795OooOO0, iMin);
        return iMin;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }
}
