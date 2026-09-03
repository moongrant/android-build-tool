package p105o000oo0o;

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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103o000oo00.OooOo;
import p103o000oo00.o000O000;
import p109o000ooo.o0Oo0oo;
import p111o000oooO.o00O00;
import p111o000oooO.o0O0ooO;
import p321o0O0ooO.o000O0O0;
import p659o0oooO00.o000O0Oo;
import p659o0oooO00.o00O0000;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O0 implements o00O0OO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Uri f35765OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final o0Oo0oo f35766OooO0O0;

    public static final class OooO00o implements o00O0OO0.OooO00o<Uri> {
        @Override // o000oo0o.o00O0OO0.OooO00o
        public final o00O0OO0 OooO00o(Object obj, o0Oo0oo o0oo0oo2) {
            Uri uri = (Uri) obj;
            if (Intrinsics.areEqual(uri.getScheme(), "content")) {
                return new o00O0(uri, o0oo0oo2);
            }
            return null;
        }
    }

    public o00O0(@NotNull Uri uri, @NotNull o0Oo0oo o0oo0oo2) {
        this.f35765OooO00o = uri;
        this.f35766OooO0O0 = o0oo0oo2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x011a  */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x011a, please report this as an issue */
    @Override // p105o000oo0o.o00O0OO0
    @Nullable
    public final Object OooO00o(@NotNull Continuation<? super o00O0O0O> continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        Bundle bundle;
        List<String> pathSegments;
        int size;
        o0Oo0oo o0oo0oo2 = this.f35766OooO0O0;
        ContentResolver contentResolver = o0oo0oo2.f35863OooO00o.getContentResolver();
        Uri uri = this.f35765OooO00o;
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
                o00O00 o00o01 = o0oo0oo2.f35866OooO0Oo;
                o0O0ooO o0o0ooo = o00o01.f35924OooO00o;
                o0O0ooO.OooO00o oooO00o = o0o0ooo instanceof o0O0ooO.OooO00o ? (o0O0ooO.OooO00o) o0o0ooo : null;
                if (oooO00o != null) {
                    o0O0ooO o0o0ooo2 = o00o01.f35925OooO0O0;
                    o0O0ooO.OooO00o oooO00o2 = o0o0ooo2 instanceof o0O0ooO.OooO00o ? (o0O0ooO.OooO00o) o0o0ooo2 : null;
                    if (oooO00o2 != null) {
                        bundle = new Bundle(1);
                        bundle.putParcelable("android.content.extra.SIZE", new Point(oooO00o.f35937OooO00o, oooO00o2.f35937OooO00o));
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
        o00O0000 o00o0000OooO0O0 = o000O0Oo.OooO0O0(o000O0Oo.OooO0oo(inputStreamOpenInputStream));
        OooOo oooOo = new OooOo(uri);
        Bitmap.Config[] configArr = o000O0O0.f42845OooO00o;
        File cacheDir = o0oo0oo2.f35863OooO00o.getCacheDir();
        cacheDir.mkdirs();
        return new oo0oOO0(new o000O000(o00o0000OooO0O0, cacheDir, oooOo), contentResolver.getType(uri), DataSource.DISK);
    }
}
