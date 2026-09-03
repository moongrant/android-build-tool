package com.google.android.exoplayer2;

import Oooo000.o000O00O;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import p301o0O0Oooo.o000OOo0;
import p301o0O0Oooo.o00oOoo;

/* JADX INFO: loaded from: classes2.dex */
public final class Format implements Parcelable {
    public static final Parcelable.Creator<Format> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final int f13121Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @Nullable
    public final String f13122Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f13123Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public final String f13124Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public final int f13125OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f13126OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f13127OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final int f13128OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final String f13129OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    @Nullable
    public final String f13130OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    @Nullable
    public final String f13131OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public final int f13132OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public final List<byte[]> f13133OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public final DrmInitData f13134OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final long f13135Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final int f13136Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public final int f13137OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public final float f13138OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final int f13139OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public final byte[] f13140Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final float f13141Oooooo0;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public final int f13142OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @Nullable
    public final ColorInfo f13143Ooooooo;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    @Nullable
    public final Metadata f13144o000oOoO;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public final int f13145o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public final int f13146o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    public final int f13147o00Ooo;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    public final int f13148o00o0O;

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @Nullable
    public final Class<? extends o000OOo0> f13149o00ooo;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    public final int f13150o0OoOo0;

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    public int f13151oo000o;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public final int f13152ooOO;

    public class OooO00o implements Parcelable.Creator<Format> {
        @Override // android.os.Parcelable.Creator
        public final Format createFromParcel(Parcel parcel) {
            return new Format(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Format[] newArray(int i) {
            return new Format[i];
        }
    }

    public Format(OooO0O0 oooO0O0) {
        this.f13122Oooo0o = oooO0O0.f13154OooO00o;
        this.f13123Oooo0oO = oooO0O0.f13155OooO0O0;
        this.f13124Oooo0oo = p318o0O0oOo.o000OOo0.OooOoo0(oooO0O0.f13156OooO0OO);
        this.f13121Oooo = oooO0O0.f13157OooO0Oo;
        this.f13127OoooO00 = oooO0O0.f13159OooO0o0;
        int i = oooO0O0.f13158OooO0o;
        this.f13126OoooO0 = i;
        int i2 = oooO0O0.f13160OooO0oO;
        this.f13128OoooO0O = i2;
        this.f13125OoooO = i2 != -1 ? i2 : i;
        this.f13129OoooOO0 = oooO0O0.f13161OooO0oo;
        this.f13144o000oOoO = oooO0O0.f13153OooO;
        this.f13130OoooOOO = oooO0O0.f13162OooOO0;
        this.f13131OoooOOo = oooO0O0.f13163OooOO0O;
        this.f13132OoooOo0 = oooO0O0.f13164OooOO0o;
        List<byte[]> list = oooO0O0.f13166OooOOO0;
        this.f13133OoooOoO = list == null ? Collections.emptyList() : list;
        DrmInitData drmInitData = oooO0O0.f13165OooOOO;
        this.f13134OoooOoo = drmInitData;
        this.f13135Ooooo00 = oooO0O0.f13167OooOOOO;
        this.f13136Ooooo0o = oooO0O0.f13168OooOOOo;
        this.f13137OooooO0 = oooO0O0.f13170OooOOo0;
        this.f13138OooooOO = oooO0O0.f13169OooOOo;
        int i3 = oooO0O0.f13171OooOOoo;
        this.f13139OooooOo = i3 == -1 ? 0 : i3;
        float f = oooO0O0.f13174OooOo00;
        this.f13141Oooooo0 = f == -1.0f ? 1.0f : f;
        this.f13140Oooooo = oooO0O0.f13173OooOo0;
        this.f13142OoooooO = oooO0O0.f13175OooOo0O;
        this.f13143Ooooooo = oooO0O0.f13176OooOo0o;
        this.f13150o0OoOo0 = oooO0O0.f13172OooOo;
        this.f13152ooOO = oooO0O0.f13178OooOoO0;
        this.f13145o00O0O = oooO0O0.f13177OooOoO;
        int i4 = oooO0O0.f13179OooOoOO;
        this.f13146o00Oo0 = i4 == -1 ? 0 : i4;
        int i5 = oooO0O0.f13181OooOoo0;
        this.f13147o00Ooo = i5 != -1 ? i5 : 0;
        this.f13148o00o0O = oooO0O0.f13180OooOoo;
        Class<? extends o000OOo0> cls = oooO0O0.f13182OooOooO;
        if (cls != null || drmInitData == null) {
            this.f13149o00ooo = cls;
        } else {
            this.f13149o00ooo = o00oOoo.class;
        }
    }

    public final OooO0O0 OooO00o() {
        return new OooO0O0(this);
    }

    public final boolean OooO0O0(Format format) {
        if (this.f13133OoooOoO.size() != format.f13133OoooOoO.size()) {
            return false;
        }
        for (int i = 0; i < this.f13133OoooOoO.size(); i++) {
            if (!Arrays.equals(this.f13133OoooOoO.get(i), format.f13133OoooOoO.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || Format.class != obj.getClass()) {
            return false;
        }
        Format format = (Format) obj;
        int i2 = this.f13151oo000o;
        return (i2 == 0 || (i = format.f13151oo000o) == 0 || i2 == i) && this.f13121Oooo == format.f13121Oooo && this.f13127OoooO00 == format.f13127OoooO00 && this.f13126OoooO0 == format.f13126OoooO0 && this.f13128OoooO0O == format.f13128OoooO0O && this.f13132OoooOo0 == format.f13132OoooOo0 && this.f13135Ooooo00 == format.f13135Ooooo00 && this.f13136Ooooo0o == format.f13136Ooooo0o && this.f13137OooooO0 == format.f13137OooooO0 && this.f13139OooooOo == format.f13139OooooOo && this.f13142OoooooO == format.f13142OoooooO && this.f13150o0OoOo0 == format.f13150o0OoOo0 && this.f13152ooOO == format.f13152ooOO && this.f13145o00O0O == format.f13145o00O0O && this.f13146o00Oo0 == format.f13146o00Oo0 && this.f13147o00Ooo == format.f13147o00Ooo && this.f13148o00o0O == format.f13148o00o0O && Float.compare(this.f13138OooooOO, format.f13138OooooOO) == 0 && Float.compare(this.f13141Oooooo0, format.f13141Oooooo0) == 0 && p318o0O0oOo.o000OOo0.OooO00o(this.f13149o00ooo, format.f13149o00ooo) && p318o0O0oOo.o000OOo0.OooO00o(this.f13122Oooo0o, format.f13122Oooo0o) && p318o0O0oOo.o000OOo0.OooO00o(this.f13123Oooo0oO, format.f13123Oooo0oO) && p318o0O0oOo.o000OOo0.OooO00o(this.f13129OoooOO0, format.f13129OoooOO0) && p318o0O0oOo.o000OOo0.OooO00o(this.f13130OoooOOO, format.f13130OoooOOO) && p318o0O0oOo.o000OOo0.OooO00o(this.f13131OoooOOo, format.f13131OoooOOo) && p318o0O0oOo.o000OOo0.OooO00o(this.f13124Oooo0oo, format.f13124Oooo0oo) && Arrays.equals(this.f13140Oooooo, format.f13140Oooooo) && p318o0O0oOo.o000OOo0.OooO00o(this.f13144o000oOoO, format.f13144o000oOoO) && p318o0O0oOo.o000OOo0.OooO00o(this.f13143Ooooooo, format.f13143Ooooooo) && p318o0O0oOo.o000OOo0.OooO00o(this.f13134OoooOoo, format.f13134OoooOoo) && OooO0O0(format);
    }

    public final int hashCode() {
        if (this.f13151oo000o == 0) {
            String str = this.f13122Oooo0o;
            int iHashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
            String str2 = this.f13123Oooo0oO;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f13124Oooo0oo;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f13121Oooo) * 31) + this.f13127OoooO00) * 31) + this.f13126OoooO0) * 31) + this.f13128OoooO0O) * 31;
            String str4 = this.f13129OoooOO0;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Metadata metadata = this.f13144o000oOoO;
            int iHashCode5 = (iHashCode4 + (metadata == null ? 0 : metadata.hashCode())) * 31;
            String str5 = this.f13130OoooOOO;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f13131OoooOOo;
            int iOooO00o = (((((((((((((o000O00O.OooO00o(this.f13141Oooooo0, (o000O00O.OooO00o(this.f13138OooooOO, (((((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f13132OoooOo0) * 31) + ((int) this.f13135Ooooo00)) * 31) + this.f13136Ooooo0o) * 31) + this.f13137OooooO0) * 31, 31) + this.f13139OooooOo) * 31, 31) + this.f13142OoooooO) * 31) + this.f13150o0OoOo0) * 31) + this.f13152ooOO) * 31) + this.f13145o00O0O) * 31) + this.f13146o00Oo0) * 31) + this.f13147o00Ooo) * 31) + this.f13148o00o0O) * 31;
            Class<? extends o000OOo0> cls = this.f13149o00ooo;
            this.f13151oo000o = iOooO00o + (cls != null ? cls.hashCode() : 0);
        }
        return this.f13151oo000o;
    }

    public final String toString() {
        String str = this.f13122Oooo0o;
        String str2 = this.f13123Oooo0oO;
        String str3 = this.f13130OoooOOO;
        String str4 = this.f13131OoooOOo;
        String str5 = this.f13129OoooOO0;
        int i = this.f13125OoooO;
        String str6 = this.f13124Oooo0oo;
        int i2 = this.f13136Ooooo0o;
        int i3 = this.f13137OooooO0;
        float f = this.f13138OooooOO;
        int i4 = this.f13150o0OoOo0;
        int i5 = this.f13152ooOO;
        StringBuilder sb = new StringBuilder(o0OO00O.OooO00o(str6, o0OO00O.OooO00o(str5, o0OO00O.OooO00o(str4, o0OO00O.OooO00o(str3, o0OO00O.OooO00o(str2, o0OO00O.OooO00o(str, 104)))))));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        OooO0O0.OooO0O0.OooO00o(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append("], [");
        sb.append(i4);
        sb.append(", ");
        sb.append(i5);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f13122Oooo0o);
        parcel.writeString(this.f13123Oooo0oO);
        parcel.writeString(this.f13124Oooo0oo);
        parcel.writeInt(this.f13121Oooo);
        parcel.writeInt(this.f13127OoooO00);
        parcel.writeInt(this.f13126OoooO0);
        parcel.writeInt(this.f13128OoooO0O);
        parcel.writeString(this.f13129OoooOO0);
        parcel.writeParcelable(this.f13144o000oOoO, 0);
        parcel.writeString(this.f13130OoooOOO);
        parcel.writeString(this.f13131OoooOOo);
        parcel.writeInt(this.f13132OoooOo0);
        int size = this.f13133OoooOoO.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.f13133OoooOoO.get(i2));
        }
        parcel.writeParcelable(this.f13134OoooOoo, 0);
        parcel.writeLong(this.f13135Ooooo00);
        parcel.writeInt(this.f13136Ooooo0o);
        parcel.writeInt(this.f13137OooooO0);
        parcel.writeFloat(this.f13138OooooOO);
        parcel.writeInt(this.f13139OooooOo);
        parcel.writeFloat(this.f13141Oooooo0);
        int i3 = this.f13140Oooooo != null ? 1 : 0;
        int i4 = p318o0O0oOo.o000OOo0.f36740OooO00o;
        parcel.writeInt(i3);
        byte[] bArr = this.f13140Oooooo;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f13142OoooooO);
        parcel.writeParcelable(this.f13143Ooooooo, i);
        parcel.writeInt(this.f13150o0OoOo0);
        parcel.writeInt(this.f13152ooOO);
        parcel.writeInt(this.f13145o00O0O);
        parcel.writeInt(this.f13146o00Oo0);
        parcel.writeInt(this.f13147o00Ooo);
        parcel.writeInt(this.f13148o00o0O);
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @Nullable
        public Metadata f13153OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public String f13154OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public String f13155OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @Nullable
        public String f13156OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13157OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public int f13158OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f13159OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f13160OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        @Nullable
        public String f13161OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        @Nullable
        public String f13162OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        @Nullable
        public String f13163OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f13164OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        @Nullable
        public DrmInitData f13165OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        @Nullable
        public List<byte[]> f13166OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public long f13167OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public int f13168OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public float f13169OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public int f13170OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f13171OooOOoo;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f13172OooOo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        @Nullable
        public byte[] f13173OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public float f13174OooOo00;

        /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
        public int f13175OooOo0O;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        @Nullable
        public ColorInfo f13176OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f13177OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f13178OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f13179OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public int f13180OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f13181OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        @Nullable
        public Class<? extends o000OOo0> f13182OooOooO;

        public OooO0O0() {
            this.f13158OooO0o = -1;
            this.f13160OooO0oO = -1;
            this.f13164OooOO0o = -1;
            this.f13167OooOOOO = Long.MAX_VALUE;
            this.f13168OooOOOo = -1;
            this.f13170OooOOo0 = -1;
            this.f13169OooOOo = -1.0f;
            this.f13174OooOo00 = 1.0f;
            this.f13175OooOo0O = -1;
            this.f13172OooOo = -1;
            this.f13178OooOoO0 = -1;
            this.f13177OooOoO = -1;
            this.f13180OooOoo = -1;
        }

        public final Format OooO00o() {
            return new Format(this);
        }

        public final OooO0O0 OooO0O0(int i) {
            this.f13154OooO00o = Integer.toString(i);
            return this;
        }

        public OooO0O0(Format format) {
            this.f13154OooO00o = format.f13122Oooo0o;
            this.f13155OooO0O0 = format.f13123Oooo0oO;
            this.f13156OooO0OO = format.f13124Oooo0oo;
            this.f13157OooO0Oo = format.f13121Oooo;
            this.f13159OooO0o0 = format.f13127OoooO00;
            this.f13158OooO0o = format.f13126OoooO0;
            this.f13160OooO0oO = format.f13128OoooO0O;
            this.f13161OooO0oo = format.f13129OoooOO0;
            this.f13153OooO = format.f13144o000oOoO;
            this.f13162OooOO0 = format.f13130OoooOOO;
            this.f13163OooOO0O = format.f13131OoooOOo;
            this.f13164OooOO0o = format.f13132OoooOo0;
            this.f13166OooOOO0 = format.f13133OoooOoO;
            this.f13165OooOOO = format.f13134OoooOoo;
            this.f13167OooOOOO = format.f13135Ooooo00;
            this.f13168OooOOOo = format.f13136Ooooo0o;
            this.f13170OooOOo0 = format.f13137OooooO0;
            this.f13169OooOOo = format.f13138OooooOO;
            this.f13171OooOOoo = format.f13139OooooOo;
            this.f13174OooOo00 = format.f13141Oooooo0;
            this.f13173OooOo0 = format.f13140Oooooo;
            this.f13175OooOo0O = format.f13142OoooooO;
            this.f13176OooOo0o = format.f13143Ooooooo;
            this.f13172OooOo = format.f13150o0OoOo0;
            this.f13178OooOoO0 = format.f13152ooOO;
            this.f13177OooOoO = format.f13145o00O0O;
            this.f13179OooOoOO = format.f13146o00Oo0;
            this.f13181OooOoo0 = format.f13147o00Ooo;
            this.f13180OooOoo = format.f13148o00o0O;
            this.f13182OooOooO = format.f13149o00ooo;
        }
    }

    public Format(Parcel parcel) {
        this.f13122Oooo0o = parcel.readString();
        this.f13123Oooo0oO = parcel.readString();
        this.f13124Oooo0oo = parcel.readString();
        this.f13121Oooo = parcel.readInt();
        this.f13127OoooO00 = parcel.readInt();
        int i = parcel.readInt();
        this.f13126OoooO0 = i;
        int i2 = parcel.readInt();
        this.f13128OoooO0O = i2;
        this.f13125OoooO = i2 != -1 ? i2 : i;
        this.f13129OoooOO0 = parcel.readString();
        this.f13144o000oOoO = (Metadata) parcel.readParcelable(Metadata.class.getClassLoader());
        this.f13130OoooOOO = parcel.readString();
        this.f13131OoooOOo = parcel.readString();
        this.f13132OoooOo0 = parcel.readInt();
        int i3 = parcel.readInt();
        this.f13133OoooOoO = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            List<byte[]> list = this.f13133OoooOoO;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            Objects.requireNonNull(bArrCreateByteArray);
            list.add(bArrCreateByteArray);
        }
        DrmInitData drmInitData = (DrmInitData) parcel.readParcelable(DrmInitData.class.getClassLoader());
        this.f13134OoooOoo = drmInitData;
        this.f13135Ooooo00 = parcel.readLong();
        this.f13136Ooooo0o = parcel.readInt();
        this.f13137OooooO0 = parcel.readInt();
        this.f13138OooooOO = parcel.readFloat();
        this.f13139OooooOo = parcel.readInt();
        this.f13141Oooooo0 = parcel.readFloat();
        int i5 = p318o0O0oOo.o000OOo0.f36740OooO00o;
        this.f13140Oooooo = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f13142OoooooO = parcel.readInt();
        this.f13143Ooooooo = (ColorInfo) parcel.readParcelable(ColorInfo.class.getClassLoader());
        this.f13150o0OoOo0 = parcel.readInt();
        this.f13152ooOO = parcel.readInt();
        this.f13145o00O0O = parcel.readInt();
        this.f13146o00Oo0 = parcel.readInt();
        this.f13147o00Ooo = parcel.readInt();
        this.f13148o00o0O = parcel.readInt();
        this.f13149o00ooo = drmInitData != null ? o00oOoo.class : null;
    }
}
