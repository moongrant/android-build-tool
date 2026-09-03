package p293o0O0OoO0;

import android.util.Log;
import androidx.annotation.NonNull;
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
import p288o0O0Oo.OooO0O0;
import p292o0O0OoO.o00Ooo;
import p292o0O0OoO.o0ooOOo;
import p299o0O0o00.oo000o;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f41691OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOo00 f41692OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final o0ooOOo f41693OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f41686OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f41688OooO0o0 = 15;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final OooO0O0 f41687OooO0o = new OooO0O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final OooOOO0 f41689OooO0oO = new OooOOO0();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooOOO f41690OooO0oo = new OooOOO();

    public OooOOOO(OooOo00 oooOo00, o00Ooo o00ooo2) {
        this.f41692OooO0O0 = oooOo00;
        this.f41693OooO0OO = o00ooo2;
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
                    String str = new String(byteArrayOutputStream.toByteArray(), f41686OooO0Oo);
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
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f41686OooO0Oo);
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
        OooOo00 oooOo00 = this.f41692OooO0O0;
        arrayList.addAll(OooOo00.OooO0o0(oooOo00.f41699OooO0o0.listFiles()));
        arrayList.addAll(OooOo00.OooO0o0(oooOo00.f41698OooO0o.listFiles()));
        OooOOO0 oooOOO0 = f41689OooO0oO;
        Collections.sort(arrayList, oooOOO0);
        List listOooO0o0 = OooOo00.OooO0o0(oooOo00.f41697OooO0Oo.listFiles());
        Collections.sort(listOooO0o0, oooOOO0);
        arrayList.addAll(listOooO0o0);
        return arrayList;
    }

    public final void OooO0OO(@NonNull OooOo oooOo, @NonNull String str, boolean z) {
        OooOo00 oooOo00 = this.f41692OooO0O0;
        int i = ((o00Ooo) this.f41693OooO0OO).OooO0O0().f41675OooO00o.f41684OooO00o;
        f41687OooO0o.getClass();
        oo000o oo000oVar = OooO0O0.f41451OooO00o;
        oo000oVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            oo000oVar.OooO00o(stringWriter, oooOo);
        } catch (IOException unused) {
        }
        try {
            OooO0o0(oooOo00.OooO0O0(str, o000oOoO.OooO0O0("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f41691OooO00o.getAndIncrement())), z ? "_" : "")), stringWriter.toString());
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        OooOO0 oooOO1 = new OooOO0();
        oooOo00.getClass();
        File file = new File(oooOo00.f41696OooO0OO, str);
        file.mkdirs();
        List<File> listOooO0o0 = OooOo00.OooO0o0(file.listFiles(oooOO1));
        Collections.sort(listOooO0o0, new OooOO0O());
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
