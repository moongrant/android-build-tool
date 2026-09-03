package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final long f6416OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f6417OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f6418OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final boolean f6419OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final boolean f6420OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final boolean f6421OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final long f6422OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final List<OooO0O0> f6423OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final boolean f6424OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final int f6425OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f6426OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f6427OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f6428OooOOOo;

    public class OooO00o implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f6429OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f6430OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f6431OooO0OO;

        public OooO0O0(int i, long j, long j2) {
            this.f6429OooO00o = i;
            this.f6430OooO0O0 = j;
            this.f6431OooO0OO = j2;
        }
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f6417OooO0Oo = parcel.readLong();
        this.f6419OooO0o0 = parcel.readByte() == 1;
        this.f6418OooO0o = parcel.readByte() == 1;
        this.f6420OooO0oO = parcel.readByte() == 1;
        this.f6421OooO0oo = parcel.readByte() == 1;
        this.f6416OooO = parcel.readLong();
        this.f6422OooOO0 = parcel.readLong();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.f6423OooOO0O = Collections.unmodifiableList(arrayList);
        this.f6424OooOO0o = parcel.readByte() == 1;
        this.f6426OooOOO0 = parcel.readLong();
        this.f6425OooOOO = parcel.readInt();
        this.f6427OooOOOO = parcel.readInt();
        this.f6428OooOOOo = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f6417OooO0Oo);
        parcel.writeByte(this.f6419OooO0o0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6418OooO0o ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6420OooO0oO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f6421OooO0oo ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6416OooO);
        parcel.writeLong(this.f6422OooOO0);
        List<OooO0O0> list = this.f6423OooOO0O;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0O0 oooO0O0 = list.get(i2);
            parcel.writeInt(oooO0O0.f6429OooO00o);
            parcel.writeLong(oooO0O0.f6430OooO0O0);
            parcel.writeLong(oooO0O0.f6431OooO0OO);
        }
        parcel.writeByte(this.f6424OooOO0o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f6426OooOOO0);
        parcel.writeInt(this.f6425OooOOO);
        parcel.writeInt(this.f6427OooOOOO);
        parcel.writeInt(this.f6428OooOOOo);
    }
}
