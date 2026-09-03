package p125o00O0o0O;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import coil.decode.DataSource;
import com.facebook.share.internal.ShareConstants;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import o00OO00O.OooOo00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p124o00O0o00.OooOO0O;
import p124o00O0o00.o0000OO0;
import p130o00O0oo.o000O0Oo;
import p130o00O0oo.o000Oo0;
import p131o00O0oo0.o0O0O00;
import p662o0oooO0O.o0OO;
import p662o0oooO0O.o0o0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00Oo0 implements o0ooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f36601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0O0O00 f36602OooO0O0;

    public static final class OooO00o implements o0ooOOo.OooO00o<Uri> {
        @Override // o00O0o0O.o0ooOOo.OooO00o
        public final o0ooOOo OooO00o(Object obj, o0O0O00 o0o0o00) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                return new o00Oo0(uri, o0o0o00);
            }
            return null;
        }
    }

    public o00Oo0(@NotNull Uri uri, @NotNull o0O0O00 o0o0o00) {
        this.f36601OooO00o = uri;
        this.f36602OooO0O0 = o0o0o00;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x011a, please report this as an issue */
    @Override // p125o00O0o0O.o0ooOOo
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00oO0o> continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        Bundle bundle;
        List<String> pathSegments;
        int size;
        o0O0O00 o0o0o00 = this.f36602OooO0O0;
        ContentResolver contentResolver = o0o0o00.f36838OooO00o.getContentResolver();
        Uri uri = this.f36601OooO00o;
        boolean z = false;
        if (Intrinsics.areEqual(uri.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor != null ? assetFileDescriptorOpenAssetFileDescriptor.createInputStream() : null;
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT < 29) {
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        } else {
            if (Intrinsics.areEqual(uri.getAuthority(), ShareConstants.WEB_DIALOG_PARAM_MEDIA) && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.areEqual(pathSegments.get(size - 3), "audio") && Intrinsics.areEqual(pathSegments.get(size - 2), "albums")) {
                z = true;
            }
            if (z) {
                o000O0Oo o000o0oo2 = o0o0o00.f36841OooO0Oo;
                o000Oo0 o000oo1 = o000o0oo2.f36771OooO00o;
                o000Oo0.OooO00o oooO00o = o000oo1 instanceof o000Oo0.OooO00o ? (o000Oo0.OooO00o) o000oo1 : null;
                if (oooO00o != null) {
                    o000Oo0 o000oo2 = o000o0oo2.f36772OooO0O0;
                    o000Oo0.OooO00o oooO00o2 = o000oo2 instanceof o000Oo0.OooO00o ? (o000Oo0.OooO00o) o000oo2 : null;
                    if (oooO00o2 != null) {
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(oooO00o.f36777OooO00o, oooO00o2.f36777OooO00o));
                    } else {
                        bundle = null;
                    }
                } else {
                    bundle = null;
                }
                AssetFileDescriptor assetFileDescriptorOpenTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                inputStreamOpenInputStream = assetFileDescriptorOpenTypedAssetFile != null ? assetFileDescriptorOpenTypedAssetFile.createInputStream() : null;
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                }
            } else {
                inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
                }
            }
        }
        o0o0000 o0o0000VarOooO0O0 = o0OO.OooO0O0(o0OO.OooO0oo(inputStreamOpenInputStream));
        OooOO0O oooOO0O = new OooOO0O(uri);
        Bitmap.Config[] configArr = OooOo00.f37081OooO00o;
        File cacheDir = o0o0o00.f36838OooO00o.getCacheDir();
        cacheDir.mkdirs();
        return new oo0o0Oo(new o0000OO0(o0o0000VarOooO0O0, cacheDir, oooOO0O), contentResolver.getType(uri), DataSource.DISK);
    }
}
