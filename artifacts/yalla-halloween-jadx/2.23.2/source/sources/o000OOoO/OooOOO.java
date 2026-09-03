package o000OOoO;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.FileTypes;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.amr.AmrExtractor;
import androidx.media3.extractor.flac.FlacExtractor;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.mp3.Mp3Extractor;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Mp4Extractor;
import androidx.media3.extractor.ts.AdtsExtractor;
import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import androidx.media3.extractor.ts.TsExtractor;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p080o000OoO.o000O0Oo;
import p679oooo00o.oOo000o0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOOO implements o0OoOo0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public o0O00 f34685OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int[] f34683OooO0o0 = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO00o f34682OooO0o = new OooO00o(new o000O00O.o00000());

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO00o f34684OooO0oO = new OooO00o(new OooOOO0());

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final InterfaceC0402OooO00o f34686OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final AtomicBoolean f34687OooO0O0 = new AtomicBoolean(false);

        /* JADX INFO: renamed from: o000OOoO.OooOOO$OooO00o$OooO00o, reason: collision with other inner class name */
        public interface InterfaceC0402OooO00o {
            @Nullable
            Constructor<? extends Extractor> OooO00o() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException;
        }

        public OooO00o(InterfaceC0402OooO00o interfaceC0402OooO00o) {
            this.f34686OooO00o = interfaceC0402OooO00o;
        }

        @Nullable
        public final Extractor OooO00o(Object... objArr) {
            Constructor<? extends Extractor> constructorOooO00o;
            synchronized (this.f34687OooO0O0) {
                if (!this.f34687OooO0O0.get()) {
                    try {
                        constructorOooO00o = this.f34686OooO00o.OooO00o();
                    } catch (ClassNotFoundException unused) {
                        this.f34687OooO0O0.set(true);
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

    @Override // o000OOoO.o0OoOo0
    public final synchronized Extractor[] OooO00o(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr = f34683OooO0o0;
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
                arrayList.add(new androidx.media3.extractor.ts.OooO00o());
                break;
            case 1:
                arrayList.add(new androidx.media3.extractor.ts.OooO0OO());
                break;
            case 2:
                arrayList.add(new AdtsExtractor());
                break;
            case 3:
                arrayList.add(new AmrExtractor());
                break;
            case 4:
                Extractor extractorOooO00o = f34682OooO0o.OooO00o(0);
                if (extractorOooO00o == null) {
                    arrayList.add(new FlacExtractor());
                } else {
                    arrayList.add(extractorOooO00o);
                }
                break;
            case 5:
                arrayList.add(new p079o000Oo0o.o000000());
                break;
            case 6:
                arrayList.add(new MatroskaExtractor());
                break;
            case 7:
                arrayList.add(new Mp3Extractor(0));
                break;
            case 8:
                arrayList.add(new FragmentedMp4Extractor());
                arrayList.add(new Mp4Extractor(0));
                break;
            case 9:
                arrayList.add(new oOo000o0());
                break;
            case 10:
                arrayList.add(new androidx.media3.extractor.ts.o00Oo0());
                break;
            case 11:
                if (this.f34685OooO0Oo == null) {
                    ImmutableList.OooO0O0 oooO0O0 = ImmutableList.f18681OooO0o0;
                    this.f34685OooO0Oo = o0O00.f19060OooO0oo;
                }
                arrayList.add(new TsExtractor(new o000O0Oo(0L), new DefaultTsPayloadReaderFactory(this.f34685OooO0Oo)));
                break;
            case 12:
                arrayList.add(new p102o000oo0.oo000o());
                break;
            case 14:
                arrayList.add(new p076o000Oo.OooOOOO());
                break;
            case 15:
                Extractor extractorOooO00o2 = f34684OooO0oO.OooO00o(new Object[0]);
                if (extractorOooO00o2 != null) {
                    arrayList.add(extractorOooO00o2);
                }
                break;
            case 16:
                arrayList.add(new p077o000Oo00.OooOO0());
                break;
        }
    }
}
