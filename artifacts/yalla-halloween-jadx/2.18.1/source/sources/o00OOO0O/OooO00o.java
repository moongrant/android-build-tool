package o00OOO0O;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import androidx.compose.runtime.internal.StabilityInferred;
import com.facebook.share.internal.ShareInternalUtility;
import com.umeng.analytics.pro.ao;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooO00o {
    @NotNull
    public static final Bitmap OooO00o(@NotNull Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(w, h, config)");
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    @Nullable
    public static final BitmapFactory.Options OooO0O0(@NotNull Context mContext, @NotNull String imagePath) {
        Uri uriOooO0Oo;
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            if (Build.VERSION.SDK_INT < 29 || (uriOooO0Oo = OooO0Oo(mContext, imagePath)) == null) {
                BitmapFactory.decodeFile(imagePath, options);
            } else {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = mContext.getContentResolver().openFileDescriptor(uriOooO0Oo, "r");
                Intrinsics.checkNotNull(parcelFileDescriptorOpenFileDescriptor);
                BitmapFactory.decodeFileDescriptor(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor(), null, options);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return options;
    }

    @Nullable
    public static final File OooO0OO(@NotNull Context ac, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(ac, "ac");
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (String.valueOf(uri.getScheme()).compareTo("content") != 0) {
            if (String.valueOf(uri.getScheme()).compareTo(ShareInternalUtility.STAGING_PARAM) != 0) {
                return null;
            }
            String string = uri.toString();
            Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
            return new File(StringsKt.OooOo00(string, "file://", ""));
        }
        Cursor cursorQuery = ac.getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        cursorQuery.moveToFirst();
        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
        Intrinsics.checkNotNullExpressionValue(string2, "cursor.getString(cursor.getColumnIndex(\"_data\"))");
        cursorQuery.close();
        return new File(string2);
    }

    @Nullable
    public static final Uri OooO0Oo(@NotNull Context context, @NotNull String imagePath) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imagePath, "imagePath");
        Uri uri = Uri.parse("content://media/external/images/media");
        Cursor cursorQuery = context.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, null, null, null, "bucket_display_name");
        Intrinsics.checkNotNull(cursorQuery);
        cursorQuery.moveToFirst();
        while (!cursorQuery.isAfterLast()) {
            if (Intrinsics.areEqual(imagePath, cursorQuery.getString(cursorQuery.getColumnIndex("_data")))) {
                return Uri.withAppendedPath(uri, "" + cursorQuery.getInt(cursorQuery.getColumnIndex(ao.d)));
            }
            cursorQuery.moveToNext();
        }
        return null;
    }

    @Nullable
    public static final String OooO0o(@NotNull Bitmap bitmap, @Nullable File file, @NotNull String tempPicName) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(tempPicName, "tempPicName");
        try {
            if (!StringsKt__StringsKt.contains$default(tempPicName, ".", false, 2, (Object) null)) {
                tempPicName = tempPicName + ".jpg";
            }
            File file2 = new File(file, tempPicName);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2.getAbsolutePath();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static final String OooO0o0(@Nullable Bitmap bitmap, @Nullable File file) {
        if (bitmap == null) {
            return null;
        }
        String tempPicName = bitmap.hashCode() + "";
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(tempPicName, "tempPicName");
        return OooO0o(bitmap, file, tempPicName);
    }
}
