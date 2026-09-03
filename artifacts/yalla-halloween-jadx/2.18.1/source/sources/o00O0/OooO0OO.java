package o00O0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import coil.decode.DataSource;
import coil.size.Size;
import java.io.FileNotFoundException;
import java.io.InputStream;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p115o00O00oO.o00oO0o;
import p674o0oooo0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements OooOO0O<Uri> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Context f30071OooO00o;

    public OooO0OO(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30071OooO00o = context;
    }

    @Override // o00O0.OooOO0O
    public final boolean OooO00o(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        return Intrinsics.areEqual(data.getScheme(), "content");
    }

    @Override // o00O0.OooOO0O
    public final String OooO0O0(Uri uri) {
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        String string = data.toString();
        Intrinsics.checkNotNullExpressionValue(string, "data.toString()");
        return string;
    }

    @Override // o00O0.OooOO0O
    public final Object OooO0OO(p113o00O00Oo.OooO0O0 oooO0O0, Uri uri, Size size, o00oO0o o00oo0o2, Continuation continuation) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream;
        Uri data = uri;
        Intrinsics.checkNotNullParameter(data, "data");
        if (Intrinsics.areEqual(data.getAuthority(), "com.android.contacts") && Intrinsics.areEqual(data.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f30071OooO00o.getContentResolver().openAssetFileDescriptor(data, "r");
            inputStreamOpenInputStream = assetFileDescriptorOpenAssetFileDescriptor == null ? null : assetFileDescriptorOpenAssetFileDescriptor.createInputStream();
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + data + "'.").toString());
            }
        } else {
            inputStreamOpenInputStream = this.f30071OooO00o.getContentResolver().openInputStream(data);
            if (inputStreamOpenInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + data + "'.").toString());
            }
        }
        return new Oooo0(o0O000Oo.OooO0OO(o0O000Oo.OooO(inputStreamOpenInputStream)), this.f30071OooO00o.getContentResolver().getType(data), DataSource.DISK);
    }
}
