package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.OooO0OO;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8499OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final byte[] f8500OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f8501OooO0o0;

    public class OooO00o implements Parcelable.Creator<PrivateCommand> {
        @Override // android.os.Parcelable.Creator
        public final PrivateCommand createFromParcel(Parcel parcel) {
            return new PrivateCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivateCommand[] newArray(int i) {
            return new PrivateCommand[i];
        }
    }

    public PrivateCommand(long j, byte[] bArr, long j2) {
        this.f8499OooO0Oo = j2;
        this.f8501OooO0o0 = j;
        this.f8500OooO0o = bArr;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.f8499OooO0Oo);
        sb.append(", identifier= ");
        return OooO0OO.OooO0O0(sb, this.f8501OooO0o0, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f8499OooO0Oo);
        parcel.writeLong(this.f8501OooO0o0);
        parcel.writeByteArray(this.f8500OooO0o);
    }

    public PrivateCommand(Parcel parcel) {
        this.f8499OooO0Oo = parcel.readLong();
        this.f8501OooO0o0 = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = o00.f34910OooO00o;
        this.f8500OooO0o = bArrCreateByteArray;
    }
}
