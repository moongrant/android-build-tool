package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p318o0O0oOo.o000OOo0;

/* JADX INFO: loaded from: classes2.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final List<StreamKey> f14581Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final String f14582Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Uri f14583Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final String f14584Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    @Nullable
    public final String f14585OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public final byte[] f14586OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final byte[] f14587OoooO0O;

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
        int i = o000OOo0.f36740OooO00o;
        this.f14582Oooo0o = string;
        this.f14583Oooo0oO = Uri.parse(parcel.readString());
        this.f14584Oooo0oo = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f14581Oooo = Collections.unmodifiableList(arrayList);
        this.f14586OoooO00 = parcel.createByteArray();
        this.f14585OoooO0 = parcel.readString();
        this.f14587OoooO0O = parcel.createByteArray();
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
        return this.f14582Oooo0o.equals(downloadRequest.f14582Oooo0o) && this.f14583Oooo0oO.equals(downloadRequest.f14583Oooo0oO) && o000OOo0.OooO00o(this.f14584Oooo0oo, downloadRequest.f14584Oooo0oo) && this.f14581Oooo.equals(downloadRequest.f14581Oooo) && Arrays.equals(this.f14586OoooO00, downloadRequest.f14586OoooO00) && o000OOo0.OooO00o(this.f14585OoooO0, downloadRequest.f14585OoooO0) && Arrays.equals(this.f14587OoooO0O, downloadRequest.f14587OoooO0O);
    }

    public final int hashCode() {
        int iHashCode = (this.f14583Oooo0oO.hashCode() + (this.f14582Oooo0o.hashCode() * 31 * 31)) * 31;
        String str = this.f14584Oooo0oo;
        int iHashCode2 = (Arrays.hashCode(this.f14586OoooO00) + ((this.f14581Oooo.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f14585OoooO0;
        return Arrays.hashCode(this.f14587OoooO0O) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String str = this.f14584Oooo0oo;
        String str2 = this.f14582Oooo0o;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 1)));
        sb.append(str);
        sb.append(CertificateUtil.DELIMITER);
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14582Oooo0o);
        parcel.writeString(this.f14583Oooo0oO.toString());
        parcel.writeString(this.f14584Oooo0oo);
        parcel.writeInt(this.f14581Oooo.size());
        for (int i2 = 0; i2 < this.f14581Oooo.size(); i2++) {
            parcel.writeParcelable(this.f14581Oooo.get(i2), 0);
        }
        parcel.writeByteArray(this.f14586OoooO00);
        parcel.writeString(this.f14585OoooO0);
        parcel.writeByteArray(this.f14587OoooO0O);
    }
}
