package p209o00o0oo0;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.amr.AmrExtractor;
import com.google.android.exoplayer2.extractor.flac.FlacExtractor;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp3.Mp3Extractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import com.google.android.exoplayer2.extractor.mp4.Mp4Extractor;
import com.google.android.exoplayer2.extractor.ts.AdtsExtractor;
import com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory;
import com.google.android.exoplayer2.extractor.ts.OooO0OO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.ts.o00Oo0;
import com.google.android.exoplayer2.util.FileTypes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p175o00o.OooOo;
import p203o00o0o0o.o0O00OOO;
import p216o00oO0O0.o00000OO;
import p225o00oOo.o0OoOo0;
import p239o00oo000.OooOOOO;
import p245o00oo0o.o0O0000O;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo00o implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O00 f39571OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f39569OooO0o0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f39568OooO0o = new OooO00o(new com.app.base.protobuf.OooO00o());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f39570OooO0oO = new OooO00o(new o0O00OOO());

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC0444OooO00o f39572OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicBoolean f39573OooO0O0 = new AtomicBoolean(false);

        /* JADX INFO: renamed from: o00o0oo0.oo00o$OooO00o$OooO00o, reason: collision with other inner class name */
        public interface InterfaceC0444OooO00o {
            @Nullable
            Constructor<? extends Extractor> OooO00o() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public OooO00o(InterfaceC0444OooO00o interfaceC0444OooO00o) {
            this.f39572OooO00o = interfaceC0444OooO00o;
        }

        @Nullable
        public final Extractor OooO00o(Object... objArr) {
            Constructor<? extends Extractor> constructorOooO00o;
            synchronized (this.f39573OooO0O0) {
                if (!this.f39573OooO0O0.get()) {
                    try {
                        constructorOooO00o = this.f39572OooO00o.OooO00o();
                    } catch (ClassNotFoundException unused) {
                        this.f39573OooO0O0.set(true);
                        constructorOooO00o = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorOooO00o = null;
            }
            if (constructorOooO00o == null) {
                return null;
            }
            try {
                return constructorOooO00o.newInstance(objArr);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating extractor", e2);
            }
        }
    }

    @Override // p209o00o0oo0.o00O0OO0
    public final synchronized Extractor[] OooO00o(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f39569OooO0o0;
        arrayList = new ArrayList(16);
        int iOooO00o = FileTypes.OooO00o(map);
        if (iOooO00o != -1) {
            OooO0O0(iOooO00o, arrayList);
        }
        int iOooO0O0 = FileTypes.OooO0O0(uri);
        if (iOooO0O0 != -1 && iOooO0O0 != iOooO00o) {
            OooO0O0(iOooO0O0, arrayList);
        }
        for (int i = 0; i < 16; i++) {
            int i2 = iArr[i];
            if (i2 != iOooO00o && i2 != iOooO0O0) {
                OooO0O0(i2, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }

    public final void OooO0O0(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new com.google.android.exoplayer2.extractor.ts.OooO00o());
                break;
            case 1:
                arrayList.add(new OooO0OO());
                break;
            case 2:
                arrayList.add(new AdtsExtractor());
                break;
            case 3:
                arrayList.add(new AmrExtractor());
                break;
            case 4:
                Extractor extractorOooO00o = f39568OooO0o.OooO00o(0);
                if (extractorOooO00o == null) {
                    arrayList.add(new FlacExtractor());
                } else {
                    arrayList.add(extractorOooO00o);
                }
                break;
            case 5:
                arrayList.add(new OooOo());
                break;
            case 6:
                arrayList.add(new MatroskaExtractor(0));
                break;
            case 7:
                arrayList.add(new Mp3Extractor(0));
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor());
                arrayList.add(new Mp4Extractor(0));
                break;
            case 9:
                arrayList.add(new o0OoOo0());
                break;
            case 10:
                arrayList.add(new o00Oo0());
                break;
            case 11:
                if (this.f39571OooO0Oo == null) {
                    ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f19157OooO0o0;
                    this.f39571OooO0Oo = o0O00.f19536OooO0oo;
                }
                arrayList.add(new TsExtractor(new o0O0000O(0L), new DefaultTsPayloadReaderFactory(this.f39571OooO0Oo)));
                break;
            case 12:
                arrayList.add(new o00000OO());
                break;
            case 14:
                arrayList.add(new OooOOOO());
                break;
            case 15:
                Extractor extractorOooO00o2 = f39570OooO0oO.OooO00o(new Object[0]);
                if (extractorOooO00o2 != null) {
                    arrayList.add(extractorOooO00o2);
                }
                break;
            case 16:
                arrayList.add(new p208o00o0oo.oo00o());
                break;
        }
    }
}
