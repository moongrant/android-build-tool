package com.google.android.exoplayer2.util;

import android.net.Uri;
import com.umeng.analytics.pro.bz;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p318o0O0oOo.o000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class FileTypes {

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:133:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int OooO00o(Map<String, List<String>> map) {
        byte b;
        List<String> list = map.get("Content-Type");
        String str = (list == null || list.isEmpty()) ? null : list.get(0);
        if (str != null) {
            ArrayList<o000OO.OooO00o> arrayList = o000OO.f36730OooO00o;
            int iHashCode = str.hashCode();
            byte b2 = 2;
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
            switch (str.hashCode()) {
                case -2123537834:
                    if (!str.equals("audio/eac3-joc")) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                    break;
                case -1662384011:
                    if (!str.equals("video/mp2p")) {
                        b2 = -1;
                    } else {
                        b2 = 1;
                    }
                    break;
                case -1662384007:
                    if (!str.equals("video/mp2t")) {
                        b2 = -1;
                    }
                    break;
                case -1662095187:
                    if (!str.equals("video/webm")) {
                        b2 = -1;
                    } else {
                        b2 = 3;
                    }
                    break;
                case -1606874997:
                    if (!str.equals("audio/amr-wb")) {
                        b2 = -1;
                    } else {
                        b2 = 4;
                    }
                    break;
                case -1248337486:
                    if (!str.equals("application/mp4")) {
                        b2 = -1;
                    } else {
                        b2 = 5;
                    }
                    break;
                case -1004728940:
                    if (!str.equals("text/vtt")) {
                        b2 = -1;
                    } else {
                        b2 = 6;
                    }
                    break;
                case -387023398:
                    if (!str.equals("audio/x-matroska")) {
                        b2 = -1;
                    } else {
                        b2 = 7;
                    }
                    break;
                case -43467528:
                    if (!str.equals("application/webm")) {
                        b2 = -1;
                    } else {
                        b2 = 8;
                    }
                    break;
                case 13915911:
                    if (!str.equals("video/x-flv")) {
                        b2 = -1;
                    } else {
                        b2 = 9;
                    }
                    break;
                case 187078296:
                    if (!str.equals("audio/ac3")) {
                        b2 = -1;
                    } else {
                        b2 = 10;
                    }
                    break;
                case 187078297:
                    if (!str.equals("audio/ac4")) {
                        b2 = -1;
                    } else {
                        b2 = 11;
                    }
                    break;
                case 187078669:
                    if (!str.equals("audio/amr")) {
                        b2 = -1;
                    } else {
                        b2 = 12;
                    }
                    break;
                case 187090232:
                    if (!str.equals("audio/mp4")) {
                        b2 = -1;
                    } else {
                        b2 = bz.k;
                    }
                    break;
                case 187091926:
                    if (!str.equals("audio/ogg")) {
                        b2 = -1;
                    } else {
                        b2 = bz.l;
                    }
                    break;
                case 187099443:
                    if (!str.equals("audio/wav")) {
                        b2 = -1;
                    } else {
                        b2 = bz.m;
                    }
                    break;
                case 1331848029:
                    if (!str.equals("video/mp4")) {
                        b2 = -1;
                    } else {
                        b2 = bz.n;
                    }
                    break;
                case 1503095341:
                    if (!str.equals("audio/3gpp")) {
                        b2 = -1;
                    } else {
                        b2 = 17;
                    }
                    break;
                case 1504578661:
                    if (!str.equals("audio/eac3")) {
                        b2 = -1;
                    } else {
                        b2 = 18;
                    }
                    break;
                case 1504619009:
                    if (!str.equals("audio/flac")) {
                        b2 = -1;
                    } else {
                        b2 = 19;
                    }
                    break;
                case 1504831518:
                    if (!str.equals("audio/mpeg")) {
                        b2 = -1;
                    } else {
                        b2 = 20;
                    }
                    break;
                case 1505118770:
                    if (!str.equals("audio/webm")) {
                        b2 = -1;
                    } else {
                        b2 = 21;
                    }
                    break;
                case 2039520277:
                    if (!str.equals("video/x-matroska")) {
                        b2 = -1;
                    } else {
                        b2 = 22;
                    }
                    break;
                default:
                    b2 = -1;
                    break;
            }
            switch (b2) {
                case 0:
                case 10:
                case 18:
                    return 0;
                case 1:
                    return 10;
                case 2:
                    return 11;
                case 3:
                case 7:
                case 8:
                case 21:
                case 22:
                    return 6;
                case 4:
                case 12:
                case 17:
                    return 3;
                case 5:
                case 13:
                case 16:
                    return 8;
                case 6:
                    return 13;
                case 9:
                    return 5;
                case 11:
                    return 1;
                case 14:
                    return 9;
                case 15:
                    return 12;
                case 19:
                    return 4;
                case 20:
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
        return (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) ? 13 : -1;
    }
}
