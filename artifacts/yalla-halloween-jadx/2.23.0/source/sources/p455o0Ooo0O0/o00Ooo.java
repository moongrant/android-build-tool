package p455o0Ooo0O0;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.webkit.MimeTypeMap;
import androidx.compose.runtime.MutableState;
import com.code.android.util.OooOOO;
import com.code.android.util.Oooo000;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.yalla.yalla.model.media.MediaVideoInfo;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import p450o0Ooo00.OooO;
import p453o0Ooo00o.o00Oo0;
import p468o0OoooO0.o0OO0;
import p468o0OoooO0.o0OO0O0;

/* JADX INFO: loaded from: classes4.dex */
public final class o00Ooo extends Lambda implements Function0<Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ oo0o0Oo f46560OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MutableState<Boolean> f46561OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Context f46562OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f46563OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final /* synthetic */ Function1<Uri, Unit> f46564OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o00Ooo(oo0o0Oo oo0o0oo, Context context, MutableState<Boolean> mutableState, CoroutineScope coroutineScope, Function1<? super Uri, Unit> function1) {
        super(0);
        this.f46560OooO0Oo = oo0o0oo;
        this.f46562OooO0o0 = context;
        this.f46561OooO0o = mutableState;
        this.f46563OooO0oO = coroutineScope;
        this.f46564OooO0oo = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String mimeType;
        OutputStream outputStreamOpenOutputStream;
        MutableState<Boolean> mutableState = this.f46561OooO0o;
        Function1<Uri, Unit> function1 = this.f46564OooO0oo;
        oo0o0Oo oo0o0oo = this.f46560OooO0Oo;
        o0OO0O0.OooO00o("_PreView", "onNextClick uri :   " + oo0o0oo.OooO0Oo().getUri());
        if (oo0o0oo.OooO0Oo().isPicture()) {
            Uri uri = oo0o0oo.OooO0Oo().getUri();
            Context context = this.f46562OooO0o0;
            File file = Oooo000.OooO0O0(context, uri);
            if (file != null) {
                Lazy lazy = o0OO0.f46906OooO00o;
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(file, "file");
                Uri uri2 = null;
                if (file.exists()) {
                    Uri uriFromFile = Uri.fromFile(file);
                    Intrinsics.checkNotNullParameter(context, "context");
                    if (uriFromFile == null) {
                        mimeType = null;
                    } else {
                        mimeType = context.getContentResolver().getType(uriFromFile);
                        if (mimeType == null || Intrinsics.areEqual("application/octet-stream", mimeType)) {
                            String extension = MimeTypeMap.getFileExtensionFromUrl(uriFromFile.toString());
                            MimeTypeMap singleton = MimeTypeMap.getSingleton();
                            Intrinsics.checkNotNullExpressionValue(extension, "extension");
                            String lowerCase = extension.toLowerCase();
                            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                            mimeType = singleton.getMimeTypeFromExtension(lowerCase);
                        }
                        if (mimeType != null) {
                            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                            if (Intrinsics.areEqual(mimeType, "image/jpg") && MimeTypeMap.getSingleton().hasMimeType("image/jpeg")) {
                                mimeType = "image/jpeg";
                            }
                        } else {
                            mimeType = "";
                        }
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_display_name", file.getName());
                    contentValues.put("mime_type", mimeType);
                    contentValues.put("relative_path", Environment.DIRECTORY_PICTURES + "/Yalla");
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
                    if (uriInsert != null) {
                        try {
                            outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        outputStreamOpenOutputStream = null;
                    }
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[4096];
                    if (outputStreamOpenOutputStream != null) {
                        while (true) {
                            try {
                                int i = fileInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                outputStreamOpenOutputStream.write(bArr, 0, i);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    CloseableKt.closeFinally(outputStreamOpenOutputStream, th);
                                    throw th2;
                                }
                            }
                            e.printStackTrace();
                        }
                        outputStreamOpenOutputStream.flush();
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStreamOpenOutputStream, null);
                    }
                    uri2 = uriInsert;
                }
                o0OO0O0.OooO00o("_PreView", "takePicture  result uri: " + uri2);
                if (uri2 != null) {
                    function1.invoke(uri2);
                }
            }
        } else {
            MediaVideoInfo videoInfo = oo0o0oo.OooO0Oo().getVideoInfo();
            Intrinsics.checkNotNull(videoInfo);
            if (videoInfo.getVideoPlayRangeEnd() > oo0o0oo.OooO0Oo().getVideoDuration()) {
                o000O00O.OooO0O0(o0000.OooO0OO(OooO.process_video_error));
            } else {
                oo0o0oo.f46604OooO0o0.setValue(Boolean.FALSE);
                OooOOO.OooO0O0(this.f46563OooO0oO, new o00oO0o(oo0o0oo, mutableState, new o00Oo0(0), function1, null));
            }
        }
        return Unit.INSTANCE;
    }
}
