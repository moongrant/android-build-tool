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
import p080o000OoO.o00;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f7773OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f7774OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f7775OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Uri f7776OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<StreamKey> f7777OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final byte[] f7778OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final byte[] f7779OooOO0;

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

    public DownloadRequest(String str, Uri uri, @Nullable String str2, List<StreamKey> list, @Nullable byte[] bArr, @Nullable String str3, @Nullable byte[] bArr2) {
        int iOooo000 = o00.Oooo000(uri, str2);
        if (iOooo000 == 0 || iOooo000 == 2 || iOooo000 == 1) {
            o00Oo0.OooO0O0(str3 == null, "customCacheKey must be null for type: " + iOooo000);
        }
        this.f7774OooO0Oo = str;
        this.f7776OooO0o0 = uri;
        this.f7775OooO0o = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f7777OooO0oO = Collections.unmodifiableList(arrayList);
        this.f7778OooO0oo = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f7773OooO = str3;
        this.f7779OooOO0 = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : o00.f34914OooO0o;
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
        return this.f7774OooO0Oo.equals(downloadRequest.f7774OooO0Oo) && this.f7776OooO0o0.equals(downloadRequest.f7776OooO0o0) && o00.OooO00o(this.f7775OooO0o, downloadRequest.f7775OooO0o) && this.f7777OooO0oO.equals(downloadRequest.f7777OooO0oO) && Arrays.equals(this.f7778OooO0oo, downloadRequest.f7778OooO0oo) && o00.OooO00o(this.f7773OooO, downloadRequest.f7773OooO) && Arrays.equals(this.f7779OooOO0, downloadRequest.f7779OooOO0);
    }

    public final int hashCode() {
        int iHashCode = (this.f7776OooO0o0.hashCode() + (this.f7774OooO0Oo.hashCode() * 31 * 31)) * 31;
        String str = this.f7775OooO0o;
        int iHashCode2 = (Arrays.hashCode(this.f7778OooO0oo) + ((this.f7777OooO0oO.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f7773OooO;
        return Arrays.hashCode(this.f7779OooOO0) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f7775OooO0o + CertificateUtil.DELIMITER + this.f7774OooO0Oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7774OooO0Oo);
        parcel.writeString(this.f7776OooO0o0.toString());
        parcel.writeString(this.f7775OooO0o);
        List<StreamKey> list = this.f7777OooO0oO;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.f7778OooO0oo);
        parcel.writeString(this.f7773OooO);
        parcel.writeByteArray(this.f7779OooOO0);
    }

    public DownloadRequest(Parcel parcel) {
        String string = parcel.readString();
        int i = o00.f34910OooO00o;
        this.f7774OooO0Oo = string;
        this.f7776OooO0o0 = Uri.parse(parcel.readString());
        this.f7775OooO0o = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f7777OooO0oO = Collections.unmodifiableList(arrayList);
        this.f7778OooO0oo = parcel.createByteArray();
        this.f7773OooO = parcel.readString();
        this.f7779OooOO0 = parcel.createByteArray();
    }
}
