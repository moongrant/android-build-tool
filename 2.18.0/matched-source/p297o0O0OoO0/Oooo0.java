package p297o0O0OoO0;

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
import com.google.android.exoplayer2.extractor.ts.OooO00o;
import com.google.android.exoplayer2.extractor.ts.OooO0OO;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.extractor.ts.o00Oo0;
import com.google.android.exoplayer2.util.FileTypes;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p298o0O0OoOo.o0000O;

/* JADX INFO: loaded from: classes2.dex */
public final class Oooo0 implements o00O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static final int[] f35910Oooo = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7};

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public static final Constructor<? extends Extractor> f35911OoooO00;

    static {
        Constructor<? extends Extractor> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke(null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(Extractor.class).getConstructor(Integer.TYPE);
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f35911OoooO00 = constructor;
    }

    public final void OooO00o(int i, List<Extractor> list) {
        switch (i) {
            case 0:
                list.add(new OooO00o());
                return;
            case 1:
                list.add(new OooO0OO());
                return;
            case 2:
                list.add(new AdtsExtractor());
                return;
            case 3:
                list.add(new AmrExtractor(0));
                return;
            case 4:
                Constructor<? extends Extractor> constructor = f35911OoooO00;
                if (constructor == null) {
                    list.add(new FlacExtractor());
                    return;
                }
                try {
                    list.add(constructor.newInstance(0));
                    return;
                } catch (Exception e) {
                    throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                }
            case 5:
                list.add(new o0000O());
                return;
            case 6:
                list.add(new MatroskaExtractor());
                return;
            case 7:
                list.add(new Mp3Extractor(0));
                return;
            case 8:
                list.add(new FragmentedMp4Extractor());
                list.add(new Mp4Extractor());
                return;
            case 9:
                list.add(new o0O0o000.OooO0OO());
                return;
            case 10:
                list.add(new o00Oo0());
                return;
            case 11:
                list.add(new TsExtractor());
                return;
            case 12:
                list.add(new o0O0o00O.OooO00o());
                return;
            default:
                return;
        }
    }

    @Override // p297o0O0OoO0.o00O0O
    public final synchronized Extractor[] OooO0O0(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int iOooO00o = FileTypes.OooO00o(map);
        if (iOooO00o != -1) {
            OooO00o(iOooO00o, arrayList);
        }
        int iOooO0O0 = FileTypes.OooO0O0(uri);
        if (iOooO0O0 != -1 && iOooO0O0 != iOooO00o) {
            OooO00o(iOooO0O0, arrayList);
        }
        int[] iArr = f35910Oooo;
        for (int i = 0; i < 13; i++) {
            int i2 = iArr[i];
            if (i2 != iOooO00o && i2 != iOooO0O0) {
                OooO00o(i2, arrayList);
            }
        }
        return (Extractor[]) arrayList.toArray(new Extractor[arrayList.size()]);
    }
}
