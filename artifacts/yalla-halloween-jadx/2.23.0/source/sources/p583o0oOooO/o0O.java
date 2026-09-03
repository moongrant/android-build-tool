package p583o0oOooO;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import com.code.android.util.OooOo00;
import com.code.android.util.Oooo000;
import com.facebook.share.internal.ShareConstants;
import com.yalla.yalla.app.application.App;
import com.yalla.yalla.util.Player.Audio;
import com.zego.zegoavkit2.ZegoConstants;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String[] f56757OooO00o = {"_id", ShareConstants.WEB_DIALOG_PARAM_TITLE, "title_key", "artist", "artist_id", "artist_key", "composer", "album", "album_id", "album_key", "_display_name", "duration", "_size", "year", "track", "is_ringtone", "is_podcast", "is_alarm", "is_music", "is_notification", "mime_type", "_data"};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f56758OooO0O0 = {Environment.getExternalStorageDirectory() + "", Environment.getExternalStorageDirectory() + "/0", Environment.getExternalStorageDirectory() + "/Music", Environment.getExternalStorageDirectory() + "/UCDownloads", Environment.getExternalStorageDirectory() + "/xiami/audios", Environment.getExternalStorageDirectory() + "/netease/cloudmusic/Music"};

    public class OooO00o implements MediaScannerConnection.OnScanCompletedListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ String[] f56759OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f56760OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Context f56761OooO0OO;

        public OooO00o(String[] strArr, OooO0O0 oooO0O0, Context context) {
            this.f56759OooO00o = strArr;
            this.f56760OooO0O0 = oooO0O0;
            this.f56761OooO0OO = context;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            OooO0O0 oooO0O0;
            String[] strArr = this.f56759OooO00o;
            if (!strArr[strArr.length - 1].equals(str) || (oooO0O0 = this.f56760OooO0O0) == null) {
                return;
            }
            oooO0O0.OooO00o(o0O.OooO00o(this.f56761OooO0OO));
        }
    }

    public interface OooO0O0 {
        void OooO00o(ArrayList arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0118  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public static ArrayList OooO00o(Context context) throws Throwable {
        Cursor cursorQuery;
        Exception e;
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = context != null ? context.getContentResolver() : App.f22702OooO0o.getContentResolver();
        ?? r12 = 0;
        try {
            try {
                Uri uri = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                String[] strArr = f56757OooO00o;
                cursorQuery = contentResolver.query(uri, strArr, null, null, null);
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
                                for (int i = 0; i < 22; i++) {
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
                r12 = contentResolver;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (Exception e3) {
            cursorQuery = null;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
                r12.close();
            }
            throw th;
        }
    }

    public static void OooO0O0(Context context, OooO0O0 oooO0O0) {
        File[] fileArrListFiles;
        ArrayList arrayList = new ArrayList();
        for (String filePath : f56758OooO0O0) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            File fileOooO00o = Oooo000.OooO00o(filePath);
            if ((fileOooO00o != null && fileOooO00o.exists()) && (fileArrListFiles = new File(filePath).listFiles()) != null) {
                for (File file : fileArrListFiles) {
                    if (file.toString().endsWith(".mp3")) {
                        arrayList.add(file.toString());
                    }
                }
            }
        }
        if (!OooOo00.OooO00o(arrayList)) {
            String[] strArr = (String[]) arrayList.toArray(new String[arrayList.size()]);
            MediaScannerConnection.scanFile(context, strArr, null, new OooO00o(strArr, oooO0O0, context));
        } else if (oooO0O0 != null) {
            oooO0O0.OooO00o(OooO00o(context));
        }
    }
}
