package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final String f12869OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f12870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final String f12871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Uri f12872OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final List<StreamKey> f12873OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final byte[] f12874OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final byte[] f12875OooOO0;

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
        int i = o0O00.f40595OooO00o;
        this.f12870OooO0Oo = string;
        this.f12872OooO0o0 = Uri.parse(parcel.readString());
        this.f12871OooO0o = parcel.readString();
        int i2 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.f12873OooO0oO = Collections.unmodifiableList(arrayList);
        this.f12874OooO0oo = parcel.createByteArray();
        this.f12869OooO = parcel.readString();
        this.f12875OooOO0 = parcel.createByteArray();
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
        return this.f12870OooO0Oo.equals(downloadRequest.f12870OooO0Oo) && this.f12872OooO0o0.equals(downloadRequest.f12872OooO0o0) && o0O00.OooO00o(this.f12871OooO0o, downloadRequest.f12871OooO0o) && this.f12873OooO0oO.equals(downloadRequest.f12873OooO0oO) && Arrays.equals(this.f12874OooO0oo, downloadRequest.f12874OooO0oo) && o0O00.OooO00o(this.f12869OooO, downloadRequest.f12869OooO) && Arrays.equals(this.f12875OooOO0, downloadRequest.f12875OooOO0);
    }

    public final int hashCode() {
        int iHashCode = (this.f12872OooO0o0.hashCode() + (this.f12870OooO0Oo.hashCode() * 31 * 31)) * 31;
        String str = this.f12871OooO0o;
        int iHashCode2 = (Arrays.hashCode(this.f12874OooO0oo) + ((this.f12873OooO0oO.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f12869OooO;
        return Arrays.hashCode(this.f12875OooOO0) + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f12871OooO0o + CertificateUtil.DELIMITER + this.f12870OooO0Oo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12870OooO0Oo);
        parcel.writeString(this.f12872OooO0o0.toString());
        parcel.writeString(this.f12871OooO0o);
        List<StreamKey> list = this.f12873OooO0oO;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable(list.get(i2), 0);
        }
        parcel.writeByteArray(this.f12874OooO0oo);
        parcel.writeString(this.f12869OooO);
        parcel.writeByteArray(this.f12875OooOO0);
    }
}
