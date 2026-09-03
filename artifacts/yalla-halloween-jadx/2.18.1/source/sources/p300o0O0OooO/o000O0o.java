package p300o0O0OooO;

import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.extractor.mp4.OooO00o;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import o00O00O.OooO0OO;
import p318o0O0oOo.o000;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f36028OooO00o = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    public static CommentFrame OooO00o(int i, o000 o000Var) {
        int iOooO0Oo = o000Var.OooO0Oo();
        if (o000Var.OooO0Oo() == 1684108385) {
            o000Var.OooOoo0(8);
            String strOooOOO0 = o000Var.OooOOO0(iOooO0Oo - 16);
            return new CommentFrame("und", strOooOOO0, strOooOOO0);
        }
        String strValueOf = String.valueOf(OooO00o.OooO00o(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
        return null;
    }

    @Nullable
    public static ApicFrame OooO0O0(o000 o000Var) {
        String str;
        int iOooO0Oo = o000Var.OooO0Oo();
        if (o000Var.OooO0Oo() != 1684108385) {
            Log.w("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iOooO0Oo2 = o000Var.OooO0Oo() & 16777215;
        if (iOooO0Oo2 == 13) {
            str = "image/jpeg";
        } else {
            str = iOooO0Oo2 == 14 ? "image/png" : null;
        }
        if (str == null) {
            OooO0OO.OooO0O0(41, "Unrecognized cover art flags: ", iOooO0Oo2, "MetadataUtil");
            return null;
        }
        o000Var.OooOoo0(4);
        int i = iOooO0Oo - 16;
        byte[] bArr = new byte[i];
        o000Var.OooO0OO(bArr, 0, i);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static TextInformationFrame OooO0OO(int i, String str, o000 o000Var) {
        int iOooO0Oo = o000Var.OooO0Oo();
        if (o000Var.OooO0Oo() == 1684108385 && iOooO0Oo >= 22) {
            o000Var.OooOoo0(10);
            int iOooOo0O = o000Var.OooOo0O();
            if (iOooOo0O > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(iOooOo0O);
                String string = sb.toString();
                int iOooOo0O2 = o000Var.OooOo0O();
                if (iOooOo0O2 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(iOooOo0O2);
                    string = sb2.toString();
                }
                return new TextInformationFrame(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(OooO00o.OooO00o(i));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    @Nullable
    public static TextInformationFrame OooO0Oo(int i, String str, o000 o000Var) {
        int iOooO0Oo = o000Var.OooO0Oo();
        if (o000Var.OooO0Oo() == 1684108385) {
            o000Var.OooOoo0(8);
            return new TextInformationFrame(str, null, o000Var.OooOOO0(iOooO0Oo - 16));
        }
        String strValueOf = String.valueOf(OooO00o.OooO00o(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    public static int OooO0o(o000 o000Var) {
        o000Var.OooOoo0(4);
        if (o000Var.OooO0Oo() == 1684108385) {
            o000Var.OooOoo0(8);
            return o000Var.OooOOo0();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    public static Id3Frame OooO0o0(int i, String str, o000 o000Var, boolean z, boolean z2) {
        int iOooO0o = OooO0o(o000Var);
        if (z2) {
            iOooO0o = Math.min(1, iOooO0o);
        }
        if (iOooO0o >= 0) {
            return z ? new TextInformationFrame(str, null, Integer.toString(iOooO0o)) : new CommentFrame("und", str, Integer.toString(iOooO0o));
        }
        String strValueOf = String.valueOf(OooO00o.OooO00o(i));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }
}
