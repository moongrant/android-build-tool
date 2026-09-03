package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import androidx.media3.common.util.UnstableApi;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import o000O000.OooO0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f6275OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f6276OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f6277OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Uri f6278OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<StreamKey> f6279OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final byte[] f6280OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final byte[] f6281OooOO0;

    public class OooO00o implements Parcelable.Creator<DownloadRequest> {
        @Override // android.os.Parcelable.Creator
        public final DownloadRequest createFromParcel(Parcel parcel) {
            return new DownloadRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DownloadRequest[] newArray(int i) {
            return new DownloadRequest[i];
        }
    }

    public static class UnsupportedRequestException extends IOException {
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i = OooO0o.f34423OooO00o;
        this.f6276OooO0Oo = string;
        this.f6278OooO0o0 = Uri.parse(parcel.readString());
        this.f6277OooO0o = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f6279OooO0oO = Collections.unmodifiableList(arrayList);
        this.f6280OooO0oo = parcel.createByteArray();
        this.f6275OooO = parcel.readString();
        this.f6281OooOO0 = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        return this.f6276OooO0Oo.equals(downloadRequest.f6276OooO0Oo) && this.f6278OooO0o0.equals(downloadRequest.f6278OooO0o0) && OooO0o.OooO00o(this.f6277OooO0o, downloadRequest.f6277OooO0o) && this.f6279OooO0oO.equals(downloadRequest.f6279OooO0oO) && Arrays.equals(this.f6280OooO0oo, downloadRequest.f6280OooO0oo) && OooO0o.OooO00o(this.f6275OooO, downloadRequest.f6275OooO) && Arrays.equals(this.f6281OooOO0, downloadRequest.f6281OooOO0);
    }

    public final int hashCode() {
        int iHashCode = (this.f6278OooO0o0.hashCode() + (this.f6276OooO0Oo.hashCode() * 31 * 31)) * 31;
        String str = this.f6277OooO0o;
        int iHashCode2 = (Arrays.hashCode(this.f6280OooO0oo) + ((this.f6279OooO0oO.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f6275OooO;
        return Arrays.hashCode(this.f6281OooOO0) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f6277OooO0o + CertificateUtil.DELIMITER + this.f6276OooO0Oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6276OooO0Oo);
        parcel.writeString(this.f6278OooO0o0.toString());
        parcel.writeString(this.f6277OooO0o);
        List<StreamKey> list = this.f6279OooO0oO;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.f6280OooO0oo);
        parcel.writeString(this.f6275OooO);
        parcel.writeByteArray(this.f6281OooOO0);
    }
}
