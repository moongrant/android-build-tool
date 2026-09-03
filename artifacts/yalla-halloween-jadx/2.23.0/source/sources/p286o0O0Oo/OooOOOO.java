package p286o0O0Oo;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.compose.ui.text.android.OooO0o;
import com.google.firebase.crashlytics.internal.model.OooOo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p004OooO0oO.o000oOoO;
import p288o0O0Oo0O.OooOOO;
import p291o0O0OoO0.o00000O0;
import p291o0O0OoO0.o0000Ooo;
import p295o0O0OooO.oo00o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f42238OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f42239OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0000Ooo f42240OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f42233OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f42235OooO0o0 = 15;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooOOO f42234OooO0o = new OooOOO();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooO0o f42236OooO0oO = new OooO0o(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooOOO f42237OooO0oo = new OooOOO();

    public OooOOOO(OooOo00 oooOo00, o00000O0 o00000o1) {
        this.f42239OooO0O0 = oooOo00;
        this.f42240OooO0OO = o00000o1;
    }

    public static void OooO00o(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    @NonNull
    public static String OooO0Oo(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f42233OooO0Oo);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void OooO0o0(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f42233OooO0Oo);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList OooO0O0() {
        ArrayList arrayList = new ArrayList();
        OooOo00 oooOo00 = this.f42239OooO0O0;
        arrayList.addAll(OooOo00.OooO0o0(oooOo00.f42246OooO0o0.listFiles()));
        arrayList.addAll(OooOo00.OooO0o0(oooOo00.f42245OooO0o.listFiles()));
        OooO0o oooO0o = f42236OooO0oO;
        Collections.sort(arrayList, oooO0o);
        List listOooO0o0 = OooOo00.OooO0o0(oooOo00.f42244OooO0Oo.listFiles());
        Collections.sort(listOooO0o0, oooO0o);
        arrayList.addAll(listOooO0o0);
        return arrayList;
    }

    public final void OooO0OO(@NonNull OooOo oooOo, @NonNull String str, boolean z) {
        OooOo00 oooOo00 = this.f42239OooO0O0;
        int i = ((o00000O0) this.f42240OooO0OO).OooO0O0().f42285OooO00o.f42294OooO00o;
        f42234OooO0o.getClass();
        oo00o oo00oVar = OooOOO.f42269OooO00o;
        oo00oVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            oo00oVar.OooO00o(stringWriter, oooOo);
        } catch (IOException unused) {
        }
        try {
            OooO0o0(oooOo00.OooO0O0(str, o000oOoO.OooO00o("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f42238OooO00o.getAndIncrement())), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        OooOO0O oooOO0O = new OooOO0O();
        oooOo00.getClass();
        File file = new File(oooOo00.f42243OooO0OO, str);
        file.mkdirs();
        List<File> listOooO0o0 = OooOo00.OooO0o0(file.listFiles(oooOO0O));
        Collections.sort(listOooO0o0, new OooOOO0());
        int size = listOooO0o0.size();
        for (File file2 : listOooO0o0) {
            if (size <= i) {
                return;
            }
            OooOo00.OooO0Oo(file2);
            size--;
        }
    }
}
