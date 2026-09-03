package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p154o00Oo0oo.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final StackTraceElement[] f13062OooO = new StackTraceElement[0];

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final List<Throwable> f13063OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public DataSource f13064OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o0OOO0o f13065OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public Class<?> f13066OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final String f13067OooO0oo;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void OooO00o(Throwable th, ArrayList arrayList) {
        if (!(th instanceof GlideException)) {
            arrayList.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f13063OooO0Oo.iterator();
        while (it.hasNext()) {
            OooO00o(it.next(), arrayList);
        }
    }

    public static void OooO0O0(List list, OooO00o oooO00o) {
        try {
            OooO0OO(list, oooO00o);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO0OO(List list, OooO00o oooO00o) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            oooO00o.append("Cause (");
            int i2 = i + 1;
            oooO00o.append(String.valueOf(i2));
            oooO00o.append(" of ");
            oooO00o.append(String.valueOf(size));
            oooO00o.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).OooO0o(oooO00o);
            } else {
                OooO0Oo(th, oooO00o);
            }
            i = i2;
        }
    }

    public static void OooO0Oo(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void OooO0o(Appendable appendable) {
        OooO0Oo(this, appendable);
        OooO0O0(this.f13063OooO0Oo, new OooO00o(appendable));
    }

    public final void OooO0o0() {
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i("Glide", sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f13067OooO0oo);
        sb.append(this.f13066OooO0oO != null ? ", " + this.f13066OooO0oO : "");
        sb.append(this.f13064OooO0o != null ? ", " + this.f13064OooO0o : "");
        sb.append(this.f13065OooO0o0 != null ? ", " + this.f13065OooO0o0 : "");
        ArrayList<Throwable> arrayList = new ArrayList();
        OooO00o(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" root causes:");
        }
        for (Throwable th : arrayList) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        OooO0o(System.err);
    }

    public GlideException(String str, List<Throwable> list) {
        this.f13067OooO0oo = str;
        setStackTrace(f13062OooO);
        this.f13063OooO0Oo = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        OooO0o(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        OooO0o(printWriter);
    }

    public static final class OooO00o implements Appendable {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Appendable f13068OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f13069OooO0o0 = true;

        public OooO00o(Appendable appendable) {
            this.f13068OooO0Oo = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            boolean z = this.f13069OooO0o0;
            Appendable appendable = this.f13068OooO0Oo;
            if (z) {
                this.f13069OooO0o0 = false;
                appendable.append("  ");
            }
            this.f13069OooO0o0 = c == '\n';
            appendable.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            append(charSequence, 0, charSequence.length());
            return this;
        }

        @Override // java.lang.Appendable
        public final Appendable append(@Nullable CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = this.f13069OooO0o0;
            Appendable appendable = this.f13068OooO0Oo;
            boolean z2 = false;
            if (z) {
                this.f13069OooO0o0 = false;
                appendable.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z2 = true;
            }
            this.f13069OooO0o0 = z2;
            appendable.append(charSequence, i, i2);
            return this;
        }
    }
}
