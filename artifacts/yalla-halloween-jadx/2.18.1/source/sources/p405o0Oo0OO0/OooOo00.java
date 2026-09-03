package p405o0Oo0OO0;

import android.content.Context;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.opensource.svgaplayer.proto.MovieEntity;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import org.conscrypt.EvpMdRef;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 {

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static ThreadPoolExecutor f39077OooO0OO = new ThreadPoolExecutor(3, 10, 60000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public OooO00o f39078OooO00o = new OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Context f39079OooO0O0;

    public static final class OooO extends Lambda implements Function1<InputStream, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ URL f39081Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39082Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(URL url, OooO0O0 oooO0O0) {
            super(1);
            this.f39081Oooo0oO = url;
            this.f39082Oooo0oo = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InputStream inputStream) {
            OooOo00 oooOo00 = OooOo00.this;
            URL url = this.f39081Oooo0oO;
            Objects.requireNonNull(oooOo00);
            String string = url.toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "url.toString()");
            oooOo00.OooO0oo(inputStream, oooOo00.OooO0o(string), this.f39082Oooo0oo, false);
            return Unit.INSTANCE;
        }
    }

    public static class OooO00o {
    }

    public interface OooO0O0 {
        void onComplete(@NotNull OooOo oooOo);

        void onError();
    }

    public static final class OooO0OO implements Runnable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39083Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ InputStream f39085Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f39086Oooo0oo;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ boolean f39087OoooO00;

        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ OooOo f39088Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ OooO0OO f39089Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(OooOo oooOo, OooO0OO oooO0OO) {
                super(0);
                this.f39088Oooo0o = oooOo;
                this.f39089Oooo0oO = oooO0OO;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                OooO0OO oooO0OO = this.f39089Oooo0oO;
                OooOo00 oooOo00 = OooOo00.this;
                OooOo oooOo = this.f39088Oooo0o;
                OooO0O0 oooO0O0 = oooO0OO.f39083Oooo;
                ThreadPoolExecutor threadPoolExecutor = OooOo00.f39077OooO0OO;
                oooOo00.OooOO0(oooOo, oooO0O0);
                return Unit.INSTANCE;
            }
        }

        public OooO0OO(InputStream inputStream, String str, OooO0O0 oooO0O0, boolean z) {
            this.f39085Oooo0oO = inputStream;
            this.f39086Oooo0oo = str;
            this.f39083Oooo = oooO0O0;
            this.f39087OoooO00 = z;
        }

        @Override // java.lang.Runnable
        public final void run() throws IOException {
            try {
                try {
                    byte[] bArrOooO0OO = OooOo00.OooO0OO(OooOo00.this, this.f39085Oooo0oO);
                    if (bArrOooO0OO != null) {
                        if (bArrOooO0OO.length > 4 && bArrOooO0OO[0] == 80 && bArrOooO0OO[1] == 75 && bArrOooO0OO[2] == 3 && bArrOooO0OO[3] == 4) {
                            if (!OooOo00.this.OooO0o0(this.f39086Oooo0oo).exists()) {
                                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
                                try {
                                    OooOo00.OooO0Oo(OooOo00.this, byteArrayInputStream, this.f39086Oooo0oo);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayInputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(byteArrayInputStream, th);
                                        throw th2;
                                    }
                                }
                            }
                            OooOo00.OooO00o(OooOo00.this, this.f39086Oooo0oo, this.f39083Oooo);
                        } else {
                            byte[] bArrOooO0O0 = OooOo00.OooO0O0(OooOo00.this, bArrOooO0OO);
                            if (bArrOooO0O0 != null) {
                                MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(bArrOooO0O0);
                                Intrinsics.checkExpressionValueIsNotNull(movieEntityDecode, "MovieEntity.ADAPTER.decode(it)");
                                OooOo oooOo = new OooOo(movieEntityDecode, new File(this.f39086Oooo0oo));
                                oooOo.OooO00o(new OooO00o(oooOo, this));
                            }
                        }
                    }
                    if (!this.f39087OoooO00) {
                        return;
                    }
                } catch (Exception e) {
                    OooOo00.this.OooOO0O(e, this.f39083Oooo);
                    if (!this.f39087OoooO00) {
                        return;
                    }
                }
                this.f39085Oooo0oO.close();
            } catch (Throwable th3) {
                if (this.f39087OoooO00) {
                    this.f39085Oooo0oO.close();
                }
                throw th3;
            }
        }
    }

    public static final class OooO0o implements Runnable {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ URL f39091Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39092Oooo0oo;

        public OooO0o(URL url, OooO0O0 oooO0O0) {
            this.f39091Oooo0oO = url;
            this.f39092Oooo0oo = oooO0O0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OooOo00 oooOo00 = OooOo00.this;
            URL url = this.f39091Oooo0oO;
            Objects.requireNonNull(oooOo00);
            String string = url.toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "url.toString()");
            OooOo00.OooO00o(oooOo00, oooOo00.OooO0o(string), this.f39092Oooo0oo);
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<Exception, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39094Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(OooO0O0 oooO0O0) {
            super(1);
            this.f39094Oooo0oO = oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Exception exc) {
            OooOo00.this.OooOO0O(exc, this.f39094Oooo0oO);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39095Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ OooOo f39096Oooo0oO;

        public OooOO0O(OooO0O0 oooO0O0, OooOo oooOo) {
            this.f39095Oooo0o = oooO0O0;
            this.f39096Oooo0oO = oooOo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f39095Oooo0o.onComplete(this.f39096Oooo0oO);
        }
    }

    public static final class OooOOO0 implements Runnable {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f39097Oooo0o;

        public OooOOO0(OooO0O0 oooO0O0) {
            this.f39097Oooo0o = oooO0O0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f39097Oooo0o.onError();
        }
    }

    public OooOo00(@NotNull Context context) {
        this.f39079OooO0O0 = context;
    }

    public static final void OooO00o(OooOo00 oooOo00, @NotNull String str, @NotNull OooO0O0 oooO0O0) {
        Objects.requireNonNull(oooOo00);
        try {
            StringBuilder sb = new StringBuilder();
            File cacheDir = oooOo00.f39079OooO0O0.getCacheDir();
            Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
            sb.append(cacheDir.getAbsolutePath());
            sb.append("/");
            sb.append(str);
            sb.append("/");
            File file = new File(sb.toString());
            File file2 = new File(file, "movie.binary");
            if (!file2.isFile()) {
                file2 = null;
            }
            if (file2 != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file2);
                    try {
                        MovieEntity movieEntityDecode = MovieEntity.ADAPTER.decode(fileInputStream);
                        Intrinsics.checkExpressionValueIsNotNull(movieEntityDecode, "MovieEntity.ADAPTER.decode(it)");
                        oooOo00.OooOO0(new OooOo(movieEntityDecode, file), oooO0O0);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(fileInputStream, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(fileInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Exception e) {
                    file.delete();
                    file2.delete();
                    throw e;
                }
            }
            File file3 = new File(file, "movie.spec");
            if (!file3.isFile()) {
                file3 = null;
            }
            if (file3 != null) {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file3);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            byte[] bArr = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
                            while (true) {
                                int i = fileInputStream2.read(bArr, 0, RecyclerView.oo0o0Oo.FLAG_MOVED);
                                if (i == -1) {
                                    oooOo00.OooOO0(new OooOo(new JSONObject(byteArrayOutputStream.toString()), file), oooO0O0);
                                    Unit unit2 = Unit.INSTANCE;
                                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                                    CloseableKt.closeFinally(fileInputStream2, null);
                                    return;
                                }
                                byteArrayOutputStream.write(bArr, 0, i);
                                try {
                                    throw th;
                                } catch (Throwable th3) {
                                    CloseableKt.closeFinally(fileInputStream2, th);
                                    throw th3;
                                }
                            }
                        } catch (Throwable th4) {
                            try {
                                throw th4;
                            } catch (Throwable th5) {
                                CloseableKt.closeFinally(byteArrayOutputStream, th4);
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                } catch (Exception e2) {
                    file.delete();
                    file3.delete();
                    throw e2;
                }
            }
        } catch (Exception e3) {
            oooOo00.OooOO0O(e3, oooO0O0);
        }
    }

    @Nullable
    public static final byte[] OooO0O0(OooOo00 oooOo00, @NotNull byte[] bArr) {
        Objects.requireNonNull(oooOo00);
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int iInflate = inflater.inflate(bArr2, 0, RecyclerView.oo0o0Oo.FLAG_MOVED);
                if (iInflate <= 0) {
                    inflater.end();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr2, 0, iInflate);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(byteArrayOutputStream, th);
                    throw th2;
                }
            }
        }
    }

    @Nullable
    public static final byte[] OooO0OO(OooOo00 oooOo00, @NotNull InputStream inputStream) {
        Objects.requireNonNull(oooOo00);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
            while (true) {
                int i = inputStream.read(bArr, 0, RecyclerView.oo0o0Oo.FLAG_MOVED);
                if (i <= 0) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    CloseableKt.closeFinally(byteArrayOutputStream, null);
                    return byteArray;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(byteArrayOutputStream, th);
                throw th2;
            }
        }
    }

    public static final void OooO0Oo(OooOo00 oooOo00, @NotNull InputStream inputStream, @NotNull String str) {
        Objects.requireNonNull(oooOo00);
        int i = 0;
        synchronized (i) {
            File fileOooO0o0 = oooOo00.OooO0o0(str);
            fileOooO0o0.mkdirs();
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
                    while (true) {
                        try {
                            ZipEntry nextEntry = zipInputStream.getNextEntry();
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                Intrinsics.checkExpressionValueIsNotNull(name, "zipItem.name");
                                if (!StringsKt__StringsKt.contains$default(name, "/", false, 2, (Object) null)) {
                                    FileOutputStream fileOutputStream = new FileOutputStream(new File(fileOooO0o0, nextEntry.getName()));
                                    try {
                                        byte[] bArr = new byte[RecyclerView.oo0o0Oo.FLAG_MOVED];
                                        while (true) {
                                            int i2 = zipInputStream.read(bArr);
                                            if (i2 <= 0) {
                                                break;
                                            } else {
                                                fileOutputStream.write(bArr, 0, i2);
                                            }
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(fileOutputStream, null);
                                        zipInputStream.closeEntry();
                                    } catch (Throwable th) {
                                        try {
                                            throw th;
                                        } catch (Throwable th2) {
                                            CloseableKt.closeFinally(fileOutputStream, th);
                                            throw th2;
                                        }
                                    }
                                }
                            } else {
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(zipInputStream, null);
                                CloseableKt.closeFinally(bufferedInputStream, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                CloseableKt.closeFinally(zipInputStream, th3);
                                throw th4;
                            }
                        }
                        try {
                            throw th;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(bufferedInputStream, th);
                            throw th5;
                        }
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            } catch (Exception e) {
                fileOooO0o0.delete();
                throw e;
            }
        }
    }

    @Nullable
    public final Function0<Unit> OooO(@NotNull URL url, @NotNull OooO0O0 oooO0O0) {
        String string = url.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "url.toString()");
        if (OooO0o0(OooO0o(string)).exists()) {
            f39077OooO0OO.execute(new OooO0o(url, oooO0O0));
            return null;
        }
        OooO00o oooO00o = this.f39078OooO00o;
        OooO oooO = new OooO(url, oooO0O0);
        OooOO0 oooOO1 = new OooOO0(oooO0O0);
        Objects.requireNonNull(oooO00o);
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = false;
        OooOOOO oooOOOO = new OooOOOO(booleanRef);
        f39077OooO0OO.execute(new OooOOO(oooO00o, url, booleanRef, oooO, oooOO1));
        return oooOOOO;
    }

    public final String OooO0o(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(EvpMdRef.MD5.JCA_NAME);
        Charset charsetForName = Charset.forName("UTF-8");
        Intrinsics.checkExpressionValueIsNotNull(charsetForName, "Charset.forName(charsetName)");
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        byte[] bytes = str.getBytes(charsetForName);
        Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
        messageDigest.update(bytes);
        String string = "";
        for (byte b : messageDigest.digest()) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str2 = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
            Intrinsics.checkExpressionValueIsNotNull(str2, "java.lang.String.format(format, *args)");
            sbOooO0o0.append(str2);
            string = sbOooO0o0.toString();
        }
        return string;
    }

    public final File OooO0o0(String str) {
        StringBuilder sb = new StringBuilder();
        File cacheDir = this.f39079OooO0O0.getCacheDir();
        Intrinsics.checkExpressionValueIsNotNull(cacheDir, "context.cacheDir");
        sb.append(cacheDir.getAbsolutePath());
        sb.append("/");
        sb.append(str);
        sb.append("/");
        return new File(sb.toString());
    }

    public final void OooO0oO(@NotNull String str, @NotNull OooO0O0 oooO0O0) {
        try {
            InputStream inputStreamOpen = this.f39079OooO0O0.getAssets().open(str);
            if (inputStreamOpen != null) {
                OooO0oo(inputStreamOpen, OooO0o("file:///assets/" + str), oooO0O0, true);
            }
        } catch (Exception e) {
            OooOO0O(e, oooO0O0);
        }
    }

    public final void OooO0oo(@NotNull InputStream inputStream, @NotNull String str, @NotNull OooO0O0 oooO0O0, boolean z) {
        f39077OooO0OO.execute(new OooO0OO(inputStream, str, oooO0O0, z));
    }

    public final void OooOO0(OooOo oooOo, OooO0O0 oooO0O0) {
        new Handler(this.f39079OooO0O0.getMainLooper()).post(new OooOO0O(oooO0O0, oooOo));
    }

    public final void OooOO0O(Exception exc, OooO0O0 oooO0O0) {
        exc.printStackTrace();
        new Handler(this.f39079OooO0O0.getMainLooper()).post(new OooOOO0(oooO0O0));
    }
}
