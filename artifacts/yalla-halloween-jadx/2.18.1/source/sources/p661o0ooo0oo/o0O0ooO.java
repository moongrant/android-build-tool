package p661o0ooo0oo;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p016OooOoO0.OooOo00;
import p058o0000OoO.OooO;
import p659o0ooo0o.o00OOO00;
import p664o0oooO00.o000000;
import p664o0oooO00.o000000O;
import p667o0oooOO.s;
import p668o0oooOO0.o0O0oo0o;
import p668o0oooOO0.o0oO0O0o;
import p674o0oooo0.o00Oo00;
import p674o0oooo0.o0O000Oo;
import p674o0oooo0.o0O00o00;
import p674o0oooo0.o0O0O0O;
import p674o0oooo0.o0oOOo;
import p674o0oooo0.oo00oO;

/* JADX INFO: loaded from: classes3.dex */
public final class o0O0ooO implements Closeable, Flushable {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final Regex f51504Oooooo = new Regex("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f51505OoooooO = "CLEAN";

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f51506Ooooooo = "DIRTY";

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f51507o0OoOo0 = "REMOVE";

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final String f51508ooOO = "READ";

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final File f51509Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public long f51510Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final File f51511Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final File f51512Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public int f51513OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public oo00oO f51514OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f51515OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap<String, OooO0O0> f51516OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    public boolean f51517OoooOO0;

    /* JADX INFO: renamed from: OoooOOO, reason: collision with root package name */
    public boolean f51518OoooOOO;

    /* JADX INFO: renamed from: OoooOOo, reason: collision with root package name */
    public boolean f51519OoooOOo;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public boolean f51520OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f51521OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public long f51522OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public final o000000 f51523Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public final o00O000 f51524Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o0O0oo0o f51525OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final File f51526OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final int f51527OooooOo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public final int f51528Oooooo0;

    /* JADX INFO: renamed from: o000oOoO, reason: collision with root package name */
    public boolean f51529o000oOoO;

    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final boolean[] f51530OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f51531OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final OooO0O0 f51532OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO f51533OooO0Oo;

        /* JADX INFO: renamed from: o0ooo0oo.o0O0ooO$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0429OooO00o extends Lambda implements Function1<IOException, Unit> {
            public C0429OooO00o() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(IOException iOException) {
                Unit unit;
                IOException it = iOException;
                Intrinsics.checkNotNullParameter(it, "it");
                synchronized (OooO00o.this.f51533OooO0Oo) {
                    OooO00o.this.OooO0OO();
                    unit = Unit.INSTANCE;
                }
                return unit;
            }
        }

        public OooO00o(@NotNull o0O0ooO o0o0ooo, OooO0O0 entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            this.f51533OooO0Oo = o0o0ooo;
            this.f51532OooO0OO = entry;
            this.f51530OooO00o = entry.f51539OooO0Oo ? null : new boolean[o0o0ooo.f51528Oooooo0];
        }

        public final void OooO00o() throws IOException {
            synchronized (this.f51533OooO0Oo) {
                if (!(!this.f51531OooO0O0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.f51532OooO0OO.f51540OooO0o, this)) {
                    this.f51533OooO0Oo.OooO0O0(this, false);
                }
                this.f51531OooO0O0 = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void OooO0O0() throws IOException {
            synchronized (this.f51533OooO0Oo) {
                if (!(!this.f51531OooO0O0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.f51532OooO0OO.f51540OooO0o, this)) {
                    this.f51533OooO0Oo.OooO0O0(this, true);
                }
                this.f51531OooO0O0 = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void OooO0OO() throws IOException {
            if (Intrinsics.areEqual(this.f51532OooO0OO.f51540OooO0o, this)) {
                o0O0ooO o0o0ooo = this.f51533OooO0Oo;
                if (o0o0ooo.f51529o000oOoO) {
                    o0o0ooo.OooO0O0(this, false);
                } else {
                    this.f51532OooO0OO.f51541OooO0o0 = true;
                }
            }
        }

        /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<java.io.File>] */
        @NotNull
        public final o0O00o00 OooO0Oo(int i) {
            synchronized (this.f51533OooO0Oo) {
                if (!(!this.f51531OooO0O0)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics.areEqual(this.f51532OooO0OO.f51540OooO0o, this)) {
                    return new o00Oo00();
                }
                if (!this.f51532OooO0OO.f51539OooO0Oo) {
                    boolean[] zArr = this.f51530OooO00o;
                    Intrinsics.checkNotNull(zArr);
                    zArr[i] = true;
                }
                try {
                    return new o00O000o(this.f51533OooO0Oo.f51525OooooO0.OooO0O0((File) this.f51532OooO0OO.f51538OooO0OO.get(i)), new C0429OooO00o());
                } catch (FileNotFoundException unused) {
                    return new o00Oo00();
                }
            }
        }
    }

    public final class OooO0O0 {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        @NotNull
        public final String f51535OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final long[] f51536OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final List<File> f51537OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final List<File> f51538OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public boolean f51539OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        @Nullable
        public OooO00o f51540OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f51541OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public int f51542OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public long f51543OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO f51544OooOO0;

        /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList, java.util.List<java.io.File>] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList, java.util.List<java.io.File>] */
        public OooO0O0(@NotNull o0O0ooO o0o0ooo, String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.f51544OooOO0 = o0o0ooo;
            this.f51535OooO = key;
            this.f51536OooO00o = new long[o0o0ooo.f51528Oooooo0];
            this.f51537OooO0O0 = new ArrayList();
            this.f51538OooO0OO = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append('.');
            int length = sb.length();
            int i = o0o0ooo.f51528Oooooo0;
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(i2);
                this.f51537OooO0O0.add(new File(o0o0ooo.f51526OooooOO, sb.toString()));
                sb.append(".tmp");
                this.f51538OooO0OO.add(new File(o0o0ooo.f51526OooooOO, sb.toString()));
                sb.setLength(length);
            }
        }

        public final Void OooO00o(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList, java.util.List<java.io.File>] */
        @Nullable
        public final OooO0OO OooO0O0() {
            o0O0ooO o0o0ooo = this.f51544OooOO0;
            byte[] bArr = o00OOO00.f51183OooO00o;
            if (!this.f51539OooO0Oo) {
                return null;
            }
            if (!o0o0ooo.f51529o000oOoO && (this.f51540OooO0o != null || this.f51541OooO0o0)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f51536OooO00o.clone();
            try {
                int i = this.f51544OooOO0.f51528Oooooo0;
                for (int i2 = 0; i2 < i; i2++) {
                    o0O0O0O o0o0o0oOooO00o = this.f51544OooOO0.f51525OooooO0.OooO00o((File) this.f51537OooO0O0.get(i2));
                    if (!this.f51544OooOO0.f51529o000oOoO) {
                        this.f51542OooO0oO++;
                        o0o0o0oOooO00o = new o00oOoo(this, o0o0o0oOooO00o, o0o0o0oOooO00o);
                    }
                    arrayList.add(o0o0o0oOooO00o);
                }
                return new OooO0OO(this.f51544OooOO0, this.f51535OooO, this.f51543OooO0oo, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o00OOO00.OooO0Oo((o0O0O0O) it.next());
                }
                try {
                    this.f51544OooOO0.OooOoo(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void OooO0OO(@NotNull oo00oO writer) throws IOException {
            Intrinsics.checkNotNullParameter(writer, "writer");
            for (long j : this.f51536OooO00o) {
                writer.Oooo000(32).o0000O0(j);
            }
        }
    }

    public final class OooO0OO implements Closeable {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ o0O0ooO f51545Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final String f51546Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final long f51547Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final List<o0O0O0O> f51548Oooo0oo;

        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(@NotNull o0O0ooO o0o0ooo, String key, @NotNull long j, @NotNull List<? extends o0O0O0O> sources, long[] lengths) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(sources, "sources");
            Intrinsics.checkNotNullParameter(lengths, "lengths");
            this.f51545Oooo = o0o0ooo;
            this.f51546Oooo0o = key;
            this.f51547Oooo0oO = j;
            this.f51548Oooo0oo = sources;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator<o0O0O0O> it = this.f51548Oooo0oo.iterator();
            while (it.hasNext()) {
                o00OOO00.OooO0Oo(it.next());
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function1<IOException, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IOException iOException) {
            IOException it = iOException;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O0ooO o0o0ooo = o0O0ooO.this;
            byte[] bArr = o00OOO00.f51183OooO00o;
            o0o0ooo.f51517OoooOO0 = true;
            return Unit.INSTANCE;
        }
    }

    public o0O0ooO(@NotNull File directory, long j, @NotNull o000000O taskRunner) {
        o0oO0O0o fileSystem = o0O0oo0o.f51922OooO00o;
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        Intrinsics.checkNotNullParameter(directory, "directory");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f51525OooooO0 = fileSystem;
        this.f51526OooooOO = directory;
        this.f51527OooooOo = 201105;
        this.f51528Oooooo0 = 2;
        this.f51510Oooo0o = j;
        this.f51516OoooO0O = new LinkedHashMap<>(0, 0.75f, true);
        this.f51523Ooooo00 = taskRunner.OooO0o();
        this.f51524Ooooo0o = new o00O000(this, OooO.OooO00o(new StringBuilder(), o00OOO00.f51189OooO0oO, " Cache"));
        if (!(j > 0)) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.f51511Oooo0oO = new File(directory, "journal");
        this.f51512Oooo0oo = new File(directory, "journal.tmp");
        this.f51509Oooo = new File(directory, "journal.bkp");
    }

    public final synchronized void OooO00o() {
        if (!(!this.f51519OoooOOo)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    public final synchronized void OooO0O0(@NotNull OooO00o editor, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(editor, "editor");
        OooO0O0 oooO0O0 = editor.f51532OooO0OO;
        if (!Intrinsics.areEqual(oooO0O0.f51540OooO0o, editor)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (z && !oooO0O0.f51539OooO0Oo) {
            int i = this.f51528Oooooo0;
            for (int i2 = 0; i2 < i; i2++) {
                boolean[] zArr = editor.f51530OooO00o;
                Intrinsics.checkNotNull(zArr);
                if (!zArr[i2]) {
                    editor.OooO00o();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                }
                if (!this.f51525OooooO0.OooO0Oo((File) oooO0O0.f51538OooO0OO.get(i2))) {
                    editor.OooO00o();
                    return;
                }
            }
        }
        int i3 = this.f51528Oooooo0;
        for (int i4 = 0; i4 < i3; i4++) {
            File file = (File) oooO0O0.f51538OooO0OO.get(i4);
            if (!z || oooO0O0.f51541OooO0o0) {
                this.f51525OooooO0.OooO0o(file);
            } else if (this.f51525OooooO0.OooO0Oo(file)) {
                File file2 = (File) oooO0O0.f51537OooO0O0.get(i4);
                this.f51525OooooO0.OooO0o0(file, file2);
                long j = oooO0O0.f51536OooO00o[i4];
                long jOooO0oo = this.f51525OooooO0.OooO0oo(file2);
                oooO0O0.f51536OooO00o[i4] = jOooO0oo;
                this.f51515OoooO00 = (this.f51515OoooO00 - j) + jOooO0oo;
            }
        }
        oooO0O0.f51540OooO0o = null;
        if (oooO0O0.f51541OooO0o0) {
            OooOoo(oooO0O0);
            return;
        }
        this.f51513OoooO++;
        oo00oO oo00oo = this.f51514OoooO0;
        Intrinsics.checkNotNull(oo00oo);
        if (oooO0O0.f51539OooO0Oo || z) {
            oooO0O0.f51539OooO0Oo = true;
            oo00oo.OoooOoo(f51505OoooooO).Oooo000(32);
            oo00oo.OoooOoo(oooO0O0.f51535OooO);
            oooO0O0.OooO0OO(oo00oo);
            oo00oo.Oooo000(10);
            if (z) {
                long j2 = this.f51522OoooOoo;
                this.f51522OoooOoo = 1 + j2;
                oooO0O0.f51543OooO0oo = j2;
            }
        } else {
            this.f51516OoooO0O.remove(oooO0O0.f51535OooO);
            oo00oo.OoooOoo(f51507o0OoOo0).Oooo000(32);
            oo00oo.OoooOoo(oooO0O0.f51535OooO);
            oo00oo.Oooo000(10);
        }
        oo00oo.flush();
        if (this.f51515OoooO00 > this.f51510Oooo0o || OooOOO()) {
            this.f51523Ooooo00.OooO0OO(this.f51524Ooooo0o, 0L);
        }
    }

    @JvmOverloads
    @Nullable
    public final synchronized OooO00o OooO0Oo(@NotNull String key, long j) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        OooO0oo();
        OooO00o();
        Oooo0(key);
        OooO0O0 oooO0O0 = this.f51516OoooO0O.get(key);
        if (j != -1 && (oooO0O0 == null || oooO0O0.f51543OooO0oo != j)) {
            return null;
        }
        if ((oooO0O0 != null ? oooO0O0.f51540OooO0o : null) != null) {
            return null;
        }
        if (oooO0O0 != null && oooO0O0.f51542OooO0oO != 0) {
            return null;
        }
        if (!this.f51520OoooOo0 && !this.f51521OoooOoO) {
            oo00oO oo00oo = this.f51514OoooO0;
            Intrinsics.checkNotNull(oo00oo);
            oo00oo.OoooOoo(f51506Ooooooo).Oooo000(32).OoooOoo(key).Oooo000(10);
            oo00oo.flush();
            if (this.f51517OoooOO0) {
                return null;
            }
            if (oooO0O0 == null) {
                oooO0O0 = new OooO0O0(this, key);
                this.f51516OoooO0O.put(key, oooO0O0);
            }
            OooO00o oooO00o = new OooO00o(this, oooO0O0);
            oooO0O0.f51540OooO0o = oooO00o;
            return oooO00o;
        }
        this.f51523Ooooo00.OooO0OO(this.f51524Ooooo0o, 0L);
        return null;
    }

    @Nullable
    public final synchronized OooO0OO OooO0o(@NotNull String key) throws IOException {
        Intrinsics.checkNotNullParameter(key, "key");
        OooO0oo();
        OooO00o();
        Oooo0(key);
        OooO0O0 oooO0O0 = this.f51516OoooO0O.get(key);
        if (oooO0O0 == null) {
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(oooO0O0, "lruEntries[key] ?: return null");
        OooO0OO oooO0OOOooO0O0 = oooO0O0.OooO0O0();
        if (oooO0OOOooO0O0 == null) {
            return null;
        }
        this.f51513OoooO++;
        oo00oO oo00oo = this.f51514OoooO0;
        Intrinsics.checkNotNull(oo00oo);
        oo00oo.OoooOoo(f51508ooOO).Oooo000(32).OoooOoo(key).Oooo000(10);
        if (OooOOO()) {
            this.f51523Ooooo00.OooO0OO(this.f51524Ooooo0o, 0L);
        }
        return oooO0OOOooO0O0;
    }

    public final synchronized void OooO0oo() throws IOException {
        boolean z;
        byte[] bArr = o00OOO00.f51183OooO00o;
        if (this.f51518OoooOOO) {
            return;
        }
        if (this.f51525OooooO0.OooO0Oo(this.f51509Oooo)) {
            if (this.f51525OooooO0.OooO0Oo(this.f51511Oooo0oO)) {
                this.f51525OooooO0.OooO0o(this.f51509Oooo);
            } else {
                this.f51525OooooO0.OooO0o0(this.f51509Oooo, this.f51511Oooo0oO);
            }
        }
        o0O0oo0o isCivilized = this.f51525OooooO0;
        File file = this.f51509Oooo;
        Intrinsics.checkNotNullParameter(isCivilized, "$this$isCivilized");
        Intrinsics.checkNotNullParameter(file, "file");
        o0O00o00 o0o00o00OooO0O0 = isCivilized.OooO0O0(file);
        try {
            try {
                isCivilized.OooO0o(file);
                CloseableKt.closeFinally(o0o00o00OooO0O0, null);
                z = true;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(o0o00o00OooO0O0, th);
                    throw th2;
                }
            }
        } catch (IOException unused) {
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(o0o00o00OooO0O0, null);
            isCivilized.OooO0o(file);
            z = false;
        }
        this.f51529o000oOoO = z;
        if (this.f51525OooooO0.OooO0Oo(this.f51511Oooo0oO)) {
            try {
                OooOo0O();
                OooOOoo();
                this.f51518OoooOOO = true;
                return;
            } catch (IOException e) {
                s.OooO00o oooO00o = s.f51921OooO0OO;
                s.f51919OooO00o.OooO("DiskLruCache " + this.f51526OooooOO + " is corrupt: " + e.getMessage() + ", removing", 5, e);
                try {
                    close();
                    this.f51525OooooO0.OooO0OO(this.f51526OooooOO);
                    this.f51519OoooOOo = false;
                    OooOoOO();
                    this.f51518OoooOOO = true;
                } catch (Throwable th3) {
                    this.f51519OoooOOo = false;
                    throw th3;
                }
            }
        }
        OooOoOO();
        this.f51518OoooOOO = true;
    }

    public final boolean OooOOO() {
        int i = this.f51513OoooO;
        return i >= 2000 && i >= this.f51516OoooO0O.size();
    }

    public final oo00oO OooOOo() throws FileNotFoundException {
        return o0O000Oo.OooO0O0(new o00O000o(this.f51525OooooO0.OooO0oO(this.f51511Oooo0oO), new OooO0o()));
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    public final void OooOOoo() throws IOException {
        this.f51525OooooO0.OooO0o(this.f51512Oooo0oo);
        Iterator<OooO0O0> it = this.f51516OoooO0O.values().iterator();
        while (it.hasNext()) {
            OooO0O0 next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "i.next()");
            OooO0O0 oooO0O0 = next;
            int i = 0;
            if (oooO0O0.f51540OooO0o == null) {
                int i2 = this.f51528Oooooo0;
                while (i < i2) {
                    this.f51515OoooO00 += oooO0O0.f51536OooO00o[i];
                    i++;
                }
            } else {
                oooO0O0.f51540OooO0o = null;
                int i3 = this.f51528Oooooo0;
                while (i < i3) {
                    this.f51525OooooO0.OooO0o((File) oooO0O0.f51537OooO0O0.get(i));
                    this.f51525OooooO0.OooO0o((File) oooO0O0.f51538OooO0OO.get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final void OooOo0O() throws IOException {
        o0oOOo o0ooooOooO0OO = o0O000Oo.OooO0OO(this.f51525OooooO0.OooO00o(this.f51511Oooo0oO));
        try {
            String strO0ooOO0 = o0ooooOooO0OO.o0ooOO0();
            String strO0ooOO1 = o0ooooOooO0OO.o0ooOO0();
            String strO0ooOO2 = o0ooooOooO0OO.o0ooOO0();
            String strO0ooOO3 = o0ooooOooO0OO.o0ooOO0();
            String strO0ooOO4 = o0ooooOooO0OO.o0ooOO0();
            if (!(!Intrinsics.areEqual("libcore.io.DiskLruCache", strO0ooOO0)) && !(!Intrinsics.areEqual("1", strO0ooOO1)) && !(!Intrinsics.areEqual(String.valueOf(this.f51527OooooOo), strO0ooOO2)) && !(!Intrinsics.areEqual(String.valueOf(this.f51528Oooooo0), strO0ooOO3))) {
                int i = 0;
                if (!(strO0ooOO4.length() > 0)) {
                    while (true) {
                        try {
                            OooOoO(o0ooooOooO0OO.o0ooOO0());
                            i++;
                        } catch (EOFException unused) {
                            this.f51513OoooO = i - this.f51516OoooO0O.size();
                            if (o0ooooOooO0OO.OooOooo()) {
                                this.f51514OoooO0 = OooOOo();
                            } else {
                                OooOoOO();
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(o0ooooOooO0OO, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + strO0ooOO0 + ", " + strO0ooOO1 + ", " + strO0ooOO3 + ", " + strO0ooOO4 + ']');
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(o0ooooOooO0OO, th);
                throw th2;
            }
        }
    }

    public final void OooOoO(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(OooOo00.OooO0Oo("unexpected journal line: ", str));
        }
        int i = iIndexOf$default + 1;
        int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ' ', i, false, 4, (Object) null);
        if (iIndexOf$default2 == -1) {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            strSubstring = str.substring(i);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            String str2 = f51507o0OoOo0;
            if (iIndexOf$default == str2.length() && StringsKt.OooOoOO(str, str2)) {
                this.f51516OoooO0O.remove(strSubstring);
                return;
            }
        } else {
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            strSubstring = str.substring(i, iIndexOf$default2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        OooO0O0 oooO0O0 = this.f51516OoooO0O.get(strSubstring);
        if (oooO0O0 == null) {
            oooO0O0 = new OooO0O0(this, strSubstring);
            this.f51516OoooO0O.put(strSubstring, oooO0O0);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = f51505OoooooO;
            if (iIndexOf$default == str3.length() && StringsKt.OooOoOO(str, str3)) {
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                List<String> strings = StringsKt__StringsKt.split$default(strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                oooO0O0.f51539OooO0Oo = true;
                oooO0O0.f51540OooO0o = null;
                Intrinsics.checkNotNullParameter(strings, "strings");
                if (strings.size() != oooO0O0.f51544OooOO0.f51528Oooooo0) {
                    oooO0O0.OooO00o(strings);
                    throw null;
                }
                try {
                    int size = strings.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        oooO0O0.f51536OooO00o[i2] = Long.parseLong(strings.get(i2));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    oooO0O0.OooO00o(strings);
                    throw null;
                }
            }
        }
        if (iIndexOf$default2 == -1) {
            String str4 = f51506Ooooooo;
            if (iIndexOf$default == str4.length() && StringsKt.OooOoOO(str, str4)) {
                oooO0O0.f51540OooO0o = new OooO00o(this, oooO0O0);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = f51508ooOO;
            if (iIndexOf$default == str5.length() && StringsKt.OooOoOO(str, str5)) {
                return;
            }
        }
        throw new IOException(OooOo00.OooO0Oo("unexpected journal line: ", str));
    }

    public final synchronized void OooOoOO() throws IOException {
        try {
            oo00oO oo00oo = this.f51514OoooO0;
            if (oo00oo != null) {
                oo00oo.close();
            }
            oo00oO oo00ooOooO0O0 = o0O000Oo.OooO0O0(this.f51525OooooO0.OooO0O0(this.f51512Oooo0oo));
            try {
                oo00ooOooO0O0.OoooOoo("libcore.io.DiskLruCache").Oooo000(10);
                oo00ooOooO0O0.OoooOoo("1").Oooo000(10);
                oo00ooOooO0O0.o0000O0(this.f51527OooooOo);
                oo00ooOooO0O0.Oooo000(10);
                oo00ooOooO0O0.o0000O0(this.f51528Oooooo0);
                oo00ooOooO0O0.Oooo000(10);
                oo00ooOooO0O0.Oooo000(10);
                for (OooO0O0 oooO0O0 : this.f51516OoooO0O.values()) {
                    if (oooO0O0.f51540OooO0o != null) {
                        oo00ooOooO0O0.OoooOoo(f51506Ooooooo).Oooo000(32);
                        oo00ooOooO0O0.OoooOoo(oooO0O0.f51535OooO);
                        oo00ooOooO0O0.Oooo000(10);
                    } else {
                        oo00ooOooO0O0.OoooOoo(f51505OoooooO).Oooo000(32);
                        oo00ooOooO0O0.OoooOoo(oooO0O0.f51535OooO);
                        oooO0O0.OooO0OO(oo00ooOooO0O0);
                        oo00ooOooO0O0.Oooo000(10);
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(oo00ooOooO0O0, null);
                if (this.f51525OooooO0.OooO0Oo(this.f51511Oooo0oO)) {
                    this.f51525OooooO0.OooO0o0(this.f51511Oooo0oO, this.f51509Oooo);
                }
                this.f51525OooooO0.OooO0o0(this.f51512Oooo0oo, this.f51511Oooo0oO);
                this.f51525OooooO0.OooO0o(this.f51509Oooo);
                this.f51514OoooO0 = OooOOo();
                this.f51517OoooOO0 = false;
                this.f51521OoooOoO = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(oo00ooOooO0O0, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.ArrayList, java.util.List<java.io.File>] */
    public final void OooOoo(@NotNull OooO0O0 entry) throws IOException {
        oo00oO oo00oo;
        Intrinsics.checkNotNullParameter(entry, "entry");
        if (!this.f51529o000oOoO) {
            if (entry.f51542OooO0oO > 0 && (oo00oo = this.f51514OoooO0) != null) {
                oo00oo.OoooOoo(f51506Ooooooo);
                oo00oo.Oooo000(32);
                oo00oo.OoooOoo(entry.f51535OooO);
                oo00oo.Oooo000(10);
                oo00oo.flush();
            }
            if (entry.f51542OooO0oO > 0 || entry.f51540OooO0o != null) {
                entry.f51541OooO0o0 = true;
                return;
            }
        }
        OooO00o oooO00o = entry.f51540OooO0o;
        if (oooO00o != null) {
            oooO00o.OooO0OO();
        }
        int i = this.f51528Oooooo0;
        for (int i2 = 0; i2 < i; i2++) {
            this.f51525OooooO0.OooO0o((File) entry.f51537OooO0O0.get(i2));
            long j = this.f51515OoooO00;
            long[] jArr = entry.f51536OooO00o;
            this.f51515OoooO00 = j - jArr[i2];
            jArr[i2] = 0;
        }
        this.f51513OoooO++;
        oo00oO oo00oo2 = this.f51514OoooO0;
        if (oo00oo2 != null) {
            oo00oo2.OoooOoo(f51507o0OoOo0);
            oo00oo2.Oooo000(32);
            oo00oo2.OoooOoo(entry.f51535OooO);
            oo00oo2.Oooo000(10);
        }
        this.f51516OoooO0O.remove(entry.f51535OooO);
        if (OooOOO()) {
            this.f51523Ooooo00.OooO0OO(this.f51524Ooooo0o, 0L);
        }
    }

    public final void Oooo0(String str) {
        if (f51504Oooooo.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + Typography.quote).toString());
    }

    public final void Oooo00o() throws IOException {
        boolean z;
        do {
            z = false;
            if (this.f51515OoooO00 <= this.f51510Oooo0o) {
                this.f51520OoooOo0 = false;
                return;
            }
            for (OooO0O0 toEvict : this.f51516OoooO0O.values()) {
                if (!toEvict.f51541OooO0o0) {
                    Intrinsics.checkNotNullExpressionValue(toEvict, "toEvict");
                    OooOoo(toEvict);
                    z = true;
                    break;
                }
            }
        } while (z);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.f51518OoooOOO && !this.f51519OoooOOo) {
            Collection<OooO0O0> collectionValues = this.f51516OoooO0O.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "lruEntries.values");
            Object[] array = collectionValues.toArray(new OooO0O0[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            for (OooO0O0 oooO0O0 : (OooO0O0[]) array) {
                OooO00o oooO00o = oooO0O0.f51540OooO0o;
                if (oooO00o != null && oooO00o != null) {
                    oooO00o.OooO0OO();
                }
            }
            Oooo00o();
            oo00oO oo00oo = this.f51514OoooO0;
            Intrinsics.checkNotNull(oo00oo);
            oo00oo.close();
            this.f51514OoooO0 = null;
            this.f51519OoooOOo = true;
            return;
        }
        this.f51519OoooOOo = true;
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (this.f51518OoooOOO) {
            OooO00o();
            Oooo00o();
            oo00oO oo00oo = this.f51514OoooO0;
            Intrinsics.checkNotNull(oo00oo);
            oo00oo.flush();
        }
    }
}
