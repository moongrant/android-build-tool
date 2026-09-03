package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o0O00;
import java.util.ArrayList;
import p069o0000ooO.o0OO00O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final ImmutableList<String> f12605OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final String f12606OooO0o0;

    public class OooO00o implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            string.getClass();
            String string2 = parcel.readString();
            String[] strArrCreateStringArray = parcel.createStringArray();
            strArrCreateStringArray.getClass();
            return new TextInformationFrame(string, string2, ImmutableList.OooOO0o(strArrCreateStringArray));
        }

        @Override // android.os.Parcelable.Creator
        public final TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(String str, @Nullable String str2, o0O00 o0o01) {
        super(str);
        o00O000o.OooO00o(!o0o01.isEmpty());
        this.f12606OooO0o0 = str2;
        ImmutableList<String> immutableListOooOO0O = ImmutableList.OooOO0O(o0o01);
        this.f12605OooO0o = immutableListOooOO0O;
        immutableListOooOO0O.get(0);
    }

    public static ArrayList OooO00o(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:93:0x0130  */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void OooooOo(MediaMetadata.OooO00o oooO00o) {
        byte b;
        String str = this.f12594OooO0Oo;
        str.getClass();
        switch (str) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TDAT":
                b = 12;
                break;
            case "TDRC":
                b = 13;
                break;
            case "TDRL":
                b = 14;
                break;
            case "TEXT":
                b = 15;
                break;
            case "TIT2":
                b = 16;
                break;
            case "TPE1":
                b = 17;
                break;
            case "TPE2":
                b = 18;
                break;
            case "TPE3":
                b = 19;
                break;
            case "TRCK":
                b = 20;
                break;
            case "TYER":
                b = 21;
                break;
            default:
                b = -1;
                break;
        }
        ImmutableList<String> immutableList = this.f12605OooO0o;
        try {
            switch (b) {
                case 0:
                case 10:
                    oooO00o.OooO0OO(immutableList.get(0));
                    break;
                case 1:
                case 11:
                    oooO00o.OooO0o0(immutableList.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = immutableList.get(0);
                    int i = Integer.parseInt(str2.substring(2, 4));
                    int i2 = Integer.parseInt(str2.substring(0, 2));
                    oooO00o.OooO0oo(Integer.valueOf(i));
                    oooO00o.OooO0oO(Integer.valueOf(i2));
                    break;
                case 3:
                case 17:
                    oooO00o.OooO0Oo(immutableList.get(0));
                    break;
                case 4:
                case 18:
                    oooO00o.OooO0O0(immutableList.get(0));
                    break;
                case 5:
                case 19:
                    oooO00o.OooO0o(immutableList.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrOoooO0 = p245o00oo0o.o0O00.OoooO0(immutableList.get(0));
                    int i3 = Integer.parseInt(strArrOoooO0[0]);
                    Integer numValueOf = strArrOoooO0.length > 1 ? Integer.valueOf(Integer.parseInt(strArrOoooO0[1])) : null;
                    oooO00o.OooOOOO(Integer.valueOf(i3));
                    oooO00o.OooOOO(numValueOf);
                    break;
                case 7:
                case 16:
                    oooO00o.OooOOO0(immutableList.get(0));
                    break;
                case 8:
                case 15:
                    oooO00o.OooOOOo(immutableList.get(0));
                    break;
                case 9:
                case 21:
                    oooO00o.OooO(Integer.valueOf(Integer.parseInt(immutableList.get(0))));
                    break;
                case 13:
                    ArrayList arrayListOooO00o = OooO00o(immutableList.get(0));
                    int size = arrayListOooO00o.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                oooO00o.OooO0oO((Integer) arrayListOooO00o.get(2));
                            }
                        }
                        oooO00o.OooO0oo((Integer) arrayListOooO00o.get(1));
                    }
                    oooO00o.OooO((Integer) arrayListOooO00o.get(0));
                    break;
                case 14:
                    ArrayList arrayListOooO00o2 = OooO00o(immutableList.get(0));
                    int size2 = arrayListOooO00o2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                oooO00o.OooOO0((Integer) arrayListOooO00o2.get(2));
                            }
                        }
                        oooO00o.OooOO0O((Integer) arrayListOooO00o2.get(1));
                    }
                    oooO00o.OooOO0o((Integer) arrayListOooO00o2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        return p245o00oo0o.o0O00.OooO00o(this.f12594OooO0Oo, textInformationFrame.f12594OooO0Oo) && p245o00oo0o.o0O00.OooO00o(this.f12606OooO0o0, textInformationFrame.f12606OooO0o0) && this.f12605OooO0o.equals(textInformationFrame.f12605OooO0o);
    }

    public final int hashCode() {
        int iOooO00o = o0OO00O.OooO00o(this.f12594OooO0Oo, 527, 31);
        String str = this.f12606OooO0o0;
        return this.f12605OooO0o.hashCode() + ((iOooO00o + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f12594OooO0Oo + ": description=" + this.f12606OooO0o0 + ": values=" + this.f12605OooO0o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f12594OooO0Oo);
        parcel.writeString(this.f12606OooO0o0);
        parcel.writeStringArray((String[]) this.f12605OooO0o.toArray(new String[0]));
    }
}
