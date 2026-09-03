package OooO0O0;

import android.graphics.Bitmap;
import com.yallatech.support.platform.YCSDKOpenKit;
import com.yallatech.support.platform.YallaChatContentProvider;
import com.yallatech.support.platform.exception.YallaException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO0OO f88OooO00o = new OooO0OO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static File f89OooO0O0;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final UUID f90OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final Bitmap f91OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final String f92OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public final String f93OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final boolean f94OooO0o0;

        public OooO00o(@NotNull UUID callId, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.f90OooO00o = callId;
            this.f91OooO0O0 = bitmap;
            if (bitmap == null) {
                throw new YallaException("Cannot share media without a bitmap or Uri set");
            }
            this.f94OooO0o0 = true;
            String string = UUID.randomUUID().toString();
            this.f93OooO0Oo = string;
            int i = YallaChatContentProvider.f32394OooO0Oo;
            String thirdApplicationId$lib_release = YCSDKOpenKit.INSTANCE.getThirdApplicationId$lib_release();
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.f92OooO0OO = OooO0O0.OooO00o(new Object[]{"content://com.yallatech.support.platform.YallaChatContentProvider", thirdApplicationId$lib_release, callId.toString(), string}, 4, "%s%s/%s/%s", "java.lang.String.format(format, *args)");
        }
    }

    @JvmStatic
    @Nullable
    public static final File OooO0O0(@Nullable UUID callId, @Nullable String str) throws FileNotFoundException {
        if (callId != null) {
            if (!(str == null || str.length() == 0)) {
                try {
                    Intrinsics.checkNotNullParameter(callId, "callId");
                    File file = f89OooO0O0 == null ? null : new File(f89OooO0O0, callId.toString());
                    if (file == null) {
                        return null;
                    }
                    try {
                        return new File(file, URLEncoder.encode(str, "UTF-8"));
                    } catch (UnsupportedEncodingException unused) {
                        return null;
                    }
                } catch (IOException unused2) {
                    throw new FileNotFoundException();
                }
            }
        }
        throw new FileNotFoundException();
    }

    @NotNull
    public final synchronized File OooO00o() {
        File file;
        if (f89OooO0O0 == null) {
            f89OooO0O0 = new File(YCSDKOpenKit.getApplicationContext$lib_release().getCacheDir(), "com.yallatech.support.platform.files");
        }
        file = f89OooO0O0;
        Intrinsics.checkNotNull(file);
        return file;
    }
}
