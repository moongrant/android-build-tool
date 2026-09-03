package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p069o0000ooO.o000OO;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class FileTypes {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0058  */
    public static int OooO00o(Map<String, List<String>> map) {
        byte b;
        List<String> list = map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : list.get(0);
        if (str != null) {
            ArrayList<o000OO.OooO00o> arrayList = o000OO.f33820OooO00o;
            int iHashCode = str.hashCode();
            if (iHashCode != -1007807498) {
                if (iHashCode != -586683234) {
                    if (iHashCode == 187090231 && str.equals("audio/mp3")) {
                        b = 2;
                    } else {
                        b = -1;
                    }
                } else if (str.equals("audio/x-wav")) {
                    b = 1;
                } else {
                    b = -1;
                }
            } else if (str.equals("audio/x-flac")) {
                b = 0;
            } else {
                b = -1;
            }
            if (b == 0) {
                str = "audio/flac";
            } else if (b == 1) {
                str = "audio/wav";
            } else if (b == 2) {
                str = "audio/mpeg";
            }
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac3":
                case "audio/eac3":
                    return 0;
                case "video/mp2p":
                    return 10;
                case "video/mp2t":
                    return 11;
                case "video/webm":
                case "audio/x-matroska":
                case "application/webm":
                case "audio/webm":
                case "video/x-matroska":
                    return 6;
                case "audio/amr-wb":
                case "audio/amr":
                case "audio/3gpp":
                    return 3;
                case "image/jpeg":
                    return 14;
                case "application/mp4":
                case "audio/mp4":
                case "video/mp4":
                    return 8;
                case "video/x-msvideo":
                    return 16;
                case "text/vtt":
                    return 13;
                case "video/x-flv":
                    return 5;
                case "audio/ac4":
                    return 1;
                case "audio/ogg":
                    return 9;
                case "audio/wav":
                    return 12;
                case "audio/flac":
                    return 4;
                case "audio/midi":
                    return 15;
                case "audio/mpeg":
                    return 7;
            }
        }
        return -1;
    }

    public static int OooO0O0(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        return lastPathSegment.endsWith(".avi") ? 16 : -1;
    }
}
