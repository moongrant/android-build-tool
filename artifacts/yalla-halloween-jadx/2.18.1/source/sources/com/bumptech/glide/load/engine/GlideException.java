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
import p217o00oO00o.o000000;

/* JADX INFO: loaded from: classes.dex */
public final class GlideException extends Exception {

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public static final StackTraceElement[] f12492OoooO0 = new StackTraceElement[0];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public Class<?> f12493Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final List<Throwable> f12494Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public o000000 f12495Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public DataSource f12496Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public String f12497OoooO00;

    public GlideException(String str) {
        this(str, Collections.emptyList());
    }

    public static void OooO0O0(List<Throwable> list, Appendable appendable) {
        try {
            OooO0OO(list, appendable);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO0OO(List<Throwable> list, Appendable appendable) throws IOException {
        int size = list.size();
        int i = 0;
        while (i < size) {
            OooO00o oooO00o = (OooO00o) appendable;
            oooO00o.append("Cause (");
            int i2 = i + 1;
            oooO00o.append(String.valueOf(i2));
            oooO00o.append(" of ");
            oooO00o.append(String.valueOf(size));
            oooO00o.append("): ");
            Throwable th = list.get(i);
            if (th instanceof GlideException) {
                ((GlideException) th).OooO0o(appendable);
            } else {
                OooO0Oo(th, appendable);
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

    public final void OooO00o(Throwable th, List<Throwable> list) {
        if (!(th instanceof GlideException)) {
            list.add(th);
            return;
        }
        Iterator<Throwable> it = ((GlideException) th).f12494Oooo0o.iterator();
        while (it.hasNext()) {
            OooO00o(it.next(), list);
        }
    }

    public final void OooO0o(Appendable appendable) {
        OooO0Oo(this, appendable);
        OooO0O0(this.f12494Oooo0o, new OooO00o(appendable));
    }

    public final void OooO0o0() {
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Root cause (");
            int i2 = i + 1;
            sbOooO0o0.append(i2);
            sbOooO0o0.append(" of ");
            sbOooO0o0.append(size);
            sbOooO0o0.append(")");
            Log.i("Glide", sbOooO0o0.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String string;
        String string2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.f12497OoooO00);
        String string3 = "";
        if (this.f12493Oooo != null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(", ");
            sbOooO0o0.append(this.f12493Oooo);
            string = sbOooO0o0.toString();
        } else {
            string = "";
        }
        sb.append(string);
        if (this.f12496Oooo0oo != null) {
            StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0(", ");
            sbOooO0o1.append(this.f12496Oooo0oo);
            string2 = sbOooO0o1.toString();
        } else {
            string2 = "";
        }
        sb.append(string2);
        if (this.f12495Oooo0oO != null) {
            StringBuilder sbOooO0o2 = OooO00o.OooO00o.OooO0o0(", ");
            sbOooO0o2.append(this.f12495Oooo0oO);
            string3 = sbOooO0o2.toString();
        }
        sb.append(string3);
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
        this.f12497OoooO00 = str;
        setStackTrace(f12492OoooO0);
        this.f12494Oooo0o = list;
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final Appendable f12498Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public boolean f12499Oooo0oO = true;

        public OooO00o(Appendable appendable) {
            this.f12498Oooo0o = appendable;
        }

        @Override // java.lang.Appendable
        public final Appendable append(char c) throws IOException {
            if (this.f12499Oooo0oO) {
                this.f12499Oooo0oO = false;
                this.f12498Oooo0o.append("  ");
            }
            this.f12499Oooo0oO = c == '\n';
            this.f12498Oooo0o.append(c);
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
            boolean z = false;
            if (this.f12499Oooo0oO) {
                this.f12499Oooo0oO = false;
                this.f12498Oooo0o.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
                z = true;
            }
            this.f12499Oooo0oO = z;
            this.f12498Oooo0o.append(charSequence, i, i2);
            return this;
        }
    }
}
