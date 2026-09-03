package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.share.internal.ShareConstants;
import kotlin.io.ConstantsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class Oooo0 extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String[] f21271OooO0O0 = {"orientation"};

    public enum OooO00o {
        MICRO(3, 96, 96),
        MINI(1, ConstantsKt.MINIMUM_BLOCK_SIZE, 384),
        FULL(2, -1, -1);

        final int androidKind;
        final int height;
        final int width;

        OooO00o(int i, int i2, int i3) {
            this.androidKind = i;
            this.width = i2;
            this.height = i3;
        }
    }

    @Override // com.squareup.picasso.OooOO0O, com.squareup.picasso.o00oO0o
    public final boolean OooO0O0(o00Ooo o00ooo2) {
        Uri uri = o00ooo2.f21321OooO0Oo;
        return "content".equals(uri.getScheme()) && ShareConstants.WEB_DIALOG_PARAM_MEDIA.equals(uri.getAuthority());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003a A[PHI: r3
      0x003a: PHI (r3v2 android.database.Cursor) = (r3v1 android.database.Cursor), (r3v9 android.database.Cursor) binds: [B:19:0x0038, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:35:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00af  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b7  */
    @Override // com.squareup.picasso.OooOO0O, com.squareup.picasso.o00oO0o
    public final o00oO0o.OooO00o OooO0o0(o00Ooo o00ooo2) throws Throwable {
        Cursor cursorQuery;
        int i;
        Uri uri;
        String type;
        boolean z;
        OooO00o oooO00o;
        int i2;
        int i3;
        OooO00o oooO00o2;
        long id;
        BitmapFactory.Options optionsOooO0OO;
        Bitmap thumbnail;
        int i4;
        ContentResolver contentResolver = this.f21247OooO00o.getContentResolver();
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(o00ooo2.f21321OooO0Oo, f21271OooO0O0, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i5 = cursorQuery.getInt(0);
                        cursorQuery.close();
                        i = i5;
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
                uri = o00ooo2.f21321OooO0Oo;
                type = contentResolver.getType(uri);
                if (type == null && type.startsWith("video/")) {
                    z = true;
                } else {
                    z = false;
                }
                if (o00ooo2.OooO00o()) {
                    oooO00o = OooO00o.MICRO;
                    i2 = oooO00o.width;
                    i3 = o00ooo2.f21324OooO0oO;
                    int i6 = o00ooo2.f21325OooO0oo;
                    if (i3 <= i2 || i6 > oooO00o.height) {
                        oooO00o = OooO00o.MINI;
                        if (i3 <= oooO00o.width || i6 > oooO00o.height) {
                            oooO00o = OooO00o.FULL;
                        }
                    }
                    oooO00o2 = oooO00o;
                    if (z && oooO00o2 == OooO00o.FULL) {
                        return new o00oO0o.OooO00o(null, OooO0oO(o00ooo2), Picasso.LoadedFrom.DISK, i);
                    }
                    id = ContentUris.parseId(uri);
                    optionsOooO0OO = o00oO0o.OooO0OO(o00ooo2);
                    optionsOooO0OO.inJustDecodeBounds = true;
                    o00oO0o.OooO00o(o00ooo2.f21324OooO0oO, o00ooo2.f21325OooO0oo, oooO00o2.width, oooO00o2.height, optionsOooO0OO, o00ooo2);
                    if (z) {
                        if (oooO00o2 == OooO00o.FULL) {
                            i4 = 1;
                        } else {
                            i4 = oooO00o2.androidKind;
                        }
                        thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, i4, optionsOooO0OO);
                    } else {
                        thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, oooO00o2.androidKind, optionsOooO0OO);
                    }
                    if (thumbnail != null) {
                        return new o00oO0o.OooO00o(thumbnail, null, Picasso.LoadedFrom.DISK, i);
                    }
                }
                return new o00oO0o.OooO00o(null, OooO0oO(o00ooo2), Picasso.LoadedFrom.DISK, i);
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
        uri = o00ooo2.f21321OooO0Oo;
        type = contentResolver.getType(uri);
        if (type == null) {
            z = false;
        } else {
            z = false;
        }
        if (o00ooo2.OooO00o()) {
            oooO00o = OooO00o.MICRO;
            i2 = oooO00o.width;
            i3 = o00ooo2.f21324OooO0oO;
            int i7 = o00ooo2.f21325OooO0oo;
            if (i3 <= i2) {
                oooO00o = OooO00o.MINI;
                if (i3 <= oooO00o.width) {
                    oooO00o = OooO00o.FULL;
                } else {
                    oooO00o = OooO00o.FULL;
                }
            } else {
                oooO00o = OooO00o.MINI;
                if (i3 <= oooO00o.width) {
                    oooO00o = OooO00o.FULL;
                } else {
                    oooO00o = OooO00o.FULL;
                }
            }
            oooO00o2 = oooO00o;
            if (z) {
            }
            id = ContentUris.parseId(uri);
            optionsOooO0OO = o00oO0o.OooO0OO(o00ooo2);
            optionsOooO0OO.inJustDecodeBounds = true;
            o00oO0o.OooO00o(o00ooo2.f21324OooO0oO, o00ooo2.f21325OooO0oo, oooO00o2.width, oooO00o2.height, optionsOooO0OO, o00ooo2);
            if (z) {
                if (oooO00o2 == OooO00o.FULL) {
                    i4 = 1;
                } else {
                    i4 = oooO00o2.androidKind;
                }
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, id, i4, optionsOooO0OO);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, id, oooO00o2.androidKind, optionsOooO0OO);
            }
            if (thumbnail != null) {
                return new o00oO0o.OooO00o(thumbnail, null, Picasso.LoadedFrom.DISK, i);
            }
        }
        return new o00oO0o.OooO00o(null, OooO0oO(o00ooo2), Picasso.LoadedFrom.DISK, i);
    }
}
