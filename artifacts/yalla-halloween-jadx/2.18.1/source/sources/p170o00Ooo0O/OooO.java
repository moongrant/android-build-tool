package p170o00Ooo0O;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import com.app.base.application.App;
import com.app.base.util.Player.Audio;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.ao;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f32675OooO00o = {ao.d, ShareConstants.WEB_DIALOG_PARAM_TITLE, "title_key", "artist", "artist_id", "artist_key", "composer", "album", "album_id", "album_key", "_display_name", "duration", "_size", "year", "track", "is_ringtone", "is_podcast", "is_alarm", "is_music", "is_notification", "mime_type", "_data"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f32676OooO0O0 = {Environment.getExternalStorageDirectory() + "", Environment.getExternalStorageDirectory() + "/0", Environment.getExternalStorageDirectory() + "/Music", Environment.getExternalStorageDirectory() + "/UCDownloads", Environment.getExternalStorageDirectory() + "/xiami/audios", Environment.getExternalStorageDirectory() + "/netease/cloudmusic/Music"};

    public interface OooO00o {
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r11v8 */
    public static List<Audio> OooO00o(Context context) throws Throwable {
        Cursor cursorQuery;
        Exception e;
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context != null ? context.getContentResolver() : App.f11458Oooo0oO.getContentResolver();
        ?? r11 = 0;
        try {
            try {
                cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, f32675OooO00o, null, null, null);
                if (cursorQuery == null) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                try {
                    cursorQuery.moveToFirst();
                    while (!cursorQuery.isAfterLast()) {
                        try {
                            if (cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("duration")) >= 3000) {
                                Bundle bundle = new Bundle();
                                int i = 0;
                                while (true) {
                                    String[] strArr = f32675OooO00o;
                                    if (i >= 22) {
                                        break;
                                    }
                                    String str = strArr[i];
                                    int columnIndex = cursorQuery.getColumnIndex(str);
                                    int type = cursorQuery.getType(columnIndex);
                                    if (type == 1) {
                                        bundle.putInt(str, cursorQuery.getInt(columnIndex));
                                    } else if (type == 2) {
                                        bundle.putFloat(str, cursorQuery.getFloat(columnIndex));
                                    } else if (type == 3) {
                                        bundle.putString(str, cursorQuery.getString(columnIndex));
                                    }
                                    i++;
                                }
                                Audio audio = new Audio(bundle);
                                if (audio.isMusic() && audio.getPath().endsWith(".mp3")) {
                                    String strSubstring = audio.getDisplayName().substring(0, audio.getDisplayName().lastIndexOf(".mp3"));
                                    audio.setmDisplayName(strSubstring);
                                    if (strSubstring.indexOf("_") > 0) {
                                        strSubstring = strSubstring.substring(0, strSubstring.indexOf("_"));
                                    }
                                    String[] strArrSplit = strSubstring.replace(" - ", "_").replace("-", "_").replace(ZegoConstants.ZegoVideoDataAuxPublishingStream, "_").split("_");
                                    if (strArrSplit.length > 1) {
                                        audio.setmArtist(strArrSplit[0]);
                                        audio.setNameArtist(audio.getDisplayName() + " - " + audio.getArtist());
                                    } else if (strArrSplit.length > 0) {
                                        audio.setNameArtist(audio.getDisplayName());
                                    }
                                    arrayList.add(audio);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        cursorQuery.moveToNext();
                    }
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    if (cursorQuery != null) {
                    }
                    return arrayList;
                }
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                r11 = contentResolver;
                if (r11 != 0) {
                    r11.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            cursorQuery = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (r11 != 0) {
                r11.close();
            }
            throw th;
        }
    }
}
