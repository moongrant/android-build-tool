package p296o0O0OoO0;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import com.uc.crashsdk.export.LogType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.ByteCompanionObject;
import p318o0O0oOo.o0000OO0;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oO0o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f35912OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f35913OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f35914OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f35915OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f35916OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f35917OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f35918OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f35919OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f35920OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f35921OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final OooO00o f35922OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final Metadata f35923OooOO0o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long[] f35924OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long[] f35925OooO0O0;

        public OooO00o(long[] jArr, long[] jArr2) {
            this.f35924OooO00o = jArr;
            this.f35925OooO0O0 = jArr2;
        }
    }

    public o00oO0o(byte[] bArr, int i) {
        o0000OO0 o0000oo1 = new o0000OO0(bArr, bArr.length);
        o0000oo1.OooOO0O(i * 8);
        this.f35913OooO00o = o0000oo1.OooO0oO(16);
        this.f35914OooO0O0 = o0000oo1.OooO0oO(16);
        this.f35915OooO0OO = o0000oo1.OooO0oO(24);
        this.f35916OooO0Oo = o0000oo1.OooO0oO(24);
        int iOooO0oO = o0000oo1.OooO0oO(20);
        this.f35918OooO0o0 = iOooO0oO;
        this.f35917OooO0o = OooO0oo(iOooO0oO);
        this.f35919OooO0oO = o0000oo1.OooO0oO(3) + 1;
        int iOooO0oO2 = o0000oo1.OooO0oO(5) + 1;
        this.f35920OooO0oo = iOooO0oO2;
        this.f35912OooO = OooO0OO(iOooO0oO2);
        this.f35921OooOO0 = (o000OOo0.Oooo0O0(o0000oo1.OooO0oO(4)) << 32) | o000OOo0.Oooo0O0(o0000oo1.OooO0oO(32));
        this.f35922OooOO0O = null;
        this.f35923OooOO0o = null;
    }

    @Nullable
    public static Metadata OooO00o(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = o000OOo0.f36740OooO00o;
            String[] strArrSplit = str.split("=", 2);
            if (strArrSplit.length != 2) {
                Log.w("FlacStreamMetadata", str.length() != 0 ? "Failed to parse Vorbis comment: ".concat(str) : new String("Failed to parse Vorbis comment: "));
            } else {
                arrayList.add(new VorbisComment(strArrSplit[0], strArrSplit[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static int OooO0OO(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    public static int OooO0oo(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case LogType.UNEXP_KNOWN_REASON /* 32000 */:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final o00oO0o OooO0O0(@Nullable OooO00o oooO00o) {
        return new o00oO0o(this.f35913OooO00o, this.f35914OooO0O0, this.f35915OooO0OO, this.f35916OooO0Oo, this.f35918OooO0o0, this.f35919OooO0oO, this.f35920OooO0oo, this.f35921OooOO0, oooO00o, this.f35923OooOO0o);
    }

    public final long OooO0Oo() {
        long j = this.f35921OooOO0;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / ((long) this.f35918OooO0o0);
    }

    @Nullable
    public final Metadata OooO0o(@Nullable Metadata metadata) {
        Metadata metadata2 = this.f35923OooOO0o;
        if (metadata2 == null) {
            return metadata;
        }
        Objects.requireNonNull(metadata2);
        return metadata == null ? metadata2 : metadata2.OooO00o(metadata.f14442Oooo0o);
    }

    public final Format OooO0o0(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = ByteCompanionObject.MIN_VALUE;
        int i = this.f35916OooO0Oo;
        if (i <= 0) {
            i = -1;
        }
        Metadata metadataOooO0o = OooO0o(metadata);
        Format.OooO0O0 oooO0O0 = new Format.OooO0O0();
        oooO0O0.f13163OooOO0O = "audio/flac";
        oooO0O0.f13164OooOO0o = i;
        oooO0O0.f13172OooOo = this.f35919OooO0oO;
        oooO0O0.f13178OooOoO0 = this.f35918OooO0o0;
        oooO0O0.f13166OooOOO0 = Collections.singletonList(bArr);
        oooO0O0.f13153OooO = metadataOooO0o;
        return oooO0O0.OooO00o();
    }

    public final long OooO0oO(long j) {
        return o000OOo0.OooO((j * ((long) this.f35918OooO0o0)) / 1000000, 0L, this.f35921OooOO0 - 1);
    }

    public o00oO0o(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable OooO00o oooO00o, @Nullable Metadata metadata) {
        this.f35913OooO00o = i;
        this.f35914OooO0O0 = i2;
        this.f35915OooO0OO = i3;
        this.f35916OooO0Oo = i4;
        this.f35918OooO0o0 = i5;
        this.f35917OooO0o = OooO0oo(i5);
        this.f35919OooO0oO = i6;
        this.f35920OooO0oo = i7;
        this.f35912OooO = OooO0OO(i7);
        this.f35921OooOO0 = j;
        this.f35922OooOO0O = oooO00o;
        this.f35923OooOO0o = metadata;
    }
}
