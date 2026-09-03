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
import p202o00o0Ooo.o0O0ooO;
import p205o00o0o0O.o000;
import p205o00o0o0O.o000O000;
import p206o00o0o0o.o000O00;
import p206o00o0o0o.o000O00O;
import p254o00ooO0O.o000O0O0;
import p255o00ooO0o.oo0oOO0;
import p400o0Oo0O.OooOOOO;
import p530o0o0OOO.o00OO00O;
import p561o0oOOooo.oOo000Oo;
import p561o0oOOooo.oOo00o0o;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f27895Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f27896Oooo0oO;

    public /* synthetic */ o0ooOOo(Object obj, int i) {
        this.f27895Oooo0o = i;
        this.f27896Oooo0oO = obj;
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
        switch (this.f27895Oooo0o) {
            case 0:
                Carousel carousel = (Carousel) this.f27896Oooo0oO;
                carousel.f7085Ooooo0o.setTransitionDuration(carousel.f7096o00o0O);
                if (carousel.f7095o00Ooo < carousel.f7084Ooooo00) {
                    carousel.f7085Ooooo0o.OooOoO(carousel.f7089Oooooo, carousel.f7096o00o0O);
                    return;
                } else {
                    carousel.f7085Ooooo0o.OooOoO(carousel.f7091OoooooO, carousel.f7096o00o0O);
                    return;
                }
            case 1:
                o000 o000Var = (o000) this.f27896Oooo0oO;
                Objects.requireNonNull(o000Var);
                Message message = new Message();
                message.what = 1;
                o000O000 o000o001 = (o000O000) o000Var;
                Context context = o000o001.f33246OooO00o;
                boolean z2 = !o000o001.f33252OooO0o0;
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
                                        imageModel.f12322OoooO0 = cursorQuery.getLong(cursorQuery.getColumnIndex("bucket_id"));
                                        imageModel.f12324OoooO0O = cursorQuery.getString(cursorQuery.getColumnIndex("bucket_display_name"));
                                        imageModel.f12318Oooo0o = cursorQuery.getLong(cursorQuery.getColumnIndex(ao.d));
                                        imageModel.f12319Oooo0oO = cursorQuery.getLong(cursorQuery.getColumnIndex("date_modified"));
                                        imageModel.f12320Oooo0oo = cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"));
                                        imageModel.f12317Oooo = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                                        imageModel.f12323OoooO00 = cursorQuery.getString(cursorQuery.getColumnIndex(ShareConstants.WEB_DIALOG_PARAM_TITLE));
                                        imageModel.f12321OoooO = false;
                                        imageModel.f12326o000oOoO = ContentUris.withAppendedId(uri, imageModel.f12318Oooo0o);
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
                                    imageModel2.f12318Oooo0o = j;
                                    imageModel2.f12326o000oOoO = ContentUris.withAppendedId(uri2, j);
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
                                    map2.put(Long.valueOf(imageModel3.f12318Oooo0o), imageModel3);
                                }
                                for (ImageModel imageModel4 : arrayList3) {
                                    if (map2.containsKey(Long.valueOf(imageModel4.f12318Oooo0o))) {
                                        ImageModel imageModel5 = (ImageModel) map2.get(Long.valueOf(imageModel4.f12318Oooo0o));
                                        map2.put(Long.valueOf(imageModel5.f12318Oooo0o), imageModel5);
                                    }
                                }
                                arrayList2 = o000O00O.OooO0O0(map2);
                                Collections.sort(arrayList2, new o000O00());
                                z = o000o001.f33250OooO0Oo;
                                o0o0ooo.f33234OooO00o = arrayList2;
                                arrayList = new ArrayList<>();
                                if (arrayList.isEmpty()) {
                                    map = new HashMap();
                                    for (ImageModel imageModel6 : arrayList2) {
                                        fileModel = new FileModel();
                                        fileModel.OooO00o(imageModel6);
                                        if (map.containsKey(imageModel6.f12324OoooO0O)) {
                                            fileModel = (FileModel) map.get(imageModel6.f12324OoooO0O);
                                            fileModel.f12306Oooo++;
                                        } else {
                                            fileModel.f12306Oooo = 1;
                                        }
                                        map.put(imageModel6.f12324OoooO0O, fileModel);
                                    }
                                    arrayList = o000O00O.OooO0O0(map);
                                    Collections.reverse(arrayList);
                                    if (z) {
                                        FileModel fileModel2 = new FileModel();
                                        fileModel2.OooO00o(arrayList2.get(0));
                                        fileModel2.f12308Oooo0oO = 0L;
                                        fileModel2.f12309Oooo0oo = context.getString(OooOOOO.select_picture_string_All_photos);
                                        fileModel2.f12306Oooo = arrayList2.size();
                                        arrayList.add(0, fileModel2);
                                    }
                                }
                                o0o0ooo.f33235OooO0O0 = arrayList;
                                message.obj = o0o0ooo;
                                oooO00o = o000Var.f33248OooO0OO;
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
                        map2.put(Long.valueOf(imageModel3.f12318Oooo0o), imageModel3);
                    }
                    while (r10.hasNext()) {
                        if (map2.containsKey(Long.valueOf(imageModel4.f12318Oooo0o))) {
                            ImageModel imageModel7 = (ImageModel) map2.get(Long.valueOf(imageModel4.f12318Oooo0o));
                            map2.put(Long.valueOf(imageModel7.f12318Oooo0o), imageModel7);
                        }
                    }
                    arrayList2 = o000O00O.OooO0O0(map2);
                    break;
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                Collections.sort(arrayList2, new o000O00());
                z = o000o001.f33250OooO0Oo;
                o0o0ooo.f33234OooO00o = arrayList2;
                arrayList = new ArrayList<>();
                if (arrayList.isEmpty() && !arrayList2.isEmpty()) {
                    map = new HashMap();
                    while (r10.hasNext()) {
                        fileModel = new FileModel();
                        fileModel.OooO00o(imageModel6);
                        if (map.containsKey(imageModel6.f12324OoooO0O)) {
                            fileModel.f12306Oooo = 1;
                        } else {
                            fileModel = (FileModel) map.get(imageModel6.f12324OoooO0O);
                            fileModel.f12306Oooo++;
                        }
                        map.put(imageModel6.f12324OoooO0O, fileModel);
                    }
                    arrayList = o000O00O.OooO0O0(map);
                    Collections.reverse(arrayList);
                    if (z) {
                        FileModel fileModel3 = new FileModel();
                        fileModel3.OooO00o(arrayList2.get(0));
                        fileModel3.f12308Oooo0oO = 0L;
                        fileModel3.f12309Oooo0oo = context.getString(OooOOOO.select_picture_string_All_photos);
                        fileModel3.f12306Oooo = arrayList2.size();
                        arrayList.add(0, fileModel3);
                    }
                }
                o0o0ooo.f33235OooO0O0 = arrayList;
                message.obj = o0o0ooo;
                oooO00o = o000Var.f33248OooO0OO;
                if (oooO00o != null) {
                    oooO00o.sendMessage(message);
                    return;
                }
                return;
            default:
                oOo000Oo this$0 = (oOo000Oo) this.f27896Oooo0oO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String strOooO0OO = o000O0O0.OooO0OO(R.string.title_Room_onMic_0);
                Integer value = o00OO00O.f43313OooooOo.OooO00o().f43338OooOo0o.getValue();
                if (value != null && value.intValue() > 0) {
                    strOooO0OO = o000O0O0.OooO0OO(R.string.title_Room_onMic);
                }
                String strOooO00o = OooOo.OooO00o(strOooO0OO, "" + value);
                oo0oOO0 oo0ooo0 = new oo0oOO0(this$0.f44365OooO00o);
                oo0ooo0.OooOo0O(strOooO00o);
                oo0ooo0.OooOoOO(true);
                oo0ooo0.OooOo0o(oOo00o0o.f44939Oooo0o);
                oo0ooo0.OooOOO0();
                return;
        }
    }
}
