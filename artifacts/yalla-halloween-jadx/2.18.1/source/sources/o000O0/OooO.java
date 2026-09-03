package o000O0;

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
import com.umeng.analytics.pro.ao;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f28041OooO00o = 0;

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
        String str = oooOO1.f28049OooO00o;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(p016OooOoO0.OooOo00.OooO0Oo("No package found for authority: ", str));
        }
        if (!providerInfoResolveContentProvider.packageName.equals(oooOO1.f28050OooO0O0)) {
            StringBuilder sbOooO0OO = OooO0o.OooO0o.OooO0OO("Found content provider ", str, ", but package was not ");
            sbOooO0OO.append(oooOO1.f28050OooO0O0);
            throw new PackageManager.NameNotFoundException(sbOooO0OO.toString());
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        Collections.sort(arrayList, new Comparator() { // from class: o000O0.OooO0o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int length;
                int length2;
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                int i = OooO.f28041OooO00o;
                if (bArr.length == bArr2.length) {
                    for (int i2 = 0; i2 < bArr.length; i2++) {
                        if (bArr[i2] != bArr2[i2]) {
                            length = bArr[i2];
                            length2 = bArr2[i2];
                        }
                    }
                    return 0;
                }
                length = bArr.length;
                length2 = bArr2.length;
                return length - length2;
            }
        });
        List<List<byte[]>> listOooO0O0 = oooOO1.f28052OooO0Oo;
        if (listOooO0O0 == null) {
            listOooO0O0 = FontResourcesParserCompat.OooO0O0(resources, 0);
        }
        int i = 0;
        while (true) {
            cursorOooO00o = null;
            if (i >= listOooO0O0.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList(listOooO0O0.get(i));
            Collections.sort(arrayList2, new Comparator() { // from class: o000O0.OooO0o
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int length;
                    int length2;
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = (byte[]) obj2;
                    int i2 = OooO.f28041OooO00o;
                    if (bArr.length == bArr2.length) {
                        for (int i3 = 0; i3 < bArr.length; i3++) {
                            if (bArr[i3] != bArr2[i3]) {
                                length = bArr[i3];
                                length2 = bArr2[i3];
                            }
                        }
                        return 0;
                    }
                    length = bArr.length;
                    length2 = bArr2.length;
                    return length - length2;
                }
            });
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
        String str2 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str2).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str2).appendPath(ShareInternalUtility.STAGING_PARAM).build();
        try {
            cursorOooO00o = OooO00o.OooO00o(context.getContentResolver(), uriBuild, new String[]{ao.d, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{oooOO1.f28051OooO0OO}, null, null);
            if (cursorOooO00o != null && cursorOooO00o.getCount() > 0) {
                int columnIndex = cursorOooO00o.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorOooO00o.getColumnIndex(ao.d);
                int columnIndex3 = cursorOooO00o.getColumnIndex("file_id");
                int columnIndex4 = cursorOooO00o.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorOooO00o.getColumnIndex("font_weight");
                int columnIndex6 = cursorOooO00o.getColumnIndex("font_italic");
                while (cursorOooO00o.moveToNext()) {
                    arrayList3.add(new Oooo000(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorOooO00o.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorOooO00o.getLong(columnIndex3)), columnIndex4 != -1 ? cursorOooO00o.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorOooO00o.getInt(columnIndex5) : ShopVehicleListModel.VehicleTagType_Vip400, columnIndex6 != -1 && cursorOooO00o.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorOooO00o.getInt(columnIndex) : 0));
                }
            }
            return new OooOo(0, (Oooo000[]) arrayList3.toArray(new Oooo000[0]));
        } finally {
            if (cursorOooO00o != null) {
                cursorOooO00o.close();
            }
        }
    }
}
