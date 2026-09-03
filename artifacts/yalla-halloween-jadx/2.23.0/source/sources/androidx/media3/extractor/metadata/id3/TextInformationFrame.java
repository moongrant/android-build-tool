package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import o000O000.OooO0o;
import p069o0000ooO.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImmutableList<String> f6398OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f6399OooO0o0;

    public class OooO00o implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextInformationFrame(Parcel parcel) {
        String string = parcel.readString();
        string.getClass();
        String string2 = parcel.readString();
        String[] strArrCreateStringArray = parcel.createStringArray();
        strArrCreateStringArray.getClass();
        o0O00 o0o00OooOO0o = ImmutableList.OooOO0o(strArrCreateStringArray);
        super(string);
        o000O000.OooO00o.OooO00o(!o0o00OooOO0o.isEmpty());
        this.f6399OooO0o0 = string2;
        ImmutableList<String> immutableListOooOO0O = ImmutableList.OooOO0O(o0o00OooOO0o);
        this.f6398OooO0o = immutableListOooOO0O;
        immutableListOooOO0O.get(0);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return OooO0o.OooO00o(this.f6387OooO0Oo, textInformationFrame.f6387OooO0Oo) && OooO0o.OooO00o(this.f6399OooO0o0, textInformationFrame.f6399OooO0o0) && this.f6398OooO0o.equals(textInformationFrame.f6398OooO0o);
    }

    public final int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.f6387OooO0Oo, 527, 31);
        String str = this.f6399OooO0o0;
        return this.f6398OooO0o.hashCode() + ((iOooO00o + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        return this.f6387OooO0Oo + ": description=" + this.f6399OooO0o0 + ": values=" + this.f6398OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6387OooO0Oo);
        parcel.writeString(this.f6399OooO0o0);
        parcel.writeStringArray((String[]) this.f6398OooO0o.toArray(new String[0]));
    }
}
