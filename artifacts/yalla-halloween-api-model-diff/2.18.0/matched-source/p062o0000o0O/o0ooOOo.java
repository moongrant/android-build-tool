package p062o0000o0O;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Message;
import android.provider.MediaStore;
import androidx.constraintlayout.helper.widget.Carousel;
import com.app.selectPicture.model.FileModel;
import com.app.selectPicture.model.ImageModel;
import com.facebook.share.internal.ShareConstants;
import com.umeng.analytics.pro.ao;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import p203o00o0Ooo.o0O0ooO;
import p206o00o0o0O.o000;
import p206o00o0o0O.o000O000;
import p207o00o0o0o.o000O00;
import p207o00o0o0o.o000O00O;
import p255o00ooO0O.o000O0O0;
import p256o00ooO0o.oo0oOO0;
import p403o0Oo0O.OooOOOO;
import p532o0o0OOO.o00OO0O0;
import p563o0oOOooo.oO00o0;
import p563o0oOOooo.oO0OO00o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f27915Oooo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f27916OoooO00;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f27915Oooo = i;
        this.f27916OoooO00 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00de A[PHI: r12
      0x00de: PHI (r12v3 android.database.Cursor) = (r12v2 android.database.Cursor), (r12v23 android.database.Cursor) binds: [B:26:0x00dc, B:19:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x015f A[Catch: Exception -> 0x01a6, LOOP:0: B:53:0x0159->B:55:0x015f, LOOP_END, TryCatch #7 {Exception -> 0x01a6, blocks: (B:52:0x014c, B:53:0x0159, B:55:0x015f, B:56:0x016f, B:57:0x0173, B:59:0x0179, B:61:0x018b, B:62:0x01a1), top: B:111:0x014c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0179 A[Catch: Exception -> 0x01a6, TryCatch #7 {Exception -> 0x01a6, blocks: (B:52:0x014c, B:53:0x0159, B:55:0x015f, B:56:0x016f, B:57:0x0173, B:59:0x0179, B:61:0x018b, B:62:0x01a1), top: B:111:0x014c }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0236  */
    /* JADX WARN: Code duplicated, block: B:87:0x023d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0245  */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0242: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]), block:B:90:0x0242 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursor2;
        Cursor cursor3;
        boolean z;
        ArrayList<FileModel> arrayList;
        o000.OooO00o oooO00o;
        HashMap map;
        FileModel fileModel;
        HashMap map2;
        switch (this.f27915Oooo) {
            case 0:
                Carousel carousel = (Carousel) this.f27916OoooO00;
                carousel.f7100OooooOo.setTransitionDuration(carousel.f7110o00oO0o);
                if (carousel.f7113oo000o < carousel.f7099OooooOO) {
                    carousel.f7100OooooOo.OooOoO(carousel.f7112o0OoOo0, carousel.f7110o00oO0o);
                    return;
                } else {
                    carousel.f7100OooooOo.OooOoO(carousel.f7114ooOO, carousel.f7110o00oO0o);
                    return;
                }
            case 1:
                o000 o000Var = (o000) this.f27916OoooO00;
                Objects.requireNonNull(o000Var);
                Message message = new Message();
                message.what = 1;
                o000O000 o000o001 = (o000O000) o000Var;
                Context context = o000o001.f33268OooO00o;
                boolean z2 = !o000o001.f33274OooO0o0;
                o0O0ooO o0o0ooo = new o0O0ooO();
                ArrayList<ImageModel> arrayList2 = new ArrayList<>();
                try {
                    try {
                        String[] strArr = {"bucket_id", "bucket_display_name", ao.d, "date_modified", "mime_type", "_size", ShareConstants.WEB_DIALOG_PARAM_TITLE};
                        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                        cursorQuery = context.getContentResolver().query(uri, strArr, z2 ? "_size>0 AND mime_type NOT IN ('image/gif')" : "_size>0", null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToFirst()) {
                                    do {
                                        ImageModel imageModel = new ImageModel();
                                        imageModel.f12337OoooOO0 = cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id"));
                                        imageModel.f12341o000oOoO = cursorQuery.getString(cursorQuery.getColumnIndex("bucket_display_name"));
                                        imageModel.f12332Oooo = cursorQuery.getLong(cursorQuery.getColumnIndex(ao.d));
                                        imageModel.f12335OoooO00 = cursorQuery.getLong(cursorQuery.getColumnIndex("date_modified"));
                                        imageModel.f12334OoooO0 = cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"));
                                        imageModel.f12336OoooO0O = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                                        imageModel.f12333OoooO = cursorQuery.getString(cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                                        imageModel.f12338OoooOOO = false;
                                        imageModel.f12340OoooOo0 = ContentUris.withAppendedId(uri, imageModel.f12332Oooo);
                                        arrayList2.add(imageModel);
                                    } while (cursorQuery.moveToNext());
                                }
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                    break;
                } catch (Exception e2) {
                    e = e2;
                    cursorQuery = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                ArrayList<ImageModel> arrayList3 = new ArrayList();
                try {
                    Uri uri2 = MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI;
                    Cursor cursorQuery2 = context.getContentResolver().query(uri2, new String[]{"image_id"}, null, null, null);
                    if (cursorQuery2 != null) {
                        try {
                            if (cursorQuery2.moveToFirst()) {
                                do {
                                    ImageModel imageModel2 = new ImageModel();
                                    long j = cursorQuery2.getLong(cursorQuery2.getColumnIndex("image_id"));
                                    imageModel2.f12332Oooo = j;
                                    imageModel2.f12340OoooOo0 = ContentUris.withAppendedId(uri2, j);
                                    arrayList3.add(imageModel2);
                                } while (cursorQuery2.moveToNext());
                            }
                        } catch (Exception e3) {
                            e = e3;
                            cursor3 = cursorQuery2;
                            try {
                                e.printStackTrace();
                                if (cursor3 != null) {
                                    cursorQuery2 = cursor3;
                                }
                                map2 = new HashMap(arrayList2.size());
                                for (ImageModel imageModel3 : arrayList2) {
                                    map2.put(Long.valueOf(imageModel3.f12332Oooo), imageModel3);
                                }
                                for (ImageModel imageModel4 : arrayList3) {
                                    if (map2.containsKey(Long.valueOf(imageModel4.f12332Oooo))) {
                                        ImageModel imageModel5 = (ImageModel) map2.get(Long.valueOf(imageModel4.f12332Oooo));
                                        map2.put(Long.valueOf(imageModel5.f12332Oooo), imageModel5);
                                    }
                                }
                                arrayList2 = o000O00O.OooO0O0(map2);
                                Collections.sort(arrayList2, new o000O00());
                                z = o000o001.f33272OooO0Oo;
                                o0o0ooo.f33256OooO00o = arrayList2;
                                arrayList = new ArrayList<>();
                                if (arrayList.isEmpty()) {
                                    map = new HashMap();
                                    for (ImageModel imageModel6 : arrayList2) {
                                        fileModel = new FileModel();
                                        fileModel.OooO00o(imageModel6);
                                        if (map.containsKey(imageModel6.f12341o000oOoO)) {
                                            fileModel = (FileModel) map.get(imageModel6.f12341o000oOoO);
                                            fileModel.f12325OoooO0O++;
                                        } else {
                                            fileModel.f12325OoooO0O = 1;
                                        }
                                        map.put(imageModel6.f12341o000oOoO, fileModel);
                                    }
                                    arrayList = o000O00O.OooO0O0(map);
                                    Collections.reverse(arrayList);
                                    if (z) {
                                        FileModel fileModel2 = new FileModel();
                                        fileModel2.OooO00o(arrayList2.get(0));
                                        fileModel2.f12324OoooO00 = 0L;
                                        fileModel2.f12323OoooO0 = context.getString(OooOOOO.select_picture_string_All_photos);
                                        fileModel2.f12325OoooO0O = arrayList2.size();
                                        arrayList.add(0, fileModel2);
                                    }
                                }
                                o0o0ooo.f33257OooO0O0 = arrayList;
                                message.obj = o0o0ooo;
                                oooO00o = o000Var.f33270OooO0OO;
                                if (oooO00o != null) {
                                    oooO00o.sendMessage(message);
                                    return;
                                }
                                return;
                            } catch (Throwable th3) {
                                th = th3;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor3 = cursorQuery2;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        Collections.reverse(arrayList3);
                    }
                    if (cursorQuery2 != null) {
                        cursorQuery2.close();
                    }
                    break;
                } catch (Exception e4) {
                    e = e4;
                    cursor3 = null;
                } catch (Throwable th5) {
                    th = th5;
                    cursor3 = null;
                }
                try {
                    map2 = new HashMap(arrayList2.size());
                    while (r10.hasNext()) {
                        map2.put(Long.valueOf(imageModel3.f12332Oooo), imageModel3);
                    }
                    while (r10.hasNext()) {
                        if (map2.containsKey(Long.valueOf(imageModel4.f12332Oooo))) {
                            ImageModel imageModel7 = (ImageModel) map2.get(Long.valueOf(imageModel4.f12332Oooo));
                            map2.put(Long.valueOf(imageModel7.f12332Oooo), imageModel7);
                        }
                    }
                    arrayList2 = o000O00O.OooO0O0(map2);
                    break;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                Collections.sort(arrayList2, new o000O00());
                z = o000o001.f33272OooO0Oo;
                o0o0ooo.f33256OooO00o = arrayList2;
                arrayList = new ArrayList<>();
                if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    map = new HashMap();
                    while (r10.hasNext()) {
                        fileModel = new FileModel();
                        fileModel.OooO00o(imageModel6);
                        if (map.containsKey(imageModel6.f12341o000oOoO)) {
                            fileModel.f12325OoooO0O = 1;
                        } else {
                            fileModel = (FileModel) map.get(imageModel6.f12341o000oOoO);
                            fileModel.f12325OoooO0O++;
                        }
                        map.put(imageModel6.f12341o000oOoO, fileModel);
                    }
                    arrayList = o000O00O.OooO0O0(map);
                    Collections.reverse(arrayList);
                    if (z) {
                        FileModel fileModel3 = new FileModel();
                        fileModel3.OooO00o(arrayList2.get(0));
                        fileModel3.f12324OoooO00 = 0L;
                        fileModel3.f12323OoooO0 = context.getString(OooOOOO.select_picture_string_All_photos);
                        fileModel3.f12325OoooO0O = arrayList2.size();
                        arrayList.add(0, fileModel3);
                    }
                }
                o0o0ooo.f33257OooO0O0 = arrayList;
                message.obj = o0o0ooo;
                oooO00o = o000Var.f33270OooO0OO;
                if (oooO00o != null) {
                    oooO00o.sendMessage(message);
                    return;
                }
                return;
            default:
                oO0OO00o this$0 = (oO0OO00o) this.f27916OoooO00;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String strOooO0OO = o000O0O0.OooO0OO(R.string.title_Room_onMic_0);
                Integer value = o00OO0O0.f43338OooooOo.OooO00o().f43363OooOo0o.getValue();
                if (value != null && value.intValue() > 0) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.title_Room_onMic);
                }
                String strOooO00o = OooOo.OooO00o(strOooO0OO, "" + value);
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0.f44372OooO00o);
                oo0ooo0.OooOo0O(strOooO00o);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(oO00o0.f44925Oooo);
                oo0ooo0.OooOOO0();
                return;
        }
    }
}
