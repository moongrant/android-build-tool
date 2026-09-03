package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.share.internal.ShareConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO extends OooO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f19751OooO0O0 = {"orientation"};

    public enum OooO00o {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);

        public final int androidKind;
        public final int height;
        public final int width;

        OooO00o(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    public OooOOO(Context context) {
        super(context);
    }

    @Override // com.squareup.picasso.OooO, com.squareup.picasso.o0OoOo0
    public final boolean OooO0OO(Oooo0 oooo0) {
        Uri uri = oooo0.f19769OooO0Oo;
        return "content".equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003c A[PHI: r3
      0x003c: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v12 android.database.Cursor) binds: [B:20:0x003a, B:13:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00bc  */
    @Override // com.squareup.picasso.OooO, com.squareup.picasso.o0OoOo0
    public final o0OoOo0.OooO00o OooO0o(Oooo0 oooo0) throws Throwable {
        Cursor cursorQuery;
        int i;
        String type;
        boolean z;
        int i2;
        OooO00o oooO00o;
        OooO00o oooO00o2;
        long id;
        BitmapFactory.Options optionsOooO0Oo;
        Bitmap thumbnail;
        int i3;
        ContentResolver contentResolver = this.f19689OooO00o.getContentResolver();
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(oooo0.f19769OooO0Oo, f19751OooO0O0, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i4 = cursorQuery.getInt(0);
                        cursorQuery.close();
                        i = i4;
                    }
                } catch (RuntimeException unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
                type = contentResolver.getType(oooo0.f19769OooO0Oo);
                if (type == null && type.startsWith("video/")) {
                    z = true;
                } else {
                    z = false;
                }
                if (oooo0.OooO00o()) {
                    i2 = oooo0.f19772OooO0oO;
                    int i5 = oooo0.f19773OooO0oo;
                    oooO00o = OooO00o.MICRO;
                    if (i2 <= oooO00o.width || i5 > oooO00o.height) {
                        oooO00o = OooO00o.MINI;
                        if (i2 <= oooO00o.width || i5 > oooO00o.height) {
                            oooO00o = OooO00o.FULL;
                        }
                    }
                    oooO00o2 = oooO00o;
                    if (z && oooO00o2 == OooO00o.FULL) {
                        return new o0OoOo0.OooO00o(null, OooO0oo(oooo0), Picasso.LoadedFrom.DISK, i);
                    }
                    id = ContentUris.parseId(oooo0.f19769OooO0Oo);
                    optionsOooO0Oo = o0OoOo0.OooO0Oo(oooo0);
                    optionsOooO0Oo.inJustDecodeBounds = true;
                    o0OoOo0.OooO00o(oooo0.f19772OooO0oO, oooo0.f19773OooO0oo, oooO00o2.width, oooO00o2.height, optionsOooO0Oo, oooo0);
                    if (z) {
                        if (oooO00o2 == OooO00o.FULL) {
                            i3 = 1;
                        } else {
                            i3 = oooO00o2.androidKind;
                        }
                        thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, i3, optionsOooO0Oo);
                    } else {
                        thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, oooO00o2.androidKind, optionsOooO0Oo);
                    }
                    if (thumbnail != null) {
                        return new o0OoOo0.OooO00o(thumbnail, null, Picasso.LoadedFrom.DISK, i);
                    }
                }
                return new o0OoOo0.OooO00o(null, OooO0oo(oooo0), Picasso.LoadedFrom.DISK, i);
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (RuntimeException unused2) {
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        i = 0;
        type = contentResolver.getType(oooo0.f19769OooO0Oo);
        if (type == null) {
            z = false;
        } else {
            z = false;
        }
        if (oooo0.OooO00o()) {
            i2 = oooo0.f19772OooO0oO;
            int i6 = oooo0.f19773OooO0oo;
            oooO00o = OooO00o.MICRO;
            if (i2 <= oooO00o.width) {
                oooO00o = OooO00o.MINI;
                if (i2 <= oooO00o.width) {
                    oooO00o = OooO00o.FULL;
                } else {
                    oooO00o = OooO00o.FULL;
                }
            } else {
                oooO00o = OooO00o.MINI;
                if (i2 <= oooO00o.width) {
                    oooO00o = OooO00o.FULL;
                } else {
                    oooO00o = OooO00o.FULL;
                }
            }
            oooO00o2 = oooO00o;
            if (z) {
            }
            id = ContentUris.parseId(oooo0.f19769OooO0Oo);
            optionsOooO0Oo = o0OoOo0.OooO0Oo(oooo0);
            optionsOooO0Oo.inJustDecodeBounds = true;
            o0OoOo0.OooO00o(oooo0.f19772OooO0oO, oooo0.f19773OooO0oo, oooO00o2.width, oooO00o2.height, optionsOooO0Oo, oooo0);
            if (z) {
                if (oooO00o2 == OooO00o.FULL) {
                    i3 = 1;
                } else {
                    i3 = oooO00o2.androidKind;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, i3, optionsOooO0Oo);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, oooO00o2.androidKind, optionsOooO0Oo);
            }
            if (thumbnail != null) {
                return new o0OoOo0.OooO00o(thumbnail, null, Picasso.LoadedFrom.DISK, i);
            }
        }
        return new o0OoOo0.OooO00o(null, OooO0oo(oooo0), Picasso.LoadedFrom.DISK, i);
    }
}
