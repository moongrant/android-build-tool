package o0000O0;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.content.res.FontResourcesParserCompat;
import com.facebook.share.internal.ShareInternalUtility;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p022Oooo00O.o00O00OO;
import p031OoooO0.o00Ooo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0o f33534OooO00o = new OooO0o();

    @RequiresApi(16)
    public static class OooO00o {
        @DoNotInline
        public static Cursor OooO00o(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    @NonNull
    public static OooOo OooO00o(@NonNull Context context, @NonNull OooOO0 oooOO1) throws PackageManager.NameNotFoundException {
        Cursor cursorOooO00o;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = oooOO1.f33541OooO00o;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(o00O00OO.OooO00o("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = oooOO1.f33542OooO0O0;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException(o00Ooo.OooO00o("Found content provider ", str, ", but package was not ", str3));
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        OooO0o oooO0o = f33534OooO00o;
        Collections.sort(arrayList, oooO0o);
        List<List<byte[]>> listOooO0O0 = oooOO1.f33544OooO0Oo;
        if (listOooO0O0 == null) {
            listOooO0O0 = FontResourcesParserCompat.OooO0O0(resources, 0);
        }
        int i = 0;
        while (true) {
            if (i >= listOooO0O0.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listOooO0O0.get(i));
            Collections.sort(arrayList2, oooO0o);
            if (arrayList.size() != arrayList2.size()) {
                z = false;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    z = true;
                    break;
                }
                if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new OooOo(1, null);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath(ShareInternalUtility.STAGING_PARAM).build();
        try {
            cursorOooO00o = OooO00o.OooO00o(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{oooOO1.f33543OooO0OO}, null, null);
            if (cursorOooO00o != null) {
                try {
                    if (cursorOooO00o.getCount() > 0) {
                        int columnIndex = cursorOooO00o.getColumnIndex("result_code");
                        arrayList3 = new ArrayList();
                        int columnIndex2 = cursorOooO00o.getColumnIndex("_id");
                        int columnIndex3 = cursorOooO00o.getColumnIndex("file_id");
                        int columnIndex4 = cursorOooO00o.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorOooO00o.getColumnIndex("font_weight");
                        int columnIndex6 = cursorOooO00o.getColumnIndex("font_italic");
                        while (cursorOooO00o.moveToNext()) {
                            arrayList3.add(new Oooo000(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorOooO00o.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorOooO00o.getLong(columnIndex3)), columnIndex4 != -1 ? cursorOooO00o.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorOooO00o.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorOooO00o.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorOooO00o.getInt(columnIndex) : 0));
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorOooO00o != null) {
                        cursorOooO00o.close();
                    }
                    throw th;
                }
            }
            if (cursorOooO00o != null) {
                cursorOooO00o.close();
            }
            return new OooOo(0, (Oooo000[]) arrayList3.toArray(new Oooo000[0]));
        } catch (Throwable th2) {
            th = th2;
            cursorOooO00o = null;
        }
    }
}
