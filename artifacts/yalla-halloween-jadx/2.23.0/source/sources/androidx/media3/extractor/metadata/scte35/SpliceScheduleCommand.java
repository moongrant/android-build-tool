package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<OooO0OO> f6432OooO0Oo;

    public class OooO00o implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f6433OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f6434OooO0O0;

        public OooO0O0(int i, long j) {
            this.f6433OooO00o = i;
            this.f6434OooO0O0 = j;
        }
    }

    public static final class OooO0OO {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final int f6435OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f6436OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final boolean f6437OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final boolean f6438OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final boolean f6439OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final List<OooO0O0> f6440OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f6441OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final boolean f6442OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final long f6443OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final int f6444OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final int f6445OooOO0O;

        public OooO0OO(Parcel parcel) {
            this.f6436OooO00o = parcel.readLong();
            this.f6437OooO0O0 = parcel.readByte() == 1;
            this.f6438OooO0OO = parcel.readByte() == 1;
            this.f6439OooO0Oo = parcel.readByte() == 1;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new OooO0O0(parcel.readInt(), parcel.readLong()));
            }
            this.f6440OooO0o = Collections.unmodifiableList(arrayList);
            this.f6441OooO0o0 = parcel.readLong();
            this.f6442OooO0oO = parcel.readByte() == 1;
            this.f6443OooO0oo = parcel.readLong();
            this.f6435OooO = parcel.readInt();
            this.f6444OooOO0 = parcel.readInt();
            this.f6445OooOO0O = parcel.readInt();
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new OooO0OO(parcel));
        }
        this.f6432OooO0Oo = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<OooO0OO> list = this.f6432OooO0Oo;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            OooO0OO oooO0OO = list.get(i2);
            parcel.writeLong(oooO0OO.f6436OooO00o);
            parcel.writeByte(oooO0OO.f6437OooO0O0 ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f6438OooO0OO ? (byte) 1 : (byte) 0);
            parcel.writeByte(oooO0OO.f6439OooO0Oo ? (byte) 1 : (byte) 0);
            List<OooO0O0> list2 = oooO0OO.f6440OooO0o;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                OooO0O0 oooO0O0 = list2.get(i3);
                parcel.writeInt(oooO0O0.f6433OooO00o);
                parcel.writeLong(oooO0O0.f6434OooO0O0);
            }
            parcel.writeLong(oooO0OO.f6441OooO0o0);
            parcel.writeByte(oooO0OO.f6442OooO0oO ? (byte) 1 : (byte) 0);
            parcel.writeLong(oooO0OO.f6443OooO0oo);
            parcel.writeInt(oooO0OO.f6435OooO);
            parcel.writeInt(oooO0OO.f6444OooOO0);
            parcel.writeInt(oooO0OO.f6445OooOO0O);
        }
    }
}
