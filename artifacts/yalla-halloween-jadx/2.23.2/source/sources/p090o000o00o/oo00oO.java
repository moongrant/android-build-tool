package p090o000o00o;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.Log;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.Id3Frame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.mp4.OooO00o;
import com.common.support.imagepicker.dataprovider.utils.MediaUtils;
import com.google.common.collect.ImmutableList;
import p070o000O0o.Oooo000;
import p080o000OoO.o000O000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo00oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @VisibleForTesting
    public static final String[] f35094OooO00o = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    public static CommentFrame OooO00o(int i, o000O000 o000o001) {
        int iOooO0o = o000o001.OooO0o();
        if (o000o001.OooO0o() == 1684108385) {
            o000o001.Oooo00o(8);
            String strOooOOo0 = o000o001.OooOOo0(iOooO0o - 16);
            return new CommentFrame("und", strOooOOo0, strOooOOo0);
        }
        Log.OooO0o("MetadataUtil", "Failed to parse comment attribute: " + OooO00o.OooO00o(i));
        return null;
    }

    @Nullable
    public static ApicFrame OooO0O0(o000O000 o000o001) {
        String str;
        int iOooO0o = o000o001.OooO0o();
        if (o000o001.OooO0o() != 1684108385) {
            Log.OooO0o("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iOooO0o2 = o000o001.OooO0o() & 16777215;
        if (iOooO0o2 == 13) {
            str = "image/jpeg";
        } else {
            str = iOooO0o2 == 14 ? MediaUtils.IMAGE_PNG : null;
        }
        if (str == null) {
            Oooo000.OooO00o("Unrecognized cover art flags: ", iOooO0o2, "MetadataUtil");
            return null;
        }
        o000o001.Oooo00o(4);
        int i = iOooO0o - 16;
        byte[] bArr = new byte[i];
        o000o001.OooO0Oo(0, i, bArr);
        return new ApicFrame(str, null, 3, bArr);
    }

    @Nullable
    public static TextInformationFrame OooO0OO(int i, o000O000 o000o001, String str) {
        int iOooO0o = o000o001.OooO0o();
        if (o000o001.OooO0o() == 1684108385 && iOooO0o >= 22) {
            o000o001.Oooo00o(10);
            int iOooOoOO = o000o001.OooOoOO();
            if (iOooOoOO > 0) {
                String strOooO00o = android.support.v4.media.OooO00o.OooO00o("", iOooOoOO);
                int iOooOoOO2 = o000o001.OooOoOO();
                if (iOooOoOO2 > 0) {
                    strOooO00o = strOooO00o + "/" + iOooOoOO2;
                }
                return new TextInformationFrame(str, null, ImmutableList.OooOOOo(strOooO00o));
            }
        }
        Log.OooO0o("MetadataUtil", "Failed to parse index/count attribute: " + OooO00o.OooO00o(i));
        return null;
    }

    @Nullable
    public static TextInformationFrame OooO0Oo(int i, o000O000 o000o001, String str) {
        int iOooO0o = o000o001.OooO0o();
        if (o000o001.OooO0o() == 1684108385) {
            o000o001.Oooo00o(8);
            return new TextInformationFrame(str, null, ImmutableList.OooOOOo(o000o001.OooOOo0(iOooO0o - 16)));
        }
        Log.OooO0o("MetadataUtil", "Failed to parse text attribute: " + OooO00o.OooO00o(i));
        return null;
    }

    public static int OooO0o(o000O000 o000o001) {
        o000o001.Oooo00o(4);
        if (o000o001.OooO0o() == 1684108385) {
            o000o001.Oooo00o(8);
            return o000o001.OooOo0O();
        }
        Log.OooO0o("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    public static Id3Frame OooO0o0(int i, String str, o000O000 o000o001, boolean z, boolean z2) {
        int iOooO0o = OooO0o(o000o001);
        if (z2) {
            iOooO0o = Math.min(1, iOooO0o);
        }
        if (iOooO0o >= 0) {
            return z ? new TextInformationFrame(str, null, ImmutableList.OooOOOo(Integer.toString(iOooO0o))) : new CommentFrame("und", str, Integer.toString(iOooO0o));
        }
        Log.OooO0o("MetadataUtil", "Failed to parse uint8 attribute: " + OooO00o.OooO00o(i));
        return null;
    }
}
