package o0OOo000;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p364o0OOOooO.o000O0;
import p366o0OOo00O.OooOO0O;
import p366o0OOo00O.OooOOOO;
import p371o0OOo0Oo.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AtomicInteger f38609OooO00o = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f38610OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooOOOO f38611OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Charset f38604OooO0Oo = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f38606OooO0o0 = 15;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final o000O0 f38605OooO0o = new o000O0();

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Comparator<? super File> f38607OooO0oO = new Comparator() { // from class: o0OOo000.OooO0OO
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Charset charset = OooO.f38604OooO0Oo;
            return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    };

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final OooO00o f38608OooO0oo = OooO00o.f38612OooO00o;

    public OooO(OooOO0 oooOO1, OooOOOO oooOOOO) {
        this.f38610OooO0O0 = oooOO1;
        this.f38611OooO0OO = oooOOOO;
    }

    public static void OooO0o(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f38604OooO0Oo);
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

    @NonNull
    public static String OooO0o0(@NonNull File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i = fileInputStream.read(bArr);
                if (i <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), f38604OooO0Oo);
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

    public final void OooO00o(List<File> list) {
        Iterator<File> it = list.iterator();
        while (it.hasNext()) {
            it.next().delete();
        }
    }

    public final List<File> OooO0O0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f38610OooO0O0.OooO0Oo());
        arrayList.addAll(this.f38610OooO0O0.OooO0OO());
        Comparator<? super File> comparator = f38607OooO0oO;
        Collections.sort(arrayList, comparator);
        List<File> listOooO0o0 = this.f38610OooO0O0.OooO0o0();
        Collections.sort(listOooO0o0, comparator);
        arrayList.addAll(listOooO0o0);
        return arrayList;
    }

    public final SortedSet<String> OooO0OO() {
        return new TreeSet(OooOO0.OooOO0(this.f38610OooO0O0.f38618OooO0OO.list())).descendingSet();
    }

    public final void OooO0Oo(@NonNull CrashlyticsReport.OooO.OooO0o oooO0o, @NonNull String str, boolean z) {
        int i = ((OooOO0O) this.f38611OooO0OO).OooO0O0().f38622OooO00o.f38630OooO00o;
        Objects.requireNonNull(f38605OooO0o);
        o00Oo0 o00oo1 = o000O0.f38576OooO00o;
        Objects.requireNonNull(o00oo1);
        StringWriter stringWriter = new StringWriter();
        try {
            o00oo1.OooO00o(oooO0o, stringWriter);
        } catch (IOException unused) {
        }
        try {
            OooO0o(this.f38610OooO0O0.OooO0oO(str, "event" + String.format(Locale.US, "%010d", Integer.valueOf(this.f38609OooO00o.getAndIncrement())) + (z ? "_" : "")), stringWriter.toString());
        } catch (IOException e) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e);
        }
        List<File> listOooOO0 = OooOO0.OooOO0(this.f38610OooO0O0.OooO0o(str).listFiles(new FilenameFilter() { // from class: o0OOo000.OooO0O0
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                Charset charset = OooO.f38604OooO0Oo;
                return str2.startsWith("event") && !str2.endsWith("_");
            }
        }));
        Collections.sort(listOooOO0, new Comparator() { // from class: o0OOo000.OooO0o
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                Charset charset = OooO.f38604OooO0Oo;
                String name = ((File) obj).getName();
                int i2 = OooO.f38606OooO0o0;
                return name.substring(0, i2).compareTo(((File) obj2).getName().substring(0, i2));
            }
        });
        int size = listOooOO0.size();
        for (File file : listOooOO0) {
            if (size <= i) {
                return;
            }
            OooOO0.OooO(file);
            size--;
        }
    }
}
