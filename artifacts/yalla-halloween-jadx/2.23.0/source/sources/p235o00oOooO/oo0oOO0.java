package p235o00oOooO;

import com.google.android.exoplayer2.OooOo;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor;
import java.util.ArrayList;
import p245o00oo0o.o00OO0OO;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo0oOO0 {
    public final o00O OooO00o(int i, OooOo oooOo, boolean z, ArrayList arrayList, TrackOutput trackOutput) {
        Extractor fragmentedMp4Extractor;
        String str = oooOo.f11209OooOOO;
        if (o00OO0OO.OooOO0O(str)) {
            return null;
        }
        if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
            fragmentedMp4Extractor = new MatroskaExtractor(1);
        } else {
            fragmentedMp4Extractor = new FragmentedMp4Extractor(z ? 4 : 0, arrayList, trackOutput);
        }
        return new o00O(fragmentedMp4Extractor, i, oooOo);
    }
}
