package p181o00o000o;

import Jni.FFmpegCmd;
import OooO0O0.OooO0O0;
import android.media.MediaMetadataRetriever;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMediaInfoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaInfoUtils.kt\ncom/ffmpeg/utils/MediaInfoUtilsKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,78:1\n215#2,2:79\n*S KotlinDebug\n*F\n+ 1 MediaInfoUtils.kt\ncom/ffmpeg/utils/MediaInfoUtilsKt\n*L\n30#1:79,2\n*E\n"})
public final class oo000o {
    @NotNull
    public static final String OooO00o(int i) {
        if (i < 1000) {
            return i + " bps";
        }
        String[] strArr = {"Kbps", "Mbps", "Gbps", "Tbps"};
        double d = i;
        int i2 = 0;
        while (d >= 1000.0d && i2 < 3) {
            d /= (double) 1000;
            i2++;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return OooO0O0.OooO00o(new Object[]{Double.valueOf(d), strArr[i2]}, 2, "%.2f %s", "format(format, *args)");
    }

    @NotNull
    public static final String OooO0O0(long j) {
        long j2 = 60;
        long j3 = j / j2;
        long j4 = j % j2;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return OooO0O0.OooO00o(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2, "%02d:%02d", "format(format, *args)");
    }

    public static final String OooO0OO(String str) {
        long length = new File(str).length();
        float f = length / 1024.0f;
        float f2 = f / 1024.0f;
        if (f2 >= 1.0f) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            return OooO0O0.OooO00o(new Object[]{Float.valueOf(f2)}, 1, "%.2f MB", "format(format, *args)");
        }
        if (f >= 1.0f) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return OooO0O0.OooO00o(new Object[]{Float.valueOf(f)}, 1, "%.2f KB", "format(format, *args)");
        }
        return length + " bytes";
    }

    @NotNull
    public static final LinkedHashMap<String, Object> OooO0Oo(@NotNull String mp4Path) throws IOException {
        Intrinsics.checkNotNullParameter(mp4Path, "mp4Path");
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            HashMap<String, Object> mapMp4Info = FFmpegCmd.mp4Info(mp4Path);
            mediaMetadataRetriever.setDataSource(mp4Path);
            linkedHashMap.put("file length", OooO0OO(mp4Path));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            linkedHashMap.put("video duration", OooO0O0((strExtractMetadata != null ? Long.parseLong(strExtractMetadata) : 0L) / ((long) 1000)));
            linkedHashMap.put("track count", mediaMetadataRetriever.extractMetadata(10));
            linkedHashMap.put("mime type", mediaMetadataRetriever.extractMetadata(12));
            linkedHashMap.put("has video", mediaMetadataRetriever.extractMetadata(17));
            linkedHashMap.put("has audio", mediaMetadataRetriever.extractMetadata(16));
            String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
            if (strExtractMetadata2 != null) {
                linkedHashMap.put("video rotation", strExtractMetadata2);
            }
            Intrinsics.checkNotNull(mapMp4Info);
            for (Map.Entry<String, Object> entry : mapMp4Info.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Intrinsics.checkNotNull(key);
                linkedHashMap.put(key, value);
                if (key.equals("video bitrate")) {
                    linkedHashMap.put("video bitrate text", OooO00o(Integer.parseInt(value.toString()) / 1000));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            mediaMetadataRetriever.release();
        }
        return linkedHashMap;
    }
}
